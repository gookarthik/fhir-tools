package org.sitenv.spring.service;

import org.sitenv.spring.dao.QuestionnaireDao;
import org.sitenv.spring.model.DafQuestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service("questionnaireService")
public class QuestionnaireServiceImpl implements QuestionnaireService {

    @Autowired
    private QuestionnaireDao questionnaireDao;

    @Override
    public Integer saveQuestionnaire(DafQuestionnaire dafQuestionnaire) {

        return this.questionnaireDao.saveQuestionnaire(dafQuestionnaire);
    }

    @Override
    public DafQuestionnaire getQuestionnaireById(Integer questionnaireId) {

        return this.questionnaireDao.getQuestionnaireById(questionnaireId);
    }

    @Override
    public List<DafQuestionnaire> getAllQuestionnaires() {

        return this.questionnaireDao.getAllQuestionnaires();
    }

}

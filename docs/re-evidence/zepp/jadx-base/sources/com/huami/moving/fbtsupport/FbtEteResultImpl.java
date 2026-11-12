package com.huami.moving.fbtsupport;

import com.huami.firstbeat.dbproxy.IEteResult;
import com.huami.firstbeat.ete.EteResultWrapper;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.FbtEteResult;
import com.xiaomi.hm.health.databases.model.FbtEteResultDao;
import fi.firstbeat.ete.EteResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes11.dex */
public class FbtEteResultImpl implements IEteResult {

    public static class a {
        private static final FbtEteResultImpl a = new FbtEteResultImpl();

        private a() {
        }
    }

    private FbtEteResultImpl() {
    }

    private FbtEteResult a(EteResultWrapper eteResultWrapper) {
        FbtEteResult fbtEteResult = new FbtEteResult();
        EteResults eteResults = eteResultWrapper.getEteResults();
        fbtEteResult.setAerobicFeedbackNumber(eteResults.aerobicFeedbackNumber);
        fbtEteResult.setArtifactPercent(eteResults.artifactPercent);
        fbtEteResult.setCorrectedHR(eteResults.correctedHr);
        fbtEteResult.setCumulativeEnergyExpenditure(eteResults.cumulativeEnergyExpenditure);
        fbtEteResult.setDailyPerformance(eteResults.dailyPerformance);
        fbtEteResult.setEnergyExpenditure(eteResults.energyExpenditure);
        fbtEteResult.setMaximalHR(eteResults.maximalHr);
        fbtEteResult.setMaximalMet(eteResults.maximalMet);
        fbtEteResult.setMaximalMetMinutes(eteResults.maximalMetMinutes);
        fbtEteResult.setMinimalHR(eteResults.minimalHr);
        fbtEteResult.setPercentAchieved(eteResults.percentAchieved);
        fbtEteResult.setPhraseNumber(eteResults.phraseNumber);
        fbtEteResult.setPhraseVariableOne(eteResults.phraseVariable[0]);
        fbtEteResult.setPhraseVariableTwo(eteResults.phraseVariable[1]);
        fbtEteResult.setRecoveryTime(eteResults.recoveryTime);
        fbtEteResult.setTrainingEffect(eteResults.trainingEffect);
        fbtEteResult.setTrainingLoadPeak(eteResults.trainingLoadPeak);
        fbtEteResult.setEndTime(eteResultWrapper.getEndTime());
        fbtEteResult.setExerciseType(eteResultWrapper.getExerciseType());
        fbtEteResult.setTrackId(eteResultWrapper.getTrackId());
        fbtEteResult.setTimeStamp(eteResultWrapper.getTrackId());
        fbtEteResult.setSource(0);
        return fbtEteResult;
    }

    public static FbtEteResultImpl getInstance() {
        return a.a;
    }

    public void deleteEte(long j) {
        HMDaoManager.getInstance().getFbtEteResultDao().queryBuilder().where(FbtEteResultDao.Properties.TrackId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public List<EteResultWrapper> getEteResultsByTime(long j, long j2, boolean z) {
        QueryBuilder<FbtEteResult> queryBuilder = HMDaoManager.getInstance().getFbtEteResultDao().queryBuilder();
        Property property = FbtEteResultDao.Properties.TimeStamp;
        QueryBuilder<FbtEteResult> queryBuilderWhere = queryBuilder.where(property.ge(Long.valueOf(j)), property.le(Long.valueOf(j2)));
        if (z) {
            queryBuilderWhere.orderDesc(FbtEteResultDao.Properties.TrackId);
        } else {
            queryBuilderWhere.orderAsc(FbtEteResultDao.Properties.TrackId);
        }
        List<FbtEteResult> list = queryBuilderWhere.list();
        ArrayList arrayList = new ArrayList();
        for (FbtEteResult fbtEteResult : list) {
            EteResultWrapper eteResultWrapper = new EteResultWrapper();
            EteResults eteResults = new EteResults();
            eteResults.aerobicFeedbackNumber = fbtEteResult.getAerobicFeedbackNumber();
            eteResults.artifactPercent = fbtEteResult.getArtifactPercent();
            eteResults.correctedHr = fbtEteResult.getCorrectedHR();
            eteResults.cumulativeEnergyExpenditure = fbtEteResult.getCumulativeEnergyExpenditure();
            eteResults.dailyPerformance = fbtEteResult.getDailyPerformance();
            eteResults.energyExpenditure = fbtEteResult.getEnergyExpenditure();
            eteResults.maximalHr = fbtEteResult.getMaximalHR();
            eteResults.maximalMet = fbtEteResult.getMaximalMet();
            eteResults.maximalMetMinutes = fbtEteResult.getMaximalMetMinutes();
            eteResults.minimalHr = fbtEteResult.getMinimalHR();
            eteResults.percentAchieved = fbtEteResult.getPercentAchieved();
            eteResults.phraseNumber = fbtEteResult.getPhraseNumber();
            eteResults.phraseVariable = new int[]{fbtEteResult.getPhraseVariableOne(), fbtEteResult.getPhraseVariableTwo()};
            eteResults.recoveryTime = fbtEteResult.getRecoveryTime();
            eteResults.trainingEffect = fbtEteResult.getTrainingEffect();
            eteResults.trainingLoadPeak = fbtEteResult.getTrainingLoadPeak();
            eteResultWrapper.setEteResults(eteResults);
            eteResultWrapper.setEndTime(fbtEteResult.getEndTime());
            eteResultWrapper.setExerciseType(fbtEteResult.getExerciseType());
            eteResultWrapper.setTrackId(fbtEteResult.getTrackId());
            arrayList.add(eteResultWrapper);
        }
        return arrayList;
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public void saveEteResult(EteResultWrapper eteResultWrapper, boolean z) {
        FbtEteResult fbtEteResultA = a(eteResultWrapper);
        fbtEteResultA.setSyncState(z ? 1 : 0);
        HMDaoManager.getInstance().getFbtEteResultDao().insertOrReplace(fbtEteResultA);
    }

    @Override // com.huami.firstbeat.dbproxy.IEteResult
    public void saveEteResultList(List<EteResultWrapper> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<EteResultWrapper> it2 = list.iterator();
        while (it2.hasNext()) {
            FbtEteResult fbtEteResultA = a(it2.next());
            fbtEteResultA.setSyncState(z ? 1 : 0);
            arrayList.add(fbtEteResultA);
        }
        HMDaoManager.getInstance().getFbtEteResultDao().insertOrReplaceInTx(arrayList);
    }
}

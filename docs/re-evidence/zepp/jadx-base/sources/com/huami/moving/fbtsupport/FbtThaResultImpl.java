package com.huami.moving.fbtsupport;

import com.huami.firstbeat.dbproxy.IThaResult;
import com.huami.firstbeat.tha.ThaDataWrapper;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.FbtThaResult;
import com.xiaomi.hm.health.databases.model.FbtThaResultDao;
import fi.firstbeat.tha.ThaResults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FbtThaResultImpl implements IThaResult {

    public static class a {
        private static final FbtThaResultImpl a = new FbtThaResultImpl();

        private a() {
        }
    }

    private FbtThaResultImpl() {
    }

    private FbtThaResult a(ThaDataWrapper thaDataWrapper) {
        FbtThaResult fbtThaResult = new FbtThaResult();
        ThaResults thaResults = thaDataWrapper.getThaResults();
        fbtThaResult.setCurrentStatus(thaResults.currentStatus);
        fbtThaResult.setFitnessClass(thaResults.fitnessClass.ordinal());
        fbtThaResult.setFitnessLevelIncrease(thaResults.fitnessLevelIncrease);
        fbtThaResult.setTrainingLoadTrend(thaResults.trainingLoadTrend.ordinal());
        fbtThaResult.setVo2maxTrend(thaResults.vo2maxTrend.ordinal());
        fbtThaResult.setVo2maxTrendType(thaResults.vo2maxTrendType.ordinal());
        fbtThaResult.setWtl(thaResults.wtl.ordinal());
        fbtThaResult.setWtlSum(thaResults.wtlSum);
        fbtThaResult.setWtlSumOptimalMax(thaResults.wtlSumOptimalMax);
        fbtThaResult.setWtlSumOptimalMin(thaResults.wtlSumOptimalMin);
        fbtThaResult.setWtlSumOverreaching(thaResults.wtlSumOverreaching);
        fbtThaResult.setSource(thaDataWrapper.getSource());
        fbtThaResult.setTimeStamp(thaDataWrapper.getTimeStamp());
        return fbtThaResult;
    }

    private ThaDataWrapper b(FbtThaResult fbtThaResult) {
        ThaDataWrapper thaDataWrapper = new ThaDataWrapper();
        ThaResults thaResults = new ThaResults();
        thaResults.currentStatus = fbtThaResult.getCurrentStatus();
        int fitnessClass = fbtThaResult.getFitnessClass();
        if (fitnessClass < 0) {
            fitnessClass = 0;
        }
        thaResults.fitnessClass = ThaResults.FitnessClassification.values()[fitnessClass];
        thaResults.fitnessLevelIncrease = fbtThaResult.getFitnessLevelIncrease();
        thaResults.trainingLoadTrend = ThaResults.TrainingLoadTrend.values()[fbtThaResult.getTrainingLoadTrend()];
        thaResults.vo2maxTrend = ThaResults.Vo2maxTrend.values()[fbtThaResult.getVo2maxTrend()];
        thaResults.vo2maxTrendType = ThaResults.Vo2maxTrendType.values()[fbtThaResult.getVo2maxTrendType()];
        thaResults.wtl = ThaResults.WeeklyTrainingLoad.values()[fbtThaResult.getWtl()];
        thaResults.wtlSum = fbtThaResult.getWtlSum();
        thaResults.wtlSumOptimalMax = fbtThaResult.getWtlSumOptimalMax();
        thaResults.wtlSumOptimalMin = fbtThaResult.getWtlSumOptimalMin();
        thaResults.wtlSumOverreaching = fbtThaResult.getWtlSumOverreaching();
        thaDataWrapper.setThaResults(thaResults);
        thaDataWrapper.setTimeStamp(fbtThaResult.getTimeStamp());
        thaDataWrapper.setSource(fbtThaResult.getSource());
        return thaDataWrapper;
    }

    public static FbtThaResultImpl getInstance() {
        return a.a;
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public ThaDataWrapper getLatestThaResult() {
        List<FbtThaResult> list = HMDaoManager.getInstance().getFbtThaResultDao().queryBuilder().orderDesc(FbtThaResultDao.Properties.TimeStamp).limit(1).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return b(list.get(0));
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public List<ThaDataWrapper> getThaResultList() {
        ArrayList arrayList = new ArrayList();
        List<FbtThaResult> list = HMDaoManager.getInstance().getFbtThaResultDao().queryBuilder().orderDesc(FbtThaResultDao.Properties.TimeStamp).list();
        if (list == null) {
            return null;
        }
        Iterator<FbtThaResult> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(b(it2.next()));
        }
        return arrayList;
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public void saveThaResult(ThaDataWrapper thaDataWrapper, boolean z) {
        FbtThaResult fbtThaResultA = a(thaDataWrapper);
        fbtThaResultA.setSyncState(z ? 1 : 0);
        HMDaoManager.getInstance().getFbtThaResultDao().insertOrReplace(fbtThaResultA);
    }

    @Override // com.huami.firstbeat.dbproxy.IThaResult
    public void saveThaResultList(List<ThaDataWrapper> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<ThaDataWrapper> it2 = list.iterator();
        while (it2.hasNext()) {
            FbtThaResult fbtThaResultA = a(it2.next());
            fbtThaResultA.setSyncState(z ? 1 : 0);
            arrayList.add(fbtThaResultA);
        }
        HMDaoManager.getInstance().getFbtThaResultDao().insertOrReplaceInTx(arrayList);
    }
}

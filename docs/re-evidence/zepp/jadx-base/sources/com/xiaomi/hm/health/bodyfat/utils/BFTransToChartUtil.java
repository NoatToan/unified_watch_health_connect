package com.xiaomi.hm.health.bodyfat.utils;

import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BFTransToChartUtil {
    private static final String a = "BFTransToChartUtil";
    private static BFTransToChartUtil b;

    private BFTransToChartUtil() {
    }

    public static BFTransToChartUtil getInstance() {
        if (b == null) {
            b = new BFTransToChartUtil();
        }
        return b;
    }

    public ChartDataList createBdyFatDataOld(long j) {
        UserInfos info = UserInfoManager.getManager().getInfo(j);
        List<WeightInfos> bodyFatInfosAsc = WeightInfoManager.getManager().getBodyFatInfosAsc(j);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < bodyFatInfosAsc.size(); i++) {
            WeightInfos weightInfos = bodyFatInfosAsc.get(i);
            int weightAge = BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday());
            if (weightAge >= 6 && weightAge <= 99) {
                HMLog.d(a, "BFAT: add index " + i + " value " + weightInfos.getBody_fat(), new Object[0]);
                sparseArray.put(i, new ChartData(i, weightInfos.getBody_fat().floatValue()));
            }
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(bodyFatInfosAsc.size());
        chartDataList.setShownCount(6);
        return chartDataList;
    }

    public ChartDataList createBfatWeightData(List<WeightInfos> list) {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            sparseArray.put(i, new ChartData(i, list.get(i).getScore().intValue()));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(list.size());
        chartDataList.setShownCount(7);
        return chartDataList;
    }

    public ChartDataList createOfmtWeightData(long j) {
        List<WeightInfos> latestOftInfos = WeightInfoManager.getManager().getLatestOftInfos(j);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < latestOftInfos.size(); i++) {
            sparseArray.put(i, new ChartData(i, latestOftInfos.get(i).getOfmt().floatValue()));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(latestOftInfos.size());
        chartDataList.setShownCount(6);
        return chartDataList;
    }

    public ChartDataList createWeightData(List<WeightInfos> list) {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            sparseArray.put(i, new ChartData(i, list.get(i).getWeight().floatValue()));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(list.size());
        chartDataList.setShownCount(7);
        return chartDataList;
    }

    public ChartDataList createWeightDataOld(long j) {
        List<WeightInfos> bodyFatInfosAsc = WeightInfoManager.getManager().getBodyFatInfosAsc(j);
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < bodyFatInfosAsc.size(); i++) {
            WeightInfos weightInfos = bodyFatInfosAsc.get(i);
            HMLog.d(a, "WEIGHT: add index " + i + " value " + weightInfos.getWeight(), new Object[0]);
            sparseArray.put(i, new ChartData(i, weightInfos.getWeight().floatValue()));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(bodyFatInfosAsc.size());
        chartDataList.setShownCount(6);
        return chartDataList;
    }

    public ChartDataList createBfatWeightData(long j) {
        return createBfatWeightData(WeightInfoManager.getManager().getBodyFatInfosAsc(j));
    }

    public ChartDataList createOfmtWeightData(List<WeightInfos> list) {
        int size;
        SparseArray sparseArray = new SparseArray();
        if (list != null) {
            size = list.size();
            for (int i = 0; i < size; i++) {
                WeightInfos weightInfos = list.get(i);
                if (weightInfos.getOfmt() != null) {
                    sparseArray.put(i, new ChartData(i, weightInfos.getOfmt().floatValue()));
                }
            }
        } else {
            size = 0;
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(size);
        chartDataList.setShownCount(6);
        return chartDataList;
    }
}

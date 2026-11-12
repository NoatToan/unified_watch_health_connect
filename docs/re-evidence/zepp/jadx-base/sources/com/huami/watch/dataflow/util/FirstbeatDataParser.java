package com.huami.watch.dataflow.util;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class FirstbeatDataParser {
    private static final String a = "DataFlow-FirstbeatDataParser";

    public static SportLoadDataItem toSportLoadItem(String str) {
        String strDecodeAndUnzipRawData = DataUtil.decodeAndUnzipRawData(str);
        if (TextUtils.isEmpty(strDecodeAndUnzipRawData)) {
            return null;
        }
        SportLoadDataItem sportLoadDataItem = new SportLoadDataItem();
        try {
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
                sportLoadDataItem = (SportLoadDataItem) gsonBuilder.create().fromJson(strDecodeAndUnzipRawData, SportLoadDataItem.class);
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
                Log.e(a, "To SportsLoadDayInfo Fail!!", e, new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d(a, "SportLoadDataItem : " + sportLoadDataItem, new Object[0]);
        return sportLoadDataItem;
    }

    public static VO2maxDataItem toVO2maxItem(String str) {
        String strDecodeAndUnzipRawData = DataUtil.decodeAndUnzipRawData(str);
        if (TextUtils.isEmpty(strDecodeAndUnzipRawData)) {
            return null;
        }
        VO2maxDataItem vO2maxDataItem = new VO2maxDataItem();
        try {
            try {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
                vO2maxDataItem = (VO2maxDataItem) gsonBuilder.create().fromJson(strDecodeAndUnzipRawData, VO2maxDataItem.class);
            } catch (JsonSyntaxException e) {
                e.printStackTrace();
                Log.e(a, "To Vo2MaxDayInfo Fail!!", e, new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d(a, "VO2maxDataItem : " + vO2maxDataItem, new Object[0]);
        return vO2maxDataItem;
    }
}

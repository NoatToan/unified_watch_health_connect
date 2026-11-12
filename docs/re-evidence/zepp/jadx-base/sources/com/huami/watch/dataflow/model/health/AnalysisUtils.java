package com.huami.watch.dataflow.model.health;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.process.HeartRateDetailsInfo;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.dataprocess.DataAnalysis;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.UserInfo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xmlywind.sdk.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AnalysisUtils {
    public static final String TAG = "AnalysisUtils";

    private static void a(String str, DaySportData daySportData) {
        if (daySportData == null) {
            Log.d(TAG, "DataAnalysis is null.", new Object[0]);
            return;
        }
        SleepInfo sleepInfo = daySportData.getSleepInfo();
        Log.d(TAG, "DataAnalysis sleepInfo analysis : " + sleepInfo, new Object[0]);
        if (sleepInfo != null) {
            if (sleepInfo.getHasSleep()) {
                int sleepCount = sleepInfo.getSleepCount();
                int nonRemCount = sleepInfo.getNonRemCount();
                int remCount = sleepInfo.getRemCount();
                int awakeCount = sleepInfo.getAwakeCount();
                Log.i(TAG, "入睡 >> " + sleepInfo.getStartDateStr(), new Object[0]);
                Log.i(TAG, "醒来 >> " + sleepInfo.getStopDateStr(), new Object[0]);
                Log.i(TAG, "全天睡眠 >> " + (sleepCount / 60) + "小时" + (sleepCount % 60) + "分钟", new Object[0]);
                Log.i(TAG, "全天深睡 >> " + (nonRemCount / 60) + "小时" + (nonRemCount % 60) + "分钟", new Object[0]);
                Log.i(TAG, "全天浅睡 >> " + (remCount / 60) + "小时" + (remCount % 60) + "分钟", new Object[0]);
                Log.i(TAG, "清醒时长 >> " + (awakeCount / 60) + "小时" + (awakeCount % 60) + "分钟", new Object[0]);
            } else {
                Log.i(TAG, "今天没有睡眠数据 >> " + str, new Object[0]);
            }
        }
        Log.d(TAG, "DataAnalysis stepsInfo analysis : " + daySportData.getStepsInfo(), new Object[0]);
    }

    private static UserInfo b() {
        UserInfo userInfo = new UserInfo();
        HMUserInfo userInfo2 = HMPersonInfo.getInstance().getUserInfo();
        userInfo.gender = userInfo2.getGender();
        userInfo.height = userInfo2.getHeight();
        userInfo.weight = Math.round(userInfo2.getWeight());
        userInfo.age = HMUserInfo.getAgeByDate(userInfo2.getBirthday());
        userInfo.goal = d();
        Log.i(TAG, "gender=" + userInfo.gender + ",height=" + userInfo.height + ",weight=" + userInfo.weight + "age=" + userInfo.age + ",goal=" + userInfo.goal, new Object[0]);
        return userInfo;
    }

    private static String c(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, i);
        calendar.set(14, 0);
        return new SimpleDateFormat("HH:mm").format(calendar.getTime());
    }

    private static int d() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo.getMiliConfig() == null) {
            return 8000;
        }
        return hMPersonInfo.getMiliConfig().getGoalStepsCount();
    }

    @Nullable
    public static DaySportData getDaySleepInfo(@NonNull String str) {
        Log.d(TAG, "DaySportData : " + str, new Object[0]);
        String str2 = DateDay.from(str).yesterday().str();
        String str3 = DateDay.from(str).tomorrow().str();
        Map<String, HealthDataItem> allDetails = HealthDataManager.getManager().getAllDetails(str2, str3);
        HealthDataItem healthDataItem = allDetails.get(str);
        if (healthDataItem != null) {
            return process(str, healthDataItem, allDetails.get(str2), allDetails.get(str3));
        }
        Log.d(TAG, "Today HealthData Not In Db!! " + str, new Object[0]);
        return null;
    }

    @Nullable
    public static DaySportData getTodaySleepInfo() {
        return getDaySleepInfo(DateDay.today().str());
    }

    public static DaySportData parseDSDFromData(DaySportData daySportData, HealthDataItem healthDataItem, String str) {
        if (healthDataItem == null) {
            daySportData.setDataStastus(0);
            return daySportData;
        }
        if (daySportData == null) {
            Log.i(TAG, "daySport == null !!! bad happens : " + str, new Object[0]);
            return null;
        }
        byte[] heartRateData = healthDataItem.getHeartRateData();
        byte[] data = healthDataItem.getData();
        if (heartRateData != null && heartRateData.length != 0) {
            daySportData.fromBinaryWithHRData(data, heartRateData);
        } else if (data != null && data.length != 0) {
            daySportData.fromBinaryData(data);
        }
        daySportData.setmStepGoal(d());
        if (data == null || data.length == 0) {
            Log.i(TAG, Constants.CONTENT_RANGE_PARAMS + str, new Object[0]);
        } else {
            daySportData.setDataStastus(1);
        }
        return daySportData;
    }

    @Nullable
    public static DaySportData process(@NonNull String str, @NonNull HealthDataItem healthDataItem, HealthDataItem healthDataItem2, HealthDataItem healthDataItem3) {
        if (healthDataItem.getData() == null) {
            Log.d(TAG, "Today HealthData Data Bytes Is Null!! " + healthDataItem.getDate(), new Object[0]);
            return null;
        }
        String date = healthDataItem.getDate();
        String str2 = DateDay.from(date).yesterday().str();
        String str3 = DateDay.from(date).tomorrow().str();
        DaySportData daySportData = new DaySportData(DateDay.from(date).calendar());
        DaySportData daySportData2 = new DaySportData(DateDay.from(date).yesterday().calendar());
        DaySportData daySportData3 = new DaySportData(DateDay.from(date).yesterday().tomorrow().calendar());
        parseDSDFromData(daySportData, healthDataItem, date);
        Log.d(TAG, "TodayDayData Is " + date, new Object[0]);
        parseDSDFromData(daySportData2, healthDataItem2, str2);
        Log.d(TAG, "YesterdayDayData Is " + str2, new Object[0]);
        parseDSDFromData(daySportData3, healthDataItem3, str3);
        Log.d(TAG, "TomorrowDayData Is " + str3, new Object[0]);
        DataAnalysis.dataInit(b(), daySportData2, daySportData, daySportData3);
        DataAnalysis.dataProcess(daySportData);
        DataAnalysis.dataDestory();
        if (daySportData.getSleepInfo() != null) {
            a(str, daySportData);
        }
        return daySportData;
    }

    @Nullable
    public static HeartRateDetailsInfo processAllDayHR(Context context, String str, int i, @Nullable DaySportData daySportData, @Nullable DaySportData daySportData2) {
        return null;
    }
}

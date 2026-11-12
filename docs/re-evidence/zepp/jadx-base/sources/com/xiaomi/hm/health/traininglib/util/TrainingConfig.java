package com.xiaomi.hm.health.traininglib.util;

import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.model.TrainingAlarm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingConfig {
    public static final String ALARM_CONFIG_SYNCED = "alarmConfigSynced";
    public static final String HR_WARNING_CONFIG_SYNCED = "hrWarningConfigSynced";
    public static final String TRAINING_BGM_ENABLE = "training_bgm_on";
    private static final String a = "startH";
    private static final String b = "startM";
    private static final String c = "phoneEnable";
    private static final String d = "bandEnable";
    private static final String e = "heartRate";
    private static final String f = "enable";

    public static boolean getBandEnable() {
        String cache = TrainingKeeper.getCache(d);
        return cache != null && Boolean.parseBoolean(cache);
    }

    public static String getHeartWarningConfigStr() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable", getHrWarningEnbale());
            jSONObject.put("heartRate", getMaxHeartRate());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int getHour() {
        String cache = TrainingKeeper.getCache(a);
        if (cache != null) {
            return Integer.parseInt(cache);
        }
        return -1;
    }

    public static boolean getHrWarningEnbale() {
        String cache = TrainingKeeper.getCache("enable");
        return cache != null && Boolean.parseBoolean(cache);
    }

    public static int getMaxHeartRate() {
        String cache = TrainingKeeper.getCache("heartRate");
        if (cache != null) {
            return Integer.parseInt(cache);
        }
        TrainerInfo trainerInfo = TrainerInfo.get();
        if (trainerInfo == null) {
            return -1;
        }
        int i = (int) ((220 - trainerInfo.age) * 0.85f);
        setMaxHeartRate(i);
        return i;
    }

    public static int getMinute() {
        String cache = TrainingKeeper.getCache(b);
        if (cache != null) {
            return Integer.parseInt(cache);
        }
        return -1;
    }

    public static boolean getPhoneEnable() {
        String cache = TrainingKeeper.getCache(c);
        return cache != null && Boolean.parseBoolean(cache);
    }

    public static TrainingAlarm getTrainingALarmFromLocal() {
        TrainingAlarm trainingAlarm = new TrainingAlarm();
        trainingAlarm.phoneEnable = getPhoneEnable();
        trainingAlarm.bandEnable = getBandEnable();
        trainingAlarm.startH = getHour();
        trainingAlarm.startM = getMinute();
        return trainingAlarm;
    }

    public static boolean getTrainingBgmEnable() {
        String cache = TrainingKeeper.getCache(TRAINING_BGM_ENABLE);
        return cache != null && Boolean.parseBoolean(cache);
    }

    public static String getTrainingReminderStr(TrainingAlarm trainingAlarm) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(a, trainingAlarm.startH);
            jSONObject.put(b, trainingAlarm.startM);
            jSONObject.put(c, trainingAlarm.phoneEnable);
            jSONObject.put(d, trainingAlarm.bandEnable);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void saveHeartWarningConfigFromWeb(JSONObject jSONObject) {
        if (jSONObject.has("enable") && jSONObject.has("heartRate")) {
            setHrWarningConfigSynced(true);
            setHrWarningEnbale(jSONObject.optBoolean("enable"));
            setMaxHeartRate(jSONObject.optInt("heartRate"));
        }
    }

    public static void saveTrainingAlarmConfigFromWeb(TrainingAlarm trainingAlarm) {
        setAlarmConfigSynced(true);
        setHourAndMinute(trainingAlarm.startH, trainingAlarm.startM);
        setBandEnable(trainingAlarm.bandEnable);
        setPhoneEnable(trainingAlarm.phoneEnable);
    }

    public static void setAlarmConfigSynced(boolean z) {
        TrainingKeeper.putCache(ALARM_CONFIG_SYNCED, String.valueOf(z));
    }

    public static void setBandEnable(boolean z) {
        TrainingKeeper.putCache(d, String.valueOf(z));
        setAlarmConfigSynced(false);
    }

    public static void setHourAndMinute(int i, int i2) {
        TrainingKeeper.putCache(a, String.valueOf(i));
        TrainingKeeper.putCache(b, String.valueOf(i2));
        setAlarmConfigSynced(false);
    }

    public static void setHrWarningConfigSynced(boolean z) {
        TrainingKeeper.putCache(HR_WARNING_CONFIG_SYNCED, String.valueOf(z));
    }

    public static void setHrWarningEnbale(boolean z) {
        TrainingKeeper.putCache("enable", String.valueOf(z));
        setHrWarningConfigSynced(false);
    }

    public static void setMaxHeartRate(int i) {
        TrainingKeeper.putCache("heartRate", String.valueOf(i));
        setHrWarningConfigSynced(false);
    }

    public static void setPhoneEnable(boolean z) {
        TrainingKeeper.putCache(c, String.valueOf(z));
        setAlarmConfigSynced(false);
    }

    public static void setTrainingBgmEnable(boolean z) {
        TrainingKeeper.putCache(TRAINING_BGM_ENABLE, String.valueOf(z));
    }
}

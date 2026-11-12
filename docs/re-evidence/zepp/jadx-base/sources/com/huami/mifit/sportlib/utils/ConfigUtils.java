package com.huami.mifit.sportlib.utils;

import android.text.TextUtils;
import com.huami.mifit.sportlib.dbkit.SportConfigDbKit;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.model.SportingConfig;

/* JADX INFO: loaded from: classes11.dex */
public class ConfigUtils {
    public static final boolean DEFAULT_AUTO_PAUSE_ENABLE = false;
    public static final boolean DEFAULT_BEAT_ENABLE = false;
    public static final int DEFAULT_BEAT_VALUE = 180;
    public static final int DEFAULT_CHOOSE_MAP = 0;
    public static final int DEFAULT_CYCLING_PAUSE_PACE = 360;
    public static final boolean DEFAULT_KEEP_SCREEN_ON = false;
    public static final boolean DEFAULT_LOCK_SCREEN_DISPLAY = true;
    public static final boolean DEFAULT_MEASURE_HR_ENABLE = true;
    public static final int DEFAULT_PACE = 360;
    public static final boolean DEFAULT_REMIND_HR_ENABLE = false;
    public static final boolean DEFAULT_REMIND_PACE_ENABLE = false;
    public static final int DEFAULT_RUN_PAUSE_PACE = 600;
    public static final int DEFAULT_SPEED = 144;
    public static final boolean DEFAULT_VOICE_PLAY_ENABLE = true;
    public static final int DEFAULT_WALK_PAUSE_PACE = 720;
    public static final int SYNC_NEED = 1;
    public static final int SYNC_OK = 0;
    private static final int a = 70;
    private static final int b = 6;

    private static SportingConfig a(int i) {
        SportingConfig sportingConfig = new SportingConfig();
        sportingConfig.setType(Integer.valueOf(i));
        Boolean bool = Boolean.FALSE;
        sportingConfig.setAutoPauseEnable(bool);
        Boolean bool2 = Boolean.TRUE;
        sportingConfig.setVoicePlayEnable(bool2);
        sportingConfig.setKeepScreenOn(bool);
        sportingConfig.setMeasureHREnable(bool2);
        sportingConfig.setRemindHREnable(bool);
        sportingConfig.setRemindPaceEnable(bool);
        sportingConfig.setRemindPace(Integer.valueOf(i == 9 ? 144 : 360));
        sportingConfig.setLockScreenDisplay(bool2);
        sportingConfig.setChooseMap(0);
        sportingConfig.setDevicesCount(0);
        sportingConfig.setSynced(1);
        sportingConfig.setDataItems("");
        sportingConfig.setIndoorModelArray("");
        sportingConfig.setStepLengthArray("");
        sportingConfig.setChooseDevices("");
        sportingConfig.setBeatEnable(bool);
        sportingConfig.setBeatValue(180);
        if (i == 9) {
            sportingConfig.setAutoPausePace(360);
        } else if (i == 6) {
            sportingConfig.setAutoPausePace(720);
        } else {
            sportingConfig.setAutoPausePace(600);
        }
        return sportingConfig;
    }

    private static void b(SportingConfig sportingConfig) {
        if (HeartRateConstant.isHRValueValid(sportingConfig.getRemindHeartRate() == null ? 39 : sportingConfig.getRemindHeartRate().intValue())) {
            return;
        }
        int age = RunnerData.getRunner().getAge();
        if (age > 0) {
            sportingConfig.setRemindHeartRate(Integer.valueOf((int) (((double) (220 - age)) * 0.8d)));
        } else {
            sportingConfig.setRemindHeartRate(150);
        }
    }

    private static void c(SportingConfig sportingConfig, int i) {
        sportingConfig.setSynced(Integer.valueOf(i));
        SportConfigDbKit.getInstance().insertOrReplaceConfigInDb(sportingConfig);
    }

    public static void clear() {
        SportConfigDbKit.getInstance().deleteSportConfigInDb(null);
    }

    public static SportingConfig getConfig(int i) {
        SportingConfig sportingConfigQuerySportConfigByType = SportConfigDbKit.getInstance().querySportConfigByType(i);
        if (sportingConfigQuerySportConfigByType == null) {
            sportingConfigQuerySportConfigByType = a(i);
        }
        b(sportingConfigQuerySportConfigByType);
        return sportingConfigQuerySportConfigByType;
    }

    public static float[] getIndoorModelArray() {
        float[] fArr = new float[70];
        for (int i = 0; i < 70; i++) {
            fArr[i] = -1.0f;
        }
        String indoorModelArray = getConfig(8).getIndoorModelArray();
        if (TextUtils.isEmpty(indoorModelArray)) {
            return fArr;
        }
        String[] strArrSplit = indoorModelArray.split(",");
        int length = strArrSplit.length;
        float[] fArr2 = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                fArr2[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
            } catch (NumberFormatException unused) {
                fArr2[i2] = -1.0f;
            }
        }
        return fArr2;
    }

    public static int[] getStepLArray() {
        int[] iArr = new int[6];
        for (int i = 0; i < 6; i++) {
            iArr[i] = -1;
        }
        String stepLengthArray = getConfig(8).getStepLengthArray();
        if (TextUtils.isEmpty(stepLengthArray)) {
            return iArr;
        }
        String[] strArrSplit = stepLengthArray.split(",");
        int length = strArrSplit.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                iArr2[i2] = Short.valueOf(strArrSplit[i2]).shortValue();
            } catch (NumberFormatException unused) {
                iArr2[i2] = -1;
            }
        }
        return iArr2;
    }

    public static boolean isVoicePlayEnable(int i) {
        return getConfig(i).getVoicePlayEnable().booleanValue();
    }

    public static void setIndoorRunLearningResult(String str, String str2) {
        SportingConfig config = getConfig(8);
        config.setIndoorModelArray(str2);
        config.setStepLengthArray(str);
        c(config, 1);
    }
}

package com.huawei.ui.homehealth.threecirclecard.uitls;

import com.huawei.ui.homehealth.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public enum BottomMessageInfoEnum {
    STEPS("T100110", R.drawable.icon_life_step, R.string.IDS_settings_steps, R.color.life_sport, R.color.life_background_sport),
    EXERCISE_DURATION("T100210", R.drawable.icon_life_exercise_duration, R.string.IDS_active_workout, R.color.life_sport, R.color.life_background_sport),
    ACTIVITY_CALORIES("T100310", R.drawable.icon_life_active_caloric, R.string.IDS_active_caloric, R.color.life_sport, R.color.life_background_sport),
    ACTIVITY_HOURS("T100410", R.drawable.icon_life_active_hour, R.string.IDS_active_hours, R.color.life_sport, R.color.life_background_sport),
    WAKEUP_TIME("T120310", R.drawable.icon_life_wake_up, R.string.IDS_regular_wake_up, R.color.life_sleep, R.color.life_background_sleep),
    BEDTIME("T120410", R.drawable.icon_life_bedtime, R.string.IDS_regular_bedtime, R.color.life_sleep, R.color.life_background_sleep),
    SLEEP_DURATION("T121410", R.drawable.icon_life_sleep_duration, R.string.IDS_sleep_duration_today, R.color.life_sleep, R.color.life_background_sleep),
    AVG_DAILY_PRESSURE("T121510", R.drawable.icon_life_stress_mean, R.string.IDS_stress_mean, R.color.life_emotion, R.color.life_background_emotion),
    DECOMP_AND_RELAX("T121610", R.drawable.icon_life_stress_relax, R.string.IDS_stress_relax, R.color.life_emotion, R.color.life_background_emotion),
    DRINK_WATER("T120610", R.drawable.icon_life_drink_water, R.string.IDS_drink_water_new, R.color.life_diet, R.color.life_background_diet),
    CALORIES_INTAKE("T121310", R.drawable.icon_life_diet_caloric, R.string.IDS_diet_caloric, R.color.life_diet, R.color.life_background_diet);

    private static final Map<String, BottomMessageInfoEnum> MAP = new HashMap();
    private final int mBackgroundColorId;
    private final int mColorId;
    private final int mIconId;
    private final String mId;
    private final int mNameId;

    static {
        for (BottomMessageInfoEnum bottomMessageInfoEnum : values()) {
            MAP.put(bottomMessageInfoEnum.getId(), bottomMessageInfoEnum);
        }
    }

    BottomMessageInfoEnum(String str, int i, int i2, int i3, int i4) {
        this.mId = str;
        this.mIconId = i;
        this.mNameId = i2;
        this.mColorId = i3;
        this.mBackgroundColorId = i4;
    }

    private String getId() {
        return this.mId;
    }

    private int getIconId() {
        return this.mIconId;
    }

    private int getNameId() {
        return this.mNameId;
    }

    private int getColorId() {
        return this.mColorId;
    }

    private int getBackgroundColorId() {
        return this.mBackgroundColorId;
    }

    public static int getIconId(String str) {
        BottomMessageInfoEnum bottomMessageInfoEnum = MAP.get(str);
        if (bottomMessageInfoEnum == null) {
            return 0;
        }
        return bottomMessageInfoEnum.getIconId();
    }

    public static int getNameId(String str) {
        BottomMessageInfoEnum bottomMessageInfoEnum = MAP.get(str);
        if (bottomMessageInfoEnum == null) {
            return 0;
        }
        return bottomMessageInfoEnum.getNameId();
    }

    public static int getColorId(String str) {
        BottomMessageInfoEnum bottomMessageInfoEnum = MAP.get(str);
        if (bottomMessageInfoEnum == null) {
            return 0;
        }
        return bottomMessageInfoEnum.getColorId();
    }

    public static int getBackgroundColorId(String str) {
        BottomMessageInfoEnum bottomMessageInfoEnum = MAP.get(str);
        if (bottomMessageInfoEnum == null) {
            return 0;
        }
        return bottomMessageInfoEnum.getBackgroundColorId();
    }
}

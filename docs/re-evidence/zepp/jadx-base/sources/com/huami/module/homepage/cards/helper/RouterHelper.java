package com.huami.module.homepage.cards.helper;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010.\u001a\u00020-8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/huami/module/homepage/cards/helper/RouterHelper;", "", "", "SPORT_DETAIL", "Ljava/lang/String;", "EXERCISE_HISTORY", "PAI_PATH", "STEP_PATH", "SLEEP_PATH", "SLEEP_BREATH_PATH", "HEART_RATE_PATH", "MIFIT_HEART_RATE_PATH", "MIFIT_ALL_DAY_HEART_RATE_PATH", "DETAIL_PAGE_PATH", "SPO2_PATH", "WEIGHT_PATH", "BODY_SCORE_PATH", "CALORIES_PATH", "ECG_PATH", "SPORT_STATE_VO2_MAX_PATH", "SPORT_STATE_EPOC_PATH", "FEMALE_HEALTH_PATH", "FEMALE_HEALTH_PATH_MIFIT", "FEMALE_HEALTH_PATH_MIFIT_INTERCEPTOR", "BODY_TEMPERATURE_PATH", "BLOOD_PRESSURE_PATH", "BALANCE_PATH", "ALL_DATA_PATH", "DEVICE_SELECT_PATH", "SLEEP_ASSISTANT_PATH", "MIFIT_SINGLE_STRESS_PATH", "MIFIT_ALL_DAY_STRESS_PATH", "MAIN_PAGE_PATH", "DATA_TYPE_PARAM", "DATA_TYPE_STRESS", "DATA_TYPE_BMI", "DATA_TYPE_BLOOD_PRESSURE", "DATA_TYPE_BLOOD_SUGAR", "DATA_TYPE_BODY_TEMPERATURE", "DATA_TYPE_TRACK_ID", "DATA_TYPE_SPORT_TYPE", "DATA_TYPE_OVERSEA", "DATA_TYPE_START_ACTIVITY_FROM", "DATA_TYPE_TYPE", "MAIN_TAB_INDEX", "", "MAIN_TAB_INDEX_MINE", LogUtil.I, "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class RouterHelper {

    @NotNull
    public static final String ALL_DATA_PATH = "home/AllDataCategoriesActivity";

    @NotNull
    public static final String BALANCE_PATH = "bodyfat/OneFootDetailActivity";

    @NotNull
    public static final String BLOOD_PRESSURE_PATH = "bloodpressure/BloodPressureActivity";

    @NotNull
    public static final String BODY_SCORE_PATH = "bodyfat/BodyFatDetailActivity";

    @NotNull
    public static final String BODY_TEMPERATURE_PATH = "temperature/TemperatureDetailActivity";

    @NotNull
    public static final String CALORIES_PATH = "calorie/CaloriActivity";

    @NotNull
    public static final String DATA_TYPE_BLOOD_PRESSURE = "blood_pressure";

    @NotNull
    public static final String DATA_TYPE_BLOOD_SUGAR = "blood_sugar";

    @NotNull
    public static final String DATA_TYPE_BMI = "bmi";

    @NotNull
    public static final String DATA_TYPE_BODY_TEMPERATURE = "temperature";

    @NotNull
    public static final String DATA_TYPE_OVERSEA = "oversea";

    @NotNull
    public static final String DATA_TYPE_PARAM = "data_type";

    @NotNull
    public static final String DATA_TYPE_SPORT_TYPE = "sportType";

    @NotNull
    public static final String DATA_TYPE_START_ACTIVITY_FROM = "START_ACTIVITY_FROM";

    @NotNull
    public static final String DATA_TYPE_STRESS = "all_day_stress";

    @NotNull
    public static final String DATA_TYPE_TRACK_ID = "trackId";

    @NotNull
    public static final String DATA_TYPE_TYPE = "type";

    @NotNull
    public static final String DETAIL_PAGE_PATH = "detail/DataDetailBaseNewActivity";

    @NotNull
    public static final String DEVICE_SELECT_PATH = "device/HMUnifySelectDeviceActivity";

    @NotNull
    public static final String ECG_PATH = "ecg/EcgActivity";

    @NotNull
    public static final String EXERCISE_HISTORY = "sport/ExerciseHistoryActivity";

    @NotNull
    public static final String FEMALE_HEALTH_PATH = "fh/FemaleHealth";

    @NotNull
    public static final String FEMALE_HEALTH_PATH_MIFIT = "fh/FemaleStartActivity";

    @NotNull
    public static final String FEMALE_HEALTH_PATH_MIFIT_INTERCEPTOR = "fh_interceptor_first_login";

    @NotNull
    public static final String HEART_RATE_PATH = "activity/HeartRateActivity";

    @NotNull
    public static final RouterHelper INSTANCE = new RouterHelper();

    @NotNull
    public static final String MAIN_PAGE_PATH = "main/MainTabActivity";

    @NotNull
    public static final String MAIN_TAB_INDEX = "tab_index";
    public static final int MAIN_TAB_INDEX_MINE = 3;

    @NotNull
    public static final String MIFIT_ALL_DAY_HEART_RATE_PATH = "hr/HMHrMeasureWholeDayActivity";

    @NotNull
    public static final String MIFIT_ALL_DAY_STRESS_PATH = "stress/AllDayStressActivity";

    @NotNull
    public static final String MIFIT_HEART_RATE_PATH = "hr/HMHrMeasureActivity";

    @NotNull
    public static final String MIFIT_SINGLE_STRESS_PATH = "stress/SingleStressActivity";

    @NotNull
    public static final String PAI_PATH = "pai/PaiDetailActivity";

    @NotNull
    public static final String SLEEP_ASSISTANT_PATH = "sleep/SleepAssistantActivity";

    @NotNull
    public static final String SLEEP_BREATH_PATH = "sleep/BreathQualityActivity";

    @NotNull
    public static final String SLEEP_PATH = "sleep/SleepHomeActivity";

    @NotNull
    public static final String SPO2_PATH = "spo2/Spo2DetailActivity";

    @NotNull
    public static final String SPORT_DETAIL = "moving/SportDetailsActivity";

    @NotNull
    public static final String SPORT_STATE_EPOC_PATH = "sportLoad/SportLoadActivity";

    @NotNull
    public static final String SPORT_STATE_VO2_MAX_PATH = "vo2max/VO2maxActivity";

    @NotNull
    public static final String STEP_PATH = "step/StepInfoActivity";

    @NotNull
    public static final String WEIGHT_PATH = "bodyfat/WeightDetailActivity";

    private RouterHelper() {
    }
}

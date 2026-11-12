package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.feature.config.FeatureSwitch;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.FigureSource;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.databases.model.WeightInfosDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class HMWeightUtils {
    public static final int BABY_AGE = 7;
    public static final float BMI_HEAVY = 28.0f;
    public static final float BMI_HEAVY_NOT_CHINA = 30.0f;
    public static final float BMI_LIGHT = 18.5f;
    public static final float BMI_LIGHT_NOT_CHINA = 18.5f;
    public static final float BMI_NORMAL = 24.0f;
    public static final float BMI_NORMAL_NOT_CHINA = 25.0f;
    public static final int MAX_NAME_LENTH = 9;
    public static final int MAX_USER_COUNT = 12;
    public static final int MAX_USER_COUNT_XIAOMI = 17;
    public static final int MERGE_TIME_DELAY = 30000;
    public static final int SYNC_STATE_NEED_DELETE = -1;
    public static final int SYNC_STATE_NEED_SYNC = 0;
    public static final int SYNC_STATE_SYNCED = 1;
    public static final int SYNC_STATE_UNCERTAIN = 2;
    public static final int SYNC_STATE_UNCERTAIN_DELETE = -2;
    public static final int SYNC_TO_SERVER_COUNT = 50;
    public static final String TAG = "Weight-HMWeightUtil";
    public static final int TYPE_BABY = 2;
    public static final int TYPE_BALANCE = 4;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_OFMT = 3;
    public static final int TYPE_USER = 1;
    public static final int USER_ID_FALSE_DATA = -2;
    public static final long USER_ID_GUEST = -3;
    public static final long USER_ID_SELF = -1;
    public static final long USER_ID_UNKNOWN = 0;
    public static final float VALUE_WEIGHT_OFMT = 0.123f;
    public static final int WEIGHTGOAL_NEED_DELETE = -1;
    public static final int WEIGHTGOAL_NEED_SYNC = 0;
    public static final int WEIGHTGOAL_SYNCED = 1;
    private static boolean a = false;
    private static final int b = 3;
    private static final float c = 0.0f;
    private static final float d = 50.0f;
    private static final float e = 10.0f;
    private static final String f = "USERINFO_KEY_UID";
    private static final String g = "USERINFO_KEY_NAME";
    private static final String h = "USERINFO_KEY_GENDER";
    private static final String i = "USERINFO_KEY_BIRTH";
    private static final String j = "USERINFO_KEY_HEIGHT";
    private static final String k = "USERINFO_KEY_WEIGHT";
    private static final String l = "USERINFO_KEY_TARGET_WEIGHT";
    private static final String m = "USERINFO_KEY_TARGET_AVATAR_URL";
    private static final String n = "USERINFO_KEY_TARGET_AVATAR_SOURCE";
    private static final String o = "USERINFO_KEY_SYNCED";
    public static final float[] male_overweight = {17.4f, 18.1f, 18.9f, 19.6f, 20.3f, 21.0f, 21.9f, 22.6f, 23.1f, 23.5f, 23.8f, 24.0f};
    public static final float[] male_fat = {19.2f, 20.3f, 21.4f, 22.5f, 23.6f, 24.7f, 25.7f, 26.4f, 26.9f, 27.4f, 27.8f, 28.0f};
    public static final float[] female_overweight = {17.2f, 18.1f, 19.0f, 20.0f, 21.1f, 21.9f, 22.6f, 23.0f, 23.4f, 23.7f, 23.8f, 24.0f};
    public static final float[] female_fat = {18.9f, 19.9f, 21.0f, 22.1f, 23.3f, 24.5f, 25.6f, 26.3f, 26.9f, 27.4f, 27.7f, 28.0f};

    public enum BodyFigure {
        Light,
        Normal,
        Weight,
        Fat,
        VeryFat,
        Unknown
    }

    public static abstract class SyncCallback {
        public void onCancel() {
        }

        public abstract void onFailure();

        public void onStart() {
        }

        public abstract void onSuccess();
    }

    public class a extends SyncCallback {
        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onFailure() {
            HMLog.i(HMWeightUtils.TAG, "syncWithServer to local is failure.", new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onSuccess() {
            WeightInfoManager.getManager().syncInfosWithServer(-1L, null);
            HMWeightUtils.mergeUserInfoWeight();
            HMWeightUtils.syncToServer();
            HMLog.i(HMWeightUtils.TAG, "syncWithServer to local is success.", new Object[0]);
        }
    }

    public static String adultBMICalculator(boolean z, float f2, final int i2) {
        float f3;
        float f4;
        if (z) {
            f3 = 24.0f;
            f4 = 28.0f;
        } else {
            f3 = 25.0f;
            f4 = 30.0f;
        }
        final float f5 = 18.5f * f2 * f2;
        HMLog.info(TAG, new Function0() { // from class: br3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMWeightUtils.l(f5);
            }
        });
        final int iConvertTo = (int) (((double) (convertTo(f5, 0, i2) * 10.0f)) + 0.5d);
        HMLog.info(TAG, new Function0() { // from class: er3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMWeightUtils.m(iConvertTo);
            }
        });
        final float f6 = iConvertTo / 10.0f;
        HMLog.info(TAG, new Function0() { // from class: cr3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMWeightUtils.n(f6, i2);
            }
        });
        return f6 + "," + (((int) (((double) (convertTo((f3 * f2) * f2, 0, i2) * 10.0f)) + 0.5d)) / 10.0f) + "," + (((int) (((double) (convertTo((f4 * f2) * f2, 0, i2) * 10.0f)) + 0.5d)) / 10.0f) + ",";
    }

    public static float calcuBMI(int i2, float f2) {
        float f3 = i2 / 100.0f;
        return scaleBMI((i2 <= 0 || f2 <= 0.0f) ? -1.0f : f2 / (f3 * f3));
    }

    public static float calcuWeight(int i2, float f2) {
        float f3 = i2 / 100.0f;
        return scaleFloatToDown((i2 <= 0 || f2 <= 0.0f) ? -1.0f : f2 * f3 * f3, 1);
    }

    public static boolean checkDelete(long j2) {
        return WeightInfoManager.getManager().getInfosCount(j2) > 1;
    }

    public static boolean checkWeightTimeIsValid(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        if (calendar2.get(1) <= calendar.get(1) && calendar2.get(1) >= 2014) {
            return true;
        }
        HMLog.i(TAG, "check weightTime wrong time:" + calendar2.getTime() + " , timestamp = " + j2 + " , filter !", new Object[0]);
        return false;
    }

    public static void clearFamilyKeeper() {
        BFKeeper.saveCurrentUser(BFKeeper.CURRENT_USER_NAME, "");
        BFKeeper.saveCurrentUser(BFKeeper.CURRENT_USER_GENDER, "");
        BFKeeper.saveCurrentUser(BFKeeper.CURRENT_USER_BIRTH, "");
        BFKeeper.saveCurrentUser(BFKeeper.CURRENT_USER_HEIGHT, "");
    }

    public static float convertFromKg(float f2, int i2) {
        return convertTo(f2, 0, i2);
    }

    public static float convertTo(float f2, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return f2;
            }
            if (i3 == 1) {
                return scaleFloat(f2 * 2.20462f, 2);
            }
            if (i3 == 2) {
                return f2 / 0.001f;
            }
            if (i3 != 16) {
                if (i3 == 17) {
                    return f2 / 6.35029f;
                }
                return 0.0f;
            }
            return f2 * 2.0f;
        }
        if (i2 == 1) {
            if (i3 == 0) {
                return scaleFloat(f2 * 0.45359f, 2);
            }
            if (i3 == 1) {
                return f2;
            }
            if (i3 != 3) {
                if (i3 == 16) {
                    return scaleFloat(f2 * 0.90718f, 2);
                }
                if (i3 == 17) {
                    return f2 / 14.0f;
                }
                return 0.0f;
            }
            return f2 * 16.0f;
        }
        if (i2 == 16) {
            if (i3 != 0) {
                if (i3 == 1) {
                    return scaleFloat(f2 * 1.10231f, 2);
                }
                if (i3 == 2) {
                    f2 /= 0.001f;
                } else {
                    if (i3 == 16) {
                        return f2;
                    }
                    if (i3 == 17) {
                        return f2 / 12.70058f;
                    }
                }
            }
            return f2 / 2.0f;
        }
        if (i2 != 17) {
            return f2;
        }
        if (i3 == 0) {
            return f2 * 6.35029f;
        }
        if (i3 == 1) {
            return f2 * 14.0f;
        }
        if (i3 == 3) {
            f2 *= 14.0f;
            return f2 * 16.0f;
        }
        if (i3 == 16) {
            f2 *= 6.35029f;
            return f2 * 2.0f;
        }
        if (i3 == 17) {
            return f2;
        }
        return 0.0f;
    }

    public static float convertToKg(float f2, int i2) {
        return convertTo(f2, i2, 0);
    }

    public static ChartDataList createWeightData(long j2) {
        List<WeightInfos> infosAsc = getInfosAsc(j2);
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < infosAsc.size(); i2++) {
            sparseArray.put(i2, new ChartData(i2, infosAsc.get(i2).getWeight().floatValue()));
        }
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        chartDataList.setStart(0);
        chartDataList.setEnd(infosAsc.size());
        chartDataList.setShownCount(7);
        return chartDataList;
    }

    public static float elasticValue(float f2, float f3, float f4) {
        if (f4 == 0.0f || f4 <= f3 || f2 < f3 || f2 > f4) {
            return f2;
        }
        if (f2 <= f3) {
            return f3;
        }
        if (f2 >= f4) {
            return f4;
        }
        float f5 = f4 - f3;
        return (float) ((Math.sqrt(1.0d - Math.pow(1.0f - ((f2 - f3) / f5), 2.0d)) * ((double) f5)) + ((double) f3));
    }

    public static int[] geOneFootScoreColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.very_high_color), ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.slight_high_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.slight_low_color)};
    }

    public static String[] getAdualtFigureLables(Context context) {
        return context.getResources().getStringArray(R.array.weight3_body_figures);
    }

    public static int[] getBasalCalColor(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.normal_color)};
    }

    public static int[] getBmiColorFor7_18(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.bmi_color_1), ContextCompat.getColor(context, R.color.bmi_color_2), ContextCompat.getColor(context, R.color.bmi_color_3)};
    }

    public static int[] getBmiColorForAdualt(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.bmi_color_adult_1), ContextCompat.getColor(context, R.color.bmi_color_adult_2), ContextCompat.getColor(context, R.color.bmi_color_adult_3), ContextCompat.getColor(context, R.color.bmi_color_adult_4)};
    }

    public static int[] getBmiColorForBaby(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.normal_color)};
    }

    public static String getBmiLevel(Context context, BodyFigure bodyFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.bmi_for_adualt);
        HashMap map = new HashMap();
        map.put(BodyFigure.Light, stringArray[0]);
        map.put(BodyFigure.Normal, stringArray[1]);
        map.put(BodyFigure.Weight, stringArray[2]);
        map.put(BodyFigure.Fat, stringArray[3]);
        map.put(BodyFigure.Unknown, context.getResources().getString(R.string.empty_value));
        return (String) map.get(bodyFigure);
    }

    public static Pair<Integer, Integer> getBmiLevelPositionPair(Context context, float f2, int i2, int i3) {
        BodyFigure bodyFigure = toBodyFigure(f2, i2, i3);
        if (!Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
            if (i2 < 18) {
                return new Pair<>(0, 0);
            }
            if (bodyFigure == BodyFigure.Light) {
                return new Pair<>(5, 1);
            }
            if (bodyFigure == BodyFigure.Normal) {
                return new Pair<>(5, 2);
            }
            if (bodyFigure == BodyFigure.Weight) {
                return new Pair<>(5, 3);
            }
            if (bodyFigure == BodyFigure.Fat) {
                return new Pair<>(5, 4);
            }
            return bodyFigure == BodyFigure.VeryFat ? new Pair<>(5, 5) : new Pair<>(0, 0);
        }
        if (i2 >= 7 && i2 < 18) {
            if (bodyFigure == BodyFigure.Normal) {
                return new Pair<>(3, 1);
            }
            if (bodyFigure == BodyFigure.Weight) {
                return new Pair<>(3, 2);
            }
            return bodyFigure == BodyFigure.Fat ? new Pair<>(3, 3) : new Pair<>(0, 0);
        }
        if (i2 < 18) {
            return new Pair<>(0, 0);
        }
        if (bodyFigure == BodyFigure.Light) {
            return new Pair<>(4, 1);
        }
        if (bodyFigure == BodyFigure.Normal) {
            return new Pair<>(4, 2);
        }
        if (bodyFigure == BodyFigure.Weight) {
            return new Pair<>(4, 3);
        }
        return bodyFigure == BodyFigure.Fat ? new Pair<>(4, 4) : new Pair<>(0, 0);
    }

    public static int[] getBodyFatColor(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.low_color), ContextCompat.getColor(context, R.color.slight_low_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.slight_high_color), ContextCompat.getColor(context, R.color.high_color)};
    }

    public static float[] getChildBmiSection(int i2, int i3) {
        float[] fArr = new float[2];
        if (i3 == 1) {
            int i4 = i2 - 7;
            fArr[0] = male_overweight[i4];
            fArr[1] = male_fat[i4];
        } else if (i3 == 0) {
            int i5 = i2 - 7;
            fArr[0] = female_overweight[i5];
            fArr[1] = female_fat[i5];
        }
        return fArr;
    }

    public static float getChildFatBmi(int i2, int i3) {
        if (i3 == 1) {
            return male_fat[i2 - 7];
        }
        if (i3 == 0) {
            return female_fat[i2 - 7];
        }
        return -1.0f;
    }

    public static String[] getChildFigureLables(Context context) {
        return context.getResources().getStringArray(R.array.weight_body_figures_for_child);
    }

    public static float getChildNormalBmi(int i2, int i3) {
        if (i3 == 1) {
            return male_overweight[i2 - 7];
        }
        if (i3 == 0) {
            return female_overweight[i2 - 7];
        }
        return -1.0f;
    }

    public static float getChildNormalWeightInUnit(float f2, float f3, int i2) {
        return scaleFloat(convertTo(f2 * f3 * f3, 0, i2), 1);
    }

    public static List<Integer> getFamilyBgColor(List<UserInfos> list) {
        int iH;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            UserInfos userInfos = list.get(i3);
            String avatarPath = userInfos.getAvatarPath();
            String avatarUrl = userInfos.getAvatarUrl();
            if ((avatarPath == null || "".equals(avatarPath)) && (avatarUrl == null || "".equals(avatarUrl))) {
                iH = h(i2);
                i2++;
            } else {
                iH = Color.parseColor("#00FFFFF0");
            }
            arrayList.add(Integer.valueOf(iH));
        }
        return arrayList;
    }

    public static List<WeightInfos> getInfosAsc(long j2) {
        if (t(j2)) {
            j2 = -1;
        }
        QueryBuilder<WeightInfos> queryBuilder = HMDaoManager.getInstance().getWeightInfosDao().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        return queryBuilder.where(whereConditionGt, WeightInfosDao.Properties.UserId.eq(Long.valueOf(j2)), property.notEq(4), property.notEq(3)).orderAsc(WeightInfosDao.Properties.Timestamp).list();
    }

    public static WeightInfos getLatestInfoBeforeTime(long j2, long j3) {
        if (t(j2)) {
            j2 = -1;
        }
        QueryBuilder<WeightInfos> queryBuilder = HMDaoManager.getInstance().getWeightInfosDao().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.Timestamp;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, WeightInfosDao.Properties.UserId.eq(Long.valueOf(j2)), property.notEq(3), property.notEq(4), property2.lt(Long.valueOf(j3))).orderDesc(property2).list();
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public static WeightInfos getLatestMonthCompareWeight(long j2, long j3) {
        if (t(j2)) {
            j2 = -1;
        }
        Calendar.getInstance().setTimeInMillis(j3);
        QueryBuilder<WeightInfos> queryBuilder = HMDaoManager.getInstance().getWeightInfosDao().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        Property property2 = WeightInfosDao.Properties.Timestamp;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, WeightInfosDao.Properties.UserId.eq(Long.valueOf(j2)), property.notEq(3), property.notEq(4), property2.le(Long.valueOf(j3))).orderDesc(property2).limit(30).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static String getMeasureTips(UserInfos userInfos, Context context) {
        String string = "";
        if (userInfos == null) {
            return "";
        }
        int weightAge = BodyParamsUtils.getWeightAge(System.currentTimeMillis(), userInfos.getBirthday());
        boolean z = true;
        if (weightAge >= 0 && (weightAge < 6 || weightAge > 99)) {
            string = weightAge < 6 ? context.getString(R.string.weighting_weight_bf_age_lt) : context.getString(R.string.weighting_weight_bf_age_huge);
        }
        if (userInfos.getHeight().intValue() <= 0 || (userInfos.getHeight().intValue() >= 90 && userInfos.getHeight().intValue() <= 220)) {
            z = false;
        }
        if (z) {
            return userInfos.getHeight().intValue() < 90 ? context.getString(R.string.weighting_weight_bf_height_min) : context.getString(R.string.weighting_weight_bf_height_max);
        }
        return string;
    }

    public static int[] getMifitOneFootScoreColors(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.s51), ContextCompat.getColor(context, R.color.s31), ContextCompat.getColor(context, R.color.s33), ContextCompat.getColor(context, R.color.s20), ContextCompat.getColor(context, R.color.s22)};
    }

    public static int[] getMuscleColor(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.high_color), ContextCompat.getColor(context, R.color.normal_color), ContextCompat.getColor(context, R.color.body_fat_excellent_color)};
    }

    public static String[] getOneFootFigureLables(Context context) {
        return context.getResources().getStringArray(R.array.one_foot_score_levels);
    }

    public static String getScaleAnalyticsType() {
        return isWeightScale() ? StatEvent.Weight_Scale_Fail : StatEvent.Weight_BodyFatScale_Fail;
    }

    public static int getScaleMaxValue() {
        return BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() ? 180 : 150;
    }

    public static float getShowBmi(WeightInfos weightInfos, UserInfos userInfos) {
        if (weightInfos.getBmi() != null) {
            return weightInfos.getBmi().floatValue();
        }
        int iIntValue = 0;
        if (weightInfos.getHeight() != null && weightInfos.getHeight().intValue() != 0) {
            iIntValue = weightInfos.getHeight().intValue();
        } else if (userInfos != null && userInfos.getHeight() != null) {
            iIntValue = userInfos.getHeight().intValue();
        }
        return scaleBMI(iIntValue == 0 ? 0.0f : calcuBMI(iIntValue, weightInfos.getWeight().floatValue()));
    }

    public static String getWeightDeviceSyncTimeForDisplay(Context context) {
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
        if (!hMDeviceManager.hasBound(hMDeviceType)) {
            return "";
        }
        Calendar boundDeviceSyncTime = BFCallback.getHMDeviceManager().getBoundDeviceSyncTime(hMDeviceType);
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = boundDeviceSyncTime.get(1);
        int i6 = boundDeviceSyncTime.get(2) + 1;
        int i7 = boundDeviceSyncTime.get(5);
        if (i5 > i2) {
            return "";
        }
        if (i5 < i2) {
            return BodyFatTimeUtils.INSTANCE.formatDateTime(context, boundDeviceSyncTime.getTime());
        }
        long timeInMillis = boundDeviceSyncTime.getTimeInMillis();
        return (i3 == i6 && i7 == i4) ? BodyFatTimeUtils.INSTANCE.formatTime(context, timeInMillis) : BodyFatTimeUtils.INSTANCE.formatDate_no_y(context, timeInMillis, false);
    }

    public static FigureSource getWeightFigureSource(Context context, boolean z, int i2, int i3, int i4, int i5) {
        float fConvertFromKg = convertFromKg(3.0f, i5);
        float fConvertFromKg2 = convertFromKg(634.0f, i5);
        if (z && (i3 < 7 || i4 < 90)) {
            return null;
        }
        int i6 = 0;
        if (z && i3 < 18) {
            float f2 = i4 / 100.0f;
            return new FigureSource(new float[]{fConvertFromKg, getChildNormalWeightInUnit(getChildNormalBmi(i3, i2), f2, i5), getChildNormalWeightInUnit(getChildFatBmi(i3, i2), f2, i5), fConvertFromKg2}, getChildFigureLables(context), getBmiColorFor7_18(context));
        }
        if (i3 < 18) {
            return null;
        }
        String[] strArrSplit = adultBMICalculator(z, i4 / 100.0f, i5).split(",");
        int length = strArrSplit.length + 2;
        float[] fArr = new float[length];
        fArr[0] = fConvertFromKg;
        while (i6 < strArrSplit.length) {
            int i7 = i6 + 1;
            fArr[i7] = Float.parseFloat(strArrSplit[i6]);
            i6 = i7;
        }
        fArr[length - 1] = fConvertFromKg2;
        return new FigureSource(fArr, getAdualtFigureLables(context), getBmiColorForAdualt(context));
    }

    public static float getWeightMaxKg() {
        return isAmazfitScale() ? 180.0f : 150.0f;
    }

    public static String getWeightMaxWithUnitText(int i2) {
        float weightMaxKg = getWeightMaxKg();
        return String.format("%1$s%2$s", getWeightValueStringForDisplay(weightMaxKg, i2, 0), BFCallback.getUnitManager().getWeightUnitString(i2));
    }

    public static int[] getWeightScaleColors() {
        return j(0, 2);
    }

    public static int[] getWeightScaleColorsForBaby() {
        return j(1, 1);
    }

    public static String getWeightValueStringForDisplay(float f2, int i2) {
        int i3 = 0;
        int i4 = 1;
        if (i2 == 17) {
            int iConvertFromKg = (int) (convertFromKg(f2, 1) + 0.5f);
            return String.format(Locale.getDefault(), "%d:%d", Integer.valueOf(iConvertFromKg / 14), Integer.valueOf(iConvertFromKg % 14));
        }
        float fConvertFromKg = convertFromKg(f2, i2);
        if (i2 == 0 && 0.1f < Math.abs(f2) && Math.abs(f2) < 100.0f) {
            i4 = 2;
        }
        if (i2 == 2) {
            fConvertFromKg = new BigDecimal(fConvertFromKg).setScale(0, 4).floatValue();
        } else {
            i3 = i4;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(i3);
        numberInstance.setMaximumFractionDigits(i3);
        return numberInstance.format(fConvertFromKg);
    }

    private static int h(int i2) {
        return i()[i2 % 6];
    }

    private static int[] i() {
        Context context = (Context) KoinJavaComponent.get(Context.class);
        return new int[]{ContextCompat.getColor(context, R.color.s14), ContextCompat.getColor(context, R.color.s24), ContextCompat.getColor(context, R.color.s26), ContextCompat.getColor(context, R.color.p3), ContextCompat.getColor(context, R.color.s31), ContextCompat.getColor(context, R.color.s20)};
    }

    public static boolean isAgeMatch(int i2) {
        return i2 >= 6 && i2 < 18;
    }

    public static boolean isAllDataSameDay(long j2) {
        if (t(j2)) {
            j2 = -1;
        }
        QueryBuilder<WeightInfos> queryBuilder = HMDaoManager.getInstance().getWeightInfosDao().queryBuilder();
        WhereCondition whereConditionGt = WeightInfosDao.Properties.Sync.gt(-1);
        Property property = WeightInfosDao.Properties.Type;
        List<WeightInfos> list = queryBuilder.where(whereConditionGt, property.notEq(3), property.notEq(4), WeightInfosDao.Properties.UserId.eq(Long.valueOf(j2))).orderDesc(WeightInfosDao.Properties.Timestamp).list();
        if (list == null || list.size() == 0) {
            return true;
        }
        WeightInfos weightInfos = list.get(0);
        WeightInfos weightInfos2 = list.get(list.size() - 1);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(new Date(weightInfos.getTimestamp().longValue()));
        calendar2.setTime(new Date(weightInfos2.getTimestamp().longValue()));
        SportDay sportDay = new SportDay(calendar);
        SportDay sportDay2 = new SportDay(calendar2);
        HMLog.d(TAG, sportDay.getKey() + "," + sportDay2.getKey(), new Object[0]);
        return sportDay.offsetDay(sportDay2) == 0;
    }

    public static boolean isAmazfitScale() {
        return BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
    }

    public static boolean isAmazfitScaleConnect() {
        HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.WEIGHT);
        return device != null && device.getDeviceSource().getValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() && device.isConnected();
    }

    public static boolean isFinishAfterMeasureBody() {
        return BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() != HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
    }

    public static boolean isHideUnitJin() {
        return !Language.isChinese();
    }

    public static boolean isLastWeightDataSession(WeightAdvData weightAdvData, WeightAdvData weightAdvData2) {
        return (weightAdvData == null || weightAdvData.getMeasureData() == null || weightAdvData2 == null || weightAdvData2.getMeasureData() == null || weightAdvData.getMeasureData().getSessionID() != weightAdvData2.getMeasureData().getSessionID()) ? false : true;
    }

    public static boolean isSelf(String str) {
        return BFCallback.getHMPersonInfo().getUserid().equals(str) || String.valueOf(-1L).equals(str);
    }

    public static boolean isShowGuestEntrance() {
        return BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT_BFS) || BFCallback.getHMDeviceManager().hasBound(HMDeviceSource.WEIGHT_AMAZFIT_SCALE);
    }

    public static boolean isValidImpedance(int i2) {
        return (i2 <= 0 || i2 == 65533 || i2 == 65534) ? false : true;
    }

    public static boolean isWeightScale() {
        int boundWeightDeviceSourceValue = BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue();
        return boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_SCALE2.getValue() || boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT.getValue();
    }

    public static boolean isWeightSessionIdOutOfDate(WeightAdvData weightAdvData) {
        if (weightAdvData != null) {
            return System.currentTimeMillis() - weightAdvData.getTimestamp() >= 120000;
        }
        return true;
    }

    public static boolean isWeightStable(WeightAdvData weightAdvData) {
        if (weightAdvData != null && weightAdvData.getMeasureData() != null) {
            int value = weightAdvData.getMeasureState().getValue();
            if (weightAdvData.isStable() || value == MeasureState.MEASURING_IMPEDANCE.getValue() || value == MeasureState.MEASURING_HR.getValue() || value == MeasureState.MEASURING_PRESSURE.getValue()) {
                return true;
            }
        }
        return false;
    }

    private static int[] j(@IntRange(from = 0, to = 2) int i2, @IntRange(from = 0, to = 2) int i3) {
        Context context = (Context) KoinJavaComponent.get(Context.class);
        int[] iArr = {ContextCompat.getColor(context, R.color.s20), ContextCompat.getColor(context, R.color.s33), ContextCompat.getColor(context, R.color.p3)};
        int i4 = (i3 + 1) - i2;
        int[] iArr2 = new int[i4];
        if (i3 >= i2) {
            System.arraycopy(iArr, i2, iArr2, 0, i4);
        }
        return iArr2;
    }

    private static boolean k(char c2) {
        return c2 / 128 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(float f2) {
        return "Before lightWeight " + f2;
    }

    public static int length(String str) {
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        for (char c2 : str.toCharArray()) {
            i2++;
            if (!k(c2)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(int i2) {
        return "Tmp light weight is" + i2 + "";
    }

    public static List<UserInfos> matchUsers(WeightAdvData weightAdvData) {
        ArrayList arrayList = new ArrayList();
        if (weightAdvData == null) {
            return arrayList;
        }
        List<UserInfos> allInfos = UserInfoManager.getManager().getAllInfos();
        WeightInfoManager manager = WeightInfoManager.getManager();
        for (UserInfos userInfos : allInfos) {
            WeightInfos latestInfo = manager.getLatestInfo(Long.parseLong(userInfos.getUserId()));
            if (latestInfo != null) {
                userInfos.setWeight(latestInfo.getWeight());
                HMLog.d(TAG, "lastest user:" + userInfos.getUserId() + ",weight:" + latestInfo.getWeight(), new Object[0]);
            }
        }
        if (allInfos.size() < 1) {
            HMLog.d(TAG, "no user info for weight!!!", new Object[0]);
        } else {
            for (UserInfos userInfos2 : allInfos) {
                HMLog.d(TAG, "info:" + userInfos2, new Object[0]);
                if (Math.abs(userInfos2.getWeight().floatValue() - convertToKg(weightAdvData.getValue(), weightAdvData.getType())) < 3.0f) {
                    arrayList.add(userInfos2);
                }
            }
        }
        HMLog.i(TAG, "matched user info size:" + arrayList.size(), new Object[0]);
        return arrayList;
    }

    public static void mergeUserInfoWeight() {
        List<WeightInfos> infosAsc = WeightInfoManager.getManager().getInfosAsc(-1L);
        StringBuilder sb = new StringBuilder();
        sb.append("sync after , weightinfo mid size = ");
        sb.append(infosAsc == null ? 0 : infosAsc.size());
        HMLog.i(TAG, sb.toString(), new Object[0]);
        if (infosAsc == null || infosAsc.size() == 0) {
            float weight = BFCallback.getHMPersonInfo().getWeight();
            if (weight <= 0.0f) {
                HMLog.i(TAG, "currentWeight data from userinfo is invalid . wData = " + weight, new Object[0]);
                return;
            }
            WeightInfos weightInfos = new WeightInfos();
            weightInfos.setUserId(-1L);
            weightInfos.setTimestamp(Long.valueOf(System.currentTimeMillis()));
            weightInfos.setSync(0);
            weightInfos.setWeight(Float.valueOf(weight));
            weightInfos.setType(0);
            WeightInfoManager.getManager().addInfo(weightInfos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(float f2, int i2) {
        return "After lightWeight " + f2 + "unit " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(float f2, int i2, Exception exc) {
        return "scaleFloatToDown error! value is " + f2 + " and scale is " + i2 + ". Exception is " + exc.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void p(Context context) {
        a = true;
        UserInfoManager.getManager().syncInfosWithServer(context, new a());
        a = false;
        return null;
    }

    public static WeightInfos parseFromWeightData(WeightAdvData weightAdvData, long j2, int i2) {
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setDevice_id(weightAdvData.getDeviceId());
        weightInfos.setSync(0);
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        weightInfos.setWeight(Float.valueOf(convertToKg(weightAdvData.getValue(), weightAdvData.getType())));
        weightInfos.setType(Integer.valueOf(i2));
        weightInfos.setUserId(Long.valueOf(j2));
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
        return weightInfos;
    }

    public static int parseHeartRate(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 2)[0] & 255;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0;
    }

    public static String parseMonthHourDate(long j2) {
        return new SimpleDateFormat("MM/dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j2));
    }

    public static WeightGoals parseToWeightGoal(JSONObject jSONObject) {
        WeightGoals weightGoals = new WeightGoals();
        weightGoals.setUID(jSONObject.optString("uid"));
        weightGoals.setGoalType(Integer.valueOf(jSONObject.optInt("goal_type")));
        weightGoals.setCurrentVal(Float.valueOf((float) jSONObject.optDouble("currentval")));
        weightGoals.setDateTime(Long.valueOf(jSONObject.optLong("date_time")));
        weightGoals.setGoal(Float.valueOf((float) jSONObject.optDouble(com.xiaomi.hm.health.device.event.StatEvent.EventParams.TYPE_CARD_GOAL)));
        weightGoals.setFUID(Long.valueOf(jSONObject.optLong("fuid")));
        weightGoals.setHeight(Integer.valueOf(jSONObject.optInt("height")));
        weightGoals.setSynced(1);
        return weightGoals;
    }

    public static float parseWeightStringToFloat(String str) throws ParseException {
        if (str != null && str.length() != 0) {
            try {
                return NumberFormat.getNumberInstance().parse(str).floatValue();
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
        return 0.0f;
    }

    public static String parserUserInfos(UserInfos userInfos) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f, userInfos.getUserId());
            jSONObject.put(g, userInfos.getName());
            jSONObject.put(h, userInfos.getGender());
            jSONObject.put(i, userInfos.getBirthday());
            jSONObject.put(j, userInfos.getHeight());
            jSONObject.put(k, userInfos.getWeight());
            jSONObject.put(l, userInfos.getTargetWeight() == null ? -1.0d : userInfos.getTargetWeight().floatValue());
            jSONObject.put(m, userInfos.getAvatarUrl());
            jSONObject.put(n, userInfos.getAvatarPath());
            jSONObject.put(o, userInfos.getSynced());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(Throwable th) {
        return "从云端同步体重信息处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(final Throwable th) {
        HMLog.warn(TAG, new Function0() { // from class: fr3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMWeightUtils.q(th);
            }
        });
    }

    private static float s(float f2) {
        long jRound = Math.round(f2 * 100.0f);
        long j2 = jRound % 10;
        return (j2 < 5 ? jRound - j2 : jRound + (5 - j2)) / 100.0f;
    }

    public static float scaleBMI(float f2) {
        if (f2 < 10.0f) {
            f2 = 10.0f;
        } else if (f2 > 50.0f) {
            f2 = 50.0f;
        }
        return scaleFloatToDown(f2, 1);
    }

    public static float scaleFloat(float f2, int i2) {
        return new BigDecimal(f2).setScale(i2, 4).floatValue();
    }

    public static float scaleFloatToDown(final float f2, final int i2) {
        try {
            return new BigDecimal(BodyFatDecimalUtil.INSTANCE.toStr(Float.valueOf(f2))).setScale(i2, 1).floatValue();
        } catch (Exception e2) {
            HMLog.error(TAG, new Function0() { // from class: dr3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMWeightUtils.o(f2, i2, e2);
                }
            });
            return 0.0f;
        }
    }

    public static float scaleWeight(float f2) {
        return scaleFloat(f2, 1);
    }

    public static int suitableWeightUnit(float f2) {
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        if (weightUnit == 0) {
            return f2 >= 1.0f ? 0 : 2;
        }
        if (weightUnit == 1) {
            return f2 >= 0.45359f ? 1 : 3;
        }
        if (weightUnit == 16) {
            return f2 >= 0.5f ? 16 : 2;
        }
        return weightUnit == 17 ? 17 : 2;
    }

    public static boolean syncToServer() {
        if (!((FeatureSwitch) KoinJavaComponent.get(FeatureSwitch.class)).isSyncDataEnable()) {
            return true;
        }
        boolean zSyncInfosNeedSyncAndDeletedWithServer = UserInfoManager.getManager().syncInfosNeedSyncAndDeletedWithServer();
        HMLog.i(TAG, "Sync UserInfos To Server : " + zSyncInfosNeedSyncAndDeletedWithServer, new Object[0]);
        if (!zSyncInfosNeedSyncAndDeletedWithServer) {
            return false;
        }
        boolean zSyncInfosNeedSyncAndDeletedWithServer2 = WeightInfoManager.getManager().syncInfosNeedSyncAndDeletedWithServer();
        HMLog.i(TAG, "Sync WeightInfos To Server : " + zSyncInfosNeedSyncAndDeletedWithServer2, new Object[0]);
        if (!zSyncInfosNeedSyncAndDeletedWithServer2) {
            return false;
        }
        boolean zSyncLocalToServer = WeightGoalManager.getInstance().syncLocalToServer();
        HMLog.i(TAG, "Sync WeightGoals To Server : " + zSyncLocalToServer, new Object[0]);
        return zSyncLocalToServer;
    }

    public static void syncWithServer(Context context) {
        if (a) {
            return;
        }
        HMLog.d(TAG, "syncWithServer coming...", new Object[0]);
        Observable.just(context).map(new Func1() { // from class: hr3
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HMWeightUtils.p((Context) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: gr3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMWeightUtils.r((Throwable) obj);
            }
        });
    }

    private static boolean t(long j2) {
        return j2 == Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
    }

    public static BodyFigure toBodyFigure(float f2, int i2, int i3) {
        BodyFigure bodyFigure = BodyFigure.Normal;
        if (!Language.isChinese()) {
            if (i2 < 18) {
                return BodyFigure.Unknown;
            }
            if (f2 <= 0.0f) {
                return BodyFigure.Unknown;
            }
            if (f2 < 18.5f) {
                return BodyFigure.Light;
            }
            if (f2 < 25.0f) {
                return bodyFigure;
            }
            return f2 < 30.0f ? BodyFigure.Weight : BodyFigure.Fat;
        }
        if (i2 >= 0 && i2 < 7) {
            return BodyFigure.Unknown;
        }
        if (i2 < 7 || i2 >= 18) {
            if (i2 < 18) {
                return bodyFigure;
            }
            if (f2 <= 0.0f) {
                return BodyFigure.Unknown;
            }
            if (f2 < 18.5f) {
                return BodyFigure.Light;
            }
            if (f2 < 24.0f) {
                return bodyFigure;
            }
            return f2 < 28.0f ? BodyFigure.Weight : BodyFigure.Fat;
        }
        if (i3 == 1) {
            float[] fArr = male_overweight;
            int i4 = i2 - 7;
            if (f2 < fArr[i4]) {
                return bodyFigure;
            }
            return (f2 < fArr[i4] || f2 >= male_fat[i4]) ? BodyFigure.Fat : BodyFigure.Weight;
        }
        if (i3 != 0) {
            return BodyFigure.Unknown;
        }
        float[] fArr2 = female_overweight;
        int i5 = i2 - 7;
        if (f2 < fArr2[i5]) {
            return bodyFigure;
        }
        return (f2 < fArr2[i5] || f2 >= female_fat[i5]) ? BodyFigure.Fat : BodyFigure.Weight;
    }

    public static String toBodyFigureDescription(Context context, float f2, int i2, int i3) {
        String str;
        if (!Utils.INSTANCE.isChineseLanguage() || i2 < 7 || i2 >= 18) {
            str = "--";
        } else {
            String[] stringArray = context.getResources().getStringArray(R.array.weight_body_figures_for_child);
            HashMap map = new HashMap();
            map.put(BodyFigure.Normal, stringArray[0]);
            map.put(BodyFigure.Weight, stringArray[1]);
            map.put(BodyFigure.Fat, stringArray[2]);
            str = (String) map.get(toBodyFigure(f2, i2, i3));
        }
        if (i2 >= 18) {
            String[] stringArray2 = context.getResources().getStringArray(R.array.weight3_body_figures);
            HashMap map2 = new HashMap();
            map2.put(BodyFigure.Light, stringArray2[0]);
            map2.put(BodyFigure.Normal, stringArray2[1]);
            map2.put(BodyFigure.Weight, stringArray2[2]);
            map2.put(BodyFigure.Fat, stringArray2[3]);
            str = (String) map2.get(toBodyFigure(f2, i2, i3));
        }
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static String toString(WeightInfos weightInfos) {
        if (weightInfos == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append(" : <Weight : ");
        sb.append(weightInfos);
        sb.append(", weight : ");
        sb.append(weightInfos.getWeight());
        sb.append(", UserId : ");
        sb.append(weightInfos.getUserId());
        sb.append(", dateTime : ");
        sb.append(weightInfos.getTimestamp());
        sb.append(", Time : ");
        sb.append(DateFormat.format("yyyy-MM-dd HH:mm:ss", weightInfos.getTimestamp().longValue()));
        sb.append(", DeviceId : ");
        sb.append(weightInfos.getDevice_id());
        sb.append(", Type : ");
        sb.append(weightInfos.getType());
        sb.append(", Synced : ");
        sb.append(weightInfos.getSync());
        sb.append(", Impedance : ");
        sb.append(weightInfos.getImpedance());
        sb.append(", bmiValue : ");
        sb.append(weightInfos.getBmi());
        sb.append(", body_fat : ");
        sb.append(weightInfos.getBody_fat());
        sb.append(", muscle : ");
        sb.append(weightInfos.getMuscle());
        sb.append(", visceralValue : ");
        sb.append(weightInfos.getVisceral_fat());
        sb.append(", moisture : ");
        sb.append(weightInfos.getMoisture());
        sb.append(", boneValue : ");
        sb.append(weightInfos.getBone_mass());
        sb.append(", basal_metabolism : ");
        sb.append(weightInfos.getBasal_metabolism());
        sb.append(", body_shape : ");
        sb.append(weightInfos.getBody_shape_type());
        sb.append(", height : ");
        sb.append(weightInfos.getHeight());
        sb.append(", score : ");
        sb.append(weightInfos.getScore());
        sb.append(", source : ");
        sb.append(weightInfos.getSource());
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }

    public static String toStringWeightGoals(WeightGoals weightGoals) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(" : <WeightGoals : ");
        sb.append(weightGoals);
        sb.append(", fuid : ");
        sb.append(weightGoals.getFUID());
        sb.append(", uid : ");
        sb.append(weightGoals.getUID());
        sb.append(", time : ");
        sb.append(DateFormat.format("yyyy-MM-dd HH:mm:ss", weightGoals.getDateTime().longValue() * 1000));
        sb.append(", goalWeight : ");
        sb.append(weightGoals.getGoal());
        sb.append(", goalType : ");
        sb.append(weightGoals.getGoalType());
        sb.append(", synced : ");
        sb.append(weightGoals.getSynced());
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }

    public static String toUnitStr(Context context, int i2) {
        return BFCallback.getUnitManager().getWeightUnitString(i2);
    }

    public static void updateLoginUserWeight(WeightInfos weightInfos) {
        WeightInfos latestInfo;
        if (isSelf(String.valueOf(weightInfos.getUserId())) && (latestInfo = WeightInfoManager.getManager().getLatestInfo(-1L)) != null) {
            float fFloatValue = latestInfo.getWeight().floatValue();
            if (fFloatValue <= 0.0f) {
                HMLog.i(TAG, "updateLoginUserWeight wData is invalid . wData = " + fFloatValue, new Object[0]);
                return;
            }
            HMLog.d(TAG, " weight = " + fFloatValue, new Object[0]);
            BFCallback.getHMPersonInfo().saveWeight(fFloatValue);
        }
    }

    public static String getBmiLevel(Context context, float f2, int i2, int i3) {
        String str;
        if (Utils.INSTANCE.isChineseLanguage() && i2 >= 7 && i2 < 18) {
            String[] stringArray = context.getResources().getStringArray(R.array.bmi_for_child);
            HashMap map = new HashMap();
            map.put(BodyFigure.Normal, stringArray[0]);
            map.put(BodyFigure.Weight, stringArray[1]);
            map.put(BodyFigure.Fat, stringArray[2]);
            str = (String) map.get(toBodyFigure(f2, i2, i3));
        } else if (i2 >= 18) {
            String[] stringArray2 = context.getResources().getStringArray(R.array.bmi_for_adualt);
            HashMap map2 = new HashMap();
            map2.put(BodyFigure.Light, stringArray2[0]);
            map2.put(BodyFigure.Normal, stringArray2[1]);
            map2.put(BodyFigure.Weight, stringArray2[2]);
            map2.put(BodyFigure.Fat, stringArray2[3]);
            str = (String) map2.get(toBodyFigure(f2, i2, i3));
        } else {
            str = "";
        }
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static String getWeightValueStringForDisplay(float f2, int i2, int i3) {
        if (i2 == 17) {
            int iConvertFromKg = (int) (convertFromKg(f2, 1) + 0.5f);
            return String.format(Locale.getDefault(), "%d:%d", Integer.valueOf(iConvertFromKg / 14), Integer.valueOf(iConvertFromKg % 14));
        }
        float fConvertFromKg = convertFromKg(f2, i2);
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(i3);
        numberInstance.setMaximumFractionDigits(i3);
        return numberInstance.format(fConvertFromKg);
    }
}

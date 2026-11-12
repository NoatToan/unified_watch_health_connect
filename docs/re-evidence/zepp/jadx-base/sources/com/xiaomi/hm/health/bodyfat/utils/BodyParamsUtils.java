package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huami.algo.bodyIndex.BodyIndexAnalysisImpl;
import com.huami.algo.bodyIndex.BodyIndexType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class BodyParamsUtils {
    private static final String a = "Params-BodyParamsUtils";
    private static final int b = 1;
    private static final int c = 2;

    public enum BodyBmrFigure {
        Standard,
        Not_Standard,
        Unknown
    }

    public enum BodyFatFigure {
        Low,
        Slightly_Lower,
        Normal,
        Slightly_Higher,
        High,
        Unknown
    }

    public enum BodyMuscleFigure {
        Low,
        Normal,
        High,
        Unknown
    }

    public enum BodyProteinFigure {
        LOW(0),
        NORMAL(1),
        BETTER(2),
        UNKNOWN(-1);

        public int value;

        BodyProteinFigure(int i) {
            this.value = i;
        }
    }

    public enum BodyScoreGrade {
        Very_Bad,
        Bad,
        Normal,
        Good,
        Better,
        Unknown
    }

    public enum BodySkeletalMuscleFigure {
        Low,
        Slightly_Lower,
        Normal,
        High,
        Unknown
    }

    public enum BodySubcutaneousFatFigure {
        Low,
        Slightly_Lower,
        Normal,
        Slightly_High,
        High,
        Unknown
    }

    public enum BodyWaterFigure {
        Slightly_Lower,
        Normal,
        Slightly_High,
        Unknown
    }

    public enum BoneValueType {
        Low,
        Normal,
        High,
        Unknown
    }

    public enum VisceralFatFigure {
        Normal,
        Slightly_Higher,
        High,
        Unknown
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[BodySkeletalMuscleFigure.values().length];
            c = iArr;
            try {
                iArr[BodySkeletalMuscleFigure.Low.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[BodySkeletalMuscleFigure.High.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[BodySkeletalMuscleFigure.Normal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[BodySkeletalMuscleFigure.Slightly_Lower.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[BodySubcutaneousFatFigure.values().length];
            b = iArr2;
            try {
                iArr2[BodySubcutaneousFatFigure.Low.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[BodySubcutaneousFatFigure.High.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[BodySubcutaneousFatFigure.Normal.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[BodySubcutaneousFatFigure.Slightly_Lower.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[BodySubcutaneousFatFigure.Slightly_High.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[BodyProteinFigure.values().length];
            a = iArr3;
            try {
                iArr3[BodyProteinFigure.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[BodyProteinFigure.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[BodyProteinFigure.BETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static BodyFatFigure A(float[] fArr, float f) {
        if (f < fArr[0]) {
            return BodyFatFigure.Low;
        }
        if (f < fArr[1]) {
            return BodyFatFigure.Slightly_Lower;
        }
        if (f < fArr[2]) {
            return BodyFatFigure.Normal;
        }
        return f < fArr[3] ? BodyFatFigure.Slightly_Higher : BodyFatFigure.High;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0070  */
    /* JADX WARN: Code duplicated, block: B:13:0x0077 A[RETURN] */
    private static ScoreParamsObject B(Context context, int i, int i2) {
        String string;
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.body_age));
        scoreParamsObject.setUnitValue(context.getResources().getString(R.string.years_old));
        scoreParamsObject.setParamsValue(i2 + "");
        scoreParamsObject.setAge(i);
        scoreParamsObject.setWfType(8);
        scoreParamsObject.setWfValue((float) i2);
        int i3 = 2;
        int i4 = 0;
        if (i2 != i) {
            if (i2 < i) {
                string = context.getResources().getString(R.string.body_age_small_than_react);
            } else {
                string = context.getResources().getString(R.string.body_age_big_than_react);
                i4 = 2;
            }
            scoreParamsObject.setColorState(i3);
            if (!"".equals(string)) {
                return null;
            }
            scoreParamsObject.setType(i4);
            scoreParamsObject.setHintInfo(string);
            return scoreParamsObject;
        }
        string = context.getResources().getString(R.string.body_age_match);
        i3 = 0;
        scoreParamsObject.setColorState(i3);
        if (!"".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i4);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    private static float[] C(int i, int i2, int i3) {
        float[] muscleAllSection = getMuscleAllSection(i, i2);
        float[] fArr = new float[2];
        if (i3 == 1) {
            fArr[1] = muscleAllSection[0];
            fArr[0] = muscleAllSection[0] - 5.0f;
        } else if (i3 == 2) {
            fArr[0] = muscleAllSection[0];
            fArr[1] = muscleAllSection[0] + 2.0f;
        }
        HMLog.d(a, "muscleSectionType = " + i3 + " , sections = " + muscleAllSection[0] + " - " + muscleAllSection[1], new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("扣分区间 = ");
        sb.append(fArr[0]);
        sb.append(" - ");
        sb.append(fArr[1]);
        HMLog.d(a, sb.toString(), new Object[0]);
        return fArr;
    }

    private static BodyMuscleFigure D(float[] fArr, float f) {
        if (f < fArr[0]) {
            return BodyMuscleFigure.Low;
        }
        return f < fArr[1] ? BodyMuscleFigure.Normal : BodyMuscleFigure.High;
    }

    private static String E(Context context, BodySkeletalMuscleFigure bodySkeletalMuscleFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.health_data_low_normal_high_level);
        HashMap map = new HashMap();
        map.put(BodySkeletalMuscleFigure.Low, stringArray[0]);
        map.put(BodySkeletalMuscleFigure.Normal, stringArray[1]);
        map.put(BodySkeletalMuscleFigure.High, stringArray[2]);
        map.put(BodySkeletalMuscleFigure.Slightly_Lower, stringArray[1]);
        String str = (String) map.get(bodySkeletalMuscleFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    private static String F(Context context, BodySubcutaneousFatFigure bodySubcutaneousFatFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.common_low_normal_high_level);
        HashMap map = new HashMap();
        map.put(BodySubcutaneousFatFigure.Low, stringArray[0]);
        map.put(BodySubcutaneousFatFigure.Normal, stringArray[1]);
        map.put(BodySubcutaneousFatFigure.High, stringArray[2]);
        map.put(BodySubcutaneousFatFigure.Slightly_Lower, stringArray[1]);
        map.put(BodySubcutaneousFatFigure.Slightly_High, stringArray[1]);
        String str = (String) map.get(bodySubcutaneousFatFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    private static boolean G(int i, int i2) {
        if (i > 99 || i < 6) {
            HMLog.info(a, new Function0() { // from class: v30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.Z();
                }
            });
            return true;
        }
        if (i2 <= 220 && i2 >= 90) {
            return false;
        }
        HMLog.info(a, new Function0() { // from class: t30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.a0();
            }
        });
        return true;
    }

    private static boolean H(float f) {
        return HMWeightUtils.convertFromKg(f, 16) >= 0.5f;
    }

    private static boolean I(int i, int i2) {
        return i >= 7 && i2 >= 90 && (Language.isChinese() || i >= 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J(UserInfos userInfos, int i, WeightInfos weightInfos, int i2, int i3) {
        return "height=" + userInfos.getHeight() + ",age=" + i + ",sex=" + userInfos.getGender() + "weight=" + weightInfos.getWeight() + ",impedance=" + i2 + ",mode=" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K(Exception exc) {
        return "parse weight score exception > " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L(WeightInfos weightInfos) {
        return "after weightInfo : " + HMWeightUtils.toString(weightInfos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M(float[] fArr) {
        return "allSection = " + Arrays.toString(fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N(BodyFatFigure bodyFatFigure) {
        return "体脂  = " + bodyFatFigure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O(float f) {
        return "bmi_upper_limit_value = " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P(int i, int i2, int i3, float f, float f2) {
        return "age = " + i + ", sex = " + i2 + ", height = " + i3 + " , bmiValue = " + f + " , bodyFatValue = " + f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "start parse body score.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R(WeightInfos weightInfos, int i, UserInfos userInfos, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i2) {
        return "weight " + weightInfos.getWeight() + " age " + i + "  sex" + userInfos.getGender() + " BMI " + weightInfos.getBmi() + " BMI score = " + f + " 体脂  " + weightInfos.getBody_fat() + " 体脂 score\u3000= " + f2 + " 肌肉  " + weightInfos.getMuscle() + " 肌肉 score = " + f3 + " 水分  " + weightInfos.getMoisture() + " 水分 score = " + f4 + " 内脏脂肪  " + weightInfos.getVisceral_fat() + " 内脏脂肪 score = " + f5 + " 骨量  " + weightInfos.getBone_mass() + " 骨量 score = " + f6 + " 基础代谢  " + weightInfos.getBasal_metabolism() + " 基础代谢 score = " + f7 + " 皮下脂肪  " + weightInfos.getSubcutaneousFat() + " 皮下脂肪 score = " + f8 + " 骨骼肌  " + weightInfos.getSkeletalMuscle() + " 骨骼肌 score = " + f9 + " , (四舍五入)final get  score = " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "getBodyShapeTypeLevelStr context is null error.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(String str) {
        return "figure = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U(int i, int i2, int i3, float f) {
        return "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , bodyFatValue = " + f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V(BodyFatFigure bodyFatFigure) {
        return "体脂类型 ： " + bodyFatFigure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W(String str) {
        return "bodyFatLevel = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X(float f, float[] fArr) {
        return "currentValue = " + f + "fatNormalSection = " + fArr[0] + " - " + fArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y(WeightInfos weightInfos, UserInfos userInfos) {
        return "getScoreShowInfos error. WeightInfo > " + weightInfos + ", UserInfo > " + userInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z() {
        return "age is unReasonable ,return . ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0() {
        return "height is unReasonable ,return . ";
    }

    public static WeightInfos addBodyParams(final WeightInfos weightInfos, final UserInfos userInfos) {
        final int weightAge = getWeightAge(weightInfos.getTimestamp().longValue(), userInfos.getBirthday());
        int iIntValue = userInfos.getGender().intValue();
        final int iIntValue2 = weightInfos.getImpedance().intValue();
        int iIntValue3 = userInfos.getHeight().intValue();
        float fCalcuBMI = HMWeightUtils.calcuBMI(iIntValue3, weightInfos.getWeight().floatValue());
        UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(userInfos.getUserId());
        final int measureMode = userScaleInfoById != null ? userScaleInfoById.getMeasureMode() : userInfos.getMeasureMode();
        weightInfos.setBmi(Float.valueOf(fCalcuBMI));
        weightInfos.setHeight(Integer.valueOf(iIntValue3));
        HMLog.info("addBodyParams", new Function0() { // from class: c40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.J(userInfos, weightAge, weightInfos, iIntValue2, measureMode);
            }
        });
        Map<BodyIndexType, Object> mapAnalysis = new BodyIndexAnalysisImpl().analysis(weightInfos.getSource().intValue(), weightInfos.getWeight().floatValue(), userInfos.getHeight().intValue(), userInfos.getGender().intValue(), weightAge, iIntValue2, measureMode);
        if (mapAnalysis.isEmpty()) {
            HMLog.d(a, "输入数据有误！", new Object[0]);
            return weightInfos;
        }
        weightInfos.setSync(0);
        weightInfos.setEncryptImpedance(Integer.valueOf(iIntValue2));
        BodyIndexType bodyIndexType = BodyIndexType.IMPEDANCE;
        if (mapAnalysis.containsKey(bodyIndexType)) {
            Object obj = mapAnalysis.get(bodyIndexType);
            Objects.requireNonNull(obj);
            weightInfos.setImpedance(Integer.valueOf(((Float) obj).intValue()));
        }
        BodyIndexType bodyIndexType2 = BodyIndexType.VISCERAL_FAT;
        if (mapAnalysis.containsKey(bodyIndexType2)) {
            Object obj2 = mapAnalysis.get(bodyIndexType2);
            Objects.requireNonNull(obj2);
            weightInfos.setVisceral_fat(Float.valueOf(((Integer) obj2).floatValue()));
        }
        BodyIndexType bodyIndexType3 = BodyIndexType.BODY_FAT;
        if (mapAnalysis.containsKey(bodyIndexType3)) {
            Object obj3 = mapAnalysis.get(bodyIndexType3);
            Objects.requireNonNull(obj3);
            weightInfos.setBody_fat(Float.valueOf(((Float) obj3).floatValue()));
        }
        BodyIndexType bodyIndexType4 = BodyIndexType.MUSCLE;
        if (mapAnalysis.containsKey(bodyIndexType4)) {
            Object obj4 = mapAnalysis.get(bodyIndexType4);
            Objects.requireNonNull(obj4);
            weightInfos.setMuscle(Float.valueOf(((Float) obj4).floatValue()));
        }
        BodyIndexType bodyIndexType5 = BodyIndexType.BONE_MASS;
        if (mapAnalysis.containsKey(bodyIndexType5)) {
            Object obj5 = mapAnalysis.get(bodyIndexType5);
            Objects.requireNonNull(obj5);
            weightInfos.setBone_mass(Float.valueOf(((Float) obj5).floatValue()));
        }
        BodyIndexType bodyIndexType6 = BodyIndexType.MOISTURE;
        if (mapAnalysis.containsKey(bodyIndexType6)) {
            Object obj6 = mapAnalysis.get(bodyIndexType6);
            Objects.requireNonNull(obj6);
            weightInfos.setMoisture(Float.valueOf(((Float) obj6).floatValue()));
        }
        BodyIndexType bodyIndexType7 = BodyIndexType.BASAL_METABOLISM;
        if (mapAnalysis.containsKey(bodyIndexType7)) {
            weightInfos.setBasal_metabolism((Integer) mapAnalysis.get(bodyIndexType7));
        }
        BodyIndexType bodyIndexType8 = BodyIndexType.MA;
        if (mapAnalysis.containsKey(bodyIndexType8)) {
            weightInfos.setMa(Integer.valueOf(((Integer) mapAnalysis.get(bodyIndexType8)).intValue()));
        }
        BodyIndexType bodyIndexType9 = BodyIndexType.PMR;
        if (mapAnalysis.containsKey(bodyIndexType9)) {
            weightInfos.setPmr(Float.valueOf(((Float) mapAnalysis.get(bodyIndexType9)).floatValue()));
        }
        BodyIndexType bodyIndexType10 = BodyIndexType.SBW;
        if (mapAnalysis.containsKey(bodyIndexType10)) {
            weightInfos.setSbw(Float.valueOf(((Float) mapAnalysis.get(bodyIndexType10)).floatValue()));
        }
        BodyIndexType bodyIndexType11 = BodyIndexType.SKELETAL_MUSCLE;
        if (mapAnalysis.containsKey(bodyIndexType11)) {
            weightInfos.setSkeletalMuscle(((Float) mapAnalysis.get(bodyIndexType11)).floatValue());
        }
        BodyIndexType bodyIndexType12 = BodyIndexType.SUBCUTANEOUS_FAT;
        if (mapAnalysis.containsKey(bodyIndexType12)) {
            weightInfos.setSubcutaneousFat(((Float) mapAnalysis.get(bodyIndexType12)).floatValue());
        }
        BodyIndexType bodyIndexType13 = BodyIndexType.BODY_SHAPE_TYPE;
        if (mapAnalysis.containsKey(bodyIndexType13)) {
            weightInfos.setBody_shape_type(Integer.valueOf(((Integer) mapAnalysis.get(bodyIndexType13)).intValue()));
        } else {
            weightInfos.setBody_shape_type(Integer.valueOf(calBodyShape(weightAge, iIntValue, iIntValue3, weightInfos.getBody_fat().floatValue(), weightInfos.getMuscle().floatValue())));
        }
        try {
            weightInfos.setScore(Integer.valueOf(getBodyScore(weightInfos, userInfos, weightAge)));
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.error(a, new Function0() { // from class: p30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.K(e);
                }
            });
        }
        HMLog.info(a, new Function0() { // from class: d40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.L(weightInfos);
            }
        });
        return weightInfos;
    }

    public static boolean bodyParamValid(WeightInfos weightInfos) {
        UserInfos info = UserInfoManager.getManager().getInfo(weightInfos.getUserId().longValue());
        Map<BodyIndexType, Object> mapAnalysis = new BodyIndexAnalysisImpl().analysis(weightInfos.getWeight().floatValue(), weightInfos.getHeight().intValue(), info.getGender().intValue(), getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday()), weightInfos.getImpedance().intValue(), -1);
        return !mapAnalysis.isEmpty() && x(weightInfos.getImpedance(), mapAnalysis.get(BodyIndexType.IMPEDANCE)) && x(weightInfos.getBmi(), mapAnalysis.get(BodyIndexType.BMI)) && x(weightInfos.getVisceral_fat(), mapAnalysis.get(BodyIndexType.VISCERAL_FAT)) && x(weightInfos.getBone_mass(), mapAnalysis.get(BodyIndexType.BONE_MASS)) && x(weightInfos.getBody_fat(), mapAnalysis.get(BodyIndexType.BODY_FAT)) && x(weightInfos.getMoisture(), mapAnalysis.get(BodyIndexType.MOISTURE)) && x(weightInfos.getMuscle(), mapAnalysis.get(BodyIndexType.MUSCLE));
    }

    public static BodyFatFigure calBodyFatFigure(float f, int i, int i2) {
        BodyFatFigure bodyFatFigure = BodyFatFigure.Unknown;
        if (f == 0.0f) {
            return bodyFatFigure;
        }
        final float[] bodyFatAllSection = getBodyFatAllSection(i, i2);
        HMLog.info(a, new Function0() { // from class: s30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.M(bodyFatAllSection);
            }
        });
        return bodyFatAllSection == null ? bodyFatFigure : A(bodyFatAllSection, f);
    }

    public static int calBodyShape(int i, int i2, int i3, float f, float f2) {
        if (G(i, i3)) {
            return 0;
        }
        BodyFatFigure bodyFatFigureCalBodyFatFigure = calBodyFatFigure(f, i, i2);
        BodyMuscleFigure bodyMuscleFigureCalMuscleFigure = calMuscleFigure(f2, i, i3, i2);
        if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Low)) {
            if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Low)) {
                return 1;
            }
            if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Normal)) {
                return 2;
            }
            return bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.High) ? 3 : 0;
        }
        if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Normal) || bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Lower)) {
            if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Low)) {
                return 4;
            }
            if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Normal)) {
                return 5;
            }
            return bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.High) ? 6 : 0;
        }
        if (!bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Higher) && !bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.High)) {
            return 0;
        }
        if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Low)) {
            return 7;
        }
        if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Normal)) {
            return 8;
        }
        return bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.High) ? 9 : 0;
    }

    public static BoneValueType calBoneType(float f, int i, int i2, float f2) {
        BoneValueType boneValueType;
        BoneValueType boneValueType2 = BoneValueType.Unknown;
        if (!s(i)) {
            return boneValueType2;
        }
        float[] boneSection = getBoneSection(i2, f2);
        if (f < boneSection[0]) {
            boneValueType = BoneValueType.Low;
        } else {
            boneValueType = f < boneSection[1] ? BoneValueType.Normal : BoneValueType.High;
        }
        HMLog.d(a, "骨量类型 = " + boneValueType, new Object[0]);
        return boneValueType;
    }

    public static BodyMuscleFigure calMuscleFigure(float f, int i, int i2, int i3) {
        BodyMuscleFigure bodyMuscleFigure = BodyMuscleFigure.Unknown;
        if (f == 0.0f || G(i, i2)) {
            return bodyMuscleFigure;
        }
        BodyMuscleFigure bodyMuscleFigureD = D(getMuscleAllSection(i2, i3), f);
        HMLog.d(a, "muscle type = " + bodyMuscleFigureD, new Object[0]);
        return bodyMuscleFigureD;
    }

    public static BodyProteinFigure calProteinFigure(float f, int i, int i2) {
        float[] proteinAllSection = getProteinAllSection(i);
        if (proteinAllSection == null) {
            return BodyProteinFigure.UNKNOWN;
        }
        if (f < proteinAllSection[0]) {
            return BodyProteinFigure.LOW;
        }
        return f < proteinAllSection[1] ? BodyProteinFigure.NORMAL : BodyProteinFigure.BETTER;
    }

    public static VisceralFatFigure calVisceralFatType(float f, int i) {
        VisceralFatFigure visceralFatFigure = VisceralFatFigure.Unknown;
        if (!s(i)) {
            return visceralFatFigure;
        }
        float[] fArr = WeightConstant.VISCERAL_FAT_SECTIONS;
        if (f < fArr[0]) {
            return VisceralFatFigure.Normal;
        }
        return f >= fArr[1] ? VisceralFatFigure.High : VisceralFatFigure.Slightly_Higher;
    }

    public static BodyWaterFigure calWatereFigure(float f, int i, int i2) {
        BodyWaterFigure bodyWaterFigure;
        BodyWaterFigure bodyWaterFigure2 = BodyWaterFigure.Unknown;
        float[] waterAllSection = getWaterAllSection(i, i2);
        if (waterAllSection == null) {
            return bodyWaterFigure2;
        }
        if (f < waterAllSection[0]) {
            bodyWaterFigure = BodyWaterFigure.Slightly_Lower;
        } else {
            bodyWaterFigure = f < waterAllSection[1] ? BodyWaterFigure.Normal : BodyWaterFigure.Slightly_High;
        }
        HMLog.d(a, "水分含量类型 ： " + bodyWaterFigure, new Object[0]);
        return bodyWaterFigure;
    }

    public static float calculateIdealWeight(int i, int i2, int i3, float f) {
        return new BodyIndexAnalysisImpl().idealWeight(i, i2, i3, f);
    }

    public static boolean canAnalyzeBmi(int i, int i2) {
        UserInfos info = UserInfoManager.getManager().getInfo(BFCallback.getHMLoginManager().getValidUid());
        if (info == null) {
            return false;
        }
        if (!(Locale.getDefault().getLanguage() == Locale.CHINESE.getLanguage())) {
            return i >= 18;
        }
        if (i < 7) {
            return false;
        }
        if (i2 == 0) {
            i2 = info.getHeight().intValue();
        }
        return i2 >= 100;
    }

    public static String cannotAnalyzeBmiString(Context context, int i, int i2) {
        if (!(Locale.getDefault().getLanguage() == Locale.CHINESE.getLanguage())) {
            if (i < 18) {
                return context.getResources().getString(R.string.no_bmi_for_not_adult);
            }
            return null;
        }
        if (i < 7) {
            return context.getResources().getString(R.string.no_bmi_for_age);
        }
        if (i2 < 100) {
            return context.getResources().getString(R.string.no_bmi_for_height);
        }
        return null;
    }

    public static String[] getAdualtBmiLables(Context context) {
        return context.getResources().getStringArray(R.array.bmi_for_adualt);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01da A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    public static ScoreParamsObject getBmiScoreObject(Context context, final int i, final int i2, final int i3, final float f, final float f2) {
        int i4;
        String string;
        int i5;
        HMLog.info(a, new Function0() { // from class: z30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.P(i, i2, i3, f, f2);
            }
        });
        if (!I(i, i3)) {
            return null;
        }
        HMWeightUtils.BodyFigure bodyFigure = HMWeightUtils.toBodyFigure(f, i, i2);
        int i6 = 0;
        HMLog.d(a, "bmiFigure = " + bodyFigure, new Object[0]);
        String bmiLevel = HMWeightUtils.getBmiLevel(context, bodyFigure);
        HMLog.d(a, "bmiLevelStr = " + bmiLevel, new Object[0]);
        if (bodyFigure.equals(HMWeightUtils.BodyFigure.Light) || bodyFigure.equals(HMWeightUtils.BodyFigure.Weight)) {
            i4 = 1;
        } else if (bodyFigure.equals(HMWeightUtils.BodyFigure.Normal)) {
            i4 = 4;
        } else if (bodyFigure.equals(HMWeightUtils.BodyFigure.Fat)) {
            i4 = 2;
        } else {
            i4 = bodyFigure.equals(HMWeightUtils.BodyFigure.VeryFat) ? 3 : -1;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.bmi));
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        scoreParamsObject.setLevel(bmiLevel);
        scoreParamsObject.setColorState(i4);
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(0);
        scoreParamsObject.setWfValue(f);
        String string2 = context.getResources().getString(R.string.bmi_activity_text);
        float[] fArr = WeightConstant.A;
        if (f >= fArr[1]) {
            final BodyFatFigure bodyFatFigureCalBodyFatFigure = calBodyFatFigure(f2, i, i2);
            HMLog.info(a, new Function0() { // from class: a40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.N(bodyFatFigureCalBodyFatFigure);
                }
            });
            if (!bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Higher) && !bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.High)) {
                if (!bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Normal) && !bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Low) && !bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Lower)) {
                    if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Unknown) || bodyFigure.equals(HMWeightUtils.BodyFigure.Fat) || bodyFigure.equals(HMWeightUtils.BodyFigure.VeryFat) || bodyFigure.equals(HMWeightUtils.BodyFigure.Weight)) {
                        string2 = context.getResources().getString(R.string.bmi_need_attention_for_bmi_high_and_nobodyfat);
                        i6 = 2;
                    }
                    if (i5 != -1) {
                        return null;
                    }
                    return null;
                }
                if (bodyFigure.equals(HMWeightUtils.BodyFigure.Fat) || bodyFigure.equals(HMWeightUtils.BodyFigure.VeryFat) || bodyFigure.equals(HMWeightUtils.BodyFigure.Weight)) {
                    string2 = context.getResources().getString(R.string.bmi_need_attention_for_bmi_high);
                    i6 = 2;
                }
                if (i5 != -1 || "".equals(string)) {
                    return null;
                }
                scoreParamsObject.setHintInfo(string);
                scoreParamsObject.setType(i5);
                return scoreParamsObject;
            }
            if (bodyFigure.equals(HMWeightUtils.BodyFigure.Fat) || bodyFigure.equals(HMWeightUtils.BodyFigure.VeryFat) || bodyFigure.equals(HMWeightUtils.BodyFigure.Weight)) {
                final float f3 = y(i, i2)[0];
                HMLog.info(a, new Function0() { // from class: o30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BodyParamsUtils.O(f3);
                    }
                });
                string2 = context.getResources().getString(R.string.bmi_not_up_standard, String.valueOf(f3));
                i6 = 1;
            }
            if (f < fArr[1] || f >= 18.5f || i < 18) {
                string = string2;
                i5 = i6;
            } else {
                string = context.getResources().getString(R.string.bmi_need_attention_for_too_low_18);
            }
            if (i5 != -1) {
                return null;
            }
            return null;
        }
        string = context.getResources().getString(R.string.bmi_need_attention_for_too_low);
        i5 = 2;
        if (i5 != -1) {
            return null;
        }
        return null;
    }

    public static BodyBmrFigure getBmrFigure(int i, int i2, int i3, float f) {
        BodyBmrFigure bodyBmrFigure = BodyBmrFigure.Unknown;
        if (s(i2)) {
            return i >= getBmrNormalValue(i2, i3, f) ? BodyBmrFigure.Standard : BodyBmrFigure.Not_Standard;
        }
        return bodyBmrFigure;
    }

    public static String getBmrLevelStr(Context context, BodyBmrFigure bodyBmrFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.brm_leval);
        HashMap map = new HashMap();
        map.put(BodyBmrFigure.Not_Standard, stringArray[0]);
        map.put(BodyBmrFigure.Standard, stringArray[1]);
        String str = (String) map.get(bodyBmrFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static int getBmrNormalValue(int i, int i2, float f) {
        float f2;
        float[] fArr = i2 == 1 ? WeightConstant.O : WeightConstant.P;
        if (i <= 29) {
            f2 = fArr[0];
        } else {
            f2 = i <= 49 ? fArr[1] : fArr[2];
        }
        HMLog.d(a, "bmrParams = " + f2, new Object[0]);
        float f3 = f2 * f;
        StringBuilder sb = new StringBuilder();
        sb.append("normalBrm = ");
        sb.append(f3);
        sb.append(" , toAfter normalBrm =  ");
        int i3 = (int) f3;
        sb.append(i3);
        HMLog.d(a, sb.toString(), new Object[0]);
        return i3;
    }

    public static ScoreParamsObject getBmrScoreObject(Context context, int i, int i2, int i3, int i4, float f) {
        String string;
        int i5 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , bmrValue = " + i4, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.basal_metabolism));
        String string2 = context.getString(R.string.unit_kc);
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%,d", Integer.valueOf(i4)));
        scoreParamsObject.setUnitValue(string2);
        BodyBmrFigure bmrFigure = getBmrFigure(i4, i, i2, f);
        HMLog.d(a, "基础代谢类型 ： " + bmrFigure, new Object[0]);
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWeight(f);
        scoreParamsObject.setWfType(1);
        scoreParamsObject.setWfValue(i4);
        if (bmrFigure.equals(BodyBmrFigure.Not_Standard)) {
            scoreParamsObject.setLevel(context.getResources().getString(R.string.body_params_bmr_low));
            scoreParamsObject.setColorState(2);
            int bmrNormalValue = getBmrNormalValue(i, i2, f);
            HMLog.d(a, "正常标准的 基础代谢值 ： " + bmrNormalValue, new Object[0]);
            string = context.getResources().getString(R.string.bmr_need_attention_infomation, Integer.valueOf(bmrNormalValue));
            i5 = 1;
        } else {
            String string3 = context.getResources().getString(R.string.bmr_activity_text);
            scoreParamsObject.setLevel(context.getResources().getString(R.string.bodyfat_3_params_bmr_standard));
            scoreParamsObject.setColorState(4);
            string = string3;
        }
        if (i5 == -1 || "".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i5);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static float[] getBodyFatAllSection(int i, int i2) {
        if (!s(i)) {
            return null;
        }
        if (i < 18) {
            if (i2 == 1) {
                return WeightConstant.a;
            }
            if (i2 != 0) {
                return null;
            }
            if (i < 12) {
                return WeightConstant.e;
            }
            if (i < 14) {
                return WeightConstant.f;
            }
            return i < 16 ? WeightConstant.g : WeightConstant.h;
        }
        if (i < 40) {
            if (i2 == 1) {
                return WeightConstant.b;
            }
            if (i2 == 0) {
                return WeightConstant.i;
            }
            return null;
        }
        if (i < 60) {
            if (i2 == 1) {
                return WeightConstant.c;
            }
            if (i2 == 0) {
                return WeightConstant.j;
            }
            return null;
        }
        if (i2 == 1) {
            return WeightConstant.d;
        }
        if (i2 == 0) {
            return WeightConstant.k;
        }
        return null;
    }

    public static String getBodyFatLevalStr(Context context, BodyFatFigure bodyFatFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.bodyfat_content_leval);
        HashMap map = new HashMap();
        map.put(BodyFatFigure.Low, stringArray[0]);
        map.put(BodyFatFigure.Slightly_Lower, stringArray[1]);
        map.put(BodyFatFigure.Normal, stringArray[2]);
        map.put(BodyFatFigure.Slightly_Higher, stringArray[3]);
        map.put(BodyFatFigure.High, stringArray[4]);
        String str = (String) map.get(bodyFatFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static int getBodyScore(final WeightInfos weightInfos, final UserInfos userInfos, final int i) {
        HMLog.info(a, new Function0() { // from class: w30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.Q();
            }
        });
        BodyParamsScoreHelper bodyParamsScoreHelper = BodyParamsScoreHelper.INSTANCE;
        final float fCalculateBmiReduceScore = bodyParamsScoreHelper.calculateBmiReduceScore(i, userInfos.getGender().intValue(), weightInfos.getBmi().floatValue(), weightInfos.getBody_fat().floatValue());
        final float fCalculateBodyFatReduceScore = bodyParamsScoreHelper.calculateBodyFatReduceScore(i, userInfos.getGender().intValue(), weightInfos.getBody_fat().floatValue());
        final float fCalculateMuscleReduceScore = bodyParamsScoreHelper.calculateMuscleReduceScore(userInfos.getGender().intValue(), userInfos.getHeight().intValue(), weightInfos.getMuscle().floatValue());
        final float fCalculateWaterReduceScore = bodyParamsScoreHelper.calculateWaterReduceScore(userInfos.getGender().intValue(), weightInfos.getMoisture().floatValue());
        final float fCalculateVisceralFatReduceScore = bodyParamsScoreHelper.calculateVisceralFatReduceScore(weightInfos.getVisceral_fat().floatValue());
        final float fCalculateBoneMassReduceScore = bodyParamsScoreHelper.calculateBoneMassReduceScore(userInfos.getGender().intValue(), weightInfos.getWeight().floatValue(), weightInfos.getBone_mass().floatValue());
        final float fCalculateBasicMetabolismReduceScore = bodyParamsScoreHelper.calculateBasicMetabolismReduceScore(weightInfos, userInfos, i);
        final float fCalculateSubcutaneousFatReduceScore = bodyParamsScoreHelper.calculateSubcutaneousFatReduceScore(i, userInfos.getGender().intValue(), weightInfos.getSubcutaneousFat(), weightInfos.getBmi().floatValue());
        final float fCalculateSkeletalMuscleReduceScore = bodyParamsScoreHelper.calculateSkeletalMuscleReduceScore(weightInfos.getSkeletalMuscle());
        final int i2 = (int) (((((((((100.0f - fCalculateBmiReduceScore) - fCalculateBodyFatReduceScore) - fCalculateMuscleReduceScore) - fCalculateWaterReduceScore) - fCalculateVisceralFatReduceScore) - fCalculateBoneMassReduceScore) - fCalculateBasicMetabolismReduceScore) - fCalculateSubcutaneousFatReduceScore) - fCalculateSkeletalMuscleReduceScore);
        HMLog.info(a, new Function0() { // from class: e40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.R(weightInfos, i, userInfos, fCalculateBmiReduceScore, fCalculateBodyFatReduceScore, fCalculateMuscleReduceScore, fCalculateWaterReduceScore, fCalculateVisceralFatReduceScore, fCalculateBoneMassReduceScore, fCalculateBasicMetabolismReduceScore, fCalculateSubcutaneousFatReduceScore, fCalculateSkeletalMuscleReduceScore, i2);
            }
        });
        return i2;
    }

    public static int getBodyShapeTypeByLevel(Context context, String str) {
        String[] stringArray = context.getResources().getStringArray(R.array.show_body_shape_array);
        int[] iArr = {7, 8, 9, 4, 5, 6, 1, 2, 3};
        HashMap map = new HashMap();
        for (int i = 0; i < stringArray.length; i++) {
            map.put(stringArray[i].replaceAll("[\\r\\t\\n]", " "), Integer.valueOf(iArr[i]));
        }
        if (map.get(str) == null) {
            return 0;
        }
        int iIntValue = ((Integer) map.get(str)).intValue();
        HMLog.d(a, "figure = " + iIntValue, new Object[0]);
        return iIntValue;
    }

    public static String getBodyShapeTypeLevelStr(Context context, int i) {
        if (context == null) {
            HMLog.error(a, new Function0() { // from class: u30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.S();
                }
            });
            return "--";
        }
        String[] stringArray = context.getResources().getStringArray(R.array.show_body_shape_array);
        int[] iArr = {7, 8, 9, 4, 5, 6, 1, 2, 3};
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            sparseArray.put(iArr[i2], stringArray[i2]);
        }
        final String str = (String) sparseArray.get(i);
        HMLog.info(a, new Function0() { // from class: r30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.T(str);
            }
        });
        return TextUtils.isEmpty(str) ? "--" : str.replaceAll("[\\r\\n\\t]", " ");
    }

    public static String getBoneLevelStr(Context context, BoneValueType boneValueType) {
        String[] stringArray = context.getResources().getStringArray(R.array.bone_leval);
        HashMap map = new HashMap();
        map.put(BoneValueType.Low, stringArray[0]);
        map.put(BoneValueType.Normal, stringArray[1]);
        map.put(BoneValueType.High, stringArray[2]);
        String str = (String) map.get(boneValueType);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static ScoreParamsObject getBoneScoreObject(Context context, int i, int i2, int i3, float f, float f2) {
        int i4;
        String string;
        int i5 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , boneValueKg = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.bone_value));
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        String unitStr = HMWeightUtils.toUnitStr(context, weightUnit);
        scoreParamsObject.setParamsValue(HMWeightUtils.getWeightValueStringForDisplay(f, weightUnit));
        scoreParamsObject.setUnitValue(unitStr);
        BoneValueType boneValueTypeCalBoneType = calBoneType(f, i, i2, f2);
        scoreParamsObject.setLevel(getBoneLevelStr(context, boneValueTypeCalBoneType));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWeight(f2);
        scoreParamsObject.setWfType(3);
        scoreParamsObject.setWfValue(f);
        if (boneValueTypeCalBoneType.equals(BoneValueType.Low)) {
            i5 = 1;
            i4 = 2;
            string = context.getResources().getString(R.string.bone_need_attention_infomation);
        } else {
            i4 = 4;
            string = context.getResources().getString(R.string.bone_activity_text);
        }
        scoreParamsObject.setColorState(i4);
        if ("".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i5);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static float[] getBoneSection(int i, float f) {
        float[] fArr;
        if (i == 1) {
            float[] fArr2 = WeightConstant.B;
            if (f < fArr2[0]) {
                fArr = WeightConstant.D;
            } else {
                fArr = f < fArr2[1] ? WeightConstant.E : WeightConstant.F;
            }
        } else {
            float[] fArr3 = WeightConstant.C;
            if (f < fArr3[0]) {
                fArr = WeightConstant.G;
            } else {
                fArr = f < fArr3[1] ? WeightConstant.H : WeightConstant.I;
            }
        }
        HMLog.d(a, "骨量的区间范围：" + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    public static String[] getChildBmiLables(Context context) {
        return context.getResources().getStringArray(R.array.bmi_for_child);
    }

    public static String getMetabolismStr(int i) {
        String strValueOf = String.valueOf(i);
        if (strValueOf.length() <= 3) {
            return strValueOf;
        }
        return strValueOf.substring(0, 1) + "," + strValueOf.substring(1);
    }

    public static float[] getMuscleAllSection(int i, int i2) {
        float[] fArr;
        if (i2 == 1) {
            if (i < 160) {
                fArr = WeightConstant.l;
            } else {
                fArr = i <= 169 ? WeightConstant.m : WeightConstant.n;
            }
        } else if (i < 150) {
            fArr = WeightConstant.o;
        } else {
            fArr = i <= 159 ? WeightConstant.p : WeightConstant.q;
        }
        HMLog.d(a, "肌肉的区间范围 ：" + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    public static String getMuscleLevalStr(Context context, BodyMuscleFigure bodyMuscleFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.muscle_content_leval);
        HashMap map = new HashMap(3);
        map.put(BodyMuscleFigure.Low, stringArray[0]);
        map.put(BodyMuscleFigure.Normal, stringArray[1]);
        map.put(BodyMuscleFigure.High, stringArray[2]);
        String str = (String) map.get(bodyMuscleFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static ScoreParamsObject getMuscleScoreObject(Context context, int i, int i2, int i3, float f) {
        String string;
        int i4 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , muscleKg = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.muscle));
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        String unitStr = HMWeightUtils.toUnitStr(context, weightUnit);
        scoreParamsObject.setParamsValue(HMWeightUtils.getWeightValueStringForDisplay(f, weightUnit));
        scoreParamsObject.setUnitValue(unitStr);
        BodyMuscleFigure bodyMuscleFigureCalMuscleFigure = calMuscleFigure(f, i, i3, i2);
        scoreParamsObject.setLevel(getMuscleLevalStr(context, bodyMuscleFigureCalMuscleFigure));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setUnit(weightUnit);
        scoreParamsObject.setWfType(6);
        scoreParamsObject.setWfValue(f);
        String string2 = context.getResources().getString(R.string.muscle_activity_text);
        int i5 = 4;
        if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Low)) {
            float[] muscleAllSection = getMuscleAllSection(i3, i2);
            float f2 = muscleAllSection[0];
            float f3 = muscleAllSection[1];
            float f4 = f2 - f;
            String str = HMWeightUtils.getWeightValueStringForDisplay(f2, weightUnit) + unitStr;
            String str2 = HMWeightUtils.getWeightValueStringForDisplay(f3, weightUnit) + unitStr;
            if (f4 >= 0.5f) {
                string = context.getResources().getString(R.string.muscle_low_infomation, str, str2, HMWeightUtils.getWeightValueStringForDisplay(f4, weightUnit) + unitStr);
            } else {
                string = context.getResources().getString(R.string.muscle_low_infomation_novalue, str, str2);
            }
            string2 = string;
            i4 = 1;
            i5 = 2;
        } else if (bodyMuscleFigureCalMuscleFigure.equals(BodyMuscleFigure.Normal)) {
            float[] fArrC = C(i3, i2, 2);
            HMLog.d(a, "currentValue = " + f + " ,normalSection 正常接近偏高区间 = " + fArrC[0] + " - " + fArrC[1], new Object[0]);
            if (f >= fArrC[0] && f <= fArrC[1]) {
                string2 = context.getResources().getString(R.string.muscle_need_attention_infomation);
                i4 = 2;
            }
        }
        scoreParamsObject.setColorState(i5);
        if (i4 == -1 || "".equals(string2)) {
            return null;
        }
        scoreParamsObject.setType(i4);
        scoreParamsObject.setHintInfo(string2);
        return scoreParamsObject;
    }

    public static ScoreParamsObject getPmrScoreObject(Context context, int i, int i2, int i3, float f) {
        String string;
        int i4 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , pmr = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.protein));
        int i5 = 1;
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        scoreParamsObject.setUnitValue("%");
        BodyProteinFigure bodyProteinFigureCalProteinFigure = calProteinFigure(f, i, i2);
        scoreParamsObject.setLevel(getProteinLevelStr(context, bodyProteinFigureCalProteinFigure));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(7);
        scoreParamsObject.setWfValue(f);
        int i6 = a.a[bodyProteinFigureCalProteinFigure.ordinal()];
        if (i6 == 1) {
            string = context.getResources().getString(R.string.pmr_low_information);
            i4 = 1;
            i5 = 2;
        } else if (i6 == 2) {
            i5 = 4;
            float[] proteinAllSection = getProteinAllSection(i);
            string = (proteinAllSection == null || f < proteinAllSection[0] || f > proteinAllSection[0] + 1.0f) ? context.getString(R.string.pmr_activity_text) : context.getResources().getString(R.string.pmr_need_attention_information);
        } else if (i6 != 3) {
            string = "";
            i5 = -1;
        } else {
            string = context.getResources().getString(R.string.pmr_great_information);
        }
        scoreParamsObject.setColorState(i5);
        if ("".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i4);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static float[] getProteinAllSection(int i) {
        if (s(i)) {
            return WeightConstant.Q;
        }
        return null;
    }

    public static String getProteinLevelStr(Context context, BodyProteinFigure bodyProteinFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.common_level);
        int i = bodyProteinFigure.value;
        return (i >= stringArray.length || i < 0) ? "--" : stringArray[i];
    }

    public static ScoreParamsObject getSbwScoreObject(Context context, int i, int i2, int i3, float f, float f2) {
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.ideal_body_weight));
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        scoreParamsObject.setUnitValue(BFCallback.getUnitManager().getWeightUnitString(weightUnit));
        scoreParamsObject.setSex(i);
        scoreParamsObject.setParamsValue(HMWeightUtils.getWeightValueStringForDisplay(f2, weightUnit));
        scoreParamsObject.setWfType(9);
        scoreParamsObject.setAge(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWeight(HMWeightUtils.scaleFloat(f, 1));
        return scoreParamsObject;
    }

    public static String getScoreLevalStr(Context context, BodyScoreGrade bodyScoreGrade) {
        String[] stringArray = context.getResources().getStringArray(R.array.body_score_leval);
        HashMap map = new HashMap(5);
        map.put(BodyScoreGrade.Very_Bad, stringArray[0]);
        map.put(BodyScoreGrade.Bad, stringArray[1]);
        map.put(BodyScoreGrade.Normal, stringArray[2]);
        map.put(BodyScoreGrade.Good, stringArray[3]);
        map.put(BodyScoreGrade.Better, stringArray[4]);
        String str = (String) map.get(bodyScoreGrade);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    public static ScoreParamsObject getScoreOfBodyFatObject(Context context, final int i, final int i2, final int i3, final float f, float f2) {
        int i4;
        String string;
        HMLog.info(a, new Function0() { // from class: y30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.U(i, i2, i3, f);
            }
        });
        if (G(i, i3)) {
            return null;
        }
        final BodyFatFigure bodyFatFigureCalBodyFatFigure = calBodyFatFigure(f, i, i2);
        HMLog.info(a, new Function0() { // from class: b40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.V(bodyFatFigureCalBodyFatFigure);
            }
        });
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.body_fat));
        int i5 = 1;
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        scoreParamsObject.setUnitValue("%");
        final String bodyFatLevalStr = getBodyFatLevalStr(context, bodyFatFigureCalBodyFatFigure);
        HMLog.info(a, new Function0() { // from class: q30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BodyParamsUtils.W(bodyFatLevalStr);
            }
        });
        scoreParamsObject.setLevel(bodyFatLevalStr);
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(2);
        scoreParamsObject.setWfValue(f);
        if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Lower) || bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Higher)) {
            i4 = 1;
        } else if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Normal)) {
            i4 = 4;
        } else {
            i4 = (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.High) || bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Low)) ? 2 : -1;
        }
        scoreParamsObject.setColorState(i4);
        String string2 = context.getResources().getString(R.string.bodyfat_activity_text);
        if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Slightly_Higher) || bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.High)) {
            float[] bodyFatAllSection = getBodyFatAllSection(i, i2);
            if (bodyFatAllSection == null) {
                return null;
            }
            float f3 = bodyFatAllSection[1];
            float f4 = bodyFatAllSection[2];
            int weightUnit = BFCallback.getUnitManager().getWeightUnit();
            String unitStr = HMWeightUtils.toUnitStr(context, weightUnit);
            float fT = t((f - f4) / 100.0f, f2);
            if (H(fT)) {
                float fConvertFromKg = HMWeightUtils.convertFromKg(fT, weightUnit);
                HMLog.d(a, "deductWeight = " + fConvertFromKg, new Object[0]);
                float fScaleFloatToDown = HMWeightUtils.scaleFloatToDown(fConvertFromKg, 1);
                string = context.getResources().getString(R.string.body_fat_not_up_standard, f3 + "%", f4 + "%", fScaleFloatToDown + unitStr);
            } else {
                string = context.getResources().getString(R.string.body_fat_not_up_standard_novalue, f3 + "%", f4 + "%");
            }
            string2 = string;
        } else if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Normal)) {
            final float[] fArrZ = z(i, i2, 2);
            HMLog.info(a, new Function0() { // from class: x30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.X(f, fArrZ);
                }
            });
            if (f < fArrZ[0] || f > fArrZ[1]) {
                i5 = 0;
            } else {
                string2 = context.getResources().getString(R.string.body_fat_need_attention);
                i5 = 2;
            }
        } else if (bodyFatFigureCalBodyFatFigure.equals(BodyFatFigure.Low)) {
            string2 = context.getResources().getString(R.string.body_fat_low_need_attention);
            i5 = 2;
        } else {
            i5 = 0;
        }
        if (i5 == -1 || "".equals(string2)) {
            return null;
        }
        scoreParamsObject.setType(i5);
        scoreParamsObject.setHintInfo(string2);
        return scoreParamsObject;
    }

    public static List<List<ScoreParamsObject>> getScoreShowInfos(Context context, final UserInfos userInfos, final WeightInfos weightInfos) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ScoreParamsObject scoreParamsObjectB;
        ScoreParamsObject skeletalMuscleObject;
        ScoreParamsObject pmrScoreObject;
        ScoreParamsObject waterScoreObject;
        ArrayList<ScoreParamsObject> arrayList = new ArrayList(7);
        ArrayList<ScoreParamsObject> arrayList2 = new ArrayList(7);
        ArrayList<ScoreParamsObject> arrayList3 = new ArrayList(4);
        ArrayList arrayList4 = new ArrayList(2);
        if (weightInfos == null || userInfos == null) {
            HMLog.error(a, new Function0() { // from class: f40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BodyParamsUtils.Y(weightInfos, userInfos);
                }
            });
            ArrayList arrayList5 = new ArrayList(4);
            arrayList5.add(arrayList);
            arrayList5.add(arrayList3);
            arrayList5.add(arrayList2);
            arrayList5.add(arrayList4);
            return arrayList5;
        }
        int weightAge = getWeightAge(weightInfos.getTimestamp().longValue(), userInfos.getBirthday());
        int iIntValue = userInfos.getGender().intValue();
        HMLog.d(a, "uid = " + userInfos.getUserId(), new Object[0]);
        HMLog.d(a, "wInfos = " + HMWeightUtils.toString(weightInfos), new Object[0]);
        int iIntValue2 = userInfos.getHeight().intValue();
        if (weightInfos.getHeight() != null) {
            iIntValue2 = weightInfos.getHeight().intValue();
        }
        int i13 = iIntValue2;
        float fFloatValue = weightInfos.getWeight().floatValue();
        float showBmi = HMWeightUtils.getShowBmi(weightInfos, userInfos);
        float fFloatValue2 = weightInfos.getBody_fat() != null ? weightInfos.getBody_fat().floatValue() : 0.0f;
        ScoreParamsObject bmiScoreObject = getBmiScoreObject(context, weightAge, iIntValue, i13, showBmi, fFloatValue2);
        if (bmiScoreObject != null) {
            if (bmiScoreObject.getType() == 1) {
                arrayList.add(bmiScoreObject);
            } else if (bmiScoreObject.getType() == 2) {
                arrayList3.add(bmiScoreObject);
            } else if (bmiScoreObject.getType() == 0) {
                arrayList2.add(bmiScoreObject);
            }
        }
        ScoreParamsObject scoreOfBodyFatObject = getScoreOfBodyFatObject(context, weightAge, iIntValue, i13, fFloatValue2, fFloatValue);
        if (scoreOfBodyFatObject != null) {
            if (scoreOfBodyFatObject.getType() == 1) {
                arrayList.add(scoreOfBodyFatObject);
            } else if (scoreOfBodyFatObject.getType() == 2) {
                arrayList3.add(scoreOfBodyFatObject);
            } else if (scoreOfBodyFatObject.getType() == 0) {
                arrayList2.add(scoreOfBodyFatObject);
            }
        }
        if (weightInfos.getMuscle() != null) {
            i2 = i13;
            ScoreParamsObject muscleScoreObject = getMuscleScoreObject(context, i, i3, i2, weightInfos.getMuscle().floatValue());
            if (muscleScoreObject != null) {
                if (muscleScoreObject.getType() == 1) {
                    i = weightAge;
                    i3 = iIntValue;
                    arrayList.add(muscleScoreObject);
                } else if (muscleScoreObject.getType() == 2) {
                    i = weightAge;
                    i3 = iIntValue;
                    arrayList3.add(muscleScoreObject);
                } else if (muscleScoreObject.getType() == 0) {
                    i = weightAge;
                    i3 = iIntValue;
                    arrayList2.add(muscleScoreObject);
                }
            }
        } else {
            i = weightAge;
            i2 = i13;
            i3 = iIntValue;
        }
        i = weightAge;
        i3 = iIntValue;
        i = weightAge;
        i3 = iIntValue;
        if (weightInfos.getMoisture() != null && (waterScoreObject = getWaterScoreObject(context, i, i3, i2, weightInfos.getMoisture().floatValue())) != null) {
            if (waterScoreObject.getType() == 1) {
                arrayList.add(waterScoreObject);
            } else {
                arrayList2.add(waterScoreObject);
            }
        }
        if (weightInfos.getPmr() != null && (pmrScoreObject = getPmrScoreObject(context, i, i3, i2, weightInfos.getPmr().floatValue())) != null) {
            if (pmrScoreObject.getType() == 1) {
                arrayList.add(pmrScoreObject);
            } else if (pmrScoreObject.getType() == 2) {
                arrayList3.add(pmrScoreObject);
            } else {
                arrayList2.add(pmrScoreObject);
            }
        }
        if (weightInfos.getBasal_metabolism() != null) {
            i4 = i2;
            i5 = i3;
            i6 = i;
            ScoreParamsObject bmrScoreObject = getBmrScoreObject(context, i, i3, i2, weightInfos.getBasal_metabolism().intValue(), fFloatValue);
            if (bmrScoreObject != null) {
                if (bmrScoreObject.getType() == 1) {
                    arrayList.add(bmrScoreObject);
                } else {
                    arrayList2.add(bmrScoreObject);
                }
            }
        } else {
            i4 = i2;
            i5 = i3;
            i6 = i;
        }
        if (weightInfos.getVisceral_fat() != null) {
            i7 = i4;
            i8 = i6;
            ScoreParamsObject visFatObject = getVisFatObject(context, i8, i7, i5, weightInfos.getVisceral_fat().floatValue());
            if (visFatObject != null) {
                if (visFatObject.getType() == 1) {
                    arrayList.add(visFatObject);
                } else if (visFatObject.getType() == 2) {
                    arrayList3.add(visFatObject);
                } else if (visFatObject.getType() == 0) {
                    arrayList2.add(visFatObject);
                }
            }
        } else {
            i7 = i4;
            i8 = i6;
        }
        if (weightInfos.getBone_mass() != null) {
            i9 = i7;
            i10 = i8;
            ScoreParamsObject boneScoreObject = getBoneScoreObject(context, i8, i5, i7, weightInfos.getBone_mass().floatValue(), fFloatValue);
            if (boneScoreObject != null) {
                if (boneScoreObject.getType() == 1) {
                    arrayList.add(boneScoreObject);
                } else {
                    arrayList2.add(boneScoreObject);
                }
            }
        } else {
            i9 = i7;
            i10 = i8;
        }
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            if (weightInfos.getSubcutaneousFat() <= 0.0f || weightInfos.getSource().intValue() != HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
                i11 = i9;
                i12 = i10;
            } else {
                i11 = i9;
                i12 = i10;
                ScoreParamsObject subcutaneousFatObject = getSubcutaneousFatObject(context, i12, i5, i11, weightInfos.getSubcutaneousFat());
                if (subcutaneousFatObject != null) {
                    if (subcutaneousFatObject.getType() == 1) {
                        arrayList.add(subcutaneousFatObject);
                    } else if (subcutaneousFatObject.getType() == 2) {
                        arrayList3.add(subcutaneousFatObject);
                    } else {
                        arrayList2.add(subcutaneousFatObject);
                    }
                }
            }
            if (weightInfos.getSkeletalMuscle() > 0.0f && weightInfos.getSource().intValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() && (skeletalMuscleObject = getSkeletalMuscleObject(context, i12, i5, i11, weightInfos.getSkeletalMuscle())) != null) {
                if (skeletalMuscleObject.getType() == 1) {
                    arrayList.add(skeletalMuscleObject);
                } else if (skeletalMuscleObject.getType() == 2) {
                    arrayList3.add(skeletalMuscleObject);
                } else {
                    arrayList2.add(skeletalMuscleObject);
                }
            }
        } else {
            i11 = i9;
            i12 = i10;
        }
        if (weightInfos.getMa() != null && (scoreParamsObjectB = B(context, i12, weightInfos.getMa().intValue())) != null) {
            arrayList4.add(scoreParamsObjectB);
        }
        if (weightInfos.getSbw() != null) {
            arrayList4.add(getSbwScoreObject(context, i5, i12, i11, fFloatValue, weightInfos.getSbw().floatValue()));
        }
        HMLog.d(a, "------notStandardList-----------------", new Object[0]);
        for (ScoreParamsObject scoreParamsObject : arrayList) {
            scoreParamsObject.setUid(userInfos.getUserId());
            HMLog.d("object", "value = " + scoreParamsObject.toString(), new Object[0]);
        }
        HMLog.d(a, "------notStandardList-----------------", new Object[0]);
        HMLog.d(a, "------needAttentionList-----------------", new Object[0]);
        for (ScoreParamsObject scoreParamsObject2 : arrayList3) {
            scoreParamsObject2.setUid(userInfos.getUserId());
            HMLog.d("object", "value = " + scoreParamsObject2.toString(), new Object[0]);
        }
        HMLog.d(a, "------healthList-----------------", new Object[0]);
        for (ScoreParamsObject scoreParamsObject3 : arrayList2) {
            scoreParamsObject3.setUid(userInfos.getUserId());
            HMLog.d("object", "value = " + scoreParamsObject3.toString(), new Object[0]);
        }
        ArrayList arrayList6 = new ArrayList(4);
        arrayList6.add(0, arrayList);
        arrayList6.add(1, arrayList3);
        arrayList6.add(2, arrayList2);
        arrayList6.add(3, arrayList4);
        return arrayList6;
    }

    public static float[] getSkeletalMuscleAllSection(int i, int i2) {
        if (!s(i)) {
            return null;
        }
        float[] fArr = WeightConstant.N;
        HMLog.d(a, "骨骼肌区间： " + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00db A[RETURN] */
    public static ScoreParamsObject getSkeletalMuscleObject(Context context, int i, int i2, int i3, float f) {
        String string;
        int i4 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , skeletalMuscle = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.skeletal_muscle));
        scoreParamsObject.setParamsValue(HMWeightUtils.getWeightValueStringForDisplay(f, weightUnit));
        scoreParamsObject.setUnitValue(BFCallback.getUnitManager().getWeightUnitString(weightUnit));
        BodySkeletalMuscleFigure bodySkeletalMuscleFigureU = u(f, i, i2);
        scoreParamsObject.setLevel(E(context, bodySkeletalMuscleFigureU));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(11);
        scoreParamsObject.setWfValue(f);
        int i5 = a.c[bodySkeletalMuscleFigureU.ordinal()];
        int i6 = -1;
        if (i5 != 1) {
            if (i5 == 2) {
                string = context.getResources().getString(R.string.skeletal_muscle_high_info);
            } else if (i5 == 3) {
                string = context.getResources().getString(R.string.skeletal_muscle_standard_info);
                i6 = 4;
            } else if (i5 != 4) {
                string = "";
                i4 = -1;
            } else {
                string = context.getResources().getString(R.string.skeletal_muscle_attention_info);
                i6 = 4;
                i4 = 2;
            }
            scoreParamsObject.setColorState(i6);
            if (!"".equals(string)) {
                return null;
            }
            scoreParamsObject.setType(i4);
            scoreParamsObject.setHintInfo(string);
            return scoreParamsObject;
        }
        string = context.getResources().getString(R.string.skeletal_muscle_low_info);
        i6 = 1;
        i4 = 1;
        scoreParamsObject.setColorState(i6);
        if (!"".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i4);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static float[] getSubcutaneousFatAllSection(int i, int i2) {
        float[] fArr = new float[2];
        if (!s(i)) {
            return null;
        }
        if (i2 == 1) {
            fArr = WeightConstant.M;
        } else if (i2 == 0) {
            fArr = WeightConstant.L;
        }
        HMLog.d(a, "皮下脂肪区间： " + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8 A[RETURN] */
    public static ScoreParamsObject getSubcutaneousFatObject(Context context, int i, int i2, int i3, float f) {
        String string;
        int i4 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , subcutaneousFat = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.health_data_subcutaneous_fat));
        int i5 = 1;
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        scoreParamsObject.setUnitValue("%");
        BodySubcutaneousFatFigure bodySubcutaneousFatFigureV = v(f, i, i2);
        scoreParamsObject.setLevel(F(context, bodySubcutaneousFatFigureV));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(10);
        scoreParamsObject.setWfValue(f);
        int i6 = a.b[bodySubcutaneousFatFigureV.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        string = context.getResources().getString(R.string.subcutaneous_fat_will_low_standard);
                    } else if (i6 != 5) {
                        string = "";
                        i4 = -1;
                        i5 = -1;
                    } else {
                        string = context.getResources().getString(R.string.subcutaneous_fat_will_high_standard);
                    }
                    i4 = 2;
                } else {
                    string = context.getResources().getString(R.string.subcutaneous_fat_standard_info);
                }
                i5 = 4;
            } else {
                string = context.getResources().getString(R.string.subcutaneous_fat_high_info);
            }
            scoreParamsObject.setColorState(i5);
            if (!"".equals(string)) {
                return null;
            }
            scoreParamsObject.setType(i4);
            scoreParamsObject.setHintInfo(string);
            return scoreParamsObject;
        }
        string = context.getResources().getString(R.string.subcutaneous_fat_low_info);
        i4 = 1;
        scoreParamsObject.setColorState(i5);
        if (!"".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i4);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static ScoreParamsObject getVisFatObject(Context context, int i, int i2, int i3, float f) {
        if (G(i, i2)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.visceral_value));
        StringBuilder sb = new StringBuilder();
        int i4 = (int) f;
        sb.append(i4);
        sb.append("");
        scoreParamsObject.setParamsValue(sb.toString());
        VisceralFatFigure visceralFatFigureCalVisceralFatType = calVisceralFatType(f, i);
        int i5 = 0;
        HMLog.d(a, "内脏脂肪类型 ： " + visceralFatFigureCalVisceralFatType, new Object[0]);
        scoreParamsObject.setLevel(getVisceralFatLevalStr(context, visceralFatFigureCalVisceralFatType));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i3);
        scoreParamsObject.setHeight(i2);
        int i6 = 4;
        scoreParamsObject.setWfType(4);
        scoreParamsObject.setWfValue(f);
        String string = context.getResources().getString(R.string.visceral_fat_activity_text);
        VisceralFatFigure visceralFatFigure = VisceralFatFigure.Slightly_Higher;
        if (visceralFatFigureCalVisceralFatType.equals(visceralFatFigure) || visceralFatFigureCalVisceralFatType.equals(VisceralFatFigure.High)) {
            if (visceralFatFigureCalVisceralFatType.equals(VisceralFatFigure.High)) {
                i6 = 2;
            } else if (visceralFatFigureCalVisceralFatType.equals(visceralFatFigure)) {
                i6 = 1;
            }
            string = context.getResources().getString(R.string.visceral_high_infomation);
            i5 = 1;
        } else if (visceralFatFigureCalVisceralFatType.equals(VisceralFatFigure.Normal)) {
            HMLog.d(a, "(int)visceralFatValue = " + i4, new Object[0]);
            if (i4 == 8 || i4 == 9) {
                string = context.getResources().getString(R.string.visceral_need_attention_infomation);
                i5 = 2;
            }
        }
        scoreParamsObject.setColorState(i6);
        if (i5 == -1 || "".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i5);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static String getVisceralFatLevalStr(Context context, VisceralFatFigure visceralFatFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.visceral_fat_leval);
        HashMap map = new HashMap(3);
        map.put(VisceralFatFigure.Normal, stringArray[0]);
        map.put(VisceralFatFigure.Slightly_Higher, stringArray[1]);
        map.put(VisceralFatFigure.High, stringArray[2]);
        String str = (String) map.get(visceralFatFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static float[] getWaterAllSection(int i, int i2) {
        float[] fArr = new float[2];
        if (!s(i)) {
            return null;
        }
        if (i2 == 1) {
            fArr = WeightConstant.K;
        } else if (i2 == 0) {
            fArr = WeightConstant.J;
        }
        HMLog.d(a, "水分区间： " + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    public static String getWaterLevelStr(Context context, BodyWaterFigure bodyWaterFigure) {
        String[] stringArray = context.getResources().getStringArray(R.array.water_leval);
        HashMap map = new HashMap();
        map.put(BodyWaterFigure.Slightly_Lower, stringArray[0]);
        map.put(BodyWaterFigure.Normal, stringArray[1]);
        map.put(BodyWaterFigure.Slightly_High, stringArray[2]);
        String str = (String) map.get(bodyWaterFigure);
        HMLog.d(a, "figure = " + str, new Object[0]);
        return (str == null || "".equals(str)) ? "--" : str;
    }

    public static ScoreParamsObject getWaterScoreObject(Context context, int i, int i2, int i3, float f) {
        int i4;
        String string;
        int i5 = 0;
        HMLog.d(a, "age = " + i + " , sex = " + i2 + " , height = " + i3 + " , waterValue = " + f, new Object[0]);
        if (G(i, i3)) {
            return null;
        }
        ScoreParamsObject scoreParamsObject = new ScoreParamsObject();
        scoreParamsObject.setParamsName(context.getResources().getString(R.string.water));
        scoreParamsObject.setParamsValue(String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)));
        scoreParamsObject.setUnitValue("%");
        BodyWaterFigure bodyWaterFigureCalWatereFigure = calWatereFigure(f, i, i2);
        scoreParamsObject.setLevel(getWaterLevelStr(context, bodyWaterFigureCalWatereFigure));
        scoreParamsObject.setAge(i);
        scoreParamsObject.setSex(i2);
        scoreParamsObject.setHeight(i3);
        scoreParamsObject.setWfType(5);
        scoreParamsObject.setWfValue(f);
        if (bodyWaterFigureCalWatereFigure.equals(BodyWaterFigure.Slightly_Lower)) {
            i4 = 2;
            string = context.getResources().getString(R.string.water_need_attention_infomation);
            i5 = 1;
        } else {
            i4 = 4;
            string = context.getResources().getString(R.string.water_activity_text);
        }
        scoreParamsObject.setColorState(i4);
        if ("".equals(string)) {
            return null;
        }
        scoreParamsObject.setType(i5);
        scoreParamsObject.setHintInfo(string);
        return scoreParamsObject;
    }

    public static int getWeightAge(long j, String str) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendarW = w(str);
        if (calendarW != null && (i = calendar.get(1) - calendarW.get(1)) >= 0) {
            return (i != 0 && calendar.get(2) <= calendarW.get(2)) ? i - 1 : i;
        }
        return 24;
    }

    private static boolean s(int i) {
        return i >= 6 && i <= 99;
    }

    private static float t(float f, float f2) {
        return HMWeightUtils.scaleFloatToDown(f * f2, 1);
    }

    private static BodySkeletalMuscleFigure u(float f, int i, int i2) {
        BodySkeletalMuscleFigure bodySkeletalMuscleFigure;
        BodySkeletalMuscleFigure bodySkeletalMuscleFigure2 = BodySkeletalMuscleFigure.Unknown;
        float[] skeletalMuscleAllSection = getSkeletalMuscleAllSection(i, i2);
        if (skeletalMuscleAllSection == null) {
            return bodySkeletalMuscleFigure2;
        }
        if (f < skeletalMuscleAllSection[0]) {
            bodySkeletalMuscleFigure = BodySkeletalMuscleFigure.Low;
        } else if (f > skeletalMuscleAllSection[1]) {
            bodySkeletalMuscleFigure = BodySkeletalMuscleFigure.High;
        } else {
            bodySkeletalMuscleFigure = (f < skeletalMuscleAllSection[0] || f > skeletalMuscleAllSection[0] + 0.1f) ? BodySkeletalMuscleFigure.Normal : BodySkeletalMuscleFigure.Slightly_Lower;
        }
        HMLog.d(a, "骨骼肌类型 ： " + bodySkeletalMuscleFigure, new Object[0]);
        return bodySkeletalMuscleFigure;
    }

    private static BodySubcutaneousFatFigure v(float f, int i, int i2) {
        BodySubcutaneousFatFigure bodySubcutaneousFatFigure;
        BodySubcutaneousFatFigure bodySubcutaneousFatFigure2 = BodySubcutaneousFatFigure.Unknown;
        float[] subcutaneousFatAllSection = getSubcutaneousFatAllSection(i, i2);
        if (subcutaneousFatAllSection == null) {
            return bodySubcutaneousFatFigure2;
        }
        if (f < subcutaneousFatAllSection[0]) {
            bodySubcutaneousFatFigure = BodySubcutaneousFatFigure.Low;
        } else if (f > subcutaneousFatAllSection[1]) {
            bodySubcutaneousFatFigure = BodySubcutaneousFatFigure.High;
        } else if (f < subcutaneousFatAllSection[0] || f > subcutaneousFatAllSection[0] + 0.1f) {
            bodySubcutaneousFatFigure = (f > subcutaneousFatAllSection[1] || f < subcutaneousFatAllSection[1] - 0.1f) ? BodySubcutaneousFatFigure.Normal : BodySubcutaneousFatFigure.Slightly_High;
        } else {
            bodySubcutaneousFatFigure = BodySubcutaneousFatFigure.Slightly_Lower;
        }
        HMLog.d(a, "皮下脂肪类型 ： " + bodySubcutaneousFatFigure, new Object[0]);
        return bodySubcutaneousFatFigure;
    }

    private static Calendar w(String str) {
        try {
            Date date = new SimpleDateFormat("yy-MM", Locale.getDefault()).parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException unused) {
            HMLog.d(a, "dateFormat ParseException", new Object[0]);
            return null;
        } catch (Exception unused2) {
            HMLog.d(a, "dateFormat Exception", new Object[0]);
            return null;
        }
    }

    private static boolean x(Object obj, Object obj2) {
        return (obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) < 0.1d;
    }

    private static float[] y(int i, int i2) {
        float[] fArr = new float[2];
        if (Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage())) {
            if (i < 7 || i >= 18) {
                if (i >= 18) {
                    fArr[0] = 24.0f;
                    fArr[1] = 28.0f;
                }
            } else if (i2 == 1) {
                int i3 = i - 7;
                fArr[0] = HMWeightUtils.male_overweight[i3];
                fArr[1] = HMWeightUtils.male_fat[i3];
            } else if (i2 == 0) {
                int i4 = i - 7;
                fArr[0] = HMWeightUtils.female_overweight[i4];
                fArr[1] = HMWeightUtils.female_fat[i4];
            }
        } else if (i >= 18) {
            fArr[0] = 25.0f;
            fArr[1] = 30.0f;
        }
        return fArr;
    }

    private static float[] z(int i, int i2, int i3) {
        float[] bodyFatAllSection;
        float[] fArr = new float[2];
        if (!s(i) || (bodyFatAllSection = getBodyFatAllSection(i, i2)) == null) {
            return fArr;
        }
        if (i3 == 1) {
            fArr[0] = bodyFatAllSection[2];
            fArr[1] = bodyFatAllSection[3];
        } else if (i3 == 2) {
            fArr[1] = bodyFatAllSection[2];
            if (i2 == 1) {
                fArr[0] = bodyFatAllSection[2] - 2.0f;
            } else {
                fArr[0] = bodyFatAllSection[2] - 3.0f;
            }
        } else if (i3 == 3) {
            fArr[0] = 1.0f;
            fArr[1] = bodyFatAllSection[0];
        }
        HMLog.d(a, "bodySectionType = " + i3 + " , sections = " + fArr[0] + " - " + fArr[1], new Object[0]);
        return fArr;
    }

    public static WeightInfos addBodyParams(WeightInfos weightInfos, WeightAdvData weightAdvData, long j) {
        UserInfos info = UserInfoManager.getManager().getInfo(j);
        weightInfos.setTimestamp(Long.valueOf(weightAdvData.getTimestamp()));
        weightInfos.setWeight(Float.valueOf(weightAdvData.getValueKg()));
        weightInfos.setImpedance(Integer.valueOf(weightAdvData.getImpedance()));
        weightInfos.setEncryptImpedance(Integer.valueOf(weightAdvData.getImpedance()));
        addBodyParams(weightInfos, info);
        return weightInfos;
    }

    public static List<List<ScoreParamsObject>> getScoreShowInfos(Context context, UserInfos userInfos, long j) {
        return getScoreShowInfos(context, userInfos, WeightInfoRepository.INSTANCE.getInstance().getWeightInfoByTimestamp(j, false));
    }
}

package com.xiaomi.hm.health.bodyfat.utils;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.bodyIndex.BodyIndexAnalysisImpl;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J!\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J.\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ&\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u001e\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ&\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ\u001e\u0010*\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\bJ\u000e\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bJ\u0016\u0010.\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\bJ\u001e\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u00101\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u00100\u001a\u00020\b¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/BodyParamsScoreHelper;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfo", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfo", "", "age", "", "a", "sex", "", "f", "e", "(I)Ljava/lang/Float;", "g", "height", "i", GoogleApiAvailabilityLight.a, "(II)Ljava/lang/Integer;", "weight", "h", "Ljava/math/BigDecimal;", "value", "b", "", "c", "currentValue", "boundaryValue", "startValue", "maxScore", "minScore", "calculateReduceScore", "currentBmiValue", "currentBodyFatValue", "calculateBmiReduceScore", "calculateBodyFatReduceScore", "currentVisceralFatValue", "calculateVisceralFatReduceScore", "currentSubcutaneousFatValue", "calculateSubcutaneousFatReduceScore", "currentMuscleValue", "calculateMuscleReduceScore", "currentSkeletalMuscleValue", "calculateSkeletalMuscleReduceScore", "currentWaterValue", "calculateWaterReduceScore", "calculateBasicMetabolismReduceScore", "currentBoneMassValue", "calculateBoneMassReduceScore", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyParamsScoreHelper {

    @NotNull
    public static final BodyParamsScoreHelper INSTANCE = new BodyParamsScoreHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("算法计算基础代谢率标准：", Float.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("最后得到的基础代谢率标准：", Float.valueOf(this.a));
        }
    }

    private BodyParamsScoreHelper() {
    }

    private final float a(WeightInfos weightInfo, UserInfos userInfo, int age) {
        if (weightInfo.getSource() == null) {
            return -1.0f;
        }
        BodyIndexAnalysisImpl bodyIndexAnalysisImpl = new BodyIndexAnalysisImpl();
        UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(userInfo.getUserId());
        Integer numValueOf = userScaleInfoById == null ? null : Integer.valueOf(userScaleInfoById.getMeasureMode());
        return bodyIndexAnalysisImpl.analysisBmrStandardValue(weightInfo.getSource().intValue(), weightInfo.getWeight().floatValue(), userInfo.getHeight().intValue(), userInfo.getGender().intValue(), age, weightInfo.getEncryptImpedance().intValue(), numValueOf == null ? userInfo.getMeasureMode() : numValueOf.intValue());
    }

    private final float b(BigDecimal value) {
        DecimalFormat decimalFormat = new DecimalFormat("#######.##");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return Float.parseFloat(decimalFormat.format(value));
    }

    private final boolean c() {
        return Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
    }

    private final Integer d(int age, int sex) {
        boolean z = false;
        if (age >= 0 && age <= 12) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(12) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(12);
        }
        if (13 <= age && age <= 15) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(15) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(15);
        }
        if (16 <= age && age <= 17) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(17) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(17);
        }
        if (18 <= age && age <= 29) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(29) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(29);
        }
        if (30 <= age && age <= 49) {
            z = true;
        }
        if (z) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(49) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(49);
        }
        return sex == 1 ? BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_MALE_STANDARD().get(50) : BodyParamsStandardData.INSTANCE.getBASIC_METABOLISM_FEMALE_STANDARD().get(50);
    }

    private final Float e(int age) {
        if (c()) {
            if (age >= 0 && age <= 6) {
                return null;
            }
            return 18 <= age && age <= Integer.MAX_VALUE ? Float.valueOf(BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_ZH()[0] + 0.1f) : Float.valueOf(2.0f);
        }
        if (18 <= age && age <= Integer.MAX_VALUE) {
            return Float.valueOf(BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_OVERSEA()[0] + 0.1f);
        }
        return null;
    }

    private final float[] f(int age, int sex) {
        if (!c()) {
            if (!(18 <= age && age <= Integer.MAX_VALUE)) {
                return null;
            }
            float[] bmi_standard_adult_oversea = BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_OVERSEA();
            return new float[]{bmi_standard_adult_oversea[1], bmi_standard_adult_oversea[2]};
        }
        if (age >= 0 && age <= 6) {
            return null;
        }
        if (!(18 <= age && age <= Integer.MAX_VALUE)) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getBMI_STANDARD_CHILD_MALE_ZH().get(Integer.valueOf(age)) : BodyParamsStandardData.INSTANCE.getBMI_STANDARD_CHILD_FEMALE_ZH().get(Integer.valueOf(age));
        }
        float[] bmi_standard_adult_zh = BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_ZH();
        return new float[]{bmi_standard_adult_zh[1], bmi_standard_adult_zh[2]};
    }

    private final float[] g(int age, int sex) {
        if (sex != 1) {
            if (18 <= age && age <= 39) {
                age = 39;
            } else {
                if (40 <= age && age <= 59) {
                    age = 59;
                } else {
                    if (60 <= age && age <= 99) {
                        age = 99;
                    }
                }
            }
            return BodyParamsStandardData.INSTANCE.getBODY_FAT_STANDARD_FEMALE().get(Integer.valueOf(age));
        }
        if (6 <= age && age <= 13) {
            age = 13;
        } else {
            if (18 <= age && age <= 39) {
                age = 39;
            } else {
                if (40 <= age && age <= 59) {
                    age = 59;
                } else {
                    if (60 <= age && age <= 99) {
                        age = 99;
                    }
                }
            }
        }
        return BodyParamsStandardData.INSTANCE.getBODY_FAT_STANDARD_MALE().get(Integer.valueOf(age));
    }

    private final float[] h(int sex, float weight) {
        if (sex == 1) {
            if (0.0f <= weight && weight <= 60.0f) {
                return BodyParamsStandardData.INSTANCE.getBONE_MASS_MALE_60_STANDARD();
            }
            return 60.1f <= weight && weight <= 74.9f ? BodyParamsStandardData.INSTANCE.getBONE_MASS_MALE_74_9_STANDARD() : BodyParamsStandardData.INSTANCE.getBONE_MASS_MALE_75_STANDARD();
        }
        if (0.0f <= weight && weight <= 45.0f) {
            return BodyParamsStandardData.INSTANCE.getBONE_MASS_FEMALE_45_STANDARD();
        }
        return 45.1f <= weight && weight <= 60.0f ? BodyParamsStandardData.INSTANCE.getBONE_MASS_FEMALE_60_STANDARD() : BodyParamsStandardData.INSTANCE.getBONE_MASS_FEMALE_60_1_STANDARD();
    }

    private final float[] i(int sex, int height) {
        boolean z = false;
        if (height >= 0 && height <= 159) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getMUSCLE_MALE_159() : BodyParamsStandardData.INSTANCE.getMUSCLE_FEMALE_159();
        }
        if (160 <= height && height <= 169) {
            z = true;
        }
        if (z) {
            return sex == 1 ? BodyParamsStandardData.INSTANCE.getMUSCLE_MALE_160_169() : BodyParamsStandardData.INSTANCE.getMUSCLE_FEMALE_160_169();
        }
        return sex == 1 ? BodyParamsStandardData.INSTANCE.getMUSCLE_MALE_170() : BodyParamsStandardData.INSTANCE.getMUSCLE_FEMALE_170();
    }

    public final float calculateBasicMetabolismReduceScore(@NotNull WeightInfos weightInfo, @NotNull UserInfos userInfo, int age) {
        Integer numD = d(age, userInfo.getGender().intValue());
        int iIntValue = numD == null ? 0 : numD.intValue();
        Integer basal_metabolism = weightInfo.getBasal_metabolism();
        float fA = a(weightInfo, userInfo, age);
        HMLog.warn$default(null, null, new a(fA), 3, null);
        if (fA <= 0.0f) {
            fA = iIntValue * weightInfo.getWeight().floatValue();
        }
        HMLog.warn$default(null, null, new b(fA), 3, null);
        if ((basal_metabolism == null ? null : Float.valueOf(basal_metabolism.intValue())).floatValue() >= fA) {
            return 0.0f;
        }
        if ((basal_metabolism != null ? Float.valueOf(basal_metabolism.intValue()) : null).floatValue() <= b(new BigDecimal(String.valueOf(fA)).subtract(new BigDecimal(String.valueOf(300.0f))))) {
            return 5.0f;
        }
        return calculateReduceScore(basal_metabolism.intValue(), b(new BigDecimal(String.valueOf(fA)).subtract(new BigDecimal(String.valueOf(300.0f)))), b(new BigDecimal(String.valueOf(fA)).subtract(new BigDecimal(String.valueOf(1.0f)))), 5.0f, 1.0f);
    }

    public final float calculateBmiReduceScore(int age, int sex, float currentBmiValue, float currentBodyFatValue) {
        float[] fArrF = f(age, sex);
        float[] fArrG = g(age, sex);
        if (fArrF != null && currentBmiValue > fArrF[0] && fArrG != null && currentBodyFatValue > fArrG[2]) {
            if (currentBmiValue > fArrF[1]) {
                return 10.0f;
            }
            return calculateReduceScore(currentBmiValue, b(new BigDecimal(String.valueOf(fArrF[1])).add(new BigDecimal(String.valueOf(0.1f)))), b(new BigDecimal(String.valueOf(fArrF[0])).add(new BigDecimal(String.valueOf(0.1f)))), 10.0f, 5.0f);
        }
        if (age < 18) {
            return 0.0f;
        }
        float fB = b(new BigDecimal(String.valueOf((c() ? BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_ZH() : BodyParamsStandardData.INSTANCE.getBMI_STANDARD_ADULT_OVERSEA())[0])).add(new BigDecimal(String.valueOf(0.1f))));
        if (currentBmiValue >= 15.0f && currentBmiValue < fB) {
            if (currentBmiValue == 15.0f) {
                return 9.0f;
            }
            return calculateReduceScore(currentBmiValue, 15.0f, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(0.1f)))), 9.0f, 3.0f);
        }
        if (currentBmiValue >= 15.0f) {
            return 0.0f;
        }
        if (currentBmiValue <= 14.0f) {
            return 30.0f;
        }
        return calculateReduceScore(currentBmiValue, 14.0f, b(new BigDecimal(String.valueOf(15.0f)).subtract(new BigDecimal(String.valueOf(0.1f)))), 30.0f, 15.0f);
    }

    public final float calculateBodyFatReduceScore(int age, int sex, float currentBodyFatValue) {
        float[] fArrG = g(age, sex);
        if (fArrG != null && currentBodyFatValue > fArrG[2]) {
            if (currentBodyFatValue > fArrG[3]) {
                return 20.0f;
            }
            return calculateReduceScore(currentBodyFatValue, b(new BigDecimal(String.valueOf(fArrG[3])).add(new BigDecimal(String.valueOf(0.1f)))), b(new BigDecimal(String.valueOf(fArrG[2])).add(new BigDecimal(String.valueOf(0.1f)))), 20.0f, 10.0f);
        }
        if (fArrG != null && currentBodyFatValue > b(new BigDecimal(String.valueOf(fArrG[2])).subtract(new BigDecimal(String.valueOf(0.9f)))) && currentBodyFatValue <= fArrG[2]) {
            if (currentBodyFatValue == fArrG[2]) {
                return 9.0f;
            }
            return calculateReduceScore(currentBodyFatValue, fArrG[2], b(new BigDecimal(String.valueOf(fArrG[2])).subtract(new BigDecimal(String.valueOf(0.9f))).add(new BigDecimal(String.valueOf(0.1f)))), 9.0f, 3.0f);
        }
        if (fArrG == null || currentBodyFatValue >= b(new BigDecimal(String.valueOf(fArrG[0])).add(new BigDecimal(String.valueOf(0.1f))))) {
            return 0.0f;
        }
        float f = fArrG[0] + 0.1f;
        if (currentBodyFatValue <= b(new BigDecimal(String.valueOf(f)).subtract(new BigDecimal(String.valueOf(6.0f))))) {
            return 9.0f;
        }
        return calculateReduceScore(currentBodyFatValue, b(new BigDecimal(String.valueOf(f)).subtract(new BigDecimal(String.valueOf(6.0f)))), fArrG[0], 9.0f, 3.0f);
    }

    public final float calculateBoneMassReduceScore(int sex, float weight, float currentBoneMassValue) {
        float[] fArrH = h(sex, weight);
        float fB = b(new BigDecimal(String.valueOf(fArrH[0])).add(new BigDecimal(String.valueOf(0.1f))));
        if (currentBoneMassValue >= fB) {
            return 0.0f;
        }
        if (currentBoneMassValue <= b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(0.3f))))) {
            return 5.0f;
        }
        return calculateReduceScore(currentBoneMassValue, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(0.3f)))), fArrH[0], 5.0f, 1.0f);
    }

    public final float calculateMuscleReduceScore(int sex, int height, float currentMuscleValue) {
        float[] fArrI = i(sex, height);
        float fB = b(new BigDecimal(String.valueOf(fArrI[0])).add(new BigDecimal(String.valueOf(0.1f))));
        if (currentMuscleValue < fB) {
            if (currentMuscleValue <= b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f))))) {
                return 15.0f;
            }
            return calculateReduceScore(currentMuscleValue, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f)))), fArrI[0], 15.0f, 10.0f);
        }
        if (currentMuscleValue < fB || currentMuscleValue >= fB + 0.9f) {
            return 0.0f;
        }
        if (currentMuscleValue == fB) {
            return 9.0f;
        }
        return calculateReduceScore(currentMuscleValue, fB, fArrI[0] + 0.9f, 9.0f, 3.0f);
    }

    public final float calculateReduceScore(float currentValue, float boundaryValue, float startValue, float maxScore, float minScore) {
        float fB = b(new BigDecimal(String.valueOf(((Math.abs(boundaryValue - startValue) / Math.abs(maxScore - minScore)) * Math.abs(currentValue - startValue)) + minScore)));
        if (fB > maxScore) {
            return maxScore;
        }
        return fB < minScore ? minScore : fB;
    }

    public final float calculateSkeletalMuscleReduceScore(float currentSkeletalMuscleValue) {
        float[] skeletal_muscle_standard = BodyParamsStandardData.INSTANCE.getSKELETAL_MUSCLE_STANDARD();
        float fB = b(new BigDecimal(String.valueOf(skeletal_muscle_standard[0])).add(new BigDecimal(String.valueOf(0.1f))));
        if (currentSkeletalMuscleValue < fB) {
            if (currentSkeletalMuscleValue <= b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f))))) {
                return 3.0f;
            }
            return calculateReduceScore(currentSkeletalMuscleValue, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f)))), skeletal_muscle_standard[0], 3.0f, 2.0f);
        }
        if (currentSkeletalMuscleValue < fB || currentSkeletalMuscleValue >= b(new BigDecimal(String.valueOf(fB)).add(new BigDecimal(String.valueOf(0.9f))))) {
            return 0.0f;
        }
        if (currentSkeletalMuscleValue == fB) {
            return 2.0f;
        }
        return calculateReduceScore(currentSkeletalMuscleValue, fB, b(new BigDecimal(String.valueOf(skeletal_muscle_standard[0])).add(new BigDecimal(String.valueOf(0.9f)))), 2.0f, 1.0f);
    }

    public final float calculateSubcutaneousFatReduceScore(int age, int sex, float currentSubcutaneousFatValue, float currentBmiValue) {
        float[] subcutaneous_fat_male_standard = sex == 1 ? BodyParamsStandardData.INSTANCE.getSUBCUTANEOUS_FAT_MALE_STANDARD() : BodyParamsStandardData.INSTANCE.getSUBCUTANEOUS_FAT_FEMALE_STANDARD();
        float fB = b(new BigDecimal(String.valueOf(subcutaneous_fat_male_standard[0])).add(new BigDecimal(String.valueOf(0.1f))));
        float f = subcutaneous_fat_male_standard[1] + 0.1f;
        Float fE = e(age);
        if (currentSubcutaneousFatValue > subcutaneous_fat_male_standard[1]) {
            if (currentSubcutaneousFatValue >= b(new BigDecimal(String.valueOf(f)).add(new BigDecimal(String.valueOf(6.0f))))) {
                return 3.0f;
            }
            return calculateReduceScore(currentSubcutaneousFatValue, b(new BigDecimal(String.valueOf(f)).add(new BigDecimal(String.valueOf(6.0f))).add(new BigDecimal(String.valueOf(0.1f)))), f, 3.0f, 2.0f);
        }
        if (currentSubcutaneousFatValue >= fB || fE == null || currentBmiValue >= fE.floatValue()) {
            return 0.0f;
        }
        if (currentSubcutaneousFatValue <= b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(6.0f))))) {
            return 2.0f;
        }
        return calculateReduceScore(currentSubcutaneousFatValue, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(6.0f)))), subcutaneous_fat_male_standard[0], 2.0f, 1.0f);
    }

    public final float calculateVisceralFatReduceScore(float currentVisceralFatValue) {
        BodyParamsStandardData bodyParamsStandardData = BodyParamsStandardData.INSTANCE;
        if (currentVisceralFatValue > bodyParamsStandardData.getVISCERAL_FAT_STANDARD()[0]) {
            if (currentVisceralFatValue > bodyParamsStandardData.getVISCERAL_FAT_STANDARD()[1]) {
                return 15.0f;
            }
            return calculateReduceScore(currentVisceralFatValue, b(new BigDecimal(String.valueOf(bodyParamsStandardData.getVISCERAL_FAT_STANDARD()[1])).add(new BigDecimal(String.valueOf(1.0f)))), b(new BigDecimal(String.valueOf(bodyParamsStandardData.getVISCERAL_FAT_STANDARD()[0])).add(new BigDecimal(String.valueOf(1.0f)))), 15.0f, 10.0f);
        }
        if (currentVisceralFatValue < 8.0f || currentVisceralFatValue > 9.0f) {
            return 0.0f;
        }
        if (currentVisceralFatValue == 9.0f) {
            return 5.0f;
        }
        return calculateReduceScore(currentVisceralFatValue, 9.0f, 8.0f, 5.0f, 3.0f);
    }

    public final float calculateWaterReduceScore(int sex, float currentWaterValue) {
        float[] water_male_standard = sex == 1 ? BodyParamsStandardData.INSTANCE.getWATER_MALE_STANDARD() : BodyParamsStandardData.INSTANCE.getWATER_FEMALE_STANDARD();
        float fB = b(new BigDecimal(String.valueOf(water_male_standard[0])).add(new BigDecimal(String.valueOf(0.1f))));
        if (currentWaterValue >= fB) {
            return 0.0f;
        }
        if (currentWaterValue <= b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f))))) {
            return 5.0f;
        }
        return calculateReduceScore(currentWaterValue, b(new BigDecimal(String.valueOf(fB)).subtract(new BigDecimal(String.valueOf(5.0f)))), water_male_standard[0], 5.0f, 1.0f);
    }
}

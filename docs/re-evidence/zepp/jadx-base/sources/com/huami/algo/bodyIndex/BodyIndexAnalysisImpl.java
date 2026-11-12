package com.huami.algo.bodyIndex;

import com.besthealth.htbodyfatbia4twolegs.BhBodyComposition;
import com.chipsea.healthscale.CsAlgoBuilderEx;
import com.holtek.libHTBodyfat.HTDataType;
import com.holtek.libHTBodyfat.HTPeopleGeneral;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016JD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016JL\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016J@\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016JH\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016JB\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002J:\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/huami/algo/bodyIndex/BodyIndexAnalysisImpl;", "Lcom/huami/algo/bodyIndex/BodyIndexAnalysis;", "", "height", "gender", "age", "", "weightInKg", "idealWeight", "weightKg", "sex", ParamKey.impedance, "peopleType", "", "Lcom/huami/algo/bodyIndex/BodyIndexType;", "", "analysis", "source", "analysisBmrStandardValue", "loseWeightInKg", "currentWeightInKg", "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "sportType", "loseWeightPlan", "analysisBodyIndex", "<init>", "()V", "Companion", "body-index_release"}, k = 1, mv = {1, 5, 1})
public final class BodyIndexAnalysisImpl implements BodyIndexAnalysis {
    private static final int a = 101;
    private static final int b = 102;
    private static final int c = 104;

    @Override // com.huami.algo.bodyIndex.BodyIndexAnalysis
    @NotNull
    public Map<BodyIndexType, Object> analysis(float weightKg, float height, int sex, int age, float impedance, int peopleType) {
        return peopleType < 0 ? analysisBodyIndex(weightKg, height, sex, age, (int) impedance) : analysisBodyIndex(weightKg, height, sex, age, impedance, peopleType);
    }

    @Override // com.huami.algo.bodyIndex.BodyIndexAnalysis
    public float analysisBmrStandardValue(int source, float weightKg, float height, int sex, int age, float impedance, int peopleType) {
        Hashtable<String, String> hashtable;
        String str;
        Float floatOrNull;
        if (source != 101 && source != 102) {
            if (source != 104) {
                return -1.0f;
            }
            new LinkedHashMap();
            BhBodyComposition bhBodyComposition = new BhBodyComposition();
            if (bhBodyComposition.bhGetBodyFat(weightKg, height, age, sex, impedance, peopleType) == 0) {
                return bhBodyComposition.bhBMRListUnderOrStandard;
            }
            return -1.0f;
        }
        new LinkedHashMap();
        HTPeopleGeneral hTPeopleGeneral = new HTPeopleGeneral(weightKg, height, sex, age, (int) impedance);
        if (hTPeopleGeneral.getBodyfatParameters() != 0 || (hashtable = hTPeopleGeneral.BMRRatingList) == null || hashtable.size() <= 0 || (str = hTPeopleGeneral.BMRRatingList.get(HTDataType.Standard1LevelA)) == null || (floatOrNull = k.toFloatOrNull(str)) == null) {
            return -1.0f;
        }
        return floatOrNull.floatValue();
    }

    @NotNull
    public final synchronized Map<BodyIndexType, Object> analysisBodyIndex(float weightKg, float height, int sex, int age, float impedance, int peopleType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BhBodyComposition bhBodyComposition = new BhBodyComposition();
        if (bhBodyComposition.bhGetBodyFat(weightKg, height, age, sex, impedance, peopleType) != 0) {
            return linkedHashMap;
        }
        linkedHashMap.put(BodyIndexType.IMPEDANCE, Float.valueOf(bhBodyComposition.bhZTwoLegs));
        linkedHashMap.put(BodyIndexType.BMI, Float.valueOf(bhBodyComposition.bhBMI));
        BodyIndexType bodyIndexType = BodyIndexType.BODY_FAT;
        linkedHashMap.put(bodyIndexType, Float.valueOf(bhBodyComposition.bhBodyFatKg));
        linkedHashMap.put(BodyIndexType.BODY_SHAPE_TYPE, Integer.valueOf(bhBodyComposition.bhBodyType));
        linkedHashMap.put(BodyIndexType.VISCERAL_FAT, Integer.valueOf(bhBodyComposition.bhVFAL));
        linkedHashMap.put(bodyIndexType, Float.valueOf(bhBodyComposition.bhBodyFatRate));
        linkedHashMap.put(BodyIndexType.MUSCLE, Float.valueOf(bhBodyComposition.bhMuscleKg));
        linkedHashMap.put(BodyIndexType.BONE_MASS, Float.valueOf(bhBodyComposition.bhBoneKg));
        linkedHashMap.put(BodyIndexType.MOISTURE, Float.valueOf(bhBodyComposition.bhWaterRate));
        linkedHashMap.put(BodyIndexType.BASAL_METABOLISM, Integer.valueOf(bhBodyComposition.bhBMR));
        linkedHashMap.put(BodyIndexType.SKELETAL_MUSCLE, Float.valueOf(bhBodyComposition.bhSkeletalMuscleKg));
        linkedHashMap.put(BodyIndexType.SUBCUTANEOUS_FAT, Float.valueOf(bhBodyComposition.bhBodyFatSubCutRate));
        linkedHashMap.put(BodyIndexType.MA, Integer.valueOf(bhBodyComposition.bhBodyAge));
        linkedHashMap.put(BodyIndexType.PMR, Float.valueOf(bhBodyComposition.bhProteinRate));
        linkedHashMap.put(BodyIndexType.SBW, Float.valueOf(bhBodyComposition.bhIdealWeightKg));
        return linkedHashMap;
    }

    @Override // com.huami.algo.bodyIndex.BodyIndexAnalysis
    public float idealWeight(int height, int gender, int age, float weightInKg) {
        CsAlgoBuilderEx csAlgoBuilderEx = new CsAlgoBuilderEx();
        csAlgoBuilderEx.setBodyBaseInfo(height, (byte) gender, age, weightInKg, 0.0f);
        return csAlgoBuilderEx.getSBW();
    }

    @Override // com.huami.algo.bodyIndex.BodyIndexAnalysis
    public float loseWeightPlan(float loseWeightInKg, float currentWeightInKg, float height, int sex, int age, float impedance, int peopleType, @NotNull LoseWeightSportType sportType) throws Exception {
        BhBodyComposition bhBodyComposition = new BhBodyComposition();
        if (bhBodyComposition.bhGetBodyFat(currentWeightInKg, height, age, sex, impedance, peopleType) != 0) {
            return -1.0f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(LoseWeightSportType.WALKING, Integer.valueOf(bhBodyComposition.bhWalking));
        linkedHashMap.put(LoseWeightSportType.TABLE_TENNIS, Integer.valueOf(bhBodyComposition.bhTableTennis));
        linkedHashMap.put(LoseWeightSportType.SQUASH, Integer.valueOf(bhBodyComposition.bhSquash));
        linkedHashMap.put(LoseWeightSportType.RUNNING, Integer.valueOf(bhBodyComposition.bhJogging));
        linkedHashMap.put(LoseWeightSportType.TENNIS, Integer.valueOf(bhBodyComposition.bhTennis));
        linkedHashMap.put(LoseWeightSportType.TAE_KWON_DO, Integer.valueOf(bhBodyComposition.bhTaekwondo));
        linkedHashMap.put(LoseWeightSportType.BIKE, Integer.valueOf(bhBodyComposition.bhBicycle));
        linkedHashMap.put(LoseWeightSportType.FOOTBALL, Integer.valueOf(bhBodyComposition.bhFootball));
        linkedHashMap.put(LoseWeightSportType.BOUNCY_BALL, Integer.valueOf(bhBodyComposition.bhRacketBall));
        linkedHashMap.put(LoseWeightSportType.SWIM, Integer.valueOf(bhBodyComposition.bhSwim));
        linkedHashMap.put(LoseWeightSportType.FENCING, Integer.valueOf(bhBodyComposition.bhOrientalFencing));
        linkedHashMap.put(LoseWeightSportType.BASKETBALL, Integer.valueOf(bhBodyComposition.bhBasketball));
        linkedHashMap.put(LoseWeightSportType.HIKING, Integer.valueOf(bhBodyComposition.bhMountainClimbing));
        linkedHashMap.put(LoseWeightSportType.GATEBALL, Integer.valueOf(bhBodyComposition.bhGateBall));
        linkedHashMap.put(LoseWeightSportType.SKIPPING, Integer.valueOf(bhBodyComposition.bhRopeJumping));
        linkedHashMap.put(LoseWeightSportType.AEROBICS, Integer.valueOf(bhBodyComposition.bhAerobic));
        linkedHashMap.put(LoseWeightSportType.BADMINTON, Integer.valueOf(bhBodyComposition.bhBadminton));
        linkedHashMap.put(LoseWeightSportType.GOLF, Integer.valueOf(bhBodyComposition.bhGolf));
        Integer num = (Integer) linkedHashMap.get(sportType);
        if (num == null) {
            throw new Exception("无法识别的运动或者没有次运动的卡路里估算");
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            return (7700 * loseWeightInKg) / iIntValue;
        }
        throw new Exception(sportType + " 运动30分钟消耗卡路里为0，算法输出错误！！");
    }

    @Override // com.huami.algo.bodyIndex.BodyIndexAnalysis
    @NotNull
    public Map<BodyIndexType, Object> analysis(int source, float weightKg, float height, int sex, int age, float impedance, int peopleType) {
        if (source == 101 || source == 102) {
            return analysisBodyIndex(weightKg, height, sex, age, (int) impedance);
        }
        if (source != 104) {
            return r.emptyMap();
        }
        return analysisBodyIndex(weightKg, height, sex, age, impedance, peopleType);
    }

    @NotNull
    public final synchronized Map<BodyIndexType, Object> analysisBodyIndex(float weightKg, float height, int sex, int age, int impedance) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HTPeopleGeneral hTPeopleGeneral = new HTPeopleGeneral(weightKg, height, sex, age, impedance);
        if (hTPeopleGeneral.getBodyfatParameters() != 0) {
            return linkedHashMap;
        }
        linkedHashMap.put(BodyIndexType.BMI, Float.valueOf((float) hTPeopleGeneral.BMI));
        linkedHashMap.put(BodyIndexType.IMPEDANCE, Float.valueOf((float) hTPeopleGeneral.ZTwoLegs));
        linkedHashMap.put(BodyIndexType.VISCERAL_FAT, Integer.valueOf(hTPeopleGeneral.VFAL));
        linkedHashMap.put(BodyIndexType.BODY_FAT, Float.valueOf((float) hTPeopleGeneral.bodyfatPercentage));
        linkedHashMap.put(BodyIndexType.MUSCLE, Float.valueOf((float) hTPeopleGeneral.muscleKg));
        linkedHashMap.put(BodyIndexType.BONE_MASS, Float.valueOf((float) hTPeopleGeneral.boneKg));
        linkedHashMap.put(BodyIndexType.MOISTURE, Float.valueOf((float) hTPeopleGeneral.waterPercentage));
        linkedHashMap.put(BodyIndexType.BASAL_METABOLISM, Integer.valueOf(hTPeopleGeneral.BMR));
        CsAlgoBuilderEx csAlgoBuilderEx = new CsAlgoBuilderEx();
        csAlgoBuilderEx.setBodyBaseInfo((int) height, (byte) sex, age, weightKg, impedance);
        csAlgoBuilderEx.setBodyComposition((float) hTPeopleGeneral.bodyfatPercentage, (float) hTPeopleGeneral.muscleKg, (float) hTPeopleGeneral.boneKg, (float) hTPeopleGeneral.waterPercentage, hTPeopleGeneral.BMR, hTPeopleGeneral.VFAL);
        linkedHashMap.put(BodyIndexType.MA, Integer.valueOf(csAlgoBuilderEx.getMA()));
        linkedHashMap.put(BodyIndexType.PMR, Float.valueOf(csAlgoBuilderEx.getPMR()));
        linkedHashMap.put(BodyIndexType.SBW, Float.valueOf(csAlgoBuilderEx.getSBW()));
        return linkedHashMap;
    }
}

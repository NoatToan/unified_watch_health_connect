package com.xiaomi.hm.health.healthdata.utils;

import android.content.Context;
import com.google.android.gms.fitness.data.Field;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bodyfat.model.ScoreParamsObject;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.healthdata.ui.vo.BmiObject;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0017\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002\u001a\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002\u001a\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002\u001a\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002\u001a\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002\u001a\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0006\u0010\u001b\u001a\u00020\u001a\u001a\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002\u001a\u000e\u0010\u001f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002\u001a\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002\u001a\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002\u001a\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\u001a\u000e\u0010&\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002\u001a\u000e\u0010'\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002\u001a\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$\u001a.\u0010.\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010-\u001a\u00020\u0002H\u0002\u001a\u000e\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002\u001a\u0017\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b2\u00103\u001a\u000e\u00104\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002\u001a\u000e\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0002\u001a\u000e\u00106\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0002\"\u0016\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00108\"\u0016\u00109\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/model/account/HMUserInfo;", "b", "", "bodyFat", "", "getBodyFatIntro", "bmi", "getBMIIntro", "muscle", "getMuscleIntro", "water", "getWaterIntro", Field.NUTRIENT_PROTEIN, "getProteinIntro", "bone", "getBoneIntro", "", "bmr", "getBmrIntro", "visFat", "getVisFatIntro", "boneMuscle", "getSkeletalMuscleIntro", "value", "getSubcutaneousFatIntro", "getBodyFatBarProgress", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BmiObject;", "getBmiObject", "getBMIBarProgress", "muscleInKg", "getMuscleBarProgress", "getWaterBarProgress", "getProteinBarProgress", "boneInKg", "getBoneBarProgress", "getBmrBarProgress", "", "getBmrSections", "getVisFatBarProgress", "getSkeletalMuscleProgress", "getSuscutaneousFatProgress", "getVisFatSections", "min", "max", "barSections", "data", "a", "rawWeight", "weightToKg", "weightInKg", "weightFromKg", "(Ljava/lang/Float;)F", "getWeightText", "getWeightInKgText", "getWeightInKgText1Format", "TAG", "Ljava/lang/String;", "FULL_PERCENT", "F", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class BodyCompositionUtilsKt {
    public static final float FULL_PERCENT = 100.0f;

    @NotNull
    public static final String TAG = "HealthData-BodyCompositionUtils";

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
            return "barProgress:" + this.a;
        }
    }

    private static final float a(float f, float f2, List<Float> list, float f3) {
        if (f3 < f || f3 > f2) {
            return 0.0f;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(f));
        arrayList.addAll(list);
        arrayList.add(Float.valueOf(f2));
        float size = arrayList.size() - 1;
        float f4 = NumberFormatter.format(100.0f / size, 3, 4);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((Number) it2.next()).floatValue() <= f3) {
                i++;
            }
            arrayList2.add(Unit.INSTANCE);
        }
        if (i >= arrayList.size()) {
            return 1.0f;
        }
        float fFloatValue = ((Number) arrayList.get(i)).floatValue();
        int i2 = i - 1;
        float f5 = NumberFormatter.format(((i2 * f4) + ((NumberFormatter.format((f3 - ((Number) arrayList.get(i2)).floatValue()) / (fFloatValue - ((Number) arrayList.get(i2)).floatValue()), 3, 5) * 100.0f) / size)) / 100.0f, 3, 5);
        HMLog.debug(TAG, new a(f5));
        return f5;
    }

    private static final HMUserInfo b() {
        return HMPersonInfo.getInstance().getUserInfo();
    }

    public static final float getBMIBarProgress(float f) {
        int height = b().getHeight();
        return a(HMWeightUtils.calcuBMI(height, 3.0f), HMWeightUtils.calcuBMI(height, 120.0f), getBmiObject().getSectionValues(), f);
    }

    @NotNull
    public static final String getBMIIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.bmi_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject bmiScoreObject = BodyParamsUtils.getBmiScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f, 0.0f);
        return (bmiScoreObject == null || (hintInfo = bmiScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    @NotNull
    public static final BmiObject getBmiObject() {
        Context context = BraceletApp.getContext();
        BmiObject bmiObject = new BmiObject(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        HMUserInfo hMUserInfoB = b();
        boolean zAreEqual = Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage());
        if (zAreEqual && hMUserInfoB.getAge() >= 7 && hMUserInfoB.getAge() < 18) {
            bmiObject.setSectionValues(ArraysKt___ArraysKt.toList(HMWeightUtils.getChildBmiSection(hMUserInfoB.getAge(), hMUserInfoB.getGender())));
            bmiObject.setLevelHints(ArraysKt___ArraysKt.toList(BodyParamsUtils.getChildBmiLables(context)));
            bmiObject.setColors(ArraysKt___ArraysKt.toList(HMWeightUtils.getBmiColorFor7_18(context)));
        } else if (hMUserInfoB.getAge() >= 18) {
            bmiObject.setSectionValues(zAreEqual ? CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(18.5f), Float.valueOf(24.0f), Float.valueOf(28.0f)}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(18.5f), Float.valueOf(25.0f), Float.valueOf(30.0f)}));
            bmiObject.setLevelHints(ArraysKt___ArraysKt.toList(BodyParamsUtils.getAdualtBmiLables(context)));
            bmiObject.setColors(ArraysKt___ArraysKt.toList(HMWeightUtils.getBmiColorForAdualt(context)));
        }
        return bmiObject;
    }

    public static final float getBmrBarProgress(float f) {
        return a(500.0f, 3000.0f, getBmrSections(), f);
    }

    @NotNull
    public static final String getBmrIntro(int i) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.bmr_activity_text);
        if (i < 0) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject bmrScoreObject = BodyParamsUtils.getBmrScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), i, hMUserInfoB.getWeight());
        return (bmrScoreObject == null || (hintInfo = bmrScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    @NotNull
    public static final List<Float> getBmrSections() {
        HMUserInfo hMUserInfoB = b();
        return e.listOf(Float.valueOf(BodyParamsUtils.getBmrNormalValue(hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getWeight())));
    }

    public static final float getBodyFatBarProgress(float f) {
        HMUserInfo hMUserInfoB = b();
        float[] bodyFatAllSection = BodyParamsUtils.getBodyFatAllSection(hMUserInfoB.getAge(), hMUserInfoB.getGender());
        List<Float> list = bodyFatAllSection == null ? null : ArraysKt___ArraysKt.toList(bodyFatAllSection);
        if (list == null) {
            return -1.0f;
        }
        return a(2.0f, 75.0f, list, f);
    }

    @NotNull
    public static final String getBodyFatIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.bodyfat_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject scoreOfBodyFatObject = BodyParamsUtils.getScoreOfBodyFatObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f, hMUserInfoB.getWeight());
        return (scoreOfBodyFatObject == null || (hintInfo = scoreOfBodyFatObject.getHintInfo()) == null) ? string : hintInfo;
    }

    public static final float getBoneBarProgress(float f) {
        float fWeightToKg = weightToKg(0.0f);
        float fWeightToKg2 = weightToKg(10.0f);
        HMUserInfo hMUserInfoB = b();
        return a(fWeightToKg, fWeightToKg2, ArraysKt___ArraysKt.toList(BodyParamsUtils.getBoneSection(hMUserInfoB.getGender(), hMUserInfoB.getWeight())), f);
    }

    @NotNull
    public static final String getBoneIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.bone_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject boneScoreObject = BodyParamsUtils.getBoneScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f, hMUserInfoB.getWeight());
        return (boneScoreObject == null || (hintInfo = boneScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    public static final float getMuscleBarProgress(float f) {
        HMUserInfo hMUserInfoB = b();
        return a(10.0f, 100.0f, ArraysKt___ArraysKt.toList(BodyParamsUtils.getMuscleAllSection(hMUserInfoB.getHeight(), hMUserInfoB.getGender())), f);
    }

    @NotNull
    public static final String getMuscleIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.muscle_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject muscleScoreObject = BodyParamsUtils.getMuscleScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f);
        return (muscleScoreObject == null || (hintInfo = muscleScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    public static final float getProteinBarProgress(float f) {
        float[] proteinAllSection = BodyParamsUtils.getProteinAllSection(b().getAge());
        List<Float> list = proteinAllSection == null ? null : ArraysKt___ArraysKt.toList(proteinAllSection);
        if (list == null) {
            return -1.0f;
        }
        return a(10.0f, 30.0f, list, f);
    }

    @NotNull
    public static final String getProteinIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.pmr_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject pmrScoreObject = BodyParamsUtils.getPmrScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f);
        return (pmrScoreObject == null || (hintInfo = pmrScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    @NotNull
    public static final String getSkeletalMuscleIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.health_data_skeletal_muscle_intro);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject skeletalMuscleObject = BodyParamsUtils.getSkeletalMuscleObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f);
        return (skeletalMuscleObject == null || (hintInfo = skeletalMuscleObject.getHintInfo()) == null) ? string : hintInfo;
    }

    public static final float getSkeletalMuscleProgress(float f) {
        HMUserInfo hMUserInfoB = b();
        float[] skeletalMuscleAllSection = BodyParamsUtils.getSkeletalMuscleAllSection(hMUserInfoB.getAge(), hMUserInfoB.getGender());
        if (skeletalMuscleAllSection == null) {
            return 0.001f;
        }
        return a(8.0f, 100.0f, ArraysKt___ArraysKt.toList(skeletalMuscleAllSection), f);
    }

    @NotNull
    public static final String getSubcutaneousFatIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.health_data_subcutaneous_fat_intro);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject subcutaneousFatObject = BodyParamsUtils.getSubcutaneousFatObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f);
        return (subcutaneousFatObject == null || (hintInfo = subcutaneousFatObject.getHintInfo()) == null) ? string : hintInfo;
    }

    public static final float getSuscutaneousFatProgress(float f) {
        HMUserInfo hMUserInfoB = b();
        float[] subcutaneousFatAllSection = BodyParamsUtils.getSubcutaneousFatAllSection(hMUserInfoB.getAge(), hMUserInfoB.getGender());
        if (subcutaneousFatAllSection == null) {
            return 0.001f;
        }
        return a(0.1f, 60.0f, ArraysKt___ArraysKt.toList(subcutaneousFatAllSection), f);
    }

    public static final float getVisFatBarProgress(float f) {
        return a(0.0f, 30.0f, getVisFatSections(), f);
    }

    @NotNull
    public static final String getVisFatIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.visceral_fat_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject visFatObject = BodyParamsUtils.getVisFatObject(context, hMUserInfoB.getAge(), hMUserInfoB.getHeight(), hMUserInfoB.getGender(), f);
        return (visFatObject == null || (hintInfo = visFatObject.getHintInfo()) == null) ? string : hintInfo;
    }

    @NotNull
    public static final List<Float> getVisFatSections() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(10.0f), Float.valueOf(15.0f)});
    }

    public static final float getWaterBarProgress(float f) {
        HMUserInfo hMUserInfoB = b();
        float[] waterAllSection = BodyParamsUtils.getWaterAllSection(hMUserInfoB.getAge(), hMUserInfoB.getGender());
        List<Float> list = waterAllSection == null ? null : ArraysKt___ArraysKt.toList(waterAllSection);
        if (list == null) {
            return -1.0f;
        }
        return a(30.0f, 80.0f, list, f);
    }

    @NotNull
    public static final String getWaterIntro(float f) {
        String hintInfo;
        Context context = BraceletApp.getContext();
        String string = context.getString(R.string.water_activity_text);
        if (f < 0.0f) {
            return string;
        }
        HMUserInfo hMUserInfoB = b();
        ScoreParamsObject waterScoreObject = BodyParamsUtils.getWaterScoreObject(context, hMUserInfoB.getAge(), hMUserInfoB.getGender(), hMUserInfoB.getHeight(), f);
        return (waterScoreObject == null || (hintInfo = waterScoreObject.getHintInfo()) == null) ? string : hintInfo;
    }

    @NotNull
    public static final String getWeightInKgText(float f) {
        return HMWeightUtils.getWeightValueStringForDisplay(f, BFCallback.getUnitManager().getWeightUnit());
    }

    @NotNull
    public static final String getWeightInKgText1Format(float f) {
        return HMWeightUtils.getWeightValueStringForDisplay(f, BFCallback.getUnitManager().getWeightUnit(), 1);
    }

    @NotNull
    public static final String getWeightText(float f) {
        return HMWeightUtils.getWeightValueStringForDisplay(weightToKg(f), BFCallback.getUnitManager().getWeightUnit());
    }

    public static final float weightFromKg(@Nullable Float f) {
        return HMWeightUtils.convertFromKg(f == null ? 0.0f : f.floatValue(), BFCallback.getUnitManager().getWeightUnit());
    }

    public static final float weightToKg(float f) {
        return HMWeightUtils.convertToKg(f, BFCallback.getUnitManager().getWeightUnit());
    }
}

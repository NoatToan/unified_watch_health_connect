package com.xiaomi.hm.health.healthdata.repository;

import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.view.BmiBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BmrBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BodyFatBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.BoneBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.MuscleBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ProteinBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.SkeletalMuscleBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.SubcutaneousFatBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.VisFatBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.WaterBuilder;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/repository/BodyCompositionRepo;", "", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", "getColoredProgressBarBuilder", "", "value", "", "getBodyCompositionLevelIntro", "getBodyCompositionBarProgress", "(Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;F)Ljava/lang/Float;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyCompositionRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthDataType.values().length];
            iArr[HealthDataType.BODY_FAT.ordinal()] = 1;
            iArr[HealthDataType.BMI.ordinal()] = 2;
            iArr[HealthDataType.MUSCLE.ordinal()] = 3;
            iArr[HealthDataType.WATER.ordinal()] = 4;
            iArr[HealthDataType.PROTEIN.ordinal()] = 5;
            iArr[HealthDataType.BONE.ordinal()] = 6;
            iArr[HealthDataType.BASAL_METABOLISM.ordinal()] = 7;
            iArr[HealthDataType.VISCERAL_FAT.ordinal()] = 8;
            iArr[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 9;
            iArr[HealthDataType.SUBCUTANEOUS_FAT.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public final Float getBodyCompositionBarProgress(@NotNull HealthDataType type, float value) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return Float.valueOf(BodyCompositionUtilsKt.getBodyFatBarProgress(value));
            case 2:
                return Float.valueOf(BodyCompositionUtilsKt.getBMIBarProgress(value));
            case 3:
                return Float.valueOf(BodyCompositionUtilsKt.getMuscleBarProgress(value));
            case 4:
                return Float.valueOf(BodyCompositionUtilsKt.getWaterBarProgress(value));
            case 5:
                return Float.valueOf(BodyCompositionUtilsKt.getProteinBarProgress(value));
            case 6:
                return Float.valueOf(BodyCompositionUtilsKt.getBoneBarProgress(value));
            case 7:
                return Float.valueOf(BodyCompositionUtilsKt.getBmrBarProgress(value));
            case 8:
                return Float.valueOf(BodyCompositionUtilsKt.getVisFatBarProgress(value));
            case 9:
                return Float.valueOf(BodyCompositionUtilsKt.getSkeletalMuscleProgress(value));
            case 10:
                return Float.valueOf(BodyCompositionUtilsKt.getSuscutaneousFatProgress(value));
            default:
                return null;
        }
    }

    @Nullable
    public final String getBodyCompositionLevelIntro(@NotNull HealthDataType type, float value) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return BodyCompositionUtilsKt.getBodyFatIntro(value);
            case 2:
                return BodyCompositionUtilsKt.getBMIIntro(value);
            case 3:
                return BodyCompositionUtilsKt.getMuscleIntro(value);
            case 4:
                return BodyCompositionUtilsKt.getWaterIntro(value);
            case 5:
                return BodyCompositionUtilsKt.getProteinIntro(value);
            case 6:
                return BodyCompositionUtilsKt.getBoneIntro(value);
            case 7:
                return BodyCompositionUtilsKt.getBmrIntro((int) value);
            case 8:
                return BodyCompositionUtilsKt.getVisFatIntro(value);
            case 9:
                return BodyCompositionUtilsKt.getSkeletalMuscleIntro(value);
            case 10:
                return BodyCompositionUtilsKt.getSubcutaneousFatIntro(value);
            default:
                return null;
        }
    }

    @Nullable
    public final ColoredProgressBarBuilder getColoredProgressBarBuilder(@NotNull HealthDataType type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new BodyFatBuilder();
            case 2:
                return new BmiBuilder();
            case 3:
                return new MuscleBuilder();
            case 4:
                return new WaterBuilder();
            case 5:
                return new ProteinBuilder();
            case 6:
                return new BoneBuilder();
            case 7:
                return new BmrBuilder();
            case 8:
                return new VisFatBuilder();
            case 9:
                return new SkeletalMuscleBuilder();
            case 10:
                return new SubcutaneousFatBuilder();
            default:
                return null;
        }
    }
}

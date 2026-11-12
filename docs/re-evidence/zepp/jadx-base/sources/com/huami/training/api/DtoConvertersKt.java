package com.huami.training.api;

import com.huami.training.dto.Difficulty;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.PlanType;
import com.huami.training.dto.TargetMode;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0002\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\u0002\u001a\u00020\u0004*\u00020\u0007\u001a\n\u0010\u0002\u001a\u00020\t*\u00020\b\u001a\n\u0010\u0002\u001a\u00020\u000b*\u00020\n¨\u0006\f"}, d2 = {"Lcom/huami/training/api/TrainingTypeBo;", "Lcom/huami/training/dto/TrainingType;", "toDto", "Lcom/huami/training/api/DifficultyBo;", "Lcom/huami/training/dto/Difficulty;", "Lcom/huami/training/api/PlanTypeBo;", "Lcom/huami/training/dto/PlanType;", "Lcom/huami/training/api/PlanDifficultyBo;", "Lcom/huami/training/api/DisplayModeBo;", "Lcom/huami/training/dto/DisplayMode;", "Lcom/huami/training/api/TargetModeBo;", "Lcom/huami/training/dto/TargetMode;", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class DtoConvertersKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[TrainingTypeBo.values().length];
            iArr[TrainingTypeBo.ACTION.ordinal()] = 1;
            iArr[TrainingTypeBo.YOGA.ordinal()] = 2;
            iArr[TrainingTypeBo.FEATURED_COURSE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DifficultyBo.values().length];
            iArr2[DifficultyBo.JUNIOR.ordinal()] = 1;
            iArr2[DifficultyBo.INTERMEDIATE.ordinal()] = 2;
            iArr2[DifficultyBo.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlanTypeBo.values().length];
            iArr3[PlanTypeBo.LOSE_FAT.ordinal()] = 1;
            iArr3[PlanTypeBo.SHAPING.ordinal()] = 2;
            iArr3[PlanTypeBo.INCREASE_MUSCLE.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PlanDifficultyBo.values().length];
            iArr4[PlanDifficultyBo.JUNIOR.ordinal()] = 1;
            iArr4[PlanDifficultyBo.INTERMEDIATE.ordinal()] = 2;
            iArr4[PlanDifficultyBo.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DisplayModeBo.values().length];
            iArr5[DisplayModeBo.LARGE.ordinal()] = 1;
            iArr5[DisplayModeBo.LEFT.ordinal()] = 2;
            iArr5[DisplayModeBo.RIGHT.ordinal()] = 3;
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[TargetModeBo.values().length];
            iArr6[TargetModeBo.NONE.ordinal()] = 1;
            iArr6[TargetModeBo.WEBVIEW.ordinal()] = 2;
            iArr6[TargetModeBo.INTERNAL.ordinal()] = 3;
            iArr6[TargetModeBo.EXTERNAL.ordinal()] = 4;
            iArr6[TargetModeBo.RN.ordinal()] = 5;
            iArr6[TargetModeBo.INSIDE_REDIRECT.ordinal()] = 6;
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    @NotNull
    public static final TrainingType toDto(@NotNull TrainingTypeBo trainingTypeBo) {
        int i = WhenMappings.$EnumSwitchMapping$0[trainingTypeBo.ordinal()];
        if (i == 1) {
            return TrainingType.ACTION;
        }
        if (i == 2) {
            return TrainingType.YOGA;
        }
        if (i == 3) {
            return TrainingType.FEATURED_COURSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Difficulty toDto(@NotNull DifficultyBo difficultyBo) {
        int i = WhenMappings.$EnumSwitchMapping$1[difficultyBo.ordinal()];
        if (i == 1) {
            return Difficulty.JUNIOR;
        }
        if (i == 2) {
            return Difficulty.INTERMEDIATE;
        }
        if (i == 3) {
            return Difficulty.SENIOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final PlanType toDto(@NotNull PlanTypeBo planTypeBo) {
        int i = WhenMappings.$EnumSwitchMapping$2[planTypeBo.ordinal()];
        if (i == 1) {
            return PlanType.LOSE_FAT;
        }
        if (i == 2) {
            return PlanType.SHAPING;
        }
        if (i == 3) {
            return PlanType.INCREASE_MUSCLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Difficulty toDto(@NotNull PlanDifficultyBo planDifficultyBo) {
        int i = WhenMappings.$EnumSwitchMapping$3[planDifficultyBo.ordinal()];
        if (i == 1) {
            return Difficulty.JUNIOR;
        }
        if (i == 2) {
            return Difficulty.INTERMEDIATE;
        }
        if (i == 3) {
            return Difficulty.SENIOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final DisplayMode toDto(@NotNull DisplayModeBo displayModeBo) {
        int i = WhenMappings.$EnumSwitchMapping$4[displayModeBo.ordinal()];
        if (i == 1) {
            return DisplayMode.LARGE;
        }
        if (i == 2) {
            return DisplayMode.LEFT;
        }
        if (i == 3) {
            return DisplayMode.RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final TargetMode toDto(@NotNull TargetModeBo targetModeBo) {
        switch (WhenMappings.$EnumSwitchMapping$5[targetModeBo.ordinal()]) {
            case 1:
                return TargetMode.NONE;
            case 2:
                return TargetMode.WEBVIEW;
            case 3:
                return TargetMode.INTERNAL;
            case 4:
                return TargetMode.EXTERNAL;
            case 5:
                return TargetMode.RN;
            case 6:
                return TargetMode.INTERNAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

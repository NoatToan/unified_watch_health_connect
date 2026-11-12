package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.PlanType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/training/db/PlanConverters;", "", "Lcom/huami/training/dto/PlanType;", "planType", "", "planTypeToInt", "(Lcom/huami/training/dto/PlanType;)Ljava/lang/Integer;", "targetMode", "intToPlanType", "(Ljava/lang/Integer;)Lcom/huami/training/dto/PlanType;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlanConverters {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlanType.values().length];
            iArr[PlanType.LOSE_FAT.ordinal()] = 1;
            iArr[PlanType.SHAPING.ordinal()] = 2;
            iArr[PlanType.INCREASE_MUSCLE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TypeConverter
    @Nullable
    public final PlanType intToPlanType(@Nullable Integer targetMode) {
        if (targetMode != null && targetMode.intValue() == 1) {
            return PlanType.LOSE_FAT;
        }
        if (targetMode != null && targetMode.intValue() == 2) {
            return PlanType.SHAPING;
        }
        if (targetMode != null && targetMode.intValue() == 3) {
            return PlanType.INCREASE_MUSCLE;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final Integer planTypeToInt(@Nullable PlanType planType) {
        int i = planType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[planType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}

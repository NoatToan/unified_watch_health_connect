package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.PromotePlace;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/training/db/PromotePlaceConverter;", "", "Lcom/huami/training/dto/PromotePlace;", "promotePlace", "", "promotePlaceToInt", "(Lcom/huami/training/dto/PromotePlace;)Ljava/lang/Integer;", "intToPromotePlace", "(Ljava/lang/Integer;)Lcom/huami/training/dto/PromotePlace;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PromotePlaceConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromotePlace.values().length];
            iArr[PromotePlace.BEFORE_RACE_WALKING.ordinal()] = 1;
            iArr[PromotePlace.BEFORE_RUNNING_INDOOR.ordinal()] = 2;
            iArr[PromotePlace.BEFORE_RUNNING_OUTDOOR.ordinal()] = 3;
            iArr[PromotePlace.BEFORE_CYCLING.ordinal()] = 4;
            iArr[PromotePlace.AFTER_RACE_WALKING.ordinal()] = 5;
            iArr[PromotePlace.AFTER_RUNNING_INDOOR.ordinal()] = 6;
            iArr[PromotePlace.AFTER_RUNNING_OUTDOOR.ordinal()] = 7;
            iArr[PromotePlace.AFTER_CYCLING.ordinal()] = 8;
            iArr[PromotePlace.BEFORE_FITNESS.ordinal()] = 9;
            iArr[PromotePlace.AFTER_FITNESS.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TypeConverter
    @Nullable
    public final PromotePlace intToPromotePlace(@Nullable Integer promotePlace) {
        if (promotePlace != null && promotePlace.intValue() == 1) {
            return PromotePlace.BEFORE_RACE_WALKING;
        }
        if (promotePlace != null && promotePlace.intValue() == 2) {
            return PromotePlace.BEFORE_RUNNING_INDOOR;
        }
        if (promotePlace != null && promotePlace.intValue() == 3) {
            return PromotePlace.BEFORE_RUNNING_OUTDOOR;
        }
        if (promotePlace != null && promotePlace.intValue() == 4) {
            return PromotePlace.BEFORE_CYCLING;
        }
        if (promotePlace != null && promotePlace.intValue() == 5) {
            return PromotePlace.AFTER_RACE_WALKING;
        }
        if (promotePlace != null && promotePlace.intValue() == 6) {
            return PromotePlace.AFTER_RUNNING_INDOOR;
        }
        if (promotePlace != null && promotePlace.intValue() == 7) {
            return PromotePlace.AFTER_RUNNING_OUTDOOR;
        }
        if (promotePlace != null && promotePlace.intValue() == 8) {
            return PromotePlace.AFTER_CYCLING;
        }
        if (promotePlace != null && promotePlace.intValue() == 9) {
            return PromotePlace.BEFORE_FITNESS;
        }
        if (promotePlace != null && promotePlace.intValue() == 10) {
            return PromotePlace.AFTER_FITNESS;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final Integer promotePlaceToInt(@Nullable PromotePlace promotePlace) {
        switch (promotePlace == null ? -1 : WhenMappings.$EnumSwitchMapping$0[promotePlace.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return null;
        }
    }
}

package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.TrainingType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/training/db/TrainingTypeConverter;", "", "", "trainingType", "Lcom/huami/training/dto/TrainingType;", "intToTrainingType", "(Ljava/lang/Integer;)Lcom/huami/training/dto/TrainingType;", "trainingTypeToInt", "(Lcom/huami/training/dto/TrainingType;)Ljava/lang/Integer;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingTypeConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainingType.values().length];
            iArr[TrainingType.ACTION.ordinal()] = 1;
            iArr[TrainingType.YOGA.ordinal()] = 2;
            iArr[TrainingType.FEATURED_COURSE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TypeConverter
    @Nullable
    public final TrainingType intToTrainingType(@Nullable Integer trainingType) {
        if (trainingType != null && trainingType.intValue() == 1) {
            return TrainingType.ACTION;
        }
        if (trainingType != null && trainingType.intValue() == 2) {
            return TrainingType.YOGA;
        }
        if (trainingType != null && trainingType.intValue() == 3) {
            return TrainingType.FEATURED_COURSE;
        }
        return null;
    }

    @TypeConverter
    @Nullable
    public final Integer trainingTypeToInt(@Nullable TrainingType trainingType) {
        int i = trainingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trainingType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? null : 3;
        }
        return 2;
    }
}

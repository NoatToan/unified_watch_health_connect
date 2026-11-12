package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.Difficulty;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/training/db/DifficultyConverter;", "", "Lcom/huami/training/dto/Difficulty;", "difficulty", "", "difficultyToInt", "intToDifficulty", "(Ljava/lang/Integer;)Lcom/huami/training/dto/Difficulty;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DifficultyConverter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Difficulty.values().length];
            iArr[Difficulty.JUNIOR.ordinal()] = 1;
            iArr[Difficulty.INTERMEDIATE.ordinal()] = 2;
            iArr[Difficulty.SENIOR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @TypeConverter
    public final int difficultyToInt(@Nullable Difficulty difficulty) {
        int i = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    @TypeConverter
    @Nullable
    public final Difficulty intToDifficulty(@Nullable Integer difficulty) {
        if (difficulty != null && difficulty.intValue() == 1) {
            return Difficulty.JUNIOR;
        }
        if (difficulty != null && difficulty.intValue() == 2) {
            return Difficulty.INTERMEDIATE;
        }
        if (difficulty != null && difficulty.intValue() == 3) {
            return Difficulty.SENIOR;
        }
        return null;
    }
}

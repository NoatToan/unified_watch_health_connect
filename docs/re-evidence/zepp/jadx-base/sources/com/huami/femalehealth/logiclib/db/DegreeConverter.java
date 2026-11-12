package com.huami.femalehealth.logiclib.db;

import androidx.room.TypeConverter;
import com.huami.femalehealth.logiclib.dto.Degree;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/DegreeConverter;", "", "Lcom/huami/femalehealth/logiclib/dto/Degree;", "degree", "", "degreeToInt", "value", "intToDegree", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class DegreeConverter {
    @TypeConverter
    public final int degreeToInt(@NotNull Degree degree) {
        return degree.getValue();
    }

    @TypeConverter
    @NotNull
    public final Degree intToDegree(int value) {
        return Degree.INSTANCE.covertByIntType(Integer.valueOf(value));
    }
}

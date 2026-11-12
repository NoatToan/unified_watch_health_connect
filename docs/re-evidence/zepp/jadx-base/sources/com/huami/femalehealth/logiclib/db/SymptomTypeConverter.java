package com.huami.femalehealth.logiclib.db;

import androidx.room.TypeConverter;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/SymptomTypeConverter;", "", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "symptomType", "", "symptomTypeToStr", "name", "strToSymptomType", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class SymptomTypeConverter {
    @TypeConverter
    @NotNull
    public final SymptomType strToSymptomType(@NotNull String name) {
        return SymptomType.valueOf(name);
    }

    @TypeConverter
    @NotNull
    public final String symptomTypeToStr(@NotNull SymptomType symptomType) {
        return symptomType.name();
    }
}

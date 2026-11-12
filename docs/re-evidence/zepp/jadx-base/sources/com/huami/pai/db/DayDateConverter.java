package com.huami.pai.db;

import androidx.room.TypeConverter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/pai/db/DayDateConverter;", "", "Ljava/util/Date;", "value", "", "fromTimestamp", "date", "dateToTimestamp", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DayDateConverter {
    @TypeConverter
    @Nullable
    public final Date dateToTimestamp(@Nullable String date) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(date);
    }

    @TypeConverter
    @Nullable
    public final String fromTimestamp(@Nullable Date value) {
        if (value == null) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(value);
    }
}

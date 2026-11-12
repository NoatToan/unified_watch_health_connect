package com.xiaomi.hm.health.healthdata.core.dao;

import androidx.room.TypeConverter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/DateConverter;", "", "Ljava/util/Date;", "date", "", "toLong", "(Ljava/util/Date;)Ljava/lang/Long;", "value", "toDate", "(Ljava/lang/Long;)Ljava/util/Date;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DateConverter {
    @TypeConverter
    @Nullable
    public final Date toDate(@Nullable Long value) {
        if (value == null) {
            return null;
        }
        long jLongValue = value.longValue();
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(jLongValue);
        return calendar.getTime();
    }

    @TypeConverter
    @Nullable
    public final Long toLong(@Nullable Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }
}

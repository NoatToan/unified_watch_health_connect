package com.huami.assistant.ui.v2.db.converter;

import androidx.room.TypeConverter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/assistant/ui/v2/db/converter/VocationDayConverters;", "", "", "value", "", "intToBoolean", "booleanToInt", "Ljava/util/Date;", "date", "", "dateToString", "stringToDate", "Ljava/text/SimpleDateFormat;", "a", "Lkotlin/Lazy;", "()Ljava/text/SimpleDateFormat;", "mDateFormat", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class VocationDayConverters {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDateFormat = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SimpleDateFormat> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
        }
    }

    private final SimpleDateFormat a() {
        return (SimpleDateFormat) this.mDateFormat.getValue();
    }

    @TypeConverter
    public final int booleanToInt(boolean value) {
        return value ? 1 : 0;
    }

    @TypeConverter
    @NotNull
    public final String dateToString(@NotNull Date date) {
        return a().format(date);
    }

    @TypeConverter
    public final boolean intToBoolean(int value) {
        return value == 1;
    }

    @TypeConverter
    @NotNull
    public final Date stringToDate(@NotNull String date) {
        Date date2 = a().parse(date);
        return date2 == null ? new Date() : date2;
    }
}

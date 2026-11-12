package com.huami.respiratoryrate.core.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0004H\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\t\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0007\"\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u001d\u0010\u0012\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljava/util/Calendar;", "", "setStartOfDay", "setEndOfDay", "", "toSecond", "toMillis", "", "toDateString", "toDateFullString", "toCurDateFullString", "toDateTimeStamp", "Ljava/text/SimpleDateFormat;", "a", "Lkotlin/Lazy;", "()Ljava/text/SimpleDateFormat;", "dataDateFormat", "b", "dataDateFullFormat", "core_release"}, k = 2, mv = {1, 5, 1})
public final class TimeUtilsKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy b = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SimpleDateFormat> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/text/SimpleDateFormat;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SimpleDateFormat> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
    }

    private static final SimpleDateFormat a() {
        return (SimpleDateFormat) a.getValue();
    }

    private static final SimpleDateFormat b() {
        return (SimpleDateFormat) b.getValue();
    }

    public static final void setEndOfDay(@NotNull Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 0);
    }

    public static final void setStartOfDay(@NotNull Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @NotNull
    public static final String toCurDateFullString(long j) {
        Calendar calendar = Calendar.getInstance();
        b().setTimeZone(TimeZone.getDefault());
        calendar.setTimeInMillis(j);
        return b().format(calendar.getTime());
    }

    @NotNull
    public static final String toDateFullString(long j) {
        Calendar calendar = Calendar.getInstance();
        b().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        calendar.setTimeInMillis(j);
        return b().format(calendar.getTime());
    }

    @NotNull
    public static final String toDateString(long j) {
        Calendar calendar = Calendar.getInstance();
        a().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        calendar.setTimeInMillis(j);
        return a().format(calendar.getTime());
    }

    public static final long toDateTimeStamp(@NotNull String str) {
        a().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return toSecond(a().parse(str).getTime());
    }

    public static final long toMillis(long j) {
        return j * ((long) 1000);
    }

    public static final long toSecond(long j) {
        return j / ((long) 1000);
    }
}

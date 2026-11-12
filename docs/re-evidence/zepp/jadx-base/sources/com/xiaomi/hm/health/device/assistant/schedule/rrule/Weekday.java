package com.xiaomi.hm.health.device.assistant.schedule.rrule;

import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "", "", "initials", "Ljava/lang/String;", "getInitials", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum Weekday {
    Monday("MO"),
    Tuesday("TU"),
    Wednesday("WE"),
    Thursday("TH"),
    Friday("FR"),
    Saturday("SA"),
    Sunday("SU");


    @NotNull
    private final String initials;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Weekday[]> values$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Weekday[]>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.rrule.Weekday.a
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Weekday[] invoke() {
            return Weekday.values();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday$Companion;", "", "", "string", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "fromString", "", "values$delegate", "Lkotlin/Lazy;", "getValues", "()[Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "values", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "values", "getValues()[Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Weekday fromString(@Nullable String string) {
            int i = 0;
            if ((string == null || string.length() == 0) || string.length() < 2) {
                return null;
            }
            try {
                string.toLowerCase(Locale.ROOT);
                Character.toUpperCase(string.charAt(0));
                return Weekday.valueOf(string);
            } catch (Exception unused) {
                String strSubstring = string.substring(0, 2);
                Weekday[] values = getValues();
                int length = values.length;
                while (i < length) {
                    Weekday weekday = values[i];
                    i++;
                    if (m.equals(weekday.getInitials(), strSubstring, true)) {
                        return weekday;
                    }
                }
                return null;
            }
        }

        @NotNull
        public final Weekday[] getValues() {
            return (Weekday[]) Weekday.values$delegate.getValue();
        }
    }

    Weekday(String str) {
        this.initials = str;
    }

    @NotNull
    public final String getInitials() {
        return this.initials;
    }
}

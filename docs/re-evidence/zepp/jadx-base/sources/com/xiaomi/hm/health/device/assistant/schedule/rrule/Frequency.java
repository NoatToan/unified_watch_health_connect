package com.xiaomi.hm.health.device.assistant.schedule.rrule;

import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "", "", "toString", "<init>", "(Ljava/lang/String;I)V", "Companion", "Daily", "Weekly", "Monthly", "Yearly", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum Frequency {
    Daily,
    Weekly,
    Monthly,
    Yearly;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Frequency[]> values$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Frequency[]>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.rrule.Frequency.a
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Frequency[] invoke() {
            return Frequency.values();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency$Companion;", "", "", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "values$delegate", "Lkotlin/Lazy;", "getValues", "()[Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "values", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "values", "getValues()[Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Frequency[] getValues() {
            return (Frequency[]) Frequency.values$delegate.getValue();
        }
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String string = super.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        return string.toUpperCase();
    }
}

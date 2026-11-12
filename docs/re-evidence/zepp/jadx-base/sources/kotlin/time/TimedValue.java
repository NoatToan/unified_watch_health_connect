package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ExperimentalTime
public final class TimedValue<T> {
    private final T a;
    private final long b;

    private TimedValue(T t, long j) {
        this.a = t;
        this.b = j;
    }

    public /* synthetic */ TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m4420copyRFiDyg4$default(TimedValue timedValue, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = timedValue.a;
        }
        if ((i & 2) != 0) {
            j = timedValue.b;
        }
        return timedValue.m4422copyRFiDyg4(obj, j);
    }

    public final T component1() {
        return this.a;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name */
    public final long m4421component2UwyO8pc() {
        return this.b;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m4422copyRFiDyg4(T t, long j) {
        return new TimedValue<>(t, j, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) obj;
        return Intrinsics.areEqual(this.a, timedValue.a) && Duration.m4324equalsimpl0(this.b, timedValue.b);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m4423getDurationUwyO8pc() {
        return this.b;
    }

    public final T getValue() {
        return this.a;
    }

    public int hashCode() {
        T t = this.a;
        return ((t == null ? 0 : t.hashCode()) * 31) + Duration.m4344hashCodeimpl(this.b);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) Duration.m4363toStringimpl(this.b)) + ')';
    }
}

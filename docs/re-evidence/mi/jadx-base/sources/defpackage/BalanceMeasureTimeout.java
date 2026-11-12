package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¨\u0006\u000e"}, d2 = {"Lz0;", "R", "La1;", "", "toString", "", "hashCode", "", "other", "", "equals", "value", "<init>", "(Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BalanceMeasureTimeout<R> extends a1<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final R value;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceMeasureTimeout() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BalanceMeasureTimeout) && Intrinsics.areEqual(this.value, ((BalanceMeasureTimeout) other).value);
    }

    public int hashCode() {
        R r2 = this.value;
        if (r2 == null) {
            return 0;
        }
        return r2.hashCode();
    }

    @NotNull
    public String toString() {
        return "BalanceMeasureTimeout(value=" + this.value + ')';
    }

    public BalanceMeasureTimeout(@Nullable R r2) {
        super(null);
        this.value = r2;
    }

    public /* synthetic */ BalanceMeasureTimeout(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}

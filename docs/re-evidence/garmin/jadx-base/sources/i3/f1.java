package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li3/f1;", "", "Lg6/f;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f88048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f88049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f88050e;

    private f1(float f14, float f15, float f16, float f17, float f18) {
        this.f88046a = f14;
        this.f88047b = f15;
        this.f88048c = f16;
        this.f88049d = f17;
        this.f88050e = f18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return g6.f.c(this.f88046a, f1Var.f88046a) && g6.f.c(this.f88047b, f1Var.f88047b) && g6.f.c(this.f88048c, f1Var.f88048c) && g6.f.c(this.f88049d, f1Var.f88049d) && g6.f.c(this.f88050e, f1Var.f88050e);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f88050e) + q6.f.d(this.f88049d, q6.f.d(this.f88048c, q6.f.d(this.f88047b, Float.hashCode(this.f88046a) * 31, 31), 31), 31);
    }

    public /* synthetic */ f1(float f14, float f15, float f16, float f17, float f18, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18);
    }
}

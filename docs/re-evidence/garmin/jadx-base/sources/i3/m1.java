package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li3/m1;", "", "Lg6/f;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f88934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f88935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f88936e;

    private m1(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f88932a = f14;
        this.f88933b = f15;
        this.f88934c = f16;
        this.f88935d = f17;
        this.f88936e = f19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return g6.f.c(this.f88932a, m1Var.f88932a) && g6.f.c(this.f88933b, m1Var.f88933b) && g6.f.c(this.f88934c, m1Var.f88934c) && g6.f.c(this.f88935d, m1Var.f88935d) && g6.f.c(this.f88936e, m1Var.f88936e);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f88936e) + q6.f.d(this.f88935d, q6.f.d(this.f88934c, q6.f.d(this.f88933b, Float.hashCode(this.f88932a) * 31, 31), 31), 31);
    }

    public /* synthetic */ m1(float f14, float f15, float f16, float f17, float f18, float f19, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18, f19);
    }
}

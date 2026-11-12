package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/t6;", "", "Lg6/f;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f89761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f89762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f89763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f89764d;

    private t6(float f14, float f15, float f16, float f17) {
        this.f89761a = f14;
        this.f89762b = f15;
        this.f89763c = f16;
        this.f89764d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        if (g6.f.c(this.f89761a, t6Var.f89761a) && g6.f.c(this.f89762b, t6Var.f89762b) && g6.f.c(this.f89763c, t6Var.f89763c)) {
            return g6.f.c(this.f89764d, t6Var.f89764d);
        }
        return false;
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f89764d) + q6.f.d(this.f89763c, q6.f.d(this.f89762b, Float.hashCode(this.f89761a) * 31, 31), 31);
    }

    public /* synthetic */ t6(float f14, float f15, float f16, float f17, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17);
    }
}

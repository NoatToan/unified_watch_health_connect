package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/ac;", "", "Lg6/f;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/j;)V", "La2/h;", "lastInteraction", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f87469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f87470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f87471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f87472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f87473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f87474f;

    private ac(float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f87469a = f14;
        this.f87470b = f15;
        this.f87471c = f16;
        this.f87472d = f17;
        this.f87473e = f18;
        this.f87474f = f19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return g6.f.c(this.f87469a, acVar.f87469a) && g6.f.c(this.f87470b, acVar.f87470b) && g6.f.c(this.f87471c, acVar.f87471c) && g6.f.c(this.f87472d, acVar.f87472d) && g6.f.c(this.f87474f, acVar.f87474f);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f87474f) + q6.f.d(this.f87472d, q6.f.d(this.f87471c, q6.f.d(this.f87470b, Float.hashCode(this.f87469a) * 31, 31), 31), 31);
    }

    public /* synthetic */ ac(float f14, float f15, float f16, float f17, float f18, float f19, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18, f19);
    }
}

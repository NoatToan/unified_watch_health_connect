package m92;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm92/e;", "", "Lm92/h0$e$c;", "chartPoint", "", "bottomLeft", "bottomRight", "topLeft", "topRight", "<init>", "(Lm92/h0$e$c;FFFF)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e.c f117288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f117291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f117292e;

    public /* synthetic */ e(h0.e.c cVar, float f14, float f15, float f16, float f17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? 0.0f : f16, (i14 & 16) != 0 ? 0.0f : f17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f117288a, eVar.f117288a) && Float.compare(this.f117289b, eVar.f117289b) == 0 && Float.compare(this.f117290c, eVar.f117290c) == 0 && Float.compare(this.f117291d, eVar.f117291d) == 0 && Float.compare(this.f117292e, eVar.f117292e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f117292e) + q6.f.d(this.f117291d, q6.f.d(this.f117290c, q6.f.d(this.f117289b, this.f117288a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BarConfig(chartPoint=");
        sb3.append(this.f117288a);
        sb3.append(", bottomLeft=");
        sb3.append(this.f117289b);
        sb3.append(", bottomRight=");
        l2.n(sb3, this.f117290c, ", topLeft=", this.f117291d, ", topRight=");
        return v.e0.e(this.f117292e, ")", sb3);
    }

    public e(h0.e.c cVar, float f14, float f15, float f16, float f17) {
        cVar.getClass();
        this.f117288a = cVar;
        this.f117289b = f14;
        this.f117290c = f15;
        this.f117291d = f16;
        this.f117292e = f17;
    }
}

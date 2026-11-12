package d11;

import b11.v;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld11/f;", "", "Lb11/v;", "food", "", "hasError", "<init>", "(Lb11/v;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f57067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57068b;

    public f(v vVar, boolean z14) {
        vVar.getClass();
        this.f57067a = vVar;
        this.f57068b = z14;
    }

    public final String a() {
        v vVar = this.f57067a;
        return e5.g(vVar.getF14238e().f14253a, "-", vVar.getF14239f().f14373b);
    }

    public final f b(f fVar) {
        fVar.getClass();
        if (!a().equals(fVar.a())) {
            return this;
        }
        v vVar = this.f57067a;
        return new f(vVar.i4(fVar.f57067a.getF14235b() + vVar.getF14235b()), this.f57068b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f57067a, fVar.f57067a) && this.f57068b == fVar.f57068b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57068b) + (this.f57067a.hashCode() * 31);
    }

    public final String toString() {
        return "Ingredient(food=" + this.f57067a + ", hasError=" + this.f57068b + ")";
    }

    public /* synthetic */ f(v vVar, boolean z14, int i14, j jVar) {
        this(vVar, (i14 & 2) != 0 ? false : z14);
    }
}

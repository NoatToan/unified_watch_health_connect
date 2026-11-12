package g21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg21/f;", "", "Lb63/v;", "hour", "Lg21/o;", "mealBlock", "<init>", "(Lb63/v;Lg21/o;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.v f75415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f75416b;

    public /* synthetic */ f(b63.v vVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : vVar, (i14 & 2) != 0 ? null : oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f75415a, fVar.f75415a) && p005kotlin.jvm.internal.s.g(this.f75416b, fVar.f75416b);
    }

    public final int hashCode() {
        b63.v vVar = this.f75415a;
        int iHashCode = (vVar == null ? 0 : vVar.f16219a.hashCode()) * 31;
        o oVar = this.f75416b;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "DailyListElement(hour=" + this.f75415a + ", mealBlock=" + this.f75416b + ")";
    }

    public f(b63.v vVar, o oVar) {
        this.f75415a = vVar;
        this.f75416b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

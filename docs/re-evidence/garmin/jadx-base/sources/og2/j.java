package og2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log2/j;", "", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f132046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f132047b;

    public j(float f14, float f15) {
        this.f132046a = f14;
        this.f132047b = f15;
    }

    public static j a(j jVar) {
        float f14 = jVar.f132046a;
        float f15 = jVar.f132047b;
        jVar.getClass();
        return new j(f14, f15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f132046a, jVar.f132046a) == 0 && Float.compare(this.f132047b, jVar.f132047b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132047b) + (Float.hashCode(this.f132046a) * 31);
    }

    public final String toString() {
        return am.j.l("ChartPoint(x=", this.f132046a, ", y=", this.f132047b, ")");
    }
}

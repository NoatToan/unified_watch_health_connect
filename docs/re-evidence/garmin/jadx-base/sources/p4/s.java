package p4;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bB)\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lp4/s;", "", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "z", "(FFF)V", "sum", "(FFFF)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f135625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f135626b;

    public s(float f14, float f15) {
        this.f135625a = f14;
        this.f135626b = f15;
    }

    public final float[] a() {
        float f14 = this.f135625a;
        float f15 = this.f135626b;
        return new float[]{f14 / f15, 1.0f, ((1.0f - f14) - f15) / f15};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f135625a, sVar.f135625a) == 0 && Float.compare(this.f135626b, sVar.f135626b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f135626b) + (Float.hashCode(this.f135625a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WhitePoint(x=");
        sb3.append(this.f135625a);
        sb3.append(", y=");
        return q6.f.p(sb3, this.f135626b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public s(float f14, float f15, float f16) {
        this(f14, f15, f16, f14 + f15 + f16);
    }

    private s(float f14, float f15, float f16, float f17) {
        this(f14 / f17, f15 / f17);
    }
}

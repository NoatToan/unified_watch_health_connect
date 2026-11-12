package p4;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp4/r;", "", "", "gamma", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "<init>", "(DDDDDDD)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f135618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f135619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f135620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f135621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f135622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f135623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f135624g;

    public r(double d14, double d15, double d16, double d17, double d18, double d19, double d24) {
        this.f135618a = d14;
        this.f135619b = d15;
        this.f135620c = d16;
        this.f135621d = d17;
        this.f135622e = d18;
        this.f135623f = d19;
        this.f135624g = d24;
        if (Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d18) || Double.isNaN(d19) || Double.isNaN(d24) || Double.isNaN(d14)) {
            vb.h.s("Parameters cannot be NaN");
            throw null;
        }
        if (d14 == -2.0d || d14 == -3.0d) {
            return;
        }
        if (d18 < 0.0d || d18 > 1.0d) {
            com.google.firebase.messaging.l.c(d18, "Parameter d must be in the range [0..1], was ");
            throw null;
        }
        if (d18 == 0.0d && (d15 == 0.0d || d14 == 0.0d)) {
            vb.h.s("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d18 >= 1.0d && d17 == 0.0d) {
            vb.h.s("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d15 == 0.0d || d14 == 0.0d) && d17 == 0.0d) {
            vb.h.s("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d17 < 0.0d) {
            vb.h.s("The transfer function must be increasing");
            throw null;
        }
        if (d15 < 0.0d || d14 < 0.0d) {
            vb.h.s("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f135618a, rVar.f135618a) == 0 && Double.compare(this.f135619b, rVar.f135619b) == 0 && Double.compare(this.f135620c, rVar.f135620c) == 0 && Double.compare(this.f135621d, rVar.f135621d) == 0 && Double.compare(this.f135622e, rVar.f135622e) == 0 && Double.compare(this.f135623f, rVar.f135623f) == 0 && Double.compare(this.f135624g, rVar.f135624g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f135624g) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.f135618a) * 31, 31, this.f135619b), 31, this.f135620c), 31, this.f135621d), 31, this.f135622e), 31, this.f135623f);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f135618a + ", a=" + this.f135619b + ", b=" + this.f135620c + ", c=" + this.f135621d + ", d=" + this.f135622e + ", e=" + this.f135623f + ", f=" + this.f135624g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ r(double d14, double d15, double d16, double d17, double d18, double d19, double d24, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, d15, d16, d17, d18, (i14 & 32) != 0 ? 0.0d : d19, (i14 & 64) != 0 ? 0.0d : d24);
    }
}

package f5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/n;", "Lf5/k;", "", "value", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class n implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f69009b;

    public n(float f14) {
        this.f69009b = f14;
    }

    @Override // f5.k
    public final long a(long j8, long j14) {
        float f14 = this.f69009b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14)));
        int i14 = f2.f68942b;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f69009b, ((n) obj).f69009b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f69009b);
    }

    public final String toString() {
        return q6.f.p(new StringBuilder("FixedScale(value="), this.f69009b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

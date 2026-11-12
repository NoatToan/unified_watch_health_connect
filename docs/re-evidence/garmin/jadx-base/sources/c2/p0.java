package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc2/p0;", "", "", "fillCrossAxisFraction", "<init>", "(F)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22809a;

    public p0(float f14) {
        this.f22809a = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Float.compare(this.f22809a, ((p0) obj).f22809a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22809a);
    }

    public final String toString() {
        return q6.f.p(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.f22809a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

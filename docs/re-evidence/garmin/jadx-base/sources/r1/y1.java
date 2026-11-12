package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lr1/y1;", "", "", "alpha", "Ls1/f0;", "animationSpec", "<init>", "(FLs1/f0;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f149317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.f0<Float> f149318b;

    public y1(float f14, s1.f0<Float> f0Var) {
        this.f149317a = f14;
        this.f149318b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Float.compare(this.f149317a, y1Var.f149317a) == 0 && p005kotlin.jvm.internal.s.g(this.f149318b, y1Var.f149318b);
    }

    public final int hashCode() {
        return this.f149318b.hashCode() + (Float.hashCode(this.f149317a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f149317a + ", animationSpec=" + this.f149318b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

package h3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh3/b;", "", "", "draggedAlpha", "focusedAlpha", "hoveredAlpha", "pressedAlpha", "<init>", "(FFFF)V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f81226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f81229d;

    public b(float f14, float f15, float f16, float f17) {
        this.f81226a = f14;
        this.f81227b = f15;
        this.f81228c = f16;
        this.f81229d = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f81226a == bVar.f81226a && this.f81227b == bVar.f81227b && this.f81228c == bVar.f81228c && this.f81229d == bVar.f81229d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81229d) + q6.f.d(this.f81228c, q6.f.d(this.f81227b, Float.hashCode(this.f81226a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb3.append(this.f81226a);
        sb3.append(", focusedAlpha=");
        sb3.append(this.f81227b);
        sb3.append(", hoveredAlpha=");
        sb3.append(this.f81228c);
        sb3.append(", pressedAlpha=");
        return q6.f.p(sb3, this.f81229d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

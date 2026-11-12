package androidx.core.view;

import android.graphics.Point;
import android.view.RoundedCorner;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f6430c;

    public e0(int i14, int i15, int i16, int i17) {
        this.f6428a = i14;
        this.f6429b = i15;
        this.f6430c = new Point(i16, i17);
    }

    public static e0 a(RoundedCorner roundedCorner) {
        int i14;
        if (roundedCorner == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i14 = 1;
            if (position != 1) {
                i14 = 2;
                if (position != 2) {
                    i14 = 3;
                    if (position != 3) {
                        vb.h.s(am.j.h(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i14 = 0;
        }
        return new e0(i14, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f6428a == e0Var.f6428a && this.f6429b == e0Var.f6429b && this.f6430c.equals(e0Var.f6430c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6430c.hashCode() + (((this.f6428a * 31) + this.f6429b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("RoundedCornerCompat{position=");
        int i14 = this.f6428a;
        if (i14 == 0) {
            str = "TopLeft";
        } else if (i14 == 1) {
            str = "TopRight";
        } else if (i14 != 2) {
            str = i14 != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb3.append(str);
        sb3.append(", radius=");
        sb3.append(this.f6429b);
        sb3.append(", center=");
        sb3.append(this.f6430c);
        sb3.append(CoreConstants.CURLY_RIGHT);
        return sb3.toString();
    }

    private e0(int i14, int i15, Point point) {
        this(i14, i15, point.x, point.y);
    }
}

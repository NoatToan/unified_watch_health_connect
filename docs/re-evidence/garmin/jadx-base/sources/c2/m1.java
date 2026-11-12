package c2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/m1;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(IIII)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22751d;

    public m1(int i14, int i15, int i16, int i17) {
        this.f22748a = i14;
        this.f22749b = i15;
        this.f22750c = i16;
        this.f22751d = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f22748a == m1Var.f22748a && this.f22749b == m1Var.f22749b && this.f22750c == m1Var.f22750c && this.f22751d == m1Var.f22751d;
    }

    public final int hashCode() {
        return (((((this.f22748a * 31) + this.f22749b) * 31) + this.f22750c) * 31) + this.f22751d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsetsValues(left=");
        sb3.append(this.f22748a);
        sb3.append(", top=");
        sb3.append(this.f22749b);
        sb3.append(", right=");
        sb3.append(this.f22750c);
        sb3.append(", bottom=");
        return ds.e0.j(sb3, this.f22751d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

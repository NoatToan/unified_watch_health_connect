package py2;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpy2/a;", "", "", "red", "green", "blue", "", "alpha", "<init>", "(IIIF)V", "mobile-uac-css"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f141877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f141879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f141880d;

    public a(int i14, int i15, int i16, float f14) {
        this.f141877a = i14;
        this.f141878b = i15;
        this.f141879c = i16;
        this.f141880d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f141877a == aVar.f141877a && this.f141878b == aVar.f141878b && this.f141879c == aVar.f141879c && Float.compare(this.f141880d, aVar.f141880d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f141880d) + q2.d(this.f141879c, q2.d(this.f141878b, Integer.hashCode(this.f141877a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f141877a, this.f141878b, "rgba(", ", ", ", ");
        sbJ.append(this.f141879c);
        sbJ.append(", ");
        sbJ.append(this.f141880d);
        sbJ.append(")");
        return sbJ.toString();
    }
}

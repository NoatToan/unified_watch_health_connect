package sw;

import ds.e0;
import i3.e5;
import java.util.Map;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsw/a;", "", "", "minX", "maxX", "minY", "maxY", "yLabelStep", "xLabelStep", "<init>", "(IIIIII)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f161043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f161044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f161045f;

    public a(int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f161040a = i14;
        this.f161041b = i15;
        this.f161042c = i16;
        this.f161043d = i17;
        this.f161044e = i18;
        this.f161045f = i19;
    }

    public static a a(a aVar, int i14, int i15, int i16, int i17, int i18) {
        if ((i18 & 1) != 0) {
            i14 = aVar.f161040a;
        }
        int i19 = i14;
        if ((i18 & 4) != 0) {
            i16 = aVar.f161042c;
        }
        return new a(i19, i15, i16, i17, aVar.f161044e, aVar.f161045f);
    }

    public final boolean b(kw.m mVar) {
        Map<kw.b, kw.f> map;
        kw.f fVar;
        if ((mVar != null ? mVar.f106877a : null) == kw.j.WORLD || mVar == null || (map = mVar.f106878b) == null || (fVar = map.get(kw.b.FIVE)) == null) {
            return false;
        }
        return (this.f161043d > fVar.f106838c) || (this.f161041b > fVar.f106841f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f161040a == aVar.f161040a && this.f161041b == aVar.f161041b && this.f161042c == aVar.f161042c && this.f161043d == aVar.f161043d && this.f161044e == aVar.f161044e && this.f161045f == aVar.f161045f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161045f) + q2.d(this.f161044e, q2.d(this.f161043d, q2.d(this.f161042c, q2.d(this.f161041b, Integer.hashCode(this.f161040a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f161040a, this.f161041b, "BloodPressureChartZoom(minX=", ", maxX=", ", minY=");
        e0.m(this.f161042c, this.f161043d, ", maxY=", ", yLabelStep=", sbJ);
        return androidx.core.view.j.e(this.f161044e, this.f161045f, ", xLabelStep=", ")", sbJ);
    }
}

package za1;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lza1/g;", "", "", "distance", "powerValue", "powerUnit", "powerLabel", "", "powerColorResId", "elevationValue", "elevationUnit", "elevationLabel", "elevationColorResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f203314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f203315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f203316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f203317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f203318i;

    public g(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, int i14) {
        hb.a.p(str, str2, str4, str5, str7);
        this.f203310a = str;
        this.f203311b = str2;
        this.f203312c = str3;
        this.f203313d = str4;
        this.f203314e = num;
        this.f203315f = str5;
        this.f203316g = str6;
        this.f203317h = str7;
        this.f203318i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f203310a.equals(gVar.f203310a) && this.f203311b.equals(gVar.f203311b) && s.g(this.f203312c, gVar.f203312c) && this.f203313d.equals(gVar.f203313d) && s.g(this.f203314e, gVar.f203314e) && this.f203315f.equals(gVar.f203315f) && s.g(this.f203316g, gVar.f203316g) && this.f203317h.equals(gVar.f203317h) && this.f203318i == gVar.f203318i;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f203310a.hashCode() * 31, 31, this.f203311b);
        String str = this.f203312c;
        int iJ2 = wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f203313d);
        Integer num = this.f203314e;
        int iJ3 = wr.g.j((iJ2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f203315f);
        String str2 = this.f203316g;
        return Integer.hashCode(this.f203318i) + wr.g.j((iJ3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f203317h);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("PowerGuideMarkerData(distance=", this.f203310a, ", powerValue=", this.f203311b, ", powerUnit=");
        sn.a.t(sbI, this.f203312c, ", powerLabel=", this.f203313d, ", powerColorResId=");
        p6.b.l(this.f203314e, ", elevationValue=", this.f203315f, ", elevationUnit=", sbI);
        sn.a.t(sbI, this.f203316g, ", elevationLabel=", this.f203317h, ", elevationColorResId=");
        return j.q(sbI, this.f203318i, ")");
    }
}

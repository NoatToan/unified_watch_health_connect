package o51;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo51/a;", "", "", "xValue", "", "distance", "pace", "elevation", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f129204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f129205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f129206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f129207d;

    public a(float f14, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f129204a = f14;
        this.f129205b = str;
        this.f129206c = str2;
        this.f129207d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f129204a, aVar.f129204a) == 0 && s.g(this.f129205b, aVar.f129205b) && s.g(this.f129206c, aVar.f129206c) && s.g(this.f129207d, aVar.f129207d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Float.hashCode(this.f129204a) * 31, 31, this.f129205b), 31, this.f129206c);
        String str = this.f129207d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PaceProChartMarkerState(xValue=");
        sb3.append(this.f129204a);
        sb3.append(", distance=");
        sb3.append(this.f129205b);
        sb3.append(", pace=");
        return e5.h(sb3, this.f129206c, ", elevation=", this.f129207d, ")");
    }

    public /* synthetic */ a(float f14, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, str, str2, (i14 & 8) != 0 ? null : str3);
    }
}

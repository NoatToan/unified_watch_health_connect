package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/p;", "", "", "Lnr/m0;", "personalRecordsData", "", "shouldShowPersonalRecordBanner", "shouldHideLinkedEventBanner", "shouldHideLinkTrailBanner", "shouldShowExcludeFromPhysioMetricsBanner", "<init>", "(Ljava/util/List;ZZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m0> f127277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127281e;

    public p(List<m0> list, boolean z14, boolean z15, boolean z16, boolean z17) {
        list.getClass();
        this.f127277a = list;
        this.f127278b = z14;
        this.f127279c = z15;
        this.f127280d = z16;
        this.f127281e = z17;
    }

    public static p a(p pVar, List list, boolean z14, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            list = pVar.f127277a;
        }
        List list2 = list;
        if ((i14 & 2) != 0) {
            z14 = pVar.f127278b;
        }
        boolean z16 = z14;
        boolean z17 = (i14 & 4) != 0 ? pVar.f127279c : true;
        boolean z18 = (i14 & 8) != 0 ? pVar.f127280d : true;
        if ((i14 & 16) != 0) {
            z15 = pVar.f127281e;
        }
        pVar.getClass();
        list2.getClass();
        return new p(list2, z16, z17, z18, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f127277a.equals(pVar.f127277a) && this.f127278b == pVar.f127278b && this.f127279c == pVar.f127279c && this.f127280d == pVar.f127280d && this.f127281e == pVar.f127281e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127281e) + q6.f.g(q6.f.g(q6.f.g(this.f127277a.hashCode() * 31, 31, this.f127278b), 31, this.f127279c), 31, this.f127280d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BannerData(personalRecordsData=");
        sb3.append(this.f127277a);
        sb3.append(", shouldShowPersonalRecordBanner=");
        sb3.append(this.f127278b);
        sb3.append(", shouldHideLinkedEventBanner=");
        kg.f.q(", shouldHideLinkTrailBanner=", ", shouldShowExcludeFromPhysioMetricsBanner=", sb3, this.f127279c, this.f127280d);
        return hb.a.k(sb3, this.f127281e, ")");
    }
}

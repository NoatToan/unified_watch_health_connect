package l70;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u008a\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll70/s;", "", "", "Lj70/v;", "sections", "Lj70/b;", "primaryStats", "secondaryStatsFavorites", "secondaryStatOthers", "secondaryStats", "yesterdayStats", "lastSevenDayStats", "essentialsStats", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j70.v> f110777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j70.b> f110778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j70.b> f110779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<j70.b> f110780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<j70.b> f110781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<j70.b> f110782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<j70.b> f110783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<j70.b> f110784h;

    public s(List<j70.v> list, List<j70.b> list2, List<j70.b> list3, List<j70.b> list4, List<j70.b> list5, List<j70.b> list6, List<j70.b> list7, List<j70.b> list8) {
        this.f110777a = list;
        this.f110778b = list2;
        this.f110779c = list3;
        this.f110780d = list4;
        this.f110781e = list5;
        this.f110782f = list6;
        this.f110783g = list7;
        this.f110784h = list8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f110777a, sVar.f110777a) && p005kotlin.jvm.internal.s.g(this.f110778b, sVar.f110778b) && p005kotlin.jvm.internal.s.g(this.f110779c, sVar.f110779c) && p005kotlin.jvm.internal.s.g(this.f110780d, sVar.f110780d) && p005kotlin.jvm.internal.s.g(this.f110781e, sVar.f110781e) && p005kotlin.jvm.internal.s.g(this.f110782f, sVar.f110782f) && p005kotlin.jvm.internal.s.g(this.f110783g, sVar.f110783g) && p005kotlin.jvm.internal.s.g(this.f110784h, sVar.f110784h);
    }

    public final int hashCode() {
        List<j70.v> list = this.f110777a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<j70.b> list2 = this.f110778b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<j70.b> list3 = this.f110779c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<j70.b> list4 = this.f110780d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<j70.b> list5 = this.f110781e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<j70.b> list6 = this.f110782f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<j70.b> list7 = this.f110783g;
        int iHashCode7 = (iHashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<j70.b> list8 = this.f110784h;
        return iHashCode7 + (list8 != null ? list8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("CommonStatsConfig(sections=", ", primaryStats=", ", secondaryStatsFavorites=", this.f110777a, this.f110778b);
        n23.j.z(sbK, this.f110779c, ", secondaryStatOthers=", this.f110780d, ", secondaryStats=");
        n23.j.z(sbK, this.f110781e, ", yesterdayStats=", this.f110782f, ", lastSevenDayStats=");
        return n23.j.j(sbK, this.f110783g, ", essentialsStats=", this.f110784h, ")");
    }
}

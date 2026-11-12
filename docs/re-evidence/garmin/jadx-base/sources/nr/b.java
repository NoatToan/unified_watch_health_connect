package nr;

import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012(\b\u0002\u0010\f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnr/b;", "", "", "title", "subtitle", "", "Lr22/p;", "stats", "Lim/b;", "chartData", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "chips", "Lkotlin/Function0;", "", "onHelp", "onChartNavigate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lim/b;Ljava/util/LinkedHashMap;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<r22.p> f126985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final im.b f126986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap<String, Object> f126987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f126988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f126989g;

    public /* synthetic */ b(String str, String str2, List list, im.b bVar, LinkedHashMap linkedHashMap, e23.a aVar, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, list, bVar, (i14 & 16) != 0 ? null : linkedHashMap, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f126983a, bVar.f126983a) && p005kotlin.jvm.internal.s.g(this.f126984b, bVar.f126984b) && p005kotlin.jvm.internal.s.g(this.f126985c, bVar.f126985c) && p005kotlin.jvm.internal.s.g(this.f126986d, bVar.f126986d) && p005kotlin.jvm.internal.s.g(this.f126987e, bVar.f126987e) && p005kotlin.jvm.internal.s.g(this.f126988f, bVar.f126988f) && p005kotlin.jvm.internal.s.g(this.f126989g, bVar.f126989g);
    }

    public final int hashCode() {
        String str = this.f126983a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f126984b;
        int iHashCode2 = (this.f126986d.hashCode() + lc.u0.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f126985c)) * 31;
        LinkedHashMap<String, Object> linkedHashMap = this.f126987e;
        int iHashCode3 = (iHashCode2 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        e23.a<Unit> aVar = this.f126988f;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e23.a<Unit> aVar2 = this.f126989g;
        return iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivityChartItemState(title=", this.f126983a, ", subtitle=", this.f126984b, ", stats=");
        sbI.append(this.f126985c);
        sbI.append(", chartData=");
        sbI.append(this.f126986d);
        sbI.append(", chips=");
        sbI.append(this.f126987e);
        sbI.append(", onHelp=");
        sbI.append(this.f126988f);
        sbI.append(", onChartNavigate=");
        return n23.j.i(sbI, this.f126989g, ")");
    }

    public b(String str, String str2, List<r22.p> list, im.b bVar, LinkedHashMap<String, Object> linkedHashMap, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        list.getClass();
        bVar.getClass();
        this.f126983a = str;
        this.f126984b = str2;
        this.f126985c = list;
        this.f126986d = bVar;
        this.f126987e = linkedHashMap;
        this.f126988f = aVar;
        this.f126989g = aVar2;
    }
}

package yq0;

import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyq0/b;", "", "Ltq0/d;", "demographicSelectionDTO", "Ltq0/e;", "selectedGender", "", "selectedAge", "", "Ltq0/l;", "visibleActivities", "Ltq0/f;", "preferenceList", "<init>", "(Ltq0/d;Ltq0/e;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tq0.d f198733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tq0.e f198734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f198735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<tq0.l> f198736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<tq0.f> f198737e;

    public b(tq0.d dVar, tq0.e eVar, String str, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new tq0.d((List) null, (List) null, (List) null, (List) null, 15, (p005kotlin.jvm.internal.j) null) : dVar, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? Rule.ALL : str, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? j0.f134944a : list2);
    }

    public static b a(b bVar, tq0.e eVar, String str, ArrayList arrayList, List list, int i14) {
        tq0.e eVar2 = eVar;
        tq0.d dVar = bVar.f198733a;
        if ((i14 & 2) != 0) {
            eVar2 = bVar.f198734b;
        }
        if ((i14 & 4) != 0) {
            str = bVar.f198735c;
        }
        List<tq0.l> list2 = arrayList;
        if ((i14 & 8) != 0) {
            list2 = bVar.f198736d;
        }
        if ((i14 & 16) != 0) {
            list = bVar.f198737e;
        }
        List list3 = list;
        bVar.getClass();
        dVar.getClass();
        str.getClass();
        list2.getClass();
        list3.getClass();
        List<tq0.l> list4 = list2;
        return new b(dVar, eVar2, str, list4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f198733a, bVar.f198733a) && s.g(this.f198734b, bVar.f198734b) && s.g(this.f198735c, bVar.f198735c) && s.g(this.f198736d, bVar.f198736d) && s.g(this.f198737e, bVar.f198737e);
    }

    public final int hashCode() {
        int iHashCode = this.f198733a.hashCode() * 31;
        tq0.e eVar = this.f198734b;
        return this.f198737e.hashCode() + u0.b(wr.g.j((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f198735c), 31, this.f198736d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsightsDemographicFilters(demographicSelectionDTO=");
        sb3.append(this.f198733a);
        sb3.append(", selectedGender=");
        sb3.append(this.f198734b);
        sb3.append(", selectedAge=");
        e0.o(this.f198735c, ", visibleActivities=", ", preferenceList=", sb3, this.f198736d);
        return z.c(sb3, this.f198737e, ")");
    }

    public b(tq0.d dVar, tq0.e eVar, String str, List<tq0.l> list, List<tq0.f> list2) {
        dVar.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f198733a = dVar;
        this.f198734b = eVar;
        this.f198735c = str;
        this.f198736d = list;
        this.f198737e = list2;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }
}

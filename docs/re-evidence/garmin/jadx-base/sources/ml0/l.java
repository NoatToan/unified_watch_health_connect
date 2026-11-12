package ml0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lml0/l;", "", "", "isLoading", "", "searchQuery", "", "Lil0/a;", FirebaseAnalytics.Param.ITEMS, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "endReached", "", "page", "Lml0/k;", "searchGolfCoursesQueryType", "<init>", "(ZLjava/lang/String;Ljava/util/List;ZZILml0/k;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f119244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f119245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<il0.a> f119246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f119247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f119248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f119249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f119250g;

    public l(boolean z14, String str, List list, boolean z15, boolean z16, int i14, k kVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? j0.f134944a : list, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? 1 : i14, (i15 & 64) != 0 ? k.LOCATION : kVar);
    }

    public static l a(l lVar, boolean z14, String str, ArrayList arrayList, boolean z15, int i14, int i15) {
        if ((i15 & 1) != 0) {
            z14 = lVar.f119244a;
        }
        boolean z16 = z14;
        if ((i15 & 2) != 0) {
            str = lVar.f119245b;
        }
        String str2 = str;
        List<il0.a> list = arrayList;
        if ((i15 & 4) != 0) {
            list = lVar.f119246c;
        }
        List<il0.a> list2 = list;
        boolean z17 = (i15 & 8) != 0 ? lVar.f119247d : true;
        if ((i15 & 16) != 0) {
            z15 = lVar.f119248e;
        }
        boolean z18 = z15;
        if ((i15 & 32) != 0) {
            i14 = lVar.f119249f;
        }
        k kVar = lVar.f119250g;
        lVar.getClass();
        str2.getClass();
        list2.getClass();
        kVar.getClass();
        return new l(z16, str2, list2, z17, z18, i14, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f119244a == lVar.f119244a && p005kotlin.jvm.internal.s.g(this.f119245b, lVar.f119245b) && p005kotlin.jvm.internal.s.g(this.f119246c, lVar.f119246c) && this.f119247d == lVar.f119247d && this.f119248e == lVar.f119248e && this.f119249f == lVar.f119249f && this.f119250g == lVar.f119250g;
    }

    public final int hashCode() {
        return this.f119250g.hashCode() + q2.d(this.f119249f, q6.f.g(q6.f.g(u0.b(wr.g.j(Boolean.hashCode(this.f119244a) * 31, 31, this.f119245b), 31, this.f119246c), 31, this.f119247d), 31, this.f119248e), 31);
    }

    public final String toString() {
        return "SearchGolfCoursesUIState(isLoading=" + this.f119244a + ", searchQuery=" + this.f119245b + ", items=" + this.f119246c + ", error=" + this.f119247d + ", endReached=" + this.f119248e + ", page=" + this.f119249f + ", searchGolfCoursesQueryType=" + this.f119250g + ")";
    }

    public l(boolean z14, String str, List<il0.a> list, boolean z15, boolean z16, int i14, k kVar) {
        str.getClass();
        list.getClass();
        kVar.getClass();
        this.f119244a = z14;
        this.f119245b = str;
        this.f119246c = list;
        this.f119247d = z15;
        this.f119248e = z16;
        this.f119249f = i14;
        this.f119250g = kVar;
    }

    public l() {
        this(false, null, null, false, false, 0, null, 127, null);
    }
}

package n30;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln30/l;", "", "", "isLoading", "Ln50/a;", "operationInProgress", "shouldHideBackButtonFromAccessibility", "", "Ln30/k;", "multipleCoursesStackEntries", "Ln30/h;", "courseTutorialData", "Ll40/d;", "courseMapOptions", "<init>", "(ZLn50/a;ZLjava/util/List;Ln30/h;Ll40/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.a f123526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<k> f123528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f123529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l40.d f123530f;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(boolean z14, n50.a aVar, boolean z15, List list, h hVar, l40.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        aVar = (i14 & 2) != 0 ? null : aVar;
        z15 = (i14 & 4) != 0 ? false : z15;
        list = (i14 & 8) != 0 ? j0.f134944a : list;
        hVar = (i14 & 16) != 0 ? new h(false, false, false, 7, null) : hVar;
        if ((i14 & 32) != 0) {
            l40.d.f109892n.getClass();
            dVar = l40.d.a.a();
        }
        this(z14, aVar, z15, list, hVar, dVar);
    }

    public static l a(l lVar, boolean z14, n50.a aVar, boolean z15, List list, h hVar, l40.d dVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = lVar.f123525a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            aVar = lVar.f123526b;
        }
        n50.a aVar2 = aVar;
        if ((i14 & 4) != 0) {
            z15 = lVar.f123527c;
        }
        boolean z17 = z15;
        if ((i14 & 8) != 0) {
            list = lVar.f123528d;
        }
        List list2 = list;
        if ((i14 & 16) != 0) {
            hVar = lVar.f123529e;
        }
        h hVar2 = hVar;
        if ((i14 & 32) != 0) {
            dVar = lVar.f123530f;
        }
        l40.d dVar2 = dVar;
        lVar.getClass();
        list2.getClass();
        hVar2.getClass();
        dVar2.getClass();
        return new l(z16, aVar2, z17, list2, hVar2, dVar2);
    }

    public final List<w20.a> b() {
        k kVar = (k) h0.n0(this.f123528d);
        if (kVar != null) {
            return kVar.f123522a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f123525a == lVar.f123525a && this.f123526b == lVar.f123526b && this.f123527c == lVar.f123527c && s.g(this.f123528d, lVar.f123528d) && s.g(this.f123529e, lVar.f123529e) && s.g(this.f123530f, lVar.f123530f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f123525a) * 31;
        n50.a aVar = this.f123526b;
        return this.f123530f.hashCode() + ((this.f123529e.hashCode() + u0.b(q6.f.g((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f123527c), 31, this.f123528d)) * 31);
    }

    public final String toString() {
        return "MultipleCoursesState(isLoading=" + this.f123525a + ", operationInProgress=" + this.f123526b + ", shouldHideBackButtonFromAccessibility=" + this.f123527c + ", multipleCoursesStackEntries=" + this.f123528d + ", courseTutorialData=" + this.f123529e + ", courseMapOptions=" + this.f123530f + ")";
    }

    public l(boolean z14, n50.a aVar, boolean z15, List<k> list, h hVar, l40.d dVar) {
        list.getClass();
        hVar.getClass();
        dVar.getClass();
        this.f123525a = z14;
        this.f123526b = aVar;
        this.f123527c = z15;
        this.f123528d = list;
        this.f123529e = hVar;
        this.f123530f = dVar;
    }

    public l() {
        this(false, null, false, null, null, null, 63, null);
    }
}

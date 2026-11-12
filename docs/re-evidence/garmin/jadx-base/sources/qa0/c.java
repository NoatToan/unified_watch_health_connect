package qa0;

import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqa0/c;", "", "", "isLoading", "shouldMigrate", "", "Lsg1/c;", "backupsUiElements", "backupError", "navigateToNext", "<init>", "(ZZLjava/util/List;ZZ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f143841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<sg1.c> f143843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f143844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f143845e;

    public c(boolean z14, boolean z15, List list, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17);
    }

    public static c a(c cVar, ArrayList arrayList, int i14) {
        boolean z14 = (i14 & 1) != 0 ? cVar.f143841a : false;
        boolean z15 = (i14 & 2) != 0 ? cVar.f143842b : true;
        List<sg1.c> list = arrayList;
        if ((i14 & 4) != 0) {
            list = cVar.f143843c;
        }
        List<sg1.c> list2 = list;
        boolean z16 = (i14 & 8) != 0 ? cVar.f143844d : true;
        boolean z17 = (i14 & 16) != 0 ? cVar.f143845e : true;
        cVar.getClass();
        list2.getClass();
        return new c(z14, z15, list2, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f143841a == cVar.f143841a && this.f143842b == cVar.f143842b && s.g(this.f143843c, cVar.f143843c) && this.f143844d == cVar.f143844d && this.f143845e == cVar.f143845e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143845e) + q6.f.g(u0.b(q6.f.g(Boolean.hashCode(this.f143841a) * 31, 31, this.f143842b), 31, this.f143843c), 31, this.f143844d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("DeviceMigrationUiState(isLoading=", ", shouldMigrate=", ", backupsUiElements=", this.f143841a, this.f143842b);
        sbM.append(this.f143843c);
        sbM.append(", backupError=");
        sbM.append(this.f143844d);
        sbM.append(", navigateToNext=");
        return hb.a.k(sbM, this.f143845e, ")");
    }

    public c(boolean z14, boolean z15, List<sg1.c> list, boolean z16, boolean z17) {
        list.getClass();
        this.f143841a = z14;
        this.f143842b = z15;
        this.f143843c = list;
        this.f143844d = z16;
        this.f143845e = z17;
    }

    public c() {
        this(false, false, null, false, false, 31, null);
    }
}

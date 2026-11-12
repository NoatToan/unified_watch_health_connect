package ns1;

import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.y;
import us1.h;
import us1.i;
import us1.j;
import us1.m;
import us1.n;
import zk.d;
import zk.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns1/a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f127814a = new a();

    private a() {
    }

    public static void a(n nVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        nVar.getClass();
        qs1.n nVar2 = nVar.f172449g;
        qs1.n nVar3 = nVar.f172448f;
        int iB = nVar3 != null ? nVar3.b(nVar3.f147317a) : 0;
        int iB2 = nVar3 != null ? nVar3.b(nVar3.f147318b) : 0;
        int iB3 = nVar2 != null ? nVar2.b(nVar2.f147317a) : 0;
        int iB4 = nVar2 != null ? nVar2.b(nVar2.f147318b) : 0;
        boolean z14 = nVar.f172445c;
        c<j> cVar = nVar.f172446d;
        if (cVar != null) {
            ArrayList arrayList5 = new ArrayList(y.r(cVar, 10));
            Iterator<j> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList5.add(Integer.valueOf((int) it.next().f172423a));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        c<h> cVar2 = nVar.f172447e;
        if (cVar2 != null) {
            ArrayList arrayList6 = new ArrayList(y.r(cVar2, 10));
            Iterator<h> it3 = cVar2.iterator();
            while (it3.hasNext()) {
                arrayList6.add(Integer.valueOf(it3.next().f172407a));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        c<m> cVar3 = nVar.f172444b;
        if (cVar3 != null) {
            ArrayList arrayList7 = new ArrayList(y.r(cVar3, 10));
            Iterator<m> it4 = cVar3.iterator();
            while (it4.hasNext()) {
                arrayList7.add(it4.next().f172441a);
            }
            arrayList3 = arrayList7;
        } else {
            arrayList3 = null;
        }
        c<i> cVar4 = nVar.f172443a;
        if (cVar4 != null) {
            ArrayList arrayList8 = new ArrayList(y.r(cVar4, 10));
            Iterator<i> it5 = cVar4.iterator();
            while (it5.hasNext()) {
                arrayList8.add(it5.next().f172417a);
            }
            arrayList4 = arrayList8;
        } else {
            arrayList4 = null;
        }
        zk.a aVar = new zk.a("TRAILS_FILTERS_APPLIED", w.c(new e("trailsFilter", new os1.a(iB, iB2, iB3, iB4, z14, arrayList, arrayList2, arrayList3, arrayList4))), false, 0L, 12, null);
        zk.c cVar5 = zk.c.f205034a;
        List listC = w.c("GCS");
        cVar5.getClass();
        new d(cVar5, null, listC).a(aVar);
    }
}

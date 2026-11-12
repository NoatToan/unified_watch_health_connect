package r12;

import a22.i;
import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.v2;
import f12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import li0.b0;
import li0.d0;
import li0.e0;
import li0.l0;
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;
import r53.z1;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr12/d;", "Lei0/b;", "Lcom/garmin/android/apps/connectmobile/connections/model/b;", "Lr53/z1;", "", "", "Lli0/l0;", "stateMap", "Lei0/d;", "followRepo", "La22/i;", "userProfileRepo", "", "startIndex", "pageSize", "<init>", "(Lr53/z1;Lei0/d;La22/i;II)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends ei0.b<com.garmin.android.apps.connectmobile.connections.model.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<Map<String, l0>> f149409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0.d f149410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f149411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z1<Map<String, l0>> z1Var, ei0.d dVar, i iVar, int i14, int i15) {
        super(i14, i15);
        z1Var.getClass();
        dVar.getClass();
        iVar.getClass();
        this.f149409e = z1Var;
        this.f149410f = dVar;
        this.f149411g = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ei0.b
    public final Object f(List list, v13.c cVar) {
        b bVar;
        String profileImageUrlMedium;
        j profileImageUrls;
        List<com.garmin.android.apps.connectmobile.connections.model.b> list2 = list;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f149405e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f149405e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f149403c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f149405e;
        if (i15 == 0) {
            r.b(objA);
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((com.garmin.android.apps.connectmobile.connections.model.b) it.next()).getUserProfileId()));
            }
            List<String> listB1 = h0.b1(h0.f1(arrayList));
            List<? extends k> listC = w.c(k.PREMIUM_FRIEND);
            bVar.f149401a = list2;
            bVar.f149405e = 1;
            objA = this.f149411g.a(listB1, listC, bVar);
            if (objA != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = bVar.f149402b;
            r.b(objA);
            return arrayList2;
        }
        list2 = bVar.f149401a;
        r.b(objA);
        Map map = (Map) objA;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            com.garmin.android.apps.connectmobile.connections.model.b bVar2 = (com.garmin.android.apps.connectmobile.connections.model.b) it3.next();
            Long userProfileId = bVar2.getUserProfileId();
            l lVar = (l) map.get(userProfileId != null ? new Integer((int) userProfileId.longValue()) : null);
            if ((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls.f46879h) == null) && (profileImageUrlMedium = bVar2.getProfileImageUrlMedium()) == null) {
                profileImageUrlMedium = "";
            }
            bVar2.f31694i = new b12.b(profileImageUrlMedium, null, u.a(bVar2.getUserLevel()), null, null, 26, null);
        }
        ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
        for (com.garmin.android.apps.connectmobile.connections.model.b bVar3 : list2) {
            bVar3.getClass();
            arrayList3.add(new d0(bVar3.f31694i, b0.UNMUTE, bVar3.getDisplayName(), bVar3.getFullName(), false, bVar3.getLocation(), null, null, null, 464, null));
        }
        bVar.f149401a = null;
        bVar.f149402b = arrayList3;
        bVar.f149405e = 2;
        return e0.c(arrayList3, this.f149409e, bVar) == aVar ? aVar : arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f149408c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f149408c = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objH2 = cVar2.f149406a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar2.f149408c;
        if (i17 == 0) {
            r.b(objH2);
            Integer num = new Integer(i14);
            Integer num2 = new Integer(i15);
            cVar2.f149408c = 1;
            objH2 = this.f149410f.h2(num, num2, cVar2);
            if (objH2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH2);
        }
        v2 v2Var = (v2) objH2;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        List<com.garmin.android.apps.connectmobile.connections.model.b> listB = ((com.garmin.android.apps.connectmobile.connections.model.d) ((v2.b) v2Var).f47386a).b();
        if (listB != null) {
            return listB;
        }
        h.z("Result is null");
        return null;
    }
}

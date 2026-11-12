package q12;

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
import o13.r;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;
import q6.f;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq12/c;", "Lei0/b;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/d;", "Lei0/d;", "followRepo", "La22/i;", "userProfileRepo", "", "startIndex", "pageSize", "<init>", "(Lei0/d;La22/i;II)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ei0.b<com.garmin.android.apps.connectmobile.userprofile.model.d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ei0.d f142083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f142084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ei0.d dVar, i iVar, int i14, int i15) {
        super(i14, i15);
        dVar.getClass();
        iVar.getClass();
        this.f142083e = dVar;
        this.f142084f = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.b
    public final Object f(List list, v13.c cVar) {
        a aVar;
        String profileImageUrlMedium;
        j profileImageUrls;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f142079d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f142079d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objA = aVar.f142077b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f142079d;
        if (i15 == 0) {
            r.b(objA);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((com.garmin.android.apps.connectmobile.userprofile.model.d) it.next()).getUserProfileId()));
            }
            List<String> listB1 = h0.b1(h0.f1(arrayList));
            List<? extends k> listC = w.c(k.PREMIUM_FRIEND);
            aVar.f142076a = list;
            aVar.f142079d = 1;
            objA = this.f142084f.a(listB1, listC, aVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = aVar.f142076a;
            r.b(objA);
        }
        Map map = (Map) objA;
        for (com.garmin.android.apps.connectmobile.userprofile.model.d dVar : list) {
            l lVar = (l) f.l((int) dVar.getUserProfileId(), map);
            if ((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (profileImageUrlMedium = profileImageUrls.f46879h) == null) && (profileImageUrlMedium = dVar.getProfileImageUrlMedium()) == null) {
                profileImageUrlMedium = "";
            }
            dVar.f46849i = new b12.b(profileImageUrlMedium, null, u.a(dVar.getUserLevel()), null, null, 26, null);
        }
        ArrayList arrayList2 = new ArrayList(y.r(list, 10));
        for (com.garmin.android.apps.connectmobile.userprofile.model.d dVar2 : list) {
            dVar2.getClass();
            arrayList2.add(new d0(dVar2.f46849i, b0.UNBLOCK, dVar2.getDisplayName(), dVar2.getFullName(), false, null, null, null, null, 496, null));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i16 = bVar.f142082c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                bVar.f142082c = i16 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objH3 = bVar.f142080a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = bVar.f142082c;
        if (i17 == 0) {
            r.b(objH3);
            bVar.f142082c = 1;
            objH3 = this.f142083e.h3(i14, i15, bVar);
            if (objH3 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objH3);
        }
        v2 v2Var = (v2) objH3;
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        u0.r();
        return null;
    }
}

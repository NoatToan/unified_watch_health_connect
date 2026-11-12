package m12;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm12/k;", "", "La22/a;", "avatarsRepo", "<init>", "(La22/a;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a22.a f115838a;

    public k(a22.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            a22.a.f525b.getClass();
            aVar = new a22.a((a22.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, a22.d.class, new c83.h.a[0], null, null, null, 120));
        }
        this(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, v13.c cVar) {
        i iVar;
        com.garmin.android.apps.connectmobile.userprofile.model.a aVar;
        int iNextInt;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f115832c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f115832c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f115830a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f115832c;
        if (i15 == 0) {
            o13.r.b(objB);
            iVar.f115832c = 1;
            objB = b(str, iVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        List list = (List) bVar.f47386a;
        if (list.isEmpty()) {
            aVar = null;
        } else {
            do {
                iNextInt = new SecureRandom().nextInt(list.size());
            } while (((com.garmin.android.apps.connectmobile.userprofile.model.a) list.get(iNextInt)).getIsGolf());
            aVar = (com.garmin.android.apps.connectmobile.userprofile.model.a) list.get(iNextInt);
        }
        return aVar == null ? new v2.a(new Exception("No suitable default avatar found"), null, "Failed to select default avatar", 2, null) : new v2.b(new o13.p(list, aVar), bVar.f47387b, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, v13.c cVar) {
        j jVar;
        ArrayList arrayList;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f115837e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f115837e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.f115835c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f115837e;
        if (i15 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            jVar.f115833a = str;
            jVar.f115834b = arrayListX;
            jVar.f115837e = 1;
            a22.a aVar2 = this.f115838a;
            aVar2.getClass();
            Object objJ = f0.J(aVar2, new a22.b(aVar2, null), jVar);
            if (objJ == aVar) {
                return aVar;
            }
            arrayList = arrayListX;
            obj = objJ;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = jVar.f115834b;
            String str2 = jVar.f115833a;
            o13.r.b(obj);
            arrayList = arrayList2;
            str = str2;
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            v2.a aVar3 = (v2.a) v2Var;
            return new v2.a(aVar3.f47383a, aVar3.f47384b, "Failed to fetch avatars");
        }
        if (!(v2Var instanceof v2.b)) {
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        com.garmin.android.apps.connectmobile.userprofile.model.b bVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.b) bVar.f47386a;
        String baseUrl = bVar2.getBaseUrl();
        List<com.garmin.android.apps.connectmobile.userprofile.model.a> listB = bVar2.b();
        if (baseUrl == null || listB == null) {
            return new v2.a(new Exception("Invalid avatar data"), null, androidx.room.a0.j("Failed to fetch avatars: baseUrl: ", baseUrl, ", avatars: ", listB != null ? h0.k0(listB, null, null, null, null, 63) : null), 2, null);
        }
        for (com.garmin.android.apps.connectmobile.userprofile.model.a aVar4 : listB) {
            aVar4.g(str + baseUrl + aVar4.getImage());
        }
        arrayList.addAll(listB);
        return new v2.b(arrayList, bVar.f47387b, null, null, 12, null);
    }

    public k(a22.a aVar) {
        aVar.getClass();
        this.f115838a = aVar;
    }

    public k() {
        this(null, 1, null);
    }
}

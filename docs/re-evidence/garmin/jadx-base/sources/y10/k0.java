package y10;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly10/k0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0<m0> f193933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p10.a f193934b;

    public k0() {
        p10.a.f134883c.getClass();
        this.f193934b = new p10.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(k0 k0Var, Map map, v13.c cVar) {
        i0 i0Var;
        List<o10.a> list;
        k0Var.getClass();
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f193895d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f193895d = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(k0Var, cVar);
            }
        } else {
            i0Var = new i0(k0Var, cVar);
        }
        Object objAwait = i0Var.f193893b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f193895d;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<c83.a0<List<o10.a>>> i0VarB = k0Var.f193934b.a().b((String[]) map.keySet().toArray(new String[0]));
            i0Var.f193892a = map;
            i0Var.f193895d = 1;
            objAwait = i0VarB.await(i0Var);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = i0Var.f193892a;
            o13.r.b(objAwait);
        }
        c83.a0 a0Var = (c83.a0) objAwait;
        Response response = a0Var.f25745a;
        if (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) {
            return new v2.a(new IOException("Error occurred during posting apps icons!"), new Integer(response.code()), null, 4, null);
        }
        for (o10.a aVar2 : list) {
            o10.b bVar = (o10.b) map.get(aVar2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            if (bVar != null) {
                bVar.M(aVar2.getIconUrl());
            }
        }
        return new v2.b(new ArrayList(map.values()), response.code(), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(k0 k0Var, ArrayList arrayList, String str, v13.c cVar) {
        j0 j0Var;
        List list;
        k0Var.getClass();
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f193900c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f193900c = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(k0Var, cVar);
            }
        } else {
            j0Var = new j0(k0Var, cVar);
        }
        Object objAwait = j0Var.f193898a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f193900c;
        if (i15 == 0) {
            o13.r.b(objAwait);
            o53.i0<c83.a0<List<o10.b>>> i0VarC = k0Var.f193934b.a().c(new q10.d(str, hb2.h.b(), new com.garmin.android.apps.connectmobile.connectiq.j().a(arrayList)));
            j0Var.f193900c = 1;
            objAwait = i0VarC.await(j0Var);
            if (objAwait == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
        }
        c83.a0 a0Var = (c83.a0) objAwait;
        Response response = a0Var.f25745a;
        return (!response.isSuccessful() || (list = (List) a0Var.f25746b) == null) ? new v2.a(new IOException("Error occurred during posting apps updates!"), new Integer(response.code()), null, 4, null) : new v2.b(list, response.code(), null, null, 12, null);
    }
}

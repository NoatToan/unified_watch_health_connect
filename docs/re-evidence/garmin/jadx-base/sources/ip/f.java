package ip;

import am.b2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import java.io.Serializable;
import java.util.Map;
import lc.u0;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lip/f;", "Lip/i;", "Lam/b2;", "activityApi", "<init>", "(Lam/b2;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f94652a;

    public /* synthetic */ f(b2 b2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120) : b2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ip.i
    public final Serializable c(Map map, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f94648c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f94648c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.f94646a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f94648c;
        if (i15 == 0) {
            r.b(objJ);
            e eVar = new e(this, new to.h("REQUESTED", map), null);
            dVar.f94648c = 1;
            objJ = f0.J(this, eVar, dVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            int i16 = q.f128596b;
            return Boolean.TRUE;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        a2 a2Var = a2.ACTIVITIES;
        String string = aVar2.f47385c;
        if (string == null) {
            string = aVar2.toString();
        }
        w2.b(aVar2, a2Var, null, string);
        return i.a(aVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable f(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f94643c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f94643c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f94641a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f94643c;
        if (i15 == 0) {
            r.b(objJ);
            c cVar2 = new c(this, null);
            bVar.f94643c = 1;
            objJ = f0.J(this, cVar2, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var;
            if (bVar2.f47387b == 204) {
                int i16 = q.f128596b;
                return Boolean.FALSE;
            }
            boolean zContains = x.k("REQUESTED", "IN_PROGRESS").contains(((to.h) bVar2.f47386a).getStatus());
            int i17 = q.f128596b;
            return Boolean.valueOf(zContains);
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        int i18 = q.f128596b;
        v2.a aVar2 = (v2.a) v2Var;
        String string = aVar2.f47385c;
        if (string == null) {
            string = aVar2.toString();
        }
        return new q.b(new Exception(string));
    }

    public f(b2 b2Var) {
        b2Var.getClass();
        this.f94652a = b2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lip/l;", "Lip/i;", "Lam/b2;", "childActivityApi", "<init>", "(Lam/b2;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f94665a;

    public /* synthetic */ l(b2 b2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120) : b2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ip.i
    public final Serializable c(Map map, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f94661c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f94661c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f94659a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f94661c;
        if (i15 == 0) {
            r.b(objJ);
            k kVar = new k(this, new to.h("REQUESTED", map), null);
            jVar.f94661c = 1;
            objJ = f0.J(this, kVar, jVar);
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

    public l(b2 b2Var) {
        b2Var.getClass();
        this.f94665a = b2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

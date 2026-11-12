package e30;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le30/p;", "", "Lsa1/m;", "powerGuideRepo", "Ld60/b;", "coursesRepo", "<init>", "(Lsa1/m;Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f62710c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.m f62711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60.b f62712b;

    static {
        d60.b.a aVar = d60.b.f57806c;
        sa1.m.a aVar2 = sa1.m.f158284b;
    }

    public p(sa1.m mVar, d60.b bVar) {
        mVar.getClass();
        bVar.getClass();
        this.f62711a = mVar;
        this.f62712b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(p pVar, ab1.g gVar, v13.c cVar) {
        m mVar;
        Long l14;
        ab1.g gVar2;
        long j8;
        pVar.getClass();
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f62700e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f62700e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(pVar, cVar);
            }
        } else {
            mVar = new m(pVar, cVar);
        }
        Object objH = mVar.f62698c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f62700e;
        if (i15 == 0) {
            o13.r.b(objH);
            if (gVar == null || (l14 = gVar.f2568a) == null) {
                return null;
            }
            long jLongValue = l14.longValue();
            d60.b bVar = pVar.f62712b;
            mVar.f62696a = gVar;
            mVar.f62697b = jLongValue;
            mVar.f62700e = 1;
            objH = bVar.h(jLongValue, mVar);
            if (objH == aVar) {
                return aVar;
            }
            gVar2 = gVar;
            j8 = jLongValue;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = mVar.f62697b;
            gVar2 = mVar.f62696a;
            o13.r.b(objH);
        }
        v2 v2Var = (v2) objH;
        if (v2Var instanceof v2.b) {
            return w01.c.b((w01.c) ((v2.b) v2Var).f47386a, gVar2.f2581n, new Long(j8), gVar2.f2580m, null, null, 967);
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(p pVar, long j8, v13.c cVar) {
        n nVar;
        pVar.getClass();
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f62703c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f62703c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(pVar, cVar);
            }
        } else {
            nVar = new n(pVar, cVar);
        }
        Object objJ = nVar.f62701a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f62703c;
        if (i15 == 0) {
            o13.r.b(objJ);
            sa1.m mVar = pVar.f62711a;
            nVar.f62703c = 1;
            objJ = f0.J(mVar, new sa1.u(mVar, j8, null), nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (ab1.g) h0.d0((List) ((v2.b) v2Var).f47386a);
        }
        if (v2Var instanceof v2.a) {
            return null;
        }
        u0.r();
        return null;
    }
}

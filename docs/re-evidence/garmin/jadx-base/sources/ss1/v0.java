package ss1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import qt1.c1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lss1/v0;", "Lss1/a0;", "Lps1/b;", "reviewsApi", "<init>", "(Lps1/b;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps1.b f160763a;

    public v0(ps1.b bVar) {
        bVar.getClass();
        this.f160763a = bVar;
    }

    @Override // ss1.a0
    public final Object B0(long j8, qs1.u uVar, qt1.x xVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u0(this, j8, uVar, null), xVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss1.a0
    public final Object H0(long j8, String str, v13.c cVar) {
        k0 k0Var;
        String translatedText;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f160682c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f160682c = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        k0 k0Var2 = k0Var;
        Object objC = k0Var2.f160680a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var2.f160682c;
        if (i15 == 0) {
            o13.r.b(objC);
            l0 l0Var = new l0(this, j8, str, null);
            k0Var2.f160682c = 1;
            objC = C(l0Var, k0Var2);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b)) {
            return new v2.a(new Exception(), null, null, 6, null);
        }
        v2.b bVar = (v2.b) v2Var;
        qs1.y yVar = (qs1.y) bVar.f47386a;
        if (yVar == null || (translatedText = yVar.getTranslatedText()) == null) {
            translatedText = "";
        }
        return new v2.b(translatedText, bVar.f47387b, null, null, 12, null);
    }

    @Override // ss1.a0
    public final Object H2(vs1.a aVar) {
        return C(new m0(this, null), aVar);
    }

    @Override // ss1.a0
    public final Object I0(long j8, qs1.m mVar, qt1.k.h hVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p0(this, j8, mVar, null), hVar);
    }

    @Override // ss1.a0
    public final Object Q(long j8, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c0(this, j8, null), iVar);
    }

    @Override // ss1.a0
    public final Object R1(long j8, qt1.s0 s0Var) {
        return C(new r0(this, j8, null), s0Var);
    }

    @Override // ss1.a0
    public final Object S0(qs1.u uVar, qt1.t0 t0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s0(this, uVar, null), t0Var);
    }

    @Override // ss1.a0
    public final Object b1(vs1.i0 i0Var) {
        return C(new e0(this, null), i0Var);
    }

    @Override // ss1.a0
    public final Object b2(long j8, boolean z14, vs1.j jVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n0(z14, this, j8, null), jVar);
    }

    @Override // ss1.a0
    public final Object e1(long j8, qt1.a0 a0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f0(this, j8, null), a0Var);
    }

    @Override // ss1.a0
    public final Object h0(long j8, int i14, MultipartBody.Part part, vs1.f0 f0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t0(this, j8, i14, part, null), f0Var);
    }

    @Override // ss1.a0
    public final Object n0(long j8, qt1.z zVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, j8, null), zVar);
    }

    @Override // ss1.a0
    public final Object o2(long j8, qs1.m mVar, qt1.k.h hVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q0(this, j8, mVar, null), hVar);
    }

    @Override // ss1.a0
    public final Object q0(qt1.o0 o0Var) {
        return C(new i0(this, null), o0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss1.a0
    public final Serializable s3(long j8, v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f160651c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f160651c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objC = g0Var.f160649a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f160651c;
        if (i15 == 0) {
            o13.r.b(objC);
            h0 h0Var = new h0(this, j8, null);
            g0Var.f160651c = 1;
            objC = C(h0Var, g0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b)) {
            return p13.j0.f134944a;
        }
        qs1.a0 a0Var = (qs1.a0) ((v2.b) v2Var).f47386a;
        List<qs1.z> listA = a0Var != null ? a0Var.a() : null;
        if (listA == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((qs1.z) obj).getRatingDateMs() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q6.f.s(((qs1.z) it.next()).getTripReportId(), arrayList2);
        }
        return arrayList2;
    }

    @Override // ss1.a0
    public final Object u(long j8, long j14, c1 c1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b0(this, j8, j14, null), c1Var);
    }

    @Override // ss1.a0
    public final Object u2(long j8, qs1.g gVar, c1 c1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o0(this, j8, gVar, null), c1Var);
    }

    @Override // ss1.a0
    public final Object w0(long j8, us1.e eVar, int i14, int i15, v13.i iVar) {
        return C(new j0(this, j8, eVar, i14, i15, null), iVar);
    }
}

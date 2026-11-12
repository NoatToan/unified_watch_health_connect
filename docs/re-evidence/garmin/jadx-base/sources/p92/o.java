package p92;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import java.util.List;
import java.util.Locale;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import v92.c0;
import v92.e0;
import z10.g0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp92/o;", "", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f136619a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g0 f136620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static t92.b f136621c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {181}, m = "grantConsent")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f136622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q92.x f136623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f136624c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f136626e;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f136624c = obj;
            this.f136626e |= Integer.MIN_VALUE;
            return o.this.p(null, null, this);
        }
    }

    private o() {
    }

    public static p92.a l() {
        g0 g0Var = f136620b;
        if (g0Var != null) {
            return g0Var;
        }
        p005kotlin.jvm.internal.s.m("consentAppDelegate");
        throw null;
    }

    public static t92.b m() {
        t92.b bVar = f136621c;
        if (bVar != null) {
            return bVar;
        }
        p005kotlin.jvm.internal.s.m("consentPrefs");
        throw null;
    }

    public static q92.v n(q92.x xVar) {
        xVar.getClass();
        return m().d(xVar, null);
    }

    public static q92.v o(q92.x xVar, s92.l lVar) {
        xVar.getClass();
        return m().d(xVar, lVar);
    }

    public static void x(o oVar, ViewModelStoreOwner viewModelStoreOwner, n0 n0Var, e23.l lVar, z0 z0Var, z0 z0Var2, q92.x xVar, q92.v vVar, s92.g gVar, e0 e0Var, boolean z14, boolean z15, int i14) {
        q92.v vVar2 = (i14 & 128) != 0 ? null : vVar;
        s92.g gVar2 = (i14 & 256) != 0 ? null : gVar;
        e0 e0Var2 = (i14 & 512) != 0 ? e0.NO_ACTION : e0Var;
        boolean z16 = (i14 & 1024) != 0 ? false : z14;
        boolean z17 = (i14 & 2048) != 0 ? false : z15;
        oVar.getClass();
        viewModelStoreOwner.getClass();
        n0Var.getClass();
        z0Var.getClass();
        z0Var2.getClass();
        xVar.getClass();
        e0Var2.getClass();
        y(oVar, viewModelStoreOwner, n0Var, lVar, z0Var, z0Var2, xVar, vVar2, gVar2, e0Var2, null, z16, z17, 1024);
    }

    public static void y(o oVar, ViewModelStoreOwner viewModelStoreOwner, n0 n0Var, e23.l lVar, z0 z0Var, z0 z0Var2, q92.x xVar, q92.v vVar, s92.g gVar, e0 e0Var, s92.l lVar2, boolean z14, boolean z15, int i14) {
        v92.h hVarA;
        s92.l lVar3 = (i14 & 1024) != 0 ? null : lVar2;
        boolean z16 = (i14 & 2048) != 0 ? false : z14;
        oVar.getClass();
        if (vVar != null && gVar != null && !p005kotlin.jvm.internal.s.g(vVar.f143783a.f143819a, gVar.getConsentTypeId())) {
            vb.h.s("ConsentStatus and ConsentTextDTO should have the same consentTypeId");
            return;
        }
        v92.r rVar = (v92.r) new x1(viewModelStoreOwner, new c0(null, null, null, 7, null)).b(s0.f105811a.b(v92.r.class));
        w0 w0Var = rVar.f176476k;
        w0 w0Var2 = rVar.f176475j;
        rVar.f176469d = lVar3;
        rVar.f176470e = z16;
        w0Var2.l(n0Var);
        w0Var2.f(n0Var, new x.a(new c(z0Var, 1)));
        w0Var.l(n0Var);
        w0Var.f(n0Var, new x.a(new c(z0Var2, 2)));
        if (xVar == q92.x.DI_CONNECT_UPLOAD) {
            v92.h.f176379f.getClass();
            hVarA = v92.h.a.a(vVar, gVar, e0Var);
        } else {
            v92.h.f176379f.getClass();
            xVar.getClass();
            Bundle bundle = new Bundle();
            v92.h hVar = new v92.h();
            bundle.putSerializable("extra_consent_type_id", xVar);
            bundle.putParcelable("extra_consent_status", vVar);
            bundle.putParcelable("extra_consent_text_dto", gVar);
            bundle.putBoolean("extra_is_storage_depended", z15);
            hVar.setArguments(bundle);
            hVarA = hVar;
        }
        lVar.invoke(hVarA);
    }

    public static void z(o oVar, ViewModelStoreOwner viewModelStoreOwner, n0 n0Var, e23.l lVar, z0 z0Var, z0 z0Var2, q92.x xVar, s92.l lVar2, q92.v vVar, s92.g gVar, boolean z14, int i14) {
        s92.g gVar2 = (i14 & 512) != 0 ? null : gVar;
        boolean z15 = (i14 & 1024) != 0 ? false : z14;
        oVar.getClass();
        viewModelStoreOwner.getClass();
        n0Var.getClass();
        z0Var.getClass();
        z0Var2.getClass();
        xVar.getClass();
        y(oVar, viewModelStoreOwner, n0Var, lVar, z0Var, z0Var2, xVar, vVar, gVar2, e0.NO_ACTION, lVar2, false, z15, 2048);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object A(boolean z14, boolean z15, v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f136662c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f136662c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objF = wVar.f136660a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f136662c;
        if (i15 == 0) {
            o13.r.b(objF);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            wVar.f136662c = 1;
            objF = fVarA.f(z14, z15, wVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        q92.a0 a0Var = (q92.a0) objF;
        if (a0Var instanceof q92.a0.b) {
            return Boolean.valueOf(((s92.a) ((q92.a0.b) a0Var).f143609a).getValue());
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z14, v13.c cVar) throws Throwable {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f136581c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f136581c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objE0 = dVar.f136579a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f136581c;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            dVar.f136581c = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.i(fVarA, z14, null, null), dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            return (List) ((q92.a0.b) a0Var).f143609a;
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(q92.d dVar, v13.c cVar) throws Throwable {
        e eVar;
        o oVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f136586e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f136586e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objE0 = eVar.f136584c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f136586e;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            eVar.f136582a = this;
            eVar.f136583b = dVar;
            eVar.f136586e = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.k(dVar, fVarA, null, null), eVar);
            if (objE0 == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = eVar.f136583b;
            oVar = eVar.f136582a;
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(dVar.f143623b, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(q92.x xVar, t13.d dVar) {
        f fVar;
        o oVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f136591e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f136591e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, dVar);
            }
        } else {
            fVar = new f(this, dVar);
        }
        Object objC = fVar.f136589c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f136591e;
        if (i15 == 0) {
            o13.r.b(objC);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            fVar.f136587a = this;
            fVar.f136588b = xVar;
            fVar.f136591e = 1;
            objC = fVarA.c(xVar, null, fVar);
            if (objC == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = fVar.f136588b;
            oVar = fVar.f136587a;
            o13.r.b(objC);
        }
        q92.a0 a0Var = (q92.a0) objC;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, Locale locale, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f136600c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f136600c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objD = iVar.f136598a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f136600c;
        if (i15 == 0) {
            o13.r.b(objD);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            iVar.f136600c = 1;
            objD = fVarA.d(str, locale, iVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        q92.a0 a0Var = (q92.a0) objD;
        if (a0Var instanceof q92.a0.b) {
            return (s92.g) ((q92.a0.b) a0Var).f143609a;
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(q92.w wVar, Locale locale, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f136597c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f136597c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objD = hVar.f136595a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f136597c;
        if (i15 == 0) {
            o13.r.b(objD);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            hVar.f136597c = 1;
            objD = fVarA.d(wVar.f143796a, locale, hVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        q92.a0 a0Var = (q92.a0) objD;
        if (a0Var instanceof q92.a0.b) {
            return (s92.g) ((q92.a0.b) a0Var).f143609a;
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(q92.x xVar, Locale locale, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f136594c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f136594c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objD = gVar.f136592a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f136594c;
        if (i15 == 0) {
            o13.r.b(objD);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            gVar.f136594c = 1;
            objD = fVarA.d(xVar.f143819a, locale, gVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        q92.a0 a0Var = (q92.a0) objD;
        if (a0Var instanceof q92.a0.b) {
            return (s92.g) ((q92.a0.b) a0Var).f143609a;
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(v13.c cVar) throws Throwable {
        k kVar;
        o oVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f136606d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f136606d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objE0 = kVar.f136604b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f136606d;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            kVar.f136603a = this;
            kVar.f136606d = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.m(fVarA, null), kVar);
            if (objE0 == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = kVar.f136603a;
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().h();
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object i(v13.c cVar) throws Throwable {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f136609c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f136609c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE0 = lVar.f136607a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f136609c;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            lVar.f136609c = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.n(fVarA, null), lVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            return Boolean.valueOf(((s92.a) ((q92.a0.b) a0Var).f143609a).getValue());
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z14, s92.l lVar, v13.c cVar) throws Throwable {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f136612c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f136612c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objE0 = mVar.f136610a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f136612c;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            mVar.f136612c = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.i(fVarA, z14, lVar, null), mVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            return (List) ((q92.a0.b) a0Var).f143609a;
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(q92.x xVar, s92.l lVar, v13.c cVar) {
        n nVar;
        o oVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f136618f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f136618f = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objC = nVar.f136616d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f136618f;
        if (i15 == 0) {
            o13.r.b(objC);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            nVar.f136613a = this;
            nVar.f136614b = xVar;
            nVar.f136615c = lVar;
            nVar.f136618f = 1;
            objC = fVarA.c(xVar, lVar, nVar);
            if (objC == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = nVar.f136615c;
            xVar = nVar.f136614b;
            oVar = nVar.f136613a;
            o13.r.b(objC);
        }
        q92.a0 a0Var = (q92.a0) objC;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar, lVar);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(q92.x xVar, s92.g gVar, t13.d<? super q92.v> dVar) {
        a aVar;
        o oVar;
        q92.x xVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f136626e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f136626e = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objE = aVar2.f136624c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f136626e;
        if (i15 == 0) {
            o13.r.b(objE);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_IN;
            aVar2.f136622a = this;
            aVar2.f136623b = xVar;
            aVar2.f136626e = 1;
            objE = fVarA.e(xVar, yVar, gVar, null, aVar2);
            if (objE == aVar3) {
                return aVar3;
            }
            oVar = this;
            xVar2 = xVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar2 = aVar2.f136623b;
            oVar = aVar2.f136622a;
            o13.r.b(objE);
        }
        q92.a0 a0Var = (q92.a0) objE;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar2, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(q92.x xVar, s92.g gVar, s92.l lVar, v13.c cVar) {
        p pVar;
        o oVar;
        q92.x xVar2;
        s92.l lVar2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f136632f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f136632f = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        p pVar2 = pVar;
        Object objE = pVar2.f136630d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar2.f136632f;
        if (i15 == 0) {
            o13.r.b(objE);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_IN;
            pVar2.f136627a = this;
            pVar2.f136628b = xVar;
            pVar2.f136629c = lVar;
            pVar2.f136632f = 1;
            objE = fVarA.e(xVar, yVar, gVar, lVar, pVar2);
            if (objE == aVar) {
                return aVar;
            }
            oVar = this;
            xVar2 = xVar;
            lVar2 = lVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar2 = pVar2.f136629c;
            xVar2 = pVar2.f136628b;
            oVar = pVar2.f136627a;
            o13.r.b(objE);
        }
        q92.a0 a0Var = (q92.a0) objE;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar2, lVar2);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(String str, s92.g gVar, v13.c cVar) throws Throwable {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f136635c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f136635c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE0 = qVar.f136633a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f136635c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_IN;
            qVar.f136635c = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.t(str, yVar, fVarA, gVar, null, null), qVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (!(a0Var instanceof q92.a0.b)) {
            if (!(a0Var instanceof q92.a0.a)) {
                u0.r();
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(q92.d dVar, v13.c cVar) throws Throwable {
        r rVar;
        o oVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f136640e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f136640e = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objE0 = rVar.f136638c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f136640e;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            rVar.f136636a = this;
            rVar.f136637b = dVar;
            rVar.f136640e = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.o(dVar, fVarA, null), rVar);
            if (objE0 == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = rVar.f136637b;
            oVar = rVar.f136636a;
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(dVar.f143623b, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(q92.d dVar, v13.c cVar) throws Throwable {
        s sVar;
        o oVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f136645e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f136645e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objE0 = sVar.f136643c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f136645e;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            sVar.f136641a = this;
            sVar.f136642b = dVar;
            sVar.f136645e = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.p(dVar, fVarA, null), sVar);
            if (objE0 == aVar) {
                return aVar;
            }
            oVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = sVar.f136642b;
            oVar = sVar.f136641a;
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(dVar.f143623b, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object u(q92.x xVar, s92.g gVar, v13.c cVar) {
        t tVar;
        o oVar;
        q92.x xVar2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f136650e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f136650e = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        t tVar2 = tVar;
        Object objE = tVar2.f136648c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar2.f136650e;
        if (i15 == 0) {
            o13.r.b(objE);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_OUT;
            tVar2.f136646a = this;
            tVar2.f136647b = xVar;
            tVar2.f136650e = 1;
            objE = fVarA.e(xVar, yVar, gVar, null, tVar2);
            if (objE == aVar) {
                return aVar;
            }
            oVar = this;
            xVar2 = xVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar2 = tVar2.f136647b;
            oVar = tVar2.f136646a;
            o13.r.b(objE);
        }
        q92.a0 a0Var = (q92.a0) objE;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar2, null);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v(q92.x xVar, s92.g gVar, s92.l lVar, v13.c cVar) {
        u uVar;
        o oVar;
        q92.x xVar2;
        s92.l lVar2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f136656f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f136656f = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        u uVar2 = uVar;
        Object objE = uVar2.f136654d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar2.f136656f;
        if (i15 == 0) {
            o13.r.b(objE);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_OUT;
            uVar2.f136651a = this;
            uVar2.f136652b = xVar;
            uVar2.f136653c = lVar;
            uVar2.f136656f = 1;
            objE = fVarA.e(xVar, yVar, gVar, lVar, uVar2);
            if (objE == aVar) {
                return aVar;
            }
            oVar = this;
            xVar2 = xVar;
            lVar2 = lVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar2 = uVar2.f136653c;
            xVar2 = uVar2.f136652b;
            oVar = uVar2.f136651a;
            o13.r.b(objE);
        }
        q92.a0 a0Var = (q92.a0) objE;
        if (a0Var instanceof q92.a0.b) {
            oVar.getClass();
            return m().d(xVar2, lVar2);
        }
        if (a0Var instanceof q92.a0.a) {
            return null;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, s92.g gVar, v13.c cVar) throws Throwable {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f136659c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f136659c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objE0 = vVar.f136657a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f136659c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            q92.f fVarA = q92.f.a.a(q92.f.f143627e);
            q92.y yVar = q92.y.OPT_OUT;
            vVar.f136659c = 1;
            objE0 = ge1.b.e0(fVarA.f143631d.f143828c, new q92.t(str, yVar, fVarA, gVar, null, null), vVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        q92.a0 a0Var = (q92.a0) objE0;
        if (!(a0Var instanceof q92.a0.b)) {
            if (!(a0Var instanceof q92.a0.a)) {
                u0.r();
                return null;
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}

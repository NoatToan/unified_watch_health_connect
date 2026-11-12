package re2;

import android.content.Context;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import te2.g2;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$refreshUserProfileByITEndpoint$2", f = "AuthenticationHelper.kt", l = {2093, 2102, 2109}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152340b;

    public v(t13.d<? super v> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(dVar);
        vVar.f152340b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        if (r2 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        o53.b0 b0Var;
        Object objP;
        Object objE0;
        wc2.a aVar;
        Object objU;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152339a;
        if (i14 == 0) {
            o13.r.b(obj);
            b0Var = (o53.b0) this.f152340b;
            b bVar = b.f152215a;
            this.f152340b = b0Var;
            this.f152339a = 1;
            objP = b.p(bVar, this);
            if (objP != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            b0Var = (o53.b0) this.f152340b;
            o13.r.b(obj);
            objP = obj;
        } else if (i14 == 2) {
            b0Var = (o53.b0) this.f152340b;
            o13.r.b(obj);
            objE0 = obj;
            aVar = (wc2.a) objE0;
            if (aVar instanceof wc2.a.b) {
                if (!(aVar instanceof wc2.a.C3415a)) {
                    throw ((wc2.a.C3415a) aVar).f184312a;
                }
                u0.r();
                return null;
            }
            sc2.e eVar = (sc2.e) ((wc2.a.b) aVar).f184316a;
            j2 j2Var = j2.f164115a;
            Context contextB = b.f152215a.b();
            this.f152340b = b0Var;
            this.f152339a = 3;
            objU = j2Var.u(contextB, eVar, this);
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objU = obj;
        }
        ve2.d dVar = (ve2.d) objU;
        if (dVar != null) {
            return dVar;
        }
        q2.u("refreshUserProfileByITEndpoint: getOAuth2ITCredentials returned null");
        return null;
        sc2.o oVar = (sc2.o) objP;
        if (oVar != null) {
            g2.f164047a.getClass();
            ve2.d dVarA = g2.a();
            dVarA.getClass();
            b.f152216b.debug("refreshUserProfileByITEndpoint");
            rc2.n nVar = new rc2.n(b.f152215a.b(), dVarA.f177690a, dVarA.f177691b, oVar.f158544a, b.m().d());
            this.f152340b = b0Var;
            this.f152339a = 2;
            x53.c cVar = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new rc2.o(nVar, null), this);
            if (objE0 != aVar2) {
                aVar = (wc2.a) objE0;
                if (aVar instanceof wc2.a.b) {
                    if (!(aVar instanceof wc2.a.C3415a)) {
                        throw ((wc2.a.C3415a) aVar).f184312a;
                    }
                    u0.r();
                    return null;
                }
                sc2.e eVar2 = (sc2.e) ((wc2.a.b) aVar).f184316a;
                j2 j2Var2 = j2.f164115a;
                Context contextB2 = b.f152215a.b();
                this.f152340b = b0Var;
                this.f152339a = 3;
                objU = j2Var2.u(contextB2, eVar2, this);
            }
            return aVar2;
        }
        q2.u("refreshUserProfileByITEndpoint: getOAuth2ITCredentials returned null");
        return null;
    }
}

package nf0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnf0/d;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f125783b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff0.i f125784a = (ff0.i) KoinJavaComponent.get$default(ff0.i.class, null, null, 6, null);

    static {
        new a(null);
    }

    public static void x4() {
        f12.l lVar = ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c().f83623a;
        if (lVar.W2("key_bind_mfa_token_to_oauth2_called", false)) {
            return;
        }
        try {
            ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).u();
            lVar.O2("key_bind_mfa_token_to_oauth2_called", true);
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GHSAccountViewModel", "[bindMFATokenToOAuth2] bindMFATokenToOAuth2DI successful");
        } catch (Exception e4) {
            a2 a2Var2 = a2.ONBOARDING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "[bindMFATokenToOAuth2] bindMFATokenToOAuth2DI failed: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "GHSAccountViewModel", strD);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A4(v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f125801c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f125801c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objD4 = hVar.f125799a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f125801c;
        if (i15 == 0) {
            o13.r.b(objD4);
            hVar.f125801c = 1;
            objD4 = D4(hVar);
            if (objD4 != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objD4);
                return objD4;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objD4);
        if (!((Boolean) objD4).booleanValue()) {
            return Boolean.FALSE;
        }
        hVar.f125801c = 2;
        Object objG4 = G4(hVar);
        return objG4 == obj ? obj : objG4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B4(v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f125804c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f125804c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f125802a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f125804c;
        if (i15 == 0) {
            o13.r.b(objB);
            iVar.f125804c = 1;
            objB = this.f125784a.b(iVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g(objB, qu.c.a.f147863a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C4(String str, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f125807c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f125807c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f125805a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f125807c;
        if (i15 == 0) {
            o13.r.b(objJ);
            jVar.f125807c = 1;
            objJ = this.f125784a.j(str, jVar);
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
        Boolean bool = (Boolean) objJ;
        boolean zBooleanValue = bool.booleanValue();
        a2 a2Var = a2.ONBOARDING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("[isMFATokenValidOnServer] MFA token valid=", zBooleanValue);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GHSAccountViewModel", strH);
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D4(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f125810c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f125810c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objM = kVar.f125808a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f125810c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objM);
            kVar.f125810c = 1;
            objM = this.f125784a.m(kVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        rf1.c cVar2 = (rf1.c) objM;
        rf1.e eVar = cVar2 != null ? cVar2.f152417b : null;
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        if (bVar.f() || bVar.n() ? !(eVar == rf1.e.EMAIL || eVar == rf1.e.ALL || eVar == rf1.e.PHONE) : !(eVar == rf1.e.EMAIL || eVar == rf1.e.ALL)) {
            z14 = false;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.ONBOARDING, "GHSAccountViewModel", "[isMFATypeSupported] MFA method type=" + eVar + " supported=" + z14);
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E4(String str, v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f125816c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f125816c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objC4 = mVar.f125814a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f125816c;
        if (i15 == 0) {
            o13.r.b(objC4);
            mVar.f125816c = 1;
            objC4 = C4(str, mVar);
            if (objC4 != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objC4);
                return objC4;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC4);
        if (!((Boolean) objC4).booleanValue()) {
            return Boolean.FALSE;
        }
        mVar.f125816c = 2;
        Object objA4 = A4(mVar);
        return objA4 == obj ? obj : objA4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F4(v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f125813c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f125813c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.f125811a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f125813c;
        if (i15 == 0) {
            o13.r.b(objB);
            lVar.f125813c = 1;
            objB = this.f125784a.b(lVar);
            if (objB != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objB);
                return objB;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objB);
        qu.c cVar2 = (qu.c) objB;
        if (!(cVar2 instanceof qu.c.C2781c)) {
            return Boolean.FALSE;
        }
        String str = ((qu.c.C2781c) cVar2).f147865a;
        lVar.f125813c = 2;
        Object objE4 = E4(str, lVar);
        return objE4 == obj ? obj : objE4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G4(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f125819c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f125819c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objI = nVar.f125817a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f125819c;
        if (i15 == 0) {
            o13.r.b(objI);
            nVar.f125819c = 1;
            objI = this.f125784a.i();
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        Boolean bool = (Boolean) objI;
        boolean zBooleanValue = bool.booleanValue();
        a2 a2Var = a2.ONBOARDING;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("[isPermanentMFAEnabled] permanent MFA enabled=", zBooleanValue);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GHSAccountViewModel", strH);
        return bool;
    }

    public final y0 y4() {
        y0 y0Var = new y0();
        y0Var.j(g3.a.c(g3.f35298f));
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new e(this, y0Var, null), 2);
        return y0Var;
    }

    public final y0 z4() {
        y0 y0Var = new y0();
        y0Var.j(g3.a.c(g3.f35298f));
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new f(this, y0Var, null), 2);
        return y0Var;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnf0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

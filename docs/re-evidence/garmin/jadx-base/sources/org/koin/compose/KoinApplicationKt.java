package org.koin.compose;

import ba2.f;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import e23.p;
import mg2.o;
import oe0.e;
import org.koin.compose.application.CompositionKoinApplicationLoader;
import org.koin.compose.error.UnknownKoinContext;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatform;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.m2;
import p3.n;
import p3.n2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0012\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fj\u0002`\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lorg/koin/core/Koin;", "getDefaultKoinContext", "()Lorg/koin/core/Koin;", "getKoin", "(Lp3/m;I)Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "currentKoinScope", "(Lp3/m;I)Lorg/koin/core/scope/Scope;", "ctx", "", "warningNoContext", "(Lorg/koin/core/Koin;)V", "Lkotlin/Function1;", "Lorg/koin/core/KoinApplication;", "Lorg/koin/dsl/KoinAppDeclaration;", MimeTypes.BASE_TYPE_APPLICATION, "Lkotlin/Function0;", FirebaseAnalytics.Param.CONTENT, "KoinApplication", "(Le23/l;Le23/p;Lp3/m;I)V", CoreConstants.CONTEXT_SCOPE_VALUE, "KoinContext", "(Lorg/koin/core/Koin;Le23/p;Lp3/m;II)V", "KoinIsolatedContext", "(Lorg/koin/core/KoinApplication;Le23/p;Lp3/m;I)V", "Lp3/m2;", "LocalKoinApplication", "Lp3/m2;", "getLocalKoinApplication", "()Lp3/m2;", "LocalKoinScope", "getLocalKoinScope", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinApplicationKt {
    private static final m2<Koin> LocalKoinApplication = v.c(new e(16));
    private static final m2<Scope> LocalKoinScope = v.c(new e(17));

    public static final void KoinApplication(l<? super KoinApplication, Unit> lVar, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        lVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-563172299);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        int i16 = 0;
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            KoinApplication koinApplication = org.koin.dsl.KoinApplicationKt.koinApplication(lVar);
            o0VarE.L(-2079726239);
            o0VarE.L(219101743);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new CompositionKoinApplicationLoader(koinApplication);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            Koin koin = ((CompositionKoinApplicationLoader) objQ).getKoinApplication().getKoin();
            o0VarE.g0(false);
            v.b(new n2[]{LocalKoinApplication.c(koin), LocalKoinScope.c(koin.getScopeRegistry().getRootScope())}, pVar, o0VarE, i15 & 112);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(lVar, pVar, i14, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinApplication$lambda$6(l lVar, p pVar, int i14, m mVar, int i15) {
        KoinApplication(lVar, pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    public static final void KoinContext(Koin koin, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        int i16;
        pVar.getClass();
        o0 o0VarE = mVar.E(1560007908);
        if ((i14 & 6) == 0) {
            i16 = (((i15 & 1) == 0 && o0VarE.r(koin)) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i16 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
            } else if ((i15 & 1) != 0) {
                koin = KoinPlatform.INSTANCE.getKoin();
                i16 &= -15;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            v.b(new n2[]{LocalKoinApplication.c(koin), LocalKoinScope.c(koin.getScopeRegistry().getRootScope())}, pVar, o0VarE, i16 & 112);
        }
        Koin koin2 = koin;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(koin2, pVar, i14, i15, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinContext$lambda$7(Koin koin, p pVar, int i14, int i15, m mVar, int i16) {
        KoinContext(koin, pVar, mVar, p0.t(i14 | 1), i15);
        return Unit.INSTANCE;
    }

    public static final void KoinIsolatedContext(KoinApplication koinApplication, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        koinApplication.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1672936023);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(koinApplication) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            v.b(new n2[]{LocalKoinApplication.c(koinApplication.getKoin()), LocalKoinScope.c(koinApplication.getKoin().getScopeRegistry().getRootScope())}, pVar, o0VarE, i15 & 112);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(koinApplication, pVar, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinIsolatedContext$lambda$8(KoinApplication koinApplication, p pVar, int i14, m mVar, int i15) {
        KoinIsolatedContext(koinApplication, pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Koin LocalKoinApplication$lambda$0() throws UnknownKoinContext {
        throw new UnknownKoinContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope LocalKoinScope$lambda$1() throws UnknownKoinContext {
        throw new UnknownKoinContext();
    }

    public static final Scope currentKoinScope(m mVar, int i14) {
        mVar.L(1668867238);
        x1 x1Var = n.f135158a;
        mVar.L(-899075222);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            try {
                objQ = (Scope) mVar.A(LocalKoinScope);
            } catch (UnknownKoinContext unused) {
                warningNoContext(getDefaultKoinContext());
                objQ = getDefaultKoinContext().getScopeRegistry().getRootScope();
            }
            mVar.K(objQ);
        }
        Scope scope = (Scope) objQ;
        mVar.R();
        x1 x1Var2 = n.f135158a;
        mVar.R();
        return scope;
    }

    private static final Koin getDefaultKoinContext() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    public static final Koin getKoin(m mVar, int i14) {
        Object obj;
        mVar.L(523578110);
        x1 x1Var = n.f135158a;
        mVar.L(-1762035741);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        Object obj2 = objQ;
        if (objQ == m.a.f135155b) {
            try {
                obj = (Koin) mVar.A(LocalKoinApplication);
            } catch (UnknownKoinContext unused) {
                Koin defaultKoinContext = getDefaultKoinContext();
                warningNoContext(defaultKoinContext);
                obj = defaultKoinContext;
            }
            mVar.K(obj);
            obj2 = obj;
        }
        Koin koin = (Koin) obj2;
        mVar.R();
        x1 x1Var2 = n.f135158a;
        mVar.R();
        return koin;
    }

    public static final m2<Koin> getLocalKoinApplication() {
        return LocalKoinApplication;
    }

    public static final m2<Scope> getLocalKoinScope() {
        return LocalKoinScope;
    }

    private static final void warningNoContext(Koin koin) {
        koin.getLogger().error("[Warning] - No Compose Koin context setup, taking default. Use KoinContext(), KoinAndroidContext() or KoinApplication() function to setup or create Koin context and avoid such message.");
    }
}

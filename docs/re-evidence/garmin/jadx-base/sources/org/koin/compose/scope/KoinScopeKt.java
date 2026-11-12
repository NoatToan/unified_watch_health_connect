package org.koin.compose.scope;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import e23.p;
import mg2.o;
import org.koin.compose.KoinApplicationKt;
import org.koin.compose.a;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u000e\b\b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001a7\u0010\u0007\u001a\u00020\u00052\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "scopeDefinition", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "KoinScope", "(Le23/l;Le23/p;Lp3/m;I)V", "", "T", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "(Ljava/lang/String;Le23/p;Lp3/m;I)V", "Lorg/koin/core/qualifier/Qualifier;", "scopeQualifier", "(Ljava/lang/String;Lorg/koin/core/qualifier/Qualifier;Le23/p;Lp3/m;I)V", Action.SCOPE_ATTRIBUTE, "OnKoinScope", "(Lorg/koin/core/scope/Scope;Le23/p;Lp3/m;I)V", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinScopeKt {
    @KoinExperimentalAPI
    public static final void KoinScope(l<? super Koin, Scope> lVar, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        lVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-264394213);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
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
            OnKoinScope(lVar.invoke(KoinApplicationKt.getKoin(o0VarE, 0)), pVar, o0VarE, i15 & 112);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(lVar, pVar, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinScope$lambda$0(l lVar, p pVar, int i14, m mVar, int i15) {
        KoinScope((l<? super Koin, Scope>) lVar, (p<? super m, ? super Integer, Unit>) pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    @KoinExperimentalAPI
    public static final void OnKoinScope(Scope scope, final p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        scope.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1631542729);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(scope) ? 4 : 2) | i14;
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
            o0VarE.L(-424940701);
            Koin koin = KoinApplicationKt.getKoin(o0VarE, 0);
            o0VarE.L(47274260);
            boolean zB = o0VarE.B(scope);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new CompositionKoinScopeLoader(scope, koin);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new CompositionKoinScopeLoader(scope, koin);
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            ((CompositionKoinScopeLoader) objQ).getScope();
            o0VarE.g0(false);
            v.a(KoinApplicationKt.getLocalKoinScope().c(scope), f.b(164259575, new p<m, Integer, Unit>() { // from class: org.koin.compose.scope.KoinScopeKt.OnKoinScope.1
                public final void invoke(m mVar2, int i16) {
                    if ((i16 & 3) == 2 && mVar2.b()) {
                        mVar2.e();
                    } else {
                        x1 x1Var2 = n.f135158a;
                        pVar.invoke(mVar2, 0);
                    }
                }

                @Override // e23.p
                public /* bridge */ /* synthetic */ Unit invoke(m mVar2, Integer num) {
                    invoke(mVar2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 48);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(scope, pVar, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnKoinScope$lambda$1(Scope scope, p pVar, int i14, m mVar, int i15) {
        OnKoinScope(scope, pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    @KoinExperimentalAPI
    public static final <T> void KoinScope(String str, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        str.getClass();
        pVar.getClass();
        mVar.L(-1487271735);
        KoinApplicationKt.getKoin(mVar, 0);
        s.l();
        throw null;
    }

    @KoinExperimentalAPI
    public static final void KoinScope(String str, Qualifier qualifier, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        str.getClass();
        qualifier.getClass();
        pVar.getClass();
        mVar.L(-362301145);
        OnKoinScope(Koin.getOrCreateScope$default(KoinApplicationKt.getKoin(mVar, 0), str, qualifier, null, 4, null), pVar, mVar, (i14 >> 3) & 112);
        mVar.R();
    }
}

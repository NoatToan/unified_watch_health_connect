package org.koin.androidx.compose.scope;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.p;
import n23.j;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;
import z3.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "KoinActivityScope", "(Le23/p;Lp3/m;I)V", "KoinFragmentScope", "koin-androidx-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinAndroidScopeKt {
    public static final void KoinActivityScope(final p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(-391667059);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 3) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Object objA = o0VarE.A(y3Var);
            AndroidScopeComponent androidScopeComponent = objA instanceof AndroidScopeComponent ? (AndroidScopeComponent) objA : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            o0VarE.L(-617477761);
            if (scope == null) {
                j.t("Current context ", o0VarE.A(y3Var), " must implement AndroidScopeComponent interface.");
                return;
            } else {
                o0VarE.g0(false);
                v.a(KoinApplicationKt.getLocalKoinScope().c(scope), f.b(-1357912243, new p<m, Integer, Unit>() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt.KoinActivityScope.1
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
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(pVar, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinActivityScope$lambda$0(p pVar, int i14, m mVar, int i15) {
        KoinActivityScope(pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    public static final void KoinFragmentScope(final p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(-617235796);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 0;
        if ((i15 & 3) == 2 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Object objA = o0VarE.A(y3Var);
            AndroidScopeComponent androidScopeComponent = objA instanceof AndroidScopeComponent ? (AndroidScopeComponent) objA : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            o0VarE.L(-2027107330);
            if (scope == null) {
                j.t("Current context ", o0VarE.A(y3Var), " must implement AndroidScopeComponent interface.");
                return;
            } else {
                o0VarE.g0(false);
                v.a(KoinApplicationKt.getLocalKoinScope().c(scope), f.b(-1583480980, new p<m, Integer, Unit>() { // from class: org.koin.androidx.compose.scope.KoinAndroidScopeKt.KoinFragmentScope.1
                    public final void invoke(m mVar2, int i17) {
                        if ((i17 & 3) == 2 && mVar2.b()) {
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
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(pVar, i14, i16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KoinFragmentScope$lambda$1(p pVar, int i14, m mVar, int i15) {
        KoinFragmentScope(pVar, mVar, p0.t(i14 | 1));
        return Unit.INSTANCE;
    }
}

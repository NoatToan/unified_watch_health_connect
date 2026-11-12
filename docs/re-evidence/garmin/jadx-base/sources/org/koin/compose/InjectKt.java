package org.koin.compose;

import ch.qos.logback.core.joran.action.Action;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.p0;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f²\u0006\u001a\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078\nX\u008a\u0084\u0002"}, d2 = {"T", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "koinInject", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/scope/Scope;Le23/a;Lp3/m;II)Ljava/lang/Object;", "currentParameters", "koin-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InjectKt {
    public static final <T> T koinInject(Qualifier qualifier, Scope scope, e23.a<? extends ParametersHolder> aVar, m mVar, int i14, int i15) {
        mVar.L(414512006);
        if ((i15 & 1) != 0) {
            qualifier = null;
        }
        if ((i15 & 2) != 0) {
            scope = KoinApplicationKt.currentKoinScope(mVar, 0);
        }
        if ((i15 & 4) != 0) {
            aVar = null;
        }
        final p1 p1VarQ = p0.q(aVar, mVar);
        mVar.L(855641119);
        boolean zB = mVar.B(qualifier) | mVar.B(scope);
        T t7 = (T) mVar.q();
        if (!zB) {
            m.f135153a.getClass();
            if (t7 != m.a.f135155b) {
                mVar.R();
                mVar.R();
                return t7;
            }
        }
        new e23.a<ParametersHolder>() { // from class: org.koin.compose.InjectKt$koinInject$1$1
            @Override // e23.a
            public final ParametersHolder invoke() {
                ParametersHolder parametersHolder;
                e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(p1VarQ);
                return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
            }
        };
        s.l();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: koinInject$lambda-0, reason: not valid java name */
    public static final e23.a<ParametersHolder> m473koinInject$lambda0(x3<? extends e23.a<? extends ParametersHolder>> x3Var) {
        return (e23.a) x3Var.getF182175a();
    }
}

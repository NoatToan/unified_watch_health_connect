package org.koin.bundle;

import a11.p;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import ch.qos.logback.core.joran.action.Action;
import e23.a;
import k23.d;
import o13.l;
import o13.m;
import o13.n;
import org.koin.bundle.factory.KoinViewModelFactory;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import org.koin.mp.KoinPlatformToolsKt;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a{\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Lk23/d;", "vmClass", "Landroidx/lifecycle/y1;", "viewModelStore", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "resolveViewModel", "(Lk23/d;Landroidx/lifecycle/y1;Ljava/lang/String;Landroidx/lifecycle/viewmodel/CreationExtras;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/scope/Scope;Le23/a;)Landroidx/lifecycle/u1;", "className", "getViewModelKey", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lo13/l;", "lazyResolveViewModel", "(Lk23/d;Le23/a;Ljava/lang/String;Le23/a;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/scope/Scope;Le23/a;)Lo13/l;", "koin-core-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetViewModelKt {
    @KoinInternalApi
    public static final String getViewModelKey(Qualifier qualifier, String str, String str2) {
        if (str != null) {
            return str;
        }
        if (qualifier == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(qualifier.getValue());
        sb3.append(str2 != null ? "_".concat(str2) : "");
        return sb3.toString();
    }

    public static /* synthetic */ String getViewModelKey$default(Qualifier qualifier, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            qualifier = null;
        }
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        return getViewModelKey(qualifier, str, str2);
    }

    @KoinInternalApi
    public static final <T extends u1> l<T> lazyResolveViewModel(d<T> dVar, a<? extends y1> aVar, String str, a<? extends CreationExtras> aVar2, Qualifier qualifier, Scope scope, a<? extends ParametersHolder> aVar3) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        scope.getClass();
        return m.a(n.NONE, new p(dVar, aVar, str, aVar2, qualifier, scope, aVar3, 12));
    }

    public static /* synthetic */ l lazyResolveViewModel$default(d dVar, a aVar, String str, a aVar2, Qualifier qualifier, Scope scope, a aVar3, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 16) != 0) {
            qualifier = null;
        }
        if ((i14 & 64) != 0) {
            aVar3 = null;
        }
        return lazyResolveViewModel(dVar, aVar, str, aVar2, qualifier, scope, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u1 lazyResolveViewModel$lambda$1(d dVar, a aVar, String str, a aVar2, Qualifier qualifier, Scope scope, a aVar3) {
        return resolveViewModel(dVar, (y1) aVar.invoke(), str, (CreationExtras) aVar2.invoke(), qualifier, scope, aVar3);
    }

    @KoinInternalApi
    public static final <T extends u1> T resolveViewModel(d<T> dVar, y1 y1Var, String str, CreationExtras creationExtras, Qualifier qualifier, Scope scope, a<? extends ParametersHolder> aVar) {
        dVar.getClass();
        y1Var.getClass();
        creationExtras.getClass();
        scope.getClass();
        KoinViewModelFactory koinViewModelFactory = new KoinViewModelFactory(dVar, scope, qualifier, aVar);
        x1.f8070b.getClass();
        x1 x1VarA = x1.b.a(y1Var, koinViewModelFactory, creationExtras);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        String classFullNameOrNull = koinPlatformTools.getClassFullNameOrNull(dVar);
        if (classFullNameOrNull == null) {
            classFullNameOrNull = KoinPlatformToolsKt.getKClassDefaultName(koinPlatformTools, dVar);
        }
        String viewModelKey = getViewModelKey(qualifier, str, classFullNameOrNull);
        return viewModelKey != null ? (T) x1VarA.f8072a.a(viewModelKey, dVar) : (T) x1VarA.b(dVar);
    }

    public static /* synthetic */ u1 resolveViewModel$default(d dVar, y1 y1Var, String str, CreationExtras creationExtras, Qualifier qualifier, Scope scope, a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 16) != 0) {
            qualifier = null;
        }
        if ((i14 & 64) != 0) {
            aVar = null;
        }
        return resolveViewModel(dVar, y1Var, str, creationExtras, qualifier, scope, aVar);
    }
}

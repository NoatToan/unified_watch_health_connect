package org.koin.android.compat;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import ch.qos.logback.core.joran.action.Action;
import e23.a;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/u1;", "T", "Ljava/lang/Class;", "vmClass", "Landroidx/lifecycle/y1;", "viewModelStore", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "resolveViewModelCompat", "(Ljava/lang/Class;Landroidx/lifecycle/y1;Ljava/lang/String;Landroidx/lifecycle/viewmodel/CreationExtras;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/scope/Scope;Le23/a;)Landroidx/lifecycle/u1;", "koin-android-compat_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetViewModelCompatKt {
    @KoinInternalApi
    public static final <T extends u1> T resolveViewModelCompat(Class<T> cls, y1 y1Var, String str, CreationExtras creationExtras, Qualifier qualifier, Scope scope, a<? extends ParametersHolder> aVar) {
        cls.getClass();
        y1Var.getClass();
        creationExtras.getClass();
        scope.getClass();
        return (T) GetViewModelKt.resolveViewModel(s0.f105811a.b(cls), y1Var, str, creationExtras, qualifier, scope, aVar);
    }

    public static /* synthetic */ u1 resolveViewModelCompat$default(Class cls, y1 y1Var, String str, CreationExtras creationExtras, Qualifier qualifier, Scope scope, a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 16) != 0) {
            qualifier = null;
        }
        if ((i14 & 64) != 0) {
            aVar = null;
        }
        return resolveViewModelCompat(cls, y1Var, str, creationExtras, qualifier, scope, aVar);
    }
}

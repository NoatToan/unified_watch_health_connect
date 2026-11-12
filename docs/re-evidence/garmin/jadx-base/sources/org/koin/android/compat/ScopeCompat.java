package org.koin.android.compat;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.joran.action.Action;
import e23.a;
import o13.l;
import o13.m;
import o13.n;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p50.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J[\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lorg/koin/android/compat/ScopeCompat;", "", "<init>", "()V", "Landroidx/lifecycle/u1;", "T", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "viewModel", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Lo13/l;", "getViewModel", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Landroidx/lifecycle/u1;", "koin-android-compat_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopeCompat {
    public static final ScopeCompat INSTANCE = new ScopeCompat();

    private ScopeCompat() {
    }

    public static final <T extends u1> T getViewModel(Scope scope, ViewModelStoreOwner owner, Class<T> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        scope.getClass();
        owner.getClass();
        clazz.getClass();
        return (T) GetViewModelCompatKt.resolveViewModelCompat$default(clazz, owner.getViewModelStore(), null, CreationExtras.b.f8056c, qualifier, scope, parameters, 4, null);
    }

    public static /* synthetic */ u1 getViewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            qualifier = null;
        }
        if ((i14 & 16) != 0) {
            aVar = null;
        }
        return getViewModel(scope, viewModelStoreOwner, cls, qualifier, aVar);
    }

    public static final <T extends u1> l<T> viewModel(Scope scope, ViewModelStoreOwner owner, Class<T> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        scope.getClass();
        owner.getClass();
        clazz.getClass();
        return m.a(n.NONE, new d(scope, owner, clazz, qualifier, parameters, 2));
    }

    public static /* synthetic */ l viewModel$default(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            qualifier = null;
        }
        if ((i14 & 16) != 0) {
            aVar = null;
        }
        return viewModel(scope, viewModelStoreOwner, cls, qualifier, aVar);
    }

    public static final <T extends u1> T getViewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        scope.getClass();
        viewModelStoreOwner.getClass();
        cls.getClass();
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, 16, null);
    }

    public static final <T extends u1> l<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        scope.getClass();
        viewModelStoreOwner.getClass();
        cls.getClass();
        return viewModel$default(scope, viewModelStoreOwner, cls, qualifier, null, 16, null);
    }

    public static final <T extends u1> T getViewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        scope.getClass();
        viewModelStoreOwner.getClass();
        cls.getClass();
        return (T) getViewModel$default(scope, viewModelStoreOwner, cls, null, null, 24, null);
    }

    public static final <T extends u1> l<T> viewModel(Scope scope, ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        scope.getClass();
        viewModelStoreOwner.getClass();
        cls.getClass();
        return viewModel$default(scope, viewModelStoreOwner, cls, null, null, 24, null);
    }
}

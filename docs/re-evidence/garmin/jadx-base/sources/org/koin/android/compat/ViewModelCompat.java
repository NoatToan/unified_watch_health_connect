package org.koin.android.compat;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import e23.a;
import o13.l;
import o13.m;
import o13.n;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p50.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014Je\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lorg/koin/android/compat/ViewModelCompat;", "", "<init>", "()V", "Landroidx/lifecycle/u1;", "T", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "viewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;)Lo13/l;", "getViewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;Le23/a;)Landroidx/lifecycle/u1;", "getDefaultViewModelCreationExtras", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "koin-android-compat_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewModelCompat {
    public static final ViewModelCompat INSTANCE = new ViewModelCompat();

    private ViewModelCompat() {
    }

    private final CreationExtras getDefaultViewModelCreationExtras(ViewModelStoreOwner owner) {
        return owner instanceof g ? ((g) owner).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
    }

    public static final <T extends u1> T getViewModel(ViewModelStoreOwner owner, Class<T> clazz, Qualifier qualifier, a<? extends CreationExtras> extrasProducer, a<? extends ParametersHolder> parameters) {
        CreationExtras defaultViewModelCreationExtras;
        owner.getClass();
        clazz.getClass();
        y1 viewModelStore = owner.getF189591b();
        if (extrasProducer == null || (defaultViewModelCreationExtras = extrasProducer.invoke()) == null) {
            defaultViewModelCreationExtras = INSTANCE.getDefaultViewModelCreationExtras(owner);
        }
        return (T) GetViewModelCompatKt.resolveViewModelCompat$default(clazz, viewModelStore, null, defaultViewModelCreationExtras, qualifier, GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope(), parameters, 4, null);
    }

    public static /* synthetic */ u1 getViewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, a aVar, a aVar2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier = null;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        if ((i14 & 16) != 0) {
            aVar2 = null;
        }
        return getViewModel(viewModelStoreOwner, cls, qualifier, aVar, aVar2);
    }

    public static final <T extends u1> l<T> viewModel(ViewModelStoreOwner owner, Class<T> clazz, Qualifier qualifier, a<? extends CreationExtras> extrasProducer, a<? extends ParametersHolder> parameters) {
        owner.getClass();
        clazz.getClass();
        return m.a(n.NONE, new d(owner, clazz, qualifier, extrasProducer, parameters, 3));
    }

    public static /* synthetic */ l viewModel$default(ViewModelStoreOwner viewModelStoreOwner, Class cls, Qualifier qualifier, a aVar, a aVar2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier = null;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        if ((i14 & 16) != 0) {
            aVar2 = null;
        }
        return viewModel(viewModelStoreOwner, cls, qualifier, aVar, aVar2);
    }

    public static final <T extends u1> l<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return viewModel$default(viewModelStoreOwner, cls, qualifier, null, null, 24, null);
    }

    public static final <T extends u1> l<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, a<? extends CreationExtras> aVar) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return viewModel$default(viewModelStoreOwner, cls, qualifier, aVar, null, 16, null);
    }

    public static final <T extends u1> l<T> viewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return viewModel$default(viewModelStoreOwner, cls, null, null, null, 28, null);
    }

    public static final <T extends u1> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return (T) getViewModel$default(viewModelStoreOwner, cls, qualifier, null, null, 24, null);
    }

    public static final <T extends u1> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls, Qualifier qualifier, a<? extends CreationExtras> aVar) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return (T) getViewModel$default(viewModelStoreOwner, cls, qualifier, aVar, null, 16, null);
    }

    public static final <T extends u1> T getViewModel(ViewModelStoreOwner viewModelStoreOwner, Class<T> cls) {
        viewModelStoreOwner.getClass();
        cls.getClass();
        return (T) getViewModel$default(viewModelStoreOwner, cls, null, null, null, 28, null);
    }
}

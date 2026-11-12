package org.koin.android.compat;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import e23.a;
import o13.l;
import o13.m;
import o13.n;
import ok0.d;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JS\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/koin/android/compat/SharedViewModelCompat;", "", "<init>", "()V", "Landroidx/lifecycle/u1;", "T", "Landroidx/fragment/app/Fragment;", "fragment", "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "sharedViewModel", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Lo13/l;", "getSharedViewModel", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Landroidx/lifecycle/u1;", "koin-android-compat_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedViewModelCompat {
    public static final SharedViewModelCompat INSTANCE = new SharedViewModelCompat();

    private SharedViewModelCompat() {
    }

    public static final <T extends u1> T getSharedViewModel(Fragment fragment, Class<T> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        fragment.getClass();
        clazz.getClass();
        return (T) GetViewModelCompatKt.resolveViewModelCompat$default(clazz, fragment.requireActivity().getF189591b(), null, CreationExtras.b.f8056c, qualifier, GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope(), parameters, 4, null);
    }

    public static /* synthetic */ u1 getSharedViewModel$default(Fragment fragment, Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier = null;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        return getSharedViewModel(fragment, cls, qualifier, aVar);
    }

    public static final <T extends u1> l<T> sharedViewModel(Fragment fragment, Class<T> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        fragment.getClass();
        clazz.getClass();
        return m.a(n.NONE, new d(fragment, clazz, qualifier, parameters, 6));
    }

    public static /* synthetic */ l sharedViewModel$default(Fragment fragment, Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier = null;
        }
        if ((i14 & 8) != 0) {
            aVar = null;
        }
        return sharedViewModel(fragment, cls, qualifier, aVar);
    }

    public static final <T extends u1> l<T> sharedViewModel(Fragment fragment, Class<T> cls, Qualifier qualifier) {
        fragment.getClass();
        cls.getClass();
        return sharedViewModel$default(fragment, cls, qualifier, null, 8, null);
    }

    public static final <T extends u1> l<T> sharedViewModel(Fragment fragment, Class<T> cls) {
        fragment.getClass();
        cls.getClass();
        return sharedViewModel$default(fragment, cls, null, null, 12, null);
    }

    public static final <T extends u1> T getSharedViewModel(Fragment fragment, Class<T> cls, Qualifier qualifier) {
        fragment.getClass();
        cls.getClass();
        return (T) getSharedViewModel$default(fragment, cls, qualifier, null, 8, null);
    }

    public static final <T extends u1> T getSharedViewModel(Fragment fragment, Class<T> cls) {
        fragment.getClass();
        cls.getClass();
        return (T) getSharedViewModel$default(fragment, cls, null, null, 12, null);
    }
}

package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.androidx.viewmodel.ViewModelResolverKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u0002\u001a[\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\b\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0000j\u0002`\n2\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0000j\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aw\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0000j\u0002`\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\u0004\u0018\u0001`\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u0000j\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0014\u001a+\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000¢\u0006\u0004\b\u000f\u0010\u0017*\u0016\u0010\u0018\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "emptyState", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", DataCacher.o, "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "getViewModel", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "clazz", "state", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "viewModelParameters", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "BundleDefinition", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ScopeExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Bundle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Bundle> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Bundle invoke() {
            return new Bundle();
        }
    }

    @NotNull
    public static final Function0<Bundle> emptyState() {
        return a.a;
    }

    public static final /* synthetic */ <T extends ViewModel> T getViewModel(Scope scope, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getViewModel$default(scope, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), null, function1, 8, null);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        Qualifier qualifier2 = (i & 1) != 0 ? null : qualifier;
        Function0 function2 = (i & 4) != 0 ? null : function1;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel$default(scope, qualifier2, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), null, function2, 8, null);
    }

    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Scope scope, @Nullable Qualifier qualifier, @NotNull Function0<ViewModelOwner> function0, @NotNull KClass<T> kClass, @Nullable Function0<Bundle> function1, @Nullable Function0<? extends ParametersHolder> function2) {
        ViewModelOwner viewModelOwnerInvoke = function0.invoke();
        return (T) getViewModel(scope, new ViewModelParameter(kClass, qualifier, function1, function2, viewModelOwnerInvoke.getStore(), viewModelOwnerInvoke.getStateRegistry()));
    }

    public static /* synthetic */ ViewModel getViewModel$default(Scope scope, Qualifier qualifier, Function0 function0, KClass kClass, Function0 function1, Function0 function2, int i, Object obj) {
        return getViewModel(scope, (i & 1) != 0 ? null : qualifier, function0, kClass, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : function2);
    }

    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameter) {
        return (T) ViewModelResolverKt.resolveInstance(new ViewModelProvider(viewModelParameter.getViewModelStore(), ViewModelResolverKt.pickFactory(scope, viewModelParameter)), viewModelParameter);
    }
}

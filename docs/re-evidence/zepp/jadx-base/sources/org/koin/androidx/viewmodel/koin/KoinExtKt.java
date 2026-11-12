package org.koin.androidx.viewmodel.koin;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
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
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005j\u0004\u0018\u0001`\fH\u0086\bø\u0001\u0000\u001a[\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005j\u0004\u0018\u0001`\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a_\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0010\u0010\u0014\u001a+\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0000¢\u0006\u0004\b\u0010\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/Koin;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", DataCacher.o, "Lkotlin/LazyThreadSafetyMode;", "mode", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "viewModel", "getViewModel", "(Lorg/koin/core/Koin;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "clazz", "(Lorg/koin/core/Koin;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "viewModelParameters", "(Lorg/koin/core/Koin;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.koin.KoinExtKt$viewModel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Koin a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ViewModelOwner> c;
        public final /* synthetic */ Function0<ParametersHolder> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Koin koin, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.a = koin;
            this.b = qualifier;
            this.c = function0;
            this.d = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            Koin koin = this.a;
            Qualifier qualifier = this.b;
            Function0<ViewModelOwner> function0 = this.c;
            Function0<ParametersHolder> function1 = this.d;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return KoinExtKt.getViewModel(koin, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> T getViewModel(Koin koin, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getViewModel(koin, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Koin koin, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getViewModel(koin, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> viewModel(Koin koin, Qualifier qualifier, Function0<ViewModelOwner> function0, LazyThreadSafetyMode lazyThreadSafetyMode, Function0<? extends ParametersHolder> function1) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(koin, qualifier, function0, function1));
    }

    public static /* synthetic */ Lazy viewModel$default(Koin koin, Qualifier qualifier, Function0 function0, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(koin, qualifier, function0, function1));
    }

    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Koin koin, @Nullable Qualifier qualifier, @NotNull Function0<ViewModelOwner> function0, @NotNull KClass<T> kClass, @Nullable Function0<? extends ParametersHolder> function1) {
        return (T) ScopeExtKt.getViewModel$default(koin.getScopeRegistry().getRootScope(), qualifier, function0, kClass, null, function1, 8, null);
    }

    public static /* synthetic */ ViewModel getViewModel$default(Koin koin, Qualifier qualifier, Function0 function0, KClass kClass, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return getViewModel(koin, qualifier, function0, kClass, function1);
    }

    @NotNull
    public static final <T extends ViewModel> T getViewModel(@NotNull Koin koin, @NotNull ViewModelParameter<T> viewModelParameter) {
        return (T) ScopeExtKt.getViewModel(koin.getScopeRegistry().getRootScope(), viewModelParameter);
    }
}

package org.koin.androidx.viewmodel.ext.android;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
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
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000\u001a`\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\n\u001a[\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0010\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/savedstate/SavedStateRegistryOwner;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "state", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "stateViewModel", "Lkotlin/reflect/KClass;", "clazz", "getStateViewModel", "(Landroidx/savedstate/SavedStateRegistryOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/savedstate/SavedStateRegistryOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class SavedStateRegistryOwnerExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelOwner> {
        public final /* synthetic */ SavedStateRegistryOwner a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SavedStateRegistryOwner savedStateRegistryOwner) {
            super(0);
            this.a = savedStateRegistryOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
            SavedStateRegistryOwner savedStateRegistryOwner = this.a;
            return companion.from((ViewModelStoreOwner) savedStateRegistryOwner, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ SavedStateRegistryOwner a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<Bundle> c;
        public final /* synthetic */ KClass<T> d;
        public final /* synthetic */ Function0<ParametersHolder> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0<Bundle> function0, KClass<T> kClass, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.a = savedStateRegistryOwner;
            this.b = qualifier;
            this.c = function0;
            this.d = kClass;
            this.e = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            return SavedStateRegistryOwnerExtKt.getStateViewModel(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.SavedStateRegistryOwnerExtKt$stateViewModel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ SavedStateRegistryOwner a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<Bundle> c;
        public final /* synthetic */ Function0<ParametersHolder> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.a = savedStateRegistryOwner;
            this.b = qualifier;
            this.c = function0;
            this.d = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            SavedStateRegistryOwner savedStateRegistryOwner = this.a;
            Qualifier qualifier = this.b;
            Function0<Bundle> function0 = this.c;
            Function0<ParametersHolder> function1 = this.d;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return SavedStateRegistryOwnerExtKt.getStateViewModel(savedStateRegistryOwner, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> T getStateViewModel(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getStateViewModel(savedStateRegistryOwner, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getStateViewModel(savedStateRegistryOwner, qualifier, function0, Reflection.getOrCreateKotlinClass(ViewModel.class), function1);
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> stateViewModel(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0<Bundle> function0, Function0<? extends ParametersHolder> function1) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(savedStateRegistryOwner, qualifier, function0, function1));
    }

    public static /* synthetic */ Lazy stateViewModel$default(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass1(savedStateRegistryOwner, qualifier, function0, function1));
    }

    @NotNull
    public static final <T extends ViewModel> T getStateViewModel(@NotNull SavedStateRegistryOwner savedStateRegistryOwner, @Nullable Qualifier qualifier, @NotNull Function0<Bundle> function0, @NotNull KClass<T> kClass, @Nullable Function0<? extends ParametersHolder> function1) {
        return (T) ScopeExtKt.getViewModel(AndroidKoinScopeExtKt.getKoinScope((ComponentCallbacks) savedStateRegistryOwner), qualifier, new a(savedStateRegistryOwner), kClass, function0, function1);
    }

    @NotNull
    public static final <T extends ViewModel> Lazy<T> stateViewModel(@NotNull SavedStateRegistryOwner savedStateRegistryOwner, @Nullable Qualifier qualifier, @NotNull Function0<Bundle> function0, @NotNull KClass<T> kClass, @Nullable Function0<? extends ParametersHolder> function1) {
        return LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new b(savedStateRegistryOwner, qualifier, function0, kClass, function1));
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0 function0, KClass kClass, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return getStateViewModel(savedStateRegistryOwner, qualifier, function0, kClass, function1);
    }

    public static /* synthetic */ Lazy stateViewModel$default(SavedStateRegistryOwner savedStateRegistryOwner, Qualifier qualifier, Function0 function0, KClass kClass, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = ScopeExtKt.emptyState();
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return stateViewModel(savedStateRegistryOwner, qualifier, function0, kClass, function1);
    }
}

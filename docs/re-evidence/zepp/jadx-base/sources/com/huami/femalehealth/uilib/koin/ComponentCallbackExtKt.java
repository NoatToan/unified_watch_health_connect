package com.huami.femalehealth.uilib.koin;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\bø\u0001\u0000\u001aZ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u000b*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\r2\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/ComponentCallbacks;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "injectInFH", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", DataCacher.o, "injectViewModelInFH", "uilib_release"}, k = 2, mv = {1, 5, 1})
public final class ComponentCallbackExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt$injectInFH$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ ComponentCallbacks a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = componentCallbacks;
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Scope scopeFemaleHealthScope = ScopesAndQualifersKt.femaleHealthScope(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this.a));
            Qualifier qualifier = this.b;
            Function0<ParametersHolder> function0 = this.c;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scopeFemaleHealthScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    /* JADX INFO: renamed from: com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt$injectViewModelInFH$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C15291 extends Lambda implements Function0<ViewModelOwner> {
        public final /* synthetic */ ComponentCallbacks a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15291(ComponentCallbacks componentCallbacks) {
            super(0);
            this.a = componentCallbacks;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
            ComponentCallbacks componentCallbacks = this.a;
            return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
        }
    }

    public static final /* synthetic */ <T> Lazy<T> injectInFH(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectInFH$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> injectViewModelInFH(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new ComponentCallbackExtKt$injectViewModelInFH$$inlined$viewModel$1(componentCallbacks, qualifier, function0, function1));
    }

    public static /* synthetic */ Lazy injectViewModelInFH$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = new C15291(componentCallbacks);
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new ComponentCallbackExtKt$injectViewModelInFH$$inlined$viewModel$1(componentCallbacks, qualifier, function0, function1));
    }
}

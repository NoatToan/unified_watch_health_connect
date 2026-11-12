package org.koin.androidx.viewmodel.ext.android;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
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
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.scope.ScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000\u001a[\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aa\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000e\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "Lorg/koin/androidx/viewmodel/ViewModelOwnerDefinition;", DataCacher.o, "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "sharedViewModel", "getSharedViewModel", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "clazz", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class FragmentExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ViewModelOwner> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelOwner invoke() {
            return ViewModelOwner.INSTANCE.from(this.a.requireActivity(), this.a.requireActivity());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentExtKt$sharedViewModel$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ Fragment a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ViewModelOwner> c;
        public final /* synthetic */ Function0<ParametersHolder> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Fragment fragment, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
            super(0);
            this.a = fragment;
            this.b = qualifier;
            this.c = function0;
            this.d = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModel invoke() {
            Fragment fragment = this.a;
            Qualifier qualifier = this.b;
            Function0<ViewModelOwner> function0 = this.c;
            Function0<ParametersHolder> function1 = this.d;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return FragmentExtKt.getSharedViewModel(fragment, qualifier, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, function1);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> T getSharedViewModel(Fragment fragment, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getSharedViewModel(fragment, qualifier, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, function1);
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = new Function0<ViewModelOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getSharedViewModel.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ViewModelOwner invoke() {
                    return ViewModelOwner.INSTANCE.from(fragment.requireActivity(), fragment.requireActivity());
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getSharedViewModel(fragment, qualifier, Reflection.getOrCreateKotlinClass(ViewModel.class), function0, function1);
    }

    public static final /* synthetic */ <T extends ViewModel> Lazy<T> sharedViewModel(Fragment fragment, Qualifier qualifier, Function0<ViewModelOwner> function0, Function0<? extends ParametersHolder> function1) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, function0, function1));
    }

    public static /* synthetic */ Lazy sharedViewModel$default(final Fragment fragment, Qualifier qualifier, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = new Function0<ViewModelOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.sharedViewModel.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ViewModelOwner invoke() {
                    return ViewModelOwner.INSTANCE.from(fragment.requireActivity(), fragment.requireActivity());
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new AnonymousClass2(fragment, qualifier, function0, function1));
    }

    @NotNull
    public static final <T extends ViewModel> T getSharedViewModel(@NotNull Fragment fragment, @Nullable Qualifier qualifier, @NotNull KClass<T> kClass, @NotNull Function0<ViewModelOwner> function0, @Nullable Function0<? extends ParametersHolder> function1) {
        return (T) ScopeExtKt.getViewModel$default(AndroidKoinScopeExtKt.getKoinScope(fragment), qualifier, function0, kClass, null, function1, 8, null);
    }

    public static /* synthetic */ ViewModel getSharedViewModel$default(Fragment fragment, Qualifier qualifier, KClass kClass, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = new a(fragment);
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        return getSharedViewModel(fragment, qualifier, kClass, function0, function1);
    }
}

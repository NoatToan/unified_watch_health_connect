package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import defpackage.dvq;
import defpackage.eig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldvq;", "VM", "Landroidx/fragment/app/Fragment;", "", "navGraphId", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/Lazy;", "navGraphViewModels", "(Landroidx/fragment/app/Fragment;ILkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class NavGraphViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldvq;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class AnonymousClass1 extends Lambda implements Function0<ViewModelProvider.Factory> {
        final /* synthetic */ Lazy $backStackEntry;
        final /* synthetic */ KProperty $backStackEntry$metadata;
        final /* synthetic */ Function0 $factoryProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0 function0, Lazy lazy, KProperty kProperty) {
            super(0);
            this.$factoryProducer = function0;
            this.$backStackEntry = lazy;
            this.$backStackEntry$metadata = kProperty;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory factory;
            Function0 function0 = this.$factoryProducer;
            if (function0 != null && (factory = (ViewModelProvider.Factory) function0.invoke()) != null) {
                return factory;
            }
            eig backStackEntry = (eig) this.$backStackEntry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
            ViewModelProvider.Factory defaultViewModelProviderFactory = backStackEntry.getDefaultViewModelProviderFactory();
            Intrinsics.checkExpressionValueIsNotNull(defaultViewModelProviderFactory, "backStackEntry.defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @NotNull
    public static final /* synthetic */ <VM extends dvq> Lazy<VM> navGraphViewModels(@NotNull Fragment fragment, int i, @Nullable Function0<? extends ViewModelProvider.Factory> function0) {
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy, null);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(dvq.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new AnonymousClass1(function0, lazy, null));
    }

    public static /* synthetic */ Lazy navGraphViewModels$default(Fragment fragment, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy, null);
        Intrinsics.reifiedOperationMarker(4, "VM");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(dvq.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new AnonymousClass1(function0, lazy, null));
    }
}

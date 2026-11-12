package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RefundResultFailFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundResultFailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/wallet/lib/entity/Resource;", "", "it", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/navigation/NavigationController;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "viewModel", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "c", "()Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "xiaomiSztRefundViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RefundResultFailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean e = true;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaomiSztRefundViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundResultFailFragment$Companion;", "", "", "canBack", "Z", "getCanBack", "()Z", "setCanBack", "(Z)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getCanBack() {
            return RefundResultFailFragment.e;
        }

        public final void setCanBack(boolean z) {
            RefundResultFailFragment.e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            XiaomiSztRefundViewModel xiaomiSztRefundViewModelC = RefundResultFailFragment.this.c();
            Args args = Args.INSTANCE;
            if (xiaomiSztRefundViewModelC.isMiAndNoSzt(args.getAppCode())) {
                RefundResultFailFragment.this.c().returnCard(args.getAppCode(), Integer.valueOf(args.getBlance()), null);
            } else {
                RefundResultFailFragment.this.getViewModel().refundCard(args.getAppCode(), args.getSnbTicket());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<Unit>, Unit> {
        public b() {
            super(1);
        }

        public final void a(Resource<Unit> resource) {
            RefundResultFailFragment.this.d(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Unit> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefundResultFailFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RefundResultFailFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundResultFailFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ReturnViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundResultFailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ReturnViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ReturnViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(ReturnViewModel.class), function0, objArr3);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundResultFailFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.xiaomiSztRefundViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<XiaomiSztRefundViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundResultFailFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XiaomiSztRefundViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(XiaomiSztRefundViewModel.class), function1, objArr5);
            }
        });
    }

    private final NavigationController b() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiSztRefundViewModel c() {
        return (XiaomiSztRefundViewModel) this.xiaomiSztRefundViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Resource<Unit> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(it2);
        }
        Status status = it2.status;
        e = status != Status.LOADING;
        if (status == Status.SUCCESS) {
            b().closePreviousPages();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            b().navigateReturnCardResultSuccessActivity(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RefundResultFailFragment refundResultFailFragment, Resource resource) {
        Status status = resource.status;
        e = status != Status.LOADING;
        if (status == Status.SUCCESS) {
            refundResultFailFragment.b().closePreviousPages();
            FragmentActivity activity = refundResultFailFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
            refundResultFailFragment.b().navigateReturnCardResultSuccessActivity(refundResultFailFragment.getActivity());
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final ReturnViewModel getViewModel() {
        return (ReturnViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_return_card_fail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        View view2 = getView();
        KTViewExtensionKt.singleClick(view2 == null ? null : view2.findViewById(R.id.wl_return_fail_button), new a());
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getRefundCardLiveData(), this, new b());
        c().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退卡"));
        c().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ja6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundResultFailFragment.e(this.a, (Resource) obj);
            }
        });
    }
}

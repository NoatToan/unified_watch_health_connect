package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.entities.ReturnCardReason;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RemindRefundFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.utils.KtUtilsKt;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u001c\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+R*\u00103\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/huami/wallet/ui/fragment/RemindRefundFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "Landroid/os/Bundle;", Constant.PARAM_SQL_ARGUMENTS, "", z.j, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, GoogleApiAvailabilityLight.a, "g", "Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "it", "i", "list", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/huami/wallet/ui/fragment/RemindRefundFragment$a;", "b", "Lcom/huami/wallet/ui/fragment/RemindRefundFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "c", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "viewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/wallet/ui/navigation/NavigationController;", "e", "f", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "Lcom/huami/wallet/ui/fragment/b;", "Lcom/huami/wallet/ui/fragment/b;", "mAdapter", "", "Ljava/util/List;", "getRefundAccountCollectModes", "()Ljava/util/List;", "setRefundAccountCollectModes", "(Ljava/util/List;)V", "refundAccountCollectModes", "<init>", "()V", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RemindRefundFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final a mViewHolder = new a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final com.huami.wallet.ui.fragment.b mAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private List<String> refundAccountCollectModes;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/huami/wallet/ui/fragment/RemindRefundFragment$a", "", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "()Landroidx/recyclerview/widget/RecyclerView;", "b", "(Landroidx/recyclerview/widget/RecyclerView;)V", "returnReasonRV", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private RecyclerView returnReasonRV;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final RecyclerView getReturnReasonRV() {
            return this.returnReasonRV;
        }

        public final void b(@Nullable RecyclerView recyclerView) {
            this.returnReasonRV = recyclerView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "Lcom/huami/nfc/bus/entities/ReturnCardReason;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<List<? extends ReturnCardReason>>, Unit> {
        public b() {
            super(1);
        }

        public final void a(Resource<List<ReturnCardReason>> resource) {
            RemindRefundFragment.this.i(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends ReturnCardReason>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            List<String> refundAccountCollectModes = RemindRefundFragment.this.getRefundAccountCollectModes();
            if (refundAccountCollectModes != null) {
                Boolean boolValueOf = Boolean.valueOf(refundAccountCollectModes.contains("byAlipayAuth"));
                if (!boolValueOf.booleanValue()) {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    RemindRefundFragment remindRefundFragment = RemindRefundFragment.this;
                    boolValueOf.booleanValue();
                    remindRefundFragment.f().navigateAlipayAuth(remindRefundFragment.getActivity());
                    return;
                }
            }
            RemindRefundFragment.this.f().navigateUserInputAuth(RemindRefundFragment.this.getActivity());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemindRefundFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RemindRefundFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ReturnViewModel>() { // from class: com.huami.wallet.ui.fragment.RemindRefundFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ReturnViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ReturnViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ReturnViewModel.class), function0, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RemindRefundFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        this.mAdapter = new com.huami.wallet.ui.fragment.b();
    }

    private final void d(View view) {
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        this.mViewHolder.b((RecyclerView) view.findViewById(R.id.return_reason_radio_group));
        RecyclerView returnReasonRV = this.mViewHolder.getReturnReasonRV();
        if (returnReasonRV != null) {
            returnReasonRV.setAdapter(this.mAdapter);
        }
        this.mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: cb6
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                RemindRefundFragment.e(this.a, baseQuickAdapter, view2, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(RemindRefundFragment remindRefundFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ReturnCardReason item = remindRefundFragment.mAdapter.getItem(i);
        if (item == null) {
            return;
        }
        remindRefundFragment.mAdapter.b(i);
        View view2 = remindRefundFragment.getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.return_card_button))).setEnabled(true);
        remindRefundFragment.getViewModel().setRefundReasonCode(item.getCode());
        Args.INSTANCE.setRefundReasonCode(item.getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController f() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final void g() {
        getViewModel().returnCardReason();
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getReturnCardReasonLiveData(), this, new b());
    }

    private final void h(List<ReturnCardReason> list) {
        this.mAdapter.replaceData(list);
        View view = getView();
        KTViewExtensionKt.singleClick(view == null ? null : view.findViewById(R.id.return_card_button), new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Resource<List<ReturnCardReason>> it2) {
        if (it2.status == Status.ERROR && Intrinsics.areEqual(it2.code, "c0007")) {
            LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.hideLoading();
            return;
        }
        LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
        if (loadingDialogHelper2 != null) {
            loadingDialogHelper2.showOrError(it2);
        }
        if (it2.status != Status.SUCCESS || KtUtilsKt.isNullOrEmpty(it2.data) || KtUtilsKt.isNullOrEmpty(it2.data)) {
            return;
        }
        h(it2.data);
    }

    private final void j(Bundle arguments) {
        if (arguments == null) {
            return;
        }
        CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(Args.INSTANCE.getAppCode());
        this.refundAccountCollectModes = cityInfo == null ? null : cityInfo.getRefundAccountCollectModes();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final List<String> getRefundAccountCollectModes() {
        return this.refundAccountCollectModes;
    }

    @NotNull
    public final ReturnViewModel getViewModel() {
        return (ReturnViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_remind_return, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        j(getArguments());
        d(view);
        g();
    }

    public final void setRefundAccountCollectModes(@Nullable List<String> list) {
        this.refundAccountCollectModes = list;
    }
}

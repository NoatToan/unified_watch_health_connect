package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.CheckInVoiceActivity;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.ConfirmServiceInVoiceFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.viewmodel.ConfirmServiceInVoiceViewModel;
import com.huami.widget.toast.CustomToast;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010'\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b!\u0010&¨\u0006+"}, d2 = {"Lcom/huami/wallet/ui/fragment/ConfirmServiceInVoiceFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "e", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "a", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailData", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "b", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "", "c", "Ljava/lang/String;", "getBusCardId", "()Ljava/lang/String;", "setBusCardId", "(Ljava/lang/String;)V", "busCardId", "Lcom/huami/wallet/ui/viewmodel/ConfirmServiceInVoiceViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/wallet/ui/viewmodel/ConfirmServiceInVoiceViewModel;", "confirmServiceInVoiceViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ConfirmServiceInVoiceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private InVoiceInfo inVoiceDetailData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BusCardDetailData busCardDetailData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String busCardId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirmServiceInVoiceViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/wallet/ui/fragment/ConfirmServiceInVoiceFragment$Companion;", "", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailData", "", "busCardIdConfirmService", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "Lcom/huami/wallet/ui/fragment/ConfirmServiceInVoiceFragment;", "newInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConfirmServiceInVoiceFragment newInstance(@NotNull InVoiceInfo inVoiceDetailData, @NotNull String busCardIdConfirmService, @NotNull BusCardDetailData busCardDetailData) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(BusConstKt.KEY_INVOICE_INFO, inVoiceDetailData);
            bundle.putString(BusConstKt.KEY_BUS_ID, busCardIdConfirmService);
            bundle.putParcelable(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            ConfirmServiceInVoiceFragment confirmServiceInVoiceFragment = new ConfirmServiceInVoiceFragment();
            confirmServiceInVoiceFragment.setArguments(bundle);
            return confirmServiceInVoiceFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialog> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(ConfirmServiceInVoiceFragment.this.getActivity(), ConfirmServiceInVoiceFragment.this.getResources().getString(R.string.wl_invoice_submit_loading));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<Boolean>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<Boolean> resource) {
            if (resource.status == Status.LOADING) {
                ConfirmServiceInVoiceFragment.this.d().show();
                return;
            }
            if (resource.isSuccessful()) {
                ConfirmServiceInVoiceFragment.this.e();
                ConfirmServiceInVoiceFragment.this.d().dismiss();
            } else if (Intrinsics.areEqual(resource.code, ErrorCode.NETWORK_ERROR)) {
                CustomToast.showShort(ConfirmServiceInVoiceFragment.this.getActivity(), ConfirmServiceInVoiceFragment.this.getString(R.string.wl_network_not_connected));
                ConfirmServiceInVoiceFragment.this.d().dismiss();
            } else {
                CustomToast.showShort(ConfirmServiceInVoiceFragment.this.getActivity(), ConfirmServiceInVoiceFragment.this.getString(R.string.wl_invoice_submit_failure));
                ConfirmServiceInVoiceFragment.this.d().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmServiceInVoiceFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.ConfirmServiceInVoiceFragment$special$$inlined$viewModel$default$1
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
        this.confirmServiceInVoiceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ConfirmServiceInVoiceViewModel>() { // from class: com.huami.wallet.ui.fragment.ConfirmServiceInVoiceFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ConfirmServiceInVoiceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ConfirmServiceInVoiceViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ConfirmServiceInVoiceViewModel.class), function0, objArr);
            }
        });
        this.loadingDialog = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final ConfirmServiceInVoiceViewModel c() {
        return (ConfirmServiceInVoiceViewModel) this.confirmServiceInVoiceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog d() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setTitle(R.string.wl_invoice_submit_success).setMessage(R.string.wl_invoice_message_tip).setNeutralButton(R.string.wl_i_know_it, new DialogInterface.OnClickListener() { // from class: ty0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConfirmServiceInVoiceFragment.f(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ConfirmServiceInVoiceFragment confirmServiceInVoiceFragment, DialogInterface dialogInterface, int i) {
        CheckInVoiceActivity.INSTANCE.open(confirmServiceInVoiceFragment.requireContext(), confirmServiceInVoiceFragment.inVoiceDetailData, confirmServiceInVoiceFragment.busCardDetailData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ConfirmServiceInVoiceFragment confirmServiceInVoiceFragment, View view) throws Exception {
        confirmServiceInVoiceFragment.c().postInInvoiceData(confirmServiceInVoiceFragment.getBusCardId(), confirmServiceInVoiceFragment.inVoiceDetailData);
    }

    private final void h() {
        LiveDataExtensionKt.observeResourceWithNotNull(c().getInVoiceInfoConfirmLiveData(), this, new b());
    }

    private final void initView(View view) {
        if (Intrinsics.areEqual(this.inVoiceDetailData.getType(), "PERSONAL")) {
            CheckInVoiceFragmentKt.visible((RelativeLayout) view.findViewById(R.id.rl_invoice_head_confirm));
            CheckInVoiceFragmentKt.gone((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number_confirm));
            ((TextView) view.findViewById(R.id.tv_invoice_type_confirm)).setText(R.string.wl_invoice_type_name);
            ((TextView) view.findViewById(R.id.tv_company)).setText(R.string.wl_invoice_user_name);
            TextView textView = (TextView) view.findViewById(R.id.tv_company_name);
            InVoiceInfo inVoiceInfo = this.inVoiceDetailData;
            textView.setText(inVoiceInfo == null ? null : inVoiceInfo.getName());
        } else {
            ((TextView) view.findViewById(R.id.tv_company)).setText(R.string.wl_invoice_company_name);
            CheckInVoiceFragmentKt.gone((RelativeLayout) view.findViewById(R.id.rl_invoice_head_confirm));
            CheckInVoiceFragmentKt.visible((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number_confirm));
            ((TextView) view.findViewById(R.id.tv_company_name)).setText(this.inVoiceDetailData.getCompanyName());
            ((TextView) view.findViewById(R.id.tv_taxpayer_number_content)).setText(this.inVoiceDetailData.getIdentifier());
        }
        ((TextView) view.findViewById(R.id.tv_receive_email_content)).setText(this.inVoiceDetailData.getEmail());
        ((Button) view.findViewById(R.id.tv_submit_confirm)).setOnClickListener(new View.OnClickListener() { // from class: uy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                ConfirmServiceInVoiceFragment.g(this.a, view2);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final String getBusCardId() {
        return this.busCardId;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_confirm_service_in_voice, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.inVoiceDetailData = (InVoiceInfo) arguments.getParcelable(BusConstKt.KEY_INVOICE_INFO);
            setBusCardId(arguments.getString(BusConstKt.KEY_BUS_ID));
            this.busCardDetailData = (BusCardDetailData) arguments.getParcelable(BusConstKt.KEY_BUS_DETAIL_DATA);
        }
        initView(view);
        h();
    }

    public final void setBusCardId(@Nullable String str) {
        this.busCardId = str;
    }
}

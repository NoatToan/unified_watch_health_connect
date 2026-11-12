package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
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
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.huami.wallet.lib.entity.InVoiceInfo;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.MiCheckInVoiceActivity;
import com.huami.wallet.ui.entity.BusCardDetailData;
import com.huami.wallet.ui.fragment.MiConfirmServiceInVoiceFragment;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.viewmodel.MiConfirmServiceInVoiceViewModel;
import com.huami.widget.toast.CustomToast;
import java.util.Objects;
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
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\u0019\u0010%¨\u0006*"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiConfirmServiceInVoiceFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "Lcom/huami/wallet/ui/viewmodel/MiConfirmServiceInVoiceViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/wallet/ui/viewmodel/MiConfirmServiceInVoiceViewModel;", "confirmServiceInVoiceViewModel", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "invoiceInfo", "", "c", "Ljava/lang/String;", "invoiceAmount", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "busCardId", "f", "version", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "g", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class MiConfirmServiceInVoiceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirmServiceInVoiceViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InVoiceInfo invoiceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String invoiceAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private BusCardDetailData busCardDetailData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String busCardId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String version;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/fragment/MiConfirmServiceInVoiceFragment$Companion;", "", "Lcom/huami/wallet/lib/entity/InVoiceInfo;", "inVoiceDetailData", "", "inVoiceAmount", "busCardIdConfirmService", "Lcom/huami/wallet/ui/entity/BusCardDetailData;", "busCardDetailData", "version", "Lcom/huami/wallet/ui/fragment/MiConfirmServiceInVoiceFragment;", "newInstance", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiConfirmServiceInVoiceFragment newInstance(@NotNull InVoiceInfo inVoiceDetailData, @NotNull String inVoiceAmount, @NotNull String busCardIdConfirmService, @NotNull BusCardDetailData busCardDetailData, @Nullable String version) {
            Bundle bundle = new Bundle();
            bundle.putString(BusConstKt.KEY_INVOICE_AMOUNT, inVoiceAmount);
            bundle.putParcelable(BusConstKt.KEY_INVOICE_INFO, inVoiceDetailData);
            bundle.putString(BusConstKt.KEY_BUS_ID, busCardIdConfirmService);
            bundle.putString(BusConstKt.KEY_INVOICE_VERSION, version);
            bundle.putParcelable(BusConstKt.KEY_BUS_DETAIL_DATA, busCardDetailData);
            MiConfirmServiceInVoiceFragment miConfirmServiceInVoiceFragment = new MiConfirmServiceInVoiceFragment();
            miConfirmServiceInVoiceFragment.setArguments(bundle);
            return miConfirmServiceInVoiceFragment;
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
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(MiConfirmServiceInVoiceFragment.this.getActivity(), MiConfirmServiceInVoiceFragment.this.getResources().getString(R.string.wl_invoice_submit_loading));
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
                MiConfirmServiceInVoiceFragment.this.c().show();
                return;
            }
            if (resource.isSuccessful()) {
                MiCheckInVoiceActivity.INSTANCE.open(MiConfirmServiceInVoiceFragment.this.requireContext(), "", MiConfirmServiceInVoiceFragment.this.busCardDetailData, MiConfirmServiceInVoiceFragment.this.version);
                MiConfirmServiceInVoiceFragment.this.c().dismiss();
            } else if (Intrinsics.areEqual(resource.code, ErrorCode.NETWORK_ERROR)) {
                CustomToast.showShort(MiConfirmServiceInVoiceFragment.this.requireContext(), MiConfirmServiceInVoiceFragment.this.getString(R.string.wl_network_not_connected));
                MiConfirmServiceInVoiceFragment.this.c().dismiss();
            } else {
                CustomToast.showShort(MiConfirmServiceInVoiceFragment.this.requireContext(), MiConfirmServiceInVoiceFragment.this.getString(R.string.wl_invoice_submit_failure));
                MiConfirmServiceInVoiceFragment.this.c().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiConfirmServiceInVoiceFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.MiConfirmServiceInVoiceFragment$special$$inlined$viewModel$default$1
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
        this.confirmServiceInVoiceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MiConfirmServiceInVoiceViewModel>() { // from class: com.huami.wallet.ui.fragment.MiConfirmServiceInVoiceFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.MiConfirmServiceInVoiceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MiConfirmServiceInVoiceViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(MiConfirmServiceInVoiceViewModel.class), function0, objArr);
            }
        });
        this.loadingDialog = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final MiConfirmServiceInVoiceViewModel b() {
        return (MiConfirmServiceInVoiceViewModel) this.confirmServiceInVoiceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog c() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MiConfirmServiceInVoiceFragment miConfirmServiceInVoiceFragment, View view) throws Exception {
        MiConfirmServiceInVoiceViewModel miConfirmServiceInVoiceViewModelB = miConfirmServiceInVoiceFragment.b();
        String str = miConfirmServiceInVoiceFragment.busCardId;
        InVoiceInfo inVoiceInfo = miConfirmServiceInVoiceFragment.invoiceInfo;
        Objects.requireNonNull(inVoiceInfo);
        miConfirmServiceInVoiceViewModelB.postMiInInvoiceData(str, inVoiceInfo);
    }

    private final void e() {
        LiveDataExtensionKt.observeResourceWithNotNull(b().getInVoiceInfoConfirmLiveData(), this, new b());
    }

    private final void initView(View view) {
        InVoiceInfo inVoiceInfo = this.invoiceInfo;
        Objects.requireNonNull(inVoiceInfo);
        if (Intrinsics.areEqual(inVoiceInfo.getType(), "PERSONAL")) {
            ((TextView) view.findViewById(R.id.tv_category_massage_confirm)).setText(R.string.wl_invoice_type_name);
            ViewExtensionKt.gone((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number_confirm_confirm));
        } else {
            ((TextView) view.findViewById(R.id.tv_category_massage_confirm)).setText(R.string.wl_invoice_type_company_name);
            ViewExtensionKt.visible((RelativeLayout) view.findViewById(R.id.rl_tax_payer_number_confirm_confirm));
            TextView textView = (TextView) view.findViewById(R.id.tv_taxpayer_number_content_confirm);
            InVoiceInfo inVoiceInfo2 = this.invoiceInfo;
            Objects.requireNonNull(inVoiceInfo2);
            textView.setText(inVoiceInfo2.getIdentifier());
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_invoice_type_confirm);
        InVoiceInfo inVoiceInfo3 = this.invoiceInfo;
        Objects.requireNonNull(inVoiceInfo3);
        textView2.setText(inVoiceInfo3.getCompanyName());
        InVoiceInfo inVoiceInfo4 = this.invoiceInfo;
        Objects.requireNonNull(inVoiceInfo4);
        String phoneNumber = inVoiceInfo4.getPhoneNumber();
        if (phoneNumber != null && (m.isBlank(phoneNumber) ^ true)) {
            TextView textView3 = (TextView) view.findViewById(R.id.tv_phone_massage_confirm);
            InVoiceInfo inVoiceInfo5 = this.invoiceInfo;
            Objects.requireNonNull(inVoiceInfo5);
            textView3.setText(inVoiceInfo5.getPhoneNumber());
        }
        InVoiceInfo inVoiceInfo6 = this.invoiceInfo;
        Objects.requireNonNull(inVoiceInfo6);
        String email = inVoiceInfo6.getEmail();
        if (email != null && (m.isBlank(email) ^ true)) {
            TextView textView4 = (TextView) view.findViewById(R.id.tv_email_massage_confirm);
            InVoiceInfo inVoiceInfo7 = this.invoiceInfo;
            Objects.requireNonNull(inVoiceInfo7);
            textView4.setText(inVoiceInfo7.getEmail());
        }
        if (!Intrinsics.areEqual("v2", this.version)) {
            ViewExtensionKt.gone((RelativeLayout) view.findViewById(R.id.phoneInfoArea));
            ViewExtensionKt.gone((RelativeLayout) view.findViewById(R.id.emailInfoArea));
        }
        TextView textView5 = (TextView) view.findViewById(R.id.tv_money_amount_confirm);
        int i = R.string.wl_format_x_yuan;
        String str = this.invoiceAmount;
        Objects.requireNonNull(str);
        textView5.setText(getString(i, MoneyUtils.formatCentRMB(Integer.parseInt(str))));
        ((Button) view.findViewById(R.id.tv_submit_confirm_confirm)).setOnClickListener(new View.OnClickListener() { // from class: c45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                MiConfirmServiceInVoiceFragment.d(this.a, view2);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mi_confirm_service_in_voice, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            InVoiceInfo inVoiceInfo = (InVoiceInfo) arguments.getParcelable(BusConstKt.KEY_INVOICE_INFO);
            if (inVoiceInfo == null) {
                return;
            }
            this.invoiceInfo = inVoiceInfo;
            String string = arguments.getString(BusConstKt.KEY_INVOICE_AMOUNT);
            if (string == null) {
                return;
            }
            this.invoiceAmount = string;
            this.busCardId = arguments.getString(BusConstKt.KEY_BUS_ID);
            this.version = arguments.getString(BusConstKt.KEY_INVOICE_VERSION);
            this.busCardDetailData = (BusCardDetailData) arguments.getParcelable(BusConstKt.KEY_BUS_DETAIL_DATA);
        }
        initView(view);
        e();
    }
}

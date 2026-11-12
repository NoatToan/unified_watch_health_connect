package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.NfcTagExtensionsKt;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.OpenCardInfoActivity;
import com.huami.wallet.accessdoor.activity.StartAccessActivity;
import com.huami.wallet.accessdoor.activity.StartAccessLoadingActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentSelectDoorTypeBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog;
import com.huami.wallet.accessdoor.fragment.SelectDoorTypeFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.SelectDoorTypeViewModel;
import com.huami.wallet.common.helper.ViewExtensionKt;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SelectDoorTypeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "u", "v", "initViewModel", "l", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/wallet/accessdoor/helper/Resource;", "h", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "protocolEntity", "m", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/wallet/accessdoor/databinding/FragmentSelectDoorTypeBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/wallet/accessdoor/databinding/FragmentSelectDoorTypeBinding;", "binding", "Lcom/huami/wallet/accessdoor/viewmodel/SelectDoorTypeViewModel;", "b", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/wallet/accessdoor/viewmodel/SelectDoorTypeViewModel;", "selectDoorTypeViewModel", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "c", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "accessDoorUserPrivacyDialog", "", GoogleApiAvailabilityLight.a, "Z", "isAgreeProtocol", "", "e", LogUtil.I, "clickedId", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", z.j, "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SelectDoorTypeFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    @NotNull
    private static final String h = "Wallet-SelectDoorTypeFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectDoorTypeViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isAgreeProtocol;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int clickedId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<String>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ViewExtensionKt.loadImage$default(SelectDoorTypeFragment.this.i().ivSelectDoor, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialog> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(SelectDoorTypeFragment.this.getActivity(), SelectDoorTypeFragment.this.getResources().getString(R.string.access_access_door_loading));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Resource<ProtocolEntity> resource) {
            if (resource.status == Status.LOADING) {
                SelectDoorTypeFragment.this.j().show();
                return;
            }
            if (!resource.isSuccessful()) {
                SelectDoorTypeFragment.this.h(resource);
                return;
            }
            ProtocolEntity protocolEntity = resource.data;
            if (protocolEntity != null) {
                SelectDoorTypeFragment.this.m(protocolEntity);
            } else if (SelectDoorTypeFragment.this.k().isMiDevice()) {
                StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, SelectDoorTypeFragment.this.requireContext(), null, 2, null);
            } else {
                SelectDoorTypeFragment.this.l();
            }
            SelectDoorTypeFragment.this.j().dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Resource<String>, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            if (resource.status == Status.LOADING) {
                SelectDoorTypeFragment.this.j().show();
                return;
            }
            if (!resource.isSuccessful()) {
                SelectDoorTypeFragment.this.h(resource);
                return;
            }
            SelectDoorTypeFragment.this.j().dismiss();
            if (SelectDoorTypeFragment.this.accessDoorUserPrivacyDialog != null || SelectDoorTypeFragment.this.accessDoorUserPrivacyDialog.isShowing()) {
                SelectDoorTypeFragment.this.accessDoorUserPrivacyDialog.dismiss();
            }
            if (SelectDoorTypeFragment.this.k().isMiDevice()) {
                StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, SelectDoorTypeFragment.this.requireContext(), null, 2, null);
            } else {
                SelectDoorTypeFragment.this.l();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SelectDoorTypeFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentSelectDoorTypeBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectDoorTypeFragment() {
        super(R.layout.fragment_select_door_type);
        this.binding = FragmentViewBindingKt.viewBinding(new SelectDoorTypeFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSelectDoorTypeBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.SelectDoorTypeFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.selectDoorTypeViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SelectDoorTypeViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.SelectDoorTypeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.SelectDoorTypeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SelectDoorTypeViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SelectDoorTypeViewModel.class), function0, objArr);
            }
        });
        this.loadingDialog = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void h(Resource<T> resource) {
        if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
            IconToastHelper.showOrError(requireContext(), getResources().getString(R.string.access_no_network), resource);
            j().dismiss();
        } else {
            IconToastHelper.showOrError(requireContext(), getResources().getString(R.string.access_access_door_loading_failure), resource);
            j().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSelectDoorTypeBinding i() {
        return (FragmentSelectDoorTypeBinding) this.binding.getValue(this, g[0]);
    }

    private final void initView(View view) {
        i().tvWhiteDoor.setText(getString(DoorKoinModuleKt.getDoorRes().selectOpenWhiteCardTitle()));
        i().tvAccessDoorMessage.setText(getString(DoorKoinModuleKt.getDoorRes().selectOpenCardMessage()));
        i().tvWhiteDoorMessage.setText(getString(DoorKoinModuleKt.getDoorRes().selectOpenWhiteCardMessage()));
        i().rlDoorCard.setOnClickListener(new View.OnClickListener() { // from class: ul6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectDoorTypeFragment.n(this.a, view2);
            }
        });
        i().rlWhiteCard.setOnClickListener(new View.OnClickListener() { // from class: tl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                SelectDoorTypeFragment.o(this.a, view2);
            }
        });
        if (k().isSupportNfcTag()) {
            ViewExtensionKt.visible(i().rlNfcTag);
            ViewExtensionKt.visible(i().dividerTagTop);
        } else {
            ViewExtensionKt.gone(i().rlNfcTag);
            ViewExtensionKt.gone(i().dividerTagTop);
        }
        i().rlNfcTag.setOnClickListener(new View.OnClickListener() { // from class: rl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Exception {
                SelectDoorTypeFragment.p(this.a, view2);
            }
        });
        if (FunctionsConfig.isMiFit().getA().booleanValue()) {
            ViewExtensionKt.gone(i().rlDoorNeighborhood);
            ViewExtensionKt.gone(i().viewNeighborhood);
            ViewExtensionKt.gone(i().viewYun);
            ViewExtensionKt.gone(i().rlDoorYun);
        }
        i().rlDoorNeighborhood.setOnClickListener(new View.OnClickListener() { // from class: sl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectDoorTypeFragment.q(this.a, view2);
            }
        });
        i().tvMessageNeighborhoodUrl.setOnClickListener(new View.OnClickListener() { // from class: wl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectDoorTypeFragment.r(view2);
            }
        });
        i().rlDoorYun.setOnClickListener(new View.OnClickListener() { // from class: ql6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectDoorTypeFragment.s(this.a, view2);
            }
        });
        i().tvMessageYunUrl.setOnClickListener(new View.OnClickListener() { // from class: vl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectDoorTypeFragment.t(view2);
            }
        });
    }

    private final void initViewModel() throws Exception {
        u();
        v();
        LiveDataExtensionKt.observeResourceWithNotNull(k().getDoorResUrlLiveData(), this, new a());
        k().getDoorImageUrl(DoorKoinModuleKt.getDoorRes().selectOpenCardBackground());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog j() {
        return (LoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectDoorTypeViewModel k() {
        return (SelectDoorTypeViewModel) this.selectDoorTypeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        int i = this.clickedId;
        if (i == R.id.rl_white_card) {
            k().getDoorOpenCardData().clear();
            StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, requireContext(), null, 2, null);
        } else if (i == R.id.rl_nfc_tag) {
            StartAccessLoadingActivity.Companion.open$default(StartAccessLoadingActivity.INSTANCE, requireContext(), null, 2, null);
            k().getDoorOpenCardData().setNfcTag(NfcTagExtensionsKt.getNfcTagWithHuamiWebsite());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = AccessDoorUserPrivacyDialog.getInstance(protocolEntity);
        this.accessDoorUserPrivacyDialog = accessDoorUserPrivacyDialog;
        accessDoorUserPrivacyDialog.setOnClickButton(new AccessDoorUserPrivacyDialog.OnClickButton() { // from class: com.huami.wallet.accessdoor.fragment.SelectDoorTypeFragment$initDialog$1
            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickNegation() {
                this.a.accessDoorUserPrivacyDialog.dismiss();
                this.a.getActivity().finish();
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickPosition(@Nullable Long id) throws Exception {
                this.a.k().userAgreementProtocol(id);
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickUserPrivacy(@NotNull String protocol) {
                FunctionsConfig.getOpenWebUrl().invoke(protocol);
            }
        });
        this.accessDoorUserPrivacyDialog.show(getChildFragmentManager(), "AccessCardDetailFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SelectDoorTypeFragment selectDoorTypeFragment, View view) {
        StartAccessActivity.INSTANCE.open(selectDoorTypeFragment.requireContext(), selectDoorTypeFragment.isAgreeProtocol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SelectDoorTypeFragment selectDoorTypeFragment, View view) throws Exception {
        selectDoorTypeFragment.clickedId = view.getId();
        if (selectDoorTypeFragment.isAgreeProtocol) {
            selectDoorTypeFragment.k().getUserProtocol("UPDATE");
        } else {
            selectDoorTypeFragment.k().getUserProtocol("ISSUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SelectDoorTypeFragment selectDoorTypeFragment, View view) throws Exception {
        selectDoorTypeFragment.clickedId = view.getId();
        if (selectDoorTypeFragment.isAgreeProtocol) {
            selectDoorTypeFragment.k().getUserProtocol("UPDATE");
        } else {
            selectDoorTypeFragment.k().getUserProtocol("ISSUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SelectDoorTypeFragment selectDoorTypeFragment, View view) {
        OpenCardInfoActivity.INSTANCE.open(selectDoorTypeFragment.requireContext(), selectDoorTypeFragment.isAgreeProtocol, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(View view) {
        FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.LIN_LI_LIN_WAI_DOOR_CARD_SUPPORT_RANGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SelectDoorTypeFragment selectDoorTypeFragment, View view) {
        OpenCardInfoActivity.INSTANCE.open(selectDoorTypeFragment.requireContext(), selectDoorTypeFragment.isAgreeProtocol, "2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(View view) {
        FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.XIANG_YUN_MEN_DOOR_CARD_SUPPORT_RANGE);
    }

    private final void u() {
        LiveDataExtensionKt.observeResourceWithNotNull(k().getGetProtocolEntityLiveData(), this, new c());
    }

    private final void v() {
        LiveDataExtensionKt.observeResourceWithNotNull(k().getUserAgreementProtocolLiveData(), this, new d());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        super.onViewCreated(view, savedInstanceState);
        this.isAgreeProtocol = requireActivity().getIntent().getBooleanExtra("isAgreeProtocol", false);
        initView(view);
        initViewModel();
    }
}

package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.StartDetectionActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentStartAccessBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.StartAccessViewModel;
import com.huami.wallet.common.helper.ViewExtensionKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006'"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/StartAccessFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "", "initViewModel", "b", "f", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "protocolEntity", "e", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onClick", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "a", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "mAccessDoorUserPrivacyDialog", "Lcom/huami/wallet/accessdoor/viewmodel/StartAccessViewModel;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/wallet/accessdoor/viewmodel/StartAccessViewModel;", "mStartAccessViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "c", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", "Z", "agreeProtocol", "Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessBinding;", "binding", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartAccessFragment extends Fragment implements View.OnClickListener {
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AccessDoorUserPrivacyDialog mAccessDoorUserPrivacyDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStartAccessViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean agreeProtocol;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<ProtocolEntity>, Unit> {
        public a() {
            super(1);
        }

        public final void a(Resource<ProtocolEntity> resource) {
            if (resource.status == Status.LOADING) {
                StartAccessFragment.this.f();
                return;
            }
            if (resource.isSuccessful()) {
                StartAccessFragment.this.b();
                ProtocolEntity protocolEntity = resource.data;
                if (protocolEntity != null) {
                    StartAccessFragment.this.e(protocolEntity);
                    return;
                } else {
                    StartDetectionActivity.INSTANCE.open(StartAccessFragment.this.requireContext());
                    return;
                }
            }
            if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                IconToastHelper.showOrError(StartAccessFragment.this.requireContext(), StartAccessFragment.this.getResources().getString(R.string.access_no_network), resource);
                StartAccessFragment.this.b();
            } else {
                IconToastHelper.showOrError(StartAccessFragment.this.requireContext(), StartAccessFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                StartAccessFragment.this.b();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Resource<String>, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull Resource<String> resource) {
            ViewExtensionKt.loadImage$default(StartAccessFragment.this.c().ivStartAccessBackground, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StartAccessFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessBinding;"));
        f = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartAccessFragment() {
        super(R.layout.fragment_start_access);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessFragment$special$$inlined$viewModel$default$1
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
        this.mStartAccessViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StartAccessViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.StartAccessViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StartAccessViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StartAccessViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new StartAccessFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentStartAccessBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.mLoadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentStartAccessBinding c() {
        return (FragmentStartAccessBinding) this.binding.getValue(this, f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartAccessViewModel d() {
        return (StartAccessViewModel) this.mStartAccessViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = AccessDoorUserPrivacyDialog.getInstance(protocolEntity);
        this.mAccessDoorUserPrivacyDialog = accessDoorUserPrivacyDialog;
        accessDoorUserPrivacyDialog.setOnClickButton(new AccessDoorUserPrivacyDialog.OnClickButton() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessFragment$initDialog$1
            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickNegation() {
                this.a.mAccessDoorUserPrivacyDialog.dismiss();
                FragmentActivity activity = this.a.getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickPosition(@Nullable Long id) throws Exception {
                this.a.d().userAgreementProtocol(id);
            }

            @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
            public void clickUserPrivacy(@NotNull String protocol) {
                FunctionsConfig.getOpenWebUrl().invoke(protocol);
            }
        });
        this.mAccessDoorUserPrivacyDialog.show(getChildFragmentManager(), "AccessCardDetailFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(getActivity(), getResources().getString(R.string.access_access_door_loading));
            this.mLoadingDialog = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
        }
    }

    private final void initView() {
        c().tvButton.setOnClickListener(this);
        c().tvSupport.setOnClickListener(this);
        c().tvFeature.setText(getString(DoorKoinModuleKt.getDoorRes().startAccessDoorTitle()));
        c().tvFeatureTip.setText(getString(DoorKoinModuleKt.getDoorRes().startAccessDoorMessage()));
    }

    private final void initViewModel() throws Exception {
        LiveDataExtensionKt.observeWithNotNull(d().getGetProtocolEntityLiveData(), this, new a());
        LiveDataExtensionKt.observeWithNotNull(d().getUserAgreementProtocolLiveData(), this, new Function1<Resource<String>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessFragment.initViewModel.2

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.StartAccessFragment$initViewModel$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.LOADING.ordinal()] = 1;
                    iArr[Status.SUCCESS.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<String> resource) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i == 1) {
                    StartAccessFragment.this.f();
                    return;
                }
                if (i != 2) {
                    if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                        IconToastHelper.showOrError(StartAccessFragment.this.requireContext(), StartAccessFragment.this.getResources().getString(R.string.access_no_network), resource);
                        StartAccessFragment.this.b();
                        return;
                    } else {
                        IconToastHelper.showOrError(StartAccessFragment.this.requireContext(), StartAccessFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                        StartAccessFragment.this.b();
                        return;
                    }
                }
                StartAccessFragment.this.b();
                if (StartAccessFragment.this.mAccessDoorUserPrivacyDialog != null || StartAccessFragment.this.mAccessDoorUserPrivacyDialog.isShowing()) {
                    StartAccessFragment.this.mAccessDoorUserPrivacyDialog.dismiss();
                }
                StartAccessFragment.this.agreeProtocol = true;
                StartDetectionActivity.INSTANCE.open(StartAccessFragment.this.requireContext());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeResourceWithNotNull(d().getDoorResUrlLiveData(), this, new b());
        d().getDoorImageUrl(DoorKoinModuleKt.getDoorRes().startAccessDoorPicture());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) throws Exception {
        int id = view.getId();
        if (id != R.id.tv_button) {
            if (id == R.id.tv_support) {
                FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.DOOR_CARD_SUPPORT_RANGE);
            }
        } else if (this.agreeProtocol) {
            d().getUserProtocol("UPDATE");
        } else {
            d().getUserProtocol("ISSUE");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getIntent() != null) {
            this.agreeProtocol = requireActivity().getIntent().getBooleanExtra("isAgreeProtocol", false);
        }
        initView();
        initViewModel();
    }
}

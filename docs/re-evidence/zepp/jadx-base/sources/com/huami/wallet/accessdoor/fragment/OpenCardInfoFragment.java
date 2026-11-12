package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.content.ContextCompat;
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
import com.huami.wallet.accessdoor.activity.SearchCommunityActivity;
import com.huami.wallet.accessdoor.activity.StartDetectionActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentMiDongOpenCardInfoBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog;
import com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00100¨\u00064"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/OpenCardInfoFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initViewModel", "Lcom/huami/nfc/web/entity/ProtocolEntity;", "protocolEntity", "h", GoogleApiAvailabilityLight.a, "m", "", "community", "phone", "l", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/wallet/accessdoor/databinding/FragmentMiDongOpenCardInfoBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/wallet/accessdoor/databinding/FragmentMiDongOpenCardInfoBinding;", "binding", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "b", "Lcom/huami/wallet/accessdoor/dialog/AccessDoorUserPrivacyDialog;", "mAccessDoorUserPrivacyDialog", "Lcom/huami/wallet/accessdoor/viewmodel/OpenCardInfoViewModel;", "c", "Lkotlin/Lazy;", "g", "()Lcom/huami/wallet/accessdoor/viewmodel/OpenCardInfoViewModel;", "openCardViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", "Z", "agreeProtocol", "Ljava/lang/String;", "type", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class OpenCardInfoFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AccessDoorUserPrivacyDialog mAccessDoorUserPrivacyDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy openCardViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mLoadingDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean agreeProtocol;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        public final void a(Boolean bool) {
            if (bool.booleanValue()) {
                OpenCardInfoFragment.this.m();
            } else {
                OpenCardInfoFragment.this.d();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool);
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
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(OpenCardInfoFragment.this.getActivity(), OpenCardInfoFragment.this.getResources().getString(R.string.access_access_door_loading));
            loadingDialogShowDialog.setCancelable(false);
            return loadingDialogShowDialog;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OpenCardInfoFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentMiDongOpenCardInfoBinding;"));
        g = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenCardInfoFragment() {
        super(R.layout.fragment_mi_dong_open_card_info);
        this.binding = FragmentViewBindingKt.viewBinding(new OpenCardInfoFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentMiDongOpenCardInfoBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment$special$$inlined$viewModel$default$1
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
        this.openCardViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<OpenCardInfoViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.OpenCardInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final OpenCardInfoViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(OpenCardInfoViewModel.class), function0, objArr);
            }
        });
        this.mLoadingDialog = LazyKt__LazyJVMKt.lazy(new b());
        this.type = "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (f().isShowing()) {
            f().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentMiDongOpenCardInfoBinding e() {
        return (FragmentMiDongOpenCardInfoBinding) this.binding.getValue(this, g[0]);
    }

    private final LoadingDialog f() {
        return (LoadingDialog) this.mLoadingDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenCardInfoViewModel g() {
        return (OpenCardInfoViewModel) this.openCardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = AccessDoorUserPrivacyDialog.getInstance(protocolEntity);
        this.mAccessDoorUserPrivacyDialog = accessDoorUserPrivacyDialog;
        if (accessDoorUserPrivacyDialog != null) {
            accessDoorUserPrivacyDialog.setOnClickButton(new AccessDoorUserPrivacyDialog.OnClickButton() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment$initDialog$1
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
                    this.a.g().userAgreementProtocol(id);
                }

                @Override // com.huami.wallet.accessdoor.dialog.AccessDoorUserPrivacyDialog.OnClickButton
                public void clickUserPrivacy(@NotNull String protocol) {
                    FunctionsConfig.getOpenWebUrl().invoke(protocol);
                }
            });
        }
        this.mAccessDoorUserPrivacyDialog.show(getChildFragmentManager(), "AccessCardDetailFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(OpenCardInfoFragment openCardInfoFragment, View view) {
        openCardInfoFragment.startActivityForResult(new Intent(openCardInfoFragment.requireActivity(), (Class<?>) SearchCommunityActivity.class).putExtra("communityType", openCardInfoFragment.type), 1000);
    }

    private final void initView() {
        e().tvOpenCardTip.setText(getString(DoorKoinModuleKt.getDoorRes().getOpenCardTip()));
        e().etCommunity.setOnClickListener(new View.OnClickListener() { // from class: xm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenCardInfoFragment.i(this.a, view);
            }
        });
        e().etCommunity.addTextChangedListener(new TextWatcher() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment.initView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                OpenCardInfoFragment.this.l(String.valueOf(s), OpenCardInfoFragment.this.e().etPhone.getText().toString());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
            }
        });
        e().etPhone.addTextChangedListener(new TextWatcher() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment.initView.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                OpenCardInfoFragment openCardInfoFragment = OpenCardInfoFragment.this;
                openCardInfoFragment.l(openCardInfoFragment.e().etCommunity.getText().toString(), String.valueOf(s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
            }
        });
        e().tvSupport.setOnClickListener(new View.OnClickListener() { // from class: ym5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenCardInfoFragment.j(view);
            }
        });
        e().tvNextButton.setOnClickListener(new View.OnClickListener() { // from class: wm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                OpenCardInfoFragment.k(this.a, view);
            }
        });
    }

    private final void initViewModel() {
        LiveDataExtensionKt.observeWithNotNull(g().getGetProtocolEntityLiveData(), this, new Function1<Resource<ProtocolEntity>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment.initViewModel.1

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment$initViewModel$1$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.SUCCESS.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<ProtocolEntity> resource) {
                if (WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] != 1) {
                    if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                        IconToastHelper.showOrError(OpenCardInfoFragment.this.requireContext(), OpenCardInfoFragment.this.getResources().getString(R.string.access_no_network), resource);
                        return;
                    } else {
                        IconToastHelper.showOrError(OpenCardInfoFragment.this.requireContext(), OpenCardInfoFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                        return;
                    }
                }
                ProtocolEntity protocolEntity = resource.data;
                if (protocolEntity != null) {
                    OpenCardInfoFragment.this.h(protocolEntity);
                } else {
                    OpenCardInfoFragment.this.g().getDoorOpenCardData().addPhoneNumAndDistrict(OpenCardInfoFragment.this.e().etPhone.getText().toString(), OpenCardInfoFragment.this.e().etCommunity.getText().toString());
                    StartDetectionActivity.INSTANCE.open(OpenCardInfoFragment.this.requireContext());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<ProtocolEntity> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeWithNotNull(g().getUserAgreementProtocolLiveData(), this, new Function1<Resource<String>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment.initViewModel.2

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.OpenCardInfoFragment$initViewModel$2$WhenMappings */
            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Status.values().length];
                    iArr[Status.SUCCESS.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            public final void a(Resource<String> resource) {
                AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog;
                if (WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()] != 1) {
                    if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                        IconToastHelper.showOrError(OpenCardInfoFragment.this.requireContext(), OpenCardInfoFragment.this.getResources().getString(R.string.access_no_network), resource);
                        return;
                    } else {
                        IconToastHelper.showOrError(OpenCardInfoFragment.this.requireContext(), OpenCardInfoFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                        return;
                    }
                }
                if ((OpenCardInfoFragment.this.mAccessDoorUserPrivacyDialog != null || OpenCardInfoFragment.this.mAccessDoorUserPrivacyDialog.isShowing()) && (accessDoorUserPrivacyDialog = OpenCardInfoFragment.this.mAccessDoorUserPrivacyDialog) != null) {
                    accessDoorUserPrivacyDialog.dismiss();
                }
                OpenCardInfoFragment.this.agreeProtocol = true;
                OpenCardInfoFragment.this.g().getDoorOpenCardData().addPhoneNumAndDistrict(OpenCardInfoFragment.this.e().etPhone.getText().toString(), OpenCardInfoFragment.this.e().etCommunity.getText().toString());
                StartDetectionActivity.INSTANCE.open(OpenCardInfoFragment.this.requireContext());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeWithNotNull(g().getLoadingDialogStatusLiveData(), this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(View view) {
        FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.DOOR_CARD_SUPPORT_RANGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(OpenCardInfoFragment openCardInfoFragment, View view) throws Exception {
        if (openCardInfoFragment.agreeProtocol) {
            openCardInfoFragment.g().getUserProtocol("UPDATE");
        } else {
            openCardInfoFragment.g().getUserProtocol("ISSUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String community, String phone) {
        if (!(community == null || community.length() == 0)) {
            if (!(phone == null || phone.length() == 0)) {
                if ((phone == null || phone.length() == 0) || phone.length() >= 11) {
                    e().tvNextButton.setEnabled(true);
                    Context context = getContext();
                    if (context == null) {
                        return;
                    }
                    e().tvNextButton.setTextColor(ContextCompat.getColor(context, R.color.white));
                    return;
                }
            }
        }
        e().tvNextButton.setEnabled(false);
        Context context2 = getContext();
        if (context2 == null) {
            return;
        }
        e().tvNextButton.setTextColor(ContextCompat.getColor(context2, R.color.white40));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (f().isShowing()) {
            return;
        }
        f().show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Bundle extras;
        super.onActivityResult(requestCode, resultCode, data);
        String string = null;
        if (data != null && (extras = data.getExtras()) != null) {
            string = extras.getString("communityName");
        }
        e().etCommunity.setText(string);
        e().etCommunity.setSelection(string == null ? 0 : string.length());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        this.agreeProtocol = requireActivity().getIntent().getBooleanExtra("isAgreeProtocol", false);
        String stringExtra = requireActivity().getIntent().getStringExtra("communityType");
        if (stringExtra == null) {
            stringExtra = "1";
        }
        this.type = stringExtra;
        l(null, null);
        initView();
        initViewModel();
    }
}

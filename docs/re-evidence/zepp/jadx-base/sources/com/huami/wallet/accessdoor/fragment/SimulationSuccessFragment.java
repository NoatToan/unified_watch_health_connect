package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.Intent;
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
import com.huami.nfc.door.DoorCardInfo;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.AccessCardDetailActivity;
import com.huami.wallet.accessdoor.activity.AccessCardListActivity;
import com.huami.wallet.accessdoor.activity.SelectDoorTypeActivity;
import com.huami.wallet.accessdoor.databinding.FragmentSimulationSuccessBinding;
import com.huami.wallet.accessdoor.entity.DoorInfoAndDefaultCard;
import com.huami.wallet.accessdoor.helper.EditTextWatcher;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.helper.Status;
import com.huami.wallet.accessdoor.viewmodel.NamedCardNameViewModel;
import com.huami.widget.toast.CustomToast;
import java.util.List;
import java.util.Objects;
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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006'"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/SimulationSuccessFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "initView", "initViewModel", "e", "b", "f", "", "text", "g", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onClick", "Lcom/huami/wallet/accessdoor/viewmodel/NamedCardNameViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/wallet/accessdoor/viewmodel/NamedCardNameViewModel;", "namedCardNameViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "c", "Ljava/lang/String;", "sessionId", "", "Z", "isWhiteCard", "Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationSuccessBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationSuccessBinding;", "binding", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SimulationSuccessFragment extends Fragment implements View.OnClickListener {
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy namedCardNameViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isWhiteCard;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "", "Lcom/huami/wallet/accessdoor/entity/DoorInfoAndDefaultCard;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<List<? extends DoorInfoAndDefaultCard>>, Unit> {
        public a() {
            super(1);
        }

        public final void a(Resource<List<DoorInfoAndDefaultCard>> resource) {
            if (resource.status == Status.LOADING) {
                SimulationSuccessFragment.this.f();
                return;
            }
            if (!resource.isSuccessful()) {
                if (TextUtils.equals(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                    IconToastHelper.showOrError(SimulationSuccessFragment.this.requireContext(), SimulationSuccessFragment.this.getResources().getString(R.string.access_no_network), resource);
                    SimulationSuccessFragment.this.b();
                    return;
                } else {
                    IconToastHelper.showOrError(SimulationSuccessFragment.this.requireContext(), SimulationSuccessFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                    SimulationSuccessFragment.this.b();
                    return;
                }
            }
            SimulationSuccessFragment.this.b();
            List<DoorInfoAndDefaultCard> list = resource.data;
            if (list == null || list.isEmpty()) {
                SelectDoorTypeActivity.INSTANCE.open(SimulationSuccessFragment.this.requireContext());
            } else if (resource.data.size() == 1) {
                AccessCardDetailActivity.INSTANCE.open(SimulationSuccessFragment.this.requireContext(), resource.data.get(0), false);
            } else {
                AccessCardListActivity.INSTANCE.open(SimulationSuccessFragment.this.requireContext());
                SimulationSuccessFragment.this.requireActivity().finish();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<List<? extends DoorInfoAndDefaultCard>> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SimulationSuccessFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentSimulationSuccessBinding;"));
        f = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimulationSuccessFragment() {
        super(R.layout.fragment_simulation_success);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationSuccessFragment$special$$inlined$viewModel$default$1
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
        this.namedCardNameViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NamedCardNameViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationSuccessFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.NamedCardNameViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NamedCardNameViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(NamedCardNameViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new SimulationSuccessFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentSimulationSuccessBinding.class)));
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
    public final FragmentSimulationSuccessBinding c() {
        return (FragmentSimulationSuccessBinding) this.binding.getValue(this, f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NamedCardNameViewModel d() {
        return (NamedCardNameViewModel) this.namedCardNameViewModel.getValue();
    }

    private final void e() {
        LiveDataExtensionKt.observeWithNotNull(d().getNamedCardNameLiveData(), this, new Function1<Resource<Boolean>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationSuccessFragment$initClickViewModel$1

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

            public final void a(Resource<Boolean> resource) throws Exception {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i == 1) {
                    this.a.f();
                    return;
                }
                if (i == 2) {
                    this.a.b();
                    this.a.d().getCardList(true);
                } else if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                    IconToastHelper.showOrError(this.a.requireContext(), this.a.getResources().getString(R.string.access_no_network), resource);
                    this.a.b();
                } else {
                    IconToastHelper.showOrError(this.a.requireContext(), this.a.getResources().getString(R.string.access_access_door_loading_failure), resource);
                    this.a.b();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<Boolean> resource) throws Exception {
                a(resource);
                return Unit.INSTANCE;
            }
        });
        LiveDataExtensionKt.observeWithNotNull(d().getCardListLiveData(), this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            this.mLoadingDialog = LoadingDialog.showDialog(getActivity(), getResources().getString(R.string.access_access_door_loading));
        }
    }

    private final void g(String text) {
        c().etCardName.setText(text);
        c().etCardName.setSelection(text.length());
    }

    private final void initView(View view) {
        c().etCardName.addTextChangedListener(new EditTextWatcher(14, c().etCardName, getActivity()));
        c().etCardName.setSelection(c().etCardName.getText().length());
        c().tvWhiteMessage.setVisibility(this.isWhiteCard ? 0 : 8);
        c().tvFamily.setOnClickListener(this);
        c().tvCompany.setOnClickListener(this);
        c().tvSchool.setOnClickListener(this);
        c().etCardName.setOnClickListener(this);
        c().tvFinish.setOnClickListener(this);
    }

    private final void initViewModel() {
        NamedCardNameViewModel namedCardNameViewModelD = d();
        String str = this.sessionId;
        Objects.requireNonNull(str);
        namedCardNameViewModelD.getCardInfo(str);
        LiveDataExtensionKt.observeWithNotNull(d().getCardInfoLiveData(), this, new Function1<Resource<DoorCardInfo>, Unit>() { // from class: com.huami.wallet.accessdoor.fragment.SimulationSuccessFragment.initViewModel.1

            /* JADX INFO: renamed from: com.huami.wallet.accessdoor.fragment.SimulationSuccessFragment$initViewModel$1$WhenMappings */
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

            public final void a(Resource<DoorCardInfo> resource) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
                if (i == 1) {
                    SimulationSuccessFragment simulationSuccessFragment = SimulationSuccessFragment.this;
                    simulationSuccessFragment.mLoadingDialog = LoadingDialog.showDialog(simulationSuccessFragment.requireContext(), SimulationSuccessFragment.this.getResources().getString(R.string.access_access_door_loading));
                    LoadingDialog loadingDialog = SimulationSuccessFragment.this.mLoadingDialog;
                    if (loadingDialog == null) {
                        return;
                    }
                    loadingDialog.setCancelable(false);
                    return;
                }
                if (i != 2) {
                    if (Intrinsics.areEqual(resource.code, PayResponse.CODE_NETWORK_ERROR)) {
                        IconToastHelper.showOrError(SimulationSuccessFragment.this.requireContext(), SimulationSuccessFragment.this.getResources().getString(R.string.access_no_network), resource);
                        SimulationSuccessFragment.this.b();
                        return;
                    } else {
                        IconToastHelper.showOrError(SimulationSuccessFragment.this.requireContext(), SimulationSuccessFragment.this.getResources().getString(R.string.access_access_door_loading_failure), resource);
                        SimulationSuccessFragment.this.b();
                        return;
                    }
                }
                SimulationSuccessFragment.this.b();
                SimulationSuccessFragment.this.d().setDoorCardInfo(resource.data);
                if (SimulationSuccessFragment.this.d().isEncryptionCard()) {
                    SimulationSuccessFragment.this.c().tvEmulationTip.setVisibility(0);
                } else {
                    SimulationSuccessFragment.this.c().tvEmulationTip.setVisibility(8);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<DoorCardInfo> resource) {
                a(resource);
                return Unit.INSTANCE;
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) throws Exception {
        if (view.getId() == R.id.tv_family) {
            g(c().tvFamily.getText().toString());
            return;
        }
        if (view.getId() == R.id.tv_company) {
            g(c().tvCompany.getText().toString());
            return;
        }
        if (view.getId() == R.id.tv_school) {
            g(c().tvSchool.getText().toString());
            return;
        }
        if (view.getId() == R.id.tv_finish) {
            if (TextUtils.isEmpty(c().etCardName.getText())) {
                CustomToast.makeText(requireContext(), getResources().getString(R.string.access_please_input_card_name), 1).show();
                return;
            }
            String string = c().etCardName.getText().toString();
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
            if (StringsKt__StringsKt.trim(string).toString().length() > 14) {
                CustomToast.makeText(requireContext(), getResources().getString(R.string.access_door_input_next_length_tip), 0).show();
                return;
            }
            DoorCardInfo doorCardInfo = d().getDoorCardInfo();
            if (doorCardInfo != null) {
                doorCardInfo.setName(c().etCardName.getText().toString());
                d().namedCardName(doorCardInfo);
                return;
            }
            String string2 = c().etCardName.getText().toString();
            NamedCardNameViewModel namedCardNameViewModelD = d();
            String str = this.sessionId;
            Objects.requireNonNull(str);
            namedCardNameViewModelD.getCardInfoByNoNetWorkFirst(str, string2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intent intent;
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            String stringExtra = intent.getStringExtra("sessionId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.sessionId = stringExtra;
            this.isWhiteCard = intent.getBooleanExtra("isWhiteCard", false);
        }
        initView(view);
        initViewModel();
        e();
    }
}

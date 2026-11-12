package com.huami.wallet.accessdoor.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.NfcTag;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.CheckSuccessActivity;
import com.huami.wallet.accessdoor.activity.SupportsEmulationCardActivity;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.databinding.FragmentStartAccessTipBinding;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import com.huami.wallet.accessdoor.fragment.StartAccessTipFragment;
import com.huami.wallet.accessdoor.helper.IconToastHelper;
import com.huami.wallet.accessdoor.helper.LiveDataExtensionKt;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.utils.WebUrlHelper;
import com.huami.wallet.accessdoor.viewmodel.StartAccessDoorViewModel;
import com.huami.wallet.common.helper.ViewExtensionKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/wallet/accessdoor/fragment/StartAccessTipFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "", "initViewModel", "g", "m", hl.k, "i", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initView", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onClick", "Lcom/huami/wallet/accessdoor/viewmodel/StartAccessDoorViewModel;", "a", "Lkotlin/Lazy;", "f", "()Lcom/huami/wallet/accessdoor/viewmodel/StartAccessDoorViewModel;", "viewModel", "Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessTipBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessTipBinding;", "binding", "<init>", "()V", "Companion", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class StartAccessTipFragment extends Fragment implements View.OnClickListener {
    public static final /* synthetic */ KProperty<Object>[] c;
    private static final int d = 9;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/wallet/accessdoor/helper/Resource;", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/door/NfcTag;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Resource<PayResponse<? extends NfcTag>>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Resource<PayResponse<NfcTag>> resource) {
            NfcTag data;
            if (resource.isSuccessful()) {
                CheckSuccessActivity.INSTANCE.open(StartAccessTipFragment.this.requireContext());
                StartAccessTipFragment.this.requireActivity().finish();
                return;
            }
            String str = resource.code;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -879828873) {
                    if (iHashCode != 51) {
                        if (iHashCode != 57) {
                            if (iHashCode == 1727 && str.equals("65")) {
                                StartAccessTipFragment.this.m();
                                return;
                            }
                        } else if (str.equals("9")) {
                            if (StartAccessTipFragment.this.f().isMiDevice()) {
                                StartAccessTipFragment.this.i();
                                return;
                            }
                            PayResponse<NfcTag> payResponse = resource.data;
                            String uid = null;
                            if (payResponse != null && (data = payResponse.getData()) != null) {
                                uid = data.getUid();
                            }
                            if (uid == null || uid.length() == 0) {
                                StartAccessTipFragment.this.i();
                                return;
                            } else {
                                SupportsEmulationCardActivity.INSTANCE.open(StartAccessTipFragment.this.requireActivity());
                                StartAccessTipFragment.this.requireActivity().finish();
                                return;
                            }
                        }
                    } else if (str.equals("3")) {
                        StartAccessTipFragment.this.k();
                        return;
                    }
                } else if (str.equals(PayResponse.CODE_NETWORK_ERROR)) {
                    IconToastHelper.showOrError(StartAccessTipFragment.this.requireContext(), StartAccessTipFragment.this.getResources().getString(R.string.access_no_network), resource);
                    StartAccessTipFragment.this.requireActivity().finish();
                    return;
                }
            }
            StartAccessTipFragment.this.g();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<PayResponse<? extends NfcTag>> resource) {
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
            ViewExtensionKt.loadImage$default(StartAccessTipFragment.this.e().ivBand, resource.data, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<String> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StartAccessTipFragment.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/FragmentStartAccessTipBinding;"));
        c = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartAccessTipFragment() {
        super(R.layout.fragment_start_access_tip);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessTipFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StartAccessDoorViewModel>() { // from class: com.huami.wallet.accessdoor.fragment.StartAccessTipFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.accessdoor.viewmodel.StartAccessDoorViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StartAccessDoorViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StartAccessDoorViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new StartAccessTipFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentStartAccessTipBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentStartAccessTipBinding e() {
        return (FragmentStartAccessTipBinding) this.binding.getValue(this, c[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartAccessDoorViewModel f() {
        return (StartAccessDoorViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setMessage(R.string.access_card_not_support).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: ve7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                StartAccessTipFragment.h(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StartAccessTipFragment startAccessTipFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = startAccessTipFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setMessage(R.string.access_card_not_secret_support).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: we7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                StartAccessTipFragment.j(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    private final void initView(View view) throws Exception {
        f().getDoorImageUrl(DoorKoinModuleKt.getDoorRes().startDetectionDrawable());
        e().tvSupport.setOnClickListener(this);
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        LiveDataExtensionKt.observeResourceWithCompleted(f().getDetectionStatusLiveData(), this, new a());
        LiveDataExtensionKt.observeResourceWithNotNull(f().getDoorResUrlLiveData(), this, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(StartAccessTipFragment startAccessTipFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = startAccessTipFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setMessage(R.string.access_door_card_read_failure_tip).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: te7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                StartAccessTipFragment.l(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(StartAccessTipFragment startAccessTipFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = startAccessTipFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setMessage(R.string.access_door_data_read_failure_tip).setNeutralButton(R.string.access_card_has_known, new DialogInterface.OnClickListener() { // from class: ue7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                StartAccessTipFragment.n(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(StartAccessTipFragment startAccessTipFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = startAccessTipFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        FunctionsConfig.getOpenWebUrl().invoke(WebUrlHelper.DOOR_CARD_SUPPORT_RANGE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        initView(view);
        initViewModel();
        f().isDetectionSuccess();
    }
}

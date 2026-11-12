package com.huami.eid.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.NavController;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.eid.ui.R;
import com.huami.eid.ui.extensions.EidStatusExtensionKt;
import com.huami.eid.ui.fragment.EidDetailFragment;
import com.huami.eid.ui.viewmodel.EidDetailViewModel;
import com.huami.nfc.eid.entities.EidStatus;
import com.huami.wallet.common.helper.ViewExtensionKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/huami/eid/ui/fragment/EidDetailFragment;", "Lcom/huami/eid/ui/fragment/EidBaseFragment;", "", com.google.android.exoplayer2.text.ttml.b.r, "initViewModel", "", "isInstall", "G", "u", "v", LogUtil.D, "w", "z", "", "message", "E", GoogleApiAvailabilityLight.b, "C", "B", "", "setViewId", "initView", "c", "Z", "needCheck", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "deleteView", "e", "titleView", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/huami/eid/ui/viewmodel/EidDetailViewModel;", "g", "Lkotlin/Lazy;", "o", "()Lcom/huami/eid/ui/viewmodel/EidDetailViewModel;", "viewModel", "<init>", "()V", "Companion", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidDetailFragment extends EidBaseFragment {
    private static final float h = 14.0f;
    private static final float i = 14.4f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean needCheck = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextView deleteView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TextView titleView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EidDetailFragment.this.w();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Success<Boolean> success) {
                this.a.needCheck = false;
                this.a.n();
                EidDetailFragment eidDetailFragment = this.a;
                Boolean value = success.getValue();
                eidDetailFragment.G(value != null ? value.booleanValue() : false);
                View view = this.a.getView();
                ViewExtensionKt.visible(view == null ? null : view.findViewById(R.id.root));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.eid.ui.fragment.EidDetailFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0379b extends Lambda implements Function1<Loading<? extends Boolean>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0379b(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Loading<Boolean> loading) {
                EidDetailFragment eidDetailFragment = this.a;
                eidDetailFragment.C(eidDetailFragment.getString(R.string.eid_loading));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Boolean> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                EidDetailFragment eidDetailFragment = this.a;
                eidDetailFragment.B(eidDetailFragment.getString(R.string.eid_loading_failure_tips));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onSuccess(new a(EidDetailFragment.this));
            stateBuilder.onLoading(new C0379b(EidDetailFragment.this));
            stateBuilder.onFail(new c(EidDetailFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<Unit>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Unit>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Success<Unit> success) {
                this.a.n();
                this.a.G(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Unit> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Loading<? extends Unit>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Loading<Unit> loading) {
                EidDetailFragment eidDetailFragment = this.a;
                eidDetailFragment.C(eidDetailFragment.getString(R.string.eid_delete_loading));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Unit> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.eid.ui.fragment.EidDetailFragment$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0380c extends Lambda implements Function1<Fail<? extends Unit>, Unit> {
            public final /* synthetic */ EidDetailFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0380c(EidDetailFragment eidDetailFragment) {
                super(1);
                this.a = eidDetailFragment;
            }

            public final void a(@NotNull Fail<Unit> fail) {
                this.a.n();
                this.a.z();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Unit> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Unit> stateBuilder) {
            stateBuilder.onSuccess(new a(EidDetailFragment.this));
            stateBuilder.onLoading(new b(EidDetailFragment.this));
            stateBuilder.onFail(new C0380c(EidDetailFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Unit> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EidDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.eid.ui.fragment.EidDetailFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EidDetailViewModel>() { // from class: com.huami.eid.ui.fragment.EidDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.eid.ui.viewmodel.EidDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EidDetailViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(EidDetailViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(String message) {
        LoadingDialog loadingDialog = this.loadingDialog;
        Objects.requireNonNull(loadingDialog);
        loadingDialog.setFailed(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String message) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireActivity(), message);
        this.loadingDialog = loadingDialogShowDialog;
        Objects.requireNonNull(loadingDialogShowDialog);
        loadingDialogShowDialog.setCancelable(false);
    }

    private final void D() {
        o().navigateToProtocol();
    }

    private final void E(String message) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(message);
        builder.setNeutralButton(R.string.eid_know_it, new DialogInterface.OnClickListener() { // from class: dk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EidDetailFragment.F(this.a, dialogInterface, i2);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(EidDetailFragment eidDetailFragment, DialogInterface dialogInterface, int i2) {
        eidDetailFragment.onBackButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean isInstall) {
        if (isInstall) {
            TextView textView = this.titleView;
            Objects.requireNonNull(textView);
            textView.setText(R.string.eid_card_title);
            View view = getView();
            ViewExtensionKt.visible(view == null ? null : view.findViewById(R.id.tips));
            TextView textView2 = this.deleteView;
            Objects.requireNonNull(textView2);
            ViewExtensionKt.visible(textView2);
            View view2 = getView();
            ViewExtensionKt.gone(view2 == null ? null : view2.findViewById(R.id.open_card_info));
            View view3 = getView();
            ((TextView) (view3 == null ? null : view3.findViewById(R.id.open_card))).setEnabled(true);
            View view4 = getView();
            ((TextView) (view4 != null ? view4.findViewById(R.id.open_card) : null)).setText(R.string.eid_available_scenes);
            return;
        }
        TextView textView3 = this.titleView;
        Objects.requireNonNull(textView3);
        textView3.setText(R.string.eid_open_card_title);
        View view5 = getView();
        ViewExtensionKt.gone(view5 == null ? null : view5.findViewById(R.id.tips));
        TextView textView4 = this.deleteView;
        Objects.requireNonNull(textView4);
        ViewExtensionKt.gone(textView4);
        View view6 = getView();
        ViewExtensionKt.visible(view6 == null ? null : view6.findViewById(R.id.open_card_info));
        View view7 = getView();
        TextView textView5 = (TextView) (view7 == null ? null : view7.findViewById(R.id.open_card));
        View view8 = getView();
        textView5.setEnabled(((CheckBox) (view8 == null ? null : view8.findViewById(R.id.agreement_checkbox))).isChecked());
        View view9 = getView();
        ((TextView) (view9 != null ? view9.findViewById(R.id.open_card) : null)).setText(R.string.eid_open);
    }

    private final void initViewModel() {
        LiveDataExtensionKt.observeState$default(o().isOpenLiveDate(), this, null, new b(), 2, null);
        LiveDataExtensionKt.observeState$default(o().getDeleteResultLiveData(), this, null, new c(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        LoadingDialog loadingDialog = this.loadingDialog;
        Objects.requireNonNull(loadingDialog);
        if (loadingDialog.isShowing()) {
            LoadingDialog loadingDialog2 = this.loadingDialog;
            Objects.requireNonNull(loadingDialog2);
            loadingDialog2.dismiss();
        }
    }

    private final EidDetailViewModel o() {
        return (EidDetailViewModel) this.viewModel.getValue();
    }

    private final void p() {
        TextView textView = new TextView(requireContext());
        textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.action_bar_view_grey));
        textView.setTextSize(2, 14.0f);
        EidBaseFragment.setCenterView$default(this, textView, null, 2, null);
        Unit unit = Unit.INSTANCE;
        this.titleView = textView;
        TextView textView2 = new TextView(requireContext());
        setEndView(textView2, new a());
        int dimension = (int) textView2.getResources().getDimension(R.dimen.t6);
        textView2.setPadding(dimension, 0, dimension, 0);
        textView2.setText(R.string.eid_delete);
        textView2.setTextColor(ContextCompat.getColor(requireContext(), R.color.black100));
        textView2.setTextSize(2, i);
        ViewExtensionKt.gone(textView2);
        this.deleteView = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EidDetailFragment eidDetailFragment, CompoundButton compoundButton, boolean z) {
        View view = eidDetailFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.open_card))).setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EidDetailFragment eidDetailFragment, View view) {
        eidDetailFragment.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EidDetailFragment eidDetailFragment, View view) {
        eidDetailFragment.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EidDetailFragment eidDetailFragment, View view) {
        EidStatus eidStatus = eidDetailFragment.o().getEidStatus();
        if (EidStatusExtensionKt.installedInCurrentDevice(eidStatus)) {
            eidDetailFragment.v();
        } else if (EidStatusExtensionKt.installedInOtherDevice(eidStatus)) {
            eidDetailFragment.E(eidDetailFragment.getString(R.string.eid_user_already_opened_tips));
        } else {
            eidDetailFragment.u();
        }
    }

    private final void u() {
        NavController navController = getNavController();
        if (navController == null) {
            return;
        }
        navController.navigate(R.id.action_to_open);
    }

    private final void v() {
        o().navigateToFaq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(R.string.eid_delete_tips);
        builder.setPositiveButton(R.string.eid_confirm_delete, new DialogInterface.OnClickListener() { // from class: ek1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EidDetailFragment.x(this.a, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(R.string.eid_cancel, new DialogInterface.OnClickListener() { // from class: gk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EidDetailFragment.y(dialogInterface, i2);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(EidDetailFragment eidDetailFragment, DialogInterface dialogInterface, int i2) {
        eidDetailFragment.o().deleteEidCard(eidDetailFragment.o().getEidStatus().getOrderNum());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(getContext());
        builder.setMessage(getString(R.string.eid_delete_failure_tips));
        builder.setNeutralButton(R.string.eid_know_it, new DialogInterface.OnClickListener() { // from class: fk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EidDetailFragment.A(dialogInterface, i2);
            }
        });
        builder.create();
        builder.show(getChildFragmentManager());
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public void initView() {
        super.initView();
        p();
        View view = getView();
        ((CheckBox) (view == null ? null : view.findViewById(R.id.agreement_checkbox))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kk1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                EidDetailFragment.q(this.a, compoundButton, z);
            }
        });
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.see_more))).setOnClickListener(new View.OnClickListener() { // from class: hk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                EidDetailFragment.r(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.protocol))).setOnClickListener(new View.OnClickListener() { // from class: jk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                EidDetailFragment.s(this.a, view4);
            }
        });
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.open_card))).setOnClickListener(new View.OnClickListener() { // from class: ik1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                EidDetailFragment.t(this.a, view5);
            }
        });
        View view5 = getView();
        ViewExtensionKt.gone(view5 != null ? view5.findViewById(R.id.root) : null);
        initViewModel();
        if (this.needCheck) {
            o().m3332getEidStatus();
        }
    }

    @Override // com.huami.eid.ui.fragment.EidBaseFragment
    public int setViewId() {
        return R.layout.fragment_eid_detail;
    }
}

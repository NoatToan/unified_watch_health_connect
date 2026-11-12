package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RefundUserInputAuthFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LiveDataExtensionKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import java.util.Objects;
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
import kotlin.text.Regex;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b/\u00100J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundUserInputAuthFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "Lkotlin/Function0;", "", "onSure", "l", "onPass", "", "f", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/nfc/bus/entities/RefundTicket;", "it", z.j, "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "b", "Lkotlin/Lazy;", "h", "()Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "xiaomiSztRefundViewModel", "Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "c", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "viewModel", "Lcom/huami/wallet/ui/fragment/RefundUserInputAuthFragment$a;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/fragment/RefundUserInputAuthFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "e", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/wallet/ui/navigation/NavigationController;", "g", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "<init>", "()V", "Companion", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RefundUserInputAuthFragment extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean g = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaomiSztRefundViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final a mViewHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundUserInputAuthFragment$Companion;", "", "", "canBack", "Z", "getCanBack", "()Z", "setCanBack", "(Z)V", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getCanBack() {
            return RefundUserInputAuthFragment.g;
        }

        public final void setCanBack(boolean z) {
            RefundUserInputAuthFragment.g = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\r\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"com/huami/wallet/ui/fragment/RefundUserInputAuthFragment$a", "", "Landroid/widget/EditText;", "a", "Landroid/widget/EditText;", "c", "()Landroid/widget/EditText;", "g", "(Landroid/widget/EditText;)V", "inputName", "b", "e", "inputAlipay", "f", "inputMobile", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "h", "(Landroid/widget/TextView;)V", "useInputAuthButton", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private EditText inputName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private EditText inputAlipay;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private EditText inputMobile;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private TextView useInputAuthButton;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final EditText getInputAlipay() {
            return this.inputAlipay;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final EditText getInputMobile() {
            return this.inputMobile;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final EditText getInputName() {
            return this.inputName;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getUseInputAuthButton() {
            return this.useInputAuthButton;
        }

        public final void e(@Nullable EditText editText) {
            this.inputAlipay = editText;
        }

        public final void f(@Nullable EditText editText) {
            this.inputMobile = editText;
        }

        public final void g(@Nullable EditText editText) {
            this.inputName = editText;
        }

        public final void h(@Nullable TextView textView) {
            this.useInputAuthButton = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ RefundUserInputAuthFragment a;

            /* JADX INFO: renamed from: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0646a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ RefundUserInputAuthFragment a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0646a(RefundUserInputAuthFragment refundUserInputAuthFragment) {
                    super(0);
                    this.a = refundUserInputAuthFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    XiaomiSztRefundViewModel xiaomiSztRefundViewModelH = this.a.h();
                    Args args = Args.INSTANCE;
                    if (xiaomiSztRefundViewModelH.isMiAndNoSzt(args.getAppCode())) {
                        this.a.h().returnCard(args.getAppCode(), Integer.valueOf(args.getBlance()), null);
                    } else {
                        this.a.getViewModel().refundTicket(args.getAppCode(), String.valueOf(args.getRefundReasonCode()), args.getCardNumber(), new RefundTicketPostBody(WFStateEvent.WF_PAYTYPE_ALI, "", args.getAlipay(), args.getName(), args.getMobile()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RefundUserInputAuthFragment refundUserInputAuthFragment) {
                super(0);
                this.a = refundUserInputAuthFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RefundUserInputAuthFragment refundUserInputAuthFragment = this.a;
                refundUserInputAuthFragment.l(new C0646a(refundUserInputAuthFragment));
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable View view) {
            RefundUserInputAuthFragment refundUserInputAuthFragment = RefundUserInputAuthFragment.this;
            refundUserInputAuthFragment.f(new a(refundUserInputAuthFragment));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/nfc/bus/entities/RefundTicket;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Resource<RefundTicket>, Unit> {
        public c() {
            super(1);
        }

        public final void a(Resource<RefundTicket> resource) {
            RefundUserInputAuthFragment.this.j(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<RefundTicket> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/wallet/lib/entity/Resource;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Resource<Unit>, Unit> {
        public d() {
            super(1);
        }

        public final void a(Resource<Unit> resource) {
            RefundUserInputAuthFragment.this.i(resource);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Resource<Unit> resource) {
            a(resource);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RefundUserInputAuthFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$special$$inlined$viewModel$default$1
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
        this.xiaomiSztRefundViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiSztRefundViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XiaomiSztRefundViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(XiaomiSztRefundViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$special$$inlined$viewModel$default$3
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ReturnViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.ReturnViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ReturnViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(ReturnViewModel.class), function1, objArr3);
            }
        });
        this.mViewHolder = new a();
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RefundUserInputAuthFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(Function0<Unit> onPass) {
        String string = this.mViewHolder.getInputName().getText().toString();
        String string2 = this.mViewHolder.getInputAlipay().getText().toString();
        String string3 = this.mViewHolder.getInputMobile().getText().toString();
        if (string == null || m.isBlank(string)) {
            CustomToast.showShort(getActivity(), getString(R.string.wl_return_card_input_tosat_name));
            return false;
        }
        if (string2 == null || m.isBlank(string2)) {
            CustomToast.showShort(getActivity(), getString(R.string.wl_return_card_input_tosat_alipay));
            return false;
        }
        if (string3 == null || m.isBlank(string3)) {
            CustomToast.showShort(getActivity(), getString(R.string.wl_return_card_input_tosat_mobile));
            return false;
        }
        if (!new Regex(BindPhoneNumberFragment.PHONE_REGEXP).matches(string3)) {
            CustomToast.showShort(getActivity(), getString(R.string.wl_return_card_input_tosat_mobile_error));
            return false;
        }
        Args args = Args.INSTANCE;
        args.setMobile(string3);
        args.setName(string);
        args.setAlipay(string2);
        onPass.invoke();
        return true;
    }

    private final NavigationController g() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiSztRefundViewModel h() {
        return (XiaomiSztRefundViewModel) this.xiaomiSztRefundViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Resource<Unit> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrErrorWithLoadingTips(it2, getString(R.string.wl_return_card_progress_tips));
        }
        Status status = it2.status;
        g = status != Status.LOADING;
        if (status == Status.SUCCESS) {
            g().closePreviousPages();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            g().navigateReturnCardResultSuccessActivity(getActivity());
            return;
        }
        if (status == Status.ERROR) {
            g().closePreviousPages();
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            g().navigateReturnCardResultFailActivity(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Resource<RefundTicket> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrErrorWithLoadingTips(it2, getString(R.string.wl_return_card_progress_tips));
        }
        Status status = it2.status;
        g = status != Status.LOADING;
        if (status != Status.SUCCESS) {
            return;
        }
        Args args = Args.INSTANCE;
        RefundTicket refundTicket = it2.data;
        args.setSnbTicket(refundTicket == null ? null : refundTicket.getSnbTicket());
        getViewModel().refundCard(args.getAppCode(), args.getSnbTicket());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(RefundUserInputAuthFragment refundUserInputAuthFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            LoadingDialogHelper loadingDialogHelper = refundUserInputAuthFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(refundUserInputAuthFragment.requireContext().getResources().getString(R.string.wl_deleting_tip));
            return;
        }
        if (i == 2) {
            LoadingDialogHelper loadingDialogHelper2 = refundUserInputAuthFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            refundUserInputAuthFragment.g().closePreviousPages();
            FragmentActivity activity = refundUserInputAuthFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
            refundUserInputAuthFragment.g().navigateReturnCardResultSuccessActivity(refundUserInputAuthFragment.getActivity());
            return;
        }
        if (i != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = refundUserInputAuthFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        refundUserInputAuthFragment.g().closePreviousPages();
        FragmentActivity activity2 = refundUserInputAuthFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        refundUserInputAuthFragment.g().navigateReturnCardResultFailActivity(refundUserInputAuthFragment.getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final Function0<Unit> onSure) {
        new AlertDialogFragment.Builder(b()).setTitle(R.string.wl_return_card_input_et_sure_title).setMessage(R.string.wl_return_card_input_et_sure_tips).setNegativeButton(R.string.wl_return_card_input_et_sure_modify, new DialogInterface.OnClickListener() { // from class: ma6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RefundUserInputAuthFragment.m(dialogInterface, i);
            }
        }).setPositiveButton(R.string.wl_return_card_input_sure, new DialogInterface.OnClickListener() { // from class: la6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RefundUserInputAuthFragment.n(onSure, dialogInterface, i);
            }
        }).setCancelable(false).create().show(getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Function0 function0, DialogInterface dialogInterface, int i) {
        function0.invoke();
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
        return inflater.inflate(R.layout.wl_fragment_return_crad_user_input_auth, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        a aVar = this.mViewHolder;
        View viewFindViewById = view.findViewById(R.id.wl_return_card_input_name);
        Objects.requireNonNull(viewFindViewById, "null cannot be cast to non-null type android.widget.EditText");
        aVar.g((EditText) viewFindViewById);
        a aVar2 = this.mViewHolder;
        View viewFindViewById2 = view.findViewById(R.id.wl_return_card_input_alipay);
        Objects.requireNonNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.EditText");
        aVar2.e((EditText) viewFindViewById2);
        a aVar3 = this.mViewHolder;
        View viewFindViewById3 = view.findViewById(R.id.wl_return_card_input_mobile);
        Objects.requireNonNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        aVar3.f((EditText) viewFindViewById3);
        this.mViewHolder.h((TextView) view.findViewById(R.id.wl_return_card_input_sure_button));
        TextView useInputAuthButton = this.mViewHolder.getUseInputAuthButton();
        if (useInputAuthButton != null) {
            KTViewExtensionKt.singleClick(useInputAuthButton, new b());
        }
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getRefundTicketLiveData(), this, new c());
        LiveDataExtensionKt.observeWithNotNull(getViewModel().getRefundCardLiveData(), this, new d());
        h().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退卡"));
        h().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: na6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundUserInputAuthFragment.k(this.a, (Resource) obj);
            }
        });
    }
}

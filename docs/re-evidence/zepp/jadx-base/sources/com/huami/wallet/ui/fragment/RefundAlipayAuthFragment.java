package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.alipay.sdk.app.AuthTask;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.bus.entities.PayAuthorizationInfo;
import com.huami.nfc.bus.entities.RefundTicket;
import com.huami.nfc.bus.entities.RefundTicketPostBody;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.RefundAlipayAuthFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.Args;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.KTViewExtensionKt;
import com.huami.wallet.ui.viewmodel.ReturnViewModel;
import com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel;
import com.huami.wallet.ui.wlpay.AuthResult;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.loc.z;
import java.util.Map;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\t*\u0001/\u0018\u0000 52\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b3\u00104J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u001c\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/nfc/bus/entities/PayAuthorizationInfo;", "it", "", "l", "Lcom/huami/nfc/bus/entities/RefundTicket;", GoogleApiAvailabilityLight.b, "m", "", "alipayInfo", "h", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/huami/wallet/ui/viewmodel/ReturnViewModel;", "viewModel", "Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "c", hl.k, "()Lcom/huami/wallet/ui/viewmodel/XiaomiSztRefundViewModel;", "xiaomiSztRefundViewModel", "Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment$a;", GoogleApiAvailabilityLight.a, "Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment$a;", "mViewHolder", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "e", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/wallet/ui/navigation/NavigationController;", "f", z.j, "()Lcom/huami/wallet/ui/navigation/NavigationController;", "navigationController", "com/huami/wallet/ui/fragment/RefundAlipayAuthFragment$mHandler$1", "g", "Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment$mHandler$1;", "mHandler", "<init>", "()V", "Companion", "a", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RefundAlipayAuthFragment extends BaseFragment {
    public static final int FLAG_ALIPAY_AUTH = 9871;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaomiSztRefundViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final a mViewHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private RefundAlipayAuthFragment$mHandler$1 mHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean h = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/wallet/ui/fragment/RefundAlipayAuthFragment$Companion;", "", "", "canBack", "Z", "getCanBack", "()Z", "setCanBack", "(Z)V", "", "FLAG_ALIPAY_AUTH", LogUtil.I, "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getCanBack() {
            return RefundAlipayAuthFragment.h;
        }

        public final void setCanBack(boolean z) {
            RefundAlipayAuthFragment.h = z;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"com/huami/wallet/ui/fragment/RefundAlipayAuthFragment$a", "", "Landroid/view/View;", "a", "Landroid/view/View;", "b", "()Landroid/view/View;", "e", "(Landroid/view/View;)V", "toAuth", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "f", "(Landroid/widget/TextView;)V", "tvAlipayTips", GoogleApiAvailabilityLight.a, "alipayAuthButton", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private View toAuth;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private TextView tvAlipayTips;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private TextView alipayAuthButton;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getAlipayAuthButton() {
            return this.alipayAuthButton;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View getToAuth() {
            return this.toAuth;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getTvAlipayTips() {
            return this.tvAlipayTips;
        }

        public final void d(@Nullable TextView textView) {
            this.alipayAuthButton = textView;
        }

        public final void e(@Nullable View view) {
            this.toAuth = view;
        }

        public final void f(@Nullable TextView textView) {
            this.tvAlipayTips = textView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
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
            RefundAlipayAuthFragment.this.getViewModel().authorization(Args.INSTANCE.getAppCode());
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
            XiaomiSztRefundViewModel xiaomiSztRefundViewModelK = RefundAlipayAuthFragment.this.k();
            Args args = Args.INSTANCE;
            if (xiaomiSztRefundViewModelK.isMiAndNoSzt(args.getAppCode())) {
                RefundAlipayAuthFragment.this.k().returnCard(args.getAppCode(), Integer.valueOf(args.getBlance()), null);
            } else {
                RefundAlipayAuthFragment.this.getViewModel().refundTicket(args.getAppCode(), String.valueOf(args.getRefundReasonCode()), args.getCardNumber(), new RefundTicketPostBody(WFStateEvent.WF_PAYTYPE_ALI, args.getAuthCode(), "", "", ""));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$mHandler$1] */
    public RefundAlipayAuthFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ReturnViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$special$$inlined$viewModel$default$2
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
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$special$$inlined$viewModel$default$3
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
        this.xiaomiSztRefundViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<XiaomiSztRefundViewModel>() { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.XiaomiSztRefundViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XiaomiSztRefundViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(XiaomiSztRefundViewModel.class), function1, objArr3);
            }
        });
        this.mViewHolder = new a();
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$special$$inlined$inject$default$1
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
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.huami.wallet.ui.fragment.RefundAlipayAuthFragment$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                super.handleMessage(msg);
                if (msg.what == 9871) {
                    Object obj = msg.obj;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>");
                    AuthResult authResult = new AuthResult((Map) obj, true);
                    if (!TextUtils.equals(authResult.getResultStatus(), "9000") || !TextUtils.equals(authResult.getResultCode(), "200")) {
                        TextUtils.isEmpty(authResult.getAuthCode());
                        return;
                    }
                    Args.INSTANCE.setAuthCode(authResult.getAuthCode());
                    TextView tvAlipayTips = this.a.mViewHolder.getTvAlipayTips();
                    if (tvAlipayTips != null) {
                        tvAlipayTips.setText(R.string.wl_return_card_alipay_auth_success);
                    }
                    TextView alipayAuthButton = this.a.mViewHolder.getAlipayAuthButton();
                    if (alipayAuthButton == null) {
                        return;
                    }
                    alipayAuthButton.setEnabled(true);
                }
            }
        };
    }

    private final void h(final String alipayInfo) {
        new Thread(new Runnable() { // from class: ia6
            @Override // java.lang.Runnable
            public final void run() {
                RefundAlipayAuthFragment.i(this.a, alipayInfo);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(RefundAlipayAuthFragment refundAlipayAuthFragment, String str) {
        Map<String, String> mapAuthV2 = new AuthTask(refundAlipayAuthFragment.getActivity()).authV2(str, true);
        Message message = new Message();
        message.what = FLAG_ALIPAY_AUTH;
        message.obj = mapAuthV2;
        refundAlipayAuthFragment.mHandler.sendMessage(message);
    }

    private final NavigationController j() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final XiaomiSztRefundViewModel k() {
        return (XiaomiSztRefundViewModel) this.xiaomiSztRefundViewModel.getValue();
    }

    private final void l(Resource<PayAuthorizationInfo> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(it2);
        }
        Status status = it2.status;
        if (status != Status.SUCCESS) {
            h = status != Status.LOADING;
            return;
        }
        h = true;
        TextView tvAlipayTips = this.mViewHolder.getTvAlipayTips();
        if (tvAlipayTips != null) {
            tvAlipayTips.setText(R.string.wl_return_card_alipay_auth_success);
        }
        Args args = Args.INSTANCE;
        args.setPayAuthorizationInfo(it2.data);
        PayAuthorizationInfo payAuthorizationInfo = args.getPayAuthorizationInfo();
        h(payAuthorizationInfo == null ? null : payAuthorizationInfo.getTitle());
    }

    private final void m(Resource<Unit> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrErrorWithLoadingTips(it2, getString(R.string.wl_return_card_progress_tips));
        }
        Status status = it2.status;
        h = status != Status.LOADING;
        if (status == Status.SUCCESS) {
            j().closePreviousPages();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            j().navigateReturnCardResultSuccessActivity(getActivity());
            return;
        }
        if (status == Status.ERROR) {
            j().closePreviousPages();
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            j().navigateReturnCardResultFailActivity(getActivity());
        }
    }

    private final void n(Resource<RefundTicket> it2) {
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrErrorWithLoadingTips(it2, getString(R.string.wl_return_card_progress_tips));
        }
        Status status = it2.status;
        if (status != Status.SUCCESS) {
            h = status != Status.LOADING;
            return;
        }
        h = true;
        Args args = Args.INSTANCE;
        RefundTicket refundTicket = it2.data;
        args.setSnbTicket(refundTicket == null ? null : refundTicket.getSnbTicket());
        getViewModel().refundCard(args.getAppCode(), args.getSnbTicket());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(RefundAlipayAuthFragment refundAlipayAuthFragment, Resource resource) {
        refundAlipayAuthFragment.l(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(RefundAlipayAuthFragment refundAlipayAuthFragment, Resource resource) {
        refundAlipayAuthFragment.n(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(RefundAlipayAuthFragment refundAlipayAuthFragment, Resource resource) {
        refundAlipayAuthFragment.m(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(RefundAlipayAuthFragment refundAlipayAuthFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        if (i == 1) {
            LoadingDialogHelper loadingDialogHelper = refundAlipayAuthFragment.loadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading(refundAlipayAuthFragment.requireContext().getResources().getString(R.string.wl_deleting_tip));
            return;
        }
        if (i == 2) {
            LoadingDialogHelper loadingDialogHelper2 = refundAlipayAuthFragment.loadingDialogHelper;
            if (loadingDialogHelper2 != null) {
                loadingDialogHelper2.hideLoading();
            }
            refundAlipayAuthFragment.j().closePreviousPages();
            FragmentActivity activity = refundAlipayAuthFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
            refundAlipayAuthFragment.j().navigateReturnCardResultSuccessActivity(refundAlipayAuthFragment.getActivity());
            return;
        }
        if (i != 3) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = refundAlipayAuthFragment.loadingDialogHelper;
        if (loadingDialogHelper3 != null) {
            loadingDialogHelper3.hideLoading();
        }
        refundAlipayAuthFragment.j().closePreviousPages();
        FragmentActivity activity2 = refundAlipayAuthFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        refundAlipayAuthFragment.j().navigateReturnCardResultFailActivity(refundAlipayAuthFragment.getActivity());
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
        return inflater.inflate(R.layout.wl_fragment_remind_return_alipay, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.loadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        this.mViewHolder.e(view.findViewById(R.id.ll_alipay_auth));
        this.mViewHolder.f((TextView) view.findViewById(R.id.tv_alipay_tips));
        this.mViewHolder.d((TextView) view.findViewById(R.id.alipay_auth_button));
        View toAuth = this.mViewHolder.getToAuth();
        if (toAuth != null) {
            KTViewExtensionKt.singleClick(toAuth, new b());
        }
        TextView alipayAuthButton = this.mViewHolder.getAlipayAuthButton();
        if (alipayAuthButton != null) {
            KTViewExtensionKt.singleClick(alipayAuthButton, new c());
        }
        getViewModel().getAuthorizationLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ha6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundAlipayAuthFragment.o(this.a, (Resource) obj);
            }
        });
        getViewModel().getRefundTicketLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: fa6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundAlipayAuthFragment.p(this.a, (Resource) obj);
            }
        });
        getViewModel().getRefundCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ga6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundAlipayAuthFragment.q(this.a, (Resource) obj);
            }
        });
        k().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("退卡"));
        k().getXiaomiReturnCardLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ea6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                RefundAlipayAuthFragment.r(this.a, (Resource) obj);
            }
        });
    }
}

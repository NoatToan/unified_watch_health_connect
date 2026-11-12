package com.huami.wallet.ui.fragment;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.fragment.BindPhoneNumberFragment;
import com.huami.wallet.ui.helper.BenchmarkResourceObserver;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.utils.TintUtils;
import com.huami.wallet.ui.viewmodel.BindPhoneNumberViewModel;
import com.huami.widget.captcha.CaptchaView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u0000 Z2\u00020\u0001:\u0002Z[B\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00106\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010H\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A\"\u0004\bG\u0010CR$\u0010L\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR$\u0010P\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR$\u0010S\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010?\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010CR\u0018\u0010T\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0018\u0010U\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010?R\u0018\u0010V\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010?R\u0018\u0010W\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010?¨\u0006\\"}, d2 = {"Lcom/huami/wallet/ui/fragment/BindPhoneNumberFragment;", "Lcom/huami/wallet/ui/fragment/BaseFragment;", "", "initViewModel", "Lcom/huami/wallet/lib/entity/Resource;", "Lcom/huami/wallet/ui/viewmodel/BindPhoneNumberViewModel$CardAndPhone;", "r", "E", "B", "initViews", "", GoogleApiAvailabilityLight.b, "m", "o", "C", "", "remainingTime", LogUtil.D, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "Lcom/huami/wallet/ui/navigation/NavigationController;", "b", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/wallet/ui/navigation/NavigationController;", "mNavigationController", "Lcom/huami/wallet/ui/fragment/BindPhoneNumberFragment$ViewHolder;", "c", "Lcom/huami/wallet/ui/fragment/BindPhoneNumberFragment$ViewHolder;", "mViewHolder", "Lcom/huami/wallet/ui/viewmodel/BindPhoneNumberViewModel;", GoogleApiAvailabilityLight.a, DTransferConstants.SEARCH_KEY, "()Lcom/huami/wallet/ui/viewmodel/BindPhoneNumberViewModel;", "mViewModel", "Landroid/os/CountDownTimer;", "e", "Landroid/os/CountDownTimer;", "mCountDownTimer", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "f", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "mLoadingDialogHelper", "g", "Z", "isShiftIn", "()Z", "setShiftIn", "(Z)V", "h", "isShiftOut", "setShiftOut", "", "i", "Ljava/lang/String;", "getBusCardId", "()Ljava/lang/String;", "setBusCardId", "(Ljava/lang/String;)V", "busCardId", z.j, "getBusCardName", "setBusCardName", "busCardName", hl.k, "getOrderId", "setOrderId", "orderId", "l", "getBusCardImageUrl", "setBusCardImageUrl", "busCardImageUrl", "getXiaoMiBusCardName", "setXiaoMiBusCardName", "xiaoMiBusCardName", "packageName", "appName", "redirectTo", "serviceContact", "<init>", "()V", "Companion", "ViewHolder", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BindPhoneNumberFragment extends BaseFragment {

    @NotNull
    public static final String ARG_APP_NAME = "ARG_APP_NAME";

    @NotNull
    public static final String ARG_BUS_CARD_ID = "ARG_BUS_CARD_ID";

    @NotNull
    public static final String ARG_BUS_CARD_IMAGE_URL = "ARG_BUS_CARD_IMAGE_URL";

    @NotNull
    public static final String ARG_BUS_CARD_NAME = "ARG_BUS_CARD_NAME";

    @NotNull
    public static final String ARG_BUS_XIAOMI_CARD_NAME = "ARG_BUS_XIAOMI_CARD_NAME";

    @NotNull
    public static final String ARG_IS_SHIFT_IN = "ARG_IS_SHIFT_IN";

    @NotNull
    public static final String ARG_IS_SHIFT_OUT = "ARG_IS_SHIFT_OUT";

    @NotNull
    public static final String ARG_PACKAGE_NAME = "ARG_PACKAGE_NAME";

    @NotNull
    public static final String ARG_REDIRECT_TO = "ARG_REDIRECT_TO";

    @NotNull
    public static final String ARG_SERVICE_CONTACT = "ARG_SERVICE_CONTACT";

    @NotNull
    public static final String ARG_SHIFT_IN_ORDER_ID = "ARG_SHIFT_IN_ORDER_ID";
    public static final long COUNT_DOWN_MILLISECONDS = 60000;

    @NotNull
    public static final String PHONE_REGEXP = "^1[0-9]{10}$";
    public static final long SECOND_TIME = 1000;
    public static final long SHOW_KEYBOARD_TIME = 200;

    @NotNull
    private static final String r = "Wallet-BindPhoneNumberFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNavigationController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ViewHolder mViewHolder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private CountDownTimer mCountDownTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper mLoadingDialogHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isShiftIn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isShiftOut;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String busCardId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String busCardName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private String orderId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private String busCardImageUrl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String xiaoMiBusCardName;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private String packageName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private String appName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    private String redirectTo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private String serviceContact;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\"\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/wallet/ui/fragment/BindPhoneNumberFragment$ViewHolder;", "", "Landroid/widget/EditText;", "a", "Landroid/widget/EditText;", "getInputPhoneNumber", "()Landroid/widget/EditText;", "inputPhoneNumber", "b", "getInputImageCaptcha", "inputImageCaptcha", "c", "getInputSmsCaptcha", "inputSmsCaptcha", "Lcom/huami/widget/captcha/CaptchaView;", GoogleApiAvailabilityLight.a, "Lcom/huami/widget/captcha/CaptchaView;", "getImageCaptcha", "()Lcom/huami/widget/captcha/CaptchaView;", "imageCaptcha", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getGetSmsCaptchaButton", "()Landroid/widget/TextView;", "getSmsCaptchaButton", "f", "getTips", "tips", "Landroid/view/View;", "g", "Landroid/view/View;", "getNextButton", "()Landroid/view/View;", "nextButton", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final EditText inputPhoneNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final EditText inputImageCaptcha;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final EditText inputSmsCaptcha;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final CaptchaView imageCaptcha;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final TextView getSmsCaptchaButton;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final TextView tips;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final View nextButton;

        public ViewHolder(@NotNull View view) {
            this.inputPhoneNumber = (EditText) view.findViewById(R.id.input_phone_number);
            this.inputImageCaptcha = (EditText) view.findViewById(R.id.input_image_captcha);
            this.inputSmsCaptcha = (EditText) view.findViewById(R.id.input_sms_captcha);
            this.imageCaptcha = (CaptchaView) view.findViewById(R.id.image_captcha);
            this.getSmsCaptchaButton = (TextView) view.findViewById(R.id.get_sms_captcha_button);
            this.tips = (TextView) view.findViewById(R.id.tips);
            this.nextButton = view.findViewById(R.id.next_button);
        }

        @NotNull
        public final TextView getGetSmsCaptchaButton() {
            return this.getSmsCaptchaButton;
        }

        @NotNull
        public final CaptchaView getImageCaptcha() {
            return this.imageCaptcha;
        }

        @NotNull
        public final EditText getInputImageCaptcha() {
            return this.inputImageCaptcha;
        }

        @NotNull
        public final EditText getInputPhoneNumber() {
            return this.inputPhoneNumber;
        }

        @NotNull
        public final EditText getInputSmsCaptcha() {
            return this.inputSmsCaptcha;
        }

        @NotNull
        public final View getNextButton() {
            return this.nextButton;
        }

        @NotNull
        public final TextView getTips() {
            return this.tips;
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

    /* JADX WARN: Multi-variable type inference failed */
    public BindPhoneNumberFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigationController>() { // from class: com.huami.wallet.ui.fragment.BindPhoneNumberFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigationController invoke() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.wallet.ui.fragment.BindPhoneNumberFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<BindPhoneNumberViewModel>() { // from class: com.huami.wallet.ui.fragment.BindPhoneNumberFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.wallet.ui.viewmodel.BindPhoneNumberViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BindPhoneNumberViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(BindPhoneNumberViewModel.class), function0, objArr3);
            }
        });
        this.busCardId = "";
        this.busCardName = "";
        this.orderId = "";
        this.busCardImageUrl = "";
        this.xiaoMiBusCardName = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(BindPhoneNumberFragment bindPhoneNumberFragment, View view) {
        if (bindPhoneNumberFragment.n() && bindPhoneNumberFragment.m()) {
            view.setEnabled(false);
            bindPhoneNumberFragment.q().sendSmsCaptcha(bindPhoneNumberFragment.mViewHolder.getInputPhoneNumber().getText().toString());
        }
    }

    private final void B() {
        if (getArguments() == null) {
            return;
        }
        Bundle bundleRequireArguments = requireArguments();
        setBusCardId(bundleRequireArguments.getString("ARG_BUS_CARD_ID"));
        setOrderId(bundleRequireArguments.getString("ARG_SHIFT_IN_ORDER_ID"));
        setBusCardName(bundleRequireArguments.getString("ARG_BUS_CARD_NAME"));
        setBusCardImageUrl(bundleRequireArguments.getString("ARG_BUS_CARD_IMAGE_URL"));
        setShiftIn(bundleRequireArguments.getBoolean("ARG_IS_SHIFT_IN", false));
        setShiftOut(bundleRequireArguments.getBoolean("ARG_IS_SHIFT_OUT", false));
        setXiaoMiBusCardName(bundleRequireArguments.getString("ARG_BUS_XIAOMI_CARD_NAME"));
        this.packageName = bundleRequireArguments.getString("ARG_PACKAGE_NAME");
        this.appName = bundleRequireArguments.getString("ARG_APP_NAME");
        this.redirectTo = bundleRequireArguments.getString("ARG_REDIRECT_TO");
        this.serviceContact = bundleRequireArguments.getString("ARG_SERVICE_CONTACT");
        q().setBusCardSimpleInfo(this.busCardId, this.busCardName, this.busCardImageUrl);
    }

    private final void C() {
        if (getContext() == null) {
            return;
        }
        EditText inputPhoneNumber = this.mViewHolder.getInputPhoneNumber();
        inputPhoneNumber.setFocusable(true);
        inputPhoneNumber.setFocusableInTouchMode(true);
        inputPhoneNumber.requestFocus();
        Object systemService = requireContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(inputPhoneNumber, 0);
    }

    private final void D(final long remainingTime) {
        this.mViewHolder.getGetSmsCaptchaButton().setEnabled(false);
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.mCountDownTimer = new CountDownTimer(remainingTime) { // from class: com.huami.wallet.ui.fragment.BindPhoneNumberFragment$startCountDown$1
            public final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(remainingTime, 1000L);
                this.b = remainingTime;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.a.mViewHolder.getGetSmsCaptchaButton().setText(R.string.wl_get_captcha);
                this.a.mViewHolder.getGetSmsCaptchaButton().setEnabled(true);
                TextViewCompat.setTextAppearance(this.a.mViewHolder.getGetSmsCaptchaButton(), R.style.TextAppearance_MiFit_Caption_Blue);
                this.a.mViewHolder.getGetSmsCaptchaButton().setBackgroundResource(R.drawable.wl_hollow_round_rect_blue);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                this.a.mViewHolder.getGetSmsCaptchaButton().setText(this.a.getString(R.string.wl_format_send_after_x_seconds, Long.valueOf(millisUntilFinished / 1000)));
                TextViewCompat.setTextAppearance(this.a.mViewHolder.getGetSmsCaptchaButton(), R.style.TextAppearance_MiFit_Caption_Inverse);
                this.a.mViewHolder.getGetSmsCaptchaButton().setBackgroundResource(R.drawable.wl_hollow_round_rect_gray);
            }
        }.start();
    }

    private final void E(Resource<BindPhoneNumberViewModel.CardAndPhone> r2) {
        int i = WhenMappings.$EnumSwitchMapping$0[r2.status.ordinal()];
        if (i == 1) {
            LoadingDialogHelper loadingDialogHelper = this.mLoadingDialogHelper;
            if (loadingDialogHelper == null) {
                return;
            }
            loadingDialogHelper.showLoading();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.mViewHolder.getNextButton().setEnabled(true);
            if (!TextUtils.equals(r2.code, ErrorCode.SMS_CODE_NOT_MATCHED)) {
                LoadingDialogHelper loadingDialogHelper2 = this.mLoadingDialogHelper;
                if (loadingDialogHelper2 == null) {
                    return;
                }
                loadingDialogHelper2.showOrError(r2);
                return;
            }
            LoadingDialogHelper loadingDialogHelper3 = this.mLoadingDialogHelper;
            if (loadingDialogHelper3 != null) {
                loadingDialogHelper3.hideLoading();
            }
            this.mViewHolder.getTips().setVisibility(0);
            this.mViewHolder.getTips().setText(R.string.wl_wrong_sms_captcha);
            return;
        }
        LoadingDialogHelper loadingDialogHelper4 = this.mLoadingDialogHelper;
        if (loadingDialogHelper4 != null) {
            loadingDialogHelper4.hideLoading();
        }
        this.mViewHolder.getNextButton().setEnabled(true);
        this.mViewHolder.getTips().setVisibility(8);
        if (r2.data == null) {
            HMLog.w(r, "验证短信验证码成功后的数据丢失，无法做下一步跳转", new Object[0]);
            return;
        }
        if (this.isShiftIn) {
            p().navigateToShift(getContext(), this.busCardId, this.busCardName, this.xiaoMiBusCardName, true, this.orderId, this.busCardImageUrl, Boolean.FALSE, "", this.packageName, this.appName, this.redirectTo, this.serviceContact);
            p().finishCurrentPage(getActivity());
            return;
        }
        if (this.isShiftOut) {
            p().navigateToShiftOutTips(getActivity(), this.busCardId, null, this.busCardImageUrl, this.busCardName, this.xiaoMiBusCardName, "");
            p().finishCurrentPage(getActivity());
            return;
        }
        NavigationController navigationControllerP = p();
        FragmentActivity activity = getActivity();
        String str = this.busCardId;
        String str2 = this.busCardName;
        String str3 = this.busCardImageUrl;
        BindPhoneNumberViewModel.CardAndPhone cardAndPhone = r2.data;
        navigationControllerP.navigateToOpenBusCard(activity, str, str2, str3, cardAndPhone == null ? null : cardAndPhone.boundPhone, this.xiaoMiBusCardName);
        p().finishCurrentPage(getActivity());
    }

    private final void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        q().lastSendSmsCodeTimeLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: nx
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BindPhoneNumberFragment.r(this.a, (Long) obj);
            }
        });
        q().sendSmsCaptchaResultLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("发送短信验证码"));
        q().sendSmsCaptchaResultLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: lx
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BindPhoneNumberFragment.s(this.a, (Resource) obj);
            }
        });
        q().verifySmsCaptchaResultLiveData.observe(getViewLifecycleOwner(), new BenchmarkResourceObserver("验证短信验证码"));
        q().verifySmsCaptchaResultLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: mx
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BindPhoneNumberFragment.t(this.a, (Resource) obj);
            }
        });
    }

    private final void initViews() {
        this.mLoadingDialogHelper = LoadingDialogHelper.newInstance(getActivity());
        this.mViewHolder.getTips().setCompoundDrawablesRelativeWithIntrinsicBounds(TintUtils.tintDrawable(getContext(), R.drawable.wl_ic_tips, R.color.p4), (Drawable) null, (Drawable) null, (Drawable) null);
        this.mViewHolder.getInputPhoneNumber().postDelayed(new Runnable() { // from class: ox
            @Override // java.lang.Runnable
            public final void run() {
                BindPhoneNumberFragment.v(this.a);
            }
        }, 200L);
        this.mViewHolder.getInputPhoneNumber().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kx
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                BindPhoneNumberFragment.w(this.a, view, z);
            }
        });
        this.mViewHolder.getInputImageCaptcha().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jx
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                BindPhoneNumberFragment.x(this.a, view, z);
            }
        });
        this.mViewHolder.getInputSmsCaptcha().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ix
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                BindPhoneNumberFragment.y(this.a, view, z);
            }
        });
        this.mViewHolder.getImageCaptcha().setOnClickListener(new View.OnClickListener() { // from class: gx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPhoneNumberFragment.z(this.a, view);
            }
        });
        this.mViewHolder.getGetSmsCaptchaButton().setOnClickListener(new View.OnClickListener() { // from class: hx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPhoneNumberFragment.A(this.a, view);
            }
        });
        this.mViewHolder.getNextButton().setOnClickListener(new View.OnClickListener() { // from class: fx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindPhoneNumberFragment.u(this.a, view);
            }
        });
    }

    private final boolean m() {
        boolean zVerify = this.mViewHolder.getImageCaptcha().verify(this.mViewHolder.getInputImageCaptcha().getText().toString());
        if (zVerify) {
            this.mViewHolder.getTips().setVisibility(8);
        } else {
            this.mViewHolder.getTips().setVisibility(0);
            this.mViewHolder.getTips().setText(R.string.wl_wrong_captcha);
        }
        return zVerify;
    }

    private final boolean n() {
        boolean zMatches = new Regex(PHONE_REGEXP).matches(this.mViewHolder.getInputPhoneNumber().getText().toString());
        if (zMatches) {
            this.mViewHolder.getTips().setVisibility(8);
        } else {
            this.mViewHolder.getTips().setVisibility(0);
            this.mViewHolder.getTips().setText(R.string.wl_wrong_phone_number);
        }
        return zMatches;
    }

    private final boolean o() {
        boolean z = !TextUtils.isEmpty(this.mViewHolder.getInputSmsCaptcha().getText().toString());
        if (z) {
            this.mViewHolder.getTips().setVisibility(8);
        } else {
            this.mViewHolder.getTips().setVisibility(0);
            this.mViewHolder.getTips().setText(R.string.wl_wrong_sms_captcha);
        }
        return z;
    }

    private final NavigationController p() {
        return (NavigationController) this.mNavigationController.getValue();
    }

    private final BindPhoneNumberViewModel q() {
        return (BindPhoneNumberViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BindPhoneNumberFragment bindPhoneNumberFragment, Long l) {
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            long j = 60000 - jCurrentTimeMillis;
            if (jCurrentTimeMillis < 60000) {
                bindPhoneNumberFragment.D(j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BindPhoneNumberFragment bindPhoneNumberFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        LoadingDialogHelper loadingDialogHelper = bindPhoneNumberFragment.mLoadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showOrError(resource);
        }
        if (resource.isCompleted()) {
            bindPhoneNumberFragment.mViewHolder.getGetSmsCaptchaButton().setEnabled(true);
        }
        if (resource.status == Status.SUCCESS) {
            bindPhoneNumberFragment.D(60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BindPhoneNumberFragment bindPhoneNumberFragment, Resource resource) {
        if (resource == null) {
            return;
        }
        bindPhoneNumberFragment.E(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BindPhoneNumberFragment bindPhoneNumberFragment, View view) {
        if (bindPhoneNumberFragment.n() && bindPhoneNumberFragment.m() && bindPhoneNumberFragment.o()) {
            view.setEnabled(false);
            bindPhoneNumberFragment.q().verifySmsCaptcha(bindPhoneNumberFragment.mViewHolder.getInputPhoneNumber().getText().toString(), bindPhoneNumberFragment.mViewHolder.getInputSmsCaptcha().getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BindPhoneNumberFragment bindPhoneNumberFragment) {
        bindPhoneNumberFragment.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(BindPhoneNumberFragment bindPhoneNumberFragment, View view, boolean z) {
        if (z) {
            return;
        }
        bindPhoneNumberFragment.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BindPhoneNumberFragment bindPhoneNumberFragment, View view, boolean z) {
        if (z || !bindPhoneNumberFragment.n()) {
            return;
        }
        bindPhoneNumberFragment.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BindPhoneNumberFragment bindPhoneNumberFragment, View view, boolean z) {
        if (!z && bindPhoneNumberFragment.n() && bindPhoneNumberFragment.m()) {
            bindPhoneNumberFragment.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BindPhoneNumberFragment bindPhoneNumberFragment, View view) {
        bindPhoneNumberFragment.mViewHolder.getImageCaptcha().create();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final String getBusCardId() {
        return this.busCardId;
    }

    @Nullable
    public final String getBusCardImageUrl() {
        return this.busCardImageUrl;
    }

    @Nullable
    public final String getBusCardName() {
        return this.busCardName;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getXiaoMiBusCardName() {
        return this.xiaoMiBusCardName;
    }

    /* JADX INFO: renamed from: isShiftIn, reason: from getter */
    public final boolean getIsShiftIn() {
        return this.isShiftIn;
    }

    /* JADX INFO: renamed from: isShiftOut, reason: from getter */
    public final boolean getIsShiftOut() {
        return this.isShiftOut;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wl_fragment_bind_phone_number, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.mViewHolder = new ViewHolder(view);
        initViews();
        initViewModel();
        B();
    }

    public final void setBusCardId(@Nullable String str) {
        this.busCardId = str;
    }

    public final void setBusCardImageUrl(@Nullable String str) {
        this.busCardImageUrl = str;
    }

    public final void setBusCardName(@Nullable String str) {
        this.busCardName = str;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setShiftIn(boolean z) {
        this.isShiftIn = z;
    }

    public final void setShiftOut(boolean z) {
        this.isShiftOut = z;
    }

    public final void setXiaoMiBusCardName(@Nullable String str) {
        this.xiaoMiBusCardName = str;
    }
}

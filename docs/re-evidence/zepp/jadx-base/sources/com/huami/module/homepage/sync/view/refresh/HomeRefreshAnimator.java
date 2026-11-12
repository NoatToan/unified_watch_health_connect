package com.huami.module.homepage.sync.view.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicestylepower.DeviceImageView;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.module.homepage.R;
import com.huami.module.homepage.analytics.HomeAnalytics;
import com.huami.module.homepage.analytics.StatusAnalyticsKt;
import com.huami.module.homepage.databinding.HomepageFragmentHomeRefreshBinding;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ViewExtKt;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 >2\u00020\u0001:\u0002!>B\u0011\b\u0016\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108B\u001b\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b7\u0010;B#\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\u0006\u0010<\u001a\u00020\u000b¢\u0006\u0004\b7\u0010=J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\u00020\u00062 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nJ\u0016\u0010\u000f\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001b\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R0\u00102\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006?"}, d2 = {"Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshAnimator;", "Landroid/widget/FrameLayout;", "Lcom/airbnb/lottie/LottieAnimationView;", ViewHierarchyConstants.VIEW_KEY, "", "status", "", "h", "show", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Function3;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animatorEndListener", "Lkotlin/Function0;", "animatorTimeoutListener", "checkIsAnimating", "updateRefreshTime", "showBindDeviceIcon", "setIconClickListener", "startRefresh", "errorCode", "showPowerAndStyle", "refreshFailure", "Lcom/huami/devicestylepower/DeviceStyle;", "deviceType", "refreshSuccess", "updatePower", "Lcom/huami/module/homepage/databinding/HomepageFragmentHomeRefreshBinding;", "a", "Lcom/huami/module/homepage/databinding/HomepageFragmentHomeRefreshBinding;", "binding", "Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshAnimator$b;", "b", "Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshAnimator$b;", "currentStatus", "c", LogUtil.I, "errorStatus", GoogleApiAvailabilityLight.a, "Z", "e", "loadStateColor", "", "f", "J", "connectingTime", "g", "Lcom/huami/devicestylepower/DeviceStyle;", "Lkotlin/jvm/functions/Function3;", "animatorListener", "i", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "homePage_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"RestrictedApi"})
public final class HomeRefreshAnimator extends FrameLayout {

    @NotNull
    private static final String j = "homepage_connecting.json";

    @NotNull
    private static final String k = "homepage_connect_success.json";

    @NotNull
    private static final String l = "homepage_connect_fail.json";
    private static final double m = 150000.0d;
    private static final int n = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HomepageFragmentHomeRefreshBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private b currentStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int errorStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean showPowerAndStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int loadStateColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long connectingTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private DeviceStyle deviceType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function3<? super Boolean, ? super Integer, ? super Boolean, Unit> animatorListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> animatorTimeoutListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StatusAnalyticsKt.recordEvent(HomeAnalytics.INDEX_ADD_DEVICE_C, new Pair[0]);
            HomeUtils.executorDeviceJump(HomeRefreshAnimator.this.getContext(), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/huami/module/homepage/sync/view/refresh/HomeRefreshAnimator$b", "", "Lcom/huami/module/homepage/sync/view/refresh/HomeRefreshAnimator$b;", "<init>", "(Ljava/lang/String;I)V", NoticesEntity.LOOP_TYPE_NONE, "CONNECTING", "CONNECT_SUCCESS", "CONNECT_FAIL", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public enum b {
        NONE,
        CONNECTING,
        CONNECT_SUCCESS,
        CONNECT_FAIL
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.a;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.a;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.a;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Function0<Unit> function0 = this.a;
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public HomeRefreshAnimator(@NotNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(LottieAnimationView view, boolean status) {
        if (status) {
            view.setVisibility(0);
            view.playAnimation();
        } else {
            view.setVisibility(8);
            if (view.isAnimating()) {
                view.cancelAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LottieAnimationView lottieAnimationView, final HomeRefreshAnimator homeRefreshAnimator, LottieComposition lottieComposition) {
        for (KeyPath keyPath : lottieAnimationView.resolveKeyPath(new KeyPath("**"))) {
            if (keyPath.matches("描边 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: b94
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return HomeRefreshAnimator.j(this.a, lottieFrameInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer j(HomeRefreshAnimator homeRefreshAnimator, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(homeRefreshAnimator.loadStateColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(LottieAnimationView lottieAnimationView, final HomeRefreshAnimator homeRefreshAnimator, LottieComposition lottieComposition) {
        for (KeyPath keyPath : lottieAnimationView.resolveKeyPath(new KeyPath("**"))) {
            if (keyPath.matches("描边 1", 1) || keyPath.matches("描边 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: c94
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return HomeRefreshAnimator.l(this.a, lottieFrameInfo);
                    }
                });
            } else if (keyPath.matches("填充 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: a94
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return HomeRefreshAnimator.m(this.a, lottieFrameInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer l(HomeRefreshAnimator homeRefreshAnimator, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(homeRefreshAnimator.loadStateColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer m(HomeRefreshAnimator homeRefreshAnimator, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(homeRefreshAnimator.loadStateColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LottieAnimationView lottieAnimationView, final HomeRefreshAnimator homeRefreshAnimator, LottieComposition lottieComposition) {
        for (KeyPath keyPath : lottieAnimationView.resolveKeyPath(new KeyPath("**"))) {
            if (keyPath.matches("描边 1", 2)) {
                lottieAnimationView.addValueCallback(keyPath, LottieProperty.STROKE_COLOR, (SimpleLottieValueCallback<Integer>) new SimpleLottieValueCallback() { // from class: z84
                    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                    public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                        return HomeRefreshAnimator.o(this.a, lottieFrameInfo);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer o(HomeRefreshAnimator homeRefreshAnimator, LottieFrameInfo lottieFrameInfo) {
        return Integer.valueOf(homeRefreshAnimator.loadStateColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean show) {
        this.binding.homepageDeviceIcon.setVisibility(show ? 0 : 8);
    }

    public static /* synthetic */ void refreshFailure$default(HomeRefreshAnimator homeRefreshAnimator, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        homeRefreshAnimator.refreshFailure(i, z);
    }

    public final void animatorEndListener(@Nullable Function3<? super Boolean, ? super Integer, ? super Boolean, Unit> listener) {
        this.animatorListener = listener;
    }

    public final void animatorTimeoutListener(@Nullable Function0<Unit> listener) {
        this.animatorTimeoutListener = listener;
    }

    public final boolean checkIsAnimating() {
        return this.binding.homepageConnectingIcon.isAnimating();
    }

    public final void refreshFailure(int errorCode, boolean showPowerAndStyle) {
        this.errorStatus = errorCode;
        this.showPowerAndStyle = showPowerAndStyle;
        this.currentStatus = b.CONNECT_FAIL;
    }

    public final void refreshSuccess(@Nullable DeviceStyle deviceType) {
        this.deviceType = deviceType;
        this.currentStatus = b.CONNECT_SUCCESS;
    }

    public final void setIconClickListener(@Nullable Function0<Unit> listener) {
        HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBinding = this.binding;
        ExteranelKt.fastClickListener(homepageFragmentHomeRefreshBinding.homepageConnectFailIcon, new c(listener));
        ExteranelKt.fastClickListener(homepageFragmentHomeRefreshBinding.homepageConnectSuccessIcon, new d(listener));
        ExteranelKt.fastClickListener(homepageFragmentHomeRefreshBinding.homepageConnectingIcon, new e(listener));
        ExteranelKt.fastClickListener(homepageFragmentHomeRefreshBinding.homepageDeviceIcon, new f(listener));
    }

    public final void showBindDeviceIcon(boolean show) {
        ViewExtKt.setVisible(this.binding.homepageDeviceBind, show);
    }

    public final void startRefresh() {
        this.currentStatus = b.CONNECTING;
        this.connectingTime = System.currentTimeMillis();
        this.showPowerAndStyle = false;
        HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBinding = this.binding;
        p(false);
        showBindDeviceIcon(false);
        h(homepageFragmentHomeRefreshBinding.homepageConnectingIcon, true);
        h(homepageFragmentHomeRefreshBinding.homepageConnectFailIcon, false);
        h(homepageFragmentHomeRefreshBinding.homepageConnectSuccessIcon, false);
    }

    public final void updatePower(@Nullable DeviceStyle deviceType) {
        HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBinding = this.binding;
        h(homepageFragmentHomeRefreshBinding.homepageConnectingIcon, false);
        h(homepageFragmentHomeRefreshBinding.homepageConnectFailIcon, false);
        h(homepageFragmentHomeRefreshBinding.homepageConnectSuccessIcon, false);
        DeviceImageView deviceImageView = this.binding.homepageDeviceIcon;
        if (deviceType == null) {
            if (!HomeUtils.isMifitApp()) {
                showBindDeviceIcon(true);
            }
            deviceImageView.setVisibility(8);
        } else {
            deviceImageView.setVisibility(0);
            this.showPowerAndStyle = true;
            deviceImageView.setDeviceType(deviceType);
        }
    }

    public final void updateRefreshTime() {
        this.connectingTime = System.currentTimeMillis();
    }

    public HomeRefreshAnimator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeRefreshAnimator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBindingInflate = HomepageFragmentHomeRefreshBinding.inflate(LayoutInflater.from(getContext()), this, true);
        this.binding = homepageFragmentHomeRefreshBindingInflate;
        this.currentStatus = b.NONE;
        this.errorStatus = -1;
        this.loadStateColor = ViewExtKt.loadColor(this, HomeUtils.isMifitApp() ? R.color.s38 : R.color.s1);
        this.deviceType = new DeviceStyle.Square(100);
        homepageFragmentHomeRefreshBindingInflate.homepageDeviceIcon.setDeviceColor(ViewExtKt.loadColor(this, HomeUtils.isMifitApp() ? R.color.s38 : R.color.s1), ViewExtKt.loadColor(this, HomeUtils.isMifitApp() ? R.color.s38 : R.color.s20), ViewExtKt.loadColor(this, HomeUtils.isMifitApp() ? R.color.s50 : R.color.s51)).setEarphoneColor(ViewExtKt.loadColor(this, R.color.s1), ViewExtKt.loadColor(this, R.color.s51), ViewExtKt.loadColor(this, R.color.s3));
        final LottieAnimationView lottieAnimationView = homepageFragmentHomeRefreshBindingInflate.homepageConnectFailIcon;
        lottieAnimationView.setAnimation(l);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator$1$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                this.a.currentStatus = HomeRefreshAnimator.b.NONE;
                if (this.a.showPowerAndStyle) {
                    homepageFragmentHomeRefreshBindingInflate.homepageConnectFailIcon.setVisibility(8);
                }
            }
        });
        lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: y84
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                HomeRefreshAnimator.k(lottieAnimationView, this, lottieComposition);
            }
        });
        final LottieAnimationView lottieAnimationView2 = homepageFragmentHomeRefreshBindingInflate.homepageConnectSuccessIcon;
        lottieAnimationView2.setAnimation(k);
        lottieAnimationView2.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator$1$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                this.a.currentStatus = HomeRefreshAnimator.b.NONE;
                homepageFragmentHomeRefreshBindingInflate.homepageConnectSuccessIcon.setVisibility(8);
                HomeRefreshAnimator homeRefreshAnimator = this.a;
                homeRefreshAnimator.p(homeRefreshAnimator.deviceType != null);
                DeviceStyle deviceStyle = this.a.deviceType;
                if (deviceStyle != null) {
                    homepageFragmentHomeRefreshBindingInflate.homepageDeviceIcon.setDeviceType(deviceStyle);
                }
                Function3 function3 = this.a.animatorListener;
                if (function3 == null) {
                    return;
                }
                function3.invoke(Boolean.TRUE, Integer.valueOf(this.a.errorStatus), Boolean.valueOf(this.a.showPowerAndStyle));
            }
        });
        lottieAnimationView2.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: w84
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                HomeRefreshAnimator.n(lottieAnimationView2, this, lottieComposition);
            }
        });
        final LottieAnimationView lottieAnimationView3 = homepageFragmentHomeRefreshBindingInflate.homepageConnectingIcon;
        lottieAnimationView3.setAnimation(j);
        lottieAnimationView3.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator$1$3$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
                if (this.a.currentStatus == HomeRefreshAnimator.b.CONNECT_FAIL) {
                    Function3 function3 = this.a.animatorListener;
                    if (function3 != null) {
                        function3.invoke(Boolean.FALSE, Integer.valueOf(this.a.errorStatus), Boolean.valueOf(this.a.showPowerAndStyle));
                    }
                    HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBinding = this.a.binding;
                    HomeRefreshAnimator homeRefreshAnimator = this.a;
                    homeRefreshAnimator.h(homepageFragmentHomeRefreshBinding.homepageConnectingIcon, false);
                    homeRefreshAnimator.h(homepageFragmentHomeRefreshBinding.homepageConnectFailIcon, true);
                    homeRefreshAnimator.h(homepageFragmentHomeRefreshBinding.homepageConnectSuccessIcon, false);
                    return;
                }
                if (this.a.currentStatus == HomeRefreshAnimator.b.CONNECT_SUCCESS) {
                    HomepageFragmentHomeRefreshBinding homepageFragmentHomeRefreshBinding2 = this.a.binding;
                    HomeRefreshAnimator homeRefreshAnimator2 = this.a;
                    homeRefreshAnimator2.h(homepageFragmentHomeRefreshBinding2.homepageConnectingIcon, false);
                    homeRefreshAnimator2.h(homepageFragmentHomeRefreshBinding2.homepageConnectFailIcon, false);
                    homeRefreshAnimator2.h(homepageFragmentHomeRefreshBinding2.homepageConnectSuccessIcon, true);
                    return;
                }
                if (System.currentTimeMillis() - this.a.connectingTime > 150000.0d) {
                    this.a.connectingTime = Long.MAX_VALUE;
                    Function0 function0 = this.a.animatorTimeoutListener;
                    if (function0 == null) {
                        return;
                    }
                    function0.invoke();
                }
            }
        });
        lottieAnimationView3.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: x84
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                HomeRefreshAnimator.i(lottieAnimationView3, this, lottieComposition);
            }
        });
        ExteranelKt.fastClickListener(homepageFragmentHomeRefreshBindingInflate.homepageDeviceBind, new a());
    }
}

package com.xiaomi.hm.health.device.headset.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.headset.bean.HearingReportBean;
import com.xiaomi.hm.health.device.headset.ui.HeadsetHearingHealthActivity;
import com.xiaomi.hm.health.device.headset.ui.fragment.CaveatBottomSheetDialogFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002T(B\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0003J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0003J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0002J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001aH\u0014J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"J\b\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u0003H\u0014R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010K\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010LR\u001d\u0010Q\u001a\u00020N8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bO\u0010P¨\u0006V²\u0006\u000e\u0010U\u001a\u00020\n8\n@\nX\u008b\u008e\u0002"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", DTransferConstants.SEARCH_KEY, "r", GoogleApiAvailabilityLight.b, "", "status", "y", "", "innerEarVolume", LogUtil.D, "isReachedUpperLimit", "C", "", "userTime", "isRight", "score", "B", "x", "v", "enable", hl.k, z.j, "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "onEventMainThread", "onBackPressed", "onDestroy", "Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadsetHearingHealthViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/viewmodel/HeadsetHearingHealthViewModel;", "viewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CaveatBottomSheetDialogFragment;", "e", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CaveatBottomSheetDialogFragment;", "caveatDialog", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "setLoadingDlg", "Landroid/animation/ObjectAnimator;", "g", "Landroid/animation/ObjectAnimator;", "rotationAnimator", "h", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "lastHeadsetState", "Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity$a;", "i", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity$a;", "headsetHandler", "Z", "hearingHealthStatus", "Lcom/huami/devicex/manager/DeviceManagerApi;", "l", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "colorRes", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetHearingHealthActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String EXTRA_HEARING_SWITCH_STATUS = "HEARING_SWITCH_STATUS";
    public static final int REQUEST_CODE_HEARING = 15;
    public static final /* synthetic */ KProperty<Object>[] l;

    @NotNull
    private static final String m = "HeadsetHearingHealthActivity";

    @NotNull
    private static final String n = "device_address";
    private static final long o = 30000;
    private static final byte[] p;
    private static final int q = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HeadsetHearingHealthViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private CaveatBottomSheetDialogFragment caveatDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog setLoadingDlg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ObjectAnimator rotationAnimator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private HeadsetDevice.HeadsetDeviceState lastHeadsetState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean hearingHealthStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy headsetHandler = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u001e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity$Companion;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "requestCode", "", "enable", "", "startActivityForResult", "", "kotlin.jvm.PlatformType", "DISCONNECT_BYTE_ARRAY", "[B", "", "DISMISS_DIALOG_TIMEOUT", "J", "ENSURE_OPEN_REPORT_SWITCH", LogUtil.I, "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "EXTRA_HEARING_SWITCH_STATUS", "REQUEST_CODE_HEARING", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActivityForResult(@NotNull AppCompatActivity activity, @NotNull String address, int requestCode, boolean enable) {
            Intent intent = new Intent(activity, (Class<?>) HeadsetHearingHealthActivity.class);
            intent.putExtra(HeadsetHearingHealthActivity.n, address);
            intent.putExtra(HeadsetHearingHealthActivity.EXTRA_HEARING_SWITCH_STATUS, enable);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity$a", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity;", "a", "Ljava/lang/ref/WeakReference;", "mActivity", "<init>", "(Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    @SuppressLint({"HandlerLeak"})
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private WeakReference<HeadsetHearingHealthActivity> mActivity;

        public a(@Nullable HeadsetHearingHealthActivity headsetHearingHealthActivity) {
            this.mActivity = new WeakReference<>(headsetHearingHealthActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            HeadsetHearingHealthActivity headsetHearingHealthActivity;
            super.handleMessage(msg);
            if (msg.what != 1 || (headsetHearingHealthActivity = this.mActivity.get()) == null) {
                return;
            }
            headsetHearingHealthActivity.j(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "device enable invoke report headset info switch result:" + this.a;
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HMLog.info(HeadsetHearingHealthActivity.m, new a(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetHearingHealthActivity$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a getA() {
            return new a(HeadsetHearingHealthActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HeadsetHearingHealthViewModel headsetHearingHealthViewModel = HeadsetHearingHealthActivity.this.viewModel;
            Objects.requireNonNull(headsetHearingHealthViewModel);
            headsetHearingHealthViewModel.refreshEarUserTime(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Integer, Unit> {
        public e() {
            super(1);
        }

        public final void a(int i) {
            HeadsetHearingHealthActivity.this.D(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMLFEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMLFEvent hMLFEvent) {
            super(0);
            this.a = hMLFEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onEvent:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<Integer, Unit> {
        public g() {
            super(1);
        }

        public final void a(int i) {
            HeadsetHearingHealthActivity.this.D(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[2] = Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(HeadsetHearingHealthActivity.class), "colorRes", "<v#0>"));
        l = kPropertyArr;
        INSTANCE = new Companion(null);
        p = GattUtils.numberToBytes(-1L, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetHearingHealthActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetHearingHealthActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(final HeadsetHearingHealthActivity headsetHearingHealthActivity, View view) {
        ObjectAnimator objectAnimator;
        if (headsetHearingHealthActivity.rotationAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, Key.ROTATION, 0.0f, 360.0f);
            objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetHearingHealthActivity$updateHearingHealthStatusUI$3$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(@Nullable Animator animation) {
                    HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.a.viewModel;
                    Objects.requireNonNull(headsetHearingHealthViewModel);
                    headsetHearingHealthViewModel.refreshEarUserTime(true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(@Nullable Animator animation) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(@Nullable Animator animation) {
                }
            });
            objectAnimatorOfFloat.setDuration(500L);
            Unit unit = Unit.INSTANCE;
            headsetHearingHealthActivity.rotationAnimator = objectAnimatorOfFloat;
        }
        ObjectAnimator objectAnimator2 = headsetHearingHealthActivity.rotationAnimator;
        boolean z = false;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z = true;
        }
        if (z || (objectAnimator = headsetHearingHealthActivity.rotationAnimator) == null) {
            return;
        }
        objectAnimator.start();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x015f  */
    private final void B(long userTime, boolean isRight, int score) {
        String string;
        int color;
        Drawable drawable;
        if (userTime == 4294967295L) {
            ImageView imageView = (ImageView) findViewById(isRight ? R.id.icon_right_ear : R.id.icon_left_ear);
            if (imageView != null) {
                imageView.setSelected(false);
            }
            TextView textView = (TextView) findViewById(isRight ? R.id.right_ear_user_time : R.id.left_ear_user_time);
            if (textView != null) {
                textView.setText(getString(R.string.settings_headset_unconnect));
            }
            TextView textView2 = (TextView) findViewById(isRight ? R.id.right_ear_user_time : R.id.left_ear_user_time);
            if (textView2 != null) {
                textView2.setAlpha(0.2f);
            }
            ProgressBar progressBar = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
            if (progressBar != null) {
                progressBar.setProgressDrawable(ContextCompat.getDrawable(this, R.drawable.progress_horizontal_black));
            }
            if (Build.VERSION.SDK_INT >= 24) {
                ProgressBar progressBar2 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
                if (progressBar2 != null) {
                    progressBar2.setProgress(100, true);
                }
            } else {
                ProgressBar progressBar3 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
                if (progressBar3 != null) {
                    progressBar3.setProgress(100);
                }
            }
            ProgressBar progressBar4 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
            if (progressBar4 != null) {
                progressBar4.setAlpha(0.2f);
            }
            TextView textView3 = (TextView) findViewById(isRight ? R.id.title_right_ear : R.id.title_left_ear);
            if (textView3 == null) {
                return;
            }
            textView3.setAlpha(0.2f);
            return;
        }
        long j = 3600;
        long j2 = userTime / j;
        long j3 = userTime % j;
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        if (j2 != 0 && j5 != 0) {
            string = getString(R.string.settings_headset_hour_minute, new Object[]{String.valueOf(j2), String.valueOf(j5)});
        } else if (j2 != 0 && j5 == 0) {
            string = getString(R.string.settings_headset_hour, new Object[]{String.valueOf(j2)});
        } else if (j2 != 0 || j5 == 0) {
            string = (j2 == 0 && j5 == 0 && j6 != 0) ? getString(R.string.settings_headset_minute, new Object[]{"1"}) : getString(R.string.settings_headset_minute, new Object[]{"0"});
        } else {
            string = getString(R.string.settings_headset_minute, new Object[]{String.valueOf(j5)});
        }
        String string2 = getString(R.string.settings_headset_rest_of_the_week, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2);
        if (j2 != 0) {
            color = ContextCompat.getColor(this, R.color.s1);
        } else {
            if (0 <= j5 && j5 < 60) {
                color = ContextCompat.getColor(this, R.color.p4);
            } else {
                color = ContextCompat.getColor(this, R.color.s1);
            }
        }
        spannableString.setSpan(new ForegroundColorSpan(color), string2.length() - string.length(), string2.length(), 17);
        ProgressBar progressBar5 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
        if (progressBar5 != null) {
            if (j2 != 0) {
                drawable = ContextCompat.getDrawable(this, R.drawable.progress_horizontal_black);
            } else {
                if (0 <= j5 && j5 < 60) {
                    drawable = ContextCompat.getDrawable(this, R.drawable.progress_horizontal_red);
                } else {
                    drawable = ContextCompat.getDrawable(this, R.drawable.progress_horizontal_black);
                }
            }
            progressBar5.setProgressDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            ProgressBar progressBar6 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
            if (progressBar6 != null) {
                progressBar6.setProgress(100 - score, true);
            }
        } else {
            ProgressBar progressBar7 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
            if (progressBar7 != null) {
                progressBar7.setProgress(100 - score);
            }
        }
        ProgressBar progressBar8 = (ProgressBar) findViewById(isRight ? R.id.progress_bar_right : R.id.progress_bar_left);
        if (progressBar8 != null) {
            progressBar8.setAlpha(1.0f);
        }
        TextView textView4 = (TextView) findViewById(isRight ? R.id.right_ear_user_time : R.id.left_ear_user_time);
        if (textView4 != null) {
            textView4.setText(spannableString);
        }
        TextView textView5 = (TextView) findViewById(isRight ? R.id.right_ear_user_time : R.id.left_ear_user_time);
        if (textView5 != null) {
            textView5.setAlpha(1.0f);
        }
        TextView textView6 = (TextView) findViewById(isRight ? R.id.title_right_ear : R.id.title_left_ear);
        if (textView6 != null) {
            textView6.setAlpha(1.0f);
        }
        ImageView imageView2 = (ImageView) findViewById(isRight ? R.id.icon_right_ear : R.id.icon_left_ear);
        if (imageView2 == null) {
            return;
        }
        imageView2.setSelected(true);
    }

    private final void C(boolean isReachedUpperLimit) {
        TextView textView = (TextView) findViewById(R.id.user_time_hint);
        if (textView == null) {
            return;
        }
        if (isReachedUpperLimit) {
            textView.setText(getString(R.string.settings_headset_listen_user_limit));
            textView.setTextColor(ContextCompat.getColor(this, R.color.p4));
        } else {
            textView.setText(getString(R.string.settings_headset_action_refresh_hint));
            textView.setTextColor(ContextCompat.getColor(this, R.color.s2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int innerEarVolume) {
        String string;
        TextView textView = (TextView) findViewById(R.id.volume_decibel_value);
        if (textView != null) {
            textView.setText(String.valueOf(innerEarVolume));
        }
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        if (innerEarVolume <= 80) {
            string = getString(R.string.settings_item_hearing_health_volume_descripe_moderate);
            F(readWritePropertyNotNull, R.color.s14);
        } else {
            if (81 <= innerEarVolume && innerEarVolume <= 90) {
                string = getString(R.string.settings_item_hearing_health_volume_descripe_higher);
                F(readWritePropertyNotNull, R.color.s29);
            } else {
                string = getString(R.string.settings_item_hearing_health_volume_descripe_tool_high);
                F(readWritePropertyNotNull, R.color.p3);
            }
        }
        String string2 = getString(R.string.settings_item_hearing_health_volume_descripe, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, E(readWritePropertyNotNull))), string2.length() - string.length(), string2.length(), 17);
        TextView textView2 = (TextView) findViewById(R.id.volume_decibel_description);
        if (textView2 == null) {
            return;
        }
        textView2.setText(spannableString);
    }

    private static final int E(ReadWriteProperty<Object, Integer> readWriteProperty) {
        return readWriteProperty.getValue(null, l[2]).intValue();
    }

    private static final void F(ReadWriteProperty<Object, Integer> readWriteProperty, int i) {
        readWriteProperty.setValue(null, l[2], Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean enable) {
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel);
        headsetHearingHealthViewModel.enableReportHeadsetInfo(enable, b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean enable) {
        View viewFindViewById;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.headset_hearing_health_on);
        boolean z = false;
        if (frameLayout != null) {
            if (!(frameLayout.getVisibility() == 0)) {
                frameLayout = null;
            }
            if (frameLayout != null && (viewFindViewById = findViewById(R.id.mask_view)) != null) {
                viewFindViewById.setVisibility(enable ? 8 : 0);
            }
        }
        int i = R.id.item_headset_settings_hearing_health;
        ListTile listTile = (ListTile) findViewById(i);
        if (listTile != null) {
            listTile.setEnabled(enable);
        }
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById(R.id.headset_hearing_health_off);
        if (linearLayoutCompat != null) {
            if (!(linearLayoutCompat.getVisibility() == 0)) {
                linearLayoutCompat = null;
            }
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setAlpha(enable ? 1.0f : 0.3f);
            }
        }
        if (enable) {
            ListTile listTile2 = (ListTile) findViewById(i);
            if (listTile2 != null && listTile2.isChecked()) {
                m().sendEmptyMessageDelayed(1, 600L);
            }
        }
        ListTile listTile3 = (ListTile) findViewById(i);
        if (listTile3 != null && listTile3.isChecked()) {
            z = true;
        }
        if (z) {
            HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
            Objects.requireNonNull(headsetHearingHealthViewModel);
            headsetHearingHealthViewModel.refreshEarUserTime(true);
            if (enable) {
                return;
            }
            this.lastHeadsetState = null;
            HeadsetHearingHealthViewModel headsetHearingHealthViewModel2 = this.viewModel;
            Objects.requireNonNull(headsetHearingHealthViewModel2);
            headsetHearingHealthViewModel2.handleHearingHealthEvent(p);
        }
    }

    private final DeviceManagerApi l() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final a m() {
        return (a) this.headsetHandler.getValue();
    }

    @RequiresApi(21)
    private final void n() {
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
        if (listTile != null) {
            listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lt3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    HeadsetHearingHealthActivity.o(this.a, compoundButton, z);
                }
            });
        }
        ((RainbowTitleBar) findViewById(R.id.rainbowTitleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: it3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetHearingHealthActivity.p(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HeadsetHearingHealthActivity headsetHearingHealthActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            HeadsetHearingHealthViewModel headsetHearingHealthViewModel = headsetHearingHealthActivity.viewModel;
            Objects.requireNonNull(headsetHearingHealthViewModel);
            headsetHearingHealthViewModel.setHearingHealth(z, headsetHearingHealthActivity.new d());
        }
        headsetHearingHealthActivity.y(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HeadsetHearingHealthActivity headsetHearingHealthActivity, View view) {
        headsetHearingHealthActivity.j(false);
        Intent intent = new Intent();
        ListTile listTile = (ListTile) headsetHearingHealthActivity.findViewById(R.id.item_headset_settings_hearing_health);
        intent.putExtra(EXTRA_HEARING_SWITCH_STATUS, listTile != null ? listTile.isChecked() : false);
        headsetHearingHealthActivity.setResult(-1, intent);
        headsetHearingHealthActivity.finish();
    }

    private final void q() {
        this.address = getIntent().getStringExtra(n);
        this.hearingHealthStatus = getIntent().getBooleanExtra(EXTRA_HEARING_SWITCH_STATUS, false);
        if (this.address == null) {
            finish();
            return;
        }
        DeviceManagerApi deviceManagerApiL = l();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str = this.address;
        if (str == null) {
            str = "";
        }
        Device bindDevice = deviceManagerApiL.getBindDevice(hMDeviceType, str);
        if (bindDevice == null) {
            bindDevice = null;
        } else {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
        }
        this.device = bindDevice;
    }

    @RequiresApi(21)
    private final void r() {
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel = (HeadsetHearingHealthViewModel) new ViewModelProvider(this).get(HeadsetHearingHealthViewModel.class);
        this.viewModel = headsetHearingHealthViewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel);
        headsetHearingHealthViewModel.getWritingResult().observe(this, new Observer() { // from class: ot3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetHearingHealthActivity.s(this.a, (Boolean) obj);
            }
        });
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel2 = this.viewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel2);
        headsetHearingHealthViewModel2.getStatusHearingHealth().observe(this, new Observer() { // from class: nt3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetHearingHealthActivity.t(this.a, (HearingHealthStatusVo) obj);
            }
        });
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel3 = this.viewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel3);
        headsetHearingHealthViewModel3.getHearingReportInfo().observe(this, new Observer() { // from class: mt3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetHearingHealthActivity.u(this.a, (HearingReportBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HeadsetHearingHealthActivity headsetHearingHealthActivity, Boolean bool) {
        if (headsetHearingHealthActivity.setLoadingDlg == null) {
            LoadingDialog loadingDialog = new LoadingDialog(headsetHearingHealthActivity);
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            headsetHearingHealthActivity.setLoadingDlg = loadingDialog;
        }
        if (bool == null) {
            return;
        }
        if (!(!bool.booleanValue())) {
            bool = null;
        }
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        LoadingDialog loadingDialog2 = headsetHearingHealthActivity.setLoadingDlg;
        if (loadingDialog2 == null) {
            return;
        }
        LoadingDialog loadingDialog3 = loadingDialog2.isShowing() ^ true ? loadingDialog2 : null;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
        loadingDialog3.setFailed(headsetHearingHealthActivity.getString(R.string.save_failed));
    }

    @JvmStatic
    public static final void startActivityForResult(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, int i, boolean z) {
        INSTANCE.startActivityForResult(appCompatActivity, str, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HeadsetHearingHealthActivity headsetHearingHealthActivity, HearingHealthStatusVo hearingHealthStatusVo) {
        if (hearingHealthStatusVo == null) {
            return;
        }
        int i = R.id.item_headset_settings_hearing_health;
        ListTile listTile = (ListTile) headsetHearingHealthActivity.findViewById(i);
        if (listTile != null) {
            Boolean statusHearingHealth = hearingHealthStatusVo.getStatusHearingHealth();
            listTile.setChecked(statusHearingHealth == null ? false : statusHearingHealth.booleanValue());
        }
        ListTile listTile2 = (ListTile) headsetHearingHealthActivity.findViewById(i);
        if (listTile2 != null) {
            listTile2.setEnabled(hearingHealthStatusVo.isEnable());
        }
        Boolean statusHearingHealth2 = hearingHealthStatusVo.getStatusHearingHealth();
        headsetHearingHealthActivity.y(statusHearingHealth2 == null ? headsetHearingHealthActivity.hearingHealthStatus : statusHearingHealth2.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HeadsetHearingHealthActivity headsetHearingHealthActivity, HearingReportBean hearingReportBean) {
        int leftInnerEarVolume = hearingReportBean.getRightInnerEarVolume() == 255 ? hearingReportBean.getLeftInnerEarVolume() : hearingReportBean.getRightInnerEarVolume();
        int i = leftInnerEarVolume == 255 ? 0 : leftInnerEarVolume;
        MarqueeView marqueeView = (MarqueeView) headsetHearingHealthActivity.findViewById(R.id.marqueeView);
        if (marqueeView != null) {
            MarqueeView.lightView$default(marqueeView, i, false, headsetHearingHealthActivity.new e(), 2, null);
        }
        if (hearingReportBean.getIsRefreshUserTime()) {
            headsetHearingHealthActivity.B(hearingReportBean.getLeftUserTime(), false, hearingReportBean.getLeftScore());
            headsetHearingHealthActivity.B(hearingReportBean.getRightUserTime(), true, hearingReportBean.getRightScore());
            headsetHearingHealthActivity.C(hearingReportBean.getLeftUserTime() == 0 || hearingReportBean.getRightUserTime() == 0);
        }
    }

    private final void v() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetHearingHealthActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.w();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                if (enable) {
                    HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.a.viewModel;
                    Objects.requireNonNull(headsetHearingHealthViewModel);
                    headsetHearingHealthViewModel.initHearingHealth();
                }
                this.a.k(enable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w() {
        return l().isActive(this.device);
    }

    private final void x() {
        CaveatBottomSheetDialogFragment caveatBottomSheetDialogFragment;
        if (this.caveatDialog == null) {
            CaveatBottomSheetDialogFragment caveatBottomSheetDialogFragment2 = new CaveatBottomSheetDialogFragment(HMDeviceSource.fromValue(this.device.getDevice_source().intValue()));
            this.caveatDialog = caveatBottomSheetDialogFragment2;
            caveatBottomSheetDialogFragment2.setCancelable(false);
        }
        if (this.caveatDialog.isAdded() || this.caveatDialog.isVisible() || getSupportFragmentManager().findFragmentByTag(m) != null || (caveatBottomSheetDialogFragment = this.caveatDialog) == null) {
            return;
        }
        caveatBottomSheetDialogFragment.showAllowingStateLoss(getSupportFragmentManager(), m);
    }

    @RequiresApi(21)
    private final void y(boolean status) {
        ImageView imageView;
        ImageView imageView2;
        if (!status) {
            int i = R.id.headset_hearing_health_off;
            if (((LinearLayoutCompat) findViewById(i)) == null) {
                ((ViewStub) findViewById(R.id.viewstub_headset_hearing_health_off)).inflate();
                ((TextView) findViewById(R.id.headset_hearing_health_summary)).setText(getString(R.string.settings_item_hearing_health_status_off_summary, new Object[]{getString(ConfigHelperKt.getDeviceConfig(HMDeviceSource.fromValue(this.device.getDevice_source().intValue())).getDeviceDesc())}));
            }
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById(i);
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(0);
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.headset_hearing_health_on);
            if (frameLayout == null) {
                return;
            }
            frameLayout.setVisibility(8);
            return;
        }
        int i2 = R.id.headset_hearing_health_on;
        if (((FrameLayout) findViewById(i2)) == null) {
            ((ViewStub) findViewById(R.id.viewstub_headset_hearing_health_on)).inflate();
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(i2);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) findViewById(R.id.headset_hearing_health_off);
        if (linearLayoutCompat2 != null) {
            linearLayoutCompat2.setVisibility(8);
        }
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel);
        HearingReportBean value = headsetHearingHealthViewModel.getHearingReportInfo().getValue();
        if (value != null) {
            int leftInnerEarVolume = value.getRightInnerEarVolume() == 255 ? value.getLeftInnerEarVolume() : value.getRightInnerEarVolume();
            int i3 = leftInnerEarVolume == 255 ? 0 : leftInnerEarVolume;
            MarqueeView marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
            if (marqueeView != null) {
                MarqueeView.lightView$default(marqueeView, i3, false, new g(), 2, null);
            }
            B(value.getLeftUserTime(), false, value.getLeftScore());
            B(value.getRightUserTime(), true, value.getRightScore());
            C(value.getLeftUserTime() == 0 || value.getRightUserTime() == 0);
        }
        int i4 = R.id.suggestion_use_time_caveat;
        ImageView imageView3 = (ImageView) findViewById(i4);
        if (!(imageView3 != null && imageView3.hasOnClickListeners()) && (imageView2 = (ImageView) findViewById(i4)) != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: kt3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeadsetHearingHealthActivity.z(this.a, view);
                }
            });
        }
        int i5 = R.id.headset_refresh_button;
        ImageView imageView4 = (ImageView) findViewById(i5);
        if ((imageView4 != null && imageView4.hasOnClickListeners()) || (imageView = (ImageView) findViewById(i5)) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: jt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetHearingHealthActivity.A(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(HeadsetHearingHealthActivity headsetHearingHealthActivity, View view) {
        headsetHearingHealthActivity.x();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j(false);
        Intent intent = new Intent();
        ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
        intent.putExtra(EXTRA_HEARING_SWITCH_STATUS, listTile != null ? listTile.isChecked() : false);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @RequiresApi(21)
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headset_hearing_health);
        v();
        q();
        r();
        n();
        EventBus.getDefault().register(this);
        HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
        Objects.requireNonNull(headsetHearingHealthViewModel);
        headsetHearingHealthViewModel.initHearingHealth();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().removeMessages(1);
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (event.getLfType() == LfType.INNER_EAR_VOLUME_REPORT_AND_USER_TIME) {
            HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
            Objects.requireNonNull(headsetHearingHealthViewModel);
            headsetHearingHealthViewModel.handleHearingHealthEvent(event.getExtra());
            HMLog.debug(m, new f(event));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    public final void onEventMainThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        if (w()) {
            ListTile listTile = (ListTile) findViewById(R.id.item_headset_settings_hearing_health);
            boolean z = false;
            if (listTile != null && listTile.isChecked()) {
                HeadsetDevice.HeadsetDeviceState headsetDeviceState = this.lastHeadsetState;
                if (headsetDeviceState == null) {
                    HeadsetHearingHealthViewModel headsetHearingHealthViewModel = this.viewModel;
                    Objects.requireNonNull(headsetHearingHealthViewModel);
                    headsetHearingHealthViewModel.refreshEarUserTime(true);
                    j(true);
                } else {
                    if (((headsetDeviceState == null || headsetDeviceState.isDualConnected()) ? false : true) && state.isDualConnected()) {
                        HeadsetHearingHealthViewModel headsetHearingHealthViewModel2 = this.viewModel;
                        Objects.requireNonNull(headsetHearingHealthViewModel2);
                        headsetHearingHealthViewModel2.refreshEarUserTime(true);
                        j(true);
                    } else {
                        HeadsetDevice.HeadsetDeviceState headsetDeviceState2 = this.lastHeadsetState;
                        if (headsetDeviceState2 != null && headsetDeviceState2.isDualConnected()) {
                            z = true;
                        }
                        if (z && !state.isDualConnected()) {
                            HeadsetHearingHealthViewModel headsetHearingHealthViewModel3 = this.viewModel;
                            Objects.requireNonNull(headsetHearingHealthViewModel3);
                            headsetHearingHealthViewModel3.refreshEarUserTime(true);
                            j(true);
                        }
                    }
                }
                this.lastHeadsetState = state;
            }
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(n, this.address);
    }
}

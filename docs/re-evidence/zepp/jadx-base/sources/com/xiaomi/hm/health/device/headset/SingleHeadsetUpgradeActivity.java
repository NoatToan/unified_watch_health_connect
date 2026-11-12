package com.xiaomi.hm.health.device.headset;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import de.greenrobot.event.EventBus;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0003H\u0014J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b*\u0010+R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010>8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010?R\u0016\u0010B\u001a\u00020@8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010C8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/SingleHeadsetUpgradeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "J", "a0", "Z", "X", "Y", "", "z", "x", "M", "Landroid/bluetooth/BluetoothDevice;", "device", "O", "y", "R", "v", LogUtil.I, "H", "b0", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "onDestroy", "onLeftClicked", "onBackPressed", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceFwUpgradeEvent;", "event", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "C", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "E", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "firmwareManagerApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "F", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "firmwareOnlineManagerApi", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "Lio/reactivex/disposables/Disposable;", "B", "Lio/reactivex/disposables/Disposable;", "checkTimeoutDisposable", "upgradeSingle", LogUtil.D, "upgradeSecond", "upgradingRight", "checkingFirmware", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "()Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", HMFwOnlineAnalyticsKt.BATTERY, "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "G", "()Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "headsetDeviceState", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"MissingPermission"})
public final class SingleHeadsetUpgradeActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String G = "SINGLE_UPGRADE";

    @NotNull
    private static final String H = "upgrade_second";

    @NotNull
    private static final String I = "upgrading_right";
    private static final int J = 20;
    private static final long K = 30000;
    private static final int L = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loading;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private Disposable checkTimeoutDisposable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean upgradeSingle;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean upgradeSecond;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean upgradingRight;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean checkingFirmware;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareManagerApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareOnlineManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/SingleHeadsetUpgradeActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "newInstance", "", "singleUpgrade", "", "EXTRA_SINGLE_UPGRADE", "Ljava/lang/String;", "", "MOZART_UPGRADE_MIN_BATTERY", LogUtil.I, "REQUEST_CODE_ENABLE_BLUETOOTH", "STATE_UPGRADE_SECOND", "STATE_UPGRADING_RIGHT", "", "TIMEOUT_CHECK_UPGRADE", "J", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newInstance(@NotNull Context context) {
            return newInstance(context, false);
        }

        @JvmStatic
        @NotNull
        public final Intent newInstance(@NotNull Context context, boolean singleUpgrade) {
            Intent intent = new Intent(context, (Class<?>) SingleHeadsetUpgradeActivity.class);
            intent.putExtra(SingleHeadsetUpgradeActivity.G, singleUpgrade);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleHeadsetUpgradeActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.firmwareManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FirmwareManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FirmwareManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.firmwareOnlineManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<FirmwareOnlineManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FirmwareOnlineManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), objArr4, objArr5);
            }
        });
    }

    private final BatteryInfo A() {
        IHMAuthCallback iHMAuthCallbackB = B();
        if (iHMAuthCallbackB != null && (iHMAuthCallbackB instanceof HeadsetDevice)) {
            return ((HeadsetDevice) iHMAuthCallbackB).getBatteryInfo(this.upgradingRight ? HeadsetDevice.Part.Right.INSTANCE : HeadsetDevice.Part.Left.INSTANCE);
        }
        return null;
    }

    private final HMBaseDevice B() {
        return C().getDevice(HMDeviceType.HEADSET);
    }

    private final DeviceManagerApi C() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final HMDeviceType D() {
        HMBaseDevice hMBaseDeviceB = B();
        HMDeviceType deviceType = hMBaseDeviceB == null ? null : hMBaseDeviceB.getDeviceType();
        return deviceType == null ? HMDeviceType.VDevice : deviceType;
    }

    private final FirmwareManagerApi E() {
        return (FirmwareManagerApi) this.firmwareManagerApi.getValue();
    }

    private final FirmwareOnlineManagerApi F() {
        return (FirmwareOnlineManagerApi) this.firmwareOnlineManagerApi.getValue();
    }

    private final HeadsetDevice.HeadsetDeviceState G() {
        IHMAuthCallback iHMAuthCallbackB = B();
        if (iHMAuthCallbackB != null && (iHMAuthCallbackB instanceof HeadsetDevice)) {
            return ((HeadsetDevice) iHMAuthCallbackB).getHeadsetState();
        }
        return null;
    }

    private final boolean H() {
        return b0() ? F().hasFwUpgrade(D()) : E().hasFwUpgrade(D());
    }

    private final boolean I() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            return true;
        }
        IconToast.showError(this, R.string.no_network);
        return false;
    }

    private final void J() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.headset_fw_upgrade_no_update).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: su6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleHeadsetUpgradeActivity.K(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(SingleHeadsetUpgradeActivity singleHeadsetUpgradeActivity, DialogInterface dialogInterface, int i) {
        if (singleHeadsetUpgradeActivity.upgradeSecond) {
            singleHeadsetUpgradeActivity.Z();
        } else {
            singleHeadsetUpgradeActivity.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(SingleHeadsetUpgradeActivity singleHeadsetUpgradeActivity, View view) {
        singleHeadsetUpgradeActivity.Y();
    }

    private final void M() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.headset_connect_failed).setMessage(R.string.headset_fw_upgrade_device_disconnected).setCancelable(true).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: vu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleHeadsetUpgradeActivity.N(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(DialogInterface dialogInterface, int i) {
    }

    private final void O(final BluetoothDevice device) {
        new AlertDialogFragment.Builder(this).setMessage(R.string.bind_headset_tips_pair_failed).setCancelable(true).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: tu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleHeadsetUpgradeActivity.P(dialogInterface, i);
            }
        }).setPositiveButton(R.string.retry, new DialogInterface.OnClickListener() { // from class: ru6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleHeadsetUpgradeActivity.Q(device, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(BluetoothDevice bluetoothDevice, DialogInterface dialogInterface, int i) {
        bluetoothDevice.createBond();
    }

    private final void R() {
        int i;
        int i2;
        if (this.upgradingRight) {
            i = R.string.headset_fw_single_upgrade_tips_right_title;
            i2 = R.string.headset_fw_single_upgrade_tips_right_msg;
        } else {
            i = R.string.headset_fw_single_upgrade_tips_left_title;
            i2 = R.string.headset_fw_single_upgrade_tips_left_msg;
        }
        new AlertDialogFragment.Builder(this).setTitle(i).setMessage(i2).setCancelable(true).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: wu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                SingleHeadsetUpgradeActivity.S(dialogInterface, i3);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(DialogInterface dialogInterface, int i) {
    }

    private final void T() {
        this.checkTimeoutDisposable = Observable.fromCallable(new Callable() { // from class: av6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SingleHeadsetUpgradeActivity.U();
            }
        }).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: yu6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SingleHeadsetUpgradeActivity.V(this.a, (Unit) obj);
            }
        }, new Consumer() { // from class: zu6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SingleHeadsetUpgradeActivity.W((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U() throws InterruptedException {
        Thread.sleep(30000L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(SingleHeadsetUpgradeActivity singleHeadsetUpgradeActivity, Unit unit) {
        singleHeadsetUpgradeActivity.checkingFirmware = false;
        LoadingDialog loadingDialog = singleHeadsetUpgradeActivity.loading;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            singleHeadsetUpgradeActivity.loading = null;
        }
        IconToast.showError(singleHeadsetUpgradeActivity, R.string.headset_fw_upgrade_network_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    private final void X() {
        if (this.upgradingRight) {
            ((AppCompatTextView) findViewById(R.id.tv_title)).setText(R.string.headset_fw_upgrade_right);
            ((AppCompatTextView) findViewById(R.id.tv_title_tips)).setText(R.string.headset_fw_upgrade_right_tips);
            ((AppCompatImageView) findViewById(R.id.iv_headset)).setImageResource(R.drawable.img_mozart_upgrade_right);
        } else {
            ((AppCompatTextView) findViewById(R.id.tv_title)).setText(R.string.headset_fw_upgrade_left);
            ((AppCompatTextView) findViewById(R.id.tv_title_tips)).setText(R.string.headset_fw_upgrade_left_tips);
            ((AppCompatImageView) findViewById(R.id.iv_headset)).setImageResource(R.drawable.img_mozart_upgrade_left);
        }
    }

    private final void Y() {
        int i = R.id.tv_upgrade;
        ((TextView) findViewById(i)).setEnabled(false);
        if ((z() && x() && y() && !v() && I()) ? false : true) {
            ((TextView) findViewById(i)).setEnabled(true);
            return;
        }
        ((TextView) findViewById(i)).setEnabled(true);
        int i2 = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(i2));
        loadingDialogShowDialog.setMessage(getString(i2));
        loadingDialogShowDialog.setCancelable(false);
        loadingDialogShowDialog.show();
        Unit unit = Unit.INSTANCE;
        this.loading = loadingDialogShowDialog;
        this.checkingFirmware = true;
        T();
        HMFwOnlineManager.getInstance().checkFw(D(), true);
    }

    private final void Z() {
        setResult(-1);
        finish();
    }

    private final void a0() {
        if (this.upgradeSecond) {
            Z();
            return;
        }
        this.upgradeSecond = true;
        this.upgradingRight = true ^ this.upgradingRight;
        X();
    }

    private final boolean b0() {
        return DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && F().useOnline(D());
    }

    @JvmStatic
    @NotNull
    public static final Intent newInstance(@NotNull Context context) {
        return INSTANCE.newInstance(context);
    }

    @JvmStatic
    @NotNull
    public static final Intent newInstance(@NotNull Context context, boolean z) {
        return INSTANCE.newInstance(context, z);
    }

    private final boolean v() {
        BatteryInfo batteryInfoA = A();
        if (!(batteryInfoA == null || batteryInfoA.getLevel() < 20)) {
            return false;
        }
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.headset_upgrade_low_battery, new Object[]{20})).setCancelable(true).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: uu6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SingleHeadsetUpgradeActivity.w(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialogInterface, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    private final boolean x() {
        boolean z;
        boolean z2;
        HMBaseDevice hMBaseDeviceB = B();
        if (hMBaseDeviceB == null) {
            M();
            return false;
        }
        BluetoothDevice bluetoothDevice = hMBaseDeviceB.getBluetoothDevice();
        if (bluetoothDevice.getBondState() != 12) {
            O(bluetoothDevice);
            return false;
        }
        if (hMBaseDeviceB.isConnected()) {
            HeadsetDevice.HeadsetDeviceState headsetDeviceStateG = G();
            if (headsetDeviceStateG != null) {
                z2 = this.upgradingRight ? true : true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = true;
            } else {
                BatteryInfo batteryInfoA = A();
                if (batteryInfoA == null ? true : batteryInfoA.isCharging()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        M();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    private final boolean y() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceStateG;
        boolean zIsRightConnected;
        boolean z;
        if (this.upgradingRight) {
            HeadsetDevice.HeadsetDeviceState headsetDeviceStateG2 = G();
            if (!(headsetDeviceStateG2 == null ? false : headsetDeviceStateG2.isLeftConnected())) {
                if (!this.upgradingRight) {
                    headsetDeviceStateG = G();
                    if (headsetDeviceStateG == null) {
                        zIsRightConnected = false;
                    } else {
                        zIsRightConnected = headsetDeviceStateG.isRightConnected();
                    }
                    if (zIsRightConnected) {
                    }
                }
            }
        } else {
            if (!this.upgradingRight) {
                headsetDeviceStateG = G();
                if (headsetDeviceStateG == null) {
                    zIsRightConnected = false;
                } else {
                    zIsRightConnected = headsetDeviceStateG.isRightConnected();
                }
                z = zIsRightConnected;
            }
        }
        if (z) {
            R();
            return false;
        }
        if (B() != null) {
            return true;
        }
        M();
        return false;
    }

    private final boolean z() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null ? false : defaultAdapter.isEnabled()) {
            return true;
        }
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        return false;
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
        if (this.upgradeSingle && this.upgradeSecond) {
            Z();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        MultiDeviceState.Host hostVersionHost;
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.upgradeSingle = savedInstanceState.getBoolean(G);
            this.upgradeSecond = savedInstanceState.getBoolean(H);
            this.upgradingRight = savedInstanceState.getBoolean(I);
        } else {
            IHMAuthCallback iHMAuthCallbackB = B();
            if (iHMAuthCallbackB == null) {
                hostVersionHost = null;
            } else {
                hostVersionHost = iHMAuthCallbackB instanceof HeadsetDevice ? ((HeadsetDevice) iHMAuthCallbackB).versionHost() : MultiDeviceState.Host.Right.INSTANCE;
            }
            if (hostVersionHost == null) {
                hostVersionHost = MultiDeviceState.Host.Right.INSTANCE;
            }
            this.upgradeSingle = getIntent().getBooleanExtra(G, false);
            this.upgradingRight = Intrinsics.areEqual(hostVersionHost, MultiDeviceState.Host.Right.INSTANCE);
        }
        setContentView(R.layout.activity_single_headset_upgrade);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.SINGLE_BACK);
        X();
        ((TextView) findViewById(R.id.tv_upgrade)).setOnClickListener(new View.OnClickListener() { // from class: xu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SingleHeadsetUpgradeActivity.L(this.a, view);
            }
        });
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Disposable disposable = this.checkTimeoutDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        if (this.checkingFirmware) {
            Disposable disposable = this.checkTimeoutDisposable;
            if (disposable != null) {
                disposable.dispose();
            }
            this.checkingFirmware = false;
            LoadingDialog loadingDialog = this.loading;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
                this.loading = null;
            }
            if (!result.isSuccess && result.error != 0) {
                IconToast.showError(this, R.string.headset_fw_upgrade_network_error);
                return;
            }
            if (!H()) {
                J();
                return;
            }
            if (!b0()) {
                FirmwareManagerApi firmwareManagerApiE = E();
                firmwareManagerApiE.enableFwUpgrade(true);
                firmwareManagerApiE.checkFwUpgrade(D(), true);
            } else {
                FirmwareOnlineManagerApi firmwareOnlineManagerApiF = F();
                firmwareOnlineManagerApiF.clearFwUpgradeTime();
                firmwareOnlineManagerApiF.enableFwUpgrade(true);
                firmwareOnlineManagerApiF.checkFwUpgrade(D(), true);
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(G, this.upgradeSingle);
        outState.putBoolean(H, this.upgradeSecond);
        outState.putBoolean(I, this.upgradingRight);
    }

    public final void onEventMainThread(@NotNull HMDeviceFwUpgradeEvent event) {
        if (event.isStop() && event.getResult()) {
            a0();
        }
    }
}

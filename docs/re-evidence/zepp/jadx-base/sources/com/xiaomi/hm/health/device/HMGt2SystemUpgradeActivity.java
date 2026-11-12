package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.OtaModule;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.OtaResult;
import com.xiaomi.hm.health.bt.profile.dfu.UpgradeStatueResponse;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity;
import com.xiaomi.hm.health.device.animator.TextViewAnimator;
import com.xiaomi.hm.health.device.event.NewDfuUpgradeEvent;
import com.xiaomi.hm.health.device.firmware.FwBatchUpgradeEvent;
import com.xiaomi.hm.health.device.firmware.FwCheckKt;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeInfo;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.SystemUpgradeView;
import com.xiaomi.hm.health.device.firmware.UpgradeStateHolder;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import de.greenrobot.event.EventBus;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0002{|B\u0007¢\u0006\u0004\by\u0010zJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0003J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\rH\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\n\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u0012\u0010(\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010&H\u0014J\b\u0010)\u001a\u00020\u0003H\u0014J\b\u0010*\u001a\u00020\u0003H\u0014J\b\u0010+\u001a\u00020\u0003H\u0016J\u0018\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0016J\u000e\u00101\u001a\u00020\u00032\u0006\u0010.\u001a\u000200J\u000e\u00101\u001a\u00020\u00032\u0006\u0010.\u001a\u000202J\u0010\u00101\u001a\u00020\u00032\u0006\u00104\u001a\u000203H\u0007J\u0012\u00107\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u000105H\u0014R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00109R\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u00109R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010KR\u0016\u0010N\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00109R\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010PR\u0016\u0010R\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010S\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010ZR$\u0010_\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\u001c\"\u0004\b]\u0010^R\u001d\u0010c\u001a\u00020`8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bF\u0010bR\u001d\u0010g\u001a\u00020d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010a\u001a\u0004\bJ\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010s\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010rR\u0016\u0010u\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010\u001cR\u001d\u0010x\u001a\u00020v8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bB\u0010w¨\u0006}"}, d2 = {"Lcom/xiaomi/hm/health/device/HMGt2SystemUpgradeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "w", "R", "V", "", "G", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "J", "N", "M", "", "show", "showLoadingDialog", "version", LogUtil.I, "initView", "U", "Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "otaResult", ExifInterface.LATITUDE_SOUTH, "", "errorRes", "e0", "errorCode", "g0", "Z", "X", "b0", "F", "x", "L", "z", "H", "Lcom/xiaomi/hm/health/device/firmware/HMFwOnlineUpgradeInfo;", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onDestroy", "onLeftClicked", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/xiaomi/hm/health/device/event/NewDfuUpgradeEvent;", "onEventMainThread", "Lcom/xiaomi/hm/health/device/firmware/FwBatchUpgradeEvent;", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "Landroid/content/Intent;", "intent", "onNewIntent", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "systemVersionTv", "y", "updateLogTv", "upgradeTitleTv", "Lcom/xiaomi/hm/health/device/firmware/SystemUpgradeView;", "Lcom/xiaomi/hm/health/device/firmware/SystemUpgradeView;", "systemUpgradeView", "Landroidx/appcompat/widget/AppCompatImageView;", "B", "Landroidx/appcompat/widget/AppCompatImageView;", "fwInfoImg", "Landroidx/core/widget/NestedScrollView;", "C", "Landroidx/core/widget/NestedScrollView;", "fwInfoSv", "Landroid/view/ViewGroup;", LogUtil.D, "Landroid/view/ViewGroup;", "fwLatestContainer", "fwCheckContainer", "lastVersionTv", "Landroid/view/View;", "Landroid/view/View;", "maskView", "forceUpgrade", "isUpgrading", "supportPresetFirmwareInformation", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "K", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "value", "W", "(Z)V", "canBack", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "O", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "P", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "proDevice", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Q", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "isCheckCloud", "Lcom/xiaomi/hm/health/device/animator/TextViewAnimator;", "Lcom/xiaomi/hm/health/device/animator/TextViewAnimator;", "animator", ExifInterface.GPS_DIRECTION_TRUE, "differentialPackageOta", "Lcom/huami/devicex/injection/other/AppUtilApi;", "()Lcom/huami/devicex/injection/other/AppUtilApi;", "appUtilApiLazy", "<init>", "()V", "Companion", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMGt2SystemUpgradeActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String V = "HMGt2SystemUpgradeActivity";

    @NotNull
    private static final String W = "KEY_UPGRADE_TYPE";

    @NotNull
    private static final String X = "KEY_IS_UPGRADING";
    private static final int Y = 100;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private SystemUpgradeView systemUpgradeView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private AppCompatImageView fwInfoImg;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private NestedScrollView fwInfoSv;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ViewGroup fwLatestContainer;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ViewGroup fwCheckContainer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TextView lastVersionTv;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private View maskView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean forceUpgrade;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isUpgrading;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean supportPresetFirmwareInformation;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceType deviceType;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean canBack;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    private final HMMiLiProDevice proDevice;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private boolean isCheckCloud;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    private TextViewAnimator animator;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private boolean differentialPackageOta;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    private final Lazy appUtilApiLazy;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private TextView systemVersionTv;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TextView updateLogTv;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private TextView upgradeTitleTv;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/HMGt2SystemUpgradeActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "force", "isUpgrading", "newIntent", "", WebConstant.QueryParam.LAUNCH, "", HMGt2SystemUpgradeActivity.X, "Ljava/lang/String;", HMGt2SystemUpgradeActivity.W, "", "MAX_PROGRESS", LogUtil.I, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, boolean force, boolean isUpgrading, boolean newIntent) {
            Intent intent = new Intent(context, (Class<?>) HMGt2SystemUpgradeActivity.class);
            if (newIntent) {
                intent.addFlags(872415232);
            } else {
                intent.setFlags(268435456);
            }
            intent.putExtra(HMGt2SystemUpgradeActivity.W, force);
            intent.putExtra(HMGt2SystemUpgradeActivity.X, isUpgrading);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"com/xiaomi/hm/health/device/HMGt2SystemUpgradeActivity$a", "Lcom/xiaomi/hm/health/bt/profile/dfu/IFirmwareUpgradeCallback;", "", "errorCode", "", "onError", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "upgradingProgress", "", "result", "onFwStop", "onFwProgress", "none", "onFwStart", "a", "Z", "showError", "<init>", "(Lcom/xiaomi/hm/health/device/HMGt2SystemUpgradeActivity;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements IFirmwareUpgradeCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean showError;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0795a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0795a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onFwStop: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Progress a;
            public final /* synthetic */ HMFirmwareType b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Progress progress, HMFirmwareType hMFirmwareType) {
                super(0);
                this.a = progress;
                this.b = hMFirmwareType;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "upgradingProgress: " + this.a + ", type: " + this.b;
            }
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, int i, a aVar) {
            hMGt2SystemUpgradeActivity.isUpgrading = false;
            if (!hMGt2SystemUpgradeActivity.g0(i)) {
                hMGt2SystemUpgradeActivity.b0();
            }
            aVar.showError = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(boolean z, a aVar, HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity) {
            HMLog.info(HMGt2SystemUpgradeActivity.V, new C0795a(z));
            if (!z) {
                if (aVar.showError) {
                    return;
                }
                hMGt2SystemUpgradeActivity.b0();
            } else if (hMGt2SystemUpgradeActivity.differentialPackageOta) {
                hMGt2SystemUpgradeActivity.X();
            } else {
                IconToast.showSuccess(hMGt2SystemUpgradeActivity, R.string.system_upgrade_update_success);
                hMGt2SystemUpgradeActivity.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, Progress progress, HMFirmwareType hMFirmwareType) {
            HMLog.info(HMGt2SystemUpgradeActivity.V, new b(progress, hMFirmwareType));
            SystemUpgradeView systemUpgradeView = hMGt2SystemUpgradeActivity.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView);
            systemUpgradeView.setText(hMGt2SystemUpgradeActivity.G());
            SystemUpgradeView systemUpgradeView2 = hMGt2SystemUpgradeActivity.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView2);
            systemUpgradeView2.setProgress(progress.getPercent());
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
        public void onError(final int errorCode) {
            final HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity = HMGt2SystemUpgradeActivity.this;
            hMGt2SystemUpgradeActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.b
                @Override // java.lang.Runnable
                public final void run() {
                    HMGt2SystemUpgradeActivity.a.d(hMGt2SystemUpgradeActivity, errorCode, this);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(@Nullable Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int none) {
            this.showError = false;
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(final boolean result) {
            final HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity = HMGt2SystemUpgradeActivity.this;
            hMGt2SystemUpgradeActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.d
                @Override // java.lang.Runnable
                public final void run() {
                    HMGt2SystemUpgradeActivity.a.e(result, this, hMGt2SystemUpgradeActivity);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
        public void upgradingProgress(@NotNull final HMFirmwareType type, @NotNull final Progress progress) {
            final HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity = HMGt2SystemUpgradeActivity.this;
            hMGt2SystemUpgradeActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.device.c
                @Override // java.lang.Runnable
                public final void run() {
                    HMGt2SystemUpgradeActivity.a.f(hMGt2SystemUpgradeActivity, progress, type);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$checkHttpOtaBeforeInit$1", f = "HMGt2SystemUpgradeActivity.kt", i = {}, l = {FTPCodes.USER_LOGGED_IN}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$checkHttpOtaBeforeInit$1$1", f = "HMGt2SystemUpgradeActivity.kt", i = {}, l = {Mtu.ATT_MTU_MAX}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMGt2SystemUpgradeActivity b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$checkHttpOtaBeforeInit$1$1$1", f = "HMGt2SystemUpgradeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0796a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ HMGt2SystemUpgradeActivity c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0796a(boolean z, HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, Continuation<? super C0796a> continuation) {
                    super(2, continuation);
                    this.b = z;
                    this.c = hMGt2SystemUpgradeActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0796a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0796a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.b) {
                        this.c.J();
                    } else {
                        this.c.M();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMGt2SystemUpgradeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0048  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                boolean zBooleanValue;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.supportPresetFirmwareInformation = FwCheckKt.supportPresetFirmwareInformation();
                    FwUpgradeFeature.Companion companion = FwUpgradeFeature.INSTANCE;
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    boolean zSupportSilentUpgrade = companion.supportSilentUpgrade(hMDeviceType);
                    boolean zIsNone = UpgradeStateHolder.INSTANCE.isNone();
                    boolean zIsUpgrading = FwUnZipStatusHolder.isUpgrading(hMDeviceType);
                    HMMiLiProDevice hMMiLiProDevice = this.b.proDevice;
                    UpgradeStatueResponse upgradeStatusSync = hMMiLiProDevice == null ? null : hMMiLiProDevice.getUpgradeStatusSync();
                    boolean z = false;
                    if (upgradeStatusSync != null) {
                        Boolean boolBoxBoolean = Boxing.boxBoolean(upgradeStatusSync.isOk() && !upgradeStatusSync.available() && upgradeStatusSync.getFirmwareType() == HMFirmwareType.FIRMWARE.getValue());
                        if (boolBoxBoolean == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean.booleanValue();
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    if (this.b.supportPresetFirmwareInformation && zSupportSilentUpgrade && zBooleanValue && !zIsNone && !zIsUpgrading) {
                        z = true;
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C0796a c0796a = new C0796a(z, this.b, null);
                    this.a = 1;
                    if (BuildersKt.withContext(main, c0796a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMGt2SystemUpgradeActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(HMGt2SystemUpgradeActivity.this, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMFwOnlineUpgradeInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo) {
            super(0);
            this.a = hMFwOnlineUpgradeInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "getHMFwOnlineUpgradeInfo:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "changeLog:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "主动弹出，强制升级，常亮屏幕";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "force upgrade";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "silent upgrade: " + UpgradeStateHolder.INSTANCE.getState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "crc", "Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "otaResult", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function2<Long, OtaResult, Unit> {
        public final /* synthetic */ HMFwOnlineUpgradeInfo a;
        public final /* synthetic */ HMGt2SystemUpgradeActivity b;
        public final /* synthetic */ Boolean c;

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
                return "本地有升级, 且与固件一致，准备直接触发升级";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ HMGt2SystemUpgradeActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity) {
                super(0);
                this.a = hMGt2SystemUpgradeActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "1, status not match, " + this.a.isUpgrading + ", " + this.a.forceUpgrade;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "本地有升级，但固件没有或不一致，准备重新开始传输";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ HMGt2SystemUpgradeActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity) {
                super(0);
                this.a = hMGt2SystemUpgradeActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "2, status not match, " + this.a.isUpgrading + ", " + this.a.forceUpgrade;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public static final e a = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "fastDoubleClick";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, Boolean bool) {
            super(2);
            this.a = hMFwOnlineUpgradeInfo;
            this.b = hMGt2SystemUpgradeActivity;
            this.c = bool;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, Boolean bool, HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo, View view) {
            if (hMGt2SystemUpgradeActivity.D().isFastDoubleClick(view)) {
                HMLog.info(HMGt2SystemUpgradeActivity.V, e.a);
                return;
            }
            if (hMGt2SystemUpgradeActivity.z() || !hMGt2SystemUpgradeActivity.forceUpgrade) {
                hMGt2SystemUpgradeActivity.getWindow().addFlags(128);
                hMGt2SystemUpgradeActivity.w();
                SystemUpgradeView systemUpgradeView = hMGt2SystemUpgradeActivity.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView);
                systemUpgradeView.setText(hMGt2SystemUpgradeActivity.F());
                SystemUpgradeView systemUpgradeView2 = hMGt2SystemUpgradeActivity.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView2);
                systemUpgradeView2.setProgress(0);
                hMGt2SystemUpgradeActivity.W(!(bool.booleanValue() | hMFwOnlineUpgradeInfo.isForceUpgrade()));
                HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(0, true);
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(hMGt2SystemUpgradeActivity, HMDeviceType.MILI, true, true, true);
                SystemUpgradeView systemUpgradeView3 = hMGt2SystemUpgradeActivity.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView3);
                systemUpgradeView3.setOnClickListener(null);
            }
        }

        public final void b(@Nullable Long l, @Nullable OtaResult otaResult) {
            String changeLogForApp = this.a.getChangeLogForApp();
            TextView textView = this.b.updateLogTv;
            Objects.requireNonNull(textView);
            textView.setText(changeLogForApp);
            boolean z = false;
            this.b.showLoadingDialog(false);
            if (l != null) {
                HMMiLiProDevice hMMiLiProDevice = this.b.proDevice;
                if (hMMiLiProDevice != null && !hMMiLiProDevice.connected()) {
                    z = true;
                }
                if (!z) {
                    if (otaResult != null && Intrinsics.areEqual(l, otaResult.getCrc())) {
                        HMLog.info(HMGt2SystemUpgradeActivity.V, a.a);
                        if (this.b.isUpgrading || this.b.forceUpgrade) {
                            HMLog.info(HMGt2SystemUpgradeActivity.V, new b(this.b));
                            return;
                        } else {
                            this.b.S(otaResult);
                            return;
                        }
                    }
                    HMLog.info(HMGt2SystemUpgradeActivity.V, c.a);
                    if (this.b.isUpgrading || this.b.forceUpgrade) {
                        HMLog.info(HMGt2SystemUpgradeActivity.V, new d(this.b));
                        return;
                    }
                    SystemUpgradeView systemUpgradeView = this.b.systemUpgradeView;
                    Objects.requireNonNull(systemUpgradeView);
                    systemUpgradeView.changeToTransmit();
                    SystemUpgradeView systemUpgradeView2 = this.b.systemUpgradeView;
                    Objects.requireNonNull(systemUpgradeView2);
                    final HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity = this.b;
                    final Boolean bool = this.c;
                    final HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfo = this.a;
                    systemUpgradeView2.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HMGt2SystemUpgradeActivity.j.c(hMGt2SystemUpgradeActivity, bool, hMFwOnlineUpgradeInfo, view);
                        }
                    });
                    return;
                }
            }
            this.b.x();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l, OtaResult otaResult) {
            b(l, otaResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "otaResult", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<OtaResult, Unit> {

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
                return "本地没有可供升级的文件，但固件端有，已经准备好触发升级";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "本地没有可供升级的文件，且固件端没有，已经开始检查云端更新";
            }
        }

        public k() {
            super(1);
        }

        public final void a(@Nullable OtaResult otaResult) {
            if (otaResult == null || !otaResult.getFileExist()) {
                HMLog.info(HMGt2SystemUpgradeActivity.V, b.a);
                HMGt2SystemUpgradeActivity.this.isCheckCloud = true;
                AppCompatImageView appCompatImageView = HMGt2SystemUpgradeActivity.this.fwInfoImg;
                Objects.requireNonNull(appCompatImageView);
                appCompatImageView.setImageResource(R.drawable.fw_check_upgrade);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(HMGt2SystemUpgradeActivity.this, R.anim.fw_check);
                AppCompatImageView appCompatImageView2 = HMGt2SystemUpgradeActivity.this.fwInfoImg;
                Objects.requireNonNull(appCompatImageView2);
                appCompatImageView2.startAnimation(animationLoadAnimation);
                TextView textView = HMGt2SystemUpgradeActivity.this.upgradeTitleTv;
                Objects.requireNonNull(textView);
                textView.setText(HMGt2SystemUpgradeActivity.this.getString(R.string.system_update_checking));
                SystemUpgradeView systemUpgradeView = HMGt2SystemUpgradeActivity.this.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView);
                systemUpgradeView.setVisibility(0);
                systemUpgradeView.setEnable(false);
                ViewGroup viewGroup = HMGt2SystemUpgradeActivity.this.fwCheckContainer;
                Objects.requireNonNull(viewGroup);
                viewGroup.setVisibility(0);
                NestedScrollView nestedScrollView = HMGt2SystemUpgradeActivity.this.fwInfoSv;
                Objects.requireNonNull(nestedScrollView);
                nestedScrollView.setVisibility(8);
                HMFwOnlineManager.getInstance().checkFw(HMGt2SystemUpgradeActivity.this.deviceType, true);
            } else {
                String log = otaResult.getLog();
                if (log != null) {
                    TextView textView2 = HMGt2SystemUpgradeActivity.this.updateLogTv;
                    Objects.requireNonNull(textView2);
                    textView2.setText(log);
                }
                HMLog.info(HMGt2SystemUpgradeActivity.V, a.a);
                HMGt2SystemUpgradeActivity.this.S(otaResult);
            }
            HMGt2SystemUpgradeActivity.this.showLoadingDialog(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OtaResult otaResult) {
            a(otaResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "静默传输完了，查下Ota信息，准备触发升级";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "otaResult", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<OtaResult, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ OtaResult a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OtaResult otaResult) {
                super(0);
                this.a = otaResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "ota已拿到：" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "发现Ota没有，直接退出页面";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "ota查到了！准备升级！";
            }
        }

        public m() {
            super(1);
        }

        public final void a(@Nullable OtaResult otaResult) {
            HMLog.info(HMGt2SystemUpgradeActivity.V, new a(otaResult));
            if (otaResult == null || !otaResult.getFileExist()) {
                HMLog.info(HMGt2SystemUpgradeActivity.V, b.a);
                HMGt2SystemUpgradeActivity.this.finish();
            } else {
                HMLog.info(HMGt2SystemUpgradeActivity.V, c.a);
                HMGt2SystemUpgradeActivity.this.S(otaResult);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OtaResult otaResult) {
            a(otaResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "丢弃检查结果";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "检查结果到了，将页面变成“立即下载”";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户点击升级，常亮屏幕";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onNewIntent, return for upgrading";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onStart, isNone: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "return for upgrading!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fastDoubleClick";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "errorCode: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMGt2SystemUpgradeActivity() {
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        this.deviceType = hMDeviceType;
        this.deviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceType);
        this.canBack = true;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr4, objArr5);
            }
        });
        HMBaseDevice device = C().getDevice(hMDeviceType);
        this.proDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = objArr2 == true ? 1 : 0;
        final Object[] objArr7 = objArr == true ? 1 : 0;
        this.appUtilApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AppUtilApi>() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.other.AppUtilApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AppUtilApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AppUtilApi.class), objArr6, objArr7);
            }
        });
    }

    private final void A() {
        if (this.isUpgrading) {
            N();
        } else {
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
        }
    }

    private final AppUtilApi B() {
        return (AppUtilApi) this.appUtilApiLazy.getValue();
    }

    private final DeviceManagerApi C() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi D() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final HMFwOnlineUpgradeInfo E() {
        HMFwOnlineUpgradeInfo hMFwOnlineInfo = this.supportPresetFirmwareInformation ? HMFwOnlineUpgradeManager.getInstance().getHMFwOnlineInfo(this, this.deviceType, this.supportPresetFirmwareInformation) : HMFwOnlineUpgradeManager.getInstance().getHMFwOnlineInfoInBatch(this, this.deviceType, this.supportPresetFirmwareInformation);
        HMLog.info(V, new d(hMFwOnlineInfo));
        return hMFwOnlineInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F() {
        return HMDeviceConfig.isWatch(this.deviceSource) ? getString(R.string.system_transforming) : getString(R.string.system_transforming_mili);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G() {
        return HMDeviceConfig.isWatch(this.deviceSource) ? getString(R.string.system_updating) : getString(R.string.mili_system_updating);
    }

    private final void H() {
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoE = E();
        String changeLogForApp = hMFwOnlineUpgradeInfoE == null ? null : hMFwOnlineUpgradeInfoE.getChangeLogForApp();
        HMLog.info(V, new e(changeLogForApp));
        TextView textView = this.updateLogTv;
        Objects.requireNonNull(textView);
        textView.setText(changeLogForApp);
    }

    private final void I(String version) {
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = HMFwOnlineUpgradeManager.getInstance().checkDeviceVersion(this, this.deviceType);
        if (hMFwOnlineUpgradeInfoCheckDeviceVersion == null) {
            TextView textView = this.systemVersionTv;
            Objects.requireNonNull(textView);
            textView.setText(version);
        } else {
            TextView textView2 = this.systemVersionTv;
            Objects.requireNonNull(textView2);
            textView2.setText(hMFwOnlineUpgradeInfoCheckDeviceVersion.getFwVersionName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"VisibleForTests"})
    public final void J() {
        HMMiLiProDevice hMMiLiProDevice = this.proDevice;
        I(hMMiLiProDevice == null ? null : hMMiLiProDevice.getDeviceVersionFill());
        H();
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(getString(R.string.deviceUpgrade_http_ota_tip));
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
        SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView2);
        systemUpgradeView2.setText(getString(R.string.system_update_last_btn));
        SystemUpgradeView systemUpgradeView3 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView3);
        systemUpgradeView3.setOnClickListener(new View.OnClickListener() { // from class: ow2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.K(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        if (hMGt2SystemUpgradeActivity.D().isFastDoubleClick(view)) {
            HMLog.info(V, f.a);
        } else {
            hMGt2SystemUpgradeActivity.finish();
        }
    }

    private final void L() {
        BTStatusFragment.newInstance(R.id.fw_tips_container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                boolean z = UpgradeStateHolder.INSTANCE.isNone() || enable;
                if (this.a.canBack && this.a.differentialPackageOta) {
                    return;
                }
                View view = this.a.maskView;
                Objects.requireNonNull(view);
                view.setVisibility(z ? 8 : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setOnClickListener(null);
        HMMiLiProDevice hMMiLiProDevice = this.proDevice;
        I(hMMiLiProDevice != null ? hMMiLiProDevice.getDeviceVersionFill() : null);
        if (this.forceUpgrade) {
            HMLog.info(V, g.a);
            getWindow().addFlags(128);
            w();
            W(false);
            HMLog.info(V, h.a);
            H();
            SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView2);
            systemUpgradeView2.setText(F());
            SystemUpgradeView systemUpgradeView3 = this.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView3);
            systemUpgradeView3.setProgress(0);
            HMFwOnlineUpgradeManager.getInstance().startFwUpgrade();
            return;
        }
        if (!UpgradeStateHolder.INSTANCE.isNone()) {
            getWindow().addFlags(128);
            w();
            HMLog.info(V, i.a);
            H();
            U();
            return;
        }
        if (!HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, this.deviceType)) {
            showLoadingDialog(true);
            FwCheckKt.getDeviceOtaResult(new k());
            return;
        }
        Boolean forceUpgrade = HMFwOnlineUpgradeManager.getInstance().getFwDwonSuccessInfo(this, this.deviceType).getForceUpgrade();
        showLoadingDialog(true);
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoE = E();
        if (hMFwOnlineUpgradeInfoE == null) {
            return;
        }
        FwCheckKt.check(hMFwOnlineUpgradeInfoE, new j(hMFwOnlineUpgradeInfoE, this, forceUpgrade));
    }

    private final void N() {
        OtaModule otaModule;
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setOnClickListener(null);
        HMMiLiProDevice hMMiLiProDevice = this.proDevice;
        I(hMMiLiProDevice != null ? hMMiLiProDevice.getDeviceVersionFill() : null);
        w();
        W(false);
        SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView2);
        systemUpgradeView2.setText(G());
        SystemUpgradeView systemUpgradeView3 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView3);
        systemUpgradeView3.setProgress(FwUnZipStatusHolder.getUpgradeProgress(this.deviceType));
        HMMiLiProDevice hMMiLiProDevice2 = this.proDevice;
        if (hMMiLiProDevice2 != null && (otaModule = (OtaModule) hMMiLiProDevice2.getChannelModule(OtaModule.class)) != null) {
            otaModule.getOtaInfo(new HMCallback<OtaResult>() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$initUpgradingState$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ OtaResult a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(OtaResult otaResult) {
                        super(0);
                        this.a = otaResult;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "otaResult: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@Nullable OtaResult result) {
                    HMLog.info("HMGt2SystemUpgradeActivity", new a(result));
                    if (result == null) {
                        return;
                    }
                    TextView textView = this.a.updateLogTv;
                    Objects.requireNonNull(textView);
                    textView.setText(result.getLog());
                }
            });
        }
        FwUnZipStatusHolder.INSTANCE.setUnZipCallback(new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity$initUpgradingState$2

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
                    return "query upgrade onFinish: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Progress a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Progress progress) {
                    super(0);
                    this.a = progress;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "progress: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.info("HMGt2SystemUpgradeActivity", new a(result));
                if (!result) {
                    this.a.b0();
                } else {
                    IconToast.showSuccess(this.a, R.string.system_upgrade_update_success);
                    this.a.finish();
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onProgress(@Nullable Progress progress) {
                HMLog.info("HMGt2SystemUpgradeActivity", new b(progress));
                if (progress == null) {
                    return;
                }
                SystemUpgradeView systemUpgradeView4 = this.a.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView4);
                systemUpgradeView4.setProgress(progress.getPercent());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        hMGt2SystemUpgradeActivity.onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view, int i2) {
        AutoOtaAtNightSettingActivity.INSTANCE.launch(hMGt2SystemUpgradeActivity);
        HMFwOnlineAnalyticsKt.systemupdateSetC();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(SystemUpgradeView systemUpgradeView, HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, boolean z, View view) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoE = hMGt2SystemUpgradeActivity.E();
            Boolean boolValueOf = hMFwOnlineUpgradeInfoE == null ? null : Boolean.valueOf(hMFwOnlineUpgradeInfoE.isForceUpgrade());
            boolean zBooleanValue = boolValueOf == null ? false : boolValueOf.booleanValue();
            systemUpgradeView.setEnable(true);
            systemUpgradeView.setLoading(true);
            systemUpgradeView.setProgress(0);
            boolean z2 = z | zBooleanValue;
            hMGt2SystemUpgradeActivity.forceUpgrade = z2;
            hMGt2SystemUpgradeActivity.W(z2 ? false : true);
            HMLog.info(V, p.a);
            hMGt2SystemUpgradeActivity.getWindow().addFlags(128);
            hMGt2SystemUpgradeActivity.w();
            systemUpgradeView.setText(hMGt2SystemUpgradeActivity.F());
            HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(hMGt2SystemUpgradeActivity, HMDeviceType.MILI, true, true, true);
            systemUpgradeView.setOnClickListener(null);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(V, null, null, new q(thM3848exceptionOrNullimpl), 6, null);
        }
    }

    private final void R() {
        if (this.animator != null) {
            return;
        }
        TextViewAnimator textViewAnimator = new TextViewAnimator();
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textViewAnimator.setTextView(textView);
        textViewAnimator.getTexts().add(getString(R.string.deviceUpgrade_keep_foreground));
        if (HMDeviceConfig.isWatch(this.deviceSource)) {
            textViewAnimator.getTexts().add(getString(R.string.deviceUpgrade_keep_enough_battery));
            textViewAnimator.getTexts().add(getString(R.string.deviceUpgrade_keep_phone_close));
        } else {
            textViewAnimator.getTexts().add(getString(R.string.deviceUpgrade_keep_enough_battery_mili));
            textViewAnimator.getTexts().add(getString(R.string.fw_upgrade_mili_tips));
        }
        Unit unit = Unit.INSTANCE;
        this.animator = textViewAnimator;
        textViewAnimator.startAnim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(final OtaResult otaResult) {
        TextViewAnimator textViewAnimator = this.animator;
        if (textViewAnimator != null) {
            textViewAnimator.cancel();
        }
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(getString(R.string.mili_setting_fw_upgrade_new_version));
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.changeToInstall();
        SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView2);
        systemUpgradeView2.setOnClickListener(new View.OnClickListener() { // from class: tw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.T(this.a, otaResult, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, OtaResult otaResult, View view) {
        if (hMGt2SystemUpgradeActivity.D().isFastDoubleClick(view)) {
            HMLog.info(V, t.a);
            return;
        }
        if (hMGt2SystemUpgradeActivity.z() && hMGt2SystemUpgradeActivity.proDevice != null) {
            hMGt2SystemUpgradeActivity.w();
            SystemUpgradeView systemUpgradeView = hMGt2SystemUpgradeActivity.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView);
            systemUpgradeView.setText(hMGt2SystemUpgradeActivity.G());
            SystemUpgradeView systemUpgradeView2 = hMGt2SystemUpgradeActivity.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView2);
            systemUpgradeView2.setProgress(0);
            hMGt2SystemUpgradeActivity.W(false);
            hMGt2SystemUpgradeActivity.proDevice.invokeUpgrade(otaResult.getCrc().longValue(), (int) otaResult.getFileSize().longValue(), HMFirmwareType.fromValue(otaResult.getFileType().byteValue() & 255), hMGt2SystemUpgradeActivity.new a());
            hMGt2SystemUpgradeActivity.isUpgrading = true;
            SystemUpgradeView systemUpgradeView3 = hMGt2SystemUpgradeActivity.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView3);
            systemUpgradeView3.setOnClickListener(null);
        }
    }

    private final void U() {
        if (this.isUpgrading) {
            HMLog.info(V, u.a);
            return;
        }
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        if (!systemUpgradeView.getLoading()) {
            SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView2);
            systemUpgradeView2.setLoading(true);
        }
        SystemUpgradeView systemUpgradeView3 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView3);
        systemUpgradeView3.setOnClickListener(null);
        UpgradeStateHolder upgradeStateHolder = UpgradeStateHolder.INSTANCE;
        if (upgradeStateHolder.isTransforming()) {
            int iLeftTime = upgradeStateHolder.leftTime();
            boolean z = this.differentialPackageOta;
            if (z && iLeftTime == 0) {
                SystemUpgradeView systemUpgradeView4 = this.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView4);
                systemUpgradeView4.setText(getString(R.string.fw_transfer_left_time_less_1_min));
            } else if (!z || iLeftTime <= 0) {
                SystemUpgradeView systemUpgradeView5 = this.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView5);
                systemUpgradeView5.setText(F());
            } else {
                SystemUpgradeView systemUpgradeView6 = this.systemUpgradeView;
                Objects.requireNonNull(systemUpgradeView6);
                systemUpgradeView6.setText(getResources().getQuantityString(R.plurals.fw_transfer_left_time, iLeftTime, Integer.valueOf(iLeftTime)));
            }
            SystemUpgradeView systemUpgradeView7 = this.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView7);
            systemUpgradeView7.setProgress(upgradeStateHolder.getProgress());
        }
        V();
    }

    private final void V() {
        TextViewAnimator textViewAnimator;
        TextViewAnimator textViewAnimator2 = this.animator;
        if (textViewAnimator2 == null) {
            R();
            return;
        }
        boolean z = false;
        if (textViewAnimator2 != null && !textViewAnimator2.getIsRunning()) {
            z = true;
        }
        if (!z || (textViewAnimator = this.animator) == null) {
            return;
        }
        textViewAnimator.startAnim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(boolean z) {
        this.canBack = z;
        getLeft().setVisibility(z ? 0 : 8);
        if (z) {
            ((RainbowTitleBar) findViewById(R.id.action_bar)).setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
        } else {
            ((RainbowTitleBar) findViewById(R.id.action_bar)).setNavigationIcon((Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        AppCompatImageView appCompatImageView = this.fwInfoImg;
        Objects.requireNonNull(appCompatImageView);
        appCompatImageView.clearAnimation();
        appCompatImageView.setImageResource(R.drawable.fw_lateset);
        TextViewAnimator textViewAnimator = this.animator;
        if (textViewAnimator != null) {
            textViewAnimator.cancel();
        }
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(HMDeviceConfig.isWatch(this.deviceSource) ? getString(R.string.system_update_on_device) : getString(R.string.system_update_on_device_mili));
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
        systemUpgradeView.setText(getString(R.string.system_update_last_btn));
        systemUpgradeView.setOnClickListener(new View.OnClickListener() { // from class: sw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.Y(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        if (hMGt2SystemUpgradeActivity.B().isFastDoubleClick(view)) {
            HMLog.info(V, v.a);
        } else {
            hMGt2SystemUpgradeActivity.finish();
        }
    }

    private final void Z() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.device_upgrade_tip_space_not_enough_title).setMessage(R.string.device_upgrade_tip_space_not_enough_message).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: kw2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HMGt2SystemUpgradeActivity.a0(this.a, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, DialogInterface dialogInterface, int i2) {
        hMGt2SystemUpgradeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        if (!this.differentialPackageOta) {
            new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.system_update_fail).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: mw2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    HMGt2SystemUpgradeActivity.d0(this.a, dialogInterface, i2);
                }
            }).show(getSupportFragmentManager());
            return;
        }
        TextViewAnimator textViewAnimator = this.animator;
        if (textViewAnimator != null) {
            textViewAnimator.cancel();
        }
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(getString(R.string.fw_transfer_error));
        View view = this.maskView;
        Objects.requireNonNull(view);
        view.setVisibility(8);
        W(true);
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
        systemUpgradeView.setText(getString(R.string.system_update_last_btn));
        systemUpgradeView.setOnClickListener(new View.OnClickListener() { // from class: nw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HMGt2SystemUpgradeActivity.c0(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        if (hMGt2SystemUpgradeActivity.B().isFastDoubleClick(view)) {
            HMLog.info(V, w.a);
        } else {
            hMGt2SystemUpgradeActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, DialogInterface dialogInterface, int i2) {
        hMGt2SystemUpgradeActivity.finish();
    }

    private final void e0(@StringRes int errorRes) {
        AppCompatImageView appCompatImageView = this.fwInfoImg;
        Objects.requireNonNull(appCompatImageView);
        appCompatImageView.clearAnimation();
        appCompatImageView.setImageResource(R.drawable.ic_toast_alert_44);
        TintUtils.tintDrawable(appCompatImageView, appCompatImageView.getResources().getColor(R.color.s2));
        TextViewAnimator textViewAnimator = this.animator;
        if (textViewAnimator != null) {
            textViewAnimator.cancel();
        }
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(getString(errorRes));
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
        systemUpgradeView.setText(getString(R.string.system_update_last_btn));
        systemUpgradeView.setOnClickListener(new View.OnClickListener() { // from class: rw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.f0(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        if (hMGt2SystemUpgradeActivity.B().isFastDoubleClick(view)) {
            HMLog.info(V, x.a);
        } else {
            hMGt2SystemUpgradeActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0(int errorCode) {
        HMLog.info(V, new y(errorCode));
        if (errorCode == 38) {
            e0(R.string.upgrade_error_phone_call_alive);
            return true;
        }
        if (errorCode == 39) {
            J();
            return true;
        }
        if (errorCode == 71) {
            Z();
            return true;
        }
        switch (errorCode) {
            case 32:
                e0(HMDeviceConfig.isWatch(this.deviceSource) ? R.string.upgrade_error_sport_alive : R.string.upgrade_error_sport_alive_mili);
                return true;
            case 33:
                e0(HMDeviceConfig.isWatch(this.deviceSource) ? R.string.upgrade_error_timer_alive : R.string.upgrade_error_timer_alive_mili);
                return true;
            case 34:
                e0(R.string.upgrade_error_low_battery);
                return true;
            case 35:
                e0(HMDeviceConfig.isWatch(this.deviceSource) ? R.string.upgrade_error_countdown_alive : R.string.upgrade_error_countdown_alive_mili);
                return true;
            case 36:
                e0(HMDeviceConfig.isWatch(this.deviceSource) ? R.string.upgrade_error_esim_activating : R.string.upgrade_error_esim_activating_mili);
                return true;
            default:
                return false;
        }
    }

    private final void initView() {
        this.systemVersionTv = (TextView) findViewById(R.id.system_version);
        this.updateLogTv = (TextView) findViewById(R.id.update_log_tv);
        this.upgradeTitleTv = (TextView) findViewById(R.id.upgrade_title_tv);
        this.systemUpgradeView = (SystemUpgradeView) findViewById(R.id.system_upgrade_view);
        this.fwInfoImg = (AppCompatImageView) findViewById(R.id.fw_info_img);
        this.fwInfoSv = (NestedScrollView) findViewById(R.id.fw_info_sv);
        this.fwLatestContainer = (ViewGroup) findViewById(R.id.fw_latest_container);
        this.fwCheckContainer = (ViewGroup) findViewById(R.id.fw_check_container);
        this.lastVersionTv = (TextView) findViewById(R.id.last_version_tv);
        this.maskView = findViewById(R.id.mask_view);
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, boolean z, boolean z2, boolean z3) {
        INSTANCE.launch(context, z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoadingDialog(boolean show) {
        if (show) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.loadingDialog = loadingDialogShowDialog;
            loadingDialogShowDialog.setMessage("");
            this.loadingDialog.setCancelable(false);
            return;
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.loadingDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        ((FrameLayout) findViewById(R.id.fw_tips_container)).setVisibility(8);
        R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        DeviceInfo deviceInfo;
        ViewGroup viewGroup = this.fwCheckContainer;
        Objects.requireNonNull(viewGroup);
        viewGroup.setVisibility(8);
        TextView textView = this.upgradeTitleTv;
        Objects.requireNonNull(textView);
        textView.setText(getString(R.string.system_update_latest));
        AppCompatImageView appCompatImageView = this.fwInfoImg;
        Objects.requireNonNull(appCompatImageView);
        appCompatImageView.clearAnimation();
        appCompatImageView.setImageResource(R.drawable.fw_lateset);
        NestedScrollView nestedScrollView = this.fwInfoSv;
        Objects.requireNonNull(nestedScrollView);
        nestedScrollView.setVisibility(8);
        ViewGroup viewGroup2 = this.fwLatestContainer;
        Objects.requireNonNull(viewGroup2);
        viewGroup2.setVisibility(0);
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
        SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView2);
        systemUpgradeView2.setText(getString(R.string.system_update_last_btn));
        SystemUpgradeView systemUpgradeView3 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView3);
        systemUpgradeView3.setOnClickListener(new View.OnClickListener() { // from class: pw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.y(this.a, view);
            }
        });
        HMBaseDevice device = C().getDevice(HMDeviceType.MILI);
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return;
        }
        TextView textView2 = this.lastVersionTv;
        Objects.requireNonNull(textView2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView2.setText(String.format(getString(R.string.system_update_last_version), Arrays.copyOf(new Object[]{deviceInfo.getFirmwareVersionStr()}, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HMGt2SystemUpgradeActivity hMGt2SystemUpgradeActivity, View view) {
        if (hMGt2SystemUpgradeActivity.D().isFastDoubleClick(view)) {
            HMLog.info(V, b.a);
        } else {
            hMGt2SystemUpgradeActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        BatteryInfo batteryInfo;
        HMBaseDevice device = C().getDevice(this.deviceType);
        if (device == null || (batteryInfo = device.getBatteryInfo()) == null || batteryInfo.getLevel() > 30) {
            return true;
        }
        IconToast.showError(this, HMDeviceConfig.isWatch(this.deviceSource) ? R.string.system_upgrade_battery_low : R.string.system_upgrade_battery_low_mili);
        return false;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        DeviceInfo deviceInfo;
        HMOtherVersion otherVersion;
        super.onCreate(savedInstanceState);
        EventReminderExpandKt.setUnifyTitleStyle$default(this, BaseTitleActivity.STYLE.NONE, "", null, 4, null);
        setContentView(R.layout.activity_gt2_system_upgrade);
        initView();
        L();
        HMBaseDevice device = C().getDevice(HMDeviceType.MILI);
        this.differentialPackageOta = (device == null || (deviceInfo = device.getDeviceInfo()) == null || (otherVersion = deviceInfo.getOtherVersion()) == null) ? false : Intrinsics.areEqual(otherVersion.getDifferentialPackageOtaMark(), Boolean.TRUE);
        this.forceUpgrade = getIntent().getBooleanExtra(W, false);
        this.isUpgrading = getIntent().getBooleanExtra(X, false);
        A();
        EventBus.getDefault().register(this);
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.action_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: qw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMGt2SystemUpgradeActivity.O(this.a, view);
            }
        });
        if (FwCheckKt.supportAutoOtaAtNight() != null) {
            rainbowTitleBar.setMenuIcon(R.drawable.ic_settings_20);
            rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: lw2
                @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
                public final void onClick(View view, int i2) {
                    HMGt2SystemUpgradeActivity.P(this.a, view, i2);
                }
            });
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        FwUnZipStatusHolder.INSTANCE.setUnZipCallback(null);
        TextViewAnimator textViewAnimator = this.animator;
        if (textViewAnimator != null) {
            textViewAnimator.cancel();
        }
        getWindow().clearFlags(128);
    }

    public final void onEventMainThread(@NotNull NewDfuUpgradeEvent event) {
        this.isUpgrading = true;
        SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView);
        systemUpgradeView.setText(G());
        SystemUpgradeView systemUpgradeView2 = this.systemUpgradeView;
        Objects.requireNonNull(systemUpgradeView2);
        systemUpgradeView2.setProgress(event.getProgress().getPercent());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        if (keyCode != 4 || this.canBack) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (this.canBack) {
            super.onLeftClicked();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra(X, false);
        if (this.isUpgrading) {
            HMLog.info(V, r.a);
            return;
        }
        this.isUpgrading = booleanExtra;
        this.forceUpgrade = intent.getBooleanExtra(W, false);
        A();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        boolean zIsNone = UpgradeStateHolder.INSTANCE.isNone();
        HMLog.info(V, new s(zIsNone));
        if (zIsNone) {
            return;
        }
        U();
    }

    public final void onEventMainThread(@NotNull FwBatchUpgradeEvent event) {
        if (event.getStop()) {
            this.isUpgrading = false;
            if (event.getResult()) {
                if (!this.forceUpgrade) {
                    ((FrameLayout) findViewById(R.id.fw_tips_container)).setVisibility(0);
                    HMLog.info(V, l.a);
                    FwCheckKt.getDeviceOtaResult(new m());
                    return;
                } else {
                    IconToast.showSuccess(this, R.string.system_upgrade_update_success);
                    finish();
                    return;
                }
            }
            if (g0(event.getErrorCode())) {
                return;
            }
            b0();
            return;
        }
        U();
    }

    @SuppressLint({"VisibleForTests"})
    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        Boolean forceUpgrade;
        if (!this.isCheckCloud) {
            HMLog.info(V, n.a);
            return;
        }
        final boolean zBooleanValue = false;
        this.isCheckCloud = false;
        if (result.isSuccess) {
            final SystemUpgradeView systemUpgradeView = this.systemUpgradeView;
            Objects.requireNonNull(systemUpgradeView);
            AppCompatImageView appCompatImageView = this.fwInfoImg;
            Objects.requireNonNull(appCompatImageView);
            appCompatImageView.clearAnimation();
            AppCompatImageView appCompatImageView2 = this.fwInfoImg;
            Objects.requireNonNull(appCompatImageView2);
            appCompatImageView2.setImageResource(R.drawable.fw_info_gt2);
            TextView textView = this.systemVersionTv;
            Objects.requireNonNull(textView);
            textView.setVisibility(0);
            systemUpgradeView.setEnable(true);
            systemUpgradeView.setLoading(false);
            HMMiLiProDevice hMMiLiProDevice = this.proDevice;
            I(hMMiLiProDevice == null ? null : hMMiLiProDevice.getDeviceVersionFill());
            systemUpgradeView.setVisibility(0);
            ViewGroup viewGroup = this.fwCheckContainer;
            Objects.requireNonNull(viewGroup);
            viewGroup.setVisibility(8);
            NestedScrollView nestedScrollView = this.fwInfoSv;
            Objects.requireNonNull(nestedScrollView);
            nestedScrollView.setVisibility(0);
            HMLog.info(V, o.a);
            systemUpgradeView.changeToTransmit();
            TextView textView2 = this.upgradeTitleTv;
            Objects.requireNonNull(textView2);
            textView2.setText(getString(R.string.mili_setting_fw_upgrade));
            FwDwonSuccessInfo fwDwonSuccessInfo = HMFwOnlineUpgradeManager.getInstance().getFwDwonSuccessInfo(this, this.deviceType);
            if (fwDwonSuccessInfo != null && (forceUpgrade = fwDwonSuccessInfo.getForceUpgrade()) != null) {
                zBooleanValue = forceUpgrade.booleanValue();
            }
            String changeLog = fwDwonSuccessInfo.getChangeLog();
            if (changeLog != null) {
                TextView textView3 = this.updateLogTv;
                Objects.requireNonNull(textView3);
                textView3.setText(HMFwOnlineUpgradeInfo.getChangeLogForApp(changeLog));
            }
            systemUpgradeView.setOnClickListener(new View.OnClickListener() { // from class: uw2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMGt2SystemUpgradeActivity.Q(systemUpgradeView, this, zBooleanValue, view);
                }
            });
            return;
        }
        x();
    }
}

package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.device.HMContinueUpgradeActivity;
import com.xiaomi.hm.health.device.firmware.FwBatchUpgradeEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeInfo;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.SystemUpgradeView;
import com.xiaomi.hm.health.device.firmware.UpgradeStateHolder;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0018R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u001d\u0010+\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u00100\u001a\u0004\u0018\u00010,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/HMContinueUpgradeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "r", "w", "", "version", DTransferConstants.SEARCH_KEY, "initView", "v", "t", "", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onLeftClicked", "", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "Lcom/xiaomi/hm/health/device/firmware/FwBatchUpgradeEvent;", "onEventMainThread", "x", "Z", "forceUpgrade", "y", "Ljava/lang/String;", "changeLog", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "z", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "canBack", "Lcom/huami/devicex/manager/DeviceManagerApi;", "B", "Lkotlin/Lazy;", "o", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "C", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "proDevice", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMContinueUpgradeActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String D = "HMGt2SystemUpgradeActivity";

    @NotNull
    private static final String E = "KEY_UPGRADE_TYPE";

    @NotNull
    private static final String F = "KEY_CHANGE_LOG";
    private static final int G = 100;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy proDevice;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean forceUpgrade;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private String changeLog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceType deviceType = HMDeviceType.MILI;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean canBack = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/HMContinueUpgradeActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "force", "", "changeLog", "", WebConstant.QueryParam.LAUNCH, HMContinueUpgradeActivity.F, "Ljava/lang/String;", HMContinueUpgradeActivity.E, "", "MAX_PROGRESS", LogUtil.I, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, boolean force, @NotNull String changeLog) {
            Intent intent = new Intent(context, (Class<?>) HMContinueUpgradeActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(HMContinueUpgradeActivity.E, force);
            intent.putExtra(HMContinueUpgradeActivity.F, changeLog);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMMiLiProDevice> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke */
        public final HMMiLiProDevice getA() {
            HMBaseDevice device = HMContinueUpgradeActivity.this.o().getDevice(HMContinueUpgradeActivity.this.deviceType);
            if (device instanceof HMMiLiProDevice) {
                return (HMMiLiProDevice) device;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMContinueUpgradeActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HMContinueUpgradeActivity$special$$inlined$inject$default$1
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
        this.proDevice = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final void initView() {
        TextView textView = (TextView) findViewById(R.id.update_log_tv);
        String str = this.changeLog;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        HMMiLiProDevice hMMiLiProDeviceP = p();
        q(hMMiLiProDeviceP == null ? null : hMMiLiProDeviceP.getDeviceVersion());
        SystemUpgradeView systemUpgradeView = (SystemUpgradeView) findViewById(R.id.system_upgrade_view);
        systemUpgradeView.setEnable(true);
        systemUpgradeView.setLoading(false);
        systemUpgradeView.setVisibility(0);
        systemUpgradeView.setProgress(100);
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, boolean z, @NotNull String str) {
        INSTANCE.launch(context, z, str);
    }

    private final boolean n() {
        BatteryInfo batteryInfo;
        HMBaseDevice device = o().getDevice(this.deviceType);
        if (device == null || (batteryInfo = device.getBatteryInfo()) == null || batteryInfo.getLevel() > 10) {
            return true;
        }
        IconToast.showError(this, R.string.mili_low_battery_tips_watch);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi o() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final HMMiLiProDevice p() {
        return (HMMiLiProDevice) this.proDevice.getValue();
    }

    private final void q(String version) {
        HMFwOnlineUpgradeInfo hMFwOnlineUpgradeInfoCheckDeviceVersion = HMFwOnlineUpgradeManager.getInstance().checkDeviceVersion(this, this.deviceType);
        if (hMFwOnlineUpgradeInfoCheckDeviceVersion == null) {
            ((TextView) findViewById(R.id.system_version)).setText(version);
        } else {
            ((TextView) findViewById(R.id.system_version)).setText(hMFwOnlineUpgradeInfoCheckDeviceVersion.getFwVersionName());
        }
    }

    private final void r() {
        int i = R.id.system_upgrade_view;
        ((SystemUpgradeView) findViewById(i)).changeToTransmit();
        ((SystemUpgradeView) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: zp2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMContinueUpgradeActivity.s(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HMContinueUpgradeActivity hMContinueUpgradeActivity, View view) {
        hMContinueUpgradeActivity.w();
        ((SystemUpgradeView) hMContinueUpgradeActivity.findViewById(R.id.system_upgrade_view)).setOnClickListener(null);
    }

    private final void t() {
        BTStatusFragment.newInstance(R.id.fw_tips_container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMContinueUpgradeActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.findViewById(R.id.mask_view).setVisibility(enable ? 8 : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HMContinueUpgradeActivity hMContinueUpgradeActivity, DialogInterface dialogInterface, int i) {
        hMContinueUpgradeActivity.finish();
    }

    private final void v() {
        UpgradeStateHolder upgradeStateHolder = UpgradeStateHolder.INSTANCE;
        if (upgradeStateHolder.isTransforming()) {
            int i = R.id.system_upgrade_view;
            ((SystemUpgradeView) findViewById(i)).setText(getString(R.string.system_transforming));
            ((SystemUpgradeView) findViewById(i)).setProgress(upgradeStateHolder.getProgress());
        }
    }

    private final void w() {
        if (n()) {
            this.canBack = false;
            ((SystemUpgradeView) findViewById(R.id.system_upgrade_view)).setLoading(true);
            ((FrameLayout) findViewById(R.id.fw_tips_container)).setVisibility(8);
            HMFwOnlineUpgradeManager.getInstance().startFwUpgrade();
        }
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
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.system_update), null, 2, null);
        setContentView(R.layout.activity_continue_upgrade);
        this.changeLog = getIntent().getStringExtra(F);
        initView();
        t();
        boolean booleanExtra = getIntent().getBooleanExtra(E, false);
        this.forceUpgrade = booleanExtra;
        if (!booleanExtra) {
            r();
        }
        boolean z = this.forceUpgrade;
        this.canBack = !z;
        if (z) {
            w();
        }
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull FwBatchUpgradeEvent event) {
        if (!event.getStop()) {
            v();
            return;
        }
        this.canBack = false;
        if (!event.getResult()) {
            new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.system_update_fail).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: yp2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HMContinueUpgradeActivity.u(this.a, dialogInterface, i);
                }
            }).show(getSupportFragmentManager());
        } else {
            setResult(-1);
            finish();
        }
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
}

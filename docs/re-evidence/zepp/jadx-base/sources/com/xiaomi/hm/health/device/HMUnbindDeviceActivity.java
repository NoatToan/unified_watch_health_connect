package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.model.appsort.AppItem;
import com.xiaomi.hm.health.bt.model.appsort.SortableAppItems;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bind.UnbindError;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.secondaryscreen.PeytoSecondaryScreen;
import com.xiaomi.hm.health.model.account.secondaryscreen.TempoSecondaryScreen;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMUnbindDeviceActivity extends BaseTitleActivity implements IUnbindListener {
    public static final int UNBIND_EARBUD = 5;
    public static final int UNBIND_MILI = 0;
    public static final int UNBIND_OTHER = 3;
    public static final int UNBIND_SHOES = 2;
    public static final int UNBIND_TREADMILL = 4;
    public static final String UNBIND_TYPE_KEY = "unbind_type";
    public static final int UNBIND_WEIGHT = 1;
    private TextView D;
    private TextView E;
    private ImageView F;
    private final String x = HMUnbindDeviceActivity.class.getSimpleName();
    private final Lazy<DeviceManagerApi> y = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceTimeStoreApi> z = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private final Lazy<DeviceUtilsApi> A = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<KeeperProxyApi> B = KoinJavaComponent.inject(KeeperProxyApi.class);
    private final Lazy<DeviceXNavigator> C = KoinJavaComponent.inject(DeviceXNavigator.class);
    private HMDeviceType G = null;
    private HMDeviceSource H = HMDeviceSource.VDEVICE;
    private LoadingDialog I = null;
    private LoadingDialog J = null;
    private boolean K = false;
    private String L = "";
    private HMDeviceType M = null;
    private boolean N = true;
    private boolean O = false;
    private boolean P = false;
    private Handler Q = null;
    private final int R = 0;
    private final int S = 30000;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                HMLog.i(HMUnbindDeviceActivity.this.x, "连接秤/跑步机设备超时", new Object[0]);
                if (HMUnbindDeviceActivity.this.I != null) {
                    HMUnbindDeviceActivity.this.I.dismiss();
                    HMUnbindDeviceActivity.this.I = null;
                }
                HMUnbindDeviceActivity.this.O = true;
                HMUnbindDeviceActivity.this.P = false;
                HMUnbindDeviceActivity.this.R(false, false);
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceType.TREADMILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceType.EARBUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void B(boolean z, boolean z2, boolean z3) {
        String str;
        if (z) {
            if (z2) {
                str = z3 ? StatEvent.UNBIND_OUT_CONFIRM_BY_SYNC_DATA_SUCCESS : StatEvent.UNBIND_OUT_CONFIRM_BY_SYNC_DATA_FAILED;
            } else {
                str = StatEvent.UNBIND_OUT_CONFIRM_BY_DISCONNECTED;
            }
        } else if (!z2) {
            str = StatEvent.UNBIND_OUT_CANCEL_BY_CONNECT_DEVICE_FAILED;
        } else if (z3) {
            return;
        } else {
            str = StatEvent.UNBIND_OUT_CANCEL_BY_SYNC_DATA_FAILED;
        }
        int i = b.a[this.G.ordinal()];
        if (i == 1) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.UNBIND_BAND_WATCH_OUT).setValue(str));
        } else if (i == 2) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.UNBIND_WEIGHT_OUT).setValue(str));
        } else {
            if (i != 3) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.UNBIND_SHOE_OUT).setValue(str));
        }
    }

    private boolean C() {
        if (!this.y.getValue().isBluetoothEnable()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 4097);
            return false;
        }
        if (NetUtil.isNetworkConnected(this)) {
            return true;
        }
        IconToast.showError(this, getString(R.string.not_connect_network));
        return false;
    }

    private void D() {
        HMLog.i(this.x, "连接秤/跑步机设备以同步数据", new Object[0]);
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_data_syncing));
        this.I = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        this.O = false;
        this.P = true;
        this.Q.removeMessages(0);
        this.Q.sendEmptyMessageDelayed(0, 30000L);
        this.y.getValue().createDevice(this.H.getType());
    }

    private boolean E() {
        HMBaseDevice device;
        DeviceInfo deviceInfo;
        if (this.H != HMDeviceSource.MILI_PRO || (device = this.y.getValue().getDevice(this.G)) == null || (deviceInfo = device.getDeviceInfo()) == null) {
            return false;
        }
        String firmwareVersionStr = deviceInfo.getFirmwareVersionStr();
        if (TextUtils.isEmpty(firmwareVersionStr)) {
            return false;
        }
        return firmwareVersionStr.equalsIgnoreCase("V1.0.0.18") || firmwareVersionStr.equalsIgnoreCase("V1.0.0.23");
    }

    private void F() {
        this.D = (TextView) findViewById(R.id.sub_title_tv);
        TextView textView = (TextView) findViewById(R.id.left_btn);
        this.E = (TextView) findViewById(R.id.right_btn);
        textView.setText(R.string.cancel);
        this.E.setText(R.string.unbind);
        this.F = (ImageView) findViewById(R.id.un_bind_device_img);
        this.E.setOnClickListener(new View.OnClickListener() { // from class: tl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.G(view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: ul3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        if (this.A.getValue().isFastDoubleClick(view)) {
            return;
        }
        if (NfcDeviceConfigKt.hasFeatureNfcDoorDevice(this.H)) {
            S();
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(R.string.device_unbind_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.J = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_unbinding));
        this.J = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null) {
            loadingDialog.setSuccess(getString(R.string.device_unbind_success));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M() {
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.J = null;
        }
        if (Q()) {
            this.C.getValue().startUnbindAlipayActivity(this, this.H);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        B(false, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        B(true, z, z2);
        this.N = this.y.getValue().isConnected(this.G);
        Device bindInfo = this.y.getValue().getBindInfo(this.G);
        if (bindInfo == null) {
            IconToast.showError(this, R.string.device_unbind_failed);
        } else {
            HMUnbindBaseLogic.unbind(bindInfo, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        T();
    }

    private boolean Q() {
        if (this.N) {
            return false;
        }
        HashMap<HMDeviceSource, SortableAppItems> displaySetting = HMAppSortDataManager.getInstance().getDisplaySetting();
        HMDeviceSource hMDeviceSource = this.H;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.MILI_TEMPO;
        if (hMDeviceSource == hMDeviceSource2) {
            SortableAppItems sortableAppItems = displaySetting.get(hMDeviceSource2);
            for (int i = 0; i < sortableAppItems.getAppCount(); i++) {
                AppItem appItem = sortableAppItems.getAppItem(i);
                if (appItem.getType() == HMDisplaySetting.AppTypeTempo.ALIPAY.getValue() && appItem.isEnable()) {
                    return true;
                }
            }
            if (TempoSecondaryScreen.get().getType() == 1) {
                return true;
            }
        }
        HMDeviceSource hMDeviceSource3 = this.H;
        HMDeviceSource hMDeviceSource4 = HMDeviceSource.MILI_PEYTO;
        if (hMDeviceSource3 != hMDeviceSource4) {
            return false;
        }
        SortableAppItems sortableAppItems2 = displaySetting.get(hMDeviceSource4);
        for (int i2 = 0; i2 < sortableAppItems2.getAppCount(); i2++) {
            AppItem appItem2 = sortableAppItems2.getAppItem(i2);
            if (appItem2.getType() == HMDisplaySetting.AppType.ALIPAY.getValue() && appItem2.isEnable()) {
                return true;
            }
        }
        return PeytoSecondaryScreen.get().getType() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(final boolean z, final boolean z2) {
        String string = getString(R.string.device_unbind_sync_failed_confirm, new Object[]{this.L});
        if (z2) {
            string = getString(R.string.device_unbind_confirm, new Object[]{this.L});
        } else if (!z) {
            string = getString(R.string.device_unbind_connect_failed_confirm, new Object[]{this.L});
        }
        new AlertDialogFragment.Builder(this).setMessage(string).setCancelable(true).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: rl3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.N(z, z2, dialogInterface, i);
            }
        }).setPositiveButton(z2 ? R.string.device_unbind : R.string.device_unbind_continue, new DialogInterface.OnClickListener() { // from class: sl3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O(z, z2, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void S() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.nfc_unbind_tips_title).setMessage(R.string.nfc_unbind_tips_info).setCancelable(true).setNeutralButton(R.string.nfc_lab_known, new DialogInterface.OnClickListener() { // from class: ql3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.P(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void T() {
        if (this.G != HMDeviceType.OTHER) {
            if (C()) {
                W();
            }
        } else if (NetUtil.isNetworkConnected(this)) {
            R(true, true);
        } else {
            IconToast.showError(this, getString(R.string.not_connect_network));
        }
    }

    private void U() {
        V(true);
    }

    private void V(boolean z) {
        this.K = true;
        if (z) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_data_syncing));
            this.I = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
        }
        if (this.G == HMDeviceType.TREADMILL) {
            this.y.getValue().startSyncBoltGpsData();
        } else {
            this.y.getValue().startSyncData(this.G);
        }
    }

    private void W() {
        Calendar boundDeviceSyncTime = this.z.getValue().getBoundDeviceSyncTime(this.G);
        Calendar calendar = Calendar.getInstance();
        boundDeviceSyncTime.add(12, 1);
        if (boundDeviceSyncTime.compareTo(calendar) > 0 || E()) {
            R(true, true);
            return;
        }
        if (this.y.getValue().isConnected(this.G)) {
            U();
        } else if (HMDeviceType.WEIGHT == this.G) {
            D();
        } else {
            R(false, false);
        }
    }

    private void updateUI() {
        String[] stringArray = getResources().getStringArray(R.array.unbind_device_description);
        if (this.G == HMDeviceType.EARBUD) {
            this.F.setImageResource(R.drawable.img_earbud);
        } else {
            this.F.setImageResource(ConfigHelperKt.getDeviceIcon(this.H));
        }
        switch (b.a[this.G.ordinal()]) {
            case 1:
                this.L = HMDeviceConfig.hasBoundWatch() ? stringArray[3] : stringArray[0];
                this.D.setText(getString(this.A.getValue().isSupportSensorHub(this) ? R.string.unbind_mili_support_sensorhub_tips : R.string.unbind_mili_tips, new Object[]{this.L}));
                break;
            case 2:
                if (!HMDeviceConfig.hasBoundBfs()) {
                    this.D.setText(R.string.unbind_weight_tips);
                    this.L = stringArray[1];
                } else {
                    this.D.setText(R.string.unbind_weight_bfs_tips);
                    this.L = getString(R.string.weight_bfs);
                }
                break;
            case 3:
                this.D.setText(R.string.unbind_shoes_tips);
                this.L = stringArray[2];
                break;
            case 4:
                this.D.setText(getString(R.string.blue_monkey_unbind_tips));
                this.L = stringArray[4];
                break;
            case 5:
                this.D.setText(R.string.unbind_bolt_tips);
                this.L = getString(R.string.other_bolt_offical);
                break;
            case 6:
                this.D.setText(R.string.earbud_unbind_tips);
                this.L = getString(R.string.earbud_chopin);
                break;
        }
        if (GlobalConfig.get().isBuildMidong()) {
            setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.white), true ^ RainbowUtils.isDarkMode(this));
        } else {
            setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true ^ RainbowUtils.isDarkMode(this));
        }
        if (ConfigHelperKt.hasFeature(this.H, Feature.BOLT_SERIES)) {
            findViewById(R.id.unbind_container).setVisibility(8);
            findViewById(R.id.bolt_unbind_img).setVisibility(0);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_unbind_device);
        int intExtra = getIntent().getIntExtra(UNBIND_TYPE_KEY, 0);
        if (intExtra == 0) {
            this.G = HMDeviceType.MILI;
        } else if (intExtra == 1) {
            this.G = HMDeviceType.WEIGHT;
        } else if (intExtra == 2) {
            this.G = HMDeviceType.SHOES;
        } else if (intExtra == 3) {
            this.G = HMDeviceType.OTHER;
        } else if (intExtra == 4) {
            this.G = HMDeviceType.TREADMILL;
        } else if (intExtra == 5) {
            this.G = HMDeviceType.EARBUD;
        }
        this.H = this.y.getValue().getBoundDeviceSource(this.G);
        F();
        updateUI();
        EventBus.getDefault().register(this);
        this.M = this.y.getValue().getMajorDeviceType();
        this.Q = new a();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Q.removeMessages(0);
        EventBus.getDefault().unregister(this);
        LoadingDialog loadingDialog = this.J;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.J = null;
        }
    }

    public void onEventMainThread(HMDeviceSyncGpsDataEvent hMDeviceSyncGpsDataEvent) {
        HMLog.i(this.x, "同步Treadmill gps数据事件:" + hMDeviceSyncGpsDataEvent.toString(), new Object[0]);
        if (hMDeviceSyncGpsDataEvent.getDeviceType() == this.G && this.K) {
            if (!hMDeviceSyncGpsDataEvent.isStop() && this.I == null) {
                this.I = LoadingDialog.showDialog(this, getString(R.string.device_data_syncing));
                return;
            }
            if (hMDeviceSyncGpsDataEvent.isStop()) {
                this.K = false;
                LoadingDialog loadingDialog = this.I;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                    this.I = null;
                }
                R(true, hMDeviceSyncGpsDataEvent.isSuccess());
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindFailure(UnbindError unbindError, HMDeviceType hMDeviceType) {
        this.E.post(new Runnable() { // from class: xl3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I();
            }
        });
        this.E.postDelayed(new Runnable() { // from class: wl3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J();
            }
        }, 1500L);
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindStart(HMDeviceType hMDeviceType) {
        this.E.post(new Runnable() { // from class: vl3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K();
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindSuccess(HMDeviceType hMDeviceType) {
        setResult(-1, getIntent());
        DeviceXFunctionsKt.getAppStateApi().onDeviceDestroy();
        if (hMDeviceType == HMDeviceType.MILI) {
            this.B.getValue().clearBindBaseStep();
        }
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind(this.H) && this.A.getValue().fromAvoidSpiteBindingStr()) {
            DeviceXFunctionsKt.getPropertyStoreApi().setProperty(Property.PROPERTY_AVOID_SPITE_BINDING, this.A.getValue().toAvoidSpiteBindingStr(false));
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
        }
        if (hMDeviceType == this.M && this.A.getValue().isSupportSensorHub(this)) {
            this.A.getValue().saveBaseStep();
            this.y.getValue().checkforBindSensorhub();
            this.B.getValue().setHasShowSensorhubTips(true);
        }
        this.E.post(new Runnable() { // from class: zl3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L();
            }
        });
        this.E.postDelayed(new Runnable() { // from class: yl3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M();
            }
        }, 1500L);
    }

    public void onEventMainThread(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
        HMLog.i(this.x, "同步数据事件:" + hMDeviceSyncDataEvent.toString(), new Object[0]);
        if (hMDeviceSyncDataEvent.getDeviceType() == this.G && this.K) {
            if ((hMDeviceSyncDataEvent.isStart() || hMDeviceSyncDataEvent.isProgress()) && this.I == null) {
                this.I = LoadingDialog.showDialog(this, getString(R.string.device_data_syncing));
                return;
            }
            if (hMDeviceSyncDataEvent.isStop()) {
                this.K = false;
                LoadingDialog loadingDialog = this.I;
                if (loadingDialog != null) {
                    loadingDialog.dismiss();
                    this.I = null;
                }
                R(true, hMDeviceSyncDataEvent.getResult());
            }
        }
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.getDeviceType() == HMDeviceType.WEIGHT || hMDeviceConnectionEvent.getDeviceType() == HMDeviceType.TREADMILL) {
            HMLog.i(this.x, "连接状态:" + hMDeviceConnectionEvent.toString() + ",是否同步数据发起连接:" + this.P + ",是否连接超时:" + this.O, new Object[0]);
            if (hMDeviceConnectionEvent.isConnected() && this.P && !this.O) {
                this.P = false;
                this.Q.removeMessages(0);
                V(false);
            }
        }
    }
}

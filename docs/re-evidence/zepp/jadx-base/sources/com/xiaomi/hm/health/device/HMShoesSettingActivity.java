package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MessageCenterApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.ItemView;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMShoesDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMShoesSettingActivity extends BaseTitleActivity {
    private static final int J = 0;
    private static final int K = 1;
    public static final /* synthetic */ boolean L = false;
    private LoadingDialog I;
    private ItemView x = null;
    private ItemView y = null;
    private ItemView z = null;
    private ItemView A = null;
    private ItemView B = null;
    private ItemView C = null;
    private HMDeviceSource D = null;
    private final Lazy<DeviceUtilsApi> E = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceManagerApi> F = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> G = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<MessageCenterApi> H = KoinJavaComponent.inject(MessageCenterApi.class);

    public class a extends BLEStatueListenerAdapter {
        public a() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.SHOES;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMShoesSettingActivity.this.w(z);
        }
    }

    public class b implements HMScrollView.OnHMScrollViewStateChanged {
        public b() {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onBottomExpand(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpand(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpandStart() {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewRelease(float f) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onScrollerScroll(float f) {
        }
    }

    private void initViews() {
        ItemView itemView = (ItemView) findViewById(R.id.shoes_setting_distance);
        this.C = itemView;
        itemView.setValue(this.E.getValue().getShoesDistanceDescription());
        this.A = (ItemView) findViewById(R.id.shoes_setting_calibrate);
        this.B = (ItemView) findViewById(R.id.shoes_setting_step_freq);
        p();
        if (this.D != HMDeviceSource.SHOES) {
            this.B.setVisibility(8);
        }
        this.y = (ItemView) findViewById(R.id.shoes_setting_firmware_version);
        this.z = (ItemView) findViewById(R.id.shoes_setting_firmware_upgrade_check);
        this.x = (ItemView) findViewById(R.id.mac_address);
        String boundDeviceAddress = this.F.getValue().getBoundDeviceAddress(HMDeviceType.SHOES);
        this.x.setValue(boundDeviceAddress);
        this.E.getValue().enableGetMacAddress((Context) this, this.x, boundDeviceAddress);
    }

    private void n(Activity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.I) == null || !loadingDialog.isShowing()) {
            return;
        }
        this.I.dismiss();
        this.I = null;
    }

    private void o() {
        HMScrollView hMScrollView = (HMScrollView) findViewById(R.id.shoes_setting_scroll);
        hMScrollView.setHeadView((HMExpandHeadView) findViewById(R.id.shoes_setting_icon_rl));
        hMScrollView.setOnHMScrollViewStateChanged(new b());
    }

    private void p() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new a());
    }

    private boolean q() {
        HMShoesDevice hMShoesDevice = (HMShoesDevice) this.F.getValue().getDevice(HMDeviceType.SHOES);
        return (hMShoesDevice == null || !hMShoesDevice.isConnected() || hMShoesDevice.isSyncingData()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Device device, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: og3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                this.a.setSubTitleText(str);
            }
        });
        if (alertDialogFragmentNewInstance != null) {
            alertDialogFragmentNewInstance.show(getSupportFragmentManager());
        }
    }

    private void s() {
        String stringExtra = getIntent().getStringExtra(this.E.getValue().getParamSource());
        if (this.D != null) {
            this.H.getValue().mineDevicePage(stringExtra, "", String.valueOf(this.D.getValue()));
        }
    }

    private void t(boolean z) {
        this.A.setEnabled(z);
        this.B.setEnabled(z);
        this.C.setEnabled(z);
        this.y.setEnabled(z);
        this.z.setEnabled(z);
        this.x.setEnabled(z);
    }

    private void u(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        int i = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, applicationContext.getString(i));
        this.I = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(applicationContext.getString(i));
        this.I.setCancelable(false);
        this.I.show();
    }

    private void v() {
        w(q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z) {
        if (!z) {
            t(false);
            return;
        }
        t(true);
        ItemView itemView = this.y;
        DeviceManagerApi value = this.F.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.SHOES;
        itemView.setValue(value.getBoundDeviceHrFirmwareVersion(hMDeviceType));
        this.z.setRedDotVisible((DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType) : HMFwUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.shoes_setting_unbind) {
            Intent intent = new Intent();
            intent.setClass(this, HMUnbindDeviceActivity.class);
            intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 2);
            startActivityForResult(intent, 0);
            Analytics.event(this, StatEvent.DEVICE_CHIP_OPERATE, "Unbind");
            return;
        }
        if (id == R.id.shoes_setting_calibrate) {
            this.G.getValue().startHMShoesCalibrateActivity(this, 0, null);
            Analytics.event(this, StatEvent.DEVICE_CHIP_OPERATE, StatEvent.DEVICE_OPERATE_CALIBRATION);
            return;
        }
        if (id == R.id.shoes_setting_step_freq) {
            startActivity(new Intent(this, (Class<?>) HMStepsFreqActivity.class));
            Analytics.event(this, StatEvent.DEVICE_CHIP_OPERATE, StatEvent.DEVICE_OPERATE_FREQ);
            return;
        }
        if (id == R.id.shoes_setting_distance) {
            this.G.getValue().startDetailInfoActivity(this, 2, null);
            Analytics.event(this, StatEvent.DEVICE_CHIP_OPERATE, StatEvent.DEVICE_OPERATE_MILE);
            return;
        }
        if (id == R.id.shoes_setting_firmware_upgrade_check) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.no_network_connection));
                return;
            }
            DeviceManagerApi value = this.F.getValue();
            HMDeviceType hMDeviceType = HMDeviceType.SHOES;
            HMShoesDevice hMShoesDevice = (HMShoesDevice) value.getDevice(hMDeviceType);
            if ((DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) ? HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType) : HMFwUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType)) {
                startActivity(HMFwUpgradeInfoActivity.newIntent(this, hMShoesDevice.getDeviceInfo().getDeviceSource()));
                return;
            }
            u(this);
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                HMFwOnlineManager.getInstance().checkFw(hMDeviceType, true);
            } else {
                NetFwUpgradeManager.checkFwFromServerAsync(true);
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_shoes_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_DEVICE, 0, this.E.getValue().getShoesDeviceDescription(), true);
        DeviceManagerApi value = this.F.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.SHOES;
        this.D = value.getBoundDeviceSource(hMDeviceType);
        final Device bindInfo = this.F.getValue().getBindInfo(hMDeviceType);
        if (bindInfo != null) {
            setSubTitleText(bindInfo.getDisplayName());
            getRightImage().setOnClickListener(new View.OnClickListener() { // from class: ng3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.r(bindInfo, view);
                }
            });
        }
        initViews();
        o();
        v();
        Analytics.event(this, "Shoe_ViewNum");
        Analytics.event(this, StatEvent.DEVICE_VIEW_NUM, String.valueOf(this.D.getValue()));
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) {
            HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
        } else {
            HMFwUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
        }
        s();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventFwCheckResult eventFwCheckResult) {
    }
}

package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MessageCenterApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.view.ItemView;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMNormandySettingActivity extends BaseTitleActivity {
    private static final String K = "HMNormandySettingActivity";
    private static final int L = 0;
    private static final int M = 1;
    public static final /* synthetic */ boolean N = false;
    private HMPersonInfo D;
    private HMMiliConfig E;
    private final Lazy<DeviceManagerApi> F;
    private final Lazy<DeviceUtilsApi> G;
    private final Lazy<KeeperProxyApi> H;
    private final Lazy<DeviceXNavigator> I;
    private final Lazy<MessageCenterApi> J;
    private ItemView x = null;
    private ItemView y = null;
    private ItemView z = null;
    private ItemView A = null;
    private ItemView B = null;
    private TextView C = null;

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ((DeviceUtilsApi) HMNormandySettingActivity.this.G.getValue()).getStatisticInfo(HMNormandySettingActivity.this, HMDeviceType.SHOES);
            return true;
        }
    }

    public class b implements HMScrollView.OnHMScrollViewStateChanged {
        public final /* synthetic */ HMScrollView a;

        public b(HMScrollView hMScrollView) {
            this.a = hMScrollView;
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
            int height = HMNormandySettingActivity.this.findViewById(R.id.content_container).getHeight() - this.a.getHeight();
            int i = (int) ((f * 255.0f) / height);
            HMLog.d(HMNormandySettingActivity.K, "alpha: " + i + " maxScroll: " + height, new Object[0]);
            if (i < 0) {
                i = 0;
            }
            HMNormandySettingActivity.this.getTitleBarView().setBackgroundColor(Color.argb(i, 28, DataTypeSource.SPORT_TYPE_BRIDGE, 202));
            HMNormandySettingActivity.this.setTintColor(Color.argb(i, 28, DataTypeSource.SPORT_TYPE_BRIDGE, 202));
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.SHOES;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMNormandySettingActivity.this.y(z);
        }
    }

    public HMNormandySettingActivity() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.D = hMPersonInfo;
        this.E = hMPersonInfo.getMiliConfig();
        this.F = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.G = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.H = KoinJavaComponent.inject(KeeperProxyApi.class);
        this.I = KoinJavaComponent.inject(DeviceXNavigator.class);
        this.J = KoinJavaComponent.inject(MessageCenterApi.class);
    }

    private void initViews() {
        q();
        this.x = (ItemView) findViewById(R.id.mars_mileage);
        int i = this.H.getValue().getInt("TOTAL_SHOES_ANALYSIS_MILES", 0);
        UnitManager unitManager = UnitManager.getInstance();
        String value = unitManager.formatValue(i, true);
        String unitStr = unitManager.getUnitStr();
        this.x.setValue(value + unitStr);
        this.y = (ItemView) findViewById(R.id.mars_place_mode);
        String shoePlaceMode = HMPersonInfo.getInstance().getMiliConfig().getShoePlaceMode();
        if (shoePlaceMode.equals("LEFT_SHOE")) {
            this.y.setValue(R.string.shoes_left_shoe);
        } else if (shoePlaceMode.equals(HMMiliConfig.RIGHT_SHOE)) {
            this.y.setValue(R.string.shoes_right_shoe);
        }
        this.z = (ItemView) findViewById(R.id.mars_setting_calibrate);
        this.A = (ItemView) findViewById(R.id.mac_address);
        String boundDeviceAddress = this.F.getValue().getBoundDeviceAddress(HMDeviceType.SHOES);
        this.A.setValue(boundDeviceAddress);
        this.G.getValue().enableGetMacAddress((Context) this, this.A, boundDeviceAddress);
        ItemView itemView = (ItemView) findViewById(R.id.normandy_setting_firmware_version);
        this.B = itemView;
        itemView.setOnLongClickListener(new a());
        this.C = (TextView) findViewById(R.id.normandy_setting_low_battery_tips);
        r();
    }

    private void p() {
        Intent intent = new Intent(this, (Class<?>) HMShoesUseActivity.class);
        intent.putExtra(InstallNormandyActivity.EXTRA, false);
        startActivity(intent);
    }

    private void q() {
        HMScrollView hMScrollView = (HMScrollView) findViewById(R.id.normandy_setting_scroll);
        hMScrollView.setHeadView((HMExpandHeadView) findViewById(R.id.normandy_setting_icon_rl));
        hMScrollView.setOnHMScrollViewStateChanged(new b(hMScrollView));
    }

    private void r() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Device device, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(device, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: sb3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                this.a.setSubTitleText(str);
            }
        });
        if (alertDialogFragmentNewInstance != null) {
            alertDialogFragmentNewInstance.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit t(String str) {
        this.J.getValue().mineDevicePage(str, "", String.valueOf(HMDeviceSource.SHOES_MARS.getValue()));
        return Unit.INSTANCE;
    }

    private void u() {
        final String stringExtra = getIntent().getStringExtra(this.G.getValue().getParamSource());
        DeviceXBuilder.INSTANCE.whenFlavorMatch(2, new Function0() { // from class: tb3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.t(stringExtra);
            }
        });
    }

    private void v(boolean z) {
        this.x.setEnabled(z);
        this.y.setEnabled(z);
        this.z.setEnabled(z);
        this.A.setEnabled(z);
        this.B.setEnabled(z);
    }

    private void w(BatteryInfo batteryInfo) {
        if (batteryInfo == null || batteryInfo.getLevel() == -1) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
            this.C.setText(this.G.getValue().getNormandyBatteryDescriptionResId(batteryInfo.getLevel()));
        }
    }

    private void x() {
        HMNormandyDevice hMNormandyDevice = (HMNormandyDevice) this.F.getValue().getDevice(HMDeviceType.SHOES);
        y((hMNormandyDevice == null || !hMNormandyDevice.isConnected() || hMNormandyDevice.isSyncingData()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z) {
        if (!z) {
            this.C.setVisibility(8);
            v(false);
            return;
        }
        v(true);
        DeviceManagerApi value = this.F.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.SHOES;
        HMNormandyDevice hMNormandyDevice = (HMNormandyDevice) value.getDevice(hMDeviceType);
        this.B.setValue(this.F.getValue().getBoundDeviceFirmwareVersion(hMDeviceType));
        w(hMNormandyDevice.getBatteryInfo());
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
        if (id == R.id.mars_mileage) {
            this.I.getValue().startDetailInfoActivity(this, 2, null);
            Analytics.event(this, StatEvent.DEVICE_CHIP2_OPERATE, StatEvent.DEVICE_OPERATE_MILE);
            return;
        }
        if (id == R.id.mars_place_mode) {
            p();
            Analytics.event(this, StatEvent.DEVICE_CHIP2_OPERATE, StatEvent.DEVICE_OPERATE_PLACE);
            return;
        }
        if (id == R.id.normandy_setting_unbind) {
            Intent intent = new Intent();
            intent.setClass(this, HMUnbindDeviceActivity.class);
            intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 2);
            startActivityForResult(intent, 0);
            Analytics.event(this, StatEvent.DEVICE_CHIP2_OPERATE, "Unbind");
            return;
        }
        if (id == R.id.mars_setting_calibrate) {
            Intent intent2 = new Intent(this, (Class<?>) HMShoesCalibrateActivity.class);
            intent2.putExtra("device_source", HMDeviceSource.SHOES_MARS);
            intent2.putExtra("cali_from", 0);
            startActivity(intent2);
            Analytics.event(this, StatEvent.DEVICE_CHIP2_OPERATE, StatEvent.DEVICE_OPERATE_CALIBRATION);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_normandy_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_DOUBLE_TITLE_DEVICE, 0, this.G.getValue().getShoesDeviceDescription(), true);
        DeviceManagerApi value = this.F.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.SHOES;
        final Device bindInfo = value.getBindInfo(hMDeviceType);
        if (bindInfo != null) {
            setSubTitleText(bindInfo.getDisplayName());
            getRightImage().setOnClickListener(new View.OnClickListener() { // from class: rb3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.s(bindInfo, view);
                }
            });
        }
        initViews();
        x();
        EventBus.getDefault().register(this);
        Analytics.event(this, StatEvent.DEVICE_VIEW_NUM, String.valueOf(HMDeviceSource.SHOES_MARS));
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) {
            HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
        } else {
            HMFwUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
        }
        u();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceBatteryEvent hMDeviceBatteryEvent) {
        if (hMDeviceBatteryEvent.getDeviceType() != HMDeviceType.SHOES) {
            return;
        }
        w(hMDeviceBatteryEvent.getBatteryInfo());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMMiliConfig miliConfig = this.D.getMiliConfig();
        this.E = miliConfig;
        this.y.setValue(miliConfig.getShoePlaceMode().equals("LEFT_SHOE") ? R.string.shoes_left_shoe : R.string.shoes_right_shoe);
    }
}

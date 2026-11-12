package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MessageCenterApi;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeInfoActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMBlueMonkeySettingActivity extends BaseTitleActivity {
    private static final String M = "HMBlueMonkeySettingActivity";
    private static final int N = 1970;
    private static final int O = 0;
    private static final int P = 1;
    private static final int Q = 30000;
    private TextView A;
    private ImageView B;
    private ItemView C;
    private ItemView D;
    private ItemView E;
    private String G;
    private LoadingDialog I;
    private c J;
    private TextView x;
    private ImageView y;
    private TextView z;
    private HMDeviceManager F = HMDeviceManager.getInstance();
    private boolean H = false;
    private final Lazy<DeviceUtilsApi> K = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<MessageCenterApi> L = KoinJavaComponent.inject(MessageCenterApi.class);

    public class a implements HMScrollView.OnHMScrollViewStateChanged {
        public a() {
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
            HMLog.d(HMBlueMonkeySettingActivity.M, "onScroll " + f, new Object[0]);
            if (f > 255.0f) {
                f = 255.0f;
            }
            int i = (int) f;
            int i2 = i >= 0 ? i : 0;
            HMBlueMonkeySettingActivity.this.getTitleBarView().setBackgroundColor(Color.argb(i2, 62, 138, 225));
            HMBlueMonkeySettingActivity.this.setTintColor(Color.argb(i2, 62, 138, 225));
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public HMDeviceType getHMDeviceType() {
            return HMDeviceType.OTHER;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMBlueMonkeySettingActivity.this.A(z);
        }
    }

    public static class c extends Handler {
        private WeakReference<HMBlueMonkeySettingActivity> a;

        public c(HMBlueMonkeySettingActivity hMBlueMonkeySettingActivity) {
            this.a = new WeakReference<>(hMBlueMonkeySettingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            HMBlueMonkeySettingActivity hMBlueMonkeySettingActivity = this.a.get();
            if (hMBlueMonkeySettingActivity == null) {
                return;
            }
            hMBlueMonkeySettingActivity.q();
            IconToast.showSuccess(hMBlueMonkeySettingActivity, R.string.apk_uptodate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.OTHER);
        if (z) {
            this.C.setEnabled(true);
            this.D.setEnabled(true);
            this.E.setEnabled(true);
            this.y.setVisibility(8);
            this.A.setVisibility(0);
            this.x.setVisibility(0);
            this.z.setVisibility(0);
            if (device != null) {
                x(device.getBatteryInfo());
                y(device.getDeviceInfo());
                z();
                return;
            }
            return;
        }
        this.C.setEnabled(false);
        this.D.setEnabled(false);
        this.E.setEnabled(false);
        if (device != null && !device.isConnected()) {
            this.y.setVisibility(0);
            this.A.setVisibility(8);
            this.x.setVisibility(8);
            this.z.setVisibility(8);
            this.B.setVisibility(8);
            return;
        }
        this.y.setVisibility(8);
        this.A.setVisibility(0);
        this.x.setVisibility(0);
        this.z.setVisibility(0);
        if (device != null) {
            x(device.getBatteryInfo());
        }
    }

    private void init() {
        this.J = new c(this);
        HMScrollView hMScrollView = (HMScrollView) findViewById(R.id.blue_monkey_setting_scrollview);
        hMScrollView.setHeadView((HMExpandHeadView) findViewById(R.id.blue_monkey_setting_battery_rl));
        hMScrollView.setOnHMScrollViewStateChanged(new a());
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.OTHER;
        String boundDeviceAddress = hMDeviceManager.getBoundDeviceAddress(hMDeviceType);
        ItemView itemView = (ItemView) findViewById(R.id.mac_address);
        this.C = itemView;
        itemView.setValue(boundDeviceAddress);
        this.D = (ItemView) findViewById(R.id.fw_version);
        ItemView itemView2 = (ItemView) findViewById(R.id.bm_setting_firmware_upgrade);
        this.E = itemView2;
        itemView2.setVisibility(0);
        this.E.setOnClickListener(new View.OnClickListener() { // from class: vo2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        findViewById(R.id.unbind_btn).setOnClickListener(new View.OnClickListener() { // from class: uo2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
        this.x = (TextView) findViewById(R.id.low_battery_tips);
        this.y = (ImageView) findViewById(R.id.disconnected_img);
        this.z = (TextView) findViewById(R.id.battery_level);
        this.A = (TextView) findViewById(R.id.battery_tips);
        this.B = (ImageView) findViewById(R.id.battery_img);
        this.G = this.F.getBoundDeviceAddress(hMDeviceType);
        r();
        A(true);
    }

    private void p() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network_connection));
            return;
        }
        if (!DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            if (HMFwUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.OTHER)) {
                startActivity(HMFwUpgradeInfoActivity.newIntent(this, HMDeviceSource.OTHER_BM));
                return;
            }
            this.H = true;
            w(this);
            NetFwUpgradeManager.checkFwFromServerAsync(true);
            return;
        }
        HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.OTHER;
        if (hMFwOnlineUpgradeManager.hasFwUpgrade(this, hMDeviceType)) {
            startActivity(HMFwUpgradeInfoActivity.newIntent(this, HMDeviceSource.OTHER_BM));
            return;
        }
        this.H = true;
        w(this);
        HMFwOnlineManager.getInstance().checkFw(hMDeviceType, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LoadingDialog loadingDialog;
        if (isDestroyed() || isFinishing() || (loadingDialog = this.I) == null || !loadingDialog.isShowing()) {
            return;
        }
        this.I.dismiss();
        this.I = null;
    }

    private void r() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        Intent intent = new Intent();
        intent.setClass(this, HMUnbindDeviceActivity.class);
        intent.putExtra(HMUnbindDeviceActivity.UNBIND_TYPE_KEY, 3);
        startActivityForResult(intent, 0);
    }

    private void u() {
        this.L.getValue().mineDevicePage(getIntent().getStringExtra(this.K.getValue().getParamSource()), "", String.valueOf(HMDeviceSource.OTHER_BM.getValue()));
    }

    private void v(int i) {
        this.z.setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(getString(R.string.battery_level_mili_setting, new Object[]{String.valueOf(i)}), this, Font.KM, Integer.valueOf((int) ViewUtils.sp2px(this, 72.0f)), null));
    }

    private void w(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i));
        this.I = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(getString(i));
        this.I.setCancelable(false);
        this.I.show();
        this.J.sendEmptyMessageDelayed(1, 30000L);
    }

    private void x(BatteryInfo batteryInfo) {
        String string;
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        if (batteryInfo == null) {
            this.z.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        int level = batteryInfo.getLevel();
        v(level);
        if (batteryInfo.isCharging()) {
            this.A.setVisibility(0);
            this.A.setText(getString(R.string.blue_monkey_charging));
            if (level == 100) {
                this.B.setVisibility(8);
                this.z.setVisibility(0);
                this.A.setText(getString(R.string.mili_setting_charge_full));
                return;
            } else {
                this.B.setVisibility(0);
                this.B.setImageResource(R.drawable.charging_icon);
                this.z.setVisibility(8);
                return;
            }
        }
        this.B.setVisibility(8);
        this.z.setVisibility(level <= 0 ? 8 : 0);
        Calendar lastCharge = batteryInfo.getLastCharge();
        int deltaDayCount = TimeUtils.getDeltaDayCount(lastCharge, Calendar.getInstance());
        Calendar earliestBoundTime = HMDeviceManager.getInstance().getEarliestBoundTime(this.G);
        HMLog.d(M, "lastCharge:" + lastCharge, new Object[0]);
        HMLog.d(M, "earliestBound:" + earliestBoundTime, new Object[0]);
        if (deltaDayCount < 0 || earliestBoundTime == null || lastCharge.get(1) == N) {
            this.A.setVisibility(8);
            return;
        }
        if (lastCharge.after(earliestBoundTime)) {
            string = getResources().getQuantityString(R.plurals.mili_setting_last_charge, deltaDayCount, Integer.valueOf(deltaDayCount));
            if (deltaDayCount == 0) {
                string = getString(R.string.mili_setting_last_charge_today);
            } else if (deltaDayCount == 1) {
                string = getString(R.string.mili_setting_last_charge_yestoday);
            }
        } else {
            string = getString(R.string.mili_setting_no_charge_after_bound);
        }
        this.A.setVisibility(0);
        this.A.setText(string);
        if (level <= 10) {
            this.x.setVisibility(0);
        }
    }

    private void y(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        this.D.setValue(deviceInfo.getFirmwareVersionStr());
    }

    private void z() {
        if (this.E.getVisibility() != 0) {
            return;
        }
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.OTHER;
            if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                this.E.setRedDotVisible(HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(this, hMDeviceType));
                return;
            }
        }
        this.E.setRedDotVisible(HMFwUpgradeManager.getInstance().hasFwUpgrade(this, HMDeviceType.OTHER));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blue_monkey_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE_TRANSPARENT, 0, this.K.getValue().getOtherDeviceDescription());
        init();
        EventBus.getDefault().register(this);
        u();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.J.removeMessages(1);
    }

    public void onEventMainThread(HMDeviceBatteryEvent hMDeviceBatteryEvent) {
        if (hMDeviceBatteryEvent.getDeviceType() != HMDeviceType.OTHER) {
            return;
        }
        x(hMDeviceBatteryEvent.getBatteryInfo());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        z();
    }

    public void onEventMainThread(EventFwCheckResult eventFwCheckResult) {
        HMLog.d(M, "status:" + eventFwCheckResult.isSuccess, new Object[0]);
        this.J.removeMessages(1);
        q();
        if (eventFwCheckResult.isSuccess) {
            if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                HMDeviceType hMDeviceType = HMDeviceType.OTHER;
                if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
                    return;
                }
            }
            HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.OTHER, false);
            return;
        }
        if (this.H) {
            this.H = false;
            IconToast.showSuccess(this, R.string.apk_uptodate);
        }
    }
}

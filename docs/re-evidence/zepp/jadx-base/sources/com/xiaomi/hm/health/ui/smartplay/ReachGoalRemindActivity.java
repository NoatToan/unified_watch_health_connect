package com.xiaomi.hm.health.ui.smartplay;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.ReachGoalRemindActivity;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;
import com.xiaomi.hm.health.utils.UnitFunctionsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class ReachGoalRemindActivity extends BaseSmartPlayActivity {
    private static final String N = "ReachGoalRemindActivity";
    private ListTile H;
    private ListTile I;
    private HMPersonInfo F = null;
    private HMMiliConfig G = null;
    private final Lazy<DeviceManagerApi> J = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<AccountWebExtApi> K = KoinJavaComponent.inject(AccountWebExtApi.class);
    private final Lazy<GoalFunctionsApi> L = KoinJavaComponent.inject(GoalFunctionsApi.class);
    private BLEStatueListenerAdapter M = new c();

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            ReachGoalRemindActivity.this.z();
        }
    }

    public class b extends HMCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            if (z) {
                return;
            }
            ReachGoalRemindActivity.this.z();
        }
    }

    public class c extends BLEStatueListenerAdapter {
        public c() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public List<HMDeviceSource> getSupportDevices() {
            List<HMDeviceSource> proDevices = BLEStatueListenerAdapter.getProDevices();
            proDevices.add(HMDeviceSource.MILI_AMAZFIT);
            return proDevices;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return ReachGoalRemindActivity.this.getString(R.string.reach_goal_tips);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            ReachGoalRemindActivity.this.H.setEnabled(z);
            ReachGoalRemindActivity.this.I.setEnabled(z && ReachGoalRemindActivity.this.G.isGoalRemind());
        }
    }

    private void initView() {
        setSmartImageTopMargin(30.0f);
        setSmartImageView(R.drawable.img_remind_standard, 0);
        setStatusListener(this.M);
        ListTile listTile = (ListTile) findViewById(R.id.reach_goal);
        this.H = listTile;
        listTile.setChecked(this.G.isGoalRemind());
        this.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x66
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.y(compoundButton, z);
            }
        });
        if (HMDeviceConfig.hasBoundWatch()) {
            if (this.J.getValue().hasBound(HMDeviceSource.MILI_TOKYO)) {
                this.H.setSubtitle(R.string.reach_goal_subtitle_watch_beep);
            } else {
                this.H.setSubtitle(R.string.reach_goal_subtitle_watch);
            }
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.vibrate_mode_iv);
        this.I = listTile2;
        listTile2.setEnabled(this.G.isGoalRemind());
    }

    private void w(boolean z) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = this.J.getValue().getDevice(featureProDevice.getType());
        if (!(device instanceof HMMiLiProDevice)) {
            HMLog.error(N, new Function0() { // from class: y66
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ReachGoalRemindActivity.x();
                }
            });
            return;
        }
        boolean zIsHuamiOs = ((HMMiLiProDevice) device).isHuamiOs();
        if (featureProDevice == HMDeviceSource.VDEVICE || !device.isConnected()) {
            return;
        }
        if (!HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(9) && !zIsHuamiOs) {
            ((HMMiLiProDevice) device).enableGoalRemind(z, new b());
        } else {
            ((HMMiLiProDevice) device).setTargets(new HMTarget(z, Long.valueOf(this.L.getValue().getGoalStepValue()), Long.valueOf(this.L.getValue().getGoalCalorieValue()), Long.valueOf(UnitFunctionsKt.convertKgToBleUnit(HMPersonInfo.getInstance().getUserInfo().getTargetWeight())), Long.valueOf(this.L.getValue().getGoalSleepValue()), Long.valueOf(this.L.getValue().getStandValue()), Long.valueOf(this.L.getValue().getActivityValue())), new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "device mismatch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CompoundButton compoundButton, boolean z) {
        this.G.setGoalRemind(z);
        this.F.saveInfo(2);
        w(z);
        this.I.setEnabled(z);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.GOALS_REMIND_SWITCH).setValue(z ? "On" : "Off"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setSmartContent(R.layout.activity_reach_goal_remind);
        UIStandardUtilKt.setUnifyTitleStyle(this, getString(R.string.reach_goal));
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.F = hMPersonInfo;
        this.G = hMPersonInfo.getMiliConfig();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.GOALS_REMIND_VIEWNUM));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.K.getValue().updateProfile(false);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.I.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.GOALS_REMIND_VIEWNUM));
    }
}

package com.xiaomi.hm.health.activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.util.Consumer;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.activity.ChangeSportGoalActivity;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import com.xiaomi.hm.health.ui.goal.manager.ConnectManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class ChangeSportGoalActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String B = "ChangeSportGoalActivity";
    private static final int C = 1000;
    private View A;
    private HMPersonInfo x;
    private WheelView y;
    private LinearLayout z;

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(Boolean ret) {
            if (ret.booleanValue()) {
                return;
            }
            ChangeSportGoalActivity changeSportGoalActivity = ChangeSportGoalActivity.this;
            CustomToast.makeText(changeSportGoalActivity, changeSportGoalActivity.getString(R.string.bt_operation_failed_tips), 0).show();
        }
    }

    public class b extends HMCallback<Boolean> {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            if (result) {
                return;
            }
            ChangeSportGoalActivity changeSportGoalActivity = ChangeSportGoalActivity.this;
            CustomToast.makeText(changeSportGoalActivity, changeSportGoalActivity.getString(R.string.bt_operation_failed_tips), 0).show();
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
        }
    }

    private void n() {
        new ConnectManager(this, this.z, this.A).setupBtStatusFragment(R.id.container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "device mismatch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Boolean bool) {
        if (bool.booleanValue()) {
            Toast.makeText(this, getString(R.string.setting_success), 0).show();
        } else {
            Toast.makeText(this, getString(R.string.setting_fail), 0).show();
        }
    }

    private void q() {
        int goalStepsCount = this.x.getMiliConfig().getGoalStepsCount();
        int currentItem = (this.y.getCurrentItem() * 1000) + 2000;
        if (goalStepsCount == currentItem) {
            setResult(-1);
            finish();
            return;
        }
        this.x.getMiliConfig().setGoalStepsCount(currentItem);
        r(currentItem);
        s(currentItem);
        GoalFunctionsKt.postStepGoal(currentItem);
        finish();
    }

    private void r(int goalStepCount) {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (!hMDeviceManager.hasBound(hMDeviceType) || ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE)) {
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(hMDeviceType);
        if (!(device instanceof HMMiLiProDevice)) {
            HMLog.error(B, new Function0() { // from class: kn0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return ChangeSportGoalActivity.o();
                }
            });
            return;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        if (hMMiLiProDevice.isHuamiOs() || HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(9)) {
            hMMiLiProDevice.setStepTarget(HMPersonInfo.getInstance().getMiliConfig().isGoalRemind(), goalStepCount, new a());
        } else {
            ((HMMiLiDevice) device).setGoal(this.x.getMiliConfig().getGoalStepsCount(), new b());
        }
    }

    private void s(int goal) {
        if (HMDeviceManager.getInstance().hasBound(HMDeviceType.WATCH)) {
            SyncUtil.syncUserStepGoalToWatch(this, goal, new Consumer() { // from class: jn0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.a.p((Boolean) obj);
                }
            });
        }
    }

    private void t() {
        this.z = (LinearLayout) findViewById(R.id.personinfo_change_sport_goal_tip);
        WheelView wheelView = (WheelView) findViewById(R.id.person_info_goal_picker);
        this.y = wheelView;
        GoalFunctionsKt.setupWheelPicker(wheelView, 2, 30, 1000, R.string.step, false);
        TextView textView = (TextView) findViewById(R.id.bracelet_title_info);
        if (this.x.getUserInfo().getAge() < 5) {
            textView.setVisibility(4);
            if (this.x.getMiliConfig().getGoalStepsCount() <= 0) {
                this.x.getMiliConfig().setGoalStepsCount(6000);
            }
        } else if (this.x.getUserInfo().getAge() < 17) {
            textView.setVisibility(0);
            textView.setText(R.string.person_info_goal_info_young);
            if (this.x.getMiliConfig().getGoalStepsCount() <= 0) {
                this.x.getMiliConfig().setGoalStepsCount(12000);
            }
        } else {
            textView.setVisibility(0);
            textView.setText(R.string.person_info_goal_info);
            if (this.x.getMiliConfig().getGoalStepsCount() <= 0) {
                this.x.getMiliConfig().setGoalStepsCount(8000);
            }
        }
        this.y.setCurrentItem((this.x.getMiliConfig().getGoalStepsCount() - 2000) / 1000);
        ((TextView) findViewById(R.id.change_sport_goal_confirm)).setOnClickListener(this);
        this.A = findViewById(R.id.personinfo_change_sport_goal_mask);
        n();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v.getId() == R.id.change_sport_goal_confirm) {
            q();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_ATHLETIC_GOAL_SET));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_sport_goal_activity);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.set_step_goal));
        this.x = HMPersonInfo.getInstance();
        t();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}

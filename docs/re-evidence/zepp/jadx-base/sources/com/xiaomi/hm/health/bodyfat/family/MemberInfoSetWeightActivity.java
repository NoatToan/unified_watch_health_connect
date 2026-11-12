package com.xiaomi.hm.health.bodyfat.family;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.lib.view.progress.ProgressView;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.BFEventBluetooth;
import com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener;
import com.xiaomi.hm.health.bodyfat.fragment.SelectWeightFragment;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import de.greenrobot.event.EventBus;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MemberInfoSetWeightActivity extends BaseTitleActivity implements View.OnClickListener, IOnWeightSelectListener {
    private static final String M = "Weight-MemberInfoSetWeightActivity";
    private static final int N = 1;
    private static final int O = 16;
    private TextView A;
    private ImageView B;
    private TextView C;
    private String H;
    private int I;
    private TextView x;
    private TextView y;
    private ProgressView z = null;
    private boolean D = false;
    private Context E = this;
    private boolean F = false;
    private boolean G = false;
    private Handler J = new a();
    private float K = 0.0f;
    private List<Long> L = new ArrayList();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 16) {
                    MemberInfoSetWeightActivity.this.C.setText(R.string.weight_overload_title);
                    TextView textView = MemberInfoSetWeightActivity.this.A;
                    MemberInfoSetWeightActivity memberInfoSetWeightActivity = MemberInfoSetWeightActivity.this;
                    textView.setText(memberInfoSetWeightActivity.getString(R.string.over_max_range_weight_text, new Object[]{HMWeightUtils.getWeightMaxWithUnitText(memberInfoSetWeightActivity.I)}));
                    MemberInfoSetWeightActivity.this.A.setVisibility(0);
                    MemberInfoSetWeightActivity.this.x.setVisibility(8);
                    MemberInfoSetWeightActivity.this.y.setVisibility(8);
                    MemberInfoSetWeightActivity.this.B.setVisibility(0);
                    MemberInfoSetWeightActivity.this.B.setBackgroundResource(R.drawable.icon_weight_ol);
                    return;
                }
                return;
            }
            MemberInfoSetWeightActivity.this.w();
            if (MemberInfoSetWeightActivity.this.K == 0.0f) {
                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                numberInstance.setMinimumIntegerDigits(3);
                numberInstance.setMinimumFractionDigits(1);
                numberInstance.setMaximumFractionDigits(1);
                MemberInfoSetWeightActivity.this.x.setText(numberInstance.format(0.0d));
                MemberInfoSetWeightActivity.this.y.setVisibility(8);
            } else {
                MemberInfoSetWeightActivity.this.x.setText(String.valueOf(MemberInfoSetWeightActivity.this.K));
                MemberInfoSetWeightActivity.this.y.setVisibility(0);
                MemberInfoSetWeightActivity.this.y.setText(MemberInfoSetWeightActivity.this.H);
            }
            HMLog.d(MemberInfoSetWeightActivity.M, "mWeightValueText.setText " + MemberInfoSetWeightActivity.this.K, new Object[0]);
        }
    }

    private void A() {
        this.K = 0.0f;
        this.J.sendEmptyMessage(1);
    }

    private void findViews() {
        ProgressView progressView = (ProgressView) findViewById(R.id.weight_chart);
        this.z = progressView;
        progressView.startLoading();
        TextView textView = (TextView) findViewById(R.id.weight_value);
        this.x = textView;
        textView.setText(HMWeightUtils.getWeightValueStringForDisplay(0.0f, BFCallback.getUnitManager().getWeightUnit()));
        this.y = (TextView) findViewById(R.id.unit_tv);
        TextView textView2 = (TextView) findViewById(R.id.write_weight_tv);
        textView2.setOnClickListener(this);
        this.A = (TextView) findViewById(R.id.tips_tv);
        this.B = (ImageView) findViewById(R.id.iconImage);
        this.C = (TextView) findViewById(R.id.title_tv);
        w();
        if (BFCallback.getHMDeviceManager().hasBound(HMDeviceType.WEIGHT)) {
            return;
        }
        textView2.performClick();
    }

    private void v(WeightAdvData weightAdvData) {
        HMLog.d(M, "handleStableValue ... ", new Object[0]);
        long timestamp = weightAdvData.getTimestamp();
        if (this.L.contains(Long.valueOf(timestamp))) {
            HMLog.d(M, "timestamp is repeat ,return !", new Object[0]);
            return;
        }
        this.L.add(Long.valueOf(timestamp));
        if (WeightInfoManager.getManager().getInfo(weightAdvData.getTimestamp()) != null) {
            HMLog.d(M, "this stable data has existed in database , return !!!", new Object[0]);
            return;
        }
        this.G = true;
        HMLog.d(M, "after  weightinfo: " + weightAdvData.getValueKg(), new Object[0]);
        HMWeightUtils.clearFamilyKeeper();
        IconToast.showSuccess(this.E, getString(R.string.saving_success));
        Intent intent = new Intent();
        intent.putExtra(WeightAdvData.WEIGHTADVDATA_KEY, weightAdvData.toJsonString());
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.C.setText(R.string.please_stand_weight);
        this.A.setVisibility(8);
        this.x.setVisibility(0);
        this.y.setVisibility(0);
        this.B.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.z.stopLoading();
        this.C.setText(R.string.weight_low_elec_title);
        this.A.setText(R.string.add_family_weight_low_elect);
        this.A.setVisibility(0);
        this.x.setVisibility(8);
        this.y.setVisibility(8);
        this.B.setVisibility(0);
        this.B.setBackgroundResource(R.drawable.icon_low_power);
    }

    private void y(WeightAdvData weightAdvData) {
        HMLog.d(M, "是否是手动测量 = " + this.F, new Object[0]);
        this.z.startLoading();
        HMLog.d(M, "WeightAdvData data = " + weightAdvData.toString(), new Object[0]);
        weightAdvData.checkTimestamp();
        if (weightAdvData.isFinish()) {
            A();
            return;
        }
        if (weightAdvData.isStable()) {
            v(weightAdvData);
            return;
        }
        HMLog.i(M, "start handle not finish data , isFinish = " + weightAdvData.isFinish() + " , isStable = " + weightAdvData.isStable(), new Object[0]);
        boolean zIsOverload = weightAdvData.isOverload();
        this.K = weightAdvData.getValue();
        this.I = weightAdvData.getType();
        this.H = HMWeightUtils.toUnitStr(getApplicationContext(), weightAdvData.getType());
        if (this.F) {
            return;
        }
        if (!zIsOverload) {
            this.J.sendEmptyMessage(1);
        } else {
            this.J.sendEmptyMessage(16);
            this.z.stopLoading();
        }
    }

    private void z() {
        if (BFCallback.getInstance().isForeground()) {
            return;
        }
        BFCallback.getHMDeviceManager().destroyDevice(HMDeviceType.WEIGHT);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.write_weight_tv) {
            if (id == R.id.left_button) {
                HMLog.d(M, "click left btn", new Object[0]);
            }
        } else if (this.F || this.G) {
            HMLog.i(M, "repeat click or is WeightDone , return !", new Object[0]);
        } else {
            new SelectWeightFragment((FragmentActivity) this.E, 60.0f, this).showWeightSelectDialog();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.member_set_weight_layout);
        BFTitleStyleKt.setTitleStyle(this, "", null, BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(this.E, R.color.scale_measuring_bg_end_color), BFCallback.getInstance().enableMiDongFlavor());
        setTitleText("");
        findViews();
        EventBus.getDefault().register(this);
        BFCallback.getInstance().eventBusDevice(true);
        getWindow().addFlags(128);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.D = false;
        EventBus.getDefault().unregister(this);
        BFCallback.getInstance().eventBusDevice(true);
        z();
        getWindow().clearFlags(128);
    }

    public void onEventMainThread(BFDeviceWeightValueEvent bFDeviceWeightValueEvent) {
        HMLog.d(M, "onEvent WeightAdvData:" + bFDeviceWeightValueEvent, new Object[0]);
        if (bFDeviceWeightValueEvent.isBoundValue()) {
            HMLog.d(M, "onEvent data is bound, return!", new Object[0]);
            return;
        }
        if (this.G) {
            HMLog.d(M, "isWeightDone alreay , return !", new Object[0]);
            return;
        }
        if (this.D && !this.F) {
            y(bFDeviceWeightValueEvent.getWeightAdvData());
            return;
        }
        HMLog.d(M, "isManualSetWeight = " + this.F, new Object[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.D = true;
    }

    @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
    public void onWeightSelect(float f) {
        HMLog.d(M, "onWeightSelect " + f, new Object[0]);
        this.F = true;
        WeightAdvData weightAdvData = new WeightAdvData();
        weightAdvData.setValue(HMWeightUtils.convertFromKg(f, BFCallback.getUnitManager().getWeightUnit()));
        weightAdvData.setType(1);
        weightAdvData.setStable(true);
        weightAdvData.setFinish(false);
        weightAdvData.setTimestamp(System.currentTimeMillis());
        weightAdvData.setValueKg(f);
        weightAdvData.setImpedanceStable(false);
        weightAdvData.setImpedance(65533);
        String currentUserInfoByTag = BFKeeper.getCurrentUserInfoByTag(BFKeeper.CURRENT_USER_HEIGHT);
        weightAdvData.setBmi(HMWeightUtils.calcuBMI(!currentUserInfoByTag.isEmpty() ? Integer.parseInt(currentUserInfoByTag) : 100, f));
        v(weightAdvData);
    }

    @Override // com.xiaomi.hm.health.bodyfat.fragment.IOnWeightSelectListener
    public void onWeightSelectCancel() {
        HMLog.d(M, "onWeightSelectCancel", new Object[0]);
        this.F = false;
    }

    public void onEventMainThread(BFDeviceBatteryEvent bFDeviceBatteryEvent) {
        TextView textView;
        HMLog.d(M, "收到设备电量消息   " + bFDeviceBatteryEvent.getDeviceType() + " " + bFDeviceBatteryEvent.getBatteryInfo(), new Object[0]);
        if (bFDeviceBatteryEvent.getDeviceType() != HMDeviceType.WEIGHT || (textView = this.A) == null) {
            return;
        }
        textView.post(new Runnable() { // from class: sy4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x();
            }
        });
    }

    public void onEventMainThread(BFEventBluetooth bFEventBluetooth) {
        HMLog.d(M, "收到蓝牙连接状态信息 " + bFEventBluetooth.isOn + " , isWeightDone = " + this.G, new Object[0]);
        if (bFEventBluetooth.isOn || this.G || this.F) {
            return;
        }
        A();
    }
}

package com.huami.watch.companion.ui.activity;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.watch.companion.R;
import com.huami.watch.companion.arch.HeartRateSettingViewModel;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.ui.fragment.AfDisturbTimeSelectFragment;
import com.huami.watch.companion.ui.fragment.HeartRateMeasureModeFragment;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateSettingActivity extends BaseActivity {
    private Switch b;
    private Switch c;
    private Switch d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private View k;
    private View l;
    private DialogFragment m;
    private AfDisturbTimeSelectFragment n;
    private HeartRateSettingViewModel o;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(DialogInterface dialogInterface, int i) {
        this.o.updateIsAf(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(boolean z) {
        this.o.updateIsAllDay(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(DialogInterface dialogInterface, int i) {
        this.o.updateDisturbTime(this.n.getTime());
    }

    private void D() {
        this.o.isAfData.observe(this, new Observer() { // from class: mz3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.y((Boolean) obj);
            }
        });
        this.o.disturbData.observe(this, new Observer() { // from class: cz3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.z((String) obj);
            }
        });
        this.o.initAf();
    }

    private void E() {
        LoadingDialog.dismiss(this.m);
        this.m = AlertDialog.setTitle(getString(R.string.atrial_fibrillation_notice_title)).setMessage(getString(R.string.atrial_fibrillation_notice)).setCancelable(false).setNeutralBtn(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: bz3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.A(dialogInterface, i);
            }
        }).show(this, "Af Notice");
    }

    private void F() {
        HeartRateMeasureModeFragment heartRateMeasureModeFragment = new HeartRateMeasureModeFragment();
        heartRateMeasureModeFragment.setAllDataHeartRateEnable(HealthData.isAllDayHR(this));
        heartRateMeasureModeFragment.setOnMeasureResultListener(new HeartRateMeasureModeFragment.OnMeasureResultListener() { // from class: dz3
            @Override // com.huami.watch.companion.ui.fragment.HeartRateMeasureModeFragment.OnMeasureResultListener
            public final void onMeasureResult(boolean z) {
                this.a.B(z);
            }
        });
        heartRateMeasureModeFragment.show(getSupportFragmentManager());
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(getString(R.string.heart_rate_setting));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: fz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
        this.l = findViewById(R.id.view_allday_heart);
        this.k = findViewById(R.id.view_heart_measure_type);
        this.i = (TextView) findViewById(R.id.heart_measure_info);
        this.b = (Switch) findViewById(R.id.hr_switch);
        this.j = (TextView) findViewById(R.id.hr_switch_title);
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice != null) {
            if (DeviceSource.isSeriesEverest2(currentDevice)) {
                this.k.setVisibility(0);
                this.l.setVisibility(8);
            } else {
                this.k.setVisibility(8);
                this.l.setVisibility(0);
            }
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: iz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: jz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.v(view);
            }
        });
    }

    private String o() {
        String afDisturbTime = HealthData.getAfDisturbTime(this);
        return TextUtils.isEmpty(afDisturbTime) ? "21:30-07:00" : afDisturbTime;
    }

    private void p() {
        findViewById(R.id.af_content_view).setVisibility(0);
        this.c = (Switch) findViewById(R.id.af_switch);
        this.d = (Switch) findViewById(R.id.af_disturb);
        this.e = (TextView) findViewById(R.id.af_title);
        this.f = (TextView) findViewById(R.id.disturb_title);
        this.g = (TextView) findViewById(R.id.disturb_time);
        this.h = (TextView) findViewById(R.id.disturb_time_title);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: gz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: hz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
    }

    private void q() {
        HeartRateSettingViewModel heartRateSettingViewModel = (HeartRateSettingViewModel) ViewModelProviders.of(this).get(HeartRateSettingViewModel.class);
        this.o = heartRateSettingViewModel;
        heartRateSettingViewModel.isAllDayHrData.observe(this, new Observer() { // from class: lz3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.w((Boolean) obj);
            }
        });
        this.o.statusData.observe(this, new Observer() { // from class: kz3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x((Result) obj);
            }
        });
        this.o.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        if (this.c.isChecked()) {
            E();
        } else {
            this.o.updateIsAf(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        this.o.updateDisturbTime(this.d.isChecked() ? o() : "");
    }

    private void showLoadingDialog() {
        LoadingDialog.dismiss(this.m);
        this.m = LoadingDialog.setMessage(getString(R.string.setting_loading)).show(this, "Setting");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        this.o.updateIsAllDay(this.b.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.i.setText(bool.booleanValue() ? R.string.heart_measure_type_every_min : R.string.heart_measure_type_manual);
        this.b.setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Result result) {
        if (result == null) {
            return;
        }
        if (result.isLoading()) {
            showLoadingDialog();
        } else if (result.isSuccess()) {
            LoadingDialog.dismiss(this.m);
        } else {
            LoadingDialog.dismiss(this.m);
            Toast.makeText(this, getString(R.string.setting_fail), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.c.setChecked(bool.booleanValue());
        this.b.setEnabled(!bool.booleanValue());
        this.d.setEnabled(bool.booleanValue());
        this.f.setTextColor(Color.parseColor(bool.booleanValue() ? "#e6000000" : "#4c000000"));
        this.h.setTextColor(Color.parseColor(bool.booleanValue() ? "#e6000000" : "#4c000000"));
        this.j.setTextColor(Color.parseColor(bool.booleanValue() ? "#4c000000" : "#e6000000"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.g.setText(getString(R.string.atrial_fibrillation_disturb_none));
            this.d.setChecked(false);
        } else {
            this.g.setText(str);
            this.d.setChecked(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_setting);
        initView();
        q();
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null || !DeviceUtil.isSupportAtrialFibrillation(currentDevice)) {
            return;
        }
        p();
        D();
    }

    public void toSettingTime(View view) {
        if (!this.c.isChecked() || this.o.disturbData.getValue() == null) {
            return;
        }
        if (this.n == null) {
            this.n = new AfDisturbTimeSelectFragment();
        }
        LoadingDialog.dismiss(this.m);
        this.n.setDefaultTime(this.o.disturbData.getValue());
        this.m = AlertDialog.setTitle(getString(R.string.atrial_fibrillation_disturb_title)).setContent(this.n).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: ez3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.C(dialogInterface, i);
            }
        }).setNegativeBtn(getString(R.string.btn_cancel)).show(this, "Select Disturb Time");
    }
}

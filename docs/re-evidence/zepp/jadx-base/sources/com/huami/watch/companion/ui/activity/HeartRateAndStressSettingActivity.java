package com.huami.watch.companion.ui.activity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.watch.companion.R;
import com.huami.watch.companion.arch.HeartRateSettingViewModel;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.ui.fragment.HeartRateAndStressMeasureModeFragment;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.LoadingDialog;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateAndStressSettingActivity extends BaseActivity {
    private TextView b;
    private DialogFragment c;
    private HeartRateSettingViewModel d;

    private void i() {
        HeartRateSettingViewModel heartRateSettingViewModel = (HeartRateSettingViewModel) ViewModelProviders.of(this).get(HeartRateSettingViewModel.class);
        this.d = heartRateSettingViewModel;
        heartRateSettingViewModel.isAllDayHrData.observe(this, new Observer() { // from class: ky3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.l((Boolean) obj);
            }
        });
        this.d.isAllDayStressData.observe(this, new Observer() { // from class: ly3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.m((Boolean) obj);
            }
        });
        this.d.statusData.observe(this, new Observer() { // from class: jy3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n((Result) obj);
            }
        });
        this.d.loadIsAllDayHeartRateAndStress();
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(getString(R.string.heart_rate_setting));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: iy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        this.b = (TextView) findViewById(R.id.measure_mode);
        findViewById(R.id.layout_measure_mode).setOnClickListener(new View.OnClickListener() { // from class: hy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Boolean bool) {
        int i;
        TextView textView = this.b;
        if (bool.booleanValue() && HealthData.isAllDayStress(this)) {
            i = R.string.heartrate_measure_mode_allday_heart_and_pressure;
        } else {
            i = bool.booleanValue() ? R.string.heart_measure_type_every_min : R.string.heart_measure_type_manual;
        }
        textView.setText(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Boolean bool) {
        int i;
        TextView textView = this.b;
        if (bool.booleanValue() && HealthData.isAllDayHR(this)) {
            i = R.string.heartrate_measure_mode_allday_heart_and_pressure;
        } else {
            i = HealthData.isAllDayHR(this) ? R.string.heart_measure_type_every_min : R.string.heart_measure_type_manual;
        }
        textView.setText(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Result result) {
        if (result == null) {
            return;
        }
        if (result.isLoading()) {
            showLoadingDialog();
        } else if (result.isSuccess()) {
            LoadingDialog.dismiss(this.c);
        } else {
            LoadingDialog.dismiss(this.c);
            Toast.makeText(this, getString(R.string.setting_fail), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(boolean z, boolean z2) {
        this.d.updateIsAllDayHeartRateAndStress(z, z2);
    }

    private void p() {
        HeartRateAndStressMeasureModeFragment heartRateAndStressMeasureModeFragment = new HeartRateAndStressMeasureModeFragment();
        HeartRateSettingViewModel heartRateSettingViewModel = this.d;
        if (heartRateSettingViewModel != null && heartRateSettingViewModel.isAllDayHrData.getValue() != null && this.d.isAllDayStressData.getValue() != null) {
            heartRateAndStressMeasureModeFragment.setIsAllDay(this.d.isAllDayHrData.getValue().booleanValue(), this.d.isAllDayStressData.getValue().booleanValue());
        }
        heartRateAndStressMeasureModeFragment.setOnMeasureResultListener(new HeartRateAndStressMeasureModeFragment.OnMeasureResultListener() { // from class: my3
            @Override // com.huami.watch.companion.ui.fragment.HeartRateAndStressMeasureModeFragment.OnMeasureResultListener
            public final void onMeasureResult(boolean z, boolean z2) {
                this.a.o(z, z2);
            }
        });
        heartRateAndStressMeasureModeFragment.show(getSupportFragmentManager());
    }

    private void showLoadingDialog() {
        LoadingDialog.dismiss(this.c);
        this.c = LoadingDialog.setMessage(getString(R.string.setting_loading)).show(this, "StressSetting");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heartrate_and_stress_setting);
        initView();
        i();
    }
}

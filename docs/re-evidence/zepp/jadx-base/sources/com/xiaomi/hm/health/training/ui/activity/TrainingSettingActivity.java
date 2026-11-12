package com.xiaomi.hm.health.training.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingSettingActivity extends BaseTitleActivity {
    public static final int REQUEST_CODE = 1901;
    private View A;
    private TextView B;
    private TextView C;
    private TextView D;
    private int E;
    private ItemView x;
    private HeartRateSeekBar y;
    private View z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingSettingActivity.this.w();
        }
    }

    public class b implements ItemView.OnCheckedChangeListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.baseui.widget.ItemView.OnCheckedChangeListener
        public void onCheckedChanged(ItemView itemView, boolean z, boolean z2) {
            TrainingSettingActivity.this.y();
            TrainingConfig.setHrWarningEnbale(z);
            if (z) {
                TrainingAnalytics.event(TrainingSettingActivity.this.getApplicationContext(), TrainingAnalytics.EventId.SETTING_MAX_HEART_RATE, "Training");
            }
        }
    }

    public class c implements HeartRateSeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(HeartRateSeekBar heartRateSeekBar, float f) {
            int iR = TrainingSettingActivity.this.r(heartRateSeekBar, f);
            TrainingSettingActivity.this.z(iR);
            TrainingSettingActivity.this.B.setText(String.valueOf(iR));
            TrainingSettingActivity.this.A();
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HeartRateSeekBar heartRateSeekBar) {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HeartRateSeekBar heartRateSeekBar) {
            TrainingConfig.setMaxHeartRate(TrainingSettingActivity.this.r(heartRateSeekBar, heartRateSeekBar.getProgress()));
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TrainingSettingActivity.this.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        int i;
        float progress = this.y.getProgress() / this.y.getMax();
        int width = this.y.getWidth();
        int i2 = (int) (width * 1.0f * progress);
        int left = this.z.getLeft();
        int width2 = this.z.getWidth() / 2;
        if (i2 >= width2) {
            if (i2 > width - width2) {
                i = left + width;
                width2 *= 2;
            } else {
                i = left + i2;
            }
            left = i - width2;
        }
        this.z.setX(left);
    }

    private void findViews() {
        this.x = (ItemView) $(R.id.item_max_hr_warning);
        this.y = (HeartRateSeekBar) $(R.id.seek_bar_max_hr);
        this.z = $(R.id.hr_value_container);
        this.A = $(R.id.seek_bar_container);
        this.B = (TextView) $(R.id.hr_value);
        this.C = (TextView) $(R.id.hr_section);
        this.D = (TextView) $(R.id.hr_section_title);
    }

    private void initViews() {
        this.E = u();
        this.D.setText(getString(R.string.hr_range_format, new Object[]{""}));
        this.x.setTitleColor(ContextCompat.getColor(this, R.color.s1));
        this.x.setBackgroundColor(ContextCompat.getColor(this, R.color.s38));
        this.x.setupDividerColor(R.color.s4);
        this.x.setChecked(TrainingConfig.getHrWarningEnbale());
        this.x.getSummaryTv().setTextColor(ContextCompat.getColor(this, R.color.s2));
        this.x.setTitleTipIconClickListener(new a());
        this.x.setOnCheckedChangeListener(new b());
        this.y.setOnSeekBarChangeListener(new c());
        this.x.setChecked(TrainingConfig.getHrWarningEnbale());
        this.y.setMax(100.0f);
        HeartRateSeekBar heartRateSeekBar = this.y;
        heartRateSeekBar.setProgress(heartRateSeekBar.getMax() * v(t()));
        x();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r(HeartRateSeekBar heartRateSeekBar, float f) {
        float max = f / heartRateSeekBar.getMax();
        float fS = s();
        float f2 = 0.5f * fS;
        return (int) (f2 + ((fS - f2) * max));
    }

    private int s() {
        return 220 - this.E;
    }

    public static void startForResult(Activity activity) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) TrainingSettingActivity.class), REQUEST_CODE);
    }

    private int t() {
        int maxHeartRate = TrainingConfig.getMaxHeartRate();
        if (maxHeartRate > 0) {
            return maxHeartRate;
        }
        HeartRateSeekBar heartRateSeekBar = this.y;
        return r(heartRateSeekBar, heartRateSeekBar.getProgress());
    }

    private int u() {
        return TrainerInfo.get().age;
    }

    private float v(int i) {
        float fS = s();
        float f = 0.5f * fS;
        return (i - f) / (fS - f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        TrainingAnalytics.event(getApplicationContext(), TrainingAnalytics.EventId.SETTING_HEART_RATE_TIPS, "Training");
        startActivity(new Intent(this, (Class<?>) MaxHrRemindHelpActivity.class));
    }

    private void x() {
        this.y.post(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        boolean zIsChecked = this.x.isChecked();
        this.y.setEnabled(zIsChecked);
        this.A.setAlpha(zIsChecked ? 1.0f : 0.4f);
        if (zIsChecked) {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i) {
        int i2;
        int i3;
        int iS = s();
        float f = iS;
        float f2 = 0.6f * f;
        float f3 = 0.7f * f;
        float f4 = 0.8f * f;
        float f5 = f * 0.9f;
        float f6 = i;
        if (f6 >= f5 && i <= iS) {
            i2 = R.string.hr_section_anaerobic_limit;
            i3 = R.color.hr_tape_anaerobic_limit;
        } else if (f6 >= f4 && f6 < f5) {
            i2 = R.string.hr_section_stamina_strengthen;
            i3 = R.color.hr_tape_stamina_strength;
        } else if (f6 >= f3 && f6 < f4) {
            i2 = R.string.hr_section_heart_lung_strengthen;
            i3 = R.color.hr_tape_lung_strength;
        } else if (f6 < f2 || f6 >= f3) {
            i2 = R.string.hr_section_warm_up;
            i3 = R.color.hr_tape_warm_up;
        } else {
            i2 = R.string.hr_section_fat_burn;
            i3 = R.color.hr_tape_fat_burn;
        }
        int color = ContextCompat.getColor(this, i3);
        this.C.setText(getString(i2));
        this.C.setTextColor(color);
        this.B.setTextColor(color);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
        GlobalTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.hr_range_format), "");
        setContentView(R.layout.acitivity_training_setting);
        findViews();
        initViews();
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.SET_VIEW_NUM);
    }
}

package com.huami.assistant.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.arch.CustomScheduleRepeatViewModel;
import com.huami.assistant.calendar.RecurrenceModel;
import com.huami.assistant.ui.fragment.RepeatIntervalPickerFragment;
import com.huami.assistant.ui.fragment.RepeatTypePickerFragment;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;

/* JADX INFO: loaded from: classes5.dex */
public class CustomScheduleRepeatActivity extends BaseActivity {
    public static final int REQUEST_CODE = 2;
    private RepeatTypePickerFragment b;
    private RepeatIntervalPickerFragment c;
    private CustomScheduleRepeatViewModel d;
    private TextView e;
    private TextView f;
    private TextView g;
    private int h;

    private void g() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.custom_repeat_action_bar);
        actionbarLayout.setTitleText(getString(R.string.custom_repeat));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: k21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
    }

    public static void go(Activity activity, int frequency, int interval) {
        Intent intent = new Intent(activity, (Class<?>) CustomScheduleRepeatActivity.class);
        intent.putExtra("frequency", frequency);
        intent.putExtra("interval", interval);
        activity.startActivityForResult(intent, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(int i) {
        this.d.setInterval(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(int i) {
        this.d.setRepeatType(i);
    }

    private void initData() {
        this.d.initData(getIntent().getIntExtra("frequency", 0), getIntent().getIntExtra("interval", 1));
    }

    private void initView() {
        this.e = (TextView) findViewById(R.id.custom_repeat_info);
        this.f = (TextView) findViewById(R.id.custom_repeat_frequency);
        this.g = (TextView) findViewById(R.id.custom_repeat_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(RecurrenceModel recurrenceModel) {
        int i;
        int i2;
        if (recurrenceModel == null) {
            return;
        }
        int i3 = recurrenceModel.freq;
        if (i3 == 0) {
            i = R.string.repeat_every_day;
            i2 = R.plurals.daily_interval;
            this.h = R.string.schedule_day;
        } else if (i3 == 1) {
            i = R.string.repeat_every_week;
            i2 = R.plurals.weekly_interval;
            this.h = R.string.schedule_week;
        } else if (i3 != 2) {
            i = R.string.repeat_every_year;
            i2 = R.plurals.yearly_interval;
            this.h = R.string.schedule_year;
        } else {
            i = R.string.repeat_every_month;
            i2 = R.plurals.monthly_interval;
            this.h = R.string.schedule_month;
        }
        this.f.setText(i);
        String str = String.format(getResources().getQuantityString(i2, recurrenceModel.interval), Integer.valueOf(recurrenceModel.interval));
        this.e.setText(getString(R.string.custom_repeat_show_info, new Object[]{str}));
        this.g.setText(str);
    }

    private void l() {
        this.d.getModel().observe(this, new Observer() { // from class: l21
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k((RecurrenceModel) obj);
            }
        });
    }

    public void chooseRepeatInterval(View view) {
        if (this.d.getModel().getValue() == null) {
            return;
        }
        if (this.c == null) {
            this.c = new RepeatIntervalPickerFragment();
        }
        this.c.show(this, this.d.getModel().getValue().interval, this.h, new RepeatIntervalPickerFragment.IntervalSelectListener() { // from class: m21
            @Override // com.huami.assistant.ui.fragment.RepeatIntervalPickerFragment.IntervalSelectListener
            public final void onIntervalSelect(int i) {
                this.a.h(i);
            }
        });
    }

    public void chooseRepeatType(View view) {
        if (this.d.getModel().getValue() == null) {
            return;
        }
        if (this.b == null) {
            this.b = new RepeatTypePickerFragment();
        }
        this.b.show(this, this.d.getModel().getValue().freq, new RepeatTypePickerFragment.RepeatTypeListener() { // from class: n21
            @Override // com.huami.assistant.ui.fragment.RepeatTypePickerFragment.RepeatTypeListener
            public final void onRepeatTypeSelect(int i) {
                this.a.i(i);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        RecurrenceModel value = this.d.getModel().getValue();
        intent.putExtra("frequency", value == null ? 0 : value.freq);
        intent.putExtra("interval", value == null ? 1 : value.interval);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_schedule_repeat);
        this.d = (CustomScheduleRepeatViewModel) ViewModelProviders.of(this).get(CustomScheduleRepeatViewModel.class);
        g();
        initView();
        initData();
        l();
    }
}

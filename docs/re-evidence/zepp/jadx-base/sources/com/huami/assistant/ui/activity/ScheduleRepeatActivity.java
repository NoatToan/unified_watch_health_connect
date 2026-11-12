package com.huami.assistant.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.arch.ScheduleRepeatViewModel;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.model.bean.EventRepeatType;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleRepeatActivity extends BaseActivity {
    public static final int REQUEST_CODE = 1;
    private ScheduleRepeatViewModel b;
    private RadioButton c;
    private RadioButton d;
    private RadioButton e;
    private RadioButton f;
    private RadioButton g;
    private RadioButton h;
    private RadioButton i;

    private void e() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.edit_repeat_actionbar);
        actionbarLayout.setTitleText(getString(R.string.set_repeat));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: xi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(EventRepeatType eventRepeatType) {
        if (eventRepeatType == null) {
            return;
        }
        this.c.setChecked(eventRepeatType == EventRepeatType.NEVER);
        this.d.setChecked(eventRepeatType == EventRepeatType.EVERY_DAY);
        this.e.setChecked(eventRepeatType == EventRepeatType.WORKDAY);
        this.f.setChecked(eventRepeatType == EventRepeatType.EVERY_WEEK);
        this.g.setChecked(eventRepeatType == EventRepeatType.EVERY_TWO_WEEK);
        this.h.setChecked(eventRepeatType == EventRepeatType.EVERY_MONTH);
        this.i.setChecked(eventRepeatType == EventRepeatType.EVERY_YEAR);
    }

    public static void go(Activity activity, long startTime, String rrule) {
        Intent intent = new Intent(activity, (Class<?>) ScheduleRepeatActivity.class);
        intent.putExtra("startTime", startTime);
        intent.putExtra("rrule", rrule);
        activity.startActivityForResult(intent, 1);
    }

    private void h() {
        this.b.repeatType.observe(this, new Observer() { // from class: yi6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.g((EventRepeatType) obj);
            }
        });
    }

    private void initData() {
        Intent intent = getIntent();
        this.b.setStartTime(intent.getLongExtra("startTime", System.currentTimeMillis()));
        this.b.setRrule(intent.getStringExtra("rrule"));
    }

    private void initView() {
        this.c = (RadioButton) findViewById(R.id.repeat_never_check);
        this.d = (RadioButton) findViewById(R.id.repeat_every_day_check);
        this.e = (RadioButton) findViewById(R.id.repeat_every_work_day_check);
        this.f = (RadioButton) findViewById(R.id.repeat_every_week_check);
        this.g = (RadioButton) findViewById(R.id.repeat_every_two_week_check);
        this.h = (RadioButton) findViewById(R.id.repeat_every_month_check);
        this.i = (RadioButton) findViewById(R.id.repeat_every_year_check);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        EventRecurrence value = this.b.eventRecu.getValue();
        intent.putExtra("rrule", value == null ? "" : value.toString());
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_repeat);
        this.b = (ScheduleRepeatViewModel) ViewModelProviders.of(this).get(ScheduleRepeatViewModel.class);
        e();
        initView();
        initData();
        h();
    }

    public void onSelectRepeat(View view) {
        int id = view.getId();
        if (R.id.repeat_never == id) {
            this.b.generateRrule(EventRepeatType.NEVER);
            return;
        }
        if (R.id.repeat_every_day == id) {
            this.b.generateRrule(EventRepeatType.EVERY_DAY);
            return;
        }
        if (R.id.repeat_every_work_day == id) {
            this.b.generateRrule(EventRepeatType.WORKDAY);
            return;
        }
        if (R.id.repeat_every_week == id) {
            this.b.generateRrule(EventRepeatType.EVERY_WEEK);
            return;
        }
        if (R.id.repeat_every_two_week == id) {
            this.b.generateRrule(EventRepeatType.EVERY_TWO_WEEK);
            return;
        }
        if (R.id.repeat_every_month == id) {
            this.b.generateRrule(EventRepeatType.EVERY_MONTH);
        } else if (R.id.repeat_every_year == id) {
            this.b.generateRrule(EventRepeatType.EVERY_YEAR);
        } else {
            CustomScheduleRepeatActivity.go(this, 0, 1);
        }
    }
}

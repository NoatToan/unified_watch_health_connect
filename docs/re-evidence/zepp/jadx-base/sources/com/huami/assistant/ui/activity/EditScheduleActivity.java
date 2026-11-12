package com.huami.assistant.ui.activity;

import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.arch.EditScheduleViewModel;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventDao;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.PinDataHelper;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.EventRepeatType;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.fragment.ReminderMinutePickerFragment;
import com.huami.assistant.ui.fragment.ScheduleTimePickerFragment;
import com.huami.assistant.util.EventUtils;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.LiveEditText;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public class EditScheduleActivity extends BaseActivity {
    private LiveEditText b;
    private LiveEditText c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private View j;
    private View k;
    private Switch l;
    private ScheduleTimePickerFragment m;
    private ScheduleTimePickerFragment n;
    private ReminderMinutePickerFragment o;
    private EditScheduleViewModel p;
    private DialogFragment q;
    private Update r;
    private DialogFragment s;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(DialogInterface dialogInterface, int i) {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(long j) {
        this.p.setEndTime(this.n.getSelectTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(int i) {
        this.p.setReminderMin(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(long j) {
        this.p.setStartTime(this.m.getSelectTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Event event, ObservableEmitter observableEmitter) throws Exception {
        Update update = this.r;
        if (update != null) {
            event.syncId = update.syncId;
        } else {
            event.syncId = String.valueOf(System.currentTimeMillis());
        }
        ActionResult actionResultAddEvent = ExchangeCenter.addEvent(event);
        if (actionResultAddEvent.isSuccess()) {
            H(event);
        }
        observableEmitter.onNext(Boolean.valueOf(actionResultAddEvent.isSuccess()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Event event, Boolean bool) throws Exception {
        dismissDialog();
        if (!bool.booleanValue()) {
            Toast.makeText(getApplicationContext(), R.string.save_failed, 0).show();
            return;
        }
        EventDao.deleteEventBySyncId(getApplicationContext(), event.syncId);
        EventDao.insertEvent(getApplicationContext(), event, true);
        Toast.makeText(getApplicationContext(), R.string.save_success, 0).show();
        RxBus.get().postMainThread(new UpdateRefreshEvent(2));
        Analytics.event(this, AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_SCHEDULE);
        finish();
    }

    private void G() {
        this.p.getEvent().observe(this, new Observer() { // from class: hj1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.z((Event) obj);
            }
        });
    }

    private void H(@NonNull Event event) {
        Update updateBuild = UpdateBuilder.build(event, this.r);
        UpdatesManager.getManager().save(updateBuild);
        new PinDataHelper(this).updatePin(updateBuild);
    }

    private void dismissDialog() {
        LoadingDialog.dismiss(this.s);
    }

    private void init() {
        long longExtra = getIntent().getLongExtra("UpdateId", -1L);
        if (longExtra > -1) {
            Update update = UpdatesManager.getManager().get(longExtra);
            this.r = update;
            Event event = UpdateParser.toEvent(update.data);
            if (event != null) {
                this.p.setEvent(event);
                this.b.setText(event.title);
                this.b.setSelection(TextUtils.isEmpty(event.title) ? 0 : event.title.length());
                this.c.setText(event.description);
                this.c.setSelection(TextUtils.isEmpty(event.description) ? 0 : event.description.length());
            }
        }
        t();
        this.p.bindTitle(this.b.getLiveText());
        this.p.bindDesc(this.c.getLiveText());
    }

    private void initView() {
        this.b = (LiveEditText) findViewById(R.id.et_schedule_title);
        this.c = (LiveEditText) findViewById(R.id.reminder_desc);
        this.d = (TextView) findViewById(R.id.tv_schedule_start);
        this.e = (TextView) findViewById(R.id.tv_schedule_end);
        this.g = (TextView) findViewById(R.id.tv_schedule_reminder_type);
        this.f = (TextView) findViewById(R.id.tv_schedule_reminder_min);
        this.h = (ImageView) findViewById(R.id.reminder_repeat_arrow);
        this.j = findViewById(R.id.view_reminder_repeat);
        this.i = (ImageView) findViewById(R.id.reminder_remind_arrow);
        this.k = findViewById(R.id.view_reminder_minute);
        Switch r0 = (Switch) findViewById(R.id.reminder_all_day);
        this.l = r0;
        r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gj1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.y(compoundButton, z);
            }
        });
    }

    private void m() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || getCurrentFocus() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    private EventRecurrence n(String rrule, long startTime) {
        if (TextUtils.isEmpty(rrule)) {
            return null;
        }
        Time time = new Time();
        time.set(startTime);
        EventRecurrence eventRecurrence = new EventRecurrence();
        eventRecurrence.parse(rrule);
        eventRecurrence.setStartDate(time);
        return eventRecurrence;
    }

    private String o(String rrule, long startTime) {
        return EventUtils.getRepeatString(this, getResources(), n(rrule, startTime), true);
    }

    private int p(boolean isAllDay) {
        return isAllDay ? 20 : 149;
    }

    private void q(int mode) {
        if (this.n == null) {
            this.n = new ScheduleTimePickerFragment();
        }
        this.n.setMode(mode);
    }

    private void r(int minute, long baseTime) {
        if (this.o == null) {
            this.o = new ReminderMinutePickerFragment();
        }
        this.o.setData(this, minute, baseTime);
    }

    private void s(int mode) {
        if (this.m == null) {
            this.m = new ScheduleTimePickerFragment();
        }
        this.m.setMode(mode);
    }

    private void save() {
        final Event value = this.p.getEvent().getValue();
        if (value == null || TextUtils.isEmpty(value.title) || TextUtils.isEmpty(value.title.trim())) {
            Toast.makeText(this, R.string.input_title_msg, 0).show();
            return;
        }
        showLoadingDialog();
        value.title = value.title.trim();
        if (!TextUtils.isEmpty(value.description)) {
            value.description = value.description.trim();
        }
        Rx.io(new ObservableOnSubscribe() { // from class: lj1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.E(value, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: mj1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.F(value, (Boolean) obj);
            }
        });
    }

    private void showLoadingDialog() {
        dismissDialog();
        this.s = new LoadingDialog.Builder().setMessage(getString(R.string.saving)).show(this, "loading");
    }

    private void t() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(getString(this.r == null ? R.string.add_schedule : R.string.edit_schedule));
        actionbarLayout.disableBackArrow();
        actionbarLayout.setBackText(getString(R.string.cancel));
        actionbarLayout.setBackTextClickListener(new View.OnClickListener() { // from class: ej1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.confirm));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: fj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.x(view);
            }
        });
    }

    public static void to(Context context) {
        context.startActivity(new Intent(context, (Class<?>) EditScheduleActivity.class));
    }

    private boolean u(boolean allDay, int reminderMinute) {
        for (int i : getResources().getIntArray(allDay ? R.array.allday_reminder_minute : R.array.reminder_minute)) {
            if (i == reminderMinute) {
                return true;
            }
        }
        return false;
    }

    private boolean v(String rrule, long startTime) {
        return EventRepeatType.CUSTOM != EventUtils.getRepeatType(n(rrule, startTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        m();
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(View view) {
        save();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(CompoundButton compoundButton, boolean z) {
        this.p.setAllDay(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Event event) {
        if (event == null) {
            return;
        }
        boolean zIsChecked = this.l.isChecked();
        boolean z = event.allDay;
        if (zIsChecked != z) {
            this.l.setChecked(z);
        }
        boolean z2 = event.allDay;
        long j = z2 ? event.endMillis - 86400000 : event.endMillis;
        this.d.setText(DateUtils.formatDateTime(this, event.startMillis, p(z2)));
        this.e.setText(DateUtils.formatDateTime(this, j, p(event.allDay)));
        s(event.allDay ? 1 : 0);
        q(event.allDay ? 1 : 0);
        r(event.reminderMinutes, event.allDay ? event.startMillis : 0L);
        String strO = o(event.rrule, event.startMillis);
        if (v(event.rrule, event.startMillis)) {
            this.h.setVisibility(0);
            this.j.setClickable(true);
            this.g.setText(strO);
        } else {
            this.h.setVisibility(8);
            this.j.setClickable(false);
            this.g.setText(getString(R.string.event_not_editable, new Object[]{strO}));
        }
        String reminderMinute = EventUtils.formatReminderMinute(this, event.reminderMinutes, event.allDay ? event.startMillis : 0L);
        if (u(event.allDay, event.reminderMinutes)) {
            this.i.setVisibility(0);
            this.k.setClickable(true);
            this.f.setText(reminderMinute);
        } else {
            this.i.setVisibility(8);
            this.k.setClickable(false);
            this.f.setText(getString(R.string.event_not_editable, new Object[]{reminderMinute}));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            this.p.setRrule(data.getStringExtra("rrule"));
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.p.hasChange()) {
            super.onBackPressed();
        } else {
            LoadingDialog.dismiss(this.q);
            this.q = AlertDialog.setTitle("").setMessage(getString(R.string.cancel_edit_schedule_toast)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: dj1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.A(dialogInterface, i);
                }
            }).show(this, "schedule warn");
        }
    }

    public void onClickScheduleEndTime(View view) {
        m();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.p.getEvent().getValue() != null) {
            Event value = this.p.getEvent().getValue();
            jCurrentTimeMillis = value.allDay ? value.endMillis - 86400000 : value.endMillis;
        }
        this.n.show(this, getString(R.string.end_time), jCurrentTimeMillis, new ScheduleTimePickerFragment.TimeSelectListener() { // from class: kj1
            @Override // com.huami.assistant.ui.fragment.ScheduleTimePickerFragment.TimeSelectListener
            public final void onTimeSelect(long j) {
                this.a.B(j);
            }
        }, "end time");
    }

    public void onClickScheduleReminderMinutes(View view) {
        m();
        this.o.show(this, getString(R.string.remind), new ReminderMinutePickerFragment.MinuteSelectListener() { // from class: ij1
            @Override // com.huami.assistant.ui.fragment.ReminderMinutePickerFragment.MinuteSelectListener
            public final void onItemSelect(int i) {
                this.a.C(i);
            }
        }, "reminder time");
    }

    public void onClickScheduleReminderType(View view) {
        Event value = this.p.getEvent().getValue();
        if (value != null) {
            ScheduleRepeatActivity.go(this, value.startMillis, value.rrule);
        }
    }

    public void onClickScheduleStartTime(View view) {
        m();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.p.getEvent().getValue() != null) {
            jCurrentTimeMillis = this.p.getEvent().getValue().startMillis;
        }
        this.m.show(this, getString(R.string.start_time), jCurrentTimeMillis, new ScheduleTimePickerFragment.TimeSelectListener() { // from class: jj1
            @Override // com.huami.assistant.ui.fragment.ScheduleTimePickerFragment.TimeSelectListener
            public final void onTimeSelect(long j) {
                this.a.D(j);
            }
        }, "start time");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_schedule);
        this.p = (EditScheduleViewModel) ViewModelProviders.of(this).get(EditScheduleViewModel.class);
        initView();
        init();
        G();
    }

    public static void to(Context context, @NonNull Update event) {
        Intent intent = new Intent(context, (Class<?>) EditScheduleActivity.class);
        intent.putExtra("UpdateId", event.getId());
        context.startActivity(intent);
    }
}

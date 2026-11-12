package com.huami.assistant.ui.schedule.activity;

import android.app.Activity;
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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.arch.ScheduleRepeatViewModel;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.model.bean.EventRepeatType;
import com.huami.assistant.model.bean.Update;
import com.huami.assistant.ui.schedule.activity.ScheduleEditActivity;
import com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment;
import com.huami.assistant.ui.schedule.fragment.CalendarTimePickerFragment;
import com.huami.assistant.ui.schedule.fragment.EditRepeatEventOptionFragment;
import com.huami.assistant.ui.schedule.fragment.ReminderMinutePickerFragment;
import com.huami.assistant.ui.schedule.split.EventSplit;
import com.huami.assistant.ui.schedule.viewmodel.ScheduleEditViewModel;
import com.huami.assistant.ui.v2.model.ScheduleEditType;
import com.huami.assistant.util.EventUtils;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleEditActivity extends BaseActivity {
    private LiveEditText b;
    private LiveEditText c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private View j;
    private View k;
    private Switch l;
    private CalendarPickerFragment m;
    private CalendarPickerFragment n;
    private ReminderMinutePickerFragment o;
    private ScheduleEditViewModel p;
    private ScheduleRepeatViewModel q;
    private DialogFragment r;
    private Update s;
    private long t;
    private DialogFragment u;

    public class a implements CalendarPickerFragment.OnTimeSelectListener {
        public a() {
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeClick() {
            ScheduleEditActivity scheduleEditActivity = ScheduleEditActivity.this;
            scheduleEditActivity.W(scheduleEditActivity, scheduleEditActivity.m, ScheduleEditActivity.this.getString(R.string.start_time), "Picker-StartTime");
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeSelect(long time, boolean changed) {
            if (changed) {
                ScheduleEditActivity.this.p.setStartTime(time);
            }
        }
    }

    public class b implements CalendarPickerFragment.OnTimeSelectListener {
        public final /* synthetic */ CalendarPickerFragment a;
        public final /* synthetic */ Activity b;

        public b(final CalendarPickerFragment val$calendarPicker, final Activity val$activity) {
            this.a = val$calendarPicker;
            this.b = val$activity;
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeClick() {
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeSelect(long time, boolean changed) {
            if (changed) {
                this.a.setCurrentTime(time);
            }
            this.a.show(this.b);
        }
    }

    public class c implements CalendarPickerFragment.OnTimeSelectListener {
        public c() {
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeClick() {
            ScheduleEditActivity scheduleEditActivity = ScheduleEditActivity.this;
            scheduleEditActivity.W(scheduleEditActivity, scheduleEditActivity.n, ScheduleEditActivity.this.getString(R.string.end_time), "Picker-EndTime");
        }

        @Override // com.huami.assistant.ui.schedule.fragment.CalendarPickerFragment.OnTimeSelectListener
        public void onTimeSelect(long time, boolean changed) {
            if (changed) {
                ScheduleEditActivity.this.p.setEndTime(time);
            }
        }
    }

    private void A(int mode) {
        if (this.m == null) {
            this.m = new CalendarPickerFragment();
        }
        this.m.setMode(mode);
    }

    private void B() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(getString(this.s == null ? R.string.add_schedule : R.string.edit_schedule));
        actionbarLayout.disableBackArrow();
        actionbarLayout.setBackText(getString(R.string.cancel));
        actionbarLayout.setBackTextClickListener(new View.OnClickListener() { // from class: ai6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.confirm));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: zh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
    }

    private boolean C() {
        Event event;
        String str;
        Update update = this.s;
        return (update == null || (str = (event = UpdateParser.toEvent(update.data)).rrule) == null || str.equals("") || event.rrule.equals("null")) ? false : true;
    }

    private boolean D(boolean allDay, int reminderMinute) {
        for (int i : getResources().getIntArray(allDay ? R.array.allday_reminder_minute : R.array.reminder_minute)) {
            if (i == reminderMinute) {
                return true;
            }
        }
        return false;
    }

    private boolean E(String rrule, long startTime) {
        return EventRepeatType.CUSTOM != EventUtils.getRepeatType(v(rrule, startTime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(boolean z, int i, Update update, ObservableEmitter observableEmitter) throws Exception {
        boolean zIsSuccess = true;
        if (!z && i != 2) {
            zIsSuccess = ExchangeCenter.deleteEvent(update.syncId).isSuccess();
        } else if (i == 0) {
            for (Event event : EventSplit.INSTANCE.splitCurrent(this.s, this.t)) {
                if (zIsSuccess) {
                    zIsSuccess = ExchangeCenter.addEvent(event).isSuccess();
                }
            }
        } else if (i == 1) {
            Event eventSplitFuture = EventSplit.INSTANCE.splitFuture(this.s, this.t);
            zIsSuccess = eventSplitFuture == null ? ExchangeCenter.deleteEvent(update.syncId).isSuccess() : ExchangeCenter.addEvent(eventSplitFuture).isSuccess();
        }
        observableEmitter.onNext(Boolean.valueOf(zIsSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Boolean bool) throws Exception {
        dismissDialog();
        if (!bool.booleanValue()) {
            Toast.makeText(getApplicationContext(), R.string.save_failed, 0).show();
        } else {
            RxBus.get().postMainThread(new UpdateRefreshEvent(2));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        t();
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(CompoundButton compoundButton, boolean z) {
        this.p.setAllDay(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Event event) {
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
        this.d.setText(DateUtils.formatDateTime(this, event.startMillis, x(z2)));
        this.e.setText(DateUtils.formatDateTime(this, j, x(event.allDay)));
        A(event.allDay ? 1 : 0);
        y(event.allDay ? 1 : 0);
        z(event.reminderMinutes, event.allDay ? event.startMillis : 0L);
        String strW = w(event.rrule, event.startMillis);
        this.h.setVisibility(0);
        this.j.setClickable(true);
        this.g.setText(strW);
        String reminderMinute = EventUtils.formatReminderMinute(this, event.reminderMinutes, event.allDay ? event.startMillis : 0L);
        if (D(event.allDay, event.reminderMinutes)) {
            this.i.setVisibility(0);
            this.k.setClickable(true);
            this.f.setText(reminderMinute);
        } else {
            this.i.setVisibility(8);
            this.k.setClickable(false);
            this.f.setText(getString(R.string.event_not_editable, new Object[]{reminderMinute}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(EventRecurrence eventRecurrence) {
        this.p.setRrule(eventRecurrence == null ? "" : eventRecurrence.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(DialogInterface dialogInterface, int i) {
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(int i) {
        this.p.setReminderMin(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Event event, boolean z, int i, ObservableEmitter observableEmitter) throws Exception {
        ActionResult actionResultAddEvent;
        Update update = this.s;
        if (update != null) {
            event.syncId = update.syncId;
        } else {
            long jCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            event.id = jCurrentTimeMillis;
            event.syncId = String.valueOf(jCurrentTimeMillis);
        }
        ActionResult actionResultAddEvent2 = null;
        if (!z || i == 2) {
            actionResultAddEvent = ExchangeCenter.addEvent(event);
        } else if (i == 0) {
            for (Event event2 : EventSplit.INSTANCE.splitCurrent(this.s, this.t)) {
                if (actionResultAddEvent2 == null || actionResultAddEvent2.isSuccess()) {
                    actionResultAddEvent2 = ExchangeCenter.addEvent(event2);
                }
            }
            long jCurrentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
            event.id = jCurrentTimeMillis2;
            event.syncId = String.valueOf(jCurrentTimeMillis2);
            actionResultAddEvent = ExchangeCenter.addEvent(event);
        } else {
            if (EventSplit.INSTANCE.splitFuture(this.s, this.t) != null) {
                actionResultAddEvent2 = ExchangeCenter.addEvent(event);
            } else {
                long jCurrentTimeMillis3 = (int) (System.currentTimeMillis() / 1000);
                event.id = jCurrentTimeMillis3;
                event.syncId = String.valueOf(jCurrentTimeMillis3);
            }
            actionResultAddEvent = (actionResultAddEvent2 == null || actionResultAddEvent2.isSuccess()) ? ExchangeCenter.addEvent(event) : actionResultAddEvent2;
        }
        observableEmitter.onNext(Boolean.valueOf(actionResultAddEvent.isSuccess()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Boolean bool) throws Exception {
        dismissDialog();
        if (!bool.booleanValue()) {
            Toast.makeText(getApplicationContext(), R.string.save_failed, 0).show();
            return;
        }
        Toast.makeText(getApplicationContext(), R.string.save_success, 0).show();
        RxBus.get().postMainThread(new UpdateRefreshEvent(2));
        Analytics.event(this, AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_SCHEDULE);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Update update, DialogInterface dialogInterface, int i) {
        u(update, false, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit R(ScheduleEditType scheduleEditType) {
        return null;
    }

    private void S() {
        this.p.getEvent().observe(this, new Observer() { // from class: ci6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.K((Event) obj);
            }
        });
        this.q.eventRecu.observe(this, new Observer() { // from class: di6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.L((EventRecurrence) obj);
            }
        });
    }

    private void T(final boolean isSplit, final int position) {
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
        Rx.io(new ObservableOnSubscribe() { // from class: fi6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.O(value, isSplit, position, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: vh6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.P((Boolean) obj);
            }
        });
    }

    private DialogFragment U(@NonNull Activity activity, final Update update) {
        return AlertDialog.setMessage(getString(R.string.delete_update_confirm)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: yh6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Q(update, dialogInterface, i);
            }
        }).show(activity, "delete update confirm");
    }

    private void V() {
        if (C()) {
            EditRepeatEventOptionFragment.INSTANCE.show(this, false, new Function1() { // from class: xh6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ScheduleEditActivity.R((ScheduleEditType) obj);
                }
            });
        } else {
            T(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Activity activity, CalendarPickerFragment calendarPicker, String title, String tag) {
        calendarPicker.dismiss();
        CalendarTimePickerFragment calendarTimePickerFragment = new CalendarTimePickerFragment();
        calendarTimePickerFragment.setMode(2);
        calendarTimePickerFragment.show(activity, title, calendarPicker.getSelectTime(), new b(calendarPicker, activity), tag);
    }

    private void dismissDialog() {
        LoadingDialog.dismiss(this.u);
    }

    private void init() {
        long longExtra = getIntent().getLongExtra("UpdateId", -1L);
        if (longExtra > -1) {
            this.s = UpdatesManager.getManager().get(longExtra);
            this.t = getIntent().getLongExtra("startTime", 0L);
            Event event = UpdateParser.toEvent(this.s.data);
            if (event != null) {
                this.p.setEvent(event);
                this.b.setText(event.title);
                this.b.setSelection(TextUtils.isEmpty(event.title) ? 0 : event.title.length());
                this.c.setText(event.description);
                this.c.setSelection(TextUtils.isEmpty(event.description) ? 0 : event.description.length());
            }
        }
        B();
        if (this.s == null) {
            findViewById(R.id.schedule_delete).setVisibility(8);
        }
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
        this.h = findViewById(R.id.reminder_repeat_arrow);
        this.j = findViewById(R.id.view_reminder_repeat);
        this.i = findViewById(R.id.reminder_remind_arrow);
        this.k = findViewById(R.id.view_reminder_minute);
        Switch r0 = (Switch) findViewById(R.id.reminder_all_day);
        this.l = r0;
        r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bi6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.J(compoundButton, z);
            }
        });
    }

    private void showLoadingDialog() {
        dismissDialog();
        this.u = new LoadingDialog.Builder().setMessage(getString(R.string.saving)).show(this, "loading");
    }

    private void t() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || getCurrentFocus() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    public static void to(Context context) {
        context.startActivity(new Intent(context, (Class<?>) ScheduleEditActivity.class));
    }

    private void u(final Update update, final boolean isSplit, final int position) {
        showLoadingDialog();
        Rx.io(new ObservableOnSubscribe() { // from class: gi6
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.F(isSplit, position, update, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: wh6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.G((Boolean) obj);
            }
        });
    }

    private EventRecurrence v(String rrule, long startTime) {
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

    private String w(String rrule, long startTime) {
        return EventUtils.getRepeatString(this, getResources(), v(rrule, startTime), true);
    }

    private int x(boolean isAllDay) {
        return isAllDay ? 20 : 149;
    }

    private void y(int mode) {
        if (this.n == null) {
            this.n = new CalendarPickerFragment();
        }
        this.n.setMode(mode);
    }

    private void z(int minute, long baseTime) {
        if (this.o == null) {
            this.o = new ReminderMinutePickerFragment();
        }
        this.o.setData(this, minute, baseTime);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.p.hasChange()) {
            super.onBackPressed();
        } else {
            LoadingDialog.dismiss(this.r);
            this.r = AlertDialog.setTitle("").setMessage(getString(R.string.cancel_edit_schedule_toast)).setNegativeBtn(getString(R.string.cancel)).setPositiveBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: uh6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.M(dialogInterface, i);
                }
            }).show(this, "schedule warn");
        }
    }

    public void onClickScheduleDelete(View v) {
        if (C()) {
            return;
        }
        this.r = U(this, this.s);
    }

    public void onClickScheduleEndTime(View view) {
        t();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.p.getEvent().getValue() != null) {
            Event value = this.p.getEvent().getValue();
            jCurrentTimeMillis = value.allDay ? value.endMillis - 86400000 : value.endMillis;
        }
        this.n.show(this, jCurrentTimeMillis, new c(), "Picker-EndDate");
    }

    public void onClickScheduleReminderMinutes(View view) {
        t();
        this.o.show(this, getString(R.string.remind), new ReminderMinutePickerFragment.MinuteSelectListener() { // from class: ei6
            @Override // com.huami.assistant.ui.schedule.fragment.ReminderMinutePickerFragment.MinuteSelectListener
            public final void onItemSelect(int i) {
                this.a.N(i);
            }
        }, "reminder time");
    }

    public void onClickScheduleRepeat(View view) {
        t();
        this.p.getEvent().getValue();
    }

    public void onClickScheduleStartTime(View view) {
        t();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.p.getEvent().getValue() != null) {
            jCurrentTimeMillis = this.p.getEvent().getValue().startMillis;
        }
        this.m.show(this, jCurrentTimeMillis, new a(), "Picker-StartDate");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_edit);
        this.p = (ScheduleEditViewModel) ViewModelProviders.of(this).get(ScheduleEditViewModel.class);
        this.q = (ScheduleRepeatViewModel) ViewModelProviders.of(this).get(ScheduleRepeatViewModel.class);
        initView();
        init();
        S();
    }

    public static void to(Context context, @NonNull Update event, long startTime) {
        Intent intent = new Intent(context, (Class<?>) ScheduleEditActivity.class);
        intent.putExtra("UpdateId", event.getId());
        intent.putExtra("startTime", startTime);
        context.startActivity(intent);
    }
}

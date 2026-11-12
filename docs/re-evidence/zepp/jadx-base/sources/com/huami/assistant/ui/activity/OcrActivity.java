package com.huami.assistant.ui.activity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;
import com.huami.assistant.arch.OcrViewModel;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.ui.activity.OcrActivity;
import com.huami.assistant.ui.fragment.ReminderMinutePickerFragment;
import com.huami.assistant.ui.fragment.ScheduleTimePickerFragment;
import com.huami.assistant.util.EventUtils;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watch.util.TimeUtil;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class OcrActivity extends BaseActivity {
    public static final String ARGS_PATH = "path";
    private EditText b;
    private TextView c;
    private EditText d;
    private TextView e;
    private ImageView f;
    private OcrViewModel g;
    private DialogFragment h;
    private ReminderMinutePickerFragment i;
    private ScheduleTimePickerFragment j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Boolean bool) throws Exception {
        LoadingDialog.dismiss(this.h);
        if (!bool.booleanValue()) {
            Toast.makeText(getApplicationContext(), R.string.save_failed, 0).show();
            return;
        }
        Toast.makeText(getApplicationContext(), R.string.save_success, 0).show();
        RxBus.get().postMainThread(new UpdateRefreshEvent(2));
        Analytics.event(this, AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_SCHEDULE);
        setResult(-1);
        finish();
    }

    private void initView() {
        this.b = (EditText) findViewById(R.id.ocr_title);
        this.c = (TextView) findViewById(R.id.ocr_time);
        this.d = (EditText) findViewById(R.id.ocr_desc);
        this.e = (TextView) findViewById(R.id.ocr_reminder);
        this.f = (ImageView) findViewById(R.id.pic);
    }

    private void n() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.disableBackArrow();
        actionbarLayout.setBackText(getString(R.string.btn_cancel));
        actionbarLayout.setBackTextClickListener(new View.OnClickListener() { // from class: ei5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.btn_enter));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: ci5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.ocr_result));
    }

    private void o() {
        OcrViewModel ocrViewModel = (OcrViewModel) ViewModelProviders.of(this).get(OcrViewModel.class);
        this.g = ocrViewModel;
        ocrViewModel.titleData.observe(this, new Observer() { // from class: hi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.s((String) obj);
            }
        });
        this.g.timeData.observe(this, new Observer() { // from class: ji5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.t((Calendar) obj);
            }
        });
        this.g.descData.observe(this, new Observer() { // from class: ii5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.u((String) obj);
            }
        });
        this.g.reminderData.observe(this, new Observer() { // from class: gi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.v((Integer) obj);
            }
        });
        this.g.ocrResultData.observe(this, new Observer() { // from class: fi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.w((Result) obj);
            }
        });
    }

    private void p() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("path", "");
            this.g.setFilePath(string);
            Glide.with((FragmentActivity) this).applyDefaultRequestOptions(RequestOptions.skipMemoryCacheOf(true).diskCacheStrategy(DiskCacheStrategy.NONE)).load(new File(string)).into(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        submit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(String str) {
        this.b.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        this.c.setText(TimeUtil.formatDateTime(calendar.getTimeInMillis(), "yyyy-MM-dd HH:mm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str) {
        this.d.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Integer num) {
        if (num == null) {
            return;
        }
        this.e.setText(EventUtils.formatReminderMinute(this, num.intValue(), 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Result result) {
        LoadingDialog.dismiss(this.h);
        if (result == null || !result.isLoading()) {
            return;
        }
        this.h = LoadingDialog.setMessage(getString(R.string.ocr_loading)).show(this, "Ocr Loading");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.g.timeData.postValue(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i) {
        this.g.reminderData.postValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Event event, ObservableEmitter observableEmitter) throws Exception {
        ActionResult actionResultAddEvent = ExchangeCenter.addEvent(event);
        if (actionResultAddEvent.isSuccess()) {
            UpdatesManager.getManager().save(UpdateBuilder.build(event));
        }
        observableEmitter.onNext(Boolean.valueOf(actionResultAddEvent.isSuccess()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr);
        n();
        initView();
        o();
        p();
    }

    public void selectEventTime(View view) {
        Calendar value = this.g.timeData.getValue();
        if (value == null) {
            value = Calendar.getInstance();
        }
        if (this.j == null) {
            ScheduleTimePickerFragment scheduleTimePickerFragment = new ScheduleTimePickerFragment();
            this.j = scheduleTimePickerFragment;
            scheduleTimePickerFragment.setMode(0);
        }
        this.j.show(this, getString(R.string.ocr_event_time), value.getTimeInMillis(), new ScheduleTimePickerFragment.TimeSelectListener() { // from class: li5
            @Override // com.huami.assistant.ui.fragment.ScheduleTimePickerFragment.TimeSelectListener
            public final void onTimeSelect(long j) {
                this.a.x(j);
            }
        }, "Ocr Time");
    }

    public void selectReminder(View view) {
        int iIntValue = this.g.reminderData.getValue() == null ? -1 : this.g.reminderData.getValue().intValue();
        if (this.i == null) {
            this.i = new ReminderMinutePickerFragment();
        }
        this.i.setData(this, iIntValue, 0L);
        this.i.show(this, getString(R.string.remind), new ReminderMinutePickerFragment.MinuteSelectListener() { // from class: ki5
            @Override // com.huami.assistant.ui.fragment.ReminderMinutePickerFragment.MinuteSelectListener
            public final void onItemSelect(int i) {
                this.a.y(i);
            }
        }, "Ocr Reminder");
    }

    public void submit() {
        if (!AssistantModule.isDeviceConnected(this)) {
            Toast.makeText(this, R.string.connect_watch_toast, 0).show();
            return;
        }
        String strTrim = this.b.getText().toString().trim();
        String strTrim2 = this.d.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2)) {
            Toast.makeText(this, R.string.ocr_empty_tip, 0).show();
            return;
        }
        LoadingDialog.dismiss(this.h);
        this.h = LoadingDialog.setMessage(getString(R.string.saving)).show(this, "loading");
        Calendar value = this.g.timeData.getValue();
        if (value == null) {
            value = Calendar.getInstance();
        }
        Integer value2 = this.g.reminderData.getValue();
        final Event event = new Event();
        event.title = strTrim;
        event.description = strTrim2;
        event.startMillis = value.getTimeInMillis();
        event.endMillis = DateDay.from(value).dayEndMills();
        if (value2 != null && value2.intValue() >= 0) {
            event.hasAlarm = true;
            event.reminderMinutes = value2.intValue();
        }
        event.syncId = String.valueOf(System.currentTimeMillis());
        Rx.io(new ObservableOnSubscribe() { // from class: mi5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                OcrActivity.z(event, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: di5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.A((Boolean) obj);
            }
        });
    }
}

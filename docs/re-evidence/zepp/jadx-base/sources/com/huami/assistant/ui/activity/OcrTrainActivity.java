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
import com.huami.assistant.arch.OcrTrainViewModel;
import com.huami.assistant.calendar.Event;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.event.UpdateRefreshEvent;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.ui.activity.OcrTrainActivity;
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
public class OcrTrainActivity extends BaseActivity {
    public static final String ARGS_PATH = "path";
    private ImageView b;
    private EditText c;
    private EditText d;
    private EditText e;
    private TextView f;
    private TextView g;
    private OcrTrainViewModel h;
    private DialogFragment i;
    private ReminderMinutePickerFragment j;
    private ScheduleTimePickerFragment k;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        this.h.dateData.postValue(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(int i) {
        this.h.reminderData.postValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Event event, ObservableEmitter observableEmitter) throws Exception {
        ActionResult actionResultAddEvent = ExchangeCenter.addEvent(event);
        if (actionResultAddEvent.isSuccess()) {
            UpdatesManager.getManager().save(UpdateBuilder.build(event));
        }
        observableEmitter.onNext(Boolean.valueOf(actionResultAddEvent.isSuccess()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Boolean bool) throws Exception {
        LoadingDialog.dismiss(this.i);
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
        this.b = (ImageView) findViewById(R.id.img);
        this.c = (EditText) findViewById(R.id.train_num);
        this.d = (EditText) findViewById(R.id.start_station);
        this.e = (EditText) findViewById(R.id.dest_station);
        this.f = (TextView) findViewById(R.id.start_time);
        this.g = (TextView) findViewById(R.id.remind);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.disableBackArrow();
        actionbarLayout.setBackText(getString(R.string.btn_cancel));
        actionbarLayout.setBackTextClickListener(new View.OnClickListener() { // from class: si5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.btn_enter));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: oi5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.ocr_result));
    }

    private void p() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.h.setPath(extras.getString("path", ""));
        }
    }

    private void q() {
        OcrTrainViewModel ocrTrainViewModel = (OcrTrainViewModel) ViewModelProviders.of(this).get(OcrTrainViewModel.class);
        this.h = ocrTrainViewModel;
        ocrTrainViewModel.pathData.observe(this, new Observer() { // from class: yi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.t((String) obj);
            }
        });
        this.h.trainNumData.observe(this, new Observer() { // from class: wi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.u((String) obj);
            }
        });
        this.h.startStationData.observe(this, new Observer() { // from class: xi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.v((String) obj);
            }
        });
        this.h.destStationData.observe(this, new Observer() { // from class: vi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.w((String) obj);
            }
        });
        this.h.dateData.observe(this, new Observer() { // from class: zi5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x((Calendar) obj);
            }
        });
        this.h.reminderData.observe(this, new Observer() { // from class: ui5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.y((Integer) obj);
            }
        });
        this.h.ocrStatus.observe(this, new Observer() { // from class: ti5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.z((Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        submit();
    }

    private void submit() {
        if (!AssistantModule.isDeviceConnected(this)) {
            Toast.makeText(this, R.string.connect_watch_toast, 0).show();
            return;
        }
        String strTrim = this.c.getText().toString().trim();
        String strTrim2 = this.d.getText().toString().trim();
        String strTrim3 = this.e.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3)) {
            Toast.makeText(this, R.string.ocr_empty_tip, 0).show();
            return;
        }
        LoadingDialog.dismiss(this.i);
        this.i = LoadingDialog.setMessage(getString(R.string.saving)).show(this, "loading");
        Calendar value = this.h.dateData.getValue();
        if (value == null) {
            value = Calendar.getInstance();
        }
        Integer value2 = this.h.reminderData.getValue();
        final Event event = new Event();
        event.title = strTrim;
        event.description = strTrim2 + "——" + strTrim3 + "\n出发时间:" + TimeUtil.formatDateTime(value.getTimeInMillis(), "HH:mm");
        event.startMillis = value.getTimeInMillis();
        event.endMillis = DateDay.from(value).dayEndMills();
        if (value2 != null && value2.intValue() >= 0) {
            event.hasAlarm = true;
            event.reminderMinutes = value2.intValue();
        }
        event.syncId = String.valueOf(System.currentTimeMillis());
        Rx.io(new ObservableOnSubscribe() { // from class: qi5
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                OcrTrainActivity.C(event, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: ri5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.D((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Glide.with((FragmentActivity) this).applyDefaultRequestOptions(RequestOptions.skipMemoryCacheOf(true).diskCacheStrategy(DiskCacheStrategy.NONE)).load(new File(str)).into(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str) {
        this.c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str) {
        this.d.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(String str) {
        this.e.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        this.f.setText(TimeUtil.formatDateTime(calendar.getTimeInMillis(), "yyyy-MM-dd HH:mm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Integer num) {
        if (num == null) {
            return;
        }
        this.g.setText(EventUtils.formatReminderMinute(this, num.intValue(), 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Result result) {
        LoadingDialog.dismiss(this.i);
        if (result != null && result.isLoading()) {
            this.i = LoadingDialog.setMessage(getString(R.string.ocr_loading)).show(this, "Ocr Loading");
        }
        if (result == null || !result.isError()) {
            return;
        }
        Toast.makeText(this, R.string.ocr_train_fail, 0).show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocr_train);
        initView();
        q();
        p();
    }

    public void selectEventTime(View view) {
        Calendar value = this.h.dateData.getValue();
        if (value == null) {
            value = Calendar.getInstance();
        }
        if (this.k == null) {
            ScheduleTimePickerFragment scheduleTimePickerFragment = new ScheduleTimePickerFragment();
            this.k = scheduleTimePickerFragment;
            scheduleTimePickerFragment.setMode(0);
        }
        this.k.show(this, getString(R.string.ocr_event_time), value.getTimeInMillis(), new ScheduleTimePickerFragment.TimeSelectListener() { // from class: pi5
            @Override // com.huami.assistant.ui.fragment.ScheduleTimePickerFragment.TimeSelectListener
            public final void onTimeSelect(long j) {
                this.a.A(j);
            }
        }, "Ocr Time");
    }

    public void selectRemind(View view) {
        int iIntValue = this.h.reminderData.getValue() == null ? -1 : this.h.reminderData.getValue().intValue();
        if (this.j == null) {
            this.j = new ReminderMinutePickerFragment();
        }
        this.j.setData(this, iIntValue, 0L);
        this.j.show(this, getString(R.string.remind), new ReminderMinutePickerFragment.MinuteSelectListener() { // from class: aj5
            @Override // com.huami.assistant.ui.fragment.ReminderMinutePickerFragment.MinuteSelectListener
            public final void onItemSelect(int i) {
                this.a.B(i);
            }
        }, "Ocr Reminder");
    }
}

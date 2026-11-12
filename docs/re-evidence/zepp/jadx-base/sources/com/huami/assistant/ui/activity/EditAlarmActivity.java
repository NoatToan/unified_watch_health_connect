package com.huami.assistant.ui.activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.assistant.R;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.arch.EditAlarmViewModel;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.ui.activity.EditAlarmActivity;
import com.huami.assistant.ui.fragment.AlarmTimeSettingFragment;
import com.huami.assistant.util.AlarmUtil;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.assistant.util.UpdateParser;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public class EditAlarmActivity extends BaseActivity {
    public static final String EXTRA_ALARM = "alarm";
    public static final int REQUEST_CODE_FOR_REPEAT = 1;
    private static final String i = "Alarm_Edit";
    private TextView b;
    private Switch c;
    private TextView d;
    private AlarmTimeSettingFragment e;
    private EditAlarmViewModel f;
    private DialogFragment g;
    private long h;

    private void A(String msg) {
        LoadingDialog.dismiss(this.g);
        this.g = LoadingDialog.setMessage(msg).setCancelable(false).show(this, "loading dialog");
    }

    private void initView() {
        this.b = (TextView) findViewById(R.id.alarm_repeat_info);
        this.c = (Switch) findViewById(R.id.switch_alarm);
        this.d = (TextView) findViewById(R.id.alarm_delete);
        this.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uh1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.t(compoundButton, z);
            }
        });
    }

    private void k(@NonNull Alarm alarm, int resultCode) {
        Intent intent = new Intent();
        intent.putExtra("alarm", alarm);
        setResult(resultCode, intent);
        finish();
    }

    private String l() {
        return ((Alarm) getIntent().getSerializableExtra("alarm")) == null ? getResources().getString(R.string.add_alarm) : getResources().getString(R.string.edit_alarm);
    }

    private void m() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(l());
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: sh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        actionbarLayout.setRightText(getString(R.string.alarm_confirm));
        actionbarLayout.setRightTextClickListener(new View.OnClickListener() { // from class: th1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
    }

    private void n() {
        if (this.e == null) {
            this.e = new AlarmTimeSettingFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.alarm_setting_container, this.e).commit();
        }
    }

    private void o() {
        EditAlarmViewModel editAlarmViewModel = (EditAlarmViewModel) ViewModelProviders.of(this).get(EditAlarmViewModel.class);
        this.f = editAlarmViewModel;
        editAlarmViewModel.getAlarm().observe(this, new Observer() { // from class: vh1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.u((Alarm) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Alarm alarm, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(ExchangeCenter.deleteAlarm(alarm.id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Alarm alarm, ActionResult actionResult) throws Exception {
        LoadingDialog.dismiss(this.g);
        Log.d(i, "Delete Alarm Success:" + actionResult.isSuccess() + ",ResultData:" + actionResult.resultData, new Object[0]);
        if (!actionResult.isSuccess()) {
            Toast.makeText(this, getString(R.string.alarm_save_fail), 0).show();
            return;
        }
        UpdatesManager.getManager().delete(this.h);
        Toast.makeText(this, getString(R.string.alarm_save_success), 0).show();
        k(alarm, 19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z) {
        EditAlarmViewModel editAlarmViewModel = this.f;
        if (editAlarmViewModel != null) {
            editAlarmViewModel.setEnable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Alarm alarm) {
        if (alarm == null) {
            return;
        }
        n();
        this.b.setText(AlarmUtil.getAlarmRepeatString(this, alarm.days));
        this.c.setChecked(alarm.enabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Alarm alarm, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(ExchangeCenter.addAlarm(alarm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Alarm alarm, ActionResult actionResult) throws Exception {
        LoadingDialog.dismiss(this.g);
        Log.d(i, "Add Alarm Success:" + actionResult.isSuccess() + ",ResultData:" + actionResult.resultData, new Object[0]);
        Alarm alarm2 = UpdateParser.toAlarm(actionResult.resultData);
        if (alarm2 == null) {
            Toast.makeText(this, getString(R.string.alarm_save_fail), 0).show();
            return;
        }
        z(alarm2);
        Toast.makeText(this, getString(R.string.alarm_save_success), 0).show();
        k(alarm2, alarm.id == -1 ? 17 : 18);
    }

    private void x() {
        this.h = getIntent().getLongExtra("UpdateId", -1L);
        Alarm alarm = (Alarm) getIntent().getSerializableExtra("alarm");
        if (alarm == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.f.setAlarm(alarm);
        }
    }

    private void y() {
        final Alarm value = this.f.getAlarm().getValue();
        if (value == null) {
            return;
        }
        A(getString(R.string.alarm_loading_save));
        Rx.io(new ObservableOnSubscribe() { // from class: wh1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                EditAlarmActivity.v(value, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: yh1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.w(value, (ActionResult) obj);
            }
        });
    }

    private void z(Alarm alarm) {
        UpdatesManager.getManager().save(UpdateBuilder.build(alarm, UpdatesManager.getManager().get(this.h)));
    }

    public void deleteAlarm(View view) {
        final Alarm value = this.f.getAlarm().getValue();
        if (value == null || value.id == -1) {
            return;
        }
        A(getString(R.string.alarm_loading_delete));
        Log.d(i, "Delete Alarm", new Object[0]);
        Rx.io(new ObservableOnSubscribe() { // from class: xh1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                EditAlarmActivity.p(value, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: zh1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.q(value, (ActionResult) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        int intExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1 && (intExtra = data.getIntExtra("days", -1)) != -1) {
            this.f.setDays(intExtra);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_alarm);
        m();
        initView();
        o();
        x();
    }

    public void toRepeatPage(View view) {
        Alarm value = this.f.getAlarm().getValue();
        if (value != null) {
            Intent intent = new Intent(this, (Class<?>) AlarmRepeatSettingActivity.class);
            intent.putExtra("days", value.days);
            startActivityForResult(intent, 1);
        }
    }
}

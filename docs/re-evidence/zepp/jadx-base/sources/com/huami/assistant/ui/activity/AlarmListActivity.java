package com.huami.assistant.ui.activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.R;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.arch.AlarmListViewModel;
import com.huami.assistant.delegate.AssistantToolUtilsDelegate;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmListActivity extends BaseActivity {
    public static final String MAIN_MODULE_TOOL_KEY_NAME = "ALARM";
    public static final int REQUEST_CODE = 16;
    public static final int RESULT_CODE_ADD = 17;
    public static final int RESULT_CODE_DEL = 19;
    public static final int RESULT_CODE_UPDATE = 18;
    public static final String RESULT_KEY_ALARM = "alarm";
    private static final String f = "AlarmListActivity";
    private RecyclerView b;
    private AlarmListAdapter c;
    private DialogFragment d;
    private AlarmListViewModel e;

    public class AlarmListAdapter extends BaseQuickAdapter<Alarm, BaseViewHolder> {
        public AlarmListAdapter(int layoutResId) {
            super(layoutResId);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder helper, Alarm item) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, item.hour);
            calendar.set(12, item.minutes);
            helper.setText(R.id.tv_alarm_time, TimeUtil.formatDateTime(calendar.getTimeInMillis(), DateFormat.is24HourFormat(AlarmListActivity.this) ? "HH:mm" : "hh:mm"));
            if (!DateFormat.is24HourFormat(this.mContext)) {
                helper.setText(R.id.tv_alarm_time_ampm, ChartTimeUtil.getTimeUnit(this.mContext, item.hour));
            }
            int i = R.id.tv_alarm_enable;
            helper.setText(i, item.enabled ? R.string.alarm_on : R.string.alarm_off);
            helper.setTextColor(i, ContextCompat.getColor(this.mContext, item.enabled ? R.color.dark_red : R.color.black90));
        }
    }

    private void h() {
        final ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: ya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
        actionbarLayout.setTitleText(getString(R.string.widget_alarm));
        actionbarLayout.setRightImage(R.drawable.appbar_icon_func);
        actionbarLayout.setRightImageVisible(false);
        actionbarLayout.setRightImageClickListener(new View.OnClickListener() { // from class: ab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(actionbarLayout, view);
            }
        });
    }

    private void i() {
        AlarmListViewModel alarmListViewModel = (AlarmListViewModel) ViewModelProviders.of(this).get(AlarmListViewModel.class);
        this.e = alarmListViewModel;
        alarmListViewModel.getAlarmListLiveData().observe(this, new Observer() { // from class: bb
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n((List) obj);
            }
        });
    }

    private void initRecyclerView() {
        this.b.setLayoutManager(new LinearLayoutManager(this));
        AlarmListAdapter alarmListAdapter = new AlarmListAdapter(R.layout.item_alarm);
        this.c = alarmListAdapter;
        alarmListAdapter.bindToRecyclerView(this.b);
        this.c.setEmptyView(R.layout.view_alarm_empty);
        this.c.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: cb
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.l(baseQuickAdapter, view, i);
            }
        });
    }

    private void initView() {
        this.b = (RecyclerView) findViewById(R.id.alarm_list);
        findViewById(R.id.btn_add_alarm).setOnClickListener(new View.OnClickListener() { // from class: za
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        initRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ActionbarLayout actionbarLayout, View view) {
        AssistantToolUtilsDelegate.getInstance().getToolUtil().addToMyTools("ALARM");
        Toast.makeText(getApplicationContext(), R.string.tool_add_success, 0).show();
        actionbarLayout.setRightImageVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        p(this.c.getData().get(i));
    }

    private void loadData() {
        showLoadingDialog();
        this.e.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(List list) {
        LoadingDialog.dismiss(this.d);
        if (list != null) {
            Collections.sort(list);
        }
        this.c.setNewData(list);
    }

    private void o() {
        List<Alarm> value = this.e.getAlarmListLiveData().getValue();
        boolean z = value != null && value.size() >= AssistantModule.getAlarmCountLimit(this);
        StringBuilder sb = new StringBuilder();
        sb.append("To Add Alarm, Current Alarms: ");
        sb.append(value != null ? value.size() : -1);
        Log.d(f, sb.toString(), new Object[0]);
        if (z) {
            AlertDialog.setMessage(getString(R.string.alarm_add_count_limit_tip, new Object[]{Integer.valueOf(AssistantModule.getAlarmCountLimit(this))})).setNeutralBtn(getString(R.string.confirm)).show(this, "AlarmAddCountLimit");
        } else {
            p(null);
        }
    }

    private void p(Alarm alarm) {
        Intent intent = new Intent(this, (Class<?>) EditAlarmActivity.class);
        intent.putExtra("alarm", alarm);
        startActivityForResult(intent, 16);
    }

    private void showLoadingDialog() {
        LoadingDialog.dismiss(this.d);
        this.d = LoadingDialog.setMessage(getString(R.string.loading)).setCancelable(false).show(this, "loading dialog");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Alarm alarm;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 16) {
            if (resultCode == 17) {
                Alarm alarm2 = (Alarm) data.getSerializableExtra("alarm");
                if (alarm2 != null) {
                    this.e.addAlarm(alarm2);
                    return;
                }
                return;
            }
            if (resultCode == 18) {
                Alarm alarm3 = (Alarm) data.getSerializableExtra("alarm");
                if (alarm3 != null) {
                    this.e.updateAlarm(alarm3);
                    return;
                }
                return;
            }
            if (resultCode != 19 || (alarm = (Alarm) data.getSerializableExtra("alarm")) == null) {
                return;
            }
            this.e.delAlarm(alarm);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);
        h();
        initView();
        i();
        loadData();
    }
}

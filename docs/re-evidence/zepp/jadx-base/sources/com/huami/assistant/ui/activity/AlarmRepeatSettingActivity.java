package com.huami.assistant.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.assistant.R;
import com.huami.assistant.arch.AlarmRepeatSettingViewModel;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.ui.BaseActivity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmRepeatSettingActivity extends BaseActivity {
    public static final String EXTRA_DAYS = "days";
    private a b;
    private AlarmRepeatSettingViewModel c;

    public class a extends BaseQuickAdapter<Boolean, BaseViewHolder> {
        public String[] a;
        public String b;

        public a() {
            super(R.layout.item_custom_repeat);
            this.a = AlarmRepeatSettingActivity.this.getResources().getStringArray(R.array.week_days);
            this.b = AlarmRepeatSettingActivity.this.getResources().getStringArray(R.array.alarm_repeat_type)[0];
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder helper, Boolean item) {
            helper.setChecked(R.id.item_repeat_cb, item.booleanValue());
            if (helper.getLayoutPosition() == 0) {
                helper.setText(R.id.item_repeat_date, this.b);
            } else {
                helper.setText(R.id.item_repeat_date, this.a[helper.getLayoutPosition() - 1]);
            }
        }
    }

    private void f() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.alarm_set_repeat));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: ob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
    }

    private void g() {
        AlarmRepeatSettingViewModel alarmRepeatSettingViewModel = (AlarmRepeatSettingViewModel) ViewModelProviders.of(this).get(AlarmRepeatSettingViewModel.class);
        this.c = alarmRepeatSettingViewModel;
        alarmRepeatSettingViewModel.getWeekCheckedLiveData().observe(this, new Observer() { // from class: pb
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.j((Boolean[]) obj);
            }
        });
        this.c.setWeekChecked(getIntent().getIntExtra("days", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        this.c.invert(i);
    }

    private void initView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_repeat);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        a aVar = new a();
        this.b = aVar;
        recyclerView.setAdapter(aVar);
        this.b.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: qb
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.i(baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Boolean[] boolArr) {
        if (boolArr == null) {
            return;
        }
        this.b.setNewData(Arrays.asList(boolArr));
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.c.isRepeatDayChanged()) {
            Intent intent = new Intent();
            intent.putExtra("days", this.c.getDayMask());
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_repeat_setting);
        f();
        initView();
        g();
    }
}

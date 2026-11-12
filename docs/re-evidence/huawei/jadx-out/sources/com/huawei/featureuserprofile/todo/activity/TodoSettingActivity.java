package com.huawei.featureuserprofile.todo.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.todo.adapter.TodoCheckListAdapter;
import com.huawei.featureuserprofile.todo.datatype.TodoCheckEntity;
import com.huawei.featureuserprofile.todo.datatype.TodoSwitchSync;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.czv;
import defpackage.ffv;
import defpackage.irz;
import defpackage.njy;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TodoSettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TodoSwitchSync f5745b;
    private HealthSwitchButton d;
    private HealthSwitchButton e;
    private LinearLayout h;
    private HealthSwitchButton i;
    private TodoCheckListAdapter m;
    private HealthSwitchButton o;
    private HealthSwitchButton p;
    private boolean j = false;
    private boolean n = false;
    private boolean k = false;
    private boolean f = false;
    private int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<HealthLifeTaskBean> f5744a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f5746c = new HashMap();
    private final Handler g = new BaseHandler<TodoSettingActivity>(this) { // from class: com.huawei.featureuserprofile.todo.activity.TodoSettingActivity.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TodoSettingActivity todoSettingActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                TodoSettingActivity.b(todoSettingActivity);
                Object obj = message.obj;
                if (obj instanceof TodoSwitchSync) {
                    todoSettingActivity.f5745b = (TodoSwitchSync) obj;
                } else {
                    todoSettingActivity.f5745b = null;
                }
                todoSettingActivity.k = true;
                if (todoSettingActivity.l >= 2) {
                    TodoSettingActivity.this.a(todoSettingActivity.f5745b, todoSettingActivity.f5744a);
                    todoSettingActivity.l = 0;
                    return;
                }
                return;
            }
            if (i == 2) {
                todoSettingActivity.h();
                return;
            }
            if (i != 3) {
                return;
            }
            TodoSettingActivity.b(todoSettingActivity);
            Object obj2 = message.obj;
            todoSettingActivity.f5744a.clear();
            if ((obj2 instanceof List) && njy.b(obj2, HealthLifeTaskBean.class)) {
                todoSettingActivity.f5744a.addAll((List) obj2);
            }
            if (todoSettingActivity.l >= 2) {
                TodoSettingActivity.this.a(todoSettingActivity.f5745b, todoSettingActivity.f5744a);
                todoSettingActivity.l = 0;
            }
        }
    };

    static /* synthetic */ int b(TodoSettingActivity todoSettingActivity) {
        int i = todoSettingActivity.l;
        todoSettingActivity.l = i + 1;
        return i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.colorSubBackground);
        setContentView(R.layout.activity_health_todo_setting);
        e();
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.a("TodoSettingActivity", "mIsSyncCloud:", Boolean.valueOf(this.k), "mIsHasChanged", Boolean.valueOf(this.f));
        if (this.k && this.f) {
            this.f = false;
            h();
        }
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.k) {
            b();
        }
        this.g.removeMessages(2);
        this.g.removeMessages(1);
        this.f5746c.clear();
        super.onDestroy();
    }

    private String c() {
        return getString(com.huawei.ui.commonui.R.string.IDS_health_clover_title);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f = true;
        int id = compoundButton.getId();
        if (id == R.id.health_todo_main_switch) {
            this.n = z;
            this.f5746c.put("t000", Integer.valueOf(czv.b(z)));
            TodoCheckListAdapter todoCheckListAdapter = this.m;
            if (todoCheckListAdapter != null) {
                todoCheckListAdapter.c(z);
            }
            this.i.setEnabled(z);
            this.d.setEnabled(z);
            this.e.setEnabled(z);
            this.p.setEnabled(z);
            czv.e(this, getString(R.string.IDS_todo_setting_entrance), getString(R.string.IDS_todo_setting_entrance), z);
            return;
        }
        if (id == R.id.health_todo_live_main_swicth) {
            this.j = z;
            this.f5746c.put("t100", Integer.valueOf(czv.b(z)));
            TodoCheckListAdapter todoCheckListAdapter2 = this.m;
            if (todoCheckListAdapter2 != null) {
                todoCheckListAdapter2.a(z);
            }
            String strC = c();
            czv.e(this, strC, strC, z);
            return;
        }
        if (id == R.id.health_todo_plan_performing_switch) {
            this.f5746c.put("t201", Integer.valueOf(czv.b(z)));
            czv.e(this, getString(R.string.IDS_fitness_running_plans), getString(R.string.IDS_todo_setting_plan), z);
            return;
        }
        if (id == R.id.health_todo_activity_activing_switch) {
            this.f5746c.put("t301", Integer.valueOf(czv.b(z)));
            czv.e(this, getString(R.string.IDS_todo_setting_activity_activing), getString(R.string.IDS_todo_setting_activity), z);
            return;
        }
        if (id == R.id.health_todo_cal_balance_switch) {
            this.f5746c.put("t401", Integer.valueOf(czv.b(z)));
            czv.e(this, getString(R.string.IDS_todo_setting_sport), getString(R.string.IDS_todo_setting_cal_balance), z);
            return;
        }
        Object tag = compoundButton.getTag(R.id.health_todo_live_item_switch);
        if (tag instanceof Integer) {
            TodoCheckEntity item = this.m.getItem(((Integer) tag).intValue());
            if (item != null) {
                item.setChecked(z);
                this.f5746c.put(item.getKey(), Integer.valueOf(czv.b(z)));
                czv.e(this, item.getTitle(), c(), z);
            }
        }
    }

    private void e() {
        ((HealthTextView) findViewById(R.id.activity_health_todo_setting_text)).setText(c());
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.health_todo_titlebar);
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        customTitleBar.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        customTitleBar.setLeftButtonClickable(true);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: czh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31524a.a(view);
            }
        });
        this.o = (HealthSwitchButton) findViewById(R.id.health_todo_main_switch);
        this.i = (HealthSwitchButton) findViewById(R.id.health_todo_live_main_swicth);
        this.p = (HealthSwitchButton) findViewById(R.id.health_todo_plan_performing_switch);
        this.d = (HealthSwitchButton) findViewById(R.id.health_todo_activity_activing_switch);
        this.e = (HealthSwitchButton) findViewById(R.id.health_todo_cal_balance_switch);
        if (!irz.h()) {
            LogUtil.a("TodoSettingActivity", "is calBalance todo task Operated false ");
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.health_todo_cal_balance_switch_layout);
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.health_todo_cal_balance_switch_title);
            linearLayout.setVisibility(8);
            healthTextView.setVisibility(8);
        }
        this.m = new TodoCheckListAdapter();
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.health_todo_live_series_switch_layout);
        this.h = linearLayout2;
        this.m.e(linearLayout2);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    private void g() {
        this.m.d(this);
        this.o.setOnCheckedChangeListener(this);
        this.i.setOnCheckedChangeListener(this);
        this.p.setOnCheckedChangeListener(this);
        this.d.setOnCheckedChangeListener(this);
        this.e.setOnCheckedChangeListener(this);
    }

    private void e(TodoSwitchSync todoSwitchSync, List<HealthLifeTaskBean> list) {
        Map<String, Integer> mapB = czv.b(todoSwitchSync, this.f5746c);
        this.n = czv.a(mapB.get("t000"));
        this.j = czv.a(mapB.get("t100"));
        this.o.setChecked(this.n);
        this.i.setChecked(this.j);
        this.i.setEnabled(this.n);
        this.p.setChecked(czv.a(mapB.get("t201")));
        this.p.setEnabled(this.n);
        this.d.setChecked(czv.a(mapB.get("t301")));
        this.d.setEnabled(this.n);
        this.e.setChecked(czv.a(mapB.get("t401")));
        this.e.setEnabled(this.n);
        int size = njy.e(list) ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            for (HealthLifeTaskBean healthLifeTaskBean : list) {
                if (healthLifeTaskBean != null) {
                    String strB = czv.b(healthLifeTaskBean.getId());
                    if (!TextUtils.isEmpty(strB)) {
                        arrayList.add(new TodoCheckEntity(healthLifeTaskBean.getName(), strB, czv.d(strB, mapB.get(strB))));
                    }
                }
            }
        }
        this.m.a(this.j);
        this.m.c(this.n);
        this.m.a(arrayList);
    }

    private void a() {
        e(czv.d(this), null);
        d();
    }

    private void d() {
        ffv.b(DateFormatUtil.a(System.currentTimeMillis()), new a(this));
        ThreadPoolManager.c().execute(new c(this, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TodoSwitchSync todoSwitchSync, List<HealthLifeTaskBean> list) {
        e(todoSwitchSync, list);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ThreadPoolManager.c().execute(new c(this, true));
    }

    private void b() {
        boolean zIsChecked = this.d.isChecked();
        boolean zIsChecked2 = this.p.isChecked();
        boolean zIsChecked3 = this.e.isChecked();
        List<TodoCheckEntity> listD = this.m.d();
        int i = 0;
        if (njy.b(listD)) {
            Iterator<TodoCheckEntity> it = listD.iterator();
            while (it.hasNext()) {
                if (!it.next().isChecked()) {
                    i++;
                }
            }
        }
        czv.a(this, c(), i);
        czv.a(this, getString(R.string.IDS_todo_setting_plan), !zIsChecked2 ? 1 : 0);
        czv.a(this, getString(R.string.IDS_todo_setting_activity), !zIsChecked ? 1 : 0);
        czv.a(this, getString(R.string.IDS_todo_setting_cal_balance), !zIsChecked3 ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f5747b;
        private final WeakReference<TodoSettingActivity> d;

        c(TodoSettingActivity todoSettingActivity, boolean z) {
            this.d = new WeakReference<>(todoSettingActivity);
            this.f5747b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            TodoSettingActivity todoSettingActivity = this.d.get();
            if (todoSettingActivity == null) {
                return;
            }
            if (this.f5747b) {
                LogUtil.a("TodoSettingActivity", "mIsSync:", Boolean.valueOf(this.f5747b), ",isSuccess:", Boolean.valueOf(czv.b(BaseApplication.b(), (Map<String, Integer>) todoSettingActivity.f5746c)));
            } else {
                if (todoSettingActivity.isFinishing() || todoSettingActivity.isDestroyed()) {
                    return;
                }
                TodoSwitchSync todoSwitchSyncE = czv.e(todoSettingActivity);
                LogUtil.a("TodoSettingActivity", "mIsSync:", Boolean.valueOf(this.f5747b), ",todoSwitchSync:", todoSwitchSyncE);
                if (todoSwitchSyncE == null) {
                    todoSwitchSyncE = czv.d(todoSettingActivity);
                }
                todoSettingActivity.g.obtainMessage(1, todoSwitchSyncE).sendToTarget();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class a implements ResponseCallback<List<HealthLifeTaskBean>> {
        private final WeakReference<TodoSettingActivity> e;

        a(TodoSettingActivity todoSettingActivity) {
            this.e = new WeakReference<>(todoSettingActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HealthLifeTaskBean> list) {
            TodoSettingActivity todoSettingActivity = this.e.get();
            if (todoSettingActivity == null || todoSettingActivity.isFinishing() || todoSettingActivity.isDestroyed()) {
                return;
            }
            todoSettingActivity.g.obtainMessage(3, list).sendToTarget();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

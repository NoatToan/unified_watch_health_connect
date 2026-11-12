package com.huawei.ui.main.stories.fitness.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.BradycardiaAlarmActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.adapter.HeartRateAbnormalAdapter;
import defpackage.iov;
import defpackage.uel;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BradycardiaAlarmActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_warning_heart_rate);
        a();
    }

    private void a() {
        getWindow().setBackgroundDrawableResource(com.huawei.ui.commonui.R.color.colorSubBackground);
        ((CustomTitleBar) findViewById(R.id.fitness_detail_titlebar)).setTitleText(getResources().getString(R.string.IDS_heartrate_bradycardia_alarm));
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.heart_rate_recycler);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this));
        final HeartRateAbnormalAdapter heartRateAbnormalAdapter = new HeartRateAbnormalAdapter();
        healthRecycleView.setAdapter(heartRateAbnormalAdapter);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ucy
            @Override // java.lang.Runnable
            public final void run() {
                this.f49954a.e(heartRateAbnormalAdapter);
            }
        });
    }

    public /* synthetic */ void e(final HeartRateAbnormalAdapter heartRateAbnormalAdapter) {
        uel.a("BRADYCARDIA_DETAIL", 2102, new ResponseCallback() { // from class: udc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.d(heartRateAbnormalAdapter, i, (List) obj);
            }
        });
    }

    public /* synthetic */ void d(final HeartRateAbnormalAdapter heartRateAbnormalAdapter, int i, final List list) {
        if (list == null || list.size() == 0) {
            LogUtil.j("HealthHeartRate_BradycardiaAlarmActivity", "queryModelUnitByDetail data is empty");
        } else {
            runOnUiThread(new Runnable() { // from class: ucz
                @Override // java.lang.Runnable
                public final void run() {
                    BradycardiaAlarmActivity.c(heartRateAbnormalAdapter, list);
                }
            });
        }
    }

    public static /* synthetic */ void c(HeartRateAbnormalAdapter heartRateAbnormalAdapter, List list) {
        heartRateAbnormalAdapter.a(list);
        if (heartRateAbnormalAdapter.a()) {
            heartRateAbnormalAdapter.e(0);
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) BradycardiaAlarmActivity.class);
        intent.addFlags(268435456);
        iov.d(context, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

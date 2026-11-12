package com.huawei.ui.main.stories.fitness.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.adapter.WarningDetailAdapter;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.HeartRateDetailData;
import com.huawei.ui.main.stories.fitness.activity.heartrate.helper.WarningListData;
import defpackage.iov;
import defpackage.njy;
import defpackage.qrk;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateWarningDetailsActivity extends BaseActivity {
    private ArrayList<HeartRateDetailData> d = new ArrayList<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<WarningListData> f26896a = new ArrayList<>(16);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_warning_details);
        getWindow().setBackgroundDrawableResource(com.huawei.ui.commonui.R.color.colorSubBackground);
        b();
        WarningDetailAdapter warningDetailAdapter = new WarningDetailAdapter(this.f26896a);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.heart_rate_alert_recycler);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this));
        healthRecycleView.setAdapter(warningDetailAdapter);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.d.clear();
                this.d = intent.getParcelableArrayListExtra("alert_list_data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("HeartRateWarningDetailsActivity", "getPassedData ArrayIndexOutOfBoundsException");
            }
        }
        this.f26896a.clear();
        if (njy.e(this.d)) {
            LogUtil.j("HeartRateWarningDetailsActivity", "getPassedData mHeartRateDetailList is empty");
            return;
        }
        Iterator<HeartRateDetailData> it = this.d.iterator();
        while (it.hasNext()) {
            HeartRateDetailData next = it.next();
            WarningListData warningListData = new WarningListData();
            StringBuilder sb = new StringBuilder("detailData : ");
            sb.append(next == null);
            LogUtil.a("HeartRateWarningDetailsActivity", sb.toString());
            if (next != null) {
                warningListData.setDate(DateUtils.formatDateTime(BaseApplication.getContext(), next.getTime(), 131092));
                warningListData.setTime(qrk.e(BaseApplication.getContext(), next.getTime(), next.getTime(), 1));
                warningListData.setTitle(UnitUtil.e(next.getValue(), 1, 0) + BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
                this.f26896a.add(warningListData);
            }
        }
    }

    public static void b(Context context, ArrayList<HeartRateDetailData> arrayList) {
        if (context == null || arrayList == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HeartRateWarningDetailsActivity.class);
        intent.addFlags(268435456);
        intent.putParcelableArrayListExtra("alert_list_data", arrayList);
        iov.d(context, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

package com.huawei.ui.main.stories.fitness.activity.step;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor;
import com.huawei.ui.main.stories.fitness.views.fitnessdata.DayStepSourceItemAdapter;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import defpackage.njy;
import defpackage.uic;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DayStepSourceListActivity extends BaseActivity implements DayStepSourceItemAdapter.OnDayStepSourceItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27030b;
    private DayStepSourceItemAdapter d;
    private HealthCardView f;
    private HealthRecycleView g;
    private CustomTitleBar j;
    private List<HiHealthData> h = new ArrayList(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<uic> f27031c = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f27029a = new c(this);
    private FitnessStepDetailInteractor e = new FitnessStepDetailInteractor(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_step_source_list);
        a();
        e();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.fitnessdata.DayStepSourceItemAdapter.OnDayStepSourceItemClickListener
    public void onItemClick(int i) {
        PageModelArgs pageModelArgsD = d();
        List<HiHealthData> list = this.h;
        if (list == null || list.size() < i) {
            LogUtil.j("SCUI_DayStepSourceListActivity", "onItemClick mSourceList is null or size is less than position");
            return;
        }
        PrivacyDataModel privacyDataModelB = b(this.h.get(i));
        Intent intent = new Intent();
        intent.putExtra("extra_page_model_args", pageModelArgsD);
        intent.putExtra("extra_privacy_data_model", privacyDataModelB);
        intent.setClass(this, PrivacyDetailActivity.class);
        startActivity(intent);
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.ctb_step_source_title);
        this.j = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.health.servicesui.R.color.common_transparent));
        this.f = (HealthCardView) findViewById(R.id.hcv_RecyclerView_container);
        this.g = (HealthRecycleView) findViewById(R.id.hrv_step_source_item);
        this.f27030b = (LinearLayout) findViewById(R.id.no_data_source);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("SCUI_DayStepSourceListActivity", "initData intent is null");
            return;
        }
        String stringExtra = intent.getStringExtra("device_id");
        long longExtra = intent.getLongExtra("point_step_time", System.currentTimeMillis());
        this.j.setTitleText(DateFormatUtil.a(longExtra, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD));
        b();
        e(stringExtra, longExtra);
    }

    private void b() {
        this.g.setLayoutManager(new HealthLinearLayoutManager(BaseApplication.getContext()));
        DayStepSourceItemAdapter dayStepSourceItemAdapter = new DayStepSourceItemAdapter(BaseApplication.getContext(), this.f27031c);
        this.d = dayStepSourceItemAdapter;
        this.g.setAdapter(dayStepSourceItemAdapter);
        this.d.d(this);
    }

    private String e(int i) {
        return getResources().getQuantityString(R.plurals.IDS_hwh_me_other_target_steps, i, UnitUtil.e(i, 1, 0));
    }

    private void e(String str, long j) {
        this.e.e(str, DateFormatUtil.a(j), new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.step.DayStepSourceListActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j("SCUI_DayStepSourceListActivity", "getDayStepDataById objData is null");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.obj = obj;
                DayStepSourceListActivity.this.f27029a.sendMessage(messageObtain);
            }
        });
    }

    private PageModelArgs d() {
        PageModelArgs pageModelArgs = new PageModelArgs();
        pageModelArgs.setDataSource(3);
        pageModelArgs.setPageType(100);
        return pageModelArgs;
    }

    private PrivacyDataModel b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("SCUI_DayStepSourceListActivity", "buildPrivacyDataModel hiHealthData is null");
            return null;
        }
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        privacyDataModel.setStartTime(hiHealthData.getStartTime());
        privacyDataModel.setEndTime(hiHealthData.getEndTime());
        privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
        privacyDataModel.setClientId(hiHealthData.getClientId());
        privacyDataModel.setIntValue(hiHealthData.getIntValue());
        return privacyDataModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list) {
        this.h = list;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                double value = hiHealthData.getValue();
                long startTime = hiHealthData.getStartTime();
                long endTime = hiHealthData.getEndTime();
                uic uicVar = new uic();
                uicVar.e(a(startTime, endTime));
                uicVar.c(e((int) value));
                this.f27031c.add(uicVar);
            }
        }
        if (njy.e(this.f27031c)) {
            LogUtil.a("SCUI_DayStepSourceListActivity", "refreshStepSourceList mList is empty");
            g();
        } else {
            this.d.notifyDataSetChanged();
        }
    }

    private String a(long j, long j2) {
        return getString(R.string.IDS_hw_pressure_grade_range, new Object[]{DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE), DateFormatUtil.a(j2, DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f.setVisibility(0);
        this.f27030b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f.setVisibility(8);
        this.f27030b.setVisibility(0);
    }

    static class c extends BaseHandler<DayStepSourceListActivity> {
        c(DayStepSourceListActivity dayStepSourceListActivity) {
            super(dayStepSourceListActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DayStepSourceListActivity dayStepSourceListActivity, Message message) {
            if (message == null || message.what != 100) {
                LogUtil.j("SCUI_DayStepSourceListActivity", "handleMessageWhenReferenceNotNull message.what is not MSG_REQUEST_STEP_POINT_DATA");
                dayStepSourceListActivity.g();
                return;
            }
            Object obj = message.obj;
            if (!(obj instanceof List)) {
                LogUtil.j("SCUI_DayStepSourceListActivity", "handleMessageWhenReferenceNotNull obj is not instanceof List");
                dayStepSourceListActivity.g();
                return;
            }
            List list = (List) obj;
            if (!njy.e(list)) {
                dayStepSourceListActivity.c();
                dayStepSourceListActivity.a(list);
            } else {
                LogUtil.a("SCUI_DayStepSourceListActivity", "handleMessageWhenReferenceNotNull list is null or empty");
                dayStepSourceListActivity.g();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f27029a;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.f27029a = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

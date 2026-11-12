package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.ui.adapter.HistoricalReportExpandableAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import defpackage.njy;
import defpackage.osa;
import defpackage.osf;
import defpackage.otl;
import defpackage.out;
import defpackage.ozq;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseHistoricalReportActivity extends BaseActivity {
    public static final String EXTRA_KEY_END_TIMESTAMP = "historicalReportEndTimestamp";
    public static final String EXTRA_KEY_REPORT_MAX_NUMBER = "reportMaxNumber";
    public static final String EXTRA_KEY_REPORT_MIN_NUMBER = "reportMinNumber";
    public static final String EXTRA_KEY_REPORT_NUMBER = "reportNumber";
    public static final String EXTRA_KEY_START_TIMESTAMP = "historicalReportStartTimestamp";
    private static final int PARAMETER_MAP_INITIAL_SIZE = 4;
    public static final int REQUEST_CODE_FOR_HISTORICAL_REPORT = 100;
    private static final String TAG = "PLGACHIEVE_BaseHistoricalReportActivity";
    public static final String USER_START_EXERCISE_TIMESTAMP = "userStartExerciseTimestamp";
    private Context mContext;
    private HistoricalReportExpandableAdapter mExpandableListAdapter;
    private HealthExpandableListView mExpandableListView;
    private int mReportMaxNumber;
    private int mReportMinNumber;
    private otl mService;

    protected abstract ArrayList<ozq> calculateHistoricalReportDataList(long j, int i, int i2);

    protected abstract int getLayoutId();

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.mReportMaxNumber = intent.getIntExtra(EXTRA_KEY_REPORT_MAX_NUMBER, 0);
            this.mReportMinNumber = intent.getIntExtra(EXTRA_KEY_REPORT_MIN_NUMBER, 0);
        }
        setContentView(getLayoutId());
        initView();
        initData();
    }

    private void initData() {
        LogUtil.a(TAG, "initData()");
        String strE = osa.e(this.mContext, USER_START_EXERCISE_TIMESTAMP);
        LogUtil.a(TAG, "initData value=", strE);
        if (!TextUtils.isEmpty(strE) && !"0".equals(strE)) {
            refreshUi(CommonUtil.m(this.mContext, strE));
        } else {
            this.mService = otl.b(this.mContext);
            getTotalRecord();
        }
    }

    private void getTotalRecord() {
        Task taskCallInBackground = Tasks.callInBackground(new Callable<osf>() { // from class: com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public osf call() throws IllegalStateException {
                LogUtil.a(BaseHistoricalReportActivity.TAG, "get AchieveData");
                return BaseHistoricalReportActivity.this.mService.b(1, new HashMap(4));
            }
        });
        if (taskCallInBackground == null) {
            LogUtil.j(TAG, "initData task is null");
        } else {
            taskCallInBackground.addOnSuccessListener(new OnSuccessListener<osf>() { // from class: com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity.2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(osf osfVar) {
                    if (osfVar instanceof TotalRecord) {
                        BaseHistoricalReportActivity.this.doRefresh((TotalRecord) osfVar);
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity.3
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    LogUtil.j(BaseHistoricalReportActivity.TAG, "initData getAchieveData exception.");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRefresh(TotalRecord totalRecord) {
        if (totalRecord == null) {
            LogUtil.j(TAG, "doRefresh() totalRecord is null.");
            return;
        }
        long startDate = totalRecord.getStartDate();
        LogUtil.a(TAG, "doRefresh startTimestamp ", Long.valueOf(startDate));
        if (startDate != 0) {
            osa.b(this.mContext, USER_START_EXERCISE_TIMESTAMP, String.valueOf(startDate));
        }
        refreshUi(startDate);
    }

    private void refreshUi(long j) {
        if (this.mExpandableListView == null) {
            return;
        }
        LogUtil.a(TAG, "refreshUi startTimestamp=", Long.valueOf(j));
        ArrayList<ozq> arrayListCalculateHistoricalReportDataList = calculateHistoricalReportDataList(j, this.mReportMaxNumber, this.mReportMinNumber);
        if (njy.e(arrayListCalculateHistoricalReportDataList)) {
            LogUtil.a(TAG, "reportDataBeanMap is null.");
            this.mExpandableListView.setVisibility(8);
            return;
        }
        Collections.sort(arrayListCalculateHistoricalReportDataList);
        HistoricalReportExpandableAdapter historicalReportExpandableAdapter = new HistoricalReportExpandableAdapter(this.mContext, arrayListCalculateHistoricalReportDataList);
        this.mExpandableListAdapter = historicalReportExpandableAdapter;
        this.mExpandableListView.setAdapter(historicalReportExpandableAdapter);
        this.mExpandableListView.setVisibility(0);
        setExpandGroup();
    }

    private void setExpandGroup() {
        HistoricalReportExpandableAdapter historicalReportExpandableAdapter = this.mExpandableListAdapter;
        if (historicalReportExpandableAdapter == null) {
            LogUtil.j(TAG, "setExpandGroup mExpandableListAdapter is null.");
            return;
        }
        int groupCount = historicalReportExpandableAdapter.getGroupCount();
        if (groupCount <= 0) {
            LogUtil.j(TAG, "setExpandGroup groupCount is invalid.");
            return;
        }
        for (int i = 0; i < groupCount; i++) {
            HealthExpandableListView healthExpandableListView = this.mExpandableListView;
            if (healthExpandableListView != null) {
                healthExpandableListView.expandGroup(i);
            }
        }
    }

    private void initView() {
        HealthExpandableListView healthExpandableListView = (HealthExpandableListView) out.d(this, R.id.expandable_list_view);
        this.mExpandableListView = healthExpandableListView;
        healthExpandableListView.setSelector(new ColorDrawable(0));
        this.mExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity.5
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
                return true;
            }
        });
        this.mExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.pluginachievement.ui.report.BaseHistoricalReportActivity.4
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                if (BaseHistoricalReportActivity.this.mExpandableListAdapter == null) {
                    return false;
                }
                ozq.a child = BaseHistoricalReportActivity.this.mExpandableListAdapter.getChild(i, i2);
                long jE = child.e();
                long jD = child.d();
                int iC = child.c();
                Intent intent = new Intent();
                intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_REPORT_NUMBER, iC);
                intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_START_TIMESTAMP, jE);
                intent.putExtra(BaseHistoricalReportActivity.EXTRA_KEY_END_TIMESTAMP, jD);
                BaseHistoricalReportActivity.this.setResult(-1, intent);
                BaseHistoricalReportActivity.this.finish();
                return false;
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthExpandableListView healthExpandableListView = this.mExpandableListView;
        if (healthExpandableListView != null) {
            healthExpandableListView.setOnGroupClickListener(null);
            this.mExpandableListView.setOnChildClickListener(null);
            this.mExpandableListView = null;
        }
    }
}

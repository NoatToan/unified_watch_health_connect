package com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.hearratecontrol.callback.ConfigCallBack;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ehx;
import defpackage.ffw;
import defpackage.ffx;
import defpackage.ffy;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.CommonUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class RateControlFragment extends BaseFragment {
    private static final String TAG = "RateControlFragment";
    private RateControlCourseListAdapter mAdapter;
    private ArrayList<ffy> mCourseLists = new ArrayList<>();
    private HealthColumnRelativeLayout mLoading;
    private HealthColumnRelativeLayout mLoadingError;
    private HealthTextView mLoadingErrorText;
    private HealthRecycleView mRecycleView;
    private int mType;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mType = arguments.getInt("deviceType");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = viewOnCreateView instanceof ViewGroup ? (ViewGroup) viewOnCreateView : null;
        this.child = layoutInflater.inflate(R.layout.fragment_rate_control, viewGroup, false);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.child);
            initView(this.child);
            initData();
            return viewGroup2;
        }
        return this.child;
    }

    private void initView(View view) {
        this.mRecycleView = (HealthRecycleView) view.findViewById(R.id.rate_control_recycle_view);
        this.mLoading = (HealthColumnRelativeLayout) view.findViewById(R.id.rate_control_loading);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.performance_no_data_tv);
        this.mLoadingErrorText = healthTextView;
        healthTextView.setText(getString(R.string.sug_his_load_retry));
        HealthColumnRelativeLayout healthColumnRelativeLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.rope_performance_no_data_layout);
        this.mLoadingError = healthColumnRelativeLayout;
        healthColumnRelativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m1111xf0f30281(view2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlFragment, reason: not valid java name */
    /* synthetic */ void m1111xf0f30281(View view) {
        obtainConfigInfo();
    }

    private void initData() {
        setTitle(getString(this.mType == 265 ? R.string.IDS_rate_control_ride : R.string.IDS_rate_control_running));
        this.mCustomTitleBar.setTitleBarBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        this.mRecycleView.setLayoutManager(new LinearLayoutManager(this.mainActivity));
        RateControlCourseListAdapter rateControlCourseListAdapter = new RateControlCourseListAdapter(this.mainActivity, this.mType, new RateControlCourseListAdapter.OnItemClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlFragment$$ExternalSyntheticLambda0
            @Override // com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlCourseListAdapter.OnItemClickListener
            public final void onItemClick(ffy ffyVar) {
                this.f$0.m1110x7de1a1c7(ffyVar);
            }
        });
        this.mAdapter = rateControlCourseListAdapter;
        this.mRecycleView.setAdapter(rateControlCourseListAdapter);
        obtainConfigInfo();
    }

    /* JADX INFO: renamed from: lambda$initData$1$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlFragment, reason: not valid java name */
    /* synthetic */ void m1110x7de1a1c7(ffy ffyVar) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        arguments.putString("course_id", ffyVar.getId());
        RateControlCourseDetailFragment rateControlCourseDetailFragment = new RateControlCourseDetailFragment();
        rateControlCourseDetailFragment.setArguments(arguments);
        addFragment(rateControlCourseDetailFragment);
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.d(TAG, "initViewTahiti");
        initData();
    }

    private void obtainConfigInfo() {
        if (!CommonUtil.ab(this.mainActivity)) {
            LogUtil.d(TAG, "network is error");
            this.mLoading.setVisibility(8);
            this.mLoadingError.setVisibility(0);
            qpx.b(this.mainActivity, R.string.IDS_network_check);
            return;
        }
        this.mLoading.setVisibility(0);
        this.mLoadingError.setVisibility(8);
        ehx.a(this.mType, (ConfigCallBack<ffw>) new ConfigCallBack() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj) {
                this.f$0.m1113x81067b04((ffw) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$obtainConfigInfo$3$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlFragment, reason: not valid java name */
    /* synthetic */ void m1113x81067b04(final ffw ffwVar) {
        if (ffwVar == null || njy.e(ffwVar.getGroupLists())) {
            LogUtil.d(TAG, "heartRateControlInfo is null");
            this.mLoading.setVisibility(8);
            this.mLoadingError.setVisibility(0);
            return;
        }
        new Handler().post(new Runnable() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.sportfragment.RateControlFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1112x127f69c3(ffwVar);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$obtainConfigInfo$2$com-huawei-health-ecologydevice-ui-measure-fragment-sportfragment-RateControlFragment, reason: not valid java name */
    /* synthetic */ void m1112x127f69c3(ffw ffwVar) {
        this.mLoading.setVisibility(8);
        this.mLoadingError.setVisibility(8);
        setGroupNameToCourseInfo(ffwVar);
        this.mAdapter.setData(this.mCourseLists);
    }

    private void setGroupNameToCourseInfo(ffw ffwVar) {
        for (ffx ffxVar : ffwVar.getGroupLists()) {
            if (ffxVar != null && !njy.e(ffxVar.getCourseInfoList())) {
                for (int i = 0; i < ffxVar.getCourseInfoList().size(); i++) {
                    ffy ffyVar = ffxVar.getCourseInfoList().get(i);
                    if (i == 0) {
                        ffyVar.setGroupName(ffxVar.getGroupName());
                    }
                    this.mCourseLists.add(ffyVar);
                }
            }
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ehx.e();
    }
}

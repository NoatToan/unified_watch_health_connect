package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.core.content.ContextCompat;
import com.google.json.JsonSanitizer;
import com.huawei.ecologydevice.R;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.measure.adapter.RopePerformanceHistoryAdapter;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import defpackage.dmg;
import defpackage.emj;
import defpackage.emr;
import defpackage.erj;
import defpackage.etg;
import defpackage.etn;
import defpackage.ift;
import defpackage.njd;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class RopePerformanceHistoryFragment extends BaseFragment implements View.OnClickListener {
    private static final int MESSAGE_BEST_OF_HISTORY_DATA_EMPTY = 7;
    private static final int MESSAGE_BEST_OF_MONTH_DATA_EMPTY = 5;
    private static final int MESSAGE_HISTORY_DATA_EMPTY = 6;
    private static final int MESSAGE_JUMP_TO_BEST_OF_HISTORY = 3;
    private static final int MESSAGE_JUMP_TO_BEST_OF_MONTH = 4;
    private static final int MESSAGE_QUERY_DATA_FINISH = 1;
    private static final int MESSAGE_QUERY_HISTORY_BEST_FINISH = 2;
    private static final String TAG = "RopePerformanceHistoryFragment";
    private Context mContext;
    private Handler mHandler = new RopePerformanceHandler(this);
    private HealthColumnRelativeLayout mHistoryLayout;
    private HealthColumnRelativeLayout mMonthLayout;
    private HealthColumnRelativeLayout mNoDataLayout;
    private RopePerformanceHistoryAdapter mPerformanceHistoryAdapter;
    private HealthExpandableListView mPerformanceHistoryList;
    private List<List<HiHealthData>> mRopeDataLists;
    private HealthColumnLinearLayout mTitleLayout;

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        LogUtil.a(TAG, "onCreate");
        super.onCreate(bundle);
        this.mContext = requireContext();
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a(TAG, "onCreateView");
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (layoutInflater == null) {
            LogUtil.j(TAG, "onCreateView inflater is null!");
            return viewOnCreateView;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_rope_performance_history, viewGroup, false);
        if (viewInflate != null && viewOnCreateView != null) {
            initView(viewInflate);
            if (viewOnCreateView instanceof ViewGroup) {
                ((ViewGroup) viewOnCreateView).addView(viewInflate);
            }
            initData();
            return viewOnCreateView;
        }
        LogUtil.j(TAG, "onCreateView child is null or view is null!");
        return viewOnCreateView;
    }

    private void initView(View view) {
        this.mCustomTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this.mContext, R.color.colorSubBackground));
        setTitle(getString(R.string.IDS_rope_performance_title));
        this.mPerformanceHistoryList = (HealthExpandableListView) view.findViewById(R.id.rope_performance_history_list);
        this.mNoDataLayout = (HealthColumnRelativeLayout) view.findViewById(R.id.rope_performance_no_data_layout);
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_rope_performance_headerview, (ViewGroup) null);
        this.mHistoryLayout = (HealthColumnRelativeLayout) qsp.a(viewInflate, R.id.rope_performance_header_view_history);
        this.mMonthLayout = (HealthColumnRelativeLayout) qsp.a(viewInflate, R.id.rope_performance_header_view_month);
        this.mTitleLayout = (HealthColumnLinearLayout) qsp.a(viewInflate, R.id.rope_performance_header_view_title_layout);
        this.mPerformanceHistoryList.addHeaderView(viewInflate);
        if (this.mPerformanceHistoryAdapter == null) {
            this.mPerformanceHistoryAdapter = new RopePerformanceHistoryAdapter(this.mContext);
        }
        this.mPerformanceHistoryList.setAdapter(this.mPerformanceHistoryAdapter);
        this.mPerformanceHistoryList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda0
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view2, int i, int i2, long j) {
                return this.f$0.m1018x646fca29(expandableListView, view2, i, i2, j);
            }
        });
        this.mHistoryLayout.setOnClickListener(this);
        this.mMonthLayout.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ boolean m1018x646fca29(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        handleChildClick(i, i2);
        return false;
    }

    private void handleChildClick(int i, int i2) {
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
        } else {
            emr.d().a(getRopeData(i, i2), new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda3
                @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
                public final void onResponse(int i3, Object obj) {
                    this.f$0.m1016x58175ca9(i3, (njd) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$handleChildClick$1$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ void m1016x58175ca9(int i, njd njdVar) {
        erj.e(this.mContext, "fromRopePerformanceHistoryFragment", njdVar);
        biEventForRopePerformance(this.mContext, "rope_performance_detail");
    }

    private void initData() {
        emr.d().c(new CommonUiResponse() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda2
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i, Object obj) {
                this.f$0.m1017xfd183f02(i, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initData$2$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ void m1017xfd183f02(int i, Pair pair) {
        if (i != 0) {
            LogUtil.j(TAG, "Failed to queryRopeData, errorCode = ", Integer.valueOf(i));
            etn.e(this.mHandler, 6, (Object) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Map map = (Map) pair.second;
        for (Long l : (Set) pair.first) {
            arrayList.add(handleRopeMonthData(l.longValue(), ift.e(l.longValue()), (List) map.get(l)));
        }
        sortRopeMonthData(arrayList);
        etn.e(this.mHandler, 1, new androidx.core.util.Pair(arrayList, new ArrayList(map.values())));
    }

    private HiHealthData handleRopeMonthData(long j, long j2, List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.a(TAG, "handleRopeMonthData dataList is null");
            return null;
        }
        LogUtil.a(TAG, "handleRopeMonthData startTime = ", Long.valueOf(j), ", endTime = ", Long.valueOf(j2));
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.putDouble("Track_Count_Sum", list.size());
        Iterator<HiHealthData> it = list.iterator();
        long totalTime = 0;
        int totalCalories = 0;
        while (it.hasNext()) {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(JsonSanitizer.sanitize(it.next().getMetaData()), HiTrackMetaData.class);
            if (hiTrackMetaData != null) {
                totalTime += hiTrackMetaData.getTotalTime();
                totalCalories += hiTrackMetaData.getTotalCalories();
            }
        }
        hiHealthData.setTimeInterval(j, j2);
        hiHealthData.putLong("Track_Duration_Sum", totalTime);
        hiHealthData.putInt("Track_Calorie_Sum", totalCalories);
        return hiHealthData;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            LogUtil.a(TAG, "click too fast");
            return;
        }
        if (view == null) {
            LogUtil.j(TAG, "onClick view is null");
            return;
        }
        if (view == this.mHistoryLayout) {
            jumpToBestOfHistory();
            biEventForRopePerformance(this.mContext, "rope_performance_best_of_history");
        } else if (view == this.mMonthLayout) {
            jumpToBestOfMonth();
            biEventForRopePerformance(this.mContext, "rope_performance_best_of_month");
        } else {
            LogUtil.j(TAG, "onClick else");
        }
    }

    protected void biEventForRopePerformance(Context context, String str) {
        new etg.b().j(dmg.a().getProductId()).e(dmg.a().getCurrentMacAddress()).c(str).b().b(context);
    }

    private void jumpToBestOfHistory() {
        emj.b().d(new IBaseResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1019x39c2fe5(i, obj);
            }
        }, DateType.DATE_ALL);
    }

    /* JADX INFO: renamed from: lambda$jumpToBestOfHistory$3$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ void m1019x39c2fe5(int i, Object obj) {
        if (i != 0) {
            LogUtil.a(TAG, "jumpToBestOfHistory failed to query best of history.");
            etn.e(this.mHandler, 7, (Object) null);
        } else {
            etn.e(this.mHandler, 3, obj);
        }
    }

    private void jumpToBestOfMonth() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emj.b().d(new IBaseResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1020x35f6e018(jCurrentTimeMillis, i, obj);
            }
        }, DateType.DATE_ALL);
    }

    /* JADX INFO: renamed from: lambda$jumpToBestOfMonth$4$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ void m1020x35f6e018(long j, int i, Object obj) {
        LogUtil.a(TAG, "jumpToBestOfMonth query performance best of history time = ", Long.valueOf(System.currentTimeMillis() - j));
        if (i != 0) {
            LogUtil.a(TAG, "jumpToBestOfMonth failed to query best of history.");
            etn.e(this.mHandler, 5, (Object) null);
        } else {
            etn.e(this.mHandler, 2, obj);
            queryPerformanceBestOfMonth();
        }
    }

    private void queryPerformanceBestOfMonth() {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        emj.b().d(new IBaseResponseCallback() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1021xd703b936(jCurrentTimeMillis, i, obj);
            }
        }, DateType.DATE_MONTH);
    }

    /* JADX INFO: renamed from: lambda$queryPerformanceBestOfMonth$5$com-huawei-health-ecologydevice-ui-measure-fragment-RopePerformanceHistoryFragment, reason: not valid java name */
    /* synthetic */ void m1021xd703b936(long j, int i, Object obj) {
        LogUtil.a(TAG, "jumpToBestOfMonth query performance best of month time = ", Long.valueOf(System.currentTimeMillis() - j));
        if (i != 0) {
            LogUtil.a(TAG, "jumpToBestOfMonth failed to query best of month.");
            etn.e(this.mHandler, 5, (Object) null);
        } else {
            etn.e(this.mHandler, 4, obj);
        }
    }

    public void switchRopePerformanceBestFragment(androidx.core.util.Pair<float[], float[]> pair, androidx.core.util.Pair<float[], float[]> pair2) {
        Bundle bundle = new Bundle();
        if (pair2 != null) {
            putBestOfMonthData(bundle, pair2);
        }
        if (pair != null) {
            putBestOfHistoryData(bundle, pair, pair2);
        }
        switchRopePerformanceBestFragment(bundle);
    }

    public void switchRopePerformanceBestFragment(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("skipping_performance_title", getString(i));
        switchRopePerformanceBestFragment(bundle);
    }

    public void switchRopePerformanceBestFragment(Bundle bundle) {
        RopePerformanceBestFragment ropePerformanceBestFragment = new RopePerformanceBestFragment();
        ropePerformanceBestFragment.setArguments(bundle);
        addFragment(ropePerformanceBestFragment);
    }

    private void putBestOfMonthData(Bundle bundle, androidx.core.util.Pair<float[], float[]> pair) {
        bundle.putFloatArray("skipping_performance_value", pair.first);
        bundle.putFloatArray("skipping_performance_rank", pair.second);
        bundle.putString("skipping_performance_title", getString(R.string.IDS_rope_performance_month_title));
    }

    private void putBestOfHistoryData(Bundle bundle, androidx.core.util.Pair<float[], float[]> pair, androidx.core.util.Pair<float[], float[]> pair2) {
        bundle.putFloatArray("skipping_performance_history_value", pair.first);
        bundle.putFloatArray("skipping_performance_history_rank", pair.second);
        if (pair2 == null) {
            bundle.putString("skipping_performance_title", getString(R.string.IDS_rope_performance_history_title));
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mPerformanceHistoryAdapter.c();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler = null;
        if (njy.b(this.mRopeDataLists)) {
            this.mRopeDataLists.clear();
        }
        HealthExpandableListView healthExpandableListView = this.mPerformanceHistoryList;
        if (healthExpandableListView != null) {
            healthExpandableListView.setOnChildClickListener(null);
            this.mPerformanceHistoryList = null;
        }
    }

    private void sortRopeMonthData(List<HiHealthData> list) {
        Collections.sort(list, new Comparator<HiHealthData>() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.RopePerformanceHistoryFragment.1
            @Override // java.util.Comparator
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                return Long.compare(hiHealthData2.getStartTime(), hiHealthData.getStartTime());
            }
        });
    }

    public void doRefresh(List<HiHealthData> list, List<List<HiHealthData>> list2) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.a(TAG, "groupList or childList is null");
            etn.e(this.mHandler, 6, (Object) null);
        } else {
            this.mRopeDataLists = list2;
            this.mPerformanceHistoryAdapter.d(list, list2);
            this.mPerformanceHistoryAdapter.notifyDataSetChanged();
            this.mPerformanceHistoryList.expandGroup(0);
        }
    }

    public HiHealthData getRopeData(int i, int i2) {
        if (njy.c(this.mRopeDataLists, i) && njy.c(this.mRopeDataLists.get(i), i2)) {
            return this.mRopeDataLists.get(i).get(i2);
        }
        return null;
    }

    public void showEmpty() {
        this.mTitleLayout.setVisibility(8);
        this.mNoDataLayout.setVisibility(0);
    }

    static class RopePerformanceHandler extends BaseHandler<RopePerformanceHistoryFragment> {
        private androidx.core.util.Pair<float[], float[]> mBestOfHistory;

        RopePerformanceHandler(RopePerformanceHistoryFragment ropePerformanceHistoryFragment) {
            super(ropePerformanceHistoryFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        public void handleMessageWhenReferenceNotNull(RopePerformanceHistoryFragment ropePerformanceHistoryFragment, Message message) {
            if (!(message.obj instanceof androidx.core.util.Pair)) {
                LogUtil.a(RopePerformanceHistoryFragment.TAG, "obj is not instance of Pair");
                handleOtherMessage(ropePerformanceHistoryFragment, message.what);
                return;
            }
            if (message.what == 1) {
                queryDataFinish(ropePerformanceHistoryFragment, message.obj);
                return;
            }
            if (message.what == 3) {
                ropePerformanceHistoryFragment.switchRopePerformanceBestFragment((androidx.core.util.Pair) message.obj, null);
                return;
            }
            if (message.what == 2) {
                this.mBestOfHistory = (androidx.core.util.Pair) message.obj;
            } else if (message.what == 4) {
                ropePerformanceHistoryFragment.switchRopePerformanceBestFragment(this.mBestOfHistory, (androidx.core.util.Pair) message.obj);
            } else {
                LogUtil.j(RopePerformanceHistoryFragment.TAG, "undefined");
            }
        }

        private void queryDataFinish(RopePerformanceHistoryFragment ropePerformanceHistoryFragment, Object obj) {
            androidx.core.util.Pair pair = (androidx.core.util.Pair) obj;
            ropePerformanceHistoryFragment.doRefresh(pair.first instanceof List ? (List) pair.first : null, pair.second instanceof List ? (List) pair.second : null);
        }

        private void handleOtherMessage(RopePerformanceHistoryFragment ropePerformanceHistoryFragment, int i) {
            if (i == 6) {
                ropePerformanceHistoryFragment.showEmpty();
                return;
            }
            if (i == 7) {
                ropePerformanceHistoryFragment.switchRopePerformanceBestFragment(R.string.IDS_rope_performance_history_title);
            } else if (i == 5) {
                ropePerformanceHistoryFragment.switchRopePerformanceBestFragment(R.string.IDS_rope_performance_month_title);
            } else {
                LogUtil.d(RopePerformanceHistoryFragment.TAG, "other");
            }
        }
    }
}

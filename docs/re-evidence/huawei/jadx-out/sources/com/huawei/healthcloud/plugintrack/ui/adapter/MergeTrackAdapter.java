package com.huawei.healthcloud.plugintrack.ui.adapter;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.ive;
import defpackage.jaa;
import defpackage.jbt;
import defpackage.jpq;
import defpackage.jqp;
import defpackage.jxk;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MergeTrackAdapter extends BaseRecyclerAdapter<RelativeSportData> implements BaseRecyclerAdapter.OnItemClickListener<RelativeSportData> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jqp f10982c;

    public MergeTrackAdapter(List<RelativeSportData> list, jqp jqpVar) {
        super(list, R.layout.layout_merge_track_sub_child_item);
        setOnItemClickListener(this);
        this.f10982c = jqpVar;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, int i, RelativeSportData relativeSportData) {
        String strD;
        if (recyclerHolder == null || relativeSportData == null) {
            LogUtil.e("Track_MergeTrackAdapter", "holder or item is null");
            return;
        }
        int distance = relativeSportData.getDistance();
        long duration = relativeSportData.getDuration();
        int sportType = relativeSportData.getSportType();
        List<jqp> listN = this.f10982c.n();
        if (listN == null) {
            LogUtil.e("Track_MergeTrackAdapter", "subSportDataManager is null");
            return;
        }
        Iterator<jqp> it = listN.iterator();
        while (true) {
            if (!it.hasNext()) {
                strD = null;
                break;
            }
            jqp next = it.next();
            if (next == null) {
                LogUtil.e("Track_MergeTrackAdapter", "manager is null");
            } else {
                MotionPathSimplify motionPathSimplifyD = next.d();
                if (motionPathSimplifyD != null && motionPathSimplifyD.requestSportType() == relativeSportData.getSportType() && motionPathSimplifyD.requestStartTime() == relativeSportData.getStartTime() && motionPathSimplifyD.requestEndTime() == relativeSportData.getEndTime()) {
                    strD = motionPathSimplifyD.getExtendDataString("alias");
                    break;
                }
            }
        }
        if (strD == null) {
            strD = jaa.d(BaseApplication.getContext(), sportType);
        }
        HealthSubHeader healthSubHeader = (HealthSubHeader) recyclerHolder.d(R.id.sub_header_sport_name);
        healthSubHeader.setSubHeaderBackgroundColor(qre.e(com.huawei.health.servicesui.R.color.common_transparent));
        healthSubHeader.setSubHeaderTitleTextSize(2, 18.0f);
        healthSubHeader.setHeadTitleTypeface(jxk.d(), 1);
        healthSubHeader.setHeadTitleText(strD);
        healthSubHeader.setMoreText("");
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.distance_value);
        HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.distance_value_unit);
        HealthTextView healthTextView3 = (HealthTextView) recyclerHolder.d(R.id.distance_desc);
        jxk.b(healthTextView, healthTextView2, distance, sportType);
        HealthTextView healthTextView4 = (HealthTextView) recyclerHolder.d(R.id.time_value);
        HealthTextView healthTextView5 = (HealthTextView) recyclerHolder.d(R.id.time_desc);
        healthTextView4.setText(jpq.e(duration));
        a(healthTextView, healthTextView2, healthTextView3, healthTextView4, healthTextView5);
    }

    private void a(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3, HealthTextView healthTextView4, HealthTextView healthTextView5) {
        healthTextView.setZoomSize(R.dimen.health_common_24dp, 1.3f);
        healthTextView4.setZoomSize(R.dimen.health_common_24dp, 1.3f);
        healthTextView2.setZoomSize(R.dimen.health_common_12dp, 1.75f);
        healthTextView3.setZoomSize(R.dimen.health_common_12dp, 1.75f);
        healthTextView5.setZoomSize(R.dimen.health_common_12dp, 1.75f);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onItemClicked(RecyclerHolder recyclerHolder, int i, RelativeSportData relativeSportData) {
        boolean z;
        jbt next;
        if (qrs.r()) {
            LogUtil.a("Track_MergeTrackAdapter", "onItemClicked isFastClick");
            return;
        }
        long startTime = relativeSportData.getStartTime();
        long endTime = relativeSportData.getEndTime();
        int sportType = relativeSportData.getSportType();
        List<jbt> listM = this.f10982c.m();
        if (listM == null) {
            LogUtil.a("Track_MergeTrackAdapter", "trackShowDetailInfoExtList is null error");
            return;
        }
        Iterator<jbt> it = listM.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                next = null;
                break;
            }
            next = it.next();
            if (next == null) {
                LogUtil.a("Track_MergeTrackAdapter", "detailInfoExt is null error");
            } else {
                MotionPathSimplify motionPathSimplifyB = next.b();
                long jRequestStartTime = motionPathSimplifyB.requestStartTime();
                long jRequestEndTime = motionPathSimplifyB.requestEndTime();
                int iRequestSportType = motionPathSimplifyB.requestSportType();
                if (startTime == jRequestStartTime && endTime == jRequestEndTime && sportType == iRequestSportType) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_sport_merge_track_delete);
        } else if (next.b() != null) {
            LogUtil.j("Track_MergeTrackAdapter", "click to sub sport track detail");
            ive.c().d(next.d(), next.b(), Boolean.FALSE.booleanValue(), Boolean.TRUE.booleanValue());
        }
    }
}

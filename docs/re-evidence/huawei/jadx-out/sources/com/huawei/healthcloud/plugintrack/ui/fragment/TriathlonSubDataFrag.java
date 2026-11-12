package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.adapter.MergeTrackAdapter;
import com.huawei.healthcloud.plugintrack.ui.adapter.TrackTriathlonDetailAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.jqp;
import defpackage.qqp;
import defpackage.qrs;

/* JADX INFO: loaded from: classes10.dex */
public class TriathlonSubDataFrag extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrackTriathlonDetailAdapter f11177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f11178c;
    private jqp d;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Track_TriathlonSubDataFrag", "onCreateView--------");
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof TrackDetailActivity)) {
            LogUtil.j("Track_TriathlonSubDataFrag", "trackDetailActivity == null");
            return null;
        }
        final TrackDetailActivity trackDetailActivity = (TrackDetailActivity) activity;
        jqp jqpVarC = trackDetailActivity.c();
        this.d = jqpVarC;
        if (jqpVarC == null) {
            LogUtil.j("Track_TriathlonSubDataFrag", "mTrackDetailDataManager == null");
            trackDetailActivity.finish();
            return null;
        }
        boolean z = false;
        View viewInflate = layoutInflater.inflate(R.layout.track_sub_sport_detail, viewGroup, false);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.recyclerview_reco);
        this.f11178c = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        if (this.d.ay()) {
            MergeTrackAdapter mergeTrackAdapter = new MergeTrackAdapter(this.d.d().requestChildSportItems(), this.d);
            this.f11178c.setPadding(0, qqp.a(BaseApplication.b(), 6.0f), 0, 0);
            this.f11178c.setAdapter(mergeTrackAdapter);
            return viewInflate;
        }
        TrackTriathlonDetailAdapter trackTriathlonDetailAdapter = new TrackTriathlonDetailAdapter(this, this.d.m(), z) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TriathlonSubDataFrag.4
            @Override // com.huawei.healthcloud.plugintrack.ui.adapter.TrackTriathlonDetailAdapter
            public boolean a() {
                return trackDetailActivity.a();
            }
        };
        this.f11177b = trackTriathlonDetailAdapter;
        this.f11178c.setAdapter(trackTriathlonDetailAdapter);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.d("Track_TriathlonSubDataFrag", "onConfigurationChanged");
        a();
    }

    private void a() {
        Context context = getContext();
        if (context == null) {
            LogUtil.j("Track_TriathlonSubDataFrag", "context == null");
            return;
        }
        for (int i = 0; i < this.f11178c.getChildCount(); i++) {
            qrs.a(context, true, true, this.f11178c.getChildAt(i));
        }
    }
}

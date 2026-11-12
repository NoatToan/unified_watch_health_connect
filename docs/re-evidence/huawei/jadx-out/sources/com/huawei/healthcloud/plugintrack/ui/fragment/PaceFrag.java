package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.PaceMapRecyclerViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.SpeedMapRecyclerViewAdapter;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.izn;
import defpackage.jpq;
import defpackage.njj;
import defpackage.njv;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PaceFrag extends SportResultBaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11050b;
    private String d;
    private boolean i;
    private float j;
    private List<njj> l;
    private float m;
    private List<njj> o;
    private Activity g = null;
    private HealthRecycleView n = null;
    private LinearLayout f = null;
    private boolean h = false;
    private PaceMapRecyclerViewAdapter k = null;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new RuntimeException("LayoutInflater not found.");
        }
        LogUtil.a("Track_PaceFrag", "onCreateView");
        if (i()) {
            return null;
        }
        g();
        this.g = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.track_show_pace_fragment, viewGroup, false);
        this.e = viewInflate;
        if (j()) {
            this.i = this.f11099c.be();
            this.l = this.f11099c.b(this.f11099c.d().requestSportType());
            HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.recycler_view);
            this.n = healthRecycleView;
            healthRecycleView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f11098a);
            linearLayoutManager.setOrientation(1);
            this.n.setLayoutManager(linearLayoutManager);
            this.f = (LinearLayout) viewInflate.findViewById(R.id.no_pace_layout);
            List<njj> listD = njv.d(this.l);
            izn.e(listD, this.l, this.f11099c);
            if (this.f11099c.a(1) || CollectionUtils.a(listD)) {
                LogUtil.a("Track_PaceFrag", "validPaceList length is zero");
                this.n.setVisibility(8);
                this.f.setVisibility(0);
            } else {
                e(listD);
                d(listD);
                return viewInflate;
            }
        }
        return viewInflate;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected String d() {
        return "Track_PaceFrag";
    }

    private void d(List<njj> list) {
        float fB = jpq.b(list, this.f11099c);
        Display defaultDisplay = this.g.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        b(fB, izn.e(this.f11098a, a(point)) - 78.0f, izn.a(this.f11099c) ? 120.0f : 80.0f);
    }

    private float a(Point point) {
        if (this.f11098a == null) {
            LogUtil.e("Track_PaceFrag", "mContext is null");
            return 0.0f;
        }
        if (qrs.af(this.f11098a)) {
            return point.x;
        }
        return Math.min(point.x, point.y);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        List<njj> list;
        super.onConfigurationChanged(configuration);
        LogUtil.a("Track_PaceFrag", "onConfigurationChanged isTahitiModel: ", Boolean.valueOf(qrs.af(getContext())));
        if (this.k != null && (list = this.l) != null) {
            d(njv.d(list));
        } else {
            LogUtil.j("Track_PaceFrag", "mPaceMapRecyclerViewAdapter is null");
        }
    }

    private void b(float f, float f2, float f3) {
        if (this.i) {
            this.n.setAdapter(new SpeedMapRecyclerViewAdapter(this.f11098a, this.o, this.d, this.f11050b, this.m, this.j, f2, f3, f, false, this.f11099c));
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        Map<Double, Double> mapRequestPartTimeMap = motionPathSimplifyD.requestPartTimeMap();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (mapRequestPartTimeMap == null || !mapRequestPartTimeMap.containsKey(Double.valueOf(21.0975d))) ? 0.0d : mapRequestPartTimeMap.get(Double.valueOf(21.0975d)).doubleValue();
        if (mapRequestPartTimeMap != null && mapRequestPartTimeMap.containsKey(Double.valueOf(42.195d))) {
            dDoubleValue = mapRequestPartTimeMap.get(Double.valueOf(42.195d)).doubleValue();
        }
        PaceMapRecyclerViewAdapter paceMapRecyclerViewAdapter = new PaceMapRecyclerViewAdapter(this.f11098a, this.o, this.d, this.f11050b, this.m, this.j, f2, f3, f, false, dDoubleValue2, dDoubleValue, motionPathSimplifyD.requestSportType(), this.h);
        this.k = paceMapRecyclerViewAdapter;
        this.n.setAdapter(paceMapRecyclerViewAdapter);
    }

    private void e(List<njj> list) {
        if (!l()) {
            LogUtil.j("Track_PaceFrag", "initData() mTrackDetailDataManager is null");
            return;
        }
        Float[] fArrB = njv.b(list);
        this.m = fArrB[0].floatValue();
        this.j = fArrB[1].floatValue();
        if (this.i) {
            this.f11050b = jpq.i(this.f11099c.d().requestAvgPace());
            this.d = jpq.h(this.m);
        } else {
            this.f11050b = izn.a(e());
            this.d = jpq.d(this.m);
        }
        if (e() < this.m) {
            this.h = true;
        }
        this.o = list;
    }

    private float e() {
        if (b(this.f11099c.d())) {
            if (UnitUtil.f()) {
                return ((float) UnitUtil.c(this.f11099c.d().requestAvgPace(), 2)) / 5.0f;
            }
            return this.f11099c.d().requestAvgPace();
        }
        if (UnitUtil.f()) {
            return this.f11099c.d().requestAvgPace() * 1.609344f;
        }
        return this.f11099c.d().requestAvgPace();
    }

    private boolean b(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify.requestSportType() == 274 && motionPathSimplify.requestSportDataSource() == 5;
    }
}

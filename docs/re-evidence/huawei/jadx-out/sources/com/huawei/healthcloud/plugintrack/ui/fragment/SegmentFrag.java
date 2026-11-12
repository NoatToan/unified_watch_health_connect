package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.HorizontalDetailActivity;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import defpackage.iov;
import defpackage.izn;
import defpackage.jai;
import defpackage.jmb;
import defpackage.jpj;
import defpackage.jpn;
import defpackage.lmf;
import defpackage.njy;
import defpackage.ntm;
import defpackage.nto;
import defpackage.ntp;
import defpackage.ntq;
import defpackage.ntr;
import defpackage.nts;
import defpackage.ntu;
import defpackage.ntw;
import defpackage.nub;
import defpackage.qpv;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SegmentFrag extends SportResultBaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CommonSegment f11071b;
    private static List<CommonSegment> d;
    private HealthButton f;
    private HealthTableWidget g;
    private HealthColumnSystem i;
    private int l;
    private float[] m;
    private jmb n;
    private LinearLayout o;
    private HealthTextView r;
    private HealthTextView t;
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> k = new qpv<>();
    private int j = 0;
    private boolean h = false;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new RuntimeException("LayoutInflater not found.");
        }
        LogUtil.a("Track_SegmentFrag", "onCreateView");
        if (i()) {
            return null;
        }
        g();
        if (!l() || !j()) {
            return null;
        }
        if (this.e != null) {
            return this.e;
        }
        this.i = new HealthColumnSystem(this.f11098a);
        this.e = layoutInflater.inflate(R.layout.track_segment_fragment, viewGroup, false);
        k();
        q();
        return this.e;
    }

    private void q() {
        o();
        m();
        s();
        n();
        h();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected int c() {
        int iRequestSportType = this.f11099c.d().requestSportType();
        return (iRequestSportType == 258 || iRequestSportType == 227) ? 4162 : -1;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected String d() {
        return "Track_SegmentFrag";
    }

    private void o() {
        this.o = (LinearLayout) this.e.findViewById(R.id.row_machine_lr_data_layout);
        if (izn.b(this.f11099c.d()).equals("291")) {
            r();
        } else {
            this.o.setVisibility(8);
        }
    }

    private void m() {
        if (this.f11099c.d().requestSportType() != 283) {
            return;
        }
        r();
        HealthTextView healthTextView = (HealthTextView) this.e.findViewById(R.id.total_action_group_title);
        HealthTextView healthTextView2 = (HealthTextView) this.e.findViewById(R.id.total_action_count_title);
        healthTextView.setText(R.string.IDS_rope_number_of_groups);
        healthTextView2.setText(R.string.ids_indoor_skipper_jump_accumulated_count);
    }

    private void r() {
        this.r = (HealthTextView) this.e.findViewById(R.id.total_action_group);
        this.t = (HealthTextView) this.e.findViewById(R.id.total_action_count);
        this.o.setVisibility(0);
        int extendDataInt = this.f11099c.d().getExtendDataInt("total_action_group");
        int iRequestTotalSteps = this.f11099c.d().requestTotalSteps();
        this.r.setText(UnitUtil.e(extendDataInt, 1, 0));
        this.t.setText(UnitUtil.e(iRequestTotalSteps, 1, 0));
    }

    private void s() {
        if (!jai.a(this.l) && !jai.c(this.l) && !nub.e(this.l)) {
            LogUtil.a("Track_SegmentFrag", "this sport type can't need to view detail, sport type: ", Integer.valueOf(this.l));
            return;
        }
        this.e.findViewById(R.id.view_detail_layout).setVisibility(0);
        this.f = (HealthButton) this.e.findViewById(R.id.btn_view_horizontal_detail);
        if (qrs.c((Activity) getActivity())) {
            this.f.setVisibility(8);
        } else {
            p();
        }
    }

    private void p() {
        HealthButton healthButton = this.f;
        if (healthButton == null) {
            LogUtil.j("Track_SegmentFrag", "setBtnViewDetailOnClickListener mBtnViewDetail is null.");
        } else {
            healthButton.setVisibility(0);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SegmentFrag.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.putExtra(BleConstants.SPORT_TYPE, SegmentFrag.this.f11099c.d().requestSportType());
                    intent.putExtra("fragment_tag", "segmentation");
                    intent.setClass(SegmentFrag.this.f11098a, HorizontalDetailActivity.class);
                    HashMap map = new HashMap(2);
                    map.put("click", 1);
                    map.put(BleConstants.SPORT_TYPE, Integer.valueOf(SegmentFrag.this.l));
                    lmf.d().c(SegmentFrag.this.f11098a, AnalyticsValue.BI_TRACK_ENTER_SEGMENT_DETAIL_1040063.value(), map, 0);
                    iov.d(SegmentFrag.this.f11098a, intent);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z) {
        HealthButton healthButton;
        super.onMultiWindowModeChanged(z);
        if (z && (healthButton = this.f) != null) {
            healthButton.setVisibility(8);
        } else {
            p();
        }
    }

    private void k() {
        d = this.f11099c.g().requestSegmentList();
        int iRequestSportType = this.f11099c.d().requestSportType();
        this.l = iRequestSportType;
        if (iRequestSportType == 140) {
            j(e());
            return;
        }
        if (iRequestSportType != 220) {
            if (iRequestSportType != 227) {
                if (iRequestSportType == 274) {
                    a(e());
                    return;
                }
                if (iRequestSportType != 283) {
                    if (iRequestSportType != 217 && iRequestSportType != 218) {
                        if (iRequestSportType != 258) {
                            if (iRequestSportType == 259) {
                                e(e());
                                return;
                            } else if (iRequestSportType == 279) {
                                d(e());
                                return;
                            } else if (iRequestSportType != 280) {
                                switch (iRequestSportType) {
                                }
                                return;
                            }
                        }
                    }
                    g(e());
                    return;
                }
                b(e());
                return;
            }
            h(e());
            return;
        }
        c(e());
    }

    public static List<CommonSegment> e() {
        if (d != null) {
            return new ArrayList(d);
        }
        return Collections.EMPTY_LIST;
    }

    public static CommonSegment a() {
        return f11071b;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HealthColumnSystem healthColumnSystem = this.i;
        if (healthColumnSystem == null || this.n == null) {
            return;
        }
        healthColumnSystem.b(this.f11098a);
        this.m = a(this.l);
        this.n.notifyLayoutChanged();
    }

    private void h(List<CommonSegment> list) {
        if (njy.b((Object) list, ntu.class)) {
            List listAsList = Arrays.asList((ntu[]) list.toArray(new ntu[list.size()]));
            int iF = jai.f(list);
            jai.a(this.k, iF);
            CommonSegment commonSegmentA = jai.a(this.f11099c.d());
            f11071b = commonSegmentA;
            this.h = jai.d((List<ntu>) listAsList, commonSegmentA);
            boolean zC = jai.c((List<ntu>) listAsList);
            ntu ntuVarC = null;
            long jD = 0;
            boolean z = false;
            for (int i = 0; i < listAsList.size(); i++) {
                if (((ntu) listAsList.get(i)).x()) {
                    z = true;
                }
                jD += d(((ntu) listAsList.get(i)).i());
                if (i == listAsList.size() - 1) {
                    ntuVarC = c((ntu) listAsList.get(i), jD, this.f11099c.d());
                } else {
                    ntuVarC = (ntu) listAsList.get(i);
                }
                jai.a(this.k, ntuVarC, iF, new SegmentHorizontalFrag.a(this.h, zC));
            }
            CommonSegment commonSegment = f11071b;
            if (commonSegment != null) {
                jai.d(this.k, (ntu) commonSegment, this.f11098a.getString(R.string.IDS_hw_motiontrack_segment_total), iF, new SegmentHorizontalFrag.a(this.h, zC));
            } else {
                jai.d(this.k, jai.e((List<ntu>) listAsList), this.f11098a.getString(R.string.IDS_hw_motiontrack_segment_total), iF, new SegmentHorizontalFrag.a(this.h, zC));
            }
            if (ntuVarC != null) {
                int fieldNum = ntuVarC.getFieldNum();
                if (!z) {
                    fieldNum -= ntuVarC.c();
                }
                this.j = fieldNum;
                if (iF == 1) {
                    this.j = fieldNum + 1;
                }
            }
        }
    }

    private long d(long j) {
        return (long) (UnitUtil.d(j / 100000.0d, 2) * 100.0d * 1000.0d);
    }

    private ntu c(ntu ntuVar, long j, MotionPathSimplify motionPathSimplify) {
        long jRequestTotalDistance = motionPathSimplify.requestTotalDistance() * 100;
        if (j > jRequestTotalDistance) {
            ntuVar.a(Math.max(0L, ntuVar.i() - (j - jRequestTotalDistance)));
            return ntuVar;
        }
        if (j < jRequestTotalDistance) {
            ntuVar.a(ntuVar.i() + (jRequestTotalDistance - j));
            return ntuVar;
        }
        ntuVar.a(ntuVar.i());
        return ntuVar;
    }

    private void a(List<CommonSegment> list) {
        if (!njy.b((Object) list, ntm.class)) {
            LogUtil.j("Track_SegmentFrag", "segmentList is not instanceof List<RowingMachineSegment>");
            return;
        }
        jai.d(this.k);
        ntm ntmVar = null;
        for (CommonSegment commonSegment : list) {
            if (commonSegment instanceof ntm) {
                ntmVar = (ntm) commonSegment;
                jai.e(this.k, ntmVar);
            }
        }
        if (ntmVar != null) {
            this.j = ntmVar.getFieldNum();
        }
    }

    private void b(List<CommonSegment> list) {
        if (!njy.b((Object) list, ntq.class)) {
            LogUtil.j("Track_SegmentFrag", "segmentList is not instanceof List<TrackJumpRopeSegment>");
            return;
        }
        LogUtil.a("Track_SegmentFrag", "initRopeSkippingData:", Integer.valueOf(list.size()));
        boolean zB = jai.b(list);
        jai.a(this.k, zB);
        ntq ntqVar = null;
        for (CommonSegment commonSegment : list) {
            if (commonSegment instanceof ntq) {
                ntqVar = (ntq) commonSegment;
                jai.a(this.k, ntqVar, zB);
            }
        }
        if (ntqVar != null) {
            this.j = ntqVar.getFieldNum();
        }
    }

    private void j(List<CommonSegment> list) {
        if (!njy.b((Object) list, ntw.class)) {
            LogUtil.j("Track_SegmentFrag", "segmentList is not instanceof List<TrackStrengthTrainingSegment>");
            return;
        }
        jai.b(this.k);
        Iterator<CommonSegment> it = list.iterator();
        ntw ntwVar = null;
        while (it.hasNext()) {
            ntwVar = (ntw) it.next();
            jai.e(this.k, ntwVar);
        }
        if (ntwVar != null) {
            this.j = ntwVar.getFieldNum();
        }
    }

    private void c(List<CommonSegment> list) {
        if (njy.b((Object) list, ntr.class)) {
            jai.e(this.k);
            Iterator<CommonSegment> it = list.iterator();
            ntr ntrVar = null;
            while (it.hasNext()) {
                ntrVar = (ntr) it.next();
                jai.a(this.k, ntrVar);
            }
            if (ntrVar != null) {
                this.j = ntrVar.getFieldNum();
            }
        }
    }

    private void e(List<CommonSegment> list) {
        if (njy.b((Object) list, ntp.class)) {
            jai.a(this.k);
            ArrayList arrayList = new ArrayList();
            Iterator<CommonSegment> it = list.iterator();
            ntp ntpVar = null;
            while (it.hasNext()) {
                ntpVar = (ntp) it.next();
                jai.c(this.k, ntpVar);
                arrayList.add(ntpVar);
            }
            if (ntpVar != null) {
                this.j = ntpVar.getFieldNum();
            }
            CommonSegment commonSegmentA = jai.a(this.f11099c.d());
            f11071b = commonSegmentA;
            ntp ntpVar2 = (ntp) commonSegmentA;
            if (commonSegmentA != null) {
                jai.b(this.k, ntpVar2, this.f11098a.getString(R.string.IDS_hw_motiontrack_segment_total));
            } else {
                jai.b(this.k, jai.d(arrayList), this.f11098a.getString(R.string.IDS_hw_motiontrack_segment_total));
            }
        }
    }

    private void g(List<CommonSegment> list) {
        if (njy.b((Object) list, nts.class)) {
            MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
            if (motionPathSimplifyD == null) {
                LogUtil.j("Track_SegmentFrag", "initSkiData with null parameter, pls check");
                return;
            }
            jai.a(this.k, false, this.l);
            Iterator<CommonSegment> it = list.iterator();
            nts ntsVar = null;
            while (it.hasNext()) {
                ntsVar = (nts) it.next();
                jai.c(this.k, ntsVar, false, motionPathSimplifyD.requestSportType());
            }
            if (ntsVar != null) {
                this.j = ntsVar.getFieldNum() - ntsVar.b();
            }
            f11071b = jai.a(this.f11099c.d());
        }
    }

    private void d(List<CommonSegment> list) {
        if (njy.b((Object) list, nto.class)) {
            jai.c(this.k);
            nto ntoVar = null;
            for (CommonSegment commonSegment : list) {
                if (commonSegment instanceof nto) {
                    ntoVar = (nto) commonSegment;
                    jai.e(this.k, ntoVar);
                }
            }
            if (ntoVar != null) {
                this.j = ntoVar.getFieldNum();
            }
        }
    }

    private void n() {
        this.g = (HealthTableWidget) this.e.findViewById(R.id.table_layout);
        this.m = a(this.l);
        jmb jmbVar = new jmb(getContext(), this.k, !LanguageUtil.f(BaseApplication.b())) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SegmentFrag.5
            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                if (SegmentFrag.this.m == null || i < 0 || i >= SegmentFrag.this.m.length) {
                    return super.getColumnWidth(i);
                }
                return qrs.d(SegmentFrag.this.f11098a, SegmentFrag.this.m[i]);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                if (jai.a(SegmentFrag.this.l) || jai.c(SegmentFrag.this.l)) {
                    return SegmentFrag.this.i.j() > 4 ? Math.min(super.getColumnCount(), Math.min(SegmentFrag.this.j, 10)) : Math.min(super.getColumnCount(), Math.min(SegmentFrag.this.j, 6));
                }
                return super.getColumnCount();
            }

            @Override // defpackage.jmb
            public int a() {
                if (SegmentFrag.this.l == 220) {
                    return qrs.d(SegmentFrag.this.f11098a, 12.0f);
                }
                return super.a();
            }
        };
        this.n = jmbVar;
        this.g.setAdapter(jmbVar);
    }

    private float[] a(int i) {
        if (i == 220) {
            return new float[]{54.0f, 64.0f, 64.0f, 64.0f, 64.0f};
        }
        if (nub.e(i)) {
            return new float[]{58.5f, 55.0f, 57.5f, 58.0f, 59.0f};
        }
        if (jai.c(i)) {
            return f();
        }
        if (i == 140) {
            return new float[]{29.76f, 54.56f, 39.68f, 37.2f, 43.4f, 43.4f};
        }
        if (i == 279) {
            return new float[]{58.5f, 55.0f, 57.5f, 58.0f};
        }
        if (jai.a(i)) {
            if (this.i.j() > 4) {
                return new float[]{78.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f, 61.5f, 77.0f};
            }
            return f();
        }
        return new float[0];
    }

    private float[] f() {
        if (LanguageUtil.f(BaseApplication.b())) {
            if (this.h) {
                return new float[]{35.0f, 65.0f, 44.0f, 46.0f, 45.0f, 40.0f};
            }
            return new float[]{40.0f, 55.0f, 50.0f, 50.0f, 45.0f, 38.0f};
        }
        return new float[]{59.75f, 53.75f, 47.5f, 50.75f, 52.0f, 49.0f};
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b();
    }

    private static void b() {
        d = null;
        f11071b = null;
    }
}

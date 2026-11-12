package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.HorizontalDetailActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.tablewidget.BaseViewHolder;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import defpackage.jai;
import defpackage.jmb;
import defpackage.jpj;
import defpackage.jpn;
import defpackage.njy;
import defpackage.ntp;
import defpackage.ntu;
import defpackage.qpv;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SegmentHorizontalFrag extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTableWidget f11073a;
    private Context e;
    private CommonSegment g;
    private jmb h;
    private List<CommonSegment> i;
    private float[] k;
    private View n;
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> o = new qpv<>();
    private List<CommonSegment> f = new ArrayList();
    private int j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11074b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f11075c = false;
    boolean d = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11078c;

        public a(boolean z, boolean z2) {
            this.f11077a = z;
            this.f11078c = z2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new RuntimeException("LayoutInflater not found.");
        }
        LogUtil.a("Track_SegmentHorizontalFrag", "onCreateView");
        FragmentActivity activity = getActivity();
        if (!(activity instanceof HorizontalDetailActivity)) {
            LogUtil.e("Track_SegmentHorizontalFrag", "Object is not instanceof HorizontalDetailActivity");
            return null;
        }
        HorizontalDetailActivity horizontalDetailActivity = (HorizontalDetailActivity) activity;
        this.e = horizontalDetailActivity;
        if (!c(horizontalDetailActivity)) {
            LogUtil.e("Track_SegmentHorizontalFrag", "getData failed");
            horizontalDetailActivity.finish();
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.track_horizontal_segment_fragment, viewGroup, false);
        this.f11073a = (HealthTableWidget) viewInflate.findViewById(R.id.table_layout);
        this.n = viewInflate.findViewById(R.id.tips_layout);
        c();
        this.k = b();
        d();
        BaseActivity.cancelLayoutById(viewInflate, this.f11073a);
        return viewInflate;
    }

    private float[] b() {
        if (jai.c(this.j)) {
            return new float[]{63.75f, 62.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f};
        }
        if (jai.a(this.j)) {
            return new float[]{63.75f, 62.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f, 61.5f, 77.0f, 70.5f, 70.5f, 70.5f};
        }
        return new float[0];
    }

    private boolean c(HorizontalDetailActivity horizontalDetailActivity) {
        Intent intent = horizontalDetailActivity.getIntent();
        if (intent == null) {
            LogUtil.e("Track_SegmentHorizontalFrag", "intent is null HorizontalDetailActivity");
            return false;
        }
        int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, -1);
        this.j = intExtra;
        if (intExtra == -1) {
            LogUtil.j("Track_SegmentHorizontalFrag", "intent sportType paras error: ", Integer.valueOf(intExtra));
            return false;
        }
        List<CommonSegment> listE = SegmentFrag.e();
        this.i = listE;
        if (!njy.e(listE)) {
            return true;
        }
        LogUtil.j("Track_SegmentHorizontalFrag", "get segment data list is empty");
        return false;
    }

    private void c() {
        int i = this.j;
        if (i == 227 || i == 280 || i == 258) {
            b(SegmentFrag.e());
        } else {
            if (i != 259) {
                return;
            }
            d(SegmentFrag.e());
        }
    }

    private void b(List<CommonSegment> list) {
        int fieldNum;
        if (njy.b((Object) list, ntu.class)) {
            List listAsList = Arrays.asList((ntu[]) list.toArray(new ntu[list.size()]));
            int iF = jai.f(list);
            CommonSegment commonSegmentA = SegmentFrag.a();
            this.g = commonSegmentA;
            this.f11075c = jai.d((List<ntu>) listAsList, commonSegmentA);
            boolean zC = jai.c((List<ntu>) listAsList);
            this.d = zC;
            jai.e(this.o, iF, new a(this.f11075c, zC));
            ntu ntuVar = null;
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                ntuVar = (ntu) list.get(i);
                if (ntuVar.x()) {
                    z = true;
                }
                jai.a(this.o, ntuVar, iF, new a(this.f11075c, this.d));
            }
            if (ntuVar != null) {
                if (z) {
                    fieldNum = ntuVar.getFieldNum();
                } else {
                    fieldNum = ntuVar.getFieldNum() - ntuVar.c();
                }
                this.f11074b = fieldNum;
                if (iF == 1) {
                    this.f11074b = fieldNum + 1;
                }
            }
            if (!this.d) {
                this.f11074b--;
            }
            CommonSegment commonSegment = this.g;
            if (commonSegment != null) {
                jai.d(this.o, (ntu) commonSegment, this.e.getString(R.string.IDS_hw_motiontrack_segment_total), iF, new a(this.f11075c, this.d));
            } else {
                jai.d(this.o, jai.e((List<ntu>) Arrays.asList((ntu[]) list.toArray(new ntu[list.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_total), iF, new a(this.f11075c, this.d));
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
            List<CommonSegment> list2 = this.f;
            jai.d(qpvVar, jai.e((List<ntu>) Arrays.asList((ntu[]) list2.toArray(new ntu[list2.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, new a(this.f11075c, this.d));
        }
    }

    private void d(List<CommonSegment> list) {
        if (njy.b((Object) list, ntp.class)) {
            jai.a(this.o);
            ntp ntpVar = null;
            for (CommonSegment commonSegment : list) {
                if (commonSegment instanceof ntp) {
                    ntpVar = (ntp) commonSegment;
                    jai.c(this.o, ntpVar);
                }
            }
            if (ntpVar != null) {
                this.f11074b = ntpVar.getFieldNum();
            }
            CommonSegment commonSegmentA = SegmentFrag.a();
            this.g = commonSegmentA;
            ntp ntpVar2 = (ntp) commonSegmentA;
            if (commonSegmentA != null) {
                jai.b(this.o, ntpVar2, this.e.getString(R.string.IDS_hw_motiontrack_segment_total));
            } else {
                jai.b(this.o, jai.d((List<ntp>) Arrays.asList((ntp[]) list.toArray(new ntp[list.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_total));
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
            List<CommonSegment> list2 = this.f;
            jai.b(qpvVar, jai.d((List<ntp>) Arrays.asList((ntp[]) list2.toArray(new ntp[list2.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int iF = jai.f(this.f);
        if (jai.a(this.j)) {
            if (this.i.size() == this.f.size()) {
                CommonSegment commonSegment = this.g;
                if (commonSegment instanceof ntu) {
                    qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
                    jai.c(qpvVar, qpvVar.getRowsCount() - 1, (ntu) commonSegment, this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, new a(this.f11075c, this.d));
                    return;
                }
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar2 = this.o;
            int rowsCount = qpvVar2.getRowsCount();
            List<CommonSegment> list = this.f;
            jai.c(qpvVar2, rowsCount - 1, jai.e((List<ntu>) Arrays.asList((ntu[]) list.toArray(new ntu[list.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, new a(this.f11075c, this.d));
            return;
        }
        if (jai.c(this.j)) {
            if (this.i.size() == this.f.size()) {
                CommonSegment commonSegment2 = this.g;
                if (commonSegment2 instanceof ntp) {
                    qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar3 = this.o;
                    jai.d(qpvVar3, qpvVar3.getRowsCount() - 1, (ntp) commonSegment2, this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal));
                    return;
                }
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar4 = this.o;
            int rowsCount2 = qpvVar4.getRowsCount();
            List<CommonSegment> list2 = this.f;
            jai.d(qpvVar4, rowsCount2 - 1, jai.d((List<ntp>) Arrays.asList((ntp[]) list2.toArray(new ntp[list2.size()]))), this.e.getString(R.string.IDS_hw_motiontrack_segment_subtotal));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (njy.e(this.f)) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
    }

    private void d() {
        this.h = new jmb(getContext(), this.o, !LanguageUtil.f(BaseApplication.b())) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFrag.5
            @Override // defpackage.jmb
            public int a() {
                return qrs.d(SegmentHorizontalFrag.this.e, 12.0f);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                return Math.min(super.getColumnCount(), SegmentHorizontalFrag.this.f11074b);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                int iC;
                int iD = qrs.d(SegmentHorizontalFrag.this.e, 2.0f);
                if (i < getRowHeaderNum()) {
                    BaseViewHolder baseViewHolderB = onCreateRowColumnHeaderViewHolder((ViewGroup) null);
                    onBindRowColumnHeaderViewHolder(baseViewHolderB, 0, i);
                    iC = SegmentHorizontalFrag.this.c(baseViewHolderB.getItemView());
                } else {
                    BaseViewHolder baseViewHolderE = onCreateColumnHeaderViewHolder((ViewGroup) null);
                    onBindColumnHeaderViewHolder(baseViewHolderE, 0, i);
                    iC = SegmentHorizontalFrag.this.c(baseViewHolderE.getItemView());
                }
                int i2 = iD + iC;
                return (SegmentHorizontalFrag.this.k == null || i < 0 || i >= SegmentHorizontalFrag.this.k.length) ? i2 : Math.max(qrs.d(SegmentHorizontalFrag.this.e, SegmentHorizontalFrag.this.k[i]), i2);
            }

            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                if (SegmentHorizontalFrag.this.k != null && SegmentHorizontalFrag.this.k.length > 0) {
                    float f = 0.0f;
                    for (float f2 : SegmentHorizontalFrag.this.k) {
                        f += f2;
                    }
                    if (qrs.d(SegmentHorizontalFrag.this.e, f) < qrs.q()) {
                        return 1;
                    }
                }
                if (getColumnCount() > 9) {
                    return super.getColumnWidthValueType();
                }
                return 1;
            }
        };
        a();
        this.f11073a.setAdapter(this.h);
    }

    private void a() {
        this.h.setOnItemClickListener(new HealthTableWidget.OnItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFrag.4
            @Override // com.huawei.ui.commonui.tablewidget.HealthTableWidget.OnItemClickListener
            public void onItemClick(int i, int i2) {
                int rowHeaderNum = i - SegmentHorizontalFrag.this.h.getRowHeaderNum();
                if (njy.c(SegmentHorizontalFrag.this.i, rowHeaderNum)) {
                    CommonSegment commonSegment = (CommonSegment) SegmentHorizontalFrag.this.i.get(rowHeaderNum);
                    if (SegmentHorizontalFrag.this.f.contains(commonSegment)) {
                        SegmentHorizontalFrag.this.f.remove(commonSegment);
                        SegmentHorizontalFrag.this.h.b(i);
                    } else {
                        SegmentHorizontalFrag.this.f.add(commonSegment);
                        SegmentHorizontalFrag.this.h.d(i);
                    }
                    SegmentHorizontalFrag.this.h.notifyRowChanged(i);
                    SegmentHorizontalFrag.this.e();
                    SegmentHorizontalFrag.this.h();
                    SegmentHorizontalFrag.this.h.notifyRowChanged(SegmentHorizontalFrag.this.h.getRowCount() - 1);
                }
            }
        });
    }

    int c(View view) {
        if (view == null) {
            LogUtil.j("Track_SegmentHorizontalFrag", "getViewWidth with null view, pls check");
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        HealthTableWidget healthTableWidget = this.f11073a;
        if (healthTableWidget != null) {
            healthTableWidget.a();
        }
    }
}

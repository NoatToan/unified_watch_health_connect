package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.HorizontalDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFragKt;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.jai;
import defpackage.jmb;
import defpackage.jpj;
import defpackage.jpn;
import defpackage.njy;
import defpackage.ntp;
import defpackage.nts;
import defpackage.ntu;
import defpackage.nub;
import defpackage.qpv;
import defpackage.qrs;
import defpackage.yzp;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcz;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010-\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010.\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0010\u00103\u001a\u00020\u00142\b\u00104\u001a\u0004\u0018\u00010\u0019J\b\u00105\u001a\u00020*H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R>\u0010\u0006\u001a2\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/huawei/healthcloud/plugintrack/ui/fragment/SegmentHorizontalFragKt;", "Lcom/huawei/ui/commonui/base/BaseFragment;", "<init>", "()V", "mContext", "Landroid/content/Context;", "mTableData", "Lcom/huawei/ui/commonui/tablewidget/model/BaseTableDataSet;", "Lcom/huawei/healthcloud/plugintrack/ui/fragment/module/TrackTableTitle;", "Lcom/huawei/healthcloud/plugintrack/ui/fragment/module/TrackTableContent;", "mHealthTableWidget", "Lcom/huawei/ui/commonui/tablewidget/HealthTableWidget;", "mTableAdapter", "Lcom/huawei/healthcloud/plugintrack/ui/adapter/SegmentTableAdapter;", "mSegmentList", "", "Lcom/huawei/hwsportmodel/CommonSegment;", "mSelectSegmentList", "", "mSportType", "", "mTableColumnWidth", "", "mColumnNum", "mTipsLayout", "Landroid/view/View;", "mSegmentTotal", "mIsShowMoreData", "", "mIsShowHour", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "getTableColumnWidth", "getData", "trackDetailActivity", "Lcom/huawei/healthcloud/plugintrack/ui/activity/HorizontalDetailActivity;", "initData", "", "initSkiData", "segmentList", "initRunningData", "initBikeData", "refreshSubTotalSegment", "refreshTips", "initAdapter", "initAdapterListener", "getViewWidth", "view", "initViewTahiti", "Companion", "PluginMotionTrack_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentHorizontalFragKt extends BaseFragment {
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTableWidget f11080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11081c;
    private Context d;
    private List<? extends CommonSegment> f;
    private CommonSegment h;
    private boolean j;
    private View k;
    private float[] l;
    private jmb m;
    private final qpv<jpj, jpn, jpn, jpn, jpn, jpn> o = new qpv<>();
    private final List<CommonSegment> i = new ArrayList();
    private int g = -1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/healthcloud/plugintrack/ui/fragment/SegmentHorizontalFragKt$Companion;", "", "<init>", "()V", "TAG", "", "PluginMotionTrack_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zcp.c(inflater, "");
        LogUtil.a("SegmentHorizontalFrag2", "onCreateView");
        FragmentActivity activity = getActivity();
        if (!(activity instanceof HorizontalDetailActivity)) {
            LogUtil.e("SegmentHorizontalFrag2", "Object is not instanceof HorizontalDetailActivity");
            return null;
        }
        this.d = activity;
        HorizontalDetailActivity horizontalDetailActivity = (HorizontalDetailActivity) activity;
        if (!a(horizontalDetailActivity)) {
            LogUtil.e("SegmentHorizontalFrag2", "getData failed");
            horizontalDetailActivity.finish();
            return null;
        }
        View viewInflate = inflater.inflate(R.layout.track_horizontal_segment_fragment, container, false);
        if (nub.e(this.g)) {
            ((CustomTitleBar) viewInflate.findViewById(R.id.titlebar)).setTitleText(getString(R.string.IDS_motiontrack_show_detail_ski_drop));
        }
        this.f11080b = (HealthTableWidget) viewInflate.findViewById(R.id.table_layout);
        this.k = viewInflate.findViewById(R.id.tips_layout);
        e();
        this.l = b();
        a();
        BaseActivity.cancelLayoutById(viewInflate, this.f11080b);
        return viewInflate;
    }

    private final float[] b() {
        if (jai.c(this.g)) {
            return new float[]{63.75f, 62.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f};
        }
        if (jai.a(this.g)) {
            return new float[]{63.75f, 62.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f, 61.5f, 77.0f, 70.5f, 70.5f, 70.5f};
        }
        return new float[0];
    }

    private final boolean a(HorizontalDetailActivity horizontalDetailActivity) {
        Intent intent = horizontalDetailActivity.getIntent();
        if (intent == null) {
            LogUtil.e("SegmentHorizontalFrag2", "intent is null HorizontalDetailActivity");
            return false;
        }
        int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, -1);
        this.g = intExtra;
        if (intExtra == -1) {
            LogUtil.j("SegmentHorizontalFrag2", "intent sportType paras error: ", Integer.valueOf(intExtra));
            return false;
        }
        List<CommonSegment> listE = SegmentFrag.e();
        this.f = listE;
        if (!njy.e(listE)) {
            return true;
        }
        LogUtil.j("SegmentHorizontalFrag2", "get segment data list is empty");
        return false;
    }

    private final void e() {
        int i = this.g;
        if (i != 258) {
            if (i == 259) {
                List<CommonSegment> listE = SegmentFrag.e();
                zcp.b((Object) listE, "");
                b(listE);
                return;
            } else if (i != 280) {
                if (nub.e(i)) {
                    List<CommonSegment> listE2 = SegmentFrag.e();
                    zcp.b((Object) listE2, "");
                    a(listE2);
                    return;
                }
                return;
            }
        }
        List<CommonSegment> listE3 = SegmentFrag.e();
        zcp.b((Object) listE3, "");
        d(listE3);
    }

    private final void a(List<? extends CommonSegment> list) {
        int iA;
        String str;
        long j;
        int iC;
        int i;
        int iC2;
        int iC3;
        SegmentHorizontalFragKt segmentHorizontalFragKt = this;
        if (njy.b((Object) list, nts.class)) {
            Iterator<? extends CommonSegment> it = list.iterator();
            while (true) {
                iA = -1;
                if (!it.hasNext()) {
                    break;
                }
                CommonSegment next = it.next();
                if (next instanceof nts) {
                    nts ntsVar = (nts) next;
                    int iA2 = ntsVar.a();
                    int iE = ntsVar.e();
                    long jV = ntsVar.v();
                    if (iA2 != -1 || iE != -1 || jV != -1) {
                        segmentHorizontalFragKt.j = true;
                        break;
                    }
                }
            }
            if (nub.a(segmentHorizontalFragKt.g)) {
                segmentHorizontalFragKt.j = true;
            }
            jai.a(segmentHorizontalFragKt.o, segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
            CommonSegment commonSegmentA = SegmentFrag.a();
            segmentHorizontalFragKt.h = commonSegmentA;
            nts ntsVar2 = (nts) commonSegmentA;
            if (ntsVar2 != null) {
                long jY = ntsVar2.y();
                long jG = ntsVar2.g();
                long jV2 = ntsVar2.v();
                Iterator<? extends CommonSegment> it2 = list.iterator();
                double dV = -1.0d;
                int i2 = -1;
                int iA3 = -1;
                float fL = -1.0f;
                long jB = -1;
                int iA4 = -1;
                int iA5 = -1;
                int iA6 = -1;
                int iM = -1;
                while (it2.hasNext()) {
                    it2 = it2;
                    CommonSegment next2 = it2.next();
                    jG = jG;
                    if (next2 instanceof nts) {
                        nts ntsVar3 = (nts) next2;
                        iA4 = jai.a(iA4, ntsVar3.u());
                        iA5 = jai.a(iA5, ntsVar3.k());
                        iA = jai.a(iA, ntsVar3.p());
                        iA3 = jai.a(iA3, ntsVar3.j());
                        int iA7 = jai.a(i2, ntsVar3.o());
                        iA6 = jai.a(iA6, ntsVar3.s());
                        if (ntsVar3.l() > fL) {
                            fL = ntsVar3.l();
                        }
                        if (ntsVar3.m() > iM) {
                            iM = ntsVar3.m();
                        }
                        jB = jai.b(jB, ntsVar3.v());
                        jai.c(segmentHorizontalFragKt.o, ntsVar3, segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
                        if (ntsVar3.e() != 0 && ntsVar3.e() != -1 && ntsVar3.v() != -1) {
                            dV += (ntsVar3.v() * 1000.0d) / ((double) ntsVar3.e());
                        }
                        i2 = iA7;
                    }
                }
                long j2 = jG;
                if (j2 == -1 || jY == 0 || jY == -1) {
                    j = -1;
                    iC = -1;
                } else {
                    iC = zcz.c(((double) 100) * UnitUtil.a((j2 * 1.0d) / jY));
                    j = -1;
                }
                long j3 = (jV2 == j || jV2 == 0) ? jB : jV2;
                if (j3 != j) {
                    int i3 = iA6;
                    iC2 = -1;
                    if (Math.abs(dV - ((double) (-1))) <= 9.999999974752427E-7d || Math.abs(dV) <= 9.999999974752427E-7d) {
                        i = i3;
                    } else {
                        double d = j3 / dV;
                        i = i3;
                        i2 = i2;
                        iC2 = zcz.c(((((double) 10) * Math.atan(d)) * ((double) 180)) / 3.141592653589793d);
                        iC3 = zcz.c(((double) 1000) * d);
                    }
                    ntsVar2.h(iM);
                    ntsVar2.a(iC);
                    ntsVar2.d(iC2);
                    ntsVar2.b(iC3);
                    ntsVar2.g(j3);
                    ntsVar2.o(iA4);
                    ntsVar2.c(iA5);
                    ntsVar2.g(iA);
                    ntsVar2.e(iA3);
                    ntsVar2.j(i2);
                    ntsVar2.f(i);
                    ntsVar2.d(fL);
                    segmentHorizontalFragKt = this;
                    jai.a(segmentHorizontalFragKt.o, ntsVar2, segmentHorizontalFragKt.getString(R.string.IDS_hw_motiontrack_segment_total), segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
                    str = "";
                } else {
                    i = iA6;
                    iC2 = -1;
                }
                iC3 = iC2;
                ntsVar2.h(iM);
                ntsVar2.a(iC);
                ntsVar2.d(iC2);
                ntsVar2.b(iC3);
                ntsVar2.g(j3);
                ntsVar2.o(iA4);
                ntsVar2.c(iA5);
                ntsVar2.g(iA);
                ntsVar2.e(iA3);
                ntsVar2.j(i2);
                ntsVar2.f(i);
                ntsVar2.d(fL);
                segmentHorizontalFragKt = this;
                jai.a(segmentHorizontalFragKt.o, ntsVar2, segmentHorizontalFragKt.getString(R.string.IDS_hw_motiontrack_segment_total), segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
                str = "";
            } else {
                qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = segmentHorizontalFragKt.o;
                List<? extends CommonSegment> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                for (CommonSegment commonSegment : list2) {
                    zcp.e(commonSegment, "");
                    arrayList.add((nts) commonSegment);
                }
                str = "";
                jai.a(qpvVar, jai.a(arrayList), segmentHorizontalFragKt.getString(R.string.IDS_hw_motiontrack_segment_total), segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar2 = segmentHorizontalFragKt.o;
            List<CommonSegment> list3 = segmentHorizontalFragKt.i;
            ArrayList arrayList2 = new ArrayList(yzp.e(list3, 10));
            for (CommonSegment commonSegment2 : list3) {
                zcp.e(commonSegment2, str);
                arrayList2.add((nts) commonSegment2);
            }
            jai.a(qpvVar2, jai.a(arrayList2), segmentHorizontalFragKt.getString(R.string.IDS_hw_motiontrack_segment_subtotal), segmentHorizontalFragKt.j, segmentHorizontalFragKt.g);
        }
    }

    private final void d(List<? extends CommonSegment> list) {
        int fieldNum;
        if (njy.b((Object) list, ntu.class)) {
            List<? extends CommonSegment> list2 = list;
            ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
            for (CommonSegment commonSegment : list2) {
                zcp.e(commonSegment, "");
                arrayList.add((ntu) commonSegment);
            }
            int iF = jai.f((List<CommonSegment>) list);
            jai.a(this.o, iF);
            CommonSegment commonSegmentA = SegmentFrag.a();
            this.h = commonSegmentA;
            this.f11081c = jai.d(arrayList, commonSegmentA);
            int size = list.size();
            ntu ntuVar = null;
            boolean z = false;
            for (int i = 0; i < size; i++) {
                CommonSegment commonSegment2 = list.get(i);
                zcp.e(commonSegment2, "");
                ntuVar = (ntu) commonSegment2;
                if (ntuVar.x()) {
                    z = true;
                }
                jai.e(this.o, ntuVar, iF, this.f11081c);
            }
            if (ntuVar != null) {
                if (z) {
                    fieldNum = ntuVar.getFieldNum();
                } else {
                    fieldNum = ntuVar.getFieldNum() - ntuVar.c();
                }
                this.f11079a = fieldNum;
                if (iF == 1) {
                    this.f11079a = fieldNum + 1;
                }
            }
            CommonSegment commonSegment3 = this.h;
            if (commonSegment3 != null) {
                zcp.e(commonSegment3, "");
                qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
                Context context = this.d;
                zcp.e(context);
                jai.e(qpvVar, (ntu) commonSegment3, context.getString(R.string.IDS_hw_motiontrack_segment_total), iF, this.f11081c);
            } else {
                qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar2 = this.o;
                ArrayList arrayList2 = new ArrayList(yzp.e(list2, 10));
                for (CommonSegment commonSegment4 : list2) {
                    zcp.e(commonSegment4, "");
                    arrayList2.add((ntu) commonSegment4);
                }
                ntu ntuVarE = jai.e(arrayList2);
                Context context2 = this.d;
                zcp.e(context2);
                jai.e(qpvVar2, ntuVarE, context2.getString(R.string.IDS_hw_motiontrack_segment_total), iF, this.f11081c);
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar3 = this.o;
            List<CommonSegment> list3 = this.i;
            ArrayList arrayList3 = new ArrayList(yzp.e(list3, 10));
            for (CommonSegment commonSegment5 : list3) {
                zcp.e(commonSegment5, "");
                arrayList3.add((ntu) commonSegment5);
            }
            ntu ntuVarE2 = jai.e(arrayList3);
            Context context3 = this.d;
            zcp.e(context3);
            jai.e(qpvVar3, ntuVarE2, context3.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, this.f11081c);
        }
    }

    private final void b(List<? extends CommonSegment> list) {
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
                this.f11079a = ntpVar.getFieldNum();
            }
            CommonSegment commonSegmentA = SegmentFrag.a();
            this.h = commonSegmentA;
            ntp ntpVar2 = (ntp) commonSegmentA;
            if (commonSegmentA != null) {
                qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
                Context context = this.d;
                zcp.e(context);
                jai.b(qpvVar, ntpVar2, context.getString(R.string.IDS_hw_motiontrack_segment_total));
            } else {
                qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar2 = this.o;
                List<? extends CommonSegment> list2 = list;
                ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
                for (CommonSegment commonSegment2 : list2) {
                    zcp.e(commonSegment2, "");
                    arrayList.add((ntp) commonSegment2);
                }
                ntp ntpVarD = jai.d(arrayList);
                Context context2 = this.d;
                zcp.e(context2);
                jai.b(qpvVar2, ntpVarD, context2.getString(R.string.IDS_hw_motiontrack_segment_total));
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar3 = this.o;
            List<CommonSegment> list3 = this.i;
            ArrayList arrayList2 = new ArrayList(yzp.e(list3, 10));
            for (CommonSegment commonSegment3 : list3) {
                zcp.e(commonSegment3, "");
                arrayList2.add((ntp) commonSegment3);
            }
            ntp ntpVarD2 = jai.d(arrayList2);
            Context context3 = this.d;
            zcp.e(context3);
            jai.b(qpvVar3, ntpVarD2, context3.getString(R.string.IDS_hw_motiontrack_segment_subtotal));
        }
    }

    private final void c() {
        int iF = jai.f(this.i);
        if (jai.a(this.g)) {
            List<? extends CommonSegment> list = this.f;
            zcp.e(list);
            if (list.size() == this.i.size()) {
                CommonSegment commonSegment = this.h;
                if (commonSegment instanceof ntu) {
                    zcp.e(commonSegment, "");
                    ntu ntuVar = (ntu) commonSegment;
                    qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar = this.o;
                    int rowsCount = qpvVar.getRowsCount();
                    Context context = this.d;
                    zcp.e(context);
                    jai.d(qpvVar, rowsCount - 1, ntuVar, context.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, this.f11081c);
                    return;
                }
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar2 = this.o;
            int rowsCount2 = qpvVar2.getRowsCount();
            List<CommonSegment> list2 = this.i;
            ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
            for (CommonSegment commonSegment2 : list2) {
                zcp.e(commonSegment2, "");
                arrayList.add((ntu) commonSegment2);
            }
            ntu ntuVarE = jai.e(arrayList);
            Context context2 = this.d;
            zcp.e(context2);
            jai.d(qpvVar2, rowsCount2 - 1, ntuVarE, context2.getString(R.string.IDS_hw_motiontrack_segment_subtotal), iF, this.f11081c);
            return;
        }
        if (jai.c(this.g)) {
            List<? extends CommonSegment> list3 = this.f;
            zcp.e(list3);
            if (list3.size() == this.i.size()) {
                CommonSegment commonSegment3 = this.h;
                if (commonSegment3 instanceof ntp) {
                    zcp.e(commonSegment3, "");
                    ntp ntpVar = (ntp) commonSegment3;
                    qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar3 = this.o;
                    int rowsCount3 = qpvVar3.getRowsCount();
                    Context context3 = this.d;
                    jai.d(qpvVar3, rowsCount3 - 1, ntpVar, context3 != null ? context3.getString(R.string.IDS_hw_motiontrack_segment_subtotal) : null);
                    return;
                }
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar4 = this.o;
            int rowsCount4 = qpvVar4.getRowsCount();
            List<CommonSegment> list4 = this.i;
            ArrayList arrayList2 = new ArrayList(yzp.e(list4, 10));
            for (CommonSegment commonSegment4 : list4) {
                zcp.e(commonSegment4, "");
                arrayList2.add((ntp) commonSegment4);
            }
            ntp ntpVarD = jai.d(arrayList2);
            Context context4 = this.d;
            jai.d(qpvVar4, rowsCount4 - 1, ntpVarD, context4 != null ? context4.getString(R.string.IDS_hw_motiontrack_segment_subtotal) : null);
            return;
        }
        if (nub.e(this.g)) {
            List<? extends CommonSegment> list5 = this.f;
            zcp.e(list5);
            if (list5.size() == this.i.size()) {
                CommonSegment commonSegment5 = this.h;
                if (commonSegment5 instanceof nts) {
                    zcp.e(commonSegment5, "");
                    nts ntsVar = (nts) commonSegment5;
                    qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar5 = this.o;
                    int rowsCount5 = qpvVar5.getRowsCount();
                    Context context5 = this.d;
                    jai.e(qpvVar5, rowsCount5 - 1, ntsVar, context5 != null ? context5.getString(R.string.IDS_hw_motiontrack_segment_subtotal) : null, this.j, this.g);
                    return;
                }
            }
            qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar6 = this.o;
            int rowsCount6 = qpvVar6.getRowsCount();
            List<CommonSegment> list6 = this.i;
            ArrayList arrayList3 = new ArrayList(yzp.e(list6, 10));
            for (CommonSegment commonSegment6 : list6) {
                zcp.e(commonSegment6, "");
                arrayList3.add((nts) commonSegment6);
            }
            nts ntsVarA = jai.a(arrayList3);
            Context context6 = this.d;
            jai.e(qpvVar6, rowsCount6 - 1, ntsVarA, context6 != null ? context6.getString(R.string.IDS_hw_motiontrack_segment_subtotal) : null, this.j, this.g);
        }
    }

    private final void g() {
        if (njy.e(this.i)) {
            View view = this.k;
            zcp.e(view);
            view.setVisibility(0);
        } else {
            View view2 = this.k;
            zcp.e(view2);
            view2.setVisibility(8);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/huawei/healthcloud/plugintrack/ui/fragment/SegmentHorizontalFragKt$initAdapter$1", "Lcom/huawei/healthcloud/plugintrack/ui/adapter/SegmentTableAdapter;", "getColumnWidth", "", "column", "getColumnWidthValueType", "PluginMotionTrack_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends jmb {
        b(Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z) {
            super(context, qpvVar, z);
        }

        @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
        public int getColumnWidth(int column) {
            int iA;
            int iD = qrs.d(SegmentHorizontalFragKt.this.d, 2.0f);
            if (column < getRowHeaderNum()) {
                jmb.c cVar = new jmb.c(LayoutInflater.from(SegmentHorizontalFragKt.this.requireContext()).inflate(com.huawei.health.servicesui.R.layout.item_header_rowcolumn, (ViewGroup) null, false));
                onBindRowColumnHeaderViewHolder(cVar, 0, column);
                iA = SegmentHorizontalFragKt.this.a(cVar.getItemView());
            } else {
                jmb.c cVar2 = new jmb.c(LayoutInflater.from(SegmentHorizontalFragKt.this.requireContext()).inflate(com.huawei.health.servicesui.R.layout.item_header_column, (ViewGroup) null, false));
                onBindColumnHeaderViewHolder(cVar2, 0, column);
                iA = SegmentHorizontalFragKt.this.a(cVar2.getItemView());
            }
            int i = iD + iA;
            if (SegmentHorizontalFragKt.this.l != null && column >= 0) {
                float[] fArr = SegmentHorizontalFragKt.this.l;
                zcp.e(fArr);
                if (column < fArr.length) {
                    Context context = SegmentHorizontalFragKt.this.d;
                    float[] fArr2 = SegmentHorizontalFragKt.this.l;
                    zcp.e(fArr2);
                    return (int) Math.max(qrs.d(context, fArr2[column]), i);
                }
            }
            return i;
        }

        @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
        public int getColumnWidthValueType() {
            if (SegmentHorizontalFragKt.this.l != null) {
                float[] fArr = SegmentHorizontalFragKt.this.l;
                zcp.e(fArr);
                if (fArr.length > 0) {
                    float[] fArr2 = SegmentHorizontalFragKt.this.l;
                    zcp.e(fArr2);
                    float f = 0.0f;
                    for (float f2 : fArr2) {
                        f += f2;
                    }
                    if (qrs.d(SegmentHorizontalFragKt.this.d, f) < qrs.q()) {
                        return 1;
                    }
                }
            }
            if (getColumnCount() > 11) {
                return super.getColumnWidthValueType();
            }
            return 1;
        }
    }

    private final void a() {
        this.m = new b(requireContext(), this.o, !LanguageUtil.f(BaseApplication.b()));
        d();
        HealthTableWidget healthTableWidget = this.f11080b;
        if (healthTableWidget != null) {
            healthTableWidget.setAdapter(this.m);
        }
    }

    private final void d() {
        jmb jmbVar = this.m;
        zcp.e(jmbVar);
        jmbVar.setOnItemClickListener(new HealthTableWidget.OnItemClickListener() { // from class: jns
            @Override // com.huawei.ui.commonui.tablewidget.HealthTableWidget.OnItemClickListener
            public final void onItemClick(int i, int i2) {
                SegmentHorizontalFragKt.a(this.f38758c, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SegmentHorizontalFragKt segmentHorizontalFragKt, int i, int i2) {
        jmb jmbVar = segmentHorizontalFragKt.m;
        zcp.e(jmbVar);
        int rowHeaderNum = i - jmbVar.getRowHeaderNum();
        if (njy.c(segmentHorizontalFragKt.f, rowHeaderNum)) {
            List<? extends CommonSegment> list = segmentHorizontalFragKt.f;
            zcp.e(list);
            CommonSegment commonSegment = list.get(rowHeaderNum);
            if (segmentHorizontalFragKt.i.contains(commonSegment)) {
                segmentHorizontalFragKt.i.remove(commonSegment);
                jmb jmbVar2 = segmentHorizontalFragKt.m;
                zcp.e(jmbVar2);
                jmbVar2.b(i);
            } else {
                segmentHorizontalFragKt.i.add(commonSegment);
                jmb jmbVar3 = segmentHorizontalFragKt.m;
                zcp.e(jmbVar3);
                jmbVar3.d(i);
            }
            jmb jmbVar4 = segmentHorizontalFragKt.m;
            zcp.e(jmbVar4);
            jmbVar4.notifyRowChanged(i);
            segmentHorizontalFragKt.c();
            segmentHorizontalFragKt.g();
            jmb jmbVar5 = segmentHorizontalFragKt.m;
            zcp.e(jmbVar5);
            jmb jmbVar6 = segmentHorizontalFragKt.m;
            zcp.e(jmbVar6);
            jmbVar5.notifyRowChanged(jmbVar6.getRowCount() - 1);
        }
    }

    public final int a(View view) {
        if (view == null) {
            LogUtil.j("SegmentHorizontalFrag2", "getViewWidth with null view, pls check");
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        HealthTableWidget healthTableWidget = this.f11080b;
        if (healthTableWidget != null) {
            healthTableWidget.a();
        }
    }
}

package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.request.transition.Transition;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.JudgeRootBean;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.ShareInitCallback;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.model.TrackLineChartHolderImpl;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.TrackDetailItemDrawer;
import com.huawei.healthcloud.plugintrack.ui.sporttypeconfig.bean.HwSportTypeInfo;
import com.huawei.healthcloud.plugintrack.ui.view.AltitudeSlopeIntervalShare;
import com.huawei.healthcloud.plugintrack.ui.view.DetailItemContainer;
import com.huawei.healthcloud.plugintrack.ui.view.PaceIntervalShare;
import com.huawei.healthcloud.plugintrack.ui.view.PistePercentageView;
import com.huawei.healthcloud.plugintrack.ui.view.PowerIntervalShareView;
import com.huawei.healthcloud.plugintrack.ui.view.RunRouteView;
import com.huawei.healthcloud.plugintrack.ui.view.SkippingPerformanceView;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.healthcloud.plugintrack.ui.view.TimePercentageView;
import com.huawei.healthcloud.plugintrack.ui.view.TrackShareDetailCustomTitleLayout;
import com.huawei.healthcloud.plugintrack.ui.view.TrackShareDetailMapAndDetail;
import com.huawei.healthcloud.plugintrack.ui.view.TrackShareViewGroup;
import com.huawei.healthcloud.plugintrack.ui.view.TriathlonShareViewGroup;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CourseActionViewHolder;
import com.huawei.healthcloud.plugintrack.ui.viewholder.RopeSkippingHolder;
import com.huawei.healthcloud.plugintrack.ui.viewholder.RowingMachineHolder;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackChartViewHolder;
import com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.een;
import defpackage.gdm;
import defpackage.gdq;
import defpackage.gdr;
import defpackage.gdw;
import defpackage.gzv;
import defpackage.gzz;
import defpackage.izn;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jbr;
import defpackage.jbt;
import defpackage.jdb;
import defpackage.jpq;
import defpackage.jpz;
import defpackage.jqg;
import defpackage.jqp;
import defpackage.jqq;
import defpackage.jqs;
import defpackage.jry;
import defpackage.jsi;
import defpackage.jtd;
import defpackage.jto;
import defpackage.juf;
import defpackage.jvu;
import defpackage.jxq;
import defpackage.jxu;
import defpackage.njj;
import defpackage.njv;
import defpackage.njy;
import defpackage.nub;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackShareAllDataFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11171c;
    private int d;
    private List<PostureJudgeBean> h;
    private TrackShareDetailMapAndDetail i;
    private RunRouteView n;
    private ShareInitCallback o;
    private View s;
    private jqp t = null;
    private Context e = null;
    private TrackShareViewGroup l = null;
    private HealthScrollView k = null;
    private Resources m = null;
    private List<String> q = new ArrayList();
    private int g = 16;
    private int p = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11170b = 100;
    private Bundle f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jtd f11169a = null;
    private final String r = "viewTask";
    private boolean j = false;

    private boolean b(int i, float f, float f2, int i2) {
        return ((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) >= 0 || (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1)) >= 0) || (i > 0 || i2 > 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_TrackShareAllDataFragment", "onCreate");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (layoutInflater == null) {
            throw new AssertionError("LayoutInflater not found.");
        }
        LogUtil.a("Track_TrackShareAllDataFragment", "onCreateView");
        this.f = getArguments();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_track_share_all_data, viewGroup, false);
        FragmentActivity activity = getActivity();
        this.e = activity;
        this.m = activity.getResources();
        this.g = qrs.d(this.e, 16.0f);
        this.q.add("viewTask");
        this.l = (TrackShareViewGroup) viewInflate.findViewById(R.id.track_scrollview_share);
        this.k = (HealthScrollView) viewInflate.findViewById(R.id.track_share_all_data_scroll);
        this.s = viewInflate.findViewById(R.id.track_share_all_white);
        jqp jqpVarD = jbr.c().d();
        this.t = jqpVarD;
        if (jqpVarD == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "mTrackDetailDataManager is null");
            return null;
        }
        int iD = qrs.d(this.e, 250.0f);
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            i = bundle2.getInt("allDataWidth", iD);
            this.f11171c = this.f.getInt("allDataHeight", qrs.d(this.e, 400.0f));
        } else {
            this.f11171c = qrs.d(this.e, 250.0f);
            i = iD;
        }
        this.d = qrs.d(this.e, (i / iD) * 380.0f);
        c(i);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        List<String> list = this.q;
        if (list != null) {
            list.remove(str);
        }
        if (!njy.e(this.q) || this.o == null) {
            return;
        }
        LogUtil.a("Track_TrackShareAllDataFragment", "ShareInitCallback is finish");
        this.o.onFinish();
    }

    private void c(int i) {
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = this.f11171c;
        this.k.setLayoutParams(layoutParams);
        Object systemService = this.e.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e("Track_TrackShareAllDataFragment", "object is not instanceof WindowManager");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        ViewGroup.LayoutParams layoutParams2 = this.l.getLayoutParams();
        layoutParams2.width = i2;
        this.l.setLayoutParams(layoutParams2);
        at();
        bb();
        ax();
        final float f = (i * 1.0f) / i2;
        b(i2);
        this.l.setScaleX(f);
        this.l.setScaleY(f);
        this.k.setScrollViewListener(new ScrollViewListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment.2
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public void onScrollChanged(HealthScrollView healthScrollView, int i3, int i4, int i5, int i6) {
                int measuredHeight;
                if (TrackShareAllDataFragment.this.l == null || TrackShareAllDataFragment.this.k.getScrollY() <= (measuredHeight = ((int) (TrackShareAllDataFragment.this.l.getMeasuredHeight() * f)) - TrackShareAllDataFragment.this.d)) {
                    return;
                }
                TrackShareAllDataFragment.this.k.setScrollY(measuredHeight);
            }
        });
        this.k.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment.5
            @Override // java.lang.Runnable
            public void run() {
                if (TrackShareAllDataFragment.this.l.getMeasuredHeight() * f < TrackShareAllDataFragment.this.f11171c) {
                    ViewGroup.LayoutParams layoutParams3 = TrackShareAllDataFragment.this.s.getLayoutParams();
                    layoutParams3.height = (int) ((TrackShareAllDataFragment.this.f11171c - (TrackShareAllDataFragment.this.l.getMeasuredHeight() * f)) / 2.0f);
                    TrackShareAllDataFragment.this.s.setLayoutParams(layoutParams3);
                }
                TrackShareAllDataFragment.this.b("viewTask");
            }
        });
    }

    private void b(int i) {
        if (LanguageUtil.ba(this.e)) {
            this.l.setPivotX(i);
            this.l.setPivotY(0.0f);
        } else {
            this.l.setPivotX(0.0f);
            this.l.setPivotY(0.0f);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_TrackShareAllDataFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_TrackShareAllDataFragment", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        LogUtil.a("Track_TrackShareAllDataFragment", "onDetach");
    }

    private void at() {
        this.f11170b = 100;
        this.p = 100;
        Context context = this.e;
        if (context != null && qqs.e(context)) {
            this.j = true;
        }
        if (this.j) {
            this.p = 101;
        }
        au();
    }

    private void ax() {
        int i = this.f11170b;
        if (i == 101 || i == 102) {
            this.l.setAllChildViewBackgroudSource(R.drawable.track_share_device_card_bg, 0);
            this.l.setBackgroundResource(R.drawable.track_share_watch_all_bg);
        } else if (this.j) {
            this.l.setAllChildViewBackgroudSource(R.drawable.track_share_device_card_bg, 1);
            this.l.setBackgroundResource(R.drawable.track_share_watch_all_bg);
        } else {
            this.l.setAllChildViewBackgroudSource(R.drawable.track_share_app_card_bg, 0);
            this.l.setBackgroundColor(this.m.getColor(R.color.hw_show_health_share_bg));
        }
        this.i.i();
    }

    private void bb() {
        if (this.l == null) {
            return;
        }
        if (this.t.d().requestSportType() == 512) {
            bc();
            return;
        }
        s();
        aj();
        y();
        int iRequestSportType = this.t.d().requestSportType();
        if (ay()) {
            p();
            v();
            t();
            q();
        }
        z();
        if (jaa.a(this.t.d())) {
            r();
        }
        l();
        k();
        ag();
        g();
        am();
        ae();
        if (!ay() && iRequestSportType != 265 && !jpq.i(iRequestSportType)) {
            af();
        }
        ak();
        j();
        d();
        u();
        w();
        c();
        ao();
        ai();
        ah();
        a();
        ad();
        an();
        al();
        x();
        ac();
        aa();
        ab();
        h();
    }

    private void bc() {
        s();
        b(this.t.m());
        d(this.t.m());
        h();
    }

    private void ac() {
        if (izn.b(this.t.d()).equals("291")) {
            RowingMachineHolder rowingMachineHolder = new RowingMachineHolder(this.e);
            rowingMachineHolder.b(this.t.g().requestSegmentList());
            this.l.addView(rowingMachineHolder.e());
        }
    }

    private void aa() {
        if (this.t.d().requestSportType() == 283) {
            MotionData motionDataG = this.t.g();
            if (motionDataG == null) {
                LogUtil.e("Track_TrackShareAllDataFragment", "drawRopeSkippingView motionData is null");
                return;
            }
            List<CommonSegment> listRequestSegmentList = motionDataG.requestSegmentList();
            if (njy.e(listRequestSegmentList)) {
                LogUtil.j("Track_TrackShareAllDataFragment", "drawRopeSkippingView is not intermittent jump");
                return;
            }
            RopeSkippingHolder ropeSkippingHolder = new RopeSkippingHolder(this.e);
            ropeSkippingHolder.b(listRequestSegmentList);
            this.l.addView(ropeSkippingHolder.d());
        }
    }

    private void ab() {
        if (this.t.bb()) {
            SkippingPerformanceView skippingPerformanceView = new SkippingPerformanceView(this.e);
            skippingPerformanceView.b();
            skippingPerformanceView.setIsSingleRecord(true);
            Pair<float[], float[]> pairC = this.t.c();
            if (pairC != null) {
                skippingPerformanceView.setData(pairC.first, pairC.second, true);
            }
            Pair<float[], float[]> pairE = this.t.e();
            skippingPerformanceView.getRadarView().setTextSize(qrs.d(this.e, 10.0f));
            if (pairE != null) {
                skippingPerformanceView.setData(pairE.first, pairE.second, false);
            }
            skippingPerformanceView.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
            this.l.addView(skippingPerformanceView);
        }
    }

    private void b(List<jbt> list) {
        if (list != null) {
            TrackLineChartHolderImpl trackLineChartHolderImpl = new TrackLineChartHolderImpl(this.e.getApplicationContext());
            jqs jqsVar = new jqs(trackLineChartHolderImpl, this.t);
            for (jbt jbtVar : list) {
                if (jbtVar.b() != null && jbtVar.c() != null) {
                    e(jqsVar, jbtVar);
                }
            }
            TrackLineChartHolder.setInstance(trackLineChartHolderImpl);
        }
    }

    private void e(jqs jqsVar, jbt jbtVar) {
        int iRequestSportType = jbtVar.b().requestSportType();
        if (iRequestSportType == 258) {
            jqsVar.d(SportDetailChartDataType.HEART_RATE, jbtVar.b(), jbtVar.c());
            return;
        }
        if (iRequestSportType == 259) {
            jqsVar.d(SportDetailChartDataType.SPEED_RATE, jbtVar.b(), jbtVar.c());
        } else if (iRequestSportType == 262 || iRequestSportType == 266) {
            jqsVar.d(SportDetailChartDataType.REALTIME_PACE, jbtVar.b(), jbtVar.c());
        }
    }

    private void d(List<jbt> list) {
        if (list == null) {
            LogUtil.e("Track_TrackShareAllDataFragment", "drawAllItemOfTriathlon DetailInfoExtList is null");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).b() != null && list.get(i).c() != null) {
                e(list.get(i).b(), list.get(i).c());
            } else {
                e(list.get(i));
            }
            if (i != list.size() - 1) {
                a(list.get(i));
            }
        }
    }

    private void a(jbt jbtVar) {
        View viewInflate = View.inflate(this.e, R.layout.triathlon_change, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.change_name);
        healthTextView.setText(String.format(BaseApplication.getContext().getString(R.string.IDS_motiontrack_show_detail_change_sport), jpq.e(jbtVar.e().getChangeIntervalTime())));
        if (this.f11170b == 100) {
            healthTextView.setTextColor(getResources().getColor(R.color.textColorPrimary));
        }
        this.l.addView(viewInflate);
    }

    private void e(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        TriathlonShareViewGroup triathlonShareViewGroup = new TriathlonShareViewGroup(this.e, this.p);
        a(triathlonShareViewGroup, motionPathSimplify);
        d(triathlonShareViewGroup, motionPathSimplify, motionPath);
        a(triathlonShareViewGroup, motionPathSimplify, motionPath);
        this.l.addView(triathlonShareViewGroup, layoutParams);
    }

    private void e(jbt jbtVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        TriathlonShareViewGroup triathlonShareViewGroup = new TriathlonShareViewGroup(this.e, this.p);
        a(triathlonShareViewGroup, jbtVar);
        c(triathlonShareViewGroup, jbtVar);
        this.l.addView(triathlonShareViewGroup, layoutParams);
    }

    private Bitmap ar() {
        if (new SecureRandom().nextInt(2) + 1 == 1) {
            return BitmapFactory.decodeResource(getResources(), R.drawable.basket_share_title5);
        }
        return BitmapFactory.decodeResource(getResources(), R.drawable.basket_share_title8);
    }

    private void s() {
        Bitmap bitmapB;
        this.i = new TrackShareDetailMapAndDetail(this.e, this.p);
        int iRequestSportType = this.t.d().requestSportType();
        if (ay()) {
            this.i.d().e();
            bitmapB = (!LanguageUtil.l(this.e) || Utils.o()) ? null : ar();
        } else {
            bitmapB = jbr.c().b();
        }
        if (bitmapB == null) {
            g(this.i);
        } else {
            this.i.setImgMap(bitmapB, iRequestSportType, this.t.ba());
            this.i.setLayoutStyle(this.f11170b, true, iRequestSportType);
        }
        d(this.i);
        c(bitmapB);
        av();
        e(this.i);
        b(this.i);
        a(this.i);
        c(this.i);
        be();
        if (nub.b(iRequestSportType) && !this.t.a(0)) {
            this.i.b(this.t.d());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = this.m.getDimensionPixelOffset(R.dimen.textParagraphMarginXS);
        this.i.setLayoutParams(layoutParams);
        this.l.addView(this.i);
    }

    private void be() {
        TrackShareDetailMapAndDetail trackShareDetailMapAndDetail = this.i;
        if (trackShareDetailMapAndDetail != null) {
            jqp jqpVar = this.t;
            if (jqpVar != null) {
                trackShareDetailMapAndDetail.a(jqpVar.d());
            } else {
                trackShareDetailMapAndDetail.a((MotionPathSimplify) null);
            }
        }
    }

    private void c(Bitmap bitmap) {
        if (this.t.d().requestSportType() == 512) {
            this.i.setShowPaceVisibility(8);
            this.i.setDivideLineVisibility(0);
            return;
        }
        if (ay()) {
            this.i.setShowPaceVisibility(8);
            this.i.setDivideLineVisibility(8);
            return;
        }
        if (bitmap == null) {
            this.i.setShowPaceVisibility(8);
            this.i.setDivideLineVisibility(8);
            return;
        }
        List<njj> listBg = this.t.bg();
        if (listBg != null && listBg.size() >= 2 && this.t.c(this.e)) {
            Float[] fArrA = this.t.a(listBg);
            if (fArrA != null && fArrA.length >= 2) {
                this.i.setMaxAndMinPaceVisibility(0);
                c(this.t.d().requestSportType(), njv.b(listBg));
                return;
            } else {
                this.i.setShowPaceVisibility(8);
                this.i.setDivideLineVisibility(0);
                return;
            }
        }
        this.i.setShowPaceVisibility(8);
        this.i.setDivideLineVisibility(8);
    }

    private void av() {
        TrackShareDetailCustomTitleLayout trackShareDetailCustomTitleLayoutD = this.i.d();
        if (trackShareDetailCustomTitleLayoutD != null) {
            MotionPathSimplify motionPathSimplifyD = this.t.d();
            trackShareDetailCustomTitleLayoutD.setSportStartTime(UnitUtil.d("yyyy/M/d H:mm", motionPathSimplifyD.requestStartTime()));
            String extendDataString = motionPathSimplifyD.getExtendDataString("alias");
            if (!TextUtils.isEmpty(extendDataString)) {
                trackShareDetailCustomTitleLayoutD.setTextSportType(extendDataString);
            } else if (motionPathSimplifyD.requestRunCourseId() != null) {
                String strD = jaa.d(this.e, this.t.d().requestRunCourseId(), this.t.d().getExtendDataString("courseName", ""));
                if (TextUtils.isEmpty(strD)) {
                    trackShareDetailCustomTitleLayoutD.setTextSportType(jaa.d(this.e, motionPathSimplifyD.requestSportType()));
                } else {
                    trackShareDetailCustomTitleLayoutD.setTextSportType(strD);
                }
            } else if (jaa.a(motionPathSimplifyD)) {
                trackShareDetailCustomTitleLayoutD.setTextSportType(getString(R.string.IDS_lactate_threshold_measurement));
            } else if (this.t.ba()) {
                trackShareDetailCustomTitleLayoutD.setTextSportType(getString(R.string.IDS_track_route_draw_sport_graffiti));
            } else if (motionPathSimplifyD.requestSportType() == 227) {
                trackShareDetailCustomTitleLayoutD.setTextSportType(jqq.e(motionPathSimplifyD.requestExtendDataMap()));
            } else {
                trackShareDetailCustomTitleLayoutD.setTextSportType(jaa.d(this.e, motionPathSimplifyD.requestSportType()));
            }
            c(trackShareDetailCustomTitleLayoutD, motionPathSimplifyD);
        }
    }

    private void c(int i, Float[] fArr) {
        String strE = e(fArr[0], i);
        String strE2 = e(fArr[1], i);
        if (jpq.i(i) && jpq.e(this.t)) {
            if (jpq.d(this.t)) {
                strE2 = jpq.a(this.t, false);
                strE = jpq.e(this.t, false);
            } else {
                this.i.setMaxAndMinPaceVisibility(8);
            }
        }
        b(strE2, strE, i, this.e);
        MotionPath motionPathB = this.t.b();
        if (motionPathB != null) {
            Float[] fArrB = njv.b(motionPathB.requestPaceList());
            this.i.setImgPaceGradientColors(izt.a(fArrB[1].floatValue(), fArrB[0].floatValue(), i));
        }
    }

    private String e(Float f, int i) {
        String strA = izn.a(f.floatValue());
        if (jpq.i(i)) {
            return jpq.h(f.floatValue());
        }
        if (i == 266 || i == 262) {
            return jpq.h(f.floatValue() / 10.0f);
        }
        LogUtil.d("Track_TrackShareAllDataFragment", "not show speed");
        return strA;
    }

    private void b(String str, String str2, int i, Context context) {
        if (jpq.i(i) && context != null && str != null && str2 != null) {
            StringBuffer stringBuffer = new StringBuffer(str);
            StringBuffer stringBuffer2 = new StringBuffer(str2);
            stringBuffer.append(" ");
            stringBuffer2.append(" ");
            if (UnitUtil.f()) {
                stringBuffer.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
                stringBuffer2.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
            } else {
                stringBuffer.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
                stringBuffer2.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
            }
            String string = stringBuffer.toString();
            str2 = stringBuffer2.toString();
            str = string;
        }
        this.i.setMaxAndMinPace(str, str2);
    }

    private void g(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        trackShareDetailMapAndDetail.g();
        trackShareDetailMapAndDetail.setLayoutStyle(this.f11170b, false, this.t.d().requestSportType());
    }

    private void e(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        int iRequestSportType = this.t.d().requestSportType();
        int iRequestDeviceType = this.t.d().requestDeviceType();
        int iRequestTrackType = this.t.d().requestTrackType();
        int iRequestSportDataSource = this.t.d().requestSportDataSource();
        int iA = SportSupportUtil.a(iRequestTrackType, iRequestDeviceType);
        jaa.d(this.e);
        if (iRequestDeviceType == 46) {
            trackShareDetailMapAndDetail.setImgDevice(R.drawable.track_watch2_logo);
            trackShareDetailMapAndDetail.setTextDeviceVisibility(8);
            return;
        }
        if (ay()) {
            trackShareDetailMapAndDetail.setImgDeviceVisibility(8);
            trackShareDetailMapAndDetail.setTextDeviceVisibility(0);
            Context context = this.e;
            trackShareDetailMapAndDetail.setTextDevice(0, een.e(iRequestDeviceType, context, context.getPackageName(), this.t.d().requestProductId(), this.t.d().requestSubProductId()), iRequestSportType);
            return;
        }
        if (iRequestSportType == 283 && iRequestSportDataSource == 5) {
            String strAp = ap();
            if (TextUtils.isEmpty(strAp)) {
                trackShareDetailMapAndDetail.setTextDeviceVisibility(8);
                return;
            } else {
                trackShareDetailMapAndDetail.setVisibility(0);
                trackShareDetailMapAndDetail.setTextDevice(strAp);
                return;
            }
        }
        if (this.f11170b == 100) {
            trackShareDetailMapAndDetail.setImgDeviceVisibility(8);
            if (iA == 0) {
                String strB = jxq.b(this.t.d());
                if (TextUtils.isEmpty(strB)) {
                    trackShareDetailMapAndDetail.setTextDeviceVisibility(8);
                    return;
                } else {
                    trackShareDetailMapAndDetail.setVisibility(0);
                    trackShareDetailMapAndDetail.setTextDevice(strB);
                    return;
                }
            }
            trackShareDetailMapAndDetail.setTextDeviceVisibility(0);
            Context context2 = this.e;
            trackShareDetailMapAndDetail.setTextDevice(een.e(iRequestDeviceType, context2, context2.getPackageName(), this.t.d().requestProductId(), this.t.d().requestSubProductId()));
            return;
        }
        e(trackShareDetailMapAndDetail, iRequestDeviceType, iRequestSportType);
    }

    private String ap() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("device_name", 0);
        return sharedPreferences != null ? sharedPreferences.getString("device_name_key", "") : "";
    }

    private void e(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail, int i, int i2) {
        if (trackShareDetailMapAndDetail.e(i) == 0) {
            trackShareDetailMapAndDetail.setImgDeviceVisibility(0);
            trackShareDetailMapAndDetail.setTextDeviceVisibility(8);
        } else {
            trackShareDetailMapAndDetail.setImgDeviceVisibility(8);
            trackShareDetailMapAndDetail.setTextDeviceVisibility(0);
            Context context = this.e;
            trackShareDetailMapAndDetail.setTextDevice(0, een.e(i, context, context.getPackageName(), this.t.d().requestProductId(), this.t.d().requestSubProductId()), i2);
        }
    }

    private void c(TrackShareDetailCustomTitleLayout trackShareDetailCustomTitleLayout, MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null || ay()) {
            return;
        }
        int iRequestChiefSportDataType = motionPathSimplify.requestChiefSportDataType();
        if (2 == iRequestChiefSportDataType || 1 == iRequestChiefSportDataType) {
            if (motionPathSimplify.requestTotalCalories() != 0) {
                trackShareDetailCustomTitleLayout.setTextChiefData(jpq.d(motionPathSimplify.requestTotalCalories()));
            } else {
                trackShareDetailCustomTitleLayout.setTextChiefData("--");
            }
            trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getString(R.string.IDS_motiontrack_show_kcal));
            return;
        }
        if (motionPathSimplify.requestSportType() == 220) {
            String quantityString = this.e.getResources().getQuantityString(R.plurals.IDS_band_data_golf_count_unit, motionPathSimplify.getExtendDataInt("golfSwingCount"), "");
            trackShareDetailCustomTitleLayout.setTextChiefData(motionPathSimplify.requestExtendDataMap().get("golfSwingCount"));
            trackShareDetailCustomTitleLayout.setTextChiefUnit(quantityString);
            return;
        }
        if (iRequestChiefSportDataType == 7) {
            a(trackShareDetailCustomTitleLayout, motionPathSimplify);
            return;
        }
        if (iRequestChiefSportDataType == 11) {
            e(trackShareDetailCustomTitleLayout, motionPathSimplify);
            return;
        }
        if (this.t.d().requestTotalDistance() == 0) {
            trackShareDetailCustomTitleLayout.setTextChiefData("--");
        }
        if (motionPathSimplify.requestSportType() == 262 || motionPathSimplify.requestSportType() == 266) {
            a(trackShareDetailCustomTitleLayout);
            return;
        }
        if (UnitUtil.f()) {
            trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getString(R.string.IDS_band_data_sport_distance_unit_en));
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getString(R.string.IDS_band_data_sport_distance_unit));
        }
        int iRequestTotalDistance = this.t.d().requestTotalDistance();
        if (iRequestTotalDistance > 0) {
            trackShareDetailCustomTitleLayout.setTextChiefData(jpq.b(iRequestTotalDistance));
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefData("--");
        }
    }

    private void e(TrackShareDetailCustomTitleLayout trackShareDetailCustomTitleLayout, MotionPathSimplify motionPathSimplify) {
        long jRequestTotalTime = motionPathSimplify.requestTotalTime();
        if (jRequestTotalTime <= 0) {
            ReleaseLogUtil.e("Track_TrackShareAllDataFragment", "initChiefTime() totalTime is null");
            trackShareDetailCustomTitleLayout.setTextChiefData("--");
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefData(izn.c(jRequestTotalTime, R.style.sport_day_hour_min_num_38dp, R.style.sport_day_hour_min_unit_14dp));
            trackShareDetailCustomTitleLayout.setTextChiefUnit(null);
        }
    }

    private void a(TrackShareDetailCustomTitleLayout trackShareDetailCustomTitleLayout, MotionPathSimplify motionPathSimplify) {
        int extendDataInt = motionPathSimplify.getExtendDataInt("skipNum");
        if (extendDataInt > 0) {
            trackShareDetailCustomTitleLayout.setTextChiefData(UnitUtil.e(extendDataInt, 1, 0));
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefData("--");
        }
        trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, extendDataInt, ""));
    }

    private void a(TrackShareDetailCustomTitleLayout trackShareDetailCustomTitleLayout) {
        if (UnitUtil.f()) {
            trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(UnitUtil.e(this.t.d().requestTotalDistance(), 2))));
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefUnit(this.m.getString(R.string.IDS_fitness_data_list_activity_meter_unit));
        }
        int iRequestTotalDistance = this.t.d().requestTotalDistance();
        if (iRequestTotalDistance > 0) {
            trackShareDetailCustomTitleLayout.setTextChiefData(jpq.f(iRequestTotalDistance));
        } else {
            trackShareDetailCustomTitleLayout.setTextChiefData("--");
        }
    }

    private void d(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        if (!ay()) {
            trackShareDetailMapAndDetail.setRadarViewVisibility(8);
            return;
        }
        trackShareDetailMapAndDetail.setRadarViewVisibility(0);
        trackShareDetailMapAndDetail.getBasketballRadarView().setRadarScore(jpq.c(this.t.d().requestSportData()));
        Map<String, Integer> mapRequestSportData = this.t.d().requestSportData();
        if (mapRequestSportData.containsKey("overall_score")) {
            trackShareDetailMapAndDetail.getBasketballRadarView().setAverageScore(this.t.d().requestSportData().get("overall_score").intValue());
        } else {
            LogUtil.e("Track_TrackShareAllDataFragment", "no score");
        }
        trackShareDetailMapAndDetail.getBasketballRadarView().setTotalScoreGone();
        if (mapRequestSportData.containsKey("active_time")) {
            trackShareDetailMapAndDetail.getBasketballRadarView().setActiveTime(mapRequestSportData.get("active_time").intValue());
        }
        trackShareDetailMapAndDetail.getBasketballRadarView().setBasketballStamp(true);
    }

    private boolean ay() {
        return this.t.d().requestSportType() == 271 && this.t.d().requestChiefSportDataType() == 5;
    }

    private void r() {
        MotionPathSimplify motionPathSimplifyD = this.t.d();
        View viewInflate = View.inflate(this.e, R.layout.track_share_item_lactic, null);
        if (LanguageUtil.g(this.e)) {
            ((TextView) viewInflate.findViewById(R.id.share_lactate_threshold_title)).setTextSize(0, qrs.d(this.e, 12.0f));
        }
        a((LinearLayout) viewInflate.findViewById(R.id.track_detail_lactic_data_items), motionPathSimplifyD, this.m.getDimensionPixelOffset(R.dimen.elementsMarginHorizontalL));
        this.l.addView(viewInflate);
    }

    private void a(LinearLayout linearLayout, MotionPathSimplify motionPathSimplify, int i) {
        String string;
        SportDetailItem.a aVar = new SportDetailItem.a(qre.c(R.drawable.ic_heart_rate), ObserveLabels.HEART_RATE, qre.f(R.string.IDS_lactate_threshold_heart_rate), getString(R.string.IDS_lactate_threshold_measurement_failure), qre.f(R.string.IDS_main_watch_heart_rate_unit_string), qre.f(R.string.IDS_track_average_heart_rate_with_unit));
        SportDetailItem.a aVar2 = new SportDetailItem.a(qre.c(R.drawable.ic_avg_pace), "AVERAGE_PACE", qre.f(R.string.IDS_lactate_threshold_pace), getString(R.string.IDS_lactate_threshold_measurement_failure), "", "");
        int extendDataInt = motionPathSimplify.getExtendDataInt("lthrHr");
        if (extendDataInt > 0) {
            aVar.c(UnitUtil.e(extendDataInt, 1, 0));
            aVar.a(this.m.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        }
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("lthrPace");
        if (extendDataInt2 > 0) {
            boolean zF = UnitUtil.f();
            aVar2.c(izn.a(zF ? (float) UnitUtil.c(extendDataInt2, 3) : extendDataInt2));
            StringBuilder sb = new StringBuilder("/");
            if (zF) {
                string = this.m.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
            } else {
                string = this.m.getString(R.string.IDS_motiontrack_show_sport_unit_km);
            }
            sb.append(string);
            aVar2.a(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        arrayList.add(aVar2);
        new TrackDetailItemDrawer.TrackDetailItemDrawHelper(this.e).e(linearLayout, i, arrayList, true, this.m.getColor(R.color.textColorPrimary));
    }

    private void l() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.ag()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawHeartRateDataView hide");
            return;
        }
        this.f11169a = new jtd(this.e, 1, this.p);
        HwSportTypeInfo hwSportTypeInfoB = jry.a(com.huawei.haf.application.BaseApplication.b()).b(this.t.d().requestSportType());
        if (hwSportTypeInfoB == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawHeartRateDataView sportTypeInfoById is null");
            return;
        }
        View viewBuildView = this.f11169a.buildView(hwSportTypeInfoB.getHeartPostureType(), this.t.d().requestHeartRateZoneType());
        int iD = gzz.d(this.t.b().requestHeartRateList());
        float fRequestAvgHeartRate = this.t.d().requestAvgHeartRate();
        this.f11169a.b(this.t, iD, fRequestAvgHeartRate);
        HwHealthBaseCombinedChart hwHealthBaseCombinedChartAcquireHeartRateChart = this.f11169a.acquireHeartRateChart();
        if (hwHealthBaseCombinedChartAcquireHeartRateChart == null) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawHeartRateDataView chart is null");
            return;
        }
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            trackLineChartHolder = new TrackLineChartHolderImpl(this.e.getApplicationContext());
        }
        hwHealthBaseCombinedChartAcquireHeartRateChart.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        trackLineChartHolder.addHeartRateDataLayer(hwHealthBaseCombinedChartAcquireHeartRateChart, new TrackLineChartHolder.c().d(this.p == 100).e(true), fRequestAvgHeartRate);
        hwHealthBaseCombinedChartAcquireHeartRateChart.setTouchEnabled(false);
        hwHealthBaseCombinedChartAcquireHeartRateChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        hwHealthBaseCombinedChartAcquireHeartRateChart.refresh();
        this.l.addView(viewBuildView);
    }

    private void k() {
        if (this.t.d() == null || this.t.b() == null) {
            LogUtil.e("Track_TrackShareAllDataFragment", "acquireMotionPathSimplify is null or acquireMotionPath is null");
            return;
        }
        if (this.t.an()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawHeartRateDataView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolderAz = az();
        trackChartViewHolderAz.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolderAz.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            LogUtil.e("Track_TrackShareAllDataFragment", "trackLineChartHolder is null");
            return;
        }
        trackLineChartHolder.addRecoverHeartRateLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        BaseApplication.getContext().getResources();
        XAxis xAxis = combinedChart.getXAxis();
        xAxis.setAxisMinimum(0);
        xAxis.setAxisMaximum(120);
        xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment.1
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                DecimalFormat decimalFormat = new DecimalFormat("#");
                int iRound = Math.round(f / 60.0f);
                if (decimalFormat.format(iRound).equals("0")) {
                    return qrk.a(TrackShareAllDataFragment.this.e, TrackShareAllDataFragment.this.t.d().requestEndTime(), 1);
                }
                return qre.e(R.plurals.IDS_plugin_fitnessadvice_min, iRound, Integer.valueOf(iRound));
            }
        });
        combinedChart.getDescription().setText("");
        combinedChart.refresh();
        this.l.addView(trackChartViewHolderAz);
    }

    private TrackChartViewHolder az() {
        int iAcquireHeartRate;
        int iAcquireHeartRate2;
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 124);
        List<HeartRateData> listRequestHeartRecoveryRateList = this.t.b().requestHeartRecoveryRateList();
        Iterator<HeartRateData> it = listRequestHeartRecoveryRateList.iterator();
        while (true) {
            iAcquireHeartRate = 0;
            if (!it.hasNext()) {
                iAcquireHeartRate2 = 0;
                break;
            }
            HeartRateData next = it.next();
            if (next.acquireHeartRate() > 0) {
                iAcquireHeartRate2 = next.acquireHeartRate();
                break;
            }
        }
        for (int size = listRequestHeartRecoveryRateList.size() - 1; size >= 0; size--) {
            if (listRequestHeartRecoveryRateList.get(size).acquireHeartRate() > 0) {
                iAcquireHeartRate = listRequestHeartRecoveryRateList.get(size).acquireHeartRate();
                break;
            }
        }
        trackChartViewHolder.c((iAcquireHeartRate2 - iAcquireHeartRate) / 2.0f);
        trackChartViewHolder.e(iAcquireHeartRate2, iAcquireHeartRate);
        return trackChartViewHolder;
    }

    private void v() {
        jqp jqpVar = this.t;
        if (jqpVar == null) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawMovingSpeedView mTrackDetailDataManager is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = jqpVar.d();
        if (motionPathSimplifyD == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawMovingSpeedView motionPathSimplify is null");
            return;
        }
        int iRequestTotalDistance = motionPathSimplifyD.requestTotalDistance();
        float fRequestTotalTime = motionPathSimplifyD.requestTotalTime() / 1000.0f;
        double dE = izn.a((double) fRequestTotalTime) ? 0.0d : ((iRequestTotalDistance * 1.0f) / fRequestTotalTime) * 3.6f;
        float fIntValue = (motionPathSimplifyD.requestSportData() == null || !motionPathSimplifyD.requestSportData().containsKey("max_spriting_speed") || motionPathSimplifyD.requestSportData().get("max_spriting_speed") == null) ? 0.0f : (this.t.d().requestSportData().get("max_spriting_speed").intValue() * 3.6f) / 10.0f;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dE, 3);
            fIntValue = (float) UnitUtil.e(fIntValue, 3);
        }
        if (izn.a(fIntValue) || izn.a(dE) || this.t.b() == null || !this.t.b().isValidSpeedList()) {
            return;
        }
        jtd jtdVar = new jtd(this.e, 3, this.p);
        View viewBuildView = jtdVar.buildView(jry.a(com.huawei.haf.application.BaseApplication.b()).b(this.t.d().requestSportType()).getHeartPostureType(), 0);
        jtdVar.b(this.t, fIntValue, (float) dE);
        this.l.addView(viewBuildView);
    }

    private void g() {
        MotionPathSimplify motionPathSimplifyD = this.t.d();
        if (SportSupportUtil.d(motionPathSimplifyD)) {
            CourseActionViewHolder courseActionViewHolder = new CourseActionViewHolder(this.e);
            View viewE = courseActionViewHolder.e(true);
            if (courseActionViewHolder.a(motionPathSimplifyD)) {
                this.l.addView(courseActionViewHolder.a(true));
                this.l.addView(viewE);
            }
        }
    }

    private void ag() {
        if (!RunningRouteUtils.a(this.t.d().requestSportType())) {
            LogUtil.a("Track_TrackShareAllDataFragment", "not support punch track");
            return;
        }
        Map<String, String> mapRequestExtendDataMap = this.t.d().requestExtendDataMap();
        if (!jxu.b(mapRequestExtendDataMap)) {
            ba();
            return;
        }
        String str = mapRequestExtendDataMap.get("hotPathId");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_TrackShareAllDataFragment", "hotPathId is null in drawRunRouteView");
            return;
        }
        RunRouteView runRouteView = new RunRouteView(this.e);
        this.n = runRouteView;
        runRouteView.b(false);
        this.l.addView(this.n);
        this.n.setHotPathName(mapRequestExtendDataMap.get("hotPathName"));
        final String str2 = mapRequestExtendDataMap.get("finishState");
        final long jAw = aw();
        if (jAw != -1) {
            this.n.setHotTrackParticipateNum(str2, (int) jAw);
        }
        this.q.add("runRouteTask");
        final String str3 = "runRouteTask";
        jxu.d(str, new HotTrackDrawCustomTarget<Drawable>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment.3
            @Override // com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget
            public void onGetHotTrackDetailInfo(gdm gdmVar) {
                if (jAw == -1) {
                    TrackShareAllDataFragment.this.n.setHotTrackParticipateNum(str2, (int) gdmVar.f());
                }
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                LogUtil.a("Track_TrackShareAllDataFragment", "onResourceReady");
                TrackShareAllDataFragment.this.n.setHotPathDrawable(drawable);
                TrackShareAllDataFragment.this.b(str3);
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.j("Track_TrackShareAllDataFragment", "onLoadCleared");
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                super.onLoadFailed(drawable);
                LogUtil.j("Track_TrackShareAllDataFragment", "onLoadFailed");
                TrackShareAllDataFragment.this.b(str3);
            }
        });
    }

    private void ba() {
        String strC;
        gdq gdqVarC = new jdb(getActivity(), this.t.d(), 2).c();
        if (gdqVarC == null || gdqVarC.d() == null) {
            LogUtil.a("Track_TrackShareAllDataFragment", "not punch track");
            return;
        }
        gdr gdrVarD = gdqVarC.d();
        long jD = gdrVarD.d();
        String strH = gdrVarD.h();
        gdw gdwVarI = gdrVarD.i();
        if (gdwVarI == null) {
            strC = "";
        } else {
            strC = gdwVarI.c();
        }
        RunRouteView runRouteView = new RunRouteView(this.e);
        this.n = runRouteView;
        runRouteView.b(false);
        this.n.setHotPathName(strH);
        this.n.setHotTrackParticipateNum("", (int) jD);
        this.n.setHotPathUrl(strC);
        this.l.addView(this.n);
    }

    private long aw() {
        FragmentActivity activity = getActivity();
        if (activity instanceof TrackDetailActivity) {
            return ((TrackDetailActivity) activity).e();
        }
        return -1L;
    }

    private void am() {
        Map<String, Integer> mapRequestSportData;
        if (this.t.d() == null || this.t.b() == null || (mapRequestSportData = this.t.d().requestSportData()) == null) {
            return;
        }
        int iIntValue = mapRequestSportData.get("max_met") != null ? ((int) (mapRequestSportData.get("max_met").intValue() * 3.5f)) / 65536 : 0;
        float fIntValue = mapRequestSportData.get("etraining_effect") != null ? mapRequestSportData.get("etraining_effect").intValue() / 10.0f : 0.0f;
        float fIntValue2 = mapRequestSportData.get("anaerobic_exercise_etraining_effect") != null ? mapRequestSportData.get("anaerobic_exercise_etraining_effect").intValue() / 10.0f : 0.0f;
        int hours = mapRequestSportData.get("recovery_time") != null ? (int) TimeUnit.MINUTES.toHours(mapRequestSportData.get("recovery_time").intValue()) : 0;
        int extendDataInt = this.t.d().getExtendDataInt("eteAlgoKey", 0);
        if (b(iIntValue, fIntValue, fIntValue2, hours)) {
            jvu jvuVar = new jvu(this.e, this.p);
            View viewA = jvuVar.a();
            jvuVar.d(!jpq.a(this.t).booleanValue() ? 0 : iIntValue, fIntValue, fIntValue2, hours, extendDataInt);
            this.l.addView(viewA);
        }
    }

    private void x() {
        View viewD;
        if (this.t.d() == null || this.t.b() == null || this.t.a(1)) {
            return;
        }
        jqp jqpVar = this.t;
        List<njj> listB = jqpVar.b(jqpVar.d().requestSportType());
        List<njj> listD = njv.d(listB);
        izn.e(listD, listB, this.t);
        if (njy.e(listD)) {
            return;
        }
        if (this.t.be()) {
            juf jufVar = new juf(this.e, this.p);
            viewD = jufVar.a();
            jufVar.d(this.t, listD);
        } else {
            jto jtoVar = new jto(this.e, this.p);
            jtoVar.a(this.t.d().requestSportType());
            viewD = jtoVar.d();
            jtoVar.c(this.t, listD);
        }
        viewD.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        this.l.addView(viewD);
    }

    private void ak() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.aw()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawStepRateView hide");
            return;
        }
        int iA = gzz.a((StepRateData) Collections.max(this.t.b().requestStepRateList(), new Comparator<StepRateData>(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(StepRateData stepRateData, StepRateData stepRateData2) {
                if (stepRateData == null || stepRateData2 == null) {
                    return 0;
                }
                return gzz.a(stepRateData) - gzz.a(stepRateData2);
            }
        }));
        int iRequestAvgStepRate = this.t.d().requestAvgStepRate();
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 2);
        float f = iRequestAvgStepRate;
        trackChartViewHolder.c(f);
        trackChartViewHolder.a(iA);
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addStepRateDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true), f);
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void j() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.ab()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "cadenceView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 13);
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.CADENCE).g());
        trackChartViewHolder.a(this.t.j().get(SportDetailChartDataType.CADENCE).h());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addCadenceRateDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void z() {
        if (this.t.b() == null || this.t.b().requestResistanceList() == null || this.t.b().requestResistanceList().size() <= 0) {
            return;
        }
        jtd jtdVar = new jtd(this.e, 4, this.p);
        View viewBuildView = jtdVar.buildView(jry.a(com.huawei.haf.application.BaseApplication.b()).b(this.t.d().requestSportType()).getHeartPostureType(), 0);
        jtdVar.b(this.t, 0.0f, 0.0f);
        this.l.addView(viewBuildView);
    }

    private void w() {
        MotionPathSimplify motionPathSimplifyD = this.t.d();
        if (motionPathSimplifyD == null || this.t.b() == null) {
            return;
        }
        if (this.t.af()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "powerView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 15);
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.POWER).g());
        trackChartViewHolder.a(this.t.j().get(SportDetailChartDataType.POWER).h());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addPowerDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        if (motionPathSimplifyD.requestSportType() == 259) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawPowerView add power chart");
            trackChartViewHolder.d();
            trackChartViewHolder.a(PowerIntervalShareView.a(this.e, motionPathSimplifyD, false, true));
        }
        this.l.addView(trackChartViewHolder);
    }

    private void c() {
        MotionPathSimplify motionPathSimplifyD = this.t.d();
        if (motionPathSimplifyD == null || this.t.b() == null) {
            return;
        }
        if (this.t.v()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "analogPowerView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 27);
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.ANALOG_POWER).g());
        trackChartViewHolder.a(this.t.j().get(SportDetailChartDataType.ANALOG_POWER).h());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addAnalogPowerDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        if (motionPathSimplifyD.requestSportType() == 259) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawAnalogPowerView add power chart");
            trackChartViewHolder.d();
            trackChartViewHolder.a(PowerIntervalShareView.a(this.e, motionPathSimplifyD, true, false));
        }
        this.l.addView(trackChartViewHolder);
    }

    private void d() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.y()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "analogCadenceView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 28);
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.ANALOG_CADENCE).g());
        trackChartViewHolder.a(this.t.j().get(SportDetailChartDataType.ANALOG_CADENCE).h());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addAnalogCadenceDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void ao() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.am()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "weightView hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 24);
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.PEAK_WEIGHT).g());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addWeightDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void ai() {
        if (this.t.ap()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawSkippingSpeedView skip hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 16);
        trackChartViewHolder.c(this.t.d().getExtendDataInt("skipSpeed", 0));
        trackChartViewHolder.a(jpq.h(this.t.b().requestSkippingSpeedList()));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            trackLineChartHolder = new TrackLineChartHolderImpl(this.e.getApplicationContext());
        }
        trackLineChartHolder.addSkippingSpeedDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void u() {
        TrackChartViewHolder trackChartViewHolder;
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.ah()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "paddleView hide");
            return;
        }
        if (izn.b(this.t.d()).equals("291")) {
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 25);
        } else {
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 14);
        }
        trackChartViewHolder.c(this.t.j().get(SportDetailChartDataType.PADDLE_FREQUENCY).g());
        trackChartViewHolder.a(this.t.j().get(SportDetailChartDataType.PADDLE_FREQUENCY).h());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addPaddleFreqDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void al() {
        if (this.t.d() == null || this.t.b() == null) {
            return;
        }
        if (this.t.as()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "spo2view hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 10);
        trackChartViewHolder.c(this.t.d().requestMinSpo2());
        trackChartViewHolder.a(this.t.d().requestMaxSpo2());
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addSpo2DataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void t() {
        jqp jqpVar = this.t;
        if (jqpVar == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawJumpHeight mTrackDetailDataManager is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = jqpVar.d();
        MotionPath motionPathB = this.t.b();
        if (motionPathSimplifyD == null || motionPathB == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawJumpHeight motionPathSimplify or motionPath is null");
            return;
        }
        if (this.t.u()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "jumpHeight hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 12);
        if (!UnitUtil.f()) {
            trackChartViewHolder.c(jpq.c(motionPathB.requestJumpDataList()));
            trackChartViewHolder.a(jpq.f(motionPathB.requestJumpDataList()));
        } else {
            trackChartViewHolder.c((int) UnitUtil.e(jpq.c(motionPathB.requestJumpDataList()), 0));
            trackChartViewHolder.a((int) UnitUtil.e(jpq.f(motionPathB.requestJumpDataList()), 0));
        }
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addJumpHeightDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void q() {
        jqp jqpVar = this.t;
        if (jqpVar == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawJumpTime mTrackDetailDataManager is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = jqpVar.d();
        MotionPath motionPathB = this.t.b();
        if (motionPathSimplifyD == null || motionPathB == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawJumpTime motionPathSimplify or motionPath is null");
            return;
        }
        if (this.t.u()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawJumpTime hide");
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 11);
        trackChartViewHolder.c(jpq.d(motionPathB.requestJumpDataList()));
        trackChartViewHolder.a(jpq.g(motionPathB.requestJumpDataList()));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addJumpTimeDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void h() {
        this.l.addView(View.inflate(this.e, R.layout.track_share_bottom_layout, null));
    }

    private void p() {
        jqp jqpVar = this.t;
        if (jqpVar == null) {
            LogUtil.j("Track_TrackShareAllDataFragment", "drawJumpData mTrackDetailDataManager is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = jqpVar.d();
        MotionPath motionPathB = this.t.b();
        if (motionPathSimplifyD == null || motionPathB == null || !ay()) {
            return;
        }
        View viewInflate = View.inflate(this.e, R.layout.basketball_share_jump_view, null);
        viewInflate.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        DetailItemContainer detailItemContainer = (DetailItemContainer) viewInflate.findViewById(R.id.basketball_share_jump_container);
        TrackDetailItemDrawer trackDetailItemDrawer = new TrackDetailItemDrawer(motionPathSimplifyD, motionPathB, this.e, this.p);
        trackDetailItemDrawer.d(detailItemContainer, true, 2, this.g);
        if (trackDetailItemDrawer.c() > 0) {
            this.l.addView(viewInflate);
        }
    }

    public void b(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        TrackDetailItemDrawer trackDetailItemDrawer = new TrackDetailItemDrawer(this.t.d(), this.t.b(), this.e, this.p);
        if (trackShareDetailMapAndDetail == null) {
            LogUtil.e("Track_TrackShareAllDataFragment", "inputMapAndDetail is null");
        } else {
            trackDetailItemDrawer.d(trackShareDetailMapAndDetail.b(), true, 0, this.m.getDimensionPixelOffset(R.dimen.elementsMarginHorizontalL));
        }
    }

    private void a(TriathlonShareViewGroup triathlonShareViewGroup, MotionPathSimplify motionPathSimplify) {
        triathlonShareViewGroup.a().setText(jaa.d(this.e, motionPathSimplify.requestSportType()));
    }

    private void a(TriathlonShareViewGroup triathlonShareViewGroup, jbt jbtVar) {
        triathlonShareViewGroup.a().setText(jaa.d(this.e, jbtVar.e().getSportType()));
    }

    private void d(TriathlonShareViewGroup triathlonShareViewGroup, MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        new TrackDetailItemDrawer(motionPathSimplify, motionPath, this.e, this.p).d(triathlonShareViewGroup.c(), true, 1, this.m.getDimensionPixelOffset(R.dimen.maxPaddingStart));
    }

    private void c(TriathlonShareViewGroup triathlonShareViewGroup, jbt jbtVar) {
        new TrackDetailItemDrawer(jbtVar, this.e, this.p).e(triathlonShareViewGroup.c(), true, this.g);
    }

    private void a(TriathlonShareViewGroup triathlonShareViewGroup, MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        TrackChartViewHolder trackChartViewHolderC;
        int iRequestSportType = motionPathSimplify.requestSportType();
        if (iRequestSportType == 258) {
            View viewD = d(motionPathSimplify, motionPath);
            if (viewD != null) {
                triathlonShareViewGroup.d().addView(viewD);
                return;
            }
            return;
        }
        if (iRequestSportType == 259) {
            TrackChartViewHolder trackChartViewHolderB = b(motionPathSimplify, motionPath);
            if (trackChartViewHolderB != null) {
                triathlonShareViewGroup.d().addView(trackChartViewHolderB);
                return;
            }
            return;
        }
        if ((iRequestSportType == 262 || iRequestSportType == 266) && (trackChartViewHolderC = c(motionPathSimplify, motionPath)) != null) {
            triathlonShareViewGroup.d().addView(trackChartViewHolderC);
        }
    }

    public View e() {
        return this.l;
    }

    private void ae() {
        if (this.t.ar()) {
            return;
        }
        this.l.addView(b(this.t.d(), this.t.b()));
    }

    private TrackChartViewHolder b(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        if (!motionPath.isValidSpeedList()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "SpeedList is not valid");
            return null;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 3);
        trackChartViewHolder.c((float) jpq.c(motionPathSimplify.requestAvgPace()));
        trackChartViewHolder.a((float) gzz.e(motionPath.requestRealTimeSpeedList()));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return null;
        }
        trackLineChartHolder.setSportType(motionPathSimplify.requestSportType());
        trackLineChartHolder.addTrackSpeedDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        return trackChartViewHolder;
    }

    private void a() {
        if (this.t.w()) {
            return;
        }
        float fRequestMinAltitude = this.t.d().requestMinAltitude();
        float fRequestMaxAltitude = this.t.d().requestMaxAltitude();
        if (!jpq.e(fRequestMinAltitude, fRequestMaxAltitude)) {
            Float[] fArrD = jpq.d(this.t.b().requestAltitudeList());
            fRequestMaxAltitude = fArrD[0].floatValue();
            fRequestMinAltitude = fArrD[1].floatValue();
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 100);
        trackChartViewHolder.c(fRequestMinAltitude);
        trackChartViewHolder.a(fRequestMaxAltitude);
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 13.8f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addTrackAltitudeDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        if (this.t.d().requestSportType() == 259) {
            LogUtil.a("Track_TrackShareAllDataFragment", "add altitude slope ring");
            trackChartViewHolder.d();
            trackChartViewHolder.a(new AltitudeSlopeIntervalShare(this.e, this.t.b(), this.t.d()));
        }
        this.l.addView(trackChartViewHolder);
    }

    private void af() {
        if (this.t.al()) {
            return;
        }
        this.l.addView(c(this.t.d(), this.t.b()));
    }

    private View d(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        TrackLineChartHolder trackLineChartHolder;
        if (motionPathSimplify == null || motionPath == null || !motionPath.isValidHeartRateList()) {
            return null;
        }
        int iD = gzz.d(motionPath.requestHeartRateList());
        int iRequestAvgHeartRate = motionPathSimplify.requestAvgHeartRate();
        if (motionPath.requestHeartRateList().size() > 1 && (iD == 0 || iRequestAvgHeartRate == 0 || iRequestAvgHeartRate > iD)) {
            return null;
        }
        jtd jtdVar = new jtd(this.e, 1, this.p);
        View viewBuildView = jtdVar.buildView(jry.a(com.huawei.haf.application.BaseApplication.b()).b(this.t.d().requestSportType()).getHeartPostureType(), motionPathSimplify.requestHeartRateZoneType());
        HwHealthBaseCombinedChart hwHealthBaseCombinedChartAcquireHeartRateChart = jtdVar.acquireHeartRateChart();
        if (hwHealthBaseCombinedChartAcquireHeartRateChart == null || (trackLineChartHolder = TrackLineChartHolder.getInstance()) == null) {
            return null;
        }
        float f = iRequestAvgHeartRate;
        jtdVar.b(null, iD, f);
        trackLineChartHolder.setSportType(motionPathSimplify.requestSportType());
        trackLineChartHolder.addHeartRateDataLayer(hwHealthBaseCombinedChartAcquireHeartRateChart, new TrackLineChartHolder.c().d(this.p == 100).e(true), f);
        hwHealthBaseCombinedChartAcquireHeartRateChart.setTouchEnabled(false);
        hwHealthBaseCombinedChartAcquireHeartRateChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        hwHealthBaseCombinedChartAcquireHeartRateChart.refresh();
        return viewBuildView;
    }

    private TrackChartViewHolder c(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        TrackChartViewHolder trackChartViewHolder;
        if (!motionPath.isValidSpeedList()) {
            LogUtil.a("Track_TrackShareAllDataFragment", "PaceList is not valid");
            return null;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        float fRequestAvgPace = motionPathSimplify.requestAvgPace();
        float fC = gzz.c(motionPath.requestRealTimePaceList());
        if (iRequestSportType == 262 || iRequestSportType == 266) {
            fRequestAvgPace /= 10.0f;
            fC /= 10.0f;
            if (UnitUtil.f()) {
                fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace, 2);
                fC = (float) UnitUtil.c(fC, 2);
            }
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 6);
        } else if (iRequestSportType == 274) {
            fC /= 2.0f;
            if (UnitUtil.f()) {
                fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace / 5.0f, 2);
                fC = (float) UnitUtil.c(fC / 5.0f, 2);
            }
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 17);
        } else if (jpq.g(iRequestSportType)) {
            fRequestAvgPace /= 2.0f;
            fC /= 2.0f;
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 26);
        } else {
            if (UnitUtil.f()) {
                float fC2 = (float) UnitUtil.c(fRequestAvgPace, 3);
                fC = (float) UnitUtil.c(fC, 3);
                fRequestAvgPace = fC2;
            }
            trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 9);
        }
        trackChartViewHolder.c(fRequestAvgPace);
        trackChartViewHolder.a(fC);
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return null;
        }
        trackLineChartHolder.setSportType(motionPathSimplify.requestSportType());
        trackLineChartHolder.addTrackRealTimePaceDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true), fRequestAvgPace);
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        if (iRequestSportType != 264 && iRequestSportType != 258 && iRequestSportType != 280 && iRequestSportType != 227) {
            return trackChartViewHolder;
        }
        LogUtil.a("Track_TrackShareAllDataFragment", "add pace chart");
        trackChartViewHolder.d();
        trackChartViewHolder.a(new PaceIntervalShare(this.e, motionPath, motionPathSimplify));
        return trackChartViewHolder;
    }

    private void ad() {
        if (this.t.ak()) {
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 5);
        Map<String, Integer> mapRequestSportData = this.t.d().requestSportData();
        if (mapRequestSportData == null) {
            LogUtil.a("Track_TrackShareAllDataFragment", "drawPullFreqView sportData is null");
            return;
        }
        if (!mapRequestSportData.containsKey("swim_pull_freq") || mapRequestSportData.get("swim_pull_freq") == null) {
            LogUtil.a("Track_TrackShareAllDataFragment", "stroke rate is null");
            trackChartViewHolder.c(0.0f);
        } else {
            trackChartViewHolder.c(mapRequestSportData.get("swim_pull_freq").intValue());
        }
        trackChartViewHolder.a(gzz.g(this.t.b().requestPullFreqList()));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addTrackPullFreqDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void an() {
        if (this.t.at()) {
            return;
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 4);
        Map<String, Integer> mapRequestSportData = this.t.d().requestSportData();
        if (mapRequestSportData != null && mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF) != null) {
            trackChartViewHolder.c(mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF).intValue());
        } else {
            trackChartViewHolder.c(0.0f);
            LogUtil.a("Track_TrackShareAllDataFragment", "sportData or avgswolf is null");
        }
        trackChartViewHolder.a(gzz.j(this.t.b().requestSwolfList()));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addTrackSwolfDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void ah() {
        if (this.t.aj()) {
            return;
        }
        if (!this.t.ac()) {
            f();
            a(SportDetailChartDataType.GROUND_CONTACT_TIME);
        }
        if (!this.t.z()) {
            m();
        }
        if (!this.t.ae()) {
            o();
            a(SportDetailChartDataType.HANG_TIME);
        }
        if (!this.t.aa()) {
            n();
            a(SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        }
        if (!this.t.ax()) {
            aq();
        }
        if (!this.t.av()) {
            as();
        }
        if (!this.t.ai()) {
            b();
        }
        if (this.t.ad()) {
            return;
        }
        i();
    }

    private void au() {
        JudgeRootBean judgeRootBean = (JudgeRootBean) HiJsonUtil.d(jpz.b(BaseApplication.getContext()), JudgeRootBean.class);
        if (judgeRootBean == null) {
            return;
        }
        List<PostureJudgeBean> judge = judgeRootBean.getJudge();
        this.h = judge;
        if (judge == null) {
            LogUtil.e("Track_TrackShareAllDataFragment", "mPostureJudgeBeanList is null");
        } else {
            LogUtil.a("Track_TrackShareAllDataFragment", "mPostureJudgeBeanList.toString", judge.toString());
        }
    }

    private void f() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 7);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().requestAvgGroundContactTime());
        trackChartViewHolder.a(gzz.o(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 7, this.t.d().requestAvgGroundContactTime());
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void a(SportDetailChartDataType sportDetailChartDataType) {
        if (njy.e(this.h) || this.t.t()) {
            LogUtil.j("Track_TrackShareAllDataFragment", "invalid posture table");
            return;
        }
        MotionPath motionPathB = this.t.b();
        jqg jqgVar = new jqg(BaseApplication.getContext(), sportDetailChartDataType, this.h, jpz.b(jpz.b(motionPathB, this.h.get(0)), sportDetailChartDataType, motionPathB.requestRunningPostureList(), this.h));
        float[] fArrB = jpz.b(new HealthColumnSystem(this.e), true);
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.posture_table, (ViewGroup) null);
        jqgVar.d((HealthTableWidget) viewInflate.findViewById(R.id.pace_table_layout), fArrB);
        this.l.addView(viewInflate);
    }

    private void o() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 18);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().requestAverageHangTime());
        trackChartViewHolder.a(gzz.h(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 16, this.t.d().requestAverageHangTime());
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void aq() {
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        float extendDataFloat = this.t.d().getExtendDataFloat("avg_v_osc");
        float fM = gzz.m(arrayListRequestRunningPostureList);
        if (UnitUtil.f()) {
            extendDataFloat = (float) UnitUtil.e(this.t.d().getExtendDataFloat("avg_v_osc"), 0);
            fM = (float) UnitUtil.e(fM, 0);
        }
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 23);
        trackChartViewHolder.c(extendDataFloat);
        trackChartViewHolder.a(fM);
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 18, this.t.d().getExtendDataFloat("avg_v_osc"));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void as() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 22);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().getExtendDataFloat("avg_v_s_r"));
        trackChartViewHolder.a(gzz.k(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 20, this.t.d().getExtendDataFloat("avg_v_s_r"));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void b() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 20);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().getExtendDataFloat("avg_i_p"));
        trackChartViewHolder.a(gzz.i(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 21, this.t.d().getExtendDataFloat("avg_i_p"));
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void i() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 21);
        float fD = (float) UnitUtil.d(this.t.d().getExtendDataFloat("avg_gc_tb"), 1);
        trackChartViewHolder.c(fD);
        trackChartViewHolder.a(100.0f - fD);
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 19, 50.0f);
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void n() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 19);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().requestGroundHangTimeRate());
        trackChartViewHolder.a(gzz.l(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true).c(true), 17, this.t.d().requestGroundHangTimeRate());
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void m() {
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.e, this.p, true, 8);
        ArrayList<gzv> arrayListRequestRunningPostureList = this.t.b().requestRunningPostureList();
        trackChartViewHolder.c(this.t.d().requestAvgGroundImpactAcceleration());
        trackChartViewHolder.a(gzz.f(arrayListRequestRunningPostureList));
        trackChartViewHolder.setPadding(-16, qrs.d(this.e, 12.0f), -16, qrs.d(this.e, 16.0f));
        HwHealthBaseCombinedChart combinedChart = trackChartViewHolder.getCombinedChart();
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        if (trackLineChartHolder == null) {
            return;
        }
        trackLineChartHolder.addRunningPostureDataLayer(combinedChart, new TrackLineChartHolder.c().d(this.p == 100).e(true), 8);
        combinedChart.setTouchEnabled(false);
        combinedChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        combinedChart.refresh();
        this.l.addView(trackChartViewHolder);
    }

    private void aj() {
        if (!this.t.bh() || !this.t.a(0)) {
            LogUtil.a("Track_TrackShareAllDataFragment", "not support time percentage");
            return;
        }
        View viewInflate = View.inflate(this.e, R.layout.track_share_piste_percentage_layout, null);
        ((HealthTextView) viewInflate.findViewById(R.id.percentage_title)).setText(qre.f(R.string.IDS_track_time_percentage));
        ((LinearLayout) viewInflate.findViewById(R.id.percentage_chart)).addView(new TimePercentageView(this.e, this.t.d()));
        this.l.addView(viewInflate);
    }

    private void y() {
        if (this.t.bc()) {
            View viewInflate = View.inflate(this.e, R.layout.track_share_piste_percentage_layout, null);
            ((HealthTextView) viewInflate.findViewById(R.id.percentage_title)).setText(qre.f(R.string.IDS_track_piste_percentage));
            ((LinearLayout) viewInflate.findViewById(R.id.percentage_chart)).addView(new PistePercentageView(this.e, this.t.d()));
            this.l.addView(viewInflate);
        }
    }

    private void c(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        jqp jqpVar = this.t;
        if (jqpVar != null && jqpVar.b() != null && !this.t.aj()) {
            int iRequestAvgGroundContactTime = this.t.d().requestAvgGroundContactTime();
            int iRequestAvgGroundImpactAcceleration = this.t.d().requestAvgGroundImpactAcceleration();
            int iRequestAvgEversionExcursion = this.t.d().requestAvgEversionExcursion();
            int iRequestAvgSwingAngle = this.t.d().requestAvgSwingAngle();
            float fRequestAvgPace = this.t.d().requestAvgPace();
            float f = ((double) Math.abs(fRequestAvgPace)) > 1.0E-6d ? 3600.0f / fRequestAvgPace : 0.0f;
            int iRequestAvgForeFootStrikePattern = this.t.d().requestAvgForeFootStrikePattern();
            int iRequestAvgWholeFootStrikePattern = this.t.d().requestAvgWholeFootStrikePattern();
            int iRequestAvgHindFootStrikePattern = this.t.d().requestAvgHindFootStrikePattern();
            double d = iRequestAvgForeFootStrikePattern + iRequestAvgWholeFootStrikePattern + iRequestAvgHindFootStrikePattern;
            int iFloor = (int) Math.floor((((double) iRequestAvgWholeFootStrikePattern) / d) * 100.0d);
            int iFloor2 = (int) Math.floor((((double) iRequestAvgHindFootStrikePattern) / d) * 100.0d);
            int i = (100 - iFloor) - iFloor2;
            if (i < 0) {
                i = 0;
            }
            jsi jsiVar = new jsi(f, iRequestAvgGroundContactTime, iRequestAvgGroundImpactAcceleration, iRequestAvgSwingAngle, iRequestAvgEversionExcursion, i, iFloor, iFloor2, this.t.d().getExtendDataFloat("avg_v_i_r"), this.t.d().getExtendDataFloat("avg_i_p"), this.t.d().getExtendDataFloat("avg_v_osc"), (float) UnitUtil.d(this.t.d().getExtendDataFloat("avg_gc_tb"), 1), this.t.d().getExtendDataFloat("avg_v_s_r"));
            jsiVar.c((int) d);
            trackShareDetailMapAndDetail.c(jsiVar, this.h);
            return;
        }
        trackShareDetailMapAndDetail.e();
    }

    private void a(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        if (this.t.d().requestSportType() == 266 || this.t.d().requestSportType() == 262) {
            boolean zF = f(trackShareDetailMapAndDetail);
            boolean zJ = j(trackShareDetailMapAndDetail);
            boolean zH = h(trackShareDetailMapAndDetail);
            if (zF || zJ || zH) {
                trackShareDetailMapAndDetail.h();
                return;
            } else {
                trackShareDetailMapAndDetail.a();
                return;
            }
        }
        trackShareDetailMapAndDetail.a();
    }

    private boolean f(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        String quantityString;
        float fRequestAvgPace = this.t.d().requestAvgPace();
        if (fRequestAvgPace > 0.0f) {
            String strJ = jpq.j(fRequestAvgPace);
            if (UnitUtil.f()) {
                quantityString = this.m.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            } else {
                quantityString = this.m.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
            }
            trackShareDetailMapAndDetail.e(strJ, quantityString);
            return true;
        }
        trackShareDetailMapAndDetail.j();
        return false;
    }

    private boolean j(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        if (this.t.d().requestSportData() == null || this.t.d().requestSportData().get("swim_pull_freq") == null) {
            trackShareDetailMapAndDetail.c();
            return false;
        }
        int iIntValue = this.t.d().requestSportData().get("swim_pull_freq").intValue();
        if (iIntValue <= 0) {
            trackShareDetailMapAndDetail.c();
            return false;
        }
        trackShareDetailMapAndDetail.d(UnitUtil.e(iIntValue, 1, 0), this.m.getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, iIntValue));
        return true;
    }

    private boolean h(TrackShareDetailMapAndDetail trackShareDetailMapAndDetail) {
        if (this.t.d().requestSportData() == null || this.t.d().requestSportData().get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF) == null) {
            trackShareDetailMapAndDetail.f();
            return false;
        }
        int iIntValue = this.t.d().requestSportData().get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF).intValue();
        if (iIntValue <= 0) {
            trackShareDetailMapAndDetail.f();
            return false;
        }
        trackShareDetailMapAndDetail.b(UnitUtil.e(iIntValue, 1, 0));
        return true;
    }

    public void c(ShareInitCallback shareInitCallback) {
        this.o = shareInitCallback;
    }

    public void d(Bitmap bitmap) {
        TrackShareDetailMapAndDetail trackShareDetailMapAndDetail = this.i;
        if (trackShareDetailMapAndDetail != null) {
            trackShareDetailMapAndDetail.a(bitmap);
        }
    }

    public void a(boolean z) {
        TrackShareDetailMapAndDetail trackShareDetailMapAndDetail = this.i;
        if (trackShareDetailMapAndDetail != null) {
            trackShareDetailMapAndDetail.a(z);
        }
    }
}

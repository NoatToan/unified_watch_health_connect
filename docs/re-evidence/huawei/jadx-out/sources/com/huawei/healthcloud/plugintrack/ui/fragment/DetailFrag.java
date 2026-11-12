package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.plan.aicoach.view.AiAnalysisView;
import com.huawei.health.sport.utils.RunPopularRoutesUtil;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.JudgeRootBean;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.model.TrackLineChartHolderImpl;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.TrackDetailItemDrawer;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.AverageHangTimeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.EversionExcursionAngleAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundContactTimeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundHangTimeRateAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactAccelerationAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactLoadRateAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundShockPeakAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundTouchdownBalanceAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundVerticalAmplitudeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundVerticalAmplitudeRatioAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.StrikePatternAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.SwingAngleAdvice;
import com.huawei.healthcloud.plugintrack.ui.view.BasketballScoreView;
import com.huawei.healthcloud.plugintrack.ui.view.DetailItemContainer;
import com.huawei.healthcloud.plugintrack.ui.view.JumpDataView;
import com.huawei.healthcloud.plugintrack.ui.view.PistePercentageView;
import com.huawei.healthcloud.plugintrack.ui.view.RunRouteView;
import com.huawei.healthcloud.plugintrack.ui.view.ShowProgress;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.healthcloud.plugintrack.ui.view.TimePercentageView;
import com.huawei.healthcloud.plugintrack.ui.view.sharegroup.SpeedPercentView;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CourseActionViewHolder;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackChartViewHolder;
import com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.BasketballAdvice;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.view.TotalDataRectView;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import com.huawei.up.model.UserInfomation;
import defpackage.dem;
import defpackage.fxl;
import defpackage.gdm;
import defpackage.gdq;
import defpackage.gdr;
import defpackage.gdw;
import defpackage.gfk;
import defpackage.gfl;
import defpackage.gfm;
import defpackage.gzv;
import defpackage.gzz;
import defpackage.iov;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jdb;
import defpackage.jph;
import defpackage.jpq;
import defpackage.jpz;
import defpackage.jqj;
import defpackage.jqs;
import defpackage.jqt;
import defpackage.jxe;
import defpackage.jxu;
import defpackage.lmb;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qli;
import defpackage.qpx;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrk;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class DetailFrag extends SportResultBaseFragment implements View.OnClickListener {
    private LinearLayout aa;
    private HealthDivider ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private LinearLayout ae;
    private HealthDivider af;
    private HealthDivider ag;
    private LinearLayout ah;
    private LinearLayout ai;
    private String ak;
    private boolean al;
    private JumpDataView am;
    private HealthDivider an;
    private LinearLayout ao;
    private LinearLayout ap;
    private long aq;
    private LinearLayout ar;
    private LinearLayout as;
    private TotalDataRectView at;
    private HealthTextView au;
    private List<PostureJudgeBean> av;
    private LinearLayout ax;
    private LinearLayout ay;
    private LinearLayout az;
    private RunRouteView ba;
    private Map<String, Integer> bb;
    private HealthTextView bd;
    private LinearLayout be;
    private LinearLayout bf;
    private LinearLayout bg;
    private LinearLayout bh;
    private LinearLayout bi;
    private HealthTextView bj;
    private LinearLayout bk;
    private HealthTextView bm;
    private HealthTextView bn;
    private HealthTextView bo;
    private HealthTextView bp;
    private ShowProgress bq;
    private HealthTextView br;
    private ShowProgress bt;
    private HealthTextView bu;
    private ShowProgress bw;
    private ImageView bx;
    private UserProfileMgrApi by;
    private HealthTextView bz;
    private jqt ca;
    private HealthTextView cb;
    private HealthTextView k;
    private HealthTextView l;
    private UserInfomation m;
    private AiAnalysisView n;
    private BasketballScoreView p;
    private HealthTextView q;
    private LinearLayout u;
    private LinearLayout v;
    private LinearLayout x;
    private HealthDivider z;
    private static final int i = Color.parseColor("#D94142");
    private static final int f = Color.parseColor("#FF7500");
    private static final int h = Color.parseColor("#FF9800");
    private static final int d = Color.parseColor("#FFC51A");
    private static final int g = Color.parseColor("#64BB5C");
    private static final int j = Color.parseColor("#4CBABF");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f11027b = Color.parseColor("#00AAEE");
    private List<Integer> o = new ArrayList(4);
    private Map<SportDetailChartDataType, jph> r = new HashMap(20);
    private Resources aw = null;
    private TrackLineChartHolderImpl bs = null;
    private ArrayList<RunningPostureAdviceBase> bc = new ArrayList<>(16);
    private ArrayList<BasketballAdvice> s = new ArrayList<>(10);
    private DetailItemContainer t = null;
    private DetailItemContainer y = null;
    private TrackDetailItemDrawer bl = null;
    private int w = 0;
    private jqs bv = null;
    private HeartRateFrag aj = null;

    private boolean a(int i2) {
        return i2 == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Track_DetailFrag", "onCreateView()");
        this.al = LanguageUtil.ba(BaseApplication.getContext());
        if (i()) {
            return null;
        }
        g();
        if (!l()) {
            return null;
        }
        be();
        this.by = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.bs = new TrackLineChartHolderImpl(this.f11098a.getApplicationContext());
        this.aw = getResources();
        this.e = layoutInflater.inflate(R.layout.track_show_detail_fragment, viewGroup, false);
        k();
        this.ca = new jqt(this.e, this.f11098a);
        this.t = (DetailItemContainer) this.e.findViewById(R.id.track_detail_container);
        this.y = (DetailItemContainer) this.e.findViewById(R.id.track_golf_activity_container);
        this.bd = (HealthTextView) this.e.findViewById(R.id.track_detail_showtime);
        this.n = (AiAnalysisView) this.e.findViewById(R.id.ai_analysis_view);
        x();
        u();
        ap();
        o();
        aj();
        BaseActivity.cancelLayoutById(this.bi, this.bg);
        am();
        this.ak = this.aw.getString(R.string.IDS_motiontrack_show_invalid_data);
        y();
        s();
        c((LinearLayout) this.e.findViewById(R.id.track_detail));
        z();
        return this.e;
    }

    private Map<String, Object> bk() {
        HashMap map = new HashMap();
        int iRequestSportType = this.f11099c.d().requestSportType();
        long jRequestStartTime = this.f11099c.d().requestStartTime();
        long jRequestEndTime = this.f11099c.d().requestEndTime();
        map.put("startTime", Long.valueOf(jRequestStartTime));
        map.put("endTime", Long.valueOf(jRequestEndTime));
        map.put(BleConstants.SPORT_TYPE, String.valueOf(iRequestSportType));
        map.put("typeId", 30001);
        map.put("timeZone", lsl.q(System.currentTimeMillis()));
        return map;
    }

    private void o() {
        gfm gfmVar = new gfm();
        gfmVar.a(3);
        gfmVar.c(fxl.d());
        gfmVar.c(bk());
        gfmVar.a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        gfk.e().b(gfmVar, new ResultCallback<LinkedHashMap<Integer, gfl>>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(LinkedHashMap<Integer, gfl> linkedHashMap) {
                DetailFrag.this.a(linkedHashMap);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("Track_DetailFrag", "getAICoachInfo fail", th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final LinkedHashMap<Integer, gfl> linkedHashMap) {
        HandlerExecutor.c(new Runnable() { // from class: jml
            @Override // java.lang.Runnable
            public final void run() {
                this.f38731b.c(linkedHashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(LinkedHashMap linkedHashMap) {
        AiAnalysisView aiAnalysisView = this.n;
        if (aiAnalysisView != null) {
            aiAnalysisView.e((LinkedHashMap<Integer, gfl>) linkedHashMap);
        }
    }

    private void c(LinearLayout linearLayout) {
        CourseActionViewHolder courseActionViewHolder = new CourseActionViewHolder(this.f11098a);
        View viewE = courseActionViewHolder.e(at());
        boolean zA = courseActionViewHolder.a(this.f11099c.d());
        if (at() && zA) {
            viewE = c(viewE);
            this.e.setBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        }
        if (SportSupportUtil.d(this.f11099c.d())) {
            linearLayout.addView(courseActionViewHolder.a(false), linearLayout.indexOfChild(this.e.findViewById(R.id.layout_marketing)));
        }
        linearLayout.addView(viewE, linearLayout.indexOfChild(this.e.findViewById(R.id.layout_marketing)));
    }

    private boolean at() {
        return av() || bc();
    }

    private void z() {
        String extendDataString = this.f11099c.d().getExtendDataString("appName", null);
        if (TextUtils.isEmpty(extendDataString)) {
            LogUtil.a("Track_DetailFrag", "the Track Detail is not from third party app");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) this.e.findViewById(R.id.third_app_data_source);
        healthTextView.setText(this.f11098a.getResources().getString(R.string.IDS_data_from_sources, extendDataString));
        healthTextView.setVisibility(0);
    }

    private void k() {
        View viewInflate = LayoutInflater.from(this.f11098a).inflate(R.layout.track_history_detail_data_layout, (ViewGroup) null);
        a(viewInflate);
        if (at()) {
            viewInflate = c(viewInflate);
            this.e.setBackgroundColor(getResources().getColor(R.color.colorSubBackground));
        }
        ((LinearLayout) this.e.findViewById(R.id.layout_history_detail_data)).addView(viewInflate, -1, -2);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected String d() {
        return "Track_DetailFrag";
    }

    private void a(View view) {
        if (bc()) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.track_detail_percent);
            int extendDataInt = this.f11099c.d().getExtendDataInt("rankAbsolute");
            if (extendDataInt > 0) {
                healthTextView.setVisibility(0);
                healthTextView.setText(this.f11098a.getResources().getQuantityString(R.plurals.IDS_track_detail_rank_absolute, extendDataInt, UnitUtil.e(extendDataInt, 1, 0)));
                return;
            }
            int extendDataInt2 = this.f11099c.d().getExtendDataInt("rank");
            if (extendDataInt2 > 0) {
                healthTextView.setVisibility(0);
                healthTextView.setText(getString(R.string.IDS_track_detail_frag_percent, UnitUtil.e(extendDataInt2, 2, 0)));
            }
        }
    }

    private void aj() {
        if (!RunningRouteUtils.a(this.f11099c.d().requestSportType())) {
            LogUtil.a("Track_DetailFrag", "not support route track");
            return;
        }
        Map<String, String> mapRequestExtendDataMap = this.f11099c.d().requestExtendDataMap();
        if (!jxu.b(mapRequestExtendDataMap)) {
            LogUtil.a("Track_DetailFrag", "not manual punch track");
            bf();
        } else {
            b(mapRequestExtendDataMap);
        }
    }

    private void b(Map<String, String> map) {
        final String str = map.get("hotPathId");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_DetailFrag", "hotPathId is null in initManualPunchCard");
            return;
        }
        final int iE = jqj.e(this.f11099c.d());
        RunRouteView runRouteView = (RunRouteView) this.e.findViewById(R.id.layout_run_route_View);
        this.ba = runRouteView;
        d(runRouteView, str, 0, iE);
        this.ba.setHotPathName(map.get("hotPathName"));
        final String str2 = map.get("finishState");
        final long jT = t();
        if (jT != -1) {
            this.ba.setHotTrackParticipateNum(str2, (int) jT);
        }
        jxu.d(str, new HotTrackDrawCustomTarget<Drawable>() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.5
            @Override // com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget
            public void onGetHotTrackDetailInfo(gdm gdmVar) {
                if (DetailFrag.this.ba == null || gdmVar == null) {
                    ReleaseLogUtil.a("Track_DetailFrag", "mRunRouteView is null in onGetHotTrackDetailInfo");
                    return;
                }
                DetailFrag.this.ba.b(true);
                DetailFrag.this.ba.setVisibility(0);
                int iG = gdmVar.g();
                if (iG != iE) {
                    ReleaseLogUtil.e("Track_DetailFrag", "pathClassCloud is: ", Integer.valueOf(iG));
                    DetailFrag detailFrag = DetailFrag.this;
                    detailFrag.d(detailFrag.ba, str, 0, iG);
                }
                if (jT == -1) {
                    long jF = gdmVar.f();
                    LogUtil.a("Track_DetailFrag", "participateNum is ", Long.valueOf(gdmVar.f()));
                    DetailFrag.this.ba.setHotTrackParticipateNum(str2, (int) jF);
                    if (gdmVar.x() == 6) {
                        LogUtil.a("Track_DetailFrag", "path is offline");
                        DetailFrag.this.ba.setRouteStateShow();
                        DetailFrag detailFrag2 = DetailFrag.this;
                        detailFrag2.d(detailFrag2.ba, str, 6, iG);
                    }
                }
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                LogUtil.a("Track_DetailFrag", "onResourceReady");
                if (DetailFrag.this.ba != null) {
                    DetailFrag.this.ba.setHotPathDrawable(drawable);
                }
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.j("Track_DetailFrag", "onLoadCleared");
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                super.onLoadFailed(drawable);
                LogUtil.j("Track_DetailFrag", "onLoadFailed");
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jdb jdbVar = new jdb(DetailFrag.this.getActivity(), DetailFrag.this.f11099c.d(), 2);
            gdq gdqVarC = jdbVar.c();
            if (gdqVarC == null || gdqVarC.d() == null) {
                LogUtil.a("Track_DetailFrag", "not punch track");
                return;
            }
            jdbVar.a();
            final gdr gdrVarD = gdqVarC.d();
            HandlerExecutor.c(new Runnable() { // from class: jmu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38738c.a(gdrVarD);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(gdr gdrVar) {
            DetailFrag.this.a(gdrVar);
        }
    }

    private void bf() {
        ThreadPoolManager.c().execute(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(gdr gdrVar) {
        String strC;
        if (this.e == null) {
            ReleaseLogUtil.e("Track_DetailFrag", "mRootView is null in initRouteView");
            return;
        }
        RunRouteView runRouteView = (RunRouteView) this.e.findViewById(R.id.layout_run_route_View);
        if (runRouteView == null) {
            ReleaseLogUtil.e("Track_DetailFrag", "mRootView is null in initRouteView");
            return;
        }
        long jD = gdrVar.d();
        String strJ = gdrVar.j();
        String strH = gdrVar.h();
        int iO = gdrVar.o();
        int iA = gdrVar.a();
        gdw gdwVarI = gdrVar.i();
        if (gdwVarI == null) {
            strC = "";
        } else {
            strC = gdwVarI.c();
        }
        runRouteView.b(true);
        runRouteView.setVisibility(0);
        runRouteView.setHotPathName(strH);
        runRouteView.setHotTrackParticipateNum("", (int) jD);
        d(runRouteView, strJ, iO, iA);
        if (iO == 6) {
            runRouteView.setRouteStateShow();
        }
        runRouteView.setHotPathUrl(strC);
    }

    private long t() {
        FragmentActivity activity = getActivity();
        if (activity instanceof TrackDetailActivity) {
            return ((TrackDetailActivity) activity).e();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RunRouteView runRouteView, final String str, final int i2, final int i3) {
        runRouteView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(500)) {
                    LogUtil.a("Track_DetailFrag", "view click too fast");
                    return;
                }
                if (qrs.ah(DetailFrag.this.f11098a)) {
                    LogUtil.a("Track_DetailFrag", "Pad not support Popular Routes");
                } else if (i2 == 6) {
                    qpx.e(DetailFrag.this.f11098a, R.string.IDS_hw_routes_offline_toast);
                } else {
                    RunPopularRoutesUtil.e(DetailFrag.this.f11098a, 3, new RunPopularRoutesUtil.DialogCallBack() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.4.3
                        @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                        public void goNext() {
                            LogUtil.a("Track_DetailFrag", "Start jump To ClockingRankActivity");
                            if (i3 == 1) {
                                Intent intent = new Intent(DetailFrag.this.f11098a, (Class<?>) ClockingRankActivity.class);
                                intent.putExtra("PATH_ID", str);
                                intent.putExtra("pathClass", i3);
                                iov.d(DetailFrag.this.f11098a, intent);
                                return;
                            }
                            RunningRouteUtils.e(DetailFrag.this.f11098a, str, RunningRouteConstants.BiFromActivity.FROM_SPORT_RECORD.getIndex());
                        }

                        @Override // com.huawei.health.sport.utils.RunPopularRoutesUtil.DialogCallBack
                        public void notGoNext() {
                            LogUtil.a("Track_DetailFrag", "Cancle start jump To ClockingRankActivity");
                        }
                    });
                }
            }
        });
    }

    private void cb() {
        if (this.f11099c.bh()) {
            this.e.findViewById(R.id.track_detail_time_percentage_layout).setVisibility(0);
            ((LinearLayout) this.e.findViewById(R.id.time_percentage_chart)).addView(new TimePercentageView(this.f11098a, this.f11099c.d()));
        }
    }

    private void bt() {
        if (this.f11099c.bc()) {
            this.e.findViewById(R.id.track_detail_piste_percentage_layout).setVisibility(0);
            ((LinearLayout) this.e.findViewById(R.id.piste_percentage_chart)).addView(new PistePercentageView(this.f11098a, this.f11099c.d()));
        }
    }

    private void ap() {
        ((HealthTextView) this.e.findViewById(R.id.track_detail_showtime)).setText(UnitUtil.a(new Date(), 21));
        this.m = this.by.getUserInfo();
        this.bk = (LinearLayout) this.e.findViewById(R.id.track_detail_show_wear);
        this.bf = (LinearLayout) this.e.findViewById(R.id.track_detail_show_swim);
        this.v = (LinearLayout) this.e.findViewById(R.id.track_detail_show_golf_stat_title);
        this.u = (LinearLayout) this.e.findViewById(R.id.track_detail_golf_stat_title);
        this.bi = (LinearLayout) this.e.findViewById(R.id.track_detail_show_wear_content);
        this.bg = (LinearLayout) this.e.findViewById(R.id.track_detail_show_swim_content);
    }

    private void x() {
        this.bm = (HealthTextView) this.e.findViewById(R.id.track_detail_xg);
        this.bt = (ShowProgress) this.e.findViewById(R.id.track_detail_sp_xg);
        this.l = (HealthTextView) this.e.findViewById(R.id.track_detail_anaerobic_title);
        this.cb = (HealthTextView) this.e.findViewById(R.id.training_effect_show);
        this.au = (HealthTextView) this.e.findViewById(R.id.track_recovery_time_msg);
    }

    private void s() {
        if (LanguageUtil.c(this.f11098a)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bn.getLayoutParams();
            layoutParams.removeRule(4);
            layoutParams.addRule(8, R.id.track_detail_show_speed);
            layoutParams.addRule(6, R.id.track_detail_show_speed);
            this.bn.setLayoutParams(layoutParams);
            this.bn.setGravity(17);
        }
    }

    private void be() {
        if (l()) {
            this.bb = this.f11099c.d().requestSportData();
            int extendDataInt = this.f11099c.d().getExtendDataInt("eteAlgoKey", 0);
            this.w = extendDataInt;
            LogUtil.a("Track_DetailFrag", "detailFrag ete algo = ", Integer.valueOf(extendDataInt));
            Map<String, Integer> map = this.bb;
            if (map != null) {
                if (map.containsKey("anaerobic_exercise_etraining_effect")) {
                    LogUtil.a("Track_DetailFrag", "ANAEROBIC", this.bb.get("anaerobic_exercise_etraining_effect"));
                }
                if (this.bb.containsKey("etraining_effect")) {
                    LogUtil.a("Track_DetailFrag", "AEROBIC", this.bb.get("etraining_effect"));
                }
                if (this.bb.containsKey("max_met")) {
                    LogUtil.a("Track_DetailFrag", "MAX_MET", this.bb.get("max_met"));
                }
                if (this.bb.containsKey("recovery_time")) {
                    LogUtil.a("Track_DetailFrag", "RECOVERY_TIME", this.bb.get("recovery_time"));
                }
            }
            this.f11099c.d().printReleaseSimplifyLog("Track_DetailFrag");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        DetailItemContainer detailItemContainer;
        super.onConfigurationChanged(configuration);
        if (this.bl != null && (detailItemContainer = this.t) != null && this.y != null) {
            detailItemContainer.removeAllViews();
            this.y.removeAllViews();
            int dimensionPixelOffset = this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart);
            this.bl.d(this.t, false, 0, dimensionPixelOffset);
            this.bl.d(this.y, false, 3, dimensionPixelOffset);
        }
        LinearLayout linearLayout = this.ar;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            e(this.ar, this.f11099c.d(), this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart));
        }
        f();
    }

    private void f() {
        if (qrs.t()) {
            LogUtil.a("Track_DetailFrag", "adaptMateX, isTahitiModel: ", Boolean.valueOf(qrs.af(getContext())));
            e((HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_name));
            e((HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_name));
            e((HealthTextView) this.ae.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ae.findViewById(R.id.track_detail_posture_item_name));
            e((HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_name));
            e((HealthTextView) this.ah.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ah.findViewById(R.id.track_detail_posture_item_name));
            e((HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_name));
            m();
            n();
        }
    }

    private void m() {
        e((HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_name));
        e((HealthTextView) this.x.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.x.findViewById(R.id.track_detail_posture_item_name));
        e((HealthTextView) this.bh.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.bh.findViewById(R.id.track_detail_posture_item_name));
        e((HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_name));
        e((HealthTextView) this.ap.findViewById(R.id.track_detail_posture_item_value), (HealthTextView) this.ap.findViewById(R.id.track_detail_posture_item_name));
        bj();
    }

    private void n() {
        e((LinearLayout) this.e.findViewById(R.id.track_detail_show_running_posture_title));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_swing_angle));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_eversion_excursion));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_impact_acceleration));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_contact_time));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_hang_time));
        e((LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_hang_time_rate));
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_strike_pattern);
        e((LinearLayout) linearLayout.findViewById(R.id.track_detail_posture_item_title_layout));
        e((LinearLayout) linearLayout.findViewById(R.id.track_posture_proportionbar));
    }

    private void b(boolean z, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_level);
        if (z) {
            healthTextView.setMaxWidth(qrs.d(this.f11098a, 242.0f));
        } else {
            healthTextView.setMaxWidth(qrs.d(this.f11098a, 86.0f));
        }
    }

    private void bj() {
        boolean zAf = qrs.af(getContext());
        b(zAf, this.ao);
        b(zAf, this.ad);
        b(zAf, this.ae);
        b(zAf, this.ai);
        b(zAf, this.ah);
        b(zAf, this.aa);
        b(zAf, this.ac);
        b(zAf, this.x);
        b(zAf, this.bh);
        b(zAf, this.ax);
        b(zAf, this.ap);
    }

    private void e(HealthTextView healthTextView, HealthTextView healthTextView2) {
        int width;
        if (healthTextView2 == null) {
            ReleaseLogUtil.a("Track_DetailFrag", "itemNameView is null !");
            width = 0;
        } else {
            width = healthTextView2.getWidth();
        }
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f11098a, 0);
        if (healthTextView == null || !(healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ReleaseLogUtil.a("Track_DetailFrag", "itemValueView is null or layoutParams isn't the instance of LinearLauout.LayoutParams");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
        if (qrs.af(this.f11098a)) {
            int iA = (((int) healthColumnSystem.a(2)) + qqp.b(this.f11098a)) - width;
            if (iA < 0) {
                iA = qrs.d(this.f11098a, 12.0f);
            }
            layoutParams.setMarginStart(iA);
        } else {
            layoutParams.setMarginStart(qrs.d(this.f11098a, 12.0f));
        }
        healthTextView.setLayoutParams(layoutParams);
    }

    private void e(LinearLayout linearLayout) {
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMarginStart(this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart));
            layoutParams.setMarginEnd(this.aw.getDimensionPixelOffset(R.dimen.maxPaddingEnd));
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        ReleaseLogUtil.a("Track_DetailFrag", "linearLayout is null or layoutParams isn't the instance of LinearLauout.LayoutParams");
    }

    private void u() {
        this.k = (HealthTextView) this.e.findViewById(R.id.track_detail_aerobic_title);
        this.bj = (HealthTextView) this.e.findViewById(R.id.track_detail_anaerobic_xg);
        this.bq = (ShowProgress) this.e.findViewById(R.id.track_detail_sp_anaerobic_xg);
        this.q = (HealthTextView) this.e.findViewById(R.id.sug_detail_ox);
        this.bz = (HealthTextView) this.e.findViewById(R.id.sug_detail_ox_unit);
        this.bx = (ImageView) this.e.findViewById(R.id.track_detail_vo2max_arrow);
        this.bw = (ShowProgress) this.e.findViewById(R.id.track_detail_sp_ox);
        this.bp = (HealthTextView) this.e.findViewById(R.id.track_detail_ritire_duration);
        this.bo = (HealthTextView) this.e.findViewById(R.id.track_detail_show_speed);
        this.bn = (HealthTextView) this.e.findViewById(R.id.track_detail_show_speed_unit);
        this.br = (HealthTextView) this.e.findViewById(R.id.smart_coach_after_sport_data_interpretation);
        this.az = (LinearLayout) this.e.findViewById(R.id.layout_smart_coach_sport_data_interpretation);
        this.bu = (HealthTextView) this.e.findViewById(R.id.track_ox_msg);
    }

    private void am() {
        this.ay = (LinearLayout) this.e.findViewById(R.id.track_show_running_posture);
        BaseActivity.cancelLayoutById((LinearLayout) this.e.findViewById(R.id.track_show_running_posture_content));
        ((ImageView) this.e.findViewById(R.id.posture_information_icon)).setOnClickListener(new View.OnClickListener() { // from class: jmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dem.b().a("FOOT_DATA");
            }
        });
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_contact_time);
        this.ao = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_hang_time);
        this.ax = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_hang_time_rate);
        this.ap = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_impact_acceleration);
        this.ad = linearLayout4;
        linearLayout4.setOnClickListener(this);
        LinearLayout linearLayout5 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_touchdown_balance);
        this.ae = linearLayout5;
        linearLayout5.setOnClickListener(this);
        this.af = (HealthDivider) this.e.findViewById(R.id.track_detail_running_posture_ground_touchdown_balance_line);
        LinearLayout linearLayout6 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude);
        this.ai = linearLayout6;
        linearLayout6.setOnClickListener(this);
        this.ag = (HealthDivider) this.e.findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_line);
        LinearLayout linearLayout7 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_ratio);
        this.ah = linearLayout7;
        linearLayout7.setOnClickListener(this);
        this.an = (HealthDivider) this.e.findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_ratio_line);
        LinearLayout linearLayout8 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_shock_peak);
        this.aa = linearLayout8;
        linearLayout8.setOnClickListener(this);
        this.z = (HealthDivider) this.e.findViewById(R.id.track_detail_running_posture_ground_shock_peak_line);
        LinearLayout linearLayout9 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_ground_impact_load_rate);
        this.ac = linearLayout9;
        linearLayout9.setOnClickListener(this);
        this.ab = (HealthDivider) this.e.findViewById(R.id.track_detail_running_posture_ground_impact_load_rate_line);
        LinearLayout linearLayout10 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_eversion_excursion);
        this.x = linearLayout10;
        linearLayout10.setOnClickListener(this);
        LinearLayout linearLayout11 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_swing_angle);
        this.bh = linearLayout11;
        linearLayout11.setOnClickListener(this);
        LinearLayout linearLayout12 = (LinearLayout) this.e.findViewById(R.id.track_detail_running_posture_strike_pattern);
        this.be = linearLayout12;
        linearLayout12.setOnClickListener(this);
        al();
        bj();
    }

    private void y() {
        ViewStub viewStub;
        if (l()) {
            this.bb = this.f11099c.d().requestSportData();
            if (LanguageUtil.bt(this.f11098a)) {
                this.bd.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.ENGLISH).format(Long.valueOf(this.f11099c.d().requestStartTime())));
            } else {
                this.bd.setText(qrk.a(this.f11098a, this.f11099c.d().requestStartTime(), 21));
            }
            ab();
            TrackDetailItemDrawer trackDetailItemDrawer = new TrackDetailItemDrawer(this.f11099c.d(), this.f11099c.b(), this.f11098a, 100);
            this.bl = trackDetailItemDrawer;
            trackDetailItemDrawer.d(this.t, false, 0, this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart));
            this.bl.d(this.y, false, 3, this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart));
            if (this.f11099c.d().requestTrackType() == 1 && (viewStub = (ViewStub) this.e.findViewById(R.id.viewstub_track_detail_auto_track)) != null) {
                viewStub.inflate().setVisibility(0);
            }
            bw();
            bh();
            bm();
            bn();
            bv();
            bq();
            bo();
            bp();
            h();
            cb();
            bt();
            this.f11099c.d(this.bl.a());
        }
    }

    private void bp() {
        String str;
        ViewStub viewStub = (ViewStub) this.e.findViewById(R.id.track_detail_lactic_data);
        final MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        if (motionPathSimplifyD != null) {
            Map<String, String> mapRequestExtendDataMap = motionPathSimplifyD.requestExtendDataMap();
            if (!mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_RECORD_FLAG)) {
                str = "";
            } else {
                str = mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_RECORD_FLAG);
            }
            LogUtil.d("Track_DetailFrag", "showLacticData() recordFlag = ", str);
            if (TextUtils.isEmpty(str) || !"7".equals(str)) {
                return;
            }
            View viewInflate = viewStub.inflate();
            if (LanguageUtil.ba(this.f11098a)) {
                ((ImageView) viewInflate.findViewById(R.id.track_detail_lactic_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            }
            if (LanguageUtil.g(this.f11098a)) {
                ((TextView) viewInflate.findViewById(R.id.track_detail_lactic_item_title)).setTextSize(0, qrs.d(this.f11098a, 12.0f));
            }
            LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.track_detail_lactic_data_items);
            this.ar = linearLayout;
            e(linearLayout, motionPathSimplifyD, this.aw.getDimensionPixelOffset(R.dimen.maxPaddingStart));
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: jmn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38734a.c(motionPathSimplifyD, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MotionPathSimplify motionPathSimplify, View view) {
        LogUtil.a("Track_DetailFrag", "click lactate threshold");
        if (qrs.r()) {
            LogUtil.j("Track_DetailFrag", "showLacticData isFastClick.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(this.f11098a, "com.huawei.ui.main.stories.health.activity.healthdata.LacticActivity");
            intent.putExtra("key_bundle_health_last_data_time", motionPathSimplify.requestStartTime());
            this.f11098a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_DetailFrag", "showLacticData exception.");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected int c() {
        int iRequestSportType = this.f11099c.d().requestSportType();
        if (iRequestSportType == 258 || iRequestSportType == 227) {
            return 4155;
        }
        if (iRequestSportType == 264) {
            return 4176;
        }
        return iRequestSportType == 257 ? 4203 : -1;
    }

    private void e(LinearLayout linearLayout, MotionPathSimplify motionPathSimplify, int i2) {
        String string;
        SportDetailItem.a aVar = new SportDetailItem.a(qre.c(R.drawable.ic_heart_rate), ObserveLabels.HEART_RATE, qre.f(R.string.IDS_lactate_threshold_heart_rate), getString(R.string.IDS_lactate_threshold_measurement_failure), "", "");
        SportDetailItem.a aVar2 = new SportDetailItem.a(qre.c(R.drawable.ic_avg_pace), "AVERAGE_PACE", qre.f(R.string.IDS_lactate_threshold_pace), getString(R.string.IDS_lactate_threshold_measurement_failure), "", "");
        int extendDataInt = motionPathSimplify.getExtendDataInt("lthrHr");
        if (extendDataInt > 0) {
            aVar.c(UnitUtil.e(extendDataInt, 1, 0));
            aVar.a(this.aw.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        }
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("lthrPace");
        if (extendDataInt2 > 0) {
            boolean zF = UnitUtil.f();
            aVar2.c(izn.a(zF ? (float) UnitUtil.c(extendDataInt2, 3) : extendDataInt2));
            StringBuilder sb = new StringBuilder("/");
            if (zF) {
                string = this.aw.getString(R.string.IDS_motiontrack_show_sport_unit_mi);
            } else {
                string = this.aw.getString(R.string.IDS_motiontrack_show_sport_unit_km);
            }
            sb.append(string);
            aVar2.a(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        arrayList.add(aVar2);
        new TrackDetailItemDrawer.TrackDetailItemDrawHelper(this.f11098a).e(linearLayout, i2, arrayList, false, this.aw.getColor(R.color.textColorPrimary));
    }

    private LinearLayout c(View view) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f11098a).inflate(R.layout.track_history_detail_card_layout, (ViewGroup) null);
        ((HealthCardView) linearLayout.findViewById(R.id.history_detail_card_view)).addView(view, -1, -2);
        return linearLayout;
    }

    private boolean av() {
        return this.f11099c.d().requestSportType() == 283;
    }

    private boolean bc() {
        return this.f11099c.d().requestSportType() == 290;
    }

    private void bo() {
        LogUtil.a("Track_DetailFrag", "showRopeSkippingChart");
        if (j()) {
            MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
            MotionPath motionPathB = this.f11099c.b();
            if (av() || bc()) {
                this.aj = new HeartRateFrag();
                this.bv = new jqs(this.bs, this.f11099c);
                d(motionPathSimplifyD, motionPathB);
            }
            if (av()) {
                e(motionPathSimplifyD, motionPathB);
                a(motionPathSimplifyD, motionPathB);
            }
        }
    }

    private void d(final MotionPathSimplify motionPathSimplify, final MotionPath motionPath) {
        LogUtil.a("Track_DetailFrag", "showRopeSkippingHeartRateChart");
        if (this.f11099c.ag()) {
            return;
        }
        this.bv.d(SportDetailChartDataType.HEART_RATE, motionPathSimplify, motionPath);
        this.e.findViewById(R.id.layout_ai_skipping_heartrate_card).setVisibility(0);
        jph jphVar = new jph();
        jphVar.d(this.e, R.id.layout_ai_skipping_heartrate);
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.f11098a, 100, false, 1);
        trackChartViewHolder.c(motionPathSimplify.requestAvgHeartRate());
        trackChartViewHolder.a(gzz.d(motionPath.requestHeartRateList()));
        jphVar.c(trackChartViewHolder.getCombinedChart());
        jphVar.c(trackChartViewHolder.a());
        jphVar.c().setLogEnabled(true);
        jphVar.d().addView(trackChartViewHolder);
        jpq.b(0, trackChartViewHolder.c(), ObserveLabels.HEART_RATE);
        TrackLineChartHolder.setInstance(this.bs);
        e(qrs.c((Activity) getActivity()), jphVar, "BASELINE_HEART_RATE", 0, motionPathSimplify.requestSportType());
        this.bs.addHeartRateDataLayer(jphVar.c(), motionPathSimplify.requestAvgHeartRate());
        jphVar.c().setTouchEnabled(false);
        jphVar.c().setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        jphVar.c().refresh();
        this.r.put(SportDetailChartDataType.HEART_RATE, jphVar);
        this.aj.b(this.e, this.f11098a);
        HandlerExecutor.b(new Runnable() { // from class: jmm
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(motionPath, motionPathSimplify);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        this.aj.a(motionPath.requestHeartRateList(), motionPathSimplify);
    }

    private void e(boolean z, jph jphVar, String str, int i2, int i3) {
        if (jphVar == null) {
            LogUtil.j("Track_DetailFrag", "processIconAndOnClickListener chartModel is null.");
            return;
        }
        if (z) {
            if (jphVar.b() != null) {
                jphVar.b().setVisibility(8);
            }
            if (jphVar.c() != null) {
                jphVar.c().setOnSingleTapConfirmedListener(null);
                return;
            }
            return;
        }
        if (jphVar.b() != null) {
            jphVar.b().setVisibility(0);
        }
        HeartRateFrag heartRateFrag = this.aj;
        if (heartRateFrag != null) {
            heartRateFrag.d(jphVar, str, i2, this.f11098a, i3);
        }
    }

    private void e(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        if (this.f11099c.an()) {
            return;
        }
        this.bv.d(SportDetailChartDataType.HEART_RATE_RECOVERY, motionPathSimplify, motionPath);
        this.e.findViewById(R.id.layout_ai_skipping_recover_heartrate_card).setVisibility(0);
        jph jphVar = new jph();
        jphVar.d(this.e, R.id.layout_ai_skipping_recover_heartrate);
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.f11098a, 100, false, 124);
        jphVar.c(trackChartViewHolder.getCombinedChart());
        jphVar.e(trackChartViewHolder);
        jphVar.c(trackChartViewHolder.a());
        jphVar.c().setLogEnabled(true);
        jphVar.d().addView(trackChartViewHolder);
        TrackLineChartHolder.setInstance(this.bs);
        trackChartViewHolder.a().setVisibility(8);
        jpq.b(0, trackChartViewHolder.c(), "RECOVERY_HEART_RATE");
        this.bs.addRecoverHeartRateLayer(jphVar.c());
        d(motionPath, jphVar);
        jphVar.c().setTouchEnabled(false);
        jphVar.c().setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        jpq.e(SportDetailChartDataType.HEART_RATE_RECOVERY, jphVar, this.f11098a, this.f11099c);
        jphVar.c().refresh();
    }

    private void d(MotionPath motionPath, jph jphVar) {
        int iAcquireHeartRate;
        int iAcquireHeartRate2;
        List<HeartRateData> listRequestHeartRecoveryRateList = motionPath.requestHeartRecoveryRateList();
        if (listRequestHeartRecoveryRateList == null || listRequestHeartRecoveryRateList.size() <= 0) {
            return;
        }
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
        jphVar.a().c((iAcquireHeartRate2 - iAcquireHeartRate) / 2.0f);
        jphVar.a().e(iAcquireHeartRate2, iAcquireHeartRate);
    }

    private void a(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        LogUtil.a("Track_DetailFrag", "showRopeSkippingSpeedChart");
        if (this.f11099c.ap()) {
            return;
        }
        this.bv.d(SportDetailChartDataType.SKIPPING_SPEED, motionPathSimplify, motionPath);
        this.e.findViewById(R.id.layout_ai_skipping_card).setVisibility(0);
        jph jphVar = new jph();
        jphVar.d(this.e, R.id.layout_ai_skipping_speed);
        TrackChartViewHolder trackChartViewHolder = new TrackChartViewHolder(this.f11098a, 100, false, 16);
        trackChartViewHolder.c(motionPathSimplify.getExtendDataInt("skipSpeed", 0));
        trackChartViewHolder.a(jpq.h(motionPath.requestSkippingSpeedList()));
        jphVar.c(trackChartViewHolder.getCombinedChart());
        jphVar.c(trackChartViewHolder.a());
        jphVar.c().setLogEnabled(true);
        jphVar.d().addView(trackChartViewHolder);
        TrackLineChartHolder.setInstance(this.bs);
        e(qrs.c((Activity) getActivity()), jphVar, "BASELINE_SKIPPING_SPEED", 15, motionPathSimplify.requestSportType());
        this.bs.addSkippingSpeedDataLayer(jphVar.c());
        jphVar.c().setTouchEnabled(false);
        jphVar.c().setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
        jphVar.c().refresh();
        this.r.put(SportDetailChartDataType.SKIPPING_SPEED, jphVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        if (this.f11099c == null) {
            LogUtil.j("Track_DetailFrag", "onMultiWindowModeChanged mTrackDetailDataManager is null.;");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        if (motionPathSimplifyD == null) {
            LogUtil.j("Track_DetailFrag", "onMultiWindowModeChanged motionPathSimplify is null.");
            return;
        }
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.r.entrySet()) {
            a(entry.getKey(), entry.getValue(), z, motionPathSimplifyD.requestSportType());
        }
    }

    private void a(SportDetailChartDataType sportDetailChartDataType, jph jphVar, boolean z, int i2) {
        if (sportDetailChartDataType == SportDetailChartDataType.HEART_RATE) {
            e(z, jphVar, "BASELINE_HEART_RATE", 0, i2);
        } else if (sportDetailChartDataType == SportDetailChartDataType.SKIPPING_SPEED) {
            e(z, jphVar, "BASELINE_SKIPPING_SPEED", 15, i2);
        } else {
            LogUtil.j("Track_DetailFrag", "chart does not exist.");
        }
    }

    private void bv() {
        if (!jpq.d(this.f11099c.d().requestSportType(), this.f11099c.d().requestSportDataSource()) || njy.e(this.f11099c.b().requestResistanceList())) {
            ReleaseLogUtil.e("Track_DetailFrag", "not support Resistance list");
            return;
        }
        SpeedPercentView speedPercentView = (SpeedPercentView) this.e.findViewById(R.id.resistance_chart_view);
        ((LinearLayout) this.e.findViewById(R.id.resistance_chart_layout)).setVisibility(0);
        speedPercentView.setData(this.f11099c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i2) {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.suggestion.ui.BasketballSuggestionActivity");
        intent.putExtra("basketballFlag", i2);
        intent.putParcelableArrayListExtra("basketballAdviceList", this.s);
        if (AppBundle.d() != null) {
            ReleaseLogUtil.d("Track_DetailFrag", "start launching the PluginFitnessAdvice module");
            intent.putExtra("moduleName", "PluginFitnessAdvice");
            AppBundle.d().launchActivity(this.f11098a, intent, null);
        } else {
            try {
                this.f11098a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Track_DetailFrag", "startBasketballSuggestionActivity exception.");
            }
        }
    }

    private void e(List<lmb> list) {
        BasketballAdvice basketballAdvice = new BasketballAdvice(-1, 0);
        BasketballAdvice basketballAdvice2 = new BasketballAdvice(-1, 1);
        if (list != null) {
            basketballAdvice.setValue(jpq.c(list));
            basketballAdvice2.setValue(jpq.d(list));
        }
        this.s.add(basketballAdvice);
        this.s.add(basketballAdvice2);
    }

    private void bn() {
        int iC;
        int iD;
        if (this.f11099c.d().requestSportType() == 271 && this.f11099c.d().requestChiefSportDataType() == 5) {
            bb();
            ao();
            int i2 = 0;
            this.am.setVisibility(0);
            Map<String, Integer> mapRequestSportData = this.f11099c.d().requestSportData();
            if (mapRequestSportData == null) {
                ReleaseLogUtil.a("Track_DetailFrag", "sportData is null");
                return;
            }
            List<lmb> listRequestJumpDataList = this.f11099c.b() != null ? this.f11099c.b().requestJumpDataList() : null;
            if (listRequestJumpDataList != null) {
                iC = jpq.c(listRequestJumpDataList);
                this.am.setJumpHeight(iC);
                LogUtil.d("Track_DetailFrag", "countAverageJumpHeight(trackJumpDataList)", Integer.valueOf(iC));
                iD = jpq.d(listRequestJumpDataList);
                this.am.setJumpDuration(iD);
                LogUtil.d("Track_DetailFrag", "countAverageJumptime(trackJumpDataList)", 0);
            } else {
                iC = 0;
                iD = 0;
            }
            if (mapRequestSportData.containsKey("jump_times") && mapRequestSportData.get("jump_times") != null) {
                Integer num = mapRequestSportData.get("jump_times");
                int iIntValue = num.intValue();
                this.am.setJumpTimes(iIntValue);
                LogUtil.d("Track_DetailFrag", "SPORT_DATA_KEY_JUMP_TIMES", num);
                i2 = iIntValue;
            }
            if (a(iD) && a(i2) && a(iC)) {
                this.am.setVisibility(8);
            }
            w();
            ((LinearLayout) this.e.findViewById(R.id.track_detail_show_distance)).setVisibility(8);
            a(mapRequestSportData);
            e(listRequestJumpDataList);
            bi();
        }
    }

    private void bi() {
        this.am.getHeightLayout().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DetailFrag.this.j(0);
            }
        });
        this.am.getAverageJumpDurationLayout().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DetailFrag.this.j(1);
            }
        });
    }

    private void ao() {
        BasketballScoreView basketballScoreView = (BasketballScoreView) this.e.findViewById(R.id.basketball_score);
        this.p = basketballScoreView;
        basketballScoreView.setVisibility(0);
        BaseActivity.cancelLayoutById(this.p);
        this.am = (JumpDataView) this.e.findViewById(R.id.jump_view);
    }

    private void bb() {
        if (LanguageUtil.l(getContext()) && !Utils.o() && CommonUtil.af(getContext())) {
            this.e.findViewById(R.id.basketball_knowlege).setVisibility(0);
        } else {
            this.e.findViewById(R.id.basketball_knowlege).setVisibility(8);
        }
    }

    private void a(Map<String, Integer> map) {
        double dIntValue;
        this.as = (LinearLayout) this.e.findViewById(R.id.track_detail_linear_layout_moving);
        SpeedPercentView speedPercentView = (SpeedPercentView) this.e.findViewById(R.id.speed_percent_view);
        ReleaseLogUtil.d("Track_DetailFrag", "all zero", Boolean.valueOf(this.f11099c.b().isValidSpeedList()));
        this.as.setVisibility(0);
        if (!this.f11099c.b().isValidSpeedList()) {
            this.as.setVisibility(8);
            return;
        }
        HealthTextView healthTextView = (HealthTextView) this.e.findViewById(R.id.tv_track_detail_avg_speed);
        if (LanguageUtil.o(this.f11098a) || LanguageUtil.bs(this.f11098a) || LanguageUtil.bo(this.f11098a)) {
            healthTextView.setText(getString(R.string.IDS_aw_version2_average_moving_speed));
        }
        HealthTextView healthTextView2 = (HealthTextView) this.e.findViewById(R.id.track_detail_moving_speed);
        HealthTextView healthTextView3 = (HealthTextView) this.e.findViewById(R.id.max_spriting_speed);
        speedPercentView.setData(this.f11099c);
        if (!map.containsKey("max_spriting_speed")) {
            dIntValue = 0.0d;
        } else if (UnitUtil.f()) {
            dIntValue = UnitUtil.e((map.get("max_spriting_speed").intValue() * 3.6f) / 10.0f, 3);
        } else {
            dIntValue = (map.get("max_spriting_speed").intValue() * 3.6f) / 10.0f;
        }
        a(dIntValue, healthTextView2, healthTextView3);
    }

    private void a(double d2, HealthTextView healthTextView, HealthTextView healthTextView2) {
        healthTextView2.setText(UnitUtil.e(d2, 1, 1));
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.e.findViewById(R.id.track_share_heart_title);
        int iRequestTotalDistance = this.f11099c.d().requestTotalDistance();
        long jRequestTotalTime = this.f11099c.d().requestTotalTime() / 1000;
        double dE = 0.0d;
        if (UnitUtil.f()) {
            dE = jRequestTotalTime != 0 ? UnitUtil.e(((((double) iRequestTotalDistance) * 1.0d) / jRequestTotalTime) * 3.5999999046325684d, 3) : 0.0d;
            healthSubHeader.setHeadTitleText(this.f11098a.getString(R.string.IDS_aw_version2_moving_speed_with_mile));
        } else if (jRequestTotalTime != 0) {
            dE = ((((double) iRequestTotalDistance) * 1.0d) / jRequestTotalTime) * 3.5999999046325684d;
        }
        double d3 = dE;
        healthTextView.setText(UnitUtil.e(d3, 1, 1));
        if (izn.a(d2) || izn.a(d3)) {
            this.as.setVisibility(8);
        }
    }

    private void w() {
        Map<String, Integer> mapRequestSportData = this.f11099c.d().requestSportData();
        if (mapRequestSportData == null) {
            ReleaseLogUtil.a("Track_DetailFrag", "sportData is null");
            return;
        }
        int[] iArrC = jpq.c(mapRequestSportData);
        int iIntValue = 0;
        if (iArrC != null) {
            for (int i2 : iArrC) {
                LogUtil.d("Track_DetailFrag", "each Score is", Integer.valueOf(i2));
            }
        }
        if (mapRequestSportData.containsKey("overall_score") && mapRequestSportData.get("overall_score") != null) {
            iIntValue = mapRequestSportData.get("overall_score").intValue();
        }
        if (mapRequestSportData.containsKey("active_time") && mapRequestSportData.get("active_time") != null) {
            this.p.setActiveTime(mapRequestSportData.get("active_time").intValue());
        }
        this.p.setRadarScore(iArrC);
        this.p.setAverageScore(iIntValue);
        this.p.setBasketballStamp(true);
        this.p.setScoreInfoText(this.f11098a);
    }

    private void bw() {
        LogUtil.a("Track_DetailFrag", " showSwim");
        if (this.f11099c.d().requestSportType() == 266 || this.f11099c.d().requestSportType() == 262) {
            boolean zAz = az();
            boolean zAy = ay();
            boolean zBa = ba();
            if (zAz || zAy || zBa) {
                this.bf.setVisibility(0);
                ((LinearLayout) this.e.findViewById(R.id.track_detail_show_swim_title)).setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dem.b().a("SWIM_PULL_TIMES");
                    }
                });
                return;
            } else {
                this.bf.setVisibility(8);
                return;
            }
        }
        this.bf.setVisibility(8);
    }

    private void bq() {
        LogUtil.a("Track_DetailFrag", " showGolf");
        if (this.f11099c.d().requestSportType() == 220) {
            p();
            this.u.setVisibility(0);
            ((LinearLayout) this.e.findViewById(R.id.track_detail_show_golf_stat_title)).setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dem.b().a("BACK_SWING");
                }
            });
        } else {
            this.v.setVisibility(8);
            this.u.setVisibility(8);
        }
    }

    private void p() {
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        boolean z = motionPathSimplifyD.requestSportDataSource() == 2;
        boolean z2 = ((motionPathSimplifyD.getExtendDataDouble("golfBackSwingTime") > (-1.0d) ? 1 : (motionPathSimplifyD.getExtendDataDouble("golfBackSwingTime") == (-1.0d) ? 0 : -1)) == 0 && (motionPathSimplifyD.getExtendDataDouble("golfDownSwingTime") > (-1.0d) ? 1 : (motionPathSimplifyD.getExtendDataDouble("golfDownSwingTime") == (-1.0d) ? 0 : -1)) == 0) && ((motionPathSimplifyD.getExtendDataDouble("golfSwingTempo") > (-1.0d) ? 1 : (motionPathSimplifyD.getExtendDataDouble("golfSwingTempo") == (-1.0d) ? 0 : -1)) == 0 && (motionPathSimplifyD.getExtendDataDouble("golfMaxSwingSpeed") > (-1.0d) ? 1 : (motionPathSimplifyD.getExtendDataDouble("golfMaxSwingSpeed") == (-1.0d) ? 0 : -1)) == 0 && (motionPathSimplifyD.getExtendDataDouble("golfSwingSpeed") > (-1.0d) ? 1 : (motionPathSimplifyD.getExtendDataDouble("golfSwingSpeed") == (-1.0d) ? 0 : -1)) == 0);
        if (z || z2) {
            this.v.setVisibility(8);
        } else {
            this.v.setVisibility(0);
        }
    }

    private boolean az() {
        String quantityString;
        float fRequestAvgPace = this.f11099c.d().requestAvgPace();
        if (fRequestAvgPace > 0.0f) {
            String strJ = jpq.j(fRequestAvgPace);
            if (UnitUtil.f()) {
                quantityString = this.aw.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            } else {
                quantityString = this.aw.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
            }
            ((HealthTextView) this.e.findViewById(R.id.track_detail_swim_avg_pace)).setText(strJ);
            ((HealthTextView) this.e.findViewById(R.id.track_detail_swim_avg_pace_unit)).setText(quantityString);
            return true;
        }
        this.e.findViewById(R.id.track_detail_swim_avg_pace_layout).setVisibility(8);
        return false;
    }

    private boolean ay() {
        Map<String, Integer> map = this.bb;
        if (map == null || map.get("swim_pull_freq") == null) {
            this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate_layout).setVisibility(8);
            this.e.findViewById(R.id.track_detail_swim_avg_pace_line).setVisibility(8);
            return false;
        }
        int iIntValue = this.bb.get("swim_pull_freq").intValue();
        if (iIntValue <= 0) {
            this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate_layout).setVisibility(8);
            this.e.findViewById(R.id.track_detail_swim_avg_pace_line).setVisibility(8);
            return false;
        }
        String quantityString = this.aw.getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, iIntValue);
        ((HealthTextView) this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate)).setText(UnitUtil.e(iIntValue, 1, 0));
        ((HealthTextView) this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate_unit)).setText(quantityString);
        return true;
    }

    private boolean ba() {
        Map<String, Integer> map = this.bb;
        if (map == null || map.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF) == null) {
            this.e.findViewById(R.id.track_detail_swim_avg_swolf_layout).setVisibility(8);
            this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate_line).setVisibility(8);
            return false;
        }
        int iIntValue = this.bb.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF).intValue();
        if (iIntValue <= 0) {
            this.e.findViewById(R.id.track_detail_swim_avg_swolf_layout).setVisibility(8);
            this.e.findViewById(R.id.track_detail_swim_avg_stroke_rate_line).setVisibility(8);
            return false;
        }
        ((HealthTextView) this.e.findViewById(R.id.track_detail_swim_avg_swolf)).setText(UnitUtil.e(iIntValue, 1, 0));
        return true;
    }

    private void bh() {
        if (this.bb != null) {
            if (this.m != null) {
                bd();
                return;
            } else {
                this.bk.setVisibility(8);
                ThreadPoolManager.c().execute(new Runnable() { // from class: jmq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.bg();
                    }
                });
                return;
            }
        }
        this.bk.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bg() {
        r();
        this.by.waitInit();
        this.m = this.by.getLocalUserInfo();
        HandlerExecutor.c(new Runnable() { // from class: jmo
            @Override // java.lang.Runnable
            public final void run() {
                this.d.bd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ca, reason: merged with bridge method [inline-methods] */
    public void bd() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("Track_DetailFrag", "activity is finishing");
            return;
        }
        bl();
        br();
        if (jpq.a(this.f11099c).booleanValue()) {
            d(false);
        } else {
            this.e.findViewById(R.id.layout_vo2max).setVisibility(8);
        }
        bu();
        bx();
        bs();
    }

    private void bs() {
        if (njy.b(this.o)) {
            List<Integer> list = this.o;
            d(list.get(list.size() - 1).intValue());
        } else {
            this.bk.setVisibility(8);
        }
    }

    private void d(int i2) {
        if (i2 == 0) {
            this.e.findViewById(R.id.divide_excise_effect).setVisibility(8);
        } else if (i2 == 1) {
            this.e.findViewById(R.id.divide_anaerobic).setVisibility(8);
        } else {
            if (i2 != 2) {
                return;
            }
            this.e.findViewById(R.id.divide_vo2max).setVisibility(8);
        }
    }

    private void bx() {
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.track_detail_show_wear_title);
        if (this.e.findViewById(R.id.layout_excise_effect).getVisibility() == 8 && this.e.findViewById(R.id.layout_vo2max).getVisibility() == 8 && this.e.findViewById(R.id.layout_recover_time).getVisibility() == 8 && this.e.findViewById(R.id.layout_aerobic_excise_effect).getVisibility() == 8) {
            linearLayout.setVisibility(8);
            this.bk.setVisibility(8);
        } else {
            this.bk.setVisibility(0);
            d(linearLayout);
        }
    }

    private void d(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DetailFrag.this.w != 0) {
                    dem.b().a("AEROBIC_TRAINING_STRESS");
                } else {
                    jpq.e(4, DetailFrag.this.f11098a, DetailFrag.this.w);
                }
            }
        });
    }

    private void bu() {
        if (this.bb.get("recovery_time") != null) {
            int hours = (int) TimeUnit.MINUTES.toHours(this.bb.get("recovery_time").intValue());
            if (av()) {
                e(hours);
                return;
            } else {
                c(hours);
                this.o.add(3);
                return;
            }
        }
        this.e.findViewById(R.id.layout_recover_time).setVisibility(8);
    }

    private void c(int i2) {
        if (i2 <= 0) {
            this.e.findViewById(R.id.layout_recover_time).setVisibility(8);
            return;
        }
        d(i2, this.bp);
        if (i2 > 35) {
            b(i2).add(10, -35);
        }
        this.au.setText(jpq.a(i2));
    }

    private void e(int i2) {
        this.e.findViewById(R.id.layout_recover_time).setVisibility(8);
        if (i2 <= 0) {
            return;
        }
        this.e.findViewById(R.id.layout_ai_skipping_train_card).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.track_detail_show_wear_title_skiping);
        linearLayout.setVisibility(0);
        d(linearLayout);
        d(i2, (HealthTextView) this.e.findViewById(R.id.track_detail_ritire_duration_skipping));
        ((HealthTextView) this.e.findViewById(R.id.track_skip_recovery_time_msg)).setText(jpq.a(i2));
    }

    private void d(int i2, HealthTextView healthTextView) {
        healthTextView.setText(jpq.b("\\d", this.f11098a.getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_recover_time_hour, i2, Integer.valueOf(i2)), R.style.track_detail_time_b, R.style.track_detail_time_s, getContext()));
    }

    public int b() {
        return CommonUtil.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005), 0);
    }

    public int e() {
        if (this.m == null) {
            r();
            this.m = this.by.getLocalUserInfo();
        }
        return this.m.getAgeOrDefaultValue();
    }

    private void r() {
        if (this.by == null) {
            LogUtil.a("Track_DetailFrag", "getOrDefault.");
            this.by = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        }
    }

    public void d(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("Track_DetailFrag", "showVo2maxAbility activity is null or finishing or destroyed");
            return;
        }
        if (this.e == null) {
            ReleaseLogUtil.e("Track_DetailFrag", "mRootView is null in showVo2maxAbility.");
            return;
        }
        Map<String, Integer> map = this.bb;
        if (map != null && map.get("max_met") != null) {
            int iIntValue = ((int) (this.bb.get("max_met").intValue() * 3.5f)) / 65536;
            LogUtil.a("Track_DetailFrag", "userVo2max=", Integer.valueOf(iIntValue));
            if (z) {
                this.m = this.by.getLocalUserInfo();
            }
            Integer[] numArrE = jpq.e(this.m);
            this.bw.a(iIntValue).d(true).b(jpq.a(numArrE)).c(i, f, h, d, g, j, f11027b).c(numArrE).b(this.al);
            if (iIntValue > 0) {
                this.bz.setVisibility(0);
                this.q.setText(UnitUtil.e(iIntValue, 1, 0));
                if (LanguageUtil.ba(this.f11098a)) {
                    this.bx.setImageResource(R.drawable.common_ui_arrow_left);
                } else {
                    this.bx.setImageResource(R.drawable.common_ui_arrow_right);
                }
                int iB = b();
                if (iB == 0) {
                    this.bu.setText(String.format(getString(R.string.IDS_hwh_health_vo2max_male_level), jpq.c(this.f11098a, numArrE, iIntValue, true)));
                } else if (iB == 1) {
                    this.bu.setText(String.format(getString(R.string.IDS_hwh_health_vo2max_female_level), jpq.c(this.f11098a, numArrE, iIntValue, true)));
                } else {
                    this.bu.setText(String.format(getString(R.string.IDS_hwh_health_vo2max_peers_level), jpq.c(this.f11098a, numArrE, iIntValue, true)));
                }
                this.e.findViewById(R.id.layout_vo2max).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        DetailFrag.this.q();
                    }
                });
                this.o.add(2);
                bs();
                return;
            }
            this.e.findViewById(R.id.layout_vo2max).setVisibility(8);
            return;
        }
        this.e.findViewById(R.id.layout_vo2max).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        ComponentName componentName = new ComponentName(this.f11098a.getPackageName(), "com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("fromDetailFrag", true);
        getActivity().startActivityForResult(intent, 0);
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("dataType", 0);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_DETAIL_SKIP_1040040.value(), map, 0);
    }

    private void bl() {
        if (this.bb.get("etraining_effect") != null) {
            float fIntValue = this.bb.get("etraining_effect").intValue() / 10.0f;
            LogUtil.j("Track_DetailFrag", "showAerobicExerciseEffect trainingEffect ", Float.valueOf(fIntValue));
            if (fIntValue >= 1.0f) {
                this.bm.setText(UnitUtil.e(fIntValue, 1, 1));
                double dRound = (Math.round(fIntValue * 10.0f) * 1.0f) / 10.0f;
                if (dRound <= 1.9d) {
                    this.cb.setText(this.f11098a.getString(R.string.IDS_hw_motiontrack_aerobic_recovery_tip));
                } else if (dRound <= 2.9d) {
                    this.cb.setText(this.f11098a.getString(R.string.IDS_hw_motiontrack_aerobic_maintain_tip));
                } else if (dRound <= 3.9d) {
                    this.cb.setText(this.f11098a.getString(R.string.IDS_hw_motiontrack_aerobic_improve_tip));
                } else if (dRound <= 4.9d) {
                    this.cb.setText(this.f11098a.getString(R.string.IDS_hw_motiontrack_aerobic_enhance_tip));
                } else {
                    this.cb.setText(this.f11098a.getString(R.string.IDS_hw_motiontrack_exercise_overdose_tip));
                }
                if (this.w == 0) {
                    this.k.setText(R.string.IDS_sport_noun_explain_xunlianbiaoxian_youyang_title);
                } else {
                    this.k.setText(R.string.IDS_aerobic_train_pressure);
                }
                this.o.add(0);
            } else {
                this.e.findViewById(R.id.layout_excise_effect).setVisibility(8);
            }
            float fG = jpq.g(fIntValue);
            this.bt.a(fG).d(false).b(0.0f).c(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f).c(jpq.e(this.f11098a, fG, this.w)).b(this.al);
            return;
        }
        this.e.findViewById(R.id.layout_excise_effect).setVisibility(8);
    }

    private void br() {
        if (this.bb.get("anaerobic_exercise_etraining_effect") != null) {
            float fIntValue = this.bb.get("anaerobic_exercise_etraining_effect").intValue() / 10.0f;
            if (fIntValue >= 1.0f) {
                this.bj.setText(UnitUtil.e(fIntValue, 1, 1));
                this.o.add(1);
            } else {
                this.e.findViewById(R.id.layout_aerobic_excise_effect).setVisibility(8);
            }
            float fG = jpq.g(fIntValue);
            this.bq.a(fG).d(false).b(0.0f).c(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f).c(jpq.e(this.f11098a, fG, this.w)).b(this.al);
            if (this.w == 0) {
                this.l.setText(R.string.IDS_pluginmotiontrack_anaerobic_exercise);
                return;
            } else {
                this.l.setText(R.string.IDS_anaerobic_train_pressure);
                return;
            }
        }
        this.e.findViewById(R.id.layout_aerobic_excise_effect).setVisibility(8);
    }

    private void ab() {
        int iRequestSportType = this.f11099c.d().requestSportType();
        int iRequestChiefSportDataType = this.f11099c.d().requestChiefSportDataType();
        if (iRequestSportType != 266 && iRequestSportType != 262) {
            if (this.f11099c.d().requestChiefSportDataType() == 6) {
                af();
                return;
            } else {
                d(iRequestSportType, iRequestChiefSportDataType);
                return;
            }
        }
        if (iRequestChiefSportDataType == 1 || iRequestChiefSportDataType == 2) {
            a();
        } else {
            ar();
        }
    }

    private void d(int i2, int i3) {
        if (i3 == 1 || i3 == 2) {
            a();
            return;
        }
        if (i2 == 283) {
            as();
            return;
        }
        if (izn.b(this.f11099c.d()).equals("291")) {
            a();
        } else if (i3 == 11) {
            aa();
        } else {
            ac();
        }
    }

    private void as() {
        if (!l() || !this.f11099c.d().requestExtendDataMap().containsKey("skipNum") || this.f11099c.d().getExtendDataInt("skipNum", 0) <= 0) {
            ReleaseLogUtil.e("Track_DetailFrag", "initSkippingNumber() mTrackDetailDataManager is null");
            this.bo.setText(this.ak);
            this.bn.setText(this.f11098a.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, ""));
        } else {
            int extendDataInt = this.f11099c.d().getExtendDataInt("skipNum", 0);
            String strE = UnitUtil.e(extendDataInt, 1, 0);
            String strE2 = qre.e(R.plurals.IDS_indoor_skipper_number_unit_value, extendDataInt, "");
            this.bo.setText(strE);
            this.bn.setText(strE2);
            this.f11099c.c(new SportDetailItem.a(null, "SKIPPING_ROPE_COUNT", qre.f(R.string.IDS_indoor_skipper_jump_num), strE, strE2, qre.f(R.string.IDS_track_rope_count_with_unit)));
        }
    }

    private void aa() {
        long jRequestTotalTime = this.f11099c.d().requestTotalTime();
        if (jRequestTotalTime <= 0) {
            ReleaseLogUtil.e("Track_DetailFrag", "initChiefTime() totalTime is null");
            this.bo.setText(this.ak);
            return;
        }
        this.bo.setText(izn.c(jRequestTotalTime, R.style.sport_day_hour_min_num_52dp, R.style.sport_day_hour_min_unit_14dp));
        this.bn.setVisibility(8);
        this.f11099c.c(new SportDetailItem.a(null, "OAL_TIME", qre.f(R.string.IDS_motiontrack_show_detail_sporttime), String.valueOf(jRequestTotalTime), "", qre.f(R.string.IDS_motiontrack_show_detail_sporttime)));
    }

    private void ac() {
        String strF;
        String strF2;
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_band_data_sport_distance_unit_en);
            strF2 = qre.f(R.string.IDS_track_distance_en_with_unit);
        } else {
            strF = qre.f(R.string.IDS_band_data_sport_distance_unit);
            strF2 = qre.f(R.string.IDS_track_distance_with_unit);
        }
        String str = strF;
        String str2 = strF2;
        this.bn.setText(str);
        if (!l() || this.f11099c.d().requestTotalDistance() == 0) {
            ReleaseLogUtil.e("Track_DetailFrag", "initDefaultDistance() mTrackDetailDataManager is null");
            this.bo.setText(this.ak);
        } else {
            String strB = jpq.b(this.f11099c.d().requestTotalDistance());
            this.bo.setText(strB);
            this.f11099c.c(new SportDetailItem.a(null, "DISTANCE", qre.f(R.string.IDS_motiontrack_show_map_sport_distance), strB, str, str2));
        }
    }

    private void ar() {
        String strF;
        String strF2;
        if (this.bb == null && this.f11099c.d().requestSportDataSource() != 2) {
            ac();
            return;
        }
        if (jaa.d(this.f11099c.d()) && this.f11099c.d().requestSportDataSource() != 2) {
            ((LinearLayout) this.e.findViewById(R.id.track_detail_show_distance)).setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.bd.getLayoutParams();
            layoutParams.bottomMargin = this.aw.getDimensionPixelOffset(R.dimen.hw_show_public_margin_30dp);
            this.bd.setLayoutParams(layoutParams);
            return;
        }
        if (UnitUtil.f()) {
            strF = qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(UnitUtil.e(this.f11099c.d().requestTotalDistance(), 2)), new Object[0]);
            strF2 = qre.f(R.string.IDS_track_distance_yd_with_unit);
            this.bn.setText(strF);
        } else {
            strF = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
            strF2 = qre.f(R.string.IDS_track_distance_meter_with_unit);
            this.bn.setText(strF);
        }
        String str = strF;
        String str2 = strF2;
        if (this.f11099c.d().requestTotalDistance() == 0) {
            this.bo.setText(this.ak);
            return;
        }
        int iRequestTotalDistance = this.f11099c.d().requestTotalDistance();
        String strF3 = jpq.f(iRequestTotalDistance);
        this.bo.setText(strF3);
        if (iRequestTotalDistance > 0) {
            this.f11099c.c(new SportDetailItem.a(null, "DISTANCE", qre.f(R.string.IDS_motiontrack_show_map_sport_distance), strF3, str, str2));
        }
    }

    public void a() {
        String strD;
        int iRequestTotalCalories;
        if (!l() || this.f11099c.d().requestTotalCalories() <= 0) {
            ReleaseLogUtil.e("Track_DetailFrag", "initChiefCalorie() mTrackDetailDataManager is null");
            strD = this.ak;
            iRequestTotalCalories = 0;
        } else {
            iRequestTotalCalories = this.f11099c.d().requestTotalCalories() / 1000;
            strD = jpq.d(this.f11099c.d().requestTotalCalories());
        }
        String str = strD;
        String strE = qre.e(R.plurals.IDS_track_total_calories_kcals, iRequestTotalCalories, str);
        SpannableString spannableString = new SpannableString(strE);
        qri.a(spannableString, strE, new qli(qrr.g()));
        qri.a(spannableString, strE, new AbsoluteSizeSpan(qre.b(R.dimen.textSizeButton1)));
        qri.a(spannableString, strE, new ForegroundColorSpan(qre.e(R.color.textColorPrimary)));
        qri.a(spannableString, str, new qli(qrr.e()));
        qri.a(spannableString, str, new AbsoluteSizeSpan(qre.b(R.dimen.textSizeHeadline3)));
        this.bo.setText(spannableString);
        this.bn.setVisibility(8);
        this.f11099c.c(new SportDetailItem.a(qre.c(R.drawable.ic_track_total_calorie), "CALORIES", this.aw.getString(R.string.IDS_track_total_calories), str, qre.f(R.string.IDS_motiontrack_show_kcal), qre.f(R.string.IDS_track_total_calorie_kcal)));
    }

    private void af() {
        int extendDataInt = this.f11099c.d().getExtendDataInt("golfSwingCount");
        this.bn.setText(this.f11098a.getResources().getQuantityString(R.plurals.IDS_band_data_golf_count_unit, extendDataInt, ""));
        if (!l() || extendDataInt == 0) {
            LogUtil.j("Track_DetailFrag", "initGolfCount() mTrackDetailDataManager is null");
            this.bo.setText(this.ak);
        } else {
            this.bo.setText(UnitUtil.e(extendDataInt, 1, 0));
        }
    }

    private void bm() {
        this.bc.clear();
        if (j() && this.f11099c.b().requestRunningPostureList() != null && this.f11099c.b().requestRunningPostureList().size() > 0) {
            if (gzv.a(this.f11099c.d())) {
                this.ay.setVisibility(8);
                return;
            }
            ah();
            v();
            ai();
            au();
            aw();
            ax();
            aq();
            ag();
            ae();
            ad();
            float fRequestAvgPace = this.f11099c.d().requestAvgPace();
            d(((double) Math.abs(fRequestAvgPace)) > 1.0E-6d ? 3600.0f / fRequestAvgPace : 0.0f);
            this.at = (TotalDataRectView) this.be.findViewById(R.id.proportion_bar);
            an();
            ak();
            if (LanguageUtil.l(getContext()) && !Utils.o()) {
                this.ay.findViewById(R.id.track_detail_running_posture_surpport).setVisibility(0);
                return;
            } else {
                this.ay.findViewById(R.id.track_detail_running_posture_surpport).setVisibility(8);
                return;
            }
        }
        this.ay.setVisibility(8);
    }

    private void an() {
        int iRequestAvgForeFootStrikePattern = this.f11099c.d().requestAvgForeFootStrikePattern();
        int iRequestAvgWholeFootStrikePattern = this.f11099c.d().requestAvgWholeFootStrikePattern();
        int iRequestAvgHindFootStrikePattern = this.f11099c.d().requestAvgHindFootStrikePattern();
        double d2 = iRequestAvgForeFootStrikePattern + iRequestAvgWholeFootStrikePattern + iRequestAvgHindFootStrikePattern;
        if (Double.compare(d2, 0.0d) <= 0) {
            this.be.setVisibility(8);
            return;
        }
        int iFloor = (int) Math.floor((((double) iRequestAvgWholeFootStrikePattern) / d2) * 100.0d);
        int iFloor2 = (int) Math.floor((((double) iRequestAvgHindFootStrikePattern) / d2) * 100.0d);
        int i2 = (100 - iFloor) - iFloor2;
        if (i2 < 0) {
            i2 = 0;
        }
        LogUtil.a("Track_DetailFrag", "showAW70 foreFootAvg = ", Integer.valueOf(i2), " hindFootAvg = ", Integer.valueOf(iFloor2), " wholeFootAvg = ", Integer.valueOf(iFloor));
        this.bc.add(new StrikePatternAdvice(i2, iFloor, iFloor2));
        this.at.setColors(getResources().getColor(R.color.track_detail_running_posture_color_one), getResources().getColor(R.color.track_detail_running_posture_color_two), getResources().getColor(R.color.track_detail_running_posture_color_three));
        this.at.setViewData(i2, iFloor, iFloor2);
        this.at.postInvalidate();
        String strE = UnitUtil.e(iFloor2, 2, 0);
        String strE2 = UnitUtil.e(i2, 2, 0);
        String strE3 = UnitUtil.e(iFloor, 2, 0);
        ((HealthTextView) this.be.findViewById(R.id.running_posture_avg_foot_strike_pattern_fore_value)).setText(UnitUtil.b(this.f11098a, "\\d+.\\d+|\\d+", strE2, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        ((HealthTextView) this.be.findViewById(R.id.running_posture_avg_foot_strike_pattern_whole_value)).setText(UnitUtil.b(this.f11098a, "\\d+.\\d+|\\d+", strE3, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        ((HealthTextView) this.be.findViewById(R.id.running_posture_avg_foot_strike_pattern_hind_value)).setText(UnitUtil.b(this.f11098a, "\\d+.\\d+|\\d+", strE, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
    }

    private void v() {
        int iRequestAverageHangTime = this.f11099c.d().requestAverageHangTime();
        if (iRequestAverageHangTime <= 0) {
            this.ax.setVisibility(8);
            this.e.findViewById(R.id.track_detail_hang_time_line).setVisibility(8);
            return;
        }
        int iRound = Math.round(this.f11099c.d().requestAvgPace());
        String strE = UnitUtil.e(iRequestAverageHangTime, 1, 0);
        AverageHangTimeAdvice averageHangTimeAdvice = new AverageHangTimeAdvice(this.f11099c.d().requestAverageHangTime(), iRound, this.av, SportDetailChartDataType.HANG_TIME);
        ((HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_aw_version2_average_jump_time_full);
        ((HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(averageHangTimeAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(averageHangTimeAdvice.acquireLevel())));
        ((HealthTextView) this.ax.findViewById(R.id.track_detail_posture_item_unit)).setText(R.string.IDS_msec_unit);
        this.bc.add(averageHangTimeAdvice);
    }

    private void ai() {
        float fRequestGroundHangTimeRate = this.f11099c.d().requestGroundHangTimeRate();
        int iRound = Math.round(this.f11099c.d().requestAvgPace());
        if (fRequestGroundHangTimeRate <= 0.0f) {
            this.ap.setVisibility(8);
            this.e.findViewById(R.id.track_detail_ground_hang_time_rate_line).setVisibility(8);
            return;
        }
        String strE = UnitUtil.e(fRequestGroundHangTimeRate, 1, 1);
        GroundHangTimeRateAdvice groundHangTimeRateAdvice = new GroundHangTimeRateAdvice((int) (fRequestGroundHangTimeRate * 100.0f), iRound, this.av, SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        ((HealthTextView) this.ap.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_motiontrack__average_ground_to_air_ratio);
        ((HealthTextView) this.ap.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ap.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundHangTimeRateAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundHangTimeRateAdvice.acquireLevel())));
        this.bc.add(groundHangTimeRateAdvice);
    }

    private void ah() {
        int iRequestAvgGroundContactTime = this.f11099c.d().requestAvgGroundContactTime();
        if (iRequestAvgGroundContactTime <= 0) {
            this.ao.setVisibility(8);
            this.e.findViewById(R.id.track_detail_ground_contact_time_line).setVisibility(8);
            return;
        }
        int iRound = Math.round(this.f11099c.d().requestAvgPace());
        String strE = UnitUtil.e(this.f11099c.d().requestAvgGroundContactTime(), 1, 0);
        GroundContactTimeAdvice groundContactTimeAdvice = new GroundContactTimeAdvice(iRequestAvgGroundContactTime, iRound, this.av, SportDetailChartDataType.GROUND_CONTACT_TIME);
        ((HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_running_posture_avg_ground_contact_time);
        ((HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundContactTimeAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundContactTimeAdvice.acquireLevel())));
        ((HealthTextView) this.ao.findViewById(R.id.track_detail_posture_item_unit)).setText(R.string.IDS_msec_unit);
        this.bc.add(groundContactTimeAdvice);
    }

    private void ak() {
        if (LanguageUtil.ba(this.f11098a)) {
            ((ImageView) this.ao.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ad.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ae.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ai.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ah.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.aa.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ac.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.x.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.bh.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.be.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ax.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) this.ap.findViewById(R.id.track_detail_posture_item_more_arrow)).setImageResource(R.drawable.common_ui_arrow_left);
        }
    }

    private void d(float f2) {
        if (this.f11099c.d().requestAvgSwingAngle() <= 0.0f) {
            this.bh.setVisibility(8);
            this.e.findViewById(R.id.track_detail_swing_angle_line).setVisibility(8);
            return;
        }
        SwingAngleAdvice swingAngleAdvice = new SwingAngleAdvice(this.f11099c.d().requestAvgSwingAngle(), f2);
        ((HealthTextView) this.bh.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_running_posture_avg_swing_angle);
        ((HealthTextView) this.bh.findViewById(R.id.track_detail_posture_item_value)).setText(getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, this.f11099c.d().requestAvgSwingAngle(), Integer.valueOf(this.f11099c.d().requestAvgSwingAngle())));
        HealthTextView healthTextView = (HealthTextView) this.bh.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(swingAngleAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(swingAngleAdvice.acquireLevel())));
        this.bc.add(swingAngleAdvice);
    }

    private void ad() {
        if (this.f11099c.d().requestAvgEversionExcursion() <= -101.0f) {
            this.x.setVisibility(8);
            this.e.findViewById(R.id.track_detail_eversion_excursion_line).setVisibility(8);
            return;
        }
        EversionExcursionAngleAdvice eversionExcursionAngleAdvice = new EversionExcursionAngleAdvice(this.f11099c.d().requestAvgEversionExcursion());
        ((HealthTextView) this.x.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_running_posture_avg_eversion_excursion);
        ((HealthTextView) this.x.findViewById(R.id.track_detail_posture_item_value)).setText(getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, this.f11099c.d().requestAvgEversionExcursion(), Integer.valueOf(this.f11099c.d().requestAvgEversionExcursion())));
        HealthTextView healthTextView = (HealthTextView) this.x.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(eversionExcursionAngleAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(eversionExcursionAngleAdvice.acquireLevel())));
        this.bc.add(eversionExcursionAngleAdvice);
    }

    private void au() {
        int i2;
        if (e("avg_gc_tb", this.ae, this.af)) {
            LogUtil.a("Track_DetailFrag", "initTouchdownBalanceAndLevel return");
            return;
        }
        GroundTouchdownBalanceAdvice groundTouchdownBalanceAdvice = new GroundTouchdownBalanceAdvice((float) UnitUtil.d(this.f11099c.d().getExtendDataFloat("avg_gc_tb"), 1));
        String strE = UnitUtil.e(groundTouchdownBalanceAdvice.getValue(), 2, 1);
        String strE2 = UnitUtil.e(100.0f - groundTouchdownBalanceAdvice.getValue(), 2, 1);
        if (LanguageUtil.f(this.f11098a)) {
            i2 = R.string.IDS_bolt_balance_left_right;
        } else {
            i2 = R.string.IDS_bolt_balance_rate_left_right_value;
        }
        String string = this.f11098a.getResources().getString(i2, strE, strE2);
        ((HealthTextView) this.ae.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_bolt_balance_average_left_right_touches);
        ((HealthTextView) this.ae.findViewById(R.id.track_detail_posture_item_value)).setText(string);
        HealthTextView healthTextView = (HealthTextView) this.ae.findViewById(R.id.track_detail_posture_item_level);
        healthTextView.setAutoTextInfo(14, 1, 2);
        healthTextView.setText(groundTouchdownBalanceAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundTouchdownBalanceAdvice.acquireLevel())));
        this.bc.add(groundTouchdownBalanceAdvice);
    }

    private boolean e(String str, LinearLayout linearLayout, HealthDivider healthDivider) {
        if (this.f11099c.d().getExtendDataFloat(str) <= 0.0f) {
            linearLayout.setVisibility(8);
            healthDivider.setVisibility(8);
            return true;
        }
        linearLayout.setVisibility(0);
        healthDivider.setVisibility(0);
        return false;
    }

    private void aw() {
        String quantityString;
        if (e("avg_v_osc", this.ai, this.ag)) {
            LogUtil.a("Track_DetailFrag", "initVerticalAmplitudeAdviceAndLevel return");
            return;
        }
        GroundVerticalAmplitudeAdvice groundVerticalAmplitudeAdvice = new GroundVerticalAmplitudeAdvice(this.f11099c.d().getExtendDataFloat("avg_v_osc"));
        ((HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_bolt_average_vertical_amplitude);
        float fE = e(groundVerticalAmplitudeAdvice.getValue());
        if (!UnitUtil.f()) {
            double d2 = fE;
            quantityString = this.f11098a.getResources().getQuantityString(R.plurals.IDS_cm_string, UnitUtil.e(d2), UnitUtil.e(d2, 1, 1));
        } else {
            double d3 = fE;
            quantityString = this.f11098a.getResources().getQuantityString(R.plurals.IDS_ins_string, UnitUtil.e(d3), UnitUtil.e(d3, 1, 1));
        }
        ((HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_value)).setText(quantityString);
        HealthTextView healthTextView = (HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundVerticalAmplitudeAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundVerticalAmplitudeAdvice.acquireLevel())));
        this.bc.add(groundVerticalAmplitudeAdvice);
    }

    private float e(float f2) {
        return !UnitUtil.f() ? f2 : (float) UnitUtil.e(f2, 0);
    }

    private void ax() {
        float extendDataFloat = this.f11099c.d().getExtendDataFloat("avg_v_s_r");
        if (Float.compare(extendDataFloat, 0.0f) <= 0 || this.f11099c.av()) {
            this.ah.setVisibility(8);
            this.an.setVisibility(8);
            LogUtil.a("Track_DetailFrag", "initVerticalAmplitudeRatioAdviceAndLevel return");
            return;
        }
        this.ah.setVisibility(0);
        this.an.setVisibility(0);
        GroundVerticalAmplitudeRatioAdvice groundVerticalAmplitudeRatioAdvice = new GroundVerticalAmplitudeRatioAdvice(extendDataFloat);
        String strE = UnitUtil.e(groundVerticalAmplitudeRatioAdvice.getValue(), 2, 1);
        ((HealthTextView) this.ah.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_bolt_average_vertical_amplitude_rate);
        ((HealthTextView) this.ah.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ah.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundVerticalAmplitudeRatioAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundVerticalAmplitudeRatioAdvice.acquireLevel())));
        this.bc.add(groundVerticalAmplitudeRatioAdvice);
    }

    private void aq() {
        if (e("avg_i_p", this.aa, this.z)) {
            LogUtil.a("Track_DetailFrag", "initShockPeakAdviceAndLevel return");
            return;
        }
        GroundShockPeakAdvice groundShockPeakAdvice = new GroundShockPeakAdvice(this.f11099c.d().getExtendDataFloat("avg_i_p"));
        String strE = UnitUtil.e(groundShockPeakAdvice.getValue(), 1, 1);
        ((HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_bolt_average_ground_peak_impact);
        ((HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundShockPeakAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundShockPeakAdvice.acquireLevel())));
        ((HealthTextView) this.aa.findViewById(R.id.track_detail_posture_item_unit)).setText(R.string.IDS_bolt_shock_peak_unit);
        this.bc.add(groundShockPeakAdvice);
    }

    private void ag() {
        if (e("avg_v_i_r", this.ac, this.ab)) {
            LogUtil.a("Track_DetailFrag", "initImpactLoadRateAdviceAndLevel return");
            return;
        }
        GroundImpactLoadRateAdvice groundImpactLoadRateAdvice = new GroundImpactLoadRateAdvice(this.f11099c.d().getExtendDataFloat("avg_v_i_r"));
        String strE = UnitUtil.e(groundImpactLoadRateAdvice.getValue(), 1, 1);
        ((HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_bolt_average_peak_impact_rate);
        ((HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundImpactLoadRateAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundImpactLoadRateAdvice.acquireLevel())));
        HealthTextView healthTextView2 = (HealthTextView) this.ac.findViewById(R.id.track_detail_posture_item_unit);
        healthTextView2.setAutoTextInfo(9, 1, 2);
        healthTextView2.setText(this.f11098a.getResources().getQuantityString(R.plurals.IDS_bolt_average_peak_impact_unit, 1, ""));
        this.bc.add(groundImpactLoadRateAdvice);
    }

    private void ae() {
        int iRequestAvgGroundImpactAcceleration = this.f11099c.d().requestAvgGroundImpactAcceleration();
        if (iRequestAvgGroundImpactAcceleration <= 0) {
            this.ad.setVisibility(8);
            this.e.findViewById(R.id.track_detail_ground_impact_acceleration_line).setVisibility(8);
            return;
        }
        this.ad.setVisibility(0);
        GroundImpactAccelerationAdvice groundImpactAccelerationAdvice = new GroundImpactAccelerationAdvice(iRequestAvgGroundImpactAcceleration);
        String strE = UnitUtil.e(iRequestAvgGroundImpactAcceleration, 1, 0);
        ((HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_name)).setText(R.string.IDS_running_posture_avg_ground_impact_acceleration);
        ((HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_value)).setText(strE);
        HealthTextView healthTextView = (HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_level);
        e(healthTextView);
        healthTextView.setText(groundImpactAccelerationAdvice.acquireLevelShortTip());
        healthTextView.setTextColor(getResources().getColor(izn.c(groundImpactAccelerationAdvice.acquireLevel())));
        ((HealthTextView) this.ad.findViewById(R.id.track_detail_posture_item_unit)).setText(R.string.IDS_gravity_unit);
        this.bc.add(groundImpactAccelerationAdvice);
    }

    private void al() {
        JudgeRootBean judgeRootBean = (JudgeRootBean) HiJsonUtil.d(jpz.b(BaseApplication.getContext()), JudgeRootBean.class);
        if (judgeRootBean == null) {
            LogUtil.e("Track_DetailFrag", "judgeRootBean is null");
        } else {
            this.av = judgeRootBean.getJudge();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RunningPostureAdviceBase runningPostureAdviceBaseE = e(view);
        if (runningPostureAdviceBaseE == null) {
            return;
        }
        if (System.currentTimeMillis() - this.aq < 1000) {
            LogUtil.j("Track_DetailFrag", "double click");
            return;
        }
        this.aq = System.currentTimeMillis();
        int iC = c(runningPostureAdviceBaseE.getRunningPostureFragment());
        LogUtil.a("Track_DetailFrag", "onClick curPostureFlag = ", Integer.valueOf(iC));
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtra("runningPostureFlag", iC);
        intent.putParcelableArrayListExtra("runningPostureAdvices", this.bc);
        d(intent);
        LogUtil.a("Track_DetailFrag", "onClick RUNNING_POSTURE_ADVICES = ", this.bc);
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity");
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("postureId", Integer.valueOf(runningPostureAdviceBaseE.getPostureId()));
        if (!(runningPostureAdviceBaseE instanceof StrikePatternAdvice)) {
            map.put("status", Integer.valueOf(jxe.c(this.bc.get(iC).acquireLevelShortTip())));
        }
        lmf.d().c(this.f11098a, AnalyticsValue.BI_TRACK_ENTER_POSTURE_1040046.value(), map, 0);
        if (AppBundle.d() != null) {
            ReleaseLogUtil.d("Track_DetailFrag", "start launching the PluginFitnessAdvice module");
            intent.putExtra("moduleName", "PluginFitnessAdvice");
            AppBundle.d().launchActivity(this.f11098a, intent, null);
        } else {
            try {
                this.f11098a.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Track_DetailFrag", "onClick ActivityNotFoundException.");
            }
        }
    }

    private void d(Intent intent) {
        MotionPath motionPathB = this.f11099c.b();
        if (njy.e(this.av) || this.f11099c.t()) {
            LogUtil.j("Track_DetailFrag", "beanList is null");
            return;
        }
        HashMap map = new HashMap(3);
        ArrayList<SportDetailChartDataType> arrayList = new ArrayList(3);
        arrayList.add(SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        arrayList.add(SportDetailChartDataType.HANG_TIME);
        arrayList.add(SportDetailChartDataType.GROUND_CONTACT_TIME);
        for (SportDetailChartDataType sportDetailChartDataType : arrayList) {
            map.put(sportDetailChartDataType, jpz.b(jpz.b(motionPathB, this.av.get(0)), sportDetailChartDataType, motionPathB.requestRunningPostureList(), this.av));
        }
        intent.putExtra("runningPostureJudgeList", map);
    }

    private RunningPostureAdviceBase e(View view) {
        if (view.getId() == R.id.track_detail_running_posture_ground_contact_time) {
            return new GroundContactTimeAdvice(0, 0, this.av, SportDetailChartDataType.GROUND_CONTACT_TIME);
        }
        if (view.getId() == R.id.track_detail_running_posture_hang_time) {
            return new AverageHangTimeAdvice(0, 0, this.av, SportDetailChartDataType.HANG_TIME);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_hang_time_rate) {
            return new GroundHangTimeRateAdvice(0, 0, this.av, SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_impact_acceleration) {
            return new GroundImpactAccelerationAdvice(0);
        }
        if (view.getId() == R.id.track_detail_running_posture_eversion_excursion) {
            return new EversionExcursionAngleAdvice(0);
        }
        if (view.getId() == R.id.track_detail_running_posture_swing_angle) {
            return new SwingAngleAdvice(0, 0.0f);
        }
        if (view.getId() == R.id.track_detail_running_posture_strike_pattern) {
            return new StrikePatternAdvice(0, 0, 0);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_touchdown_balance) {
            return new GroundTouchdownBalanceAdvice(0.0f);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_vertical_amplitude) {
            return new GroundVerticalAmplitudeAdvice(0.0f);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_vertical_amplitude_ratio) {
            return new GroundVerticalAmplitudeRatioAdvice(0.0f);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_shock_peak) {
            return new GroundShockPeakAdvice(0.0f);
        }
        if (view.getId() == R.id.track_detail_running_posture_ground_impact_load_rate) {
            return new GroundImpactLoadRateAdvice(0.0f);
        }
        LogUtil.j("Track_DetailFrag", "not in five view");
        return null;
    }

    private int c(String str) {
        if (this.bc != null && str != null) {
            for (int i2 = 0; i2 < this.bc.size(); i2++) {
                if (this.bc.get(i2).getRunningPostureFragment().equals(str)) {
                    return i2;
                }
            }
        }
        return 0;
    }

    private Calendar b(int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f11099c.d().requestEndTime());
        calendar.add(10, i2);
        return calendar;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jqt jqtVar = this.ca;
        if (jqtVar != null) {
            jqtVar.c(this.f11099c);
        }
    }

    private void e(HealthTextView healthTextView) {
        if (LanguageUtil.f(this.f11098a) || LanguageUtil.q(this.f11098a)) {
            LogUtil.j("Track_DetailFrag", "isChinese or isEnglish()");
        } else {
            healthTextView.setAutoTextInfo(9, 1, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        jqt jqtVar = this.ca;
        if (jqtVar != null) {
            jqtVar.e();
        }
    }
}

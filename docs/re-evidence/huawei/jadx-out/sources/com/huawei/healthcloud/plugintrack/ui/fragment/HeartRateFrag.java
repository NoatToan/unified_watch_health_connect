package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.JudgeRootBean;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.model.TrackLineChartHolderImpl;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackLineChartActivity;
import com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackChartViewHolder;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.coq;
import defpackage.gzr;
import defpackage.gzz;
import defpackage.izn;
import defpackage.jbp;
import defpackage.jph;
import defpackage.jpq;
import defpackage.jps;
import defpackage.jpx;
import defpackage.jpz;
import defpackage.jqe;
import defpackage.jqg;
import defpackage.jqs;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njb;
import defpackage.njc;
import defpackage.njh;
import defpackage.nji;
import defpackage.njp;
import defpackage.njq;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes10.dex */
public class HeartRateFrag extends SportResultBaseFragment {
    private static List<jbp> d;
    private HealthTextView aa;
    private int ab;
    private List<njq> ac;
    private boolean ad;
    private int ae;
    private int af;
    private int ag;
    private int ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11038b;
    private jps g;
    private HealthColumnSystem h;
    private HealthRingChart l;
    private List<HeartRateData> m;
    private ArrayList<HeartRateData> n;
    private jqe p;
    private jpx q;
    private HealthProgressBar r;
    private List<PostureJudgeBean> t;
    private ExecutorService w;
    private ArrayList<StepRateData> x;
    private List<njp> y;
    private float[] z;
    private a j = new a(Looper.getMainLooper());
    private Map<SportDetailChartDataType, jph> f = new HashMap(20);
    private LinearLayout o = null;
    private LinearLayout i = null;
    private boolean s = false;
    private boolean k = false;
    private int u = 0;
    private String v = "";
    private TrackLineChartHolderImpl ah = null;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            throw new AssertionError("LayoutInflater not found.");
        }
        if (i()) {
            return null;
        }
        g();
        this.ah = new TrackLineChartHolderImpl(this.f11098a.getApplicationContext());
        if (j() && l()) {
            this.u = this.f11099c.d().requestSportType();
            this.v = izn.b(this.f11099c.d());
            t();
            x();
            r();
            u();
            LogUtil.a("Track_HeartRateFrag", "onCreateView--------");
            View viewInflate = layoutInflater.inflate(R.layout.track_sug_fm_detail_heartrate, (ViewGroup) null);
            if (!(viewInflate instanceof FrameLayout)) {
                LogUtil.e("Track_HeartRateFrag", "objectFrameLayout is not instanceof FrameLayout");
                return null;
            }
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            this.e = frameLayout;
            b(frameLayout);
            q();
            return frameLayout;
        }
        LogUtil.e("Track_HeartRateFrag", "mMotionPath or mSimplifyData null");
        getActivity().finish();
        return null;
    }

    private void u() {
        this.p = new jqe(this.f11098a, this.f11099c.d(), this.f11099c.af(), this.f11099c.v());
    }

    private void x() {
        this.q = new jpx(this.f11099c.b(), this.f11099c.d(), this.f11098a, this.f11099c.d().requestSportType());
    }

    private void r() {
        this.g = new jps(this.f11099c.b(), this.f11099c.d(), this.f11098a, this.f11099c.d().requestSportType());
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("Track_HeartRateFrag", "onConfigurationChanged isTahitiModel: ", Boolean.valueOf(qrs.af(getContext())));
        al();
        jpx jpxVar = this.q;
        if (jpxVar != null) {
            jpxVar.c();
        }
        jps jpsVar = this.g;
        if (jpsVar != null) {
            jpsVar.e();
        }
    }

    private void al() {
        Iterator<Map.Entry<SportDetailChartDataType, jph>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a().e();
        }
    }

    private void q() {
        if (l()) {
            if (this.f11099c.d().requestDeviceType() != 32 || ((this.f11099c.x() && this.f11099c.aw()) || this.f11099c.d().requestSportDataSource() == 5)) {
                this.f11038b.setVisibility(8);
            }
        }
    }

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a("Track_HeartRateFrag", "message is null");
                return;
            }
            super.handleMessage(message);
            if (message.what != 106) {
                LogUtil.j("Track_HeartRateFrag", "MyHandler is wrong");
            } else if (message.obj instanceof int[]) {
                HeartRateFrag.this.b((int[]) message.obj, message.arg1, message.getData().getString(HwExerciseConstants.JSON_NAME_RECORD_FLAG));
            }
        }
    }

    private void t() {
        MotionPath motionPathB = this.f11099c.b();
        if (motionPathB == null) {
            LogUtil.a("Track_HeartRateFrag", "motionPath is null return");
            return;
        }
        this.ac = motionPathB.requestSwolfList();
        this.y = motionPathB.requestPullFreqList();
        p();
        v();
        this.ah.setSportType(this.u);
        this.ah.setSportMode(this.v);
    }

    private void p() {
        JudgeRootBean judgeRootBean = (JudgeRootBean) HiJsonUtil.d(jpz.b(BaseApplication.getContext()), JudgeRootBean.class);
        if (judgeRootBean == null) {
            return;
        }
        List<PostureJudgeBean> judge = judgeRootBean.getJudge();
        this.t = judge;
        if (judge == null) {
            LogUtil.e("Track_HeartRateFrag", "mPostureJudgeBeanList is null");
        } else {
            LogUtil.a("Track_HeartRateFrag", "mPostureJudgeBeanList.toString", judge.toString());
        }
    }

    private void v() {
        jqs jqsVar = new jqs(this.ah, this.f11099c);
        jqsVar.d(SportDetailChartDataType.HEART_RATE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.STEP_RATE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.ALTITUDE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.SPEED_RATE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.REALTIME_PACE, this.f11099c.d(), this.f11099c.b());
        this.ah.l(this.ac);
        this.ah.j(this.y);
        jqsVar.d(SportDetailChartDataType.GROUND_CONTACT_TIME, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.HANG_TIME, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.GROUND_HANG_TIME_RATE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.SPO2, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.JUMP_TIME, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.JUMP_HEIGHT, this.f11099c.d(), this.f11099c.b());
        c(jqsVar);
    }

    private void c(jqs jqsVar) {
        jqsVar.d(SportDetailChartDataType.CADENCE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.ANALOG_CADENCE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.PADDLE_FREQUENCY, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.POWER, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.ANALOG_POWER, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.HEART_RATE_RECOVERY, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.VERTICAL_OSCILLATION, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.VERTICAL_RATIO, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.GC_TIME_BALANCE, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.ACTIVE_PEAK, this.f11099c.d(), this.f11099c.b());
        jqsVar.d(SportDetailChartDataType.PEAK_WEIGHT, this.f11099c.d(), this.f11099c.b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.e("Track_HeartRateFrag", "onStart ---- --------------");
        if (this.w == null) {
            this.w = Executors.newSingleThreadExecutor();
        }
        this.w.execute(new Runnable() { // from class: jne
            @Override // java.lang.Runnable
            public final void run() {
                this.f38749c.af();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void af() {
        if (this.s) {
            LogUtil.e("Track_HeartRateFrag", "mMotionPath or mSimplifyData null");
        } else {
            w();
        }
    }

    private void b(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.heart_rate_chart_show_layout);
        this.i = linearLayout;
        this.l = (HealthRingChart) linearLayout.findViewById(R.id.ring_view);
        this.r = (HealthProgressBar) view.findViewById(R.id.sug_detail_loading);
        this.o = (LinearLayout) view.findViewById(R.id.heart_rate_large_scale_layout);
        this.aa = (HealthTextView) view.findViewById(R.id.swin_heart_tip);
        this.f11038b = (HealthTextView) view.findViewById(R.id.text_accuracy_tip);
        a(view);
        c(view);
        d(view);
        e(view);
        ac();
        ab();
        y();
        TrackLineChartHolder.setInstance(this.ah);
        ae();
        h();
    }

    private void d(View view) {
        jqe jqeVar = this.p;
        if (jqeVar == null || this.u != 259) {
            return;
        }
        jqeVar.b(view);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected String d() {
        return "Track_HeartRateFrag";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.SportResultBaseFragment
    protected int c() {
        int i = this.u;
        if (i == 258 || i == 227) {
            return 4154;
        }
        return i == 264 ? 4175 : -1;
    }

    private void ab() {
        int i = this.u;
        if ((i == 258 || i == 264) && !this.f11099c.aj()) {
            for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
                g(entry.getKey(), entry.getValue());
            }
        }
    }

    private void g(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if ((i != 1 && i != 2 && i != 3) || jphVar.j() || coq.d(this.t)) {
            return;
        }
        MotionPath motionPathB = this.f11099c.b();
        if (this.f11099c.t()) {
            LogUtil.j("Track_HeartRateFrag", "invalidPostureJudgeList");
            return;
        }
        jqg jqgVar = new jqg(BaseApplication.getContext(), sportDetailChartDataType, this.t, jpz.b(jpz.b(motionPathB, this.t.get(0)), sportDetailChartDataType, motionPathB.requestRunningPostureList(), this.t));
        float[] fArrB = jpz.b(new HealthColumnSystem(BaseApplication.getContext()), false);
        jqgVar.d(BaseApplication.getContext().getResources().getConfiguration().fontScale);
        jqgVar.d(jphVar.f(), fArrB);
        jphVar.c(jqgVar);
    }

    private void e(View view) {
        Map<SportDetailChartDataType, jph> mapJ = this.f11099c.j();
        this.f = mapJ;
        for (Map.Entry<SportDetailChartDataType, jph> entry : mapJ.entrySet()) {
            c(view, entry.getKey(), entry.getValue());
        }
    }

    private void c(View view, SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case GROUND_CONTACT_TIME:
                jphVar.e(view, R.id.layout_ground_contact_time);
                break;
            case HEART_RATE:
                jphVar.d(view, R.id.layout_heartrate);
                jphVar.b(view, R.id.view_div_heart);
                break;
            case STEP_RATE:
                jphVar.d(view, R.id.layout_steprate);
                jphVar.b(view, R.id.view_div_step);
                break;
            case SPEED_RATE:
                jphVar.d(view, R.id.layout_speed);
                jphVar.b(view, R.id.view_div_speed);
                break;
            case ALTITUDE:
                jphVar.d(view, R.id.layout_altitude);
                jphVar.b(view, R.id.view_div_altitude);
                break;
            case CADENCE:
                jphVar.d(view, R.id.layout_cadencerate);
                jphVar.b(view, R.id.view_div_cadence);
                break;
            case PADDLE_FREQUENCY:
                jphVar.d(view, R.id.layout_paddle);
                jphVar.b(view, R.id.view_div_paddle);
                break;
            case REALTIME_PACE:
                jphVar.d(view, R.id.layout_rt_pace);
                jphVar.b(view, R.id.view_div_rt_pace);
                break;
            case PULL_FREQ:
                jphVar.d(view, R.id.layout_pull_freq);
                jphVar.b(view, R.id.view_div_pull_freq);
                break;
            case SWOLF:
                jphVar.d(view, R.id.layout_swolf);
                break;
            case SPO2:
                jphVar.d(view, R.id.layout_spo2);
                jphVar.b(view, R.id.view_div_spo2);
                break;
            default:
                e(view, sportDetailChartDataType, jphVar);
                break;
        }
    }

    private void e(View view, SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            jphVar.e(view, R.id.layout_ground_hang_time_rate);
            return;
        }
        if (i == 2) {
            jphVar.e(view, R.id.layout_hang_time);
            return;
        }
        switch (i) {
            case 14:
                jphVar.d(view, R.id.layout_ground_impact_acceleration);
                jphVar.b(view, R.id.view_div_ground_impact_acceleration_tip);
                break;
            case 15:
                jphVar.d(view, R.id.layout_gc_time_balance);
                jphVar.b(view, R.id.view_div_gc_time_balance);
                break;
            case 16:
                jphVar.d(view, R.id.layout_vertical_oscillation);
                jphVar.b(view, R.id.view_div_vertical_oscillation);
                break;
            case 17:
                jphVar.d(view, R.id.layout_vertical_ratio);
                jphVar.b(view, R.id.view_div_vertical_ratio);
                break;
            case 18:
                jphVar.d(view, R.id.layout_jump_height);
                break;
            case 19:
                jphVar.d(view, R.id.layout_jump_time);
                jphVar.b(view, R.id.view_div_jump_time);
                break;
            case 20:
                jphVar.d(view, R.id.layout_power);
                jphVar.b(view, R.id.view_div_power);
                break;
            case 21:
                jphVar.d(view, R.id.layout_analog_power);
                jphVar.b(view, R.id.view_div_analog_power);
                break;
            case 22:
                jphVar.d(view, R.id.layout_restore_heart_rate);
                jphVar.b(view, R.id.view_restore_heart_rate);
                break;
            default:
                d(view, sportDetailChartDataType, jphVar);
                break;
        }
    }

    private void d(View view, SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case ACTIVE_PEAK:
                jphVar.d(view, R.id.layout_active_peak);
                jphVar.b(view, R.id.view_div_active_peak);
                break;
            case PEAK_WEIGHT:
                jphVar.d(view, R.id.layout_peak_weight);
                jphVar.b(view, R.id.view_div_peak_weight);
                break;
            case ANALOG_CADENCE:
                jphVar.d(view, R.id.layout_analog_cadence);
                jphVar.b(view, R.id.view_div_analog_cadence);
                break;
            default:
                LogUtil.j("Track_HeartRateFrag", "The chart type is not exist.", sportDetailChartDataType.toString());
                break;
        }
    }

    private void a(View view) {
        LogUtil.a("Track_HeartRateFrag", "init pace");
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f11098a);
        this.h = healthColumnSystem;
        float[] fArrD = this.q.d(this.u, healthColumnSystem, false);
        this.z = fArrD;
        this.q.d(view, fArrD, this.h, false);
        d(this.q.a());
    }

    private void c(View view) {
        LogUtil.a("Track_HeartRateFrag", "init Altitude");
        this.g.e(view, this.g.d(new HealthColumnSystem(this.f11098a), false), false);
    }

    private static void d(List<jbp> list) {
        d = list;
    }

    public static List<jbp> b() {
        if (d != null) {
            return new ArrayList(d);
        }
        return Collections.EMPTY_LIST;
    }

    private void ac() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            h(entry.getKey(), entry.getValue());
        }
    }

    private void h(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        jphVar.e(e(sportDetailChartDataType));
    }

    private TrackChartViewHolder e(SportDetailChartDataType sportDetailChartDataType) {
        switch (sportDetailChartDataType) {
            case HEART_RATE:
                return new TrackChartViewHolder(this.f11098a, 100, false, 1);
            case STEP_RATE:
                return new TrackChartViewHolder(this.f11098a, 100, false, 2);
            case SPEED_RATE:
                return new TrackChartViewHolder(this.f11098a, 100, false, 3);
            case ALTITUDE:
                return new TrackChartViewHolder(this.f11098a, 100, false, 100);
            case CADENCE:
                return new TrackChartViewHolder(this.f11098a, 100, false, 13);
            case PADDLE_FREQUENCY:
            default:
                return c(sportDetailChartDataType);
            case REALTIME_PACE:
                int i = this.u;
                if (i == 266 || i == 262) {
                    return new TrackChartViewHolder(this.f11098a, 100, false, 6);
                }
                if (i == 274) {
                    return new TrackChartViewHolder(this.f11098a, 100, false, 17);
                }
                if (jpq.g(i)) {
                    return new TrackChartViewHolder(this.f11098a, 100, false, 26);
                }
                return new TrackChartViewHolder(this.f11098a, 100, false, 9);
            case PULL_FREQ:
                return new TrackChartViewHolder(this.f11098a, 100, false, 5);
        }
    }

    private TrackChartViewHolder c(SportDetailChartDataType sportDetailChartDataType) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            return new TrackChartViewHolder(this.f11098a, 100, false, 19);
        }
        if (i == 2) {
            return new TrackChartViewHolder(this.f11098a, 100, false, 18);
        }
        if (i == 3) {
            return new TrackChartViewHolder(this.f11098a, 100, false, 7);
        }
        if (i != 22) {
            switch (i) {
                case 12:
                    return new TrackChartViewHolder(this.f11098a, 100, false, 4);
                case 13:
                    return new TrackChartViewHolder(this.f11098a, 100, false, 10);
                case 14:
                    return new TrackChartViewHolder(this.f11098a, 100, false, 8);
                default:
                    switch (i) {
                        case 18:
                            return new TrackChartViewHolder(this.f11098a, 100, false, 12);
                        case 19:
                            return new TrackChartViewHolder(this.f11098a, 100, false, 11);
                        case 20:
                            return new TrackChartViewHolder(this.f11098a, 100, false, 15);
                        default:
                            return a(sportDetailChartDataType);
                    }
            }
        }
        return new TrackChartViewHolder(this.f11098a, 100, false, 124);
    }

    private TrackChartViewHolder a(SportDetailChartDataType sportDetailChartDataType) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 9) {
            if ("291".equals(this.v)) {
                return new TrackChartViewHolder(this.f11098a, 100, false, 25);
            }
            return new TrackChartViewHolder(this.f11098a, 100, false, 14);
        }
        if (i == 21) {
            return new TrackChartViewHolder(this.f11098a, 100, false, 27);
        }
        switch (i) {
            case 15:
                return new TrackChartViewHolder(this.f11098a, 100, false, 21);
            case 16:
                return new TrackChartViewHolder(this.f11098a, 100, false, 23);
            case 17:
                return new TrackChartViewHolder(this.f11098a, 100, false, 22);
            default:
                switch (i) {
                    case 23:
                        return new TrackChartViewHolder(this.f11098a, 100, false, 20);
                    case 24:
                        return new TrackChartViewHolder(this.f11098a, 100, false, 24);
                    case 25:
                        return new TrackChartViewHolder(this.f11098a, 100, false, 28);
                    default:
                        return null;
                }
        }
    }

    private void y() {
        Iterator<Map.Entry<SportDetailChartDataType, jph>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            jph value = it.next().getValue();
            TrackChartViewHolder trackChartViewHolderA = value.a();
            value.c(trackChartViewHolderA.getCombinedChart());
            value.c(trackChartViewHolderA.a());
            value.d(trackChartViewHolderA.c());
            value.c().setLogEnabled(true);
            if (qrs.c((Activity) getActivity()) && value.b() != null) {
                value.b().setVisibility(8);
                value.e().setVisibility(8);
            }
            value.d().addView(trackChartViewHolderA);
        }
    }

    private void d(jph jphVar, String str, int i) {
        d(jphVar, str, i, this.f11098a, this.u);
    }

    public void d(jph jphVar, final String str, final int i, final Context context, final int i2) {
        HealthTextView healthTextViewB = jphVar.b();
        HwHealthBaseCombinedChart hwHealthBaseCombinedChartC = jphVar.c();
        healthTextViewB.setOnClickListener(new View.OnClickListener() { // from class: jmz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38745a.b(context, str, i, i2, view);
            }
        });
        hwHealthBaseCombinedChartC.setOnSingleTapConfirmedListener(new HwHealthBaseCombinedChart.OnSingleTapConfirmedListener() { // from class: jmy
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.OnSingleTapConfirmedListener
            public final boolean isOnSingleTapConfirmed(MotionEvent motionEvent) {
                return this.f38744c.e(context, str, i, i2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context, String str, int i, int i2, View view) {
        d(context, str, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e(Context context, String str, int i, int i2, MotionEvent motionEvent) {
        d(context, str, i, i2);
        return true;
    }

    private void ae() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            SportDetailChartDataType key = entry.getKey();
            jph value = entry.getValue();
            HealthTextView healthTextViewB = value.b();
            if (qrs.c((Activity) getActivity()) && value.c() != null) {
                value.c().setOnSingleTapConfirmedListener(null);
            } else {
                d(key, value, healthTextViewB);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Map<SportDetailChartDataType, jph> map = this.f;
        if (map == null || map.isEmpty()) {
            LogUtil.j("Track_HeartRateFrag", "onMultiWindowModeChanged mChartModelMap is null.");
            return;
        }
        Iterator<Map.Entry<SportDetailChartDataType, jph>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            a(z, it.next());
        }
    }

    private void a(boolean z, Map.Entry<SportDetailChartDataType, jph> entry) {
        if (entry == null) {
            LogUtil.j("Track_HeartRateFrag", "onMultiWindowModeChanged entry is null.");
            return;
        }
        jph value = entry.getValue();
        if (value == null) {
            LogUtil.j("Track_HeartRateFrag", "onMultiWindowModeChanged chartModel is null.");
            return;
        }
        HealthTextView healthTextViewB = value.b();
        ImageView imageViewE = value.e();
        if (healthTextViewB == null) {
            LogUtil.j("Track_HeartRateFrag", "onMultiWindowModeChanged detailBtn is null.");
            return;
        }
        if (z) {
            healthTextViewB.setVisibility(8);
            imageViewE.setVisibility(8);
            if (value.c() != null) {
                value.c().setOnSingleTapConfirmedListener(null);
                return;
            }
            return;
        }
        healthTextViewB.setVisibility(0);
        d(entry.getKey(), value, healthTextViewB);
    }

    private void d(SportDetailChartDataType sportDetailChartDataType, jph jphVar, HealthTextView healthTextView) {
        ImageView imageViewE = jphVar.e();
        switch (sportDetailChartDataType) {
            case HEART_RATE:
                d(jphVar, "BASELINE_HEART_RATE", 0);
                jpq.b(0, imageViewE, ObserveLabels.HEART_RATE);
                break;
            case STEP_RATE:
                d(jphVar, "BASELINE_STEP_FRE", 1);
                jpq.b(1, imageViewE, this.u == 273 ? "CROSS_TRAINER_STEP_RATE" : "STEP_RATE");
                break;
            case SPEED_RATE:
                d(jphVar, "BASELINE_SPEED_RATE", 3);
                break;
            case ALTITUDE:
                d(jphVar, "BASELINE_ALTITUDE", 2);
                if (this.u == 259 && this.f11099c.b().isValidSlopeInfoList()) {
                    jpq.b(2, imageViewE, "RIDE_ALTITUDE");
                    break;
                }
                break;
            case CADENCE:
                d(jphVar, "BASELINE_CADENCE_FRE", 12);
                jpq.b(12, imageViewE, this.u == 273 ? "CROSS_TRAINER_CADENCE" : "CADENCE");
                break;
            case PADDLE_FREQUENCY:
                d(jphVar, "BASELINE_PADDLE_FRE", 13);
                break;
            default:
                e(sportDetailChartDataType, jphVar, healthTextView, imageViewE);
                break;
        }
    }

    private void e(SportDetailChartDataType sportDetailChartDataType, jph jphVar, HealthTextView healthTextView, ImageView imageView) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            d(jphVar, "BASELINE_GROUND_HANG_TIME_RATE", 17);
            jpq.b(17, imageView, "IMPACT_HANG_TIME_RATE");
            return;
        }
        if (i == 2) {
            d(jphVar, "BASELINE_HANG_TIME", 16);
            jpq.b(16, imageView, "HANG_TIME");
            return;
        }
        if (i == 10) {
            d(jphVar, "BASELINE_REALTIME_PACE", 6);
            jpq.b(6, imageView, "REALTIME_PACE");
            return;
        }
        switch (i) {
            case 13:
                d(jphVar, "BASELINE_SPO2", 9);
                break;
            case 14:
                d(jphVar, "BASELINE_GROUND_IMPACT_ACCELERATION", 8);
                jpq.b(8, imageView, "LANDING_IMPACT");
                break;
            case 15:
                d(jphVar, "BASELINE_GC_TIME_BALANCE", 19);
                jpq.b(19, imageView, "PARAMETER_GROUND_TIME_BALANCE");
                break;
            case 16:
                d(jphVar, "BASELINE_VERTICAL_OSCILLATION", 18);
                jpq.b(18, imageView, "PARAMETER_VERTICAL_OSCILLATION");
                break;
            default:
                a(sportDetailChartDataType, jphVar, healthTextView, imageView);
                break;
        }
    }

    private void a(SportDetailChartDataType sportDetailChartDataType, jph jphVar, HealthTextView healthTextView, ImageView imageView) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 3) {
            d(jphVar, "BASELINE_GROUND_CONTACT_TIME", 7);
            jpq.b(7, imageView, "GROUND_CONTACT_TIME");
            return;
        }
        if (i == 17) {
            d(jphVar, "BASELINE_VERTICAL_RATIO", 20);
            jpq.b(20, imageView, "VERTICAL_STRIKE_RATE");
            return;
        }
        if (i != 24) {
            switch (i) {
                case 20:
                    d(jphVar, "BASELINE_POWER", 14);
                    e(imageView, 14);
                    break;
                case 21:
                    d(jphVar, "BASELINE_ANALOG_POWER", 41);
                    e(imageView, 41);
                    break;
                case 22:
                    healthTextView.setVisibility(8);
                    jpq.b(29, imageView, "RECOVERY_HEART_RATE");
                    break;
                default:
                    b(sportDetailChartDataType, jphVar, healthTextView, imageView);
                    break;
            }
            return;
        }
        d(jphVar, "BASELINE_WEIGHT", 18);
    }

    private void b(SportDetailChartDataType sportDetailChartDataType, jph jphVar, HealthTextView healthTextView, ImageView imageView) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 11) {
            d(jphVar, "BASELINE_PULL_FREQ", 5);
            return;
        }
        if (i == 12) {
            d(jphVar, "BASELINE_SWOLF", 4);
            return;
        }
        if (i == 18) {
            d(jphVar, "BASELINE_JUMP_HEIGHT", 11);
            return;
        }
        if (i == 19) {
            d(jphVar, "BASELINE_JUMP_TIME", 10);
            return;
        }
        if (i == 23) {
            d(jphVar, "BASELINE_ACTIVE_PEAK", 21);
            jpq.b(21, imageView, "GROUND_IMPACT_PEAK");
        } else {
            if (i != 25) {
                return;
            }
            d(jphVar, "BASELINE_ANALOG_CADENCE", 42);
            e(imageView);
        }
    }

    private void e(ImageView imageView, int i) {
        if (this.u == 259) {
            jpq.b(i, imageView, "RIDE_POWER");
        }
    }

    private void d(Context context, String str, int i, int i2) {
        if (this.k) {
            return;
        }
        a();
        if (context == null) {
            return;
        }
        a(context, str, i2);
        e(i);
    }

    private void a(Context context, String str, int i) {
        if (!(context instanceof Activity)) {
            LogUtil.j("Track_HeartRateFrag", "wrong context");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TrackLineChartActivity.class);
        intent.putExtra("KEY_BASELINE", str);
        intent.putExtra(BleConstants.SPORT_TYPE, i);
        intent.putExtra("rowerStrength", this.v);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Track_HeartRateFrag", "launchHorizontalScreenActivity() exception: ", LogAnonymous.b(e));
        }
    }

    private void e(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("chartType", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_ENTER_HORIZONTAL_CHART_1040032.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ad() {
        this.k = false;
    }

    public void a() {
        this.j.postDelayed(new Runnable() { // from class: jnf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.ad();
            }
        }, 500L);
        this.k = true;
    }

    public boolean e() {
        return this.k;
    }

    public void f() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            ReleaseLogUtil.d("Track_HeartRateFrag", "refreshSportAfterProcessView activity isFinishing");
            return;
        }
        if (this.f11099c == null) {
            ReleaseLogUtil.d("Track_HeartRateFrag", "refreshSportAfterProcessView mTrackDetailDataManager is null");
            return;
        }
        LogUtil.a("Track_HeartRateFrag", "refreshSportAfterProcessView");
        jph jphVar = this.f.get(SportDetailChartDataType.ALTITUDE);
        if (jphVar == null) {
            ReleaseLogUtil.e("Track_HeartRateFrag", "refreshSportAfterProcessView altitudeChartModel is null");
            return;
        }
        new jqs(this.ah, this.f11099c).d(SportDetailChartDataType.ALTITUDE, this.f11099c.d(), this.f11099c.b());
        this.ah.addTrackAltitudeDataLayer(jphVar.c());
        jphVar.c().refresh();
    }

    private void w() {
        LogUtil.e("Track_HeartRateFrag", "initData ---- --------------");
        this.s = true;
        int iRequestTrackType = this.f11099c.d().requestTrackType();
        MotionPath motionPathB = this.f11099c.b();
        if (motionPathB == null) {
            LogUtil.a("Track_HeartRateFrag", "motionPath is null return");
            return;
        }
        this.x = gzz.c(motionPathB.requestStepRateList(), iRequestTrackType, 10000);
        this.n = motionPathB.requestHeartRateList();
        this.m = motionPathB.requestHeartRecoveryRateList();
        n();
        HandlerExecutor.b(new Runnable() { // from class: jnd
            @Override // java.lang.Runnable
            public final void run() {
                this.f38748c.ah();
            }
        });
    }

    private void n() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            d(entry.getKey(), entry.getValue());
        }
    }

    private void d(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (AnonymousClass2.d[sportDetailChartDataType.ordinal()]) {
            case 1:
                i(jphVar);
                break;
            case 2:
                l(jphVar);
                break;
            case 3:
                g(jphVar);
                break;
            case 4:
                k(jphVar);
                break;
            case 5:
                v(jphVar);
                break;
            case 6:
                u(jphVar);
                break;
            case 7:
                d(jphVar);
                break;
            case 8:
                f(jphVar);
                break;
            case 9:
                n(jphVar);
                break;
            case 10:
                t(jphVar);
                break;
            case 11:
                s(jphVar);
                break;
            case 12:
                x(jphVar);
                break;
            case 13:
                w(jphVar);
                break;
            case 14:
                h(jphVar);
                break;
            default:
                e(sportDetailChartDataType, jphVar);
                break;
        }
    }

    private void e(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case GC_TIME_BALANCE:
                j(jphVar);
                break;
            case VERTICAL_OSCILLATION:
                y(jphVar);
                break;
            case VERTICAL_RATIO:
                ac(jphVar);
                break;
            case JUMP_HEIGHT:
                o(jphVar);
                break;
            case JUMP_TIME:
                m(jphVar);
                break;
            case POWER:
                r(jphVar);
                break;
            case ANALOG_POWER:
                a(jphVar);
                break;
            case HEART_RATE_RECOVERY:
                q(jphVar);
                break;
            case ACTIVE_PEAK:
                e(jphVar);
                break;
            case PEAK_WEIGHT:
                p(jphVar);
                break;
            case ANALOG_CADENCE:
                b(jphVar);
                break;
        }
    }

    private void p(jph jphVar) {
        if (this.f11099c.am()) {
            z(jphVar);
            return;
        }
        int extendDataInt = this.f11099c.d().getExtendDataInt("peak_weight");
        if (UnitUtil.f()) {
            extendDataInt = (int) Math.round(UnitUtil.h(extendDataInt));
        }
        jphVar.d(extendDataInt);
    }

    private void q(final jph jphVar) {
        final int iAcquireHeartRate;
        if (jphVar == null) {
            LogUtil.e("Track_HeartRateFrag", "in configRecoverHeartRate chartModel is null");
            return;
        }
        if (this.f11099c.an()) {
            z(jphVar);
            return;
        }
        List<HeartRateData> list = this.m;
        if (list != null && list.size() > 0) {
            final int iAcquireHeartRate2 = 0;
            jphVar.d().setVisibility(0);
            jphVar.i().setVisibility(0);
            Iterator<HeartRateData> it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iAcquireHeartRate = 0;
                    break;
                }
                HeartRateData next = it.next();
                if (next.acquireHeartRate() > 0) {
                    iAcquireHeartRate = next.acquireHeartRate();
                    break;
                }
            }
            for (int size = this.m.size() - 1; size >= 0; size--) {
                if (this.m.get(size).acquireHeartRate() > 0) {
                    iAcquireHeartRate2 = this.m.get(size).acquireHeartRate();
                    break;
                }
            }
            jphVar.d((iAcquireHeartRate - iAcquireHeartRate2) / 2.0f);
            HandlerExecutor.b(new Runnable() { // from class: jmv
                @Override // java.lang.Runnable
                public final void run() {
                    jphVar.a().e(iAcquireHeartRate, iAcquireHeartRate2);
                }
            });
            return;
        }
        jphVar.d().setVisibility(8);
        jphVar.i().setVisibility(8);
    }

    private void w(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        }
    }

    private void g(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.o(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().requestAvgGroundContactTime());
        }
    }

    private void l(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.h(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().requestAverageHangTime());
        }
    }

    private void y(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
            return;
        }
        float fM = gzz.m(this.f11099c.b().requestRunningPostureList());
        if (UnitUtil.f()) {
            fM = (float) UnitUtil.e(fM, 0);
        }
        jphVar.e(fM);
        jphVar.d(s());
    }

    private void ac(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.k(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().getExtendDataFloat("avg_v_s_r"));
        }
    }

    private void j(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
            return;
        }
        float fD = (float) UnitUtil.d(this.f11099c.d().getExtendDataFloat("avg_gc_tb"), 1);
        jphVar.d(fD);
        jphVar.e(100.0f - fD);
    }

    private void e(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.i(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().getExtendDataFloat("avg_i_p"));
        }
    }

    private void i(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.l(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().requestGroundHangTimeRate());
        }
    }

    private void h(jph jphVar) {
        if (jphVar.j()) {
            z(jphVar);
        } else {
            jphVar.e(gzz.f(this.f11099c.b().requestRunningPostureList()));
            jphVar.d(this.f11099c.d().requestAvgGroundImpactAcceleration());
        }
    }

    private void o(jph jphVar) {
        int iE;
        int iE2;
        if (this.f11099c.u()) {
            z(jphVar);
            return;
        }
        if (!UnitUtil.f()) {
            iE = jpq.f(this.f11099c.b().requestJumpDataList());
            iE2 = jpq.c(this.f11099c.b().requestJumpDataList());
        } else {
            iE = (int) UnitUtil.e(jpq.f(this.f11099c.b().requestJumpDataList()), 0);
            iE2 = (int) UnitUtil.e(jpq.c(this.f11099c.b().requestJumpDataList()), 0);
        }
        jphVar.d(iE2);
        jphVar.e(iE);
    }

    private void m(jph jphVar) {
        if (this.f11099c.u()) {
            z(jphVar);
            return;
        }
        int iG = jpq.g(this.f11099c.b().requestJumpDataList());
        jphVar.d(jpq.d(this.f11099c.b().requestJumpDataList()));
        jphVar.e(iG);
    }

    private void d(jph jphVar) {
        if (this.f11099c.x()) {
            z(jphVar);
        }
    }

    private void u(jph jphVar) {
        if (this.f11099c.ao()) {
            z(jphVar);
        }
    }

    private void v(jph jphVar) {
        if (this.f11099c.aw()) {
            z(jphVar);
            return;
        }
        int iA = gzz.a((StepRateData) Collections.max(this.x, new Comparator() { // from class: jng
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HeartRateFrag.d((StepRateData) obj, (StepRateData) obj2);
            }
        }));
        jphVar.d(this.f11099c.d().requestAvgStepRate());
        jphVar.e(iA);
    }

    public static /* synthetic */ int d(StepRateData stepRateData, StepRateData stepRateData2) {
        return gzz.a(stepRateData) - gzz.a(stepRateData2);
    }

    private void f(jph jphVar) {
        int extendDataInt;
        if (this.f11099c.ab()) {
            z(jphVar);
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        if (this.u == 273 && motionPathSimplifyD.getExtendDataInt("crossTrainerCadence") > 0) {
            extendDataInt = motionPathSimplifyD.getExtendDataInt("crossTrainerCadence");
        } else {
            int i = this.u;
            if ((i == 259 || i == 265) && motionPathSimplifyD.getExtendDataInt("avgCadence") > 0) {
                extendDataInt = motionPathSimplifyD.getExtendDataInt("avgCadence");
            } else {
                extendDataInt = jpq.c(motionPathSimplifyD, this.f11099c.b());
            }
        }
        List<gzr> listRequestRidePostureDataList = this.f11099c.b().requestRidePostureDataList();
        int iC = !listRequestRidePostureDataList.isEmpty() ? ((gzr) Collections.max(listRequestRidePostureDataList, new Comparator() { // from class: jmr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HeartRateFrag.b((gzr) obj, (gzr) obj2);
            }
        })).c() : 0;
        jphVar.d(extendDataInt);
        jphVar.e(iC);
    }

    public static /* synthetic */ int b(gzr gzrVar, gzr gzrVar2) {
        return gzrVar.c() - gzrVar2.c();
    }

    private void b(jph jphVar) {
        int iE;
        if (this.f11099c.y()) {
            z(jphVar);
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        MotionPath motionPathB = this.f11099c.b();
        List<njc> listRequestAnalogCadenceList = motionPathB.requestAnalogCadenceList();
        int iA = !coq.d(listRequestAnalogCadenceList) ? ((njc) Collections.max(listRequestAnalogCadenceList, Comparator.comparingInt(new ToIntFunction() { // from class: jms
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((njc) obj).a();
            }
        }))).a() : 0;
        if (this.u == 259 && motionPathSimplifyD.getExtendDataInt("avgAnalogCadence") > 0) {
            iE = motionPathSimplifyD.getExtendDataInt("avgAnalogCadence");
        } else {
            iE = jpq.e(motionPathB.requestAnalogCadenceList());
        }
        jphVar.d(iE);
        jphVar.e(iA);
    }

    private void n(jph jphVar) {
        if (this.f11099c.ah()) {
            z(jphVar);
            return;
        }
        List<nji> listRequestPaddleFrequencyList = this.f11099c.b().requestPaddleFrequencyList();
        float fC = !listRequestPaddleFrequencyList.isEmpty() ? ((nji) Collections.max(listRequestPaddleFrequencyList, new Comparator() { // from class: jni
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HeartRateFrag.c((nji) obj, (nji) obj2);
            }
        })).c() : 0.0f;
        jphVar.d(jpq.a(this.f11099c.d()));
        jphVar.e(fC);
    }

    public static /* synthetic */ int c(nji njiVar, nji njiVar2) {
        if (njiVar.c() - njiVar2.c() < 0.0f) {
            return -1;
        }
        return njiVar.c() - njiVar2.c() == 0.0f ? 0 : 1;
    }

    private void r(jph jphVar) {
        int iA;
        if (this.f11099c.af()) {
            z(jphVar);
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        MotionPath motionPathB = this.f11099c.b();
        List<njh> listRequestPowerList = motionPathB.requestPowerList();
        int iE = !listRequestPowerList.isEmpty() ? ((njh) Collections.max(listRequestPowerList, new Comparator() { // from class: jmw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HeartRateFrag.b((njh) obj, (njh) obj2);
            }
        })).e() : 0;
        if (this.u == 259 && motionPathSimplifyD.getExtendDataInt("avgPower") > 0) {
            iA = motionPathSimplifyD.getExtendDataInt("avgPower");
        } else if (jpq.j(this.u) && motionPathSimplifyD.getExtendDataInt("avgAnalogPower") > 0) {
            iA = motionPathSimplifyD.getExtendDataInt("avgAnalogPower");
        } else {
            iA = jpq.a(motionPathB.requestPowerList());
        }
        jphVar.d(iA);
        jphVar.e(iE);
    }

    public static /* synthetic */ int b(njh njhVar, njh njhVar2) {
        return njhVar.e() - njhVar2.e();
    }

    private void a(jph jphVar) {
        int iB;
        if (this.f11099c.v()) {
            z(jphVar);
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        MotionPath motionPathB = this.f11099c.b();
        List<njb> listRequestAnalogPowerList = motionPathB.requestAnalogPowerList();
        int iA = !listRequestAnalogPowerList.isEmpty() ? ((njb) Collections.max(listRequestAnalogPowerList, new Comparator() { // from class: jna
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HeartRateFrag.c((njb) obj, (njb) obj2);
            }
        })).a() : 0;
        if (this.u == 259 && motionPathSimplifyD.getExtendDataInt("avgAnalogPower") > 0) {
            iB = motionPathSimplifyD.getExtendDataInt("avgAnalogPower");
        } else {
            iB = jpq.b(motionPathB.requestAnalogPowerList());
        }
        jphVar.d(iB);
        jphVar.e(iA);
    }

    public static /* synthetic */ int c(njb njbVar, njb njbVar2) {
        return njbVar.a() - njbVar2.a();
    }

    private void k(jph jphVar) {
        if (this.f11099c.ag()) {
            aa(jphVar);
            return;
        }
        int iD = gzz.d(this.n);
        jphVar.d(this.f11099c.d().requestAvgHeartRate());
        jphVar.e(iD);
        HandlerExecutor.b(new Runnable() { // from class: jmx
            @Override // java.lang.Runnable
            public final void run() {
                this.f38741b.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        if (this.f11099c != null) {
            a(this.n, this.f11099c.d());
        }
    }

    private void x(jph jphVar) {
        if (this.f11099c.at()) {
            z(jphVar);
        }
    }

    private void t(jph jphVar) {
        if (this.f11099c.al() || jpq.i(this.f11099c.d().requestSportType())) {
            z(jphVar);
        }
    }

    private void s(jph jphVar) {
        if (this.f11099c.ak()) {
            z(jphVar);
        }
    }

    private void z(final jph jphVar) {
        LogUtil.a("Track_HeartRateFrag", "gone Chart");
        HandlerExecutor.b(new Runnable() { // from class: jnb
            @Override // java.lang.Runnable
            public final void run() {
                HeartRateFrag.c(jphVar);
            }
        });
    }

    public static /* synthetic */ void c(jph jphVar) {
        if (jphVar.d() != null) {
            jphVar.d().setVisibility(8);
        }
        if (jphVar.i() != null) {
            jphVar.i().setVisibility(8);
        }
    }

    private void aa(final jph jphVar) {
        HandlerExecutor.b(new Runnable() { // from class: jmt
            @Override // java.lang.Runnable
            public final void run() {
                this.f38736c.ad(jphVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ad(jph jphVar) {
        LogUtil.a("Track_HeartRateFrag", "mHeartRateList is empty null==========");
        this.o.setVisibility(8);
        jphVar.d().setVisibility(8);
        this.aa.setVisibility(8);
        jphVar.i().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (!isAdded()) {
            LogUtil.e("Track_HeartRateFrag", "fragment is not added to activity");
            return;
        }
        this.r.setVisibility(8);
        if (aa() && this.af == 0 && this.ae == 0) {
            this.i.setVisibility(8);
        } else {
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(Integer.valueOf(this.ai));
            arrayList.add(Integer.valueOf(this.ag));
            arrayList.add(Integer.valueOf(this.ab));
            arrayList.add(Integer.valueOf(this.af));
            arrayList.add(Integer.valueOf(this.ae));
            HealthRingChart healthRingChart = this.l;
            if (healthRingChart != null) {
                healthRingChart.a(arrayList);
            }
        }
        int i = this.u;
        if (i == 262 || i == 266) {
            this.aa.setVisibility(0);
        }
        k();
        o();
        ai();
        ag();
    }

    private boolean aa() {
        return this.ai == 0 && this.ag == 0 && this.ab == 0;
    }

    private void k() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    private void c(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case HANG_TIME:
                this.ah.addRunningPostureDataLayer(jphVar.c(), 16, this.f11099c.d().requestAverageHangTime());
                break;
            case GROUND_CONTACT_TIME:
                this.ah.addRunningPostureDataLayer(jphVar.c(), 7, this.f11099c.d().requestAvgGroundContactTime());
                break;
            case HEART_RATE:
                this.ah.addHeartRateDataLayer(jphVar.c(), this.f11099c.d().requestAvgHeartRate());
                break;
            case STEP_RATE:
                this.ah.addStepRateDataLayer(jphVar.c(), this.f11099c.d().requestAvgStepRate());
                break;
            case SPEED_RATE:
                this.ah.addTrackSpeedDataLayer(jphVar.c());
                break;
            case ALTITUDE:
                this.ah.addTrackAltitudeDataLayer(jphVar.c());
                break;
            case CADENCE:
                this.ah.addCadenceRateDataLayer(jphVar.c());
                break;
            case PADDLE_FREQUENCY:
                this.ah.addPaddleFreqDataLayer(jphVar.c());
                break;
            case REALTIME_PACE:
                this.ah.addTrackRealTimePaceDataLayer(jphVar.c(), jpq.c(this.f11099c.d()));
                break;
            case PULL_FREQ:
                this.ah.addTrackPullFreqDataLayer(jphVar.c());
                break;
            case SWOLF:
                this.ah.addTrackSwolfDataLayer(jphVar.c());
                break;
            case SPO2:
                this.ah.addSpo2DataLayer(jphVar.c());
                break;
            default:
                a(sportDetailChartDataType, jphVar);
                break;
        }
    }

    private void a(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        int i = AnonymousClass2.d[sportDetailChartDataType.ordinal()];
        if (i == 1) {
            this.ah.addRunningPostureDataLayer(jphVar.c(), 17, this.f11099c.d().requestGroundHangTimeRate());
            return;
        }
        if (i != 23) {
            switch (i) {
                case 14:
                    this.ah.addRunningPostureDataLayer(jphVar.c(), 8);
                    break;
                case 15:
                    this.ah.addRunningPostureDataLayer(jphVar.c(), 19, 50.0f);
                    break;
                case 16:
                    this.ah.addRunningPostureDataLayer(jphVar.c(), 18, this.f11099c.d().getExtendDataFloat("avg_v_osc"));
                    break;
                case 17:
                    this.ah.addRunningPostureDataLayer(jphVar.c(), 20, this.f11099c.d().getExtendDataFloat("avg_v_s_r"));
                    break;
                case 18:
                    this.ah.addJumpHeightDataLayer(jphVar.c());
                    break;
                case 19:
                    this.ah.addJumpTimeDataLayer(jphVar.c());
                    break;
                case 20:
                    this.ah.addPowerDataLayer(jphVar.c());
                    break;
                default:
                    b(sportDetailChartDataType, jphVar);
                    break;
            }
            return;
        }
        this.ah.addRunningPostureDataLayer(jphVar.c(), 21, this.f11099c.d().getExtendDataFloat("avg_i_p"));
    }

    private void b(SportDetailChartDataType sportDetailChartDataType, jph jphVar) {
        switch (sportDetailChartDataType) {
            case ANALOG_POWER:
                this.ah.addAnalogPowerDataLayer(jphVar.c());
                break;
            case HEART_RATE_RECOVERY:
                this.ah.addRecoverHeartRateLayer(jphVar.c());
                break;
            case PEAK_WEIGHT:
                this.ah.addWeightDataLayer(jphVar.c());
                break;
            case ANALOG_CADENCE:
                this.ah.addAnalogCadenceDataLayer(jphVar.c());
                break;
        }
    }

    private void ai() {
        Iterator<Map.Entry<SportDetailChartDataType, jph>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().c().refresh();
        }
    }

    private void o() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            jph value = entry.getValue();
            SportDetailChartDataType key = entry.getKey();
            value.c().setTouchEnabled(false);
            value.c().setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
            jpq.e(key, value, this.f11098a, this.f11099c);
        }
    }

    private void ag() {
        for (Map.Entry<SportDetailChartDataType, jph> entry : this.f.entrySet()) {
            SportDetailChartDataType key = entry.getKey();
            jph value = entry.getValue();
            d(key, value, value.a());
        }
    }

    private void d(SportDetailChartDataType sportDetailChartDataType, jph jphVar, TrackChartViewHolder trackChartViewHolder) {
        switch (AnonymousClass2.d[sportDetailChartDataType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
                trackChartViewHolder.c(jphVar.g());
                trackChartViewHolder.a(jphVar.h());
                break;
            case 6:
                ae(jphVar);
                break;
            case 7:
                ab(jphVar);
                break;
            case 10:
                b(trackChartViewHolder);
                break;
            case 11:
                af(jphVar);
                break;
            case 12:
                ai(jphVar);
                break;
            case 13:
                trackChartViewHolder.c(this.f11099c.d().requestMinSpo2());
                trackChartViewHolder.a(this.f11099c.d().requestMaxSpo2());
                break;
            case 24:
            default:
                c(sportDetailChartDataType, jphVar, trackChartViewHolder);
                break;
        }
    }

    private void c(SportDetailChartDataType sportDetailChartDataType, jph jphVar, TrackChartViewHolder trackChartViewHolder) {
        if (AnonymousClass2.d[sportDetailChartDataType.ordinal()] != 24) {
            return;
        }
        trackChartViewHolder.c(jphVar.g());
    }

    private float s() {
        if (!UnitUtil.f()) {
            return this.f11099c.d().getExtendDataFloat("avg_v_osc");
        }
        return (float) UnitUtil.e(this.f11099c.d().getExtendDataFloat("avg_v_osc"), 0);
    }

    private void ae(jph jphVar) {
        TrackChartViewHolder trackChartViewHolderA = jphVar.a();
        float fC = (float) jpq.c(this.f11099c.d().requestAvgPace());
        float fE = (float) gzz.e(this.f11099c.b().requestRealTimeSpeedList());
        jphVar.d(fC);
        jphVar.e(fE);
        trackChartViewHolderA.c(jphVar.g());
        trackChartViewHolderA.a(jphVar.h());
    }

    private void ab(jph jphVar) {
        float fRequestMinAltitude = this.f11099c.d().requestMinAltitude();
        float fRequestMaxAltitude = this.f11099c.d().requestMaxAltitude();
        if (!jpq.e(fRequestMinAltitude, fRequestMaxAltitude)) {
            Float[] fArrD = jpq.d(this.f11099c.b().requestAltitudeList());
            fRequestMaxAltitude = fArrD[0].floatValue();
            fRequestMinAltitude = fArrD[1].floatValue();
        }
        jphVar.d(fRequestMinAltitude);
        jphVar.e(fRequestMaxAltitude);
        jphVar.a().c(jphVar.g());
        jphVar.a().a(jphVar.h());
    }

    private void b(TrackChartViewHolder trackChartViewHolder) {
        double dC;
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        if (this.f11099c.al()) {
            return;
        }
        float fRequestAvgPace = motionPathSimplifyD.requestAvgPace();
        float fC = gzz.c(this.f11099c.b().requestRealTimePaceList());
        int i = this.u;
        if (i == 266 || i == 262) {
            fRequestAvgPace /= 10.0f;
            fC /= 10.0f;
            if (UnitUtil.f()) {
                fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace, 2);
                dC = UnitUtil.c(fC, 2);
                fC = (float) dC;
            }
        } else if (i == 274) {
            fC /= 2.0f;
            if (UnitUtil.f()) {
                fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace / 5.0f, 2);
                dC = UnitUtil.c(fC / 5.0f, 2);
                fC = (float) dC;
            }
        } else if (jpq.g(i)) {
            fRequestAvgPace /= 2.0f;
            fC /= 2.0f;
        } else if (UnitUtil.f()) {
            float fC2 = (float) UnitUtil.c(fRequestAvgPace, 3);
            fC = (float) UnitUtil.c(fC, 3);
            fRequestAvgPace = fC2;
        }
        trackChartViewHolder.c(fRequestAvgPace);
        trackChartViewHolder.a(fC);
    }

    private void af(jph jphVar) {
        TrackChartViewHolder trackChartViewHolderA = jphVar.a();
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        int i = this.u;
        if (i == 266 || i == 262) {
            Map<String, Integer> mapRequestSportData = motionPathSimplifyD.requestSportData();
            if (mapRequestSportData == null) {
                jphVar.d().setVisibility(8);
                jphVar.i().setVisibility(8);
            } else {
                if (this.f11099c.ak()) {
                    return;
                }
                if (mapRequestSportData.get("swim_pull_freq") != null) {
                    trackChartViewHolderA.c(mapRequestSportData.get("swim_pull_freq").intValue());
                } else {
                    trackChartViewHolderA.c(0.0f);
                }
                trackChartViewHolderA.a(gzz.g(this.y));
            }
        }
    }

    private void ai(jph jphVar) {
        TrackChartViewHolder trackChartViewHolderA = jphVar.a();
        MotionPathSimplify motionPathSimplifyD = this.f11099c.d();
        int i = this.u;
        if (i == 266 || i == 262) {
            Map<String, Integer> mapRequestSportData = motionPathSimplifyD.requestSportData();
            if (mapRequestSportData == null) {
                jphVar.d().setVisibility(8);
            } else {
                if (this.f11099c.at()) {
                    return;
                }
                if (mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF) != null) {
                    trackChartViewHolderA.c(mapRequestSportData.get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF).intValue());
                } else {
                    trackChartViewHolderA.c(0.0f);
                }
                trackChartViewHolderA.a(gzz.j(this.ac));
            }
        }
    }

    public void a(final ArrayList<HeartRateData> arrayList, final MotionPathSimplify motionPathSimplify) {
        if (arrayList == null || motionPathSimplify == null) {
            LogUtil.e("Track_HeartRateFrag", "arrayngeRingData() mHeartRateList is null!");
            return;
        }
        gzz.a();
        this.u = motionPathSimplify.requestSportType();
        lsy.a(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag.3
            @Override // java.lang.Runnable
            public void run() {
                int extendDataInt = motionPathSimplify.getExtendDataInt("sportHeartPosture", -1);
                LogUtil.a("Track_HeartRateFrag", "arrangeRingData posture = ", Integer.valueOf(extendDataInt));
                if (extendDataInt == -1) {
                    extendDataInt = 1;
                }
                String extendDataString = motionPathSimplify.getExtendDataString("isTrustHeartRate");
                UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
                int iRequestHeartRateZoneType = motionPathSimplify.requestHeartRateZoneType();
                LogUtil.a("Track_HeartRateFrag", "arrangeRingData devices classifyMethod= ", Integer.valueOf(iRequestHeartRateZoneType));
                int[] iArrE = new int[5];
                gzz.d(motionPathSimplify, iArrE);
                if (gzz.a(iArrE)) {
                    LogUtil.a("Track_HeartRateFrag", "HeartRateZoneStatistic is invalid");
                    iArrE = gzz.e(arrayList, iRequestHeartRateZoneType, motionPathSimplify.requestTotalTime(), extendDataString, userProfileMgrApi.getLocalUserInfo(), extendDataInt);
                }
                LogUtil.a("Track_HeartRateFrag", "timeArea = ", Arrays.toString(iArrE));
                Message messageObtainMessage = HeartRateFrag.this.j.obtainMessage();
                messageObtainMessage.what = 106;
                messageObtainMessage.obj = iArrE;
                HeartZoneConf heartZoneConfE = gzz.e(extendDataInt, iRequestHeartRateZoneType, userProfileMgrApi.getLocalUserInfo());
                LogUtil.a("Track_HeartRateFrag", "arrangeRingData ClassifyMethod= ", Integer.valueOf(heartZoneConfE.getClassifyMethod()));
                messageObtainMessage.arg1 = heartZoneConfE.getClassifyMethod();
                Map<String, String> mapRequestExtendDataMap = motionPathSimplify.requestExtendDataMap();
                String str = mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_RECORD_FLAG) ? mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_RECORD_FLAG) : null;
                LogUtil.d("Track_HeartRateFrag", "arrangeRingData() recordFlag = ", str);
                Bundle bundle = new Bundle();
                bundle.putString(HwExerciseConstants.JSON_NAME_RECORD_FLAG, str);
                messageObtainMessage.setData(bundle);
                HeartRateFrag.this.j.sendMessage(messageObtainMessage);
            }
        });
    }

    public void b(View view, Context context) {
        this.f11098a = context;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_heart_rate_chart_show);
        this.i = linearLayout;
        this.l = (HealthRingChart) linearLayout.findViewById(R.id.ring_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int[] iArr, int i, String str) {
        ArrayList arrayList = new ArrayList(10);
        if (i == 3) {
            arrayList.add(this.f11098a.getString(R.string.IDS_lactate_subHeader_top7));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_lactate_subHeader_top8));
        } else if (i == 1) {
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold));
        } else {
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_maximum_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_anaerobic_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_aerobic_threshold));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_fatburn_threshold_string));
            arrayList.add(this.f11098a.getString(R.string.IDS_rate_zone_warmup_threshold));
        }
        this.ae = iArr[0];
        this.af = iArr[1];
        this.ab = iArr[2];
        this.ag = iArr[3];
        this.ai = iArr[4];
        List<qjp> listA = a(arrayList);
        if (this.ae + this.af + this.ab + this.ag + this.ai == 0.0f) {
            return;
        }
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f11098a, new qjm().b(false).c(true), listA);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jnh
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.f38750a.e(qjpVar);
            }
        });
        this.l.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.f11098a)) {
            this.l.setDesc(this.f11098a.getResources().getString(R.string.IDS_main_watch_heart_rate_string), this.f11098a.getResources().getString(R.string.IDS_hwh_motiontrack_heart_rate_zone));
        }
        if (aa() && this.af == 0 && this.ae == 0) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String e(qjp qjpVar) {
        return e((int) qjpVar.f(), this.f11098a);
    }

    private List<qjp> a(List<String> list) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(this.ai));
        arrayList.add(Integer.valueOf(this.ag));
        arrayList.add(Integer.valueOf(this.ab));
        arrayList.add(Integer.valueOf(this.af));
        arrayList.add(Integer.valueOf(this.ae));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_extreme_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_warmup_color_end)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_extreme_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f11098a, R.color.pie_sector_heart_rate_warmup_color_begin)));
        int size = list.size();
        ArrayList arrayList4 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList4.add(new qjp(i < list.size() ? list.get(i) : "", ((Integer) arrayList.get(i)).intValue(), i < arrayList2.size() ? ((Integer) arrayList2.get(i)).intValue() : 0, i < arrayList3.size() ? ((Integer) arrayList3.get(i)).intValue() : 0));
            i++;
        }
        return arrayList4;
    }

    public static String e(int i, Context context) {
        if (context == null) {
            return null;
        }
        if (i > 0 && i < 60) {
            return context.getString(R.string.IDS_motiontrack_show_chart_less_than_one_minute, 1);
        }
        return qrs.a(i / 60, context);
    }

    private void e(final ImageView imageView) {
        if (imageView == null) {
            LogUtil.e("Track_HeartRateFrag", "explainIcon == null");
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: jnc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(imageView, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImageView imageView, View view) {
        if (qrs.r()) {
            LogUtil.j("Track_HeartRateFrag", "downRemindClick is fast click");
        } else {
            i(imageView);
        }
    }

    private void i(View view) {
        final PopupWindow popupWindowD = jpq.d(this.f11098a, view, qre.f(R.string.IDS_track_analog_cadence_tip));
        if (popupWindowD == null) {
            ReleaseLogUtil.a("Track_HeartRateFrag", "popupWindow is null");
            return;
        }
        if (qrs.t()) {
            this.ad = qrs.af(getContext());
            final ViewTreeObserver viewTreeObserver = this.e.getViewTreeObserver();
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jnk
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f38752b.e(popupWindowD);
                }
            };
            popupWindowD.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag$$ExternalSyntheticLambda9
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    HeartRateFrag.c(viewTreeObserver, onGlobalLayoutListener);
                }
            });
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(PopupWindow popupWindow) {
        boolean zAf = qrs.af(getContext());
        if (this.ad != zAf) {
            LogUtil.a("Track_HeartRateFrag", "popupWindow dismiss");
            this.ad = zAf;
            popupWindow.dismiss();
        }
    }

    static /* synthetic */ void c(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.w;
        if (executorService != null) {
            executorService.shutdown();
        }
        a aVar = this.j;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        gzz.a();
        m();
        Map<SportDetailChartDataType, jph> map = this.f;
        if (map != null) {
            map.clear();
        }
        this.f11099c = null;
    }

    private static void m() {
        d = null;
    }
}

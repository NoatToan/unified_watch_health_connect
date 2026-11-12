package com.huawei.ui.main.stories.history.fragment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.view.AiFitnessPlanEnergyReplacementCard;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.AthleticAbilityEmptyActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.RqNoNetworkActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.StateIndexActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelCurrentData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.history.adapter.SportHistoryExpandableListAdapter;
import com.huawei.ui.main.stories.history.view.MonthTitleItem;
import defpackage.btq;
import defpackage.btw;
import defpackage.hbz;
import defpackage.idy;
import defpackage.ies;
import defpackage.iov;
import defpackage.ipi;
import defpackage.ive;
import defpackage.ivv;
import defpackage.iwn;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jbv;
import defpackage.jcg;
import defpackage.jdb;
import defpackage.jpz;
import defpackage.jqq;
import defpackage.jry;
import defpackage.jxh;
import defpackage.jyd;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.ltx;
import defpackage.njd;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nkx;
import defpackage.ntn;
import defpackage.ntx;
import defpackage.ntz;
import defpackage.nub;
import defpackage.oru;
import defpackage.qqu;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uwf;
import defpackage.vds;
import defpackage.vqn;
import defpackage.vqp;
import defpackage.vqt;
import defpackage.vqu;
import defpackage.vqz;
import defpackage.vrb;
import defpackage.vrc;
import defpackage.vrg;
import defpackage.vrh;
import defpackage.wka;
import defpackage.wui;
import defpackage.wvd;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.StorageResult;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class SportHistoryListFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f28305a = new Object();
    private static long e = -1;
    private ViewStub aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private long aj;
    private volatile boolean ak;
    private boolean al;
    private RelativeLayout am;
    private FrameLayout an;
    private o ao;
    private int ap;
    private final Map<Integer, Integer> aq;
    private LinearLayout ar;
    private ImageView as;
    private final Observer at;
    private int au;
    private int av;
    private int aw;
    private HashMap<Long, Long> ax;
    private l ay;
    private ImageView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f28306b;
    private String[] ba;
    private int bb;
    private m bc;
    private String bd;
    private int be;
    private View bf;
    private HealthTextView bg;
    private float bh;
    private HealthTextView bi;
    private int bj;
    private HealthTextView bk;
    private RunningStateIndexData bl;
    private String bm;
    private SportHistoryScrollListener bn;
    private ExpandableListView bo;
    private int bp;
    private View bq;
    private n br;
    private HealthTextView bs;
    private HealthTextView bt;
    private String bu;
    private String bv;
    private int bw;
    private HealthTextView bx;
    private List<vqu> by;
    private final int bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28307c;
    private IBaseResponseCallback ca;
    private Handler cb;
    private long cc;
    private String cd;
    private HealthTextView ce;
    private int cf;
    private View cg;
    private HealthTextView ch;
    private final vrc ci;
    private final List<MonthTitleItem.d> cj;
    private int ck;
    private HealthTextView cl;
    private TextView cm;
    private LinearLayout cp;
    private LinearLayout cq;
    private CopyOnWriteArrayList<vqu> d;
    private HealthButton f;
    private f g;
    private Context h;
    private final d i;
    private ViewGroup j;
    private int k;
    private int l;
    private int m;
    private b n;
    private long o;
    private int p;
    private int q;
    private String r;
    private SportHistoryExpandableListAdapter s;
    private long t;
    private FrameLayout u;
    private ExtendHandler v;
    private int w;
    private HealthSpinner x;
    private vrh y;
    private View z;

    public interface IMultiResponseCallback {
        void onNotify(int[] iArr, Object[] objArr);
    }

    public SportHistoryListFragment(int i2) {
        this.bz = lsl.a();
        this.at = new c(this);
        this.al = false;
        this.d = new CopyOnWriteArrayList<>();
        this.by = new ArrayList(10);
        this.v = null;
        this.ay = new l(this);
        this.n = new b();
        this.ao = new o(this);
        this.bc = new m(this);
        this.bm = "--";
        this.bd = "--";
        this.bv = "--";
        this.bu = "--";
        this.cd = "--";
        this.aj = 0L;
        this.ag = true;
        this.m = 0;
        this.k = 0;
        this.ae = false;
        this.ap = -1;
        this.ak = false;
        this.af = 0;
        this.q = -1;
        this.l = -1;
        this.t = 0L;
        this.o = 0L;
        this.ai = false;
        this.g = new f(this);
        this.i = new d(this);
        this.br = new n();
        this.av = -1;
        this.aw = 0;
        this.ax = new HashMap<>();
        this.bj = 0;
        this.cj = new ArrayList(10);
        this.ci = new vrc();
        this.bb = 0;
        this.aq = new HashMap();
        this.ah = true;
        this.m = i2;
    }

    public SportHistoryListFragment() {
        this.bz = lsl.a();
        this.at = new c(this);
        this.al = false;
        this.d = new CopyOnWriteArrayList<>();
        this.by = new ArrayList(10);
        this.v = null;
        this.ay = new l(this);
        this.n = new b();
        this.ao = new o(this);
        this.bc = new m(this);
        this.bm = "--";
        this.bd = "--";
        this.bv = "--";
        this.bu = "--";
        this.cd = "--";
        this.aj = 0L;
        this.ag = true;
        this.m = 0;
        this.k = 0;
        this.ae = false;
        this.ap = -1;
        this.ak = false;
        this.af = 0;
        this.q = -1;
        this.l = -1;
        this.t = 0L;
        this.o = 0L;
        this.ai = false;
        this.g = new f(this);
        this.i = new d(this);
        this.br = new n();
        this.av = -1;
        this.aw = 0;
        this.ax = new HashMap<>();
        this.bj = 0;
        this.cj = new ArrayList(10);
        this.ci = new vrc();
        this.bb = 0;
        this.aq = new HashMap();
        this.ah = true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Track_SportHistoryListFragment", "onCreateView");
        if (ActivityTransitionAnimator.c().a()) {
            ObserverManagerUtil.d(this.at, ObserveLabels.ACTIVITY_TRANSITION_ANIMATOR_END);
        }
        this.h = getActivity();
        if (bundle != null) {
            int i2 = bundle.getInt(BleConstants.SPORT_TYPE);
            this.m = i2;
            LogUtil.a("Track_SportHistoryListFragment", "mCurSportType:", Integer.valueOf(i2));
        }
        r();
        t();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_history_list, viewGroup, false);
        j(viewInflate);
        s();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LogUtil.a("Track_SportHistoryListFragment", "onSaveInstanceState");
        bundle.putInt(BleConstants.SPORT_TYPE, this.m);
    }

    private void t() {
        LogUtil.a("Track_SportHistoryListFragment", "initData");
        this.bj = this.bz + 1;
        this.v.postTask(new Runnable() { // from class: vql
            @Override // java.lang.Runnable
            public final void run() {
                this.f51464b.c();
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("input_sport_history_start_time");
        LocalBroadcastManager.getInstance().registerReceiver(this.g, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("change_sport_record_name");
        intentFilter2.addAction("event_sport_record_association");
        LocalBroadcastManager.getInstance().registerReceiver(this.i, intentFilter2);
        jpz.e();
    }

    public /* synthetic */ void c() {
        jaa.d(this.h);
    }

    private void s() {
        int i2 = this.m;
        if (i2 == 0) {
            c(i2);
        }
    }

    private void j(View view) {
        LogUtil.a("Track_SportHistoryListFragment", "initView");
        ExpandableListView expandableListView = (ExpandableListView) view.findViewById(R.id.list_sport_record_simplify);
        this.bo = expandableListView;
        BaseActivity.cancelLayoutById(expandableListView);
        SportHistoryExpandableListAdapter sportHistoryExpandableListAdapter = new SportHistoryExpandableListAdapter(getContext(), this);
        this.s = sportHistoryExpandableListAdapter;
        this.bo.setAdapter(sportHistoryExpandableListAdapter);
        this.ar = (LinearLayout) view.findViewById(R.id.no_sport_history_layout);
        View viewInflate = LayoutInflater.from(this.h).inflate(R.layout.layout_sport_history_list_header, (ViewGroup) null);
        f(viewInflate);
        this.y = new vrh(this.h, viewInflate, this.ar);
        this.bo.addHeaderView(viewInflate);
        this.bo.setSelector(new ColorDrawable(0));
        SportHistoryScrollListener sportHistoryScrollListener = new SportHistoryScrollListener(new SportHistoryScrollListener.SportScrollCallback() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.5
            @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryScrollListener.SportScrollCallback
            public void onResponse(long j2, boolean z) {
                if (njy.b(SportHistoryListFragment.this.d) && z) {
                    long j3 = j2 - 1;
                    LogUtil.a("Track_SportHistoryListFragment", "search by scroll ", Long.valueOf(j3));
                    SportHistoryListFragment.this.af = -2;
                    SportHistoryListFragment.this.a(lsl.p(j2), j3);
                }
            }

            @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryScrollListener.SportScrollCallback
            public void onScroll(int i2) {
                if (SportHistoryListFragment.this.bb != i2) {
                    SportHistoryListFragment.this.m(i2);
                    SportHistoryListFragment.this.bb = i2;
                }
            }
        }, this.d);
        this.bn = sportHistoryScrollListener;
        this.bo.setOnScrollListener(sportHistoryScrollListener);
        ScrollUtil.a(this.bo, getActivity().getWindow().getDecorView(), IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC);
        this.f = (HealthButton) view.findViewById(R.id.sport_history_to_exercise);
        this.am = (RelativeLayout) view.findViewById(R.id.hw_sport_history_loading);
        ((HealthProgressBar) view.findViewById(R.id.hw_sport_history_loading_view)).setLayerType(1, null);
        ao();
        ar();
    }

    private void ac() {
        this.aq.clear();
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.size(); i3++) {
            i2++;
            this.aq.put(Integer.valueOf(i2), Integer.valueOf(i3));
            vqu vquVar = this.d.get(i3);
            if (vquVar.a()) {
                for (int i4 = 0; i4 < vquVar.b(); i4++) {
                    i2++;
                    this.aq.put(Integer.valueOf(i2), Integer.valueOf(-i3));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i2) {
        Integer num;
        if (getActivity() instanceof SportHistoryActivity) {
            SportHistoryActivity sportHistoryActivity = (SportHistoryActivity) getActivity();
            if (i2 == 0) {
                sportHistoryActivity.c(8);
            } else {
                sportHistoryActivity.c(0);
            }
            if (this.aq.containsKey(Integer.valueOf(i2)) && (num = this.aq.get(Integer.valueOf(i2))) != null) {
                if (num.intValue() < 0) {
                    int iAbs = Math.abs(num.intValue());
                    int i3 = this.bp;
                    if (iAbs == i3) {
                        return;
                    }
                    int i4 = i3 - 1;
                    if (this.bb <= i2 || i4 < 0) {
                        return;
                    }
                    n(i4);
                    return;
                }
                n(num.intValue());
            }
        }
    }

    private void n(int i2) {
        if (i2 < this.d.size()) {
            vqu vquVar = this.d.get(i2);
            if (!(getActivity() instanceof SportHistoryActivity) || vquVar == null || this.s == null) {
                return;
            }
            ((SportHistoryActivity) getActivity()).b(vquVar.i(), this.s.d(vquVar));
            this.bp = i2;
        }
    }

    private void f(View view) {
        this.cp = (LinearLayout) view.findViewById(R.id.ll_year_title);
        this.az = (ImageView) view.findViewById(R.id.iv_arrow_left);
        this.as = (ImageView) view.findViewById(R.id.iv_arrow_right);
        Drawable drawableF = f(R.drawable.common_ui_arrow_right_normal_ic);
        if (drawableF != null) {
            this.az.setBackground(drawableF);
            this.as.setBackground(drawableF);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_year_title);
        this.cm = textView;
        if (this.bj > this.bz) {
            this.as.setVisibility(4);
            this.cm.setText(R.string.IDS_hw_show_sport_history_overview);
        } else {
            textView.setText(getString(R.string.IDS_history_overview_year, Integer.valueOf(this.bz)));
        }
        this.cq = (LinearLayout) view.findViewById(R.id.year_history_title);
        this.f28306b = view.findViewById(R.id.v_bottom_spacing);
        this.u = (FrameLayout) view.findViewById(R.id.ll_fitness_class_header);
        this.an = (FrameLayout) view.findViewById(R.id.item_rq_quick_entry);
        this.x = (HealthSpinner) view.findViewById(R.id.hs_fitness_class_spinner);
        this.cl = (HealthTextView) view.findViewById(R.id.vo2max_quick_entry_value);
        this.ch = (HealthTextView) view.findViewById(R.id.vo2max_quick_entry_unit);
        this.cg = view.findViewById(R.id.sport_ability_vo2max_icon);
        this.ce = (HealthTextView) view.findViewById(R.id.vo2max_quick_entry_no_record);
        this.bx = (HealthTextView) view.findViewById(R.id.state_quick_entry_value);
        this.bs = (HealthTextView) view.findViewById(R.id.state_quick_entry_level);
        this.bq = view.findViewById(R.id.sport_ability_state_icon);
        this.bt = (HealthTextView) view.findViewById(R.id.state_quick_entry_no_record);
        this.bk = (HealthTextView) view.findViewById(R.id.running_quick_entry_value);
        this.bg = (HealthTextView) view.findViewById(R.id.running_quick_entry_level);
        this.bf = view.findViewById(R.id.sport_ability_run_icon);
        this.bi = (HealthTextView) view.findViewById(R.id.running_quick_entry_no_record);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.vo2max_layout);
        HealthCardView healthCardView2 = (HealthCardView) view.findViewById(R.id.state_layout);
        HealthCardView healthCardView3 = (HealthCardView) view.findViewById(R.id.running_layout);
        this.cq.setOnClickListener(new View.OnClickListener() { // from class: vpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.a(view2);
            }
        });
        view.findViewById(R.id.iv_arrow_left).setOnClickListener(new View.OnClickListener() { // from class: vpy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f51443a.c(view2);
            }
        });
        view.findViewById(R.id.iv_arrow_right).setOnClickListener(new View.OnClickListener() { // from class: vqa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.d(view2);
            }
        });
        if (qrs.v()) {
            k(view);
        }
        healthCardView.setOnClickListener(new View.OnClickListener() { // from class: vpz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.b(view2);
            }
        });
        healthCardView2.setOnClickListener(new View.OnClickListener() { // from class: vqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.e(view2);
            }
        });
        healthCardView3.setOnClickListener(new View.OnClickListener() { // from class: vqc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f51445a.g(view2);
            }
        });
        this.aa = (ViewStub) view.findViewById(R.id.golf_year_brief_stub);
    }

    public /* synthetic */ void a(View view) {
        FragmentActivity activity = getActivity();
        if (activity instanceof SportHistoryActivity) {
            ((SportHistoryActivity) activity).a(false);
        }
    }

    public /* synthetic */ void c(View view) {
        v();
    }

    public /* synthetic */ void d(View view) {
        u();
    }

    public /* synthetic */ void b(View view) {
        ap();
    }

    public /* synthetic */ void e(View view) {
        aj();
    }

    public /* synthetic */ void g(View view) {
        al();
    }

    private Drawable f(int i2) {
        if (!LanguageUtil.ba(this.h)) {
            return null;
        }
        BitmapDrawable bitmapDrawableE = qqz.e(this.h, i2);
        LogUtil.a("Track_SportHistoryListFragment", "decode  ", bitmapDrawableE);
        return bitmapDrawableE;
    }

    private void k(View view) {
        ((HealthTextView) view.findViewById(R.id.vo2max_title)).setTextSize(1, 24.0f);
        ((HealthTextView) view.findViewById(R.id.state_title)).setTextSize(1, 24.0f);
        ((HealthTextView) view.findViewById(R.id.running_title)).setTextSize(1, 24.0f);
        this.ch.setTextSize(1, 24.0f);
        this.cl.setTextSize(1, 40.0f);
        this.ce.setTextSize(1, 24.0f);
        this.bx.setTextSize(1, 40.0f);
        this.bs.setTextSize(1, 24.0f);
        this.bt.setTextSize(1, 24.0f);
        this.bk.setTextSize(1, 40.0f);
        this.bg.setTextSize(1, 24.0f);
        this.bi.setTextSize(1, 24.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        ReleaseLogUtil.d("Track_SportHistoryListFragment", "setPropertyValueAndStyle  mVo2maxValue ", Integer.valueOf(this.ck), "mStateValue ", this.bv, "mStateLevel ", this.bu, "mRunningValue ", this.bm, "mRunningLevel ", this.bd);
        int i2 = this.ck;
        if (i2 > 0) {
            this.cl.setText(UnitUtil.e(i2, 1, 0));
            this.ch.setText(this.cd);
            this.cl.setVisibility(0);
            this.ch.setVisibility(0);
            this.ce.setVisibility(8);
            this.cg.getBackground().setTint(this.cf);
            this.ac = true;
        } else {
            this.ce.setVisibility(0);
            this.cl.setVisibility(8);
            this.ch.setVisibility(8);
            this.ce.setVisibility(0);
            this.ac = false;
        }
        if ("--".equals(this.bv) || "--".equals(this.bu)) {
            this.bx.setVisibility(8);
            this.bs.setVisibility(8);
            this.bt.setVisibility(0);
            this.ab = false;
        } else {
            this.bx.setText(this.bv);
            this.bs.setText(this.bu);
            this.bx.setVisibility(0);
            this.bs.setVisibility(0);
            this.bq.getBackground().setTint(this.bw);
            this.bt.setVisibility(8);
            this.ab = true;
        }
        if ("--".equals(this.bm) || "--".equals(this.bd)) {
            this.bk.setVisibility(8);
            this.bg.setVisibility(8);
            this.bi.setVisibility(0);
            this.ad = false;
        } else {
            this.bk.setText(this.bm);
            this.bg.setText(this.bd);
            this.bk.setVisibility(0);
            this.bg.setVisibility(0);
            this.bf.getBackground().setTint(this.be);
            this.bi.setVisibility(8);
            this.ad = true;
        }
        an();
    }

    private void an() {
        if (!this.ac && !this.ab && !this.ad) {
            this.an.setVisibility(8);
            return;
        }
        if (this.an.getVisibility() == 8) {
            this.an.setVisibility(0);
            this.f28306b.setVisibility(0);
            this.ar.setVisibility(8);
            c(this.ac, 1);
            c(this.ab, 2);
            c(this.ad, 3);
        }
    }

    private void v() {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportHistoryListFragment", "click too fast");
            return;
        }
        int i2 = this.bj;
        if (i2 <= 2015) {
            this.bj = 2014;
            this.az.setVisibility(4);
        } else {
            this.bj = i2 - 1;
        }
        this.cm.setText(getString(R.string.IDS_history_overview_year, Integer.valueOf(this.bj)));
        this.as.setVisibility(0);
        h(this.bj);
        ak();
    }

    private void u() {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportHistoryListFragment", "click too fast");
            return;
        }
        int i2 = this.bj;
        int i3 = this.bz;
        if (i2 >= i3) {
            this.bj = i3 + 1;
            this.as.setVisibility(4);
            this.cm.setText(R.string.IDS_hw_show_sport_history_overview);
        } else {
            this.bj = i2 + 1;
            this.cm.setText(getString(R.string.IDS_history_overview_year, Integer.valueOf(this.bj)));
        }
        this.az.setVisibility(0);
        h(this.bj);
        ak();
    }

    private void ak() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.m));
        lmf.d().c(getContext(), AnalyticsValue.SPORT_RECORD_YEAR_SWITCH_2040185.value(), map, 0);
    }

    private void c(boolean z, int i2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("isHaveData", Boolean.valueOf(z));
        map.put("dataType", Integer.valueOf(i2));
        lmf.d().c(getContext(), AnalyticsValue.SPORT_RECORD_ATHLETIC_ABILITY_CARD_2040191.value(), map, 0);
    }

    private void ap() {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportHistoryListFragment", "click too fast");
            return;
        }
        HealthDatasActivity.d(1, 1);
        Intent intent = new Intent();
        if (this.ac) {
            intent.setClass(this.h, Vo2maxActivity.class);
            intent.putExtra("vo2max_value", this.ck);
            intent.putExtra("running_level_data", this.bl);
            intent.putExtra("vo2max_time", this.cc);
            intent.putExtra("from_sport_list_fragment", true);
            startActivityForResult(intent, 1001);
            return;
        }
        intent.setClass(this.h, AthleticAbilityEmptyActivity.class);
        intent.putExtra("athletic_ability_empty_flag", "vo_to_max_no_record");
        iov.d(this.h, intent);
    }

    private void al() {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportHistoryListFragment", "click too fast");
            return;
        }
        HealthDatasActivity.d(3, 1);
        if (!jcg.c(this.h)) {
            Intent intent = new Intent(this.h, (Class<?>) RqNoNetworkActivity.class);
            intent.putExtra("title_name", getString(R.string.IDS_data_running_index_title_outside));
            iov.d(this.h, intent);
            return;
        }
        Intent intent2 = new Intent();
        if (this.ad) {
            intent2.setClass(this.h, RunningDataActivity.class);
            intent2.putExtra("running_level_data", this.bl);
            intent2.putExtra("KEY_RUNNING_FLAG", "RQ_RUNNING");
            intent2.putExtra("vo2max_value", this.ck);
            startActivityForResult(intent2, 1001);
            return;
        }
        intent2.setClass(this.h, AthleticAbilityEmptyActivity.class);
        intent2.putExtra("athletic_ability_empty_flag", "running_no_record");
        iov.d(this.h, intent2);
    }

    private void aj() {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportHistoryListFragment", "click too fast");
            return;
        }
        HealthDatasActivity.d(2, 1);
        if (!jcg.c(this.h)) {
            Intent intent = new Intent(this.h, (Class<?>) RqNoNetworkActivity.class);
            intent.putExtra("title_name", this.h.getString(R.string.IDS_data_state_index_title));
            iov.d(this.h, intent);
            return;
        }
        Intent intent2 = new Intent();
        if (this.ab) {
            intent2.setClass(this.h, StateIndexActivity.class);
            intent2.putExtra("state_index_level_data", this.bl);
        } else {
            intent2.setClass(this.h, AthleticAbilityEmptyActivity.class);
            intent2.putExtra("athletic_ability_empty_flag", "state_no_record");
        }
        iov.d(this.h, intent2);
    }

    private void af() {
        boolean zK = Utils.k();
        if (zK || this.m != 258) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "requestRqData mIsOverseaBrowseMode ", Boolean.valueOf(zK));
            return;
        }
        n();
        int iA = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        new jyd().c(this.h, iA, iA, 0, (IBaseResponseCallback) new g(this));
        uwf.d().c(new h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        RunningLevelCurrentData runningLevelCurrentData = this.bl.getRunningLevelCurrentData();
        if (runningLevelCurrentData == null || runningLevelCurrentData.getLastCurrentRunLevel() <= 0.0f) {
            LogUtil.e("Track_SportHistoryListFragment", "userRunLevelData == null or lastCurrentRunLevel <= 0");
            return;
        }
        this.bh = runningLevelCurrentData.getLastCurrentRunLevel();
        aw();
        this.bm = UnitUtil.e(UnitUtil.d(runningLevelCurrentData.getLastCurrentRunLevel(), 1), 1, 1);
        this.bv = UnitUtil.e(UnitUtil.d(runningLevelCurrentData.getLastCondition(), 1), 1, 1);
        this.bu = wka.g(runningLevelCurrentData.getLastCondition());
        this.bw = wka.f(runningLevelCurrentData.getLastCondition());
    }

    private void aw() {
        if (this.w == 0) {
            this.bd = wka.i(this.bh);
            this.be = wka.c(this.bh);
        } else {
            this.bd = wka.b(this.bh);
            this.be = wka.e(this.bh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ba() {
        this.cf = wka.c(vds.a(this.w, this.f28307c), this.ck);
    }

    private void n() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005);
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006);
        this.w = CommonUtil.e(accountInfo, 0);
        int iE = CommonUtil.e(accountInfo2, 0);
        this.f28307c = iE != 0 ? (DateFormatUtil.a(System.currentTimeMillis()) - iE) / 10000 : 0;
    }

    public void d(int i2, int i3) {
        if (i2 == this.w && i3 == this.f28307c) {
            return;
        }
        this.w = i2;
        this.f28307c = i3;
        aw();
        ba();
        am();
    }

    static class c implements Observer {
        private final WeakReference<SportHistoryListFragment> d;

        c(SportHistoryListFragment sportHistoryListFragment) {
            this.d = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            SportHistoryListFragment sportHistoryListFragment = this.d.get();
            if (sportHistoryListFragment == null || sportHistoryListFragment.isDetached() || sportHistoryListFragment.isRemoving() || !sportHistoryListFragment.isAdded()) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "InnerObserver notify fragment ", sportHistoryListFragment);
            } else {
                LogUtil.a("Track_SportHistoryListFragment", "InnerObserver notify label ", str, " objects ", objArr);
                sportHistoryListFragment.e(true);
            }
        }
    }

    static class g implements IBaseResponseCallback {
        private WeakReference<SportHistoryListFragment> d;

        g(SportHistoryListFragment sportHistoryListFragment) {
            this.d = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            SportHistoryListFragment sportHistoryListFragment = this.d.get();
            if (sportHistoryListFragment != null && i == 200 && (obj instanceof GetRunLevelRsp)) {
                sportHistoryListFragment.bl = wka.c((GetRunLevelRsp) obj);
                sportHistoryListFragment.y();
                sportHistoryListFragment.cb.sendEmptyMessage(11);
            }
        }
    }

    static class h implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SportHistoryListFragment> f28319b;

        h(SportHistoryListFragment sportHistoryListFragment) {
            this.f28319b = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            SportHistoryListFragment sportHistoryListFragment = this.f28319b.get();
            if (sportHistoryListFragment != null && i == 0 && (obj instanceof Vo2maxDetail)) {
                Vo2maxDetail vo2maxDetail = (Vo2maxDetail) obj;
                sportHistoryListFragment.ck = vo2maxDetail.getVo2maxValue();
                sportHistoryListFragment.cc = vo2maxDetail.getTimestamp();
                sportHistoryListFragment.cd = sportHistoryListFragment.h.getString(R.string.IDS_hwh_health_vo2max_unit);
                sportHistoryListFragment.ba();
                sportHistoryListFragment.cb.sendEmptyMessage(11);
            }
        }
    }

    public HealthSpinner b() {
        return this.x;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1001 && intent != null) {
            d(intent.getIntExtra("KEY_RUNNING_GENDER", 1), intent.getIntExtra("KEY_RUNNING_AGE", 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        LogUtil.a("Track_SportHistoryListFragment", "startLoadingImage");
        this.am.setVisibility(0);
    }

    private void d(long j2) {
        this.cb.sendEmptyMessageDelayed(111, j2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Handler handler = this.cb;
        if (handler == null || this.ag) {
            return;
        }
        handler.sendEmptyMessage(112);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a("Track_SportHistoryListFragment", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        at();
        LogUtil.a("Track_SportHistoryListFragment", "onStop");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        LogUtil.a("Track_SportHistoryListFragment", "stopLoadingImage");
        RelativeLayout relativeLayout = this.am;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        ad();
    }

    private void ad() {
        IBaseResponseCallback iBaseResponseCallback = this.ca;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("Track_SportHistoryListFragment", "onDestroy");
        super.onDestroy();
        ax();
        ObserverManagerUtil.c(this.at);
        LocalBroadcastManager.getInstance().unregisterReceiver(this.g);
        LocalBroadcastManager.getInstance().unregisterReceiver(this.i);
        ExpandableListView expandableListView = this.bo;
        if (expandableListView != null) {
            expandableListView.setOnGroupClickListener(null);
            this.bo.setOnChildClickListener(null);
            this.bo.setOnItemLongClickListener(null);
            this.bo = null;
        }
    }

    private void r() {
        LogUtil.a("Track_SportHistoryListFragment", "initThread");
        this.v = HandlerCenter.b(new j(this), "TrackSportHistoryFragThread");
        this.cb = new s(this);
    }

    private void ax() {
        LogUtil.a("Track_SportHistoryListFragment", "stopThread");
        this.v.quit(false);
    }

    public void c(int i2) {
        this.m = i2;
        ReleaseLogUtil.d("Track_SportHistoryListFragment", "changeSportType mPreSportType:", Integer.valueOf(this.av), " mCurSportType", Integer.valueOf(i2), " getIsSubShow() ", Boolean.valueOf(e()), " mCurSubSportType ", Integer.valueOf(this.k));
        int i3 = this.av;
        int i4 = this.m;
        if (i3 != i4) {
            if (i3 == 10001 && e() && this.al) {
                c(false);
            }
            this.av = this.m;
            if (getActivity() instanceof SportHistoryActivity) {
                ((SportHistoryActivity) getActivity()).e(i2);
            }
            ab();
            ae();
            int i5 = this.m;
            if (i5 != 0) {
                this.ba = g(i5);
                return;
            }
            return;
        }
        if (i4 == 10001 && e() && this.k != 0) {
            FragmentActivity activity = getActivity();
            if (activity instanceof SportHistoryActivity) {
                ((SportHistoryActivity) activity).d(0);
            }
        }
    }

    private void h(int i2) {
        this.bj = i2;
        if (this.au != i2) {
            this.au = i2;
            ab();
            ae();
        }
    }

    private void ab() {
        j();
        long jK = k();
        long jB = b(jK);
        int i2 = this.aw;
        if (i2 != 0) {
            a(this.m, i2, jK, jB);
            return;
        }
        b(this.m, jK, jB);
        a(jK, jB);
        c(jK, jB);
    }

    private long k() {
        if (this.bj > this.bz) {
            return 0L;
        }
        return lsl.b(System.currentTimeMillis(), this.bj - this.bz);
    }

    private long b(long j2) {
        return this.bj >= this.bz ? lsl.b(System.currentTimeMillis()) : lsl.d(j2);
    }

    private void c(final long j2, final long j3) {
        ExtendHandler extendHandler = this.v;
        if (extendHandler != null) {
            extendHandler.postTask(new Runnable() { // from class: vqg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(j2, j3);
                }
            });
        }
    }

    public /* synthetic */ void d(long j2, long j3) {
        vrh vrhVar;
        if (this.m == 258) {
            af();
        }
        if (this.m == 259 && (vrhVar = this.y) != null) {
            vrhVar.e();
        }
        wui.d(j2, j3, this.m, this.bj, this.cb, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.m != 286) {
            return;
        }
        final long jK = k();
        final long jB = b(jK);
        ExtendHandler extendHandler = this.v;
        if (extendHandler != null) {
            extendHandler.postTask(new Runnable() { // from class: vpo
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(jK, jB);
                }
            }, 100L);
        }
    }

    public /* synthetic */ void e(long j2, long j3) {
        wui.d(j2, j3, this.m, this.bj, this.cb, 13);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        this.ca = iBaseResponseCallback;
    }

    public void e(int i2) {
        this.k = i2;
        LogUtil.a("Track_SportHistoryListFragment", "changeSubSportType mPreSportType:", Integer.valueOf(this.av));
        if (this.aw == this.k) {
            return;
        }
        j();
        this.aw = this.k;
        long jB = this.bj > this.bz ? 0L : lsl.b(System.currentTimeMillis(), this.bj - this.bz);
        a(this.m, i2, jB, this.bj >= this.bz ? lsl.b(System.currentTimeMillis()) : lsl.d(jB));
    }

    public void b(int i2) {
        this.k = i2;
        LogUtil.a("Track_SportHistoryListFragment", "updateSubSportType mPreSportType:", Integer.valueOf(this.av));
        int i3 = this.aw;
        int i4 = this.k;
        if (i3 == i4) {
            return;
        }
        this.aw = i4;
    }

    private void ae() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: vqh
            @Override // java.lang.Runnable
            public final void run() {
                this.f51452a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        LogUtil.a("Track_SportHistoryListFragment", "requestYearData()");
        long jB = this.bj > this.bz ? 0L : lsl.b(System.currentTimeMillis(), this.bj - this.bz);
        long jD = this.bj >= this.bz ? lsl.d(System.currentTimeMillis()) : lsl.d(jB);
        this.cj.clear();
        this.br.d(this.m, jB, jD, this.bc);
    }

    private void b(int i2, long j2, long j3) {
        LogUtil.a("Track_SportHistoryListFragment", "requestMonthData");
        this.br.c(i2, 0, j2, j3, e(), this.ao);
    }

    private void a(int i2, int i3, long j2, long j3) {
        LogUtil.a("Track_SportHistoryListFragment", "requestSubMonthData");
        this.br.c(i2, i3, j2, j3, e(), this.ao);
        a(j2, j3);
    }

    public void b(long j2, long j3) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    if (SportHistoryListFragment.this.by.size() == 0) {
                        SportHistoryListFragment.this.ag();
                        SportHistoryListFragment.this.at();
                    }
                }
            });
            LogUtil.a("Track_SportHistoryListFragment", "refreshSportData get simply ");
            a(j2, j3);
            return;
        }
        ReleaseLogUtil.e("Track_SportHistoryListFragment", "refreshSportData is null,stop refresh");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2, long j3) {
        ntx ntxVarA = new ntx.d().b(j2).d(j3).c(this.m).e(this.k).a(15).a();
        this.br.a(ntxVarA, new k(ntxVarA, this));
    }

    private int c(List<vqu> list) {
        if (list == null || list.size() == 0) {
            return -1;
        }
        int iF = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iF += list.get(i2).f();
            if (iF >= 16) {
                return i2;
            }
        }
        return list.size() - 1;
    }

    static class j extends BaseHandlerCallback<SportHistoryListFragment> {
        public j(SportHistoryListFragment sportHistoryListFragment) {
            super(sportHistoryListFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(SportHistoryListFragment sportHistoryListFragment, Message message) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            int i = message.what;
            if (i == 3) {
                SportHistoryListFragment.a(message, sportHistoryListFragment, planApi);
                return true;
            }
            if (i == 10) {
                sportHistoryListFragment.a(message.getData());
                if (planApi == null) {
                    return true;
                }
                planApi.deletePlanExerciseRecord(String.valueOf(sportHistoryListFragment.o));
                return true;
            }
            if (i == 14) {
                LogUtil.a("Track_SportHistoryListFragment", "FOR MSG_DOWNLOAD_DEVICE_SOURCE ");
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByDeviceType(String.valueOf(message.obj));
                return true;
            }
            if (i == 201) {
                if (message.obj instanceof RelativeSportData) {
                    RelativeSportData relativeSportData = (RelativeSportData) message.obj;
                    jxh.a(relativeSportData.getStartTime(), relativeSportData.getEndTime(), sportHistoryListFragment.ay);
                }
                LogUtil.a("Track_SportHistoryListFragment", "FOR MSG_TRIATHLON_DETAIL_TRACK");
                return true;
            }
            if (i == 5) {
                sportHistoryListFragment.c(message);
                sportHistoryListFragment.av();
                return true;
            }
            if (i == 6) {
                sportHistoryListFragment.b(message);
                return true;
            }
            if (i != 7) {
                return false;
            }
            sportHistoryListFragment.a(message);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Message message, SportHistoryListFragment sportHistoryListFragment, PlanApi planApi) {
        if (sportHistoryListFragment == null || message == null) {
            return;
        }
        sportHistoryListFragment.d(message.arg1, sportHistoryListFragment.t, sportHistoryListFragment.o);
        sportHistoryListFragment.c(message, sportHistoryListFragment);
        sportHistoryListFragment.m();
        if (planApi != null) {
            planApi.deletePlanExerciseRecord(sportHistoryListFragment.t + "_" + sportHistoryListFragment.o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, long j2, long j3) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (!Utils.o()) {
            map.put("startTime", Long.valueOf(j2));
            map.put("endTime", Long.valueOf(j3));
        }
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i2));
        if (i2 != 10001) {
            map.put("trackType", Integer.valueOf(vrg.b(this.d, this.q, this.l)));
        }
        lmf.d().c(this.h, AnalyticsValue.BI_TRACK_SPORT_DELETE_SPORT_KEY.value(), map, 0);
    }

    private void c(Message message, SportHistoryListFragment sportHistoryListFragment) {
        if (message.arg1 == 512 && (message.obj instanceof Map)) {
            Map map = (Map) message.obj;
            for (Map.Entry entry : map.entrySet()) {
                Long[] lArr = (Long[]) map.get(entry.getKey());
                if (lArr == null || lArr.length < 2 || lArr[0] == null || lArr[1] == null) {
                    return;
                } else {
                    sportHistoryListFragment.d(((Integer) entry.getKey()).intValue(), lArr[0].longValue(), lArr[1].longValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        ObserverManagerUtil.e("observer_sport_list_data_change", new Object[0]);
    }

    static class s extends BaseHandler<SportHistoryListFragment> {
        s(SportHistoryListFragment sportHistoryListFragment) {
            super(sportHistoryListFragment);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SportHistoryListFragment sportHistoryListFragment, Message message) {
            int i = message.what;
            if (i == 1) {
                e(sportHistoryListFragment, message);
                return;
            }
            if (i == 2) {
                LogUtil.a("Track_SportHistoryListFragment", "MSG_SHOW_DETAIL_TRACK");
                b(sportHistoryListFragment, message);
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    LogUtil.a("Track_SportHistoryListFragment", "MSG_REFRESH_VIEW_AFTER_INSERT");
                    sportHistoryListFragment.b(message.obj);
                    return;
                }
                if (i == 9) {
                    LogUtil.a("Track_SportHistoryListFragment", "MSG_COPY_SIMPLIFY_DATA_TO_UI_DATA");
                    sportHistoryListFragment.c(message.obj);
                    return;
                }
                if (i != 10) {
                    if (i == 12) {
                        LogUtil.a("Track_SportHistoryListFragment", "MSG_COPY_MONTH_DATA_TO_UI_DATA");
                        sportHistoryListFragment.e(message.obj);
                        return;
                    }
                    if (i == 111) {
                        sportHistoryListFragment.ao();
                        sportHistoryListFragment.ag = false;
                        return;
                    } else {
                        if (i == 112) {
                            if (sportHistoryListFragment.ag) {
                                return;
                            }
                            sportHistoryListFragment.at();
                            if (sportHistoryListFragment.bo != null) {
                                sportHistoryListFragment.bo.setClickable(true);
                            }
                            sportHistoryListFragment.ag = true;
                            return;
                        }
                        d(sportHistoryListFragment, message);
                        return;
                    }
                }
            }
            c(sportHistoryListFragment, message);
        }

        private void d(SportHistoryListFragment sportHistoryListFragment, Message message) {
            int i = message.what;
            if (i == 8) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "MSG_REFRESH_YEAR_TITLE_DATA_TO_UI");
                sportHistoryListFragment.z();
                return;
            }
            if (i == 11) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "MSG_REFRESH_RQ_DATA_TO_UI");
                sportHistoryListFragment.am();
                return;
            }
            if (i == 13) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "MSG_REFRESH_GOLF_BRIEF_TO_UI");
                sportHistoryListFragment.d((List<vqp>) (message.obj != null ? (List) message.obj : null));
            } else if (i == 15) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "MSG_CHANGE_RECORD_NAME");
                sportHistoryListFragment.a(message.obj);
            } else {
                if (i != 16) {
                    return;
                }
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "MSG_ASSOCIATION_EVENT");
                sportHistoryListFragment.d(message.obj);
            }
        }

        private void c(SportHistoryListFragment sportHistoryListFragment, Message message) {
            LogUtil.a("Track_SportHistoryListFragment", "msg type = ", Integer.valueOf(message.what), message.what == 3 ? "MSG_DELETE_TRACK" : "MSG_DELETE_FITNESS_RECORD");
            sportHistoryListFragment.o();
            sportHistoryListFragment.c(message.arg1, sportHistoryListFragment.t, sportHistoryListFragment.o);
            sportHistoryListFragment.ai();
            sportHistoryListFragment.x();
        }

        private void e(SportHistoryListFragment sportHistoryListFragment, boolean z) {
            sportHistoryListFragment.f28306b.setVisibility(8);
            sportHistoryListFragment.cq.setVisibility(8);
            sportHistoryListFragment.an.setVisibility(8);
            if (z) {
                sportHistoryListFragment.cp.setVisibility(8);
            } else {
                sportHistoryListFragment.cp.setVisibility(0);
            }
            if (sportHistoryListFragment.m == 10001) {
                sportHistoryListFragment.u.setVisibility(0);
                sportHistoryListFragment.f28306b.setVisibility(0);
            } else {
                sportHistoryListFragment.u.setVisibility(8);
            }
            if (sportHistoryListFragment.m == 258) {
                sportHistoryListFragment.am();
            }
            if (sportHistoryListFragment.m == 259) {
                sportHistoryListFragment.y.c();
            }
            if (sportHistoryListFragment.m == 286) {
                e(sportHistoryListFragment);
            }
        }

        private void e(SportHistoryListFragment sportHistoryListFragment) {
            if (sportHistoryListFragment.z == null) {
                return;
            }
            sportHistoryListFragment.z.setVisibility(8);
        }

        private void e(SportHistoryListFragment sportHistoryListFragment, Message message) {
            if (message.arg1 == 10001 && message.arg2 == 137) {
                sportHistoryListFragment.al = true;
            }
            LogUtil.a("Track_SportHistoryListFragment", "MSG_SHOW_NO_DATA_LAYOUT");
            sportHistoryListFragment.ar.setVisibility(0);
            e(sportHistoryListFragment, false);
            sportHistoryListFragment.s.c();
            sportHistoryListFragment.at();
        }

        private void b(SportHistoryListFragment sportHistoryListFragment, Message message) {
            if (message == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "msg is null");
                return;
            }
            if (hasMessages(2)) {
                removeMessages(2);
            }
            if (!(message.obj instanceof l)) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "msg is not instance of ReadTrackDetailCallback");
                return;
            }
            l lVar = (l) message.obj;
            njd njdVarD = lVar.d();
            if (njdVarD == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "pathData is null");
                return;
            }
            ive.c().init(BaseApplication.getContext());
            MotionPathSimplify motionPathSimplifyC = njdVarD.c();
            Map mapB = lVar.b();
            ArrayList arrayList = new ArrayList(10);
            if (mapB != null) {
                int size = mapB.size();
                for (int i = 0; i < size; i++) {
                    if (mapB.get(Integer.valueOf(i)) != null) {
                        arrayList.add((jbv) mapB.get(Integer.valueOf(i)));
                    }
                }
            }
            ive.c().b(e(sportHistoryListFragment, njdVarD.b(), motionPathSimplifyC, arrayList), motionPathSimplifyC);
            lVar.e = null;
            lVar.f28322a = true;
            lVar.c().clear();
            lVar.b().clear();
            if (sportHistoryListFragment.j != null) {
                sportHistoryListFragment.j.setBackgroundColor(ContextCompat.getColor(com.huawei.haf.application.BaseApplication.b(), R.color.colorCardBg));
                sportHistoryListFragment.j = null;
            }
        }

        private Bundle e(SportHistoryListFragment sportHistoryListFragment, String str, MotionPathSimplify motionPathSimplify, List<jbv> list) {
            boolean zD;
            ive iveVarC = ive.c();
            if (motionPathSimplify.requestSportType() != 512) {
                list = Collections.EMPTY_LIST;
            }
            Bundle bundleC = iveVarC.c(str, motionPathSimplify, list, Boolean.FALSE.booleanValue(), Boolean.FALSE.booleanValue());
            if (motionPathSimplify.requestSportType() == 512) {
                return bundleC;
            }
            FragmentActivity activity = sportHistoryListFragment.getActivity();
            if (activity instanceof SportHistoryActivity) {
                zD = ((SportHistoryActivity) activity).d();
                LogUtil.d("Track_SportHistoryListFragment", "SportHistoryActivity ExitApp:", Boolean.valueOf(zD));
            } else {
                zD = false;
            }
            bundleC.putBoolean("ExitApp", zD);
            return bundleC;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        List list;
        try {
            list = njy.b(obj, vqu.class) ? (List) obj : null;
        } catch (ClassCastException e2) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "copyMonthDataToUiData ", e2.getMessage());
        }
        if (list == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "copyMonthDataToUiData sportHistoryExpandableGroupData is null");
            ag();
            return;
        }
        synchronized (f28305a) {
            CopyOnWriteArrayList<vqu> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.addAll(list);
            e(copyOnWriteArrayList);
        }
        g();
        l();
        p();
        if (this.d.size() == 0) {
            LogUtil.a("Track_SportHistoryListFragment", "mAllTypeGroupData data is null");
            ag();
        }
    }

    private void e(CopyOnWriteArrayList<vqu> copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        for (vqu vquVar : copyOnWriteArrayList) {
            Iterator<vqu> it = this.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    vqu next = it.next();
                    if (lsl.c(next.h(), vquVar.h())) {
                        next.b(vquVar.d());
                        break;
                    }
                } else {
                    arrayList.add(vquVar);
                    break;
                }
            }
        }
        this.d.addAll(arrayList);
    }

    private void g() {
        if (this.m != 0) {
            return;
        }
        if (this.d.size() == 0) {
            LogUtil.e("Track_SportHistoryListFragment", "mAllTypeGroupData data is null");
            return;
        }
        for (vqu vquVar : this.d) {
            if (vquVar == null) {
                LogUtil.e("Track_SportHistoryListFragment", "dealWithOnlySportType  groupData is null");
                return;
            }
            List<String> listC = vquVar.c();
            if (njy.e(listC)) {
                LogUtil.e("Track_SportHistoryListFragment", "allRequestString is null");
                return;
            }
            HashSet<Integer> hashSetC = vrg.c(listC);
            if (njy.b(hashSetC) && hashSetC.size() == 1) {
                c(vquVar, hashSetC);
            } else {
                vquVar.a(0);
            }
        }
    }

    private void c(vqu vquVar, HashSet<Integer> hashSet) {
        for (Integer num : hashSet) {
            if (num != null && !TextUtils.isEmpty(num.toString())) {
                vquVar.a(CommonUtils.j(num.toString()));
                return;
            }
        }
    }

    private void j() {
        this.d.clear();
        this.ci.b(0.0d);
        this.ci.c(0.0d);
        this.ci.a(0.0d);
        this.ci.d(0.0d);
        this.ci.e(0.0d);
        p();
    }

    private void p() {
        LogUtil.a("Track_SportHistoryListFragment", "informAdapter mIsFirst ", Boolean.valueOf(this.ah));
        if (this.ah && ActivityTransitionAnimator.c().a()) {
            return;
        }
        e(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.ah = false;
        if (z && njy.b(this.d)) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.bo.expandGroup(i2, false);
                this.d.get(i2).a(true);
            }
        }
        SportHistoryExpandableListAdapter sportHistoryExpandableListAdapter = this.s;
        if (sportHistoryExpandableListAdapter != null) {
            sportHistoryExpandableListAdapter.b(this.d, this.m);
            this.s.notifyDataSetChanged();
        }
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        List<vrb> list;
        try {
            list = njy.b(obj, vrb.class) ? (List) obj : null;
        } catch (ClassCastException e2) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "copySingleDataToUiData ", e2.getMessage());
        }
        if (list == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "copySingleDataToUiData tmp is null");
            ag();
            return;
        }
        LogUtil.a("Track_SportHistoryListFragment", "before->mInitExpandIndex:", Integer.valueOf(this.af));
        b(list);
        g();
        if (this.af == -2) {
            this.af = -1;
            p();
            return;
        }
        l();
        au();
        p();
        at();
        this.ae = false;
    }

    private void au() {
        if (this.d == null) {
            return;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (this.d.get(i2) != null) {
                if (this.d.get(i2).a()) {
                    i(i2);
                } else {
                    j(i2);
                }
            }
        }
        if (this.bo != null) {
            if (this.d.size() > 0) {
                this.bo.setVisibility(0);
                this.ar.setVisibility(8);
            } else {
                this.ar.setVisibility(0);
            }
        }
    }

    private void b(List<vrb> list) {
        if (list == null) {
            return;
        }
        TreeSet<Long> treeSet = new TreeSet<>();
        for (vrb vrbVar : list) {
            if (vrbVar != null && (vrbVar.n() == null || this.m != 0)) {
                long jP = lsl.p(vrbVar.w());
                treeSet.add(Long.valueOf(jP));
                if (a(jP)) {
                    vqu vquVar = new vqu(new vqn(new HashMap(), 0, jP));
                    vquVar.c(vrbVar);
                    this.d.add(vquVar);
                } else {
                    for (vqu vquVar2 : this.d) {
                        if (lsl.c(vquVar2.h(), jP)) {
                            vquVar2.c(vrbVar);
                            break;
                        }
                    }
                }
            }
        }
        d(treeSet);
    }

    private void d(TreeSet<Long> treeSet) {
        if (treeSet.size() < 2) {
            return;
        }
        for (Long l2 : treeSet) {
            if (!Objects.equals(l2, treeSet.first())) {
                for (vqu vquVar : this.d) {
                    if (lsl.c(vquVar.h(), l2.longValue())) {
                        vquVar.e(true);
                        break;
                    }
                }
            }
        }
    }

    private boolean a(long j2) {
        Iterator<vqu> it = this.d.iterator();
        while (it.hasNext()) {
            if (lsl.c(it.next().h(), j2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        LogUtil.a("Track_SportHistoryListFragment", "parseYearData");
        if (message == null) {
            LogUtil.a("Track_SportHistoryListFragment", "msg is null");
        } else if (message.obj instanceof Object[]) {
            d((Object[]) message.obj);
            LogUtil.a("Track_SportHistoryListFragment", "parseYearData update ui");
            bc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        Handler handler = this.cb;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(8);
            this.cb.removeMessages(8);
            this.cb.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.s == null) {
            return;
        }
        this.cp.setVisibility(0);
        this.f28306b.setVisibility(8);
        this.u.setVisibility(8);
        this.an.setVisibility(8);
        this.y.d();
        int i2 = this.m;
        if (i2 == 10001) {
            this.u.setVisibility(0);
            this.f28306b.setVisibility(0);
        } else if (i2 == 258) {
            am();
        } else if (i2 == 259) {
            this.y.c();
        } else {
            LogUtil.j("Track_SportHistoryListFragment", "refreshYearTitle() sportType = ", Integer.valueOf(i2));
        }
        if (njy.e(this.cj)) {
            this.cq.setVisibility(8);
        } else {
            this.cq.setVisibility(0);
            this.s.d(new ArrayList(this.cj), this.cq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<vqp> list) {
        if (this.m != 286 || njy.e(list) || this.bj < lsl.a()) {
            View view = this.z;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (this.z == null) {
            if (this.m != 286) {
                return;
            } else {
                this.z = this.aa.inflate();
            }
        }
        this.z.setVisibility(0);
        wui.a(this.h, list, this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        int i2 = this.m;
        if (i2 == 0 || RunningRouteUtils.a(i2)) {
            nkx.e().e(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        List<HiHealthData> list;
        Object obj;
        LogUtil.a("Track_SportHistoryListFragment", "parseMonthData");
        if (message == null) {
            LogUtil.a("Track_SportHistoryListFragment", "msg is null");
            return;
        }
        if (message.obj instanceof Object[]) {
            Object[] objArr = (Object[]) message.obj;
            HashMap map = new HashMap();
            List<FitnessTrackRecord> list2 = null;
            try {
                Object obj2 = objArr[0];
                list = (obj2 == null || !njy.b(obj2, HiHealthData.class)) ? null : (List) objArr[0];
                try {
                    Object obj3 = objArr[1];
                    if (obj3 != null && njy.b(obj3, FitnessTrackRecord.class)) {
                        list2 = (List) objArr[1];
                    }
                    if (objArr.length > 2 && (obj = objArr[2]) != null && (obj instanceof Map) && !((Map) obj).isEmpty()) {
                        a(objArr[2], map);
                    }
                } catch (ClassCastException e2) {
                    e = e2;
                    ReleaseLogUtil.e("Track_SportHistoryListFragment", "MSG_DEAL_MONTH_DATA ", e.getMessage());
                }
            } catch (ClassCastException e3) {
                e = e3;
                list = null;
            }
            if (list == null && list2 == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "data is null");
                return;
            }
            this.by.clear();
            ArrayList arrayList = new ArrayList(10);
            ArrayList arrayList2 = new ArrayList(10);
            d(list, arrayList, map);
            a(list2, arrayList2);
            Iterator<vqn> it = vrg.b(arrayList, arrayList2).iterator();
            while (it.hasNext()) {
                this.by.add(new vqu(it.next()));
            }
            if (this.by.size() == 0) {
                LogUtil.a("Track_SportHistoryListFragment", "parseMonthData mAllTypeGroupData is null");
                ag();
            } else {
                aa();
            }
        }
    }

    private void a(Object obj, Map<Long, Double> map) {
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            long jP = lsl.p(((Long) entry.getKey()).longValue());
            if (map.containsKey(Long.valueOf(jP))) {
                map.put(Long.valueOf(jP), Double.valueOf(Math.max(((Double) entry.getValue()).doubleValue(), map.get(Long.valueOf(jP)).doubleValue())));
            } else {
                map.put(Long.valueOf(jP), (Double) entry.getValue());
            }
        }
    }

    private void aa() {
        this.af = c(this.by);
        Handler handler = this.cb;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(12);
            messageObtainMessage.obj = this.by;
            this.cb.sendMessage(messageObtainMessage);
        }
    }

    private void d(List<HiHealthData> list, List<vqn> list2, Map<Long, Double> map) {
        if (njy.e(list)) {
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            b(list2, it.next(), map);
        }
    }

    private void b(List<vqn> list, HiHealthData hiHealthData, Map<Long, Double> map) {
        Map<String, Double> map2 = new HashMap<>();
        long jP = lsl.p(hiHealthData.getStartTime());
        int iE = 0;
        if (njy.b(list)) {
            Iterator<vqn> it = list.iterator();
            while (it.hasNext()) {
                vqn next = it.next();
                if (jP == next.c()) {
                    map2 = next.a();
                    iE = next.e();
                    it.remove();
                }
            }
        }
        try {
            list.add(new vqn(map2, a(hiHealthData, map, iE, map2, jP), jP));
        } catch (NumberFormatException e2) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", e2.getMessage());
        }
    }

    private int a(HiHealthData hiHealthData, Map<Long, Double> map, int i2, Map<String, Double> map2, long j2) {
        int i3;
        int i4 = hiHealthData.getInt("hihealth_type");
        String[] strArrE = jqq.e(this.h, this.m);
        if (this.m == 0) {
            d(hiHealthData, map2);
        }
        if (this.m == 286) {
            if (i4 == 30001) {
                strArrE = jqq.e(this.h, HeartRateThresholdConfig.HEART_RATE_LIMIT);
                i4 = 220;
            }
            i3 = i2 + ((int) hiHealthData.getDouble("Track_" + i4 + 5));
        } else {
            i3 = i2;
        }
        if (this.m == 217) {
            if (i4 == 30001) {
                i4 = 217;
            }
            strArrE = jqq.e(this.h, i4);
            i3 += (int) hiHealthData.getDouble("Track_" + i4 + 5);
        }
        int i5 = this.m;
        if (i5 == 0 && i4 == 30001) {
            e(hiHealthData, map2);
            int i6 = (int) hiHealthData.getDouble("Track_Count_Sum");
            map2.put("Track_Count_Sum", Double.valueOf(i6));
            i3 = i6;
        } else if (i5 != 0 && i5 != 286 && i5 != 217 && i4 != 288 && i4 != 289) {
            i3 = (int) hiHealthData.getDouble("Track_" + i4 + 5);
        }
        c(hiHealthData, map2, i4, strArrE);
        if (i4 != 287 && i4 != 291) {
            return i3;
        }
        int i7 = (int) hiHealthData.getDouble("Track_2875");
        a(map, map2, j2);
        return i7;
    }

    private void a(Map<Long, Double> map, Map<String, Double> map2, long j2) {
        map2.remove("Track_29122");
        if (map == null || !map.containsKey(Long.valueOf(j2))) {
            return;
        }
        map2.put("Track_28722", map.get(Long.valueOf(j2)));
    }

    private void d(HiHealthData hiHealthData, Map<String, Double> map) {
        double d2 = hiHealthData.getDouble("Track_Duration_Sum");
        double d3 = hiHealthData.getDouble("Track_Count_Sum");
        double d4 = hiHealthData.getDouble("Track_Calorie_Sum");
        if (map.containsKey("Track_Duration_Sum")) {
            map.put("Track_Duration_Sum", Double.valueOf(map.get("Track_Duration_Sum").doubleValue() + d2));
            return;
        }
        if (map.containsKey("Track_Count_Sum")) {
            map.put("Track_Count_Sum", Double.valueOf(map.get("Track_Count_Sum").doubleValue() + d3));
        } else {
            if (!map.containsKey("Track_Calorie_Sum")) {
                map.put("Track_Duration_Sum", Double.valueOf(d2));
                map.put("Track_Count_Sum", Double.valueOf(d3));
                map.put("Track_Calorie_Sum", Double.valueOf(d4));
                return;
            }
            map.put("Track_Calorie_Sum", Double.valueOf(map.get("Track_Calorie_Sum").doubleValue() + d4));
        }
    }

    private void c(HiHealthData hiHealthData, Map<String, Double> map, int i2, String[] strArr) {
        String[] strArr2;
        if (i2 == 30001) {
            return;
        }
        int i3 = hiHealthData.getInt("hihealth_type");
        if (i2 == 288 || i2 == 289) {
            map.put("Track_" + i2 + 5, Double.valueOf(hiHealthData.getDouble("stat5")));
            map.put("Track_" + i2 + 4, Double.valueOf(hiHealthData.getDouble("stat4")));
            return;
        }
        if (this.m == 0 && (i3 == 287 || i3 == 291)) {
            strArr2 = new String[strArr.length + 2];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            System.arraycopy(new String[]{"Track_28721", "Track_28722"}, 0, strArr2, strArr.length, 2);
        } else {
            strArr2 = strArr;
        }
        for (String str : strArr2) {
            if (str != null && hiHealthData.getDouble(str) > 0.0d) {
                if (str.length() == 5) {
                    map.put("Track_" + ((i3 == 291 || nub.d(i3)) ? i3 : vrg.b(i2)) + str.charAt(4), Double.valueOf(hiHealthData.getDouble(str)));
                } else {
                    c(i3, hiHealthData, map, str);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private void c(int i2, HiHealthData hiHealthData, Map<String, Double> map, String str) {
        String strReplace;
        if (i2 == 291) {
            String strValueOf = String.valueOf(287);
            if (str.contains(strValueOf)) {
                strReplace = str.replace(strValueOf, String.valueOf(ComponentInfo.PluginPay_A_N));
            } else {
                strReplace = str;
            }
        } else {
            strReplace = str;
        }
        map.put(strReplace, Double.valueOf(hiHealthData.getDouble(str)));
    }

    private void e(HiHealthData hiHealthData, Map<String, Double> map) {
        for (String str : iwn.a(this.h).b()) {
            double d2 = hiHealthData.getDouble(str);
            if (hiHealthData.getDouble(str) > 0.0d) {
                map.put(str, Double.valueOf(d2));
            }
        }
    }

    private void b(Map<String, Double> map, long j2, double d2, int i2) {
        map.put("Track_100014", Double.valueOf(j2));
        map.put("Track_100013", Double.valueOf(d2));
        map.put("Track_100015", Double.valueOf(i2));
    }

    private void a(List<FitnessTrackRecord> list, List<vqn> list2) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "fitnessList is null");
            return;
        }
        for (FitnessTrackRecord fitnessTrackRecord : list) {
            try {
                long jAcquireMonthZeroTime = fitnessTrackRecord.acquireMonthZeroTime();
                long jAcquireSumExerciseTime = fitnessTrackRecord.acquireSumExerciseTime();
                int iAcquireSumExerciseTimes = fitnessTrackRecord.acquireSumExerciseTimes();
                double dAcquireSumCalorie = fitnessTrackRecord.acquireSumCalorie();
                HashMap map = new HashMap();
                b(map, jAcquireSumExerciseTime, dAcquireSumCalorie, iAcquireSumExerciseTimes);
                list2.add(new vqn(map, iAcquireSumExerciseTimes, lsl.p(jAcquireMonthZeroTime)));
            } catch (NumberFormatException e2) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        List list;
        LogUtil.a("Track_SportHistoryListFragment", "parseTrackSimplifyData");
        ntz ntzVarD = d(message);
        if (ntzVarD == null) {
            return;
        }
        Object[] objArrC = ntzVarD.c();
        List list2 = null;
        try {
            list = njy.b(objArrC[0], HiHealthData.class) ? (List) objArrC[0] : null;
            try {
                if (njy.b(objArrC[1], WorkoutRecord.class)) {
                    list2 = (List) objArrC[1];
                }
            } catch (ClassCastException e2) {
                e = e2;
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "parseTrackSimplifyData ", e.getMessage());
            }
        } catch (ClassCastException e3) {
            e = e3;
            list = null;
        }
        ArrayList arrayList = new ArrayList(10);
        vqz.c((List<HiHealthData>) list, arrayList);
        final List<vrb> listD = vrg.d(arrayList, list2, ntzVarD.d().c());
        String strD = DateFormatUtil.d(ntzVarD.d().a(), DateFormatUtil.DateFormatType.DATE_FORMAT_6);
        if (njy.e(listD)) {
            d(strD);
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "parseTrackSimplifyData datas size is 0");
            if (this.by.size() == 0) {
                ag();
                return;
            }
            return;
        }
        if (listD.size() < ntzVarD.d().c()) {
            d(strD);
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "parseTrackSimplifyData data requestMonth = ", strD, " loadingEnd");
        } else {
            LogUtil.a("Track_SportHistoryListFragment", "parseTrackSimplifyData data loading");
        }
        a(listD);
        Context context = this.h;
        ltx.c(context, this.ax, LoginInit.getInstance(context).getUsetId(), new StorageDataCallback() { // from class: vpx
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public final void onProcessed(StorageResult storageResult) {
                this.d.a(listD, storageResult);
            }
        });
    }

    public /* synthetic */ void a(List list, StorageResult storageResult) {
        e((List<vrb>) list);
    }

    private void a(List<vrb> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.a("Track_SportHistoryListFragment", "sportHistorySingleData is empty");
            return;
        }
        if (!btw.g()) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "not support new ai fitness plan, return");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (vrb vrbVar : list) {
            if (DateUtils.isToday(vrbVar.m())) {
                arrayList.add(new ntn(vrbVar.w(), vrbVar.m()));
            }
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.a("Track_SportHistoryListFragment", "getCoursePlanId, getCurrentPlan : planApi is null.");
        } else {
            planApi.checkSportRecordOutPlanPunch(new a(list), arrayList);
        }
    }

    static final class a extends UiCallback<List<ntn>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<vrb> f28315c;
        private final WeakReference<SportHistoryListFragment> e;

        private a(SportHistoryListFragment sportHistoryListFragment, List<vrb> list) {
            this.e = new WeakReference<>(sportHistoryListFragment);
            this.f28315c = list;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Track_SportHistoryListFragment", "errorCode, ", Integer.valueOf(i), " errorInfo, ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<ntn> list) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "checkSportRecordOutPlanPunch data is ", ies.c(list));
            SportHistoryListFragment sportHistoryListFragment = this.e.get();
            if (sportHistoryListFragment == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "activity is null, return");
                return;
            }
            if (njy.e(list)) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "data is empty");
                return;
            }
            int iC = 0;
            int iY = 0;
            for (vrb vrbVar : this.f28315c) {
                Iterator<ntn> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().c(vrbVar.w(), vrbVar.m())) {
                        iC = (int) (iC + vrbVar.c());
                        if (iY != 0) {
                            break;
                        }
                        iY = vrbVar.y();
                        break;
                    }
                }
            }
            sportHistoryListFragment.a(iC, list, iY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2, final List<ntn> list, final int i3) {
        final FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e("Track_SportHistoryListFragment", "activity is null, return");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: vqk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51462b.e(i2, i3, list, activity);
                }
            });
        }
    }

    public /* synthetic */ void e(int i2, final int i3, List list, Activity activity) {
        ReleaseLogUtil.d("Track_SportHistoryListFragment", "showAiFitnessPlanEnergyReplacementDialog calorie:", Integer.valueOf(i2), " sportType:", Integer.valueOf(i3), " timeRangeList size:", Integer.valueOf(list.size()));
        b(i3, 0);
        View viewInflate = View.inflate(BaseApplication.getContext(), R.layout.ai_fitness_plan_dialog, null);
        AiFitnessPlanEnergyReplacementCard aiFitnessPlanEnergyReplacementCard = (AiFitnessPlanEnergyReplacementCard) viewInflate.findViewById(R.id.ai_fitness_plan_energy_replace_layout);
        aiFitnessPlanEnergyReplacementCard.setCalorieConsumption(i2);
        aiFitnessPlanEnergyReplacementCard.setJumpBtnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportHistoryListFragment.this.b(i3, 1);
                btw.a(9, 1, 1, 1);
                btq.e().e("PLAN_UPDATE");
                hbz.c().e("SP" + i3);
                PluginSuggestion.getInstance().jumpToPlanTab();
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(activity);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        builder.b(viewInflate, 0, 0);
        builder.b(false);
        builder.d().show();
        btw.b(activity, (List<ntn>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2, int i3) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i2 == 0) {
            map.put(BleConstants.SPORT_TYPE, "SP10001");
        } else {
            map.put(BleConstants.SPORT_TYPE, "SP" + i2);
        }
        map.put("from", 2);
        map.put("event", Integer.valueOf(i3));
        idy.b(AnalyticsValue.INT_PLAN_1120055.value(), map);
    }

    private void d(String str) {
        if (njy.e(this.d)) {
            return;
        }
        for (vqu vquVar : this.d) {
            if (vquVar.d() != null && DateFormatUtil.d(vquVar.d().c(), DateFormatUtil.DateFormatType.DATE_FORMAT_6).equals(str)) {
                vquVar.e(true);
                return;
            }
        }
    }

    private ntz d(Message message) {
        if (!(message.obj instanceof ntz)) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "getValidSportRecordResponseModel failed message.obj error.");
            return null;
        }
        ntz ntzVar = (ntz) message.obj;
        if (ntzVar.c() == null || ntzVar.c().length < 2) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "getValidSportRecordResponseModel failed with data error.");
            return null;
        }
        if (ntzVar.d() != null && ntzVar.d().f() == this.m && ntzVar.d().i() == this.k) {
            return ntzVar;
        }
        ReleaseLogUtil.e("Track_SportHistoryListFragment", "getValidSportRecordResponseModel failed. responseModel:", ntzVar.d(), " mCurSportType:", Integer.valueOf(this.m), " mCurSubSportType:", Integer.valueOf(this.k));
        return null;
    }

    private void e(List<vrb> list) {
        if (this.ax.size() != 0) {
            for (vrb vrbVar : list) {
                if (vrbVar != null && this.ax.containsKey(Long.valueOf(vrbVar.w()))) {
                    vrbVar.e(true);
                    LogUtil.a("Track_SportHistoryListFragment", "copyDataToUi historySingleData setIsNewNotifyTrack(true)");
                }
            }
        }
        g();
        Handler handler = this.cb;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(9);
            messageObtainMessage.obj = list;
            this.cb.sendMessage(messageObtainMessage);
        }
    }

    private void l() {
        SportHistoryExpandableListAdapter sportHistoryExpandableListAdapter = this.s;
        if (sportHistoryExpandableListAdapter == null) {
            LogUtil.a("Track_SportHistoryListFragment", "expandOrCollapseGroup mExpandableListAdapter is null");
            return;
        }
        if (this.af > sportHistoryExpandableListAdapter.getGroupCount()) {
            this.af = this.s.getGroupCount() - 1;
        }
        if (this.af != -1) {
            for (int i2 = 0; i2 <= this.af; i2++) {
                i(i2);
            }
            this.af = -1;
            return;
        }
        int i3 = this.ap;
        if (i3 != -1 && i3 < this.d.size()) {
            i(this.ap);
            this.ap = -1;
        }
    }

    private void ar() {
        LogUtil.a("Track_SportHistoryListFragment", "setTouchListener");
        this.bo.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.9
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i2, long j2) {
                return SportHistoryListFragment.this.c(view, i2);
            }
        });
        h();
        w();
        this.f.setOnClickListener(new View.OnClickListener() { // from class: vpt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.i(view);
            }
        });
        this.bo.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment$$ExternalSyntheticLambda2
            @Override // android.widget.ExpandableListView.OnGroupCollapseListener
            public final void onGroupCollapse(int i2) {
                this.e.a(i2);
            }
        });
        this.bo.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment$$ExternalSyntheticLambda3
            @Override // android.widget.ExpandableListView.OnGroupExpandListener
            public final void onGroupExpand(int i2) {
                this.f28308b.d(i2);
            }
        });
    }

    public /* synthetic */ void i(View view) {
        try {
            LogUtil.a("Track_SportHistoryListFragment", "jump to sport-run page");
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            intent.setData(Uri.parse("huaweischeme://healthapp/track?sportType=2&targetType=m&targetValue=5000"));
            iov.d(this.h, intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("Track_SportHistoryListFragment", e2.getMessage());
        }
    }

    /* synthetic */ void a(int i2) {
        lrd.c(this.bo, qre.f(R.string.accessibility_collapsed));
    }

    /* synthetic */ void d(int i2) {
        lrd.c(this.bo, qre.f(R.string.accessibility_expanded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(final View view, int i2) {
        if (view == null) {
            return true;
        }
        view.findViewById(R.id.month_history_title).setOnClickListener(new View.OnClickListener() { // from class: vqd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                view.findViewById(R.id.month_history_title).setOnClickListener(null);
            }
        });
        if (view.findViewById(R.id.month_history_title) != null) {
            view.findViewById(R.id.month_history_title).setOnClickListener(null);
        }
        if (this.ae) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "onGroupClick loading group dara,wait");
            return true;
        }
        if (njy.e(this.d, i2)) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "mAllTypeGroupData is out of bound");
            return true;
        }
        vqu vquVar = this.d.get(i2);
        if (vquVar == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "groupData is null");
            return true;
        }
        LogUtil.a("Track_SportHistoryListFragment", "groupPosition: ", Integer.valueOf(i2), " size: ", Integer.valueOf(vquVar.b()));
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (vquVar.b() > 0) {
            if (l(i2) && vquVar.a()) {
                LogUtil.a("Track_SportHistoryListFragment", "to search more");
                ah();
            }
            LogUtil.a("Track_SportHistoryListFragment", "Has load");
            if (vquVar.a()) {
                j(i2);
                view.findViewById(R.id.month_history_title).setVisibility(8);
                view.findViewById(R.id.history_father_layout).setBackground(this.h.getDrawable(R.drawable.history_father_item_close_bg));
                map.put("type", 1);
            } else {
                this.bn.e(vquVar.h());
                i(i2);
                if (this.m == 0) {
                    view.findViewById(R.id.month_history_title).setVisibility(0);
                }
                map.put("type", 0);
            }
            ac();
            lmf.d().c(getContext(), AnalyticsValue.MOTION_TRACK_1040020.value(), map, 0);
            return true;
        }
        e(i2, vquVar, map);
        return true;
    }

    private boolean l(int i2) {
        int i3 = i2 + 1;
        if (njy.e(this.d, i3)) {
            LogUtil.j("Track_SportHistoryListFragment", "mAllTypeGroupData is out of bound");
            return false;
        }
        vqu vquVar = this.d.get(i3);
        return vquVar.a() && vquVar.b() != vquVar.f();
    }

    private void ah() {
        a(0L, lsl.p(System.currentTimeMillis()) - 1);
    }

    private void e(int i2, vqu vquVar, Map<String, Object> map) {
        this.bn.e(vquVar.h());
        this.af = -1;
        b(vquVar.h(), lsl.b(vquVar.h()));
        this.ae = true;
        this.ap = i2;
        as();
        map.put("type", 0);
        lmf.d().c(this.h, AnalyticsValue.MOTION_TRACK_1040020.value(), map, 0);
    }

    private void h() {
        this.bo.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.8
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i2, int i3, long j2) {
                if (qrs.c(1200)) {
                    LogUtil.a("Track_SportHistoryListFragment", "isClickFast");
                    return false;
                }
                if (!jaa.h() && !izt.d(SportHistoryListFragment.this.h)) {
                    if (Utils.o()) {
                        qqu.c(SportHistoryListFragment.this.h, -1);
                    } else {
                        qqu.c(SportHistoryListFragment.this.h, 1);
                    }
                }
                SportHistoryListFragment.this.j(i2, i3);
                if (SportHistoryListFragment.this.e(i2, i3) && SportHistoryListFragment.this.q()) {
                    LogUtil.e("Track_SportHistoryListFragment", "not install google services");
                    if (CommonUtil.cb()) {
                        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(SportHistoryListFragment.this.h);
                        builder.a(SportHistoryListFragment.this.h.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.8.2
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                            }
                        });
                        builder.c().show();
                        return false;
                    }
                }
                if (njy.e(SportHistoryListFragment.this.d, i2) || i3 < 0) {
                    return false;
                }
                SportHistoryListFragment.this.a(i2, i3, view);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i2, int i3) {
        vrb vrbVarD;
        if (njy.e(this.d, i2) || this.d.get(i2) == null || (vrbVarD = this.d.get(i2).d(i3)) == null) {
            return true;
        }
        return vrbVarD.p() && vrbVarD.u() != 264;
    }

    private int a(int i2, int i3) {
        vrb vrbVarD;
        if (njy.e(this.d, i2) || this.d.get(i2) == null || (vrbVarD = this.d.get(i2).d(i3)) == null) {
            return 199;
        }
        return vrbVarD.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        jaa.d(this.h);
        if (jaa.b(this.h)) {
            return false;
        }
        if (jaa.a() != 2) {
            return !CommonUtil.bg() && Utils.o();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3, View view) {
        vrb vrbVarD;
        if (njy.e(this.d, i2) || this.d.get(i2) == null || (vrbVarD = this.d.get(i2).d(i3)) == null) {
            return;
        }
        if (vrbVarD.u() == 283 && vrbVarD.ai() == 5) {
            int iG = vrbVarD.g();
            LogUtil.a("Track_SportHistoryListFragment", "deviceType:", Integer.valueOf(iG));
            k(iG);
        }
        if (vrbVarD.r() == 1) {
            ivv.e(this.h, vrbVarD.q());
            return;
        }
        if (vrbVarD.u() == 286 || vrbVarD.u() == 220) {
            long jW = vrbVarD.w();
            long jM = vrbVarD.m();
            if (vrbVarD.ah()) {
                LogUtil.a("Track_SportHistoryListFragment", "historySingleData setIsNewNotifyTrack(false) remove");
                this.ax.remove(Long.valueOf(jW));
                vrbVarD.e(false);
            }
            ive.c().d(vrbVarD.u(), jW, jM);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hw_show_health_running_history_child_item_layout);
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(ContextCompat.getColor(com.huawei.haf.application.BaseApplication.b(), R.color.colorCardBg));
                return;
            }
            return;
        }
        e(view, vrbVarD);
    }

    private void e(View view, vrb vrbVar) {
        d(100L);
        this.bo.setClickable(false);
        this.cb.sendEmptyMessageDelayed(112, 5000L);
        this.cb.removeMessages(2);
        this.ay.f28322a = true;
        this.ay.e = null;
        this.ay.c().clear();
        this.ay.b().clear();
        long jW = vrbVar.w();
        long jM = vrbVar.m();
        if (vrbVar.ah()) {
            LogUtil.a("Track_SportHistoryListFragment", "historySingleData setIsNewNotifyTrack(false) remove");
            this.j = (ViewGroup) view.findViewById(R.id.hw_show_health_running_history_child_item_layout);
            this.ax.remove(Long.valueOf(jW));
            vrbVar.e(false);
        }
        jxh.a(jW, jM, this.ay);
        if (vrbVar.u() == 512) {
            this.cb.obtainMessage(2).obj = this.ay;
        }
        c(vrbVar);
    }

    private void k(int i2) {
        int i3 = this.p;
        this.p = i2;
        if (i3 == i2) {
            LogUtil.a("deviceType is same as last time", new Object[0]);
        } else {
            wvd.e(wvd.e(i2));
        }
    }

    private void c(vrb vrbVar) {
        if (vrbVar.x() != 7) {
            LogUtil.a("Track_SportHistoryListFragment", "recordBiClick track source do not need BiClick");
            return;
        }
        if (vrbVar.u() == 264) {
            HashMap map = new HashMap(1);
            map.put("click", 1);
            lmf.d().c(this.h, AnalyticsValue.HEALTH_SPORT_LOOK_TV_RUN_RECORD_2040088.value(), map, 0);
        }
        if (vrbVar.u() == 265) {
            HashMap map2 = new HashMap(1);
            map2.put("click", 1);
            lmf.d().c(this.h, AnalyticsValue.HEALTH_SPORT_LOOK_TV_BIKE_RECORD_2040090.value(), map2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i2, int i3) {
        ExtendHandler extendHandler;
        String strC = c(i2, i3);
        if (!CommonUtil.ab(BaseApplication.getContext()) || strC == null || (extendHandler = this.v) == null) {
            return;
        }
        extendHandler.removeMessages(14);
        Message messageObtain = Message.obtain();
        messageObtain.what = 14;
        messageObtain.obj = strC;
        this.v.sendMessage(messageObtain);
    }

    private String c(int i2, int i3) {
        String str;
        int iA = a(i2, i3);
        if (iA == 3 || iA == 4) {
            str = "SMART_BAND";
        } else {
            str = iA != 5 ? null : "SMART_WATCH";
        }
        LogUtil.a("Track_SportHistoryListFragment", "deviceType", str);
        return str;
    }

    private void w() {
        this.bo.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.10
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                vrb vrbVarD;
                if (ExpandableListView.getPackedPositionType(j2) != 1 || !(adapterView instanceof ExpandableListView)) {
                    ReleaseLogUtil.e("Track_SportHistoryListFragment", "ExpandableListView delete click is error");
                    return false;
                }
                long expandableListPosition = ((ExpandableListView) adapterView).getExpandableListPosition(i2);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                SportHistoryListFragment.this.q = packedPositionGroup;
                SportHistoryListFragment.this.l = packedPositionChild;
                if (SportHistoryListFragment.this.q < 0 || SportHistoryListFragment.this.l < 0 || (vrbVarD = ((vqu) SportHistoryListFragment.this.d.get(SportHistoryListFragment.this.q)).d(SportHistoryListFragment.this.l)) == null) {
                    return false;
                }
                boolean z = ((vqu) SportHistoryListFragment.this.d.get(SportHistoryListFragment.this.q)).b() - 1 == SportHistoryListFragment.this.l;
                boolean zAh = vrbVarD.ah();
                View viewFindViewById = view.findViewById(R.id.hw_show_health_running_history_child_item_layout);
                if (vrbVarD.n() != null) {
                    SportHistoryListFragment.this.b(z, viewFindViewById, zAh);
                    SportHistoryListFragment.this.a(z, viewFindViewById, zAh);
                } else if (vrbVarD.r() == 0) {
                    SportHistoryListFragment.this.d(z, viewFindViewById, zAh);
                    SportHistoryListFragment.this.a(z, viewFindViewById, zAh);
                } else if (vrbVarD.r() == 1) {
                    SportHistoryListFragment.this.e(z, viewFindViewById, zAh);
                    SportHistoryListFragment.this.a(z, viewFindViewById, zAh);
                } else {
                    LogUtil.a("Track_SportHistoryListFragment", "wrong long press");
                }
                LogUtil.a("Track_SportHistoryListFragment", "long click, groupPosition is ", Integer.valueOf(packedPositionGroup), ", childPosition is ", Integer.valueOf(packedPositionChild));
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, View view, boolean z2) {
        if (view == null || this.s == null) {
            LogUtil.j("Track_SportHistoryListFragment", "childView == ", view);
            return;
        }
        view.setClickable(!view.isClickable());
        if (view.isClickable()) {
            this.s.a(z, view, R.drawable.history_child_item_delete_bottom_check_bg, R.drawable.history_child_item_delete_normal_check_bg);
        } else if (z2) {
            this.s.a(z, view, R.drawable.history_child_item_bottom_check_bg, R.drawable.history_child_item_normal_check_bg);
        } else {
            this.s.a(z, view, R.drawable.history_child_item_bottom_bg, R.drawable.history_child_item_normal_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z, final View view, final boolean z2) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.b(R.string.IDS_hw_health_show_healthdata_triathlon_item_delete_tips).a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportHistoryListFragment", "it is positive");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vpv
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f51440b.d(z, view, z2, dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void d(boolean z, View view, boolean z2, DialogInterface dialogInterface) {
        a(z, view, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final boolean z, final View view, final boolean z2) {
        LogUtil.a("Track_SportHistoryListFragment", "showDeleteFitnessRecordDialog enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.a(getString(R.string.IDS_hw_health_show_healthdata_delete)).a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportHistoryListFragment", "it is positive");
                if (SportHistoryListFragment.this.q < 0 || SportHistoryListFragment.this.l < 0 || !SportHistoryListFragment.this.f()) {
                    return;
                }
                vrb vrbVarD = ((vqu) SportHistoryListFragment.this.d.get(SportHistoryListFragment.this.q)).d(SportHistoryListFragment.this.l);
                if (SportHistoryListFragment.this.v != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 10;
                    if (vrbVarD != null) {
                        messageObtain.arg1 = vrbVarD.q();
                        Bundle bundle = new Bundle();
                        bundle.putString("deleteWorkoutId", vrbVarD.z());
                        bundle.putLong("deleteExerciseTime", vrbVarD.m());
                        messageObtain.setData(bundle);
                        SportHistoryListFragment.this.o = vrbVarD.m();
                        long unused = SportHistoryListFragment.e = vrbVarD.m();
                    }
                    SportHistoryListFragment.this.v.sendMessage(messageObtain);
                }
                if (SportHistoryListFragment.this.cb != null) {
                    Message messageObtainMessage = SportHistoryListFragment.this.cb.obtainMessage(10);
                    if (vrbVarD != null) {
                        messageObtainMessage.arg1 = vrbVarD.q();
                    }
                    SportHistoryListFragment.this.cb.sendMessage(messageObtainMessage);
                }
            }
        }).d(getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportHistoryListFragment", "it is negative");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vqe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f51446a.c(z, view, z2, dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(boolean z, View view, boolean z2, DialogInterface dialogInterface) {
        a(z, view, z2);
    }

    private void as() {
        ExtendHandler extendHandler = this.v;
        if (extendHandler == null) {
            LogUtil.a("Track_SportHistoryListFragment", "mExtendHandler == null");
        } else {
            extendHandler.postTask(new Runnable() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.4
                @Override // java.lang.Runnable
                public void run() {
                    SportHistoryListFragment.this.ae = false;
                }
            }, 2000L);
        }
    }

    private void d(int i2, long j2, long j3) {
        LogUtil.a("Track_SportHistoryListFragment", "deleteSportHistoryDataFromData");
        if (this.n == null) {
            LogUtil.a("Track_SportHistoryListFragment", "deleteData ", "deleteDataResponseCallback == null");
            this.n = new b();
        }
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimeInterval(j2, j3);
        hiDataDeleteOption.setTypes(new int[]{30001});
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthData(hiDataDeleteOption, new e(this, i2, j2, j3));
    }

    static class e implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28316a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SportHistoryListFragment> f28317c;
        private final long d;
        private final int e;

        e(SportHistoryListFragment sportHistoryListFragment, int i, long j, long j2) {
            this.f28317c = new WeakReference<>(sportHistoryListFragment);
            this.e = i;
            this.d = j;
            this.f28316a = j2;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            SportHistoryListFragment sportHistoryListFragment = this.f28317c.get();
            if (sportHistoryListFragment == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "sportHistoryListFragment == null");
                return;
            }
            if (i == 0) {
                LogUtil.a("Track_SportHistoryListFragment", "deleteSportHistoryData delete successful");
                sportHistoryListFragment.n.a(0, null);
                sportHistoryListFragment.e(this.d, this.e);
                int i2 = this.e;
                if (i2 == 257 || i2 == 281) {
                    LogUtil.a("Track_SportHistoryListFragment", "walk removeCard: ", "movement");
                    ipi.a("movement", BaseApplication.getContext(), this.f28316a);
                }
                int i3 = this.e;
                if (i3 == 258 || i3 == 264) {
                    LogUtil.a("Track_SportHistoryListFragment", "run removeCard: ", "movement_run");
                    ipi.a("movement_run", BaseApplication.getContext(), this.f28316a);
                }
                sportHistoryListFragment.b(true);
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "deleteSportHistoryData delete failed ,type", Integer.valueOf(i));
            sportHistoryListFragment.n.a(100001, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j2, int i2) {
        HashMap map = new HashMap(2);
        map.put("startTime", Long.valueOf(j2));
        map.put("type", Integer.valueOf(i2));
        oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), String.valueOf(1), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        LogUtil.a("Track_SportHistoryListFragment", "deleteFitnessRecordDatabase");
        if (bundle == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "bundle recordApi is null.");
            return;
        }
        if (this.n == null) {
            LogUtil.a("Track_SportHistoryListFragment", "deleteData ", "deleteFitnessRecordDatabase == null");
            this.n = new b();
        }
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "deleteFitnessRecordDatabase recordApi is null.");
        } else {
            recordApi.deleteFitnessRecord(bundle.getString("deleteWorkoutId", ""), bundle.getLong("deleteExerciseTime"), this.n);
        }
    }

    private void m() {
        LogUtil.a("Track_SportHistoryListFragment", "deleteFitnessRecordDatabase");
        if (this.n == null) {
            LogUtil.a("Track_SportHistoryListFragment", "deleteData ", "deleteFitnessRecordDatabase == null");
            this.n = new b();
        }
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "deleteFitnessRecordDatabase recordApi is null.");
        } else {
            recordApi.deleteFitnessRecord(this.r, this.o, this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (njy.e(this.d, this.q)) {
            return;
        }
        vqu vquVar = this.d.get(this.q);
        if (vquVar.d(this.l) == null) {
            return;
        }
        a(vquVar);
        int iA = vquVar.a(this.l, this.m);
        LogUtil.a("Track_SportHistoryListFragment", "after delete size = ", Integer.valueOf(iA));
        if (iA == 0) {
            this.d.remove(this.q);
            if (this.d.size() == 0) {
                LogUtil.a("Track_SportHistoryListFragment", "after delete all data gone, no data");
                ag();
                return;
            }
        }
        g();
        p();
        if (iA == 0) {
            for (int i2 = this.q; i2 < this.d.size(); i2++) {
                if (this.d.get(i2).a()) {
                    i(i2);
                } else {
                    j(i2);
                }
            }
        }
    }

    private void a(vqu vquVar) {
        HashMap map = new HashMap();
        int iU = vquVar.d(this.l).u();
        int iB = vrg.b(iU);
        if (iU == 289 || iU == 288) {
            return;
        }
        if ((iU == 287 || iU == 291) && this.m != 0) {
            b(vquVar, map, iB);
            return;
        }
        d(vquVar, map, iB);
        i();
        bc();
    }

    private void d(vqu vquVar, Map<String, Double> map, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i2 == 10001) {
            str = "Track_" + i2 + 4;
            str2 = "Track_" + i2 + 3;
            str3 = "";
        } else {
            str = "Track_Duration_Sum";
            str2 = "Track_Calorie_Sum";
            str3 = "Track_Strokes_Sum";
        }
        map.put(str, Double.valueOf(this.ci.c() * 60000.0d));
        map.put(str2, Double.valueOf(this.ci.e() * 1000.0d));
        map.put(str3, Double.valueOf(this.ci.b()));
        if (vrg.b(vquVar.d(this.l), i2)) {
            str4 = "Track_" + i2 + 2;
        } else {
            str4 = "Track_Distance_Sum";
        }
        if (UnitUtil.f()) {
            map.put(str4, Double.valueOf(this.ci.d() / 6.21371204033494E-4d));
        } else {
            map.put(str4, Double.valueOf(this.ci.d() * 1000.0d));
        }
        vrg.c(vquVar.d(this.l), i2, map);
        vrc vrcVar = this.ci;
        vrcVar.a(vrcVar.a() - 1.0d);
        this.ci.d(a(map, str) / 60000.0d);
        this.ci.c(a(map, str2) / 1000.0d);
        this.ci.e(a(map, str3));
        if (UnitUtil.f()) {
            this.ci.b(a(map, str4) * 6.21371204033494E-4d);
        } else {
            this.ci.b(a(map, str4) / 1000.0d);
        }
    }

    private double a(Map<String, Double> map, String str) {
        if (map == null || !map.containsKey(str) || map.get(str) == null) {
            return 0.0d;
        }
        return map.get(str).doubleValue();
    }

    private void b(vqu vquVar, Map<String, Double> map, int i2) {
        final String str = "Track_" + i2 + 22;
        final String str2 = "Track_" + i2 + 21;
        final String str3 = "Track_" + i2 + 5;
        map.put(str, Double.valueOf(this.ci.d()));
        map.put(str2, Double.valueOf(this.ci.c()));
        map.put(str3, Double.valueOf(this.ci.a()));
        long jB = this.bj > this.bz ? 0L : lsl.b(System.currentTimeMillis(), this.bj - this.bz);
        vrg.b(vquVar.d(this.l), map, jB, this.bj >= this.bz ? lsl.y(System.currentTimeMillis()) : lsl.d(jB), 6, new IBaseResponseCallback() { // from class: vqi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.d.a(str2, str, str3, i3, obj);
            }
        });
    }

    public /* synthetic */ void a(String str, String str2, String str3, int i2, Object obj) {
        if (obj instanceof Map) {
            Map<String, Double> map = (Map) obj;
            this.ci.d(a(map, str));
            this.ci.b(a(map, str2));
            this.ci.a(a(map, str3) - 1.0d);
            i();
            bc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        if (this.q < 0 || this.l < 0) {
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "wrong delete position");
            return false;
        }
        if (this.d.size() != 0) {
            int size = this.d.size();
            int i2 = this.q;
            if (size > i2) {
                int iB = this.d.get(i2).b();
                if (iB != 0 && iB > this.l) {
                    return true;
                }
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "deleteSportHistoryDataFromView() childCount is empty or outIndexOf size = ", Integer.valueOf(iB), " childP = ", Integer.valueOf(this.l));
                return false;
            }
        }
        ReleaseLogUtil.e("Track_SportHistoryListFragment", "deleteSportHistoryDataFromView() mAllTypeGroupData is empty or outIndexOf size = ", Integer.valueOf(this.d.size()), " groupP = ", Integer.valueOf(this.q));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        Handler handler = this.cb;
        if (handler == null) {
            LogUtil.a("Track_SportHistoryListFragment", "mUpdateUiHandler == null");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage(1, this.m, this.k);
        this.cb.removeMessages(1);
        this.cb.sendMessage(messageObtainMessage);
    }

    static class b implements IBaseResponseCallback {
        private b() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                LogUtil.a("Track_SportHistoryListFragment", "delete successful");
                if (SportHistoryListFragment.e != -1) {
                    LogUtil.a("Track_SportHistoryListFragment", "fitness removeCard: ", Long.valueOf(SportHistoryListFragment.e));
                    ipi.a("fitness", BaseApplication.getContext(), SportHistoryListFragment.e);
                    long unused = SportHistoryListFragment.e = -1L;
                    return;
                }
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "delete failed");
        }
    }

    public boolean e() {
        return this.ak;
    }

    public void c(boolean z) {
        this.ak = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z, final View view, final boolean z2) {
        LogUtil.a("Track_SportHistoryListFragment", "showDeleteDialog ", "enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.a(getString(R.string.IDS_hw_health_show_healthdata_delete)).a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: vqf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f51449c.h(view2);
            }
        }).d(getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportHistoryListFragment", "it is negative");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: vqm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f51465a.a(z, view, z2, dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void h(View view) {
        int i2;
        vrb vrbVarD;
        LogUtil.a("Track_SportHistoryListFragment", "it is positive");
        if (!f() || (i2 = this.q) < 0 || this.l < 0 || (vrbVarD = this.d.get(i2).d(this.l)) == null) {
            return;
        }
        this.t = vrbVarD.w();
        this.o = vrbVarD.m();
        this.r = vrbVarD.ag();
        if (this.v != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.arg1 = vrbVarD.u();
            HashMap map = new HashMap(16);
            if (d(vrbVarD, map)) {
                return;
            }
            messageObtain.obj = map;
            this.v.sendMessage(messageObtain);
        }
        Handler handler = this.cb;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage(3);
        messageObtainMessage.arg1 = vrbVarD.u();
        if (vrbVarD.y() != 287) {
            this.cb.sendMessage(messageObtainMessage);
        } else {
            this.cb.sendMessageDelayed(messageObtainMessage, 100L);
        }
    }

    public /* synthetic */ void a(boolean z, View view, boolean z2, DialogInterface dialogInterface) {
        a(z, view, z2);
    }

    private boolean d(vrb vrbVar, Map<Integer, Long[]> map) {
        if (vrbVar.u() != 512) {
            return false;
        }
        List<RelativeSportData> listH = vrbVar.h();
        if (njy.e(listH)) {
            return true;
        }
        for (RelativeSportData relativeSportData : listH) {
            int sportType = relativeSportData.getSportType();
            map.put(Integer.valueOf(sportType), new Long[]{Long.valueOf(relativeSportData.getStartTime()), Long.valueOf(relativeSportData.getEndTime())});
        }
        return false;
    }

    static class d extends BroadcastReceiver {
        WeakReference<SportHistoryListFragment> d;

        d(SportHistoryListFragment sportHistoryListFragment) {
            this.d = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SportHistoryListFragment sportHistoryListFragment;
            WeakReference<SportHistoryListFragment> weakReference = this.d;
            if (weakReference == null || (sportHistoryListFragment = weakReference.get()) == null) {
                return;
            }
            if (intent == null || intent.getExtras() == null) {
                LogUtil.a("Track_SportHistoryListFragment", "mBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "onReceive: action = ", action);
            action.hashCode();
            if (action.equals("event_sport_record_association")) {
                sportHistoryListFragment.e(16, intent);
            } else if (action.equals("change_sport_record_name")) {
                sportHistoryListFragment.e(15, intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, Intent intent) {
        if (this.cb != null) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "sendMessageToHandler messageCode = ", Integer.valueOf(i2));
            this.cb.removeMessages(i2);
            Message messageObtainMessage = this.cb.obtainMessage(i2);
            messageObtainMessage.obj = intent;
            this.cb.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            long longExtra = intent.getLongExtra("startTime", 0L);
            long longExtra2 = intent.getLongExtra("endTime", 0L);
            String stringExtra = intent.getStringExtra("alias");
            int iE = e(lsl.p(longExtra));
            if (njy.e(this.d, iE)) {
                ReleaseLogUtil.a("Track_SportHistoryListFragment", "changeRecordName mAllTypeGroupData OutOfBounds");
                return;
            }
            vqu vquVar = this.d.get(iE);
            if (vquVar == null || vquVar.b() == 0) {
                LogUtil.a("Track_SportHistoryListFragment", "tempGroupData is null");
                return;
            }
            vrb vrbVarD = vquVar.d(longExtra, longExtra2);
            if (vrbVarD == null) {
                LogUtil.a("Track_SportHistoryListFragment", "HistorySingleData is null");
            } else {
                vrbVarD.d(stringExtra);
                p();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        if (obj == null || !(obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) obj;
        long longExtra = intent.getLongExtra("startTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        String stringExtra = intent.getStringExtra("alias");
        int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
        vqu vquVar = this.d.get(e(lsl.p(longExtra)));
        if (vquVar == null || vquVar.b() == 0) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "assiationUpdateUi tempGroupData is null");
            return;
        }
        vrb vrbVarD = vquVar.d(longExtra, longExtra2);
        if (vrbVarD == null) {
            ReleaseLogUtil.d("Track_SportHistoryListFragment", "assiationUpdateUi HistorySingleData is null");
            return;
        }
        ReleaseLogUtil.d("Track_SportHistoryListFragment", "enter assiationUpdateUi");
        vrbVarD.d(stringExtra);
        vrbVarD.b(intExtra);
        vrbVarD.d("alias", stringExtra);
        vrbVarD.d("targetDistance", intent.getStringExtra("targetDistance"));
        vrbVarD.d("competitionId", intent.getStringExtra("competitionId"));
        vrbVarD.d("competitionCategory", intent.getStringExtra("competitionCategory"));
        vrbVarD.d("targetTime", intent.getStringExtra("targetTime"));
        p();
    }

    static class f extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<SportHistoryListFragment> f28318b;

        f(SportHistoryListFragment sportHistoryListFragment) {
            this.f28318b = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SportHistoryListFragment sportHistoryListFragment;
            WeakReference<SportHistoryListFragment> weakReference = this.f28318b;
            if (weakReference == null || (sportHistoryListFragment = weakReference.get()) == null) {
                return;
            }
            if (intent == null || intent.getExtras() == null) {
                LogUtil.a("Track_SportHistoryListFragment", "mBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("Track_SportHistoryListFragment", "onReceive: action = ", action);
            SportHistoryListFragment.a(intent, sportHistoryListFragment, action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Intent intent, final SportHistoryListFragment sportHistoryListFragment, String str) {
        if ("input_sport_history_start_time".equals(str)) {
            if (sportHistoryListFragment.ai) {
                LogUtil.a("Track_SportHistoryListFragment", "inserting return");
                return;
            }
            ExtendHandler extendHandler = sportHistoryListFragment.v;
            if (extendHandler != null) {
                sportHistoryListFragment.ai = true;
                extendHandler.postTask(new Runnable() { // from class: vpw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.ai = false;
                    }
                }, 500L);
            }
            Handler handler = sportHistoryListFragment.cb;
            if (handler != null) {
                handler.removeMessages(4);
                Message messageObtainMessage = sportHistoryListFragment.cb.obtainMessage(4);
                messageObtainMessage.obj = intent;
                sportHistoryListFragment.cb.sendMessage(messageObtainMessage);
            }
            sportHistoryListFragment.b(false);
            sportHistoryListFragment.ai();
        }
    }

    private void b(Intent intent, vqt vqtVar) {
        int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
        int intExtra2 = intent.getIntExtra("chiefType", 0);
        if (intExtra2 == 0) {
            vqtVar.d(intent.getIntExtra("distance", 0), intExtra2);
        } else if (intExtra2 == 6) {
            String stringExtra = "";
            try {
                stringExtra = intent.getStringExtra("golfSwingCount");
                vqtVar.d(Integer.parseInt(stringExtra), intExtra2);
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("Track_SportHistoryListFragment", "Invalid golfSwingCount: " + stringExtra);
            }
            vqtVar.d(intent.getStringExtra("totalHandicap"));
        } else {
            vqtVar.d(intent.getIntExtra("calorie", 0), intExtra2);
        }
        if (intExtra == 260 || Math.abs(intent.getFloatExtra("pace", 0.0f)) <= 1.0E-6d) {
            vqtVar.d(0.0f);
        } else if (nub.e(intExtra)) {
            vqtVar.d((1.0f / intent.getFloatExtra("pace", 0.0f)) * 3600.0f);
        } else {
            vqtVar.d(intent.getFloatExtra("pace", 0.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        LogUtil.a("Track_SportHistoryListFragment", "dealInsertTrackData");
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            if (intent.getLongExtra("startTime", -1L) == -1) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "dealInsertTrackData intent is null or content wrong");
                return;
            }
            int intExtra = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
            int i2 = this.m;
            if (i2 == 0 || intExtra == i2 || (intExtra == 264 && i2 == 258)) {
                long longExtra = intent.getLongExtra("startTime", System.currentTimeMillis());
                if (this.bj == lsl.ad(longExtra) || this.bj == this.bz + 1) {
                    vqt vqtVar = new vqt();
                    b(intent, vqtVar);
                    vqtVar.c(longExtra);
                    vqtVar.b(intent.getLongExtra("endTime", System.currentTimeMillis()));
                    vqtVar.d(intent.getLongExtra("duration", 0L));
                    int intExtra2 = intent.getIntExtra("calorie", 0);
                    vqtVar.e(intExtra2);
                    vqtVar.h(intent.getIntExtra("trackType", 0));
                    vqtVar.c(intent.getIntExtra("deviceType", 32));
                    vqtVar.i(intExtra);
                    vqtVar.a(2);
                    vqtVar.c(false);
                    vrb vrbVar = new vrb(0, vqtVar);
                    int intExtra3 = intent.getIntExtra("distance", 0);
                    vqu vquVar = new vqu();
                    e(vqtVar, intExtra2, intExtra3);
                    a(vquVar, intExtra3, longExtra, intExtra2, vrbVar);
                    return;
                }
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "sportType is not suitable");
            return;
        }
        ReleaseLogUtil.e("Track_SportHistoryListFragment", "insertIntent not instanceof Intent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        SportHistoryActivity sportHistoryActivity = (SportHistoryActivity) getActivity();
        if (sportHistoryActivity == null) {
            ReleaseLogUtil.a("Track_SportHistoryListFragment", "sportHistoryActivity is null.");
            return;
        }
        sportHistoryActivity.h();
        if (z) {
            sportHistoryActivity.f();
        }
    }

    private void e(vqt vqtVar, int i2, int i3) {
        vrc vrcVar = this.ci;
        vrcVar.d(vrcVar.c() + ((vqtVar.j() * 1.0d) / 60000.0d));
        vrc vrcVar2 = this.ci;
        vrcVar2.a(vrcVar2.a() + 1.0d);
        vrc vrcVar3 = this.ci;
        vrcVar3.e(vrcVar3.b());
        vrc vrcVar4 = this.ci;
        vrcVar4.c(vrcVar4.e() + ((((double) i2) * 1.0d) / 1000.0d));
        if (UnitUtil.f()) {
            vrc vrcVar5 = this.ci;
            vrcVar5.b(vrcVar5.d() + (((double) i3) * 1.0d * 6.21371204033494E-4d));
        } else {
            vrc vrcVar6 = this.ci;
            vrcVar6.b(vrcVar6.d() + ((((double) i3) * 1.0d) / 1000.0d));
        }
        i();
        bc();
    }

    private void a(vqu vquVar, int i2, long j2, double d2, vrb vrbVar) {
        if (this.d.size() == 0) {
            d(vquVar, i2, j2, d2, vrbVar);
            return;
        }
        long jP = lsl.p(j2);
        int iE = e(jP);
        if (iE == this.d.size()) {
            LogUtil.a("Track_SportHistoryListFragment", "no that month, new and insert it at the last");
            vquVar.a(i2, lsl.p(j2), d2, vrbVar.u(), vrbVar.o());
            vquVar.c(vrbVar);
            this.d.add(vquVar);
        } else if (this.d.get(iE).h() == jP) {
            LogUtil.a("Track_SportHistoryListFragment", "insert track to an exsiting month");
            vqu vquVar2 = this.d.get(iE);
            if (vquVar2 == null || vquVar2.b() == 0) {
                b(lsl.p(jP), lsl.b(jP));
                return;
            }
            int iD = d(j2, vquVar2);
            if (iD == vquVar2.b()) {
                vquVar2.c(vrbVar);
            } else {
                vquVar2.a(iD, vrbVar);
            }
            vquVar2.a(i2, vquVar2.h(), d2, vrbVar.u(), vrbVar.o());
        } else {
            LogUtil.a("Track_SportHistoryListFragment", "no that month");
            vquVar.a(i2, lsl.p(j2), d2, vrbVar.u(), vrbVar.o());
            vquVar.c(vrbVar);
            this.d.add(iE, vquVar);
        }
        g();
        i(iE);
        while (true) {
            iE++;
            if (iE < this.d.size()) {
                if (this.d.get(iE).a()) {
                    i(iE);
                } else {
                    j(iE);
                }
            } else {
                p();
                return;
            }
        }
    }

    private void d(vqu vquVar, int i2, long j2, double d2, vrb vrbVar) {
        LogUtil.a("Track_SportHistoryListFragment", "before insert no data");
        vquVar.a(i2, lsl.p(j2), d2, vrbVar.u(), vrbVar.o());
        vquVar.c(vrbVar);
        this.d.add(vquVar);
        p();
        i(0);
        ExpandableListView expandableListView = this.bo;
        if (expandableListView != null) {
            expandableListView.setVisibility(0);
        }
        this.ar.setVisibility(8);
    }

    private int e(long j2) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (this.d.get(i2).h() <= j2) {
                return i2;
            }
        }
        return this.d.size();
    }

    private int d(long j2, vqu vquVar) {
        for (int i2 = 0; i2 < vquVar.b(); i2++) {
            if (vquVar.d(i2) != null && j2 > vquVar.d(i2).w()) {
                return i2;
            }
        }
        return vquVar.b();
    }

    private void i(int i2) {
        if (this.bo == null || !njy.c(this.d, i2)) {
            return;
        }
        this.bo.expandGroup(i2, false);
        this.d.get(i2).a(true);
    }

    private void j(int i2) {
        if (this.bo == null || i2 >= this.d.size() || i2 < 0) {
            return;
        }
        this.bo.collapseGroup(i2);
        this.d.get(i2).a(false);
    }

    private void d(Object[] objArr) {
        Object obj;
        if (this.m == 287) {
            try {
                Object obj2 = objArr[0];
                if (obj2 != null && njy.b(obj2, HiHealthData.class)) {
                    List<HiHealthData> list = (List) objArr[0];
                    if (njy.e(list)) {
                        return;
                    } else {
                        g(list);
                    }
                }
                if (objArr.length > 2 && (obj = objArr[2]) != null && (obj instanceof Map) && !((Map) obj).isEmpty()) {
                    for (Map.Entry entry : ((Map) objArr[2]).entrySet()) {
                        vrc vrcVar = this.ci;
                        vrcVar.b(Math.max(vrcVar.d(), ((Double) entry.getValue()).doubleValue()));
                    }
                }
            } catch (ClassCastException e2) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "MSG_DEAL_MONTH_DATA ", e2.getMessage());
            }
            i();
            return;
        }
        for (Object obj3 : objArr) {
            if (njy.b(obj3, HiHealthData.class)) {
                j((List<HiHealthData>) obj3);
            }
            if (njy.b(obj3, FitnessTrackRecord.class)) {
                f((List<FitnessTrackRecord>) obj3);
            }
        }
        bb();
        i();
    }

    private void g(List<HiHealthData> list) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                f2 += hiHealthData.getFloat(e("Track_Diving_Count", ""));
                f3 += hiHealthData.getFloat(e("Track_Diving_Duration_Sum", ""));
            }
        }
        this.ci.a(f2);
        this.ci.d(f3);
    }

    private void f(List<FitnessTrackRecord> list) {
        LogUtil.a("Track_SportHistoryListFragment", "fitnessTrackRecords size:", Integer.valueOf(list.size()));
        for (FitnessTrackRecord fitnessTrackRecord : list) {
            vrc vrcVar = this.ci;
            vrcVar.d(vrcVar.c() + fitnessTrackRecord.acquireSumExerciseTime());
            vrc vrcVar2 = this.ci;
            vrcVar2.a(vrcVar2.a() + ((double) fitnessTrackRecord.acquireSumExerciseTimes()));
            vrc vrcVar3 = this.ci;
            vrcVar3.c(vrcVar3.e() + ((double) fitnessTrackRecord.acquireSumCalorie()));
        }
    }

    private void j(List<HiHealthData> list) {
        int i2 = 0;
        double d2 = 0.0d;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData.containsKey("Track_Duration_Sum")) {
                vrc vrcVar = this.ci;
                vrcVar.d(vrcVar.c() + ((double) hiHealthData.getFloat("Track_Duration_Sum")));
            }
            if (hiHealthData.containsKey("Track_Count_Sum")) {
                vrc vrcVar2 = this.ci;
                vrcVar2.a(vrcVar2.a() + ((double) hiHealthData.getInt("Track_Count_Sum")));
            }
            if (hiHealthData.containsKey("Track_Calorie_Sum")) {
                vrc vrcVar3 = this.ci;
                vrcVar3.c(vrcVar3.e() + ((double) hiHealthData.getFloat("Track_Calorie_Sum")));
            }
            if (hiHealthData.containsKey("hihealth_type")) {
                vrc vrcVar4 = this.ci;
                vrcVar4.d(vrcVar4.c() + ((double) hiHealthData.getFloat(e("Duration_Sum", ""))));
                vrc vrcVar5 = this.ci;
                vrcVar5.a(vrcVar5.a() + ((double) hiHealthData.getInt(e("Count_Sum", "Abnormal_Count_Sum"))));
                vrc vrcVar6 = this.ci;
                vrcVar6.c(vrcVar6.e() + ((double) hiHealthData.getFloat(e("Calorie_Sum", ""))));
                vrc vrcVar7 = this.ci;
                vrcVar7.b(vrcVar7.d() + ((double) hiHealthData.getInt(e("Distance_Sum", ""))));
                vrc vrcVar8 = this.ci;
                vrcVar8.e(vrcVar8.b() + ((double) hiHealthData.getInt(e("Strokes_Sum_Course", ""))));
            }
            int i3 = hiHealthData.getInt("hihealth_type");
            d(hiHealthData, i3);
            if (i3 == 288 || i3 == 289) {
                i2 += hiHealthData.getInt("Track_Diving_Count");
                d2 += (double) hiHealthData.getInt("Track_Diving_Time_Sum");
            }
        }
        vrc vrcVar9 = this.ci;
        vrcVar9.a(vrcVar9.a() - ((double) i2));
        vrc vrcVar10 = this.ci;
        vrcVar10.d(vrcVar10.c() - d2);
    }

    private void d(HiHealthData hiHealthData, int i2) {
        if (i2 == 30001) {
            jry jryVarA = jry.a(BaseApplication.getContext());
            String[] strArrD = jryVarA.d(jryVarA.b(HeartRateThresholdConfig.HEART_RATE_LIMIT).getSportDataStatics());
            vrc vrcVar = this.ci;
            vrcVar.a(vrcVar.a() + ((double) hiHealthData.getInt(strArrD[0])));
            vrc vrcVar2 = this.ci;
            vrcVar2.d(vrcVar2.c() + ((double) hiHealthData.getFloat(strArrD[2])));
            vrc vrcVar3 = this.ci;
            vrcVar3.c(vrcVar3.e() + ((double) hiHealthData.getFloat(strArrD[3])));
            vrc vrcVar4 = this.ci;
            vrcVar4.e(vrcVar4.b() + ((double) hiHealthData.getFloat(strArrD[4])));
            return;
        }
        if (nub.d(i2)) {
            jry jryVarA2 = jry.a(BaseApplication.getContext());
            String[] strArrD2 = jryVarA2.d(jryVarA2.b(i2).getSportDataStatics());
            vrc vrcVar5 = this.ci;
            vrcVar5.b(vrcVar5.d() + ((double) hiHealthData.getInt(strArrD2[0])));
            vrc vrcVar6 = this.ci;
            vrcVar6.a(vrcVar6.a() + ((double) hiHealthData.getInt(strArrD2[2])));
            vrc vrcVar7 = this.ci;
            vrcVar7.d(vrcVar7.c() + ((double) hiHealthData.getFloat(strArrD2[4])));
            vrc vrcVar8 = this.ci;
            vrcVar8.c(vrcVar8.e() + ((double) hiHealthData.getFloat(strArrD2[5])));
        }
    }

    private String e(String str, String str2) {
        String[] strArr = this.ba;
        String str3 = "";
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            for (String str4 : this.ba) {
                if (str4.contains(str) && (TextUtils.isEmpty(str2) || !str4.contains(str2))) {
                    str3 = str4;
                }
            }
        }
        return str3;
    }

    private String[] g(int i2) {
        jry jryVarA = jry.a(this.h);
        if (jryVarA.b(i2) == null || jryVarA.b(i2).getSportDataStatics() == null) {
            LogUtil.e("Track_SportHistoryListFragment", "can not find sport type in json");
            return null;
        }
        return jryVarA.d(jryVarA.b(i2).getSportDataStatics());
    }

    private void bb() {
        if (UnitUtil.f()) {
            vrc vrcVar = this.ci;
            vrcVar.b(vrcVar.d() * 6.21371204033494E-4d);
        } else {
            vrc vrcVar2 = this.ci;
            vrcVar2.b(vrcVar2.d() / 1000.0d);
        }
        vrc vrcVar3 = this.ci;
        vrcVar3.d(vrcVar3.c() / 60000.0d);
        vrc vrcVar4 = this.ci;
        vrcVar4.c(vrcVar4.e() / 1000.0d);
    }

    private void i() {
        String strA;
        String strF;
        this.cj.clear();
        int i2 = this.m;
        if (i2 == 287) {
            aq();
            return;
        }
        if (jqq.e(i2)) {
            if (UnitUtil.f()) {
                strF = qre.f(R.string.IDS_band_data_sport_distance_unit_en);
            } else {
                strF = qre.f(R.string.IDS_band_data_sport_distance_unit);
            }
            this.cj.add(new MonthTitleItem.d(UnitUtil.e(this.ci.d(), 1, 2), strF));
        }
        if (this.m == 286) {
            this.cj.add(new MonthTitleItem.d(UnitUtil.e(this.ci.b(), 1, 0), qre.f(R.string.IDS_golf_total_strokes)));
        }
        if (this.ci.c() >= 6.0d) {
            strA = UnitUtil.e(this.ci.c() / 60.0d, 1, 1);
        } else {
            strA = qre.a(R.string.IDS_hw_health_blood_oxygen_measure_interval_lower_than, UnitUtil.e(0.1d, 1, 1));
        }
        this.cj.add(new MonthTitleItem.d(strA, BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_sport_history_duration_unit)));
        this.cj.add(new MonthTitleItem.d(UnitUtil.e(this.ci.a(), 1, 0), qre.e(R.plurals.IDS_running_times, (int) this.ci.a(), "").trim()));
        if (this.m != 222) {
            this.cj.add(new MonthTitleItem.d(UnitUtil.e(this.ci.e(), 1, 0), qre.f(R.string.IDS_track_total_calorie_kcal)));
        }
    }

    private void aq() {
        double d2;
        String string;
        if (UnitUtil.f()) {
            d2 = UnitUtil.e(this.ci.d() / 10.0d, 1);
            string = this.h.getResources().getString(R.string.IDS_motiontrack_history_max_deep_inch_unit);
        } else {
            d2 = this.ci.d() / 10.0d;
            string = this.h.getResources().getString(R.string.IDS_motiontrack_history_max_deep_unit);
        }
        this.cj.add(new MonthTitleItem.d(UnitUtil.e(d2, 1, (d2 == 0.0d ? 1 : 0) ^ 1), string));
        double dC = this.ci.c() / 60.0d;
        this.cj.add(new MonthTitleItem.d(UnitUtil.e(dC, 1, (dC > 0.0d ? 1 : (dC == 0.0d ? 0 : -1)) == 0 ? 0 : 2), this.h.getResources().getString(R.string.IDS_motiontrack_history_sum_time_unit)));
        this.cj.add(new MonthTitleItem.d(UnitUtil.e(this.ci.a(), 1, 0), this.h.getResources().getString(R.string.IDS_diving_time)));
    }

    static class k implements IMultiResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<SportHistoryListFragment> f28321b;
        ntx d;

        k(ntx ntxVar, SportHistoryListFragment sportHistoryListFragment) {
            this.f28321b = new WeakReference<>(sportHistoryListFragment);
            this.d = ntxVar;
        }

        @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.IMultiResponseCallback
        public void onNotify(int[] iArr, Object[] objArr) {
            LogUtil.a("Track_SportHistoryListFragment", "Simply cb errorCode : ", Arrays.toString(iArr), "Simply cb datas : ", Arrays.toString(objArr));
            SportHistoryListFragment sportHistoryListFragment = this.f28321b.get();
            if (sportHistoryListFragment != null) {
                if (sportHistoryListFragment.v != null) {
                    sportHistoryListFragment.v.removeMessages(6);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 6;
                    messageObtain.obj = new ntz(this.d, objArr);
                    sportHistoryListFragment.v.sendMessage(messageObtain);
                    return;
                }
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "mExtendHandler is null");
                return;
            }
            ReleaseLogUtil.e("Track_SportHistoryListFragment", "ReadTrackSimplifyListCallback sportHistory mWeakReference is null");
        }
    }

    static class m implements IMultiResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<SportHistoryListFragment> f28325c;

        m(SportHistoryListFragment sportHistoryListFragment) {
            this.f28325c = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.IMultiResponseCallback
        public void onNotify(int[] iArr, Object[] objArr) {
            SportHistoryListFragment sportHistoryListFragment = this.f28325c.get();
            if (sportHistoryListFragment == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "ReadSportYearDataCallback sportHistory mWeakReference is null");
                return;
            }
            if (b(objArr)) {
                sportHistoryListFragment.bc();
                return;
            }
            if (sportHistoryListFragment.v == null) {
                LogUtil.a("Track_SportHistoryListFragment", "Year mExtendHandler == null");
                sportHistoryListFragment.bc();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 7;
            sportHistoryListFragment.v.removeMessages(7);
            messageObtain.obj = objArr;
            sportHistoryListFragment.v.sendMessage(messageObtain);
        }

        private boolean b(Object[] objArr) {
            if (objArr == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "Year illegal input data");
                return true;
            }
            LogUtil.a("Track_SportHistoryListFragment", "Year cb data : ", Integer.valueOf(objArr.length));
            if (objArr.length < 2) {
                LogUtil.j("Track_SportHistoryListFragment", "Year data length < 2");
                return true;
            }
            if (objArr[0] != null) {
                return false;
            }
            Object obj = objArr[1];
            if (obj == null) {
                if (objArr.length <= 2 || objArr[2] == null) {
                    LogUtil.j("Track_SportHistoryListFragment", "Year data 0 or 1 is null");
                    return true;
                }
                LogUtil.j("Track_SportHistoryListFragment", "Year data diving");
                return false;
            }
            if (obj instanceof Collection) {
                return njy.e((Collection<?>) obj);
            }
            return false;
        }
    }

    static class o implements IMultiResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<SportHistoryListFragment> f28331b;

        o(SportHistoryListFragment sportHistoryListFragment) {
            this.f28331b = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.ui.main.stories.history.fragment.SportHistoryListFragment.IMultiResponseCallback
        public void onNotify(int[] iArr, Object[] objArr) {
            if (objArr == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "illegal input data");
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "Month cb errorCode : ", Integer.valueOf(iArr.length));
            LogUtil.a("Track_SportHistoryListFragment", "Month cb data : ", Integer.valueOf(objArr.length));
            SportHistoryListFragment sportHistoryListFragment = this.f28331b.get();
            if (sportHistoryListFragment == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "ReadMonthDataCallbackEx sportHistory mWeakReference is null");
                return;
            }
            if (objArr.length < 2) {
                LogUtil.j("Track_SportHistoryListFragment", "datas.length==0");
                sportHistoryListFragment.ag();
                return;
            }
            if (objArr[0] != null || objArr[1] != null) {
                if (sportHistoryListFragment.v == null) {
                    ReleaseLogUtil.d("Track_SportHistoryListFragment", "mExtendHandler == null");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 5;
                sportHistoryListFragment.v.removeMessages(5);
                messageObtain.obj = objArr;
                sportHistoryListFragment.v.sendMessage(messageObtain);
                return;
            }
            LogUtil.j("Track_SportHistoryListFragment", "data 0 or 1 is null");
            sportHistoryListFragment.ag();
        }
    }

    static class l implements IBaseResponseCallback {
        private WeakReference<SportHistoryListFragment> d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f28322a = true;
        private njd e = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Integer, jbv> f28323b = new HashMap(16);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<Integer, Long> f28324c = new HashMap(16);

        l(SportHistoryListFragment sportHistoryListFragment) {
            this.d = new WeakReference<>(sportHistoryListFragment);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public njd d() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, Long> c() {
            return this.f28324c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, jbv> b() {
            return this.f28323b;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            SportHistoryListFragment sportHistoryListFragment = this.d.get();
            if (sportHistoryListFragment == null || !(obj instanceof njd)) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "ReadTrackDetailCallback sportHistory mWeakReference is null");
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "err_code = ", Integer.valueOf(i));
            if (sportHistoryListFragment.cb == null) {
                ReleaseLogUtil.d("Track_SportHistoryListFragment", "mUpdateUiHandler is null");
                return;
            }
            LogUtil.a("Track_SportHistoryListFragment", "MSG_SHOW_DETAIL_TRACK");
            njd njdVar = (njd) obj;
            ive.c().init(BaseApplication.getContext());
            MotionPathSimplify motionPathSimplifyC = njdVar.c();
            if (motionPathSimplifyC == null) {
                ReleaseLogUtil.a("Track_SportHistoryListFragment", "simplifyMotionPath is null");
                return;
            }
            if (motionPathSimplifyC.requestSportType() == 512) {
                this.f28324c.clear();
                this.e = njdVar;
                List<RelativeSportData> listRequestChildSportItems = motionPathSimplifyC.requestChildSportItems();
                if (listRequestChildSportItems == null || listRequestChildSportItems.size() > 3) {
                    return;
                } else {
                    c(sportHistoryListFragment, listRequestChildSportItems);
                }
            }
            d(njdVar, sportHistoryListFragment, njdVar, motionPathSimplifyC);
        }

        private void c(SportHistoryListFragment sportHistoryListFragment, List<RelativeSportData> list) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    jbv jbvVar = new jbv();
                    LogUtil.a("Track_SportHistoryListFragment", BleConstants.SPORT_TYPE, Integer.valueOf(list.get(i).getSportType()), "HasDetailInfo", Boolean.valueOf(list.get(i).isHasDetailInfo()));
                    jbvVar.d(list.get(i));
                    this.f28323b.put(Integer.valueOf(i), jbvVar);
                    if (list.get(i).isHasDetailInfo()) {
                        this.f28324c.put(Integer.valueOf(i), Long.valueOf(list.get(i).getStartTime()));
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 201;
                        messageObtain.obj = list.get(i);
                        sportHistoryListFragment.v.sendMessage(messageObtain);
                        LogUtil.a("Track_SportHistoryListFragment", "MSG_TRIATHLON_DETAIL_TRACK__2");
                    }
                }
            }
        }

        private void d(njd njdVar, SportHistoryListFragment sportHistoryListFragment, njd njdVar2, MotionPathSimplify motionPathSimplify) {
            long jRequestStartTime = motionPathSimplify.requestStartTime();
            ArrayList arrayList = new ArrayList(10);
            for (Map.Entry<Integer, Long> entry : this.f28324c.entrySet()) {
                if (entry.getKey() != null && this.f28324c.get(entry.getKey()) != null && jRequestStartTime == this.f28324c.get(entry.getKey()).longValue()) {
                    b(njdVar2, motionPathSimplify, this.f28323b.get(entry.getKey()), this.f28323b.get(entry.getKey()).e());
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f28324c.remove((Integer) it.next());
                }
            }
            LogUtil.a("Track_SportHistoryListFragment", "mSportStartTimeMap size", Integer.valueOf(this.f28324c.size()));
            boolean z = this.f28324c.size() == 0;
            this.f28322a = z;
            if (z) {
                if (this.e == null) {
                    this.e = njdVar;
                }
                sportHistoryListFragment.cb.removeMessages(2);
                Message messageObtainMessage = sportHistoryListFragment.cb.obtainMessage(2);
                messageObtainMessage.obj = this;
                sportHistoryListFragment.cb.sendMessage(messageObtainMessage);
                this.f28324c.clear();
                LogUtil.a("Track_SportHistoryListFragment", "for MSG_SHOW_DETAIL_TRACK");
            }
        }

        private void b(njd njdVar, MotionPathSimplify motionPathSimplify, jbv jbvVar, RelativeSportData relativeSportData) {
            if (jbvVar == null) {
                return;
            }
            jbvVar.a(motionPathSimplify);
            jbvVar.d(motionPathSimplify.requestFatherSportItem());
            jbvVar.e(njdVar.b());
            jbvVar.d(relativeSportData);
        }
    }

    static class i implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SportHistoryListFragment> f28320c;

        private i(SportHistoryListFragment sportHistoryListFragment) {
            this.f28320c = new WeakReference<>(sportHistoryListFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_SportHistoryListFragment", "errorCode is ", Integer.valueOf(i), "objData is ", obj);
            if (!(obj instanceof MotionPathSimplify)) {
                LogUtil.j("Track_SportHistoryListFragment", "no sport data");
                return;
            }
            SportHistoryListFragment sportHistoryListFragment = this.f28320c.get();
            if (sportHistoryListFragment == null || sportHistoryListFragment.getActivity() == null) {
                ReleaseLogUtil.a("Track_SportHistoryListFragment", "SportHistoryListFragment is null in InnerSimplifyDataCallback");
            } else {
                new jdb(sportHistoryListFragment.getActivity(), (MotionPathSimplify) obj, 1).a();
            }
        }
    }

    public static class n {
        public void a(ntx ntxVar, IMultiResponseCallback iMultiResponseCallback) {
            LogUtil.a("Track_SportHistoryListFragment", "getDetailSportData start ", Integer.valueOf(ntxVar.f()));
            int[] iArr = {0, 1};
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "SportDataRequestManager recordApi is null.");
                return;
            }
            ntx ntxVarA = new ntx.d().b(ntxVar.a()).d(ntxVar.e()).a(ntxVar.c()).e(ntxVar.i()).a();
            if (ntxVar.f() == 0) {
                e eVar = new e(iArr, 2, iMultiResponseCallback);
                e.c cVar = new e.c(0, eVar);
                e.c cVar2 = new e.c(1, eVar);
                nkb.d().e(ntxVar, cVar);
                LogUtil.a("Track_SportHistoryListFragment", "getDetailSportData form health platform");
                recordApi.acquireDetailFitnessRecords(ntxVarA, cVar2);
                LogUtil.a("Track_SportHistoryListFragment", "getDetailSportData from suggestion db");
                return;
            }
            if (ntxVar.f() == 10001) {
                recordApi.acquireDetailFitnessRecords(ntxVarA, new e.c(1, new e(iArr, 1, iMultiResponseCallback)));
                return;
            }
            nkb.d().e(ntxVar, new e.c(0, new e(iArr, 1, iMultiResponseCallback)));
            LogUtil.a("Track_SportHistoryListFragment", "getDetailSportData form health platform");
        }

        public void c(int i, int i2, long j, long j2, boolean z, IMultiResponseCallback iMultiResponseCallback) {
            LogUtil.a("Track_SportHistoryListFragment", "getMonthData ", Integer.valueOf(i));
            int[] iArr = {0, 1, 2};
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "getMonthData recordApi is null.");
                return;
            }
            if (i == 0) {
                e eVar = new e(iArr, 2, iMultiResponseCallback);
                e.c cVar = new e.c(0, eVar);
                e.c cVar2 = new e.c(1, eVar);
                iwn.a(BaseApplication.getContext()).e(j, j2, 5, i, cVar);
                LogUtil.a("Track_SportHistoryListFragment", "acquire data form health platform");
                recordApi.acquireSummaryFitnessRecord(new ntx.d().b(j).d(j2).d(5).a(), cVar2);
                LogUtil.a("Track_SportHistoryListFragment", "acquire data form fitness ");
                return;
            }
            if (i == 10001) {
                recordApi.acquireSummaryFitnessRecord(new ntx.d().b(j).d(j2).e(z ? i2 : 0).d(5).a(), new e.c(1, new e(iArr, 1, iMultiResponseCallback)));
                return;
            }
            if (i == 287) {
                e eVar2 = new e(iArr, 2, iMultiResponseCallback);
                e.c cVar3 = new e.c(0, eVar2);
                e.c cVar4 = new e.c(2, eVar2);
                iwn.a(BaseApplication.getContext()).e(j, j2, 5, i, cVar3);
                nkb.d().e(j, j2, 5, cVar4);
                LogUtil.a("Track_SportHistoryListFragment", "acquire data form SPORT_TYPE_FREE_DIVING ");
                return;
            }
            iwn.a(BaseApplication.getContext()).e(j, j2, 5, i, new e.c(0, new e(iArr, 1, iMultiResponseCallback)));
            LogUtil.a("Track_SportHistoryListFragment", "acquire data form health platform 2 ");
        }

        public void d(int i, long j, long j2, IMultiResponseCallback iMultiResponseCallback) {
            LogUtil.a("Track_SportHistoryListFragment", "getYearData ", Integer.valueOf(i));
            int[] iArr = {0, 1, 2};
            RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
            if (recordApi == null) {
                ReleaseLogUtil.e("Track_SportHistoryListFragment", "getYearData recordApi is null.");
                return;
            }
            ntx ntxVarA = new ntx.d().b(j).d(j2).d(6).a();
            if (i == 0) {
                e eVar = new e(iArr, 2, iMultiResponseCallback);
                e.c cVar = new e.c(0, eVar);
                e.c cVar2 = new e.c(1, eVar);
                nkb.d().a(j, j2, 6, cVar);
                LogUtil.a("Track_SportHistoryListFragment", "getYearData() acquire data form health platform");
                recordApi.acquireSummaryFitnessRecord(ntxVarA, cVar2);
                LogUtil.a("Track_SportHistoryListFragment", "getYearData() acquire data form fitness ");
                return;
            }
            if (i == 10001) {
                recordApi.acquireSummaryFitnessRecord(ntxVarA, new e.c(1, new e(iArr, 1, iMultiResponseCallback)));
                LogUtil.a("Track_SportHistoryListFragment", "getYearData() acquire data form fitness 2");
                return;
            }
            if (i == 287) {
                e eVar2 = new e(iArr, 2, iMultiResponseCallback);
                e.c cVar3 = new e.c(0, eVar2);
                e.c cVar4 = new e.c(2, eVar2);
                nkb.d().a(j, j2, 6, i, cVar3);
                nkb.d().e(j, j2, 6, cVar4);
                LogUtil.a("Track_SportHistoryListFragment", "getYearData() acquire data form SPORT_TYPE_FREE_DIVING ");
                return;
            }
            nkb.d().a(j, j2, 6, i, new e.c(0, new e(iArr, 1, iMultiResponseCallback)));
            LogUtil.a("Track_SportHistoryListFragment", "getYearData() acquire data form health platform 2 ");
        }

        static class e {
            private static final Object d = new Object();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f28326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IMultiResponseCallback f28327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Object[] f28328c;
            private int[] e;

            e(int[] iArr, int i, IMultiResponseCallback iMultiResponseCallback) {
                if (iArr != null) {
                    synchronized (d) {
                        this.f28326a = i;
                    }
                    this.e = new int[iArr.length];
                    for (int i2 = 0; i2 < this.f28326a; i2++) {
                        this.e[i2] = -2018;
                    }
                    this.f28328c = new Object[iArr.length];
                    this.f28327b = iMultiResponseCallback;
                }
            }

            public void e(int i, int i2, Object obj) {
                boolean z;
                IMultiResponseCallback iMultiResponseCallback;
                synchronized (d) {
                    this.e[i] = i2;
                    this.f28328c[i] = obj;
                    int i3 = this.f28326a - 1;
                    this.f28326a = i3;
                    z = i3 <= 0;
                    LogUtil.a("Track_SportHistoryListFragment", "tryToNotifyData req type: ", Integer.valueOf(i), " request count ", Integer.valueOf(i3));
                }
                if (!z || (iMultiResponseCallback = this.f28327b) == null) {
                    return;
                }
                iMultiResponseCallback.onNotify(this.e, this.f28328c);
            }

            static class c implements IBaseResponseCallback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f28329a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private e f28330c;

                c(int i, e eVar) {
                    this.f28329a = i;
                    this.f28330c = eVar;
                }

                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("Track_SportHistoryListFragment", "SimpleCallback onResponse ", Integer.valueOf(i));
                    e eVar = this.f28330c;
                    if (eVar != null) {
                        eVar.e(this.f28329a, i, obj);
                    }
                }
            }
        }
    }
}

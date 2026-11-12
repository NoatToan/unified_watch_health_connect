package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.wearengine.rqmanager.RqDataPushReceiver;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetLoadPeakRsp;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.LacticBasic;
import com.huawei.hwcloudmodel.model.unite.LoadPeakData;
import com.huawei.hwcloudmodel.model.unite.LoadPeakDataContainer;
import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.h5pro.jsmodules.MenstrualModule;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.KnitBloodOxygenDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.climb.FitnessClimbDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.distance.FitnessDistanceDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import com.huawei.up.model.UserInfomation;
import defpackage.ddv;
import defpackage.fga;
import defpackage.fua;
import defpackage.gzp;
import defpackage.ieg;
import defpackage.iov;
import defpackage.jcg;
import defpackage.jyd;
import defpackage.lmf;
import defpackage.lro;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.ltb;
import defpackage.njy;
import defpackage.pez;
import defpackage.ppv;
import defpackage.pqd;
import defpackage.pqe;
import defpackage.qpe;
import defpackage.qqt;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.uwf;
import defpackage.uwh;
import defpackage.uye;
import defpackage.vbr;
import defpackage.vei;
import defpackage.vng;
import defpackage.wka;
import defpackage.wuw;
import defpackage.wvb;
import defpackage.xkb;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HealthDatasActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f27467a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f27468b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f27469c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean h = false;
    private HealthTextView aa;
    private RelativeLayout ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private int ae;
    private HealthTextView af;
    private HealthTextView ag;
    private int ah;
    private RelativeLayout ai;
    private int aj;
    private GetRunLevelRsp ak;
    private RelativeLayout al;
    private HealthTextView am;
    private int an;
    private RelativeLayout ao;
    private boolean ap;
    private HealthOpenSDK aq;
    private Handler ar;
    private af as;
    private HealthTextView at;
    private LastTimeHealthDataReader<HealthDatasActivity> au;
    private HealthTextView av;
    private RelativeLayout aw;
    private Map<Integer, Long> ax;
    private HealthTextView ay;
    private Map<View, ClickViewCallback> az;
    private RelativeLayout ba;
    private HealthTextView bb;
    private List<HiHealthData> bc;
    private RunningStateIndexData bd;
    private RelativeLayout be;
    private HealthTextView bf;
    private long bg;
    private HealthTextView bh;
    private aa bi;
    private HealthTextView bj;
    private HealthTextView bk;
    private HealthTextView bl;
    private RelativeLayout bm;
    private RelativeLayout bn;
    private RelativeLayout bp;
    private int bq;
    private HealthTextView br;
    private ah bs;
    private ag bt;
    private RelativeLayout bu;
    private HealthTextView bv;
    private HealthTextView bw;
    private HealthTextView bx;
    private RelativeLayout by;
    private HealthTextView bz;
    private af ca;
    private List<Integer> cb;
    private HealthTextView cc;
    private RelativeLayout cd;
    private HealthTextView ce;
    private ad cf;
    private long cg;
    private uwf ch;
    private int ci;
    private HealthTextView cj;
    private RelativeLayout ck;
    private af cl;
    private HealthTextView g;
    private HealthTextView j;
    private RelativeLayout k;
    private af l;
    private HealthTextView m;
    private RelativeLayout n;
    private af o;
    private HealthTextView p;
    private RelativeLayout q;
    private RelativeLayout r;
    private RelativeLayout s;
    private HealthTextView t;
    private HealthTextView u;
    private RelativeLayout v;
    private HealthTextView w;
    private int x;
    private HealthTextView y;
    private Context z;
    private boolean i = false;
    private int bo = StepCounterSupportUtil.b(BaseApplication.getContext());

    /* JADX INFO: loaded from: classes19.dex */
    public interface ClickViewCallback {
        void startActivity();
    }

    private void ai() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{44306});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        this.bt = new ag(this);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, this.bt);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ag implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HealthDatasActivity> f27478a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        ag(HealthDatasActivity healthDatasActivity) {
            this.f27478a = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("UIHLH_HealthDatasActivity", "getStressStatisticsData errorCode = ", Integer.valueOf(i));
            HealthDatasActivity healthDatasActivity = this.f27478a.get();
            if (healthDatasActivity == null) {
                LogUtil.j("UIHLH_HealthDatasActivity", "HealthDatasActivity is null");
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "requestStressHistoryData data instanceof SparseArray is false");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                return;
            }
            Object obj2 = sparseArray.get(44306);
            if (!(obj2 instanceof List)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "requestStressHistoryData pressureMeasureValue instanceof List is false");
            } else if (((HiHealthData) ((List) obj2).get(0)) != null) {
                healthDatasActivity.i = true;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_listview_item);
        this.ap = Utils.o();
        this.z = this;
        p();
        ai();
        this.ar = new x(this);
        this.cl = new af(this, 0);
        this.o = new af(this, 1);
        this.as = new af(this, 4);
        this.l = new af(this, 7);
        this.ca = new af(this, 8);
        this.ch = uwf.d();
        this.ax = new HashMap(8);
        u();
        this.aq = fga.d(this.z).e();
        xkb.d("900300050", new v(this));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(103);
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new u(this));
        ppv.d().a();
        ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "onCreate typeList ", arrayList);
    }

    private void p() {
        StepCounterSupportUtil.a(new StepCounterSupportUtil.StepCounterClassCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.1
            @Override // com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.StepCounterClassCallback
            public void getDeviceClass(int i2) {
                ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "initStepCounterClass type", Integer.valueOf(i2));
                HealthDatasActivity.this.bo = i2;
            }
        });
    }

    private void u() {
        y();
        ((HealthScrollView) findViewById(R.id.personal_info_scroll)).setScrollViewVerticalDirectionEvent(true);
        this.ag.setText(UnitUtil.e(0.0d, 1, 2));
        if (UnitUtil.f()) {
            this.af.setText(this.z.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en));
        } else {
            this.af.setText(this.z.getResources().getString(R.string.IDS_hw_show_sport_distance_unit));
        }
        this.bn.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ab.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.ck.setOnClickListener(this);
        this.bm.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.ba.setOnClickListener(this);
        this.by.setOnClickListener(this);
        this.cd.setOnClickListener(this);
        this.be.setOnClickListener(this);
        this.bp.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.bu.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.ao.setOnClickListener(this);
        this.al.setOnClickListener(this);
        ab();
        if (this.ap) {
            this.q.setVisibility(8);
        } else {
            LogUtil.d("UIHLH_HealthDatasActivity", "is not satisfy.");
        }
        m();
        s();
    }

    private void y() {
        this.bv = a(R.id.health_data_item_step_layout, R.id.record_data);
        this.bw = a(R.id.health_data_item_step_layout, R.id.record_data_unit);
        a(R.id.health_data_item_step_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_settings_steps));
        d(b(R.id.health_data_item_step_layout, R.id.content_icon), R.mipmap.ic_mydata_step);
        this.bw.setText(this.z.getResources().getString(R.string.IDS_hw_show_main_home_page_steps));
        this.ag = a(R.id.health_data_item_dis_layout, R.id.record_data);
        this.af = a(R.id.health_data_item_dis_layout, R.id.record_data_unit);
        a(R.id.health_data_item_dis_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_sport_distance));
        b(R.id.health_data_item_dis_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_distance);
        this.ad = a(R.id.health_data_item_climb_layout, R.id.record_data);
        this.aa = a(R.id.health_data_item_climb_layout, R.id.record_data_unit);
        a(R.id.health_data_item_climb_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_motiontrack_climb_stairs_tip));
        d(b(R.id.health_data_item_climb_layout, R.id.content_icon), R.mipmap.ic_mydata_climbing_stairs);
        this.u = a(R.id.health_data_item_calorie_layout, R.id.record_data);
        this.ac = a(R.id.health_data_item_calorie_layout, R.id.record_data_unit);
        a(R.id.health_data_item_calorie_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_active_caloric));
        b(R.id.health_data_item_calorie_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_kcal);
        this.ac.setText(this.z.getResources().getString(R.string.IDS_hw_health_show_calorie_unit));
        t();
        l();
        q();
        ag();
        o();
        b(R.id.health_data_item_calorie_layout);
        b(R.id.health_data_item_physiologicalCycle_layout);
        b(R.id.health_data_item_ftp_layout);
    }

    private void q() {
        this.ay = a(R.id.health_data_item_load_layout, R.id.record_data);
        this.bb = a(R.id.health_data_item_load_layout, R.id.record_data_unit);
        a(R.id.health_data_item_load_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_hwh_health_load));
        b(R.id.health_data_item_load_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_load);
    }

    private void ag() {
        if (qrs.ac()) {
            qrs.a(this.bv);
            qrs.a(this.bw);
            qrs.a(this.ag);
            qrs.a(this.af);
            qrs.a(this.ad);
            qrs.a(this.aa);
            qrs.a(this.u);
            qrs.a(this.ac);
            qrs.a(this.ce);
            qrs.a(this.cc);
            qrs.a(this.bl);
            qrs.a(this.bf);
            qrs.a(this.br);
            qrs.a(this.bj);
            qrs.a(this.j);
            qrs.a(this.g);
            qrs.a(this.at);
            qrs.a(this.av);
            qrs.a(this.am);
        }
    }

    private void l() {
        this.ce = a(R.id.health_data_item_vo2max_layout, R.id.record_data);
        this.cc = a(R.id.health_data_item_vo2max_layout, R.id.record_data_unit);
        a(R.id.health_data_item_vo2max_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_hwh_health_vo2max));
        b(R.id.health_data_item_vo2max_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_oxygen_uptake);
        this.cc.setText(this.z.getResources().getString(R.string.IDS_hwh_health_vo2max_unit));
        this.bl = a(R.id.health_data_item_running_layout, R.id.record_data);
        this.bf = a(R.id.health_data_item_running_layout, R.id.record_data_unit);
        a(R.id.health_data_item_running_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_data_running_index_title_outside));
        b(R.id.health_data_item_running_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_rq_running);
        this.br = a(R.id.health_data_item_state_index_layout, R.id.record_data);
        this.bj = a(R.id.health_data_item_state_index_layout, R.id.record_data_unit);
        a(R.id.health_data_item_state_index_layout, R.id.content_title).setText(this.z.getResources().getString(R.string.IDS_data_state_index_title));
        b(R.id.health_data_item_state_index_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_rq_state_index);
        this.j = a(R.id.health_data_item_achievement_layout, R.id.record_data);
        this.g = a(R.id.health_data_item_achievement_layout, R.id.record_data_unit);
        HealthTextView healthTextViewA = a(R.id.health_data_item_achievement_layout, R.id.content_title);
        healthTextViewA.setText(this.z.getResources().getString(R.string.IDS_hwh_health_vo2max_record_forecast));
        c(healthTextViewA);
        b(R.id.health_data_item_achievement_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_rq_achievement_prediction);
        this.j.setText("");
        this.g.setText("");
        this.at = a(R.id.health_data_item_lactic_layout, R.id.record_data);
        this.av = a(R.id.health_data_item_lactic_layout, R.id.record_data_unit);
        a(R.id.health_data_item_lactic_layout, R.id.content_title).setText(R.string.IDS_running_lactate_threshold);
        b(R.id.health_data_item_lactic_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_lactic);
        this.av.setText("");
        this.am = a(R.id.health_data_item_ftp_layout, R.id.record_data);
        a(R.id.health_data_item_ftp_layout, R.id.content_title).setText(R.string.IDS_cycling_ftp);
        b(R.id.health_data_item_ftp_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ftp_item);
    }

    private void c(HealthTextView healthTextView) {
        View viewG = g(R.id.health_data_item_achievement_layout, R.id.title_layout);
        if (viewG == null || healthTextView == null) {
            LogUtil.j("UIHLH_HealthDatasActivity", "changTextViewParams view == null || textView == null");
            return;
        }
        if (viewG.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewG.getLayoutParams();
            if (LanguageUtil.bn(this.z)) {
                healthTextView.setMaxLines(1);
                layoutParams.weight = 2.0f;
                healthTextView.setEllipsize(TextUtils.TruncateAt.END);
            }
            viewG.setLayoutParams(layoutParams);
        }
    }

    private void o() {
        this.bn = c(R.id.health_data_item_step_layout, R.id.item_rl);
        this.ai = c(R.id.health_data_item_dis_layout, R.id.item_rl);
        this.ab = c(R.id.health_data_item_climb_layout, R.id.item_rl);
        this.v = c(R.id.health_data_item_calorie_layout, R.id.item_rl);
        this.s = (RelativeLayout) findViewById(R.id.health_data_item_bmp_layout);
        this.ck = (RelativeLayout) findViewById(R.id.health_data_item_weight_layout);
        this.bm = (RelativeLayout) findViewById(R.id.health_data_item_sleep_layout);
        this.r = (RelativeLayout) findViewById(R.id.health_data_item_bloodpresure_layout);
        this.q = (RelativeLayout) findViewById(R.id.health_data_item_bloodsugar_layout);
        this.by = (RelativeLayout) findViewById(R.id.health_data_item_temperature_layout);
        this.ba = (RelativeLayout) findViewById(R.id.health_data_item_physiologicalCycle_layout);
        this.k = (RelativeLayout) findViewById(R.id.health_data_item_blood_oxygen_layout);
        this.bu = (RelativeLayout) findViewById(R.id.health_data_item_stress_layout);
        this.cd = c(R.id.health_data_item_vo2max_layout, R.id.item_rl);
        RelativeLayout relativeLayoutC = c(R.id.health_data_item_load_layout, R.id.item_rl);
        this.aw = relativeLayoutC;
        relativeLayoutC.setVisibility(8);
        b(R.id.health_data_item_load_layout, R.id.record_arrow).setVisibility(4);
        this.be = c(R.id.health_data_item_running_layout, R.id.item_rl);
        this.bp = c(R.id.health_data_item_state_index_layout, R.id.item_rl);
        this.n = c(R.id.health_data_item_achievement_layout, R.id.item_rl);
        this.ao = (RelativeLayout) findViewById(R.id.health_data_item_lactic_layout);
        if (!fua.g()) {
            this.ao.setVisibility(8);
        }
        this.al = (RelativeLayout) findViewById(R.id.health_data_item_ftp_layout);
    }

    private void t() {
        String string;
        this.w = a(R.id.health_data_item_bmp_layout, R.id.record_data);
        this.y = a(R.id.health_data_item_bmp_layout, R.id.record_data_unit);
        a(a(R.id.health_data_item_bmp_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_main_heart_health_string));
        b(R.id.health_data_item_bmp_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_heart_rate);
        this.cj = a(R.id.health_data_item_weight_layout, R.id.record_data);
        HealthTextView healthTextViewA = a(R.id.health_data_item_weight_layout, R.id.content_title);
        if (Utils.o()) {
            string = this.z.getResources().getString(R.string.IDS_hw_show_set_weight);
        } else {
            string = this.z.getResources().getString(R.string.IDS_health_weight_manager);
        }
        a(healthTextViewA, string);
        b(R.id.health_data_item_weight_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_weight);
        this.bz = a(R.id.health_data_item_stress_layout, R.id.record_data);
        a(a(R.id.health_data_item_stress_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
        b(R.id.health_data_item_stress_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_pressure);
        this.bk = a(R.id.health_data_item_sleep_layout, R.id.record_data);
        a(a(R.id.health_data_item_sleep_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_hw_show_main_home_page_sleep));
        b(R.id.health_data_item_sleep_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_sleep);
        this.p = a(R.id.health_data_item_bloodpresure_layout, R.id.record_data);
        a(a(R.id.health_data_item_bloodpresure_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_hw_show_main_home_page_bloodpressure));
        b(R.id.health_data_item_bloodpresure_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_blood_pressure);
        r();
    }

    private void r() {
        String string;
        this.m = a(R.id.health_data_item_blood_oxygen_layout, R.id.record_data);
        a(a(R.id.health_data_item_blood_oxygen_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_hw_health_blood_oxygen));
        b(R.id.health_data_item_blood_oxygen_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_blood_oxygen_saturation);
        this.t = a(R.id.health_data_item_bloodsugar_layout, R.id.record_data);
        a(a(R.id.health_data_item_bloodsugar_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_hw_show_main_home_page_bloodsugar));
        b(R.id.health_data_item_bloodsugar_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_blood_sugar);
        this.bx = a(R.id.health_data_item_temperature_layout, R.id.record_data);
        HealthTextView healthTextViewA = a(R.id.health_data_item_temperature_layout, R.id.content_title);
        if (this.ap) {
            string = this.z.getResources().getString(R.string.IDS_health_skin_temperature);
        } else {
            string = this.z.getResources().getString(R.string.IDS_settings_health_temperature);
        }
        a(healthTextViewA, string);
        b(R.id.health_data_item_temperature_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_mydata_temperature);
        this.bh = a(R.id.health_data_item_physiologicalCycle_layout, R.id.record_data);
        a(a(R.id.health_data_item_physiologicalCycle_layout, R.id.content_title), this.z.getResources().getString(R.string.IDS_hw_physiological_cycle));
        b(R.id.health_data_item_physiologicalCycle_layout, R.id.content_icon).setBackgroundResource(R.mipmap.ic_slzq);
    }

    private void a(final TextView textView, final String str) {
        textView.post(new Runnable() { // from class: upd
            @Override // java.lang.Runnable
            public final void run() {
                this.f50439b.d(textView, str);
            }
        });
    }

    public /* synthetic */ void d(final TextView textView, String str) {
        if (textView.getParent() instanceof View) {
            final ViewGroup viewGroup = (ViewGroup) textView.getParent();
            float width = viewGroup.getWidth() - com.github.mikephil.charting.utils.Utils.convertDpToPixel(16.0f);
            float f2 = width - (width / 3.0f);
            float fMeasureText = textView.getPaint().measureText(str);
            if (fMeasureText < f2) {
                textView.setText(str);
                return;
            }
            LogUtil.a("UIHLH_HealthDatasActivity", Integer.valueOf(textView.hashCode()), ", textViewMaxWidth=", Float.valueOf(f2), ", textViewWidth=", Float.valueOf(fMeasureText));
            textView.setMaxWidth((int) f2);
            textView.setText(str);
            textView.post(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    TextView textView2 = textView;
                    if (textView2 == null || textView2.getLayout() == null) {
                        LogUtil.j("UIHLH_HealthDatasActivity", "setAutoWidthTextView textView is null");
                        return;
                    }
                    int lineCount = textView.getLayout().getLineCount();
                    if (lineCount > 1 && (viewGroup.getParent() instanceof View)) {
                        ((ViewGroup) viewGroup.getParent()).getLayoutParams().height = -2;
                    }
                    float f3 = 0.0f;
                    for (int i2 = 0; i2 < lineCount; i2++) {
                        float lineWidth = textView.getLayout().getLineWidth(i2);
                        if (lineWidth > f3) {
                            f3 = lineWidth;
                        }
                    }
                    LogUtil.a("UIHLH_HealthDatasActivity", Integer.valueOf(textView.hashCode()), ", childMaxWidth=", Float.valueOf(f3));
                    textView.setMaxWidth((int) f3);
                }
            });
        }
    }

    private void ab() {
        d(R.id.health_data_item_step_layout, R.id.health_data_item_dis_layout, R.id.health_data_item_climb_layout, R.id.health_data_item_calorie_layout, R.id.health_data_item_bmp_layout, R.id.health_data_item_weight_layout, R.id.health_data_item_bloodpresure_layout, R.id.health_data_item_bloodsugar_layout, R.id.health_data_item_blood_oxygen_layout, R.id.health_data_item_vo2max_layout, R.id.health_data_item_stress_layout, R.id.health_data_item_running_layout, R.id.health_data_item_state_index_layout, R.id.health_data_item_temperature_layout, R.id.health_data_item_sleep_layout, R.id.health_data_item_lactic_layout, R.id.health_data_item_achievement_layout, R.id.health_data_item_physiologicalCycle_layout, R.id.health_data_item_load_layout);
    }

    private void b(int i2) {
        View viewG = g(i2, R.id.data_line);
        if (viewG == null) {
            return;
        }
        viewG.setVisibility(8);
    }

    private void d(int... iArr) {
        if (LanguageUtil.ba(getApplication())) {
            for (int i2 : iArr) {
                ImageView imageViewB = b(i2, R.id.record_arrow);
                if (imageViewB != null) {
                    imageViewB.setImageResource(R.drawable.common_ui_arrow_left);
                }
            }
        }
    }

    private void s() {
        e(R.id.heanth_data_subheader_action, R.id.item_title).setHeadTitleText(this.z.getResources().getString(R.string.IDS_settings_active_status));
        e(R.id.heanth_data_subheader_action, R.id.item_title).setSplitterVisible(8);
        e(R.id.heanth_data_subheader_condition, R.id.item_title).setHeadTitleText(this.z.getResources().getString(R.string.IDS_settings_health_status));
        e(R.id.heanth_data_subheader_power, R.id.item_title).setHeadTitleText(this.z.getResources().getString(R.string.IDS_data_rq_title));
    }

    private HealthTextView a(int i2, int i3) {
        View viewFindViewById = qsp.a(this, i2).findViewById(i3);
        if (viewFindViewById instanceof HealthTextView) {
            return (HealthTextView) viewFindViewById;
        }
        LogUtil.j("UIHLH_HealthDatasActivity", "getTextView view is not instanceof HealthTextView");
        return new HealthTextView(this);
    }

    private View g(int i2, int i3) {
        return qsp.a(this, i2).findViewById(i3);
    }

    private HealthSubHeader e(int i2, int i3) {
        return (HealthSubHeader) qsp.a(this, i2).findViewById(i3);
    }

    private ImageView b(int i2, int i3) {
        return (ImageView) qsp.a(this, i2).findViewById(i3);
    }

    private RelativeLayout c(int i2, int i3) {
        View viewFindViewById = qsp.a(this, i2).findViewById(i3);
        if (viewFindViewById instanceof RelativeLayout) {
            return (RelativeLayout) viewFindViewById;
        }
        LogUtil.j("UIHLH_HealthDatasActivity", "getRelativeLayoutView view is not instanceof RelativeLayout");
        return new RelativeLayout(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("UIHLH_HealthDatasActivity", "onResume begin");
        super.onResume();
        k();
        final ab abVar = new ab(this);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (HealthDatasActivity.this.aq != null) {
                    HealthDatasActivity.this.aq.c(abVar);
                }
            }
        });
        LogUtil.a("UIHLH_HealthDatasActivity", "onResume end");
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class o implements ClickViewCallback {
        public o() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for stepLayout begin");
            HealthDatasActivity.this.am();
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for stepLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class f implements ClickViewCallback {
        public f() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_FITNESSDATA_DISTANCE_2030005.value());
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for disLayout begin");
            HealthDatasActivity.this.aq.e((IFlushResult) null);
            LogUtil.a("UIHLH_HealthDatasActivity", "Create FitnessDistanceDetailActivity and set it to mContext.");
            if (HealthDatasActivity.this.z != null) {
                Intent intent = new Intent(HealthDatasActivity.this.z, (Class<?>) FitnessDistanceDetailActivity.class);
                intent.putExtra("today_current_distance_total", HealthDatasActivity.this.ae);
                LogUtil.a("UIHLH_HealthDatasActivity", "mContext.startActivity");
                HealthDatasActivity.this.z.startActivity(intent);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for disLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class g implements ClickViewCallback {
        public g() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for climbLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_CLIMB_2030046.value());
            HealthDatasActivity.this.aq.e((IFlushResult) null);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putLong("intent_key_query_start_time", ltb.m(ltb.d()));
            if (HealthDatasActivity.this.z != null) {
                intent.setClass(HealthDatasActivity.this.z, FitnessClimbDetailActivity.class);
                intent.putExtra("bundle_key_data", bundle);
                intent.putExtra("today_current_climb_total", HealthDatasActivity.this.an);
                HealthDatasActivity.this.z.startActivity(intent);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for climbLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class i implements ClickViewCallback {
        public i() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for calorieLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_FITNESSDATA_KALORIES_2030006.value());
            HealthDatasActivity.this.aq.e((IFlushResult) null);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            long jM = ltb.m(ltb.d());
            bundle.putLong("intent_key_query_start_time", jM);
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity CALORIE mQueryStartTime = ", Long.valueOf(jM));
            if (HealthDatasActivity.this.z != null) {
                intent.setClass(HealthDatasActivity.this.z, FitnessCalorieDetailActivity.class);
                intent.putExtra("bundle_key_data", bundle);
                intent.putExtra("today_current_colories_total", HealthDatasActivity.this.x);
                HealthDatasActivity.this.z.startActivity(intent);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for calorieLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class j implements ClickViewCallback {
        public j() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bmpLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_HEARTRATE_2030047.value());
            if (HealthDatasActivity.this.z != null) {
                if (!fua.h()) {
                    HeartRateDetailActivity.a(HealthDatasActivity.this.z, HealthDatasActivity.this.c(4));
                } else {
                    Intent intent = new Intent();
                    intent.setClassName(HealthDatasActivity.this.z.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
                    IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.HEART_RATE).addPageType("0").build();
                    LogUtil.a("UIHLH_HealthDatasActivity", "params.toString()", intentParamsBuild.toString());
                    intent.putExtra(com.alipay.sdk.m.s.e.n, intentParamsBuild.toString());
                    intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 2);
                    iov.c(HealthDatasActivity.this.z, intent);
                }
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bmpLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class s implements ClickViewCallback {
        public s() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for weightLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_WEIGHT_2030035.value());
            if (HealthDatasActivity.this.z != null) {
                WeightDataManager.INSTANCE.setInitFlag(true);
                Intent intent = new Intent();
                intent.putExtra("from", "7");
                vng.a("7", intent);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for weightLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class l implements ClickViewCallback {
        public l() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for sleepLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_SLEEP_2030048.value());
            if (HealthDatasActivity.e && !HealthDatasActivity.this.ap) {
                KnitSleepDetailActivity.e(HealthDatasActivity.this.z, (Bundle) null);
            } else {
                KnitSleepDetailActivity.c(HealthDatasActivity.this.z, HealthDatasActivity.f27468b, HealthDatasActivity.d, HealthDatasActivity.this.c(3), false);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for sleepLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class d implements ClickViewCallback {
        public d() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodPressureLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_BLOODPRESS_2030036.value());
            if (HealthDatasActivity.this.z == null) {
                ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "mContext null");
                return;
            }
            if (fua.p()) {
                Intent intent = new Intent();
                intent.setClassName(HealthDatasActivity.this.z.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
                IntentParams intentParamsBuild = IntentParams.builder().addPageId(ArkUIXConstants.KNIT_BLOOD_PRESSURE).addBuildConfigInfo(CommonUtil.a()).addBiFrom("Today_0001", "home_card", "").build();
                LogUtil.a("UIHLH_HealthDatasActivity", "params start with: ", intentParamsBuild.toString());
                intent.putExtra(com.alipay.sdk.m.s.e.n, intentParamsBuild.toString());
                intent.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 6);
                iov.c(HealthDatasActivity.this.z, intent);
            } else {
                HealthDatasActivity.this.z.startActivity(new Intent(HealthDatasActivity.this.z, (Class<?>) KnitBloodPressureActivity.class));
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodPressureLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class c implements ClickViewCallback {
        public c() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodSugarLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_BLOODSUGAR_2030037.value());
            if (HealthDatasActivity.this.z != null) {
                HealthDataDetailActivity.a(HealthDatasActivity.this.z, "BloodSugarCardConstructor", 8);
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodSugarLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class a implements ClickViewCallback {
        public a() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for PhysiologicalCycle begin");
            LoginInit.getInstance(HealthDatasActivity.this.z).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.a.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        HealthDatasActivity.this.x();
                    } else {
                        LogUtil.j("UIHLH_HealthDatasActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
                    }
                }
            }, AnalyticsValue.HEALTH_HOME_PHYSIOLOGICAL_CYCLE_CARD_2010102.value());
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for PhysiologicalCycle end");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        v();
    }

    private void v() {
        pez.d().launchActivity(BaseApplication.getContext(), new Intent(), new AppBundleLauncher.InstallCallback() { // from class: upc
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public final boolean call(Context context, Intent intent) {
                return this.f50437a.c(context, intent);
            }
        });
    }

    public /* synthetic */ boolean c(Context context, Intent intent) {
        LogUtil.a("UIHLH_HealthDatasActivity", "InstallCallback");
        w();
        return false;
    }

    private void w() {
        StringBuilder sb = new StringBuilder("#/?from=1");
        if (f() == 1) {
            sb.append("&isActived=true");
        } else {
            sb.append("&isActived=false");
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(sb.toString());
        ddv.b().initH5Pro();
        builder.setImmerse().showStatusBar().setForceDarkMode(1).setStatusBarTextBlack(true).enableOnPauseCallback().enableOnResumeCallback().setNeedSoftInputAdapter();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("menstrual", MenstrualModule.class);
        ddv.b().loadH5ProApp(this.z, "com.huawei.health.h5.cycle-calendar", builder);
    }

    private int f() {
        HiUserPreference userPreference = HiHealthManager.d(this.z).getUserPreference("com.huawei.health.mc");
        if (userPreference == null || HiCommonUtil.a(userPreference.getValue())) {
            LogUtil.j("UIHLH_HealthDatasActivity", "MENSTRUAL_CONFIG_KEY is null!");
            return 0;
        }
        try {
            return new JSONObject(userPreference.getValue()).getInt("masterSwitch");
        } catch (JSONException unused) {
            ReleaseLogUtil.b("UIHLH_HealthDatasActivity", "getMenstrualActiveState JSONException");
            return 0;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class r implements ClickViewCallback {
        public r() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for mTemperatureLayout begin");
            HealthDatasActivity.this.e(AnalyticsValue.TEMPERATURE_2060073.value(), 1);
            Intent intent = new Intent(HealthDatasActivity.this.z, (Class<?>) KnitTemperatureActivity.class);
            intent.putExtra("key_bundle_health_last_data_time", HealthDatasActivity.this.c(8));
            iov.d(HealthDatasActivity.this.z, intent);
            qrs.ae(HealthDatasActivity.this.z);
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for mTemperatureLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class b implements ClickViewCallback {
        public b() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodOxygenLayout begin");
            HealthDatasActivity.this.a(AnalyticsValue.HEALTH_HEALTH_HEALTHDATA_BLOOD_OXYGEN_2030062.value());
            KnitBloodOxygenDetailActivity.c(HealthDatasActivity.this.z, HealthDatasActivity.this.c(7));
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for bloodOxygenLayout end");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class p implements ClickViewCallback {
        public p() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for vo2MaxLayout begin");
            if (HealthDatasActivity.this.z == null || qrs.c(500)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "startActivity for vo2MaxLayout mContext is null or fast click");
                return;
            }
            HealthDatasActivity.d(1, 2);
            Intent intent = new Intent();
            if (HealthDatasActivity.f) {
                intent.setClass(HealthDatasActivity.this.z, Vo2maxActivity.class);
                if (HealthDatasActivity.this.ci != 0) {
                    intent.putExtra("vo2max_value", HealthDatasActivity.this.ci);
                    intent.putExtra("vo2max_time", HealthDatasActivity.this.cg);
                }
            } else {
                intent.setClass(HealthDatasActivity.this.z, AthleticAbilityEmptyActivity.class);
                intent.putExtra("athletic_ability_empty_flag", "vo_to_max_no_record");
            }
            HealthDatasActivity.this.z.startActivity(intent);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class n implements ClickViewCallback {
        private n() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for RunningDataLayout begin");
            if (HealthDatasActivity.this.z == null || qrs.c(500)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "startActivity for RunningDataLayout mContext is null or fast click");
                return;
            }
            HealthDatasActivity.d(3, 2);
            if (!jcg.c(HealthDatasActivity.this.z) || HealthDatasActivity.this.ah == 2) {
                Intent intent = new Intent(HealthDatasActivity.this.z, (Class<?>) RqNoNetworkActivity.class);
                intent.putExtra("title_name", HealthDatasActivity.this.getString(R.string.IDS_data_running_index_title_outside));
                HealthDatasActivity.this.z.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent(HealthDatasActivity.this.z, (Class<?>) RunningDataActivity.class);
            if (HealthDatasActivity.f27467a) {
                intent2.setClass(HealthDatasActivity.this.z, RunningDataActivity.class);
                intent2.putExtra("running_level_data", HealthDatasActivity.this.bd);
                intent2.putExtra("vo2max_value", HealthDatasActivity.this.ci);
            } else {
                intent2.setClass(HealthDatasActivity.this.z, AthleticAbilityEmptyActivity.class);
                intent2.putExtra("athletic_ability_empty_flag", "running_no_record");
            }
            HealthDatasActivity.this.z.startActivity(intent2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class k implements ClickViewCallback {
        private k() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for StateIndexLayout begin");
            if (HealthDatasActivity.this.z == null || qrs.c(500)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "startActivity for StateIndexLayout mContext is null or fast click");
                return;
            }
            HealthDatasActivity.d(2, 2);
            if (!jcg.c(HealthDatasActivity.this.z) || HealthDatasActivity.this.ah == 2) {
                Intent intent = new Intent(HealthDatasActivity.this.z, (Class<?>) RqNoNetworkActivity.class);
                intent.putExtra("title_name", HealthDatasActivity.this.getString(R.string.IDS_data_state_index_title));
                HealthDatasActivity.this.z.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent();
            if (HealthDatasActivity.h) {
                intent2.setClass(HealthDatasActivity.this.z, StateIndexActivity.class);
                intent2.putExtra("state_index_level_data", HealthDatasActivity.this.bd);
            } else {
                intent2.setClass(HealthDatasActivity.this.z, AthleticAbilityEmptyActivity.class);
                intent2.putExtra("athletic_ability_empty_flag", "state_no_record");
            }
            HealthDatasActivity.this.z.startActivity(intent2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class e implements ClickViewCallback {
        private e() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for AchievementLayout begin");
            if (HealthDatasActivity.this.z == null || qrs.c(500)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "startActivity for AchievementLayout mContext is null or fast click");
                return;
            }
            Intent intent = new Intent(HealthDatasActivity.this.z, (Class<?>) AchievementPredictionActivity.class);
            intent.putExtra("running_level_data", HealthDatasActivity.this.bd);
            intent.putExtra("vo2max_value", HealthDatasActivity.this.ci);
            HealthDatasActivity.this.z.startActivity(intent);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class m implements ClickViewCallback {
        public m() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for LacticLayout begin");
            if (HealthDatasActivity.this.z != null && !qrs.c(500)) {
                if (jcg.c(HealthDatasActivity.this.z) && HealthDatasActivity.this.ah != 2) {
                    if (HealthDatasActivity.f27469c) {
                        LacticActivity.c(HealthDatasActivity.this.z, HealthDatasActivity.this.c(10));
                        LogUtil.a("UIHLH_HealthDatasActivity", "startLacticActivity for LacticLayout end");
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setClass(HealthDatasActivity.this.z, AthleticAbilityEmptyActivity.class);
                    intent.putExtra("athletic_ability_empty_flag", "running_lactic_no_record");
                    HealthDatasActivity.this.z.startActivity(intent);
                    LogUtil.a("UIHLH_HealthDatasActivity", "startAthleticAbilityEmptyActivity for LacticLayout end");
                    return;
                }
                Intent intent2 = new Intent(HealthDatasActivity.this.z, (Class<?>) RqNoNetworkActivity.class);
                intent2.putExtra("title_name", qre.f(R.string.IDS_running_lactate_threshold));
                HealthDatasActivity.this.z.startActivity(intent2);
                return;
            }
            LogUtil.j("UIHLH_HealthDatasActivity", "startActivity for LacticLayout mContext is null or fast click");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class t implements ClickViewCallback {
        public t() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            if (HealthDatasActivity.this.z == null) {
                ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "startActivity for stressLayout mContext is null");
                return;
            }
            Bundle bundle = new Bundle();
            if (HealthDatasActivity.this.i) {
                bundle.putLong("lastDataTime", HealthDatasActivity.this.c(6));
            }
            bundle.putBoolean("pressure_is_have_datas", HealthDatasActivity.this.i);
            uye.a(HealthDatasActivity.this.z, bundle);
            LogUtil.a("UIHLH_HealthDatasActivity", "startActivity for stressLayout isHaveStressData ", Boolean.valueOf(HealthDatasActivity.this.i));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class h implements ClickViewCallback {
        public h() {
        }

        @Override // com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ClickViewCallback
        public void startActivity() {
            HealthDatasActivity.d(ppv.f45787b, 2);
            ppv.e(HealthDatasActivity.this.z, 2);
        }
    }

    private void m() {
        LogUtil.a("UIHLH_HealthDatasActivity", "initClickViewMap begin");
        this.az = new HashMap<View, ClickViewCallback>(16) { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.3
            private static final long serialVersionUID = 6568366952987213870L;

            {
                put(HealthDatasActivity.this.bn, HealthDatasActivity.this.new o());
                put(HealthDatasActivity.this.ai, HealthDatasActivity.this.new f());
                put(HealthDatasActivity.this.ab, HealthDatasActivity.this.new g());
                put(HealthDatasActivity.this.v, HealthDatasActivity.this.new i());
                put(HealthDatasActivity.this.s, HealthDatasActivity.this.new j());
                put(HealthDatasActivity.this.ck, HealthDatasActivity.this.new s());
                put(HealthDatasActivity.this.bm, HealthDatasActivity.this.new l());
                put(HealthDatasActivity.this.r, HealthDatasActivity.this.new d());
                put(HealthDatasActivity.this.q, HealthDatasActivity.this.new c());
                put(HealthDatasActivity.this.ba, HealthDatasActivity.this.new a());
                put(HealthDatasActivity.this.by, HealthDatasActivity.this.new r());
                put(HealthDatasActivity.this.cd, HealthDatasActivity.this.new p());
                put(HealthDatasActivity.this.be, new n());
                put(HealthDatasActivity.this.bp, new k());
                put(HealthDatasActivity.this.n, new e());
                put(HealthDatasActivity.this.ao, HealthDatasActivity.this.new m());
                put(HealthDatasActivity.this.bu, HealthDatasActivity.this.new t());
                put(HealthDatasActivity.this.k, HealthDatasActivity.this.new b());
                put(HealthDatasActivity.this.al, HealthDatasActivity.this.new h());
            }
        };
        LogUtil.a("UIHLH_HealthDatasActivity", "initClickViewMap end");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("UIHLH_HealthDatasActivity", "onClick begin");
        if (this.az.get(view) != null) {
            this.az.get(view).startActivity();
        } else {
            LogUtil.e("UIHLH_HealthDatasActivity", "mMapClickCallback.get(view) is NULL");
        }
        LogUtil.a("UIHLH_HealthDatasActivity", "onClick end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        LogUtil.a("UIHLH_HealthDatasActivity", "startStepsActivity begin");
        if (this.bq < 0.01d && this.bo == 3) {
            Toast.makeText(this.z, this.z.getString(R.string.IDS_hwh_home_hardware_limit_no_step_detail_data_tips), 0).show();
        } else {
            a(AnalyticsValue.HEALTH_HEALTH_FITNESSDATA_STEPS_2030004.value());
            this.aq.e((IFlushResult) null);
            Intent intent = new Intent(this.z, (Class<?>) FitnessStepDetailActivity.class);
            intent.putExtra("today_current_steps_total", this.bq);
            this.z.startActivity(intent);
        }
        LogUtil.a("UIHLH_HealthDatasActivity", "startStepsActivity end");
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class x extends BaseHandler<HealthDatasActivity> {
        x(HealthDatasActivity healthDatasActivity) {
            super(healthDatasActivity);
        }

        private String a(String str, String str2) {
            return str + " " + str2;
        }

        private String d(Context context, String str) {
            if (!LanguageUtil.l(context)) {
                return str;
            }
            return str + " ";
        }

        private void n(HealthDatasActivity healthDatasActivity, Message message) {
            healthDatasActivity.ac.setVisibility(0);
            healthDatasActivity.bw.setVisibility(0);
            healthDatasActivity.aa.setVisibility(0);
            new DecimalFormat("#0").setRoundingMode(RoundingMode.HALF_UP);
            if (message.obj instanceof Bundle) {
                Bundle bundle = (Bundle) message.obj;
                healthDatasActivity.bq = bundle.getInt("step");
                healthDatasActivity.x = bundle.getInt("carior");
                healthDatasActivity.an = bundle.getInt("floor");
                healthDatasActivity.ae = bundle.getInt("distance");
            }
            healthDatasActivity.d(healthDatasActivity.ae);
            healthDatasActivity.e(healthDatasActivity.an);
            if (healthDatasActivity.bo != 3 || healthDatasActivity.bq >= 0.01d) {
                healthDatasActivity.bw.setVisibility(0);
                healthDatasActivity.bv.setText(UnitUtil.e(healthDatasActivity.bq, 1, 0));
            } else {
                healthDatasActivity.bv.setText("--");
                healthDatasActivity.bw.setVisibility(8);
            }
            healthDatasActivity.u.setText(UnitUtil.e(((double) healthDatasActivity.x) / 1000.0d, 1, 0));
            LogUtil.d("UIHLH_HealthDatasActivity", "get Steps calorie and floor", Integer.valueOf(healthDatasActivity.bq), Integer.valueOf(healthDatasActivity.x), Integer.valueOf(healthDatasActivity.an));
        }

        private void k(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof List)) {
                healthDatasActivity.cj.setText("--");
                return;
            }
            List list = (List) message.obj;
            if (njy.e(list)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshWeight no data");
                healthDatasActivity.cj.setText("--");
                return;
            }
            uwh uwhVar = (uwh) ((ArrayList) list.get(0)).get(0);
            int iB = uwhVar.b();
            if (UnitUtil.f()) {
                double dH = UnitUtil.h(uwhVar.m());
                healthDatasActivity.cj.setText(a(UnitUtil.e(dH, 1, vei.d(dH, iB)), healthDatasActivity.getString(R.string.IDS_lbs)));
            } else {
                double dM = uwhVar.m();
                int iD = vei.d(dM, iB);
                healthDatasActivity.cj.setText(vei.b(UnitUtil.b(dM, iD), iD));
            }
        }

        private void a(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof List)) {
                healthDatasActivity.p.setText("--");
                return;
            }
            List list = (List) message.obj;
            if (njy.e(list)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshBloodPressure no data");
                healthDatasActivity.p.setText("--");
                return;
            }
            healthDatasActivity.p.setText(a(UnitUtil.e((int) ((HiHealthData) list.get(0)).getDouble("BLOOD_PRESSURE_SYSTOLIC"), 1, 0) + "/" + UnitUtil.e((int) ((HiHealthData) list.get(0)).getDouble("BLOOD_PRESSURE_DIASTOLIC"), 1, 0), healthDatasActivity.getString(R.string.IDS_device_measure_pressure_value_unit)));
        }

        private void e(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof HiHealthData)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshBloodSugar no data");
                healthDatasActivity.t.setText("--");
            } else {
                HiHealthData hiHealthData = (HiHealthData) message.obj;
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshBloodSugar: last time ", Long.valueOf(hiHealthData.getEndTime()));
                healthDatasActivity.t.setText(a(UnitUtil.e(hiHealthData.getValue(), 1, 1), healthDatasActivity.getString(R.string.IDS_device_measure_sugar_value_unit)));
            }
        }

        private void m(HealthDatasActivity healthDatasActivity, Message message) {
            if (message.obj instanceof String) {
                healthDatasActivity.bh.setText((String) message.obj);
            } else {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshPhysiologicalCycle no data");
                healthDatasActivity.bh.setText("--");
            }
        }

        private void h(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof GetLoadPeakRsp)) {
                LogUtil.j("UIHLH_HealthDatasActivity", "msg.obj is not instanceof GetLoadPeakRsp");
                a(healthDatasActivity);
                return;
            }
            Map<String, List<LoadPeakDataContainer>> data = ((GetLoadPeakRsp) message.obj).getData();
            if (data == null || njy.e(data.values())) {
                a(healthDatasActivity);
                LogUtil.j("UIHLH_HealthDatasActivity", "handleMessageMsgRefreshLoadPeakData no valid data");
                return;
            }
            long trainingLoads = 0;
            for (List<LoadPeakDataContainer> list : data.values()) {
                if (njy.e(list) || list.get(0) == null || list.get(0).getFields() == null) {
                    LogUtil.j("UIHLH_HealthDatasActivity", "handleMessageMsgRefreshLoadPeakData data: ", data.toString());
                } else {
                    try {
                        LoadPeakData loadPeakData = (LoadPeakData) qqt.e(list.get(0).getFields(), LoadPeakData.class);
                        if (loadPeakData != null) {
                            trainingLoads += (long) loadPeakData.getTrainingLoads();
                        }
                    } catch (JsonSyntaxException e) {
                        LogUtil.e("UIHLH_HealthDatasActivity", "handleMessageMsgRefreshLoadPeakData JsonSyntaxException, e is ", e.getMessage());
                    }
                }
            }
            if (trainingLoads <= 0) {
                a(healthDatasActivity);
                return;
            }
            healthDatasActivity.ay.setText(UnitUtil.e(trainingLoads, 1, 0));
            healthDatasActivity.bb.setVisibility(8);
        }

        private void a(HealthDatasActivity healthDatasActivity) {
            healthDatasActivity.ay.setText("--");
            healthDatasActivity.bb.setVisibility(8);
        }

        private void o(HealthDatasActivity healthDatasActivity, Message message) {
            healthDatasActivity.ba.setVisibility(8);
        }

        private void f(HealthDatasActivity healthDatasActivity, Message message) {
            if (message.arg1 == 1) {
                boolean unused = HealthDatasActivity.e = true;
            } else {
                boolean unused2 = HealthDatasActivity.e = false;
            }
            if (message.obj != null) {
                boolean unused3 = HealthDatasActivity.f27468b = true;
                int iFloor = (int) Math.floor(((Integer) message.obj).intValue() / 60.0f);
                int iFloor2 = (int) Math.floor(((Integer) message.obj).intValue() % 60.0f);
                String strE = UnitUtil.e(iFloor, 1, 0);
                String strE2 = UnitUtil.e(iFloor2, 1, 0);
                Resources resources = healthDatasActivity.getResources();
                String quantityString = !"0".equals(strE) ? resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_unit, iFloor, d(healthDatasActivity, strE)) : null;
                String quantityString2 = resources.getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_min_unit, iFloor2, d(healthDatasActivity, strE2));
                if (StringUtils.g(quantityString)) {
                    healthDatasActivity.bk.setText(quantityString2);
                    return;
                } else {
                    healthDatasActivity.bk.setText(resources.getString(com.huawei.ui.commonui.R.string.IDS_two_parts, d(healthDatasActivity, quantityString), quantityString2));
                    return;
                }
            }
            LogUtil.a("UIHLH_HealthDatasActivity", "refreshSleep no data");
            boolean unused4 = HealthDatasActivity.f27468b = false;
            healthDatasActivity.bk.setText("--");
        }

        private void j(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof List)) {
                healthDatasActivity.y.setText("--");
                return;
            }
            List list = (List) message.obj;
            if (njy.e(list)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshHeartRate no data");
                healthDatasActivity.y.setText("--");
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            double d = hiHealthData.getDouble("heart_rate_last");
            healthDatasActivity.ax.put(4, Long.valueOf(hiHealthData.getStartTime()));
            if (d < 0.01d) {
                healthDatasActivity.y.setText("--");
                return;
            }
            String strA = a(UnitUtil.e(d, 1, 0), healthDatasActivity.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            healthDatasActivity.w.setText(healthDatasActivity.getString(R.string.IDS_hw_health_show_healthdata_heart_bmp));
            healthDatasActivity.y.setText(strA);
        }

        private void s(HealthDatasActivity healthDatasActivity, Message message) {
            if (message.obj == null) {
                healthDatasActivity.at.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.av.setVisibility(8);
                boolean unused = HealthDatasActivity.f27469c = false;
            } else {
                if (message.obj instanceof LacticBasic) {
                    healthDatasActivity.at.setText(a((LacticBasic) message.obj));
                    healthDatasActivity.av.setVisibility(0);
                }
                boolean unused2 = HealthDatasActivity.f27469c = true;
            }
        }

        private String a(LacticBasic lacticBasic) {
            StringBuilder sb = new StringBuilder();
            int lthrHr = lacticBasic.getLthrHr();
            float lthrPace = lacticBasic.getLthrPace();
            if (lthrHr == 0) {
                sb.append("--");
            } else {
                sb.append(UnitUtil.e(lthrHr, 1, 0));
            }
            sb.append("/");
            if (lthrPace == 0.0f) {
                sb.append("--");
            } else {
                if (UnitUtil.f()) {
                    lthrPace = (float) UnitUtil.c(lthrPace, 3);
                }
                sb.append(qpe.c(lthrPace));
            }
            return sb.toString();
        }

        private void t(HealthDatasActivity healthDatasActivity, Message message) {
            HealthTextView healthTextView = healthDatasActivity.am;
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "handlerMessageMsgRefreshFtpData");
            if (message.obj instanceof Double) {
                int iRound = (int) Math.round(((Double) message.obj).doubleValue());
                qsp.b(healthTextView, qre.e(R.plurals.IDS_track_ftp_unit, iRound, Integer.valueOf(iRound)));
            } else {
                qsp.b(healthTextView, healthDatasActivity.getString(R.string.IDS_rq_no_record));
            }
        }

        private void q(HealthDatasActivity healthDatasActivity, Message message) {
            if (message.obj == null) {
                healthDatasActivity.bl.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.bf.setVisibility(8);
                healthDatasActivity.br.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.bj.setVisibility(8);
                boolean unused = HealthDatasActivity.f27467a = false;
                boolean unused2 = HealthDatasActivity.h = false;
                return;
            }
            if (message.obj instanceof GetRunLevelRsp) {
                healthDatasActivity.ak = (GetRunLevelRsp) message.obj;
                healthDatasActivity.bd = wka.c(healthDatasActivity.ak);
                UserRunLevelData userRunLevelData = healthDatasActivity.ak.getUserRunLevelData();
                d(healthDatasActivity, userRunLevelData);
                e(healthDatasActivity, userRunLevelData);
            }
        }

        private void d(HealthDatasActivity healthDatasActivity, UserRunLevelData userRunLevelData) {
            String strB;
            if (userRunLevelData == null) {
                healthDatasActivity.bl.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.bf.setVisibility(8);
                boolean unused = HealthDatasActivity.f27467a = false;
                return;
            }
            UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
            if (userInfo == null) {
                userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
            }
            if (userInfo.getGender() == 0) {
                strB = wka.i(userRunLevelData.getLastCurrentRunLevel());
            } else {
                strB = wka.b(userRunLevelData.getLastCurrentRunLevel());
            }
            if ("--".equals(strB) || userRunLevelData.getLastCurrentRunLevel() == 0.0f) {
                healthDatasActivity.bl.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.bf.setVisibility(8);
                boolean unused2 = HealthDatasActivity.f27467a = false;
            } else {
                healthDatasActivity.bf.setVisibility(0);
                healthDatasActivity.bl.setText(UnitUtil.e(userRunLevelData.getLastCurrentRunLevel(), 1, 1));
                healthDatasActivity.bf.setText(healthDatasActivity.getString(R.string.IDS_motiontrack_show_chart_unit_string, new Object[]{strB}));
                boolean unused3 = HealthDatasActivity.f27467a = true;
            }
        }

        private void e(HealthDatasActivity healthDatasActivity, UserRunLevelData userRunLevelData) {
            String strE;
            if (userRunLevelData == null || userRunLevelData.getLastCurrentRunLevel() <= 0.0f) {
                healthDatasActivity.br.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.bj.setVisibility(8);
                boolean unused = HealthDatasActivity.h = false;
                return;
            }
            float lastCondition = userRunLevelData.getLastCondition();
            if (LanguageUtil.x(BaseApplication.getContext()) && lastCondition < 0.0f) {
                LogUtil.a("UIHLH_HealthDatasActivity", "enter isFarsiLanguage");
                strE = UnitUtil.e(-lastCondition, 1, 1) + Constants.LINK;
            } else {
                strE = UnitUtil.e(lastCondition, 1, 1);
            }
            healthDatasActivity.br.setText(strE);
            healthDatasActivity.bj.setVisibility(0);
            healthDatasActivity.bj.setText(healthDatasActivity.getString(R.string.IDS_motiontrack_show_chart_unit_string, new Object[]{wka.g(userRunLevelData.getLastCondition())}));
            boolean unused2 = HealthDatasActivity.h = true;
        }

        private void l(HealthDatasActivity healthDatasActivity, Message message) {
            if (message.obj == null) {
                healthDatasActivity.ce.setText(healthDatasActivity.getString(R.string.IDS_rq_no_record));
                healthDatasActivity.cc.setVisibility(8);
                boolean unused = HealthDatasActivity.f = false;
            } else {
                Vo2maxDetail vo2maxDetail = (Vo2maxDetail) message.obj;
                healthDatasActivity.ci = vo2maxDetail.getVo2maxValue();
                healthDatasActivity.cg = vo2maxDetail.getTimestamp();
                healthDatasActivity.ce.setText(UnitUtil.e(healthDatasActivity.ci, 1, 0));
                healthDatasActivity.cc.setVisibility(0);
                boolean unused2 = HealthDatasActivity.f = true;
            }
        }

        private void g(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof HiStressMetaData)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshStress no data");
                healthDatasActivity.bz.setText("--");
                return;
            }
            HiStressMetaData hiStressMetaData = (HiStressMetaData) message.obj;
            healthDatasActivity.ax.put(6, Long.valueOf(hiStressMetaData.fetchStressStartTime()));
            int iFetchStressScore = hiStressMetaData.fetchStressScore();
            boolean z = iFetchStressScore > 0 && iFetchStressScore < 100;
            String strA = wvb.a(iFetchStressScore);
            if (!z || StringUtils.g(strA)) {
                healthDatasActivity.bz.setText("--");
            } else {
                healthDatasActivity.bz.setText(a(UnitUtil.e(iFetchStressScore, 1, 0), strA));
            }
        }

        private void b(HealthDatasActivity healthDatasActivity, Message message) {
            if (!(message.obj instanceof List)) {
                healthDatasActivity.m.setText("--");
                return;
            }
            List list = (List) message.obj;
            if (njy.e(list)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshBloodOxygen no data");
                healthDatasActivity.m.setText("--");
                return;
            }
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            double intValue = hiHealthData.getIntValue();
            healthDatasActivity.ax.put(7, Long.valueOf(hiHealthData.getStartTime()));
            if (intValue < 0.01d) {
                healthDatasActivity.m.setText("--");
            } else {
                healthDatasActivity.m.setText(UnitUtil.e(intValue, 2, 0));
            }
        }

        private void i(HealthDatasActivity healthDatasActivity, Message message) {
            String strA;
            if (!(message.obj instanceof List)) {
                healthDatasActivity.bx.setText("--");
                return;
            }
            List list = (List) message.obj;
            LogUtil.a("UIHLH_HealthDatasActivity", "handleMessageMsgRefreshTemperature temperatureList ", list.toString());
            if (njy.e(list)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "refreshTemperatureView no data");
                healthDatasActivity.bx.setText("--");
                return;
            }
            boolean zA = UnitUtil.a();
            String string = zA ? healthDatasActivity.getString(R.string.IDS_settings_health_temperature_unit, new Object[]{""}) : healthDatasActivity.getString(R.string.IDS_temp_unit_fahrenheit, new Object[]{""});
            Collections.sort(list, new Comparator() { // from class: upa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((uwh) obj2).g(), ((uwh) obj).g());
                }
            });
            uwh uwhVar = (uwh) list.get(0);
            float fM = (float) uwhVar.m();
            if (uwhVar.h() == vbr.e) {
                strA = a(vbr.a(zA, fM), string);
            } else {
                if (!zA) {
                    fM = vbr.b(fM);
                }
                strA = a(UnitUtil.e(fM, 1, 1), string);
            }
            healthDatasActivity.bx.setText(strA);
            healthDatasActivity.ax.put(8, Long.valueOf(uwhVar.g()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthDatasActivity healthDatasActivity, Message message) {
            int i = message.what;
            if (i == 14) {
                h(healthDatasActivity, message);
                return;
            }
            if (i == 104) {
                n(healthDatasActivity, message);
                return;
            }
            switch (i) {
                case 0:
                    k(healthDatasActivity, message);
                    break;
                case 1:
                    a(healthDatasActivity, message);
                    break;
                case 2:
                    e(healthDatasActivity, message);
                    break;
                case 3:
                    f(healthDatasActivity, message);
                    break;
                case 4:
                    j(healthDatasActivity, message);
                    break;
                case 5:
                    l(healthDatasActivity, message);
                    break;
                case 6:
                    g(healthDatasActivity, message);
                    break;
                case 7:
                    b(healthDatasActivity, message);
                    break;
                case 8:
                    i(healthDatasActivity, message);
                    break;
                case 9:
                    q(healthDatasActivity, message);
                    break;
                case 10:
                    s(healthDatasActivity, message);
                    break;
                case 11:
                    m(healthDatasActivity, message);
                    break;
                default:
                    d(healthDatasActivity, message);
                    break;
            }
        }

        private void d(HealthDatasActivity healthDatasActivity, Message message) {
            int i = message.what;
            if (i == 12) {
                o(healthDatasActivity, message);
            } else if (i == 13) {
                t(healthDatasActivity, message);
            } else {
                LogUtil.a("UIHLH_HealthDatasActivity", "handleMessageWhenReferenceNotNull default");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        int i3;
        double dE = ((double) i2) / 1000.0d;
        if (UnitUtil.f()) {
            dE = UnitUtil.e(dE, 3);
            this.af.setText(this.z.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en));
        } else {
            this.af.setText(this.z.getResources().getString(R.string.IDS_hw_show_sport_distance_unit));
        }
        if (dE < 1000.0d) {
            i3 = 2;
        } else {
            i3 = (dE < 1000.0d || dE >= 10000.0d) ? 0 : 1;
        }
        this.ag.setText(UnitUtil.e(dE, 1, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        double d2;
        LogUtil.d("UIHLH_HealthDatasActivity", "setFloorText floors = ", Integer.valueOf(i2));
        if (i2 < 0) {
            i2 = 0;
        }
        this.aa.setVisibility(0);
        if (UnitUtil.f()) {
            d2 = UnitUtil.g(((double) i2) / 10.0d)[0];
            this.aa.setText(this.z.getResources().getString(R.string.IDS_ft));
        } else {
            d2 = ((double) i2) / 10.0d;
            this.aa.setText(this.z.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
        }
        if (i2 > 0) {
            this.ad.setText(a(getApplication(), d2, 1, 1));
        } else if (lro.d() && CommonUtil.bg()) {
            this.ad.setText(a(getApplication(), d2, 1, 1));
        } else {
            this.ad.setText("--");
            this.aa.setVisibility(8);
        }
    }

    private void ad() {
        if (this.au == null) {
            this.au = new LastTimeHealthDataReader<>(this, new ae(this, 2));
        }
        this.au.b(LastTimeHealthDataReader.CardData.BLOOD_SUGAR);
    }

    private void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.ch.e(getApplication(), new long[]{0, jCurrentTimeMillis}, 20, this.cl);
        this.ch.b(this.o);
        ad();
        ae();
        af();
        this.ch.a(getApplication(), 0L, jCurrentTimeMillis, this.as);
        ad adVar = new ad(this);
        this.cf = adVar;
        this.ch.c(adVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: uow
            @Override // java.lang.Runnable
            public final void run() {
                this.f50433c.i();
            }
        });
        ThreadPoolManager.c().execute(new Runnable() { // from class: uox
            @Override // java.lang.Runnable
            public final void run() {
                this.f50434c.z();
            }
        });
        ThreadPoolManager.c().execute(new Runnable() { // from class: uov
            @Override // java.lang.Runnable
            public final void run() {
                this.f50432c.ac();
            }
        });
        ppv.d().d(new y(this));
        this.ch.c(getApplication(), 0L, jCurrentTimeMillis, this.l);
        ah();
        aa();
    }

    public /* synthetic */ void i() {
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        new jyd().c((Context) this, iB, iB, 0, (IBaseResponseCallback) new ac(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class z implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HealthDatasActivity> f27494a;

        z(HealthDatasActivity healthDatasActivity) {
            this.f27494a = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HealthDatasActivity healthDatasActivity = this.f27494a.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                ReleaseLogUtil.b("UIHLH_HealthDatasActivity", "LoadPeakCallback activity or mHandler is null");
            } else {
                if (i == 0) {
                    Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(14);
                    messageObtainMessage.obj = obj;
                    healthDatasActivity.ar.sendMessage(messageObtainMessage);
                    return;
                }
                healthDatasActivity.ar.sendEmptyMessage(14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        z zVar = new z(this);
        new jyd().d(this, DateFormatUtil.a(lsl.e(System.currentTimeMillis(), 2, 0)), DateFormatUtil.a(System.currentTimeMillis()), 300010, zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        new jyd().b(this, new w(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class y implements ResultCallback<pqd> {
        private WeakReference<HealthDatasActivity> d;

        public y(HealthDatasActivity healthDatasActivity) {
            this.d = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.networkclient.ResultCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(pqd pqdVar) {
            final HealthDatasActivity healthDatasActivity = this.d.get();
            if (healthDatasActivity == null) {
                ReleaseLogUtil.b("UIHLH_HealthDatasActivity", "FtpRecordDataCallback activity null");
                return;
            }
            pqe pqeVarD = pqdVar.d();
            if (pqeVarD != null) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(13);
                messageObtainMessage.obj = Double.valueOf(pqeVarD.d());
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                return;
            }
            HandlerExecutor.c(new Runnable() { // from class: upe
                @Override // java.lang.Runnable
                public final void run() {
                    HealthDatasActivity.y.c(healthDatasActivity);
                }
            });
        }

        public static /* synthetic */ void c(HealthDatasActivity healthDatasActivity) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "FtpRecordDataCallback ftpRecord null");
            qsp.b(healthDatasActivity.am, healthDatasActivity.getString(R.string.IDS_rq_no_record));
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.a("UIHLH_HealthDatasActivity", "FtpRecordDataCallback onFailure");
        }
    }

    private void ah() {
        this.ch.a(this.ca);
    }

    private void aa() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        this.aj = userInfo.getGender();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{47401});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).b(HiJsonUtil.d(new HiDataFilter(new HiDataFilter.DataFilterExpression(47401, "=", 101.0d)))).b();
        LogUtil.a("UIHLH_HealthDatasActivity", "requestLastData : ", hiDataReadProOptionB.toString());
        HiHealthNativeApi.a(this.z).readHiHealthDataPro(hiDataReadProOptionB, new q(this, 1));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class w implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<HealthDatasActivity> f27493c;

        w(HealthDatasActivity healthDatasActivity) {
            this.f27493c = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "LatestLacticDataCallback onResponse errorCode : ", Integer.valueOf(i));
            HealthDatasActivity healthDatasActivity = this.f27493c.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                return;
            }
            healthDatasActivity.ah = i;
            if (i == 0) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(10);
                messageObtainMessage.obj = obj;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                return;
            }
            healthDatasActivity.ar.sendEmptyMessage(10);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ac implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<HealthDatasActivity> f27476a;

        ac(HealthDatasActivity healthDatasActivity) {
            this.f27476a = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) {
            HealthDatasActivity healthDatasActivity = this.f27476a.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                return;
            }
            if (i == 200) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(9);
                healthDatasActivity.ah = i;
                messageObtainMessage.obj = obj;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.HealthDatasActivity.ac.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Object obj2 = obj;
                        if (obj2 instanceof GetRunLevelRsp) {
                            ac.this.e((GetRunLevelRsp) obj2);
                        }
                    }
                });
                return;
            }
            healthDatasActivity.ah = i;
            healthDatasActivity.ar.sendEmptyMessage(9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(GetRunLevelRsp getRunLevelRsp) {
            LogUtil.a("UIHLH_HealthDatasActivity", "enter sendRqDataToDevice");
            if (!RqDataPushReceiver.checkDeviceRqDataCapability()) {
                ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "sendRqDataToDevice failed with device not support");
                return;
            }
            gzp gzpVar = new gzp();
            Map<Integer, RunLevelDetail> data = getRunLevelRsp.getData();
            UserRunLevelData userRunLevelData = getRunLevelRsp.getUserRunLevelData();
            if (data == null || userRunLevelData == null) {
                LogUtil.e("UIHLH_HealthDatasActivity", "runLevelDetails or userRunLevelData is null");
                return;
            }
            gzpVar.e(data);
            gzpVar.e(userRunLevelData);
            gzpVar.b((int) (System.currentTimeMillis() / 1000));
            new jyd().d(BaseApplication.getContext(), ieg.b(new Date(System.currentTimeMillis())), gzpVar);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ad implements IBaseResponseCallback {
        private WeakReference<HealthDatasActivity> e;

        ad(HealthDatasActivity healthDatasActivity) {
            this.e = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "myMaxReadComplete onResponse errorCode : ", Integer.valueOf(i));
            HealthDatasActivity healthDatasActivity = this.e.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                return;
            }
            if (i == 0) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(5);
                messageObtainMessage.obj = obj;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                return;
            }
            healthDatasActivity.ar.sendEmptyMessage(5);
        }
    }

    private void af() {
        HiDataReadOption hiDataReadOptionN = n();
        this.bs = new ah(this);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthData(hiDataReadOptionN, this.bs);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ah implements HiDataReadResultListener {
        private WeakReference<HealthDatasActivity> e;

        ah(HealthDatasActivity healthDatasActivity) {
            this.e = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "stressReadResult errorCode: ", Integer.valueOf(i), " anchor: ", Integer.valueOf(i2));
            HealthDatasActivity healthDatasActivity = this.e.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                LogUtil.j("UIHLH_HealthDatasActivity", "activity is null");
                return;
            }
            if (i == 0) {
                if (!(obj instanceof SparseArray)) {
                    healthDatasActivity.ar.obtainMessage(6, null).sendToTarget();
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("UIHLH_HealthDatasActivity", "map.size() <= 0");
                    healthDatasActivity.ar.obtainMessage(6, null).sendToTarget();
                    return;
                }
                Object obj2 = sparseArray.get(2034);
                if (!(obj2 instanceof List)) {
                    healthDatasActivity.ar.obtainMessage(6, null).sendToTarget();
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) ((List) obj2).get(0);
                if (hiHealthData == null) {
                    LogUtil.j("UIHLH_HealthDatasActivity", "data is empty");
                    healthDatasActivity.ar.obtainMessage(6, null).sendToTarget();
                    return;
                }
                HiStressMetaData hiStressMetaData = (HiStressMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiStressMetaData.class);
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage();
                messageObtainMessage.what = 6;
                messageObtainMessage.obj = hiStressMetaData;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.j("UIHLH_HealthDatasActivity", "read failed errorCode is ", Integer.valueOf(i));
            healthDatasActivity.ar.obtainMessage(6, null).sendToTarget();
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("UIHLH_HealthDatasActivity", "onResultIntent", "read failed errorCode is ", Integer.valueOf(i2));
        }
    }

    private HiDataReadOption n() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(HiDateUtil.g(System.currentTimeMillis()));
        hiDataReadOption.setType(new int[]{2034});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        return hiDataReadOption;
    }

    private static String a(Context context, double d2, int i2, int i3) {
        if (LanguageUtil.l(context)) {
            return String.valueOf(d2);
        }
        return UnitUtil.e(d2, i2, i3);
    }

    private void ae() {
        LogUtil.a("UIHLH_HealthDatasActivity", "Enter requestCoreSleepSummary!");
        HiAggregateOption hiAggregateOptionJ = j();
        this.bi = new aa(this);
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionJ, this.bi);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class aa implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<HealthDatasActivity> f27475b;

        aa(HealthDatasActivity healthDatasActivity) {
            this.f27475b = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "requestCoreSleepSummary aggregateHiHealthData onResult 1");
            HealthDatasActivity healthDatasActivity = this.f27475b.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                LogUtil.j("UIHLH_HealthDatasActivity", "activity is null");
                return;
            }
            boolean z = true;
            if (njy.e(list)) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = 1;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
                return;
            }
            HiHealthData hiHealthData = list.get(0);
            healthDatasActivity.ax.put(3, Long.valueOf(hiHealthData.getEndTime()));
            boolean z2 = hiHealthData.getInt("core_sleep_shallow_key") > 0 || hiHealthData.getInt("core_sleep_deep_key") > 0 || hiHealthData.getInt("core_sleep_wake_dream_key") > 0;
            int i3 = hiHealthData.getInt("sleep_deep_key");
            int i4 = hiHealthData.getInt("sleep_shallow_key");
            if (i3 <= 0 && i4 <= 0) {
                z = false;
            }
            int i5 = hiHealthData.getInt("sleep_core_sleep_noon_duration_key");
            int i6 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
            int i7 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
            if (z2) {
                i5 += i6;
            } else if (z) {
                i5 = (int) ((i3 / 60.0f) + (i4 / 60.0f));
            } else if (i6 > 0) {
                i5 = i6;
            } else if (i7 > 0) {
                i5 = i7;
            }
            Message messageObtainMessage2 = healthDatasActivity.ar.obtainMessage();
            messageObtainMessage2.what = 3;
            messageObtainMessage2.obj = Integer.valueOf(i5);
            healthDatasActivity.ar.sendMessage(messageObtainMessage2);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.d("UIHLH_HealthDatasActivity", "requestCoreSleepSummary onResult datas = ", list);
        }
    }

    private HiAggregateOption j() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(HiDateUtil.g(System.currentTimeMillis()));
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setType(new int[]{44102, 44103, 44101, 44001, 44002, 44108, 44105, 44109});
        hiAggregateOption.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "sleep_deep_key", "sleep_shallow_key", "sleep_core_sleep_noon_duration_key", "core_sleep_total_sleep_time_key", "data_session_manual_sleep_bed_time_key"});
        return hiAggregateOption;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class af implements CommonUiBaseResponse {
        private int d;
        private WeakReference<HealthDatasActivity> e;

        af(HealthDatasActivity healthDatasActivity, int i) {
            this.e = new WeakReference<>(healthDatasActivity);
            this.d = i;
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "ReadComplete onResponse type: ", Integer.valueOf(this.d));
            HealthDatasActivity healthDatasActivity = this.e.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                return;
            }
            Message messageObtainMessage = healthDatasActivity.ar.obtainMessage();
            messageObtainMessage.what = this.d;
            messageObtainMessage.obj = obj;
            healthDatasActivity.ar.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ae extends af implements IBaseResponseCallback {
        ae(HealthDatasActivity healthDatasActivity, int i) {
            super(healthDatasActivity, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class ab implements IExecuteResult {
        private WeakReference<HealthDatasActivity> d;

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
        }

        ab(HealthDatasActivity healthDatasActivity) {
            this.d = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("UIHLH_HealthDatasActivity", "get today steps success");
            HealthDatasActivity healthDatasActivity = this.d.get();
            if (healthDatasActivity == null || healthDatasActivity.ar == null) {
                LogUtil.j("UIHLH_HealthDatasActivity", "activity is null");
            } else if (obj instanceof Bundle) {
                Message messageObtainMessage = healthDatasActivity.ar.obtainMessage(104);
                messageObtainMessage.obj = obj;
                healthDatasActivity.ar.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long c(int i2) {
        if (this.ax.containsKey(Integer.valueOf(i2))) {
            return this.ax.get(Integer.valueOf(i2)).longValue();
        }
        return 0L;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.ar;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (njy.b(this.cb)) {
            HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.cb, new HiUnSubscribeListener() { // from class: uoy
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z2) {
                    ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(getApplicationContext(), str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i2));
        lmf.d().c(getApplicationContext(), str, map, 0);
    }

    public static void d(int i2, int i3) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("from", Integer.valueOf(i3));
        map.put("type", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SPORT_RECORD_ATHLETIC_ABILITY_CARD_2040192.value(), map, 0);
    }

    private void d(ImageView imageView, int i2) {
        if (LanguageUtil.ba(this.z)) {
            imageView.setBackground(qqz.e(this.z, i2));
        } else {
            imageView.setBackgroundResource(i2);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class q implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27487c;
        private WeakReference<HealthDatasActivity> d;

        q(HealthDatasActivity healthDatasActivity, int i) {
            this.d = new WeakReference<>(healthDatasActivity);
            this.f27487c = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("UIHLH_HealthDatasActivity", "onResult, errorCode: ", Integer.valueOf(i), ", data: ", obj);
            ReleaseLogUtil.c("UIHLH_HealthDatasActivity", "onResult, mType: ", Integer.valueOf(this.f27487c), " errorCode: ", Integer.valueOf(i));
            HealthDatasActivity healthDatasActivity = this.d.get();
            if (healthDatasActivity == null) {
                LogUtil.j("UIHLH_HealthDatasActivity", "reader is null!");
                return;
            }
            if (obj == null) {
                if (healthDatasActivity.aj != 1) {
                    healthDatasActivity.ar.obtainMessage(12, null).sendToTarget();
                    return;
                } else {
                    LogUtil.j("UIHLH_HealthDatasActivity", "data is null!");
                    healthDatasActivity.ar.obtainMessage(11, null).sendToTarget();
                    return;
                }
            }
            if (!(obj instanceof SparseArray)) {
                if (healthDatasActivity.aj != 1) {
                    healthDatasActivity.ar.obtainMessage(12, null).sendToTarget();
                    return;
                } else {
                    healthDatasActivity.ar.obtainMessage(11, null).sendToTarget();
                    return;
                }
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() == 0) {
                if (healthDatasActivity.aj != 1) {
                    healthDatasActivity.ar.obtainMessage(12, null).sendToTarget();
                    return;
                } else {
                    healthDatasActivity.ar.obtainMessage(11, null).sendToTarget();
                    LogUtil.j("UIHLH_HealthDatasActivity", "map.size() == 0");
                    return;
                }
            }
            int i3 = this.f27487c;
            if (i3 == 1) {
                e((HiHealthData) ((List) sparseArray.get(47401)).get(0), healthDatasActivity);
                return;
            }
            if (i3 == 0) {
                List list = (List) sparseArray.get(47401);
                if (HiCommonUtil.b(list)) {
                    return;
                }
                healthDatasActivity.bc = list;
                healthDatasActivity.a((List<HiHealthData>) list);
                return;
            }
            LogUtil.j("UIHLH_HealthDatasActivity", "mType is error");
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("UIHLH_HealthDatasActivity", "onResultIntent : read failed errorCode is", Integer.valueOf(i2));
        }

        private void e(HiHealthData hiHealthData, HealthDatasActivity healthDatasActivity) {
            if (hiHealthData == null || !String.valueOf(hiHealthData.getDouble("point_value")).equals("101.0")) {
                LogUtil.j("UIHLH_HealthDatasActivity", "handleLastData : list is error");
                return;
            }
            long j = hiHealthData.getLong("start_time");
            healthDatasActivity.bg = j;
            healthDatasActivity.a(j + 31104000000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        LogUtil.a("UIHLH_HealthDatasActivity", "requestData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setType(new int[]{47401});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(720);
        LogUtil.a("UIHLH_HealthDatasActivity", "readHiHealthData : ", hiDataReadOption.toString());
        HiHealthNativeApi.a(this.z).readHiHealthData(hiDataReadOption, new q(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list) {
        boolean z2;
        String strValueOf;
        boolean z3;
        int iB;
        LogUtil.a("UIHLH_HealthDatasActivity", "handleData data size ", Integer.valueOf(list.size()));
        c(list);
        long jC = ltb.c(System.currentTimeMillis());
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= list.size()) {
                strValueOf = "101.0";
                i2 = -1;
                z3 = true;
                break;
            } else if (jC == list.get(i2).getStartTime()) {
                strValueOf = String.valueOf(list.get(i2).getDouble("point_value"));
                z3 = false;
                break;
            } else {
                list.get(i2).getStartTime();
                i2++;
            }
        }
        if (z3 || (iB = wuw.b("UIHLH_HealthDatasActivity", list, i2, this.bg)) < 0) {
            z2 = z3;
        } else {
            LogUtil.a("UIHLH_HealthDatasActivity", "handleData lastIndexTemp ", Integer.valueOf(iB), " isLong ", Boolean.valueOf(z3));
        }
        Date date = new Date();
        if (z2) {
            this.ar.obtainMessage(11, null).sendToTarget();
            return;
        }
        date.setTime(System.currentTimeMillis());
        int iE = (i2 - 21) + e(jC);
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                LogUtil.a("UIHLH_HealthDatasActivity", "handleData, time: ", new Date(hiHealthData.getStartTime()), ", type: ", String.valueOf(hiHealthData.getDouble("point_value")));
            }
        }
        if (iE < 0) {
            int i3 = 0;
            while (i3 < Math.abs(iE)) {
                HiHealthData hiHealthData2 = new HiHealthData();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(list.get(0).getStartTime());
                i3++;
                calendar.add(10, i3 * 24);
                hiHealthData2.setStartTime(calendar.getTimeInMillis());
                list.add(0, hiHealthData2);
            }
        }
        if (iE < 0) {
            i2 -= iE;
        }
        Pair<Integer, CharSequence> pairA = wuw.a("UIHLH_HealthDatasActivity", strValueOf, list, i2);
        Message messageObtainMessage = this.ar.obtainMessage(11);
        messageObtainMessage.obj = String.valueOf(pairA.second);
        this.ar.sendMessage(messageObtainMessage);
    }

    private int e(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        return calendar.get(7);
    }

    private void c(List<HiHealthData> list) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                LogUtil.a("UIHLH_HealthDatasActivity", "sortHealthData, time: ", new Date(hiHealthData.getStartTime()), ", type: ", String.valueOf(hiHealthData.getDouble("point_value")));
            }
        }
        if (list == null) {
            return;
        }
        Collections.reverse(list);
        for (int size = list.size() - 1; size > 0 && Math.abs(list.get(size).getDouble("point_value")) < 1.0E-6d; size--) {
            list.remove(size);
        }
        Collections.reverse(list);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class u implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDatasActivity> f27491c;

        u(HealthDatasActivity healthDatasActivity) {
            this.f27491c = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            HealthDatasActivity healthDatasActivity = this.f27491c.get();
            if (healthDatasActivity != null && !healthDatasActivity.isDestroyed() && !healthDatasActivity.isFinishing()) {
                healthDatasActivity.cb = list;
            } else {
                ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "InnerSubscribeListener onResult activity ", healthDatasActivity);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, final String str, HiHealthData hiHealthData, long j) {
            if (i == 103 && "900300050".equals(str)) {
                LogUtil.a("UIHLH_HealthDatasActivity", "InnerSubscribeListener onChange changeKey ", str);
                ThreadPoolManager.c().execute(new Runnable() { // from class: upb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50436a.e(str);
                    }
                });
            }
        }

        public /* synthetic */ void e(String str) {
            xkb.d(str, new v(this.f27491c.get()));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class v implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<HealthDatasActivity> f27492b;

        v(HealthDatasActivity healthDatasActivity) {
            this.f27492b = new WeakReference<>(healthDatasActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("UIHLH_HealthDatasActivity", "InnerSampleConfigListener onResult errorCode ", Integer.valueOf(i), " object ", obj);
            if (i == 0 && wuw.a("UIHLH_HealthDatasActivity", obj) != null) {
                HealthDatasActivity healthDatasActivity = this.f27492b.get();
                if (healthDatasActivity != null && !healthDatasActivity.isDestroyed() && !healthDatasActivity.isFinishing()) {
                    if (!njy.e(healthDatasActivity.bc)) {
                        healthDatasActivity.a((List<HiHealthData>) healthDatasActivity.bc);
                        return;
                    } else {
                        ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "InnerSampleConfigListener onResult activity.mPhysiologicalCycleDataList ", healthDatasActivity.bc);
                        return;
                    }
                }
                ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "InnerSampleConfigListener onResult activity ", healthDatasActivity);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            ReleaseLogUtil.d("UIHLH_HealthDatasActivity", "InnerSampleConfigListener onResultIntent errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3), " intentType ", Integer.valueOf(i), " object ", obj);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

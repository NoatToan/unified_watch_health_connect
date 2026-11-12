package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.ratingbar.HealthStarRatingBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.DaySleepActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepDurationActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepRateActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepScoreTimesActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepTimeActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepViewCallback;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepWeekExpandListProvider;
import com.huawei.ui.main.stories.recommendcloud.util.RecommendControl;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import defpackage.iov;
import defpackage.out;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.ubq;
import defpackage.ucx;
import defpackage.ujk;
import defpackage.wud;
import defpackage.wum;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class CoreSleepServiceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f27242a;
    private View aa;
    private LinearLayout ab;
    private LinearLayout ac;
    private Context ad;
    private LinearLayout ae;
    private HealthTextView af;
    private LinearLayout ag;
    private View ah;
    private HealthRingChart ai;
    private int aj;
    private ImageView ak;
    private HealthTextView al;
    private LinearLayout am;
    private ImageView an;
    private HealthTextView ao;
    private LinearLayout ap;
    private HealthTextView aq;
    private int ar;
    private HealthTextView as;
    private LinearLayout at;
    private ImageView au;
    private int av;
    private HealthTextView aw;
    private HealthTextView ax;
    private HealthTextView ay;
    private ImageView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27243b;
    private LinearLayout ba;
    private HealthTextView bb;
    private HealthTextView bc;
    private int bd;
    private HealthTextView be;
    private ImageView bf;
    private LinearLayout bg;
    private HealthTextView bh;
    private FitnessUtils bi;
    private HealthTextView bj;
    private boolean bk;
    private ujk bl;
    private int bm;
    private boolean bn;
    private LinearLayout bo;
    private boolean bp;
    private boolean bq;
    private ImageView br;
    private HealthTextView bs;
    private ImageView bt;
    private int bu;
    private HealthTextView bv;
    private HealthTextView bw;
    private HealthTextView bx;
    private HealthDivider by;
    private HealthTextView bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27244c;
    private LinearLayout ca;
    private HealthTextView cb;
    private HealthTextView cc;
    private LinearLayout cd;
    private View ce;
    private HealthDivider cf;
    private d cg;
    private HealthTextView ch;
    private String ci;
    private RecommendControl cj;
    private String ck;
    private int cl;
    private HealthStarRatingBar cm;
    private LinearLayout cn;
    private HealthTextView co;
    private HealthTextView cp;
    private View cq;
    private SleepViewCallback cr;
    private LinearLayout cs;
    private SleepTotalData ct;
    private HealthTextView cu;
    private HealthRingChart cv;
    private LinearLayout cw;
    private LinearLayout cx;
    private int cy;
    private HealthTextView cz;
    private HealthTextView d;
    private LinearLayout da;
    private int db;
    private int dc;
    private ImageView dd;
    private HealthTextView de;
    private LinearLayout df;
    private ImageView dg;
    private HealthTextView dh;
    private HealthTextView di;
    private int dj;
    private HealthTextView dk;
    private HealthTextView dn;
    private HealthTextView dp;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private LinearLayout h;
    private ImageView i;
    private HealthTextView j;
    private int k;
    private HealthTextView l;
    private HealthTextView m;
    private LinearLayout n;
    private ImageView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private LinearLayout s;
    private HealthTextView t;
    private LinearLayout u;
    private HealthTextView v;
    private HealthTextView w;
    private LinearLayout x;
    private HealthTextView y;
    private LinearLayout z;

    public CoreSleepServiceView(Context context) {
        super(context, null);
        this.aj = 0;
        this.bn = true;
        this.cy = 0;
        this.av = 0;
        this.cl = 0;
        this.bu = 0;
        this.ar = 0;
        this.k = 0;
        this.dc = 0;
        this.bd = 0;
        this.bm = 0;
        this.db = 0;
        this.dj = 0;
        this.ct = new SleepTotalData();
        this.bp = true;
        this.ck = Constants.LINK;
    }

    public CoreSleepServiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aj = 0;
        this.bn = true;
        this.cy = 0;
        this.av = 0;
        this.cl = 0;
        this.bu = 0;
        this.ar = 0;
        this.k = 0;
        this.dc = 0;
        this.bd = 0;
        this.bm = 0;
        this.db = 0;
        this.dj = 0;
        this.ct = new SleepTotalData();
        this.bp = true;
        this.ck = Constants.LINK;
        this.ad = context;
        if (this.cj == null) {
            this.cj = RecommendControl.newInstance(context);
        }
        this.bl = new ujk();
        this.bi = new FitnessUtils(this.ad);
        this.cg = new d(this);
        View viewInflate = LayoutInflater.from(this.ad).inflate(R.layout.layout_sleep_service_info_layout, (ViewGroup) this, false);
        this.ah = viewInflate;
        addView(viewInflate);
        g(this.ah);
    }

    public void setSleepData(SleepTotalData sleepTotalData, int i, boolean z, String str) {
        LogUtil.a("UIHLH_CoreSleepServiceView", "enter setSleepData() isCoreSleep:", Boolean.valueOf(z));
        if (sleepTotalData == null) {
            LogUtil.j("UIHLH_CoreSleepServiceView", "setSleepData sleepData is null");
            return;
        }
        LogUtil.a("UIHLH_CoreSleepServiceView", "sleepData:", sleepTotalData.toString());
        this.ct = sleepTotalData;
        c(i, z);
        c();
        h();
        this.ci = str;
        if (z) {
            if (i == 1) {
                int deepSleepTime = sleepTotalData.getDeepSleepTime() + sleepTotalData.getShallowSleepTime() + sleepTotalData.getSlumberSleepTime() + sleepTotalData.getNoonSleepTime();
                if (sleepTotalData.getNoonSleepTime() == deepSleepTime && deepSleepTime != 0) {
                    this.bp = false;
                } else {
                    this.bp = true;
                }
            }
            setCoreSleepData(i);
            b(sleepTotalData, i);
            b(i, z);
            return;
        }
        LogUtil.a("R_Sleep_UIHLH_CoreSleepServiceView", "isHasSleepData", Boolean.valueOf(this.bn));
        if (this.bn) {
            e(sleepTotalData, i);
            b(i, z);
        } else {
            i();
        }
    }

    public void setHasSleepData(boolean z) {
        this.bn = ((Boolean) ResultUtils.c(Boolean.valueOf(z))).booleanValue();
    }

    private void setCoreSleepData(int i) {
        int totalSleepTime = this.ct.getTotalSleepTime();
        int deepSleepPart = this.ct.getDeepSleepPart();
        int breathQualityData = this.ct.getBreathQualityData();
        int score = this.ct.getScore();
        int wakeupTimes = this.ct.getWakeupTimes();
        String string = this.ad.getString(R.string.IDS_fitness_core_sleep_night_sleep);
        String string2 = this.ad.getString(R.string.IDS_fitness_core_sleep_deep_sleep_percent);
        String string3 = this.ad.getString(R.string.IDS_fitness_core_sleep_light_sleep_percent);
        String string4 = this.ad.getString(R.string.IDS_fitness_core_sleep_rem_sleep_percent);
        String string5 = this.ad.getString(R.string.IDS_fitness_core_sleep_deep_sleep_continuity);
        String string6 = this.ad.getString(R.string.IDS_details_sleep_sleep_latency_time);
        String string7 = this.ad.getString(R.string.IDS_fitness_core_sleep_rdi_score);
        if (i != 1) {
            totalSleepTime = this.ct.getDailyTotalSleepTime();
            deepSleepPart = this.ct.getDailySleepPart();
            breathQualityData = this.ct.getDailyBreathQuality();
            score = this.ct.getDailyScore();
            wakeupTimes = this.ct.getDailyWakeupTimes();
            string = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_night_sleep);
            string2 = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_deep_sleep_percent);
            string3 = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_light_sleep_percent);
            string4 = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_rem_sleep_percent);
            string5 = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_deep_sleep_continuity);
            string6 = this.ad.getString(R.string.IDS_fitness_core_sleep_sleep_avg_latency_time);
            string7 = this.ad.getString(R.string.IDS_fitness_core_sleep_avg_rdi_score);
        }
        String str = string7;
        String str2 = string6;
        String str3 = string5;
        int i2 = wakeupTimes;
        String str4 = string2;
        int i3 = deepSleepPart;
        String str5 = string3;
        int i4 = breathQualityData;
        if (score == 0) {
            j();
        } else {
            setSleepScoreData(score);
        }
        this.cz.setText(this.ct.getSuggestTitle());
        this.cu.setText(this.ct.getSuggestContent());
        this.ck = wud.b(this.ad);
        String string8 = this.ad.getString(R.string.IDS_sleep_referece_title_string);
        d(totalSleepTime, string, string8);
        d(str4, str5, string4, string8, i);
        String strD = d(string8);
        a(i3, str3, strD);
        d(i4, str, strD, i);
        c(i2, str2, string8);
        b(string8, strD);
        e(string8, strD);
    }

    private void c(int i, boolean z) {
        if (i == 4) {
            this.bk = false;
        } else {
            this.bk = z;
        }
    }

    private void c() {
        if (Utils.o()) {
            return;
        }
        this.ba.setVisibility(0);
        if (this.bq) {
            LogUtil.j("UIHLH_CoreSleepServiceView", "setDefaultFold expanded");
            setExpand(0);
        } else {
            e();
            setExpand(8);
            g();
        }
    }

    private void b() {
        this.ab.setVisibility(0);
        this.ba.setVisibility(8);
    }

    private void e() {
        this.bq = false;
    }

    private void g() {
        if (this.az.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.az.getLayoutParams();
            layoutParams.topMargin = (int) getResources().getDimension(R.dimen.elementsMarginVerticalM);
            this.az.setLayoutParams(layoutParams);
        }
    }

    private void a() {
        if (this.az.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.az.getLayoutParams();
            layoutParams.topMargin = 0;
            this.az.setLayoutParams(layoutParams);
        }
    }

    public void setSleepViewCallback(SleepViewCallback sleepViewCallback) {
        this.cr = sleepViewCallback;
    }

    private void h() {
        this.ba.setOnClickListener(new View.OnClickListener() { // from class: umm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50365b.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (this.bq) {
            this.az.setImageDrawable(ContextCompat.getDrawable(this.ad, R.drawable.fold_arrow_down));
            setExpand(8);
            g();
            SleepViewCallback sleepViewCallback = this.cr;
            if (sleepViewCallback != null) {
                sleepViewCallback.sleepToTop();
            }
        } else {
            setExpand(0);
            this.az.setImageDrawable(ContextCompat.getDrawable(this.ad, R.drawable.fold_arrow_up));
            a();
        }
        this.bq = !this.bq;
    }

    private void setExpand(int i) {
        if (this.bk) {
            this.ab.setVisibility(i);
        } else {
            this.s.setVisibility(i);
        }
    }

    private void j() {
        LogUtil.j("UIHLH_CoreSleepServiceView", "setNoSleepScore sleepScore == 0");
        this.ch.setText("--");
        this.co.setVisibility(8);
        this.cm.setVisibility(0);
        this.cm.setStar(0);
        this.cp.setVisibility(8);
    }

    private void setSleepScoreData(int i) {
        this.ch.setText(UnitUtil.e(i, 1, 0));
        this.co.setText(this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, i));
        this.co.setVisibility(0);
        setSleepScoreRating(i);
        e(i);
    }

    private void setSleepScoreRating(int i) {
        this.cm.setVisibility(0);
        this.cm.setStar((i + 9) / 10);
    }

    private void e(final int i) {
        if (Utils.k()) {
            LogUtil.j("UIHLH_CoreSleepServiceView", "fetch HEALTH_CLOUD from no_cloud user login");
            this.cp.setVisibility(8);
        } else {
            ucx.c(new CommonUiBaseResponse() { // from class: umf
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public final void onResponse(int i2, Object obj) {
                    this.f50352a.a(i, i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, int i2, Object obj) {
        if (this.cg != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1001;
            messageObtain.arg1 = i2;
            messageObtain.arg2 = i;
            messageObtain.obj = obj;
            this.cg.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, ubq ubqVar) {
        if (i == -1) {
            this.cp.setVisibility(8);
            LogUtil.j("UIHLH_CoreSleepServiceView", "refreshUserRate failure");
            return;
        }
        Map<String, Integer> mapC = ubqVar.c();
        if (mapC == null) {
            this.cp.setVisibility(8);
            return;
        }
        this.cp.setVisibility(0);
        this.cp.setText(this.ad.getResources().getString(R.string.IDS_core_sleep_user_rate, UnitUtil.e(mapC.get(String.valueOf(i2)).intValue(), 2, 0)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVar = this.cg;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
        }
    }

    static class d extends BaseHandler<CoreSleepServiceView> {
        d(CoreSleepServiceView coreSleepServiceView) {
            super(Looper.getMainLooper(), coreSleepServiceView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(CoreSleepServiceView coreSleepServiceView, Message message) {
            if (message == null) {
                LogUtil.e("UIHLH_CoreSleepServiceView", "msg is null");
                return;
            }
            if (message.what != 1001) {
                LogUtil.j("UIHLH_CoreSleepServiceView", "handler message default");
                return;
            }
            Object obj = message.obj;
            if (obj instanceof ubq) {
                coreSleepServiceView.d(message.arg1, message.arg2, (ubq) obj);
            }
        }
    }

    private String d(String str) {
        return String.format(str, UnitUtil.e(70.0d, 1, 0) + this.ck + UnitUtil.e(100.0d, 1, 0) + " ") + this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, 100);
    }

    private void d(final int i, String str, String str2, int i2) {
        if (i2 == 1 && i < 70 && this.bp) {
            wum.a(this.ad, this.ci, "EXCE_BREATH__SCORE_ERROR");
        }
        this.m.setText(str2);
        String strE = UnitUtil.e(i, 1, 0);
        String str3 = str + "  " + strE + " " + this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, CommonUtil.n(this.ad, strE));
        int iD = wud.d(i);
        this.k = iD;
        wud.d(this.l, iD);
        this.t.setText(str3);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SleepScoreTimesActivity.b(CoreSleepServiceView.this.ad, "TYPE_BREATH_QUALITY", i, CoreSleepServiceView.this.k);
            }
        });
    }

    private void a(final int i, String str, String str2) {
        this.ao.setText(str2);
        String quantityString = this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, i);
        if (i < 20) {
            this.as.setText(str);
        } else {
            this.as.setText(str + "  " + UnitUtil.e(i, 1, 0) + " " + quantityString);
        }
        int i2 = wud.i(i);
        this.ar = i2;
        wud.d(this.al, i2);
        this.cn.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "sleepPartActivity");
                SleepScoreTimesActivity.b(CoreSleepServiceView.this.ad, "TYPE_DEEP_SLEEP_CONTINUITY", i, CoreSleepServiceView.this.ar);
            }
        });
    }

    private void d(final int i, String str, String str2) {
        String str3;
        int iH = wud.h(i);
        this.cy = iH;
        wud.d(this.bz, iH);
        String str4 = UnitUtil.e(6.0d, 1, 0) + this.ck + UnitUtil.e(10.0d, 1, 0) + " ";
        String string = String.format(str2, str4) + this.ad.getString(R.string.IDS_messagecenter_time_hour_value);
        if (LanguageUtil.t(this.ad)) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(str2 + " ", str4));
            sb.append(this.ad.getString(R.string.IDS_messagecenter_time_hour_value));
            string = sb.toString();
        }
        this.cb.setText(string);
        LogUtil.a("UIHLH_CoreSleepServiceView", " totalTime:", Integer.valueOf(i));
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 == 0) {
            str3 = str + "  " + this.ad.getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(i3, 1, 0));
        } else {
            str3 = str + "  " + this.ad.getResources().getString(R.string.IDS_h_min_unit, UnitUtil.e(i2, 1, 0), UnitUtil.e(i3, 1, 0));
        }
        this.bx.setText(str3);
        this.ca.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "TotalDataActivity");
                int i4 = i;
                SleepDurationActivity.e(CoreSleepServiceView.this.ad, "TYPE_NIGHT_SLEEP_TIME", i4 / 60, i4 % 60, CoreSleepServiceView.this.cy);
            }
        });
    }

    private void d(String str, String str2, String str3, String str4, int i) {
        final int deepSleepRateNum = this.ct.getDeepSleepRateNum();
        if (i == 1) {
            if (deepSleepRateNum > 90 && this.bp) {
                wum.a(this.ad, this.ci, "EXCE_DEEPSLEEP__MIX _ERROR");
            } else if (deepSleepRateNum >= 5 || !this.bp) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "deepSleepRateNum is ok");
            } else {
                wum.a(this.ad, this.ci, "EXCE_DEEPSLEEP__MIN_ERROR");
            }
        }
        int iF = wud.f(deepSleepRateNum);
        this.av = iF;
        wud.d(this.aq, iF);
        this.ax.setText(String.format(str4, UnitUtil.e(20.0d, 1, 0) + this.ck + UnitUtil.e(60.0d, 2, 0)));
        this.aw.setText(str + "  " + UnitUtil.e(deepSleepRateNum, 2, 0));
        this.ap.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "DeepSleepRateActivity");
                SleepRateActivity.a(CoreSleepServiceView.this.ad, "TYPE_DEEP_SLEEP", deepSleepRateNum, CoreSleepServiceView.this.av);
            }
        });
        int lightSleepRateNum = this.ct.getLightSleepRateNum();
        if (i == 1) {
            if (lightSleepRateNum > 90 && this.bp) {
                wum.a(this.ad, this.ci, "EXCE_LIGHTSLEEP__MIX _ERROR");
            } else if (lightSleepRateNum >= 5 || !this.bp) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "lightSleepRateNum is ok");
            } else {
                wum.a(this.ad, this.ci, "EXCE_LIGHTSLEEP__MIN_ERROR");
            }
        }
        int iG = wud.g(lightSleepRateNum);
        this.bu = iG;
        wud.d(this.bs, iG);
        this.bv.setText(String.format(str4, "< " + UnitUtil.e(55.0d, 2, 0)));
        this.bw.setText(str2 + "  " + UnitUtil.e(lightSleepRateNum, 2, 0));
        a(str3, str4, i, lightSleepRateNum);
    }

    private void a(String str, String str2, int i, final int i2) {
        this.bo.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "LightSleepRateActivity");
                SleepRateActivity.a(CoreSleepServiceView.this.ad, "TYPE_LIGHT_SLEEP", i2, CoreSleepServiceView.this.bu);
            }
        });
        final int slumSleepRateNum = this.ct.getSlumSleepRateNum();
        if (i == 1) {
            if (slumSleepRateNum > 90 && this.bp) {
                wum.a(this.ad, this.ci, "EXCE_REMSLEEP__MIX _ERROR");
            } else if (slumSleepRateNum < 5 && this.bp) {
                wum.a(this.ad, this.ci, "EXCE_REMLEEP__MIN_ERROR");
            } else {
                LogUtil.a("UIHLH_CoreSleepServiceView", "dreamSleepRateNum is ok");
            }
        }
        int iJ = wud.j(slumSleepRateNum);
        this.cl = iJ;
        wud.d(this.bc, iJ);
        this.ay.setText(String.format(str2, UnitUtil.e(10.0d, 1, 0) + this.ck + UnitUtil.e(30.0d, 2, 0)));
        this.bb.setText(str + "  " + UnitUtil.e(slumSleepRateNum, 2, 0));
        this.at.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIHLH_CoreSleepServiceView", "SlumSleepRateActivity");
                SleepRateActivity.a(CoreSleepServiceView.this.ad, "TYPE_SLUM_SLEEP_RATE", slumSleepRateNum, CoreSleepServiceView.this.cl);
            }
        });
    }

    private void c(final int i, String str, String str2) {
        int iS = wud.s(i);
        this.dc = iS;
        wud.d(this.dk, iS);
        String quantityString = this.ad.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, 1, UnitUtil.e(i, 1, 0));
        this.dn.setText(String.format(str2, UnitUtil.e(0.0d, 1, 0) + this.ck + this.ad.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, 1, UnitUtil.e(1.0d, 1, 0))));
        LogUtil.a("UIHLH_CoreSleepServiceView", " wakeTimes:", Integer.valueOf(i));
        this.dp.setText(str + "  " + quantityString);
        this.cx.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SleepScoreTimesActivity.b(CoreSleepServiceView.this.ad, "TYPE_WAKE_UP_TIMES", i, CoreSleepServiceView.this.dc);
            }
        });
    }

    private void b(String str, String str2) {
        String str3;
        final int iD = FitnessUtils.d((int) Math.sqrt(this.ct.getDailyFallScore()));
        this.bd = wud.k(iD);
        String quantityString = this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, iD);
        String strE = UnitUtil.e(iD, 1, 0);
        String str4 = this.ad.getString(R.string.IDS_fitness_core_sleep_start_sleep_regularity) + "  " + strE + " " + quantityString;
        wud.d(this.bh, this.bd);
        this.bj.setText(str4);
        this.be.setText(str2);
        this.bg.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SleepScoreTimesActivity.b(CoreSleepServiceView.this.ad, "TYPE_FALL_SLEEPING_REGULAR", iD, CoreSleepServiceView.this.bd);
            }
        });
        int dailyFallTime = this.ct.getDailyFallTime() % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL;
        int iA = wud.a(dailyFallTime);
        this.bm = iA;
        wud.e(this.e, iA, true);
        final String str5 = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(dailyFallTime / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(dailyFallTime % 60));
        if (!LanguageUtil.c(this.ad)) {
            str3 = "< 00:00";
        } else {
            str3 = String.format(Locale.getDefault(), "%1$s", HiDataFilter.DataFilterExpression.LESS_THAN) + UnitUtil.c(0);
        }
        this.d.setText(String.format(str, str3));
        this.f27244c.setText(this.ad.getString(R.string.IDS_fitness_core_sleep_avg_start_sleep) + "  " + UnitUtil.c(c(str5)));
        this.f27243b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(CoreSleepServiceView.this.ad, (Class<?>) SleepTimeActivity.class);
                intent.setFlags(536870912);
                intent.putExtra("type", 2);
                intent.putExtra("sleepTimeScore", str5);
                intent.putExtra("sleepTimeStatus", CoreSleepServiceView.this.bm);
                iov.d(CoreSleepServiceView.this.ad, intent);
            }
        });
    }

    private void e(String str, String str2) {
        final int iD = FitnessUtils.d((int) Math.sqrt(this.ct.getDailyWakeUpScore()));
        int iP = wud.p(iD);
        this.db = iP;
        wud.d(this.de, iP);
        int iB = wud.b(this.ct.getDailyWakeUpTime() % ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL);
        this.dj = iB;
        wud.e(this.f, iB, true);
        String quantityString = this.ad.getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string_unit, iD);
        this.dh.setText(this.ad.getString(R.string.IDS_fitness_core_sleep_end_sleep_regularity) + "  " + UnitUtil.e(iD, 1, 0) + " " + quantityString);
        this.di.setText(str2);
        this.df.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SleepScoreTimesActivity.b(CoreSleepServiceView.this.ad, "TYPE_WAKE_UP_REGULAR", iD, CoreSleepServiceView.this.db);
            }
        });
        this.j.setText(String.format(str, String.format(Locale.getDefault(), "%1$s", HiDataFilter.DataFilterExpression.BIGGER_THAN) + " " + UnitUtil.c(c("6:0"))));
        int dailyWakeUpTime = this.ct.getDailyWakeUpTime();
        final String str3 = String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(dailyWakeUpTime / 60)) + ":" + String.format(Locale.ROOT, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(dailyWakeUpTime % 60));
        this.g.setText(this.ad.getString(R.string.IDS_fitness_core_sleep_avg_end_sleep) + "  " + UnitUtil.c(c(str3)));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(CoreSleepServiceView.this.ad, (Class<?>) SleepTimeActivity.class);
                intent.setFlags(536870912);
                intent.putExtra("type", 4);
                intent.putExtra("sleepTimeScore", str3);
                intent.putExtra("sleepTimeStatus", CoreSleepServiceView.this.dj);
                iov.d(CoreSleepServiceView.this.ad, intent);
            }
        });
    }

    private void b(SleepTotalData sleepTotalData, int i) {
        int dailyDeepSleepTime;
        int dailyNoonSleepTime;
        this.u.setVisibility(8);
        this.z.setVisibility(0);
        this.by.setVisibility(0);
        this.x.setVisibility(8);
        if (i == 1) {
            dailyDeepSleepTime = sleepTotalData.getDeepSleepTime() + sleepTotalData.getShallowSleepTime() + sleepTotalData.getSlumberSleepTime() + sleepTotalData.getNoonSleepTime();
            if (dailyDeepSleepTime / 60 >= 15) {
                wum.a(this.ad, this.ci, "EXCE_TRUSLEEP__TIME_ERROR");
            }
            dailyNoonSleepTime = sleepTotalData.getNoonSleepTime();
        } else {
            dailyDeepSleepTime = sleepTotalData.getDailyDeepSleepTime() + sleepTotalData.getDailyShallowSleepTime() + sleepTotalData.getDailySlumberTime() + sleepTotalData.getDailyNoonSleepTime();
            dailyNoonSleepTime = sleepTotalData.getDailyNoonSleepTime();
        }
        if (i == 1) {
            d(sleepTotalData, dailyDeepSleepTime, dailyNoonSleepTime);
            return;
        }
        if (i == 3 || i == 2) {
            c(dailyDeepSleepTime, dailyNoonSleepTime);
            return;
        }
        if (dailyDeepSleepTime == dailyNoonSleepTime && dailyNoonSleepTime != 0) {
            this.by.setVisibility(8);
            this.ba.setVisibility(8);
            this.u.setVisibility(8);
        } else {
            this.u.setVisibility(0);
        }
        this.cd.setVisibility(8);
        this.z.setVisibility(8);
        this.y.setText(R.string.IDS_core_sleep_average_nightly_sleep);
        e(sleepTotalData.getDailyDeepSleepTime() + sleepTotalData.getDailyShallowSleepTime() + sleepTotalData.getDailySlumberTime(), i);
    }

    private void c(int i, final int i2) {
        if (i2 > 45) {
            this.aj = 71;
        } else {
            this.aj = 73;
        }
        if (i2 != 0) {
            LinearLayout linearLayout = (LinearLayout) this.cd.getParent();
            linearLayout.removeView(this.cd);
            this.am.removeAllViews();
            View viewE = SleepWeekExpandListProvider.e(this.ad);
            this.am.addView(viewE);
            HealthTextView healthTextView = (HealthTextView) viewE.findViewById(R.id.sleep_item_left_text);
            ImageView imageView = (ImageView) viewE.findViewById(R.id.sleep_item_right_image);
            View viewFindViewById = viewE.findViewById(R.id.list_day_sleep_item_divider);
            healthTextView.setText(this.ad.getString(R.string.IDS_fitness_core_sleep_avg_noontime_sleep));
            viewFindViewById.setVisibility(8);
            if (LanguageUtil.ba(this.ad)) {
                imageView.setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
            viewE.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepServiceView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CoreSleepServiceView.this.d(i2);
                }
            });
            HealthTextView healthTextView2 = (HealthTextView) viewE.findViewById(R.id.sleep_item_right_text);
            b(healthTextView2, i2, 13, 13);
            healthTextView2.setAutoTextInfo(10, 1, 1);
            this.cd.setVisibility(0);
            this.cq.setVisibility(8);
            this.cw.setVisibility(8);
            a(i, i2);
            linearLayout.addView(this.cd);
            return;
        }
        d();
    }

    private void d() {
        this.cd.setVisibility(8);
        this.cq.setVisibility(0);
        this.cw.setVisibility(0);
        this.cc.setVisibility(8);
        this.cf.setVisibility(8);
        this.ae.setVisibility(0);
        this.cs.setVisibility(0);
        this.af.setText(R.string.IDS_fitness_core_sleep_avg_sleep_score);
        this.aa.setVisibility(0);
        this.aa.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
        this.ac.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
        this.ac.setVisibility(0);
    }

    private void a(int i, int i2) {
        if (i2 == i) {
            b();
            this.cc.setVisibility(0);
            if (i2 > 180) {
                this.cc.setText(this.ad.getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content3));
            } else {
                this.cc.setText(this.ad.getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content, this.ad.getResources().getQuantityString(R.plurals.IDS_nap_hour_string, 3, 3)));
            }
            this.cf.setVisibility(8);
            this.ae.setVisibility(8);
            this.cs.setVisibility(8);
            this.aa.setVisibility(8);
            this.ac.setVisibility(8);
            this.cd.setBackgroundDrawable(this.ad.getResources().getDrawable(R.drawable.croe_sleep_day_card_gradual));
            return;
        }
        this.cc.setVisibility(8);
        this.cf.setVisibility(0);
        this.ae.setVisibility(0);
        this.cs.setVisibility(0);
        this.af.setText(R.string.IDS_fitness_core_sleep_avg_sleep_score);
        this.aa.setVisibility(0);
        this.aa.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
        this.ac.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
        this.ac.setVisibility(0);
        this.cd.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
    }

    private void d(SleepTotalData sleepTotalData, int i, int i2) {
        this.cq.setVisibility(8);
        this.ag.setVisibility(8);
        if (i2 == i && i != 0) {
            b();
            this.ch.setText("--");
            this.co.setVisibility(8);
            this.cf.setVisibility(8);
            this.ae.setVisibility(8);
            this.cs.setVisibility(8);
            this.cc.setVisibility(0);
            this.aa.setVisibility(8);
            this.ac.setVisibility(8);
            if (i2 > 180) {
                this.cc.setText(this.ad.getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content3));
            } else {
                this.cc.setText(this.ad.getResources().getString(R.string.IDS_core_sleep_suggesttion_nullstatus_content, this.ad.getResources().getQuantityString(R.plurals.IDS_nap_hour_string, 3, 3)));
            }
            this.cd.setBackgroundDrawable(this.ad.getResources().getDrawable(R.drawable.croe_sleep_day_card_gradual));
        } else {
            this.cc.setVisibility(8);
            if (i2 == 0) {
                this.cf.setVisibility(8);
            } else {
                this.cf.setVisibility(0);
            }
            this.ae.setVisibility(0);
            this.cs.setVisibility(0);
            this.af.setText(R.string.IDS_hw_show_main_home_page_sleep_score);
            this.aa.setVisibility(0);
            this.aa.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
            this.ac.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
            this.cd.setBackgroundColor(this.ad.getResources().getColor(R.color.colorBackground));
            this.ac.setVisibility(0);
        }
        if (sleepTotalData.getShallowSleepTime() > 0 && sleepTotalData.getDeepSleepTime() == 0 && sleepTotalData.getSlumberSleepTime() == 0) {
            this.cz.setText(this.ad.getString(R.string.IDS_core_sleep_suggesttion_novalidData_tital));
            this.cu.setText(this.ad.getString(R.string.IDS_core_sleep_suggesttion_novalidData_content));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        int i2 = i % 60;
        DaySleepActivity.d(this.ad, UnitUtil.e(((double) (i - i2)) / 60.0d, 1, 0), UnitUtil.e(i2, 1, 0), this.aj, (ArrayList) this.bl.i());
    }

    private int c(String str) {
        String[] strArrSplit = str.split(":");
        try {
            return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60);
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            LogUtil.e("R_Sleep_UIHLH_CoreSleepServiceView", "getSeconds exception = ", e.getMessage());
            return 0;
        }
    }

    private void i() {
        LogUtil.a("UIHLH_CoreSleepServiceView", "enter updateNoDataTotalDatasUi():");
        this.u.setVisibility(8);
        this.z.setVisibility(8);
        this.by.setVisibility(8);
        this.ba.setVisibility(8);
    }

    private void e(SleepTotalData sleepTotalData, int i) {
        LogUtil.a("UIHLH_CoreSleepServiceView", "enter updateCommonTotalDatasUi():");
        this.u.setVisibility(0);
        this.co.setVisibility(8);
        this.da.setVisibility(8);
        this.z.setVisibility(8);
        this.by.setVisibility(0);
        this.cd.setVisibility(8);
        String string = this.ad.getResources().getString(R.string.IDS_awake_times);
        if (i == 3 || i == 2) {
            this.x.setVisibility(0);
            this.cc.setVisibility(8);
            this.ce.setVisibility(0);
            this.y.setText(R.string.IDS_fitness_average_sleep_data_title);
            this.w.setText(R.string.IDS_fitness_core_sleep_sleep_avg_latency_time);
            this.v.setText(UnitUtil.e(sleepTotalData.getDailyWakeupTimes(), 1, 0) + string);
            e(sleepTotalData.getDailyDeepSleepTime() + sleepTotalData.getDailyShallowSleepTime(), i);
            return;
        }
        if (i == 4) {
            this.x.setVisibility(8);
            this.ce.setVisibility(0);
            this.y.setText(R.string.IDS_fitness_daily_average_sleep_data_title);
            e(sleepTotalData.getDailyDeepSleepTime() + sleepTotalData.getDailyShallowSleepTime(), i);
            return;
        }
        this.x.setVisibility(0);
        this.cc.setVisibility(8);
        this.ce.setVisibility(0);
        this.w.setText(R.string.IDS_details_sleep_sleep_latency_time);
        this.v.setText(UnitUtil.e(sleepTotalData.getWakeupTimes(), 1, 0) + string);
        e(sleepTotalData.getDeepSleepTime() + sleepTotalData.getShallowSleepTime(), i);
    }

    private void g(View view) {
        this.da = (LinearLayout) view.findViewById(R.id.fitness_detail_suggest_text);
        this.z = (LinearLayout) view.findViewById(R.id.sleep_core_sleep_data_layout);
        this.u = (LinearLayout) view.findViewById(R.id.sleep_common_sleep_total_layout);
        this.ag = (LinearLayout) view.findViewById(R.id.core_sleep_list_month_items);
        this.ae = (LinearLayout) view.findViewById(R.id.sleep_core_sleep_suggest_title);
        this.cs = (LinearLayout) view.findViewById(R.id.fitness_detail_suggest_content_layout);
        this.ch = (HealthTextView) view.findViewById(R.id.sleep_scoring);
        this.p = (HealthTextView) view.findViewById(R.id.common_sleep_sleep_hour_time);
        this.r = (HealthTextView) view.findViewById(R.id.common_sleep_sleep_hour_unit);
        this.q = (HealthTextView) view.findViewById(R.id.common_sleep_sleep_minute_time);
        this.y = (HealthTextView) view.findViewById(R.id.common_sleep_total_sleep_title);
        this.cz = (HealthTextView) view.findViewById(R.id.suggest_title_tv);
        this.cu = (HealthTextView) view.findViewById(R.id.suggest_content_tv);
        this.cc = (HealthTextView) view.findViewById(R.id.noon_sleep_suggest_title);
        this.cf = (HealthDivider) view.findViewById(R.id.core_sleep_noon_layout_list_divider);
        this.by = (HealthDivider) view.findViewById(R.id.list_sleep_item_listdivider_image_up);
        this.ba = (LinearLayout) view.findViewById(R.id.sleep_expand_btn_layout);
        this.ac = (LinearLayout) view.findViewById(R.id.core_sleep_list_items);
        d(view);
        e(view);
        f();
        this.az = (ImageView) view.findViewById(R.id.sleep_service_expand);
        this.ab = (LinearLayout) view.findViewById(R.id.core_sleep_expand);
        this.s = (LinearLayout) view.findViewById(R.id.common_sleep_expand);
        this.cd = (LinearLayout) view.findViewById(R.id.core_sleep_noon_layout);
        this.am = (LinearLayout) view.findViewById(R.id.list_day_sleep_item);
        this.cq = view.findViewById(R.id.core_sleep_noon_v);
        this.cw = (LinearLayout) view.findViewById(R.id.list_total_sleep_item);
        this.af = (HealthTextView) view.findViewById(R.id.sleep_core_sleep_data_title);
        this.co = (HealthTextView) view.findViewById(R.id.sleep_scoring_unit);
        this.cm = (HealthStarRatingBar) view.findViewById(R.id.sleep_scoring_rating);
        this.cp = (HealthTextView) view.findViewById(R.id.sleep_scoring_user_rate);
    }

    private void a(View view) {
        this.ce = out.b(view, R.id.core_sleep_pie_chart);
        this.aa = out.b(view, R.id.core_sleep_core_pie_chart);
        this.cv = (HealthRingChart) this.ce.findViewById(R.id.day_detail_sleep_rate_recycle);
        this.ai = (HealthRingChart) this.aa.findViewById(R.id.core_day_detail_sleep_rate_recycle);
    }

    private void d(View view) {
        a(view);
        this.ce.setVisibility(0);
        this.aa.setVisibility(0);
        this.ai = (HealthRingChart) this.aa.findViewById(R.id.core_day_detail_sleep_rate_recycle);
    }

    private void e(View view) {
        b(view);
        this.bt = (ImageView) view.findViewById(R.id.core_sleep_total_sleep_level_arrow);
        this.an = (ImageView) view.findViewById(R.id.core_sleep_deep_sleep_level_arrow);
        this.br = (ImageView) view.findViewById(R.id.core_sleep_light_sleep_level_arrow);
        this.au = (ImageView) view.findViewById(R.id.core_sleep_dream_sleep_level_arrow);
        this.ak = (ImageView) view.findViewById(R.id.core_sleep_deep_sleep_continuity_level_arrow);
        this.dg = (ImageView) view.findViewById(R.id.core_sleep_wake_up_time_arrow);
        this.o = (ImageView) view.findViewById(R.id.core_sleep_breath_arrow);
        this.bf = (ImageView) view.findViewById(R.id.core_sleep_fall_score_arrow);
        this.f27242a = (ImageView) view.findViewById(R.id.fall_asleep_time_arrow);
        this.dd = (ImageView) view.findViewById(R.id.wake_up_regularity_arrow);
        this.i = (ImageView) view.findViewById(R.id.wake_up_time_arrow);
        this.bx = (HealthTextView) view.findViewById(R.id.core_sleep_total_sleep_title);
        this.aw = (HealthTextView) view.findViewById(R.id.core_sleep_deep_sleep_title);
        this.bw = (HealthTextView) view.findViewById(R.id.core_sleep_light_sleep_title);
        this.bb = (HealthTextView) view.findViewById(R.id.core_sleep_dream_sleep_title);
        this.as = (HealthTextView) view.findViewById(R.id.core_sleep_deep_sleep_continuity_title);
        this.dp = (HealthTextView) view.findViewById(R.id.core_sleep_wake_up_times_title);
        this.t = (HealthTextView) view.findViewById(R.id.core_sleep_rdi_score_title);
        this.w = (HealthTextView) view.findViewById(R.id.list_wake_up_times_item_title);
        this.bj = (HealthTextView) view.findViewById(R.id.list_fall_asleep_regularity_title);
        this.f27244c = (HealthTextView) view.findViewById(R.id.list_fall_asleep_time_title);
        this.dh = (HealthTextView) view.findViewById(R.id.list_wake_up_regularity_item_title);
        this.g = (HealthTextView) view.findViewById(R.id.list_wake_up_time_item_title);
        this.cb = (HealthTextView) view.findViewById(R.id.core_sleep_total_sleep_beyond_title);
        this.ax = (HealthTextView) view.findViewById(R.id.core_sleep_deep_sleep_beyond_title);
        this.bv = (HealthTextView) view.findViewById(R.id.core_sleep_light_sleep_beyond_title);
        this.ay = (HealthTextView) view.findViewById(R.id.core_sleep_dream_sleep_beyond_title);
        this.ao = (HealthTextView) view.findViewById(R.id.core_sleep_deep_sleep_continuity_beyond_title);
        this.dn = (HealthTextView) view.findViewById(R.id.core_sleep_wake_up_times_beyond_title);
        this.m = (HealthTextView) view.findViewById(R.id.core_sleep_rdi_score_beyond_title);
        this.be = (HealthTextView) view.findViewById(R.id.list_fall_asleep_regularity_beyond_title);
        this.d = (HealthTextView) view.findViewById(R.id.list_fall_asleep_time_beyond_title);
        this.di = (HealthTextView) view.findViewById(R.id.list_wake_up_regularity_item_beyond_title);
        this.j = (HealthTextView) view.findViewById(R.id.list_wake_up_time_item_beyond_title);
        this.bi.d(this.bt, this.an, this.br, this.au, this.ak, this.dg, this.o, this.bf, this.dd, this.f27242a, this.i);
    }

    private void b(View view) {
        this.ca = (LinearLayout) view.findViewById(R.id.total_sleep_layout_item);
        this.ap = (LinearLayout) view.findViewById(R.id.deep_sleep_layout_item);
        this.bo = (LinearLayout) view.findViewById(R.id.light_sleep_layout_item);
        this.at = (LinearLayout) view.findViewById(R.id.dream_sleep_layout_item);
        this.cn = (LinearLayout) view.findViewById(R.id.list_sleep_part_item);
        this.cx = (LinearLayout) view.findViewById(R.id.list_wake_times_item);
        this.n = (LinearLayout) view.findViewById(R.id.list_breath_quality_item);
        this.x = (LinearLayout) view.findViewById(R.id.list_wake_up_times_item);
        this.bg = (LinearLayout) view.findViewById(R.id.list_fall_asleep_regularity_item);
        this.f27243b = (LinearLayout) view.findViewById(R.id.list_fall_asleep_time_item);
        this.df = (LinearLayout) view.findViewById(R.id.list_wake_up_regularity_item);
        this.h = (LinearLayout) view.findViewById(R.id.list_wake_up_time_item);
        this.bz = (HealthTextView) view.findViewById(R.id.total_sleep_level_tv);
        this.aq = (HealthTextView) view.findViewById(R.id.deep_sleep_level_tv);
        this.bs = (HealthTextView) view.findViewById(R.id.light_sleep_level_tv);
        this.bc = (HealthTextView) view.findViewById(R.id.dream_sleep_level_tv);
        this.al = (HealthTextView) view.findViewById(R.id.deep_sleep_continuity_level_tv);
        this.dk = (HealthTextView) view.findViewById(R.id.wakeup_time_tv);
        this.l = (HealthTextView) view.findViewById(R.id.breath_quality_tv);
        this.v = (HealthTextView) view.findViewById(R.id.list_wake_up_times_item_level);
        this.bh = (HealthTextView) view.findViewById(R.id.fall_score_tv);
        this.e = (HealthTextView) view.findViewById(R.id.daily_fall_time_tv);
        this.de = (HealthTextView) view.findViewById(R.id.wake_up_regular_tv);
        this.f = (HealthTextView) view.findViewById(R.id.wake_up_time_tv);
    }

    private void f() {
        this.bt.setVisibility(0);
        this.an.setVisibility(0);
        this.br.setVisibility(0);
        this.au.setVisibility(0);
        this.ak.setVisibility(0);
        this.dg.setVisibility(0);
        this.o.setVisibility(0);
        this.bf.setVisibility(0);
        this.dd.setVisibility(0);
        this.f27242a.setVisibility(0);
        this.i.setVisibility(0);
        this.ca.setEnabled(true);
        this.ap.setEnabled(true);
        this.bo.setEnabled(true);
        this.at.setEnabled(true);
        this.cn.setEnabled(true);
        this.cx.setEnabled(true);
        this.n.setEnabled(true);
        this.bg.setEnabled(true);
        this.df.setEnabled(true);
        this.f27243b.setEnabled(true);
        this.h.setEnabled(true);
    }

    private void b(int i, boolean z) {
        int dailyDeepSleepTime;
        int dailyShallowSleepTime;
        int dailySlumberTime;
        LogUtil.a("R_Sleep_UIHLH_CoreSleepServiceView", "refreshPieChart, isCoreSleep = ", Boolean.valueOf(z));
        if (i == 2 || i == 3 || i == 4) {
            dailyDeepSleepTime = this.ct.getDailyDeepSleepTime();
            dailyShallowSleepTime = this.ct.getDailyShallowSleepTime();
            dailySlumberTime = this.ct.getDailySlumberTime();
        } else {
            dailyDeepSleepTime = this.ct.getDeepSleepTime();
            dailyShallowSleepTime = this.ct.getShallowSleepTime();
            dailySlumberTime = this.ct.getSlumberSleepTime();
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(Integer.valueOf(Math.round(dailyDeepSleepTime / 1.0f)));
        arrayList.add(Integer.valueOf(Math.round(dailyShallowSleepTime / 1.0f)));
        if (z) {
            arrayList.add(Integer.valueOf(Math.round(dailySlumberTime / 1.0f)));
        }
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.ad, new qjm().c(true), wud.a(this.ad, arrayList, z, i));
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: ume
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.f50351a.a(qjpVar);
            }
        });
        if (z) {
            LogUtil.a("UIHLH_CoreSleepServiceView", "DSM: ", Integer.valueOf(dailyDeepSleepTime), ",LSM:", Integer.valueOf(dailyShallowSleepTime), ",RSM:", Integer.valueOf(dailySlumberTime));
            this.ai.setAdapter(healthRingChartAdapter);
            setDescForRingChart(this.ai);
        }
        this.cv.setAdapter(healthRingChartAdapter);
        setDescForRingChart(this.cv);
    }

    public /* synthetic */ String a(qjp qjpVar) {
        return wud.c(this.ad, (int) qjpVar.f());
    }

    private void setDescForRingChart(HealthRingChart healthRingChart) {
        if (LanguageUtil.o(this.ad)) {
            healthRingChart.setDesc(getResources().getString(R.string.IDS_hw_show_main_home_page_sleep), getResources().getString(R.string.IDS_core_sleep_ratio));
        }
    }

    private void e(int i, int i2) {
        int i3 = i / 60;
        if (i2 == 1 && i3 >= 15) {
            wum.a(this.ad, this.ci, "EXCE_NORMALSLEEP__TIME_ERROR");
        }
        int i4 = i % 60;
        if (i3 == 0) {
            this.p.setVisibility(8);
            this.r.setVisibility(8);
            this.q.setText(UnitUtil.e(i4, 1, 0));
            return;
        }
        this.p.setVisibility(0);
        this.r.setVisibility(0);
        String strE = UnitUtil.e(i3, 1, 0);
        String strE2 = UnitUtil.e(i4, 1, 0);
        this.p.setText(strE);
        this.q.setText(strE2);
    }

    private void b(HealthTextView healthTextView, int i, int i2, int i3) {
        if (i == 0) {
            healthTextView.setText("");
            return;
        }
        int i4 = i / 60;
        int i5 = i % 60;
        if (i4 == 0) {
            String strE = UnitUtil.e(i5, 1, 0);
            String string = this.ad.getString(R.string.IDS_hw_show_set_target_sport_time_unit, strE);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, string.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan(i3, true), 0, strE.length(), 17);
            spannableString.setSpan(Typeface.create(Constants.FONT, 0), 0, strE.length(), 17);
            healthTextView.setText(spannableString);
            return;
        }
        String strE2 = UnitUtil.e(i4, 1, 0);
        String strE3 = UnitUtil.e(i5, 1, 0);
        String string2 = this.ad.getResources().getString(R.string.IDS_h_min_unit, strE2, strE3);
        SpannableString spannableString2 = new SpannableString(string2);
        spannableString2.setSpan(new AbsoluteSizeSpan(i2, true), 0, string2.length(), 17);
        int iIndexOf = spannableString2.toString().indexOf(strE2);
        spannableString2.setSpan(new AbsoluteSizeSpan(i3, true), iIndexOf, strE2.length() + iIndexOf, 17);
        spannableString2.setSpan(Typeface.create(Constants.FONT, 0), iIndexOf, strE2.length() + iIndexOf, 17);
        int iIndexOf2 = spannableString2.toString().indexOf(strE3, iIndexOf + strE2.length() + 1);
        spannableString2.setSpan(new AbsoluteSizeSpan(i3, true), iIndexOf2, strE3.length() + iIndexOf2, 17);
        spannableString2.setSpan(Typeface.create(Constants.FONT, 0), iIndexOf2, strE3.length() + iIndexOf2, 17);
        healthTextView.setText(spannableString2);
    }
}

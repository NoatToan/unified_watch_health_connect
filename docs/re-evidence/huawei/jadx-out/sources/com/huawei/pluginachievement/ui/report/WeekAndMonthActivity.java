package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.lmf;
import defpackage.njy;
import defpackage.osa;
import defpackage.osf;
import defpackage.otl;
import defpackage.otu;
import defpackage.otx;
import defpackage.out;
import defpackage.oxi;
import defpackage.pal;
import defpackage.paw;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class WeekAndMonthActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f22283b;
    private LinearLayout e;
    private RelativeLayout f;
    private HealthCardView g;
    private LinearLayout h;
    private HealthTextView j;
    private HealthTextView k;
    private RelativeLayout l;
    private HealthTextView n;
    private RelativeLayout o;
    private boolean d = true;
    private boolean i = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f22284c = new b(this);

    static class b extends BaseHandler<WeekAndMonthActivity> {
        b(WeekAndMonthActivity weekAndMonthActivity) {
            super(weekAndMonthActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeekAndMonthActivity weekAndMonthActivity, Message message) {
            if (message.what == 1) {
                weekAndMonthActivity.n.setText(weekAndMonthActivity.getString(R.string.IDS_plugin_achievement_no_weekly_report));
                weekAndMonthActivity.j.setText(weekAndMonthActivity.getString(R.string.IDS_plugin_achievement_no_monthly_report));
                weekAndMonthActivity.d = false;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_health_week_and_month_layout);
        clearBackgroundDrawable();
        cancelAdaptRingRegion();
        this.f22282a = this;
        if (Utils.o()) {
            this.i = true;
        } else {
            this.i = false;
        }
        g();
        e();
        otx.b(this.f22282a).a(pal.c(-4, System.currentTimeMillis(), 1), System.currentTimeMillis(), 11, null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        c();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        if (qrs.af(this.f22282a)) {
            return;
        }
        LogUtil.e("WeekAndMonthActivity", "onConfigurationChanged adaptToGeneralPhone!");
        b();
    }

    private void c() {
        if (qrs.af(this.f22282a)) {
            d();
        } else {
            b();
        }
    }

    private void d() {
        this.h.setOrientation(0);
        this.e.setOrientation(0);
        this.g.setVisibility(4);
    }

    private void b() {
        this.h.setOrientation(1);
        this.e.setOrientation(1);
        this.g.setVisibility(8);
    }

    private void g() {
        this.l = (RelativeLayout) findViewById(R.id.hw_health_weekly_report_layout);
        this.f = (RelativeLayout) findViewById(R.id.hw_health_monthly_layout);
        this.o = (RelativeLayout) findViewById(R.id.year_report_layout);
        this.e = (LinearLayout) findViewById(R.id.year_layout);
        this.n = (HealthTextView) findViewById(R.id.hw_health_weekly_date_text);
        this.j = (HealthTextView) findViewById(R.id.hw_health_monthly_date_text);
        this.f22283b = (CustomTitleBar) out.d(this, R.id.title_layout);
        this.h = (LinearLayout) findViewById(R.id.week_and_month_layout);
        this.g = (HealthCardView) findViewById(R.id.report_placeholder_layout_card);
        this.k = (HealthTextView) findViewById(R.id.hw_health_year_date_text);
        setViewSafeRegion(false, this.e, this.h);
        c();
        f();
        if (Utils.o() || CommonUtil.ca()) {
            this.o.setVisibility(8);
            this.f22283b.setTitleText(getResources().getString(R.string.IDS_plugin_achievement_weekly_monthly_report));
        } else {
            this.o.setVisibility(0);
            this.f22283b.setTitleText(getResources().getString(R.string.IDS_plugin_achievement_weekly_monthly_year_report));
        }
        this.l.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.report.WeekAndMonthActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!otu.d(500)) {
                    WeekAndMonthActivity.this.a("2");
                    Intent intent = new Intent();
                    intent.setClassName(WeekAndMonthActivity.this.f22282a, PersonalData.CLASS_NAME_PERSONAL_YEAR_REPORT);
                    intent.putExtra("report_stype", WeekAndMonthActivity.this.k.getText().toString());
                    intent.setFlags(276824064);
                    WeekAndMonthActivity.this.f22282a.startActivity(intent);
                    return;
                }
                LogUtil.j("WeekAndMonthActivity", "YearLayout enter isFastClick!");
            }
        });
    }

    private void f() {
        ImageView imageView = (ImageView) out.d(this, R.id.week_icon);
        ImageView imageView2 = (ImageView) out.d(this, R.id.month_icon);
        ImageView imageView3 = (ImageView) out.d(this, R.id.year_icon);
        pal.e(imageView, "/sandbox/cch5/health/health-resource/achieve/report/img_me_weekly_entrance.png", "/sandbox/cch5/health/health-resource/achieve/report/img_me_weekly_entrance.png", getResources().getDrawable(R.drawable.im_me_monthly_entrance));
        pal.e(imageView2, "/sandbox/cch5/health/health-resource/achieve/report/im_me_monthly_entrance.png", "/sandbox/cch5/health/health-resource/achieve/report/im_me_monthly_entrance.png", getResources().getDrawable(R.drawable.im_me_monthly_entrance));
        pal.e(imageView3, "/sandbox/cch5/health/health-resource/achieve/report/img_me_year_entrance.png", "/sandbox/cch5/health/health-resource/achieve/report/img_me_year_entrance.png", getResources().getDrawable(R.drawable.im_me_monthly_entrance));
    }

    private void e() {
        this.n.setText(paw.d(pal.d(1, 1, this.i), 1) + " - " + paw.d(pal.d(2, 1, this.i), 1));
        this.j.setText(paw.d(pal.c(-1, System.currentTimeMillis(), 1), 0));
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.report.WeekAndMonthActivity.1
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB = otl.b(WeekAndMonthActivity.this.f22282a.getApplicationContext()).b(1, new HashMap(4));
                if (osfVarB instanceof TotalRecord) {
                    TotalRecord totalRecord = (TotalRecord) osfVarB;
                    if (totalRecord.getDays() >= 1) {
                        String strValueOf = String.valueOf(totalRecord.getStartDate());
                        LogUtil.a("WeekAndMonthActivity", "initData startTime=", strValueOf);
                        osa.b(WeekAndMonthActivity.this.f22282a, BaseHistoricalReportActivity.USER_START_EXERCISE_TIMESTAMP, strValueOf);
                        return;
                    }
                }
                LogUtil.a("WeekAndMonthActivity", "Report have no data");
                if (WeekAndMonthActivity.this.f22284c != null) {
                    WeekAndMonthActivity.this.f22284c.sendEmptyMessage(1);
                }
                if (Utils.o()) {
                    LogUtil.j("WeekAndMonthActivity", "Report totalRecord refresh.");
                    osa.b(WeekAndMonthActivity.this.f22282a, "generateAchieveTime", "");
                }
            }
        });
        int iA = a();
        LogUtil.a("WeekAndMonthActivity", "getConfigLatestYear year ", Integer.valueOf(iA));
        if (iA != 0) {
            this.k.setText(e(iA));
        }
    }

    private String e(int i) {
        return LanguageUtil.ba(BaseApplication.getContext()) ? UnitUtil.e(i, 1, 0) : String.valueOf(i);
    }

    private int a() {
        int iA = oxi.a(oxi.b(System.currentTimeMillis()));
        List<Integer> listE = paw.e();
        if (njy.e(listE)) {
            return 0;
        }
        Integer num = listE.get(0);
        int iIntValue = num.intValue();
        LogUtil.a("WeekAndMonthActivity", "getConfigLatestYear currentYear ", Integer.valueOf(iA), " configLatestYear ", num);
        return iIntValue;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HashMap map = new HashMap(4);
        map.put("report", str);
        map.put("from", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SUCCESSES_REPORT_1100009.value(), map, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setFlags(276824064);
        if (view == this.l) {
            intent.setClassName(this.f22282a, PersonalData.CLASS_NAME_ACHIEVE_WEEK_REPORT_ACTIVITY);
            intent.putExtra("report_stype", String.valueOf(1));
            a("0");
        }
        if (view == this.f) {
            intent.setClassName(this.f22282a, PersonalData.CLASS_NAME_ACHIEVE_MONTH_REPORT_ACTIVITY);
            intent.putExtra("report_stype", String.valueOf(0));
            a("1");
        }
        if (this.d) {
            this.f22282a.startActivity(intent);
        }
    }
}

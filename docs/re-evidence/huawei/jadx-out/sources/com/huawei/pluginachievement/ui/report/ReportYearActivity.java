package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.ui.adapter.AchieveAnnualAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddv;
import defpackage.njy;
import defpackage.osf;
import defpackage.otl;
import defpackage.owe;
import defpackage.oxi;
import defpackage.paw;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ReportYearActivity extends BaseActivity {
    private static final int d = Color.rgb(97, 173, 181);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListView f22277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f22278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AchieveAnnualAdapter f22279c;
    private Context e;
    private otl f;
    private RelativeLayout g;
    private HealthTextView i;
    private Handler h = new c(this);
    private Runnable j = new Runnable() { // from class: com.huawei.pluginachievement.ui.report.ReportYearActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (ReportYearActivity.this.f == null) {
                return;
            }
            osf osfVarB = ReportYearActivity.this.f.b(1, new HashMap(2));
            if (osfVarB instanceof TotalRecord) {
                ReportYearActivity.this.h.sendMessage(ReportYearActivity.this.h.obtainMessage(0, (TotalRecord) osfVarB));
            }
        }
    };

    static class c extends BaseHandler<ReportYearActivity> {
        c(ReportYearActivity reportYearActivity) {
            super(reportYearActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ReportYearActivity reportYearActivity, Message message) {
            if (message.what == 0 && (message.obj instanceof TotalRecord)) {
                long startDate = ((TotalRecord) message.obj).getStartDate();
                LogUtil.a("PLGACHIEVE_ReportYearActivity", "startDate ", Long.valueOf(startDate));
                reportYearActivity.e(startDate);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("PLGACHIEVE_ReportYearActivity", "onCreate");
        setContentView(R.layout.layout_report_main_year);
        this.e = this;
        c();
        e();
    }

    private void c() {
        ListView listView = (ListView) findViewById(R.id.annual_report_list);
        this.f22277a = listView;
        listView.setOverScrollMode(2);
        this.i = (HealthTextView) findViewById(R.id.report_empty_txt);
        this.g = (RelativeLayout) findViewById(R.id.reportListLayout);
        this.f22278b = new ArrayList(10);
        AchieveAnnualAdapter achieveAnnualAdapter = new AchieveAnnualAdapter(this, this.f22278b);
        this.f22279c = achieveAnnualAdapter;
        this.f22277a.setAdapter((ListAdapter) achieveAnnualAdapter);
        this.f22277a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.pluginachievement.ui.report.ReportYearActivity.5
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (!njy.e(ReportYearActivity.this.f22278b, i)) {
                    Integer num = (Integer) ReportYearActivity.this.f22278b.get(i);
                    int iIntValue = num.intValue();
                    LogUtil.a("PLGACHIEVE_ReportYearActivity", "mAnnualReportList year ", num);
                    if (iIntValue <= 2020) {
                        ReportYearActivity.this.b(owe.b(iIntValue), iIntValue);
                        return;
                    }
                    H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                    builder.addPath("#/?from=1");
                    ddv.b().loadH5ProApp(ReportYearActivity.this.e, "com.huawei.health.h5.annual-report-" + iIntValue, builder);
                    return;
                }
                LogUtil.j("PLGACHIEVE_ReportYearActivity", "mAnnualReportList isOutOfBounds.");
            }
        });
    }

    private void e() {
        this.f = otl.b(getApplicationContext());
        LogUtil.a("PLGACHIEVE_ReportYearActivity", "getData()");
        ThreadPoolManager.c().execute(this.j);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        if (njy.e(this.f22278b)) {
            this.i.setVisibility(0);
            this.g.setVisibility(8);
        }
        this.f22279c.d(this.f22278b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final int i) {
        String str2;
        if (i < 2020) {
            str2 = "achievementUrl";
        } else {
            str2 = "domainContentcenterDbankcdnNew";
        }
        GRSManager.c(this.e).d(str2, new GrsQueryCallback() { // from class: com.huawei.pluginachievement.ui.report.ReportYearActivity.3
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                LogUtil.d("PLGACHIEVE_ReportYearActivity", "annualUrl ", str3 + str);
                if (i == 2020) {
                    ReportYearActivity.this.b(str3 + str);
                    return;
                }
                ReportYearActivity.this.d(str3 + str);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.e("PLGACHIEVE_ReportYearActivity", "onCallBackFail errorCode = ", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", str);
        intent.putExtra("EXTRA_BI_ID", "");
        intent.putExtra("EXTRA_BI_NAME", "");
        intent.putExtra("EXTRA_BI_SOURCE", "Annual");
        this.e.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        LogUtil.a("PLGACHIEVE_ReportYearActivity", "dealAnnualShow startDate ", Long.valueOf(j));
        if (j <= 0) {
            LogUtil.j("PLGACHIEVE_ReportYearActivity", "dealAnnualShow startDate is error!");
            this.i.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        int iA = oxi.a(oxi.b(j));
        List<Integer> listE = paw.e();
        LogUtil.a("PLGACHIEVE_ReportYearActivity", "dealAnnualShow configAnnualShowList ", listE.toString());
        for (Integer num : listE) {
            if (num.intValue() >= iA) {
                this.f22278b.add(num);
            }
        }
        LogUtil.a("PLGACHIEVE_ReportYearActivity", "dealAnnualShow mAnnualList ", this.f22278b.toString());
        if (njy.e(this.f22278b)) {
            this.i.setVisibility(0);
            this.g.setVisibility(8);
        }
        this.f22279c.d(this.f22278b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        ddv.b().initH5Pro();
        H5ProLaunchOption.Builder builderAddCustomizeJsModule = new H5ProLaunchOption.Builder().enableSlowWholeDocumentDraw().addCustomizeJsModule("JsInteraction", ddv.b().getJsInteraction());
        if (a()) {
            builderAddCustomizeJsModule.setBackgroundColor(d);
        }
        H5ProClient.startH5LightApp(this.e, str, builderAddCustomizeJsModule.build());
    }

    private boolean a() {
        return "1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), this.f.q().getHuid() + "_annualAuth2020 "));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

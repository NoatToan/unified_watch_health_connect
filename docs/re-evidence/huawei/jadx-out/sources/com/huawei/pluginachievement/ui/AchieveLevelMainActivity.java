package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.ui.adapter.AchieveLevelAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.lmf;
import defpackage.osf;
import defpackage.otl;
import defpackage.ott;
import defpackage.out;
import defpackage.oyy;
import defpackage.ozv;
import defpackage.ozx;
import defpackage.ozy;
import defpackage.paa;
import defpackage.paq;
import defpackage.qop;
import defpackage.qpb;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelMainActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f22066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AchieveLevelAdapter f22068c;
    private Context g;
    private otl h;
    private CustomTitleBar j;
    private qop n;
    private HashMap<Integer, Integer> i = new HashMap<>(20);
    private HashMap<Integer, Integer> d = new HashMap<>(20);
    private HashMap<Integer, Integer> f = new HashMap<>(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<ozy> f22067b = new ArrayList<>(20);
    private Handler e = new Handler() { // from class: com.huawei.pluginachievement.ui.AchieveLevelMainActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                ozv ozvVar = (ozv) message.obj;
                paa paaVarD = ozvVar.d();
                AchieveLevelMainActivity.this.f22067b = ozvVar.e();
                LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "CurrentLevel = ", Integer.valueOf(paaVarD.e()));
                AchieveLevelMainActivity.this.f22068c.d(paaVarD);
                AchieveLevelMainActivity.this.f22068c.a(AchieveLevelMainActivity.this.f22067b, paaVarD.e());
                LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "CurrentForTest ----");
                AchieveLevelMainActivity.this.j.setTitleBarBackgroundColor(paq.f(paaVarD.e()));
            } else if (message.what == 0) {
                Double d = (Double) message.obj;
                double dDoubleValue = d.doubleValue();
                LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "days =", d);
                AchieveLevelMainActivity.this.e(dDoubleValue);
            } else if (message.what == 13) {
                AchieveLevelMainActivity.this.e(message.obj);
            } else {
                LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "wrong type message");
                return;
            }
            super.handleMessage(message);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isLargerThanEmui910(CommonUtil.p()) || CommonUtil.bc()) {
            setStatusBarColor();
        }
        setContentView(R.layout.achieve_level_new_layout);
        getWindow().getDecorView().setBackgroundResource(R.color.transparent);
        LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "onCreate");
        this.g = this;
        ott.e(this).c();
        e();
        c();
        qpb.d(this.g);
    }

    private void e() {
        paq.d(this.i);
        paq.a(this.d);
        paq.b(this.f);
        cancelAdaptRingRegion();
        this.f22066a = (HealthRecycleView) out.d(this, R.id.achieve_level_listview);
        this.f22066a.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f22066a.setIsScroll(false);
        AchieveLevelAdapter achieveLevelAdapter = new AchieveLevelAdapter(this.g, this.f22067b, this.i, this.d, this.f);
        this.f22068c = achieveLevelAdapter;
        this.f22066a.setAdapter(achieveLevelAdapter);
        d();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.level_titlebar);
        this.j = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        this.j.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_more_normal_white), qre.f(R.string.accessibility_more_item));
        this.j.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveLevelMainActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View viewInflate = View.inflate(AchieveLevelMainActivity.this.g, R.layout.common_pop_menu_single, null);
                AchieveLevelMainActivity.this.n = new qop(AchieveLevelMainActivity.this.g, viewInflate);
                HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.text);
                healthTextView.setText(R.string.IDS_plugin_achievement_level_rule_desc);
                healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveLevelMainActivity.3.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        AchieveLevelMainActivity.this.a();
                        Intent intent = new Intent();
                        if (LanguageUtil.l(AchieveLevelMainActivity.this.g)) {
                            intent.setClassName(AchieveLevelMainActivity.this.g, PersonalData.CLASS_NAME_PERSONAL_LEVEL_RULE_CN);
                        } else {
                            intent.setClassName(AchieveLevelMainActivity.this.g, PersonalData.CLASS_NAME_PERSONAL_LEVEL_RULE);
                        }
                        AchieveLevelMainActivity.this.g.startActivity(intent);
                        AchieveLevelMainActivity.this.n.e();
                    }
                });
                AchieveLevelMainActivity.this.n.e(view, 17);
            }
        });
        this.j.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveLevelMainActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveLevelMainActivity.this.finish();
            }
        });
        this.j.setLeftButtonVisibility(0);
        if (LanguageUtil.ba(this.g)) {
            this.j.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
        } else {
            this.j.setLeftButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
        }
        this.j.setTitleTextColor(getResources().getColor(R.color.emui_color_text_primary_dark));
        this.j.setTitleText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_grade_grade));
    }

    private void c() {
        LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "getData");
        this.h = otl.b(BaseApplication.getContext());
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveLevelMainActivity.2
            @Override // java.lang.Runnable
            public void run() {
                if (AchieveLevelMainActivity.this.h != null) {
                    AchieveLevelMainActivity achieveLevelMainActivity = AchieveLevelMainActivity.this;
                    achieveLevelMainActivity.b(achieveLevelMainActivity.h);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(otl otlVar) {
        HashMap map = new HashMap(2);
        List<osf> listD = otlVar.d(15, map);
        osf osfVarB = otlVar.b(14, map);
        ozx ozxVar = new ozx(listD, osfVarB);
        if (listD != null && osfVarB != null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "Get user level is not null");
            a(13, ozxVar);
            return;
        }
        osf osfVarB2 = otlVar.b(5, new HashMap(2));
        if (osfVarB2 instanceof AchieveInfo) {
            a(0, Double.valueOf(((AchieveInfo) osfVarB2).getUserReachStandardDays()));
        } else {
            a(0, Double.valueOf(0.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(double d) {
        a(1, oyy.a(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void e(T t) {
        if (t instanceof ozx) {
            a(1, oyy.a((ozx) t));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("PLGACHIEVE_AchieveLevelMainActivity", "onDestroy");
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
    }

    private <T> void a(int i, T t) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        Handler handler = this.e;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveLevelMainActivity", "sendHandlerMessage: handler is null -> " + i);
            return;
        }
        handler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HashMap map = new HashMap(2);
        map.put("click", "1");
        lmf.d().c(this.g, AnalyticsValue.LEVEL_RULE_1100024.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

package com.huawei.sim.esim.view;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.adapter.WirelessAdapter;
import com.huawei.sim.multisim.MultiSimConfigActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.lmf;
import defpackage.npz;
import defpackage.pvg;
import defpackage.pvh;
import defpackage.pxk;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class WirelessManagerActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WirelessAdapter f23069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f23070b;
    private Context d;
    private View f;
    private HealthTextView g;
    private ArrayList<pvg> e = new ArrayList<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f23071c = new View.OnClickListener() { // from class: com.huawei.sim.esim.view.WirelessManagerActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                WirelessManagerActivity.this.d.startActivity(new Intent(WirelessManagerActivity.this, (Class<?>) EsimActivationActivity.class));
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("WirelessManagerActivity", "esimListener ActivityNotFoundException");
            }
        }
    };
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.huawei.sim.esim.view.WirelessManagerActivity.4
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("WirelessManagerActivity", "onclick multisim");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MULTISIM_1170001.value(), new HashMap(16), 0);
            if (!WirelessManagerActivity.this.d()) {
                WirelessManagerActivity.this.c();
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setComponent(new ComponentName("com.huawei.hwmultisim", "com.huawei.hwmultisim.views.IntroduceActivity"));
                WirelessManagerActivity.this.startActivity(intent);
            } catch (Exception unused) {
                LogUtil.e("WirelessManagerActivity", "can not start multisim apk");
                WirelessManagerActivity.this.c();
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wireless_activity);
        this.d = this;
        pxk.o(this);
        a();
        b();
        pvh.b(this).b(true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void b() {
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f23070b = listView;
        listView.setAdapter((ListAdapter) this.f23069a);
        this.g = (HealthTextView) findViewById(R.id.wirless_manager_txt);
        this.f = findViewById(R.id.wirless_manager_lint);
        if (npz.b().l()) {
            this.g.setVisibility(0);
            this.f.setVisibility(0);
            String string = getString(R.string.IDS_plugin_multi_sim_manager_txt);
            String string2 = getString(R.string.IDS_plugin_multi_sim_manager_title);
            String[] strArrSplit = String.format(Locale.ENGLISH, string, string2).split(string2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (strArrSplit.length > 0) {
                SpannableString spannableString = new SpannableString(strArrSplit[0]);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.textColorSecondary)), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            SpannableString spannableString2 = new SpannableString(string2);
            spannableString2.setSpan(new ClickableSpan() { // from class: com.huawei.sim.esim.view.WirelessManagerActivity.1
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(WirelessManagerActivity.this.getResources().getColor(R.color.IDS_plugin_sim_next_back_orange_color));
                    textPaint.setUnderlineText(false);
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    WirelessManagerActivity.this.e();
                }
            }, 0, spannableString2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
            if (strArrSplit.length > 1) {
                SpannableString spannableString3 = new SpannableString(strArrSplit[1]);
                spannableString3.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.textColorSecondary)), 0, spannableString3.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString3);
            }
            this.g.setText(spannableStringBuilder);
            this.g.setMovementMethod(LinkMovementMethod.getInstance());
            this.g.setHighlightColor(ContextCompat.getColor(this, R.color.IDS_plugin_sim_transparent));
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("WirelessManagerActivity", "startHelpInstructions enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.sim.esim.view.WirelessManagerActivity.2
            @Override // java.lang.Runnable
            public void run() {
                final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
                WirelessManagerActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.sim.esim.view.WirelessManagerActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        WirelessManagerActivity.this.d(url);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.d != null) {
            try {
                Intent intent = new Intent(this.d, (Class<?>) WebViewActivity.class);
                if (!Utils.o()) {
                    if (LanguageUtil.l(this.d)) {
                        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str + "/SmartWear/Leo/EMUI8.0/C001B001/zh-CN/zh-cn_bookmap_0047655720.html?pos=3");
                    } else {
                        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str + "/SmartWear/Leo/EMUI8.0/C001B001/en-US/content/en-us_bookmap_0209307492.html?pos=3");
                    }
                } else if (LanguageUtil.l(this.d)) {
                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str + "/handbook/SmartWear/Leo/EMUI8.0/C001B001/zh-CN/content/zh-cn_topic_0204333414.html?pos=7");
                } else {
                    intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str + "/handbook/SmartWear/Leo/EMUI8.0/C001B001/en-US/content/en-us_topic_0044851531.html?pos=8");
                }
                intent.putExtra("WebViewActivity.TITLE", getString(R.string.IDS_plugin_multi_sim_manager_title));
                this.d.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("WirelessManagerActivity", "startWebView ActivityNotFoundException");
            }
        }
    }

    private void a() {
        pvg pvgVar = new pvg();
        if (npz.b().l()) {
            LogUtil.a("WirelessManagerActivity", "create esim menu");
            if (LanguageUtil.l(this.d) && !Utils.o() && (CommonUtil.bg() || pxk.g())) {
                LogUtil.a("WirelessManagerActivity", "create multisim menu");
                pvg pvgVar2 = new pvg();
                pvgVar2.e(getString(R.string.IDS_plugin_multi_sim_config_title));
                pvgVar2.b(this.h);
                this.e.add(pvgVar2);
            }
            pvgVar.e(getString(R.string.IDS_plugin_sim_esim_open));
            pvgVar.b(getString(R.string.IDS_plugin_sim_esim_open_tips));
            pvgVar.b(this.f23071c);
            this.e.add(pvgVar);
            this.f23069a = new WirelessAdapter(this.e, this);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pvh.b(this).b(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        try {
            this.d.getPackageManager().getPackageInfo("com.huawei.hwmultisim", 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("WirelessManagerActivity", "no multisim apk");
            xjt.q("no multisim apk");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            this.d.startActivity(new Intent(this, (Class<?>) MultiSimConfigActivity.class));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WirelessManagerActivity", "startMultiSimMenu ActivityNotFoundException");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

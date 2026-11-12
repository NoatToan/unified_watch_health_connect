package com.huawei.pluginachievement.ui.kakatask;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.impl.AchieveObserverExpansion;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.KakaDelayInfo;
import com.huawei.pluginachievement.manager.model.KakaLineRecord;
import com.huawei.pluginachievement.manager.model.KakaRecord;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.ui.adapter.AchieveKaKaAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.oru;
import defpackage.osf;
import defpackage.otl;
import defpackage.otu;
import defpackage.oul;
import defpackage.out;
import defpackage.pap;
import defpackage.pbo;
import defpackage.qpx;
import defpackage.qqs;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveKaKaDetailActivity extends BaseActivity implements View.OnClickListener, AchieveObserverExpansion {
    private otl aa;
    private CustomTitleBar ac;
    private HealthButton ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f22206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22207c;
    private HealthScrollView f;
    private boolean h;
    private KakaLineRecord j;
    private ExecutorService k;
    private HealthButton l;
    private HealthTextView m;
    private HealthCardView o;
    private View q;
    private KakaDelayInfo r;
    private AchieveKaKaAdapter s;
    private LinearLayout u;
    private KakaLineRecord v;
    private LinearLayout w;
    private RelativeLayout x;
    private HealthTextView y;
    private boolean t = false;
    private boolean p = false;
    private int e = 0;
    private int g = 0;
    private int i = 0;
    private int n = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22205a = false;
    private Handler d = new Handler() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "mHanlder, case :", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (AchieveKaKaDetailActivity.this.k == null || AchieveKaKaDetailActivity.this.k.isShutdown()) {
                    LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "mExecutor is shutdown");
                    AchieveKaKaDetailActivity.this.k = Executors.newSingleThreadExecutor();
                }
                AchieveKaKaDetailActivity.this.k.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        AchieveKaKaDetailActivity.this.c();
                        AchieveKaKaDetailActivity.this.h = false;
                    }
                });
                AchieveKaKaDetailActivity.this.d();
            } else if (i == 26) {
                AchieveKaKaDetailActivity.this.o.setVisibility(8);
                MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
                if (messageCenterApi != null) {
                    messageCenterApi.setMessageRead("17");
                }
                AchieveKaKaDetailActivity achieveKaKaDetailActivity = AchieveKaKaDetailActivity.this;
                achieveKaKaDetailActivity.e(achieveKaKaDetailActivity.getString(R.string.IDS_achieve_kaka_delay_success));
                AchieveKaKaDetailActivity.this.w();
            } else if (i != 1000) {
                switch (i) {
                    case 1102:
                        AchieveKaKaDetailActivity.this.r();
                        break;
                    case 1103:
                        AchieveKaKaDetailActivity.this.h = true;
                        AchieveKaKaDetailActivity.this.o();
                        break;
                    case ExceptionCode.CHECK_FILE_HASH_FAILED /* 1104 */:
                        AchieveKaKaDetailActivity.this.b();
                        AchieveKaKaDetailActivity.this.f22207c.setVisibility(0);
                        break;
                }
            } else {
                AchieveKaKaDetailActivity.this.e(message.obj + "");
                LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "ERROR_TIP :", message.obj);
            }
            super.handleMessage(message);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achieve_kaka_detail);
        clearBackgroundDrawable();
        this.k = Executors.newSingleThreadExecutor();
        k();
    }

    private void k() {
        this.ac = (CustomTitleBar) out.d(this, R.id.title);
        this.f = (HealthScrollView) out.d(this, R.id.kk_rlayout);
        this.x = (RelativeLayout) out.d(this, R.id.record_layout);
        this.f22207c = (HealthTextView) out.d(this, R.id.kk_text_no_tip);
        this.f22206b = (ListView) out.d(this, R.id.kk_listview);
        Bundle bundleExtra = null;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.achieve_kaka_foot, (ViewGroup) null);
        this.q = viewInflate;
        this.w = (LinearLayout) out.b(viewInflate, R.id.more_layout);
        this.y = (HealthTextView) out.b(this.q, R.id.rule_read_more);
        this.w.setOnClickListener(this);
        ListView listView = (ListView) out.d(this, R.id.kk_listview);
        this.f22206b = listView;
        listView.setOverScrollMode(2);
        this.s = new AchieveKaKaAdapter(this);
        this.f22206b.addFooterView(this.q);
        this.f22206b.setAdapter((ListAdapter) this.s);
        Drawable drawable = ContextCompat.getDrawable(this, qqs.e(this) ? R.drawable.sport_tab_arrow_right_white : R.drawable.common_ui_arrow_right);
        if (qqs.e(this) && drawable != null) {
            drawable.setAlpha(153);
        }
        this.y.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.u = (LinearLayout) findViewById(R.id.kk_detail_loading);
        o();
        Intent intent = getIntent();
        if (intent != null) {
            bundleExtra = intent.getBundleExtra(RemoteMessageConst.Notification.TAG);
            this.g = intent.getIntExtra("from", 0);
            this.i = intent.getIntExtra("totalNum", 0);
        }
        if (bundleExtra != null) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "initView tag =", "");
            String string = bundleExtra.getString(RemoteMessageConst.Notification.TAG);
            if (!TextUtils.isEmpty(string) && "rule".equals(string)) {
                g();
                t();
            } else if (!TextUtils.isEmpty(string) && JsbMapKeyNames.H5_TEXT_DETAIL.equals(string)) {
                s();
            } else {
                LogUtil.d("PLGACHIEVE_AchieveKaKaDetailActivity", "initView tag is not matching");
            }
            m();
        }
    }

    private void g() {
        if (this.aa == null) {
            otl otlVarB = otl.b(getApplicationContext());
            this.aa = otlVarB;
            otlVarB.c((AchieveObserver) this);
        }
        HashMap map = new HashMap(2);
        map.put("timestamp", "0");
        this.aa.a(1, map);
    }

    private void s() {
        this.ac.setTitleText(getString(R.string.IDS_plugin_achievement_kk_get_consume));
        this.ac.setTitleBarBackgroundColor(getColor(R.color.level_back_color));
        y();
        h();
        pap.e(4, 0, this.i);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            j();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.ac.setTitleText(getString(R.string.IDS_plugin_achievement_kk_kaka_rule));
        this.ac.setTitleBarBackgroundColor(getColor(R.color.common_transparent));
        this.ac.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveKaKaDetailActivity.this.j();
            }
        });
        this.f.setVisibility(0);
        this.x.setVisibility(8);
        l();
        pap.e(2, 0, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.e == 1) {
            this.e = 0;
            s();
            this.f.setVisibility(8);
            this.x.setVisibility(0);
            return;
        }
        finish();
    }

    private void m() {
        this.o = (HealthCardView) out.d(this, R.id.delay_layout);
        this.m = (HealthTextView) out.d(this, R.id.delay_content);
        this.ad = (HealthButton) out.d(this, R.id.use_btn);
        this.l = (HealthButton) out.d(this, R.id.delay_btn);
        this.ad.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveKaKaDetailActivity.this.p = true;
                oru.a(BaseApplication.getContext()).k(AchieveKaKaDetailActivity.this);
                pap.e(2, AchieveKaKaDetailActivity.this.g);
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pap.e(4, AchieveKaKaDetailActivity.this.g);
                AchieveKaKaDetailActivity.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        KakaDelayInfo kakaDelayInfo = this.r;
        if (kakaDelayInfo == null) {
            this.o.setVisibility(8);
            return;
        }
        if (kakaDelayInfo.getDelayRate() != 0) {
            int delayRate = this.r.getDelayRate();
            this.n = delayRate;
            LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "dealKakaDelayDialog rate ", Integer.valueOf(delayRate));
            c(this.n);
        }
        if (this.r.getExpirationKaka() != 0) {
            this.o.setVisibility(0);
            pap.e(1, this.g);
            b(this.r);
            return;
        }
        this.o.setVisibility(8);
    }

    private void b(KakaDelayInfo kakaDelayInfo) {
        if (kakaDelayInfo == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "initKakaDelayContent kakaDelayInfo is null.");
            return;
        }
        String str = kakaDelayInfo.getExpirationKaka() + getString(R.string.IDS_hwh_me_achieve_kaka);
        String strD = oul.d(this, kakaDelayInfo.getUpdateTime());
        String string = getString(R.string.IDS_plugin_achievement_kk_kaka_rule);
        String string2 = getString(R.string.IDS_achieve_kaka_delay_content, new Object[]{str, strD, string});
        SpannableString spannableString = new SpannableString(string2);
        int iIndexOf = string2.indexOf(str);
        if (iIndexOf == -1) {
            LogUtil.e("PLGACHIEVE_AchieveKaKaDetailActivity", "initKakaDelayContent indexOne not find in brief");
            return;
        }
        spannableString.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.colorAccent)), iIndexOf, str.length() + iIndexOf, 33);
        int iIndexOf2 = string2.indexOf(string);
        if (iIndexOf2 == -1) {
            LogUtil.e("PLGACHIEVE_AchieveKaKaDetailActivity", "initKakaDelayContent indexSec not find in brief");
            return;
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.5
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AchieveKaKaDetailActivity.this.e = 1;
                AchieveKaKaDetailActivity.this.t();
                pap.e(3, AchieveKaKaDetailActivity.this.g);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(ContextCompat.getColor(AchieveKaKaDetailActivity.this.getBaseContext(), R.color.colorAccent));
            }
        }, iIndexOf2, string.length() + iIndexOf2, 33);
        this.m.setText(spannableString);
        this.m.setHighlightColor(ContextCompat.getColor(this, android.R.color.transparent));
        this.m.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        KakaDelayInfo kakaDelayInfo = this.r;
        if (kakaDelayInfo == null || kakaDelayInfo.getExpirationKaka() == 0 || this.r.getDelayRate() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "alertDelayDialog mKakaDelayInfo is null or expirationKaka == 0.");
            return;
        }
        String string = getString(R.string.IDS_achieve_kaka_delay_toast, new Object[]{this.r.getExpirationKaka() + getString(R.string.IDS_hwh_me_achieve_kaka), ((int) Math.ceil((((double) this.r.getExpirationKaka()) * 1.0d) / ((double) this.r.getDelayRate()))) + getString(R.string.IDS_hwh_me_achieve_kaka), oul.d(this, oul.e(this.r.getUpdateTime()))});
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.d(R.string.IDS_achieve_kaka_delay_title).e(string).d(R.string.IDS_achieve_kaka_delay_ok, new DialogInterface.OnClickListener() { // from class: ozi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.c(dialogInterface, i);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new DialogInterface.OnClickListener() { // from class: ozf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.e(dialogInterface, i);
            }
        });
        builder.c().setTextColor(getColor(R.color.colorAccent));
        builder.a().setTextColor(getColor(R.color.sleep_entry_card_text_color_90alpha));
        builder.b().show();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap(2);
        map.put("kakaExpire", String.valueOf(this.r.getExpirationKaka()));
        otl.b(getApplicationContext()).a(26, map);
        pap.e(5, this.g);
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "dialog cancel");
        pap.e(6, this.g);
    }

    private void l() {
        String strE;
        String strE2;
        String strE3;
        d(R.id.kk_rule_text1, getString(R.string.IDS_plugin_achievement_kaka_rule_string_1, new Object[]{1}));
        String string = getString(R.string.IDS_plugin_achievement_kaka_rule_string_vmall);
        a(getString(R.string.IDS_achievement_kaka_rule_26, new Object[]{string}), string, R.id.kk_rule_text2);
        d(R.id.kk_rule_text3, getString(R.string.IDS_plugin_achievement_kaka_rule_string_3, new Object[]{2}));
        if (q()) {
            strE = String.valueOf(2.1d);
        } else {
            strE = UnitUtil.e(2.1d, 1, 1);
        }
        d(R.id.kk_rule_task_text1, getString(R.string.IDS_achievement_kaka_rule_27, new Object[]{strE}));
        if (q()) {
            strE2 = String.valueOf(2.3d);
        } else {
            strE2 = UnitUtil.e(2.3d, 1, 1);
        }
        d(R.id.kk_rule_task_text2, getString(R.string.IDS_plugin_achievement_kaka_rule_string_5));
        d(R.id.kk_rule_task_text3, getString(R.string.IDS_plugin_achievement_kaka_rule_string_6, new Object[]{strE2}));
        if (q()) {
            strE3 = String.valueOf(2.2d);
        } else {
            strE3 = UnitUtil.e(2.2d, 1, 1);
        }
        d(R.id.kk_rule_task_text4, getString(R.string.IDS_achievement_kaka_rule_28, new Object[]{strE3}));
        n();
    }

    private void n() {
        d(R.id.kk_rule_text6, getString(R.string.IDS_plugin_achievement_kaka_rule_string_8, new Object[]{50, 1, 50, 1}));
        d(R.id.kk_rule_text7, getString(R.string.IDS_plugin_achievement_kaka_rule_string_9, new Object[]{500, 10}));
        d(R.id.kk_rule_text10, getString(R.string.IDS_plugin_achievement_kaka_rule_string_12, new Object[]{50, 50}));
        d(R.id.kk_rule_text11, getString(R.string.IDS_plugin_achievement_kaka_rule_string_13, new Object[]{3}));
        d(R.id.kk_rule_text12, getString(R.string.IDS_plugin_achievement_kaka_rule_string_15_fixed, new Object[]{30}));
        d(R.id.kk_health_rule_text13, getString(R.string.IDS_plugin_achievement_health_kaka_rule_string_3, new Object[]{20}));
        String string = getString(R.string.IDS_plugin_achievement_kaka_rule_string_exchange_rules);
        a(getString(R.string.IDS_plugin_achievement_kaka_rule_string_16_fixed, new Object[]{1, 1, 200, 200, string}), string, R.id.kk_rule_text13);
        d(R.id.kk_rule_text14, getString(R.string.IDS_plugin_achievement_kaka_rule_string_17, new Object[]{4}));
        c(this.n);
        d(R.id.kk_rule_text16, getString(R.string.IDS_plugin_achievement_kaka_rule_string_19_fixed));
        d(R.id.kk_rule_text17, getString(R.string.IDS_plugin_achievement_kaka_rule_string_20_fixed, new Object[]{Integer.valueOf(KakaConstants.HOT_LINE), "8:00", "20:00"}));
        d(R.id.kk_rule_text22, getString(R.string.IDS_achievement_kaka_rule_22, new Object[]{1, 2, 3, 5, 7, 9, 10, 10, 10}));
        d(R.id.kk_rule_text25, getString(R.string.IDS_achievement_kaka_rule_25, new Object[]{5, 30}));
    }

    private void c(int i) {
        d(R.id.kk_rule_text15, getString(R.string.IDS_kaka_exc_rule_new_25, new Object[]{12, 12, 12, 31, 24, Integer.valueOf(i), 1, 1}));
    }

    private void y() {
        this.f22206b.setVisibility(8);
        this.u.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f22206b.setVisibility(0);
        this.u.setVisibility(8);
    }

    private void a(String str, String str2, final int i) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            LogUtil.e("PLGACHIEVE_AchieveKaKaDetailActivity", "initKakaBrief not find linkName in brief");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.7
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (i == R.id.kk_rule_text2) {
                    AchieveKaKaDetailActivity.this.f();
                } else if (i == R.id.kk_rule_text13) {
                    AchieveKaKaDetailActivity.this.i();
                } else {
                    LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "initKakaBrief cannot find the view");
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(ContextCompat.getColor(AchieveKaKaDetailActivity.this.getBaseContext(), R.color.colorAccent));
            }
        }, iIndexOf, str2.length() + iIndexOf, 33);
        HealthTextView healthTextView = (HealthTextView) findViewById(i);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void d(int i, CharSequence charSequence) {
        ((HealthTextView) findViewById(i)).setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String url = GRSManager.c(this).getUrl("domainMVmall");
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "gotoPointsMall host is empty");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", url + KakaConstants.HUAWEI_PONITS_RULES_PATH);
        pap.c(this, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Intent intent = new Intent();
        intent.setClassName(this, PersonalData.CLASS_NAME_PERSONAL_KAKA_EXCHANGE_POINT_RULE);
        startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.p) {
            pap.e(4, 0, this.i);
            pap.e(1, this.g);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pbo.d(this.k);
        KakaLineRecord kakaLineRecord = this.v;
        if (kakaLineRecord != null && kakaLineRecord.getKakaLineRecords() != null) {
            this.v.getKakaLineRecords().clear();
        }
        otl otlVar = this.aa;
        if (otlVar != null) {
            otlVar.d(this);
        }
        this.aa = null;
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void h() {
        this.aa = otl.b(getApplicationContext());
        LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "getData()");
        this.aa.c((AchieveObserver) this);
        this.k.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.9
            @Override // java.lang.Runnable
            public void run() {
                AchieveKaKaDetailActivity.this.w();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        c();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        osf osfVarB;
        if (this.f22205a) {
            osfVarB = a(1);
        } else {
            HashMap map = new HashMap(8);
            map.put("page", String.valueOf(1));
            map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, String.valueOf(10));
            otl otlVar = this.aa;
            osfVarB = otlVar != null ? otlVar.b(6, map) : null;
        }
        if (osfVarB instanceof KakaLineRecord) {
            KakaLineRecord kakaLineRecord = (KakaLineRecord) osfVarB;
            this.v = kakaLineRecord;
            if (kakaLineRecord.getKakaLineRecords() != null) {
                a(1102, (Object) null);
                return;
            }
        }
        if (this.t) {
            d(ExceptionCode.CHECK_FILE_HASH_FAILED);
        }
    }

    private void e() {
        otu otuVarB = otu.b(getApplicationContext());
        long jA = otuVarB != null ? otuVarB.a(this.aa) : 0L;
        HashMap map = new HashMap(8);
        map.put("timestamp", String.valueOf(jA));
        otl otlVar = this.aa;
        if (otlVar != null) {
            otlVar.a(1, map);
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "doRefreshCloudKakaLine() timeKakaMax=", Long.valueOf(jA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        int size;
        b();
        this.f22207c.setVisibility(0);
        if (this.v == null) {
            return;
        }
        o();
        if (this.v.getKakaLineRecords() == null || this.v.getKakaLineRecords().size() == 0) {
            size = 0;
        } else {
            size = this.v.getKakaLineRecords().size();
            this.f22207c.setVisibility(8);
            if (size % 10 == 0 && !this.h) {
                v();
            }
        }
        if (this.v.getTotalNum() == size) {
            o();
        }
        this.h = false;
        this.s.c(this.v.getKakaLineRecords());
        if (this.v.getKakaLineRecords() == null || size > 10) {
            return;
        }
        this.f22206b.setSelection(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void a(int i, T t) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "sendHandlerMessage: handler is null -> " + i);
            return;
        }
        handler.sendMessage(messageObtain);
    }

    private void d(int i) {
        Handler handler = this.d;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "sendEmptyMessage: handler is null -> " + i);
            return;
        }
        handler.sendEmptyMessage(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        qpx.e(BaseApplication.getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.q.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.q.setVisibility(8);
            View view = this.q;
            view.setPadding(0, -view.getHeight(), 0, 0);
        }
    }

    private void v() {
        if (this.q.getVisibility() != 0) {
            this.q.setVisibility(0);
            this.w.setVisibility(0);
            this.q.setPadding(0, 0, 0, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        new HashMap(8).put("click", "1");
        if (R.id.more_layout == view.getId()) {
            p();
            pap.e(3, 0, this.i);
        }
    }

    private void p() {
        KakaLineRecord kakaLineRecord = this.v;
        if (kakaLineRecord == null || kakaLineRecord.getKakaLineRecords() == null) {
            this.h = true;
            o();
        } else {
            this.k.execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity.6
                @Override // java.lang.Runnable
                public void run() {
                    osf osfVarB;
                    int size = (AchieveKaKaDetailActivity.this.v.getKakaLineRecords().size() / 10) + 1;
                    if (AchieveKaKaDetailActivity.this.v.getKakaLineRecords().size() % 10 == 0) {
                        size = AchieveKaKaDetailActivity.this.v.getKakaLineRecords().size() / 10;
                    }
                    if (AchieveKaKaDetailActivity.this.f22205a) {
                        osfVarB = AchieveKaKaDetailActivity.this.a(size + 1);
                    } else {
                        HashMap map = new HashMap(8);
                        map.put("page", String.valueOf(size + 1));
                        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, String.valueOf(10));
                        osfVarB = AchieveKaKaDetailActivity.this.aa != null ? AchieveKaKaDetailActivity.this.aa.b(6, map) : null;
                    }
                    if (!(osfVarB instanceof KakaLineRecord)) {
                        AchieveKaKaDetailActivity.this.a(1103, (Object) null);
                        return;
                    }
                    KakaLineRecord kakaLineRecord2 = (KakaLineRecord) osfVarB;
                    if (kakaLineRecord2.getKakaLineRecords() != null) {
                        if (kakaLineRecord2.getKakaLineRecords().size() < 10) {
                            AchieveKaKaDetailActivity.this.h = true;
                        }
                        AchieveKaKaDetailActivity.this.v.getKakaLineRecords().addAll(kakaLineRecord2.getKakaLineRecords());
                        AchieveKaKaDetailActivity.this.a(1102, (Object) null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public KakaLineRecord a(int i) {
        KakaLineRecord kakaLineRecord = new KakaLineRecord();
        kakaLineRecord.setTotalNum(this.j.getTotalNum());
        List<KakaRecord> kakaLineRecords = this.j.getKakaLineRecords();
        int i2 = (i - 1) * 10;
        if (i2 > kakaLineRecords.size()) {
            return null;
        }
        kakaLineRecord.setKakaLineRecords(new ArrayList(kakaLineRecords.subList(i2, Math.min(i * 10, kakaLineRecords.size()))));
        return kakaLineRecord;
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserverExpansion
    public void onCloudDataCallback(int i, UserAchieveWrapper userAchieveWrapper) {
        List<KakaRecord> kakaLineRecords;
        if (this.v == null && userAchieveWrapper != null && userAchieveWrapper.getContentType() == 1) {
            KakaLineRecord kakaLineRecord = userAchieveWrapper.getKakaLineRecord();
            this.j = kakaLineRecord;
            if (kakaLineRecord == null || (kakaLineRecords = kakaLineRecord.getKakaLineRecords()) == null || kakaLineRecords.isEmpty()) {
                return;
            }
            LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "onCloudDataCallback error=", Integer.valueOf(i));
            this.f22205a = true;
            this.t = true;
            d(this.j);
            a(1, (Object) null);
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "onDataChanged error=", Integer.valueOf(i));
        if (i == -1) {
            LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "showNetworkErrorDialog error=", Integer.valueOf(i));
            d(1001);
            return;
        }
        if (userAchieveWrapper == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "onDataChanged resultCode=", userAchieveWrapper.getResultCode());
        if (!"0".equals(userAchieveWrapper.getResultCode())) {
            e(userAchieveWrapper);
            return;
        }
        if (userAchieveWrapper.getContentType() == 1) {
            if (this.f22205a) {
                LogUtil.a("PLGACHIEVE_AchieveKaKaDetailActivity", "onDataChanged isUsingCloudData=true");
                return;
            }
            this.t = true;
            d(userAchieveWrapper.getKakaLineRecord());
            a(1, (Object) null);
            return;
        }
        if (userAchieveWrapper.getContentType() == 26) {
            a(26, (Object) null);
        } else {
            LogUtil.d("PLGACHIEVE_AchieveKaKaDetailActivity", "onDataChanged content type:", Integer.valueOf(userAchieveWrapper.getContentType()));
        }
    }

    private void e(UserAchieveWrapper userAchieveWrapper) {
        String string;
        String resultCode = userAchieveWrapper.getResultCode();
        resultCode.hashCode();
        if (resultCode.equals("12030003")) {
            string = getString(R.string.IDS_achieve_kaka_not_now);
        } else if (resultCode.equals(ResultCode.CODE_NOT_DELAY_NUM)) {
            string = getString(R.string.IDS_achieve_kaka_not_num);
        } else {
            LogUtil.j("PLGACHIEVE_AchieveKaKaDetailActivity", "unknow error:", resultCode);
            string = null;
        }
        if (string != null) {
            a(1000, string);
        }
    }

    private void d(KakaLineRecord kakaLineRecord) {
        if (kakaLineRecord != null) {
            this.r = kakaLineRecord.getKakaDelayInfo();
        }
    }

    private boolean q() {
        return LanguageUtil.au(this) || LanguageUtil.ay(this) || LanguageUtil.ah(this) || LanguageUtil.ar(this) || LanguageUtil.at(this) || LanguageUtil.az(this) || LanguageUtil.av(this) || LanguageUtil.bl(this) || LanguageUtil.ad(this) || LanguageUtil.am(this) || LanguageUtil.bc(this) || LanguageUtil.bq(this) || LanguageUtil.bj(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

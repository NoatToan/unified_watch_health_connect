package com.huawei.pluginachievement.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.KakaRedeemInfo;
import com.huawei.pluginachievement.manager.model.KakaRedeemResult;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.lmf;
import defpackage.osb;
import defpackage.otl;
import defpackage.pap;
import defpackage.pbr;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AchieveKakaExchangeActivity extends BaseActivity implements View.OnClickListener, AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f22052a;
    private HealthRadioButton aa;
    private HealthTextView ab;
    private RelativeLayout ac;
    private CustomTextAlertDialog ad;
    private HealthRadioButton ae;
    private HealthRadioButton af;
    private HealthRadioButton ag;
    private HealthRadioButton ah;
    private LinearLayout ai;
    private NoTitleCustomAlertDialog aj;
    private RelativeLayout ak;
    private RelativeLayout al;
    private NoTitleCustomAlertDialog am;
    private Integer an;
    private RelativeLayout ap;
    private RelativeLayout aq;
    private RelativeLayout ar;
    private int as;
    private HealthButton au;
    private ImageView aw;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private otl f22053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22054c;
    private int d;
    private HealthTextView h;
    private HealthDivider i;
    private HealthDivider j;
    private HealthButton k;
    private HealthDivider l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private NoTitleCustomAlertDialog u;
    private HealthTextView v;
    private KakaRedeemInfo w;
    private HealthTextView x;
    private LinearLayout y;
    private int f = 2;
    private int z = 1;
    private int e = 0;
    private Dialog g = null;
    private SparseArray<HealthRadioButton> ao = new SparseArray<>(2);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        ViewGroup.LayoutParams layoutParams = ((HealthCardView) findViewById(R.id.vmall_image_card)).getLayoutParams();
        if (layoutParams == null || !qrs.af(this.f22054c)) {
            return;
        }
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f22054c, 1);
        layoutParams.width = ((d(this.f22054c) - qqp.b(this.f22054c)) - (healthColumnSystem.c() * 2)) / 2;
    }

    private int d(Context context) {
        if (context == null) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeActivity", "getWindowWidth() context is null!!");
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achievement_kaka_exchange_point);
        getWindow().getDecorView().setBackgroundResource(R.color.transparent);
        this.f22054c = this;
        m();
        otl otlVarB = otl.b(BaseApplication.b());
        this.f22053b = otlVarB;
        otlVarB.c((AchieveObserver) this);
        j();
        c();
    }

    private void m() {
        ((LinearLayout) findViewById(R.id.kaka_exchange_tips)).setOnClickListener(this);
        this.v = (HealthTextView) findViewById(R.id.my_kaka_value);
        this.ab = (HealthTextView) findViewById(R.id.kaka_exchange_points_value);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.kaka_exchange_tips_text);
        this.h = healthTextView;
        healthTextView.setVisibility(8);
        ImageView imageView = (ImageView) findViewById(R.id.vmall_image);
        this.aw = imageView;
        imageView.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.achieve_exchange_network_error);
        this.ac = relativeLayout;
        HealthButton healthButton = (HealthButton) relativeLayout.findViewById(R.id.btn_no_net_work);
        this.au = healthButton;
        healthButton.setOnClickListener(this);
        this.f22052a = (LinearLayout) findViewById(R.id.achieve_kaka_exchange_content);
        HealthButton healthButton2 = (HealthButton) findViewById(R.id.kaka_exchange_points_button);
        this.k = healthButton2;
        healthButton2.setOnClickListener(this);
        h();
        a(R.drawable.button_background_emphasize_disable, false);
        if (!osb.c(this.f22054c)) {
            this.ac.setVisibility(0);
            this.f22052a.setVisibility(8);
            this.ac.setOnClickListener(this);
        }
        initViewTahiti();
        ((HealthSubHeader) findViewById(R.id.mall_title)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
    }

    private void h() {
        this.ai = (LinearLayout) findViewById(R.id.remain_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.exchange_remain_tip);
        this.y = linearLayout;
        linearLayout.setOnClickListener(this);
        this.m = (HealthTextView) findViewById(R.id.remian_digit_1);
        this.o = (HealthTextView) findViewById(R.id.remian_digit_2);
        this.p = (HealthTextView) findViewById(R.id.remian_digit_3);
        this.s = (HealthTextView) findViewById(R.id.remian_digit_4);
        this.t = (HealthTextView) findViewById(R.id.remian_digit_5);
        this.q = (HealthTextView) findViewById(R.id.remian_digit_6);
        this.r = (HealthTextView) findViewById(R.id.remian_digit_7);
        this.x = (HealthTextView) findViewById(R.id.remian_digit_8);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f22054c.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.m.setTypeface(typefaceCreateFromAsset);
        this.o.setTypeface(typefaceCreateFromAsset);
        this.p.setTypeface(typefaceCreateFromAsset);
        this.s.setTypeface(typefaceCreateFromAsset);
        this.t.setTypeface(typefaceCreateFromAsset);
        this.q.setTypeface(typefaceCreateFromAsset);
        this.r.setTypeface(typefaceCreateFromAsset);
        this.x.setTypeface(typefaceCreateFromAsset);
    }

    private void j() {
        if (!osb.c(this.f22054c)) {
            s();
            return;
        }
        this.ac.setVisibility(8);
        this.f22052a.setVisibility(0);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.3
            @Override // java.lang.Runnable
            public void run() {
                AchieveKakaExchangeActivity.this.l();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.kaka_exchange_tips) {
            g();
            d();
            return;
        }
        if (view.getId() == R.id.kaka_exchange_points_button) {
            if (!osb.c(this.f22054c)) {
                s();
                return;
            } else {
                r();
                return;
            }
        }
        if (view.getId() == R.id.achieve_exchange_network_error) {
            j();
            return;
        }
        if (view.getId() == R.id.btn_no_net_work) {
            f();
            return;
        }
        if (view.getId() == R.id.vmall_image) {
            i();
        } else if (view.getId() == R.id.exchange_remain_tip) {
            this.am = c(R.string.IDS_ka_ka_exc_points_remain_explain, this.am);
        } else {
            c(view);
        }
    }

    private NoTitleCustomAlertDialog c(int i, NoTitleCustomAlertDialog noTitleCustomAlertDialog) {
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "showRemainTipDialog");
        String string = this.f22054c.getResources().getString(R.string.IDS_plugin_achievement_kaka_rule_string_exchange_rules);
        String string2 = this.f22054c.getResources().getString(i, string);
        if (noTitleCustomAlertDialog == null) {
            noTitleCustomAlertDialog = new NoTitleCustomAlertDialog.Builder(this.f22054c).b(c(string2, string)).d(R.string.IDS_plugin_achievement_network_error_msg_btn, R.color.indicate_high_color, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AchieveKakaExchangeActivity.this.b();
                }
            }).c();
            noTitleCustomAlertDialog.setCancelable(false);
        }
        if (isFinishing() && isDestroyed()) {
            return noTitleCustomAlertDialog;
        }
        noTitleCustomAlertDialog.show();
        return noTitleCustomAlertDialog;
    }

    private void r() {
        if (this.g == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "showKakaExchangeValueDialog()");
            Object systemService = this.f22054c.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                return;
            }
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.achieve_kaka_exchange_select_value_view, (ViewGroup) null);
            a(viewInflate);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f22054c);
            builder.d(viewInflate).c(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).d(com.huawei.ui.commonui.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AchieveKakaExchangeActivity.this.e();
                }
            });
            this.g = builder.d();
        }
        k();
        if (isFinishing()) {
            return;
        }
        this.g.show();
    }

    private void a(View view) {
        this.n = (HealthTextView) view.findViewById(R.id.kaka_exc_dialog_title);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.kaka_exchange_select_one);
        this.aq = relativeLayout;
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.kaka_exchange_select_two);
        this.ap = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(R.id.kaka_exchange_select_three);
        this.ar = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(R.id.kaka_exchange_select_four);
        this.al = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) view.findViewById(R.id.kaka_exchange_select_five);
        this.ak = relativeLayout5;
        relativeLayout5.setOnClickListener(this);
        this.ah = (HealthRadioButton) view.findViewById(R.id.kaka_exchange_value_button_one);
        this.ae = (HealthRadioButton) view.findViewById(R.id.kaka_exchange_value_button_two);
        this.ag = (HealthRadioButton) view.findViewById(R.id.kaka_exchange_value_button_three);
        this.af = (HealthRadioButton) view.findViewById(R.id.kaka_exchange_value_button_four);
        this.aa = (HealthRadioButton) view.findViewById(R.id.kaka_exchange_value_button_five);
        this.l = (HealthDivider) view.findViewById(R.id.kaka_exchange_picker_divide_line2);
        this.i = (HealthDivider) view.findViewById(R.id.kaka_exchange_picker_divide_line3);
        this.j = (HealthDivider) view.findViewById(R.id.kaka_exchange_picker_divide_line4);
        e(view, R.id.kaka_exchange_value_one, 100);
        e(view, R.id.kaka_exchange_value_two, 200);
        e(view, R.id.kaka_exchange_value_three, 300);
        e(view, R.id.kaka_exchange_value_four, 400);
        e(view, R.id.kaka_exchange_value_five, 500);
    }

    private void k() {
        String quantityString = getResources().getQuantityString(R.plurals.IDS_plugin_achievement_kaka_exchange_select_tips, this.f);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, quantityString, Integer.valueOf(this.f)));
        if (this.an != null) {
            String quantityString2 = getResources().getQuantityString(R.plurals.IDS_ka_exc_points_remain_dialog, this.an.intValue());
            sb.append(System.lineSeparator());
            sb.append(String.format(Locale.ENGLISH, quantityString2, this.an));
        }
        this.n.setText(sb);
        int i = this.d / 100;
        if (i == 1 || i == 2) {
            this.l.setVisibility(8);
            this.ar.setVisibility(8);
            this.i.setVisibility(8);
            this.al.setVisibility(8);
            this.j.setVisibility(8);
            this.ak.setVisibility(8);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.j.setVisibility(8);
            this.ak.setVisibility(8);
            return;
        }
        this.i.setVisibility(8);
        this.al.setVisibility(8);
        this.j.setVisibility(8);
        this.ak.setVisibility(8);
    }

    private void e(View view, int i, int i2) {
        ((HealthTextView) view.findViewById(i)).setText(UnitUtil.e(i2, 1, 0));
    }

    private void c(View view) {
        if (view.getId() == R.id.kaka_exchange_select_one) {
            c(this.ah, 100);
            return;
        }
        if (view.getId() == R.id.kaka_exchange_select_two) {
            c(this.ae, 200);
            return;
        }
        if (view.getId() == R.id.kaka_exchange_select_three) {
            c(this.ag, 300);
            return;
        }
        if (view.getId() == R.id.kaka_exchange_select_four) {
            c(this.af, 400);
        } else if (view.getId() == R.id.kaka_exchange_select_five) {
            c(this.aa, 500);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "setDialogSelectStatus invalid");
        }
    }

    private void c(HealthRadioButton healthRadioButton, int i) {
        this.as = i;
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "refreshRadioButton mSelectValue = ", Integer.valueOf(i));
        HealthRadioButton healthRadioButton2 = this.ao.get(0);
        if (healthRadioButton2 != null) {
            this.ao.put(1, healthRadioButton2);
            healthRadioButton2.setChecked(false);
        }
        this.ao.put(0, healthRadioButton);
        healthRadioButton.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        HashMap map = new HashMap(4);
        map.put("type", "1");
        otl otlVar = this.f22053b;
        if (otlVar != null) {
            otlVar.a(15, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!osb.c(this.f22054c)) {
            s();
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "exchangePoints mSelectValue = ", Integer.valueOf(this.as));
        int i = this.as;
        if (i == 0) {
            return;
        }
        if (i > this.e) {
            pbr.a().e(this.f22054c, String.format(Locale.ROOT, getString(R.string.IDS_plugin_achievement_kaka_exchange_kaka_number_not_enough), Integer.valueOf(this.as)));
            a(0, 1);
            return;
        }
        HashMap map = new HashMap(4);
        String strE = pap.e();
        map.put("type", "1");
        map.put("timeZone", strE);
        map.put("kaka", String.valueOf(this.as));
        otl otlVar = this.f22053b;
        if (otlVar != null) {
            otlVar.a(16, map);
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (userAchieveWrapper == null) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeActivity", "onDataChanged null");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        if (contentType != 16 && contentType != 15) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeActivity", "ContentType error");
            return;
        }
        final String resultCode = userAchieveWrapper.getResultCode();
        if (!"0".equals(resultCode)) {
            LogUtil.e("PLGACHIEVE_AchieveKakaExchangeActivity", "resultCode error:", resultCode);
            if (contentType == 16) {
                KakaRedeemResult redeemResult = userAchieveWrapper.getRedeemResult();
                if (redeemResult == null) {
                    LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "kakaRedeemResult null");
                    return;
                }
                this.an = redeemResult.getRemainingKaka();
            }
            runOnUiThread(new Runnable() { // from class: oxo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44962c.b(resultCode);
                }
            });
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "onDataChanged type: ", Integer.valueOf(contentType));
        if (contentType == 16) {
            final KakaRedeemResult redeemResult2 = userAchieveWrapper.getRedeemResult();
            if (redeemResult2 == null) {
                LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "kakaRedeemResult null");
                return;
            } else {
                runOnUiThread(new Runnable() { // from class: oxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.d(redeemResult2);
                    }
                });
                return;
            }
        }
        final KakaRedeemInfo redeemInfo = userAchieveWrapper.getRedeemInfo();
        if (redeemInfo == null) {
            LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "kakaRedeemInfo null");
        } else {
            runOnUiThread(new Runnable() { // from class: oxq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(redeemInfo);
                }
            });
        }
    }

    public /* synthetic */ void b(String str) {
        d(str);
        a(0, 1);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(KakaRedeemInfo kakaRedeemInfo) {
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "kakaRedeemInfo: ", kakaRedeemInfo.toString());
        this.e = kakaRedeemInfo.getKakaSum();
        int dailyLimit = kakaRedeemInfo.getDailyLimit();
        this.f = dailyLimit;
        this.w = kakaRedeemInfo;
        boolean z = dailyLimit - kakaRedeemInfo.getRedeemTimes() > 0;
        boolean z2 = this.e >= 200;
        this.z = kakaRedeemInfo.getExchangeProportion();
        o();
        this.an = kakaRedeemInfo.getRemainingKaka();
        b(z, z2);
    }

    private void o() {
        int i = this.z;
        int i2 = this.e;
        this.d = ((i > 0 ? i2 / i : i2 * Math.abs(i)) / 100) * 100;
        this.v.setText(String.valueOf(UnitUtil.e(this.e, 1, 0)));
        this.ab.setText(String.valueOf(UnitUtil.e(this.d, 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(KakaRedeemResult kakaRedeemResult) {
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "kakaRedeemInfo: ", kakaRedeemResult.toString());
        this.e = kakaRedeemResult.getKakaSum();
        boolean z = this.f - kakaRedeemResult.getRedeemTimes() > 0;
        boolean z2 = this.e >= 200;
        this.an = kakaRedeemResult.getRemainingKaka();
        b(z, z2);
        o();
        p();
    }

    private void b(boolean z, boolean z2) {
        n();
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "refreshExchangeStatus: ", Boolean.valueOf(z), "isRedeemSum", Boolean.valueOf(z2));
        if (!z || !z2) {
            a(R.drawable.button_background_emphasize_disable, false);
            this.h.setVisibility(0);
            if (!z) {
                this.h.setText(getString(R.string.IDS_plugin_achievement_kaka_exchange_point_number_not_enough));
                return;
            } else {
                if (z2) {
                    return;
                }
                this.h.setText(String.format(Locale.ROOT, getString(R.string.IDS_plugin_achievement_kaka_exchange_kaka_number_not_enough), 200));
                return;
            }
        }
        a(R.drawable.button_background_emphasize, true);
    }

    private void a(int i, boolean z) {
        this.k.setBackground(ContextCompat.getDrawable(this.f22054c, i));
        this.k.setClickable(z);
    }

    private void s() {
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "showNetworkErrorDialog()");
        b();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f22054c);
        builder.a(R.string.IDS_plugin_achievement_network_error_msg_title).b(R.string.IDS_plugin_achievement_network_error_msg_content_2).a(R.string.IDS_plugin_achievement_network_error_msg_btn, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveKakaExchangeActivity.this.b();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.ad = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(true);
        if (isFinishing()) {
            return;
        }
        this.ad.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CustomTextAlertDialog customTextAlertDialog = this.ad;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            return;
        }
        this.ad.dismiss();
    }

    private void p() {
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "showExchangeSuccessDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f22054c).a(String.format(Locale.ROOT, this.f22054c.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_kaka_exchange_success_tips, this.as), Integer.valueOf(this.as))).d(R.string.IDS_plugin_achievement_kaka_exchange_use_points, R.color.indicate_high_color, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveKakaExchangeActivity.this.u.dismiss();
                AchieveKakaExchangeActivity.this.i();
            }
        }).e(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, R.color.indicate_high_color, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AchieveKakaExchangeActivity.this.u.dismiss();
            }
        }).c();
        this.u = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (!isFinishing() || !isDestroyed()) {
            this.u.show();
        }
        a(1, this.as);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void d(String str) {
        byte b2;
        String string;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1948319258) {
            if (iHashCode != -1948319166) {
                if (iHashCode == 50424247 && str.equals("50002")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(ResultCode.KAKA_EXCHANGE_REMAIN_NO_ENOUGH)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(ResultCode.KAKA_EXCHANGE_SUM_NO_ENOUGH)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            string = getString(R.string.IDS_plugin_achievement_kaka_exchange_point_number_not_enough);
        } else if (b2 == 1) {
            this.aj = c(R.string.IDS_ka_exc_points_out_remain, this.aj);
            string = "";
        } else if (b2 == 2) {
            string = String.format(Locale.ROOT, getString(R.string.IDS_plugin_achievement_kaka_exchange_kaka_number_not_enough), Integer.valueOf(this.as));
        } else {
            string = getString(R.string.IDS_plugin_achievement_network_error_msg_content_2);
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        pbr.a().e(this.f22054c, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!osb.c(this.f22054c)) {
            s();
        } else {
            pap.e("&cid=181365");
            a();
        }
    }

    private void f() {
        CommonUtil.t(this.f22054c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        otl otlVar = this.f22053b;
        if (otlVar != null) {
            otlVar.d(this);
        }
        this.f22053b = null;
    }

    private void c() {
        HashMap map = new HashMap(1);
        String strValue = AnalyticsValue.HEALTH_KAKA_EXCHANGE_ENTER_2040074.value();
        map.put("click", 1);
        lmf.d().c(this.f22054c, strValue, map, 0);
    }

    private void a(int i, int i2) {
        HashMap map = new HashMap(2);
        map.put("type", Integer.valueOf(i));
        map.put("value", Integer.valueOf(i2));
        lmf lmfVarD = lmf.d();
        LogUtil.d("PLGACHIEVE_AchieveKakaExchangeActivity", "doBiKakaExchangeResults type = ", Integer.valueOf(i), " value = ", Integer.valueOf(i2), " mSelectValue =", Integer.valueOf(this.as));
        lmfVarD.c(this.f22054c, AnalyticsValue.HEALTH_KAKA_EXCHANGE_RESULTS_2040075.value(), map, 0);
    }

    private void a() {
        HashMap map = new HashMap(1);
        String strValue = AnalyticsValue.HEALTH_KAKA_EXCHANGE_VMALL_2040076.value();
        map.put("click", 1);
        lmf.d().c(this.f22054c, strValue, map, 0);
    }

    private void d() {
        HashMap map = new HashMap(1);
        String strValue = AnalyticsValue.HEALTH_KAKA_EXCHANGE_RULE_2040077.value();
        map.put("click", "1");
        lmf.d().c(this.f22054c, strValue, map, 0);
    }

    private SpannableString c(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(str2);
        SpannableString spannableString = new SpannableString(str);
        if (iLastIndexOf == -1) {
            LogUtil.j("PLGACHIEVE_AchieveKakaExchangeActivity", "splicingString not find linkName in originalStr");
            return spannableString;
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.huawei.pluginachievement.ui.AchieveKakaExchangeActivity.9
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AchieveKakaExchangeActivity.this.g();
                if (AchieveKakaExchangeActivity.this.am != null && AchieveKakaExchangeActivity.this.am.isShowing()) {
                    AchieveKakaExchangeActivity.this.am.dismiss();
                }
                if (AchieveKakaExchangeActivity.this.aj == null || !AchieveKakaExchangeActivity.this.aj.isShowing()) {
                    return;
                }
                AchieveKakaExchangeActivity.this.aj.dismiss();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(ContextCompat.getColor(AchieveKakaExchangeActivity.this.getBaseContext(), R.color.colorAccent));
            }
        }, iLastIndexOf, str2.length() + iLastIndexOf, 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Intent intent = new Intent();
        intent.putExtra(KakaConstants.EXCHANGE_REDEEM_INFO, this.w);
        intent.setClassName(this.f22054c, PersonalData.CLASS_NAME_PERSONAL_KAKA_EXCHANGE_POINT_RULE);
        this.f22054c.startActivity(intent);
    }

    private void n() {
        if (this.an != null) {
            this.ai.setVisibility(0);
            d(this.an.intValue());
        } else {
            this.ai.setVisibility(8);
        }
    }

    private void d(int i) {
        String strE;
        LogUtil.a("PLGACHIEVE_AchieveKakaExchangeActivity", "showRemainDigit remainKaka = ", Integer.valueOf(i));
        char[] charArray = String.valueOf(i).toCharArray();
        int length = charArray.length;
        if (length > 6) {
            this.r.setVisibility(0);
            this.x.setVisibility(0);
        } else {
            this.r.setVisibility(8);
            this.x.setVisibility(8);
        }
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = 0; i2 < 8; i2++) {
            if (i2 < length) {
                strE = UnitUtil.e(Character.getNumericValue(charArray[(length - i2) - 1]), 1, 0);
            } else {
                strE = UnitUtil.e(0.0d, 1, 0);
            }
            arrayList.add(strE);
        }
        this.m.setText((CharSequence) arrayList.get(0));
        this.o.setText((CharSequence) arrayList.get(1));
        this.p.setText((CharSequence) arrayList.get(2));
        this.s.setText((CharSequence) arrayList.get(3));
        this.t.setText((CharSequence) arrayList.get(4));
        this.q.setText((CharSequence) arrayList.get(5));
        this.r.setText((CharSequence) arrayList.get(6));
        this.x.setText((CharSequence) arrayList.get(7));
    }
}

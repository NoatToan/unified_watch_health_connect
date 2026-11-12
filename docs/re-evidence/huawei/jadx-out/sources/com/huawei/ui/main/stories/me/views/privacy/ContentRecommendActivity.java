package com.huawei.ui.main.stories.me.views.privacy;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.media3.common.C;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.me.views.builder.PrivacyClickableSpan;
import com.huawei.ui.main.stories.me.views.privacy.ContentRecommendActivity;
import com.huawei.up.callback.CommonCallback;
import defpackage.ioi;
import defpackage.iov;
import defpackage.iox;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.niz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qte;
import defpackage.vwd;
import defpackage.wmq;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class ContentRecommendActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f28551a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28553c;
    private HealthCheckBox d;
    private RelativeLayout e;
    private HealthTextView f;
    private wmq g;
    private HealthSwitchButton h;
    private HealthTextView i;
    private RelativeLayout k;
    private HealthSwitchButton m;
    private RelativeLayout o;
    private CustomAlertDialog p;
    private RelativeLayout q;
    private HealthCheckBox s;
    private ioi t;
    private boolean j = false;
    private int r = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28552b = true;
    private volatile Boolean n = null;
    private AtomicBoolean l = new AtomicBoolean(true);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_content_recommend);
        clearBackgroundDrawable();
        this.f28553c = this;
        this.g = wmq.a(getApplicationContext());
        this.t = ioi.d();
        this.g = wmq.a(getApplicationContext());
        h();
        this.t.a(new d(false, this));
        f();
    }

    private void e() {
        LogUtil.a("ContentRecommendActivity", "enterPageBiEvent");
        vwd.d(0, "m0", "", new String[]{"recommendation_switch", "health_data_recommendation_switch", "content_recommendation_switch", "watchface_recommendation_switch"}, new String[]{String.valueOf(this.m.isChecked()), String.valueOf(this.h.isChecked()), String.valueOf(e(this.t)), String.valueOf(b(this.t))});
    }

    public static class d implements CommonCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ContentRecommendActivity> f28555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28556c;

        d(boolean z, ContentRecommendActivity contentRecommendActivity) {
            this.f28556c = false;
            this.f28555b = new WeakReference<>(contentRecommendActivity);
            this.f28556c = z;
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onSuccess(Bundle bundle) {
            LogUtil.a("ContentRecommendActivity", "toGetPrivacySportData from cloud success.");
            final ContentRecommendActivity contentRecommendActivity = this.f28555b.get();
            if (contentRecommendActivity == null || contentRecommendActivity.isFinishing()) {
                LogUtil.a("ContentRecommendActivity", "toGetPrivacySportData activity == null or isFinishing");
            } else if (!this.f28556c) {
                contentRecommendActivity.a();
            } else {
                contentRecommendActivity.runOnUiThread(new Runnable() { // from class: vxe
                    @Override // java.lang.Runnable
                    public final void run() {
                        ContentRecommendActivity.d.c(contentRecommendActivity);
                    }
                });
            }
        }

        public static /* synthetic */ void c(ContentRecommendActivity contentRecommendActivity) {
            contentRecommendActivity.a(contentRecommendActivity.t, true);
            contentRecommendActivity.a(contentRecommendActivity.g, contentRecommendActivity.t);
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onFail(int i) {
            LogUtil.a("ContentRecommendActivity", "toGetPrivacySportData from cloud failure. code = ", Integer.valueOf(i));
        }
    }

    private void h() {
        this.o = (RelativeLayout) findViewById(R.id.rel_loading);
        i();
        if (!Utils.o()) {
            ((CustomTitleBar) qsp.a(this, R.id.personal_privacy_set_titlebar)).setTitleText(getString(R.string.IDS_hwh_personal_recommend_tile));
        }
        a(this.t, false);
        boolean zE = e(this.t);
        boolean zB = b(this.t);
        j(true);
        d(zE, zB, false);
        g();
        a(this.g, this.t);
        l();
    }

    private void i() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.hw_show_setting_personalization_main_layout);
        this.k = relativeLayout;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = qre.b(R.dimen.health_common_8dp);
            layoutParams2.rightMargin = qre.b(R.dimen.health_common_8dp);
            this.k.setLayoutParams(layoutParams2);
        }
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this.k, R.id.hw_health_analysis_and_improvement);
        this.m = healthSwitchButton;
        ViewGroup.LayoutParams layoutParams3 = healthSwitchButton.getLayoutParams();
        if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && Utils.o()) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = (int) qre.a(R.dimen.health_common_12dp);
            layoutParams4.addRule(10);
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(this.k, R.id.left_content);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(this.k, R.id.sub_content_tv);
        HealthTextView healthTextView3 = (HealthTextView) qsp.a(this.k, R.id.sub_content2_tv);
        qsp.a(this.k, R.id.information_btn).setVisibility(8);
        qsp.e((TextView) healthTextView, Utils.o() ? R.string.IDS_personalized_recommendation : R.string.IDS_hwh_personal_recommend_tile);
        qsp.a(this.k, R.id.bottom_divider).setVisibility(8);
        if (!Utils.o()) {
            qsp.c((View) healthTextView2, 8);
            qsp.c((View) healthTextView3, 0);
            healthTextView3.setTextColor(ContextCompat.getColor(this, R.color.color_fb6522));
            qsp.e((TextView) healthTextView3, R.string.IDS_personalized_recommendation_scope);
            healthTextView3.setOnClickListener(new qte(new View.OnClickListener() { // from class: vwv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51664c.a(view);
                }
            }));
            return;
        }
        qsp.e((TextView) healthTextView2, R.string.IDS_personalized_recommend_tip_one);
        qsp.e((TextView) healthTextView3, R.string.IDS_personalized_recommend_tip_two);
        qsp.c((View) healthTextView3, 0);
    }

    public /* synthetic */ void a(View view) {
        k();
        vwd.d(1, "related_notes", "recommendation_scope", new String[]{"main_page"}, new String[]{""});
    }

    private void k() {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f28553c).a(c()).a(true).b();
        this.p = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.p.show();
    }

    private View c() {
        View viewInflate = View.inflate(this.f28553c, R.layout.dialog_personalized_recommendation, null);
        this.d = (HealthCheckBox) viewInflate.findViewById(R.id.personalized_content_courses_box);
        this.s = (HealthCheckBox) viewInflate.findViewById(R.id.personalized_watch_face_box);
        this.d.setChecked(e(this.t));
        boolean zB = b(this.t);
        LogUtil.a("ContentRecommendActivity", "isPersonalWatchFaceSwitch = " + zB);
        this.s.setChecked(zB);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.btn_positive);
        ((HealthButton) viewInflate.findViewById(R.id.btn_negative)).setOnClickListener(new qte(new View.OnClickListener() { // from class: vwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }));
        healthButton.setOnClickListener(new qte(new View.OnClickListener() { // from class: vwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51663b.c(view);
            }
        }));
        return viewInflate;
    }

    public /* synthetic */ void b(View view) {
        CustomAlertDialog customAlertDialog = this.p;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    public /* synthetic */ void c(View view) {
        CustomAlertDialog customAlertDialog = this.p;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        if (qrs.d((Activity) this)) {
            LogUtil.a("ContentRecommendActivity", "network not connected");
            return;
        }
        vwd.d(1, this.d.isChecked() ? "switch_on" : "switch_off", "content_recommendation_switch", new String[]{"main_page"}, new String[]{""});
        vwd.d(1, this.s.isChecked() ? "switch_on" : "switch_off", "watchface_recommendation_switch", new String[]{"main_page"}, new String[]{""});
        if (this.m.isChecked() != (this.d.isChecked() || this.s.isChecked())) {
            j(false);
        }
        d(this.d.isChecked(), this.s.isChecked(), true);
        b(this.d.isChecked());
        a(this.s.isChecked());
    }

    private void d(boolean z, boolean z2, boolean z3) {
        this.m.setChecked(z || z2);
        if (z3) {
            b(z, z2);
        }
    }

    private void j(boolean z) {
        LogUtil.a("ContentRecommendActivity", "setOldLogicAtomicBoolean allow:", Boolean.valueOf(z));
        this.l.set(z);
    }

    private boolean e(ioi ioiVar) {
        String strC = ioiVar.c(12);
        if (Utils.o()) {
            return "true".equals(strC);
        }
        String strE = SharedPreferenceManager.e(this.f28553c, Integer.toString(10000), "personalized_recommend");
        LogUtil.a("ContentRecommendActivity", "personalCourseInitValue:", strC, " personalCourseSwitchValue:", strE);
        if (TextUtils.isEmpty(strE)) {
            return "true".equals(strC);
        }
        return "1".equals(strE);
    }

    private boolean b(ioi ioiVar) {
        if (Utils.o()) {
            return false;
        }
        String strC = ioiVar.c(17);
        String strE = SharedPreferenceManager.e(this.f28553c, Integer.toString(10000), "personalized_watch_face_recommend");
        LogUtil.a("ContentRecommendActivity", "watchFaceInitValue:" + strC + ", watchFaceSwitchValue:" + strE);
        if (TextUtils.isEmpty(strE)) {
            return "true".equals(strC);
        }
        return "1".equals(strE);
    }

    private void g() {
        Drawable drawable;
        this.e = (RelativeLayout) findViewById(R.id.hw_show_setting_health_data_main_layout);
        this.f28551a = (HealthCardView) findViewById(R.id.hcv_health_data_and_like_manager);
        this.h = (HealthSwitchButton) qsp.a(this.e, R.id.hw_health_data_switch);
        this.i = (HealthTextView) qsp.a(this.e, R.id.sub_content_tv);
        if (Utils.o()) {
            return;
        }
        this.f28551a.setVisibility(0);
        this.q = (RelativeLayout) findViewById(R.id.rl_like_manager);
        b(e(this.t), b(this.t));
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = qre.b(R.dimen.health_common_8dp);
            layoutParams2.rightMargin = qre.b(R.dimen.health_common_8dp);
            this.e.setLayoutParams(layoutParams2);
        }
        qsp.e((TextView) qsp.a(this.e, R.id.left_content), R.string.IDS_hwh_personal_recommend_health_data);
        PrivacyClickableSpan privacyClickableSpanE = e(2);
        String string = getString(R.string.IDS_hwh_personal_recommend_data_mgr_click);
        String string2 = getString(R.string.IDS_hwh_personal_recommend_data_mgr, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(privacyClickableSpanE, string2.length() - string.length(), string2.length(), 33);
        this.i.setMovementMethod(LinkMovementMethod.getInstance());
        this.i.setText(spannableString);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: vxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51672c.e(view);
            }
        });
        View viewFindViewById = findViewById(R.id.iv_like_manager_arrow);
        if (LanguageUtil.ba(this.f28553c)) {
            drawable = ContextCompat.getDrawable(this, R.drawable.common_ui_arrow_left);
        } else {
            drawable = ContextCompat.getDrawable(this, R.drawable.common_ui_arrow_right);
        }
        viewFindViewById.setBackground(drawable);
    }

    public /* synthetic */ void e(View view) {
        Intent intent = new Intent();
        intent.setClass(this.f28553c, MyLikeMgrActivity.class);
        iov.d(this.f28553c, intent);
        vwd.d(1, "my_preferences", "", new String[]{"health_data_recommendation_switch"}, new String[]{""});
    }

    private PrivacyClickableSpan e(int i) {
        PrivacyClickableSpan privacyClickableSpan = new PrivacyClickableSpan(this, i);
        privacyClickableSpan.c(new PrivacyClickableSpan.PrivacyClickable() { // from class: vwn
            @Override // com.huawei.ui.main.stories.me.views.builder.PrivacyClickableSpan.PrivacyClickable
            public final void onClick(int i2) {
                ContentRecommendActivity.a(i2);
            }
        });
        return privacyClickableSpan;
    }

    public static /* synthetic */ void a(int i) {
        if (i == 2) {
            vwd.d(1, "related_notes", "health_data_usage", new String[]{"main_page"}, new String[]{""});
        } else if (i == 1) {
            vwd.d(1, "related_notes", "recommendation_algorithm", new String[]{"main_page"}, new String[]{""});
        }
    }

    private void b(boolean z, boolean z2) {
        if (Utils.o()) {
            return;
        }
        if (z) {
            this.e.setAlpha(1.0f);
            this.h.setEnabled(true);
            this.i.setEnabled(true);
            a(this.g, this.t);
        } else {
            this.e.setAlpha(0.4f);
            this.h.setEnabled(false);
            this.h.setChecked(false);
            this.i.setEnabled(false);
        }
        if (z || z2) {
            this.q.setAlpha(1.0f);
            this.q.setEnabled(true);
        } else {
            this.q.setAlpha(0.4f);
            this.q.setEnabled(false);
        }
    }

    private void f() {
        if (!Utils.o()) {
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.htv_privacy_alg_principles);
            this.f = healthTextView;
            healthTextView.setVisibility(0);
            PrivacyClickableSpan privacyClickableSpanE = e(1);
            String string = getString(R.string.IDS_hwh_personal_recommend_alg_principles_click);
            String string2 = getString(R.string.IDS_hwh_personal_recommend_alg_principles, new Object[]{string});
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(privacyClickableSpanE, string2.length() - string.length(), string2.length(), 33);
            this.f.setMovementMethod(LinkMovementMethod.getInstance());
            this.f.setText(spannableString);
            c(true);
            return;
        }
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(this, R.id.provide_information_recommendation_services);
        if (healthTextView2 != null) {
            healthTextView2.setVisibility(0);
            healthTextView2.setGravity(GravityCompat.START);
        }
    }

    private void l() {
        this.m.setOnCheckedChangeListener(new ContentRecommendActivity$$ExternalSyntheticLambda9(this));
        if (Utils.o()) {
            return;
        }
        this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.ContentRecommendActivity$$ExternalSyntheticLambda15
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f28554b.d(compoundButton, z);
            }
        });
    }

    /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        if (!a(compoundButton, z, "setOnCheckedChangeListener show no network dialog") && this.m.isChecked()) {
            if (!z) {
                this.h.setChecked(false);
                vwd.d(1, "switch_off", "health_data_recommendation_switch", new String[]{"main_page"}, new String[]{""});
                this.g.a(16, false);
            } else {
                this.o.setVisibility(0);
                if (this.n != null) {
                    o();
                } else {
                    d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CompoundButton compoundButton, boolean z) {
        if (this.l.compareAndSet(false, true)) {
            LogUtil.a("ContentRecommendActivity", "onCheckedChanged is not allow click");
            return;
        }
        if (a(compoundButton, z, "onCheckedChanged show no network dialog")) {
            return;
        }
        this.r = compoundButton.getId();
        b(z, z);
        if (!z) {
            if (this.f28552b) {
                c(this.f28553c.getString(R.string.IDS_close_personalized_recommendation_tips), this.f28553c.getString(R.string.IDS_beta_continue_use), AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value());
            }
        } else {
            String strC = this.g.c(11);
            if (!(TextUtils.isEmpty(strC) ? niz.c() : "true".equals(strC)) && Utils.o()) {
                n();
            } else {
                d(AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), "1", a.K);
            }
        }
    }

    private boolean a(CompoundButton compoundButton, boolean z, String str) {
        if (compoundButton == null || !compoundButton.isPressed() || !qrs.d((Activity) this)) {
            return false;
        }
        if (!CommonUtil.ab(this.f28553c)) {
            compoundButton.setChecked(!z);
        }
        LogUtil.a("ContentRecommendActivity", str);
        return true;
    }

    private void d() {
        LogUtil.a("ContentRecommendActivity", "checkVipUser");
        c(false);
        runOnUiThread(new Runnable() { // from class: vws
            @Override // java.lang.Runnable
            public final void run() {
                this.f51661b.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(final boolean z) {
        if (this.n != null) {
            LogUtil.a("ContentRecommendActivity", "queryVipOrBenefitStatus mIsVipOrBenefit = ", this.n);
            return;
        }
        boolean z2 = true;
        if (irz.i()) {
            this.n = true;
            LogUtil.a("ContentRecommendActivity", "queryVipOrBenefitStatus isVipUser = true");
            return;
        }
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: vwo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51659c.c(z);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c cVar = new c();
        c(countDownLatch, cVar);
        try {
            LogUtil.a("ContentRecommendActivity", "checkVipOrBenefit result：", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            cVar.c(0);
            LogUtil.c("ContentRecommendActivity", "checkVipOrBenefit InterruptedException");
        }
        boolean z3 = cVar.a() == 1;
        if (!irz.i() && !z3) {
            z2 = false;
        }
        this.n = Boolean.valueOf(z2);
        if (z) {
            runOnUiThread(new Runnable() { // from class: vwx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51666a.b();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        a(this.g, this.t);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.o.setVisibility(8);
        if (this.m.isChecked() && this.n != null && this.n.booleanValue()) {
            ReleaseLogUtil.c("ContentRecommendActivity", "showOpenVipOrBenefitViewDialog mIsVipOrBenefit is true");
            this.h.setChecked(true);
            vwd.d(1, "switch_on", "health_data_recommendation_switch", new String[]{"main_page"}, new String[]{""});
            this.g.a(16, true);
            return;
        }
        this.h.setChecked(false);
        ReleaseLogUtil.c("ContentRecommendActivity", "showOpenVipOrBenefitViewDialog is showing");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f28553c).e(this.f28553c.getString(R.string.IDS_hwh_personal_recommend_open_vip_dialog_title)).b(R.string.IDS_hwh_personal_recommend_open_vip_dialog_content).a(R.string.IDS_home_abnormal_go_view, new View.OnClickListener() { // from class: vwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h(view);
            }
        }).e(R.string.IDS_course_device_nonmatch_dialog_ok, new View.OnClickListener() { // from class: vwq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vwd.d(1, "button_click", "understand", new String[]{"main_page"}, new String[]{""});
            }
        }).e((Boolean) true).b();
        customTextAlertDialogB.setWindowGravityParams(17);
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void h(View view) {
        irz.d(this.f28553c, "");
        vwd.d(1, "button_click", "learn_more", new String[]{"main_page"}, new String[]{""});
    }

    private void c(final CountDownLatch countDownLatch, final c cVar) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.d("ContentRecommendActivity", "handleReviewStatus payApi is null");
            countDownLatch.countDown();
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: vwt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ContentRecommendActivity.b(countDownLatch, cVar, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void b(CountDownLatch countDownLatch, c cVar, int i, Object obj) {
        if (i != 0) {
            LogUtil.d("ContentRecommendActivity", "queryBenefitInfo fail");
            countDownLatch.countDown();
            return;
        }
        if (!(obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.d("ContentRecommendActivity", "queryBenefitInfo fail ：objectData is not RepeatResourceBenefitInfo");
            cVar.c(0);
            cVar.e(true);
            countDownLatch.countDown();
            return;
        }
        LogUtil.a("ContentRecommendActivity", "queryBenefitInfo objectData = ", HiJsonUtil.d(obj));
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
        long nowTime = repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
        LogUtil.a("ContentRecommendActivity", "queryBenefitInfo currentTime = ", Long.valueOf(nowTime));
        if (repeatResourceBenefitInfo.getExpireTime().longValue() == 0) {
            cVar.c(0);
        } else if (repeatResourceBenefitInfo.getExpireTime().longValue() >= nowTime) {
            cVar.c(1);
        } else {
            cVar.c(2);
        }
        cVar.e(true);
        countDownLatch.countDown();
    }

    public static class c {
        public boolean d;
        public int e;

        public int a() {
            return this.e;
        }

        public void c(int i) {
            this.e = i;
        }

        public void e(boolean z) {
            this.d = z;
        }
    }

    private void n() {
        String strF = qre.f(R.string.IDS_open_analysis_content);
        String upperCase = qre.f(R.string.IDS_device_log_enhancement_ok).toUpperCase(Locale.getDefault());
        String upperCase2 = qre.f(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(Locale.getDefault());
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        if (iox.e(this.f28553c)) {
            builder.a(iox.b(this));
            builder.b(qre.f(R.string.IDS_open_analysis_title_new));
        } else {
            builder.b(qre.f(R.string.IDS_open_analysis_title));
            builder.e(strF);
        }
        builder.e(upperCase, new DialogInterface.OnClickListener() { // from class: vwz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f51668a.e(dialogInterface, i);
            }
        }).d(upperCase2, new DialogInterface.OnClickListener() { // from class: vww
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f51665a.b(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.setBottomPadding();
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        LogUtil.a("ContentRecommendActivity", "open analysis");
        iox.d(true);
        d(AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), "1", a.K);
        vwd.d(1, "switch_on", "recommendation_switch", new String[]{"main_page"}, new String[]{""});
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        LogUtil.a("ContentRecommendActivity", "cancel open analysis");
        this.m.setOnCheckedChangeListener(null);
        h(true);
        g(false);
        if (Utils.o()) {
            d(false);
        }
        this.m.setOnCheckedChangeListener(new ContentRecommendActivity$$ExternalSyntheticLambda9(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("ContentRecommendActivity", "onActivityResult requestCode = ", Integer.valueOf(i), ", resultCode = ", Integer.valueOf(i2));
        boolean z = i2 == -1;
        if (i == 210) {
            if (z) {
                a(true, AnalyticsValue.HEALTH_MINE_SETTINGS_RECOMMEND_AD_2040044.value(), "1", true);
                return;
            } else {
                g(false);
                return;
            }
        }
        if (i != 212) {
            LogUtil.a("ContentRecommendActivity", "default");
        } else if (z) {
            a(true, AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), "1", true);
        } else {
            this.f28552b = false;
            g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.t.b((Integer) 17, (CommonCallback) new d(true, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ioi ioiVar, boolean z) {
        boolean zE = e(ioiVar);
        boolean zB = b(ioiVar);
        LogUtil.a("ContentRecommendActivity", "initPersonalSwitch course:", Boolean.valueOf(zE), " watch:", Boolean.valueOf(zB));
        if (this.m.isChecked() != (zE || zB)) {
            j(false);
        }
        d(zE, zB, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(wmq wmqVar, ioi ioiVar) {
        if (Utils.o()) {
            this.e.setVisibility(8);
            return;
        }
        String strC = ioiVar.c(16);
        String strE = SharedPreferenceManager.e(this.f28553c, Integer.toString(1004), "cloud_user_privacy16");
        LogUtil.a("ContentRecommendActivity", "initHealthDataSwitch healthDataUserValue = ", strC, " healthDataSwitchValue = ", strE);
        if (TextUtils.isEmpty(strE)) {
            i("true".equals(strC));
            wmqVar.a(16, this.h.isChecked());
        } else {
            i("true".equals(strE));
        }
    }

    private void i(boolean z) {
        this.h.setChecked(this.m.isChecked() && (this.n == null ? irz.i() : this.n.booleanValue()) && z);
    }

    private void c(String str, String str2, final String str3) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(str).a(str2.toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51660b.i(view);
            }
        }).d(this.f28553c.getString(R.string.IDS_hw_still_off).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vwy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51667b.d(str3, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void i(View view) {
        h(true);
        a(this.t, true);
    }

    public /* synthetic */ void d(String str, View view) {
        h(false);
        a(false, str, "2", false);
        iox.b("key_personalized_recommend");
        vwd.d(1, "switch_off", "recommendation_switch", new String[]{"main_page"}, new String[]{""});
    }

    private void h(boolean z) {
        this.j = z;
    }

    private boolean j() {
        return this.j;
    }

    private void a(boolean z, String str, String str2, boolean z2) {
        if (!j()) {
            com.huawei.hwlogsmodel.LogUtil.a("ContentRecommendActivity", "setSwitchStatusAndBiEvent");
            g(z);
            b(str, str2);
            d(z2);
        }
        h(false);
    }

    private void d(String str, String str2, int i) {
        if (LoginInit.getInstance(this.f28553c).isKidAccount() && (i != 212 || !j())) {
            d(i);
        } else {
            vwd.d(1, "switch_on", "recommendation_switch", new String[]{"main_page"}, new String[]{""});
            a(true, str, str2, true);
        }
    }

    private void g(boolean z) {
        if (this.r == this.m.getId()) {
            this.m.setChecked(z);
        }
    }

    private void b(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.f28553c, str, map, 0);
    }

    private void d(boolean z) {
        if (this.r == this.m.getId()) {
            LogUtil.a("ContentRecommendActivity", "savePersonalPrivacySettings isOpen = ", Boolean.valueOf(z));
            b(z);
            a(z);
            return;
        }
        LogUtil.d("ContentRecommendActivity", "savePersonalPrivacySettings else");
    }

    private void b(boolean z) {
        this.g.a(12, z);
    }

    private void a(boolean z) {
        if (Utils.o()) {
            LogUtil.d("ContentRecommendActivity", "saveWatchFacePrivacySettings is oversea");
        } else {
            this.g.a(17, z);
        }
    }

    private void d(int i) {
        Intent intent = new Intent();
        intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        intent.putExtra(CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, "1");
        intent.setClassName(this.f28553c, "com.huawei.health.HuaweiLoginActivity");
        startActivityForResult(intent, i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HealthSwitchButton healthSwitchButton = this.m;
        if (healthSwitchButton == null || this.h == null) {
            return;
        }
        vwd.d(-1, "m0", "", new String[]{"recommendation_switch", "health_data_recommendation_switch", "content_recommendation_switch", "watchface_recommendation_switch"}, new String[]{String.valueOf(healthSwitchButton.isChecked()), String.valueOf(this.h.isChecked()), String.valueOf(e(this.t)), String.valueOf(b(this.t))});
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

package com.huawei.ui.main.stories.me.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.userprofile.DeleteOperationRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.HealthAccessTokenUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.myhuawei.MyHuaweiLogin;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity;
import com.huawei.ui.main.stories.me.views.privacy.AdRecommendActivity;
import com.huawei.ui.main.stories.me.views.privacy.ContentRecommendActivity;
import com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import com.huawei.ui.main.stories.privacy.datasourcemanager.ManagerDataSourceActivity;
import defpackage.ddv;
import defpackage.ioi;
import defpackage.iox;
import defpackage.lli;
import defpackage.lmf;
import defpackage.lmn;
import defpackage.lsy;
import defpackage.mjh;
import defpackage.niz;
import defpackage.njy;
import defpackage.osa;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vwh;
import defpackage.wmi;
import defpackage.wmq;
import defpackage.wms;
import defpackage.wmt;
import defpackage.wmu;
import defpackage.wnc;
import defpackage.wuf;
import defpackage.wuu;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyCenterActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDivider f28453a;
    private HealthSwitchButton aa;
    private ImageView ab;
    private RelativeLayout ac;
    private HealthTextView ad;
    private wmq ae;
    private HealthDivider af;
    private HealthSwitchButton ag;
    private ImageView ah;
    private RelativeLayout ai;
    private RelativeLayout aj;
    private ImageView al;
    private HealthSubHeader am;
    private RelativeLayout an;
    private RelativeLayout ao;
    private HealthDivider ap;
    private RelativeLayout aq;
    private ImageView ar;
    private HealthSwitchButton as;
    private RelativeLayout au;
    private CustomTextAlertDialog av;
    private ImageView aw;
    private wms ax;
    private HealthDivider ay;
    private HealthSwitchButton az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28454b;
    private RelativeLayout ba;
    private HealthSwitchButton bb;
    private RelativeLayout bc;
    private RelativeLayout bd;
    private RelativeLayout be;
    private ImageView bf;
    private NoTitleCustomAlertDialog bg;
    private ImageView bh;
    private RelativeLayout bi;
    private HealthSwitchButton bj;
    private HealthSwitchButton bk;
    private HealthSwitchButton bl;
    private ImageView bm;
    private ImageView bn;
    private HealthDivider bo;
    private ImageView bp;
    private RelativeLayout bq;
    private RelativeLayout br;
    private RelativeLayout bs;
    private HealthSwitchButton bt;
    private String bu;
    private ioi bv;
    private wmu bx;
    private RelativeLayout bz;
    private boolean d;
    private HealthDivider e;
    private HealthSwitchButton f;
    private ImageView g;
    private RelativeLayout h;
    private ImageView i;
    private RelativeLayout j;
    private HealthDivider k;
    private HealthDivider l;
    private ImageView m;
    private RelativeLayout n;
    private RelativeLayout o;
    private CustomTitleBar p;
    private wmi q;
    private RelativeLayout r;
    private ImageView s;
    private Context t;
    private HealthSubHeader u;
    private ImageView v;
    private ImageView w;
    private RelativeLayout x;
    private HealthSubHeader y;
    private HealthDivider z;
    private int bw = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28455c = true;
    private boolean ak = false;
    private Handler at = new e(this);

    public static /* synthetic */ void c(View view) {
    }

    public static /* synthetic */ void e(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("PrivacyCenterActivity", "enter onCreate():");
        b(AnalyticsValue.HEALTH_MINE_SETTING_PRIVACY_2040037.value(), (String) null);
        this.t = this;
        this.bv = ioi.d();
        this.ae = wmq.a(getApplicationContext());
        this.d = Utils.o();
        this.f28454b = Utils.h();
        this.q = new wmi(this.t, this, new c(this));
        HealthAccessTokenUtil.getAtInstance().registerReceiverToGetAt();
        q();
        n();
        wuf.e(this.t);
        ac();
    }

    private void q() {
        String str;
        LogUtil.a("PrivacyCenterActivity", "enter initView()");
        m();
        String strC = this.ae.c(4);
        String strC2 = this.ae.c(2);
        String strC3 = this.ae.c(3);
        String strC4 = this.ae.c(6);
        String strC5 = this.ae.c(7);
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10000), "health_product_recommend");
        a(this.ae, this.bv, this.d);
        String strC6 = this.bv.c(401);
        LogUtil.a("PrivacyCenterActivity", "initView privacyBluetooth = ", strC, ",privacyBaseInfo = ", strC2, ",privacySportData = ", strC3, ",privacySleepData = ", strC4, ",privacyHealthData = ", strC5, ",privacyGoodsData = ", strE, ",privacyVmallCloud = ", strC6);
        if (TextUtils.isEmpty(strC4)) {
            this.ae.a(6, "true".equals(strC3));
        }
        if (TextUtils.isEmpty(strC5)) {
            this.ae.a(7, "true".equals(strC3));
            str = strC3;
        } else {
            str = strC5;
        }
        this.bj.setChecked("true".equals(strC2));
        this.bl.setChecked("true".equals(strC3));
        this.bk.setChecked("true".equals(str));
        String strC7 = this.bv.c(402);
        this.aa.setChecked("true".equals(strC7));
        this.ad.setTextColor(ContextCompat.getColor(this, "true".equals(strC7) ? R.color.textColorPrimary : R.color.textColorTertiary));
        this.ac.setClickable("true".equals(strC7));
        String strC8 = this.ae.c(11);
        this.f.setChecked(TextUtils.isEmpty(strC8) ? niz.c() : "true".equals(strC8));
        this.ag.setChecked("1".equals(strE));
        this.az.setChecked("true".equals(strC6));
        p();
        r();
        ag();
        t();
        l();
    }

    private void l() {
        HealthTextView healthTextView = (HealthTextView) qsp.a(this.bc, R.id.sub_content_tv);
        ImageView imageView = (ImageView) qsp.a(this.bc, R.id.information_btn);
        qsp.c((View) healthTextView, 8);
        qsp.c((View) imageView, this.d ? 0 : 8);
        qsp.b(imageView, new View.OnClickListener() { // from class: vui
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51600a.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (qrs.r()) {
            LogUtil.j("PrivacyCenterActivity", "infoBtn FastClick");
            return;
        }
        if (iox.e(this.t)) {
            f(true);
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.t);
        builder.b(k());
        builder.a(qre.f(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: vup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a("PrivacyCenterActivity", "dismiss dialog");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.bg = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(true);
        this.bg.show();
    }

    private SpannableString k() {
        String strF = qre.f(R.string.IDS_hwh_privacy_eu_three);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_privacy_analysis_note, strF));
        int iIndexOf = qre.f(R.string.IDS_privacy_analysis_note).indexOf("%s");
        if (iIndexOf > 0) {
            int length = strF.length() + iIndexOf;
            qri.d(spannableString, iIndexOf, length, g());
            qri.d(spannableString, iIndexOf, length, new ForegroundColorSpan(qre.e(R.color.hw_show_color_red1)));
        }
        return spannableString;
    }

    private wmt g() {
        return new wmt(this.t, "HealthPrivacy", false, new BaseResponseCallback() { // from class: vuu
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog;
        if (i != 0 || (noTitleCustomAlertDialog = this.bg) == null) {
            return;
        }
        noTitleCustomAlertDialog.dismiss();
    }

    private void f(final boolean z) {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.t).b(qre.f(R.string.IDS_hw_dialog_analysis_improvement_title)).a(iox.d(this.t, ServiceItemActivity.class)).d(R.string.IDS_device_log_enhancement_ok, new DialogInterface.OnClickListener() { // from class: vus
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f51605a.a(z, dialogInterface, i);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: vuq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f51604c.c(z, dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void a(boolean z, DialogInterface dialogInterface, int i) {
        if (z) {
            this.bw = R.id.hw_health_analysis_and_improvement;
        }
        if (LoginInit.getInstance(this.t).isKidAccount()) {
            c(a.D);
        } else {
            v();
        }
    }

    public /* synthetic */ void c(boolean z, DialogInterface dialogInterface, int i) {
        if (z) {
            return;
        }
        this.bv.e(11, false, null, null);
        h(false);
    }

    private void p() {
        this.bj.setOnCheckedChangeListener(this);
        this.bl.setOnCheckedChangeListener(this);
        this.bk.setOnCheckedChangeListener(this);
        this.aa.setOnCheckedChangeListener(this);
        this.h.setOnClickListener(this);
        this.bt.setOnCheckedChangeListener(this);
        this.au.setOnClickListener(this);
        this.f.setOnCheckedChangeListener(this);
        this.ag.setOnCheckedChangeListener(this);
        this.as.setOnCheckedChangeListener(this);
        this.az.setOnCheckedChangeListener(this);
        this.bs.setOnClickListener(this);
        this.bq.setOnClickListener(this);
    }

    private void ag() {
        if (this.ah != null) {
            final HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.healthService_title);
            final HealthTextView healthTextView2 = (HealthTextView) qsp.a(this, R.id.personalized_title);
            this.ah.post(new Runnable() { // from class: vuc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51596b.e(healthTextView, healthTextView2);
                }
            });
        }
    }

    public /* synthetic */ void e(HealthTextView healthTextView, HealthTextView healthTextView2) {
        int width = this.ah.getWidth() + BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
        if (LanguageUtil.ba(this.t)) {
            healthTextView.setPadding(width, 0, 0, 0);
            healthTextView2.setPadding(width, 0, 0, 0);
        } else {
            healthTextView.setPadding(0, 0, width, 0);
            healthTextView2.setPadding(0, 0, width, 0);
        }
    }

    private void a(wmq wmqVar, ioi ioiVar, boolean z) {
        String strC = ioiVar.c(12);
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10000), "personalized_recommend");
        if (TextUtils.isEmpty(strE)) {
            this.as.setChecked("true".equals(strC));
            if (z) {
                return;
            }
            wmqVar.a(12, true);
            return;
        }
        this.as.setChecked("1".equals(strE));
    }

    private void ac() {
        int i = LoginInit.getInstance(BaseApplication.getContext()).isKidAccount() ? 8 : 0;
        this.bd.setVisibility(i);
        findViewById(R.id.data_sources_manager_divider).setVisibility(i);
        if (LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()) {
            this.bq.setVisibility(8);
            this.j.setVisibility(8);
            this.e.setVisibility(8);
            this.n.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        w();
        finish();
    }

    private void w() {
        String strC = this.ae.c(7);
        Intent intent = new Intent();
        intent.putExtra("health_cloud", strC);
        setResult(0, intent);
    }

    private void m() {
        setContentView(R.layout.activity_privacy_center);
        clearBackgroundDrawable();
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.personal_privacy_set_titlebar);
        this.p = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: vue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51598a.i(view);
            }
        });
        ((HealthScrollView) qsp.a(this, R.id.privacy_scrollview)).setScrollViewVerticalDirectionEvent(true);
        this.y = (HealthSubHeader) qsp.a(this, R.id.data_sources_and_record_subheader);
        this.u = (HealthSubHeader) qsp.a(this, R.id.data_syn_manager_subheader);
        this.am = (HealthSubHeader) qsp.a(this, R.id.more_subheader);
        this.y.setSubHeaderBackgroundColor(0);
        this.u.setSubHeaderBackgroundColor(0);
        this.am.setSubHeaderBackgroundColor(0);
        j();
        this.bi.setOnClickListener(this);
        this.br.setOnClickListener(this);
        this.ao.setOnClickListener(this);
        this.be.setOnClickListener(this);
        if (LoginInit.getInstance(this.t).isKidAccount()) {
            this.bc.setVisibility(8);
            this.k.setVisibility(8);
            this.bv.e(11, false, null, null);
            if (this.d) {
                findViewById(R.id.permission_settings_divider).setVisibility(8);
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            this.an.setVisibility(8);
            findViewById(R.id.permission_settings_divider).setVisibility(8);
        }
        if (CommonUtil.bl()) {
            this.aa.setTrackDrawable(ContextCompat.getDrawable(this, com.huawei.ui.commonui.R.drawable.hwswitch_selector_track_emui));
        }
        this.ab = (ImageView) qsp.a(this, R.id.health_kit_data_show_arrow);
        this.m = (ImageView) qsp.a(this, R.id.content_recommend_arrow);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.sport_health_data_share_or_authorize_layout);
        this.bd = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.s = (ImageView) findViewById(R.id.img_data_share_authrize_red_point);
        o();
        this.ba = (RelativeLayout) qsp.a(this, R.id.hw_share_huawei_account_with_vmall);
        ab();
        this.ba.setVisibility(8);
        b(this.ah);
        b(this.aw);
    }

    public /* synthetic */ void i(View view) {
        LogUtil.a("PrivacyCenterActivity", "initView out the page");
        w();
        finish();
    }

    private void ab() {
        boolean zO = Utils.o();
        this.bs.setVisibility(!zO && VersionControlUtil.isSupportOperationAccount() ? 8 : 0);
        if (zO) {
            return;
        }
        ((HealthTextView) qsp.a(this, R.id.privacy_center_recomend_title)).setText(R.string.IDS_hwh_personal_recommend_tile);
    }

    private void t() {
        final RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.hw_share_huawei_account_with_myhuawei);
        relativeLayout.setVisibility(MyHuaweiLogin.isSupportMyHuaweiLogin() ? 0 : 8);
        HandlerExecutor.c(new Runnable() { // from class: vut
            @Override // java.lang.Runnable
            public final void run() {
                this.f51607c.b(relativeLayout);
            }
        });
        this.bb = (HealthSwitchButton) qsp.a(this, R.id.hw_share_huawei_account_with_myhuawei_switch);
        this.bb.setChecked("true".equals(this.bv.c(405)));
        this.bb.setOnCheckedChangeListener(this);
    }

    public /* synthetic */ void b(RelativeLayout relativeLayout) {
        if (e(relativeLayout)) {
            LogUtil.a("PrivacyCenterActivity", "isLastVisibleRelativeLayout enter.");
            findViewById(R.id.myhuawei_privacy_divider).setVisibility(8);
        }
    }

    private boolean e(RelativeLayout relativeLayout) {
        ViewGroup viewGroup;
        LogUtil.a("PrivacyCenterActivity", "isLastVisibleRelativeLayout");
        if (relativeLayout.getVisibility() != 0 || (viewGroup = (ViewGroup) relativeLayout.getParent()) == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(relativeLayout);
        for (int childCount = viewGroup.getChildCount() - 1; childCount > iIndexOfChild; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if ((childAt instanceof RelativeLayout) && childAt.getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    private void j() {
        this.bj = (HealthSwitchButton) qsp.a(this, R.id.sync_profile_to_cloud_switch_button);
        this.bl = (HealthSwitchButton) qsp.a(this, R.id.sync_fitness_data_to_cloud_switch_button);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.data_sources_manager);
        this.r = relativeLayout;
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(this, R.id.health_kit_data_show_layout);
        this.ac = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
        this.ad = (HealthTextView) qsp.a(this, R.id.health_kit_data_show_text);
        this.bk = (HealthSwitchButton) qsp.a(this, R.id.sync_health_data_to_cloud_switch_button);
        this.h = (RelativeLayout) qsp.a(this, R.id.clear_cloud_fitness_data_linear_layout);
        this.bt = (HealthSwitchButton) qsp.a(this, R.id.hw_health_auto_update_weight_switchbutton);
        this.g = (ImageView) qsp.a(this, R.id.cancel_auth_img);
        this.au = (RelativeLayout) qsp.a(this, R.id.hw_health_privacy_notice);
        this.bs = (RelativeLayout) qsp.a(this, R.id.hw_vmall_privacy_notice);
        this.bz = (RelativeLayout) qsp.a(this, R.id.weight_layout);
        this.bc = (RelativeLayout) qsp.a(this, R.id.share_data_layout);
        this.f = (HealthSwitchButton) qsp.a(this, R.id.hw_health_analysis_and_improvement);
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(this, R.id.permission_settings_layout);
        this.an = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        this.al = (ImageView) qsp.a(this, R.id.permission_settings_arrow);
        this.ai = (RelativeLayout) qsp.a(this, R.id.hw_show_setting_goods_main_layout);
        this.aq = (RelativeLayout) qsp.a(this, R.id.hw_show_setting_personalization_main_layout);
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(this, R.id.content_recommend_layout);
        this.n = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        this.k = (HealthDivider) qsp.a(this, R.id.divider_content_recommend);
        RelativeLayout relativeLayout5 = (RelativeLayout) qsp.a(this, R.id.ad_recommend_layout);
        this.j = relativeLayout5;
        relativeLayout5.setOnClickListener(this);
        this.e = (HealthDivider) qsp.a(this, R.id.divider_ad_recommend);
        this.i = (ImageView) qsp.a(this, R.id.ad_recommend_arrow);
        this.ag = (HealthSwitchButton) qsp.a(this, R.id.goods_switch);
        this.as = (HealthSwitchButton) qsp.a(this, R.id.personalization_switch);
        this.ap = (HealthDivider) qsp.a(this, R.id.divider_personalization);
        this.z = (HealthDivider) qsp.a(this, R.id.divider_health);
        this.ah = (ImageView) qsp.a(this, R.id.iv_healthServiceRecommendation);
        this.aw = (ImageView) qsp.a(this, R.id.iv_personalizedRecommendation);
        this.bq = (RelativeLayout) qsp.a(this, R.id.training_statistics_setting_main_layout);
        this.bn = (ImageView) qsp.a(this, R.id.training_statistics_arrow);
        this.az = (HealthSwitchButton) qsp.a(this, R.id.hw_share_huawei_account_with_vmall_switch);
        this.aj = (RelativeLayout) qsp.a(this, R.id.clear_cloud_fitness_data_linear_layout_1);
        this.x = (RelativeLayout) qsp.a(this, R.id.clear_cloud_fitness_data_linear_layout);
        this.aj.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.v = (ImageView) qsp.a(this, R.id.data_source_manager_arrow);
        this.w = (ImageView) qsp.a(this, R.id.data_use_record_arrow);
        this.bf = (ImageView) qsp.a(this, R.id.sport_health_data_share_or_authrize_arrow);
        this.bm = (ImageView) qsp.a(this, R.id.third_party_sdk_arrow);
        this.aa = (HealthSwitchButton) qsp.a(this, R.id.HUAWEI_health_kit_read_and_write_switch_button);
        this.ay = (HealthDivider) qsp.a(this, R.id.health_divider_sdk);
        this.bi = (RelativeLayout) qsp.a(this, R.id.third_party_sdk);
        this.bp = (ImageView) qsp.a(this, R.id.third_shared_msg_arrow);
        this.bo = (HealthDivider) qsp.a(this, R.id.health_divider_third_shared_msg);
        this.br = (RelativeLayout) qsp.a(this, R.id.third_shared_msg);
        this.ar = (ImageView) qsp.a(this, R.id.personal_info_arrow);
        this.bh = (ImageView) qsp.a(this, R.id.statement_abstract_arrow);
        this.af = (HealthDivider) qsp.a(this, R.id.health_divider_info);
        this.f28453a = (HealthDivider) qsp.a(this, R.id.health_divider_abstract);
        this.ao = (RelativeLayout) qsp.a(this, R.id.personal_info);
        this.be = (RelativeLayout) qsp.a(this, R.id.statement_abstract);
        RelativeLayout relativeLayout6 = (RelativeLayout) qsp.a(this, R.id.hw_health_complaint_report);
        this.o = relativeLayout6;
        relativeLayout6.setOnClickListener(this);
        this.l = (HealthDivider) qsp.a(this, R.id.divider_complaint_report);
    }

    private void b(ImageView imageView) {
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: vun
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        if (view.getId() == R.id.iv_personalizedRecommendation) {
            d(this.t.getString(R.string.IDS_personalized_recommendation_exclamation_mark));
        } else if (view.getId() == R.id.iv_healthServiceRecommendation) {
            d(this.t.getString(R.string.IDS_healthService_recommendations_exclamation_mark));
        } else {
            LogUtil.j("PrivacyCenterActivity", "clickExclamationImage is other view");
        }
    }

    private void d(String str) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(str);
        builder.a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: vud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyCenterActivity.e(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.show();
    }

    private void r() {
        if (this.d) {
            this.bq.setVisibility(8);
            this.ay.setVisibility(8);
            this.bi.setVisibility(8);
            this.br.setVisibility(8);
            this.bo.setVisibility(8);
            this.af.setVisibility(8);
            this.f28453a.setVisibility(8);
            this.ao.setVisibility(8);
            this.be.setVisibility(8);
            this.j.setVisibility(8);
            this.e.setVisibility(8);
            this.o.setVisibility(8);
            this.l.setVisibility(8);
            if (!((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1010))) {
                this.n.setVisibility(8);
                this.k.setVisibility(8);
            }
            ae();
        }
        if (LanguageUtil.ba(this.t)) {
            ((ImageView) qsp.a(this, R.id.clear_cloud_profile_view1)).setBackgroundResource(R.mipmap.ic_arrow_previous);
            ((ImageView) qsp.a(this, R.id.clear_cloud_profile_view2)).setBackgroundResource(R.mipmap.ic_arrow_previous);
        }
        z();
        this.aq.setVisibility(8);
        this.ap.setVisibility(8);
        this.ai.setVisibility(8);
        this.z.setVisibility(8);
    }

    private void ae() {
        if (this.f28454b) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.user_profile_privacy_sync_layout);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(this, R.id.user_profile_privacy_cloud_data_manager_layout);
        HealthCardView healthCardView = (HealthCardView) qsp.a(this, R.id.user_profile_privacy_sync_layout_cardview);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        healthCardView.setVisibility(8);
        this.u.setVisibility(8);
        this.bz.setVisibility(8);
        this.bs.setVisibility(8);
        this.ai.setVisibility(8);
        this.ba.setVisibility(8);
        this.am.setVisibility(8);
        qsp.a(this, R.id.hcv_more).setVisibility(8);
    }

    private void z() {
        if (LanguageUtil.ba(this.t)) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.common_ui_arrow_left);
            this.g.setBackground(drawable);
            this.v.setBackground(drawable);
            this.w.setBackground(drawable);
            this.bf.setBackground(drawable);
            this.ab.setBackground(drawable);
            this.bm.setBackground(drawable);
            this.bp.setBackground(drawable);
            this.ar.setBackground(drawable);
            this.bh.setBackground(drawable);
            this.m.setBackground(drawable);
            this.i.setBackground(drawable);
            this.bn.setBackground(drawable);
            this.al.setBackground(drawable);
            return;
        }
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.common_ui_arrow_right);
        this.g.setBackground(drawable2);
        this.v.setBackground(drawable2);
        this.w.setBackground(drawable2);
        this.bf.setBackground(drawable2);
        this.ab.setBackground(drawable2);
        this.bm.setBackground(drawable2);
        this.bp.setBackground(drawable2);
        this.ar.setBackground(drawable2);
        this.bh.setBackground(drawable2);
        this.m.setBackground(drawable2);
        this.i.setBackground(drawable2);
        this.bn.setBackground(drawable2);
        this.al.setBackground(drawable2);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.a("PrivacyCenterActivity", "onResume enter");
        super.onResume();
        if (this.f28454b) {
            i();
        }
        af();
        this.f.setOnCheckedChangeListener(null);
        String strC = this.ae.c(11);
        this.f.setChecked(TextUtils.isEmpty(strC) ? niz.c() : "true".equals(strC));
        this.f.setOnCheckedChangeListener(this);
    }

    private void o() {
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10000), "privacy_last_clear_cloud_data_time");
        if (TextUtils.isEmpty(strE)) {
            this.aj.setVisibility(0);
            this.x.setVisibility(8);
            return;
        }
        try {
            b(Long.parseLong(strE));
        } catch (NumberFormatException e2) {
            this.aj.setVisibility(0);
            this.x.setVisibility(8);
            LogUtil.j("PrivacyCenterActivity", "getLastClearCloudTimeFromLocal ", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        this.aj.setVisibility(8);
        this.x.setVisibility(0);
        ((HealthTextView) qsp.a(this, R.id.clear_cloud_profile_time)).setText(new SpannableString(this.t.getString(R.string.IDS_hw_privacy_last_clear_time, UnitUtil.a(new Date(j), 20), new SimpleDateFormat("HH:mm").format(new Date(j)))));
    }

    private void n() {
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10000), "health_weight_auto_update");
        this.bu = strE;
        this.bt.setChecked("1".equals(strE));
        lsy.a(new Runnable() { // from class: vuo
            @Override // java.lang.Runnable
            public final void run() {
                this.f51603b.b();
            }
        });
    }

    public /* synthetic */ void b() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_auto_update_status");
        if (userPreference != null) {
            this.at.sendMessage(this.at.obtainMessage(100, userPreference));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiUserPreference hiUserPreference) {
        if (hiUserPreference != null) {
            LogUtil.a("PrivacyCenterActivity", "weight switch status hiUserPreference.getValue ", hiUserPreference.getValue(), " mWeightAutoUpdate ", this.bu);
            if (hiUserPreference.getValue() == null || !hiUserPreference.getValue().equals(this.bu)) {
                this.bt.setChecked("1".equals(hiUserPreference.getValue()));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private void e(int i, int i2) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_settings_restore_factory_settings_dialog_title).b(i).a(i2, new View.OnClickListener() { // from class: vuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51601b.f(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.o(view);
            }
        }).b();
        this.av = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.av.isShowing()) {
            return;
        }
        this.av.show();
    }

    public /* synthetic */ void f(View view) {
        h(false);
        e(false);
        c("2");
        g(false);
    }

    public /* synthetic */ void o(View view) {
        this.f28455c = false;
        h(true);
        g(true);
    }

    private void b(String str) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_settings_restore_factory_settings_dialog_title).a(str).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: vuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51599b.l(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.n(view);
            }
        }).b();
        this.av = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.av.isShowing()) {
            return;
        }
        this.av.show();
    }

    public /* synthetic */ void l(View view) {
        h(true);
        e(true);
        c("1");
        g(true);
    }

    public /* synthetic */ void n(View view) {
        this.f28455c = false;
        h(false);
        g(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        if (this.bw == R.id.sync_profile_to_cloud_switch_button) {
            this.bj.setChecked(z);
        } else if (this.bw == R.id.sync_fitness_data_to_cloud_switch_button) {
            this.bl.setChecked(z);
        } else if (this.bw == R.id.sync_health_data_to_cloud_switch_button) {
            this.bk.setChecked(z);
        } else if (this.bw == R.id.hw_health_analysis_and_improvement) {
            this.f.setChecked(z);
        } else if (this.bw == R.id.goods_switch) {
            this.ag.setChecked(z);
        } else if (this.bw == R.id.personalization_switch) {
            this.as.setChecked(z);
        } else if (this.bw == R.id.HUAWEI_health_kit_read_and_write_switch_button) {
            this.ad.setTextColor(ContextCompat.getColor(this, z ? R.color.textColorPrimary : R.color.textColorTertiary));
            this.aa.setChecked(z);
            this.ac.setClickable(z);
        } else if (this.bw == R.id.hw_share_huawei_account_with_vmall_switch) {
            this.az.setChecked(z);
        } else if (this.bw == R.id.hw_share_huawei_account_with_myhuawei_switch) {
            this.bb.setChecked(z);
        } else {
            LogUtil.j("PrivacyCenterActivity", "setSwitchButtonCheck else");
        }
        if (this.bw == R.id.clear_cloud_fitness_data_linear_layout || this.bw == R.id.clear_cloud_fitness_data_linear_layout_1) {
            this.f28455c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        int i;
        if (this.bw == R.id.sync_profile_to_cloud_switch_button) {
            i = 2;
        } else if (this.bw == R.id.sync_fitness_data_to_cloud_switch_button) {
            i = 3;
        } else if (this.bw == R.id.sync_health_data_to_cloud_switch_button) {
            if (z) {
                HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(HiSyncOption.getDefaultHealthSyncOption(), null);
            }
            i = 7;
        } else {
            if (this.bw == R.id.HUAWEI_health_kit_read_and_write_switch_button) {
                this.bv.e(402, z, String.valueOf(402), new IBaseResponseCallback() { // from class: vuv
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        this.e.a(i2, obj);
                    }
                });
                h(z);
                this.aa.setEnabled(true);
                return;
            }
            if (this.bw == R.id.clear_cloud_fitness_data_linear_layout || this.bw == R.id.clear_cloud_fitness_data_linear_layout_1) {
                this.q.d();
                return;
            }
            if (this.bw == R.id.goods_switch) {
                i = 10;
            } else if (this.bw == R.id.personalization_switch) {
                i = 12;
            } else if (this.bw == R.id.hw_share_huawei_account_with_vmall_switch) {
                i = 401;
            } else if (this.bw == R.id.hw_share_huawei_account_with_myhuawei_switch) {
                i = 405;
            } else {
                LogUtil.j("PrivacyCenterActivity", "savePersonalPrivacySettings else");
                i = -1;
            }
        }
        LogUtil.a("PrivacyCenterActivity", "privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        this.ae.a(i, z);
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("PrivacyCenterActivity", "onResponse setUserPrivacy success");
        } else {
            qpx.e(this, R.string.IDS_connect_network);
            LogUtil.e("PrivacyCenterActivity", "onResponse setUserPrivacy failure");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("PrivacyCenterActivity", "onActivityResult requestCode = ", Integer.valueOf(i), ", resultCode = ", Integer.valueOf(i2));
        boolean z = i2 == -1;
        if (i == 6011) {
            if (z) {
                e(true);
                return;
            } else {
                e(false);
                return;
            }
        }
        switch (i) {
            case a.C /* 210 */:
                if (z) {
                    a(true, AnalyticsValue.HEALTH_MINE_SETTINGS_RECOMMEND_AD_2040044.value(), "1", true);
                } else {
                    h(false);
                }
                break;
            case a.D /* 211 */:
                if (z) {
                    v();
                } else {
                    h(false);
                }
                break;
            case a.K /* 212 */:
                if (z) {
                    a(true, AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), "1", true);
                } else {
                    this.f28455c = false;
                    h(false);
                }
                break;
            default:
                this.q.d(i, i2);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.bj.setOnCheckedChangeListener(null);
        this.bl.setOnCheckedChangeListener(null);
        this.bk.setOnCheckedChangeListener(null);
        this.f.setOnCheckedChangeListener(null);
        this.as.setOnCheckedChangeListener(null);
        this.bj.setChecked(false);
        this.bl.setChecked(false);
        this.bk.setChecked(false);
        boolean z = (Utils.o() || LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) ? false : true;
        this.f.setChecked(z);
        this.ag.setChecked(false);
        this.as.setChecked(z);
        this.bj.setOnCheckedChangeListener(this);
        this.bl.setOnCheckedChangeListener(this);
        this.bk.setOnCheckedChangeListener(this);
        this.f.setOnCheckedChangeListener(this);
        this.as.setOnCheckedChangeListener(this);
        this.q.d(this.ae, z);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {
        private WeakReference<PrivacyCenterActivity> e;

        c(PrivacyCenterActivity privacyCenterActivity) {
            this.e = new WeakReference<>(privacyCenterActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("PrivacyCenterActivity", "ClearDataCallback onResponse errorCode:", Integer.valueOf(i));
            WeakReference<PrivacyCenterActivity> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("PrivacyCenterActivity", "ClearDataCallback onResponse WeakReference is null");
                return;
            }
            PrivacyCenterActivity privacyCenterActivity = weakReference.get();
            if (privacyCenterActivity == null) {
                LogUtil.j("PrivacyCenterActivity", "ClearDataCallback onResponse activity is null");
                return;
            }
            if (i == 10 || i == 11) {
                privacyCenterActivity.f28455c = false;
                privacyCenterActivity.h(true);
                return;
            }
            if (i == 12) {
                privacyCenterActivity.h(false);
                privacyCenterActivity.e(false);
            } else if (i == 13) {
                privacyCenterActivity.f28455c = false;
                privacyCenterActivity.h(true);
            } else if (i == 14) {
                privacyCenterActivity.at.sendMessage(privacyCenterActivity.at.obtainMessage(101));
            } else {
                LogUtil.j("PrivacyCenterActivity", "ClearDataCallback onResponse to else branch");
            }
        }
    }

    private void i() {
        LogUtil.a("PrivacyCenterActivity", "getLastClearCloudDataTime enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: vtz
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.ae.e(new b(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements IBaseResponseCallback {
        private WeakReference<PrivacyCenterActivity> e;

        b(PrivacyCenterActivity privacyCenterActivity) {
            this.e = new WeakReference<>(privacyCenterActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            DeleteOperationRecord deleteOperationRecord = obj instanceof DeleteOperationRecord ? (DeleteOperationRecord) obj : null;
            if (deleteOperationRecord == null) {
                LogUtil.j("PrivacyCenterActivity", "getLastClearCloudDataTime record == null");
                return;
            }
            long operateTime = deleteOperationRecord.getOperateTime();
            LogUtil.a("PrivacyCenterActivity", "getLastClearCloudDataTime time = ", Long.valueOf(operateTime));
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "privacy_last_clear_cloud_data_time", String.valueOf(operateTime), new StorageParams());
            PrivacyCenterActivity privacyCenterActivity = this.e.get();
            if (privacyCenterActivity == null) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 102;
            messageObtain.obj = Long.valueOf(operateTime);
            privacyCenterActivity.at.sendMessage(messageObtain);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.r()) {
            LogUtil.a("PrivacyCenterActivity", "onClick view is null or Fast Click");
            return;
        }
        int id = view.getId();
        this.bw = id;
        if (id == R.id.clear_cloud_fitness_data_linear_layout || this.bw == R.id.clear_cloud_fitness_data_linear_layout_1) {
            this.q.e(true);
            this.q.e();
            return;
        }
        if (this.bw == R.id.hw_health_privacy_notice) {
            if (this.d) {
                wmu wmuVarD = new wmu.b(this.t, this).d();
                this.bx = wmuVarD;
                wmuVarD.show();
                return;
            } else {
                wms wmsVar = new wms(this);
                this.ax = wmsVar;
                wmsVar.d(this.t);
                return;
            }
        }
        if (this.bw == R.id.hw_vmall_privacy_notice) {
            new wnc().e(this.t);
            return;
        }
        if (this.bw == R.id.sport_health_data_share_or_authorize_layout) {
            ai();
            return;
        }
        if (this.bw == R.id.health_kit_data_show_layout) {
            Intent intent = new Intent();
            intent.putExtra("jump_key", 2);
            intent.setClass(this.t, ManagerDataSourceActivity.class);
            this.t.startActivity(intent);
            return;
        }
        if (this.bw == R.id.content_recommend_layout) {
            Intent intent2 = new Intent();
            intent2.setClass(this.t, ContentRecommendActivity.class);
            this.t.startActivity(intent2);
            return;
        }
        if (this.bw == R.id.ad_recommend_layout) {
            Intent intent3 = new Intent();
            intent3.setClass(this.t, AdRecommendActivity.class);
            this.t.startActivity(intent3);
            return;
        }
        if (this.bw == R.id.hw_health_complaint_report) {
            ah();
            return;
        }
        if (this.bw == R.id.training_statistics_setting_main_layout) {
            Intent intent4 = new Intent();
            intent4.setClass(this.t, PrivacyTrainingStatisticsActivity.class);
            this.t.startActivity(intent4);
        } else {
            if (this.bw == R.id.permission_settings_layout) {
                wuu.c();
                Intent intent5 = new Intent();
                intent5.setClass(this.t, PermissionSettingsActivity.class);
                this.t.startActivity(intent5);
                return;
            }
            d();
        }
    }

    private void d() {
        if (this.bw == R.id.data_sources_manager) {
            ReleaseLogUtil.d("R_PrivacyCenterActivity", "click data source manager");
            c();
            return;
        }
        if (this.bw == R.id.third_party_sdk) {
            Intent intent = new Intent();
            intent.putExtra("Agreement_key", "3rdsdk");
            intent.putExtra("Is_show_cancel_key", false);
            intent.setClass(this.t, ServiceItemActivity.class);
            this.t.startActivity(intent);
            return;
        }
        if (this.bw == R.id.third_shared_msg) {
            Intent intent2 = new Intent();
            intent2.putExtra("Agreement_key", "3rdshare");
            intent2.putExtra("Is_show_cancel_key", false);
            intent2.setClass(this.t, ServiceItemActivity.class);
            this.t.startActivity(intent2);
            return;
        }
        if (this.bw == R.id.personal_info) {
            if (!lli.e().b() && !lli.e().f()) {
                lli.e().b(false, null);
            }
            boolean z = ContextCompat.checkSelfPermission(this.t, "android.permission.READ_CALL_LOG") == 0;
            boolean z2 = ContextCompat.checkSelfPermission(this.t, "android.permission.READ_CONTACTS") == 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                SharedPreferenceManager.c("privacy_center", "communication_record", String.valueOf(jCurrentTimeMillis));
                SharedPreferenceManager.c("privacy_center", "ori_communi_content", String.valueOf(jCurrentTimeMillis));
            }
            if (z2) {
                SharedPreferenceManager.c("privacy_center", "addr_book", String.valueOf(jCurrentTimeMillis));
            }
            s();
            al();
            return;
        }
        if (this.bw == R.id.statement_abstract) {
            Intent intent3 = new Intent();
            intent3.putExtra("Agreement_key", "di");
            intent3.putExtra("Is_show_cancel_key", false);
            intent3.setClass(this.t, ServiceItemActivity.class);
            this.t.startActivity(intent3);
            return;
        }
        LogUtil.j("PrivacyCenterActivity", "handleOtherView onClick else");
    }

    private void af() {
        RelativeLayout relativeLayout;
        if (Utils.o() || (relativeLayout = this.bd) == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.t, Integer.toString(10000), "wechat_red_dot_show");
        LogUtil.a("PrivacyCenterActivity", " isShowWechatRedDot: ", strE);
        this.s.setVisibility("true".equals(strE) ? 8 : 0);
    }

    private void ai() {
        Intent launchIntentForPackage;
        PackageManager packageManager = getApplicationContext().getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(BaseApplication.getAppPackage())) == null) {
            return;
        }
        launchIntentForPackage.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.thirdpartservice.activity.ThirdPartServiceActivity"));
        this.t.startActivity(launchIntentForPackage);
    }

    private void ah() {
        LogUtil.a("PrivacyCenterActivity", "gotoComplaintReport");
        ddv.b().loadH5ProApp(this.t, "com.huawei.health.h5.complaint", new H5ProLaunchOption.Builder());
    }

    private void al() {
        LogUtil.a("PrivacyCenterActivity", "gotoPersonalInfo");
        ddv.b().loadH5ProApp(this.t, "com.huawei.health.h5.privacy-collection-display", new H5ProLaunchOption.Builder());
    }

    private void s() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null || !njy.b(obj, HiUserInfo.class)) {
                    return;
                }
                List list = (List) obj;
                if (list.size() > 0) {
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (hiUserInfo.getHeight() > 0) {
                        SharedPreferenceManager.c("privacy_center", "user_height", String.valueOf(jCurrentTimeMillis));
                    }
                    if (hiUserInfo.getWeight() > 0.0f) {
                        SharedPreferenceManager.c("privacy_center", "user_weight", String.valueOf(jCurrentTimeMillis));
                    }
                    if (hiUserInfo.getGender() >= 0) {
                        SharedPreferenceManager.c("privacy_center", "sex", String.valueOf(jCurrentTimeMillis));
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("PrivacyCenterActivity", "fetchUserData onFailure");
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == null) {
            LogUtil.a("PrivacyCenterActivity", "onCheckedChanged buttonView is null");
            return;
        }
        if (!compoundButton.isPressed() || !qrs.d((Activity) this)) {
            LogUtil.a("PrivacyCenterActivity", "onCheckedChanged isChecked() = ", Boolean.valueOf(z));
            int id = compoundButton.getId();
            this.bw = id;
            if (id == R.id.hw_health_analysis_and_improvement) {
                a(z);
            }
            if (!this.f28455c) {
                this.f28455c = true;
                return;
            }
            if (this.bw == R.id.sync_profile_to_cloud_switch_button) {
                this.q.e(true);
                c(z);
                return;
            }
            if (this.bw == R.id.sync_fitness_data_to_cloud_switch_button) {
                if (!z) {
                    e(R.string.IDS_hwh_sport_data_privacy_switch_close, R.string.IDS_settings_button_ok);
                    return;
                }
                b(getString(R.string.IDS_hwh_sport_data_privacy_switch_open) + "");
                return;
            }
            if (this.bw == R.id.sync_health_data_to_cloud_switch_button) {
                this.q.e(true);
                d(z);
                return;
            } else {
                if (this.bw == R.id.hw_health_auto_update_weight_switchbutton) {
                    this.bt.setChecked(z);
                    String str = z ? "1" : "0";
                    SharedPreferenceManager.e(this.t, Integer.toString(10000), "health_weight_auto_update", str, new StorageParams());
                    if (compoundButton.isPressed()) {
                        b(AnalyticsValue.HEALTH_MINE_SETTINGS_UPDATE_WEIGHT_2040045.value(), str);
                        vwh.c(Boolean.valueOf(z));
                        return;
                    }
                    return;
                }
                b(compoundButton, z);
                return;
            }
        }
        compoundButton.setChecked(!z);
        LogUtil.a("PrivacyCenterActivity", "onCheckedChanged show no network dialog");
    }

    private void b(CompoundButton compoundButton, boolean z) {
        if (this.bw == R.id.goods_switch) {
            if (z) {
                c(z, this.t.getString(R.string.IDS_hw_healthService_agreement), this.t.getString(R.string.IDS_hw_confirm_enable), AnalyticsValue.HEALTH_MINE_SETTINGS_RECOMMEND_AD_2040044.value(), 1);
                return;
            } else {
                a(z, AnalyticsValue.HEALTH_MINE_SETTINGS_RECOMMEND_AD_2040044.value(), "2", false);
                return;
            }
        }
        if (this.bw == R.id.personalization_switch) {
            if (!z) {
                c(!z, this.t.getString(R.string.IDS_close_personalized_recommendation_tips), this.t.getString(R.string.IDS_beta_continue_use), AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), 2);
                return;
            } else {
                a(AnalyticsValue.HEALTH_PERSONALIZED_RECOMMENDATION_2041098.value(), "1", a.K);
                return;
            }
        }
        if (this.bw == R.id.hw_share_huawei_account_with_vmall_switch || this.bw == R.id.hw_share_huawei_account_with_myhuawei_switch) {
            if (z) {
                i(this.bw == R.id.hw_share_huawei_account_with_vmall_switch);
                return;
            } else {
                h(false);
                e(false);
                return;
            }
        }
        if (this.bw == R.id.HUAWEI_health_kit_read_and_write_switch_button) {
            if (!CommonUtil.ab(this.t.getApplicationContext())) {
                qpx.e(this, R.string.IDS_connect_network);
                compoundButton.setChecked(!z);
                return;
            } else {
                if (compoundButton.isEnabled()) {
                    compoundButton.setEnabled(false);
                    j(z);
                    return;
                }
                return;
            }
        }
        LogUtil.j("PrivacyCenterActivity", "handleOtherSwitch else");
    }

    private void a(String str, String str2, int i) {
        if (LoginInit.getInstance(this.t).isKidAccount() && (i != 212 || !y())) {
            c(i);
        } else {
            a(true, str, str2, true);
        }
    }

    private void c(int i) {
        Intent intent = new Intent();
        intent.putExtra("requestCode", SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        intent.putExtra(CommonConstant.REALNAMERESULT.KEY_VERIFY_TYPE, "1");
        intent.setClassName(this.t, "com.huawei.health.HuaweiLoginActivity");
        startActivityForResult(intent, i);
    }

    private void b(boolean z) {
        this.ak = z;
    }

    private boolean y() {
        return this.ak;
    }

    private void a(boolean z, String str, String str2, boolean z2) {
        if (!y()) {
            LogUtil.a("PrivacyCenterActivity", "setSwitchStatusAndBiEvent");
            h(z);
            b(str, str2);
            e(z2);
        }
        b(false);
    }

    private void a(boolean z) {
        if (z) {
            if (iox.e(this.t)) {
                aa();
                f(false);
                return;
            } else {
                aa();
                e(this.t.getString(R.string.IDS_hwh_privacy_analysis_and_improvement_content));
                return;
            }
        }
        iox.d(false);
        iox.b("key_privacy_analysis");
    }

    private void c(boolean z) {
        if (!z) {
            if (this.q.e(this, R.string.IDS_hw_weight_wifi_userinfo_outh_dialog_msg)) {
                return;
            }
            e(R.string.IDS_hwh_personal_profile_info_privacy_switch_close, R.string.IDS_settings_button_ok);
            return;
        }
        b(getString(R.string.IDS_hwh_personal_profile_info_privacy_switch_open));
    }

    private void d(boolean z) {
        if (!z) {
            if (this.q.e(this, R.string.IDS_hw_weight_wifi_outh_dialog_msg)) {
                return;
            }
            e(h(), R.string.IDS_settings_button_ok);
            return;
        }
        b(f());
    }

    private int h() {
        if (String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009))) {
            return R.string.IDS_hwh_data_health_close_europe;
        }
        return R.string.IDS_hwh_data_health_privacy_switch_close_china;
    }

    private String f() {
        if (String.valueOf(7).equals(LoginInit.getInstance(this).getAccountInfo(1009))) {
            return getString(R.string.IDS_hwh_data_health_open_europe) + "";
        }
        String str = getString(R.string.IDS_hwh_data_health_privacy_switch_open_china) + "";
        if (!wmu.a()) {
            return str;
        }
        return str + System.lineSeparator() + getString(R.string.IDS_hwh_privacy_health_data_backup);
    }

    private void c(boolean z, String str, String str2, final String str3, final int i) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(str).a(str2.toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vuw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(i, str3, view);
            }
        }).d(this.t.getString(R.string.IDS_hw_still_off).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(i, str3, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void a(int i, String str, View view) {
        if (1 == i) {
            a(str, "1", a.C);
        } else {
            b(true);
            h(true);
        }
    }

    public /* synthetic */ void c(int i, String str, View view) {
        if (2 == i) {
            a(false, str, "2", false);
        } else {
            b(true);
            h(false);
        }
    }

    private void i(boolean z) {
        SpannableString dialogContent;
        int i = z ? R.string.IDS_authorized_by_vmall : R.string.IDS_myhuawei_privacy_dialog_title;
        if (z) {
            dialogContent = new SpannableString(qre.f(R.string.IDS_authorized_by_vmall_dialog_content));
        } else {
            dialogContent = MyHuaweiLogin.getDialogContent(true);
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(i).d(dialogContent).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: vub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51594c.g(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.j(view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void g(View view) {
        h(true);
        e(true);
    }

    public /* synthetic */ void j(View view) {
        h(false);
        e(false);
    }

    private void a(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: vuf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyCenterActivity.c(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void h(View view) {
        osa.b(this.t, "data_pop_flag", "agree");
        an();
    }

    private void j(final boolean z) {
        int i;
        Resources resources = BaseApplication.getContext().getResources();
        if (z) {
            i = LoginInit.getInstance(this.t).isKidAccount() ? R.string.IDS_health_kit_open_kid_content : R.string.IDS_health_kit_open_content;
        } else {
            i = R.string.IDS_health_kit_close_content;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).e(BaseApplication.getContext().getResources().getString(z ? R.string.IDS_health_kit_open_title : R.string.IDS_health_kit_close_title)).a(resources.getString(i)).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: vvc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51616a.b(z, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vvb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51615b.d(z, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void b(boolean z, View view) {
        if (LoginInit.getInstance(this.t).isKidAccount() && z) {
            c(SleepBaseBarLineChartProvider.MSG_UPDATE_DATA_ORIGINAL_ICON);
        } else {
            e(z);
        }
    }

    public /* synthetic */ void d(boolean z, View view) {
        h(!z);
        this.aa.setEnabled(true);
    }

    private void aa() {
        HashMap map = new HashMap(16);
        map.put("type", "0");
        map.put("entrance", "e2");
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Privacy_0001");
        lmnVar.d(map2);
        lmf.d().a(this.t, AnalyticsValue.HEALTH_MINE_SETTINGS_IMPROVE_PLAN_2040021.value(), lmnVar, 0);
    }

    private void e(String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str).a(this.t.getString(R.string.IDS_device_log_enhancement_ok).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vuk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51602c.m(view);
            }
        }).d(this.t.getString(R.string.IDS_settings_button_cancal_ios_btn).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: vul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.k(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void m(View view) {
        if (LoginInit.getInstance(this.t).isKidAccount()) {
            c(a.D);
        } else {
            v();
        }
    }

    public /* synthetic */ void k(View view) {
        this.bv.e(11, false, null, null);
        h(false);
    }

    private void v() {
        this.f.setOnCheckedChangeListener(null);
        h(true);
        this.f.setOnCheckedChangeListener(this);
        iox.d(true);
    }

    private void g(boolean z) {
        if (this.d || LoginInit.getInstance(this.t).isKidAccount()) {
            LogUtil.a("PrivacyCenterActivity", "setTrainingStatistics invalid account");
            return;
        }
        boolean z2 = false;
        if (this.bw == R.id.sync_fitness_data_to_cloud_switch_button) {
            wmq wmqVar = this.ae;
            if (z && !u()) {
                z2 = true;
            }
            wmqVar.a(202, z2);
            return;
        }
        if (this.bw == R.id.sync_health_data_to_cloud_switch_button) {
            wmq wmqVar2 = this.ae;
            if (z && x()) {
                z2 = true;
            }
            wmqVar2.a(203, z2);
            return;
        }
        LogUtil.j("PrivacyCenterActivity", "setTrainingStatistics else");
    }

    private boolean u() {
        return "0".equals(SharedPreferenceManager.e(this.t, Integer.toString(10000), "key_user_close_training"));
    }

    private boolean x() {
        return "1".equals(SharedPreferenceManager.e(this.t, Integer.toString(10000), "key_user_close_health_training_statistics"));
    }

    private void c(String str) {
        if (this.bw == R.id.sync_profile_to_cloud_switch_button) {
            b(AnalyticsValue.HEALTH_USER_PROFILE_TO_CLOUD_2040057.value(), str);
            return;
        }
        if (this.bw == R.id.sync_fitness_data_to_cloud_switch_button) {
            b(AnalyticsValue.HEALTH_FITNESS_DATA_TO_CLOUD_2040058.value(), str);
        } else if (this.bw == R.id.sync_health_data_to_cloud_switch_button) {
            b(AnalyticsValue.HEALTH_HEALTH_DATA_TO_CLOUD_2040059.value(), str);
        } else {
            LogUtil.j("PrivacyCenterActivity", "switchButtonBi else");
        }
    }

    private void b(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.t, str, map, 0);
    }

    private void an() {
        Intent intent = new Intent();
        intent.putExtra("jump_key", 1);
        intent.setClass(this.t, ManagerDataSourceActivity.class);
        ReleaseLogUtil.d("R_PrivacyCenterActivity", "start data Source activity");
        this.t.startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.at.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e extends BaseHandler<PrivacyCenterActivity> {
        e(PrivacyCenterActivity privacyCenterActivity) {
            super(privacyCenterActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PrivacyCenterActivity privacyCenterActivity, Message message) {
            switch (message.what) {
                case 100:
                    if (message.obj instanceof HiUserPreference) {
                        privacyCenterActivity.e((HiUserPreference) message.obj);
                    } else {
                        LogUtil.a("PrivacyCenterActivity", "msg.obj is instanceof HiUserPreference");
                    }
                    break;
                case 101:
                    privacyCenterActivity.a();
                    break;
                case 102:
                    privacyCenterActivity.b(((Long) message.obj).longValue());
                    break;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.a("PrivacyCenterActivity", "onConfigurationChanged");
        wuf.d(this.t);
        ad();
    }

    private void ad() {
        wms wmsVar;
        wmu wmuVar;
        if (this.d && (wmuVar = this.bx) != null && wmuVar.isShowing()) {
            this.bx.b(this);
        }
        if (this.d || (wmsVar = this.ax) == null || !wmsVar.e()) {
            return;
        }
        this.ax.d(this);
    }

    private void c() {
        if (!CommonUtil.ab(this)) {
            an();
            return;
        }
        if (!TextUtils.isEmpty(osa.c(this.t, "data_pop_flag", ""))) {
            an();
        } else if (mjh.e(BaseApplication.getContext())) {
            a(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_datasource_quantity_des));
        } else {
            a(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_network_quantity_des));
        }
    }
}

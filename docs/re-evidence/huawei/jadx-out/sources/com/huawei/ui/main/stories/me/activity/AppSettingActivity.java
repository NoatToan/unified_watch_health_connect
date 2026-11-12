package com.huawei.ui.main.stories.me.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.syncmgr.SyncOption;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.me.util.AppSettingUtil;
import com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity;
import defpackage.etv;
import defpackage.ffv;
import defpackage.fga;
import defpackage.ive;
import defpackage.iyd;
import defpackage.iyh;
import defpackage.izt;
import defpackage.jaa;
import defpackage.ljo;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsg;
import defpackage.njy;
import defpackage.qec;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.ucq;
import defpackage.ujq;
import defpackage.wkb;
import defpackage.wmi;
import defpackage.wss;
import defpackage.wub;
import defpackage.wuz;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class AppSettingActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f28373b = new Object();
    private Context aa;
    private HealthDivider ab;
    private wmi ac;
    private RelativeLayout ad;
    private RelativeLayout ae;
    private HealthDivider af;
    private ImageView ag;
    private ImageView ah;
    private RelativeLayout ai;
    private RelativeLayout aj;
    private RelativeLayout ak;
    private HealthRadioButton al;
    private ImageView am;
    private HealthDivider an;
    private GuideInteractors ao;
    private HealthRadioButton ap;
    private HealthSwitchButton aq;
    private RelativeLayout ar;
    private RelativeLayout as;
    private ImageView av;
    private RelativeLayout aw;
    private RelativeLayout ax;
    private RelativeLayout ay;
    private boolean az;
    private boolean bb;
    private HealthRadioButton bc;
    private boolean bg;
    private HealthTextView bl;
    private HealthButton bn;
    private ImageView bo;
    private RelativeLayout bp;
    private HealthDivider bq;
    private LinearLayout br;
    private ImageView bs;
    private RelativeLayout bt;
    private ImageView bu;
    private HealthTextView bv;
    private RelativeLayout bw;
    private HealthDivider bx;
    private ImageView by;
    private ImageView bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f28375c;
    private RelativeLayout ca;
    private RelativeLayout cc;
    private e cd;
    private HealthDownLoadWidget ce;
    private RelativeLayout cf;
    private ImageView cg;
    private LinearLayout ch;
    private HealthTextView ci;
    private ImageView cj;
    private RelativeLayout ck;
    private ImageView cm;
    private ImageView cn;
    private RelativeLayout co;
    private RelativeLayout cp;
    private ImageView cq;
    private ImageView cr;
    private SocialShareCenterApi cs;
    private RelativeLayout ct;
    private HealthSwitchButton cu;
    private RelativeLayout cv;
    private RelativeLayout cw;
    private ImageView cx;
    private HealthDivider cy;
    private RelativeLayout cz;
    private AppSettingUtil d;
    private ImageView da;
    private HealthSwitchButton db;
    private wss dc;
    private RelativeLayout dd;
    private RelativeLayout de;
    private ImageView df;
    private HealthTextView f;
    private HealthImageView g;
    private HealthImageView h;
    private LinearLayout i;
    private HealthRadioButton j;
    private HealthSwitchButton k;
    private iyd l;
    private HealthDivider m;
    private RelativeLayout n;
    private RelativeLayout o;
    private HealthTextView p;
    private a q;
    private int r;
    private a s;
    private a t;
    private RelativeLayout u;
    private ImageView v;
    private RelativeLayout w;
    private ImageView x;
    private HealthDivider y;
    private RelativeLayout z;
    private boolean bd = false;
    private HealthOpenSDK au = null;
    private c at = new c(this);
    private boolean bm = false;
    private boolean bk = false;
    private boolean bf = false;
    private boolean be = false;
    private boolean bh = false;
    private boolean ba = false;
    private boolean cb = false;
    private int cl = 0;
    private long bi = 0;
    private boolean bj = false;
    private ArrayList<HiAppInfo> e = new ArrayList<>(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f28374a = new d(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_show_settings_app);
        this.cd = new e();
        this.aa = this;
        this.dc = wss.d(this);
        this.d = new AppSettingUtil(this.aa);
        this.dc.a(this.f28374a);
        this.ao = new GuideInteractors(this.aa);
        this.bj = Utils.o();
        this.az = LoginInit.getInstance(this.aa).isBrowseMode();
        this.ac = new wmi(this.aa, this, null);
        this.cs = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        s();
        p();
    }

    private void s() {
        this.au = fga.d(this).e();
        this.q = new a("getNotificationSupport");
        this.s = new a("getGoalNotifiState");
        this.t = new a("getStepsNotifiState");
    }

    private void p() {
        LogUtil.a("UIME_AppSettingActivity", "initView to enter");
        o();
        e();
        af();
        as();
        ah();
        q();
        m();
        z();
        r();
        ai();
        t();
        ae();
        ak();
        if (!"1".equals(SharedPreferenceManager.e(this.aa, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            this.bn.setVisibility(8);
        }
        String strE = SharedPreferenceManager.e(this.aa, Integer.toString(10000), "key_settings_cache_size");
        this.ci.setText(strE);
        this.p.setText(strE);
        this.db.setChecked(d());
        a();
    }

    private void e() {
        ((HealthScrollView) findViewById(R.id.app_setting_activity_main_layout)).setScrollViewVerticalDirectionEvent(true);
        this.am = (ImageView) findViewById(R.id.goal_image_view);
        this.df = (ImageView) findViewById(R.id.about_wechat_rank_account);
        this.da = (ImageView) findViewById(R.id.about_change_other_account);
        this.bo = (ImageView) findViewById(R.id.about_offline_map);
        this.bu = (ImageView) findViewById(R.id.hw_map_type_right_arrow);
        this.by = (ImageView) findViewById(R.id.plugin_management_arrow);
        this.cg = (ImageView) findViewById(R.id.plugin_setting_arrow);
        this.av = (ImageView) findViewById(R.id.health_todo_right_arrow);
        this.bs = (ImageView) findViewById(R.id.notification_message_right_arrow);
        this.cr = (ImageView) findViewById(R.id.sport_setting_item_right_arrow);
        this.cn = (ImageView) findViewById(R.id.hw_setting_unit_right_arrow);
        this.cq = (ImageView) findViewById(R.id.hw_setting_service_model_right_arrow);
        this.cj = (ImageView) findViewById(R.id.service_express_card_plugin_setting_arrow);
        this.bz = (ImageView) findViewById(R.id.user_profile_opensource_right_arrow);
        this.x = (ImageView) findViewById(R.id.clear_cache_right_arrow);
        this.v = (ImageView) findViewById(R.id.clear_cache_arrow);
        this.cx = (ImageView) findViewById(R.id.stop_health_arrow);
        this.ci = (HealthTextView) findViewById(R.id.app_setting_cache_size);
        this.p = (HealthTextView) findViewById(R.id.app_cache_size);
        this.ah = (ImageView) findViewById(R.id.device_share_img);
        this.cm = (ImageView) findViewById(R.id.setting_select_img);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.user_profile_health_equipment_capacity_opening_layout);
        this.ae = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.ag = (ImageView) findViewById(R.id.equipment_capacity_opening_img);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_show_settings_login);
        this.bn = healthButton;
        healthButton.setOnClickListener(this);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.show_voice_switch);
        this.db = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(this);
        HealthSwitchButton healthSwitchButton2 = (HealthSwitchButton) findViewById(R.id.app_setting_scan_automatic);
        this.k = healthSwitchButton2;
        healthSwitchButton2.setChecked(true ^ this.ao.d());
        this.k.setOnCheckedChangeListener(this);
        HealthSwitchButton healthSwitchButton3 = (HealthSwitchButton) findViewById(R.id.share_userinfo_switch);
        this.cu = healthSwitchButton3;
        healthSwitchButton3.setChecked(this.cs.isShowUserInfo());
        this.cu.setOnCheckedChangeListener(this);
        u();
    }

    private void u() {
        if (LanguageUtil.ba(this.aa)) {
            Drawable drawable = getResources().getDrawable(R.drawable.common_ui_arrow_left);
            this.am.setBackground(drawable);
            this.da.setBackground(drawable);
            this.bo.setBackground(drawable);
            this.bu.setBackground(drawable);
            this.by.setBackground(drawable);
            this.cg.setBackground(drawable);
            this.av.setBackground(drawable);
            this.bs.setBackground(drawable);
            this.cj.setBackground(drawable);
            this.cr.setBackground(drawable);
            this.cn.setBackground(drawable);
            this.cq.setBackground(drawable);
            this.df.setBackground(drawable);
            this.bz.setBackground(drawable);
            this.x.setBackground(drawable);
            this.v.setBackground(drawable);
            this.cx.setBackground(drawable);
            this.ah.setBackground(drawable);
            this.cm.setBackground(drawable);
            this.ag.setBackground(drawable);
            this.h.setBackground(drawable);
            return;
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.common_ui_arrow_right);
        this.am.setBackground(drawable2);
        this.da.setBackground(drawable2);
        this.bo.setBackground(drawable2);
        this.bu.setBackground(drawable2);
        this.by.setBackground(drawable2);
        this.cg.setBackground(drawable2);
        this.av.setBackground(drawable2);
        this.bs.setBackground(drawable2);
        this.cj.setBackground(drawable2);
        this.cr.setBackground(drawable2);
        this.cn.setBackground(drawable2);
        this.cq.setBackground(drawable2);
        this.df.setBackground(drawable2);
        this.bz.setBackground(drawable2);
        this.x.setBackground(drawable2);
        this.v.setBackground(drawable2);
        this.cx.setBackground(drawable2);
        this.ah.setBackground(drawable2);
        this.cm.setBackground(drawable2);
        this.ag.setBackground(drawable2);
        this.h.setBackground(drawable2);
    }

    private void af() {
        this.ar = (RelativeLayout) findViewById(R.id.hw_show_setting_gps_low_consumption_layout);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.show_gps_low_consumption_switch);
        this.aq = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(this);
        String strE = SharedPreferenceManager.e(this, "flp_track_switch", "flp_track_flag");
        if (this.d.a(strE)) {
            this.aq.setChecked(false);
            this.bd = true;
        } else if ("1".equals(strE)) {
            this.aq.setChecked(true);
            this.bd = true;
        } else {
            LogUtil.j("UIME_AppSettingActivity", "setGpsLowPower this status is not exist");
        }
        this.bg = this.aq.isChecked();
        if (iyh.d() && jaa.j()) {
            this.ar.setVisibility(0);
            LogUtil.a("UIME_AppSettingActivity", "setGpsLowPower support low power");
        } else {
            this.ar.setVisibility(8);
            LogUtil.a("UIME_AppSettingActivity", "setGpsLowPower don't support low power");
        }
        this.ar.setVisibility(8);
        this.ca = (RelativeLayout) findViewById(R.id.hw_offline_map_layout);
        this.de = (RelativeLayout) findViewById(R.id.hw_show_setting_voice_layout);
        this.cz = (RelativeLayout) findViewById(R.id.hw_stop_health_layout);
        this.br = (LinearLayout) findViewById(R.id.hw_manual_synchronous_layout);
        this.n = (RelativeLayout) findViewById(R.id.hw_show_auto_scan_layout);
        this.bq = (HealthDivider) findViewById(R.id.manual_sync_divider);
        this.bp = (RelativeLayout) findViewById(R.id.hw_manual_synchronous_rl_layout);
        LogUtil.a("UIME_AppSettingActivity", "setGpsLowPower(), CommonUtil.isSupportWearProduct() = ", Boolean.valueOf(CommonUtil.ck()));
    }

    private void as() {
        if (CommonUtil.ck() && !EnvironmentInfo.m()) {
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
        this.ce = (HealthDownLoadWidget) findViewById(R.id.syn_circle_progress);
        String upperCase = qre.f(R.string.IDS_device_wear_home_confirm_sync_account).toUpperCase();
        this.ce.setIdleText(upperCase);
        this.ce.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.syn_circle_progress_layout);
        this.aw = relativeLayout;
        lrd.a(relativeLayout, upperCase, (Class<?>) Button.class);
        this.ca.setOnClickListener(this);
        this.cz.setOnClickListener(this);
        this.ad = (RelativeLayout) findViewById(R.id.hw_show_developer_options_layout);
        this.y = (HealthDivider) findViewById(R.id.setting_clear_cache_image);
        this.ch = (LinearLayout) findViewById(R.id.app_setting_activity_layout_top);
        this.ad.setOnClickListener(this);
        if (c()) {
            this.ad.setVisibility(0);
            this.y.setVisibility(0);
        } else {
            this.ad.setVisibility(8);
            this.y.setVisibility(8);
        }
        this.de.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.user_profile_opensource_layout);
        this.cw = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
    }

    private void ah() {
        this.cf = (RelativeLayout) findViewById(R.id.plugin_management_layout);
        this.cc = (RelativeLayout) findViewById(R.id.plugin_setting_layout);
        if (AppBundle.c().getAllBundleModules(this, true).isEmpty()) {
            this.cf.setVisibility(8);
            this.cc.setVisibility(8);
        } else {
            this.cf.setOnClickListener(this);
            this.cc.setOnClickListener(this);
        }
    }

    private void q() {
        this.z = (RelativeLayout) findViewById(R.id.app_setting_clear_cache);
        this.u = (RelativeLayout) findViewById(R.id.app_clear_cache);
        this.dd = (RelativeLayout) findViewById(R.id.hw_wechat_rank_layout);
        this.ak = (RelativeLayout) findViewById(R.id.hw_goal_layout);
        this.an = (HealthDivider) findViewById(R.id.hw_goal_line);
        this.ai = (RelativeLayout) findViewById(R.id.user_profile_device_share_layout);
        this.af = (HealthDivider) findViewById(R.id.device_capacity_opening_divider_line);
        this.ai.setOnClickListener(this);
        this.ab = (HealthDivider) findViewById(R.id.user_profile_health_data_share_line);
        this.dd.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        a(this.z);
        a(this.u);
        this.w = (RelativeLayout) findViewById(R.id.hw_change_other_account_layout);
        if (CommonUtil.ca()) {
            this.ce.setClickable(false);
        } else {
            this.ce.setClickable(true);
        }
        if (qrs.ac()) {
            this.z.setVisibility(8);
            this.u.setVisibility(0);
        } else {
            this.z.setVisibility(0);
            this.u.setVisibility(8);
        }
    }

    private void m() {
        this.ax = (RelativeLayout) findViewById(R.id.health_todo_layout);
        TodoDataApi todoDataApi = (TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class);
        todoDataApi.isShowTodo();
        if (todoDataApi.isShowTodo()) {
            this.ax.setVisibility(0);
            this.ax.setOnClickListener(this);
            at();
            return;
        }
        this.ax.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        ((HealthTextView) findViewById(R.id.health_todo_type_text)).setText(((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).isMainSwitchChecked() ? R.string.IDS_status_enabled : R.string.IDS_status_disabled);
    }

    private void z() {
        this.bw = (RelativeLayout) findViewById(R.id.notification_message_layout);
        if (!"com.huawei.health".equals(BaseApplication.getAppPackage())) {
            this.bw.setVisibility(8);
        }
        this.bw.setOnClickListener(this);
        this.co = (RelativeLayout) findViewById(R.id.setting_select_zip_file);
        if (CommonUtil.br()) {
            this.co.setVisibility(0);
            SharedPreferences.Editor editorEdit = this.aa.getSharedPreferences("devicedownloadtime", 0).edit();
            editorEdit.putBoolean("isdemo", true);
            editorEdit.commit();
        } else {
            this.co.setVisibility(8);
        }
        this.co.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sport_setting_item_layout);
        this.cv = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.cy = (HealthDivider) findViewById(R.id.sport_setting_line);
        this.bl = (HealthTextView) findViewById(R.id.last_sync_time_tv);
        ag();
    }

    private void r() {
        this.bt = (RelativeLayout) findViewById(R.id.hw_show_map_type_layout);
        this.bv = (HealthTextView) findViewById(R.id.hw_show_map_type_text);
        this.bx = (HealthDivider) findViewById(R.id.hw_offline_map_divider);
        this.bt.setOnClickListener(this);
    }

    private void ai() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.hw_show_setting_unit_layout);
        this.ct = relativeLayout;
        relativeLayout.setOnClickListener(this);
        if (!Utils.o()) {
            y();
            return;
        }
        if (Utils.h()) {
            this.br.setVisibility(0);
            this.bq.setVisibility(0);
            l();
        } else {
            this.an.setVisibility(8);
            this.ab.setVisibility(8);
            this.ch.setVisibility(8);
            l();
        }
    }

    private void t() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.service_express_card_setting_layout);
        this.ck = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.f28375c = (ImageView) findViewById(R.id.service_express_card_red_point);
        if (ucq.b()) {
            this.ck.setVisibility(0);
        } else {
            this.ck.setVisibility(8);
        }
    }

    private void ae() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.hw_show_setting_service_model_layout);
        this.cp = relativeLayout;
        relativeLayout.setOnClickListener(this);
        if (CommonUtil.j(LoginInit.getInstance(this.aa).getAccountInfo(1009)) == 1 || SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            this.cp.setVisibility(0);
        }
    }

    private void o() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cl_auto_identify_record);
        this.i = linearLayout;
        linearLayout.setOnClickListener(this);
        this.g = (HealthImageView) findViewById(R.id.hiv_red_point);
        this.f = (HealthTextView) findViewById(R.id.tv_auto_identify_record_right_text);
        this.h = (HealthImageView) findViewById(R.id.iv_auto_identify_record_arrow);
        this.m = (HealthDivider) findViewById(R.id.auto_identify_record_divider);
    }

    private void ak() {
        if (this.az) {
            this.ak.setVisibility(8);
            this.an.setVisibility(8);
            this.br.setVisibility(8);
            this.bq.setVisibility(8);
            this.ae.setVisibility(8);
            this.cv.setVisibility(8);
            this.bw.setVisibility(8);
            return;
        }
        this.ak.setVisibility(0);
        this.an.setVisibility(0);
        this.br.setVisibility(0);
        this.bq.setVisibility(0);
        if (EnvironmentInfo.m()) {
            this.ae.setVisibility(8);
        } else {
            this.ae.setVisibility(0);
        }
        this.cv.setVisibility(0);
        this.bw.setVisibility(0);
    }

    private void y() {
        if (this.az) {
            this.ca.setVisibility(8);
        } else {
            this.ca.setVisibility(0);
        }
        this.ch.setVisibility(0);
        if (!CommonUtil.cb() && !izt.d(this.aa)) {
            this.bt.setVisibility(8);
            this.bx.setVisibility(8);
        } else {
            this.bt.setVisibility(0);
            this.bx.setVisibility(0);
        }
        this.f28374a.sendEmptyMessage(104);
        this.w.setVisibility(8);
    }

    private void l() {
        this.dd.setVisibility(8);
        this.w.setVisibility(8);
        this.ca.setVisibility(8);
        if (CommonUtil.bg() && CommonUtil.cb() && izt.d(this.aa)) {
            this.bt.setVisibility(0);
            this.bx.setVisibility(0);
            this.f28374a.sendEmptyMessage(104);
        } else {
            this.bt.setVisibility(8);
            this.bx.setVisibility(8);
        }
    }

    private void ag() {
        String strE = SharedPreferenceManager.e(this.aa, Integer.toString(10000), "last_sync_time");
        if (strE == null || "".equals(strE) || "0".equals(strE)) {
            return;
        }
        LogUtil.a("UIME_AppSettingActivity", "setLastSyncTime lastSyncTime = ", strE);
        Date date = null;
        long time = 0;
        if (strE.contains(":")) {
            try {
                date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(strE);
                if (date != null) {
                    time = date.getTime();
                }
            } catch (ParseException e2) {
                LogUtil.e("UIME_AppSettingActivity", "setLastSyncTime Exception: ", e2.getMessage());
            }
        } else {
            try {
                time = Long.parseLong(strE);
                date = new Date(time);
            } catch (NumberFormatException e3) {
                LogUtil.e("UIME_AppSettingActivity", "setLastSyncTime Exception: ", e3.getMessage());
            }
        }
        if (date != null) {
            LogUtil.a("UIME_AppSettingActivity", "setLastSyncTime date = ", date);
            StringBuilder sbD = d(new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMdd")).format(date), qrk.a(this.aa, time, 1));
            this.bl.setVisibility(0);
            this.bl.setText(qre.f(R.string.IDS_hw_last_sync_time) + ((Object) sbD));
            lrd.b(this.bp, qre.a(R.string.accessibility_setting_manual_sync_time, sbD));
        }
    }

    private StringBuilder d(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty()) {
            LogUtil.j("UIME_AppSettingActivity", "setLastTime formatDate is empty or formatTime is empty");
        }
        StringBuilder sb = new StringBuilder();
        if (LanguageUtil.q(this.aa) || LanguageUtil.bh(this.aa) || LanguageUtil.be(this.aa) || LanguageUtil.az(this.aa) || LanguageUtil.p(this.aa)) {
            sb.append(" ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            return sb;
        }
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb;
    }

    private void n() {
        this.l = ive.c().d(this.aa);
        if (w()) {
            this.bb = true;
            this.i.setVisibility(0);
            this.m.setVisibility(0);
            this.f.setText(this.l.e() ? R.string.IDS_status_enabled : R.string.IDS_status_disabled);
            this.g.setVisibility(this.l.h() ? 0 : 8);
            return;
        }
        this.bb = false;
        this.i.setVisibility(8);
        this.m.setVisibility(8);
    }

    private boolean w() {
        iyd iydVar = this.l;
        if (iydVar == null) {
            LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance mAutoTrackConfig is null");
            return false;
        }
        if (!iydVar.d()) {
            LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance is not show AutoTrackBtn");
            return false;
        }
        if (!"1".equals(KeyValDbManager.d(this.aa).c("SUPPORT_AR_ABILITY"))) {
            LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance AR capability is not supported");
            return false;
        }
        if (qrs.ah(this.aa)) {
            LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance the current device is pad");
            return false;
        }
        if (Utils.o()) {
            LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance the version is oversea");
            return false;
        }
        if (!wkb.d()) {
            return true;
        }
        LogUtil.j("UIME_AppSettingActivity", "isShowAutoTrackEntrance is base service model");
        return false;
    }

    private boolean d() {
        String strE = SharedPreferenceManager.e(this.aa, Integer.toString(20002), "voice_enable_type");
        return strE == null || !"0".equals(strE);
    }

    private void a() {
        HiHealthNativeApi.a(BaseApplication.getContext()).queryWearKitAppInfo(new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("UIME_AppSettingActivity", "checkApkExist NameNotFoundException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(Context context, HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            LogUtil.j("UIME_AppSettingActivity", "checkApkValid() hiAppInfo is null");
            return false;
        }
        String packageName = hiAppInfo.getPackageName();
        String signature = hiAppInfo.getSignature();
        if (TextUtils.isEmpty(packageName) || TextUtils.isEmpty(signature)) {
            LogUtil.j("UIME_AppSettingActivity", "checkApkValid() packageName or signature is null");
            return false;
        }
        String strC = ljo.c(signature);
        if (strC == null) {
            LogUtil.j("UIME_AppSettingActivity", "checkApkValid fingerprint is null");
            return false;
        }
        int iA = ljo.a(signature);
        String strA = HsfSignValidator.a(context, packageName);
        try {
            int i = context.getPackageManager().getApplicationInfo(packageName, 0).uid;
            if (strC.equals(strA) && iA == i) {
                return true;
            }
            LogUtil.j("UIME_AppSettingActivity", "checkApkValid() return false");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("UIME_AppSettingActivity", "checkApkValid() NameNotFoundException");
            return false;
        }
    }

    private void f() {
        a aVar;
        HealthOpenSDK healthOpenSDK = this.au;
        if (healthOpenSDK == null || (aVar = this.q) == null) {
            return;
        }
        healthOpenSDK.b((IExecuteResult) aVar);
    }

    private void k() {
        HealthOpenSDK healthOpenSDK = this.au;
        if (healthOpenSDK == null) {
            return;
        }
        a aVar = this.t;
        if (aVar != null) {
            healthOpenSDK.d((IExecuteResult) aVar);
        }
        a aVar2 = this.s;
        if (aVar2 != null) {
            this.au.e(aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        int iJ = j();
        LogUtil.a("UIME_AppSettingActivity", "updateSettingMapType map type : ", Integer.valueOf(iJ));
        if (iJ == 1) {
            if (LanguageUtil.l(this.aa) || LanguageUtil.q(this.aa)) {
                this.bv.setText(R.string.IDS_hwh_motiontrack_map_type_setting_gaode);
                return;
            } else {
                this.bv.setText(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode);
                return;
            }
        }
        if (iJ != 2) {
            if (iJ == 3) {
                this.bv.setText(R.string.IDS_hw_petal_maps);
                return;
            } else {
                this.bv.setText(R.string.IDS_aw_auto_mode);
                return;
            }
        }
        if (LanguageUtil.l(this.aa) || LanguageUtil.q(this.aa)) {
            this.bv.setText(R.string.IDS_hwh_motiontrack_map_type_setting_google);
        } else {
            this.bv.setText(R.string.IDS_hw_show_data_tarck_map_type_setting_google);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("UIME_AppSettingActivity", "Enter onDestroy()");
        if (this.cd != null) {
            LogUtil.a("UIME_AppSettingActivity", "unregisterReceiver mReceiver");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.cd);
            this.bm = false;
        }
        super.onDestroy();
        if (this.q != null) {
            this.q = null;
        }
        if (this.s != null) {
            this.s = null;
        }
        if (this.t != null) {
            this.t = null;
        }
        c cVar = this.at;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.at = null;
        }
        Handler handler = this.f28374a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f28374a = null;
        }
        ThreadPoolManager.c().d("getAllCacheSize", (Runnable) null);
        FaCardAgdsApi faCardAgdsApiB = etv.b();
        if (faCardAgdsApiB != null) {
            faCardAgdsApiB.close();
        }
    }

    public void e(Intent intent) {
        synchronized (f28373b) {
            int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
            LogUtil.a("UIME_AppSettingActivity", "updateSyncView status = ", Integer.valueOf(intExtra));
            if (intExtra == 2) {
                g();
            } else if (intExtra == 3) {
                ap();
            } else if (intExtra == 1) {
                double doubleExtra = intent.getDoubleExtra("com.huawei.hihealth.action_sync_process", 0.0d);
                LogUtil.a("UIME_AppSettingActivity", "updateSyncView process = ", Double.valueOf(doubleExtra));
                this.ce.setVisibility(0);
                this.ce.a(((int) doubleExtra) - this.ce.getProgress());
                this.ce.setClickable(false);
            } else if (intExtra == 0) {
                LogUtil.d("UIME_AppSettingActivity", "updateSyncView Sync BEGIN");
                this.ce.setProgress(0);
            } else {
                LogUtil.j("UIME_AppSettingActivity", "updateSyncView is other status");
            }
        }
    }

    private void ac() {
        this.ce.setClickable(true);
        this.ce.d();
        this.ce.b();
        this.ce.setProgressButtonBackgroundDrawable(getDrawable(R.drawable.hwbutton_default_small_emui));
        this.ce.setIdleText(getResources().getString(R.string.IDS_device_wear_home_confirm_sync_account).toUpperCase());
    }

    private void g() {
        LogUtil.d("UIME_AppSettingActivity", "finishDataSync sync done");
        if (this.cd != null) {
            LogUtil.d("UIME_AppSettingActivity", "finishDataSync unregisterReceiver mReceiver");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.cd);
            this.bm = false;
        }
        ac();
        qpx.e(this.aa, getResources().getString(R.string.IDS_hw_show_synchronous_success));
        Date date = new Date();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMdd")).format(date);
        String strA = qrk.a(this.aa, jCurrentTimeMillis, 1);
        LogUtil.a("UIME_AppSettingActivity", "finishDataSync formatDate:", str, " formatTime:", strA);
        StringBuilder sbD = d(str, strA);
        SharedPreferenceManager.e(this.aa, Integer.toString(10000), "last_sync_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        this.bl.setVisibility(0);
        this.bl.setText(qre.f(R.string.IDS_hw_last_sync_time) + ((Object) sbD));
        lrd.b(this.bp, qre.a(R.string.accessibility_setting_manual_sync_time, sbD));
        h();
    }

    private void h() {
        if (!CommonUtil.cc()) {
            ReleaseLogUtil.d("UIME_AppSettingActivity", "finishDataSyncNotifyCloud is not SupportHomeCountryVersion.");
        } else {
            ReleaseLogUtil.c("UIME_AppSettingActivity", "finishDataSyncNotifyCloud.");
            ThirdPartyLoginManager.getInstance().putUserHomeCountryStatus("0", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.c("UIME_AppSettingActivity", "finishDataSyncNotifyCloud errorCode:", Integer.valueOf(i));
                }
            });
        }
    }

    private void ap() {
        LogUtil.d("UIME_AppSettingActivity", "syncDataFail to enter");
        if (this.cd != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.cd);
            this.bm = false;
        }
        ac();
        qpx.e(this.aa, R.string.IDS_hw_show_me_sync_fail);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.aa);
        builder.e(getResources().getString(R.string.IDS_hw_health_show_common_dialog_title)).a(getResources().getString(R.string.IDS_hw_sync_fail_try)).a(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_AppSettingActivity", "syncDataFail onClick click to positive view");
                AppSettingActivity.this.ab();
                AppSettingActivity.this.ad();
            }
        }).e(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_AppSettingActivity", "syncDataFail onClick click to negative view");
                AppSettingActivity.this.ad();
            }
        });
        final CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.show();
        customTextAlertDialogB.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.20
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                LogUtil.a("UIME_AppSettingActivity", "syncDataFail onCancel click dialog");
                AppSettingActivity.this.ad();
                customTextAlertDialogB.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        Intent intent = new Intent();
        intent.setAction("sync_cloud_data_action");
        intent.putExtra("sync_cloud_data_status", "sync_cloud_data_setting_flag");
        BroadcastManagerUtil.a(this.aa, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        LogUtil.a("UIME_AppSettingActivity", "processManualSync() to enter");
        if (!this.bm) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.hihealth.action_sync");
            LocalBroadcastManager.getInstance().registerReceiver(this.cd, intentFilter);
            this.bm = true;
        }
        if (NetworkUtil.h()) {
            if (NetworkUtil.f()) {
                an();
                return;
            }
            this.ce.setClickable(false);
            this.d.b(this.au, this.ce, getResources().getString(R.string.IDS_hw_show_me_sync_begin));
            ar();
            return;
        }
        qpx.b(this.aa, R.string.IDS_hw_show_set_about_privacy_connectting_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() {
        if (this.bj) {
            LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.sync_activity_to_third_platform"));
        }
    }

    private void an() {
        LogUtil.a("UIME_AppSettingActivity", "showManualSyncDialog() to enter");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.aa);
        builder.e(getString(R.string.IDS_hw_health_show_common_dialog_title)).a(getString(R.string.IDS_hw_show_setting_synchronous_prompt)).a(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_AppSettingActivity", "showManualSyncDialog onClick positive");
                AppSettingActivity.this.ce.setClickable(false);
                AppSettingActivity.this.d.b(AppSettingActivity.this.au, AppSettingActivity.this.ce, AppSettingActivity.this.getResources().getString(R.string.IDS_hw_show_me_sync_begin));
                AppSettingActivity.this.ar();
            }
        }).e(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_AppSettingActivity", "showManualSyncDialog onClick negative");
            }
        });
        builder.b().show();
    }

    private void x() {
        ffv.u();
        LogUtil.a("UIME_AppSettingActivity", "loginOut enter");
        SharedPreferenceManager.e(this.aa, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN, "0", new StorageParams(0));
        fga.e(false);
        LoginInit.getInstance(this.aa).logout();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isDestroyed() || isFinishing() || this.aa == null) {
            LogUtil.j("UIME_AppSettingActivity", "onClick activity isDestroyed or isFinishing or mContext is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        if (qrs.c(750)) {
            LogUtil.a("UIME_AppSettingActivity", "onClick too fast");
            return;
        }
        if (view == this.bn) {
            x();
            return;
        }
        if (view.getId() == R.id.hw_offline_map_layout) {
            c(map);
            return;
        }
        if (view == this.ce) {
            LogUtil.a("UIME_AppSettingActivity", "AppSettingActivity onClick  Sync data manually ");
            ad();
            lmf.d().c(this.aa, AnalyticsValue.HEALTH_MINE_SETTINGS_SYNC_2040014.value(), map, 0);
            ab();
            aq();
            return;
        }
        if (view == this.cz) {
            this.ac.c(true);
            this.ac.j();
            return;
        }
        if (view == this.ad) {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.huawei.health.developer.DeveloperActivity");
            startActivity(intent);
            return;
        }
        if (view == this.bw) {
            String strValue = AnalyticsValue.HEALTH_MINE_SETTINGS_OPEN_NOTIFICATION_2040015.value();
            HashMap map2 = new HashMap();
            map2.put("click", "1");
            lmf.d().c(this.aa, strValue, map2, 0);
            this.ba = false;
            this.bh = false;
            k();
            return;
        }
        if (view == this.ax) {
            AppRouter.c("/todoTask/TodoSettingActivity").b(this);
            HashMap map3 = new HashMap(3);
            map3.put("from", 2);
            map3.put("click", 1);
            lmf.d().c(this.aa, AnalyticsValue.HEALTH_LIFE_TODO_SETTINGS_ENTER_2040174.value(), map3, 0);
            return;
        }
        c(view, map);
    }

    private void aq() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.24
            @Override // java.lang.Runnable
            public void run() {
                qec.e().startSynCoreSleep(SyncOption.builder().d(true).c(), new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.24.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("UIME_AppSettingActivity", "app setting sync has been done errorCode: ", Integer.valueOf(i));
                    }
                });
                if (CommonUtil.ap() || CommonUtil.ao()) {
                    qec.h().startSynWorkOut();
                }
                qec.c().startSynBasicData(null);
                qec.f().syncStressDetailData();
            }
        });
    }

    private void c(View view, Map<String, Object> map) {
        if (view == this.ct) {
            startActivity(new Intent(this, (Class<?>) UnitSettingActivity.class));
            return;
        }
        if (view == this.cp) {
            startActivity(new Intent(this, (Class<?>) ServiceModelSettingActivity.class));
            return;
        }
        if (view == this.bt) {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_MAP_ENGINE_2040029.value(), null);
            aj();
            return;
        }
        if (view == this.cv) {
            Intent intent = new Intent();
            intent.setClassName(this.aa, "com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity");
            intent.putExtra("currentFrag", 0);
            intent.putExtra("currentSportType", 0);
            intent.putExtra("enterSportSetting", true);
            startActivity(intent);
            return;
        }
        if (view == this.ak) {
            if (this.aa != null) {
                AppRouter.c("/HWUserProfileMgr/MyTargetActivity").a("from", 6).b(this.aa);
                ujq.e(6, 1);
            }
            lmf.d().c(this.aa, AnalyticsValue.HEALTH_MINE_TARGET_2040004.value(), map, 0);
            return;
        }
        if (view == this.dd) {
            b(map);
            return;
        }
        if (view == this.co) {
            Intent intent2 = new Intent();
            intent2.setClassName(getPackageName(), "com.huawei.health.developer.DeviceTestActivity");
            startActivity(intent2);
        } else {
            if (view == this.ck) {
                SharedPreferenceManager.a(Integer.toString(10000), "service_express_card_red_point", false);
                FaCardAgdsApi faCardAgdsApiB = etv.b();
                if (faCardAgdsApiB == null || this.cb) {
                    return;
                }
                faCardAgdsApiB.faQuickServicesBiEvent(0, 1);
                this.cb = true;
                faCardAgdsApiB.open(100001, "default", new b(this));
                return;
            }
            e(view);
        }
    }

    static class b implements FaCardAgdsApi.OpenAgdsResultCallback {
        private final WeakReference<AppSettingActivity> e;

        b(AppSettingActivity appSettingActivity) {
            this.e = new WeakReference<>(appSettingActivity);
        }

        @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
        public void onResponse(int i) {
            ReleaseLogUtil.c("UIME_AppSettingActivity", "openFaCardAgds errorCode:", Integer.valueOf(i));
            AppSettingActivity appSettingActivity = this.e.get();
            if (appSettingActivity == null || appSettingActivity.isFinishing()) {
                LogUtil.j("UIME_AppSettingActivity", "OpenAgdsResultCallback onResponse activity is finish");
            } else if (i != 0) {
                appSettingActivity.cb = false;
            }
        }
    }

    private void b(Map<String, Object> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.bi > 1000) {
            lmf.d().c(this.aa, AnalyticsValue.HEALTH_MINE_SETTINGS_WECHAT_LEADERBOARD_2040038.value(), map, 0);
            this.dc.a(this.aa);
            this.bi = jCurrentTimeMillis;
        }
    }

    private void c(Map<String, Object> map) {
        if (j() == 2) {
            c(String.format(getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_offline_map_content), getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_show_data_tarck_map_type_setting_google)));
        } else if (j() == 3) {
            c(getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_offline_map_content, getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_petal_maps)));
        } else {
            e(map);
        }
    }

    private void e(Map<String, Object> map) {
        lmf.d().c(this.aa, AnalyticsValue.HEALTH_MINE_SETTINGS_OFFINE_MAP_2040016.value(), map, 0);
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (PermissionUtil.a() || lsg.d(this.aa, strArr) || !v()) {
            startActivity(new Intent(this, (Class<?>) OfflineMapTabActivity.class));
        }
    }

    private void c(String str) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.aa);
        builder.e(getResources().getString(R.string.IDS_hw_offline_map)).a(str).a(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("UIME_AppSettingActivity", "chooseMapDialog is positive view");
            }
        });
        builder.b().show();
    }

    private boolean v() {
        boolean z = CommonUtil.e(this.aa, "android.permission.WRITE_EXTERNAL_STORAGE") || shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE");
        boolean z2 = shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || CommonUtil.e(this.aa, "android.permission.ACCESS_COARSE_LOCATION");
        if (z || z2) {
            return false;
        }
        qrs.e((Context) this, false);
        return true;
    }

    private void i() {
        ThreadPoolManager.c().a("getAllCacheSize", new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.21
            @Override // java.lang.Runnable
            public void run() {
                long jA = wub.a(wub.h(AppSettingActivity.this.aa));
                long jE = wuz.d().e();
                long jC = wub.c();
                long jB = wub.b(AppSettingActivity.this.aa);
                long jA2 = wub.a(AppSettingActivity.this.aa);
                long jD = wub.d(AppSettingActivity.this.aa);
                long jE2 = wub.e(AppSettingActivity.this.aa, "sleepMonitor");
                String strA = qrs.a(AppSettingActivity.this.aa, jA + jE + jC + jB + jA2 + jD + jE2 + wub.e(AppSettingActivity.this.aa));
                SharedPreferenceManager.e(AppSettingActivity.this.aa, Integer.toString(10000), "key_settings_cache_size", strA, null);
                Message messageObtain = Message.obtain();
                messageObtain.what = 106;
                messageObtain.obj = strA;
                if (AppSettingActivity.this.f28374a != null) {
                    AppSettingActivity.this.f28374a.sendMessage(messageObtain);
                }
            }
        });
    }

    private void e(View view) {
        if (view == this.ai) {
            am();
            return;
        }
        if (view == this.cw) {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_OPEN_SOURCE_SOFTWARE_NOTICE_2040068.value(), null);
            startActivity(new Intent(this, (Class<?>) OpensourceNoticeActivity.class));
            return;
        }
        if (view == this.cf) {
            startActivity(new Intent(this, (Class<?>) PluginManagerActivity.class));
            return;
        }
        if (view == this.cc) {
            startActivity(new Intent(this, (Class<?>) PluginSettingActivity.class));
            return;
        }
        if (view == this.ae) {
            al();
        } else {
            if (view == this.i) {
                Intent intent = new Intent(this, (Class<?>) AutoIdentifyRecordActivity.class);
                intent.putExtra("auto_track_launch_source", 1);
                startActivity(intent);
                return;
            }
            LogUtil.j("UIME_AppSettingActivity", "startOtherView to other view");
        }
    }

    private void am() {
        if (this.aa == null) {
            LogUtil.j("UIME_AppSettingActivity", "startDeviceShare mContext is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.huawei.ui.thirdpartservice.activity.DeviceShareActivity");
        intent.putParcelableArrayListExtra(KnitFragment.KEY_EXTRA, this.e);
        this.aa.startActivity(intent);
    }

    private void al() {
        if (this.aa == null) {
            LogUtil.j("UIME_AppSettingActivity", "startDeviceCapacityOpen mContext is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.huawei.ui.main.stories.devicecapacity.DeviceCapacityThirdPartyListActivity");
        intent.setPackage(getPackageName());
        this.aa.startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10) {
            if (iArr == null || iArr.length == 0) {
                LogUtil.j("UIME_AppSettingActivity", "onRequestPermissionsResult grantResults illegal");
                return;
            }
            LogUtil.a("UIME_AppSettingActivity", "onRequestPermissionsResult back");
            if (iArr[0] == 0) {
                LogUtil.d("UIME_AppSettingActivity", "onRequestPermissionsResult get permission succeed");
                startActivity(new Intent(this, (Class<?>) ClearDataCacheActivity.class));
            } else {
                LogUtil.a("UIME_AppSettingActivity", "onRequestPermissionsResult get permission rejected");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isOpenRealTimeStep", this.bf);
        bundle.putBoolean("isOpenCompleteGoal", this.be);
        bundle.putBoolean("isOpenNotification", this.bk);
        Intent intent = new Intent(this, (Class<?>) NotificationMessageSettingActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.show_voice_switch) {
            String string = Integer.toString(20002);
            StorageParams storageParams = new StorageParams(0);
            if (z) {
                SharedPreferenceManager.e(this, string, "voice_enable_type", "1", storageParams);
                return;
            } else {
                SharedPreferenceManager.e(this, string, "voice_enable_type", "0", storageParams);
                return;
            }
        }
        if (compoundButton == this.aq) {
            LogUtil.d("UIME_AppSettingActivity", "mGPSLowConsumptionSwitchStatus = ", Boolean.valueOf(this.bg));
            StorageParams storageParams2 = new StorageParams();
            if (this.bd) {
                if (z && !this.bg) {
                    LogUtil.a("UIME_AppSettingActivity", "mGPSLowConsumptionSwitch isChecked = ", Boolean.valueOf(z));
                    e(storageParams2);
                    return;
                } else {
                    if (z || !this.bg) {
                        return;
                    }
                    c(storageParams2);
                    LogUtil.d("UIME_AppSettingActivity", "mGPSLowConsumptionSwitch isChecked = ", Boolean.valueOf(z));
                    return;
                }
            }
            return;
        }
        if (compoundButton == this.k) {
            this.ao.d(!z);
            d(z);
        } else if (compoundButton == this.cu) {
            if (z) {
                this.cs.setIsShowUserInfo(true);
            } else {
                this.cs.showUserinfoDisableDialog(this.aa, R.string.IDS_share_info_dialog_title, R.string.IDS_share_close_info_tips, new View.OnClickListener() { // from class: vsm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.c(view);
                    }
                }, new View.OnClickListener() { // from class: vsn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.d.d(view);
                    }
                });
            }
        }
    }

    public /* synthetic */ void c(View view) {
        this.cs.setIsShowUserInfo(false);
    }

    public /* synthetic */ void d(View view) {
        this.cu.setChecked(true);
    }

    private void e(final StorageParams storageParams) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.aa).b(R.string.IDS_hw_show_setting_is_allow_gps_low_consumption).a(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppSettingActivity.this.aq.setChecked(false);
            }
        }).c(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                AppSettingActivity appSettingActivity = AppSettingActivity.this;
                appSettingActivity.bg = appSettingActivity.aq.isChecked();
                if (AppSettingActivity.this.bg) {
                    SharedPreferenceManager.e(AppSettingActivity.this.aa, "flp_track_switch", "flp_track_flag", "1", storageParams);
                    LogUtil.a("UIME_AppSettingActivity", "set flp value = 1");
                } else {
                    SharedPreferenceManager.e(AppSettingActivity.this.aa, "flp_track_switch", "flp_track_flag", "0", storageParams);
                    LogUtil.a("UIME_AppSettingActivity", "set flp value = 0");
                }
            }
        });
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void c(final StorageParams storageParams) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.aa).b(R.string.IDS_hw_show_setting_is_disagree_gps_low_consumption).a(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppSettingActivity.this.aq.setChecked(true);
            }
        }).c(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.8
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                AppSettingActivity appSettingActivity = AppSettingActivity.this;
                appSettingActivity.bg = appSettingActivity.aq.isChecked();
                if (AppSettingActivity.this.bg) {
                    LogUtil.a("UIME_AppSettingActivity", "mGPSLowConsumptionSwitchStatus if");
                    SharedPreferenceManager.e(AppSettingActivity.this.aa, "flp_track_switch", "flp_track_flag", "1", storageParams);
                    LogUtil.a("UIME_AppSettingActivity", "set flp value = 1");
                } else {
                    LogUtil.a("UIME_AppSettingActivity", "mGPSLowConsumptionSwitchStatus else");
                    SharedPreferenceManager.e(AppSettingActivity.this.aa, "flp_track_switch", "flp_track_flag", "0", storageParams);
                    LogUtil.a("UIME_AppSettingActivity", "set flp value = 0");
                }
            }
        });
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void d(boolean z) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (!z) {
            map.put("status", "0");
        } else {
            map.put("status", "1");
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_MINE_AUTO_SCAN_DEVICE_2040069.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n();
        if (!this.bm && Utils.h()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.hihealth.action_sync");
            LocalBroadcastManager.getInstance().registerReceiver(this.cd, intentFilter);
            this.bm = true;
        }
        this.cb = false;
        this.bi = 0L;
        if (c()) {
            this.ad.setVisibility(0);
            this.y.setVisibility(0);
        } else {
            this.ad.setVisibility(8);
            this.y.setVisibility(8);
        }
        if (ao() && ucq.b()) {
            this.f28375c.setVisibility(0);
        } else {
            this.f28375c.setVisibility(8);
        }
        f();
        i();
        this.at.sendEmptyMessageDelayed(206, 250L);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LogUtil.a("UIME_AppSettingActivity", "onRestart");
        this.dc.a(this.f28374a);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.ac.d(i, i2);
        ReleaseLogUtil.c("UIME_AppSettingActivity", "onActivityResult requestCode: ", Integer.valueOf(i), ", resultCode: ", Integer.valueOf(i2));
        FaCardAgdsApi faCardAgdsApiB = etv.b();
        if (faCardAgdsApiB == null) {
            ReleaseLogUtil.c("UIME_AppSettingActivity", "onActivityResult openFaCardAgds faCardAgdsApi null:");
        }
        if (faCardAgdsApiB != null && i == 100001) {
            int loadResultCode = faCardAgdsApiB.getLoadResultCode(intent);
            ReleaseLogUtil.c("UIME_AppSettingActivity", "onActivityResult openFaCardAgds loadResultcode:", Integer.valueOf(loadResultCode));
            faCardAgdsApiB.addToDeskTopBi(intent, 1);
            if (loadResultCode == 3) {
                qpx.e(BaseApplication.getContext(), R.string.wallet_unenable_country);
            }
            faCardAgdsApiB.close();
        }
        if (faCardAgdsApiB == null || i != 100) {
            return;
        }
        if (i2 == faCardAgdsApiB.getResultcodeAgreeProtocol()) {
            faCardAgdsApiB.open(100001, "default", new FaCardAgdsApi.OpenAgdsResultCallback() { // from class: vsj
                @Override // com.huawei.health.facardagds.FaCardAgdsApi.OpenAgdsResultCallback
                public final void onResponse(int i3) {
                    ReleaseLogUtil.c("UIME_AppSettingActivity", "onActivityResult openFaCardAgds errorCode:", Integer.valueOf(i3));
                }
            });
        } else if (i2 == faCardAgdsApiB.getResultcodeNotAgreeProtocol()) {
            ReleaseLogUtil.c("UIME_AppSettingActivity", "onActivityResult openFaCardAgds NotAgreeProtocol");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private boolean c() {
        if (LogUtil.e()) {
            return false;
        }
        String strE = SharedPreferenceManager.e(this.aa, "developeroptions", "developerswitch");
        LogUtil.a("UIME_AppSettingActivity", "enableShowDevelopOption developerKey:", strE);
        return strE != null && strE.equals("1");
    }

    private boolean ao() {
        return SharedPreferenceManager.b(Integer.toString(10000), "service_express_card_red_point", true);
    }

    private void aj() {
        LogUtil.a("UIME_AppSettingActivity", "showSettingMapTypeDialog()");
        Context context = this.aa;
        if (context != null) {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.hw_show_map_type_view, (ViewGroup) null);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.aa);
            if (viewInflate == null) {
                LogUtil.j("UIME_AppSettingActivity", "showSettingMapTypeDialog() dialog layout fail");
                return;
            }
            builder.a(getString(R.string.IDS_hw_show_map_type_title)).b(viewInflate, 0, 0).d(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("UIME_AppSettingActivity", "positive settingMapType : ", Integer.valueOf(AppSettingActivity.this.cl));
                    AppSettingActivity appSettingActivity = AppSettingActivity.this;
                    appSettingActivity.b(appSettingActivity.cl);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            NoTitleCustomAlertDialog.Builder builder2 = new NoTitleCustomAlertDialog.Builder(this.aa);
            builder2.a(getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder2.c();
            NoTitleCustomAlertDialog.Builder builder3 = new NoTitleCustomAlertDialog.Builder(this.aa);
            builder3.b(com.huawei.healthcloud.plugintrack.R.string.IDS_hw_hms_install_alert).c(com.huawei.healthcloud.plugintrack.R.string.IDS_hw_hms_install_alert_ok, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            c(viewInflate, customViewDialogD, noTitleCustomAlertDialogC, builder3.c());
            customViewDialogD.show();
            return;
        }
        LogUtil.d("UIME_AppSettingActivity", "showSettingMapTypeDialog() dialog layout fail");
    }

    private void c(View view, CustomViewDialog customViewDialog, NoTitleCustomAlertDialog noTitleCustomAlertDialog, NoTitleCustomAlertDialog noTitleCustomAlertDialog2) {
        this.aj = (RelativeLayout) view.findViewById(R.id.settings_gaode_map_layout);
        this.as = (RelativeLayout) view.findViewById(R.id.settings_google_map_layout);
        this.ay = (RelativeLayout) view.findViewById(R.id.settings_hms_map_layout);
        this.o = (RelativeLayout) view.findViewById(R.id.settings_auto_map_layout);
        this.al = (HealthRadioButton) view.findViewById(R.id.settings_gaode_map_radioButton);
        this.ap = (HealthRadioButton) view.findViewById(R.id.settings_google_map_radioButton);
        this.bc = (HealthRadioButton) view.findViewById(R.id.settings_hms_map_radioButton);
        this.j = (HealthRadioButton) view.findViewById(R.id.settings_auto_map_radioButton);
        HealthDivider healthDivider = (HealthDivider) view.findViewById(R.id.user_info_fragment_image1);
        HealthDivider healthDivider2 = (HealthDivider) view.findViewById(R.id.user_info_fragment_image2);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.settings_gaode_map_text);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.settings_google_map_text);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.settings_huawei_map_text);
        healthTextView.setText(R.string.IDS_hwh_motiontrack_map_type_setting_gaode);
        healthTextView2.setText(R.string.IDS_hwh_motiontrack_map_type_setting_google);
        healthTextView3.setText(R.string.IDS_hw_petal_maps);
        if (!izt.d(this.aa)) {
            healthDivider2.setVisibility(8);
            this.bc.setVisibility(8);
            this.ay.setVisibility(8);
        }
        if (Utils.o()) {
            this.al.setVisibility(8);
            this.aj.setVisibility(8);
            healthDivider.setVisibility(8);
        }
        if (!CommonUtil.bg()) {
            healthDivider2.setVisibility(8);
            this.bc.setVisibility(8);
            view.findViewById(R.id.settings_hms_map_layout).setVisibility(8);
        } else if (!jaa.h()) {
            healthDivider.setVisibility(8);
            this.ap.setVisibility(8);
            this.as.setVisibility(8);
        }
        e(customViewDialog, noTitleCustomAlertDialog, noTitleCustomAlertDialog2);
        this.r = this.cl;
    }

    private void e(final CustomViewDialog customViewDialog, final NoTitleCustomAlertDialog noTitleCustomAlertDialog, final NoTitleCustomAlertDialog noTitleCustomAlertDialog2) {
        this.al.setClickable(false);
        this.ap.setClickable(false);
        this.bc.setClickable(false);
        this.j.setClickable(false);
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppSettingActivity.this.e(1);
                customViewDialog.dismiss();
            }
        });
        this.as.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jaa.b(AppSettingActivity.this.aa)) {
                    AppSettingActivity.this.e(2);
                    customViewDialog.dismiss();
                } else {
                    noTitleCustomAlertDialog.show();
                }
            }
        });
        this.ay.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!izt.c(AppSettingActivity.this.aa) && !CommonUtil.b(AppSettingActivity.this.aa)) {
                    noTitleCustomAlertDialog2.show();
                }
                AppSettingActivity.this.e(3);
                customViewDialog.dismiss();
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppSettingActivity.this.e(0);
                customViewDialog.dismiss();
            }
        });
        aa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.al.setClickable(false);
        this.ap.setClickable(false);
        this.bc.setClickable(false);
        this.j.setClickable(false);
        this.cl = i;
        b(i);
        if (i == 0) {
            this.al.setClickable(false);
            this.ap.setClickable(true);
            this.bc.setClickable(false);
            this.j.setClickable(true);
            return;
        }
        if (i == 1) {
            this.al.setClickable(true);
            this.ap.setClickable(false);
            this.bc.setClickable(false);
            this.j.setClickable(false);
            return;
        }
        if (i == 2) {
            this.al.setClickable(false);
            this.ap.setClickable(true);
            this.bc.setClickable(false);
            this.j.setClickable(false);
            return;
        }
        if (i == 3) {
            this.al.setClickable(false);
            this.ap.setClickable(true);
            this.bc.setClickable(true);
            this.j.setClickable(false);
            return;
        }
        LogUtil.j("UIME_AppSettingActivity", "settingMapType is not support Type ");
    }

    private void aa() {
        if (j() == 2) {
            this.cl = 2;
            this.al.setChecked(false);
            this.ap.setChecked(true);
            this.bc.setChecked(false);
            this.j.setChecked(false);
            return;
        }
        if (j() == 1) {
            this.cl = 1;
            this.al.setChecked(true);
            this.ap.setChecked(false);
            this.bc.setChecked(false);
            this.j.setChecked(false);
            return;
        }
        if (j() == 3) {
            this.cl = 3;
            this.al.setChecked(false);
            this.ap.setChecked(false);
            this.bc.setChecked(true);
            this.j.setChecked(false);
            return;
        }
        this.cl = 0;
        this.al.setChecked(false);
        this.ap.setChecked(false);
        this.bc.setChecked(false);
        this.j.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        StorageParams storageParams = new StorageParams();
        LogUtil.a("UIME_AppSettingActivity", "saveMapType type = ", Integer.valueOf(i));
        SharedPreferenceManager.e(this.aa, Integer.toString(20002), "map_type_setting_key", Integer.toString(i), storageParams);
        int i2 = this.cl;
        if (i2 == 1) {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_SELECT_MAP_2040030.value(), "1");
        } else if (i2 == 2) {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_SELECT_MAP_2040030.value(), "2");
        } else if (i2 == 3) {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_SELECT_MAP_2040030.value(), "3");
        } else {
            this.d.a(AnalyticsValue.HEALTH_MINE_SETTINGS_SELECT_MAP_2040030.value(), "0");
        }
        this.f28374a.sendEmptyMessage(104);
        if (this.r != this.cl) {
            HashMap map = new HashMap(1);
            map.put("result", Integer.valueOf(this.cl));
            lmf.d().c(this.aa, AnalyticsValue.MOTION_TRACK_1040024.value(), map, 0);
        }
    }

    private int j() {
        String strE = SharedPreferenceManager.e(this.aa, Integer.toString(20002), "map_type_setting_key");
        if (!TextUtils.isEmpty(strE)) {
            try {
                return Integer.parseInt(strE);
            } catch (NumberFormatException e2) {
                LogUtil.d("UIME_AppSettingActivity", "getMapType NumberFormatException ", LogAnonymous.b(e2));
            }
        } else {
            b(0);
        }
        return 0;
    }

    static class j implements HiDataOperateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<AppSettingActivity> f28399a;

        j(AppSettingActivity appSettingActivity) {
            this.f28399a = new WeakReference<>(appSettingActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            LogUtil.a("UIME_AppSettingActivity", "onResult invoke");
            AppSettingActivity appSettingActivity = this.f28399a.get();
            if (appSettingActivity == null) {
                LogUtil.j("UIME_AppSettingActivity", "onResult appSettingActivity is null");
                return;
            }
            if (!(obj instanceof List)) {
                LogUtil.a("UIME_AppSettingActivity", "checkWearKit onResult data not list");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("UIME_AppSettingActivity", "checkWearKit onResult tempAppInfoList empty");
                return;
            }
            for (Object obj2 : list) {
                if (obj2 instanceof HiAppInfo) {
                    HiAppInfo hiAppInfo = (HiAppInfo) obj2;
                    if (appSettingActivity.e(BaseApplication.getContext(), hiAppInfo.getPackageName()) && appSettingActivity.e(BaseApplication.getContext(), hiAppInfo)) {
                        appSettingActivity.e.add(hiAppInfo);
                    }
                }
            }
            if (njy.e(appSettingActivity.e)) {
                return;
            }
            LogUtil.a("UIME_AppSettingActivity", "checkWearKit onResult mAppInfoList size = ", Integer.valueOf(appSettingActivity.e.size()));
            Message messageObtainMessage = appSettingActivity.at.obtainMessage();
            messageObtainMessage.what = 105;
            appSettingActivity.at.sendMessage(messageObtainMessage);
        }
    }

    static class c extends BaseHandler<AppSettingActivity> {
        c(AppSettingActivity appSettingActivity) {
            super(appSettingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AppSettingActivity appSettingActivity, Message message) {
            int i = message.what;
            if (i == 101) {
                appSettingActivity.e((Intent) message.obj);
                return;
            }
            if (i != 105) {
                if (i != 206) {
                    return;
                }
                appSettingActivity.at();
            } else {
                if (EnvironmentInfo.m()) {
                    return;
                }
                appSettingActivity.ai.setVisibility(0);
                appSettingActivity.af.setVisibility(0);
            }
        }
    }

    static class d extends BaseHandler<AppSettingActivity> {
        d(AppSettingActivity appSettingActivity) {
            super(appSettingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AppSettingActivity appSettingActivity, Message message) {
            int i = message.what;
            if (i == 103) {
                if (!Utils.m() || appSettingActivity.bk || appSettingActivity.bb) {
                    appSettingActivity.bw.setVisibility(0);
                    return;
                } else {
                    appSettingActivity.bw.setVisibility(8);
                    return;
                }
            }
            if (i == 104) {
                appSettingActivity.av();
                return;
            }
            if (i == 106) {
                if (message.obj instanceof String) {
                    appSettingActivity.ci.setText((String) message.obj);
                    appSettingActivity.p.setText((String) message.obj);
                    return;
                }
                return;
            }
            if (i == 202) {
                appSettingActivity.dc.a();
                Toast.makeText(appSettingActivity.aa, appSettingActivity.aa.getResources().getText(R.string.IDS_confirm_network_whether_connected), 0).show();
            } else {
                if (i != 203) {
                    return;
                }
                appSettingActivity.dc.a();
                Toast.makeText(appSettingActivity.aa, appSettingActivity.aa.getResources().getText(R.string.IDS_update_server_bussy), 0).show();
            }
        }
    }

    class a implements IExecuteResult {
        String e;

        a(String str) {
            this.e = str;
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("UIME_AppSettingActivity", "onSuccess initSDK ", this.e);
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                String str = this.e;
                if (str != null && str.equals("getNotificationSupport") && !AppSettingActivity.this.az) {
                    AppSettingActivity.this.bk = bundle.getBoolean("notificationSupport");
                    LogUtil.a("UIME_AppSettingActivity", "onSuccess isSupportNotification :", Boolean.valueOf(AppSettingActivity.this.bk));
                    AppSettingActivity.this.f28374a.sendEmptyMessage(103);
                }
                String str2 = this.e;
                if (str2 != null && str2.equals("getStepsNotifiState")) {
                    AppSettingActivity.this.bf = bundle.getBoolean("stepsNotifiState");
                    LogUtil.a("UIME_AppSettingActivity", "onSuccess isOpenRealTimeStep :", Boolean.valueOf(AppSettingActivity.this.bf));
                    AppSettingActivity.this.bh = true;
                }
                String str3 = this.e;
                if (str3 != null && str3.equals("getGoalNotifiState")) {
                    AppSettingActivity.this.be = bundle.getBoolean("goalNotifiState");
                    LogUtil.a("UIME_AppSettingActivity", "onSuccess isOpenCompleteGoad :", Boolean.valueOf(AppSettingActivity.this.be));
                    AppSettingActivity.this.ba = true;
                }
                if (AppSettingActivity.this.bh && AppSettingActivity.this.ba) {
                    LogUtil.a("UIME_AppSettingActivity", "onSuccess enterSetNotification");
                    AppSettingActivity.this.b();
                    AppSettingActivity.this.ba = false;
                    AppSettingActivity.this.bh = false;
                }
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.a("UIME_AppSettingActivity", "OpenSdkCommonCallback onFailed ", this.e);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.d("UIME_AppSettingActivity", "OpenSdkCommonCallback onServiceException ", this.e);
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.d("UIME_AppSettingActivity", "onReceive() to enter");
            if (intent == null) {
                LogUtil.j("UIME_AppSettingActivity", "onReceive intent is null");
            } else if ("com.huawei.hihealth.action_sync".equals(intent.getAction())) {
                AppSettingActivity.this.at.sendMessage(AppSettingActivity.this.at.obtainMessage(101, 0, 0, intent));
            }
        }
    }

    private void a(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.AppSettingActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (qrs.e(view2)) {
                    LogUtil.a("UIME_AppSettingActivity", "onClick too fast");
                } else {
                    AppSettingActivity.this.startActivity(new Intent(AppSettingActivity.this, (Class<?>) ClearDataCacheActivity.class));
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

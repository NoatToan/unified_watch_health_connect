package com.huawei.ui.homehealth.runcard;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.ui.view.SportSettingSwitchItem;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.RopeSkippingTargetDialog;
import com.huawei.ui.homehealth.runcard.trackfragments.SportCustomTargetDialog;
import com.huawei.ui.homehealth.runcard.utils.TargetChoicePickerUtils;
import com.huawei.ui.main.stories.ihealthlabs.freeindoorrunning.FreeIndoorRunningActivity;
import com.huawei.ui.main.stories.me.activity.AutoIdentifyRecordActivity;
import com.huawei.ui.main.stories.settings.js.CustomDataService;
import defpackage.buh;
import defpackage.ddv;
import defpackage.dem;
import defpackage.dew;
import defpackage.gdn;
import defpackage.ied;
import defpackage.ien;
import defpackage.ies;
import defpackage.ive;
import defpackage.iyd;
import defpackage.iyg;
import defpackage.jaq;
import defpackage.jbf;
import defpackage.jdi;
import defpackage.jxk;
import defpackage.lmf;
import defpackage.lon;
import defpackage.lsy;
import defpackage.njy;
import defpackage.ppv;
import defpackage.qhp;
import defpackage.qhq;
import defpackage.qrs;
import defpackage.szl;
import defpackage.szr;
import defpackage.tfi;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class SportAssistSettingsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f25781a;
    private boolean aj;
    private RelativeLayout ao;
    private ImageView aw;
    private HealthTextView ay;
    private RelativeLayout az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f25782b;
    private RelativeLayout ba;
    private HealthScrollView bb;
    private HealthDivider bc;
    private LinearLayout bd;
    private HealthDivider be;
    private ImageView bf;
    private HealthDivider bg;
    private ImageView bh;
    private HealthTextView bj;
    private RelativeLayout bk;
    private HealthTextView bl;
    private HealthTextView bm;
    private int bn;
    private HealthTextView bo;
    private ImageView bp;
    private HealthTextView bq;
    private String bu;
    private HealthSwitchButton bw;
    private TrackVoiceSettingsView by;
    private ImageView bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f25783c;
    private HealthTextView ca;
    private HealthTextView e;
    private HealthDivider f;
    private iyd h;
    private Context i;
    private CustomViewDialog l;
    private CustomTitleBar n;
    private String p;
    private String u;
    private RadioGroup v;
    private HealthRadioButton w;
    private LinearLayout x;
    private HealthRadioButton y;
    private int ax = 0;
    private RelativeLayout as = null;
    private RelativeLayout ap = null;
    private RelativeLayout aq = null;
    private HealthTextView av = null;
    private ImageView ac = null;
    private ImageView ae = null;
    private HealthDivider an = null;
    private ImageView aa = null;
    private HealthDivider m = null;
    private HealthDivider ad = null;
    private HealthDivider ah = null;
    private HealthDivider ag = null;
    private HealthDivider z = null;
    private HealthDivider af = null;
    private HealthDivider ai = null;
    private RelativeLayout ak = null;
    private HealthSwitchButton bt = null;
    private Dialog k = null;
    private int g = 1;
    private RelativeLayout at = null;
    private RelativeLayout au = null;
    private ImageView s = null;
    private HealthTextView q = null;
    private HealthDivider r = null;
    private ImageView t = null;
    private LinearLayout ar = null;
    private int bv = -1;
    private float cb = -1.0f;
    private boolean al = false;
    private Activity d = null;
    private boolean am = false;
    private Handler o = new Handler() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.a("Track_SportSettingsFragment", "msg is null");
                return;
            }
            super.handleMessage(message);
            SportAssistSettingsActivity.this.bv = message.arg1;
            if (message.obj instanceof Float) {
                SportAssistSettingsActivity.this.cb = ((Float) message.obj).floatValue();
            }
            SportAssistSettingsActivity sportAssistSettingsActivity = SportAssistSettingsActivity.this;
            sportAssistSettingsActivity.d(sportAssistSettingsActivity.bv, SportAssistSettingsActivity.this.cb, true, true);
            LogUtil.a("Track_SportSettingsFragment", " targetType = ", Integer.valueOf(SportAssistSettingsActivity.this.bv));
        }
    };
    private String br = "";
    private int bi = 0;
    private UiCallback ab = new UiCallback<String>() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.11
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                SportAssistSettingsActivity.this.g = CommonUtil.e(str, 1);
                LogUtil.a("Track_SportSettingsFragment", "get coach gender success, str:", str);
            }
            SportAssistSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.11.4
                @Override // java.lang.Runnable
                public void run() {
                    SportAssistSettingsActivity.this.c(SportAssistSettingsActivity.this.g);
                    if (SportAssistSettingsActivity.this.k != null) {
                        SportAssistSettingsActivity.this.e(SportAssistSettingsActivity.this.g);
                    }
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            int iD = ien.d();
            LogUtil.j("Track_SportSettingsFragment", "failed get coach gender errorInfo: ", str);
            SportAssistSettingsActivity.this.g = iD;
            SportAssistSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.11.1
                @Override // java.lang.Runnable
                public void run() {
                    SportAssistSettingsActivity.this.c(SportAssistSettingsActivity.this.g);
                    if (SportAssistSettingsActivity.this.k != null) {
                        SportAssistSettingsActivity.this.e(SportAssistSettingsActivity.this.g);
                    }
                }
            });
        }
    };
    private UiCallback j = new UiCallback<Boolean>() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.12
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_SportSettingsFragment", "confirmClearCache delUseCache onFailure errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            LogUtil.a("Track_SportSettingsFragment", "delCourseUseCache");
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j("Track_SportSettingsFragment", "confirmClearCache courseApi == null");
            } else {
                courseApi.updateCourseDataState();
                ien.a();
            }
        }
    };
    private UiCallback bs = new UiCallback<Map<String, String>>() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.14
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_SportSettingsFragment", "mSwitchUiCallback onFailure");
            SportAssistSettingsActivity.this.al();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<String, String> map) {
            LogUtil.a("Track_SportSettingsFragment", "mSwitchUiCallback onSuccess");
            if (map == null) {
                LogUtil.j("Track_SportSettingsFragment", "onSuccess data == null ");
                return;
            }
            SportAssistSettingsActivity.this.bu = map.get("sport_remind_switch_status");
            LogUtil.a("Track_SportSettingsFragment", "mSwitchStatus ", SportAssistSettingsActivity.this.bu);
            SportAssistSettingsActivity.this.al();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_SportSettingsFragment", "onCreate");
        setContentView(R.layout.track_sport_settings_frag);
        this.i = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.bn = intent.getIntExtra("currentSportType", 0);
            this.aj = intent.getBooleanExtra("enterSportSetting", false);
            q();
        }
        this.d = this;
        if (ied.c()) {
            this.am = true;
        }
        x();
        szr.e((UiCallback<Map<String, String>>) this.bs);
        as();
        z();
        this.by = new TrackVoiceSettingsView(this.i, this.bn, this.aj, this.d);
        af();
    }

    private void q() {
        if (this.i == null) {
            return;
        }
        ReleaseLogUtil.d("Track_SportSettingsFragment", "initCurrentSportType mSportType ", Integer.valueOf(this.bn));
        HashMap map = new HashMap(2);
        map.put("click", 1);
        int i = this.bn;
        if (i == 264) {
            this.br = getString(R.string.IDS_start_track_sport_type_indoor_run);
            map.put("type", 2);
        } else if (i == 10001) {
            this.br = getString(R.string.IDS_track_sport_type_train);
            map.put("type", 3);
        } else if (i == 282) {
            this.br = getString(R.string.IDS_hwh_sport_type_hiking);
            map.put("type", 7);
        } else if (i != 283) {
            switch (i) {
                case 257:
                    this.br = getString(R.string.IDS_settings_one_level_menu_settings_item_text_id6);
                    map.put("type", 4);
                    break;
                case 258:
                    this.br = getString(R.string.IDS_start_track_sport_type_outdoor_run);
                    map.put("type", 1);
                    break;
                case 259:
                    this.br = getString(R.string.IDS_hwh_start_track_sport_type_cycle);
                    map.put("type", 5);
                    break;
                case 260:
                    this.br = getString(R.string.IDS_motiontrack_climb_hill_tip);
                    map.put("type", 8);
                    break;
                default:
                    this.br = getString(R.string.IDS_start_track_sport_type_outdoor_run);
                    map.put("type", 1);
                    break;
            }
        } else {
            this.br = getString(R.string.IDS_indoor_skipper_rope_sport_type);
        }
        if (this.aj) {
            map.put("type", 6);
        }
        e(map);
    }

    private void ad() {
        this.bj = (HealthTextView) findViewById(R.id.target_explain);
        if (LanguageUtil.o(BaseApplication.getContext())) {
            this.bj.setText(this.i.getString(R.string.IDS_target_recommend, UnitUtil.e(5.2d, 1, 2), UnitUtil.e(11.11d, 1, 2), UnitUtil.e(13.14d, 1, 2)));
            this.bj.setVisibility(0);
            return;
        }
        this.bj.setVisibility(8);
    }

    private void x() {
        this.x = (LinearLayout) findViewById(R.id.hw_show_userinfo_gender_layout);
        this.af = (HealthDivider) findViewById(R.id.img_noun_explain_bottom_line);
        this.ai = (HealthDivider) findViewById(R.id.img_pause_trackline_type_bottom_line);
        this.ar = (LinearLayout) findViewById(R.id.layout_pause_trackline_type_setting);
        this.aw = (ImageView) findViewById(R.id.img_pause_trackline_type_setting);
        if (this.bn != 10001 || this.am) {
            this.x.setVisibility(8);
            this.ai.setVisibility(8);
        } else {
            HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.sport_setting_scroll);
            this.bb = healthScrollView;
            healthScrollView.setOverScrollable(false);
        }
        m();
        this.bm = (HealthTextView) findViewById(R.id.txt_track_sport_type_target);
        this.bq = (HealthTextView) findViewById(R.id.txt_track_sport_target_interval_value);
        this.bo = (HealthTextView) findViewById(R.id.txt_track_sport_target_interval_unit);
        this.bk = (RelativeLayout) findViewById(R.id.layout_track_sport_target_setting);
        ad();
        this.bp = (ImageView) findViewById(R.id.img_track_target_interval_image);
        this.av = (HealthTextView) findViewById(R.id.txt_pause_trackline_type_value);
        this.n = (CustomTitleBar) findViewById(R.id.titlebar_track_sport_setting);
        this.as = (RelativeLayout) findViewById(R.id.layout_track_voice_heart_setting);
        this.ac = (ImageView) findViewById(R.id.img_track_heart_interval_value);
        this.ah = (HealthDivider) findViewById(R.id.img_track_interval_pace_bottom_line);
        this.ag = (HealthDivider) findViewById(R.id.img_track_personal_pace_bottom_line);
        this.z = (HealthDivider) findViewById(R.id.img_auto_pause_bottom_line);
        this.aa = (ImageView) findViewById(R.id.img_track_cycling_interval_value);
        this.aq = (RelativeLayout) findViewById(R.id.layout_track_voice_cycling_setting);
        this.bt = (HealthSwitchButton) findViewById(R.id.switch_track_autopause);
        this.ak = (RelativeLayout) findViewById(R.id.layout_auto_pause);
        u();
        this.at = (RelativeLayout) findViewById(R.id.layout_sport_noun_explain);
        this.bf = (ImageView) findViewById(R.id.img_sport_noun_explain);
        ab();
        l();
        r();
        aa();
        w();
        s();
    }

    private void u() {
        this.au = (RelativeLayout) findViewById(R.id.layout_track_free_indoor);
        this.q = (HealthTextView) this.d.findViewById(R.id.txt_track_free_indoor_minor_value);
        this.s = (ImageView) this.d.findViewById(R.id.free_indoor);
        this.r = (HealthDivider) this.d.findViewById(R.id.layout_track_voice_heart_setting_labs_line);
        this.t = (ImageView) this.d.findViewById(R.id.free_indoor_red_point);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.s.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.s.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.au.setOnClickListener(new View.OnClickListener() { // from class: swk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48767b.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        an();
    }

    private void m() {
        int i = this.bn;
        if (i == 264 || i == 137 || i == 10001 || ah() || this.bn == 283) {
            this.ai.setVisibility(8);
            this.af.setVisibility(8);
            this.ar.setVisibility(8);
            this.aw.setVisibility(8);
            LogUtil.a("Track_SportSettingsFragment", "initLayout mSportType no LayoutPauseTracklineTypeSetting");
        }
        if (this.bn == 10001) {
            this.af.setVisibility(0);
        }
    }

    private void w() {
        this.x.setOnClickListener(this);
        this.ar.setOnClickListener(this);
        this.bk.setOnClickListener(this);
        this.as.setOnClickListener(this);
        this.aq.setOnClickListener(this);
        this.n.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportAssistSettingsActivity.this.finish();
            }
        });
        this.bt.setOnCheckedChangeListener(new AnonymousClass13());
        this.at.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity$13, reason: invalid class name */
    public class AnonymousClass13 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass13() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SportAssistSettingsActivity.this.al = z;
            HashMap map = new HashMap(10);
            if (compoundButton != null) {
                compoundButton.setChecked(SportAssistSettingsActivity.this.al);
            }
            if (SportAssistSettingsActivity.this.bn != 259) {
                jaq.b(BaseApplication.getContext(), SportAssistSettingsActivity.this.al);
            } else {
                jbf jbfVar = new jbf();
                jbfVar.d(SportAssistSettingsActivity.this.al);
                qhq.d("9002", "900200038", ies.c(jbfVar), new HiDataOperateListener() { // from class: sww
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i, Object obj) {
                        this.f48774b.d(i, obj);
                    }
                }, System.currentTimeMillis());
            }
            map.put("click", 1);
            if (SportAssistSettingsActivity.this.al) {
                map.put("type", 4);
            } else {
                map.put("type", 3);
            }
            SportAssistSettingsActivity.this.d(map);
        }

        public /* synthetic */ void d(int i, Object obj) {
            ReleaseLogUtil.d("Track_SportSettingsFragment", "CYCLING_AUTO set ", Boolean.valueOf(SportAssistSettingsActivity.this.al), " result: ", Integer.valueOf(i));
        }
    }

    private void aa() {
        this.bc = (HealthDivider) findViewById(R.id.img_rope_skip_process_top_line);
        this.ao = (RelativeLayout) findViewById(R.id.layout_display_rope_skip_process);
        this.ay = (HealthTextView) findViewById(R.id.rope_skip_process_tips);
        this.bw = (HealthSwitchButton) findViewById(R.id.switch_track_display_rope_skip_process);
        if (this.bn == 283) {
            this.bc.setVisibility(0);
            this.ao.setVisibility(0);
            if (qrs.ah(this.i)) {
                this.ay.setText(R.string.IDS_hw_rope_skip_process_tip_pad);
            } else {
                this.ay.setText(R.string.IDS_hw_rope_skip_process_tip);
            }
            String strE = buh.e("ROPE_DISPLAY_PROCESS");
            if (TextUtils.isEmpty(strE)) {
                this.bw.setChecked(false);
            } else {
                this.bw.setChecked("true".equals(strE));
            }
        } else {
            this.bc.setVisibility(8);
            this.ao.setVisibility(8);
        }
        this.bw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.19
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportAssistSettingsActivity.this.bw.setChecked(z);
                buh.d("ROPE_DISPLAY_PROCESS", String.valueOf(z));
            }
        });
    }

    private void ab() {
        this.bg = (HealthDivider) findViewById(R.id.layout_track_sport_remind_top_divider);
        this.be = (HealthDivider) findViewById(R.id.layout_track_sport_remind_bottom_divider);
        if (ag() || ah()) {
            this.bg.setVisibility(8);
            this.be.setVisibility(0);
        } else if (this.aj) {
            this.bg.setVisibility(8);
            this.be.setVisibility(8);
        } else {
            this.bg.setVisibility(0);
            this.be.setVisibility(8);
        }
        this.bd = (LinearLayout) findViewById(R.id.layout_track_sport_remind);
        this.bl = (HealthTextView) findViewById(R.id.txt_track_sport_remind_value);
        this.bh = (ImageView) findViewById(R.id.img_track_sport_remind_value);
        this.bd.setOnClickListener(this);
    }

    private void l() {
        this.f25781a = (LinearLayout) findViewById(R.id.cl_auto_identify_record);
        this.f = (HealthDivider) findViewById(R.id.layout_track_auto_identify_top_divider);
        this.f25781a.setOnClickListener(this);
        int i = (!szl.a(this.i, ive.c().d(this.i)) || Utils.o()) ? 8 : 0;
        this.f25781a.setVisibility(i);
        this.f.setVisibility(i);
        this.f25783c = (HealthImageView) findViewById(R.id.hiv_red_point);
        this.e = (HealthTextView) findViewById(R.id.tv_auto_identify_record_right_text);
        this.f25782b = (HealthImageView) findViewById(R.id.iv_auto_identify_record_arrow);
    }

    static /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        ReleaseLogUtil.d("Track_SportSettingsFragment", "showRideReserveLinkSwitchView is change:", Boolean.valueOf(z));
        qhp.b("900200033", z);
    }

    private void r() {
        if (ae()) {
            jdi.b(new AnonymousClass16());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity$16, reason: invalid class name */
    public class AnonymousClass16 implements IBaseResponseCallback {
        AnonymousClass16() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Track_SportSettingsFragment", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
            if (SportAssistSettingsActivity.this.isFinishing()) {
                ReleaseLogUtil.d("Track_SportSettingsFragment", "SportAssistSettingsActivity is finishing");
                return;
            }
            if (obj instanceof gdn) {
                final gdn gdnVar = (gdn) obj;
                final boolean zI = RunningRouteUtils.i();
                if (zI) {
                    RunningRouteUtils.j();
                }
                HandlerExecutor.c(new Runnable() { // from class: swy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48776a.b(gdnVar, zI);
                    }
                });
            }
        }

        public /* synthetic */ void b(gdn gdnVar, boolean z) {
            SportAssistSettingsActivity.this.e(gdnVar, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final gdn gdnVar, boolean z) {
        final SportSettingSwitchItem sportSettingSwitchItem = (SportSettingSwitchItem) findViewById(R.id.layout_auto_punch);
        HealthDivider healthDivider = (HealthDivider) findViewById(R.id.layout_track_auto_punch_top_divider);
        sportSettingSwitchItem.setTitleText(R.string.IDS_hw_routes_auto_punch_route);
        sportSettingSwitchItem.setTipsTxt(R.string.IDS_hw_routes_auto_punch_tips);
        sportSettingSwitchItem.setRedPointShow(z);
        sportSettingSwitchItem.setChecked(!"0".equals(gdnVar.c()));
        sportSettingSwitchItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity$$ExternalSyntheticLambda11
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                SportAssistSettingsActivity.b(sportSettingSwitchItem, gdnVar, compoundButton, z2);
            }
        });
        healthDivider.setVisibility(0);
        sportSettingSwitchItem.setVisibility(0);
    }

    static /* synthetic */ void b(SportSettingSwitchItem sportSettingSwitchItem, gdn gdnVar, CompoundButton compoundButton, boolean z) {
        sportSettingSwitchItem.setRedPointShow(false);
        if (TextUtils.isEmpty(gdnVar.a())) {
            gdnVar.d(z);
        }
        gdnVar.b(z);
        jdi.c(gdnVar);
    }

    private boolean ae() {
        if (Utils.o()) {
            return false;
        }
        int i = this.bn;
        return i == 258 || i == 259;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        LogUtil.a("Track_SportSettingsFragment", "readSportRemindValueAndSetValue ", this.bu);
        if (TextUtils.isEmpty(this.bu)) {
            String strE = SharedPreferenceManager.e(this.i, Integer.toString(20002), "sport_remind_is_opened");
            LogUtil.a("Track_SportSettingsFragment", "value ", strE);
            if (!TextUtils.isEmpty(strE)) {
                this.bi = CommonUtils.j(strE);
            }
        } else {
            this.bi = CommonUtils.j(this.bu);
        }
        LogUtil.a("Track_SportSettingsFragment", "mSportRemindValue ", Integer.valueOf(this.bi));
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.20
            @Override // java.lang.Runnable
            public void run() {
                if (SportAssistSettingsActivity.this.bi == 0) {
                    SportAssistSettingsActivity.this.bl.setText(SportAssistSettingsActivity.this.getResources().getString(R.string.IDS_startup_hms_disabled));
                } else {
                    SportAssistSettingsActivity.this.bl.setText(SportAssistSettingsActivity.this.getResources().getString(R.string.IDS_startup_hms_enabled));
                }
            }
        });
    }

    private void z() {
        this.an = (HealthDivider) findViewById(R.id.img_track_voice_bottom_line);
        this.ad = (HealthDivider) findViewById(R.id.layout_track_voice_heart_setting_line);
        this.ap = (RelativeLayout) findViewById(R.id.layout_track_pace_interval);
        this.m = (HealthDivider) findViewById(R.id.layout_track_voice_cycling_line);
        this.ap.setOnClickListener(this);
        this.ae = (ImageView) findViewById(R.id.img_track_pace_interval_value);
    }

    private void af() {
        am();
        int i = this.bn;
        if (i == 258 || i == 264) {
            this.ap.setVisibility(0);
            this.an.setVisibility(0);
            if (!this.aj) {
                SharedPreferenceManager.e(this.i, Integer.toString(20002), "MOTION_PACE_RANGE_SETTING_RED_POINT_CLICK", "true", new StorageParams());
            }
        } else {
            this.ap.setVisibility(8);
            this.an.setVisibility(8);
        }
        if (this.bn == 259 && !Utils.k()) {
            this.m.setVisibility(0);
            this.aa.setVisibility(0);
            this.aq.setVisibility(0);
        } else {
            this.m.setVisibility(8);
            this.aa.setVisibility(8);
            this.aq.setVisibility(8);
        }
        ac();
        if (!LanguageUtil.o(BaseApplication.getContext()) && !this.aj) {
            this.as.setVisibility(8);
            this.an.setVisibility(8);
        }
        if ((this.as.getVisibility() == 0 || this.ap.getVisibility() == 0) && !ag() && !ah()) {
            this.ad.setVisibility(0);
        } else {
            this.ad.setVisibility(8);
        }
        this.ca = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender);
        this.bz = (ImageView) findViewById(R.id.user_info_fragment_set_gender_image);
        if (LanguageUtil.ba(this.i)) {
            this.bz.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
        } else {
            this.bz.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
        }
        if (ag() && !this.aj) {
            buh.d("COACH_GENDER_SETTING_ENTRANCE_RED_POINT_CLICK", "true");
        }
        this.u = getResources().getString(R.string.IDS_hw_show_set_default_gender_male);
        this.p = getResources().getString(R.string.IDS_hw_show_set_default_gender_female);
        t();
    }

    private void am() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.ac.setImageResource(R.drawable.common_ui_arrow_left);
            this.aa.setImageResource(R.drawable.common_ui_arrow_left);
            this.ae.setImageResource(R.drawable.common_ui_arrow_left);
            this.bp.setImageResource(R.drawable.common_ui_arrow_left);
            this.bf.setImageResource(R.drawable.common_ui_arrow_left);
            this.aw.setImageResource(R.drawable.common_ui_arrow_left);
            this.bh.setImageResource(R.drawable.common_ui_arrow_left);
            this.f25782b.setImageResource(R.drawable.common_ui_arrow_left);
            return;
        }
        this.ac.setImageResource(R.drawable.common_ui_arrow_right);
        this.aa.setImageResource(R.drawable.common_ui_arrow_right);
        this.ae.setImageResource(R.drawable.common_ui_arrow_right);
        this.bp.setImageResource(R.drawable.common_ui_arrow_right);
        this.bf.setImageResource(R.drawable.common_ui_arrow_right);
        this.aw.setImageResource(R.drawable.common_ui_arrow_right);
        this.bh.setImageResource(R.drawable.common_ui_arrow_right);
        this.f25782b.setImageResource(R.drawable.common_ui_arrow_right);
    }

    private void t() {
        int i = this.bn;
        boolean z = i == 264 || i == 258;
        LogUtil.a("Track_SportSettingsFragment", "initCourseEndConfigLayout isRunningSportType: ", Boolean.valueOf(z));
        if (z) {
            SportSettingSwitchItem sportSettingSwitchItem = (SportSettingSwitchItem) findViewById(R.id.layout_course_end_config);
            sportSettingSwitchItem.setVisibility(0);
            sportSettingSwitchItem.setTitleText(R.string.IDS_hwh_course_end_ctrl);
            sportSettingSwitchItem.setChecked(i());
            sportSettingSwitchItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    SportAssistSettingsActivity.this.c(z2);
                }
            });
            findViewById(R.id.divide_line_course_end_config).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        dew.c(this.i, z);
    }

    private boolean i() {
        return dew.b(this.i);
    }

    private void ac() {
        this.bv = tfi.e(this.i, this.bn);
        float fD = tfi.d(this.i, this.bn);
        this.cb = fD;
        d(this.bv, fD, false, false);
        y();
        this.bm.setText(String.format(getString(R.string.IDS_hwh_motiontrack_sport_target), this.br));
        if (LanguageUtil.bi(this)) {
            this.bm.setTextSize(1, 9.0f);
            this.bq.setTextSize(1, 9.0f);
            this.bo.setTextSize(1, 9.0f);
        }
        if (ag() || ah() || this.aj) {
            this.bk.setVisibility(8);
            this.bj.setVisibility(8);
            this.ad.setVisibility(8);
            this.ak.setVisibility(8);
            this.ah.setVisibility(8);
        } else if (ai()) {
            this.as.setVisibility(8);
            this.bj.setVisibility(8);
            this.ak.setVisibility(8);
            this.ah.setVisibility(8);
            this.at.setVisibility(8);
        }
        if (this.aj) {
            this.ap.setVisibility(0);
            this.an.setVisibility(0);
            this.at.setVisibility(8);
            this.ar.setVisibility(8);
            this.ai.setVisibility(8);
            this.af.setVisibility(8);
            this.ag.setVisibility(8);
            this.z.setVisibility(8);
            LogUtil.a("Track_SportSettingsFragment", "mIsPersonalEnterActivity enter enter");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.d("Track_SportSettingsFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
        p();
        h();
        as();
        this.by.e();
        String strE = SharedPreferenceManager.e(this.i, Integer.toString(20002), "sport_remind_is_opened");
        this.bu = strE;
        LogUtil.a("Track_SportSettingsFragment", "Activity Result switch= ", strE);
        al();
        if (!SportSupportUtil.b() || this.aj) {
            return;
        }
        if (!this.am) {
            SportSupportUtil.c("custom.UserPreference_coach_gender_Flag", (UiCallback<String>) this.ab);
        }
        iyg.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        int iD = d();
        this.ax = iD;
        if (iD == 0) {
            this.av.setText(R.string.IDS_dotted_line);
        } else {
            this.av.setText(R.string.IDS_no_display);
        }
    }

    public int d() {
        String strE = SharedPreferenceManager.e(this.i, Integer.toString(20002), "pause_trackline_type");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("Track_SportSettingsFragment", "acquirePauseTracklineType NumberFormatException", LogAnonymous.b(e));
            return 0;
        }
    }

    public void a(int i) {
        SharedPreferenceManager.e(this.i, Integer.toString(20002), "pause_trackline_type", String.valueOf(i), new StorageParams());
    }

    private void b(final boolean z) {
        HandlerExecutor.b(new Runnable() { // from class: swq
            @Override // java.lang.Runnable
            public final void run() {
                this.f48771b.d(z);
            }
        });
    }

    public /* synthetic */ void d(boolean z) {
        this.al = z;
        this.bt.setChecked(z);
        this.ak.setVisibility(0);
        this.ah.setVisibility(0);
    }

    private void k() {
        HandlerExecutor.b(new Runnable() { // from class: swl
            @Override // java.lang.Runnable
            public final void run() {
                this.f48768c.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.ak.setVisibility(8);
        this.ah.setVisibility(8);
    }

    private void s() {
        if (this.bn == 259) {
            jxk.a((ResponseCallback<Boolean>) new ResponseCallback() { // from class: sws
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.d.e(i, (Boolean) obj);
                }
            });
            return;
        }
        if (ag() || ah() || this.aj || ai()) {
            k();
        } else if (jaq.b()) {
            b(jaq.c(BaseApplication.getContext()));
        } else {
            k();
        }
    }

    public /* synthetic */ void e(int i, Boolean bool) {
        b(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map map) {
        if (map != null) {
            lmf.d().c(this, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
        } else {
            LogUtil.j("Track_SportSettingsFragment", "map is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(500)) {
            LogUtil.e("Track_SportSettingsFragment", "is click fast");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        b(view);
        if (view.getId() == R.id.layout_track_voice_heart_setting) {
            o();
            map.put("type", 9);
        }
        if (view.getId() == R.id.layout_track_pace_interval) {
            c(map);
        }
        if (view.getId() == R.id.layout_sport_noun_explain) {
            dem.b().d();
            map.put("type", 12);
        }
        if (view.getId() == R.id.layout_pause_trackline_type_setting) {
            LogUtil.a("Track_SportSettingsFragment", "onClick showPauseTracklineTypeSetting()");
            b();
            map.put("type", 18);
        }
        if (view.getId() == R.id.layout_track_sport_target_setting) {
            if (ai()) {
                new RopeSkippingTargetDialog(this).b(283, this.o);
            } else {
                e();
                map.put("type", 14);
            }
        }
        d(map);
    }

    private void b(View view) {
        if (view.getId() == R.id.layout_track_voice_cycling_setting) {
            n();
        }
        if (view.getId() == R.id.hw_show_userinfo_gender_layout) {
            ak();
        }
        if (view.getId() == R.id.layout_track_sport_remind) {
            aj();
        }
        if (view.getId() == R.id.cl_auto_identify_record) {
            j();
        } else {
            LogUtil.j("Track_SportSettingsFragment", "wrong view id");
        }
    }

    private void j() {
        Intent intent = new Intent(this, (Class<?>) AutoIdentifyRecordActivity.class);
        int i = this.bn;
        if (i == 257) {
            intent.putExtra("auto_track_launch_source", 4);
        } else if (i == 258) {
            intent.putExtra("auto_track_launch_source", 2);
        } else if (i == 264) {
            intent.putExtra("auto_track_launch_source", 3);
        } else {
            LogUtil.j("Track_SportSettingsFragment", "enterAutoIdentifyRecordActivity switch default");
        }
        startActivity(intent);
    }

    private void ak() {
        buh.d("COACH_GENDER_SETTING_RED_POINT_CLICK", "true");
        aq();
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.i, AnalyticsValue.HEALTH_FITNESS_GENDER_CLICK_1130039.value(), map, 0);
    }

    private void aj() {
        Intent intent = new Intent(this, (Class<?>) SportRemindSettingsActivity.class);
        intent.putExtra("sport_remind_value", this.bi);
        startActivity(intent);
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.i, AnalyticsValue.REMIND_SPORT_CLICK_SPORT_REMIND_ITEM_COUNT.value(), map, 0);
    }

    private void an() {
        if (qrs.c(500)) {
            LogUtil.e("Track_SportSettingsFragment", "is click fast");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_MINE_FREE_INDOOR_RUNNING_2040073.value(), map, 0);
        startActivity(new Intent(this, (Class<?>) FreeIndoorRunningActivity.class));
        new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002)).e(false);
    }

    private void o() {
        LogUtil.a("Track_SportSettingsFragment", "gotoHeartRateSettingH5");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        H5ProServiceManager.getInstance().registerService(CustomDataService.class);
        ddv.b().loadH5ProApp(this.i, "com.huawei.health.h5.setting", builder);
    }

    private void n() {
        LogUtil.a("Track_SportSettingsFragment", "gotoCyclingRateSettingH5");
        ppv.d().a();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/ftpSetting");
        ddv.b().loadH5ProApp(this.i, "com.huawei.health.h5.setting", builder);
    }

    private void c(Map<String, Object> map) {
        if (map == null) {
            LogUtil.j("Track_SportSettingsFragment", "startPaceRangeShowActivity map null");
            return;
        }
        startActivity(new Intent(this, (Class<?>) PaceRangeShowActivity.class));
        SharedPreferenceManager.e(this.i, Integer.toString(20002), "PACE_RANGE_SETTING_RED_POINT_CLICK", "true", new StorageParams());
        map.put("type", 15);
    }

    private void e(Map map) {
        if (map != null) {
            lmf.d().c(this, AnalyticsValue.MOTION_TRACK_1040066.value(), map, 0);
        } else {
            LogUtil.j("Track_SportSettingsFragment", "map is null");
        }
    }

    private void aq() {
        LogUtil.a("Track_SportSettingsFragment", "showGenderPickerDialog");
        View viewInflate = ((LayoutInflater) this.i.getSystemService("layout_inflater")).inflate(R.layout.dialog_settings_gender_view, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.i);
        builder.a(getString(R.string.IDS_hw_show_set_gender)).d(viewInflate).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_SportSettingsFragment", "CANCELED");
            }
        });
        this.k = builder.d();
        if (!d(viewInflate)) {
            this.k = null;
        } else {
            this.k.show();
        }
    }

    private void f() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_SportSettingsFragment", "confirmClearCache courseApi == null");
        } else {
            courseApi.delCourseUseCache(this.j);
        }
    }

    private boolean d(View view) {
        LogUtil.a("Track_SportSettingsFragment", "initializeGenderDialogLayout()");
        if (view == null) {
            return false;
        }
        this.y = (HealthRadioButton) view.findViewById(R.id.settings_radio_gender_male);
        this.w = (HealthRadioButton) view.findViewById(R.id.settings_radio_gender_female);
        this.ba = (RelativeLayout) view.findViewById(R.id.settings_gender_view_male);
        this.az = (RelativeLayout) view.findViewById(R.id.settings_gender_view_female);
        this.ba.setOnClickListener(new View.OnClickListener() { // from class: swr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f48773a.e(view2);
            }
        });
        this.az.setOnClickListener(new View.OnClickListener() { // from class: swt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.c(view2);
            }
        });
        e(this.g);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.layout_radio_group);
        this.v = radioGroup;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.4
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                SportAssistSettingsActivity.this.g();
                if (i == R.id.settings_radio_gender_male) {
                    if (SportAssistSettingsActivity.this.g != 0) {
                        SportAssistSettingsActivity.this.d(0);
                    }
                } else if (SportAssistSettingsActivity.this.g != 1) {
                    SportAssistSettingsActivity.this.d(1);
                }
            }
        });
        SportSupportUtil.c("custom.UserPreference_coach_gender_Flag", (UiCallback<String>) this.ab);
        return true;
    }

    public /* synthetic */ void e(View view) {
        g();
        if (this.g != 0) {
            d(0);
        }
    }

    public /* synthetic */ void c(View view) {
        g();
        if (this.g != 1) {
            d(1);
        }
    }

    private void b(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("coachGenderType", Integer.valueOf(i));
        lmf.d().c(this.i, AnalyticsValue.HEALTH_FITNESS_GENDER_SELECT_1130040.value(), map, 0);
    }

    private static void a(final String str, final int i) {
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.3
            @Override // java.lang.Runnable
            public void run() {
                HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference(str, String.valueOf(i)), true);
                HiSyncOption hiSyncOption = new HiSyncOption();
                hiSyncOption.setSyncModel(2);
                hiSyncOption.setSyncAction(0);
                hiSyncOption.setSyncDataType(10026);
                hiSyncOption.setSyncScope(1);
                hiSyncOption.setSyncMethod(2);
                HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Dialog dialog = this.k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        e(i);
        buh.d("coachGenderConfig", String.valueOf(i));
        this.g = i;
        a("custom.UserPreference_coach_gender_Flag", i);
        f();
        c(i);
        b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        LogUtil.a("Track_SportSettingsFragment", "refreshGenderImageView");
        if (i == 0) {
            this.y.setChecked(true);
            this.w.setChecked(false);
        } else if (i == 1) {
            this.y.setChecked(false);
            this.w.setChecked(true);
        } else {
            this.y.setChecked(false);
            this.w.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("Track_SportSettingsFragment", "refreshGenderText, genderType:", Integer.valueOf(i));
        if (i == 0) {
            this.ca.setText(this.u);
        } else if (i == 1) {
            this.ca.setText(this.p);
        } else {
            this.ca.setText(this.p);
        }
        this.ca.setTextColor(this.i.getResources().getColor(R.color.emui_color_text_secondary));
    }

    private int b(String str, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int length = strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return length;
    }

    public void b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.pause_trackline_type_setting_dialog, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.pause_trackline_type_picker);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(this.i.getResources().getString(R.string.IDS_dotted_line));
        arrayList.add(this.i.getResources().getString(R.string.IDS_no_display));
        healthNumberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[arrayList.size()]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayList.size() - 1);
        if (d() == 0) {
            int iB = b((String) arrayList.get(0), (String[]) arrayList.toArray(new String[arrayList.size()]));
            LogUtil.a("Track_SportSettingsFragment", "selectIndex healthNumberPicker :", Integer.valueOf(iB));
            healthNumberPicker.setValue(iB);
        } else {
            int iB2 = b((String) arrayList.get(1), (String[]) arrayList.toArray(new String[arrayList.size()]));
            LogUtil.a("Track_SportSettingsFragment", "selectIndex healthNumberPicker else :", Integer.valueOf(iB2));
            healthNumberPicker.setValue(iB2);
        }
        b(viewInflate, healthNumberPicker);
    }

    private void b(View view, final HealthNumberPicker healthNumberPicker) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.a(getString(R.string.IDS_start_track_type)).d(view).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportSettingsFragment", "showPauseTracklineTypeSetting confirm：", Integer.valueOf(healthNumberPicker.getValue()));
                HashMap map = new HashMap(10);
                map.put("click", 1);
                if (healthNumberPicker.getValue() == 0) {
                    SportAssistSettingsActivity.this.ax = 0;
                    map.put("type", 0);
                } else if (healthNumberPicker.getValue() == 1) {
                    SportAssistSettingsActivity.this.ax = 1;
                    map.put("type", 1);
                } else {
                    LogUtil.a("Track_SportSettingsFragment", "showPauseTracklineTypeSetting：", Integer.valueOf(healthNumberPicker.getValue()));
                }
                SportAssistSettingsActivity sportAssistSettingsActivity = SportAssistSettingsActivity.this;
                sportAssistSettingsActivity.a(sportAssistSettingsActivity.ax);
                lmf.d().c(SportAssistSettingsActivity.this.i, AnalyticsValue.PAUSE_LINE_TYPE_CLICK_1130050.value(), map, 0);
                SportAssistSettingsActivity.this.as();
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("Track_SportSettingsFragment", "showPauseTracklineTypeSetting cancel：", Integer.valueOf(healthNumberPicker.getValue()));
                SportAssistSettingsActivity sportAssistSettingsActivity = SportAssistSettingsActivity.this;
                sportAssistSettingsActivity.a(sportAssistSettingsActivity.d());
            }
        });
        builder.d().show();
    }

    public void e() {
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        TargetChoicePickerUtils targetChoicePickerUtils = new TargetChoicePickerUtils(BaseApplication.getContext());
        final List<String> listC = targetChoicePickerUtils.c();
        final Map<String, ArrayList<String>> mapB = targetChoicePickerUtils.b(healthMultiNumberPicker, this.bn);
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        healthMultiNumberPicker.setDisplayedValues(0, (String[]) listC.toArray(new String[listC.size()]), 0);
        int iB = targetChoicePickerUtils.b(this.bv);
        int iB2 = targetChoicePickerUtils.b(this.bv, this.cb);
        if (njy.e(listC, iB)) {
            LogUtil.j("Track_SportSettingsFragment", "showTargetChoiceWheelPickerDialog firstLocation is out of keyList.");
            return;
        }
        ArrayList<String> arrayList = mapB.get(listC.get(iB));
        healthMultiNumberPicker.setDisplayedValues(1, (String[]) arrayList.toArray(new String[arrayList.size()]), 2);
        healthMultiNumberPicker.c(new int[]{iB, iB2}, arrayList.size());
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.6
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker2, int i2, int i3) {
                if (i == 0) {
                    if (i3 >= listC.size() || !mapB.containsKey(listC.get(i3))) {
                        LogUtil.j("Track_SportSettingsFragment", "the sport target is not valid");
                    } else {
                        ArrayList arrayList2 = (ArrayList) mapB.get(listC.get(i3));
                        healthMultiNumberPicker2.setDisplayedValues(1, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 2);
                    }
                }
            }
        });
        a(healthMultiNumberPicker, targetChoicePickerUtils);
    }

    private void a(final HealthMultiNumberPicker healthMultiNumberPicker, final TargetChoicePickerUtils targetChoicePickerUtils) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.i);
        builder.b(R.string.IDS_start_track_target_type).d((View) healthMultiNumberPicker).d(com.huawei.plugindevice.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                SportAssistSettingsActivity.this.bv = targetChoicePickerUtils.c(selectedLocations[0]);
                SportAssistSettingsActivity sportAssistSettingsActivity = SportAssistSettingsActivity.this;
                sportAssistSettingsActivity.cb = targetChoicePickerUtils.b(selectedLocations[1], sportAssistSettingsActivity.bv);
                if (selectedLocations[0] != 0 && selectedLocations[1] == 0) {
                    SportAssistSettingsActivity sportAssistSettingsActivity2 = SportAssistSettingsActivity.this;
                    sportAssistSettingsActivity2.b(sportAssistSettingsActivity2.i, SportAssistSettingsActivity.this.bv);
                    return;
                }
                SportAssistSettingsActivity sportAssistSettingsActivity3 = SportAssistSettingsActivity.this;
                sportAssistSettingsActivity3.d(sportAssistSettingsActivity3.bv, SportAssistSettingsActivity.this.cb, true, false);
                HashMap map = new HashMap(2);
                map.put("click", 1);
                map.put("goalType", Integer.valueOf(SportAssistSettingsActivity.this.bv));
                if (!Utils.o()) {
                    map.put("goalValue", Integer.valueOf((int) SportAssistSettingsActivity.this.cb));
                    map.put(BleConstants.SPORT_TYPE, Integer.valueOf(SportAssistSettingsActivity.this.bn));
                }
                lmf.d().c(SportAssistSettingsActivity.this.i, AnalyticsValue.BI_TRACK_SPORT_GOAL_ACTION_KEY.value(), map, 0);
            }
        }).c(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistSettingsActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.l = customViewDialogD;
        customViewDialogD.show();
    }

    public SportCustomTargetDialog b(Context context, int i) {
        if (context == null) {
            LogUtil.j("Track_SportSettingsFragment", "context is null");
            return null;
        }
        SportCustomTargetDialog.c cVar = new SportCustomTargetDialog.c(context, this.o);
        cVar.e(tfi.a(this.i, this.bn, i));
        SportCustomTargetDialog sportCustomTargetDialogD = cVar.d(i, this.bn);
        if (sportCustomTargetDialogD != null) {
            sportCustomTargetDialogD.show();
        }
        return sportCustomTargetDialogD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    public void d(int i, float f, boolean z, boolean z2) {
        if (i == -1) {
            ao();
        } else if (i != 0) {
            if (i == 1) {
                a(f);
                ar();
            } else if (i == 2) {
                this.bq.setText(UnitUtil.e(f / 1000.0f, 1, 0));
                this.bo.setText(this.i.getResources().getString(R.string.IDS_hw_health_show_calorie_unit));
                this.bo.setVisibility(0);
                ar();
            } else if (i == 5) {
                this.bq.setText(UnitUtil.e(f, 1, 0));
                this.bo.setText(this.i.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit, (int) f));
                this.bo.setVisibility(0);
                ar();
            } else if (i == 6) {
                ao();
            }
        } else if (this.bn == 283) {
            this.bq.setText(UnitUtil.b((int) this.cb));
            this.bo.setVisibility(8);
        } else {
            float f2 = f / 60.0f;
            this.bq.setText(UnitUtil.e(f2, 1, 0));
            this.bo.setText(this.i.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, (int) f2));
            this.bo.setVisibility(0);
            ar();
        }
        c(i, f, z, z2);
    }

    private void c(int i, float f, boolean z, boolean z2) {
        if (z) {
            tfi.b(this.i, this.bn, i);
            tfi.a(this.i, f, this.bn);
            tfi.a(this.i, this.bn, z2);
            if (z2) {
                tfi.b(this.i, this.bn, i, f);
            } else {
                tfi.b(this.i, this.bn, i, -1.0f);
            }
        }
    }

    private void y() {
        if (getApplicationContext() == null) {
            LogUtil.j("Track_SportSettingsFragment", "initLanguageTextSize getApplicationContext is null");
        } else if (LanguageUtil.ax(getApplicationContext()) || LanguageUtil.t(getApplicationContext())) {
            this.bm.setTextSize(1, 12.0f);
        }
    }

    private void ar() {
        this.bo.setVisibility(0);
    }

    private void ao() {
        this.bo.setVisibility(8);
        this.bq.setVisibility(0);
        this.bq.setText(this.i.getResources().getText(R.string.IDS_hwh_motiontrack_set_target));
    }

    private void a(float f) {
        if (UnitUtil.f()) {
            this.bq.setText(UnitUtil.e(UnitUtil.e(f, 3), 1, 2));
            this.bo.setVisibility(0);
            this.bo.setText(this.i.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en));
            return;
        }
        this.bo.setText(this.i.getResources().getString(R.string.IDS_hw_health_show_distance_unit));
        double d = f;
        if (Math.abs(d - 42.195d) < 1.0E-5d) {
            this.bq.setText(UnitUtil.e(d, 1, 3));
        } else if (Math.abs(d - 21.0975d) < 1.0E-5d) {
            this.bq.setText(UnitUtil.e(d, 1, 4));
        } else {
            this.bo.setVisibility(0);
            this.bq.setText(UnitUtil.e(d, 1, 2));
        }
    }

    private boolean ag() {
        int i = this.bn;
        return i == 10001 || i == 137;
    }

    private boolean ai() {
        return this.bn == 283;
    }

    private boolean ah() {
        return this.bn == 286;
    }

    private void p() {
        if (Utils.o()) {
            LogUtil.j("Track_SportSettingsFragment", "initAutoTrackOption the version is oversea");
            this.f25781a.setVisibility(8);
            this.f.setVisibility(8);
            return;
        }
        this.h = ive.c().d(this.i);
        if (e(KeyValDbManager.d(this.i).c("SUPPORT_AR_ABILITY"))) {
            this.f25781a.setVisibility(0);
            this.f.setVisibility(0);
            this.e.setText(this.h.e() ? R.string.IDS_status_enabled : R.string.IDS_status_disabled);
            this.f25783c.setVisibility(this.h.h() ? 0 : 8);
            return;
        }
        this.f25781a.setVisibility(8);
        this.f.setVisibility(8);
    }

    private boolean e(String str) {
        iyd iydVar = this.h;
        if (iydVar == null || !iydVar.d() || !"1".equals(str) || qrs.ah(this.i)) {
            return false;
        }
        int i = this.bn;
        return i == 258 || i == 257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        int i;
        if (!LoginInit.getInstance(this.i).isBrowseMode() && this.bn == 264) {
            this.au.setVisibility(0);
            this.r.setVisibility(0);
            jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
            String strE = SharedPreferenceManager.e(this.i, Integer.toString(20002), "ihealthlabs");
            HealthTextView healthTextView = this.q;
            if ("true".equals(strE)) {
                i = R.string.IDS_startup_hms_enabled;
            } else {
                i = R.string.IDS_startup_hms_disabled;
            }
            healthTextView.setText(i);
            this.t.setVisibility(jaqVar.ab() ? 0 : 8);
            return;
        }
        this.au.setVisibility(8);
        this.r.setVisibility(8);
    }

    private void h() {
        ThreadPoolManager.c().a("Track_SportSettingsFragment", new Runnable() { // from class: swp
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    public /* synthetic */ void a() {
        String strD = lon.c().d("support_sport_lab");
        LogUtil.a("Track_SportSettingsFragment", "SUPPORT_SPORT_LAB: ", strD);
        if (strD == null) {
            strD = "HMA,LYA,EVR,BSA,VOG,DZH,ELE,NLE,AMZ,LIO,TAS,FRO,NEY,ANA,ELS,KUL,RAI,OCE,NOH,NOP,LAN";
        }
        if (!CommonUtil.c(strD.split(",")) || qrs.ah(BaseApplication.getContext())) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: swn
            @Override // java.lang.Runnable
            public final void run() {
                this.d.v();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

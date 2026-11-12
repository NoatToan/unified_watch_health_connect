package com.huawei.featureuserprofile.me;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.me.UserInfoActivity;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwnetworkmodel.NetworkStatusListener;
import com.huawei.hwsmartinteractmgr.util.SmartRulesApi;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionConstant;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.errortip.NetworkErrorTipBar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.ddq;
import defpackage.dmg;
import defpackage.dxw;
import defpackage.imx;
import defpackage.imz;
import defpackage.ino;
import defpackage.iov;
import defpackage.iun;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class UserInfoActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5588a;
    private RelativeLayout aa;
    private int ad;
    private boolean ae;
    private boolean af;
    private boolean ak;
    private CommonDialog21 am;
    private byte[] an;
    private NetworkStatusListener ao;
    private ImageView ar;
    private int as;
    private ImageView at;
    private HealthTextView au;
    private ImageView av;
    private HealthTextView aw;
    private ImageView ax;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Integer> f5589b;
    private ImageView ba;
    private ImageView bc;
    private LinearLayout bd;
    private LinearLayout be;
    private RelativeLayout bf;
    private LinearLayout bh;
    private HealthButton bj;
    private HealthDivider bk;
    private HealthTextView bl;
    private int bm;
    private CustomTitleBar bq;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5590c;
    private Context d;
    private String f;
    private LinearLayout h;
    private String j;
    private float k;
    private ImageView l;
    private String m;
    private Context n;
    private int o;
    private LinearLayout p;
    private int q;
    private RelativeLayout r;
    private String s;
    private String t;
    private String u;
    private ImageView v;
    private HealthTextView w;
    private LinearLayout x;
    private String y;
    private HiUserInfo z;
    private final int e = 13;
    private boolean ab = false;
    private boolean g = false;
    private String bi = "";
    private String bp = "";
    private Handler bb = new d(this);
    private boolean ag = false;
    private boolean ah = false;
    private boolean ai = false;
    private boolean ac = false;
    private boolean al = false;
    private int i = 1;
    private AtomicBoolean aj = new AtomicBoolean(false);
    private a aq = new a(this);
    private e ap = new e(this);
    private List<Integer> bg = null;

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (1 == i) {
            return 0;
        }
        return i;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = this;
        this.d = getApplicationContext();
        this.z = new HiUserInfo();
        this.f5589b = new HashMap();
        setContentView(R.layout.hw_show_userinfo_activity);
        clearBackgroundDrawable();
        this.j = SharedPreferenceManager.e(this.n, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN);
        this.ab = Utils.m();
        this.f5590c = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1004);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent != null) {
            e(intent);
            ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
            if (contentValues != null) {
                LogUtil.d("UIME_UserInfoActivity", "UserInfoActivity onCreate deviceInfo:", contentValues);
                this.bi = contentValues.getAsString("productId");
                this.bp = contentValues.getAsString("uniqueId");
            } else {
                LogUtil.j("UIME_UserInfoActivity", "has not pass device info ");
            }
            if (TextUtils.isEmpty(this.bp) || TextUtils.isEmpty(this.bi)) {
                LogUtil.j("UIME_UserInfoActivity", "device uniqueId or productId is null");
            }
            booleanExtra = intent.getBooleanExtra("show_gender_window", false);
        }
        s();
        k();
        t();
        d();
        a(booleanExtra);
        ak();
    }

    private void e(Intent intent) {
        this.ag = intent.getBooleanExtra("hasManager", false);
        this.ak = intent.getBooleanExtra("bundleKeyJumpUserInfoActivity", false);
        this.ah = intent.hasExtra("hasManager");
        this.i = intent.getIntExtra("config_mode", 5);
        this.m = intent.getStringExtra("deviceSsid");
        this.k = intent.getFloatExtra("deviceWeight", -1.0f);
        this.an = intent.getByteArrayExtra("mainHuid");
        this.f = intent.getStringExtra("cloudDeviceId");
        boolean booleanExtra = intent.getBooleanExtra("isNfcConnect", false);
        this.ae = booleanExtra;
        LogUtil.a("UIME_UserInfoActivity", "onCreate getBoolean mIsNfcCommect = ", Boolean.valueOf(booleanExtra));
        if (intent.getBooleanExtra("isBleScale", false)) {
            this.g = true;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            String stringExtra = intent.getStringExtra("device");
            if (stringExtra != null && stringExtra.equals("wifi")) {
                this.g = true;
            }
            if (intent.hasExtra("auth_device_id")) {
                String stringExtra2 = intent.getStringExtra("auth_device_id");
                if (!TextUtils.isEmpty(stringExtra2)) {
                    this.f5588a = stringExtra2;
                }
            }
        }
        this.bi = intent.getStringExtra("productId");
    }

    private void a(boolean z) {
        LogUtil.a("UIME_UserInfoActivity", "isShowGenderWindow=", Boolean.valueOf(z));
        if (z) {
            this.al = true;
            ai();
        }
    }

    private void d() {
        this.r.setVisibility(0);
    }

    private void s() {
        this.bq = (CustomTitleBar) findViewById(R.id.me_userInfo_titlebar);
        p();
        n();
        m();
        this.w = (HealthTextView) findViewById(R.id.user_info_fragment_set_gender);
        this.bk = (HealthDivider) findViewById(R.id.divide_line_before_interest);
        this.ar = (ImageView) findViewById(R.id.user_info_go_next_img);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_show_settings_info_layout);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, linearLayout);
        this.v.setOnClickListener(this);
        u();
        q();
        r();
        ac();
        this.t = getResources().getString(R.string.IDS_hw_show_set_default_gender_male);
        this.s = getResources().getString(R.string.IDS_hw_show_set_default_gender_female);
        this.u = getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        this.y = getResources().getString(R.string.IDS_hw_me_userinfo_secret);
        String strE = SharedPreferenceManager.e(this.n, Integer.toString(10000), "onboarding_skip_current_time");
        String strE2 = SharedPreferenceManager.e(this.n, Integer.toString(10000), "onboarding_skip");
        if (!TextUtils.isEmpty(strE) && !"1".equals(strE2)) {
            LogUtil.a("UIME_UserInfoActivity", "dot dismiss");
            SharedPreferenceManager.e(this.n, Integer.toString(10000), "rid_dot_dismiss", Integer.toString(1), new StorageParams());
        }
        this.bq.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserInfoActivity.this.b();
            }
        });
    }

    private void q() {
        this.bq.setRightButtonVisibility(0);
        this.bq.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.bq.setRightButtonClickable(true);
        this.bq.setRightButtonOnClickListener(new View.OnClickListener() { // from class: cwl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31442b.e(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(qre.f(R.string.IDS_fitness_core_sleep_explain_title));
        new PopViewList(this.n, view, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.9
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                UserInfoActivity.this.startActivity(new Intent(UserInfoActivity.this, (Class<?>) UserInfoExplainActivity.class).putExtra("key_jump_from", 0));
            }
        });
    }

    private void r() {
        if (this.g) {
            this.bl = (HealthTextView) findViewById(R.id.user_info_fragment_wifi_tip);
            this.bd = (LinearLayout) findViewById(R.id.user_info_complete_layout);
            HealthButton healthButton = (HealthButton) findViewById(R.id.user_info_complete_btn);
            this.bj = healthButton;
            healthButton.setOnClickListener(this);
            this.bl.setVisibility(0);
            this.bk.setVisibility(8);
            this.bq.setTitleText(getString(R.string.IDS_device_hygride_consum_improve_userinfo));
            this.bf = (RelativeLayout) findViewById(R.id.user_info_complete_guide_layout);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.user_info_go_next_layout);
            this.be = linearLayout;
            linearLayout.setOnClickListener(this);
            aa();
        }
    }

    private void ac() {
        if (LanguageUtil.ba(this.n)) {
            this.av.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.ba.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.bc.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.at.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.ax.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.l.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.ar.setBackgroundResource(R.drawable.ic_arrows_left_black);
        } else {
            this.av.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.ba.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.bc.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.at.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.ax.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.l.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.ar.setBackgroundResource(R.drawable.ic_arrows_right_black);
        }
        if (LanguageUtil.c(this.n.getApplicationContext())) {
            this.w.setWidth(qrs.d(this.n.getApplicationContext(), 60.0f));
            this.w.setGravity(GravityCompat.START);
        }
    }

    private void m() {
        this.av = (ImageView) findViewById(R.id.user_info_fragment_set_gender_image);
        this.ba = (ImageView) findViewById(R.id.user_info_fragment_set_height_image);
        this.bc = (ImageView) findViewById(R.id.user_info_fragment_set_weight_image);
        this.at = (ImageView) findViewById(R.id.user_info_fragment_set_birthday_image);
        this.ax = (ImageView) findViewById(R.id.user_info_fragment_set_interest_image);
        this.l = (ImageView) findViewById(R.id.user_info_fragment_set_sos_image);
        this.v = (ImageView) findViewById(R.id.hw_health_gender_not_set_prompt);
    }

    private void n() {
        this.au = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender);
        this.ay = (HealthTextView) findViewById(R.id.hw_show_userinfo_height);
        this.az = (HealthTextView) findViewById(R.id.hw_show_userinfo_weight);
        this.aw = (HealthTextView) findViewById(R.id.hw_show_userinfo_birthday);
    }

    private void p() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_show_userinfo_gender_layout);
        this.p = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.hw_show_userinfo_height_layout);
        this.x = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.hw_show_userinfo_weight_layout);
        this.bh = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.hw_show_userinfo_birthday_layout);
        this.h = linearLayout4;
        linearLayout4.setOnClickListener(this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.hw_show_userinfo_interest_layout);
        this.aa = relativeLayout;
        relativeLayout.setOnClickListener(this);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.hw_show_userinfo_sos_layout);
        this.r = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.aj.compareAndSet(false, true)) {
            ag();
            HiHealthManager.d(this.d).fetchUserData(new c(this));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.ai) {
            if (!this.al) {
                this.ac = true;
                this.ai = false;
            }
            if (imz.a()) {
                ThirdPartyLoginManager.getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: cwi
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f31440a.c(i, obj);
                    }
                }, false);
                imz.b("UserInfoActivity");
            } else {
                ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).sync(new CommonCallback() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.6
                    @Override // com.huawei.up.callback.CommonCallback
                    public void onSuccess(Bundle bundle) {
                        LogUtil.a("UIME_UserInfoActivity", "hw sync userinfo success");
                        if (UserInfoActivity.this.bb != null) {
                            UserInfoActivity.this.bb.sendEmptyMessage(106);
                        }
                    }

                    @Override // com.huawei.up.callback.CommonCallback
                    public void onFail(int i) {
                        LogUtil.a("UIME_UserInfoActivity", "hw sync userinfo fail:", Integer.valueOf(i));
                    }
                });
            }
        }
    }

    public /* synthetic */ void c(int i, Object obj) {
        Handler handler = this.bb;
        if (handler != null) {
            if (i != 0) {
                handler.sendEmptyMessage(108);
            } else {
                handler.sendEmptyMessage(106);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.ab || this.g || !imz.e() || CommonUtil.ca()) {
            this.aa.setVisibility(8);
        } else {
            this.aa.setVisibility(0);
        }
    }

    private void t() {
        this.ao = new NetworkStatusListener(BaseApplication.getContext()) { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.10
            @Override // com.huawei.hwnetworkmodel.NetworkStatusListener
            public void onConnected() {
                LogUtil.a("UIME_UserInfoActivity", "network connected!");
                UserInfoActivity.this.k();
                UserInfoActivity.this.d(true);
                UserInfoActivity.this.u();
            }

            @Override // com.huawei.hwnetworkmodel.NetworkStatusListener
            public void onDisconnected() {
                LogUtil.j("R_PersonalInfo_UIME_UserInfoActivity", "network disconnected!");
                UserInfoActivity.this.d(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        LogUtil.a("UIME_UserInfoActivity", "update network status:", Boolean.valueOf(z));
        NetworkErrorTipBar networkErrorTipBar = (NetworkErrorTipBar) findViewById(R.id.network_error_bar);
        if (z) {
            networkErrorTipBar.setVisibility(8);
        } else if (imz.b()) {
            networkErrorTipBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, boolean z) {
        if (!z) {
            Handler handler = this.bb;
            if (handler == null) {
                LogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "Handler is null");
                c();
                return;
            } else {
                handler.sendEmptyMessage(102);
                return;
            }
        }
        if (obj != null) {
            List list = (List) obj;
            if (list.size() > 0) {
                LogUtil.a("UIME_UserInfoActivity", "fetchUserData onSuccess");
                if (list.get(0) != null) {
                    int gender = this.z.getGender();
                    this.z = (HiUserInfo) list.get(0);
                    int gender2 = ((HiUserInfo) list.get(0)).getGender();
                    LogUtil.d("UIME_UserInfoActivity", "mGenderStart", Integer.valueOf(gender), "mGenderRefresh", Integer.valueOf(gender2));
                    if (gender != 2 && gender2 == 2) {
                        this.bb.sendEmptyMessage(107);
                    }
                }
                LogUtil.d("UIME_UserInfoActivity", "height==", Integer.valueOf(this.z.getHeight()), "weight==", Float.valueOf(this.z.getWeight()));
                LogUtil.d("UIME_UserInfoActivity", "birthday==", Integer.valueOf(this.z.getBirthday()), "gender==", Integer.valueOf(this.z.getGender()));
                this.f5589b.put(CommonConstant.KEY_GENDER, Integer.valueOf(this.z.getGender()));
                this.f5589b.put("birthday", Integer.valueOf(this.z.getBirthday()));
                this.f5589b.put("height", Integer.valueOf(this.z.getHeight()));
                Handler handler2 = this.bb;
                if (handler2 == null) {
                    LogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "Handler is null");
                    c();
                } else {
                    handler2.sendEmptyMessage(102);
                }
            }
        }
    }

    private void aj() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.8
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Intent intent = new Intent();
                if (!((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider()) {
                    AppRouter.c("/HWUserProfileMgr/EditInfoActivity").b(UserInfoActivity.this.n);
                    return;
                }
                try {
                    intent.setClassName(FallDetectionConstant.PACKAGE_NAME, FallDetectionConstant.CLASS_NAME);
                    iov.d(UserInfoActivity.this.n, intent);
                    EmergencyInfoManager.a().c(true);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("UIME_UserInfoActivity", "Emui110 activityNotFoundException SOS");
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (imz.b()) {
            imx.a(this.d);
            return;
        }
        if (qrs.e(view)) {
            LogUtil.a("UIME_UserInfoActivity", "userinfo click too fast");
            return;
        }
        c(view);
        if (this.g) {
            if (view == this.bj || view == this.be) {
                dmg.a().setHeightIsNotSet(false);
                if (!a()) {
                    Context context = this.n;
                    qpx.e(context, context.getResources().getString(R.string.IDS_hw_show_complete_privacy_wifi_tip));
                } else {
                    dmg.a().deliveringUserInformation(this.bi, this.bp, this.z);
                    g();
                }
            }
        }
    }

    private void c(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (view == this.p) {
            ai();
        }
        if (view == this.x) {
            UserInfomation userInfomation = new UserInfomation(0);
            userInfomation.loadAccountExtData(this.z);
            imx.c(this, userInfomation, this.aq);
        }
        if (view == this.bh) {
            iun.c(this);
        }
        if (view == this.h) {
            ab();
        }
        if (view == this.aa) {
            AppRouter.c("/HWUserProfileMgr/InterestAndConcernActivity").b(this.n);
        }
        if (view == this.r) {
            SharedPreferenceManager.c("privacy_center", "emergency", String.valueOf(jCurrentTimeMillis));
            aj();
        }
        if (view == this.v) {
            af();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("UIME_UserInfoActivity", "requestCode: ", Integer.valueOf(i), "resultCode: ", Integer.valueOf(i2));
        if (i == 1213 && i2 == 1214 && intent != null) {
            double doubleExtra = intent.getDoubleExtra("weight_data", 0.0d);
            LogUtil.a("UIME_UserInfoActivity", "onActivityResult weight data: ", Double.valueOf(doubleExtra));
            UserInfomation userInfomation = new UserInfomation(0);
            userInfomation.loadAccountExtData(this.z);
            userInfomation.setWeight((float) doubleExtra);
            this.aq.d(1, this, userInfomation);
        }
    }

    private void ai() {
        if (!imz.c()) {
            if (imz.a()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(this, null);
            } else {
                imx.a((Activity) this);
            }
            this.ai = true;
            return;
        }
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.loadAccountData(this.z);
        imx.d(this, 20, userInfomation, this.aq);
    }

    private void ab() {
        if (!imz.c()) {
            if (imz.a()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(this, null);
            } else {
                imx.a((Activity) this);
            }
            this.ai = true;
            return;
        }
        new UserInfomation(0).loadAccountExtData(this.z);
        imx.e(this, this.bm, this.as, this.o, this.aq);
    }

    private void aa() {
        if (dmg.a().isMiniScaleDevice(this.bi)) {
            b(true);
            return;
        }
        if (this.ah) {
            boolean resetWifi = dmg.a().getResetWifi();
            LogUtil.a("UIME_UserInfoActivity", "showBottomButtonView: mIsHasManager = ", Boolean.valueOf(this.ag), "isResetWifi = ", Boolean.valueOf(resetWifi));
            if (this.ag && !resetWifi) {
                b(true);
                return;
            } else {
                b(false);
                return;
            }
        }
        b(true);
    }

    private void b(boolean z) {
        if (z) {
            this.bd.setVisibility(0);
            this.bf.setVisibility(8);
        } else {
            this.bd.setVisibility(8);
            this.bf.setVisibility(0);
        }
    }

    private void g() {
        if (dmg.a().isMiniScaleDevice(this.bi)) {
            j();
        }
        if (TextUtils.isEmpty(this.f5588a) && !"7a1063dd-0e0f-4a72-9939-461476ff0259".equals(this.bi)) {
            finish();
        } else if (this.ah) {
            o();
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putString("view", "deviceManage");
        bundle.putString("productId", this.bi);
        bundle.putString("deviceSsid", this.m);
        bundle.putBoolean("isNfcConnect", this.ae);
        bundle.putInt("config_mode", 5);
        LogUtil.a("UIME_UserInfoActivity", "gotoDeviceManagePage put isNfcConnect is ", Boolean.valueOf(this.ae));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.bp);
        contentValues.put("productId", this.bi);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        z();
        dmg.a().uploadDeviceToCloud(this.bi, this.bp);
        AppRouter.c("/PluginDevice/DeviceMainActivity").d(bundle).b(this.n);
        finish();
    }

    private void l() {
        LogUtil.a("UIME_UserInfoActivity", "gotoHagridDeviceWlanUseGuideFragment");
        e("true");
        Bundle bundle = new Bundle();
        bundle.putString("view", "hagridDeviceWlanUseGuide");
        bundle.putString("productId", this.bi);
        bundle.putString("cloudDeviceId", this.f);
        bundle.putByteArray("mainHuid", this.an);
        bundle.putBoolean("isNfcConnect", this.ae);
        LogUtil.a("UIME_UserInfoActivity", "gotoHagridDeviceWlanUseGuideFragment put isNfcConnect is", Boolean.valueOf(this.ae));
        bundle.putInt(ParamConstants.Param.VIEW_TYPE, 12);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.bp);
        contentValues.put("productId", this.bi);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        AppRouter.c("/PluginDevice/DeviceMainActivity").d(bundle).b(this.n);
        finish();
    }

    private void e(String str) {
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), "request_sync_data_dialog", str, new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        e(this.af);
        if (!TextUtils.isEmpty(this.f5588a) || this.g || dmg.a().isMiniScaleDevice(this.bi)) {
            ae();
        } else if (x() && y()) {
            am();
        } else {
            finish();
        }
    }

    public void e() {
        w();
        LogUtil.a("UIME_UserInfoActivity", "getUserInfoError()");
        d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        imz.b("UserInfoActivity");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, int i2, int i3) {
        if (a(i, i2, i3)) {
            qpx.b(this.n.getApplicationContext(), this.n.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_now));
            return false;
        }
        if (!CommonUtil.ca() && Utils.h() && !"1".equals(this.j)) {
            if (imz.b()) {
                imx.a(this.n);
                return false;
            }
            if ("1".equals(this.f5590c)) {
                LogUtil.a("R_PersonalInfo_UIME_UserInfoActivity", "child account");
                if (!d(i + 13, i2, i3)) {
                    qpx.b(this.n.getApplicationContext(), this.n.getResources().getString(R.string.IDS_hw_show_chosen_birthday_exceeds_kid_range, 13));
                    return false;
                }
            } else {
                LogUtil.a("R_PersonalInfo_UIME_UserInfoActivity", "not child account");
                if (d(i + 18, i2, i3 + 1)) {
                    qpx.b(this.n.getApplicationContext(), this.n.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_eighteen));
                    return false;
                }
            }
        } else if (d(i + 13, i2, i3)) {
            qpx.b(this.n.getApplicationContext(), this.n.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_eighteen));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, int i3) {
        this.bm = i;
        this.as = i2;
        this.o = i3;
        d(c(this.bm + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.as + 1)) + String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.o))), 3);
        h();
    }

    private boolean a(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        if (i > i4) {
            return true;
        }
        if (i != i4 || i2 <= i5) {
            return i == i4 && i2 == i5 && i3 > i6;
        }
        return true;
    }

    private boolean d(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = calendar.get(2);
        int i6 = calendar.get(5);
        if (i < i4) {
            return false;
        }
        if (i != i4 || i2 >= i5) {
            return (i == i4 && i2 == i5 && i3 <= i6) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, long j) {
        Handler handler = this.bb;
        if (handler == null) {
            ReleaseLogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "sendEmptyDelayedMessage mUserInfoHandler is null");
        } else {
            handler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final double d2, final int i) {
        ino.b(i, this.n, new IBaseResponseCallback() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                UserInfoActivity.this.ag();
                UserInfoActivity.this.d(105, 5000L);
                int iRint = (int) Math.rint(d2);
                UserInfomation userInfomation = new UserInfomation(0);
                int i3 = i;
                if (i3 == 1) {
                    userInfomation.setWeight((float) d2);
                    UserInfoActivity.this.z.setWeight((float) d2);
                    UserInfoActivity.this.d(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "2");
                } else if (i3 == 0) {
                    UserInfoActivity.this.af = true;
                    userInfomation.setHeight(iRint);
                    UserInfoActivity.this.z.setHeight(iRint);
                    UserInfoActivity.this.d(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "1");
                    dmg.a().setUserWeight(iRint);
                } else if (i3 == 2) {
                    userInfomation.setGender(Integer.valueOf(UserInfoActivity.this.c(iRint)));
                    UserInfoActivity.this.a(iRint);
                } else if (i3 == 3) {
                    userInfomation.setBirthday(String.valueOf(iRint));
                    UserInfoActivity.this.z.setBirthday(iRint);
                    UserInfoActivity.this.z.setAge((HiDateUtil.d(System.currentTimeMillis()) / 10000) - (iRint / 10000));
                    UserInfoActivity.this.d(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "4");
                } else {
                    LogUtil.a("UIME_UserInfoActivity", "saveValue");
                }
                UserInfoActivity.this.z.setCreateTime(System.currentTimeMillis());
                ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setUserInfo(userInfomation, UserInfoActivity.this.ap);
                ((SmartRulesApi) Services.d("HWSmartInteractMgr", SmartRulesApi.class)).deleteSmartMsgByType(60000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        dmg.a().setUserGender(i, this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == 0) {
            this.au.setText(this.s);
            this.v.setVisibility(8);
        } else if (i == 1) {
            this.au.setText(this.t);
            this.v.setVisibility(8);
        } else if (i == 2) {
            this.au.setText(this.y);
            this.v.setVisibility(8);
        } else {
            this.au.setText(this.u);
            this.v.setVisibility(0);
        }
        this.au.setTextColor(this.n.getResources().getColor(R.color.textColorSecondary));
    }

    private void d(int i) {
        if (i <= 0) {
            this.aw.setText(this.u);
            this.bm = 1992;
            this.as = 0;
            this.o = 1;
            return;
        }
        this.bm = i / 10000;
        this.as = ((i % 10000) / 100) - 1;
        this.o = i % 100;
        h();
    }

    private void h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.bm, this.as, this.o);
        this.aw.setText(UnitUtil.a(calendar.getTime(), 20));
    }

    private int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "NumberFormatException");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        LogUtil.a("UIME_UserInfoActivity", "refreshView()");
        this.au.setVisibility(0);
        this.ay.setVisibility(0);
        this.az.setVisibility(0);
        this.aw.setVisibility(0);
        LogUtil.d("UIME_UserInfoActivity", "height=", Integer.valueOf(this.z.getHeight()), " weight=", Float.valueOf(this.z.getWeight()));
        LogUtil.d("UIME_UserInfoActivity", "unitFlag=", Integer.valueOf(this.z.getUnitType()));
        b(this.z.getGender());
        d(this.z.getBirthday());
        v();
        ad();
        c();
    }

    private void v() {
        this.ay.setText(imx.d(this.d, this.z.getHeight()));
    }

    private void ad() {
        float weight = this.z.getWeight();
        float f = this.k;
        if (f > 0.0f) {
            d(f, 1);
            weight = f;
        }
        if (this.ak) {
            String string = getResources().getString(com.huawei.health.servicesui.R.string.IDS_hw_me_userinfo_not_set);
            if (weight > 0.0f) {
                int iE = UnitUtil.e();
                if (iE == 3) {
                    LogUtil.a("UIME_UserInfoActivity", "enter UNIT_IMPERIAL");
                    string = getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(UnitUtil.h(weight), 1, 1));
                } else if (iE != 1) {
                    LogUtil.a("UIME_UserInfoActivity", "enter UNIT_CM_KG");
                    string = getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(CommonUtil.a(String.valueOf(weight)), 1, 1));
                } else {
                    string = getResources().getQuantityString(R.plurals.IDS_health_catty, 1, UnitUtil.e(UnitUtil.j(weight), 1, 1));
                }
            }
            this.az.setText(string);
            return;
        }
        this.az.setText(imx.e(this.d, weight));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
        Handler handler = this.bb;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.bb = null;
        }
        NetworkStatusListener networkStatusListener = this.ao;
        if (networkStatusListener != null) {
            networkStatusListener.unregister(BaseApplication.getContext());
            this.ao = null;
        }
        an();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.n, str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        CommonDialog21 commonDialog21;
        if (this.am == null) {
            LogUtil.a("UIME_UserInfoActivity", "is domestic app");
            new CommonDialog21(this.n, R.style.app_update_dialogActivity);
            this.am = CommonDialog21.b(this.n);
        }
        if (isFinishing() || (commonDialog21 = this.am) == null) {
            return;
        }
        commonDialog21.b(this.n.getString(R.string.IDS_sns_waiting));
        this.am.setCancelable(true);
        this.am.show();
        LogUtil.a("UIME_UserInfoActivity", "showLoadingDialog...mLoadingDialog.show()");
    }

    public void c() {
        if (this.am == null || isFinishing() || !this.am.isShowing()) {
            return;
        }
        this.am.dismiss();
        this.am = null;
        LogUtil.a("UIME_UserInfoActivity", "destroy mLoadingDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.n);
        builder.e(this.n.getString(R.string.IDS_hw_health_show_common_dialog_title)).a(this.n.getString(R.string.IDS_hwh_home_gender_change_remind_content)).b(this.n.getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.b().show();
    }

    private void am() {
        LogUtil.a("UIME_UserInfoActivity", "showModifyConfirmDialog() enter");
        View viewInflate = View.inflate(this, R.layout.dialog_confirm_user_info, null);
        ((HealthCheckBox) viewInflate.findViewById(R.id.confirm_userinfo_dialog_box)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.12
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.a("UIME_UserInfoActivity", "modifyConfirmDialog onClick not remind");
                StorageParams storageParams = new StorageParams();
                if (z) {
                    SharedPreferenceManager.e(UserInfoActivity.this.n, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", "false", storageParams);
                } else {
                    SharedPreferenceManager.e(UserInfoActivity.this.n, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", "true", storageParams);
                }
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.n);
        builder.d(viewInflate).c(this.n.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserInfoActivity userInfoActivity = UserInfoActivity.this;
                userInfoActivity.d(((Integer) userInfoActivity.f5589b.get(CommonConstant.KEY_GENDER)).intValue(), 2);
                UserInfoActivity userInfoActivity2 = UserInfoActivity.this;
                userInfoActivity2.d(((Integer) userInfoActivity2.f5589b.get("birthday")).intValue(), 3);
                UserInfoActivity userInfoActivity3 = UserInfoActivity.this;
                userInfoActivity3.d(((Integer) userInfoActivity3.f5589b.get("height")).intValue(), 0);
                UserInfoActivity.this.finish();
            }
        }).a(this.n.getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UserInfoActivity.this.finish();
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        customViewDialogD.show();
    }

    private boolean x() {
        ArrayList<String> bondedWiFiDevices = dmg.a().getBondedWiFiDevices();
        boolean z = (bondedWiFiDevices == null || bondedWiFiDevices.size() == 0) ? false : true;
        if (dmg.a().isBondHuaweiBleScaleDevice()) {
            z = true;
        }
        return z && !"false".equals(SharedPreferenceManager.e(this.n, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree"));
    }

    private boolean y() {
        Map<String, Integer> map = this.f5589b;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return (this.f5589b.get(CommonConstant.KEY_GENDER).intValue() == this.z.getGender() && this.f5589b.get("birthday").intValue() == this.z.getBirthday() && this.f5589b.get("height").intValue() == this.z.getHeight()) ? false : true;
    }

    private void ae() {
        String string;
        if (dmg.a().showConfirmUserInfo(this.bi, this.ah)) {
            return;
        }
        boolean resetWifi = dmg.a().getResetWifi();
        if ((this.ag && !resetWifi) || dmg.a().isMiniScaleDevice(this.bi)) {
            string = getString(R.string.IDS_device_exist_manager_wifi_confirm_info_and_display);
        } else {
            string = getString(R.string.IDS_device_not_manager_wifi_confirm_info_and_display);
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.n);
        builder.e(this.n.getString(R.string.IDS_hw_health_show_common_dialog_title));
        builder.a(string).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).a(R.string.IDS_apphelp_pwindows_back_button, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TextUtils.isEmpty(UserInfoActivity.this.f5588a)) {
                    dmg.a().sendUserInfo(UserInfoActivity.this.f5588a);
                } else {
                    LogUtil.a("UIME_UserInfoActivity", "showConfirmUserInfo() deviceid is null");
                }
                if (dmg.a().isMiniScaleDevice(UserInfoActivity.this.bi)) {
                    UserInfoActivity.this.j();
                    return;
                }
                if (UserInfoActivity.this.ah) {
                    UserInfoActivity.this.o();
                } else if (!dmg.a().isHonourWeightDevice(UserInfoActivity.this.bi)) {
                    UserInfoActivity.this.f();
                } else {
                    UserInfoActivity.this.finish();
                }
            }
        });
        builder.b().show();
    }

    private void z() {
        Bundle bundle = new Bundle();
        bundle.putString("huid", this.z.getHuid());
        bundle.putString("uid", null);
        bundle.putInt("height", this.z.getHeight());
        bundle.putInt(CommonConstant.KEY_GENDER, this.z.getGender());
        bundle.putInt("age", this.z.getAge());
        bundle.putFloat("weight", this.z.getWeight());
        bundle.putInt("birthday", this.z.getBirthday());
        dmg.a().sendUserInfo(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Bundle bundle = new Bundle();
        LogUtil.a("UIME_UserInfoActivity", "has manager: ", Boolean.valueOf(this.ag));
        boolean resetWifi = dmg.a().getResetWifi();
        LogUtil.d("UIME_UserInfoActivity", "gotoNextPage isResetWifi = ", Boolean.valueOf(resetWifi));
        if (this.ag && !resetWifi) {
            if (dmg.a().isHagridWiFiDevice(this.bi, this.bp)) {
                j();
                return;
            } else {
                l();
                return;
            }
        }
        dmg.a().setBindStatus(8);
        bundle.putString("view", "bindResultConfirm");
        bundle.putBoolean("isBindSuccess", true);
        bundle.putString("productId", this.bi);
        bundle.putString("deviceSsid", this.m);
        bundle.putBoolean("isNfcConnect", this.ae);
        bundle.putInt("config_mode", 5);
        LogUtil.a("UIME_UserInfoActivity", "gotoNextPage put isNfcConnect is ", Boolean.valueOf(this.ae));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.bp);
        contentValues.put("productId", this.bi);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        LogUtil.d("UIME_UserInfoActivity", "goto HagridDeviceBindResultFragment bundle:", contentValues);
        z();
        AppRouter.c("/PluginDevice/DeviceMainActivity").d(bundle).b(this.n);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        qpx.e(this.n, R.string.IDS_device_wifi_my_qrcode_add_member_success);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.putExtra("arg1", "DeviceIntroduction");
        intent.putExtra("arg2", this.bi);
        intent.putExtra("arg3", this.bp);
        if (dmg.a().isHonourScaleDevice(this.bi)) {
            LogUtil.a("UIME_UserInfoActivity", "gotoDeviceActivity isHonourScale bindSuccess");
            intent.putExtra("isBindSuccess", true);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.bi);
        contentValues.put("uniqueId", this.bp);
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            this.n.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("UIME_UserInfoActivity", "ActivityNotFoundException", e2.getMessage());
        }
        finish();
    }

    private boolean a() {
        boolean z;
        boolean z2 = false;
        if (this.z.isGenderValid()) {
            z = true;
        } else {
            this.au.setTextColor(this.n.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (!this.z.isBirthdayValid()) {
            this.aw.setTextColor(this.n.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (!this.z.isHeightValid()) {
            this.ay.setTextColor(this.n.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (this.z.isWeightValid()) {
            z2 = z;
        } else {
            this.az.setTextColor(this.n.getResources().getColor(R.color.me_rank_dec));
        }
        LogUtil.a("R_PersonalInfo_UIME_UserInfoActivity", "checkUserDataDone  isCompleted = ", Boolean.valueOf(z2));
        return z2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        e(this.af);
        if (!TextUtils.isEmpty(this.f5588a) || this.g || dmg.a().isMiniScaleDevice(this.bi)) {
            ae();
        } else if (x() && y()) {
            am();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        Context context = this.n;
        qpx.e(context, context.getResources().getString(R.string.IDS_hw_show_user_info_fail));
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements HiCommonListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<UserInfoActivity> f5603c;

        c(UserInfoActivity userInfoActivity) {
            this.f5603c = new WeakReference<>(userInfoActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            LogUtil.d("UIME_UserInfoActivity", "fetchUserData onSuccess,data = ", obj);
            UserInfoActivity userInfoActivity = this.f5603c.get();
            if (userInfoActivity != null) {
                userInfoActivity.aj.set(false);
                userInfoActivity.b(obj, true);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            ReleaseLogUtil.d("UIME_UserInfoActivity", "fetchUserData onFailure");
            UserInfoActivity userInfoActivity = this.f5603c.get();
            if (userInfoActivity != null) {
                userInfoActivity.aj.set(false);
                userInfoActivity.b(obj, false);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<UserInfoActivity> f5601c;

        public a(UserInfoActivity userInfoActivity) {
            this.f5601c = new WeakReference<>(userInfoActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            UserInfoActivity userInfoActivity = this.f5601c.get();
            if (userInfoActivity == null) {
                LogUtil.j("UIME_UserInfoActivity", "ShowSetValueDialogListener activity null");
                return;
            }
            if (i == -1) {
                imx.a((Context) userInfoActivity);
                return;
            }
            if (!(obj instanceof UserInfomation)) {
                LogUtil.j("UIME_UserInfoActivity", "userinfomation");
                return;
            }
            UserInfomation userInfomation = (UserInfomation) obj;
            if (i == 1) {
                d(i, userInfoActivity, userInfomation);
                return;
            }
            if (i == 0) {
                e(i, userInfoActivity, userInfomation);
                return;
            }
            if (i == 3) {
                a(userInfoActivity, userInfomation);
            } else if (i != 20) {
                LogUtil.j("UIME_UserInfoActivity", "errorCode not define");
            } else {
                d(userInfoActivity, userInfomation);
            }
        }

        private void d(UserInfoActivity userInfoActivity, UserInfomation userInfomation) {
            userInfoActivity.d(userInfomation.getGender(), 2);
            userInfoActivity.b(userInfomation.getGender());
            if (userInfomation.getGender() == 2) {
                userInfoActivity.af();
            }
        }

        private void a(UserInfoActivity userInfoActivity, UserInfomation userInfomation) {
            try {
                int i = Integer.parseInt(userInfomation.getBirthday());
                userInfoActivity.bm = i / 10000;
                userInfoActivity.as = ((i % 10000) / 100) - 1;
                userInfoActivity.o = i % 100;
                if (userInfoActivity.b(userInfoActivity.bm, userInfoActivity.as, userInfoActivity.o)) {
                    userInfoActivity.e(userInfoActivity.bm, userInfoActivity.as, userInfoActivity.o);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("UIME_UserInfoActivity", "handleBirthdayErrorCode: NumberFormatException");
            }
        }

        private void e(int i, UserInfoActivity userInfoActivity, UserInfomation userInfomation) {
            if (UnitUtil.f()) {
                int[] iArr = {5, 7};
                if (userInfomation.getHeight() > 30) {
                    int[] iArrG = UnitUtil.g(new BigDecimal(userInfomation.getHeight()).divide(new BigDecimal(100), 2, 4).doubleValue());
                    if (iArrG[0] > 0 && iArrG[1] >= 0) {
                        iArr = iArrG;
                    }
                }
                userInfoActivity.q = iArr[0];
                userInfoActivity.ad = iArr[1];
                userInfoActivity.ay.setText(UnitUtil.e(userInfoActivity.q, 1, 0) + " " + userInfoActivity.getResources().getString(R.string.IDS_ft) + " " + UnitUtil.e(userInfoActivity.ad, 1, 0) + " " + userInfoActivity.getResources().getString(R.string.IDS_ins));
                userInfoActivity.d((UnitUtil.c((double) userInfoActivity.q, 1) * 100.0d) + UnitUtil.c((double) userInfoActivity.ad, 0), 0);
                return;
            }
            LogUtil.d("UIME_UserInfoActivity", "get hselect=", Float.valueOf(userInfomation.getWeight()));
            userInfoActivity.ay.setText(userInfoActivity.getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(userInfomation.getHeight() + 50, 1, 0)));
            userInfoActivity.d(userInfomation.getHeight() + 50, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, UserInfoActivity userInfoActivity, UserInfomation userInfomation) {
            if (userInfoActivity.ak) {
                int iE = UnitUtil.e();
                if (iE == 1) {
                    LogUtil.d("UIME_UserInfoActivity", "catty get wselect=", Float.valueOf(userInfomation.getWeight()));
                    userInfoActivity.az.setText(userInfoActivity.getResources().getQuantityString(R.plurals.IDS_health_catty, 1, UnitUtil.e(UnitUtil.j(userInfomation.getWeight()), 1, 1)));
                    userInfoActivity.d(userInfomation.getWeight(), i);
                    return;
                }
                b(i, userInfoActivity, userInfomation, iE == 3);
                return;
            }
            b(i, userInfoActivity, userInfomation, UnitUtil.f());
        }

        private void b(int i, UserInfoActivity userInfoActivity, UserInfomation userInfomation, boolean z) {
            if (z) {
                LogUtil.d("UIME_UserInfoActivity", "get LB wselect=", Float.valueOf(userInfomation.getWeight()));
                userInfoActivity.az.setText(userInfoActivity.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(UnitUtil.h(userInfomation.getWeight()), 1, 1)));
                userInfoActivity.d(userInfomation.getWeight(), i);
                return;
            }
            LogUtil.d("UIME_UserInfoActivity", "get wselect=", Float.valueOf(userInfomation.getWeight()));
            userInfoActivity.az.setText(userInfoActivity.getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(userInfomation.getWeight(), 1, 1)));
            userInfoActivity.d(userInfomation.getWeight(), i);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class d extends BaseHandler<UserInfoActivity> {
        public d(UserInfoActivity userInfoActivity) {
            super(userInfoActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(UserInfoActivity userInfoActivity, Message message) {
            switch (message.what) {
                case 102:
                    userInfoActivity.i();
                    break;
                case 103:
                    userInfoActivity.w();
                    break;
                case 104:
                    userInfoActivity.e();
                    break;
                case 105:
                    userInfoActivity.c();
                    break;
                case 106:
                    userInfoActivity.k();
                    break;
                case 107:
                    if (userInfoActivity.ac) {
                        userInfoActivity.af();
                        userInfoActivity.ac = false;
                    }
                    break;
                case 108:
                    userInfoActivity.ah();
                    break;
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class e implements ICloudOperationResult<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<UserInfoActivity> f5604b;

        public e(UserInfoActivity userInfoActivity) {
            this.f5604b = new WeakReference<>(userInfoActivity);
        }

        @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void operationResult(Boolean bool, String str, boolean z) {
            UserInfoActivity userInfoActivity = this.f5604b.get();
            if (userInfoActivity == null) {
                LogUtil.j("UIME_UserInfoActivity", "SetUserInfoListener activity null");
                return;
            }
            if (z) {
                ddq.d().setEvent(userInfoActivity.getApplicationContext(), String.valueOf(1100), new HashMap());
                CommonUtil.am(userInfoActivity.getApplicationContext());
            }
            userInfoActivity.c();
            if (userInfoActivity.bb != null) {
                userInfoActivity.bb.removeMessages(105);
            }
        }
    }

    private void e(boolean z) {
        LogUtil.a("UIME_UserInfoActivity", "setResultToH5 isChange ", Boolean.valueOf(z));
        Intent intent = new Intent();
        HashMap map = new HashMap();
        map.put("isChange", Boolean.valueOf(z));
        intent.putExtra("result", HiJsonUtil.d(map));
        setResult(-1, intent);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class b implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<UserInfoActivity> f5602c;

        b(UserInfoActivity userInfoActivity) {
            this.f5602c = new WeakReference<>(userInfoActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("UIME_UserInfoActivity", "updateSuccessList");
            UserInfoActivity userInfoActivity = this.f5602c.get();
            if (!iov.d(userInfoActivity)) {
                ReleaseLogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "WeightSubscribeListener onResult activity is null or finishing/destroyed");
            } else {
                if (njy.e(list)) {
                    return;
                }
                ReleaseLogUtil.d("R_PersonalInfo_UIME_UserInfoActivity", "updateSuccessList successList is not null");
                userInfoActivity.bg = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.d("R_PersonalInfo_UIME_UserInfoActivity", "WeightSubscribeListener onChange type ", Integer.valueOf(i), " changeKey ", str);
            final UserInfoActivity userInfoActivity = this.f5602c.get();
            if (userInfoActivity == null || userInfoActivity.isFinishing() || userInfoActivity.isDestroyed()) {
                ReleaseLogUtil.e("R_PersonalInfo_UIME_UserInfoActivity", "WeightSubscribeListener onChange activity is null or finishing/destroyed");
            } else if (i == HiSubscribeType.f12259a) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: cwm
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserInfoActivity.b.c(userInfoActivity);
                    }
                });
            }
        }

        public static /* synthetic */ void c(final UserInfoActivity userInfoActivity) {
            final float fA = iun.a(0L, System.currentTimeMillis());
            HandlerExecutor.b(new Runnable() { // from class: cwp
                @Override // java.lang.Runnable
                public final void run() {
                    UserInfoActivity.b.e(fA, userInfoActivity);
                }
            });
        }

        public static /* synthetic */ void e(float f, UserInfoActivity userInfoActivity) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            userInfoActivity.e(f);
        }
    }

    private void ak() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(HiSubscribeType.f12259a));
        HiHealthNativeApi.a(this.n).subscribeHiHealthData(arrayList, new b(this));
        ReleaseLogUtil.d("R_PersonalInfo_UIME_UserInfoActivity", "subscribeWeightData typeList ", arrayList);
    }

    private void an() {
        List<Integer> list = this.bg;
        if (list == null || list.isEmpty()) {
            return;
        }
        HiHealthNativeApi.a(this.n).unSubscribeHiHealthData(this.bg, new HiUnSubscribeListener() { // from class: com.huawei.featureuserprofile.me.UserInfoActivity.1
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                ReleaseLogUtil.d("R_PersonalInfo_UIME_UserInfoActivity", "unsubscribeDataChange isSuccess?", Boolean.valueOf(z));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f) {
        LogUtil.a("UIME_UserInfoActivity", "handleWeightData weight data: ", Float.valueOf(f));
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.loadAccountExtData(this.z);
        userInfomation.setWeight(f);
        this.aq.d(1, this, userInfomation);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

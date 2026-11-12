package com.huawei.ui.main.stories.me.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
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
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureController;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceControlDataModelReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceExitAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceUnbindReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwnetworkmodel.NetworkStatusListener;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.datepicker.HealthDatePickerDialog;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomButtonMenuDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.errortip.NetworkErrorTipBar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.activity.BindUserInfoActivity;
import com.huawei.up.model.UserInfomation;
import defpackage.dmp;
import defpackage.dne;
import defpackage.dnj;
import defpackage.doq;
import defpackage.dor;
import defpackage.drw;
import defpackage.dso;
import defpackage.dxi;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dyg;
import defpackage.dyh;
import defpackage.eam;
import defpackage.ean;
import defpackage.eby;
import defpackage.ece;
import defpackage.ecf;
import defpackage.ecj;
import defpackage.efx;
import defpackage.elh;
import defpackage.etn;
import defpackage.imx;
import defpackage.imz;
import defpackage.ino;
import defpackage.lmf;
import defpackage.lqo;
import defpackage.ltc;
import defpackage.nsr;
import defpackage.nuu;
import defpackage.oru;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.vei;
import defpackage.vvf;
import defpackage.wvf;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes43.dex */
public class BindUserInfoActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28404a;
    private LinearLayout aa;
    private String ab;
    private HealthTextView ac;
    private HealthRadioButton ad;
    private int ae;
    private Map<String, Integer> af;
    private HiUserInfo ah;
    private boolean aj;
    private String an;
    private byte[] ao;
    private NetworkStatusListener ap;
    private int aq;
    private HealthTextView ar;
    private CommonDialog21 as;
    private elh av;
    private ImageView aw;
    private RelativeLayout ax;
    private CustomTitleBar ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28405b;
    private RelativeLayout bb;
    private RelativeLayout bc;
    private ImageView bd;
    private HealthTextView be;
    private ImageView bf;
    private HealthTextView bg;
    private ImageView bh;
    private HealthTextView bi;
    private dso bj;
    private ImageView bk;
    private LinearLayout bl;
    private eby bn;
    private LinearLayout bo;
    private LinearLayout bp;
    private HealthButton bq;
    private LinearLayout br;
    private int bu;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28406c;
    private LinearLayout d;
    private HealthTextView e;
    private ContentValues f;
    private HealthTextView g;
    private String h;
    private LinearLayout i;
    private HealthTextView j;
    private int k;
    private Context m;
    private float n;
    private String o;
    private HealthTextView p;
    private String q;
    private HealthRadioButton r;
    private int t;
    private String u;
    private ImageView v;
    private LinearLayout w;
    private HealthRadioButton x;
    private String y;
    private HealthTextView z;
    private final WifiDeviceControlDataModelReq bt = new WifiDeviceControlDataModelReq();
    private final List<DeviceServiceInfo> bw = new ArrayList(16);
    private Dialog l = null;
    private boolean ak = false;
    private String at = "";
    private String ba = "";
    private Handler bm = new a(this);
    private boolean ai = false;
    private boolean ag = false;
    private boolean al = false;
    private AtomicBoolean am = new AtomicBoolean(false);
    private dxi s = new dxi();
    private String au = "";
    private WifiDeviceExitAuthorizeSubUserReq bs = new WifiDeviceExitAuthorizeSubUserReq();

    private int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        return i;
    }

    public static /* synthetic */ void a(View view) {
    }

    public static /* synthetic */ void e(View view) {
    }

    public static /* synthetic */ void j(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = this;
        this.ah = new HiUserInfo();
        this.af = new HashMap(16);
        setContentView(R.layout.hw_show_bind_userinfo_activity);
        this.an = SharedPreferenceManager.e(this.m, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN);
        this.f28404a = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1004);
        boolean zP = p();
        v();
        r();
        y();
        d(zP);
    }

    private boolean p() {
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra("sn");
        this.au = stringExtra;
        LogUtil.a("BindUserInfoActivity", "initIntentView mSerialNumber:", dyg.b(stringExtra));
        this.ai = intent.getBooleanExtra("hasManager", false);
        this.ag = intent.hasExtra("hasManager");
        this.o = intent.getStringExtra("deviceSsid");
        this.n = intent.getFloatExtra("deviceWeight", -1.0f);
        if (intent.getSerializableExtra("deviceResis") instanceof dso) {
            this.bj = (dso) intent.getSerializableExtra("deviceResis");
        }
        try {
            this.ao = intent.getByteArrayExtra("mainHuid");
        } catch (ArrayIndexOutOfBoundsException unused) {
            LogUtil.e("BindUserInfoActivity", "onCreate: Get main huid failed.");
        }
        this.h = intent.getStringExtra("cloudDeviceId");
        if (intent.getBooleanExtra("isBleScale", false)) {
            this.ak = true;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            String stringExtra2 = intent.getStringExtra("device");
            if (stringExtra2 != null && stringExtra2.equals("wifi")) {
                this.ak = true;
            }
            if (intent.hasExtra("auth_device_id") && !TextUtils.isEmpty(intent.getStringExtra("auth_device_id"))) {
                this.f28405b = intent.getStringExtra("auth_device_id");
            }
        }
        this.at = intent.getStringExtra("productId");
        boolean booleanExtra = intent.getBooleanExtra("isNfcConnect", false);
        this.aj = booleanExtra;
        LogUtil.a("BindUserInfoActivity", "onCreate getBoolean mIsNfcCommect = ", Boolean.valueOf(booleanExtra));
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
        if (contentValues != null) {
            this.at = contentValues.getAsString("productId");
            this.ba = contentValues.getAsString("uniqueId");
        } else {
            LogUtil.j("BindUserInfoActivity", "has not pass device info ");
        }
        if (TextUtils.isEmpty(this.ba) || TextUtils.isEmpty(this.at)) {
            LogUtil.j("BindUserInfoActivity", "device uniqueId or productId is null");
        }
        return intent.getBooleanExtra("show_gender_window", false);
    }

    private void d(boolean z) {
        LogUtil.a("BindUserInfoActivity", "isShowGenderWindow=", Boolean.valueOf(z));
        if (z) {
            ar();
        }
    }

    private void v() {
        this.ay = (CustomTitleBar) findViewById(R.id.me_userInfo_titlebar);
        u();
        s();
        q();
        this.ac = (HealthTextView) findViewById(R.id.user_info_fragment_set_gender);
        this.aw = (ImageView) findViewById(R.id.user_info_fragment_wifi_device_complete_guide_go_next_img);
        this.bp = (LinearLayout) findViewById(R.id.user_info_fragment_wifi_device_complete_btn_layout);
        this.bq = (HealthButton) findViewById(R.id.user_info_fragment_wifi_device_complete_btn);
        this.br = (LinearLayout) findViewById(R.id.user_info_fragment_wifi_device_complete_guide_bottom_layout);
        this.bo = (LinearLayout) findViewById(R.id.user_info_fragment_wifi_device_complete_guide_go_next_layout);
        this.f28406c = (LinearLayout) findViewById(R.id.body_data_visit_layout);
        this.e = (HealthTextView) findViewById(R.id.bmi_value);
        this.i = (LinearLayout) findViewById(R.id.body_fat_rate_layout);
        this.j = (HealthTextView) findViewById(R.id.body_fat_rate_value);
        this.g = (HealthTextView) findViewById(R.id.body_fat_rate_value_unit);
        this.z = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender_tip);
        this.ar = (HealthTextView) findViewById(R.id.user_info_fragment_wifi_device_complete_guide_go_next_text);
        if (dxm.u(this.at) || dxm.q(this.at) || "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(this.at)) {
            this.f28406c.setVisibility(0);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_show_settings_info_layout);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, linearLayout);
        this.v.setOnClickListener(this);
        x();
        ak();
        this.y = getResources().getString(R.string.IDS_hw_show_set_default_gender_male);
        this.q = getResources().getString(R.string.IDS_hw_show_set_default_gender_female);
        this.u = getResources().getString(R.string.IDS_hw_me_userinfo_not_set);
        this.ab = getResources().getString(R.string.IDS_hw_me_userinfo_secret);
        String strE = SharedPreferenceManager.e(this.m, Integer.toString(10000), "onboarding_skip_current_time");
        String strE2 = SharedPreferenceManager.e(this.m, Integer.toString(10000), "onboarding_skip");
        if (!TextUtils.isEmpty(strE) && !"1".equals(strE2)) {
            LogUtil.a("BindUserInfoActivity", "dot dismiss");
            SharedPreferenceManager.e(this.m, Integer.toString(10000), "rid_dot_dismiss", Integer.toString(1), new StorageParams());
        }
        this.ay.setLeftButtonVisibility(8);
    }

    private void x() {
        if (this.ak) {
            this.bo.setOnClickListener(this);
            this.bq.setOnClickListener(this);
            am();
        }
    }

    private void ak() {
        if (LanguageUtil.ba(this.m)) {
            this.bh.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.bd.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.bk.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.bf.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            this.aw.setBackgroundResource(R.drawable.ic_arrows_left_black);
        } else {
            this.bh.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.bd.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.bk.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.bf.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            this.aw.setBackgroundResource(R.drawable.ic_arrows_right_black);
        }
        if (LanguageUtil.c(this.m.getApplicationContext())) {
            this.ac.setWidth(qrs.d(this.m.getApplicationContext(), 60.0f));
            this.ac.setGravity(GravityCompat.START);
        }
    }

    private void q() {
        this.bh = (ImageView) findViewById(R.id.user_info_fragment_set_gender_image);
        this.bd = (ImageView) findViewById(R.id.user_info_fragment_set_height_image);
        this.bk = (ImageView) findViewById(R.id.user_info_fragment_set_weight_image);
        this.bf = (ImageView) findViewById(R.id.user_info_fragment_set_birthday_image);
        this.v = (ImageView) findViewById(R.id.hw_health_gender_not_set_prompt);
    }

    private void s() {
        this.be = (HealthTextView) findViewById(R.id.hw_show_userinfo_gender);
        this.bg = (HealthTextView) findViewById(R.id.hw_show_userinfo_height);
        this.bi = (HealthTextView) findViewById(R.id.hw_show_userinfo_weight);
        this.az = (HealthTextView) findViewById(R.id.hw_show_userinfo_birthday);
    }

    private void u() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_show_userinfo_gender_layout);
        this.w = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.hw_show_userinfo_height_layout);
        this.aa = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.hw_show_userinfo_weight_layout);
        this.bl = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.hw_show_userinfo_birthday_layout);
        this.d = linearLayout4;
        linearLayout4.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.am.compareAndSet(false, true)) {
            aq();
            HiHealthManager.d(this.m).fetchUserData(new d(this));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.al) {
            LogUtil.a("BindUserInfoActivity", "the data of lite version from personal center");
            this.al = false;
            ThirdPartyLoginManager.getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: vtf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.b(i, obj);
                }
            }, false);
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        Handler handler = this.bm;
        if (handler != null) {
            handler.sendEmptyMessage(106);
        }
    }

    private void y() {
        this.ap = new NetworkStatusListener(BaseApplication.getContext()) { // from class: com.huawei.ui.main.stories.me.activity.BindUserInfoActivity.1
            @Override // com.huawei.hwnetworkmodel.NetworkStatusListener
            public void onConnected() {
                LogUtil.a("BindUserInfoActivity", "network connected!");
                BindUserInfoActivity.this.r();
                BindUserInfoActivity.this.a(true);
            }

            @Override // com.huawei.hwnetworkmodel.NetworkStatusListener
            public void onDisconnected() {
                LogUtil.j("BindUserInfoActivity", "network disconnected!");
                BindUserInfoActivity.this.a(false);
            }
        };
    }

    private boolean z() {
        if (CommonUtil.ca() || !Utils.h()) {
            return false;
        }
        return !CommonUtil.ab(this.m.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        final NetworkErrorTipBar networkErrorTipBar = (NetworkErrorTipBar) findViewById(R.id.network_error_bar);
        if (networkErrorTipBar == null) {
            LogUtil.j("BindUserInfoActivity", "NetworkErrorTipBar is null");
        } else {
            runOnUiThread(new Runnable() { // from class: vst
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(z, networkErrorTipBar);
                }
            });
        }
    }

    public /* synthetic */ void d(boolean z, NetworkErrorTipBar networkErrorTipBar) {
        if (z) {
            networkErrorTipBar.setVisibility(8);
        } else if (z()) {
            networkErrorTipBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, Object obj, boolean z) {
        if (z && (obj instanceof List)) {
            List list = (List) obj;
            if (list.size() > 0) {
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                this.ah = hiUserInfo;
                this.af.put(CommonConstant.KEY_GENDER, Integer.valueOf(hiUserInfo.getGender()));
                this.af.put("birthday", Integer.valueOf(this.ah.getBirthday()));
                this.af.put("height", Integer.valueOf(this.ah.getHeight()));
                Handler handler = this.bm;
                if (handler == null) {
                    LogUtil.e("BindUserInfoActivity", "Handler is null");
                    e();
                    return;
                } else {
                    handler.sendEmptyMessage(102);
                    return;
                }
            }
            return;
        }
        Handler handler2 = this.bm;
        if (handler2 == null) {
            LogUtil.e("BindUserInfoActivity", "Handler is null");
            e();
        } else {
            handler2.sendEmptyMessage(102);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        String strE;
        if (z()) {
            ao();
            return;
        }
        m(view);
        if (this.ak) {
            if (view == this.bq || view == this.bo) {
                wvf.e().d(false);
                if (!f()) {
                    Context context = this.m;
                    qpx.e(context, context.getResources().getString(R.string.IDS_hw_show_complete_privacy_wifi_tip));
                    return;
                }
                if (dxm.ag(this.at) || dxm.at(this.at)) {
                    eby ebyVarE = ecf.e(this.at);
                    MeasurableDevice measurableDeviceB = dmp.d().b(this.ba, false);
                    if (ebyVarE == null && measurableDeviceB == null) {
                        at();
                        return;
                    } else if (ebyVarE != null) {
                        strE = ebyVarE.e();
                    } else {
                        strE = "";
                    }
                } else {
                    strE = "";
                }
                d(strE);
                l();
            }
        }
    }

    private void at() {
        if (!TextUtils.isEmpty(this.f28405b)) {
            i(R.string.IDS_device_wifi_release_auth_msg);
        } else {
            i(R.string.IDS_device_wifi_device_does_not_exist);
        }
    }

    private void d(String str) {
        HashMap map = new HashMap(16);
        c(str, map);
        ean.d(map, str, ece.f32732a, this.m);
        if (!Utils.k()) {
            List<dnj> allUser = MultiUsersManager.INSTANCE.getAllUser();
            for (int i = 1; i < allUser.size(); i++) {
                HashMap map2 = new HashMap(16);
                dnj dnjVar = allUser.get(i);
                map2.put("id", LoginInit.getInstance(this.m).getAccountInfo(1011));
                map2.put("uid", dnjVar.i());
                map2.put(CommonConstant.KEY_GENDER, String.valueOf((int) (dnjVar.d() == 2 ? (byte) 1 : dnjVar.d())));
                map2.put("age", String.valueOf(dor.a(dnjVar.j(), dnjVar.c())));
                map2.put("height", String.valueOf(dnjVar.e()));
                map2.put("isDelete", String.valueOf(0));
                String strB = ean.b(str, dnjVar.i());
                if (strB != null && !TextUtils.isEmpty(strB)) {
                    map2.put("bodyRes", ean.a(strB));
                }
                if (dnjVar.o() != 0.0f && !Float.isNaN(dnjVar.o())) {
                    map2.put("currentWeight", String.valueOf(dnjVar.o()));
                }
                if (dor.b(this.ba)) {
                    map2.put("month", String.valueOf(dor.e(dnjVar.j())));
                }
                ean.d(map2, str, dnjVar.g(), this.m);
            }
            return;
        }
        LogUtil.a("BindUserInfoActivity", "Oversea is no child user");
    }

    private void c(String str, Map<String, String> map) {
        map.put("id", LoginInit.getInstance(this.m).getAccountInfo(1011));
        map.put("uid", String.valueOf(0));
        map.put(CommonConstant.KEY_GENDER, String.valueOf(this.ah.getGender() == 2 ? 1 : this.ah.getGender()));
        map.put("age", String.valueOf(dor.a(this.ah.getBirthday(), this.ah.getAge())));
        map.put("height", String.valueOf(this.ah.getHeight()));
        map.put("isDelete", String.valueOf(0));
        String strB = ean.b(str, String.valueOf(0));
        if (strB != null && !TextUtils.isEmpty(strB)) {
            map.put("bodyRes", ean.a(strB));
        }
        if (this.ah.getWeight() != 0.0f && !Float.isNaN(this.ah.getWeight())) {
            map.put("currentWeight", String.valueOf(this.ah.getWeight()));
        }
        if (dor.b(this.ba)) {
            map.put("month", String.valueOf(dor.e(this.ah.getBirthday())));
        }
    }

    private void m(View view) {
        if (view == this.w) {
            ar();
        }
        if (view == this.aa) {
            if (UnitUtil.f()) {
                as();
            } else {
                k(0);
            }
        }
        if (view == this.bl) {
            k(1);
        }
        if (view == this.d) {
            al();
        }
        if (view == this.v) {
            an();
        }
    }

    private void am() {
        if (dxm.ai(this.at) || dxm.q(this.at)) {
            b(true);
            return;
        }
        if (this.ag) {
            boolean zM = doq.e().m();
            if (this.ai && !zM) {
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
            this.bp.setVisibility(0);
            this.br.setVisibility(8);
        } else {
            this.bp.setVisibility(8);
            this.br.setVisibility(0);
        }
    }

    private void l() {
        if (dxm.ai(this.at)) {
            k();
            return;
        }
        if (this.ag) {
            t();
            return;
        }
        if (dxm.q(this.at)) {
            ah();
            o();
        } else if (TextUtils.isEmpty(this.f28405b) && !"7a1063dd-0e0f-4a72-9939-461476ff0259".equals(this.at)) {
            finish();
            ag();
        } else {
            m();
        }
    }

    private void ag() {
        if (LanguageUtil.ba(this.m)) {
            overridePendingTransition(R.anim.right_enter, R.anim.right_exit);
        } else {
            overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
        }
    }

    private void k() {
        Bundle bundle = new Bundle();
        bundle.putString("view", "deviceManage");
        bundle.putString("productId", this.at);
        bundle.putString("deviceSsid", this.o);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.ba);
        contentValues.put("productId", this.at);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        bundle.putBoolean("isNfcConnect", this.aj);
        LogUtil.a("BindUserInfoActivity", "gotoDeviceManagePage put isNfcConnect is", Boolean.valueOf(this.aj));
        Intent intent = new Intent(this.m, (Class<?>) DeviceMainActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("config_mode", 5);
        ah();
        dxi.e(this.at, this.ba);
        try {
            this.m.startActivity(intent);
            ag();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BindUserInfoActivity", "gotoDeviceManagePage startActivity ActivityNotFoundException.");
        }
        finish();
    }

    private void o() {
        b("true");
        Bundle bundle = new Bundle();
        bundle.putString("view", "hagridDeviceWlanUseGuide");
        bundle.putString("productId", this.at);
        bundle.putString("cloudDeviceId", this.h);
        bundle.putByteArray("mainHuid", this.ao);
        bundle.putBoolean("isNfcConnect", this.aj);
        LogUtil.a("BindUserInfoActivity", "gotoHagridDeviceWlanUseGuideFragment put isNfcConnect is", Boolean.valueOf(this.aj));
        if (this.ag) {
            bundle.putInt(ParamConstants.Param.VIEW_TYPE, 12);
        } else {
            bundle.putInt(ParamConstants.Param.VIEW_TYPE, 14);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.ba);
        contentValues.put("productId", this.at);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        if (getIntent() != null) {
            bundle.putString("accountInfo", getIntent().getStringExtra("accountInfo"));
        }
        Intent intent = new Intent(this.m, (Class<?>) DeviceMainActivity.class);
        intent.putExtras(bundle);
        try {
            this.m.startActivity(intent);
            ag();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BindUserInfoActivity", "gotoHagridDeviceWlanUseGuideFragment startActivity ActivityNotFoundException.");
        }
        finish();
    }

    private void b(String str) {
        SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), "request_sync_data_dialog", str, new StorageParams());
    }

    public void c() {
        e();
        a(false);
    }

    private void ao() {
        qpx.e(this.m, R.string.IDS_network_connect_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if ("1".equals(this.an)) {
            this.bm.sendEmptyMessage(103);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).getUserInfo(new e(this));
        }
    }

    static class e implements IBaseResponseCallback {
        private WeakReference<BindUserInfoActivity> e;

        e(BindUserInfoActivity bindUserInfoActivity) {
            this.e = new WeakReference<>(bindUserInfoActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            BindUserInfoActivity bindUserInfoActivity = this.e.get();
            if (bindUserInfoActivity == null) {
                LogUtil.j("BindUserInfoActivity", "mWeakActivity is null");
                return;
            }
            if (i == 0 && (obj instanceof HiUserInfo)) {
                bindUserInfoActivity.bb();
                bindUserInfoActivity.a(true);
            }
            if (bindUserInfoActivity.bm != null) {
                bindUserInfoActivity.bm.sendEmptyMessage(103);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bb() {
        int iC;
        int iA;
        if (this.ah == null) {
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005);
        boolean z = false;
        UserInfomation userInfomation = new UserInfomation(0);
        if (!TextUtils.isEmpty(accountInfo) && TextUtils.isDigitsOnly(accountInfo)) {
            int iC2 = c(accountInfo);
            if ((iC2 == 0 || iC2 == 1 || iC2 == 2) && (iA = a(iC2)) != this.ah.getGender()) {
                this.ah.setGender(iA);
                userInfomation.setGender(Integer.valueOf(iC2));
                z = true;
            }
        } else {
            LogUtil.a("BindUserInfoActivity", "updateAccountData gender is invalidate");
        }
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006);
        if (!TextUtils.isEmpty(accountInfo2) && TextUtils.isDigitsOnly(accountInfo2) && (iC = c(accountInfo2)) > 0 && iC != this.ah.getBirthday()) {
            this.ah.setBirthday(iC);
            userInfomation.setBirthday(String.valueOf(iC));
        } else if (!z) {
            return;
        }
        e(userInfomation);
    }

    private void ar() {
        LogUtil.a("BindUserInfoActivity", "showGenderPickerDialog()");
        if (!imz.c()) {
            if (imz.a()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(this, null);
            } else {
                imx.a((Activity) this);
            }
            this.al = true;
            return;
        }
        View viewInflate = ((LayoutInflater) this.m.getSystemService("layout_inflater")).inflate(R.layout.hw_show_guest_settings_gender_view, (ViewGroup) null);
        ((RelativeLayout) viewInflate.findViewById(R.id.settings_gender_view_layout_secrect)).setVisibility(8);
        ((HealthTextView) viewInflate.findViewById(R.id.settings_gender_secrect_tip)).setVisibility(0);
        if (!n(viewInflate)) {
            LogUtil.j("BindUserInfoActivity", "showGenderPickerDialog() dialog layout fail");
            this.l = null;
            return;
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.m);
        builder.a(getString(R.string.IDS_hw_show_set_gender)).d(viewInflate).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: vtq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindUserInfoActivity.j(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.l = customViewDialogD;
        customViewDialogD.show();
    }

    private void al() {
        if (!imz.c()) {
            if (imz.a()) {
                ThirdPartyLoginManager.getInstance().openPersonalInfo(this, null);
            } else {
                imx.a((Activity) this);
            }
            this.al = true;
            return;
        }
        if (this.bu <= 0) {
            this.bu = 1992;
            this.aq = 0;
            this.k = 1;
        }
        HealthDatePickerDialog healthDatePickerDialog = new HealthDatePickerDialog(this, new HealthDatePickerDialog.DateSelectedListener() { // from class: vtk
            @Override // com.huawei.ui.commonui.datepicker.HealthDatePickerDialog.DateSelectedListener
            public final void onDateSelected(int i, int i2, int i3) {
                this.f51579a.d(i, i2, i3);
            }
        }, new GregorianCalendar(this.bu, this.aq, this.k));
        int i = Calendar.getInstance().get(1);
        healthDatePickerDialog.e(i - 150, i);
        healthDatePickerDialog.show();
    }

    public /* synthetic */ void d(int i, int i2, int i3) {
        if (a(i, i2, i3)) {
            f(i, i2, i3);
        }
    }

    private boolean a(int i, int i2, int i3) {
        if (b(i, i2, i3)) {
            qpx.b(this.m.getApplicationContext(), this.m.getResources().getString(R.string.IDS_hw_show_no_choose_birthday_after_now));
            return false;
        }
        if (!CommonUtil.ca() && Utils.h() && !"1".equals(this.an)) {
            if (z()) {
                ao();
                return false;
            }
            if ("1".equals(this.f28404a)) {
                if (!e(i + 13, i2, i3)) {
                    qpx.b(this.m.getApplicationContext(), getString(R.string.IDS_hw_show_chosen_birthday_exceeds_kid_range, new Object[]{13}));
                    return false;
                }
            } else if (e(i + 18, i2, i3 + 1)) {
                qpx.b(this.m.getApplicationContext(), getString(R.string.IDS_hw_show_no_choose_birthday_after_eighteen));
                return false;
            }
        } else if (e(i + 13, i2, i3)) {
            qpx.b(this.m.getApplicationContext(), getString(R.string.IDS_hw_show_no_choose_birthday_after_eighteen));
            return false;
        }
        return true;
    }

    private void f(int i, int i2, int i3) {
        this.bu = i;
        this.aq = i2;
        this.k = i3;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.bu);
        stringBuffer.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.aq + 1)));
        stringBuffer.append(String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.k)));
        a(c(stringBuffer.toString()), 3);
        h();
    }

    private boolean b(int i, int i2, int i3) {
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

    private boolean e(int i, int i2, int i3) {
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

    private ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (UnitUtil.f()) {
            int iH = (int) UnitUtil.h(250.0d);
            for (int iH2 = (int) UnitUtil.h(10.0d); iH2 <= iH + 1; iH2++) {
                arrayList.add(getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, new Object[]{UnitUtil.e(iH2, 1, 0)}));
            }
        } else {
            for (int i = 10; i < 251; i++) {
                arrayList.add(getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, new Object[]{UnitUtil.e(i, 1, 0)}));
            }
        }
        return arrayList;
    }

    private ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 50; i < 251; i++) {
            arrayList.add(getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, new Object[]{UnitUtil.e(i, 1, 0)}));
        }
        return arrayList;
    }

    private void as() {
        View viewInflate = getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_inch_height_v9, (ViewGroup) null);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.height_ft_number_picker_v9);
        String[] strArr = new String[8];
        int i = 0;
        while (i < 8) {
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = i + 1;
            stringBuffer.append(ltc.c(i2, 1, 0));
            stringBuffer.append(" ");
            stringBuffer.append(getString(R.string.IDS_ft));
            strArr[i] = stringBuffer.toString();
            i = i2;
        }
        healthNumberPicker.setDisplayedValues(strArr);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(7);
        HealthNumberPicker healthNumberPicker2 = (HealthNumberPicker) viewInflate.findViewById(R.id.height_inch_number_picker_v9);
        String[] strArr2 = new String[12];
        for (int i3 = 0; i3 < 12; i3++) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(ltc.c(i3, 1, 0));
            stringBuffer2.append(" ");
            stringBuffer2.append(getString(R.string.IDS_ins));
            strArr2[i3] = stringBuffer2.toString();
        }
        healthNumberPicker2.setDisplayedValues(strArr2);
        healthNumberPicker2.setMinValue(0);
        healthNumberPicker2.setMaxValue(11);
        int[] iArr = {5, 7};
        HiUserInfo hiUserInfo = this.ah;
        if (hiUserInfo != null && hiUserInfo.getHeight() > 30) {
            int[] iArrG = UnitUtil.g(((double) this.ah.getHeight()) / 100.0d);
            if (iArrG[0] > 0 && iArrG[1] >= 0) {
                iArr = iArrG;
            }
        }
        healthNumberPicker.setValue(iArr[0] - 1);
        healthNumberPicker2.setValue(iArr[1]);
        b(viewInflate, healthNumberPicker, healthNumberPicker2);
    }

    private void b(View view, final HealthNumberPicker healthNumberPicker, final HealthNumberPicker healthNumberPicker2) {
        String string = getString(R.string.IDS_hw_show_set_height);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.m);
        builder.a(string).d(view).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: vtn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(healthNumberPicker, healthNumberPicker2, view2);
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: vto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BindUserInfoActivity.a(view2);
            }
        });
        builder.d().show();
    }

    public /* synthetic */ void e(HealthNumberPicker healthNumberPicker, HealthNumberPicker healthNumberPicker2, View view) {
        if (z()) {
            ao();
            return;
        }
        this.t = healthNumberPicker.getValue() + 1;
        this.ae = healthNumberPicker2.getValue();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getString(R.string.IDS_ft_string, new Object[]{ltc.c(this.t, 1, 0)}));
        stringBuffer.append(" ");
        stringBuffer.append(getString(R.string.IDS_ins_string, new Object[]{UnitUtil.e(this.ae, 1, 0)}));
        this.bg.setText(stringBuffer.toString());
        c((int) Math.rint((UnitUtil.c(this.t, 1) * 100.0d) + UnitUtil.c(this.ae, 0)), 0);
    }

    private void k(int i) {
        String string;
        if (i == 1) {
            string = getString(R.string.IDS_hw_health_show_healthdata_weight);
        } else {
            string = getString(R.string.IDS_hw_show_set_height);
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.health_healthdata_userinfo_dialog_set, (ViewGroup) null);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.hw_health_dialog_tips_userinfo);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.userinfo_number_picker_v9);
        if (i == 1) {
            this.p.setText(getString(R.string.IDS_hwh_user_data_weight_tips));
            ArrayList<String> arrayListG = g();
            healthNumberPicker.setDisplayedValues((String[]) arrayListG.toArray(new String[arrayListG.size()]));
            healthNumberPicker.setMinValue(0);
            healthNumberPicker.setMaxValue(arrayListG.size() - 1);
            if (UnitUtil.f()) {
                HiUserInfo hiUserInfo = this.ah;
                if (hiUserInfo != null && ((int) Math.round(UnitUtil.h(hiUserInfo.getWeight()))) >= ((int) UnitUtil.h(10.0d))) {
                    healthNumberPicker.setValue(((int) Math.round(UnitUtil.h(this.ah.getWeight()))) - ((int) UnitUtil.h(10.0d)));
                } else {
                    healthNumberPicker.setValue((int) UnitUtil.h(70.0d));
                }
            } else {
                HiUserInfo hiUserInfo2 = this.ah;
                if (hiUserInfo2 != null && Math.round(hiUserInfo2.getWeight()) >= 10) {
                    healthNumberPicker.setValue(Math.round(this.ah.getWeight()) - 10);
                } else {
                    healthNumberPicker.setValue(70);
                }
            }
        } else {
            this.p.setText(getString(R.string.IDS_hwh_user_data_height_tips));
            ArrayList<String> arrayListI = i();
            healthNumberPicker.setDisplayedValues((String[]) arrayListI.toArray(new String[arrayListI.size()]));
            healthNumberPicker.setMinValue(0);
            healthNumberPicker.setMaxValue(arrayListI.size() - 1);
            HiUserInfo hiUserInfo3 = this.ah;
            if (hiUserInfo3 != null && hiUserInfo3.getHeight() >= 50) {
                healthNumberPicker.setValue(this.ah.getHeight() - 50);
            } else {
                healthNumberPicker.setValue(110);
            }
        }
        b(viewInflate, i, string, healthNumberPicker);
    }

    private void b(View view, final int i, String str, final HealthNumberPicker healthNumberPicker) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.m);
        builder.a(str).d(view).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: vtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f51577a.c(i, healthNumberPicker, view2);
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: vth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.a("BindUserInfoActivity", "buildShowValueDialog click cancel");
            }
        });
        builder.d().show();
    }

    public /* synthetic */ void c(int i, HealthNumberPicker healthNumberPicker, View view) {
        if (z()) {
            ao();
            return;
        }
        if (i == 1) {
            if (UnitUtil.f()) {
                this.bi.setText(getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, new Object[]{ltc.c(healthNumberPicker.getValue() + ((int) UnitUtil.h(10.0d)), 1, 1)}));
                a((float) UnitUtil.i(healthNumberPicker.getValue() + ((int) UnitUtil.h(10.0d))));
                return;
            } else {
                this.bi.setText(getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, new Object[]{ltc.c(((double) healthNumberPicker.getValue()) + 10.0d, 1, 1)}));
                a(healthNumberPicker.getValue() + 10, i);
                return;
            }
        }
        this.bg.setText(getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, new Object[]{ltc.c(healthNumberPicker.getValue() + 50, 1, 0)}));
        a(healthNumberPicker.getValue() + 50, i);
    }

    private void a(final int i, final int i2) {
        ino.b(i2, this.m, new IBaseResponseCallback() { // from class: vsv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.e.e(i2, i, i3, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, int i2, int i3, Object obj) {
        aq();
        this.bm.sendEmptyMessageDelayed(105, 5000L);
        UserInfomation userInfomation = new UserInfomation(0);
        if (i == 1) {
            float f = i2;
            userInfomation.setWeight(f);
            this.ah.setWeight(f);
            e(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "2");
        } else if (i == 0) {
            userInfomation.setHeight(i2);
            this.ah.setHeight(i2);
            e(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "1");
            vei.b(i2);
        } else if (i == 2) {
            userInfomation.setGender(Integer.valueOf(a(i2)));
            g(i2);
        } else if (i == 3) {
            userInfomation.setBirthday(String.valueOf(i2));
            this.ah.setBirthday(i2);
            this.ah.setAge((HiDateUtil.d(System.currentTimeMillis()) / 10000) - (i2 / 10000));
            e(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "4");
        } else {
            LogUtil.a("BindUserInfoActivity", "saveValue type is invalidate");
        }
        this.ah.setCreateTime(System.currentTimeMillis());
        e(userInfomation);
        nsr.b(this.m).a(60000);
        c(this.bj);
    }

    private void g(int i) {
        HiUserInfo hiUserInfo = this.ah;
        if (hiUserInfo != null) {
            hiUserInfo.setGender(i);
        }
        SharedPreferenceManager.e(this.m, Integer.toString(10000), "hw_health_gender_value", Integer.toString(a(i)), new StorageParams(1));
        e(AnalyticsValue.HEALTH_MINE_PERSONAL_INFOR_2040006.value(), "3");
        String strI = MultiUsersManager.INSTANCE.getMainUser().i();
        if (TextUtils.isEmpty(strI) || !strI.equals(MultiUsersManager.INSTANCE.getCurrentUser().i())) {
            return;
        }
        MultiUsersManager.INSTANCE.getMainUser().e((byte) (i == 0 ? 0 : 1));
    }

    private void e(UserInfomation userInfomation) {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setUserInfo(userInfomation, new ICloudOperationResult() { // from class: vsz
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.d.d((Boolean) obj, str, z);
            }
        });
    }

    public /* synthetic */ void d(Boolean bool, String str, boolean z) {
        if (z) {
            oru.a(this.m).c(this.m, String.valueOf(1100), new HashMap(16));
            CommonUtil.am(this.m);
        }
        e();
        Handler handler = this.bm;
        if (handler != null) {
            handler.removeMessages(105);
        }
    }

    private void c(final int i, final int i2) {
        ino.b(0, this.m, new IBaseResponseCallback() { // from class: vsr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f51566b.a(i, i2, i3, obj);
            }
        });
    }

    public /* synthetic */ void a(int i, int i2, int i3, Object obj) {
        this.ah.setHeight(i);
        this.ah.setUnitType(i2);
        vei.b(i);
        UserInfomation userInfomation = new UserInfomation(i2);
        userInfomation.setHeight(i);
        e(userInfomation);
    }

    private void a(final float f) {
        ino.b(1, this.m, new IBaseResponseCallback() { // from class: vti
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(f, i, obj);
            }
        });
    }

    public /* synthetic */ void c(float f, int i, Object obj) {
        this.ah.setWeight(f);
        UserInfomation userInfomation = new UserInfomation(0);
        userInfomation.setWeight(f);
        e(userInfomation);
    }

    private boolean n(View view) {
        if (view == null) {
            return false;
        }
        this.x = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview1);
        this.r = (HealthRadioButton) view.findViewById(R.id.settings_gender_imgview2);
        this.ad = (HealthRadioButton) view.findViewById(R.id.settings_gender_secrect);
        this.bc = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout1);
        this.ax = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout2);
        this.bb = (RelativeLayout) view.findViewById(R.id.settings_gender_view_layout_secrect);
        this.bc.setOnClickListener(new vvf(this, 1));
        this.ax.setOnClickListener(new vvf(this, 0));
        this.bb.setOnClickListener(new vvf(this, 2));
        b(1);
        HiUserInfo hiUserInfo = this.ah;
        if (hiUserInfo != null) {
            b(hiUserInfo.getGender());
        }
        return true;
    }

    private void b(int i) {
        if (i == 0) {
            this.x.setChecked(false);
            this.r.setChecked(true);
            this.ad.setChecked(false);
        } else if (i == 1) {
            this.x.setChecked(true);
            this.r.setChecked(false);
            this.ad.setChecked(false);
        } else if (i == 2) {
            this.x.setChecked(false);
            this.r.setChecked(false);
            this.ad.setChecked(true);
        } else {
            this.x.setChecked(true);
            this.r.setChecked(false);
            this.ad.setChecked(false);
        }
    }

    private void e(int i) {
        if (i == -1) {
            this.be.setText(this.u);
            this.v.setVisibility(0);
            this.z.setVisibility(0);
            this.ar.setTextColor(getResources().getColor(R.color.textColorTertiary));
            this.bo.setClickable(false);
            return;
        }
        if (i == 0) {
            this.be.setText(this.q);
            this.v.setVisibility(8);
            this.z.setVisibility(8);
            this.ar.setTextColor(getResources().getColor(R.color.textColorPrimary));
            this.bo.setClickable(true);
            return;
        }
        if (i == 1) {
            this.be.setText(this.y);
            this.v.setVisibility(8);
            this.z.setVisibility(8);
            this.ar.setTextColor(getResources().getColor(R.color.textColorPrimary));
            this.bo.setClickable(true);
            return;
        }
        if (i == 2) {
            this.be.setText(this.ab);
            this.v.setVisibility(8);
            this.z.setVisibility(0);
            this.ar.setTextColor(getResources().getColor(R.color.textColorTertiary));
            this.bo.setClickable(false);
            return;
        }
        this.be.setText(this.u);
        this.v.setVisibility(0);
    }

    public void c(int i) {
        b(i);
        if (z()) {
            ao();
            return;
        }
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.dismiss();
            this.l = null;
        }
        a(i, 2);
        e(i);
        if (i == 2) {
            an();
        }
    }

    private void f(int i) {
        if (i <= 0) {
            this.az.setText(this.u);
            this.bu = 1992;
            this.aq = 0;
            this.k = 1;
            return;
        }
        this.bu = i / 10000;
        this.aq = ((i % 10000) / 100) - 1;
        this.k = i % 100;
        h();
    }

    private void h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.bu, this.aq, this.k);
        this.az.setText(UnitUtil.a(calendar.getTime(), 20));
    }

    private int c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("BindUserInfoActivity", "NumberFormatException");
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        this.be.setVisibility(0);
        this.bg.setVisibility(0);
        this.bi.setVisibility(0);
        this.az.setVisibility(0);
        e(this.ah.getGender());
        f(this.ah.getBirthday());
        ae();
        af();
        c(this.bj);
        e();
    }

    private void ae() {
        int height = this.ah.getHeight();
        if (height <= 0) {
            d();
            return;
        }
        if (UnitUtil.f()) {
            LogUtil.a("BindUserInfoActivity", "enter UNIT_IMPERIAL");
            int[] iArrG = {5, 7};
            if (height > 30) {
                iArrG = UnitUtil.g(((double) height) / 100.0d);
            }
            this.bg.setText(UnitUtil.e(iArrG[0], 1, 0) + " " + this.m.getResources().getString(R.string.IDS_ft) + " " + UnitUtil.e(iArrG[1], 1, 0) + " " + this.m.getResources().getString(R.string.IDS_ins));
            return;
        }
        LogUtil.a("BindUserInfoActivity", "enter UNIT_CM_KG");
        this.bg.setText(getResources().getString(R.string.IDS_hw_show_set_height_value_with_unit_cm, UnitUtil.e(height, 1, 0)));
    }

    private void d() {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: vsq
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.d(i, (dnj) obj);
            }
        });
    }

    public /* synthetic */ void d(int i, dnj dnjVar) {
        if (dnjVar != null && i == 0) {
            dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(dnjVar.i());
            int iE = singleUserById != null ? singleUserById.e() : 0;
            h(iE);
        }
        LogUtil.j("BindUserInfoActivity", "checkHeight : currentUser is null");
        h(iE);
    }

    private void h(final int i) {
        runOnUiThread(new Runnable() { // from class: vte
            @Override // java.lang.Runnable
            public final void run() {
                this.f51576c.d(i);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        HealthTextView healthTextView;
        if (i <= 0 && (healthTextView = this.bg) != null) {
            healthTextView.setText(this.u);
            return;
        }
        HiUserInfo hiUserInfo = this.ah;
        if (hiUserInfo != null) {
            hiUserInfo.setHeight(i);
        }
        ae();
    }

    private void af() {
        double dDoubleValue;
        float weight = this.ah.getWeight();
        float f = this.n;
        if (f > 0.0f) {
            a(f);
            weight = f;
        }
        if (weight <= 0.0f) {
            this.bi.setText(this.u);
            return;
        }
        if (UnitUtil.f()) {
            LogUtil.a("BindUserInfoActivity", "enter UNIT_IMPERIAL");
            this.bi.setText(getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_lb, UnitUtil.e(UnitUtil.h(weight), 1, 1)));
            return;
        }
        LogUtil.a("BindUserInfoActivity", "enter UNIT_CM_KG");
        try {
            dDoubleValue = Double.valueOf("" + weight).doubleValue();
        } catch (NumberFormatException unused) {
            LogUtil.e("BindUserInfoActivity", "refreshWeightText NumberFormatException");
            dDoubleValue = 0.0d;
        }
        this.bi.setText(getResources().getString(R.string.IDS_hw_show_set_weightvalue_with_unit_kg, UnitUtil.e(dDoubleValue, 1, 1)));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.dismiss();
            this.l = null;
        }
        if (this.bm != null) {
            this.bm = null;
        }
        NetworkStatusListener networkStatusListener = this.ap;
        if (networkStatusListener != null) {
            networkStatusListener.unregister(BaseApplication.getContext());
            this.ap = null;
        }
    }

    private void e(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.m, str, map, 0);
    }

    private void aq() {
        CommonDialog21 commonDialog21;
        if (this.as == null) {
            new CommonDialog21(this.m, R.style.app_update_dialogActivity);
            this.as = CommonDialog21.b(this.m);
        }
        if (isFinishing() || (commonDialog21 = this.as) == null) {
            return;
        }
        commonDialog21.b(getString(R.string.IDS_sns_waiting));
        this.as.setCancelable(false);
        this.as.c();
        this.as.show();
        LogUtil.a("BindUserInfoActivity", "showLoadingDialog...mLoadingDialog.show()");
    }

    public void e() {
        CommonDialog21 commonDialog21;
        if (isFinishing() || (commonDialog21 = this.as) == null) {
            return;
        }
        commonDialog21.cancel();
        this.as = null;
        LogUtil.a("BindUserInfoActivity", "destroy mLoadingDialog");
    }

    private void an() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.m);
        builder.e(getString(R.string.IDS_hw_health_show_common_dialog_title)).a(getString(R.string.IDS_hwh_home_gender_change_remind_content)).b(getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: vsu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindUserInfoActivity.e(view);
            }
        });
        builder.b().show();
    }

    private void ap() {
        LogUtil.a("BindUserInfoActivity", "showModifyConfirmDialog() enter");
        View viewInflate = View.inflate(this, R.layout.dialog_confirm_user_info, null);
        ((HealthCheckBox) viewInflate.findViewById(R.id.confirm_userinfo_dialog_box)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.BindUserInfoActivity$$ExternalSyntheticLambda19
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f28407a.a(compoundButton, z);
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.m);
        builder.d(viewInflate).c(getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: vta
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51572b.g(view);
            }
        }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: vtb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51573b.h(view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCanceledOnTouchOutside(false);
        customViewDialogD.show();
    }

    /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        LogUtil.a("BindUserInfoActivity", "modifyConfirmDialog onClick not remind");
        StorageParams storageParams = new StorageParams();
        if (z) {
            SharedPreferenceManager.e(this.m, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", "false", storageParams);
        } else {
            SharedPreferenceManager.e(this.m, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree", "true", storageParams);
        }
    }

    public /* synthetic */ void g(View view) {
        a(this.af.get(CommonConstant.KEY_GENDER).intValue(), 2);
        a(this.af.get("birthday").intValue(), 3);
        a(this.af.get("height").intValue(), 0);
        finish();
    }

    public /* synthetic */ void h(View view) {
        finish();
    }

    private boolean aa() {
        ArrayList<String> arrayListA = drw.e().a();
        boolean z = (arrayListA == null || arrayListA.size() == 0) ? false : true;
        if (dxm.g()) {
            z = true;
        }
        return z && !"false".equals(SharedPreferenceManager.e(this.m, Integer.toString(PrebakedEffectId.RT_HEARTBEAT), "health_userinfo_modify_agree"));
    }

    private boolean ad() {
        Map<String, Integer> map = this.af;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return (this.af.get(CommonConstant.KEY_GENDER).intValue() == this.ah.getGender() && this.af.get("birthday").intValue() == this.ah.getBirthday() && this.af.get("height").intValue() == this.ah.getHeight()) ? false : true;
    }

    private void aj() {
        LogUtil.a("BindUserInfoActivity", "showConfirmUserInfo() enter");
        if (ecf.e(this.at) == null && !this.ag && !dxm.ai(this.at) && !dxm.ab(this.at) && !"7a1063dd-0e0f-4a72-9939-461476ff0259".equals(this.at)) {
            i(R.string.IDS_device_wifi_release_auth_msg);
            LogUtil.e("BindUserInfoActivity", "showConfirmUserInfo wifi device is null");
            return;
        }
        String string = getString(R.string.IDS_device_exiting_binding);
        String string2 = getString(R.string.IDS_device_continue_to_improve);
        if (string.length() > 12 || string2.length() > 12) {
            j(R.string.IDS_device_confirm_user_info_back_prompt);
        } else {
            e(getString(R.string.IDS_device_confirm_user_info_back_prompt));
        }
    }

    private void j(int i) {
        CustomButtonMenuDialog customButtonMenuDialogD = new CustomButtonMenuDialog.Builder(this.m).c(R.string.IDS_hw_health_show_common_dialog_title).a(i).a(R.string.IDS_device_exiting_binding, new View.OnClickListener() { // from class: vsy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.f(view);
            }
        }).a(R.string.IDS_device_continue_to_improve, new View.OnClickListener() { // from class: vsx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("BindUserInfoActivity", "showCustomButtonMenuDialog continue improve");
            }
        }).d();
        if (customButtonMenuDialogD.isShowing()) {
            return;
        }
        customButtonMenuDialogD.show();
    }

    public /* synthetic */ void f(View view) {
        j();
    }

    private void e(String str) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.m);
        builder.e(getString(R.string.IDS_hw_health_show_common_dialog_title));
        builder.a(str).e(R.string.IDS_device_exiting_binding, new View.OnClickListener() { // from class: vsl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51563a.i(view);
            }
        }).a(R.string.IDS_device_continue_to_improve, new View.OnClickListener() { // from class: vss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("BindUserInfoActivity", "showCustomTextAlertDialog continue improve");
            }
        });
        builder.b().show();
    }

    public /* synthetic */ void i(View view) {
        j();
    }

    private void j() {
        if (dxm.ag(this.at)) {
            LogUtil.a("BindUserInfoActivity", "exitingBindingDevice onClick hagrid or herm");
            a(dmp.d().b(this.ba, false));
        } else if (dxm.c(this.at, this.ba)) {
            LogUtil.a("BindUserInfoActivity", "exitingBindingDevice onClick wifi");
            ab();
        } else {
            LogUtil.a("BindUserInfoActivity", "exitingBindingDevice onClick ble");
            ax();
        }
    }

    private void ah() {
        Bundle bundle = new Bundle();
        bundle.putString("huid", this.ah.getHuid());
        bundle.putString("uid", null);
        bundle.putInt("height", this.ah.getHeight());
        bundle.putInt(CommonConstant.KEY_GENDER, this.ah.getGender());
        bundle.putInt("age", this.ah.getAge());
        bundle.putFloat("weight", this.ah.getWeight());
        bundle.putInt("birthday", this.ah.getBirthday());
        EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
    }

    private void t() {
        LogUtil.a("BindUserInfoActivity", "has manager: ", Boolean.valueOf(this.ai));
        boolean zM = doq.e().m();
        LogUtil.d("BindUserInfoActivity", "gotoNextPage isResetWifi = ", Boolean.valueOf(zM));
        if (this.ai && !zM) {
            if (dxm.e(this.at, this.ba)) {
                k();
                return;
            } else {
                o();
                return;
            }
        }
        HagridDeviceBindResultFragment.setBindStatus(8);
        Bundle bundle = new Bundle();
        bundle.putString("view", "bindResultConfirm");
        bundle.putBoolean("isBindSuccess", true);
        bundle.putString("productId", this.at);
        bundle.putString("deviceSsid", this.o);
        bundle.putBoolean("isNfcConnect", this.aj);
        LogUtil.a("BindUserInfoActivity", "gotoNextPage HagridDeviceBindResultFragment put isNfcConnect is", Boolean.valueOf(this.aj));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", this.ba);
        contentValues.put("productId", this.at);
        bundle.putParcelable("commonDeviceInfo", contentValues);
        Intent intent = new Intent(this.m, (Class<?>) DeviceMainActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("config_mode", 5);
        ah();
        try {
            this.m.startActivity(intent);
            ag();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BindUserInfoActivity", "gotoNextPage startActivity ActivityNotFoundException.");
        }
        finish();
    }

    private void m() {
        if (dmp.d().b(this.ba, false) instanceof efx) {
            qpx.e(this.m, R.string.IDS_device_wifi_my_qrcode_add_member_success);
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.putExtra("arg1", "DeviceIntroduction");
        intent.putExtra("arg2", this.at);
        intent.putExtra("arg3", this.ba);
        intent.putExtra("sn", this.au);
        LogUtil.a("BindUserInfoActivity", "gotoDeviceActivity mSerialNumber:", dyg.b(this.au));
        if (dxm.z(this.at)) {
            LogUtil.a("BindUserInfoActivity", "gotoDeviceActivity isHonourScale bindSuccess");
            intent.putExtra("isBindSuccess", true);
        }
        intent.putExtra("FROM_BIND_USER_INFO", true);
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", this.at);
        contentValues.put("uniqueId", this.ba);
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            this.m.startActivity(intent);
            ag();
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BindUserInfoActivity", "gotoDeviceActivity startActivity ActivityNotFoundException.");
        }
        finish();
    }

    private boolean f() {
        boolean z;
        boolean z2 = false;
        if (this.ah.isGenderValid()) {
            z = true;
        } else {
            this.be.setTextColor(this.m.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (!this.ah.isBirthdayValid()) {
            this.az.setTextColor(this.m.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (!this.ah.isHeightValid()) {
            this.bg.setTextColor(this.m.getResources().getColor(R.color.me_rank_dec));
            z = false;
        }
        if (this.ah.isWeightValid()) {
            z2 = z;
        } else {
            this.bi.setTextColor(this.m.getResources().getColor(R.color.me_rank_dec));
        }
        LogUtil.a("BindUserInfoActivity", "checkUserDataDone  isCompleted = ", Boolean.valueOf(z2));
        return z2;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!TextUtils.isEmpty(this.f28405b) || this.ak || dxm.ai(this.at)) {
            aj();
        } else if (aa() && ad()) {
            ap();
        } else {
            super.onBackPressed();
        }
    }

    private void i(int i) {
        LogUtil.a("BindUserInfoActivity", "showUnBindDeviceDialog in");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(i);
        builder.c(R.string.IDS_device_measureactivity_result_confirm, new View.OnClickListener() { // from class: vsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.l(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void l(View view) {
        LogUtil.a("BindUserInfoActivity", "showUnBindDeviceDialog click positive button");
        finish();
    }

    private void c(dso dsoVar) {
        this.e.setText("--");
        this.j.setText("--");
        this.g.setVisibility(8);
        HiUserInfo hiUserInfo = this.ah;
        if (hiUserInfo == null || !hiUserInfo.isWeightValid() || !this.ah.isHeightValid()) {
            LogUtil.j("BindUserInfoActivity", "convertResisData mHiUserInfo is null");
            return;
        }
        if (dsoVar == null) {
            LogUtil.a("BindUserInfoActivity", "convertResisData bodyDatas is null");
            c(this.ah.getWeight(), this.ah.getHeight());
            return;
        }
        if (!w()) {
            LogUtil.j("BindUserInfoActivity", "convertResisData age is invalid");
            return;
        }
        double bodyFatRat = dsoVar.getBodyFatRat();
        double d2 = 0.0d;
        if (bodyFatRat > 0.0d) {
            LogUtil.a("BindUserInfoActivity", "the bodyFatRat is real");
            d2 = bodyFatRat / 100.0d;
        }
        double[] dArr = new double[dsoVar.m().length];
        System.arraycopy(dsoVar.m(), 0, dArr, 0, dsoVar.m().length);
        double[] dArrA = dyh.a(dArr);
        dyh dyhVarB = b(dxm.e(dsoVar), dArrA, dsoVar, d2);
        c(dyhVarB.b());
        if (dyh.b(dArrA)) {
            LogUtil.a("BindUserInfoActivity", "four electrode constructor invoke");
            b(dyhVarB.n());
        } else {
            LogUtil.a("BindUserInfoActivity", "eight electrode constructor invoke");
            b(dyhVarB.j());
        }
    }

    private dyh b(boolean z, double[] dArr, dso dsoVar, double d2) {
        if (z) {
            double[] dArr2 = new double[dsoVar.f().length];
            System.arraycopy(dsoVar.f(), 0, dArr2, 0, dsoVar.f().length);
            double[] dArrA = dyh.a(dArr2);
            if (dyh.b(dArr)) {
                return new dyh(this.ah.getHeight(), dsoVar.getWeight(), dne.a((byte) this.ah.getGender()), this.ah.getAge(), this.ah.getBirthday(), 4, dArr, d2, 1, dArrA);
            }
            return new dyh(this.ah.getHeight(), dsoVar.getWeight(), dne.a((byte) this.ah.getGender()), this.ah.getAge(), this.ah.getBirthday(), 8, dArr, d2, 2, dArrA);
        }
        if (dyh.b(dArr)) {
            return new dyh(this.ah.getHeight(), dsoVar.getWeight(), dne.a((byte) this.ah.getGender()), this.ah.getAge(), this.ah.getBirthday(), dArr[0], d2);
        }
        return new dyh(this.ah.getHeight(), dsoVar.getWeight(), dne.a((byte) this.ah.getGender()), this.ah.getAge(), this.ah.getBirthday(), dArr, d2);
    }

    private void c(float f, int i) {
        double dE = etn.e(f, i);
        if (dE > 0.0d) {
            this.e.setText(ltc.c(dE, 1, 1));
        } else {
            this.e.setText("--");
        }
    }

    private void b(double d2) {
        if (d2 <= 3.0d) {
            this.j.setText("--");
            this.g.setVisibility(8);
            return;
        }
        if (Double.compare(d2, 0.0d) <= 0.0d) {
            this.j.setText("--");
            this.g.setVisibility(8);
            return;
        }
        if (LanguageUtil.aj(this)) {
            this.i.setLayoutDirection(1);
        }
        if (LanguageUtil.o(this) || LanguageUtil.q(this)) {
            this.j.setText(ltc.c(d2, 1, 1));
            this.g.setVisibility(0);
        } else {
            this.j.setText(ltc.c(d2, 2, 1));
            this.g.setVisibility(8);
        }
    }

    private void c(double d2) {
        if (Double.compare(d2, 0.0d) > 0.0d) {
            this.e.setText(ltc.c(d2, 1, 1));
        } else {
            c(this.ah.getWeight(), this.ah.getHeight());
        }
    }

    private boolean w() {
        int i = Utils.o() ? 65 : 80;
        int iC = c(this.bu, this.aq, this.k);
        return iC >= 18 && iC <= i;
    }

    private int c(int i, int i2, int i3) {
        if (b(i, i2, i3)) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(1);
        int i5 = i4 - i;
        int i6 = calendar.get(2) - i2;
        return (i6 < 0 || (i6 == 0 && calendar.get(5) - i3 < 0)) ? i5 - 1 : i5;
    }

    static class d implements HiCommonListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<BindUserInfoActivity> f28408c;

        d(BindUserInfoActivity bindUserInfoActivity) {
            this.f28408c = new WeakReference<>(bindUserInfoActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            LogUtil.a("BindUserInfoActivity", "FetchUserDataListener onSuccess");
            BindUserInfoActivity bindUserInfoActivity = this.f28408c.get();
            if (bindUserInfoActivity != null) {
                bindUserInfoActivity.am.set(false);
                bindUserInfoActivity.b(i, obj, true);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("BindUserInfoActivity", "FetchUserDataListener onFailure errCode,", Integer.valueOf(i));
            BindUserInfoActivity bindUserInfoActivity = this.f28408c.get();
            if (bindUserInfoActivity != null) {
                bindUserInfoActivity.am.set(false);
                bindUserInfoActivity.b(i, obj, false);
            }
        }
    }

    static class a extends BaseHandler<BindUserInfoActivity> {
        a(BindUserInfoActivity bindUserInfoActivity) {
            super(bindUserInfoActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BindUserInfoActivity bindUserInfoActivity, Message message) {
            switch (message.what) {
                case 102:
                    bindUserInfoActivity.n();
                    break;
                case 103:
                    bindUserInfoActivity.ai();
                    break;
                case 104:
                    bindUserInfoActivity.c();
                    break;
                case 105:
                    bindUserInfoActivity.e();
                    break;
                case 106:
                    bindUserInfoActivity.r();
                    break;
            }
        }
    }

    private void a(HealthDevice healthDevice) {
        this.av = ResourceManager.c().d(this.at);
        ContentValues contentValues = new ContentValues();
        this.f = contentValues;
        contentValues.put("uniqueId", this.ba);
        this.f.put("productId", this.at);
        if (healthDevice == null) {
            LogUtil.j("BindUserInfoActivity", "device has unbind");
            au();
            return;
        }
        if (healthDevice instanceof eby) {
            eby ebyVar = (eby) healthDevice;
            if (!TextUtils.isEmpty(ebyVar.e())) {
                LogUtil.a("BindUserInfoActivity", "getDeviceId :", ebyVar.e());
                this.bn = ebyVar;
                a(ebyVar);
                return;
            }
        }
        if (healthDevice instanceof efx) {
            LogUtil.a("BindUserInfoActivity", "device instanceof BleDevice");
            au();
        } else {
            au();
        }
    }

    private void a(eby ebyVar) {
        if (!ecj.b(BaseApplication.getContext())) {
            qpx.a(this, com.huawei.plugindevice.R.string.IDS_device_wifi_not_network);
            return;
        }
        if (ebyVar != null) {
            LogUtil.a("BindUserInfoActivity", "onClickUnBind");
            if (ebyVar.a().m() == 2) {
                LogUtil.a("BindUserInfoActivity", "onClickUnBind==01");
                c(this, ebyVar.e());
                return;
            } else {
                LogUtil.a("BindUserInfoActivity", "onClickUnBind==02");
                e(ebyVar.e(), false);
                return;
            }
        }
        LogUtil.j("BindUserInfoActivity", " onClickUnBind mWFDevice is null");
    }

    private void e(String str, final boolean z) {
        this.s.c(str, new ICloudOperationResult() { // from class: vtc
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z2) {
                this.f51574c.c(z, (CloudCommonReponse) obj, str2, z2);
            }
        });
    }

    public /* synthetic */ void c(boolean z, CloudCommonReponse cloudCommonReponse, String str, boolean z2) {
        int iIntValue;
        String resultDesc;
        LogUtil.a("BindUserInfoActivity", "onClickUnBind :", Boolean.valueOf(z2));
        if (cloudCommonReponse == null) {
            iIntValue = -1;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (z2 || iIntValue == 112000000) {
            if (z) {
                LogUtil.a("BindUserInfoActivity", "unBindCloudDevice=operationResult=02");
                d("send_reset_cmd", new Bundle());
            } else {
                LogUtil.a("BindUserInfoActivity", "unBindCloudDevice=operationResult=02");
                au();
            }
        }
        LogUtil.j("BindUserInfoActivity", " unBindCloudDevice error:", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    private void c(Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BindUserInfoActivity", "sendExitAuthorization deviceid is null");
            return;
        }
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dltId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        this.bw.add(deviceServiceInfo);
        this.bt.setDeviceServiceInfo(this.bw);
        this.bt.setDevId(str);
        lqo.b(context).e(this.bt, new ICloudOperationResult() { // from class: vtp
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f51585c.a(str, (CloudCommonReponse) obj, str2, z);
            }
        });
    }

    public /* synthetic */ void a(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        if (z) {
            j(str);
            LogUtil.a("BindUserInfoActivity", "sendExitAuthorization success ");
        } else if (cloudCommonReponse != null) {
            Integer resultCode = cloudCommonReponse.getResultCode();
            int iIntValue = resultCode.intValue();
            LogUtil.j("BindUserInfoActivity", "errorCode = ", resultCode, " | errorDes = ", cloudCommonReponse.getResultDesc());
            if (iIntValue == 112000030) {
                au();
            } else {
                j(str);
            }
        }
    }

    private void au() {
        this.f.put("uniqueId", this.ba);
        this.f.put("productId", this.at);
        this.s.a(this.f, this.bn, this.av);
        eam.d().a(this.at);
        finish();
    }

    private void j(String str) {
        LogUtil.a("BindUserInfoActivity", "subUserUnBind in");
        this.bs.setDevId(str);
        lqo.b(dxw.d()).b(this.bs, new ICloudOperationResult() { // from class: vtl
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f51580c.b((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    public /* synthetic */ void b(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        LogUtil.a("BindUserInfoActivity", "subUserUnBind :", Boolean.valueOf(z));
        if (z) {
            au();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000030 || iIntValue == 112000000) {
            au();
        }
        LogUtil.j("BindUserInfoActivity", " subUserUnBind error:", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
    }

    private void d(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("BindUserInfoActivity", "processRestoreFactory illegal argments, eventType ", str);
            return;
        }
        str.hashCode();
        if (str.equals("send_reset_cmd")) {
            LogUtil.a("BindUserInfoActivity", "RESTORE_FACTORY_EVENT_SEND_RESET_COMMAND");
            EventBus.a(new EventBus.d("device_reset"));
        } else {
            LogUtil.j("BindUserInfoActivity", "processRestoreFactory unknow event_type");
        }
    }

    private void ab() {
        if (!ecj.b(BaseApplication.getContext())) {
            qpx.e(this, R.string.IDS_device_wifi_not_network);
            return;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(this.ba, false);
        if (measurableDeviceB instanceof eby) {
            eby ebyVar = (eby) measurableDeviceB;
            if (!TextUtils.isEmpty(ebyVar.e())) {
                LogUtil.a("BindUserInfoActivity", "getDeviceId :", ebyVar.e());
                this.bn = ebyVar;
            }
        }
        eby ebyVar2 = this.bn;
        if (ebyVar2 != null) {
            if (ebyVar2.a().m() == 2) {
                d(this, this.bn.e());
                return;
            } else {
                a(this.bn.e());
                return;
            }
        }
        dyg.a(false, "BindUserInfoActivity", " onClickUnBind mWFDevice is null");
    }

    private void d(Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            dyg.a(false, "BindUserInfoActivity", "sendExitAuthorizationWifi deviceid is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        HashMap map = new HashMap(16);
        map.put("dltId", LoginInit.getInstance(context).getAccountInfo(1011));
        deviceServiceInfo.setData(map);
        deviceServiceInfo.setSid("setDevParam");
        arrayList.add(deviceServiceInfo);
        this.bt.setDeviceServiceInfo(arrayList);
        this.bt.setDevId(str);
        lqo.b(context).e(this.bt, new ICloudOperationResult() { // from class: vtm
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.f51581a.c(str, (CloudCommonReponse) obj, str2, z);
            }
        });
    }

    public /* synthetic */ void c(String str, CloudCommonReponse cloudCommonReponse, String str2, boolean z) {
        if (z) {
            i(str);
            dyg.a(false, "BindUserInfoActivity", "sendExitAuthorizationWifi success ");
            return;
        }
        if (cloudCommonReponse != null) {
            int iIntValue = cloudCommonReponse.getResultCode().intValue();
            dyg.a(false, "BindUserInfoActivity", "errorCode = " + iIntValue + " | errorDes = " + cloudCommonReponse.getResultDesc());
            if (iIntValue == 112000030) {
                av();
            } else {
                i(str);
            }
        }
    }

    private void i(String str) {
        WifiDeviceExitAuthorizeSubUserReq wifiDeviceExitAuthorizeSubUserReq = new WifiDeviceExitAuthorizeSubUserReq();
        wifiDeviceExitAuthorizeSubUserReq.setDevId(str);
        lqo.b(dxw.d()).b(wifiDeviceExitAuthorizeSubUserReq, new ICloudOperationResult() { // from class: vtg
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.d.d((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    public /* synthetic */ void d(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        dyg.a(false, "BindUserInfoActivity", "subUserUnBind :" + z);
        if (z) {
            av();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000030 || iIntValue == 112000000) {
            av();
        } else {
            runOnUiThread(new Runnable() { // from class: vts
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51587c.a();
                }
            });
        }
        dyg.a(false, "BindUserInfoActivity", " subUserUnBind error:" + iIntValue + ",resultDesc:" + resultDesc);
    }

    private void a(String str) {
        if (str == null) {
            dyg.a(false, "BindUserInfoActivity", " proccessUnbind deviceId is null");
            return;
        }
        WifiDeviceUnbindReq wifiDeviceUnbindReq = new WifiDeviceUnbindReq();
        wifiDeviceUnbindReq.setDevId(str);
        dyg.a(false, "BindUserInfoActivity", "onClickUnBind :" + dyg.d(str));
        lqo.b(dxw.d()).e(wifiDeviceUnbindReq, new ICloudOperationResult() { // from class: vsw
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str2, boolean z) {
                this.e.c((CloudCommonReponse) obj, str2, z);
            }
        });
    }

    public /* synthetic */ void c(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
        int iIntValue;
        String resultDesc;
        dyg.a(false, "BindUserInfoActivity", "onClickUnBind :" + z);
        if (z) {
            av();
            return;
        }
        if (cloudCommonReponse == null) {
            iIntValue = Constants.CODE_UNKNOWN_ERROR;
            resultDesc = "unknown error";
        } else {
            iIntValue = cloudCommonReponse.getResultCode().intValue();
            resultDesc = cloudCommonReponse.getResultDesc();
        }
        if (iIntValue == 112000000) {
            av();
        } else {
            runOnUiThread(new Runnable() { // from class: vtd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51575c.b();
                }
            });
        }
        dyg.a(false, "BindUserInfoActivity", " onClickUnBind error:" + iIntValue + ",resultDesc:" + resultDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: aw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void b() {
        qpx.e(this, R.string.IDS_update_server_bussy);
    }

    private void av() {
        dxm.b(this.ba);
        dyg.a(false, "BindUserInfoActivity", " unBindLocalDevice currentDevice mBindProductId::" + this.at);
        if (this.bn != null) {
            SharedPreferenceManager.e(this, "wifi_weight_device", "support_multi_account_" + this.bn.e(), "", null);
            SharedPreferenceManager.e(this, "wifi_weight_device", "health_is_wifi_add_member_first_" + this.bn.e(), "false", null);
        }
        drw.e().l(this.ba);
        ClaimWeightDataManager.INSTANCE.unRegisterCallBack(getClass().getSimpleName());
        SharedPreferenceManager.e(this, String.valueOf(10000), "pressure_calibrate_hrv_userinfo_" + this.ba, "", null);
        SharedPreferenceManager.e(this, String.valueOf(10000), "wifi_scale_unit_change", "", null);
        if (this.av != null) {
            SharedPreferenceManager.e(this, String.valueOf(10000), "wife_device_send_event_to_kaka_" + this.av.h(), "", null);
        } else {
            LogUtil.j("BindUserInfoActivity", "unBindLocalDevice mProductInfo is null");
        }
        finish();
    }

    private void ax() {
        this.av = ResourceManager.c().d(this.at);
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("device_name", this.av.l().d());
        if (drw.e().h(this.at)) {
            LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==isDeviceKitUniversal");
            if (drw.e().j(this.at, this.ba)) {
                LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==unbindDeviceUniversalByUniqueId");
                drw.e().d(this.at, this.ba);
                drw.e().b(this.at, this.ba);
                if (dxm.ab(this.at)) {
                    LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==isHonourWeightDevice");
                    dxm.g(this.ba, "");
                    nuu.a().d(this.at, this.ba);
                }
                nuu.a().d(this.at, this.ba);
                lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
                finish();
                return;
            }
            return;
        }
        LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==else");
        String str = this.at;
        if (str != null && dxm.ab(str)) {
            LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==prepare");
            ac();
        }
        if (dmp.d().o(this.ba)) {
            LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==unbindDeviceByUniqueId");
            drw.e().d(this.at, this.ba, -5);
            if (dxm.ab(this.at)) {
                LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==isHonourWeightDevice");
                dxm.g(this.ba, "");
                nuu.a().d(this.at, this.ba);
            }
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
            setResult(102);
            finish();
        }
    }

    private void ac() {
        elh elhVarD = ResourceManager.c().d(this.at);
        if (elhVarD != null) {
            LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==prepare=productInfo");
            MeasureKit measureKitI = drw.e().i(elhVarD.q());
            if (measureKitI == null) {
                LogUtil.j("BindUserInfoActivity", "kit is null");
                return;
            }
            MeasureController measureController = measureKitI.getMeasureController();
            Bundle bundle = new Bundle();
            bundle.putInt("type", -5);
            bundle.putString("productId", this.at);
            if (measureController != null) {
                LogUtil.a("BindUserInfoActivity", "switchDeviceUnbind==prepare=mControl");
                measureController.prepare(drw.e().b(this.at), null, bundle);
                return;
            }
            return;
        }
        LogUtil.j("BindUserInfoActivity", "switchDeviceUnbind productInfo is null");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

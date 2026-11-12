package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.AchieveMessage;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.ucd.helper.gles.Obj3DBufferLoadAider;
import com.huawei.ucd.medal.MedalBackType;
import com.huawei.ucd.medal.MedalView;
import com.huawei.ucd.medal.MedalViewCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.lmf;
import defpackage.oru;
import defpackage.osb;
import defpackage.osf;
import defpackage.osv;
import defpackage.osz;
import defpackage.ota;
import defpackage.otl;
import defpackage.ouk;
import defpackage.oun;
import defpackage.ouo;
import defpackage.pal;
import defpackage.pao;
import defpackage.par;
import defpackage.pas;
import defpackage.paw;
import defpackage.pax;
import defpackage.qid;
import defpackage.qpb;
import defpackage.qqf;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveMedalMessageDialog extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ExecutorService f22095c;
    private HealthTextView aa;
    private LinearLayout ab;
    private ImageView ac;
    private HealthTextView ad;
    private HealthTextView af;
    private HealthTextView ag;
    private String ak;
    private UserProfileMgrApi an;
    private Context d;
    private LinearLayout e;
    private ImageView f;
    private HealthTextView g;
    private HealthTextView h;
    private HiUserInfo i;
    private int k;
    private String m;
    private String n;
    private int o;
    private MedalView r;
    private AchieveMessage s;
    private float t;
    private LinearLayout u;
    private float v;
    private FrameLayout w;
    private ImageView z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22097b = false;
    private int l = 0;
    private Bitmap j = null;
    private String p = "";
    private String y = "";
    private String x = "";
    private String al = "";
    private String ai = "";
    private String ah = "";
    private String ae = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f22096a = new Handler(Looper.getMainLooper()) { // from class: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            if (message.what == 1) {
                AchieveMedalMessageDialog.this.n();
            } else if (message.what == 2) {
                AchieveMedalMessageDialog.this.k();
            } else if (message.what == 5) {
                if (message.obj instanceof UserInfomation) {
                    AchieveMedalMessageDialog.this.b((UserInfomation) message.obj);
                } else {
                    LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "MSG_GET_USER_INFO_SUCCESS is not UserInfomation!");
                }
            } else if (message.what == 6) {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "MSG_GET_USER_INFO_FAIL");
            } else if (message.what == 4) {
                AchieveMedalMessageDialog.this.l();
            } else if (message.what == 7) {
                AchieveMedalMessageDialog.this.g();
            } else {
                LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "wrong type message");
                return;
            }
            super.handleMessage(message);
        }
    };
    private Runnable q = new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog.4
        @Override // java.lang.Runnable
        public void run() {
            otl otlVarB = otl.b(BaseApplication.getContext());
            HashMap map = new HashMap(2);
            map.put("medalID", AchieveMedalMessageDialog.this.n);
            osf osfVarB = otlVarB.b(9, map);
            if (osfVarB == null) {
                LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "enter data is null");
                return;
            }
            if (osfVarB instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVarB;
                AchieveMedalMessageDialog.this.ak = medalConfigInfo.acquireMessage();
                AchieveMedalMessageDialog.this.x = medalConfigInfo.acquireLightPromotionName();
                AchieveMedalMessageDialog.this.y = medalConfigInfo.acquireLightPromotionUrl();
                AchieveMedalMessageDialog.this.ah = medalConfigInfo.acquireMedalName();
                AchieveMedalMessageDialog.this.ae = medalConfigInfo.acquireLightDescription();
                AchieveMedalMessageDialog.this.k = medalConfigInfo.acquireMedalLabel();
                AchieveMedalMessageDialog.this.p = medalConfigInfo.acquireMedalType();
                int iAcquireMedalLevel = medalConfigInfo.acquireMedalLevel();
                AchieveMedalMessageDialog achieveMedalMessageDialog = AchieveMedalMessageDialog.this;
                achieveMedalMessageDialog.ai = osv.e(achieveMedalMessageDialog.p, String.valueOf(iAcquireMedalLevel));
                LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "promotion_name: ", AchieveMedalMessageDialog.this.x, " promotion_url: ", AchieveMedalMessageDialog.this.y);
                LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "enter medalText = ", AchieveMedalMessageDialog.this.ak, " mToShareMedalName = ", AchieveMedalMessageDialog.this.ah, " mToShareMedalLightDesc = ", AchieveMedalMessageDialog.this.ae);
            }
            AchieveMedalMessageDialog.this.f22096a.sendEmptyMessage(2);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(134217728);
        if (isLargerThanEmui910(CommonUtil.p()) || CommonUtil.bc() || SystemInfo.j()) {
            setStatusBarColor();
        }
        setContentView(R.layout.achieve_medal_message_dialog);
        qpb.d(this.d);
        cancelAdaptRingRegion();
        this.d = this;
        f22095c = Executors.newSingleThreadExecutor();
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.an = userProfileMgrApi;
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo != null) {
            this.al = pax.a(userInfo.getName());
        }
        if (d()) {
            i();
            boolean z = false;
            if (bundle != null && bundle.getBoolean("IS_REBUILD", false)) {
                z = true;
            }
            e(z);
            f();
            b();
            qpb.d(this.d);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            return;
        }
        LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "initMedalGainTime fail, finish");
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "onSaveInstanceState: outState is null");
        } else {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "onSaveInstanceState");
            bundle.putBoolean("IS_REBUILD", true);
        }
    }

    private boolean d() {
        try {
            Intent intent = getIntent();
            if (intent == null) {
                return false;
            }
            Serializable serializableExtra = intent.getSerializableExtra("message");
            if (!(serializableExtra instanceof AchieveMessage)) {
                LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "mMessage invalid ");
                return false;
            }
            this.s = (AchieveMessage) serializableExtra;
            this.f22097b = intent.getBooleanExtra("isMedalDialogInterceptorJump", false);
            this.m = this.s.getGainTime();
            this.p = this.s.acquireMedalType();
            this.o = this.s.acquireGainCount();
            if (TextUtils.isEmpty(this.m) || "0".equals(this.m)) {
                this.m = String.valueOf(System.currentTimeMillis());
            }
            String strAcquireMedalId = this.s.acquireMedalId();
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "initMedalGainTime mMedalGainTime = ", this.m, " mMedal = ", strAcquireMedalId, " count =", Integer.valueOf(this.o));
            if (pax.n(this.p) || pax.m(this.p)) {
                return true;
            }
            return !pax.f(strAcquireMedalId);
        } catch (ClassCastException e) {
            LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "AchieveMessageDialog e = ", e.getMessage());
            return false;
        }
    }

    private void i() {
        this.g = (HealthTextView) findViewById(R.id.medal_dialog_desc);
        this.f = (ImageView) findViewById(R.id.medal_dialog_pic_imageview);
        this.h = (HealthTextView) findViewById(R.id.medal_detail);
        setViewSafeRegion(false, (LinearLayout) findViewById(R.id.medal_message_dialog_title));
        this.h.setVisibility(4);
        ((HealthTextView) findViewById(R.id.medal_dialog_content)).setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_get_this_medals));
        j();
        if (this.f == null || !EnvironmentInfo.m()) {
            return;
        }
        this.f.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp), getResources().getDimensionPixelSize(R.dimen.hw_show_size_170_dp)));
    }

    private String b(String str, String str2, int i) {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "setGainTime name=", str, " type=", str2, " gainCount=", Integer.valueOf(i));
        if (i > 1 && pax.n(str2) && !TextUtils.isEmpty(str)) {
            return getResources().getQuantityString(R.plurals.IDS_plugin_achievement_tab_get_medals, i, Integer.valueOf(i), str);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_get_this_medals);
    }

    private void e(boolean z) {
        MedalInfo medalInfo = pas.d().d(true).get(osv.e(this.s.acquireMedalType(), String.valueOf(this.s.acquireMedalLevel())));
        if (medalInfo != null) {
            this.ak = medalInfo.getText();
            this.l = medalInfo.getEnableResId();
            this.ah = medalInfo.getText();
            this.ae = medalInfo.getContent();
        }
        this.t = ((getWindowManager().getDefaultDisplay().getWidth() / 2.0f) - 150.0f) + pao.e(this.d, 16.0f);
        this.v = pao.e(this.d, 50.0f) + 700.0f;
        String str = this.ak;
        if (str != null) {
            String strReplace = str.replace("/n", System.lineSeparator());
            this.ak = strReplace;
            this.g.setText(strReplace);
        } else {
            this.g.setText("");
        }
        String strAcquireMedalId = this.s.acquireMedalId();
        this.n = strAcquireMedalId;
        this.j = pax.a(strAcquireMedalId, true, false);
        UserInfomation userInfo = this.an.getUserInfo();
        if (userInfo != null) {
            this.al = pax.a(userInfo.getName());
        }
        if (this.j == null && medalInfo == null) {
            finish();
        } else {
            b(medalInfo, z);
        }
    }

    private void b(MedalInfo medalInfo, boolean z) {
        HashMap map = new HashMap(2);
        map.put("medalID", this.n);
        osf osfVarB = otl.b(this.d).b(9, map);
        if (osfVarB instanceof MedalConfigInfo) {
            MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVarB;
            this.p = medalConfigInfo.acquireMedalType();
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "initData: interceptorJump -> ", Boolean.valueOf(this.f22097b), "rebuild -> ", Boolean.valueOf(z));
            if (!this.f22097b && !z) {
                MessageObject messageObjectE = otl.b(this.d).e(medalConfigInfo);
                if (oru.a(this.d).getAdapter() != null) {
                    LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "generate Medal Message");
                    messageObjectE.setType(MessageConstant.ACQUIRE_MEDAL_TYPE);
                    oru.a(this.d).getAdapter().generateMessage(messageObjectE);
                }
            } else {
                LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "initData: isMedalDialogInterceptorJump");
            }
        }
        if (medalInfo == null) {
            if (!f22095c.isShutdown()) {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "medalInfo is null");
                f22095c.execute(this.q);
                f22095c.shutdown();
            }
        } else {
            o();
        }
        String strC = osz.c(this.n);
        if ("".equals(strC) || !ouk.a(this.d, this.n)) {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "STATIC IMG");
            d(medalInfo);
            return;
        }
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "3D medal");
        if (!e(strC)) {
            d(medalInfo);
        } else {
            h();
        }
    }

    private void b() {
        findViewById(R.id.medal_message_dialog_title_back_ImageView).setOnClickListener(new View.OnClickListener() { // from class: oya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        ((HealthButton) findViewById(R.id.medal_dialog_share_button)).setOnClickListener(new View.OnClickListener() { // from class: oxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44968a.c(view);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent();
                String strReplace = AchieveMedalMessageDialog.this.ae != null ? AchieveMedalMessageDialog.this.ae.replace("/n", System.lineSeparator()) : "";
                String str = AchieveMedalMessageDialog.this.ah != null ? AchieveMedalMessageDialog.this.ah : "";
                String str2 = AchieveMedalMessageDialog.this.m;
                intent.setClassName(AchieveMedalMessageDialog.this.d, PersonalData.CLASS_NAME_PERSONAL_MEDAL_DETAIL);
                intent.putExtra("medal_res_id", AchieveMedalMessageDialog.this.n);
                intent.putExtra("medal_des_id", strReplace);
                intent.putExtra("medal_content_id", str);
                intent.putExtra("medal_type_level", AchieveMedalMessageDialog.this.ai);
                intent.putExtra("medal_gain_time", str2);
                intent.putExtra("medal_gain_count", AchieveMedalMessageDialog.this.o);
                intent.putExtra("medal_type", AchieveMedalMessageDialog.this.p);
                intent.putExtra("click_x", AchieveMedalMessageDialog.this.t);
                intent.putExtra("click_y", AchieveMedalMessageDialog.this.v);
                intent.putExtra("medal_obtain_id", "true");
                intent.putExtra("promotion_name", AchieveMedalMessageDialog.this.x);
                intent.putExtra("promotion_url", AchieveMedalMessageDialog.this.y);
                AchieveMedalMessageDialog.this.d.startActivity(intent);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    public /* synthetic */ void c(View view) {
        if (PermissionUtil.a()) {
            m();
        } else {
            PermissionUtil.d(this.d, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.d) { // from class: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    AchieveMedalMessageDialog.this.m();
                }
            });
        }
    }

    private void j() {
        this.ab = (LinearLayout) findViewById(R.id.medal_theme_layout);
        this.u = (LinearLayout) findViewById(R.id.before_layout);
        this.z = (ImageView) findViewById(R.id.head_imageview);
        this.af = (HealthTextView) findViewById(R.id.medal_desc);
        this.ad = (HealthTextView) findViewById(R.id.medal_get_date);
        this.aa = (HealthTextView) findViewById(R.id.medal_content);
        this.ac = (ImageView) findViewById(R.id.medal_pic_imageview);
        this.ag = (HealthTextView) findViewById(R.id.name_textview);
        ImageView imageView = (ImageView) findViewById(R.id.vip_image);
        this.e = (LinearLayout) findViewById(R.id.account_layout);
        if (par.e()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        c();
        e();
    }

    private void e() {
        AchieveMessage achieveMessage = this.s;
        if (achieveMessage == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "initShareBackgroundView mMessage is null!");
            return;
        }
        String strAcquireMedalId = achieveMessage.acquireMedalId();
        if (TextUtils.isEmpty(strAcquireMedalId)) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "initShareBackgroundView medalId isEmpty");
            return;
        }
        Bitmap bitmapG = pax.g(strAcquireMedalId);
        if (bitmapG == null) {
            this.ab.setBackgroundResource(R.drawable.share_background);
        } else {
            this.ab.setBackground(new BitmapDrawable((Resources) null, bitmapG));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (!osb.c(this.d)) {
            paw.a(this.d);
            return;
        }
        Handler handler = this.f22096a;
        if (handler != null) {
            handler.sendEmptyMessage(7);
        }
    }

    private void b(boolean z, final Map<String, Object> map) {
        if (z) {
            this.u.post(new Runnable() { // from class: oxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(map);
                }
            });
            return;
        }
        Bitmap bitmapC = ouo.c(this.u);
        if (bitmapC != null) {
            osb.c(this.d, bitmapC, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map);
        }
        if (oru.b()) {
            lmf lmfVarD = lmf.d();
            map.put("type", 12);
            lmfVarD.c(this.d, AnalyticsValue.SUCCESSES_SHARE_1100011.value(), map, 0);
        }
    }

    public /* synthetic */ void e(Map map) {
        b(false, (Map<String, Object>) map);
    }

    public void c() {
        t();
    }

    private void t() {
        if ("1".equals(SharedPreferenceManager.e(this.d, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "updateUserName: isThirdLogin = 1");
            s();
        } else {
            this.an.getUserInfo(new BaseResponseCallback() { // from class: oyd
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.d(i, (UserInfomation) obj);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, UserInfomation userInfomation) {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "updateUserName: errCode = ", Integer.valueOf(i));
        if (i != 0) {
            this.f22096a.sendEmptyMessage(6);
            return;
        }
        if (userInfomation == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "get userinfo success but obtain null objData");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = userInfomation;
        messageObtain.what = 5;
        this.f22096a.sendMessage(messageObtain);
    }

    private void s() {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "updateUserNameFromLocal: fetchUserData");
        HiHealthManager.d(this.d).fetchUserData(new HiCommonListener() { // from class: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "fetchUserData onSuccess");
                AchieveMedalMessageDialog achieveMedalMessageDialog = AchieveMedalMessageDialog.this;
                achieveMedalMessageDialog.i = pal.d(obj, achieveMedalMessageDialog.i, AchieveMedalMessageDialog.this.f22096a, 4);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "fetchUserData onFailure");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "setUserNameFromLocal");
        HiUserInfo hiUserInfo = this.i;
        if (hiUserInfo == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "setUserNameFromLocal: mHiUserInfo is null");
            return;
        }
        this.ag.setText(TextUtils.isEmpty(hiUserInfo.getName()) ? osb.b() : this.i.getName());
        String strB = b(this.i.getHeadImgUrl());
        if (!TextUtils.isEmpty(strB)) {
            Bitmap bitmapA = qqf.a(this.d, strB);
            if (bitmapA != null) {
                this.z.setImageBitmap(bitmapA);
                return;
            } else {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "setUserNameFromLocal: localHeadBitmap is null");
                return;
            }
        }
        this.z.setImageResource(R.mipmap.ic_personal_head);
        LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "setUserNameFromLocal: localHeadImgPath is empty");
    }

    private String b(String str) {
        String str2;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "getHeadImageFromLocal: untrusted -> " + str);
            return "";
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 0) {
            str2 = this.d.getFilesDir() + "/photos/headimage/" + strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = this.d.getFilesDir() + "/photos/headimage/" + str;
        }
        if (new File(str2).exists()) {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "accountmigrate: getHeadImageFromLocal file.exists() yes");
        } else {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "accountmigrate: getHeadImageFromLocal file.exists() no");
            File[] fileArrListFiles = new File(this.d.getFilesDir() + "/photos/headimage").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                try {
                    return fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath();
                } catch (IOException unused) {
                    LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "getHeadImageFromLocal get local path fail: IOException");
                }
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UserInfomation userInfomation) {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "handleWhenGetUserInfoSuccess");
        if (userInfomation == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "handleWhenGetUserInfoSuccess: userinfo is null");
            return;
        }
        String name = userInfomation.getName();
        if (TextUtils.isEmpty(name)) {
            this.ag.setText(osb.b());
            String accountName = new UpApi(this.d).getAccountName();
            if (accountName != null) {
                c(accountName);
            }
        } else {
            this.ag.setText(name);
            c(name);
        }
        String picPath = userInfomation.getPicPath();
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this.d, picPath);
            if (bitmapA != null) {
                this.z.setImageBitmap(bitmapA);
                return;
            } else {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "handleWhenGetUserInfoSuccess: headBitmap is null");
                return;
            }
        }
        this.z.setImageResource(R.mipmap.ic_personal_head);
        LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "handleWhenGetUserInfoSuccess: headImgPath is empty");
    }

    private void c(String str) {
        if (!TextUtils.isEmpty(this.al)) {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "userName not empty ");
        } else {
            this.al = pax.a(str);
        }
    }

    private void f() {
        if (TextUtils.isEmpty(this.n)) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "initShareMedalView mMedalId isEmpty");
            return;
        }
        String strD = d(this.ak, this.p, this.o, this.m);
        if (strD == null) {
            strD = "";
        }
        this.ad.setText(strD);
        if (pax.a(this.n, true, false) != null) {
            this.ac.setImageBitmap(pax.a(this.n, true, false));
        } else {
            this.ac.setImageResource(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HealthTextView healthTextView;
        if (oun.d(1) && osb.d()) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(4);
        }
        String str = this.ae;
        String strReplace = str != null ? str.replace("/n", System.lineSeparator()) : "";
        String str2 = this.ah;
        String string = str2 != null ? str2 : "";
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = b(string, this.p, this.o);
        }
        if (TextUtils.isEmpty(string) && (healthTextView = this.g) != null && healthTextView.getText() != null) {
            string = this.g.getText().toString();
        }
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "initShareMedalContent name ", strReplace, " content ", string);
        this.af.setText(strReplace);
        this.aa.setText(string);
        if (oru.a(this.d).getAdapter() != null) {
            Map<String, Object> map = new HashMap<>(10);
            map.put("name", string);
            map.put("className", this.p);
            b(true, map);
        }
    }

    private void d(MedalInfo medalInfo) {
        Bitmap bitmap = this.j;
        if (bitmap != null) {
            this.f.setImageBitmap(bitmap);
        } else if (medalInfo == null) {
            finish();
        } else {
            this.f.setImageResource(this.l);
        }
    }

    private void h() {
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.medal_dialog_view);
        relativeLayout.setAlpha(0.0f);
        relativeLayout.setVisibility(0);
        HandlerExecutor.c(new Runnable() { // from class: oxx
            @Override // java.lang.Runnable
            public final void run() {
                relativeLayout.animate().alpha(1.0f).setDuration(500L).setListener(null);
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Bitmap bitmap = this.j;
        if (bitmap == null) {
            this.f.setImageResource(this.l);
        } else {
            this.f.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        HealthTextView healthTextView;
        if (this.ak == null || this.g == null || (healthTextView = this.h) == null) {
            return;
        }
        healthTextView.setVisibility(0);
        String strReplace = this.ak.replace("/n", System.lineSeparator());
        this.ak = strReplace;
        this.g.setText(strReplace);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.medal_dialog_content);
        if (healthTextView2 != null) {
            healthTextView2.setText(b(this.ah, this.p, this.o));
        }
        o();
    }

    private void o() {
        HashMap map = new HashMap(5);
        map.put("id", this.n);
        map.put("name", this.ah);
        map.put("type", this.p);
        map.put("label", Integer.valueOf(this.k));
        LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "setBiAnalytics id ", this.n, " mToShareMedalName ", this.ah, " mMedalType ", this.p, " mMedalLabel ", Integer.valueOf(this.k));
        String strValue = AnalyticsValue.MEDAL_MESSAGE_1100016.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "enter onDestroy");
        MedalView medalView = this.r;
        if (medalView != null) {
            medalView.e();
        }
        if (this.j != null) {
            this.j = null;
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "enter onResume");
        super.onResume();
        MedalView medalView = this.r;
        if (medalView != null) {
            medalView.onResume();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "enter onPause");
        super.onPause();
        MedalView medalView = this.r;
        if (medalView != null) {
            medalView.onPause();
        }
    }

    public Bitmap a(String str) {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "getBitmapFromPath: file not exists");
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "getBitmapFromPath: file not exists");
            return null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strC);
        if (bitmapDecodeFile == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", " bitmap is null");
        }
        return bitmapDecodeFile;
    }

    private String d(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        try {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "setGainTime medal_time = ", str3);
            return c(str, str2, i, UnitUtil.a(new Date(Long.parseLong(str3)), 20));
        } catch (NumberFormatException unused) {
            LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "setGainTime NumberFormatException");
            return "";
        }
    }

    private String c(String str, String str2, int i, String str3) {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "getMedalDate name=", str, " type=", str2, " gainCount=", Integer.valueOf(i), " timeStr=", str3);
        if (i > 1 && pax.n(str2)) {
            return getResources().getQuantityString(R.plurals.IDS_plugin_achievement_tab_get_medals_date, i, str3, Integer.valueOf(i));
        }
        return String.format(getResources().getString(R.string.IDS_plugin_achievement_tab_people_get_medal_date), str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.huawei.pluginachievement.ui.AchieveMedalMessageDialog] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.InputStream] */
    public boolean e(String str) throws Throwable {
        ?? r3;
        ?? r7;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        FileInputStream fileInputStream5;
        FileInputStream fileInputStream6;
        FileInputStream fileInputStream7;
        FileInputStream fileInputStream8;
        FileInputStream fileInputStream9;
        FileInputStream fileInputStream10;
        FileInputStream fileInputStream11;
        String str2 = CommonUtil.c(str) + File.separator;
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "initMedal: path is empty");
            return false;
        }
        String str3 = str2 + "texture.jpg";
        String str4 = str2 + "medal.tST";
        String str5 = str2 + "medal.nXYZ";
        ?? r15 = str2 + "medal.vXYZ";
        ?? r8 = str5;
        LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "tstPath = ", str4, " nxyzPath = ", r8, " vxyzPath = ", r15, " picPath = ", str3);
        Bitmap bitmapA = a(str3);
        if (bitmapA == null) {
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "initMedal bitmap is null!");
            return false;
        }
        FileInputStream fileInputStream12 = null;
        fileInputStream = null;
        FileInputStream fileInputStream13 = null;
        FileInputStream fileInputStream14 = null;
        FileInputStream fileInputStream15 = null;
        FileInputStream fileInputStream16 = null;
        fileInputStream12 = null;
        fileInputStream12 = null;
        fileInputStream12 = null;
        FileInputStream fileInputStream17 = null;
        try {
            try {
                FileInputStream fileInputStream18 = new FileInputStream(str4);
                try {
                    fileInputStream7 = new FileInputStream(str5);
                    try {
                        fileInputStream11 = new FileInputStream((String) r15);
                        try {
                            e(fileInputStream18, fileInputStream7, fileInputStream11, bitmapA);
                            a(fileInputStream18, fileInputStream7, fileInputStream11);
                            return true;
                        } catch (FileNotFoundException unused) {
                            fileInputStream13 = fileInputStream7;
                            fileInputStream10 = fileInputStream11;
                            fileInputStream5 = fileInputStream13;
                            fileInputStream12 = fileInputStream18;
                            fileInputStream6 = fileInputStream10;
                            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "close InputStream is exception");
                            r8 = fileInputStream6;
                            r15 = fileInputStream5;
                            a(fileInputStream12, r15, r8);
                            return false;
                        } catch (Exception unused2) {
                            fileInputStream14 = fileInputStream7;
                            fileInputStream9 = fileInputStream11;
                            fileInputStream3 = fileInputStream14;
                            fileInputStream12 = fileInputStream18;
                            fileInputStream4 = fileInputStream9;
                            LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "3D view load exception!");
                            r8 = fileInputStream4;
                            r15 = fileInputStream3;
                            a(fileInputStream12, r15, r8);
                            return false;
                        } catch (OutOfMemoryError unused3) {
                            fileInputStream15 = fileInputStream7;
                            fileInputStream8 = fileInputStream11;
                            fileInputStream = fileInputStream15;
                            fileInputStream12 = fileInputStream18;
                            fileInputStream2 = fileInputStream8;
                            LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "Obj3DBufferLoadAider.loadFromInputStream OutOfMemoryError");
                            r8 = fileInputStream2;
                            r15 = fileInputStream;
                            a(fileInputStream12, r15, r8);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream16 = fileInputStream11;
                            r7 = fileInputStream16;
                            fileInputStream17 = fileInputStream18;
                            r3 = fileInputStream7;
                            a(fileInputStream17, r3, r7);
                            throw th;
                        }
                    } catch (FileNotFoundException unused4) {
                        fileInputStream11 = null;
                    } catch (Exception unused5) {
                        fileInputStream11 = null;
                    } catch (OutOfMemoryError unused6) {
                        fileInputStream11 = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (FileNotFoundException unused7) {
                    fileInputStream10 = null;
                } catch (Exception unused8) {
                    fileInputStream9 = null;
                } catch (OutOfMemoryError unused9) {
                    fileInputStream8 = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream7 = null;
                }
            } catch (Throwable th4) {
                FileInputStream fileInputStream19 = fileInputStream12;
                ?? r5 = r15;
                th = th4;
                r3 = r5;
                fileInputStream17 = fileInputStream19;
                r7 = r8;
            }
        } catch (FileNotFoundException unused10) {
            fileInputStream5 = null;
            fileInputStream6 = null;
        } catch (Exception unused11) {
            fileInputStream3 = null;
            fileInputStream4 = null;
        } catch (OutOfMemoryError unused12) {
            fileInputStream = null;
            fileInputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            r3 = 0;
            r7 = 0;
        }
    }

    private void e(InputStream inputStream, InputStream inputStream2, InputStream inputStream3, Bitmap bitmap) {
        qid.b(new WeakReference(new ota()));
        new Obj3DBufferLoadAider().a(this.d, inputStream, inputStream2, inputStream3, new AnonymousClass6(bitmap, inputStream, inputStream2, inputStream3));
    }

    /* JADX INFO: renamed from: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog$6, reason: invalid class name */
    public class AnonymousClass6 implements Obj3DBufferLoadAider.OnLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f22103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputStream f22104c;
        final /* synthetic */ InputStream d;
        final /* synthetic */ Bitmap e;

        AnonymousClass6(Bitmap bitmap, InputStream inputStream, InputStream inputStream2, InputStream inputStream3) {
            this.e = bitmap;
            this.d = inputStream;
            this.f22104c = inputStream2;
            this.f22103b = inputStream3;
        }

        @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
        public void onLoadOK(Obj3DBufferLoadAider.b bVar) {
            if (bVar == null) {
                LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", " onLoadOK result is null");
                final AchieveMedalMessageDialog achieveMedalMessageDialog = AchieveMedalMessageDialog.this;
                achieveMedalMessageDialog.runOnUiThread(new Runnable() { // from class: oye
                    @Override // java.lang.Runnable
                    public final void run() {
                        achieveMedalMessageDialog.p();
                    }
                });
            } else {
                LogUtil.d("PluginAchievement_AchieveMedalMessageDialog", "onLoadOK result = ", bVar.toString());
                AchieveMedalMessageDialog.this.a(bVar, this.e);
                AchieveMedalMessageDialog.this.a(this.d, this.f22104c, this.f22103b);
            }
        }

        @Override // com.huawei.ucd.helper.gles.Obj3DBufferLoadAider.OnLoadListener
        public void onLoadFailed(String str) {
            AchieveMedalMessageDialog.this.f22096a.sendEmptyMessage(1);
            AchieveMedalMessageDialog.this.a(this.d, this.f22104c, this.f22103b);
            LogUtil.j("PluginAchievement_AchieveMedalMessageDialog", "loadFromInputStream onLoadFailed msg = ", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Obj3DBufferLoadAider.b bVar, final Bitmap bitmap) {
        runOnUiThread(new Runnable() { // from class: oyf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(bitmap, bVar);
            }
        });
    }

    public /* synthetic */ void e(Bitmap bitmap, Obj3DBufferLoadAider.b bVar) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.medal_message_dialog);
        this.w = frameLayout;
        if (frameLayout == null) {
            return;
        }
        MedalView medalView = this.r;
        if (medalView != null) {
            frameLayout.removeView(medalView);
        }
        MedalView medalView2 = new MedalView(this.d);
        this.r = medalView2;
        medalView2.setLayerType(2, null);
        this.r.setBackContent(new String[]{StringUtils.c((Object) this.al), pax.b(this.m)}, MedalBackType.ModelType.SOLID_CIRCLE, MedalBackType.ColorType.GOLD);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = this.d.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (systemService instanceof WindowManager) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "loadFromInputStream setTexture.");
        this.r.setTexture(bitmap, new AnonymousClass10());
        this.r.setTouchRect(new Rect(0, pao.e(this.d, 100.0f), 1080, displayMetrics.heightPixels - pao.e(this.d, 250.0f)));
        this.r.setObjData(bVar);
        this.r.setAnimatorScaleX(0.02f, 0.08f);
        this.r.setAnimatorScaleY(0.02f, 0.08f);
        this.r.setAnimatorRotationY(0.0f, 360.0f);
        this.r.setAnimatorPositionX(this.t, displayMetrics.widthPixels / 2.0f);
        this.r.setAnimatorPositionY(this.v, (displayMetrics.heightPixels / 3.0f) + pao.e(this.d, 50.0f));
        this.r.setAnimatorDuration(1000L);
        this.w.addView(this.r);
        this.r.b();
    }

    /* JADX INFO: renamed from: com.huawei.pluginachievement.ui.AchieveMedalMessageDialog$10, reason: invalid class name */
    public class AnonymousClass10 implements MedalViewCallback {
        AnonymousClass10() {
        }

        @Override // com.huawei.ucd.medal.MedalViewCallback
        public void onResponse(int i, String str) {
            LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "loadFromInputStream Id=", AchieveMedalMessageDialog.this.n, " code=", Integer.valueOf(i), " res=", str);
            if (i == -1) {
                final AchieveMedalMessageDialog achieveMedalMessageDialog = AchieveMedalMessageDialog.this;
                achieveMedalMessageDialog.runOnUiThread(new Runnable() { // from class: oyb
                    @Override // java.lang.Runnable
                    public final void run() {
                        achieveMedalMessageDialog.p();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("PluginAchievement_AchieveMedalMessageDialog", "showWithAnimatorFail!");
        a();
        q();
    }

    private void a() {
        MedalView medalView;
        FrameLayout frameLayout = this.w;
        if (frameLayout == null || (medalView = this.r) == null) {
            return;
        }
        frameLayout.removeView(medalView);
        this.r = null;
    }

    private void q() {
        ImageView imageView = this.f;
        if (imageView == null) {
            return;
        }
        Bitmap bitmap = this.j;
        if (bitmap == null) {
            imageView.setImageResource(this.l);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InputStream inputStream, InputStream inputStream2, InputStream inputStream3) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "tst InputStream close exception!");
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
                LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "nxy InputStream close exception!");
            }
        }
        if (inputStream3 != null) {
            try {
                inputStream3.close();
            } catch (IOException unused3) {
                LogUtil.e("PluginAchievement_AchieveMedalMessageDialog", "xyz InputStream close exception!");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

package com.huawei.featureuserprofile.me;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.caloriecalculate.ActivityCaloriesCalculateApi;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.me.MyTargetActivity;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.UserInformationCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.model.UserInfomation;
import defpackage.chh;
import defpackage.ddq;
import defpackage.dmg;
import defpackage.exz;
import defpackage.fga;
import defpackage.imz;
import defpackage.iun;
import defpackage.lmf;
import defpackage.nkf;
import defpackage.qgm;
import defpackage.qqj;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class MyTargetActivity extends BaseActivity implements View.OnClickListener {
    private static int[] d = {R.style.setting_goal_sport_target_text, R.style.settarget_unit_text_style, R.style.setting_goal_weight_target_text, R.style.setting_goal_weight_target_text};
    private ImageView aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private ImageView ae;
    private HealthButton af;
    private HealthTextView ag;
    private ImageView ai;
    private RelativeLayout aj;
    private HealthTextView ak;
    private HealthTextView al;
    private ImageView am;
    private ImageView an;
    private HealthTextView ap;
    private double ar;
    private CustomTitleBar as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5578b;
    private View e;
    private HealthTextView f;
    private View g;
    private LinearLayout h;
    private HealthTextView i;
    private Context j;
    private int k;
    private int l;
    private HealthTextView o;
    private HealthTextView p;
    private int q;
    private UserInfomation r;
    private int t;
    private HealthTextView u;
    private LinearLayout v;
    private LinearLayout x;
    private HealthTextView y;
    private HealthOpenSDK m = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5579c = false;
    private HealthSeekBar z = null;
    private MotionGoal n = new MotionGoal();
    private HiUserInfo s = new HiUserInfo();
    private Handler ah = new b(this);
    private Runnable w = new Runnable() { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.3
        @Override // java.lang.Runnable
        public void run() {
            MyTargetActivity.this.c();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5577a = false;
    private HealthSeekBar.OnSeekBarChangeListener ao = new HealthSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.2
        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
        }

        @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
            LogUtil.a("Main_MyTargetActivity", "onProgressChanged() value:", Integer.valueOf(i));
            int i2 = ((i / 1000) * 1000) + 2000;
            MyTargetActivity.this.a(i2);
            MyTargetActivity.this.n.setGoalType(1);
            MyTargetActivity.this.n.setStepGoal(i2);
        }
    };

    public static /* synthetic */ void a(View view) {
    }

    private int c(int i, int i2) {
        return i > i2 ? -1 : 1;
    }

    private void h() {
        this.m = fga.d(this).e();
    }

    private float c(int i) {
        if (i <= 0) {
            LogUtil.j("Main_MyTargetActivity", "steps is less or equal than 0");
            return 0.0f;
        }
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        if (activityCaloriesCalculateApi == null) {
            return 0.0f;
        }
        activityCaloriesCalculateApi.initUserInfo(e());
        return activityCaloriesCalculateApi.calculateCaloriesOnlyStep(i);
    }

    private int d(float f, int i, int i2) {
        long jCalculateDurationByCalories;
        ActivityCaloriesCalculateApi activityCaloriesCalculateApi = (ActivityCaloriesCalculateApi) Services.b("BaseSportModel", ActivityCaloriesCalculateApi.class);
        if (activityCaloriesCalculateApi != null) {
            activityCaloriesCalculateApi.initUserInfo(e());
            jCalculateDurationByCalories = activityCaloriesCalculateApi.calculateDurationByCalories(f, i, i2);
        } else {
            jCalculateDurationByCalories = 0;
        }
        return (int) jCalculateDurationByCalories;
    }

    private chh e() {
        chh.c cVar = new chh.c();
        HiUserInfo hiUserInfo = this.s;
        if (hiUserInfo != null) {
            cVar.c(hiUserInfo.getAge()).e(this.s.getHeight() / 100.0f).c(this.s.getWeight()).b(this.s.getGender());
        }
        return cVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("Main_MyTargetActivity", "refreshStepGoalView() value:", Integer.valueOf(i));
        if (i <= 7000) {
            k();
        } else if (i <= 13000) {
            m();
        } else {
            n();
        }
        float fAbs = Math.abs(c(i));
        LogUtil.a("Main_MyTargetActivity", "calorieValue=", Float.valueOf(fAbs));
        this.f.setText(getResources().getString(R.string.IDS_hw_show_set_target_calorie, NumberFormat.getInstance().format(fAbs)));
        e(this.ad, R.plurals.IDS_hwh_me_other_target_steps, i, 1, d);
        int iD = d(fAbs, 257, 1);
        String quantityString = getResources().getQuantityString(R.plurals.IDS_hw_show_sport_timeline_mins, iD, Integer.valueOf(iD));
        int iD2 = d(fAbs, 258, 1);
        String quantityString2 = getResources().getQuantityString(R.plurals.IDS_hw_show_sport_timeline_mins, iD2, Integer.valueOf(iD2));
        int iD3 = d(fAbs, 259, 1);
        String quantityString3 = getResources().getQuantityString(R.plurals.IDS_hw_show_sport_timeline_mins, iD3, Integer.valueOf(iD3));
        LogUtil.a("Main_MyTargetActivity", "footSportTime ", Integer.valueOf(iD), " runSportTime ", Integer.valueOf(iD2), " bikeSportTime ", Integer.valueOf(iD3));
        this.o.setText(quantityString);
        this.p.setText(quantityString2);
        this.i.setText(quantityString3);
        this.ad.setVisibility(0);
        this.f.setVisibility(0);
        this.o.setVisibility(0);
        this.p.setVisibility(0);
        this.i.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Main_MyTargetActivity", "onCreate");
        super.onCreate(bundle);
        if (!LoginInit.getInstance(this).getIsLogined()) {
            finish();
            return;
        }
        this.j = this;
        setContentView(R.layout.hw_show_set_goal_activity);
        j();
        h();
        this.n.setStepGoal(10000);
        this.q = getIntent().getIntExtra("from", 6);
    }

    private void j() {
        LogUtil.a("Main_MyTargetActivity", "initView 222");
        if (LanguageUtil.ba(this.j)) {
            d = new int[]{R.style.setting_goal_sport_target_text, R.style.settarget_unit_text_rt_style, R.style.setting_goal_weight_target_text, R.style.setting_goal_weight_target_text};
        }
        a();
        d();
        o();
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        this.r = userInfo;
        if (userInfo == null) {
            this.r = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        e(this.r);
        this.z.setTouchable(true);
        this.z.setMax(18000);
        b(this.n.getStepGoal());
        if (UnitUtil.f()) {
            b(0.0d);
        } else {
            d(0.0d);
        }
        this.z.setOnSeekBarChangeListener(this.ao);
        i();
        Drawable drawable = getResources().getDrawable(R.drawable.ic_health_home_steps);
        drawable.setBounds(0, 0, drawable.getMinimumHeight(), drawable.getMinimumHeight());
    }

    private void a() {
        this.as = (CustomTitleBar) findViewById(R.id.me_mytarget_titlebar);
        this.ap = (HealthTextView) findViewById(R.id.hw_show_set_target_weight_unit);
        this.z = (HealthSeekBar) findViewById(R.id.set_step_goal_seekbar);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.hw_show_set_target_steps);
        this.ad = healthTextView;
        healthTextView.setVisibility(0);
        this.f = (HealthTextView) findViewById(R.id.hw_show_set_target_calorie);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.hw_show_set_target_weight);
        this.al = healthTextView2;
        healthTextView2.setVisibility(0);
        this.o = (HealthTextView) findViewById(R.id.hw_show_set_target_foot_min);
        this.p = (HealthTextView) findViewById(R.id.hw_show_set_target_run_min);
        this.ak = (HealthTextView) findViewById(R.id.target_ignore_text);
        this.ag = (HealthTextView) findViewById(R.id.target_complete_text);
        this.aj = (RelativeLayout) findViewById(R.id.hw_set_target_tips);
        this.i = (HealthTextView) findViewById(R.id.hw_show_set_target_bike_min);
        this.y = (HealthTextView) findViewById(R.id.hw_show_set_target_sport_little);
        this.ac = (HealthTextView) findViewById(R.id.hw_show_set_target_sport_match);
        this.ab = (HealthTextView) findViewById(R.id.hw_show_set_target_sport_server);
        this.af = (HealthButton) findViewById(R.id.hw_target_save_goa);
        this.h = (LinearLayout) findViewById(R.id.health_data_edit_weight_goal);
        this.u = (HealthTextView) findViewById(R.id.set_goal_activity_target_about_as);
        this.aa = (ImageView) findViewById(R.id.sport_target_icon);
        this.ae = (ImageView) findViewById(R.id.target_foot_min_icon);
        this.an = (ImageView) findViewById(R.id.target_run_min_icon);
        this.ai = (ImageView) findViewById(R.id.target_bike_min_icon);
        this.am = (ImageView) findViewById(R.id.health_set_target_weight_icon);
        this.x = (LinearLayout) findViewById(R.id.set_goal_activity_layout2);
        this.v = (LinearLayout) findViewById(R.id.set_goal_activity_layout10);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        f();
    }

    private void f() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new UserInformationCallback<MyTargetActivity>(this) { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.1
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, final UserInfomation userInfomation) {
                final MyTargetActivity myTargetActivity;
                if (userInfomation == null) {
                    LogUtil.j("Main_MyTargetActivity", "UserInfoCallback getUserInfo failed");
                } else {
                    if (this.mReference == null || (myTargetActivity = (MyTargetActivity) this.mReference.get()) == null) {
                        return;
                    }
                    myTargetActivity.runOnUiThread(new Runnable() { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (myTargetActivity.isFinishing()) {
                                return;
                            }
                            myTargetActivity.e(userInfomation);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UserInfomation userInfomation) {
        if (!userInfomation.isHeightValid() || !userInfomation.isWeightValid()) {
            this.aj.setVisibility(0);
            this.ag.setText(this.j.getResources().getString(R.string.IDS_profile_dialog_go_perfect).toUpperCase());
            this.ak.setText(this.j.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase());
            return;
        }
        this.aj.setVisibility(8);
    }

    private void o() {
        this.af.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.ac.setOnClickListener(this);
        this.ab.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.ak.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.as.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyTargetActivity.this.b();
            }
        });
    }

    private void d() {
        this.e = findViewById(R.id.mBigCD3);
        this.g = findViewById(R.id.mBigCD4);
        this.e.setVisibility(0);
        this.g.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        if (qrs.af(this.j)) {
            this.e.setVisibility(8);
            this.g.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            this.x.setLayoutParams(layoutParams);
            this.v.setLayoutParams(layoutParams);
            this.y.setTextSize(1, 13.0f);
            this.ac.setTextSize(1, 13.0f);
            this.ab.setTextSize(1, 13.0f);
            this.f.setTextSize(1, 14.0f);
            this.u.setTextSize(1, 13.0f);
            this.o.setTextSize(1, 13.0f);
            this.p.setTextSize(1, 13.0f);
            this.i.setTextSize(1, 13.0f);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class d implements ResponseCallback<Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MyTargetActivity> f5587b;

        d(MyTargetActivity myTargetActivity) {
            this.f5587b = new WeakReference<>(myTargetActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Float f) {
            MyTargetActivity myTargetActivity = this.f5587b.get();
            if (myTargetActivity == null || myTargetActivity.isFinishing() || myTargetActivity.isDestroyed()) {
                ReleaseLogUtil.e("Main_MyTargetActivity", "WeakGoalInfoHiCommonListener activity ", myTargetActivity);
                return;
            }
            if (f == null) {
                myTargetActivity.ar = 0.0d;
                myTargetActivity.ah.sendEmptyMessage(106);
            } else {
                myTargetActivity.ah.sendMessage(myTargetActivity.ah.obtainMessage(102, 0, 0, Double.valueOf(Double.parseDouble(String.valueOf(f)))));
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class a implements HiCommonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MyTargetActivity> f5584a;

        a(MyTargetActivity myTargetActivity) {
            this.f5584a = new WeakReference<>(myTargetActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            MyTargetActivity myTargetActivity = this.f5584a.get();
            if (myTargetActivity == null) {
                return;
            }
            LogUtil.a("Main_MyTargetActivity", "fetchUserData onSuccess,data = ", obj);
            if (obj != null) {
                List list = (List) obj;
                if (list.size() > 0) {
                    LogUtil.a("Main_MyTargetActivity", "fetchUserData onSuccess");
                    myTargetActivity.s = (HiUserInfo) list.get(0);
                    myTargetActivity.k = myTargetActivity.s.getGender();
                    myTargetActivity.l = myTargetActivity.s.getHeight();
                    myTargetActivity.ah.sendMessage(myTargetActivity.ah.obtainMessage(105, 0, 0, obj));
                    LogUtil.d("Main_MyTargetActivity", "birthday==", Integer.valueOf(myTargetActivity.s.getBirthday()), "gender==", Integer.valueOf(myTargetActivity.s.getGender()));
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("Main_MyTargetActivity", "fetchUserData onFailure");
        }
    }

    public void c() {
        nkf.a().a(new d(this));
        HiHealthManager.d(this.j).fetchUserData(new a(this));
        qgm.c("900200006", new c());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        try {
            super.onResume();
            ThreadPoolManager.c().a("getHeightIsNotSet", new Runnable() { // from class: com.huawei.featureuserprofile.me.MyTargetActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    MyTargetActivity.this.f5578b = dmg.a().getHeightIsNotSet();
                    MyTargetActivity.this.ah.post(MyTargetActivity.this.w);
                }
            });
        } catch (BadParcelableException e) {
            LogUtil.a("Main_MyTargetActivity", "BadParcelableException e =", e.getMessage());
        } catch (Exception unused) {
            LogUtil.a("Main_MyTargetActivity", "onResume Exception e");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.y) {
            b(5000);
            return;
        }
        if (view == this.ac) {
            b(10000);
            return;
        }
        if (view == this.ab) {
            b(17000);
            return;
        }
        if (view == this.af) {
            HashMap map = new HashMap();
            map.put("click", 1);
            lmf.d().c(this.j, AnalyticsValue.HEALTH_MINE_SETTINGS_MY_TARGET_SAVE_2040033.value(), map, 0);
            ddq.d().setEvent(this.j, String.valueOf(1200), new HashMap());
            b();
            return;
        }
        if (view == this.h) {
            if (imz.d()) {
                LogUtil.a("Main_MyTargetActivity", "onClick isFastClickCard");
                return;
            }
            this.f5579c = true;
            if (Utils.o()) {
                iun.b(this.j, "#/AddTarget", (Bundle) null);
                return;
            } else if (dmg.a().getLastestWeight() > 0.0f) {
                iun.b(this.j, "#/AddTarget", (Bundle) null);
                return;
            } else {
                s();
                return;
            }
        }
        if (view == this.ak) {
            this.aj.setVisibility(8);
        } else if (view == this.ag) {
            AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(this.j);
        } else {
            LogUtil.a("Main_MyTargetActivity", "onClick is null");
        }
    }

    private void s() {
        new NoTitleCustomAlertDialog.Builder(this).b(R.string.IDS_set_current_weight_hint).c(R.string.IDS_main_btn_state_settings, new View.OnClickListener() { // from class: cwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31441b.d(view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: cwh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTargetActivity.a(view);
            }
        }).c().show();
    }

    public /* synthetic */ void d(View view) {
        imz.e(this, 65.0d, 20.0d);
    }

    public void b() {
        LogUtil.a("Main_MyTargetActivity", "enter saveData");
        this.f5577a = true;
        int stepGoal = this.n.getStepGoal();
        if (stepGoal == this.t) {
            ReleaseLogUtil.d("Main_MyTargetActivity", "saveData failed, no need to save with not changed,", Integer.valueOf(stepGoal));
            finish();
        } else {
            qgm.b("900200006", stepGoal);
            d(c(this.t, stepGoal), stepGoal);
            LogUtil.a("Main_MyTargetActivity", "saveData step is ", Integer.valueOf(stepGoal));
            this.ah.sendEmptyMessage(101);
        }
    }

    private void d(int i, int i2) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("type", 1);
        map.put("from", Integer.valueOf(this.q));
        map.put("adjustType", Integer.valueOf(i));
        map.put("value", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040111.value(), map, 0);
    }

    private void c(double d2) {
        LogUtil.a("Main_MyTargetActivity", "updateWeightTargetInfor() enter");
        a(true);
        this.ap.setVisibility(8);
        if (UnitUtil.f()) {
            e(this.al, R.plurals.IDS_lb_string, d2, 2, d);
        } else {
            e(this.al, R.plurals.IDS_kg_string, d2, 0, d);
        }
    }

    private void e(HealthTextView healthTextView, int i, double d2, int i2, int... iArr) {
        int length;
        int i3;
        LogUtil.a("Main_MyTargetActivity", "setDifferentTextSize() ");
        double dH = i2 == 2 ? UnitUtil.h(d2) : d2;
        String strE = UnitUtil.e(dH, 1, i2 == 1 ? 0 : e(dH));
        String quantityString = getResources().getQuantityString(i, (int) dH, strE);
        int length2 = strE.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        LogUtil.d("Main_MyTargetActivity", "setDifferentText= ", quantityString.substring(0, length2), Marker.ANY_NON_NULL_MARKER, String.valueOf(dH), Marker.ANY_NON_NULL_MARKER, quantityString);
        if (quantityString.substring(0, length2).equals(strE)) {
            length = spannableStringBuilder.length();
            i3 = length2;
        } else {
            int length3 = spannableStringBuilder.length();
            int length4 = spannableStringBuilder.length();
            int length5 = spannableStringBuilder.length() - length2;
            int i4 = length3 - length2;
            length = length4;
            i3 = i4;
            length2 = length5;
        }
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getApplicationContext(), i2 == 1 ? iArr[0] : iArr[2]), 0, length2, 17);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getApplicationContext(), iArr[1]), i3, length, 17);
        healthTextView.setText(spannableStringBuilder);
    }

    private int e(double d2) {
        if (d2 == Double.valueOf(d2).intValue()) {
            return 0;
        }
        return Math.round(Math.pow(10.0d, 2.0d) * d2) % 10 == 0 ? 1 : 2;
    }

    private void k() {
        this.y.setTextColor(getResources().getColor(R.color.textColorPrimary));
        this.ac.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ab.setTextColor(getResources().getColor(R.color.textColorSecondary));
    }

    private void n() {
        this.y.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ac.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ab.setTextColor(getResources().getColor(R.color.textColorPrimary));
    }

    private void m() {
        this.y.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ac.setTextColor(getResources().getColor(R.color.textColorPrimary));
        this.ab.setTextColor(getResources().getColor(R.color.textColorSecondary));
    }

    private void b(int i) {
        int i2 = i - 2000;
        LogUtil.a("Main_MyTargetActivity", "mStepGoalSeekbar.setProgress: ", Integer.valueOf(i2));
        this.z.setProgress(i2);
        a(i);
    }

    private void b(double d2) {
        LogUtil.a("Main_MyTargetActivity", "(kgToLb)  mWeightGoalSeekbar.setProgress: ", Integer.valueOf(imz.a(((float) UnitUtil.h(d2)) - 22.0f)));
        c(d2);
    }

    private void d(double d2) {
        LogUtil.a("Main_MyTargetActivity", "mWeightGoalSeekbar.setProgress: ", Double.valueOf(d2 - 10.0d));
        c(d2);
    }

    /* JADX INFO: loaded from: classes6.dex */
    class b extends BaseHandler<MyTargetActivity> {
        b(MyTargetActivity myTargetActivity) {
            super(myTargetActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyTargetActivity myTargetActivity, Message message) {
            switch (message.what) {
                case 101:
                    qqj.a(myTargetActivity.getApplicationContext(), 6);
                    if (myTargetActivity.f5577a) {
                        Intent intent = MyTargetActivity.this.getIntent();
                        if (intent != null) {
                            intent.putExtra("StepGoal", MyTargetActivity.this.n.getStepGoal());
                            MyTargetActivity.this.setResult(-1, intent);
                        }
                        myTargetActivity.finish();
                        LogUtil.a("Main_MyTargetActivity", "savesuccess");
                        break;
                    }
                    break;
                case 102:
                    myTargetActivity.c(message.obj);
                    break;
                case 104:
                    myTargetActivity.e(MyTargetActivity.this.n.getStepGoal());
                    break;
                case 105:
                case 106:
                    myTargetActivity.l();
                    break;
                case 107:
                    int i = message.arg1;
                    LogUtil.a("Main_MyTargetActivity", "initData stepGoalValue is ", Integer.valueOf(i));
                    MyTargetActivity.this.e(i);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        boolean z;
        LogUtil.a("Main_MyTargetActivity", "showTarget data ", obj);
        if (obj instanceof Double) {
            this.ar = ((Double) obj).doubleValue();
            z = true;
        } else {
            this.ar = 0.0d;
            z = false;
        }
        dmg.a().setUserGoalWeight((float) this.ar);
        if (z) {
            if (UnitUtil.f()) {
                b(this.ar);
                return;
            } else {
                d(this.ar);
                return;
            }
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i > 0) {
            b(i);
        } else {
            b(10000);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        setIntent(null);
        super.finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.ah;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.ap.setVisibility(8);
        double d2 = this.ar;
        if (d2 == 0.0d) {
            if (g()) {
                this.al.setText("--");
                this.al.setTextSize(1, 35.0f);
                this.ap.setVisibility(0);
                if (UnitUtil.f()) {
                    this.ap.setText(getResources().getString(R.string.IDS_weight_target_lbs));
                    return;
                } else {
                    this.ap.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_unit));
                    return;
                }
            }
            a(true);
            int iIntValue = new BigDecimal(exz.d((byte) this.k, this.l, this.s.getAge())).setScale(0, 4).intValue();
            if (UnitUtil.f()) {
                b(iIntValue);
                return;
            } else {
                d(iIntValue);
                return;
            }
        }
        c(d2);
    }

    private boolean g() {
        int i = this.l;
        return (i == 170 && this.f5578b) || i == 0;
    }

    private void a(boolean z) {
        if (z) {
            this.af.setEnabled(true);
            this.af.setBackgroundResource(R.drawable.button_background_emphasize);
        } else {
            this.af.setEnabled(false);
            this.af.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        }
    }

    private void i() {
        b(this.aa, R.drawable.ic_health_home_steps);
        b(this.ae, R.drawable.hw_show_set_target_sport_walk);
        b(this.an, R.drawable.hw_show_set_target_sport_run);
        b(this.ai, R.drawable.hw_show_set_target_sport_bike);
        b(this.am, R.drawable.common_ui_arrow_right);
    }

    private void b(ImageView imageView, int i) {
        if (LanguageUtil.ba(this.j)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.j, i);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageResource(i);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MyTargetActivity> f5586c;

        private c(MyTargetActivity myTargetActivity) {
            this.f5586c = new WeakReference<>(myTargetActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            int stepGoal;
            LogUtil.a("Main_MyTargetActivity", "onResponse: errorCode = ", Integer.valueOf(i), " objData = ", obj == null ? null : obj.toString());
            MyTargetActivity myTargetActivity = this.f5586c.get();
            if (myTargetActivity == null) {
                LogUtil.j("Main_MyTargetActivity", "onResponse: provider is null");
                return;
            }
            if (!(obj instanceof Integer) || myTargetActivity.f5579c) {
                stepGoal = myTargetActivity.n.getStepGoal();
                LogUtil.d("Main_MyTargetActivity", "effectiveGoal: ", Integer.valueOf(stepGoal));
            } else {
                Integer num = (Integer) obj;
                stepGoal = num.intValue();
                myTargetActivity.t = stepGoal;
                LogUtil.d("Main_MyTargetActivity", "effectiveGoal: ", num, "mInitGoal: ", Integer.valueOf(myTargetActivity.t));
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 107;
            messageObtain.arg1 = stepGoal;
            myTargetActivity.ah.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

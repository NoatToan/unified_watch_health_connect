package com.huawei.pluginsocialshare.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.view.EditShareCustomFragment;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.gyd;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pju;
import defpackage.pkj;
import defpackage.pln;
import defpackage.pmn;
import defpackage.pmo;
import defpackage.pnn;
import defpackage.pno;
import defpackage.pnq;
import defpackage.pns;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes42.dex */
public class SharePopupActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f22438a;
    private LinearLayout aa;
    private qpn ab;
    private LinearLayout ac;
    private LinearLayout ad;
    private HealthSubTabWidget ae;
    private HealthDivider af;
    private CustomTitleBar ag;
    private HealthSwitchButton ah;
    private SharedPreferences ai;
    private HealthViewPager aj;
    private RelativeLayout ak;
    private ViewStub al;
    private LinearLayout am;
    private LinearLayout ap;
    private LinearLayout aq;
    private LinearLayout ar;
    private LinearLayout as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Animation f22439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22440c;
    private Animation d;
    private Context e;
    private gxt f;
    private HealthTextView g;
    private View i;
    private boolean k;
    private boolean l;
    private int o;
    private ImageView p;
    private pkj q;
    private LinearLayout r;
    private pjm s;
    private LinearLayout u;
    private pju v;
    private LinearLayout w;
    private RelativeLayout x;
    private gxt y;
    private SystemLocaleChangeReceiver z;
    private boolean t = false;
    private boolean m = false;
    private boolean n = false;
    private int j = -1;
    private int an = -1;
    private Handler h = new Handler() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("Share_SharePopupActivity", "receive empty msg");
            } else if (message.what != 1) {
                LogUtil.j("Share_SharePopupActivity", "msg unknown");
            } else if (message.obj instanceof Bitmap) {
                SharePopupActivity.this.p.setImageBitmap((Bitmap) message.obj);
            }
        }
    };

    private void b(Activity activity) {
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (qqs.e(activity)) {
            decorView.setSystemUiVisibility((systemUiVisibility & (-8193)) | HealthData.WEIGHT);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility | 9984);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CommonUtil.bb()) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.common_color_white));
            b((Activity) this);
        }
        getWindow().setFormat(-2);
        this.e = this;
        if (!LoginInit.getInstance(this).getIsLogined()) {
            finish();
            return;
        }
        setContentView(R.layout.activity_share_main);
        cancelAdaptRingRegion();
        ab();
        if (t()) {
            gxt gxtVarE = pjm.e();
            this.f = gxtVarE;
            this.o = gxtVarE.u();
            v();
            pnq.d(this.y);
            return;
        }
        LogUtil.e("Share_SharePopupActivity", "initShareData fail, finish");
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        LogUtil.a("Share_SharePopupActivity", "onMultiWindowModeChanged isInMultiWindowMode = ", Boolean.valueOf(z));
        if (z) {
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.n = false;
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.m) {
            LogUtil.a("Share_SharePopupActivity", "finish when is already finishing");
            return;
        }
        this.m = true;
        LogUtil.a("Share_SharePopupActivity", "start finish");
        y();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("androidx.lifecycle.BundlableSavedStateRegistry.key");
    }

    private void af() {
        boolean zV = qrs.v();
        if (zV) {
            d(R.id.activity_share_layout_trable, R.id.activity_share_layout_trable_inflated);
        } else {
            d(R.id.activity_share_layout, R.id.activity_share_layout_inflated);
        }
        View view = this.i;
        if (view != null) {
            this.as = (LinearLayout) view.findViewById(R.id.share_wechat_friends_layout);
            this.ar = (LinearLayout) this.i.findViewById(R.id.share_wechat_chat_layout);
            this.aa = (LinearLayout) this.i.findViewById(R.id.share_xiaohongshu_layout);
            this.u = (LinearLayout) this.i.findViewById(R.id.share_douyin_layout);
            this.aq = (LinearLayout) this.i.findViewById(R.id.share_weibo_layout);
            this.am = (LinearLayout) this.i.findViewById(R.id.share_family_group_layout);
            this.w = (LinearLayout) this.i.findViewById(R.id.share_save_to_local_layout);
            this.ap = (LinearLayout) this.i.findViewById(R.id.share_more_layout);
            this.ad = (LinearLayout) this.i.findViewById(R.id.share_save_pdf_layout);
            this.ac = (LinearLayout) this.i.findViewById(R.id.share_print_layout);
            if (zV) {
                return;
            }
            int iD = qrs.d(this.e, 0.0f);
            c(this.ad, iD);
            c(this.ac, iD);
            c(this.ar, iD);
            c(this.as, iD);
            c(this.aa, iD);
            c(this.u, iD);
            c(this.aq, iD);
            c(this.am, iD);
            c(this.w, iD);
            c(this.ap, 0);
        }
    }

    private void d(int i, int i2) {
        if (this.al == null) {
            this.al = (ViewStub) findViewById(i);
        }
        if (this.al.getParent() != null) {
            this.i = this.al.inflate();
        } else {
            this.i = findViewById(i2);
        }
    }

    private void ad() {
        setIntent(null);
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        pjm pjmVar = this.s;
        if (pjmVar != null) {
            pjmVar.a();
            this.s = null;
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.h = null;
        }
        RelativeLayout relativeLayout = this.ak;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        HealthDivider healthDivider = this.af;
        if (healthDivider != null) {
            healthDivider.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        super.finish();
    }

    private void y() {
        boolean z = !BaseApplication.h() && this.m;
        ad();
        if (this.f22438a == null || this.x == null || z) {
            e();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fly_down_out);
        this.d = animationLoadAnimation;
        this.f22438a.startAnimation(animationLoadAnimation);
        RelativeLayout relativeLayout = this.ak;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(this.d);
        }
        if (this.t) {
            this.f22439b = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.preview_fade_out);
        } else {
            this.f22439b = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mask_fade_out);
        }
        this.f22439b.setFillAfter(true);
        this.x.startAnimation(this.f22439b);
        this.f22439b.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SharePopupActivity.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        ad();
        LogUtil.a("Share_SharePopupActivity", "super.finish");
        super.finish();
    }

    private void i() {
        af();
        ImageView imageView = (ImageView) findViewById(R.id.share_watermark_icon);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.share_watermark_text);
        this.x = (RelativeLayout) findViewById(R.id.share_main);
        this.f22438a = (RelativeLayout) findViewById(R.id.dst_selector);
        this.r = (LinearLayout) findViewById(R.id.oversea_share_layout);
        this.p = (ImageView) findViewById(R.id.preview_img);
        imageView.setImageResource(R.mipmap.healthlogo_hw_show_app);
        healthTextView.setText(R.string.IDS_app_name_health);
        c(this.ad).setImageResource(R.drawable.share_save_pdf_icon);
        c(this.ac).setImageResource(R.drawable.share_print_icon);
        c(this.as).setImageResource(R.drawable.share_wechat_friends_icon);
        c(this.ar).setImageResource(R.drawable.share_wechat_chat_icon);
        ImageView imageViewC = c(this.aa);
        ImageView imageViewC2 = c(this.u);
        imageViewC.setImageDrawable(pns.b(imageViewC));
        imageViewC2.setImageDrawable(pns.e(imageViewC2));
        c(this.aq).setImageResource(R.drawable.share_weibo_icon);
        c(this.am).setImageResource(R.mipmap.share_familygroup_icon);
        c(this.ap).setImageResource(R.drawable.share_more_icon);
        c(this.w).setImageResource(R.mipmap.share_save_local_new);
        d(this.ad).setText(R.string.IDS_plugin_socialshare_save_pdf);
        d(this.ac).setText(R.string.IDS_plugin_socialshare_print);
        d(this.as).setText(R.string.IDS_plugin_socialshare_wechat_friends);
        d(this.ar).setText(R.string.IDS_plugin_socialshare_wechat_chat);
        d(this.aa).setText(R.string.IDS_plugin_socialshare_xhs);
        d(this.u).setText(R.string.IDS_plugin_socialshare_douyin);
        d(this.aq).setText(R.string.IDS_plugin_socialshare_weibo);
        d(this.am).setText(R.string.IDS_hwh_family_health_zone);
        d(this.ap).setText(R.string.IDS_user_profile_more_new);
        d(this.w).setText(R.string.IDS_hwh_show_save_local);
        n();
        aa();
        this.ad.setOnClickListener(this);
        this.ac.setOnClickListener(this);
        this.as.setOnClickListener(this);
        this.ar.setOnClickListener(this);
        this.aa.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.aq.setOnClickListener(this);
        this.am.setOnClickListener(this);
        this.ap.setOnClickListener(this);
    }

    private void aa() {
        if (this.y.u() == 7) {
            this.as.setVisibility(8);
            this.ar.setVisibility(8);
            this.aa.setVisibility(8);
            this.u.setVisibility(8);
            this.am.setVisibility(8);
        }
        if (EnvironmentInfo.m()) {
            this.ap.setVisibility(8);
            this.w.setVisibility(8);
        }
        int iU = this.y.u();
        boolean z = true;
        this.aq.setVisibility(iU == 2 || iU == 0 || iU == 7 || b(iU) ? 8 : 0);
        if (iU == 1 && "2100005".equals(this.y.o())) {
            this.aa.setVisibility(0);
            this.u.setVisibility(0);
        }
        if (iU == 8 || iU == 9 || b(iU)) {
            this.as.setVisibility(8);
        }
        if (b(iU)) {
            this.ap.setVisibility(8);
        }
        if (iU != 0 && iU != 2 && iU != 11 && (iU != 10 || this.y.r() != null)) {
            z = false;
        }
        this.w.setVisibility(z ? 8 : 0);
        if (this.y.i() && this.y.u() != 7) {
            this.am.setVisibility(0);
        } else {
            this.am.setVisibility(8);
        }
        this.ad.setVisibility(this.y.ac() ? 0 : 8);
        this.ac.setVisibility(this.y.ab() ? 0 : 8);
    }

    private boolean b(int i) {
        return i == 10 && this.y.r() != null;
    }

    private void n() {
        if (Utils.o() && this.y.u() != 7) {
            this.i.setVisibility(8);
            this.r.setVisibility(0);
            HealthButton healthButton = (HealthButton) findViewById(R.id.oversea_save_local_btn);
            HealthButton healthButton2 = (HealthButton) findViewById(R.id.oversea_share_btn);
            healthButton.setOnClickListener(this);
            healthButton2.setOnClickListener(this);
            return;
        }
        this.i.setVisibility(0);
        this.r.setVisibility(8);
    }

    private void c(LinearLayout linearLayout, int i) {
        if (linearLayout == null) {
            LogUtil.j("Share_SharePopupActivity", "setLayoutParams() layout is null.");
        } else if (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMarginEnd(i);
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private boolean t() {
        gxt gxtVarE = pjm.e();
        this.y = gxtVarE;
        if (gxtVarE == null) {
            LogUtil.j("Share_SharePopupActivity", "mShareContent is null");
            return false;
        }
        boolean z = gxtVarE.u() == 6 || this.y.u() == 13;
        this.l = z;
        if (z) {
            for (gxy gxyVar : this.y.e()) {
                String strC = gxyVar.c();
                if (!gxyVar.m() && gxyVar.d() == null && !pnn.c(strC)) {
                    return false;
                }
                if (gxyVar.m()) {
                    gxyVar.b(this.y.aa());
                }
            }
        }
        q();
        return true;
    }

    private void v() {
        int i = this.e.getResources().getConfiguration().uiMode;
        if (pnq.b() != 0 && (i & 48) != pnq.b() && !this.l) {
            ae();
        }
        i();
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        this.f22438a.setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fly_up_in)));
        int iU = this.y.u();
        this.ag = (CustomTitleBar) findViewById(R.id.share_title_main_bar);
        x();
        if (iU == 1 || iU == 4 || iU == 5 || (iU == 10 && this.y.r() != null)) {
            r();
            this.t = true;
            p();
            if (!CommonUtil.bu() && !CommonUtil.ap() && this.y.z()) {
                this.ak.setVisibility(0);
                this.af.setVisibility(0);
            }
            overridePendingTransition(R.anim.fade_in, 0);
            return;
        }
        if (iU == 7) {
            r();
            this.t = true;
            p();
            overridePendingTransition(R.anim.fade_in, 0);
            return;
        }
        if (iU == 6) {
            r();
            this.t = true;
            if (!CommonUtil.bu() && !CommonUtil.ap() && this.y.z()) {
                this.ak.setVisibility(0);
                this.af.setVisibility(0);
            }
            m();
            overridePendingTransition(R.anim.fade_in, 0);
            return;
        }
        if (iU == 13) {
            r();
            this.t = true;
            l();
            overridePendingTransition(R.anim.fade_in, 0);
            return;
        }
        this.t = false;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background_layout);
        relativeLayout.setVisibility(0);
        relativeLayout.setOnClickListener(this);
        overridePendingTransition(R.anim.mask_fade_in, 0);
    }

    private void k() {
        this.ag.setVisibility(0);
        this.ag.setTitleBarBackgroundColor(qre.e(R.color.hw_hongmeng_bg));
        this.ag.setTitleText(getResources().getString(R.string.IDS_title_preview));
        if (LanguageUtil.ba(this.e)) {
            this.ag.setRightButtonDrawable(qqz.e(this.e, R.mipmap.ic_share_pop), qre.f(R.string.accessibility_share));
            this.ag.setLeftButtonDrawable(qqz.e(this.e, R.mipmap.ic_share_back), qre.f(R.string.accessibility_go_back));
        } else {
            this.ag.setRightButtonDrawable(qre.c(R.mipmap.ic_share_pop), qre.f(R.string.accessibility_share));
            this.ag.setLeftButtonDrawable(qre.c(R.mipmap.ic_share_back), qre.f(R.string.accessibility_go_back));
        }
        this.ag.setRightButtonVisibility(0);
        this.ag.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.j("Share_SharePopupActivity", "click too fast");
                } else {
                    ReleaseLogUtil.e("Share_SharePopupActivity", "initMultiImageTitleBar getShareContentView is finish? ", Boolean.valueOf(SharePopupActivity.this.v.c()));
                    SharePopupActivity.this.v.h();
                }
            }
        });
    }

    private void r() {
        this.ag.setVisibility(0);
        Context context = this.e;
        if (context != null) {
            this.ag.setTitleBarBackgroundColor(context.getResources().getColor(R.color.colorBackground));
        }
    }

    private void p() {
        ((RelativeLayout) findViewById(R.id.img_preview)).setVisibility(0);
        lsy.a(new Runnable() { // from class: pkd
            @Override // java.lang.Runnable
            public final void run() {
                this.f45533a.d();
            }
        });
    }

    public /* synthetic */ void d() {
        Bitmap bitmapA = pnq.a(this.y);
        if (bitmapA == null || this.h == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = bitmapA;
        this.h.sendMessage(messageObtain);
    }

    private void l() {
        Boolean boolB = pns.b();
        boolB.booleanValue();
        k();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sport_multiple_img_preview);
        relativeLayout.setVisibility(0);
        this.f22438a.setVisibility(8);
        pju pjuVar = new pju(this.e, getSupportFragmentManager(), boolB);
        this.v = pjuVar;
        relativeLayout.addView(pjuVar.d());
    }

    private void m() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.multiple_img_preview);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.guide_user_customiz_share_content);
        this.g = healthTextView;
        healthTextView.setOnClickListener(this);
        relativeLayout.setVisibility(0);
        this.aj = (HealthViewPager) findViewById(R.id.cardViewPager);
        if (LanguageUtil.ba(this.e)) {
            this.aj.setRotationY(180.0f);
        }
        this.aj.setOffscreenPageLimit(5);
        pkj pkjVar = new pkj(getSupportFragmentManager(), this.y.e());
        this.q = pkjVar;
        this.aj.setAdapter(pkjVar);
        this.aj.setCurrentItem(this.y.d());
        this.aj.setPageMargin(0);
        this.aj.setPageTransformer(true, new pno());
        j();
        if (this.y.k()) {
            s();
            g();
        } else if (this.aj.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.aj.getLayoutParams();
            layoutParams.setMarginStart(qrs.d(this.e, 24.0f));
            layoutParams.setMarginEnd(qrs.d(this.e, 24.0f));
            this.aj.setLayoutParams(layoutParams);
        }
        if (this.q != null) {
            for (int i = 0; i < this.q.getCount(); i++) {
                if (this.aj.getCurrentItem() == i && (this.q.getItem(i) instanceof EditShareCustomFragment)) {
                    b((EditShareCustomFragment) this.q.getItem(i));
                    break;
                }
            }
        }
        relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SharePopupActivity.this.aj.onTouchEvent(motionEvent);
                return true;
            }
        });
        a();
        a(this.y.d());
    }

    private void x() {
        if (CommonUtil.bu() || CommonUtil.ap()) {
            return;
        }
        this.ak = (RelativeLayout) findViewById(R.id.rl_share_userinfo);
        this.af = (HealthDivider) findViewById(R.id.userinfo_divder);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.share_userinfo_switch);
        this.ah = healthSwitchButton;
        healthSwitchButton.setChecked(pnq.j());
        this.ah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity$$ExternalSyntheticLambda5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.c(compoundButton, z);
            }
        });
    }

    /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        if (this.f22440c) {
            this.f22440c = false;
        } else if (z) {
            pnq.c(true);
        } else {
            pnq.b(this, R.string.IDS_share_close_info_title, R.string.IDS_share_info_content_next, new View.OnClickListener() { // from class: pjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pnq.c(false);
                }
            }, new View.OnClickListener() { // from class: pkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45532b.a(view);
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        this.ah.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == this.j || TextUtils.isEmpty(this.y.t())) {
            return;
        }
        ArrayList<gxy> arrayListE = this.y.e();
        if (i >= arrayListE.size()) {
            ReleaseLogUtil.e("Share_SharePopupActivity", "setWebpageTab position:", Integer.valueOf(i), " shareSportData.size(): ", Integer.valueOf(arrayListE.size()));
            return;
        }
        if (arrayListE.get(i).g() != 2) {
            this.y.e(this.o);
        } else {
            this.y.e(2);
            z();
        }
        aa();
    }

    private void z() {
        if (TextUtils.isEmpty(this.y.t())) {
            this.y.d(qqf.e());
        } else {
            lsy.a(new Runnable() { // from class: pkb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45531c.b();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        Bitmap bitmapC = qqf.c(this.e, this.y.t());
        if (bitmapC == null) {
            bitmapC = qqf.e();
        }
        this.y.d(bitmapC);
    }

    private void a() {
        this.aj.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == SharePopupActivity.this.j) {
                    if (SharePopupActivity.this.q.getItem(i) instanceof EditShareCustomFragment) {
                        EditShareCustomFragment editShareCustomFragment = (EditShareCustomFragment) SharePopupActivity.this.q.getItem(i);
                        editShareCustomFragment.setUserVisibleHint(true);
                        SharePopupActivity.this.b(editShareCustomFragment);
                        editShareCustomFragment.b();
                    }
                    SharePopupActivity.this.h();
                    SharePopupActivity.this.c(i, true);
                    return;
                }
                LogUtil.j("Share_SharePopupActivity", "Hide pop position not equal to mEditPageCurrentPosition.");
                SharePopupActivity.this.c();
                SharePopupActivity.this.c(i, false);
                SharePopupActivity.this.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (Utils.o() && this.y.u() != 7) {
            this.r.setVisibility(0);
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.r.setVisibility(8);
        }
        this.ag.setTitleText(getResources().getString(R.string.IDS_title_preview));
        this.ag.setRightTextVisible(4);
        if (CommonUtil.bu() || CommonUtil.ap() || !this.y.z()) {
            return;
        }
        this.ak.setVisibility(0);
        this.af.setVisibility(0);
        boolean zJ = pnq.j();
        if (this.ah.isChecked() != zJ) {
            this.f22440c = true;
            this.ah.setChecked(zJ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final EditShareCustomFragment editShareCustomFragment) {
        this.i.setVisibility(8);
        this.r.setVisibility(8);
        this.ag.setTitleText(getResources().getString(R.string.IDS_plugin_socialshare_share));
        this.ag.setRightTextContent(getResources().getString(R.string.IDS_contact_confirm));
        this.ag.setRightTextVisible(0);
        this.ag.setRightTextOnClickListener(new View.OnClickListener() { // from class: pkf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45535c.b(editShareCustomFragment, view);
            }
        });
        RelativeLayout relativeLayout = this.ak;
        if (relativeLayout == null || this.af == null) {
            return;
        }
        relativeLayout.setVisibility(8);
        this.af.setVisibility(8);
    }

    public /* synthetic */ void b(EditShareCustomFragment editShareCustomFragment, View view) {
        editShareCustomFragment.a();
        if (t()) {
            this.t = true;
            startActivity(new Intent(this.e, (Class<?>) CustomPreviewActivity.class));
        } else {
            LogUtil.e("Share_SharePopupActivity", "initShareData fail, finish");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        this.an = i;
        gxt gxtVarF = f();
        if (gxtVarF != null && gxtVarF.m() != null && gxtVarF.m().containsKey("trackShareIndex")) {
            map.put("type", gxtVarF.m().get("trackShareIndex"));
            if (z) {
                b(i, map);
            }
        } else {
            LogUtil.j("Share_SharePopupActivity", "biShareTypeKey shareContent is null");
            map.put("type", -1);
        }
        lmf.d().c(this.e.getApplicationContext(), AnalyticsValue.SHARE_TRACK_INDEX_2040102.value(), map, 0);
    }

    private void b(int i, Map<String, Object> map) {
        ArrayList<gxy> arrayListE = this.y.e();
        if (njy.c(arrayListE, i)) {
            gxy gxyVar = arrayListE.get(i);
            String strE = SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastRecommend" + gxyVar.h());
            String strE2 = SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastBackground" + gxyVar.h());
            String strE3 = SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastDataMark" + gxyVar.h());
            LogUtil.a("Share_SharePopupActivity", "lastRecommendId --", strE, "--lastBackgroundId--", strE2, "--lastDataMarkId--", strE3);
            map.put(CardMgrSdkConst.KEY_RECOMMEND, strE);
            map.put(WatchFaceProvider.BACKGROUND_LABEL, strE2);
            map.put("dataMark", strE3);
        }
    }

    private void s() {
        String strE;
        HealthSubTabWidget healthSubTabWidget = (HealthSubTabWidget) findViewById(R.id.share_tab);
        this.ae = healthSubTabWidget;
        healthSubTabWidget.setVisibility(0);
        this.ab = new qpn(this, this.aj, this.ae);
        ArrayList<gxy> arrayListE = this.y.e();
        if (arrayListE.size() <= 0) {
            strE = "";
        } else {
            gxy gxyVar = arrayListE.get(0);
            strE = SharedPreferenceManager.e(this.e, Integer.toString(CapabilityStatus.AWA_CAP_CODE_DARK_MODE), "shareLastBackground" + gxyVar.h());
            if ("1001".equals(strE)) {
                for (int i = 0; i < arrayListE.size(); i++) {
                    if (arrayListE.get(i).m()) {
                        strE = String.valueOf(i);
                        break;
                    }
                }
            }
        }
        if (!strE.isEmpty()) {
            this.y.b(Integer.parseInt(strE));
        }
        int i2 = 0;
        while (i2 < arrayListE.size()) {
            this.ab.b(this.ae.b(this.q.getPageTitle(i2)), this.q.getItem(i2), i2 == this.y.d());
            i2++;
        }
    }

    private gxt f() {
        gxt gxtVar;
        gxt gxtVar2;
        HashMap map = new HashMap(16);
        int i = this.an;
        if (i != -1 && i != this.j) {
            this.y = this.f;
        }
        if (this.y.u() != 6 && this.y.u() != 13) {
            gxtVar2 = this.y;
            e(map, gxtVar2.m());
        } else {
            int currentItem = this.aj.getCurrentItem();
            ArrayList<gxy> arrayListE = this.y.e();
            if (!njy.c(arrayListE, currentItem)) {
                LogUtil.e("Share_SharePopupActivity", "convertShareContent: position out of range:", Integer.valueOf(currentItem));
                return null;
            }
            gxy gxyVar = arrayListE.get(currentItem);
            if (gxyVar.d() != null) {
                gxtVar = new gxt(1);
                gxtVar.d(gxyVar.d());
            } else {
                String strC = gxyVar.c();
                if (TextUtils.isEmpty(strC)) {
                    return null;
                }
                gxt gxtVar3 = new gxt(4);
                gxtVar3.c(strC);
                gxtVar = gxtVar3;
            }
            gxtVar.d(this.y.aa());
            gxtVar.a(this.y.h());
            gxtVar.f(this.y.ad());
            SaveBitampCallback saveBitampCallbackL = this.y.l();
            if (saveBitampCallbackL != null) {
                gxtVar.c(saveBitampCallbackL);
            }
            e(map, this.y.m());
            e(map, gxyVar.e());
            gxtVar2 = gxtVar;
        }
        gxtVar2.c(map);
        return gxtVar2;
    }

    private void e(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || map2 == null) {
            return;
        }
        map.putAll(map2);
    }

    private HealthTextView d(LinearLayout linearLayout) {
        return (HealthTextView) linearLayout.findViewById(R.id.share_tv);
    }

    private ImageView c(LinearLayout linearLayout) {
        if (linearLayout.findViewById(R.id.share_img) instanceof ImageView) {
            return (ImageView) linearLayout.findViewById(R.id.share_img);
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e(view);
    }

    private void e(View view) {
        if (qrs.c(1500)) {
            LogUtil.a("Share_SharePopupActivity", "onClick() if (isClickFast())");
            return;
        }
        gxt gxtVarF = f();
        if (gxtVarF == null) {
            LogUtil.e("Share_SharePopupActivity", "shareContent == null");
            return;
        }
        o();
        int id = view.getId();
        if (id == R.id.share_save_to_local_layout || id == R.id.oversea_save_local_btn) {
            LogUtil.a("Share_SharePopupActivity", "share_save_to_local_layout");
            this.s.a(this.e, 4, gxtVarF);
            ac();
            return;
        }
        if (!CommonUtil.ab(com.huawei.hwcommonmodel.application.BaseApplication.getContext())) {
            qpx.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), R.string.IDS_connect_error);
            return;
        }
        if (id == R.id.share_wechat_friends_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_wechat_friends_layout");
            this.s.a(this.e, 1, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_wechat_chat_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_wechat_chat_layout");
            this.s.a(this.e, 2, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_xiaohongshu_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_xiaohongshu_layout");
            this.s.a(this.e, 10, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_douyin_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_douyin_layout");
            this.s.a(this.e, 11, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_weibo_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_weibo_layout");
            this.s.a(this.e, 3, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_family_group_layout) {
            this.s.a(this.e, 6, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_more_layout || id == R.id.oversea_share_btn) {
            this.s.a(this.e, 5, gxtVarF);
            ac();
            return;
        }
        if (id == R.id.share_save_pdf_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_save_pdf_layout");
            this.s.a(this.e, 7, gxtVarF);
            ac();
        } else if (id == R.id.share_print_layout) {
            LogUtil.a("Share_SharePopupActivity", "share_print_layout");
            this.s.a(this.e, 8, gxtVarF);
            ac();
        } else if (id == R.id.background_layout) {
            LogUtil.a("Share_SharePopupActivity", "click background_layout, destroy!");
            finish();
        } else if (id == R.id.guide_user_customiz_share_content) {
            LogUtil.a("Share_SharePopupActivity", "click hide guide user share pop!");
            h();
        } else {
            LogUtil.a("Share_SharePopupActivity", "click outside activity! viewId:", Integer.valueOf(id));
        }
    }

    private void o() {
        if (this.s == null) {
            this.s = pjm.d();
        }
    }

    private void ac() {
        gxt gxtVarE = pjm.e();
        if (gxtVarE == null) {
            return;
        }
        ArrayList<gxy> arrayListE = gxtVarE.e();
        if (arrayListE.size() > 0 && this.aj != null) {
            gxy gxyVar = arrayListE.get(0);
            SharedPreferenceManager.e(this.e, Integer.toString(CapabilityStatus.AWA_CAP_CODE_DARK_MODE), "shareLastBackground" + gxyVar.h(), String.valueOf(this.aj.getCurrentItem()), new StorageParams());
        }
        HashMap<String, String> mapS = gxtVarE.s();
        if (mapS.size() == 0) {
            return;
        }
        String str = mapS.get("currentSportType");
        String str2 = mapS.get("shareLastRecommend" + str);
        String str3 = mapS.get("shareLastBackground" + str);
        String str4 = mapS.get("shareLastDataMark" + str);
        SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastRecommend" + str, str2, new StorageParams());
        SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastBackground" + str, str3, new StorageParams());
        SharedPreferenceManager.e(this.e, Integer.toString(20002), "shareLastDataMark" + str, str4, new StorageParams());
        pmo.e(Integer.parseInt(str), pjm.b());
    }

    private void q() {
        SharedPreferenceManager.e(this.e, Integer.toString(PrebakedEffectId.RT_SPEED_UP), "SHARE_POP_UP_ACTIVITY_SHARE_TYPE", String.valueOf(0), new StorageParams());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Share_SharePopupActivity", "onDestroy");
        pns.c();
        Animation animation = this.d;
        if (animation != null) {
            animation.cancel();
            this.d = null;
        }
        Animation animation2 = this.f22439b;
        if (animation2 != null) {
            animation2.cancel();
            this.f22439b = null;
        }
        ai();
        pnq.c(this.e.getResources().getConfiguration().uiMode & 48);
        gxt gxtVar = this.y;
        if (gxtVar == null) {
            return;
        }
        ArrayList<gxy> arrayListE = gxtVar.e();
        if (!TextUtils.isEmpty(this.y.g())) {
            pnn.b(this.y.g());
        }
        if (njy.e(arrayListE)) {
            return;
        }
        for (gxy gxyVar : arrayListE) {
            if (gxyVar != null && !TextUtils.isEmpty(gxyVar.c())) {
                pnn.b(gxyVar.c());
                e(gxyVar.k());
            }
            if (gxyVar != null && pns.b(gxyVar)) {
                pnn.b(pns.d(gxyVar));
            }
            pnn.b(pns.e("tmpShareVideo.mp4"));
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.8
            @Override // java.lang.Runnable
            public void run() {
                pmo.d();
            }
        });
    }

    private void e(gyd gydVar) {
        if (gydVar == null) {
            return;
        }
        String strH = gydVar.h();
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        pnn.b(strH);
    }

    private void j() {
        gxt gxtVar = this.y;
        if (gxtVar == null) {
            LogUtil.j("Share_SharePopupActivity", "mShareContent is null.");
            return;
        }
        ArrayList<gxy> arrayListE = gxtVar.e();
        int i = 0;
        while (true) {
            if (i >= arrayListE.size()) {
                i = -1;
                break;
            } else if (arrayListE.get(i).m()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        this.j = i;
    }

    private void g() {
        if (!pnq.h()) {
            LogUtil.j("Share_SharePopupActivity", "The account language is not supported.");
            return;
        }
        SharedPreferences sharedPreferences = this.e.getSharedPreferences(Integer.toString(20002), 0);
        this.ai = sharedPreferences;
        if (sharedPreferences == null) {
            return;
        }
        this.k = sharedPreferences.getBoolean("is_first_time_guide_user_customiz_share", true);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!pnq.h()) {
            LogUtil.j("Share_SharePopupActivity", "The account language is not supported.");
            return;
        }
        this.g.setVisibility(8);
        if (this.ai == null) {
            LogUtil.j("Share_SharePopupActivity", "Hide bubble sharedPreferences is null.");
            this.ai = this.e.getSharedPreferences(Integer.toString(20002), 0);
        }
        SharedPreferences.Editor editorEdit = this.ai.edit();
        if (editorEdit == null) {
            return;
        }
        editorEdit.putBoolean("is_first_time_guide_user_customiz_share", false);
        editorEdit.commit();
    }

    private void u() {
        HealthSubTabWidget healthSubTabWidget = this.ae;
        if (healthSubTabWidget == null) {
            return;
        }
        healthSubTabWidget.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.pluginsocialshare.activity.SharePopupActivity.10
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                HwSubTabWidget.SubTabView subTabViewC = SharePopupActivity.this.ae.c(SharePopupActivity.this.j);
                if (subTabViewC != null) {
                    SharePopupActivity.this.ae.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int[] iArr = new int[2];
                    subTabViewC.getLocationInWindow(iArr);
                    int width = (int) (((SharePopupActivity.this.ae.getWidth() - iArr[0]) - (subTabViewC.getWidth() * 0.5f)) - qrs.d(SharePopupActivity.this.e, 28.0f));
                    int iD = (int) (qrs.d(SharePopupActivity.this.e, 8.0f) - ((subTabViewC.getHeight() - qrs.d(SharePopupActivity.this.e, 14.0f)) * 0.5f));
                    ViewGroup.LayoutParams layoutParams = SharePopupActivity.this.g.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.rightMargin = width;
                        layoutParams2.leftMargin = qrs.d(SharePopupActivity.this.e, 6.0f);
                        layoutParams2.topMargin = iD;
                    }
                    SharePopupActivity.this.g.setLayoutParams(layoutParams2);
                    if (SharePopupActivity.this.k) {
                        SharePopupActivity.this.g.setVisibility(0);
                        return;
                    } else {
                        SharePopupActivity.this.g.setVisibility(8);
                        return;
                    }
                }
                LogUtil.j("Share_SharePopupActivity", "Customiz share tabView is null.");
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i != 4 && intent == null) {
            LogUtil.j("Share_SharePopupActivity", "data == null and it's not camera callback");
            return;
        }
        if (i2 != -1) {
            LogUtil.e("Share_SharePopupActivity", "onActivityResult resultCode != Activity.RESULT_OK");
            return;
        }
        if (i == 5) {
            pln.e(this.e, intent);
            return;
        }
        pkj pkjVar = this.q;
        if (pkjVar != null && (i3 = this.j) != -1) {
            Fragment item = pkjVar.getItem(i3);
            if (item instanceof EditShareCustomFragment) {
                LogUtil.a("Share_SharePopupActivity", "onActivityResult dealCameraResult");
                ((EditShareCustomFragment) item).b(i, intent);
                return;
            }
            return;
        }
        pju pjuVar = this.v;
        if (pjuVar != null) {
            pjuVar.d(i, intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        if (qrs.t() || w()) {
            ae();
        } else {
            u();
        }
    }

    private boolean w() {
        gxt gxtVar = this.y;
        return (gxtVar == null || gxtVar.u() != 13 || pmn.g()) ? false : true;
    }

    public class SystemLocaleChangeReceiver extends BroadcastReceiver {
        public SystemLocaleChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Share_SharePopupActivity", "SystemLocaleChangeReceiver intent is null");
            } else if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                LogUtil.a("Share_SharePopupActivity", "SystemLocaleChangeReceiver language change");
                SharePopupActivity.this.ae();
            }
        }
    }

    private void ab() {
        if (this.z == null) {
            LogUtil.e("Share_SharePopupActivity", "Enter registerSystemLanguageChange()");
            SystemLocaleChangeReceiver systemLocaleChangeReceiver = new SystemLocaleChangeReceiver();
            this.z = systemLocaleChangeReceiver;
            BroadcastManager.c(systemLocaleChangeReceiver);
        }
    }

    private void ai() {
        if (this.z != null) {
            LogUtil.a("Share_SharePopupActivity", "Enter unregisterSystemLanguageChange()");
            BroadcastManager.l(this.z);
            this.z = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return !this.n ? pnq.e(super.getResources()) : super.getResources();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pnq.c(getResources());
        this.n = true;
    }
}

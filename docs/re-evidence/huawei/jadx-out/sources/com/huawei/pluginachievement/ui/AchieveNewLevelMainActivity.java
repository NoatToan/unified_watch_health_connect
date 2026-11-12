package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.LevelInfoDesc;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.pluginachievement.manager.service.AchieveLevelInfoObserver;
import com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener;
import com.huawei.pluginachievement.ui.level.AchieveLevelTaskRvAdapter;
import com.huawei.pluginachievement.ui.level.LevelHorizontalRecyclerViewAdapter;
import com.huawei.pluginachievement.ui.views.LevelProgress;
import com.huawei.pluginachievement.ui.views.SpeedRecyclerView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.ffv;
import defpackage.lmf;
import defpackage.njy;
import defpackage.oru;
import defpackage.osa;
import defpackage.osb;
import defpackage.osf;
import defpackage.osg;
import defpackage.otl;
import defpackage.otu;
import defpackage.ouf;
import defpackage.oun;
import defpackage.ouo;
import defpackage.out;
import defpackage.oxi;
import defpackage.oyx;
import defpackage.ozj;
import defpackage.ozs;
import defpackage.ozu;
import defpackage.pap;
import defpackage.paq;
import defpackage.paw;
import defpackage.pbb;
import defpackage.pbn;
import defpackage.qpb;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveNewLevelMainActivity extends BaseActivity implements AchieveObserver, AchieveKaKaTaskClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22114a;
    private LevelProgress aa;
    private ImageView ab;
    private HealthRecycleView ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private RelativeLayout ah;
    private HealthTextView ai;
    private ArrayList<String> aj;
    private View ak;
    private ImageView al;
    private View am;
    private int an;
    private int ao;
    private HealthTextView ap;
    private int aq;
    private FrameLayout ar;
    private int as;
    private LinearLayout at;
    private LinearLayout au;
    private otl av;
    private HealthScrollView aw;
    private LinearLayout ax;
    private int ay;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f22115b;
    private SpeedRecyclerView ba;
    private LinearLayout bb;
    private HealthTextView be;
    private ImageView bf;
    private String bh;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AchieveLevelTaskRvAdapter f22116c;
    private LinearLayout d;
    private ImageView e;
    private ozj f;
    private Context h;
    private RelativeLayout i;
    private ImageView k;
    private int l;
    private long m;
    private Handler n;
    private int o;
    private List<String> p;
    private CustomTitleBar q;
    private LevelHorizontalRecyclerViewAdapter r;
    private ImageView u;
    private LinearLayout v;
    private int w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;
    private NoTitleCustomAlertDialog j = null;
    private ArrayList<ozs> az = new ArrayList<>(0);
    private boolean s = false;
    private String bc = "";
    private String g = "";
    private boolean t = false;

    static class d extends BaseHandler<AchieveNewLevelMainActivity> {
        d(AchieveNewLevelMainActivity achieveNewLevelMainActivity) {
            super(achieveNewLevelMainActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveNewLevelMainActivity achieveNewLevelMainActivity, Message message) {
            if (achieveNewLevelMainActivity == null) {
                LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "handleMessageWhenReferenceNotNull activity is null.");
                return;
            }
            int i = message.what;
            if (i == 0) {
                achieveNewLevelMainActivity.b(((Integer) message.obj).intValue(), achieveNewLevelMainActivity.ay, (ArrayList<String>) achieveNewLevelMainActivity.aj);
                return;
            }
            if (i == 1) {
                Integer num = (Integer) message.obj;
                int iIntValue = num.intValue();
                LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "sport total days :", num);
                achieveNewLevelMainActivity.af.setText(achieveNewLevelMainActivity.getResources().getString(R.string.IDS_level_share_days, achieveNewLevelMainActivity.getResources().getQuantityString(R.plurals.IDS_plugin_achievement_days, iIntValue, UnitUtil.e(iIntValue, 1, 0))));
                return;
            }
            if (i == 11) {
                achieveNewLevelMainActivity.c(achieveNewLevelMainActivity.av, (AchieveCallback) null);
                return;
            }
            if (i == 1000) {
                achieveNewLevelMainActivity.b(message.obj + "");
                LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "ERROR_TIP :", message.obj);
                return;
            }
            if (i != 1002) {
                if (i == 5005) {
                    if (achieveNewLevelMainActivity.f != null) {
                        achieveNewLevelMainActivity.f.b(achieveNewLevelMainActivity.az);
                        achieveNewLevelMainActivity.f22116c.c(achieveNewLevelMainActivity.az, achieveNewLevelMainActivity.f.d() + 1);
                        achieveNewLevelMainActivity.a();
                        return;
                    }
                    LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "handleMessageWhenReferenceNotNull mCardScaleHelper is null.");
                    return;
                }
                LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "handlerCheckInMsg message = ", Integer.valueOf(message.what));
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.transparent));
        setContentView(R.layout.achieve_new_level_layout);
        clearBackgroundDrawable();
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "onCreate");
        this.h = this;
        this.n = new d(this);
        h();
        qpb.d(this.h);
        osa.b(this.h, "levelTypeUpgraded", "");
        SharedPreferenceManager.a(String.valueOf(20003), "new_level_first_use", false);
        otu.b(this.h).d();
    }

    private void h() {
        this.i = (RelativeLayout) findViewById(R.id.all_back);
        this.y = (HealthTextView) findViewById(R.id.level_badge_name);
        this.x = (HealthTextView) findViewById(R.id.level_badge_dec);
        this.at = (LinearLayout) findViewById(R.id.sign_grid_layout1);
        this.au = (LinearLayout) findViewById(R.id.sign_grid_layout2);
        this.v = (LinearLayout) findViewById(R.id.level_badge_dec_layout);
        this.al = (ImageView) findViewById(R.id.lockIcon);
        this.u = (ImageView) findViewById(R.id.level_arrow);
        this.ap = (HealthTextView) findViewById(R.id.rocket_tips);
        this.ar = (FrameLayout) findViewById(R.id.outSideLayout);
        this.ab = (ImageView) findViewById(R.id.level_bg_light);
        this.aa = (LevelProgress) findViewById(R.id.levelView);
        this.am = findViewById(R.id.maskStart);
        this.ak = findViewById(R.id.maskEnd);
        this.am.setAlpha(0.35f);
        this.ak.setAlpha(0.35f);
        ((HealthSubHeader) findViewById(R.id.achieve_new_level_rule_title)).setSubHeaderBackgroundColor(0);
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.fragment_social_sroll);
        this.aw = healthScrollView;
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.achieve_level_listview);
        this.ac = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.ac.setIsScroll(false);
        AchieveLevelTaskRvAdapter achieveLevelTaskRvAdapter = new AchieveLevelTaskRvAdapter(this, null, 0);
        this.f22116c = achieveLevelTaskRvAdapter;
        achieveLevelTaskRvAdapter.b(this);
        this.ac.setAdapter(this.f22116c);
        f();
        g();
        j();
        k();
        this.v.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (otu.d(500)) {
                    LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "levelRecord enter isFastClick!");
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(AchieveNewLevelMainActivity.this.h, PersonalData.CLASS_NAME_PERSONAL_LEVEL_RECORD);
                AchieveNewLevelMainActivity.this.startActivity(intent);
                AchieveNewLevelMainActivity.this.d();
            }
        });
        o();
    }

    private void o() {
        if ("1".equals(this.bh)) {
            this.aa.setOnDownActionListener(new LevelProgress.OnDownActionListener() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.1
                @Override // com.huawei.pluginachievement.ui.views.LevelProgress.OnDownActionListener
                public void onDown(int i, int i2) {
                    if ("1".equals(AchieveNewLevelMainActivity.this.bh)) {
                        if (AchieveNewLevelMainActivity.this.ar.getVisibility() == 8) {
                            AchieveNewLevelMainActivity.this.ap.setVisibility(0);
                            AchieveNewLevelMainActivity.this.ar.setVisibility(0);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            if (AchieveNewLevelMainActivity.this.aq == 0) {
                                AchieveNewLevelMainActivity achieveNewLevelMainActivity = AchieveNewLevelMainActivity.this;
                                achieveNewLevelMainActivity.aq = (i - (achieveNewLevelMainActivity.ap.getWidth() / 2)) - 15;
                            }
                            layoutParams.leftMargin = AchieveNewLevelMainActivity.this.aq;
                            layoutParams.topMargin = 250;
                            if (AchieveNewLevelMainActivity.this.aq < 0) {
                                layoutParams.leftMargin = 0;
                            }
                            AchieveNewLevelMainActivity.this.ap.setLayoutParams(layoutParams);
                            return;
                        }
                        AchieveNewLevelMainActivity.this.ap.setVisibility(8);
                        AchieveNewLevelMainActivity.this.ar.setVisibility(8);
                    }
                }
            });
            this.ar.setOnTouchListener(new View.OnTouchListener() { // from class: oyj
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f44977c.e(view, motionEvent);
                }
            });
        }
    }

    public /* synthetic */ boolean e(View view, MotionEvent motionEvent) {
        this.ap.setVisibility(8);
        this.ar.setVisibility(8);
        return false;
    }

    private void j() {
        Bitmap bitmapC;
        this.f22115b = (LinearLayout) findViewById(R.id.achieve_level_share_ll);
        this.ah = (RelativeLayout) findViewById(R.id.level_share_bg);
        this.e = (ImageView) findViewById(R.id.achieve_level_share_image);
        this.f22114a = (HealthTextView) findViewById(R.id.level_share_name);
        this.ax = (LinearLayout) findViewById(R.id.sign_share_grid_layout1);
        this.bb = (LinearLayout) findViewById(R.id.sign_share_grid_layout2);
        this.bf = (ImageView) findViewById(R.id.vip_image);
        this.k = (ImageView) findViewById(R.id.head_imageview);
        this.be = (HealthTextView) findViewById(R.id.name_textview);
        this.af = (HealthTextView) findViewById(R.id.level_share_dec);
        this.d = (LinearLayout) findViewById(R.id.account_layout);
        if (oun.d(0)) {
            this.d.setVisibility(0);
            this.ax.setVisibility(0);
            this.bb.setVisibility(0);
        } else {
            this.d.setVisibility(4);
            this.ax.setVisibility(8);
            this.bb.setVisibility(8);
        }
        e();
        this.be.setText(osb.b());
        String strB = osb.b(this.h);
        String strC = CommonUtil.c(strB);
        if (GeneralUtil.isSafePath(strB) && !TextUtils.isEmpty(strC) && (bitmapC = ouf.c(this, strC)) != null) {
            this.k.setImageBitmap(bitmapC);
        }
        String strE = SharedPreferenceManager.e(this.h, Integer.toString(10000), "MAIN_VIP_KEY");
        this.bh = strE;
        if ("1".equals(strE)) {
            this.bf.setVisibility(0);
        }
    }

    private void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.4
            @Override // java.lang.Runnable
            public void run() {
                osf osfVarB = otl.b(AchieveNewLevelMainActivity.this.h).b(1, new HashMap(16));
                TotalRecord totalRecord = osfVarB instanceof TotalRecord ? (TotalRecord) osfVarB : null;
                if (totalRecord != null) {
                    AchieveNewLevelMainActivity.this.c(1, Integer.valueOf(totalRecord.getDays()));
                } else {
                    LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "computeDomesticData no TotalRecordDB.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!osb.c(this.h)) {
            paw.a(this.h);
            return;
        }
        this.d.setVisibility(osb.d() ? 0 : 4);
        this.ah.setBackgroundResource(paq.e(this.an));
        this.e.setImageResource(paq.b(this.an));
        this.f22114a.setText(paq.d(this.an) + " " + paq.b(this.h, this.w));
        if (oru.a(this.h).getAdapter() != null) {
            HashMap map = new HashMap(3);
            map.put("click", "1");
            map.put("level", Integer.valueOf(this.w));
            Bitmap bitmapC = ouo.c(this.f22115b);
            if (bitmapC != null) {
                osb.c(this.h, bitmapC, AnalyticsValue.LEVEL_SHARE_1100073.value(), map);
            }
        }
    }

    public void e(List<String> list, int i) {
        Drawable drawable = ContextCompat.getDrawable(BaseApplication.getContext(), R.mipmap.level_sign_btn);
        if (drawable == null || i >= ozj.a().length) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "setBadgeDesignation isOutOfBounds!");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "setBadgeDesignation labelList isEmpty!");
            return;
        }
        int color = BaseApplication.getContext().getResources().getColor(ozj.a()[i].intValue());
        Drawable drawableB = pbb.b(drawable, color);
        this.ax.removeAllViews();
        this.bb.removeAllViews();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 < 3) {
                this.ax.addView(this.f.a(paq.b().get(Integer.valueOf(oun.d(list.get(i2)))), drawableB, color));
            } else {
                this.bb.addView(this.f.a(paq.b().get(Integer.valueOf(oun.d(list.get(i2)))), drawableB, color));
            }
        }
    }

    private void n() {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        ImageView imageView = (ImageView) findViewById(R.id.level_bg_back);
        if (LanguageUtil.ba(this)) {
            drawable = qqz.e(this, R.mipmap.level_record_detail);
        } else {
            drawable = ContextCompat.getDrawable(this, R.mipmap.level_record_detail);
        }
        if (qqs.e(this)) {
            drawable2 = getResources().getDrawable(R.mipmap.level_arrow_dark_up);
            drawable3 = getResources().getDrawable(R.mipmap.level_arrow_dark_down);
            imageView.setBackgroundResource(R.mipmap.level_dark_bg_back);
            this.u.setImageDrawable(pbb.b(drawable, BaseApplication.getContext().getResources().getColor(R.color.common_white_70alpha)));
        } else {
            drawable2 = getResources().getDrawable(R.mipmap.level_arrow_light_up);
            drawable3 = getResources().getDrawable(R.mipmap.level_arrow_light_down);
            imageView.setBackgroundResource(R.mipmap.level_bg_back);
            this.u.setImageDrawable(drawable);
        }
        drawable2.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.time_area_drawable_padding);
        final HealthTextView healthTextView = (HealthTextView) findViewById(R.id.rule_read_more);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.rule_pack_up);
        healthTextView.setCompoundDrawablePadding(dimensionPixelSize);
        healthTextView2.setCompoundDrawablePadding(dimensionPixelSize);
        healthTextView.setCompoundDrawables(null, null, drawable3, null);
        healthTextView2.setCompoundDrawables(null, null, drawable2, null);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rule_layout);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: oyi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(linearLayout, healthTextView, view);
            }
        });
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: oyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44975c.d(healthTextView, linearLayout, view);
            }
        });
    }

    public /* synthetic */ void b(LinearLayout linearLayout, HealthTextView healthTextView, View view) {
        linearLayout.setVisibility(0);
        healthTextView.setVisibility(8);
        this.as = 0;
        paq.c(3, this.w, 0L, this.bc, this.t);
    }

    public /* synthetic */ void d(HealthTextView healthTextView, LinearLayout linearLayout, View view) {
        healthTextView.setVisibility(0);
        linearLayout.setVisibility(8);
        this.as = 0;
    }

    private void k() {
        this.aw.setScrollViewListener(new ScrollViewListener() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.3
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
                AchieveNewLevelMainActivity.this.e(healthScrollView, i2);
                if (qqs.e(BaseApplication.getContext())) {
                    LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "setScrollViewListening setImageAlpha.");
                    if (i2 <= 0) {
                        AchieveNewLevelMainActivity.this.ab.setImageAlpha(255);
                    } else if (i2 <= 0 || i2 > 100) {
                        AchieveNewLevelMainActivity.this.ab.setImageAlpha(0);
                    } else {
                        AchieveNewLevelMainActivity.this.ab.setImageAlpha((int) (255.0f - ((i2 / 100.0f) * 255.0f)));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HealthScrollView healthScrollView, int i) {
        int bottom = healthScrollView.getChildAt(healthScrollView.getChildCount() - 1).getBottom();
        int height = healthScrollView.getHeight();
        int scrollY = healthScrollView.getScrollY();
        if (this.as == 0 && bottom - (height + scrollY) == 0) {
            this.as = 1;
            paq.c(4, this.w, 0L, this.g, this.t);
        }
        if (this.ao != 0 || i < 100) {
            return;
        }
        this.ao = 1;
        paq.c(2, this.w, 0L, this.g, this.t);
    }

    private void g() {
        this.ad = (HealthTextView) findViewById(R.id.level_rule_dec1);
        this.ag = (HealthTextView) findViewById(R.id.level_rule_dec2);
        this.ai = (HealthTextView) findViewById(R.id.level_rule_dec3);
        this.z = (HealthTextView) findViewById(R.id.level_rule_dec03);
        this.ae = (HealthTextView) findViewById(R.id.level_rule_dec4);
        this.ad.setText(getResources().getString(R.string.IDS_level_rule_dec1, 7, 20));
        this.ag.setText(getResources().getString(R.string.IDS_level_rule_dec2, 7, 20, 0, Integer.valueOf(paq.n(1)), Integer.valueOf(paq.n(1)), Integer.valueOf(paq.n(2)), Integer.valueOf(paq.n(2)), Integer.valueOf(paq.n(3)), Integer.valueOf(paq.n(3)), Integer.valueOf(paq.n(4)), Integer.valueOf(paq.n(4)), Integer.valueOf(paq.n(5)), Integer.valueOf(paq.n(5)), Integer.valueOf(paq.n(6)), Integer.valueOf(paq.n(6))));
        int i = R.string.IDS_level_rule_dec3_new;
        if (ffv.t()) {
            i = R.string.IDS_level_rule_dec3_new1;
        }
        this.ai.setText(getResources().getString(i, 1, 3, 2, 3));
        this.z.setText(getResources().getString(R.string.IDS_level_rule_dec03, "1.1"));
        this.ae.setText(getResources().getString(R.string.IDS_level_rule_dec4, 1, 2, 3));
        n();
    }

    private void f() {
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.level_titlebar);
        this.q = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        if (LanguageUtil.ba(this.h)) {
            if (qqs.e(this)) {
                this.q.setRightButtonDrawable(qqz.e(this.h, R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
                this.q.setLeftButtonDrawable(this.h.getResources().getDrawable(R.drawable.ic_back_white_reverse), qre.f(R.string.accessibility_go_back));
            } else {
                this.q.setRightButtonDrawable(qqz.e(this.h, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
            }
        } else if (qqs.e(this)) {
            this.q.setLeftButtonDrawable(this.h.getResources().getDrawable(R.drawable.ic_back_white), qre.f(R.string.accessibility_go_back));
            this.q.setRightButtonDrawable(this.h.getResources().getDrawable(R.drawable.sug_ic_share), qre.f(R.string.accessibility_share));
        } else {
            this.q.setRightButtonDrawable(this.h.getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.q.setRightButtonOnClickListener(new View.OnClickListener() { // from class: oyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44978c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "initTitleBar onClick share information");
        if (PermissionUtil.a()) {
            t();
        } else {
            PermissionUtil.d(this.h, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.h) { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    AchieveNewLevelMainActivity.this.t();
                }
            });
        }
    }

    private void a(int i, int i2, List<LevelInfoDesc> list, double d2) {
        ViewStub viewStub = (ViewStub) findViewById(R.id.speedRecyclerView);
        if (viewStub == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "initRecyclerView ViewStub is loaded fail.");
            return;
        }
        this.ba = (SpeedRecyclerView) viewStub.inflate();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        this.ba.setLayoutManager(linearLayoutManager);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = qrs.d((Context) this, 4.0f);
        this.ba.setLayoutParams(layoutParams);
        LevelHorizontalRecyclerViewAdapter levelHorizontalRecyclerViewAdapter = new LevelHorizontalRecyclerViewAdapter(this, list);
        this.r = levelHorizontalRecyclerViewAdapter;
        this.ba.setAdapter(levelHorizontalRecyclerViewAdapter);
        if (this.f == null) {
            this.f = new ozj();
        }
        linearLayoutManager.scrollToPositionWithOffset(i2 - 1, pbn.b(BaseApplication.getContext()) + (pbn.a(BaseApplication.getContext()) / 2));
        this.f.e(list, i2, i, d2);
        this.f.d(this.at, this.au);
        this.f.d(this.al, this.i, this.aa, this.f22116c);
        this.f.d(this.am, this.ak);
        this.f.b(this.ba, this.y, this.x);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        otu.b(this.h).g();
        i();
    }

    private void i() {
        otl otlVarB = otl.b(getApplicationContext());
        this.av = otlVarB;
        otlVarB.c((AchieveObserver) this);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.9
            @Override // java.lang.Runnable
            public void run() {
                AchieveNewLevelMainActivity.this.c();
                AchieveNewLevelMainActivity.this.b();
                AchieveNewLevelMainActivity.this.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String strE = osa.e(BaseApplication.getContext(), "AchieveLevelLabel");
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType refreshLevelFromSp labels = ", strE);
        ArrayList<String> arrayListC = paq.c(strE);
        this.p = arrayListC;
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType refreshLevelFromSp mLabelList = ", arrayListC.toString());
        String strE2 = osa.e(BaseApplication.getContext(), "levelTypeData");
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "refreshLevelFromSp levelDataStr = ", strE2);
        if (!TextUtils.isEmpty(strE2)) {
            ArrayList<String> arrayListC2 = paq.c(strE2);
            this.aj = arrayListC2;
            if (arrayListC2.size() >= 2) {
                this.w = oun.d(this.aj.get(0));
                int iD = oun.d(this.aj.get(1));
                this.ay = iD;
                LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType refreshLevelFromSp level = ", Integer.valueOf(this.w), " mUserExperience ", Integer.valueOf(iD));
                c(0, Integer.valueOf(this.w));
                return;
            }
            return;
        }
        c(0, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, ArrayList<String> arrayList) {
        double d2;
        int iG = paq.g(i);
        if (this.an != iG) {
            this.s = true;
            this.an = iG;
        } else {
            this.s = false;
        }
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType ud mLevelType = ", Integer.valueOf(iG), " level ", Integer.valueOf(i), " isTypeChange = ", Boolean.valueOf(this.s));
        int iC = paq.c(i + 1);
        int iC2 = paq.c(i);
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType nextLevelValue ", Integer.valueOf(iC), " currLevelValue ", Integer.valueOf(iC2));
        int i3 = iC - iC2;
        if (i3 != 0) {
            double d3 = ((((double) (i2 - iC2)) * 1.0d) / ((double) i3)) * 1.0d;
            LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "LevelType ud userV =", Integer.valueOf(i2), " levelGrowthV ", Integer.valueOf(i3), " percent ", Double.valueOf(d3));
            d2 = d3;
        } else {
            d2 = 0.0d;
        }
        List<LevelInfoDesc> listD = paq.d(i, i2, arrayList, this.p);
        int i4 = this.l;
        if (i4 == 0) {
            this.l = i4 + 1;
            a(i, iG, listD, d2);
        } else {
            this.f.e(listD, iG, i, d2);
            e(i, d2);
            if (this.s) {
                this.ba.smoothScrollToPosition(iG - 1);
            }
        }
        d(this.f.d(), listD);
    }

    private void e(int i, double d2) {
        this.aa.d(i, d2, this.f.d());
        if (this.f.d() >= ozj.c().length) {
            return;
        }
        int color = getResources().getColor(ozj.c()[this.f.d()].intValue());
        this.am.setBackgroundColor(color);
        this.ak.setBackgroundColor(color);
    }

    private void d(int i, List<LevelInfoDesc> list) {
        int dimensionPixelOffset;
        if (njy.e(list, i)) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "refreshLayout isOutOfBounds!");
            return;
        }
        this.y.setText(list.get(i).getName());
        this.x.setText(list.get(i).getDescription());
        if (i < ozj.c().length) {
            this.i.setBackgroundColor(getColor(ozj.c()[i].intValue()));
        }
        this.f.e(list.get(i).getLabelList(), i);
        if (i < this.an) {
            this.al.setVisibility(8);
        }
        if (this.p == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "refreshLayout mLabelList is null!");
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (this.p.size() > 3) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(qrs.u() ? R.dimen.health_common_106dp : R.dimen.health_common_95dp);
        } else if (this.p.size() == 0) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_60dp);
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(qrs.u() ? R.dimen.health_common_95dp : R.dimen.health_common_75dp);
        }
        layoutParams.setMargins(0, dimensionPixelOffset, 0, 0);
        this.ac.setLayoutParams(layoutParams);
        e(this.p, this.an - 1);
        ArrayList<String> arrayList = this.aj;
        String str = (arrayList == null || arrayList.size() <= 9) ? "1.1" : this.aj.get(9);
        String str2 = paw.b(oxi.e(str), 0.0d) != 0 ? str : "1.1";
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "parseLevelList ruleRate ", str2);
        this.ap.setText(getResources().getString(R.string.IDS_level_rocket_tips, getResources().getString(R.string.IDS_level_rocket_level, str2)));
        this.z.setText(getResources().getString(R.string.IDS_level_rule_dec03, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.8
            @Override // java.lang.Runnable
            public void run() {
                AchieveNewLevelMainActivity achieveNewLevelMainActivity = AchieveNewLevelMainActivity.this;
                achieveNewLevelMainActivity.c(achieveNewLevelMainActivity.av, new AchieveCallback() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.8.4
                    @Override // com.huawei.pluginachievement.impl.AchieveCallback
                    public void onResponse(int i, Object obj) {
                        if (i == 200) {
                            AchieveNewLevelMainActivity.this.l();
                        }
                    }
                });
            }
        });
    }

    public void b() {
        AchieveLevelInfoObserver achieveLevelInfoObserver = new AchieveLevelInfoObserver(BaseApplication.getContext());
        HashMap map = new HashMap(8);
        this.av.c(achieveLevelInfoObserver);
        this.av.a(13, map);
        otl.b(this).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.av.a(11, new HashMap(2));
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "onDataChanged error=", Integer.valueOf(i));
        if (i == -1) {
            return;
        }
        c(1002, false);
        if (userAchieveWrapper == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "onDataChanged resultCode=", userAchieveWrapper.getResultCode());
        if ("0".equals(userAchieveWrapper.getResultCode())) {
            if (userAchieveWrapper.getContentType() == 11) {
                c(11, (Object) null);
            } else if (userAchieveWrapper.getContentType() == 13) {
                c();
            } else {
                LogUtil.d("PLGACHIEVE_AchieveNewLevelMainActivity", "onDataChanged content type:", Integer.valueOf(userAchieveWrapper.getContentType()));
            }
        }
    }

    @Override // com.huawei.pluginachievement.ui.kakatask.AchieveKaKaTaskClickListener
    public void onTaskClick(String str, String str2, int i) {
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "onTaskClick code =", str, " taskId =", str2, "position =", Integer.valueOf(i));
        if (njy.e(this.az, i)) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "onTaskClick position is out of taskRecyclerViewDatas bounds,return");
            return;
        }
        ozu ozuVarE = this.az.get(i).e();
        if (ozuVarE == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "onTaskClick achieveTask is null");
            return;
        }
        if ("0".equals(str)) {
            b(ozuVarE);
            otu.b(this.h).a(ozuVarE, this.h);
        } else if ("3".equals(str)) {
            c(ozuVarE, i);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "task code:", str);
        }
    }

    private void b(ozu ozuVar) {
        String str;
        if (ozuVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "doTaskClickBi achieveTask is null");
            return;
        }
        HashMap map = new HashMap(8);
        map.put("click", 1);
        map.put("currentLevel", Integer.valueOf(this.w));
        map.put(ParsedFieldTag.TASK_NAME, ozuVar.d());
        map.put("taskid", ozuVar.c());
        if (!pap.e(ozuVar.k())) {
            str = "dailyTasks";
        } else {
            str = "beginnerTasks";
        }
        map.put(ParsedFieldTag.TASK_TYPE, str);
        if (ozuVar.o() == 0) {
            map.put("isVip", "false");
        } else {
            map.put("isVip", "true");
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.LEVEL_SHARE_1100071.value(), map, 0);
    }

    private void c(final ozu ozuVar, int i) {
        String string;
        if (njy.e(this.az, i)) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "dealTaskFinished IndexOutOfBoundsException");
            return;
        }
        if (ozuVar.k() == 10001) {
            string = getString(R.string.IDS_contact_confirm_ios_btn);
        } else {
            string = getString(R.string.IDS_plugin_achievement_kaka_see);
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.h);
        builder.a(ozuVar.b());
        builder.a(string, new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveNewLevelMainActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ozuVar.k() != 10001) {
                    otu.b(AchieveNewLevelMainActivity.this.h).a(ozuVar, AchieveNewLevelMainActivity.this.h);
                }
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.j = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(true);
        this.j.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(int i, T t) {
        Handler handler = this.n;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "sendHandlerMessage handler is null!");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = t;
        handler.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Toast.makeText(BaseApplication.getContext(), str, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(otl otlVar, AchieveCallback achieveCallback) {
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "freshLevelTask");
        if (otlVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "freshLevelTask service == null");
            return;
        }
        HashMap map = new HashMap(2);
        map.put(ParsedFieldTag.KAKA_TASK_SCENARIO, String.valueOf(2));
        List<osf> listD = otlVar.d(12, map);
        if (listD == null) {
            LogUtil.j("PLGACHIEVE_AchieveNewLevelMainActivity", "freshLevelTask tasks == null");
            c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, (Object) null);
            a(achieveCallback);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveNewLevelMainActivity", "freshLevelTask tasks size = ", Integer.valueOf(listD.size()));
        ArrayList arrayList = new ArrayList(listD.size());
        for (osf osfVar : listD) {
            if (osfVar instanceof osg) {
                osg osgVar = (osg) osfVar;
                if (osgVar.ai() == 20007) {
                    otu.b(BaseApplication.getContext()).e(osgVar);
                }
                if (osgVar.ai() == 20002 && String.valueOf(0).equals(osgVar.t())) {
                    otl.b(BaseApplication.getContext()).e((CountDownLatch) null);
                }
                if (osgVar.ai() == 10004 && qrs.a(osgVar.t()) < 1) {
                    osa.b(this.h, "isFirstBindDeviceFinishedV2", "");
                }
                arrayList.add(osgVar);
            }
        }
        this.az = oyx.b(arrayList);
        c(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, (Object) null);
        a(achieveCallback);
    }

    private void a(AchieveCallback achieveCallback) {
        if (achieveCallback != null) {
            achieveCallback.onResponse(200, 0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        otl otlVar = this.av;
        if (otlVar != null) {
            otlVar.d(this);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        paq.c(5, this.w, (SystemClock.elapsedRealtime() - this.m) / 1000, this.bc, this.t);
        otl otlVar = this.av;
        if (otlVar != null) {
            otlVar.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HashMap map = new HashMap(8);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.LEVEL_SHARE_1100072.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.bc != null) {
            this.bc = paq.a(this.az, 0);
            this.g = paq.a(this.az, 1);
            boolean zD = paq.d(this.az);
            this.t = zD;
            this.f.d(this.bc, zD);
        }
        int i = this.o;
        if (i == 0) {
            this.o = i + 1;
            paq.c(0, this.w, 0L, this.bc, this.t);
            this.m = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

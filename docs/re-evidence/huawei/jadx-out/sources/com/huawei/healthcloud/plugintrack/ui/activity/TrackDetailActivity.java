package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.association.AssociationDialog;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface;
import com.huawei.healthcloud.plugintrack.model.ShareInitCallback;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragment.DetailFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.PaceFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.SegmentFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.SkippingPerformanceFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.SportShareNewDetailFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.SportShortTrackShareFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackShareAllDataFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackSwimSegmentFrag;
import com.huawei.healthcloud.plugintrack.ui.fragment.TriathlonSubDataFrag;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.motiondetection.MotionTypeApps;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.een;
import defpackage.fws;
import defpackage.gnf;
import defpackage.gxt;
import defpackage.gxy;
import defpackage.gyd;
import defpackage.ipi;
import defpackage.ive;
import defpackage.izn;
import defpackage.izt;
import defpackage.izu;
import defpackage.jaa;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jal;
import defpackage.jan;
import defpackage.jar;
import defpackage.jbr;
import defpackage.jbt;
import defpackage.jbv;
import defpackage.jpg;
import defpackage.jpq;
import defpackage.jqp;
import defpackage.jqq;
import defpackage.jxh;
import defpackage.jxn;
import defpackage.lmf;
import defpackage.lrp;
import defpackage.lsv;
import defpackage.lsy;
import defpackage.lua;
import defpackage.njb;
import defpackage.njh;
import defpackage.njm;
import defpackage.njy;
import defpackage.npl;
import defpackage.qpn;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qqu;
import defpackage.qre;
import defpackage.qrs;
import defpackage.xfz;
import defpackage.xji;
import defpackage.xjl;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TrackDetailActivity extends TrackBaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10890a;
    private boolean aa;
    private boolean ab;
    private long ac;
    private int ad;
    private e ae;
    private boolean af;
    private PaceFrag ag;
    private MotionPath ah;
    private MotionPathSimplify ai;
    private SkippingPerformanceFrag aj;
    private HealthViewPager ak;
    private final Resources al;
    private boolean am;
    private FrameLayout an;
    private SegmentFrag ao;
    private ShareInitCallback ap;
    private List<String> aq;
    private final List<String> ar;
    private Bitmap as;
    private jqp at;
    private TriathlonSubDataFrag au;
    private HealthSubTabWidget av;
    private SportShortTrackShareFragment aw;
    private List<jbt> ax;
    private TrackSwimSegmentFrag ay;
    private TrackScreenFrag az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10891b;
    private HealthViewPager ba;
    private TrackShareAllDataFragment bb;
    private int bc;
    private CommonDialog21 bd;
    private qpn e;
    private long[] f;
    private long g;
    private int h;
    private BroadcastReceiver i;
    private Bundle j;
    private CustomTitleBar k;
    private boolean l;
    private String m;
    private DetailFrag n;
    private Context o;
    private LoadMapListener p;
    private float q;
    private PopupWindow r;
    private String s;
    private Map<String, Integer> t;
    private boolean u;
    private final a v;
    private List<Fragment> w;
    private boolean x;
    private HeartRateFrag y;
    private boolean z;
    private static final int[] d = {2, 1, 10};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f10889c = {1, 10};

    /* JADX INFO: loaded from: classes10.dex */
    public interface LoadMapListener {
        void endLoadMap();
    }

    public static /* synthetic */ void a(View view) {
    }

    public static /* synthetic */ void b(View view) {
    }

    public static /* synthetic */ void c(View view) {
    }

    public static /* synthetic */ void d(View view) {
    }

    public static /* synthetic */ void e(View view) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public float getMaxFontScale() {
        return 1.0f;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected ViewHolderInterface initViewHolder() {
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isNeedLocationPermission() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isNeedStorgePermission() {
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void setActvityLayoutModel() {
    }

    public TrackDetailActivity() {
        Context contextB = BaseApplication.b();
        this.f10891b = contextB;
        this.al = contextB.getResources();
        this.v = new a(this);
        this.j = null;
        this.ae = null;
        this.ah = null;
        this.ai = new MotionPathSimplify();
        this.at = null;
        this.ax = new ArrayList(10);
        this.o = null;
        this.ac = 0L;
        this.q = 1.0f;
        this.aa = false;
        this.ab = false;
        this.l = false;
        this.f = new long[7];
        this.h = 0;
        this.z = false;
        this.t = new HashMap(7);
        this.ad = 0;
        this.as = null;
        this.bd = null;
        this.w = null;
        this.af = false;
        this.bc = 0;
        this.aq = new ArrayList(10);
        this.ba = null;
        this.x = false;
        this.p = new LoadMapListener() { // from class: jku
            @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.LoadMapListener
            public final void endLoadMap() {
                this.d.av();
            }
        };
        this.ap = new ShareInitCallback() { // from class: jlb
            @Override // com.huawei.healthcloud.plugintrack.model.ShareInitCallback
            public final void onFinish() {
                this.e.aw();
            }
        };
        this.am = false;
        this.ar = new ArrayList();
        this.i = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void av() {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aw() {
        this.v.sendEmptyMessage(2);
    }

    private void al() {
        int iRequestSportType;
        setContentView(R.layout.track_detail_page);
        jqp jqpVar = this.at;
        if (jqpVar != null && jqpVar.d() != null && ((iRequestSportType = this.at.d().requestSportType()) == 283 || iRequestSportType == 290)) {
            ((CustomTitleBar) findViewById(R.id.track_detail_title_bar)).setTitleBarBackgroundColor(ContextCompat.getColor(this.f10891b, R.color.colorSubBackground));
            getWindow().setNavigationBarColor(ContextCompat.getColor(this.f10891b, R.color.colorSubBackground));
        }
        this.an = (FrameLayout) findViewById(R.id.track_detail_page_layout);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.track_share_viewpager);
        this.ba = healthViewPager;
        healthViewPager.setPageMargin(this.al.getDimensionPixelSize(R.dimen.common_ui_horizon_text_size_60));
        bk();
        ab();
        a(false);
        z();
        this.av = (HealthSubTabWidget) findViewById(R.id.track_detail_sub_tab_layout);
        ah();
        d(this.aa);
    }

    private void bk() {
        if (this.ba == null) {
            LogUtil.j("Track_TrackDetailActivity", "[setViewPagerHeight] view is null");
            return;
        }
        Object systemService = this.o.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.e("Track_TrackDetailActivity", "object is not instanceof WindowManager");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        ViewGroup.LayoutParams layoutParams = this.ba.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = (i * 8) / 5;
        this.ba.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        bk();
        bh();
    }

    private void ab() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.track_detail_title_bar);
        this.k = customTitleBar;
        customTitleBar.setRightSoftkeyBackground(ContextCompat.getDrawable(this.f10891b, R.drawable.btn_stretch_nor), qre.f(R.string.IDS_track_skip_post_exercise));
        this.k.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackDetailActivity.this.y();
            }
        });
        if (LanguageUtil.ba(this)) {
            this.k.setRightButtonDrawable(ContextCompat.getDrawable(this.f10891b, R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            this.k.setRightButtonDrawable(ContextCompat.getDrawable(this.f10891b, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.k.setRightButtonOnClickListener(new View.OnClickListener() { // from class: jkt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38695c.f(view);
            }
        });
        this.k.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jkw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38696b.j(view);
            }
        });
        aj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        if (PermissionUtil.a()) {
            u();
        } else {
            PermissionUtil.d(this.o, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.o) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    TrackDetailActivity.this.u();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        if (!this.l) {
            this.v.postDelayed(new Runnable() { // from class: jkj
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.at();
                }
            }, 50L);
        }
        if (ap()) {
            bt();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void at() {
        if (!CommonUtil.ae(this.o) || this.x) {
            return;
        }
        LogUtil.j("Track_TrackDetailActivity", "restartApp.");
        a(this.o);
    }

    private boolean as() {
        return Utils.k();
    }

    private void aj() {
        if (as()) {
            LogUtil.a("Track_TrackDetailActivity", "not show TrackEdit");
            return;
        }
        this.k.setRightThirdKeyBackground(ContextCompat.getDrawable(this.f10891b, R.drawable.ic_track_edit), qre.f(R.string.IDS_sport_edit_record_name));
        this.k.setRightThirdKeyOnClickListener(new View.OnClickListener() { // from class: jko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38691a.h(view);
            }
        });
        this.k.setRightThirdKeyVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        PopupWindow popupWindow = this.r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null && c(motionPathSimplify.requestSportType())) {
            bn();
        } else {
            bq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ReleaseLogUtil.d("Track_TrackDetailActivity", "enter  checkAssociationAndShowDialog");
        if (!NetworkUtil.i()) {
            qpx.e(this.o, R.string.IDS_network_error);
        } else {
            a(new AnonymousClass5());
        }
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements SportEventAssociator.AssociationCallback {
        AnonymousClass5() {
        }

        @Override // com.huawei.health.plan.association.SportEventAssociator.AssociationCallback
        public void onSuccess(List<SportEventAssociator.c> list) {
            if (njy.e(list)) {
                HandlerExecutor.c(new Runnable() { // from class: jlk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38707a.e();
                    }
                });
            } else {
                TrackDetailActivity.this.e(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            qpx.e(TrackDetailActivity.this.o, R.string.IDS_sport_no_event_association);
        }
    }

    private void bn() {
        new PopViewList(this.o, this.k, new ArrayList(Arrays.asList(qre.f(R.string.IDS_sport_association_change_name), qre.f(R.string.IDS_sport_event_association)))).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.1
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                if (i == 0) {
                    TrackDetailActivity.this.bq();
                } else {
                    if (i != 1) {
                        return;
                    }
                    TrackDetailActivity.this.g();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bq() {
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify == null) {
            return;
        }
        jxn.b(this, motionPathSimplify.requestStartTime(), this.ai.requestEndTime(), this.ai.requestTrackType() == 8, new IBaseResponseCallback() { // from class: jkp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f38692c.d(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i, Object obj) {
        if (obj instanceof String) {
            final String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                LogUtil.a("Track_TrackDetailActivity", "name is empty");
            } else {
                HandlerExecutor.c(new Runnable() { // from class: jld
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.i(str);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str) {
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null) {
            motionPathSimplify.addExtendDataMap("alias", str);
        }
        CustomTitleBar customTitleBar = this.k;
        if (customTitleBar != null) {
            customTitleBar.setTitleText(str);
        }
    }

    private void ah() {
        am();
        String strR = r();
        ag();
        a(strR);
    }

    private void a(String str) {
        MotionPathSimplify motionPathSimplify;
        if (this.az != null) {
            this.e.b(this.av.b(this.al.getString(R.string.IDS_motiontrack_show_detail_locus)), this.az, true);
        }
        if (this.ag != null || this.ay != null) {
            xfz xfzVarB = this.av.b(str);
            if (this.z) {
                this.e.b(xfzVarB, this.ay, false);
            } else {
                this.e.b(xfzVarB, this.ag, false);
            }
        }
        if (this.ao != null && (motionPathSimplify = this.ai) != null) {
            this.e.b(this.av.b(jpq.a(this.o, motionPathSimplify.requestSportType(), izn.b(this.ai))), this.ao, false);
        }
        if (this.y != null) {
            this.e.b(this.av.b(this.al.getString(R.string.IDS_motiontrack_show_detail_chart)), this.y, false);
        }
        if (this.n != null) {
            xfz xfzVarB2 = this.av.b(this.al.getString(R.string.IDS_motiontrack_show_detail_detail));
            jqp jqpVar = this.at;
            if (jqpVar != null && jqpVar.a(0)) {
                this.e.b(xfzVarB2, this.n, true);
            } else {
                this.e.b(xfzVarB2, this.n, false);
            }
        }
        ai();
        if (this.au != null) {
            this.e.b(this.av.b(this.al.getString(R.string.IDS_motiontrack_show_detail_subsport)), this.au, this.az == null);
        }
    }

    private void ai() {
        if (this.aj != null) {
            this.av.setBackgroundResource(R.color.colorSubBackground);
            this.e.b(this.av.b(this.al.getString(R.string.IDS_rope_performance_title)), this.aj, "fromRopePerformanceHistoryFragment".equals(this.s));
        }
    }

    private void am() {
        this.ak = (HealthViewPager) findViewById(R.id.pager);
        if (CommonUtil.ap() && !this.at.ay()) {
            this.ak.setBackgroundColor(getColor(R.color.colorBackground));
            LogUtil.a("Track_TrackDetailActivity", "betaVersion change viewPager background");
        }
        this.ak.setIsScroll(false);
        e eVar = new e();
        this.ae = eVar;
        this.ak.addOnPageChangeListener(eVar);
        this.ak.setOffscreenPageLimit(7);
        this.e = new qpn(this, this.ak, this.av);
    }

    private String r() {
        jqp jqpVar = this.at;
        if (jqpVar != null && jqpVar.d() != null) {
            int iRequestSportType = this.at.d().requestSportType();
            if (this.at.be()) {
                return this.al.getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace);
            }
            if (iRequestSportType == 262 || iRequestSportType == 266) {
                this.z = true;
                return this.al.getString(R.string.IDS_hwh_motiontrack_swim_segment);
            }
            return this.al.getString(R.string.IDS_motiontrack_show_map_sport_peisu_1);
        }
        return this.al.getString(R.string.IDS_motiontrack_show_map_sport_peisu_1);
    }

    public long e() {
        Bundle extras;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null) {
            return -1L;
        }
        return extras.getLong("hotTrackParticipateNumKey", -1L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TrackScreenFrag trackScreenFrag;
        if (ap()) {
            bt();
        }
        if (this.u && (trackScreenFrag = this.az) != null) {
            trackScreenFrag.j();
        }
        if (!this.l && !this.af) {
            this.v.postDelayed(new Runnable() { // from class: jlf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38704a.bc();
                }
            }, 50L);
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bc() {
        if (!CommonUtil.ae(this.o) || this.x) {
            return;
        }
        LogUtil.j("Track_TrackDetailActivity", "restartApp.");
        a(this.o);
    }

    @Override // android.app.Activity
    public void finish() {
        LogUtil.a("Track_TrackDetailActivity", "finish.", Boolean.valueOf(this.af));
        if (this.af) {
            moveTaskToBack(true);
        }
        super.finish();
    }

    private static void a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            LogUtil.j("Track_TrackDetailActivity", "restartApp intent is null.");
            return;
        }
        try {
            launchIntentForPackage.addFlags(67108864);
            context.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_TrackDetailActivity", "restartApp ActivityNotFoundException.");
        }
    }

    private void n() {
        jqp jqpVar = new jqp();
        this.at = jqpVar;
        jqpVar.a(this.ai);
        this.at.a(this.ah);
        this.at.e(this.ax);
        this.at.r();
        this.at.e(ao());
    }

    private boolean ao() {
        if (this.j == null || this.ai == null) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "mBundle or mMotionPathSimplify is null");
            return false;
        }
        boolean zEquals = "fromTrackMainMap".equals(this.s);
        int i = this.j.getInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -1);
        LogUtil.a("Track_TrackDetailActivity", "isFromMainMapActivity ", Boolean.valueOf(zEquals), " TargetType ", Integer.valueOf(i));
        if (!zEquals || i != -1) {
            return false;
        }
        if (!jar.d(this.ai.requestTotalTime(), this.ai.requestTrackType())) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "sport total time is over");
            return false;
        }
        return jar.e(this.ai.requestSportType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (a()) {
            LogUtil.a("Track_TrackDetailActivity", "onClick() if (isClickFast())");
            return;
        }
        HeartRateFrag heartRateFrag = this.y;
        if (heartRateFrag != null) {
            if (heartRateFrag.e()) {
                LogUtil.a("Track_TrackDetailActivity", "dont click share and chart sametime");
                return;
            }
            this.y.a();
        }
        bu();
        a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (a()) {
            LogUtil.a("Track_TrackDetailActivity", "onClick() if (isClickFast())");
            return;
        }
        HeartRateFrag heartRateFrag = this.y;
        if (heartRateFrag != null) {
            if (heartRateFrag.e()) {
                LogUtil.a("Track_TrackDetailActivity", "dont click share and chart same time");
                return;
            }
            this.y.a();
        }
        bs();
        a(4);
    }

    private void a(int i) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("trackType", Integer.valueOf(d(map)));
        lmf.d().c(this.f10891b, AnalyticsValue.MOTION_TRACK_1040022.value(), map, 0);
    }

    private int d(Map<String, Object> map) {
        MotionPathSimplify motionPathSimplifyD;
        jqp jqpVar = this.at;
        if (jqpVar == null || (motionPathSimplifyD = jqpVar.d()) == null) {
            return 0;
        }
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.at.d().requestSportType()));
        int iRequestTrackType = motionPathSimplifyD.requestTrackType();
        if (motionPathSimplifyD.requestSportDataSource() == 2) {
            return 6;
        }
        return iRequestTrackType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        TrackScreenFrag trackScreenFrag = this.az;
        if (trackScreenFrag != null) {
            trackScreenFrag.d(i);
        }
        d(i);
        if (i == this.t.get("paceFrag").intValue() || i == this.t.get("subSport").intValue()) {
            this.u = true;
        } else {
            this.u = false;
        }
    }

    private void d(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long[] jArr = this.f;
        int i2 = this.h;
        jArr[i2] = jArr[i2] + (jCurrentTimeMillis - this.g);
        this.h = i;
        this.g = jCurrentTimeMillis;
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (1000 > jCurrentTimeMillis - this.ac) {
            LogUtil.a("Track_TrackDetailActivity", "onClick", ">_< >_< click too much");
            this.ac = jCurrentTimeMillis;
            return true;
        }
        this.ac = jCurrentTimeMillis;
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 != null) {
                bundle2.putParcelable("android:support:fragments", null);
            }
        }
        super.onCreate(bundle);
        clearBackgroundDrawable();
        cancelMarginAdaptation();
        cancelAdaptRingRegion();
        this.g = System.currentTimeMillis();
        o();
        this.o = this;
        t();
        k();
        q();
        n();
        aa();
        this.q = this.al.getConfiguration().fontScale;
        al();
        bw();
        m();
        bl();
        be();
        az();
        ad();
    }

    private void ad() {
        if (!"fromTrackMainMap".equals(this.s) || this.v == null) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackDetailActivity", "enter  handleTrackMainMapEntry");
        this.v.postDelayed(new Runnable() { // from class: jks
            @Override // java.lang.Runnable
            public final void run() {
                this.d.au();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void au() {
        a(new SportEventAssociator.AssociationCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.4
            @Override // com.huawei.health.plan.association.SportEventAssociator.AssociationCallback
            public void onSuccess(List<SportEventAssociator.c> list) {
                if (njy.e(list)) {
                    return;
                }
                TrackDetailActivity.this.e(list);
            }
        });
    }

    private void a(SportEventAssociator.AssociationCallback associationCallback) {
        if (this.ai != null) {
            ReleaseLogUtil.d("Track_TrackDetailActivity", "checkSportEventAssociation enter");
            int iRequestSportType = this.ai.requestSportType();
            if (c(iRequestSportType)) {
                long jRequestStartTime = this.ai.requestStartTime();
                long jRequestEndTime = this.ai.requestEndTime();
                ReleaseLogUtil.d("Track_TrackDetailActivity", "checkSportEventAssociation recordStartTime:", Long.valueOf(jRequestStartTime), "  recordEndTime:", Long.valueOf(jRequestEndTime));
                e(jRequestStartTime, jRequestEndTime, iRequestSportType, associationCallback);
            }
        }
    }

    private boolean c(int i) {
        if (i != 258 && i != 264) {
            return false;
        }
        jqp jqpVar = this.at;
        if (jqpVar != null && jqpVar.ay()) {
            return false;
        }
        MotionPathSimplify motionPathSimplify = this.ai;
        return motionPathSimplify == null || motionPathSimplify.requestFatherSportItem() == null;
    }

    private void e(long j, long j2, int i, SportEventAssociator.AssociationCallback associationCallback) {
        ReleaseLogUtil.d("Track_TrackDetailActivity", "enter performMarathonAssociationCheck");
        SportEventAssociator sportEventAssociator = new SportEventAssociator(this);
        sportEventAssociator.d(true);
        sportEventAssociator.e("marathon_race", j, j2, new int[]{i}, associationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final List<SportEventAssociator.c> list) {
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "results is null or empty");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: jla
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38699a.a(list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (isFinishing() || isDestroyed()) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "isFinishing or isDestroyed not showAssociationDialog ");
            return;
        }
        final AssociationDialog associationDialog = new AssociationDialog(this.o, list);
        associationDialog.c(new SportEventAssociator.Callback() { // from class: jkr
            @Override // com.huawei.health.plan.association.SportEventAssociator.Callback
            public final void onResult(int i, String str) {
                this.f38693b.b(associationDialog, i, str);
            }
        });
        associationDialog.a(true);
        associationDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(int i, String str, AssociationDialog associationDialog) {
        if (i != 0) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "onResult error: " + str);
            return;
        }
        if (associationDialog == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "associationDialog is null");
            return;
        }
        SportEventAssociator.c cVarD = associationDialog.d();
        if (cVarD == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "eventAssociationResult is null");
            return;
        }
        gnf.e eVarD = d(cVarD);
        if (eVarD == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "competition is null");
            return;
        }
        gnf.d dVarD = d(eVarD.c());
        if (dVarD == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "groupBean is null");
            return;
        }
        gnf.c cVar = dVarD.e().get(0);
        if (cVar == null || TextUtils.isEmpty(cVar.d())) {
            ReleaseLogUtil.d("Track_TrackDetailActivity", "objectiveInfo is empty");
        } else {
            e(eVarD, CommonUtils.a(dVarD.a()) * 1000.0d, cVar.d());
        }
    }

    private void c(gnf.e eVar, double d2, String str) {
        ReleaseLogUtil.d("Track_TrackDetailActivity", "enter sendBroadcast");
        Intent intent = new Intent();
        intent.setAction("event_sport_record_association");
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null) {
            intent.putExtra("startTime", motionPathSimplify.requestStartTime());
            intent.putExtra("endTime", this.ai.requestEndTime());
        }
        intent.putExtra(BleConstants.SPORT_TYPE, 227);
        intent.putExtra("alias", eVar.b());
        intent.putExtra("competitionId", eVar.a());
        intent.putExtra("targetDistance", String.valueOf(d2));
        intent.putExtra("competitionCategory", "0");
        intent.putExtra("targetTime", str);
        BroadcastManagerUtil.a(this.o, intent);
    }

    private void e(final gnf.e eVar, final double d2, final String str) {
        final String strB = eVar.b();
        final String strA = eVar.a();
        final String strValueOf = String.valueOf(d2);
        HandlerExecutor.c(new Runnable() { // from class: jkn
            @Override // java.lang.Runnable
            public final void run() {
                this.f38688a.b(strB, strA, strValueOf, str, eVar, d2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, String str3, String str4, gnf.e eVar, double d2) {
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null) {
            motionPathSimplify.addExtendDataMap("alias", str);
            this.ai.addExtendDataMap("competitionId", str2);
            this.ai.addExtendDataMap("targetDistance", str3);
            this.ai.addExtendDataMap("competitionCategory", "0");
            this.ai.addExtendDataMap("targetTime", str4);
            this.ai.saveSportType(227);
        }
        CustomTitleBar customTitleBar = this.k;
        if (customTitleBar != null) {
            customTitleBar.setTitleText(eVar.b());
        }
        c(eVar, d2, str4);
    }

    private gnf.e d(SportEventAssociator.c cVar) {
        List<gnf.e> listB = cVar.b();
        if (njy.e(listB)) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "competitions is null or empty");
            return null;
        }
        gnf.e eVar = listB.get(0);
        if (eVar == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "competition is null");
        }
        return eVar;
    }

    private gnf.d d(List<gnf.d> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("Track_TrackDetailActivity", "groupList is empty");
            return null;
        }
        for (gnf.d dVar : list) {
            if (dVar != null && njy.b(dVar.e())) {
                return dVar;
            }
        }
        ReleaseLogUtil.d("Track_TrackDetailActivity", "no valid group with objective found");
        return null;
    }

    private void k() {
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_click_yoyo_widget", false)) {
            LogUtil.a("Track_TrackDetailActivity", "do Bi From YOYO StartApp");
            HashMap map = new HashMap();
            map.put("click", 1);
            map.put("from", "yoyo_card");
            lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            ReleaseLogUtil.d("Track_TrackDetailActivity", "ProcessReceiver enter ");
            Serializable serializableExtra = intent.getSerializableExtra("AfterProcessTrack");
            if (serializableExtra instanceof Map) {
                TrackDetailActivity.this.a((Map<Long, double[]>) serializableExtra);
            }
            Serializable serializableExtra2 = intent.getSerializableExtra("SportAfterProcessAltList");
            if (serializableExtra2 instanceof ArrayList) {
                TrackDetailActivity.this.e((ArrayList<njm>) serializableExtra2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ArrayList<njm> arrayList) {
        jqp jqpVar = this.at;
        if (jqpVar == null || jqpVar.b() == null) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "refreshMotionPathSportAfterProcess is null in ProcessReceiver");
            return;
        }
        if (njy.e(arrayList)) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "refreshMotionPathSportAfterProcess altitudeList is null");
            return;
        }
        LogUtil.a("Track_TrackDetailActivity", "refreshMotionPathSportAfterProcess size ", Integer.valueOf(arrayList.size()));
        MotionPath motionPathB = this.at.b();
        motionPathB.saveAltitudeList(arrayList);
        this.at.a(motionPathB);
        this.at.bd();
        HandlerExecutor.c(new Runnable() { // from class: jlc
            @Override // java.lang.Runnable
            public final void run() {
                this.f38700b.bb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bb() {
        HeartRateFrag heartRateFrag = this.y;
        if (heartRateFrag != null && this.at != null) {
            heartRateFrag.f();
        }
        jan.e().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<Long, double[]> map) {
        jqp jqpVar = this.at;
        if (jqpVar == null || jqpVar.b() == null) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "mTrackDetailDataManager is null in ProcessReceiver");
            return;
        }
        if (map == null) {
            ReleaseLogUtil.a("Track_TrackDetailActivity", "gpsInfoMap is null in ProcessReceiver");
            return;
        }
        LogUtil.a("Track_TrackDetailActivity", "refreshMotionPathAfterProecess size ", Integer.valueOf(map.size()));
        MotionPath motionPathB = this.at.b();
        motionPathB.saveLbsDataMap(map);
        this.at.a(motionPathB);
        this.at.bd();
        HandlerExecutor.c(new Runnable() { // from class: jkk
            @Override // java.lang.Runnable
            public final void run() {
                this.f38685b.ay();
            }
        });
        jal.a().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ay() {
        TrackScreenFrag trackScreenFrag = this.az;
        if (trackScreenFrag == null || this.at == null) {
            return;
        }
        trackScreenFrag.e();
        this.at.e(false);
    }

    private void az() {
        if (jal.a().e()) {
            ReleaseLogUtil.d("Track_TrackDetailActivity", "refreshMotionPathAfterProcess enter ");
            a(jal.a().b());
        } else {
            if (jan.e().a()) {
                ReleaseLogUtil.d("Track_TrackDetailActivity", "SportAfterProcessManager enter ");
                e(jan.e().c());
                return;
            }
            ReleaseLogUtil.d("Track_TrackDetailActivity", "registerAfterProcessBroadcast enter ");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.update_process_track");
            BroadcastManagerUtil.d(this.o, this.i, intentFilter, SecurityConstant.f5920a, null);
            this.am = true;
        }
    }

    private void bz() {
        Context context;
        BroadcastReceiver broadcastReceiver;
        if (!this.am || (context = this.o) == null || (broadcastReceiver = this.i) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.am = false;
    }

    private void be() {
        jqp jqpVar = this.at;
        if (jqpVar == null || jqpVar.d() == null) {
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.at.d();
        HashMap map = new HashMap(16);
        map.put("sportId", motionPathSimplifyD.requestSportId());
        if (!Utils.o()) {
            map.put("startTime", String.valueOf(motionPathSimplifyD.requestStartTime()));
            map.put("endTime", String.valueOf(motionPathSimplifyD.requestEndTime()));
        }
        map.put("trackType", Integer.valueOf(d(map)));
        lmf.d().c(this.f10891b, AnalyticsValue.BI_TRACK_SPORT_DETAIL_SPORT_KEY.value(), map, 0);
    }

    private void bl() {
        if (this.at.p()) {
            LogUtil.a("Track_TrackDetailActivity", "isAutomaticIdentification");
            bj();
        } else if (this.at.bf()) {
            LogUtil.a("Track_TrackDetailActivity", "isTrackAbnormal");
            this.v.sendEmptyMessageDelayed(13, 500L);
        } else if (this.at.s()) {
            LogUtil.a("Track_TrackDetailActivity", "isDuplicated");
            bo();
        } else {
            MotionPathSimplify motionPathSimplify = this.ai;
            if (motionPathSimplify != null && "1".equals(motionPathSimplify.requestExtendDataMap().get("STEP_STATICS_EXCEPTION"))) {
                jxn.e(this.o);
            } else {
                LogUtil.a("Track_TrackDetailActivity", "normal");
            }
        }
        if (this.ai != null && aq() && "fromTrackMainMap".equals(this.s)) {
            fws.c(this.o).c(this.o, this.ai.requestTotalTime(), this.ai.requestTotalDistance());
            MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
            if (marketingApi == null) {
                LogUtil.a("Track_TrackDetailActivity", "marketingApi is null");
            } else {
                c(marketingApi);
            }
        }
    }

    private void c(MarketingApi marketingApi) {
        if (this.ai.requestSportType() == 258) {
            b(marketingApi, 230);
            c(marketingApi, 27, 230);
            c(marketingApi, 200, 230);
        } else if (this.ai.requestSportType() == 264) {
            b(marketingApi, 230);
            c(marketingApi, 30, 230);
            c(marketingApi, 200, 230);
        } else if (this.ai.requestSportType() == 257) {
            b(marketingApi, 250);
            c(marketingApi, 38, 250);
        } else {
            LogUtil.j("Track_TrackDetailActivity", "mMotionPathSimplify.requestSportType() is other");
        }
    }

    private void c(MarketingApi marketingApi, int i, int i2) {
        MarketingOption.Builder builder = new MarketingOption.Builder();
        builder.setContext(this.o);
        builder.setPageId(i2);
        builder.setTypeId(i);
        if (i == 200) {
            HashMap map = new HashMap();
            map.put("running_distance_data", Integer.valueOf(this.ai.requestTotalDistance()));
            builder.setTriggerEventParams(map);
        }
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    private void b(MarketingApi marketingApi, int i) {
        marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this.o).setPageId(i).build());
    }

    private boolean aq() {
        int iRequestSportDataSource = this.ai.requestSportDataSource();
        return (iRequestSportDataSource == 2 || iRequestSportDataSource == 1 || this.ai.requestAbnormalTrack() != 0) ? false : true;
    }

    private void t() {
        if (getIntent() == null) {
            LogUtil.e("Track_TrackDetailActivity", "entranceFromNotifyBi intent is null!");
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        this.j = extras;
        if (extras == null) {
            LogUtil.e("Track_TrackDetailActivity", "entranceFromNotifyBi mBundle is null!");
            finish();
        }
    }

    private void m() {
        int iD;
        if (this.az == null) {
            LogUtil.j("Track_TrackDetailActivity", "checkMapType mTrackFrag is null.");
            return;
        }
        jaa.d(this.o);
        double[] dArr = new double[2];
        if (!this.at.q() && !this.at.ay()) {
            iD = d(dArr, this.at);
        } else {
            iD = d(dArr);
        }
        this.ad = jaa.a();
        int iA = jaa.a(this.o, dArr[0], dArr[1]);
        if (Utils.o()) {
            b(dArr, iD, iA);
        } else {
            a(dArr, iD, iA);
        }
    }

    private int d(double[] dArr) {
        jqp next;
        Iterator<jqp> it = this.at.n().iterator();
        int iD = -1;
        while (it.hasNext() && ((next = it.next()) == null || next.b() == null || (iD = d(dArr, next)) == -1)) {
        }
        return iD;
    }

    private int d(double[] dArr, jqp jqpVar) {
        int iC = -1;
        if (jqpVar == null) {
            LogUtil.e("Track_TrackDetailActivity", "getArea trackDetailDataManager is null");
            return -1;
        }
        MotionPath motionPathB = jqpVar.b();
        if (motionPathB == null) {
            LogUtil.e("Track_TrackDetailActivity", "getArea motionPath is null");
            return -1;
        }
        Map<Long, double[]> mapRequestLbsDataMap = motionPathB.requestLbsDataMap();
        if (mapRequestLbsDataMap == null) {
            LogUtil.e("Track_TrackDetailActivity", "getArea lbsDataMap is null");
            return -1;
        }
        LogUtil.a("Track_TrackDetailActivity", "getArea lbsDataMap Size = ", Integer.valueOf(mapRequestLbsDataMap.size()));
        for (Map.Entry<Long, double[]> entry : mapRequestLbsDataMap.entrySet()) {
            if (entry != null && entry.getValue() != null && entry.getValue().length >= 2) {
                dArr[0] = entry.getValue()[0];
                dArr[1] = entry.getValue()[1];
                if (!izt.a(new jpg(dArr[0], dArr[1]))) {
                    iC = npl.c(dArr[0], dArr[1]);
                    break;
                }
            }
        }
        LogUtil.a("Track_TrackDetailActivity", "getArea area is ", Integer.valueOf(iC));
        return iC;
    }

    private void a(final double[] dArr, int i, int i2) {
        int i3 = this.ad;
        if (i3 == 0) {
            b(i2, dArr[0], dArr[1]);
            return;
        }
        if (i3 == 1) {
            if (i == 2) {
                f();
            }
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            lsy.a(new Runnable() { // from class: jle
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38703c.c(dArr);
                }
            });
        } else {
            if (ar()) {
                return;
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(double[] dArr) {
        if (jaa.b(this.o, dArr[0], dArr[1])) {
            return;
        }
        e(dArr[0], dArr[1]);
        Message messageObtain = Message.obtain(this.v);
        if (messageObtain != null) {
            messageObtain.what = 12;
            messageObtain.sendToTarget();
        }
    }

    private void b(final double[] dArr, int i, int i2) {
        int i3 = this.ad;
        if (i3 == -1) {
            f();
            return;
        }
        if (i3 == 0) {
            b(i2, dArr[0], dArr[1]);
            return;
        }
        if (i3 == 2) {
            if (ar()) {
                return;
            }
            f();
        } else if (i3 == 3) {
            lsy.a(new Runnable() { // from class: jkm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38687b.a(dArr);
                }
            });
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(double[] dArr) {
        if (jaa.b(this.o, dArr[0], dArr[1])) {
            return;
        }
        e(dArr[0], dArr[1]);
        Message messageObtain = Message.obtain(this.v);
        if (messageObtain != null) {
            messageObtain.what = 12;
            messageObtain.sendToTarget();
        }
    }

    private void b(int i, final double d2, final double d3) {
        if (i == 1) {
            if (npl.c(d2, d3) == 2) {
                f();
            }
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            lsy.a(new Runnable() { // from class: jkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(d2, d3);
                }
            });
        } else if (!jaa.b(this.o)) {
            bp();
        } else if (!ar()) {
            f();
        } else {
            LogUtil.a("Track_TrackDetailActivity", "Support Google");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(double d2, double d3) {
        if (jaa.b(this.o, d2, d3)) {
            return;
        }
        e(d2, d3);
        Message messageObtain = Message.obtain(this.v);
        if (messageObtain != null) {
            messageObtain.what = 12;
            messageObtain.sendToTarget();
        }
    }

    private void bp() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.o);
        builder.a(this.f10891b.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.a(view);
            }
        });
        builder.c().show();
    }

    private boolean ar() {
        if (qqu.a(this.o) && !jaa.l(this.o)) {
            return false;
        }
        if (qqu.c(this.o) == 2) {
            return true;
        }
        return qqu.c(this.o) == 0 && (!jaa.l(this.o) || Utils.o());
    }

    private void aa() {
        this.t.put("trackScreen", 0);
        this.t.put("paceFrag", 1);
        this.t.put("heartRateFrag", 2);
        this.t.put("detailFrag", 3);
        this.t.put("subSport", 4);
        this.t.put("segmentFrag", 5);
        this.t.put("performanceFrag", 6);
    }

    private void bw() {
        if (this.at.d() != null) {
            int iRequestSportType = this.at.d().requestSportType();
            String strD = jaa.d(this.o, iRequestSportType);
            String extendDataString = this.at.d().getExtendDataString("alias");
            if (TextUtils.isEmpty(extendDataString)) {
                if (this.at.ay()) {
                    extendDataString = qre.f(R.string.IDS_workout_record_merge_tracks);
                } else {
                    if (this.at.d().requestRunCourseId() != null) {
                        String strD2 = jaa.d(this.o, this.at.d().requestRunCourseId(), this.at.d().getExtendDataString("courseName", ""));
                        if (!TextUtils.isEmpty(strD2)) {
                            HashMap map = new HashMap(1);
                            map.put("click", "runCourseHistoryItem");
                            lmf.d().c(this.f10891b, AnalyticsValue.HEALTH_CLICK_RUN_COURSE_HISTORY_ITEM_FROM_WEAR_1040059.value(), map, 0);
                            strD = strD2;
                        }
                    } else {
                        Map<String, String> mapRequestExtendDataMap = this.at.d().requestExtendDataMap();
                        String str = mapRequestExtendDataMap.containsKey(HwExerciseConstants.JSON_NAME_RECORD_FLAG) ? mapRequestExtendDataMap.get(HwExerciseConstants.JSON_NAME_RECORD_FLAG) : "";
                        if (258 == iRequestSportType && !TextUtils.isEmpty(str) && "7".equals(str)) {
                            strD = this.al.getString(R.string.IDS_lactate_threshold_measurement);
                        }
                        if (iRequestSportType == 227) {
                            strD = jqq.e(mapRequestExtendDataMap);
                        }
                        if (iRequestSportType == 290) {
                            strD = this.ai.getExtendDataString("alias", jaa.d(this.o, iRequestSportType));
                        }
                        if (iRequestSportType == 222) {
                            extendDataString = jaa.b(mapRequestExtendDataMap);
                        }
                    }
                    extendDataString = strD;
                }
            }
            this.k.setTitleText(extendDataString);
        }
    }

    private void o() {
        this.az = null;
        this.ag = null;
        this.y = null;
        this.n = null;
        this.ay = null;
        this.au = null;
    }

    private void q() {
        if (getIntent() == null) {
            LogUtil.e("Track_TrackDetailActivity", "intent is null!");
            finish();
            return;
        }
        try {
            this.f10890a = getIntent().getStringExtra("movement");
        } catch (BadParcelableException unused) {
            LogUtil.e("Track_TrackDetailActivity", "getData catch BadParcelableException");
        }
        if (ae()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f10890a)) {
            if (!an()) {
                return;
            }
        } else {
            Bundle extras = getIntent().getExtras();
            this.j = extras;
            if (extras == null) {
                LogUtil.e("Track_TrackDetailActivity", "mBundle is null!");
                finish();
                return;
            }
            af();
        }
        this.ab = this.j.getBoolean("isNotNeedDeleteFile", false);
        this.x = this.j.getBoolean("ExitApp", false);
        this.l = this.j.getBoolean("closeBLEConnection", false);
        this.s = this.j.getString("entrance");
        this.af = this.j.getBoolean("moveTaskToBack", false);
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify == null) {
            LogUtil.e("Track_TrackDetailActivity", "getData() mMotionPathSimplify is null");
            finish();
            return;
        }
        if (motionPathSimplify.requestSportType() == 512 || this.ai.requestTrackType() == 8) {
            w();
            return;
        }
        p();
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        boolean zB = izu.b(this.ai.requestSportType());
        if (pluginSportTrackAdapterA != null && pluginSportTrackAdapterA.isFitnessCourseDisplay() && zB) {
            this.aa = this.j.getBoolean("isAfterSport", false);
        }
    }

    private boolean ae() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return false;
        }
        Serializable serializable = extras.getSerializable("simplifyDatakey");
        if (!(serializable instanceof MotionPathSimplify)) {
            return false;
        }
        MotionPathSimplify motionPathSimplify = (MotionPathSimplify) serializable;
        this.ai = motionPathSimplify;
        if (motionPathSimplify.requestTrackType() != 8) {
            return false;
        }
        w();
        return true;
    }

    private boolean an() {
        Bundle bundleB = ipi.b(this.f10890a);
        this.j = bundleB;
        if (bundleB == null) {
            LogUtil.e("Track_TrackDetailActivity", "jsonToBundle is null!");
            finish();
            return false;
        }
        try {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) HiJsonUtil.d(bundleB.getString("simplifyDatakey"), MotionPathSimplify.class);
            this.ai = motionPathSimplify;
            if (motionPathSimplify == null) {
                ReleaseLogUtil.d("Track_TrackDetailActivity", "mMotionPathSimplify is null in Json");
                finish();
                return false;
            }
            if (motionPathSimplify.requestSportType() == 257 || this.ai.requestSportType() == 281) {
                ipi.a("movement", this.o, -1L);
            }
            if (this.ai.requestSportType() == 258 || this.ai.requestSportType() == 264) {
                ipi.a("movement_run", this.o, -1L);
            }
            return true;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("Track_TrackDetailActivity", "parse MotionPathSimplify error");
        }
    }

    private void af() {
        MotionPathSimplify motionPathSimplify = (MotionPathSimplify) this.j.getSerializable("simplifyDatakey");
        this.ai = motionPathSimplify;
        if (motionPathSimplify == null) {
            this.ai = jxh.b();
            ReleaseLogUtil.d("Track_TrackDetailActivity", "getMotionPathSimplify from cache");
        }
    }

    private void p() {
        Bundle bundle = this.j;
        if (bundle == null) {
            LogUtil.e("Track_TrackDetailActivity", "mBundle is null!");
            finish();
            return;
        }
        String string = bundle.getString("contentpath");
        this.m = string;
        if (string == null) {
            LogUtil.d("Track_TrackDetailActivity", "gmConntentPath is null,get mMotionPath");
            this.ah = (MotionPath) this.j.getSerializable("motionPath");
        }
        if (this.ah == null) {
            String str = this.m;
            if (str == null || str.equals("contentpath") || this.m.length() == 0) {
                LogUtil.e("Track_TrackDetailActivity", "getData mContentPath is invalid!");
                finish();
                return;
            } else if (!d(this.m) && TextUtils.isEmpty(this.f10890a)) {
                finish();
                return;
            } else {
                this.ah = jac.d(this, this.m, this.ai.requestSportType());
                i();
            }
        }
        c(this.ah);
    }

    private void i() {
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify == null || this.ah == null || !jpq.j(motionPathSimplify.requestSportType())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<njb> listRequestAnalogPowerList = this.ah.requestAnalogPowerList();
        if (njy.e(listRequestAnalogPowerList)) {
            return;
        }
        for (njb njbVar : listRequestAnalogPowerList) {
            njh njhVar = new njh();
            njhVar.b(njbVar.acquireTime());
            njhVar.b(njbVar.a());
            arrayList.add(njhVar);
        }
        this.ah.savePowerList(arrayList);
        this.ah.saveAnalogPowerList(null);
    }

    private void w() {
        Bundle bundle = this.j;
        if (bundle == null) {
            LogUtil.e("Track_TrackDetailActivity", "mBundle is null!");
            finish();
            return;
        }
        Serializable serializable = bundle.getSerializable("subTrackDetail");
        if (!njy.b(serializable, jbv.class)) {
            LogUtil.e("Track_TrackDetailActivity", "subTrackDetail type is null!");
            finish();
            return;
        }
        this.ax.clear();
        boolean z = false;
        for (jbv jbvVar : (List) serializable) {
            if (jbvVar != null) {
                MotionPath motionPathD = null;
                if (jbvVar.b() != null) {
                    if (d(jbvVar.d())) {
                        motionPathD = jac.d(this, jbvVar.d(), jbvVar.b().requestSportType());
                    } else {
                        z = true;
                    }
                }
                this.ax.add(new jbt(jbvVar, motionPathD));
                c(motionPathD);
            }
        }
        if (z) {
            LogUtil.e("Track_TrackDetailActivity", "subTrackDetail data is abnormal(has simplfy and no track file)!");
            finish();
        }
    }

    private boolean d(String str) {
        if (FileUtils.getFile(getFilesDir().getPath() + File.separator + str).exists()) {
            return true;
        }
        LogUtil.e("Track_TrackDetailActivity", "getData mContentPath:", str, " is not exists!");
        return false;
    }

    private void c(MotionPath motionPath) {
        if (motionPath == null) {
            LogUtil.e("Track_TrackDetailActivity", "getData() mMotionPath is null");
        } else {
            b(motionPath);
        }
    }

    private void b(MotionPath motionPath) {
        if (motionPath.isValidRealtimePaceList()) {
            LogUtil.a("Track_TrackDetailActivity", "RealtimePaceList size = ", Integer.valueOf(motionPath.requestRealTimePaceList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "RealtimePaceList is null");
        }
        if (motionPath.isValidAltitudeList()) {
            LogUtil.a("Track_TrackDetailActivity", "motionPath AltitudeList", Integer.valueOf(motionPath.requestAltitudeList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "requestAltitudeList is null");
        }
        if (motionPath.isValidHeartRateList()) {
            LogUtil.a("Track_TrackDetailActivity", "HeartRateList size = ", Integer.valueOf(motionPath.requestHeartRateList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "HeartRateList is null");
        }
        if (motionPath.isValidStepRateList()) {
            LogUtil.a("Track_TrackDetailActivity", "StepRateList size = ", Integer.valueOf(motionPath.requestStepRateList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "StepRateList is null");
        }
        if (motionPath.isValidCadenceData()) {
            LogUtil.a("Track_TrackDetailActivity", "RidePostureDataList size = ", Integer.valueOf(motionPath.requestRidePostureDataList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "CadenceList is null");
        }
        if (motionPath.isValidPaddleData()) {
            LogUtil.a("Track_TrackDetailActivity", "PaddleDataList size = ", Integer.valueOf(motionPath.requestPaddleFrequencyList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "PaddleDataList is null");
        }
        if (motionPath.isValidPowerData()) {
            LogUtil.a("Track_TrackDetailActivity", "PowerDataList size = ", Integer.valueOf(motionPath.requestPowerList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "PowerDataList is null");
        }
        d(motionPath);
    }

    private void d(MotionPath motionPath) {
        if (motionPath.isValidInvalidHeartRateList()) {
            LogUtil.a("Track_TrackDetailActivity", "InvalidHRate size = ", Integer.valueOf(motionPath.requestInvalidHeartRateList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "InvalidHRate is null");
        }
        if (motionPath.requestPaceList() != null) {
            LogUtil.a("Track_TrackDetailActivity", "paceList size = ", Integer.valueOf(motionPath.requestPaceList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "paceList is null");
        }
        if (motionPath.requestBritishPaceList() != null) {
            LogUtil.a("Track_TrackDetailActivity", "britishPaceList size = ", Integer.valueOf(motionPath.requestBritishPaceList().size()));
        } else {
            LogUtil.j("Track_TrackDetailActivity", "britishPaceList is null");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void initSport() {
        LogUtil.a("Track_TrackDetailActivity", "initSport");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void initSport(boolean z) {
        LogUtil.a("Track_TrackDetailActivity", "initSport isAutoTrack ", Boolean.valueOf(z));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        b(1.0f);
        this.g = System.currentTimeMillis();
        bh();
    }

    private void bh() {
        HealthSubTabWidget healthSubTabWidget = this.av;
        if (healthSubTabWidget != null) {
            ViewGroup.LayoutParams layoutParams = healthSubTabWidget.getLayoutParams();
            layoutParams.width = qrs.q();
            this.av.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_TrackDetailActivity", "onActivityResult resultCode ", Integer.valueOf(i2));
        if (intent == null) {
            LogUtil.j("Track_TrackDetailActivity", "onActivityResult data is null");
            return;
        }
        int intExtra = intent.getIntExtra(CommonConstant.KEY_GENDER, 0);
        int intExtra2 = intent.getIntExtra("birthday", 0);
        if (i2 == 100) {
            DetailFrag detailFrag = this.n;
            if (detailFrag != null && (intExtra != detailFrag.b() || intExtra2 != this.n.e())) {
                this.n.d(true);
                LogUtil.a("Track_TrackDetailActivity", "onActivityResult showVo2maxAbility ");
            } else {
                LogUtil.j("Track_TrackDetailActivity", "mDetailFrag = null");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        long[] jArr = this.f;
        int i = this.h;
        jArr[i] = jArr[i] + (System.currentTimeMillis() - this.g);
    }

    private void b(float f) {
        Configuration configuration = this.al.getConfiguration();
        configuration.fontScale = f;
        Resources resources = this.al;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        b(this.q);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Track_TrackDetailActivity", "onDestroy");
        jbr.e();
        HashMap map = new HashMap(2);
        long j = this.f[0];
        if (j == -1) {
            map.put("mapHide", 1);
        } else {
            map.put("mapTime", Long.valueOf(j));
        }
        long j2 = this.f[1];
        if (j2 == -1) {
            map.put("paceHide", 1);
        } else {
            map.put("paceTime", Long.valueOf(j2));
        }
        long j3 = this.f[2];
        if (j3 == -1) {
            map.put("chartHide", 1);
        } else {
            map.put("chartTime", Long.valueOf(j3));
        }
        bz();
        l();
        bf();
        bd();
        map.put("detailTime", Long.valueOf(this.f[3]));
        lmf.d().c(this, AnalyticsValue.MOTION_TRACK_1040026.value(), map, 0);
        this.at = null;
        jxh.e();
    }

    private void bd() {
        this.v.removeCallbacksAndMessages(null);
        if (this.mPermissionHandler != null) {
            this.mPermissionHandler.removeCallbacksAndMessages(null);
        }
        this.ap = null;
    }

    private void bf() {
        HealthSubTabWidget healthSubTabWidget = this.av;
        if (healthSubTabWidget != null) {
            healthSubTabWidget.h();
        }
        List<Fragment> list = this.w;
        if (list != null) {
            list.clear();
        }
        List<jbt> list2 = this.ax;
        if (list2 != null) {
            list2.clear();
        }
        HealthViewPager healthViewPager = this.ba;
        if (healthViewPager != null) {
            healthViewPager.removeAllViews();
            this.ba = null;
        }
        this.k = null;
        this.ae = null;
        this.av = null;
        this.ak = null;
        this.e = null;
        this.az = null;
        this.ag = null;
        this.ao = null;
        this.aj = null;
        this.y = null;
        this.n = null;
        this.ay = null;
        this.au = null;
        this.p = null;
        this.aw = null;
        this.bb = null;
    }

    private void l() {
        if (this.ab) {
            return;
        }
        String str = this.m;
        if (str != null) {
            if (str.equals("motion_path2.txt")) {
                String strE = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(20002), "save_DB_End");
                MotionPathSimplify motionPathSimplify = this.ai;
                String strValueOf = motionPathSimplify != null ? String.valueOf(motionPathSimplify.requestStartTime()) : null;
                LogUtil.d("Track_TrackDetailActivity", strValueOf, " ", strE);
                if (strValueOf == null || !strValueOf.equals(strE)) {
                    return;
                }
                jaf.a();
                LogUtil.d("Track_TrackDetailActivity", "deleteTempFileOfBreakPoint");
                return;
            }
            if (b(this.m)) {
                LogUtil.e("Track_TrackDetailActivity", "mContentPath is ", this.m);
                return;
            }
            jaf.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.m);
            jaf.c(this.o, "motion_path_process.txt");
            LogUtil.a("Track_TrackDetailActivity", "deleteFile MOTION_PATH_PROCESS_FILE_NAME");
            return;
        }
        jqp jqpVar = this.at;
        if (jqpVar == null) {
            LogUtil.e("Track_TrackDetailActivity", "mTrackDetailDataManager is null");
            return;
        }
        List<jbt> listM = jqpVar.m();
        if (njy.b(this.at.m())) {
            Iterator<jbt> it = listM.iterator();
            while (it.hasNext()) {
                String strD = it.next().d();
                if (b(strD)) {
                    LogUtil.e("Track_TrackDetailActivity", "pathDetail is ", strD);
                } else {
                    jaf.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), strD);
                }
            }
        }
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_TrackDetailActivity", "pathName is ", str);
            return true;
        }
        return !xjl.c(new File(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getFilesDir(), str), "HiTrack_");
    }

    private void ag() {
        if (this.at == null) {
            LogUtil.j("Track_TrackDetailActivity", " initHideAndShowView() mTrackDetailDataManager is null, do not hide tab");
        } else {
            ak();
            s();
        }
    }

    private void ak() {
        if (b(c(true))) {
            this.av.setVisibility(8);
        }
    }

    private boolean b(boolean z) {
        if (this.at.a(3)) {
            this.n = null;
            this.f[3] = -1;
        } else {
            this.n = new DetailFrag();
        }
        if (this.at.a(4)) {
            this.au = null;
            this.f[4] = -1;
            return z;
        }
        this.au = new TriathlonSubDataFrag();
        if (this.az == null) {
            return true;
        }
        return z;
    }

    private boolean c(boolean z) {
        if (this.at.a(0)) {
            a(true);
            this.az = null;
            this.f[0] = -1;
        } else {
            TrackScreenFrag trackScreenFrag = new TrackScreenFrag();
            this.az = trackScreenFrag;
            trackScreenFrag.e(this.p);
            z = false;
        }
        if (this.at.a(1)) {
            this.ag = null;
            this.f[1] = -1;
        } else {
            if (this.z) {
                this.ay = new TrackSwimSegmentFrag();
            } else {
                this.ag = new PaceFrag();
            }
            z = false;
        }
        if (this.at.a(2)) {
            this.y = null;
            this.f[2] = -1;
        } else {
            this.y = new HeartRateFrag();
            z = false;
        }
        if (this.at.a(5)) {
            this.ao = null;
            this.f[5] = -1;
        } else {
            this.ao = new SegmentFrag();
            z = false;
        }
        if (this.at.a(6)) {
            this.aj = null;
            this.f[6] = -1;
            return z;
        }
        this.aj = new SkippingPerformanceFrag();
        if (this.n == null) {
            return false;
        }
        return z;
    }

    private void s() {
        jqp jqpVar = this.at;
        if (jqpVar == null || jqpVar.f() == 0) {
            this.ak.setCurrentItem(0);
        } else {
            this.ak.setCurrentItem(this.e.getCount() - 1);
        }
    }

    private void bu() {
        Intent intent = new Intent();
        intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), "com.huawei.health.receiver.MainProcessHelperService");
        intent.setAction("start_main_process_for_pluginsuggestion");
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        LogUtil.a("Track_TrackDetailActivity", "startMainProcess ", context);
        context.startForegroundService(intent);
    }

    private boolean ap() {
        Bundle bundle = this.j;
        if (bundle != null) {
            return bundle.getBoolean("isAfterSport", false) && ax();
        }
        LogUtil.j("Track_TrackDetailActivity", "isStartSportResultActivity mBundle is null");
        return false;
    }

    private boolean ax() {
        if (this.at.d() == null) {
            LogUtil.j("Track_TrackDetailActivity", "isValidSportType mTrackDetailDataManager.acquireMotionPathSimplify() is null.");
            return false;
        }
        int iRequestSportType = this.at.d().requestSportType();
        return iRequestSportType == 258 || iRequestSportType == 264 || iRequestSportType == 257 || iRequestSportType == 259 || iRequestSportType == 283;
    }

    private void bt() {
        String appPackage = com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage();
        Intent intent = new Intent();
        intent.setPackage(appPackage);
        intent.setClassName(appPackage, "com.huawei.health.suggestion.ui.run.activity.SportResultActivity");
        intent.putExtra("runningCourseId", this.at.d().requestRunCourseId());
        intent.putExtra(BleConstants.SPORT_TYPE, this.at.d().requestSportType());
        intent.putExtra("avgHeartRate", this.at.d().requestAvgHeartRate());
        intent.putExtra("avgPace", this.at.d().requestAvgPace());
        intent.putExtra("distances", this.at.d().requestTotalDistance());
        intent.putExtra("calories", this.at.d().requestTotalCalories());
        intent.putExtra(ParsedFieldTag.NPES_SPORT_TIME, this.at.d().requestTotalTime());
        intent.putExtra("endTime", this.at.d().requestEndTime());
        intent.putExtra("startTime", this.at.d().requestStartTime());
        intent.putExtra("calories", this.at.d().requestTotalCalories());
        e(this.at.d(), intent);
        LogUtil.d("Track_TrackDetailActivity", "startSportResultActivity ExitApp ", Boolean.valueOf(this.x));
        if (this.x) {
            intent.setFlags(1409318912);
        } else {
            intent.setFlags(268435456);
        }
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_TrackDetailActivity", "startSportResultActivity ActivityNotFoundException.");
        }
    }

    private void e(MotionPathSimplify motionPathSimplify, Intent intent) {
        String extendDataString = motionPathSimplify.getExtendDataString("planInfo");
        if (TextUtils.isEmpty(extendDataString) || intent == null) {
            ReleaseLogUtil.e("Track_TrackDetailActivity", "planInfo is null or intent is null");
            return;
        }
        RecordPlanInfo recordPlanInfo = (RecordPlanInfo) qqt.e(extendDataString, RecordPlanInfo.class);
        if (recordPlanInfo != null) {
            intent.putExtra("plan_execute_time", recordPlanInfo.getPlanTrainDate());
        }
    }

    private void bs() {
        e(getString(R.string.IDS_motiontrack_common_ui_waiting));
        if (this.at == null) {
            LogUtil.j("Track_TrackDetailActivity", "mTrackDetailDataManager is null");
            b();
            return;
        }
        this.ar.clear();
        if (this.at.a(0) || this.az == null) {
            LogUtil.a("Track_TrackDetailActivity", "trackFrag is hided or null");
            this.v.sendEmptyMessageDelayed(1, 200L);
            return;
        }
        this.ar.add("mapScreenshotTask");
        this.ar.add("shareFragmentTask");
        this.as = this.az.f();
        this.az.e(this.v);
        this.v.sendEmptyMessage(14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bv() {
        TrackScreenFrag trackScreenFrag;
        jbr jbrVarC = jbr.c();
        jbrVarC.b(this.at);
        if (this.as != null && (trackScreenFrag = this.az) != null) {
            jbrVarC.e(trackScreenFrag.a());
            jbrVarC.e(this.as);
        } else {
            jbrVarC.e(false);
            jbrVarC.e((Bitmap) null);
        }
        TrackScreenFrag trackScreenFrag2 = this.az;
        if (trackScreenFrag2 == null) {
            jbrVarC.b((List<jpg>) null);
            jbrVarC.d(null);
            jbrVarC.c(null);
        } else {
            List<jpg> listH = trackScreenFrag2.h();
            if (njy.e(listH)) {
                jbrVarC.b((List<jpg>) null);
            } else {
                jbrVarC.b(listH);
            }
            jbrVarC.d(this.az.g());
            jbrVarC.c(j());
        }
        ac();
    }

    private List<Integer> j() {
        ArrayList arrayList = new ArrayList();
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null && motionPathSimplify.requestSportType() == 227) {
            List<Integer> listAsList = Arrays.asList(5, 10, 15, 21, 42, 100);
            double dRequestTotalDistance = ((double) this.ai.requestTotalDistance()) / 1000.0d;
            for (Integer num : listAsList) {
                if (dRequestTotalDistance - ((double) num.intValue()) >= 5.0d) {
                    arrayList.add(num);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (njy.e(this.ar)) {
            bv();
        } else {
            c("mapScreenshotTask");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (njy.e(this.ar)) {
            bm();
            b();
        } else {
            c("shareFragmentTask");
        }
    }

    private void c(String str) {
        this.ar.remove(str);
        LogUtil.a("Track_TrackDetailActivity", "handleShareTask size ", Integer.valueOf(this.ar.size()), " task ", str);
        if (njy.e(this.ar)) {
            if (this.as == null) {
                bv();
                return;
            }
            bx();
            cb();
            bm();
            b();
        }
    }

    private void bx() {
        SportShortTrackShareFragment sportShortTrackShareFragment = this.aw;
        if (sportShortTrackShareFragment != null) {
            sportShortTrackShareFragment.b(this.as);
        }
        TrackShareAllDataFragment trackShareAllDataFragment = this.bb;
        if (trackShareAllDataFragment != null) {
            trackShareAllDataFragment.d(this.as);
        }
    }

    private void cb() {
        TrackScreenFrag trackScreenFrag;
        TrackScreenFrag trackScreenFrag2;
        if (qrs.x(this)) {
            return;
        }
        SportShortTrackShareFragment sportShortTrackShareFragment = this.aw;
        if (sportShortTrackShareFragment != null && (trackScreenFrag2 = this.az) != null) {
            sportShortTrackShareFragment.b(trackScreenFrag2.b());
        }
        TrackShareAllDataFragment trackShareAllDataFragment = this.bb;
        if (trackShareAllDataFragment == null || (trackScreenFrag = this.az) == null) {
            return;
        }
        trackShareAllDataFragment.a(trackScreenFrag.b());
    }

    private void ac() {
        this.w = h();
        this.ba.setOffscreenPageLimit(5);
        this.ba.setAdapter(new HealthFragmentStatePagerAdapter(getSupportFragmentManager()) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.8
            @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter, com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public Parcelable saveState() {
                return null;
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
            public Fragment getItem(int i) {
                if (njy.e(TrackDetailActivity.this.w, i)) {
                    LogUtil.a("Track_TrackDetailActivity", "getItem ", "The position is out of bounds");
                    return null;
                }
                return (Fragment) TrackDetailActivity.this.w.get(i);
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
            public int getCount() {
                return TrackDetailActivity.this.w.size();
            }
        });
    }

    private List<Fragment> h() {
        ArrayList arrayList = new ArrayList(16);
        c(arrayList);
        return arrayList;
    }

    private void c(List<Fragment> list) {
        this.aq.clear();
        if (jbr.c().a()) {
            SportShortTrackShareFragment sportShortTrackShareFragment = new SportShortTrackShareFragment();
            list.add(sportShortTrackShareFragment);
            this.aw = sportShortTrackShareFragment;
            this.bc = 1;
            if (this.at.ba()) {
                this.aq.add(this.al.getString(R.string.IDS_track_route_draw_pattern));
            } else {
                this.aq.add(this.al.getString(R.string.IDS_plugin_motion_track_share_tab_route));
            }
        }
        if (!this.at.ay()) {
            TrackShareAllDataFragment trackShareAllDataFragment = new TrackShareAllDataFragment();
            this.bb = trackShareAllDataFragment;
            trackShareAllDataFragment.c(this.ap);
            list.add(trackShareAllDataFragment);
            this.aq.add(getString(R.string.IDS_plugin_motion_track_share_tab_data));
        }
        SportShareNewDetailFragment sportShareNewDetailFragment = new SportShareNewDetailFragment();
        list.add(sportShareNewDetailFragment);
        this.aq.add(getString(R.string.IDS_start_track_target_custom));
        if (this.at.ay()) {
            sportShareNewDetailFragment.b(this.ap);
        }
    }

    private Bitmap c(Fragment fragment) {
        View view;
        if (fragment instanceof TrackShareAllDataFragment) {
            view = ((TrackShareAllDataFragment) fragment).e();
        } else if (fragment instanceof SportShareNewDetailFragment) {
            view = ((SportShareNewDetailFragment) fragment).b();
        } else {
            view = fragment.getView();
        }
        Bitmap bitmapE = lsv.e(view);
        if (bitmapE == null) {
            LogUtil.a("Track_TrackDetailActivity", "screenShotBitmap is null");
        }
        return bitmapE;
    }

    private void bm() {
        gxt gxtVar = new gxt(13);
        List<String> listBg = bg();
        LogUtil.a("Track_TrackDetailActivity", "shareImage shareBitmapList size", Integer.valueOf(listBg.size()));
        int size = listBg.size();
        int[] iArr = d;
        if (size != iArr.length) {
            iArr = f10889c;
        }
        e(gxtVar, listBg, iArr);
        gxtVar.c(true);
        gxtVar.b(this.bc);
        gxt gxtVarB = b(gxtVar);
        if (CommonUtil.ca()) {
            LogUtil.a("Track_TrackDetailActivity", "doShare shareToLocal storeDemoRun");
            gxtVarB.c(new SaveBitampCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.9
                @Override // com.huawei.health.socialshare.model.SaveBitampCallback
                public void onSuccess(Uri uri) {
                    String string = uri.toString();
                    LogUtil.a("Track_TrackDetailActivity", "storeDemoRun uri = ", string);
                    SharedPreferenceManager.e(TrackDetailActivity.this.o, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_RUN", string, null);
                }

                @Override // com.huawei.health.socialshare.model.SaveBitampCallback
                public void onFail(int i) {
                    LogUtil.j("Track_TrackDetailActivity", "doShare shareToLocal err = ", Integer.valueOf(i));
                }
            });
        }
        gxtVarB.d(40002);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVarB, this);
    }

    private void e(gxt gxtVar, List<String> list, int[] iArr) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                gxtVar.d(b(list.get(i), iArr[i], i));
            } else {
                gxy gxyVar = new gxy();
                gxyVar.e(false);
                gxyVar.e(list.get(i));
                gxyVar.d(e(iArr[i]));
                if (this.at.d() != null) {
                    gxyVar.c(this.at.d().requestSportType());
                    gxyVar.a(this.at.d().requestTrackType());
                }
                gxyVar.d(this.aq.get(i));
                gxtVar.d(gxyVar);
            }
        }
    }

    private gxy b(String str, int i, int i2) {
        List<Fragment> list = this.w;
        Fragment fragment = list.get(list.size() - 1);
        gxy gxyVar = new gxy();
        if (fragment instanceof SportShareNewDetailFragment) {
            SportShareNewDetailFragment sportShareNewDetailFragment = (SportShareNewDetailFragment) fragment;
            ArrayList<Integer> arrayListE = sportShareNewDetailFragment.e();
            gyd gydVarC = sportShareNewDetailFragment.c();
            gxyVar.a(arrayListE);
            gxyVar.c(gydVarC);
            gxyVar.d(sportShareNewDetailFragment.a());
        }
        gxyVar.e(true);
        gxyVar.e(str);
        if (this.at.d() != null) {
            gxyVar.c(this.at.d().requestSportType());
            gxyVar.a(this.at.d().requestTrackType());
        }
        gxyVar.d(e(i));
        if (njy.c(this.aq, i2)) {
            gxyVar.d(this.aq.get(i2));
        }
        return gxyVar;
    }

    private List<String> bg() {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < this.w.size(); i++) {
            Bitmap bitmapC = c(this.w.get(i));
            if (bitmapC != null) {
                arrayList.add(d(bitmapC, i));
                bitmapC.recycle();
            }
        }
        return arrayList;
    }

    private String d(Bitmap bitmap, int i) {
        String canonicalPath;
        File file = new File(lrp.g);
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j("Track_TrackDetailActivity", "saveBitmapToFile:mkdirs error");
        }
        File file2 = new File(file, i + ".jpg");
        try {
            canonicalPath = file2.getCanonicalPath();
        } catch (IOException e2) {
            LogUtil.j("Track_TrackDetailActivity", "getCanonicalPath", e2.getMessage());
            canonicalPath = null;
        }
        try {
            FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file2);
            if (canonicalPath != null) {
                try {
                    if (!xji.b(file2, canonicalPath)) {
                        LogUtil.j("Track_TrackDetailActivity", "invalidate file path");
                        if (file2.exists()) {
                            file2.deleteOnExit();
                        }
                        if (fileOutputStreamOpenOutputStream != null) {
                            fileOutputStreamOpenOutputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenOutputStream != null) {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStreamOpenOutputStream);
            file2.deleteOnExit();
            fileOutputStreamOpenOutputStream.flush();
            if (fileOutputStreamOpenOutputStream != null) {
                fileOutputStreamOpenOutputStream.close();
            }
        } catch (IOException e3) {
            LogUtil.j("Track_TrackDetailActivity", "saveBitmapToFile:IOException ", e3.getMessage());
        } catch (IllegalArgumentException e4) {
            LogUtil.j("Track_TrackDetailActivity", "saveBitmapToFile:IllegalArgumentException ", e4.getMessage());
        }
        return canonicalPath;
    }

    private gxt b(gxt gxtVar) {
        int iRequestSportType;
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.f((String) null);
        gxtVar.d(AnalyticsValue.HEALTH_SHARE_TRACK_SHARE_2100005.value());
        gxtVar.a(1);
        gxtVar.f(false);
        gxtVar.d(1);
        jqp jqpVar = this.at;
        if (jqpVar != null && ((iRequestSportType = jqpVar.d().requestSportType()) == 264 || iRequestSportType == 258 || iRequestSportType == 280 || iRequestSportType == 227)) {
            gxtVar.d(6);
        }
        return gxtVar;
    }

    private Map e(int i) {
        HashMap map = new HashMap();
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.at.d().requestSportType()));
        map.put("deviceType", Integer.valueOf(this.at.d().requestDeviceType()));
        map.put("prodId", this.at.d().requestProductId());
        map.put("trackShareIndex", Integer.valueOf(i));
        if (i == 10) {
            map.put("shareStyle", "customized_sharing");
        } else if (i == 1) {
            map.put("shareStyle", "data_chart");
        } else {
            map.put("shareStyle", "trajectory");
        }
        map.put("shareTab", MotionTypeApps.KEY_ACTIVITY);
        return map;
    }

    public void e(String str) {
        if (this.bd != null && !isDestroyed() && !isFinishing()) {
            this.bd.dismiss();
            this.bd = null;
        }
        new CommonDialog21(this.o, R.style.app_update_dialogActivity);
        CommonDialog21 commonDialog21B = CommonDialog21.b(this.o);
        this.bd = commonDialog21B;
        commonDialog21B.b(str);
        this.bd.setCancelable(false);
        this.bd.c();
    }

    public void b() {
        if (this.bd != null) {
            if (!isDestroyed() && !isFinishing() && this.bd.isShowing()) {
                this.bd.dismiss();
            }
            this.bd = null;
        }
    }

    public jqp c() {
        return this.at;
    }

    private void bj() {
        String strF;
        if (this.o == null) {
            LogUtil.a("Track_TrackDetailActivity", "showAbnormalTrackDialog mContext is null");
            return;
        }
        LogUtil.a("Track_TrackDetailActivity", "showAutomaticIdentificationTrackDialog");
        MotionPathSimplify motionPathSimplify = this.ai;
        if (motionPathSimplify != null && motionPathSimplify.requestSportType() == 259) {
            strF = qre.f(R.string.IDS_sport_type_automatic_identification_tips_new);
        } else {
            strF = qre.f(R.string.IDS_sport_type_automatic_identification_tips);
        }
        new CustomTextAlertDialog.Builder(this.o).a(R.string.IDS_service_area_notice_title).a(strF).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jlh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.e(view);
            }
        }).b().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bi() {
        String string;
        if (this.o == null || this.ai == null) {
            LogUtil.a("Track_TrackDetailActivity", "showAbnormalTrackDialog mContext is null");
            return;
        }
        LogUtil.a("Track_TrackDetailActivity", "showAbnormalTrackDialog");
        if (this.ai.requestSportType() == 283) {
            string = this.f10891b.getString(R.string.IDS_track_end_skip_tip);
        } else if (this.ai.requestAbnormalTrack() == 7) {
            string = this.f10891b.getString(R.string.IDS_Track_abnormal_bolt_tip, een.e(554, this.o, this.f10891b.getPackageName(), this.ai.requestProductId(), this.ai.requestSubProductId()));
        } else {
            string = this.f10891b.getString(R.string.IDS_trajectory_exception_tips);
        }
        new CustomTextAlertDialog.Builder(this.o).a(R.string.IDS_service_area_notice_title).a(string).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jkz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.d(view);
            }
        }).b().show();
    }

    private void bo() {
        if (this.o == null) {
            LogUtil.a("Track_TrackDetailActivity", "showDuplicatedDialog mContext is null");
            return;
        }
        LogUtil.a("Track_TrackDetailActivity", "showDuplicatedDialog");
        String string = this.f10891b.getString(R.string.IDS_hwh_motiontrack_duplicated_track_tips2);
        if (!Utils.h()) {
            string = this.f10891b.getString(R.string.IDS_hwh_motiontrack_duplicated_track_tips);
        }
        new CustomTextAlertDialog.Builder(this.o).a(R.string.IDS_service_area_notice_title).a(string).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: jkq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.b(view);
            }
        }).b().show();
    }

    private void a(boolean z) {
        this.k.setRightButtonVisibility(z ? 0 : 8);
    }

    public View d() {
        return this.k.getRightIconImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z) {
            this.k.setRightSoftkeyVisibility(0);
        } else {
            this.k.setRightSoftkeyVisibility(8);
        }
    }

    public void f() {
        if (this.o == null) {
            LogUtil.a("Track_TrackDetailActivity", "showAreaAlertDialog mContext is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.o);
        builder.b(R.string.IDS_hwh_motiontrack_map_type_area_remind_auto).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: jkv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackDetailActivity.c(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: loaded from: classes10.dex */
    class e implements HealthViewPager.OnPageChangeListener {
        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        private e() {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            Fragment item = TrackDetailActivity.this.e.getItem(i);
            TrackDetailActivity.this.an.setBackgroundResource(R.color.colorBackground);
            if (item instanceof HeartRateFrag) {
                TrackDetailActivity trackDetailActivity = TrackDetailActivity.this;
                trackDetailActivity.b(((Integer) trackDetailActivity.t.get("heartRateFrag")).intValue());
                return;
            }
            if (item instanceof PaceFrag) {
                TrackDetailActivity trackDetailActivity2 = TrackDetailActivity.this;
                trackDetailActivity2.b(((Integer) trackDetailActivity2.t.get("paceFrag")).intValue());
                return;
            }
            if (!(item instanceof TrackScreenFrag)) {
                if (!(item instanceof DetailFrag)) {
                    if (!(item instanceof TriathlonSubDataFrag)) {
                        LogUtil.e("Track_TrackDetailActivity", "page select error");
                        return;
                    }
                    TrackDetailActivity.this.d(false);
                    TrackDetailActivity trackDetailActivity3 = TrackDetailActivity.this;
                    trackDetailActivity3.b(((Integer) trackDetailActivity3.t.get("subSport")).intValue());
                    if (TrackDetailActivity.this.at.ay()) {
                        TrackDetailActivity.this.an.setBackgroundResource(R.color.colorSubBackground);
                        return;
                    }
                    return;
                }
                if (TrackDetailActivity.this.aa && TrackDetailActivity.this.at != null && TrackDetailActivity.this.at.a(0)) {
                    TrackDetailActivity.this.d(true);
                }
                TrackDetailActivity trackDetailActivity4 = TrackDetailActivity.this;
                trackDetailActivity4.b(((Integer) trackDetailActivity4.t.get("detailFrag")).intValue());
                return;
            }
            if (TrackDetailActivity.this.aa) {
                TrackDetailActivity.this.d(true);
            }
            TrackDetailActivity trackDetailActivity5 = TrackDetailActivity.this;
            trackDetailActivity5.b(((Integer) trackDetailActivity5.t.get("trackScreen")).intValue());
        }
    }

    private void z() {
        if (as() || lua.a(Integer.toString(20002), "guideUserEditName", false)) {
            return;
        }
        lua.d(Integer.toString(20002), "guideUserEditName", true);
        this.k.getRightIconImage().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity.10
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                TrackDetailActivity.this.br();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void br() {
        CustomTitleBar customTitleBar = this.k;
        if (customTitleBar == null || customTitleBar.getRightThirdKey() == null) {
            LogUtil.j("Track_TrackDetailActivity", "showGuideUserEditName mCustomTitleBar or mRightIconLayoutThird is null");
        } else {
            this.k.getRightThirdKey().post(new Runnable() { // from class: jky
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38698b.ba();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ba() {
        CustomTitleBar customTitleBar = this.k;
        if (customTitleBar == null) {
            LogUtil.j("Track_TrackDetailActivity", "showGuideUserEditName mCustomTitleBar is null");
            return;
        }
        PopupWindow popupWindowD = jpq.d(this, customTitleBar.getRightThirdKey(), qre.f(R.string.IDS_sport_click_change_record_name));
        this.r = popupWindowD;
        if (popupWindowD != null) {
            popupWindowD.setOutsideTouchable(false);
        }
    }

    private void e(double d2, double d3) {
        if (this.ai == null) {
            LogUtil.j("Track_TrackDetailActivity", "printLatLonInvalidInfo: simplify is null");
            return;
        }
        if (!izt.b(d2) && !izt.d(d3)) {
            LogUtil.a("Track_TrackDetailActivity", "printLatLonInvalidInfo: lat and lon is valid");
            return;
        }
        ReleaseLogUtil.d("sportType = ", Integer.valueOf(this.ai.requestSportType()), " trackType = ", Integer.valueOf(this.ai.requestTrackType()), " start = ", Long.valueOf(this.ai.requestStartTime()), " end = ", Long.valueOf(this.ai.requestEndTime()), " distance = ", Integer.valueOf(this.ai.requestTotalDistance()), " calories = ", Integer.valueOf(this.ai.requestTotalCalories()));
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a extends BaseHandler<TrackDetailActivity> {
        public a(TrackDetailActivity trackDetailActivity) {
            super(trackDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TrackDetailActivity trackDetailActivity, Message message) {
            LogUtil.a("Track_TrackDetailActivity", "InternalHandler handleMessageWhenReferenceNotNull message.what ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 1) {
                if (message.obj instanceof Bitmap) {
                    trackDetailActivity.as = (Bitmap) message.obj;
                } else {
                    trackDetailActivity.as = null;
                }
                trackDetailActivity.v();
                return;
            }
            if (i != 2) {
                switch (i) {
                    case 12:
                        trackDetailActivity.f();
                        break;
                    case 13:
                        trackDetailActivity.bi();
                        break;
                    case 14:
                        trackDetailActivity.bv();
                        break;
                }
                return;
            }
            if (trackDetailActivity.bb != null) {
                trackDetailActivity.bb.c((ShareInitCallback) null);
            }
            trackDetailActivity.x();
        }
    }
}

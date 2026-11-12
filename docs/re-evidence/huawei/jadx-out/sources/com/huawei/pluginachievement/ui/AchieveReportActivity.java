package com.huawei.pluginachievement.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import com.huawei.pluginachievement.manager.model.TrackData;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.ddv;
import defpackage.izn;
import defpackage.osb;
import defpackage.osf;
import defpackage.osv;
import defpackage.ote;
import defpackage.otl;
import defpackage.otu;
import defpackage.oue;
import defpackage.ouf;
import defpackage.ouo;
import defpackage.out;
import defpackage.ozm;
import defpackage.ozn;
import defpackage.ozp;
import defpackage.pap;
import defpackage.par;
import defpackage.paw;
import defpackage.pay;
import defpackage.pbc;
import defpackage.qpx;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveReportActivity extends BaseActivity implements AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22126b;
    private CustomTitleBar e;
    private otl f;
    private SingleDayRecord i;
    private TotalRecord k;
    private HealthTextView l;
    private HealthScrollView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private boolean g = false;
    private Map<Integer, Pair<Long, Long>> j = new HashMap(0);
    private HashMap<Integer, BitmapDrawable> d = new HashMap<>(0);
    private Runnable h = new e(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f22127c = new b(this);

    private boolean t() {
        return false;
    }

    static class b extends BaseHandler<AchieveReportActivity> {
        b(AchieveReportActivity achieveReportActivity) {
            super(achieveReportActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveReportActivity achieveReportActivity, Message message) {
            int i = message.what;
            if (i == 0) {
                Object obj = message.obj;
                if (obj instanceof UserAchieveWrapper) {
                    achieveReportActivity.a((UserAchieveWrapper) obj);
                    return;
                }
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                paw.a(achieveReportActivity);
            } else {
                qpx.e(BaseApplication.getContext(), message.obj + "");
                LogUtil.a("PLGACHIEVE_AchieveReportActivity", "ERROR_TIP :", message.obj);
            }
        }
    }

    static class e implements Runnable {
        private final WeakReference<AchieveReportActivity> d;

        e(AchieveReportActivity achieveReportActivity) {
            this.d = new WeakReference<>(achieveReportActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            AchieveReportActivity achieveReportActivity = this.d.get();
            if (achieveReportActivity == null || achieveReportActivity.f == null) {
                return;
            }
            osf osfVarB = achieveReportActivity.f.b(1, new HashMap(4));
            if (osfVarB instanceof TotalRecord) {
                achieveReportActivity.k = (TotalRecord) osfVarB;
            }
            osf osfVarB2 = achieveReportActivity.f.b(2, new HashMap(4));
            if (osfVarB2 instanceof SingleDayRecord) {
                achieveReportActivity.i = (SingleDayRecord) osfVarB2;
            }
            if (achieveReportActivity.f22125a) {
                achieveReportActivity.c();
            }
            achieveReportActivity.f22127c.sendMessage(achieveReportActivity.f22127c.obtainMessage(0, new UserAchieveWrapper(0, null, null, achieveReportActivity.i, achieveReportActivity.k)));
        }
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<AchieveReportActivity> f22131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TrackData f22132c;

        d(AchieveReportActivity achieveReportActivity, TrackData trackData) {
            this.f22131b = new WeakReference<>(achieveReportActivity);
            this.f22132c = trackData;
        }

        @Override // java.lang.Runnable
        public void run() {
            AchieveReportActivity achieveReportActivity = this.f22131b.get();
            if (achieveReportActivity == null || achieveReportActivity.f == null) {
                return;
            }
            oue.a(this.f22132c, achieveReportActivity.f, achieveReportActivity.f22126b);
        }
    }

    private Drawable b(int i) {
        HashMap<Integer, BitmapDrawable> map;
        if (!LanguageUtil.ba(this.f22126b) || (map = this.d) == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable = map.get(Integer.valueOf(i));
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawableE = qqz.e(this.f22126b, i);
        if (bitmapDrawableE != null) {
            this.d.put(Integer.valueOf(i), bitmapDrawableE);
        }
        return bitmapDrawableE;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (qrs.ac()) {
            setContentView(R.layout.activity_report_main_three_fold_fonts);
        } else {
            setContentView(R.layout.activity_report_main);
        }
        this.f22126b = this;
        l();
        a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UserAchieveWrapper userAchieveWrapper) {
        TotalRecord totalRecordAcquireTotalRecord = userAchieveWrapper.acquireTotalRecord();
        SingleDayRecord singleDayRecordAcquireSingleDayRecord = userAchieveWrapper.acquireSingleDayRecord();
        c(totalRecordAcquireTotalRecord);
        c(singleDayRecordAcquireSingleDayRecord);
    }

    private void c(TotalRecord totalRecord) {
        if (totalRecord == null) {
            totalRecord = pay.d();
        }
        this.o.setText(pay.b(this.f22126b, totalRecord));
        this.r.setText(pay.e(this.f22126b, totalRecord), TextView.BufferType.SPANNABLE);
        this.s.setText(pay.j(this.f22126b, totalRecord));
        if (paw.c()) {
            this.q.setText(pay.f(this.f22126b, totalRecord));
        } else {
            this.q.setText(pay.c(this.f22126b, totalRecord));
        }
        this.p.setText(pay.i(this.f22126b, totalRecord));
        this.t.setText(pay.h(this.f22126b, totalRecord));
        this.n.setText(pay.d(this.f22126b, totalRecord));
        this.l.setText(pay.a(this.f22126b, totalRecord));
        HealthScrollView healthScrollView = this.m;
        if (healthScrollView != null) {
            d(healthScrollView, R.id.report_detail_totaldays, R.id.content_value).setText(pay.e(this.f22126b, totalRecord), TextView.BufferType.SPANNABLE);
            d(this.m, R.id.report_detail_totaldays, R.id.content_desc).setText(pay.b(this.f22126b, totalRecord));
            d(this.m, R.id.report_detail_totalWalkDistance, R.id.content_value).setText(pay.j(this.f22126b, totalRecord));
            if (paw.c()) {
                d(this.m, R.id.report_detail_totalWalkDistance, R.id.content_desc).setText(pay.f(this.f22126b, totalRecord));
            } else {
                d(this.m, R.id.report_detail_totalWalkDistance, R.id.content_desc).setText(pay.c(this.f22126b, totalRecord));
            }
            d(this.m, R.id.report_detail_totalsteps, R.id.content_value).setText(pay.i(this.f22126b, totalRecord));
            d(this.m, R.id.report_detail_totalsteps, R.id.content_desc).setText(pay.h(this.f22126b, totalRecord));
            d(this.m, R.id.report_detail_totalcal, R.id.content_value).setText(pay.d(this.f22126b, totalRecord));
            d(this.m, R.id.report_detail_totalcal, R.id.content_desc).setText(pay.a(this.f22126b, totalRecord));
        }
    }

    private void a() {
        this.f = otl.b(getApplicationContext());
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "getData()");
        this.f.c((AchieveObserver) this);
        this.f22125a = true;
        ThreadPoolManager.c().execute(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "enter doRefreshInfo():");
        otl otlVar = this.f;
        if (otlVar != null) {
            osf osfVarB = otlVar.b(5, new HashMap(4));
            Map<String, String> mapB = b(osfVarB instanceof AchieveInfo ? (AchieveInfo) osfVarB : null);
            mapB.put("countryCode", LoginInit.getInstance(this.f22126b).getAccountInfo(1010));
            this.f.a(0, mapB);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        otl otlVar = this.f;
        if (otlVar != null) {
            otlVar.d(this);
        }
        super.onPause();
    }

    private Map<String, String> b(AchieveInfo achieveInfo) {
        if (achieveInfo == null) {
            return new HashMap(0);
        }
        HashMap map = new HashMap(4);
        map.put("timestamp", String.valueOf(achieveInfo.getSyncTimestamp()));
        return map;
    }

    private void l() {
        Typeface.create(Constants.FONT, 0);
        n();
        b();
        m();
        e();
        j();
        o();
        h();
        f();
        k();
        i();
    }

    private void i() {
        HealthScrollView healthScrollView = (HealthScrollView) out.d(this, R.id.report_scrollview);
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        healthScrollView.setLayerType(1, null);
    }

    private void k() {
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.title_layout);
        this.e = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        if (LanguageUtil.ba(this.f22126b)) {
            this.e.setRightButtonDrawable(qqz.e(this.f22126b, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        } else {
            this.e.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.e.setRightButtonOnClickListener(new View.OnClickListener() { // from class: oyo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44979c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "initTitleBar onClick share information");
        if (PermissionUtil.a()) {
            r();
        } else {
            PermissionUtil.d(this.f22126b, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.f22126b) { // from class: com.huawei.pluginachievement.ui.AchieveReportActivity.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    AchieveReportActivity.this.r();
                }
            });
        }
    }

    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (i == -1) {
            LogUtil.j("PLGACHIEVE_AchieveReportActivity", "onDataChanged error=", Integer.valueOf(i));
            if (CommonUtil.ca()) {
                return;
            }
            String string = getString(R.string.IDS_update_server_bussy);
            Handler handler = this.f22127c;
            handler.sendMessage(handler.obtainMessage(1, string));
            return;
        }
        if (userAchieveWrapper != null && userAchieveWrapper.getContentType() == 0) {
            this.f22125a = false;
            ThreadPoolManager.c().execute(this.h);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        otl otlVar = this.f;
        if (otlVar != null) {
            otlVar.d(this);
        }
        Handler handler = this.f22127c;
        if (handler != null) {
            handler.removeMessages(0);
            this.f22127c.removeMessages(2);
        }
        if (this.h != null) {
            ThreadPoolManager.c().e(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Bitmap bitmapC;
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "share enter");
        if (!osb.c(this)) {
            LogUtil.a("PLGACHIEVE_AchieveReportActivity", "isNetworkAvailable error");
            this.f22127c.sendEmptyMessage(2);
            return;
        }
        if (this.m == null) {
            this.g = true;
            HealthScrollView healthScrollView = (HealthScrollView) ((ViewStub) findViewById(R.id.share_content_layout)).inflate();
            this.m = healthScrollView;
            HealthTextView healthTextView = (HealthTextView) out.b(healthScrollView, R.id.report_share_date);
            String strE = paw.e(String.valueOf(System.currentTimeMillis()));
            if (healthTextView != null) {
                healthTextView.setText(strE);
            }
            HealthTextView healthTextView2 = (HealthTextView) out.b(this.m, R.id.report_share_date_no);
            if (healthTextView2 != null) {
                healthTextView2.setText(strE);
            }
            ImageView imageView = (ImageView) out.d(this, R.id.report_share_head);
            ((HealthTextView) out.d(this, R.id.report_share_nick)).setText(osb.b());
            String strB = osb.b(getApplicationContext());
            String strC = CommonUtil.c(strB);
            if (GeneralUtil.isSafePath(strB) && !TextUtils.isEmpty(strC) && (bitmapC = ouf.c(this, strC)) != null) {
                imageView.setImageBitmap(bitmapC);
            }
            q();
            n();
            g();
            m();
            e();
            j();
            o();
            h();
            f();
            c(this.k);
            c(this.i);
        }
        View viewB = out.b(this.m, R.id.share_top_rlayout);
        View viewB2 = out.b(this.m, R.id.share_top_rlayout_no);
        if (osb.d()) {
            viewB.setVisibility(0);
            viewB2.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = viewB2.getLayoutParams();
            layoutParams.height = (qrs.q() * 313) / 720;
            viewB2.setLayoutParams(layoutParams);
            viewB.setVisibility(8);
            viewB2.setVisibility(0);
        }
        this.m.post(new Runnable() { // from class: oyl
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
    }

    public /* synthetic */ void d() {
        Bitmap bitmapE = ouo.e(this.m);
        if (bitmapE == null) {
            LogUtil.a("PLGACHIEVE_AchieveReportActivity", "share bmpShare == null ");
        } else {
            osb.c(this.f22126b, bitmapE, AnalyticsValue.SUCCESSES_SHARE_1100014.value(), null);
        }
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "share end");
    }

    private void q() {
        ImageView imageView = (ImageView) out.d(this, R.id.vip_image);
        if (par.e()) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void m() {
        String string = this.f22126b.getString(R.string.IDS_plugin_achievement_days_desc);
        String string2 = this.f22126b.getString(R.string.IDS_plugin_achievement_step_desc);
        String string3 = this.f22126b.getString(R.string.IDS_track_total_calories);
        String string4 = this.f22126b.getString(R.string.IDS_plugin_achievement_distance_desc);
        if (!this.g) {
            e(R.id.report_detail_totaldays, R.id.content_title).setText(string);
            this.r = e(R.id.report_detail_totaldays, R.id.content_value);
            this.o = e(R.id.report_detail_totaldays, R.id.content_desc);
            e(R.id.report_detail_totalsteps, R.id.content_title).setText(string2);
            this.p = e(R.id.report_detail_totalsteps, R.id.content_value);
            this.t = e(R.id.report_detail_totalsteps, R.id.content_desc);
            e(R.id.report_detail_totalcal, R.id.content_title).setText(string3);
            this.n = e(R.id.report_detail_totalcal, R.id.content_value);
            this.l = e(R.id.report_detail_totalcal, R.id.content_desc);
            e(R.id.report_detail_totalWalkDistance, R.id.content_title).setText(string4);
            this.s = e(R.id.report_detail_totalWalkDistance, R.id.content_value);
            this.q = e(R.id.report_detail_totalWalkDistance, R.id.content_desc);
            c(R.id.report_detail_totalWalkDistance, R.id.data_line).setVisibility(8);
            return;
        }
        d(this.m, R.id.report_detail_totaldays, R.id.content_title).setText(string);
        d(this.m, R.id.report_detail_totalsteps, R.id.content_title).setText(string2);
        d(this.m, R.id.report_detail_totalcal, R.id.content_title).setText(string3);
        d(this.m, R.id.report_detail_totalWalkDistance, R.id.content_title).setText(string4);
        a(this.m, R.id.report_detail_totalWalkDistance, R.id.data_line).setVisibility(8);
    }

    private void n() {
        String string = this.f22126b.getString(R.string.IDS_plugin_achievement_user_report_total);
        String string2 = this.f22126b.getString(R.string.IDS_plugin_achievement_report_walk_record_title);
        String string3 = this.f22126b.getString(R.string.IDS_plugin_achievement_report_run_record_title);
        String string4 = this.f22126b.getString(R.string.IDS_plugin_achievement_report_cycle_record_title);
        String string5 = this.f22126b.getString(R.string.IDS_achieve_rope_record_title);
        String string6 = this.f22126b.getString(R.string.IDS_achieve_npe_title);
        if (!this.g) {
            ((HealthTextView) findViewById(R.id.report_detail_totalDataTitle)).setText(string);
            ((HealthTextView) findViewById(R.id.report_detail_stepTitle)).setText(string2);
            ((HealthTextView) findViewById(R.id.report_detail_runTitle)).setText(string3);
            ((HealthTextView) findViewById(R.id.report_detail_cylceTitle)).setText(string4);
            ((HealthTextView) findViewById(R.id.report_detail_ropeTitle)).setText(string5);
            ((HealthTextView) findViewById(R.id.report_detail_npeTitle)).setText(string6);
            return;
        }
        ((HealthTextView) this.m.findViewById(R.id.report_detail_totalDataTitle)).setText(string);
        ((HealthTextView) this.m.findViewById(R.id.report_detail_stepTitle)).setText(string2);
        ((HealthTextView) this.m.findViewById(R.id.report_detail_runTitle)).setText(string3);
        ((HealthTextView) this.m.findViewById(R.id.report_detail_cylceTitle)).setText(string4);
        ((HealthTextView) this.m.findViewById(R.id.report_detail_ropeTitle)).setText(string5);
        ((HealthTextView) this.m.findViewById(R.id.report_detail_npeTitle)).setText(string6);
    }

    private void j() {
        if (!this.g) {
            e(R.id.report_detail_runBestDistance, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_run_distance_record));
            e(R.id.report_detail_runBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_single_day_best_run_match_speed));
            e(R.id.report_detail_PB3KMBestPace, R.id.content_title).setText(paw.b(5, this.f22126b));
            e(R.id.report_detail_PB5KMBestPace, R.id.content_title).setText(paw.b(6, this.f22126b));
            e(R.id.report_detail_PB10KMBestPace, R.id.content_title).setText(paw.b(7, this.f22126b));
            e(R.id.report_detail_PBHMBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_hm_pace_record));
            e(R.id.report_detail_PBFMBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_fm_pace_record));
            c(R.id.report_detail_PBFMBestPace, R.id.data_line).setVisibility(8);
            return;
        }
        d(this.m, R.id.report_detail_runBestDistance, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_run_distance_record));
        d(this.m, R.id.report_detail_runBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_single_day_best_run_match_speed));
        d(this.m, R.id.report_detail_PB3KMBestPace, R.id.content_title).setText(paw.b(5, this.f22126b));
        d(this.m, R.id.report_detail_PB5KMBestPace, R.id.content_title).setText(paw.b(6, this.f22126b));
        d(this.m, R.id.report_detail_PB10KMBestPace, R.id.content_title).setText(paw.b(7, this.f22126b));
        d(this.m, R.id.report_detail_PBHMBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_hm_pace_record));
        d(this.m, R.id.report_detail_PBFMBestPace, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_fm_pace_record));
        a(this.m, R.id.report_detail_PBFMBestPace, R.id.data_line).setVisibility(8);
    }

    private void c(SingleDayRecord singleDayRecord) {
        c(R.id.report_detail_PB3KMBestPace, singleDayRecord);
        c(R.id.report_detail_PB5KMBestPace, singleDayRecord);
        c(R.id.report_detail_PB10KMBestPace, singleDayRecord);
        c(R.id.report_detail_PBHMBestPace, singleDayRecord);
        c(R.id.report_detail_PBFMBestPace, singleDayRecord);
        c(R.id.report_detail_cylceBestDistance, singleDayRecord);
        c(R.id.report_detail_cylceBestPace, singleDayRecord);
        c(R.id.report_detail_stepBestDistance, singleDayRecord);
        c(R.id.report_detail_singleDayMoststeps, singleDayRecord);
        c(R.id.report_detail_runBestDistance, singleDayRecord);
        c(R.id.report_detail_runBestPace, singleDayRecord);
        c(R.id.report_detail_ropeBestRopeSingCount, singleDayRecord);
        c(R.id.report_detail_ropeBestRopeContinuousCount, singleDayRecord);
        c(R.id.report_detail_ropeBestRopeSpeed, singleDayRecord);
        c(R.id.report_detail_ropeBestRopeDuration, singleDayRecord);
        c(R.id.report_detail_bestNpe, singleDayRecord);
    }

    private void b() {
        a(d(R.id.report_detail_totaldays, R.id.content_icon), R.mipmap.ic_day);
        a(d(R.id.report_detail_totalsteps, R.id.content_icon), R.mipmap.ic_step_off);
        a(d(R.id.report_detail_totalcal, R.id.content_icon), R.mipmap.ic_kcal_off);
        a(d(R.id.report_detail_totalWalkDistance, R.id.content_icon), R.mipmap.ic_distance_off);
        a(d(R.id.report_detail_stepBestDistance, R.id.content_icon), R.mipmap.ic_walk);
        a(d(R.id.report_detail_singleDayMoststeps, R.id.content_icon), R.mipmap.ic_step_off);
        a(d(R.id.report_detail_cylceBestDistance, R.id.content_icon), R.mipmap.ic_ride);
        a(d(R.id.report_detail_cylceBestPace, R.id.content_icon), R.mipmap.ic_speed);
        a(d(R.id.report_detail_runBestDistance, R.id.content_icon), R.mipmap.ic_run);
        a(d(R.id.report_detail_runBestPace, R.id.content_icon), R.mipmap.ic_speed);
        a(d(R.id.report_detail_ropeBestRopeSingCount, R.id.content_icon), R.drawable.ic_rope_liantiao);
        a(d(R.id.report_detail_ropeBestRopeContinuousCount, R.id.content_icon), R.drawable.ic_rope_liantiao);
        a(d(R.id.report_detail_ropeBestRopeSpeed, R.id.content_icon), R.drawable.ic_rope_speed);
        a(d(R.id.report_detail_ropeBestRopeDuration, R.id.content_icon), R.drawable.ic_rope_time);
        d(R.id.report_detail_PB3KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_3k_off);
        d(R.id.report_detail_PB5KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_5k_off);
        d(R.id.report_detail_PB10KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_10k_off);
        d(R.id.report_detail_PBHMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_half_off);
        d(R.id.report_detail_PBFMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_full_off);
        d(R.id.report_detail_bestNpe, R.id.content_icon).setBackgroundResource(R.mipmap.ic_tigan_dark);
    }

    private void g() {
        a(b(this.m, R.id.report_detail_totaldays, R.id.content_icon), R.mipmap.ic_day);
        a(b(this.m, R.id.report_detail_totalsteps, R.id.content_icon), R.mipmap.ic_step_off);
        a(b(this.m, R.id.report_detail_totalcal, R.id.content_icon), R.mipmap.ic_kcal_off);
        a(b(this.m, R.id.report_detail_totalWalkDistance, R.id.content_icon), R.mipmap.ic_distance_off);
        a(b(this.m, R.id.report_detail_stepBestDistance, R.id.content_icon), R.mipmap.ic_walk);
        a(b(this.m, R.id.report_detail_singleDayMoststeps, R.id.content_icon), R.mipmap.ic_step_off);
        a(b(this.m, R.id.report_detail_cylceBestDistance, R.id.content_icon), R.mipmap.ic_ride);
        a(b(this.m, R.id.report_detail_cylceBestPace, R.id.content_icon), R.mipmap.ic_speed);
        a(b(this.m, R.id.report_detail_runBestDistance, R.id.content_icon), R.mipmap.ic_run);
        a(b(this.m, R.id.report_detail_runBestPace, R.id.content_icon), R.mipmap.ic_speed);
        a(b(this.m, R.id.report_detail_ropeBestRopeSingCount, R.id.content_icon), R.drawable.ic_rope_liantiao);
        a(b(this.m, R.id.report_detail_ropeBestRopeContinuousCount, R.id.content_icon), R.drawable.ic_rope_liantiao);
        a(b(this.m, R.id.report_detail_ropeBestRopeSpeed, R.id.content_icon), R.drawable.ic_rope_speed);
        a(b(this.m, R.id.report_detail_ropeBestRopeDuration, R.id.content_icon), R.drawable.ic_rope_time);
        b(this.m, R.id.report_detail_PB3KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_3k_off);
        b(this.m, R.id.report_detail_PB5KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_5k_off);
        b(this.m, R.id.report_detail_PB10KMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_10k_off);
        b(this.m, R.id.report_detail_PBHMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_half_off);
        b(this.m, R.id.report_detail_PBFMBestPace, R.id.content_icon).setBackgroundResource(R.mipmap.ic_run_full_off);
        b(this.m, R.id.report_detail_bestNpe, R.id.content_icon).setBackgroundResource(R.mipmap.ic_tigan_dark);
    }

    private void a(ImageView imageView, int i) {
        Drawable drawableB = b(i);
        if (drawableB != null) {
            imageView.setBackground(drawableB);
        } else {
            imageView.setBackgroundResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        if (i == R.id.report_detail_stepBestDistance) {
            return 1;
        }
        if (i == R.id.report_detail_singleDayMoststeps) {
            return 2;
        }
        if (i == R.id.report_detail_cylceBestDistance) {
            return 10;
        }
        if (i == R.id.report_detail_cylceBestPace) {
            return 11;
        }
        if (i == R.id.report_detail_runBestDistance) {
            return 3;
        }
        if (i == R.id.report_detail_runBestPace) {
            return 4;
        }
        if (i == R.id.report_detail_PB3KMBestPace) {
            return 5;
        }
        if (i == R.id.report_detail_PB5KMBestPace) {
            return 6;
        }
        if (i == R.id.report_detail_PB10KMBestPace) {
            return 7;
        }
        if (i == R.id.report_detail_PBHMBestPace) {
            return 8;
        }
        if (i == R.id.report_detail_PBFMBestPace) {
            return 9;
        }
        if (i == R.id.report_detail_ropeBestRopeSingCount) {
            return 12;
        }
        if (i == R.id.report_detail_ropeBestRopeContinuousCount) {
            return 13;
        }
        if (i == R.id.report_detail_ropeBestRopeSpeed) {
            return 14;
        }
        if (i == R.id.report_detail_ropeBestRopeDuration) {
            return 15;
        }
        return d(i);
    }

    private int d(int i) {
        return i == R.id.report_detail_bestNpe ? 16 : 0;
    }

    private void e() {
        String string = this.f22126b.getString(R.string.IDS_plugin_achievement_report_cycle_distance_record);
        String string2 = this.f22126b.getString(R.string.IDS_plugin_achievement_report_cycle_speed_record);
        if (!this.g) {
            e(R.id.report_detail_cylceBestDistance, R.id.content_title).setText(string);
            e(R.id.report_detail_cylceBestPace, R.id.content_title).setText(string2);
            c(R.id.report_detail_cylceBestPace, R.id.data_line).setVisibility(8);
        } else {
            d(this.m, R.id.report_detail_cylceBestDistance, R.id.content_title).setText(string);
            d(this.m, R.id.report_detail_cylceBestPace, R.id.content_title).setText(string2);
            a(this.m, R.id.report_detail_cylceBestPace, R.id.data_line).setVisibility(8);
        }
    }

    private void h() {
        String string = this.f22126b.getString(R.string.IDS_achieve_rope_sing_count_title);
        String string2 = this.f22126b.getString(R.string.IDS_achieve_rope_con_count_title);
        String string3 = this.f22126b.getString(R.string.IDS_achieve_rope_speed_title);
        String string4 = this.f22126b.getString(R.string.IDS_achieve_rope_duration_title);
        if (!this.g) {
            e(R.id.report_detail_ropeBestRopeSingCount, R.id.content_title).setText(string);
            d(R.id.report_detail_ropeBestRopeSingCount, R.id.record_arrow).setVisibility(8);
            e(R.id.report_detail_ropeBestRopeContinuousCount, R.id.content_title).setText(string2);
            d(R.id.report_detail_ropeBestRopeContinuousCount, R.id.record_arrow).setVisibility(8);
            e(R.id.report_detail_ropeBestRopeSpeed, R.id.content_title).setText(string3);
            d(R.id.report_detail_ropeBestRopeSpeed, R.id.record_arrow).setVisibility(8);
            e(R.id.report_detail_ropeBestRopeDuration, R.id.content_title).setText(string4);
            d(R.id.report_detail_ropeBestRopeDuration, R.id.record_arrow).setVisibility(8);
            c(R.id.report_detail_ropeBestRopeDuration, R.id.data_line).setVisibility(8);
            return;
        }
        d(this.m, R.id.report_detail_ropeBestRopeSingCount, R.id.content_title).setText(string);
        d(this.m, R.id.report_detail_ropeBestRopeContinuousCount, R.id.content_title).setText(string2);
        d(this.m, R.id.report_detail_ropeBestRopeSpeed, R.id.content_title).setText(string3);
        d(this.m, R.id.report_detail_ropeBestRopeDuration, R.id.content_title).setText(string4);
        a(this.m, R.id.report_detail_ropeBestRopeDuration, R.id.data_line).setVisibility(8);
    }

    private void f() {
        if (t()) {
            return;
        }
        String string = this.f22126b.getString(R.string.IDS_achieve_npe_score_title);
        if (!this.g) {
            e(R.id.report_detail_bestNpe, R.id.content_title).setText(string);
            c(R.id.report_detail_bestNpe, R.id.data_line).setVisibility(8);
        } else {
            d(this.m, R.id.report_detail_bestNpe, R.id.content_title).setText(string);
            a(this.m, R.id.report_detail_bestNpe, R.id.data_line).setVisibility(8);
        }
    }

    private void o() {
        if (!this.g) {
            e(R.id.report_detail_stepBestDistance, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_walk_distance_record));
            e(R.id.report_detail_singleDayMoststeps, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_single_day_most_steps));
            c(R.id.report_detail_singleDayMoststeps, R.id.data_line).setVisibility(8);
            d(R.id.report_detail_singleDayMoststeps, R.id.record_arrow).setVisibility(8);
            return;
        }
        d(this.m, R.id.report_detail_stepBestDistance, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_walk_distance_record));
        d(this.m, R.id.report_detail_singleDayMoststeps, R.id.content_title).setText(this.f22126b.getString(R.string.IDS_plugin_achievement_report_single_day_most_steps));
        a(this.m, R.id.report_detail_singleDayMoststeps, R.id.data_line).setVisibility(8);
    }

    private void a(int i) {
        e(i, R.id.content_value).setVisibility(8);
        e(i, R.id.content_title).setTextColor(getResources().getColor(R.color.textColorPrimary));
        e(i, R.id.content_title).setTextSize(0, getResources().getDimension(R.dimen.textSizeBody1));
        a(i, R.id.record_data_layout).setVisibility(8);
    }

    private void c(int i) {
        e(i, R.id.content_value).setVisibility(0);
        e(i, R.id.content_title).setTextColor(getResources().getColor(R.color.textColorPrimary));
        e(i, R.id.content_title).setTextSize(0, getResources().getDimension(R.dimen.textSizeBody1));
        a(i, R.id.record_data_layout).setVisibility(0);
        if (pap.e(this.f22126b)) {
            d(i, R.id.record_arrow).setImageResource(R.drawable.common_ui_arrow_left);
        }
        if (CommonUtil.ca()) {
            d(i, R.id.record_arrow).setVisibility(8);
        }
    }

    private void d(int i, int i2, String str) {
        Pair<Long, Long> pairC = c(str, i2);
        d(i2, ((Long) pairC.first).longValue(), ((Long) pairC.second).longValue());
        if (paw.c(i2)) {
            a(i, i2, str);
            return;
        }
        if (paw.g(i2)) {
            e(i, i2, str);
            return;
        }
        if (paw.f(i2)) {
            e(i, str);
        } else if (paw.h(i2)) {
            c(i, i2, str);
        } else {
            b(i, i2, str);
        }
    }

    private void b(int i, int i2, String str) {
        if (paw.j(i2)) {
            a(i, str);
        } else {
            a(i);
            i(i);
        }
    }

    private void a(int i, ozm ozmVar) {
        if (ozmVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportActivity", "dealMedalOnException bestMotion == null!");
            return;
        }
        if (i == 3) {
            TrackData trackData = new TrackData();
            trackData.saveType(258);
            trackData.saveDistance(ozmVar.c());
            trackData.saveTrackTime(ozmVar.d());
            LogUtil.a("PLGACHIEVE_AchieveReportActivity", "dealMedalOnException run report = ", Long.valueOf(ozmVar.c()));
            b(trackData);
            return;
        }
        if (i != 10) {
            LogUtil.j("PLGACHIEVE_AchieveReportActivity", "not deal");
            return;
        }
        TrackData trackData2 = new TrackData();
        trackData2.saveType(259);
        trackData2.saveDistance(ozmVar.c());
        trackData2.saveTrackTime(ozmVar.d());
        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "dealMedalOnException cycle report = ", Long.valueOf(ozmVar.c()));
        b(trackData2);
    }

    private void b(TrackData trackData) {
        ThreadPoolManager.c().execute(new d(this, trackData));
    }

    private void a(int i, int i2, String str) {
        ozm ozmVarC = paw.c(str);
        if (ozmVarC != null) {
            b(i, i2);
            e(i, R.id.content_desc).setVisibility(8);
            c(i);
            String strA = pbc.a(ozmVarC.c() * 1.0d, this.f22126b);
            String strE = paw.e(String.valueOf(ozmVarC.d()));
            e(i, R.id.content_value).setText(strA);
            e(i, R.id.record_data).setText(strE);
            d(i, strA, strE, null);
            a(i2, ozmVarC);
            return;
        }
        a(i);
        i(i);
    }

    private void e(int i, int i2, String str) {
        String strValueOf;
        ozn oznVarB = paw.b(str);
        if (oznVarB != null) {
            b(i, i2);
            e(i, R.id.content_desc).setVisibility(8);
            c(i);
            if (4 == i2) {
                strValueOf = izn.a((float) oznVarB.e());
            } else {
                strValueOf = String.valueOf(paw.d((int) (oznVarB.e() + 0.5d)));
            }
            String strE = paw.e(String.valueOf(oznVarB.c()));
            if (paw.b(i2)) {
                String string = this.f22126b.getString(R.string.IDS_motiontrack_show_detail_average_speed);
                String strA = paw.a(oznVarB.e());
                if (UnitUtil.f()) {
                    strA = UnitUtil.e(UnitUtil.e(ote.d(strA), 3), 1, 2);
                    string = this.f22126b.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
                    e(i, R.id.content_unit).setText(string);
                }
                e(i, R.id.content_value).setText(strA);
                e(i, R.id.content_unit).setVisibility(0);
                d(i, strA, strE, string);
            } else {
                e(i, R.id.content_value).setText(strValueOf);
                d(i, strValueOf, strE, null);
            }
            e(i, R.id.record_data).setText(strE);
            return;
        }
        a(i);
        i(i);
    }

    private void e(int i, String str) {
        ozp ozpVarH = paw.h(str);
        if (ozpVarH != null) {
            e(i, R.id.content_desc).setVisibility(8);
            String strA = pbc.a(this.f22126b, ozpVarH.d());
            String strD = paw.d(String.valueOf(ozpVarH.a()));
            c(i);
            e(i, R.id.content_value).setText(pbc.a(this.f22126b, ozpVarH.d()));
            e(i, R.id.record_data).setText(paw.d(String.valueOf(ozpVarH.a())));
            d(i, strA, strD, null);
            return;
        }
        a(i);
        i(i);
    }

    private void c(int i, int i2, String str) {
        ozm ozmVarC = paw.c(str);
        if (ozmVarC != null) {
            e(i, R.id.content_desc).setVisibility(8);
            c(i);
            String strE = pbc.e(ozmVarC.c(), i2, this.f22126b);
            String strE2 = paw.e(String.valueOf(ozmVarC.d()));
            e(i, R.id.content_value).setText(strE);
            e(i, R.id.record_data).setText(strE2);
            d(i, strE, strE2, null);
            return;
        }
        a(i);
        i(i);
        j(i2);
    }

    private void a(int i, String str) {
        if (t() || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            double d2 = osv.d(ParsedFieldTag.NPES_TOTAL_SCORE, jSONObject);
            long jE = osv.e(ParsedFieldTag.NPES_SPORT_TIME, jSONObject);
            String strC = osv.c(ParsedFieldTag.NPES_TEAM_TYPE, jSONObject);
            String strC2 = osv.c(ParsedFieldTag.NPES_RESULT_ID, jSONObject);
            if (paw.a(d2, 0.0d) == 0 && jE == 0) {
                a(i);
                i(i);
                j(16);
                return;
            }
            e(i, d2, jE, strC, strC2);
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveReportActivity", "initNpeRecordView Exception:", e2.getMessage());
        }
    }

    private void e(int i, double d2, long j, final String str, final String str2) {
        String quantityString = getResources().getQuantityString(R.plurals.IDS_sleep_referece_title_score_string, (int) d2, UnitUtil.e(d2, 1, 0));
        e(i, R.id.content_value).setText(quantityString);
        String strE = paw.e(String.valueOf(j));
        e(i, R.id.record_data).setText(strE);
        e(i, R.id.content_desc).setVisibility(8);
        c(i);
        d(i, quantityString, strE, null);
        if (CommonUtil.ca()) {
            return;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportActivity", "initNpeRecordView: layoutResView is null");
            return;
        }
        viewFindViewById.setBackgroundResource(R.drawable.achieve_selector_list_item_press_state);
        viewFindViewById.setPressed(false);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveReportActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ddv.b().loadH5ProApp(AchieveReportActivity.this.f22126b, "com.huawei.health.h5.physical-fitness-test", new H5ProLaunchOption.Builder().addPath("#/testReport?from=4&teamType=" + str + "&resultId=" + str2));
            }
        });
    }

    private void b(final int i, final int i2) {
        if (CommonUtil.ca()) {
            return;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportActivity", "setClickEvent: layoutResView is null");
            return;
        }
        viewFindViewById.setBackgroundResource(R.drawable.achieve_selector_list_item_press_state);
        viewFindViewById.setPressed(false);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveReportActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!otu.d(500)) {
                    int iE = AchieveReportActivity.this.e(i);
                    String strA = paw.a(i2, AchieveReportActivity.this.i);
                    Intent intent = new Intent();
                    intent.setClassName(AchieveReportActivity.this.f22126b, PersonalData.CLASS_NAME_PERSONAL_REPORT_ADVANCED);
                    intent.putExtra("dialogType", iE);
                    intent.putExtra("value", strA);
                    AchieveReportActivity.this.f22126b.startActivity(intent);
                    return;
                }
                LogUtil.j("PLGACHIEVE_AchieveReportActivity", "setClickEvent enter isFastClick!");
            }
        });
    }

    private void c(int i, SingleDayRecord singleDayRecord) {
        int iE = e(i);
        String strA = paw.a(iE, singleDayRecord);
        if (Utils.o() && Utils.h() && paw.j(iE)) {
            findViewById(i).setVisibility(8);
            findViewById(R.id.report_detail_npeTitle).setVisibility(8);
            i(i);
            j(iE);
            return;
        }
        if (!TextUtils.isEmpty(strA)) {
            d(i, iE, strA);
            return;
        }
        a(i);
        i(i);
        j(iE);
    }

    private void d(int i, String str, String str2, String str3) {
        HealthScrollView healthScrollView = this.m;
        if (healthScrollView != null) {
            c(healthScrollView, i, R.id.record_data_layout).setVisibility(0);
            d(this.m, i, R.id.content_desc).setVisibility(8);
            d(this.m, i, R.id.content_value).setText(str);
            d(this.m, i, R.id.record_data).setText(str2);
            b(this.m, i, R.id.record_arrow).setVisibility(8);
            if (str3 != null) {
                d(this.m, i, R.id.content_unit).setVisibility(0);
            }
        }
    }

    private void i(int i) {
        HealthScrollView healthScrollView = this.m;
        if (healthScrollView != null) {
            healthScrollView.findViewById(i).setVisibility(8);
        }
    }

    private void j(int i) {
        HealthScrollView healthScrollView = this.m;
        if (healthScrollView != null) {
            if (i == 10) {
                healthScrollView.findViewById(R.id.report_detail_cylceTitle).setVisibility(8);
                return;
            }
            if (i == 3) {
                healthScrollView.findViewById(R.id.report_detail_runTitle).setVisibility(8);
                return;
            }
            if (i == 2) {
                healthScrollView.findViewById(R.id.report_detail_stepTitle).setVisibility(8);
            } else if (i == 12) {
                healthScrollView.findViewById(R.id.report_detail_ropeTitle).setVisibility(8);
            } else {
                g(i);
            }
        }
    }

    private void g(int i) {
        if (i == 16) {
            this.m.findViewById(R.id.report_detail_npeTitle).setVisibility(8);
        } else {
            LogUtil.d("PLGACHIEVE_AchieveReportActivity", "initShareModuleView key:", Integer.valueOf(i));
        }
    }

    private HealthTextView d(HealthScrollView healthScrollView, int i, int i2) {
        return (HealthTextView) out.b(healthScrollView, i).findViewById(i2);
    }

    private HealthDivider a(HealthScrollView healthScrollView, int i, int i2) {
        return (HealthDivider) out.b(healthScrollView, i).findViewById(i2);
    }

    private ImageView b(HealthScrollView healthScrollView, int i, int i2) {
        return (ImageView) out.b(healthScrollView, i).findViewById(i2);
    }

    private LinearLayout c(HealthScrollView healthScrollView, int i, int i2) {
        return (LinearLayout) out.b(healthScrollView, i).findViewById(i2);
    }

    private HealthTextView e(int i, int i2) {
        return (HealthTextView) out.d(this, i).findViewById(i2);
    }

    private HealthDivider c(int i, int i2) {
        return (HealthDivider) out.d(this, i).findViewById(i2);
    }

    private ImageView d(int i, int i2) {
        return (ImageView) out.d(this, i).findViewById(i2);
    }

    private LinearLayout a(int i, int i2) {
        return (LinearLayout) out.d(this, i).findViewById(i2);
    }

    private void d(int i, long j, long j2) {
        if (j2 <= j) {
            j2 = 1 + j;
        }
        Pair<Long, Long> pair = new Pair<>(Long.valueOf(j), Long.valueOf(j2));
        if (this.j == null) {
            this.j = new HashMap(4);
        }
        this.j.put(Integer.valueOf(i), pair);
    }

    private Pair<Long, Long> c(String str, int i) {
        long jE = 0;
        Pair<Long, Long> pair = new Pair<>(0L, 0L);
        try {
            JSONArray jSONArray = new JSONArray(str);
            long jE2 = 0;
            long j = 0;
            double d2 = 0.0d;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (paw.c(i)) {
                    long jE3 = osv.e("value", jSONObject);
                    if (jE3 > j) {
                        jE = osv.e("startTime", jSONObject);
                        long jE4 = osv.e("endTime", jSONObject);
                        LogUtil.a("PLGACHIEVE_AchieveReportActivity", "value=", Long.valueOf(jE3), "startTime=", Long.valueOf(jE), "endTime=", Long.valueOf(jE4));
                        jE2 = jE4;
                        j = jE3;
                    }
                } else if (!paw.g(i)) {
                    LogUtil.d("PLGACHIEVE_AchieveReportActivity", "getStartTimeAndEndTime key", Integer.valueOf(i));
                } else {
                    double d3 = osv.d("value", jSONObject);
                    if (d2 == 0.0d) {
                        jE = osv.e("startTime", jSONObject);
                        jE2 = osv.e("endTime", jSONObject);
                        d2 = d3;
                    }
                    if (d3 <= d2) {
                        jE = osv.e("startTime", jSONObject);
                        jE2 = osv.e("endTime", jSONObject);
                        d2 = d3;
                    }
                }
            }
            return new Pair<>(Long.valueOf(jE), Long.valueOf(jE2));
        } catch (JSONException e2) {
            LogUtil.e("PLGACHIEVE_AchieveReportActivity", "getStartTimeAndEndTime Exception:", e2.getMessage());
            return pair;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

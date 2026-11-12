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
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.data.Entry;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart;
import com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportMarkView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.izn;
import defpackage.lmf;
import defpackage.oru;
import defpackage.osb;
import defpackage.ouo;
import defpackage.out;
import defpackage.ozm;
import defpackage.ozn;
import defpackage.pal;
import defpackage.pao;
import defpackage.paw;
import defpackage.pbc;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveReportAdvanceActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22133c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22134a;
    private CustomTitleBar aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private PluginAchieveAdapter ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private HealthTextView aj;
    private HealthTextView am;
    private String an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22135b;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView g;
    private HealthTextView i;
    private HealthTextView j;
    private LinearLayout k;
    private Context n;
    private int p;
    private ArrayList q;
    private int r;
    private String s;
    private HwHealthAchieveReportLineChart t;
    private ImageView v;
    private ImageView x;
    private int y;
    private HealthTextView z;
    private Map<Long, MotionPathSimplify> u = new HashMap(0);
    private ArrayList<Long> w = new ArrayList<>(0);
    private long h = 0;
    private boolean f = false;
    private int o = 0;
    private long m = 0;
    private Handler l = new Handler() { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                AchieveReportAdvanceActivity.this.j();
                return;
            }
            if (i == 2) {
                paw.a(AchieveReportAdvanceActivity.this.n);
            } else {
                if (i != 3) {
                    return;
                }
                LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "mMotionCount is ", Integer.valueOf(AchieveReportAdvanceActivity.this.p));
                AchieveReportAdvanceActivity achieveReportAdvanceActivity = AchieveReportAdvanceActivity.this;
                achieveReportAdvanceActivity.a(achieveReportAdvanceActivity.p);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achievement_record_history_page);
        this.n = this;
        this.ad = oru.a(this).getAdapter();
        a();
        h();
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "intent is null");
            finish();
            return;
        }
        this.y = intent.getIntExtra("dialogType", 0);
        String stringExtra = intent.getStringExtra("value");
        this.s = stringExtra;
        if (this.y == 0 || TextUtils.isEmpty(stringExtra)) {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "mType or mJson is null");
            finish();
        } else {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "mType=", Integer.valueOf(this.y));
        }
    }

    private void h() {
        if (UnitUtil.f()) {
            this.f = true;
            this.an = paw.a(this.y, this.n);
        } else {
            this.an = paw.e(this.y, this.n);
        }
        c();
        this.t = (HwHealthAchieveReportLineChart) out.d(this, R.id.hw_health_report_linechart);
        this.ag = (HealthTextView) out.d(this, R.id.hw_health_total_pace);
        this.j = (HealthTextView) out.d(this, R.id.hw_health_date);
        this.am = (HealthTextView) out.d(this, R.id.hw_health_total_sport_time);
        this.f22134a = (HealthTextView) out.d(this, R.id.hw_health_average_speed);
        this.g = (HealthTextView) out.d(this, R.id.hw_health_average_speed_unit);
        this.i = (HealthTextView) out.d(this, R.id.hw_health_value_desc);
        this.af = (HealthTextView) out.d(this, R.id.hw_health_total_heat);
        this.aj = (HealthTextView) out.d(this, R.id.hw_health_total_pace_unit);
        this.x = (ImageView) out.d(this, R.id.achieve_report_middle);
        this.v = (ImageView) out.d(this, R.id.achieve_report_share_middle);
        this.ab = (HealthTextView) out.d(this, R.id.hw_health_share_value_desc);
        this.z = (HealthTextView) out.d(this, R.id.hw_health_share_pace_unit);
        this.ah = (HealthTextView) out.d(this, R.id.hw_health_share_total_pace);
        this.ai = (HealthTextView) out.d(this, R.id.hw_health_share_total_sport_time);
        this.d = (HealthTextView) out.d(this, R.id.hw_health_share_average_speed);
        this.f22135b = (HealthTextView) out.d(this, R.id.hw_health_share_speed_value_desc);
        this.e = (HealthTextView) out.d(this, R.id.hw_health_share_average_speed_unit);
        this.ae = (HealthTextView) out.d(this, R.id.hw_health_share_total_heat);
        this.ac = (HealthTextView) out.d(this, R.id.hw_health_share_date);
        RelativeLayout relativeLayout = (RelativeLayout) out.d(this, R.id.code_information);
        if (Utils.o()) {
            relativeLayout.setVisibility(8);
        }
        if (TextUtils.isEmpty(this.an)) {
            this.aj.setVisibility(8);
            this.z.setVisibility(8);
        } else {
            this.aj.setText(this.an);
            this.z.setText(this.an);
        }
        if (paw.b(this.y) || this.y == 10) {
            this.i.setText(this.n.getString(R.string.IDS_motiontrack_show_detail_averagespeed));
            this.f22135b.setText(this.n.getString(R.string.IDS_motiontrack_show_detail_averagespeed));
            this.x.setImageResource(R.mipmap.ic_speed);
            this.v.setImageResource(R.mipmap.ic_speed);
        }
        e();
        g();
        i();
    }

    private void e() {
        CustomTitleBar customTitleBar = (CustomTitleBar) out.d(this, R.id.title_layout);
        this.aa = customTitleBar;
        customTitleBar.setTitleText(paw.b(this.y, this.n));
        this.ab.setText(paw.b(this.y, this.n));
        this.aa.setRightButtonVisibility(0);
        if (LanguageUtil.ba(this.n)) {
            this.aa.setRightButtonDrawable(qqz.e(this.n, R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        } else {
            this.aa.setRightButtonDrawable(BaseApplication.getContext().getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        this.aa.setRightButtonOnClickListener(new View.OnClickListener() { // from class: oym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "onClick share information");
        if (PermissionUtil.a()) {
            f();
        } else {
            PermissionUtil.d(this.n, PermissionUtil.PermissionType.STORAGE, new CustomPermissionAction(this.n) { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.4
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    AchieveReportAdvanceActivity.this.f();
                }
            });
        }
    }

    private void c() {
        LinearLayout linearLayout = (LinearLayout) out.d(this, R.id.hw_health_report_history_layout);
        this.k = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                long jB;
                long jC;
                long j;
                if (SystemClock.elapsedRealtime() - AchieveReportAdvanceActivity.this.m < 2000) {
                    return;
                }
                AchieveReportAdvanceActivity.this.m = SystemClock.elapsedRealtime();
                if (paw.c(AchieveReportAdvanceActivity.this.y)) {
                    if (AchieveReportAdvanceActivity.this.o < AchieveReportAdvanceActivity.this.q.size()) {
                        ozm ozmVar = (ozm) AchieveReportAdvanceActivity.this.q.get(AchieveReportAdvanceActivity.this.o);
                        jB = ozmVar.a();
                        jC = ozmVar.d();
                        j = jC;
                    } else {
                        jB = 0;
                        j = 0;
                    }
                } else {
                    if (paw.g(AchieveReportAdvanceActivity.this.y)) {
                        if (AchieveReportAdvanceActivity.this.o < AchieveReportAdvanceActivity.this.q.size()) {
                            ozn oznVar = (ozn) AchieveReportAdvanceActivity.this.q.get(AchieveReportAdvanceActivity.this.o);
                            jB = oznVar.b();
                            jC = oznVar.c();
                            j = jC;
                        }
                    } else {
                        LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "initLayout mType is not matching");
                    }
                    jB = 0;
                    j = 0;
                }
                if (jB == 0) {
                    jB = j + 1;
                }
                long j2 = jB;
                PluginAchieveAdapter adapter = oru.a(AchieveReportAdvanceActivity.this.n).getAdapter();
                if (adapter != null) {
                    adapter.gotoTrackDetailData(AchieveReportAdvanceActivity.this.n, j, j2);
                } else {
                    LogUtil.e("PLGACHIEVE_AchieveReportAdvanceActivity", "PluginAchieve.getInstance(mContext).getAdapter() is null");
                }
                AchieveReportAdvanceActivity achieveReportAdvanceActivity = AchieveReportAdvanceActivity.this;
                achieveReportAdvanceActivity.c(achieveReportAdvanceActivity.y);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        HashMap map = new HashMap(1);
        String strValue = AnalyticsValue.ACHIEVE_REPORT_1100030.value();
        map.put("type", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
    }

    private void g() {
        if (paw.c(this.y)) {
            this.q = paw.b(this.s, 5);
        } else if (paw.g(this.y)) {
            this.q = paw.a(this.s, 5);
        } else {
            LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "initTrackDetailData mType is not matching");
        }
        ArrayList arrayList = this.q;
        if (arrayList == null || arrayList.isEmpty()) {
            finish();
            return;
        }
        k();
        this.o = this.q.size() - 1;
        d();
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "mCurrentPosition=", Integer.valueOf(this.o));
        b();
    }

    private void k() {
        if (paw.c(this.y)) {
            Collections.sort(this.q, new Comparator<ozm>() { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(ozm ozmVar, ozm ozmVar2) {
                    if (LanguageUtil.ba(AchieveReportAdvanceActivity.this.n)) {
                        if (ozmVar2.c() - ozmVar.c() < 0) {
                            return -1;
                        }
                        return ozmVar2.c() - ozmVar.c() == 0 ? 0 : 1;
                    }
                    if (ozmVar.c() - ozmVar2.c() < 0) {
                        return -1;
                    }
                    return ozmVar.c() - ozmVar2.c() == 0 ? 0 : 1;
                }
            });
        } else if (paw.g(this.y)) {
            Collections.sort(this.q, new Comparator<ozn>() { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(ozn oznVar, ozn oznVar2) {
                    if (LanguageUtil.ba(AchieveReportAdvanceActivity.this.n)) {
                        return paw.b(oznVar.e(), oznVar2.e());
                    }
                    return paw.b(oznVar2.e(), oznVar.e());
                }
            });
        } else {
            LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "sortTrackDetailData mType is not matching");
        }
    }

    private void d() {
        int size = this.q.size();
        if (paw.c(this.y)) {
            d(size);
        } else if (paw.g(this.y)) {
            j(size);
        } else {
            LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "initMotionPathMap mType is not matching");
        }
    }

    private void d(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.q.get(i2);
            if (obj instanceof ozm) {
                long jD = ((ozm) obj).d();
                this.u.put(Long.valueOf(jD), null);
                this.w.add(i2, Long.valueOf(jD));
                this.h = jD;
            }
        }
    }

    private void j(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.q.get(i2);
            if (obj instanceof ozn) {
                long jC = ((ozn) obj).c();
                this.u.put(Long.valueOf(jC), null);
                this.w.add(i2, Long.valueOf(jC));
                this.h = jC;
            }
        }
    }

    private void b() {
        if (this.ad == null) {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "pluginAchieveAdapter is null");
            return;
        }
        ArrayList arrayList = this.q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.q.size();
        this.r = size;
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "size is", Integer.valueOf(size));
        if (this.r > 0) {
            this.p = 0;
            h(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i >= this.q.size()) {
            return;
        }
        if (paw.c(this.y)) {
            e(i);
        } else if (paw.g(this.y)) {
            b(i);
        } else {
            LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "getMotionPathData mType is not matching");
        }
    }

    private void e(int i) {
        Object obj = this.q.get(i);
        if (obj instanceof ozm) {
            ozm ozmVar = (ozm) obj;
            long jA = ozmVar.a();
            if (jA == 0) {
                jA = ozmVar.d() + 1;
            }
            c(ozmVar.d(), jA);
        }
    }

    private void b(int i) {
        Object obj = this.q.get(i);
        if (obj instanceof ozn) {
            ozn oznVar = (ozn) obj;
            long jB = oznVar.b();
            if (jB == 0) {
                jB = oznVar.c() + 1;
            }
            c(oznVar.c(), jB);
        }
    }

    private void c(long j, long j2) {
        this.ad.getTrackDetailDataByTimestamp(this.n.getApplicationContext(), j, j2, new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void c(T t) {
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "called by getTrackDetailDataByTimestamp ");
        int i = this.p;
        if (i < this.r) {
            this.p = i + 1;
            h(3);
        }
        if (t instanceof MotionPathSimplify) {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) t;
            this.u.put(Long.valueOf(motionPathSimplify.requestStartTime()), motionPathSimplify);
            if (motionPathSimplify.requestStartTime() == this.h) {
                LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "search completed");
                h(0);
                return;
            }
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "obj is not instanceof MotionPathSimplify or is null");
    }

    static class d implements AchieveCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<AchieveReportAdvanceActivity> f22140a;

        d(AchieveReportAdvanceActivity achieveReportAdvanceActivity) {
            this.f22140a = new WeakReference<>(achieveReportAdvanceActivity);
        }

        @Override // com.huawei.pluginachievement.impl.AchieveCallback
        public void onResponse(int i, Object obj) {
            AchieveReportAdvanceActivity achieveReportAdvanceActivity = this.f22140a.get();
            if (achieveReportAdvanceActivity != null) {
                achieveReportAdvanceActivity.c(obj);
            }
        }
    }

    private void i() {
        ArrayList arrayList = this.q;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList<String> arrayList2 = new ArrayList<>(size);
        ArrayList<Entry> arrayList3 = new ArrayList<>(size);
        ArrayList arrayList4 = this.q;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            int size2 = this.q.size();
            for (int i = 0; i < size2; i++) {
                if (paw.c(this.y)) {
                    e(i, arrayList2, arrayList3);
                } else if (paw.g(this.y)) {
                    a(i, arrayList2, arrayList3);
                } else {
                    LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "refreshLineChartData mType is not matching");
                }
            }
        }
        c(arrayList2, arrayList3);
    }

    private void e(int i, ArrayList<String> arrayList, ArrayList<Entry> arrayList2) {
        Object obj = this.q.get(i);
        if (obj instanceof ozm) {
            ozm ozmVar = (ozm) obj;
            arrayList.add(paw.d(ozmVar.d(), 2));
            double dC = ozmVar.c() / 1000.0d;
            if (this.f) {
                arrayList2.add(b(i, (float) UnitUtil.e(dC, 3), this.n.getResources().getDrawable(R.drawable.report_line_chart_hollow_run), "LINE_PATH"));
            } else {
                arrayList2.add(b(i, (float) paw.c(dC), this.n.getResources().getDrawable(R.drawable.report_line_chart_hollow_run), "LINE_PATH"));
            }
        }
    }

    private void a(int i, ArrayList<String> arrayList, ArrayList<Entry> arrayList2) {
        Object obj = this.q.get(i);
        if (obj instanceof ozn) {
            ozn oznVar = (ozn) obj;
            arrayList.add(paw.d(oznVar.c(), 2));
            if (paw.b(this.y)) {
                arrayList2.add(b(i, paw.e(oznVar.e()), this.n.getResources().getDrawable(R.drawable.report_line_chart_hollow_run), "LINE_PATH"));
            } else {
                arrayList2.add(b(i, (float) oznVar.e(), this.n.getResources().getDrawable(R.drawable.report_line_chart_hollow_run), "LINE_PATH"));
            }
        }
    }

    private void c(ArrayList<String> arrayList, ArrayList<Entry> arrayList2) {
        this.t.setExtraOffsets(pao.e(this.n, 10.0f), 0.0f, pao.e(this.n, 11.0f), pao.e(this.n, 2.0f));
        this.t.setMyMarkView(new HwHealthAchieveReportMarkView(this.n, R.layout.achieve_report_markview, this.t));
        this.t.b(pal.f45079a, pal.f45080b, pal.f45080b);
        if (paw.b(this.y)) {
            this.t.setChartData(this.n, arrayList, arrayList2, paw.g(this.y), true);
        } else {
            this.t.setChartData(this.n, arrayList, arrayList2, paw.g(this.y), false);
        }
        this.t.setOnSingleTapListener(new HwHealthAchieveReportLineChart.OnSingleTapListener() { // from class: com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity.8
            @Override // com.huawei.pluginachievement.ui.linechart.HwHealthAchieveReportLineChart.OnSingleTapListener
            public void onSingleTap(int i) {
                if (AchieveReportAdvanceActivity.this.o != i) {
                    LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "position=", Integer.valueOf(i));
                    AchieveReportAdvanceActivity.this.o = i;
                    AchieveReportAdvanceActivity.this.j();
                }
            }
        });
        this.t.invalidate();
    }

    private <T> Entry b(int i, float f, Drawable drawable, T t) {
        Entry entry = new Entry(i, f);
        entry.setIcon(drawable);
        entry.setData(t);
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i;
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "enter refreshView");
        synchronized (f22133c) {
            ArrayList<Long> arrayList = this.w;
            if (arrayList != null) {
                LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "mStartTimeList=", Integer.valueOf(arrayList.size()));
                if (this.o < this.w.size() && (i = this.o) >= 0) {
                    Long l = this.w.get(i);
                    l.longValue();
                    MotionPathSimplify motionPathSimplify = this.u.get(l);
                    if (motionPathSimplify == null) {
                        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "motionPathSimplify is null");
                        m();
                        return;
                    }
                    this.j.setText(pal.j(motionPathSimplify.requestStartTime()) + "");
                    this.am.setText(paw.d((int) (motionPathSimplify.requestTotalTime() / 1000)));
                    c(izn.a(motionPathSimplify.requestAvgPace()));
                    this.af.setText(UnitUtil.e((((double) motionPathSimplify.requestTotalCalories()) * 1.0d) / 1000.0d, 1, 0) + "");
                    this.ac.setText(paw.e(String.valueOf(motionPathSimplify.requestStartTime())));
                    this.ai.setText(paw.d((int) (motionPathSimplify.requestTotalTime() / 1000)));
                    this.ae.setText(UnitUtil.e((((double) motionPathSimplify.requestTotalCalories()) * 1.0d) / 1000.0d, 1, 0) + "");
                    if (paw.c(this.y)) {
                        d(motionPathSimplify);
                    } else if (paw.g(this.y)) {
                        e(motionPathSimplify);
                    } else {
                        LogUtil.d("PLGACHIEVE_AchieveReportAdvanceActivity", "refreshView mType is not matching");
                    }
                }
            } else {
                m();
            }
        }
    }

    private void d(MotionPathSimplify motionPathSimplify) {
        String strE = pbc.e(motionPathSimplify.requestTotalDistance());
        this.ag.setText(strE);
        this.ah.setText(strE);
        if (this.y == 10) {
            String string = this.n.getString(R.string.IDS_motiontrack_show_detail_average_speed);
            if (this.f) {
                string = this.n.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            }
            this.g.setText(string);
            this.e.setText(string);
            this.g.setVisibility(0);
            this.e.setVisibility(0);
            c(paw.a(((double) motionPathSimplify.requestAvgPace()) * 1.0d));
        }
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        if (this.o < this.q.size()) {
            Object obj = this.q.get(this.o);
            if (obj instanceof ozn) {
                ozn oznVar = (ozn) obj;
                if (paw.b(this.y)) {
                    this.ag.setText(paw.a(oznVar.e()));
                    this.ah.setText(paw.a(oznVar.e()));
                    this.g.setText(this.an);
                    this.e.setText(this.an);
                    this.g.setVisibility(0);
                    this.e.setVisibility(0);
                    c(paw.a(((double) motionPathSimplify.requestAvgPace()) * 1.0d));
                    return;
                }
                if (this.y == 4) {
                    this.ag.setText(izn.a((float) oznVar.e()));
                    this.ah.setText(izn.a((float) oznVar.e()));
                } else {
                    String strValueOf = String.valueOf(paw.d((int) (oznVar.e() + 0.5d)));
                    this.ag.setText(strValueOf);
                    this.ah.setText(strValueOf);
                }
                c(izn.a(motionPathSimplify.requestAvgPace()));
            }
        }
    }

    private void m() {
        this.ag.setText("--");
        this.j.setText("--");
        this.am.setText("--");
        c("--");
        this.af.setText("--");
        this.g.setVisibility(8);
        this.e.setVisibility(8);
        this.ah.setText("--");
        this.ai.setText("--");
        this.ae.setText("--");
    }

    private void c(String str) {
        this.f22134a.setText(str);
        this.d.setText(str);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "enter onDestroy");
        super.onDestroy();
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "share enter");
        if (!osb.c(this.n)) {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "isNetworkAvailable error");
            h(2);
            return;
        }
        Bitmap bitmapC = ouo.c((LinearLayout) out.d(this, R.id.hw_health_share_layout));
        if (bitmapC == null) {
            LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "share bmpShare == null ");
        } else {
            osb.c(this.n, bitmapC, AnalyticsValue.SUCCESSES_SHARE_1100014.value(), null);
        }
        LogUtil.a("PLGACHIEVE_AchieveReportAdvanceActivity", "share end");
    }

    private void h(int i) {
        Handler handler = this.l;
        if (handler == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportAdvanceActivity", "sendEmptyMessage: handler is null -> " + i);
            return;
        }
        handler.sendEmptyMessage(i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

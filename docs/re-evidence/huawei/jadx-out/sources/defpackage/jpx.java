package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.HorizontalDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.VastTag;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jpx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f38816c;
    private List<jbp> e;
    private HealthTableWidget f;
    private HealthTextView g;
    private LinearLayout h;
    private int[] i;
    private HealthRingChart j;
    private jmb l;
    private float[] m;
    private int n;
    private int q;
    private List<jbp> d = new ArrayList();
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> k = new qpv<>();
    private boolean o = false;

    private int c(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public jpx(MotionPath motionPath, MotionPathSimplify motionPathSimplify, Context context, int i) {
        this.e = new ArrayList();
        this.n = 0;
        this.n = i;
        this.f38815b = context;
        this.e = jqb.a(motionPath, motionPathSimplify);
        LogUtil.d("Track_PaceIntervalManager", "zoneStatisticList", new Gson().toJson(this.e));
        b(motionPath, motionPathSimplify);
        this.q = motionPathSimplify.requestTrackType();
    }

    private void b(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        String extendDataString = motionPathSimplify.getExtendDataString("runPaceZoneConfig");
        String extendDataString2 = motionPathSimplify.getExtendDataString("runPaceZoneStatistics");
        int[] iArrE = jqb.e(extendDataString, extendDataString2, motionPath.requestRealTimePaceList(), motionPathSimplify.requestStartTime());
        this.i = iArrE;
        LogUtil.d("Track_PaceIntervalManager", "initDuration : ", Arrays.toString(iArrE));
        this.o = (TextUtils.isEmpty(extendDataString) && TextUtils.isEmpty(extendDataString2)) ? false : true;
        int[] iArr = this.i;
        if (iArr == null || iArr.length != 5) {
            LogUtil.j("Track_PaceIntervalManager", "mPaceRingData ==null");
            this.f38814a = false;
        } else {
            this.f38814a = true;
            d(this.e);
        }
    }

    public void d(View view, float[] fArr, HealthColumnSystem healthColumnSystem, boolean z) {
        if (view == null) {
            LogUtil.j("Track_PaceIntervalManager", "rootView == null");
            return;
        }
        if (fArr != null) {
            this.m = (float[]) fArr.clone();
        }
        this.f38816c = healthColumnSystem;
        this.h = (LinearLayout) view.findViewById(R.id.speed_interval_layout_show);
        this.f = (HealthTableWidget) view.findViewById(R.id.speed_interval_table_layout);
        this.g = (HealthTextView) view.findViewById(R.id.speed_interval_table_tips);
        this.j = (HealthRingChart) this.h.findViewById(R.id.ring_view);
        this.g.setText(this.f38815b.getString(R.string.IDS_hwh_motiontrack_speed_more_data));
        this.g.setVisibility(8);
        i();
    }

    private void i() {
        int i = this.n;
        boolean z = i == 264 || i == 258 || i == 280 || i == 227;
        if (!z || !this.f38814a || (!g() && !this.o)) {
            LogUtil.j("Track_PaceIntervalManager", "Scenario 1 no time", Boolean.valueOf(z));
            this.j.setVisibility(8);
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.g.setVisibility(8);
            return;
        }
        f();
    }

    private boolean g() {
        int i = this.q;
        return i == 0 || i == 1;
    }

    private void h() {
        List<qjp> listD = d();
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f38815b, new qjm().b(false).c(true), listD);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jpv
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.f38812b.c(qjpVar);
            }
        });
        this.h.setVisibility(0);
        this.j.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.f38815b)) {
            this.j.setDesc(this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_speed_range));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c(qjp qjpVar) {
        return HeartRateFrag.e((int) qjpVar.f(), this.f38815b);
    }

    private List<qjp> d() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(d(5, this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_intensity)));
        arrayList.add(d(4, this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_anaerobic)));
        arrayList.add(d(3, this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_threshold)));
        arrayList.add(d(2, this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_marathon)));
        arrayList.add(d(1, this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_easy_run)));
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(Integer.valueOf(c(this.i[4])));
        arrayList2.add(Integer.valueOf(c(this.i[3])));
        arrayList2.add(Integer.valueOf(c(this.i[2])));
        arrayList2.add(Integer.valueOf(c(this.i[1])));
        arrayList2.add(Integer.valueOf(c(this.i[0])));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_extreme_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList3.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_warmup_color_end)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_extreme_color_begin)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.f38815b, R.color.pie_sector_heart_rate_warmup_color_begin)));
        int size = arrayList.size();
        ArrayList arrayList5 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList5.add(new qjp(i < arrayList.size() ? (String) arrayList.get(i) : "", ((Integer) arrayList2.get(i)).intValue(), i < arrayList3.size() ? ((Integer) arrayList3.get(i)).intValue() : 0, i < arrayList4.size() ? ((Integer) arrayList4.get(i)).intValue() : 0));
            i++;
        }
        return arrayList5;
    }

    private String d(int i, String str) {
        return this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_range_label_number, Integer.valueOf(i), str);
    }

    public void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        jab.a(qpvVar, this.e);
        for (int i = 5; i >= 1; i--) {
            jab.e(qpvVar, i, this.e);
        }
    }

    private void o() {
        b(this.k);
        LogUtil.a("Track_PaceIntervalManager", "setPaceTableAdapter");
        this.l = new jmb(this.f38815b, this.k, false, LanguageUtil.bo(this.f38815b) ? 38.5f : 35.5f) { // from class: jpx.3
            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                if (jpx.this.m == null || i < 0 || i >= jpx.this.m.length) {
                    return super.getColumnWidth(i);
                }
                return qrs.d(jpx.this.f38815b, jpx.this.m[i]);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                return jpx.this.f38816c.j() > 4 ? Math.min(super.getColumnCount(), Math.min(jpx.this.e.size() + 2, 10)) : Math.min(super.getColumnCount(), Math.min(jpx.this.e.size() + 1, 6));
            }

            @Override // defpackage.jmb
            public int a() {
                return jpx.this.f38815b.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
            }
        };
        LogUtil.a("Track_PaceIntervalManager", "setAdapter");
        int iD = qrs.d(this.f38815b, 156.0f);
        if (LanguageUtil.bo(this.f38815b)) {
            iD = qrs.d(this.f38815b, 159.0f);
        }
        if (this.f.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iD);
            layoutParams2.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.f.setLayoutParams(layoutParams2);
        }
        this.f.setAdapter(this.l);
        this.f.setVisibility(0);
    }

    private void c(final boolean z) {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: jpx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (z) {
                    LogUtil.a("Track_PaceIntervalManager", "onClick more");
                    Intent intent = new Intent();
                    intent.putExtra(BleConstants.SPORT_TYPE, jpx.this.n);
                    intent.putExtra("fragment_tag", "pace");
                    intent.setClass(jpx.this.f38815b, HorizontalDetailActivity.class);
                    try {
                        jpx.this.f38815b.startActivity(intent);
                        return;
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("Track_PaceIntervalManager", "initMorePace() exception: ", LogAnonymous.b(e));
                        return;
                    }
                }
                jpx.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("Track_PaceIntervalManager", "onClick Dialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f38815b).a(this.f38815b.getResources().getString(R.string.IDS_hwh_motiontrack_speed_range_tips)).a(this.f38815b.getString(R.string.IDS_user_permission_know), new View.OnClickListener(this) { // from class: jpx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void f() {
        if (njy.e(this.e)) {
            h();
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 2");
            return;
        }
        if (this.e.size() == 1 && "STEP_RATE".equals(this.e.get(0).g())) {
            h();
            e();
            o();
            this.g.setText(this.f38815b.getString(R.string.IDS_hwh_motiontrack_speed_how_more_data));
            this.g.setVisibility(0);
            c(false);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 3");
            return;
        }
        if (this.e.size() == 2 && b(ObserveLabels.HEART_RATE) && b("STEP_RATE")) {
            h();
            o();
            this.g.setText(this.f38815b.getString(R.string.IDS_hwh_motiontrack_speed_how_more_data));
            this.g.setVisibility(0);
            c(false);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 4");
            return;
        }
        if (this.e.size() >= 5) {
            h();
            o();
            this.g.setVisibility(0);
            c(true);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 5");
            return;
        }
        if (this.e.size() == 1 && ObserveLabels.HEART_RATE.equals(this.e.get(0).g())) {
            h();
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 6");
            return;
        }
        if (this.e.size() >= 2) {
            h();
            o();
            this.g.setText(this.f38815b.getString(R.string.IDS_hwh_motiontrack_speed_how_more_data));
            this.g.setVisibility(0);
            c(false);
            LogUtil.a("Track_PaceIntervalManager", "Scenario 7");
            return;
        }
        LogUtil.a("Track_PaceIntervalManager", "Scenario 8");
    }

    private void e() {
        jbp jbpVar = new jbp();
        jbpVar.b(ObserveLabels.HEART_RATE);
        jbpVar.e(0.0f);
        jbpVar.a(0.0f);
        jbpVar.c(0.0f);
        jbpVar.b(0.0f);
        jbpVar.d(0.0f);
        this.e.add(0, jbpVar);
    }

    private boolean b(String str) {
        for (jbp jbpVar : this.e) {
            if (jbpVar != null && str.equals(jbpVar.g())) {
                return true;
            }
        }
        return false;
    }

    private void d(List<jbp> list) {
        jbp jbpVar = new jbp();
        jbpVar.b(VastTag.DURATION);
        jbpVar.e(this.i[0]);
        jbpVar.a(this.i[1]);
        jbpVar.c(this.i[2]);
        jbpVar.b(this.i[3]);
        jbpVar.d(this.i[4]);
        for (jbp jbpVar2 : list) {
            if (jbpVar2 != null) {
                this.d.add(jbpVar2);
            }
        }
        this.d.add(0, jbpVar);
        LogUtil.d("Track_PaceIntervalManager", "mAllDataList", new Gson().toJson(this.d));
    }

    public List<jbp> a() {
        return this.d;
    }

    public float[] d(int i, HealthColumnSystem healthColumnSystem, boolean z) {
        if (i == 258) {
            if (healthColumnSystem.j() > 4) {
                LogUtil.a("Track_PaceIntervalManager", "getTotalColumnCount > 4) ");
                return new float[]{78.25f, 62.25f, 68.5f, 71.75f, 65.0f, 65.25f, 58.25f, 61.5f, 61.5f, 77.0f};
            }
            LogUtil.a("Track_PaceIntervalManager", "getTotalColumnCount < 4) ");
            if (z) {
                return new float[]{0.9f, 1.0f, 1.0f, 0.9f, 0.9f, 0.9f};
            }
            return new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        }
        return new float[0];
    }

    public void b() {
        HealthTextView healthTextView = this.g;
        if (healthTextView != null) {
            healthTextView.setVisibility(8);
        }
    }

    public void c() {
        jmb jmbVar = this.l;
        if (jmbVar != null) {
            jmbVar.notifyLayoutChanged();
        }
    }
}

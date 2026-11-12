package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.SlopeInfo;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f38807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f38808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38809c;
    private ImageView d;
    private Context e;
    private final String g;
    private final float h;
    private HealthTextView j;
    private final ArrayList<SlopeInfo> k;
    private HealthDivider l;
    private LinearLayout m;
    private HealthRingChart n;
    private HealthTableWidget o;
    private float[] q;
    private jmb r;
    private int s;
    private HealthTextView t;
    private final float v;
    private final String w;
    private boolean f = false;
    private qpv<jpj, jpn, jpn, jpn, jpn, jpn> p = new qpv<>();
    private float i = 1.0f;

    public jps(MotionPath motionPath, MotionPathSimplify motionPathSimplify, Context context, int i) {
        this.s = 0;
        this.s = i;
        this.e = context;
        this.k = motionPath.requestSlopeInfoList();
        double dRequestTotalDistance = ((double) motionPathSimplify.requestTotalDistance()) / 1000.0d;
        dRequestTotalDistance = UnitUtil.f() ? UnitUtil.e(dRequestTotalDistance, 3) : dRequestTotalDistance;
        float fMax = Math.max(motionPathSimplify.getExtendDataFloat("flatRatio", 0.0f), 0.0f);
        this.h = fMax;
        float fMax2 = Math.max(motionPathSimplify.getExtendDataFloat("upHillRatio", 0.0f), 0.0f);
        this.v = fMax2;
        float fMax3 = Math.max(motionPathSimplify.getExtendDataFloat("downHillRatio", 0.0f), 0.0f);
        this.f38807a = fMax3;
        double dA = fgj.a(((double) (fMax2 / 100.0f)) * dRequestTotalDistance, 2);
        double dA2 = fgj.a(((double) (fMax3 / 100.0f)) * dRequestTotalDistance, 2);
        double d = (dRequestTotalDistance - dA) - dA2;
        this.f38809c = b(dA2);
        this.g = b(d);
        this.w = b(dA);
        LogUtil.a("Track_AltitudeIntervalManager", "totalDistance = ", Double.valueOf(dRequestTotalDistance), "flatDistance = ", Double.valueOf(d), " flatRatio = ", Float.valueOf(fMax), " upHillDistance = ", Double.valueOf(dA), " upHillRatio = ", Float.valueOf(fMax2), "downHillDistance = ", Double.valueOf(dA2), " downHillRatio = ", Float.valueOf(fMax3));
    }

    public void e(View view, float[] fArr, boolean z) {
        if (view == null) {
            LogUtil.j("Track_AltitudeIntervalManager", "rootView == null");
            return;
        }
        if (fArr != null) {
            this.q = (float[]) fArr.clone();
        }
        if (!z) {
            this.o = (HealthTableWidget) view.findViewById(R.id.altitude_interval_table_layout);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.inner_center_layout);
            this.f38808b = linearLayout;
            this.d = (ImageView) linearLayout.findViewById(R.id.expand_arrow);
            HealthTextView healthTextView = (HealthTextView) this.f38808b.findViewById(R.id.collapse_or_expand_text);
            this.j = healthTextView;
            healthTextView.setText(this.e.getResources().getString(R.string.IDS_device_health_expand));
            this.d.setBackgroundResource(R.drawable.ic_table_expand_arrow_down);
            this.f38808b.setOnClickListener(new View.OnClickListener() { // from class: jpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.e.e(view2);
                }
            });
            this.l = (HealthDivider) view.findViewById(R.id.view_div_altitude_ring);
            this.o.setVisibility(8);
            this.f38808b.setVisibility(8);
            this.l.setVisibility(8);
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.altitude_slope_ring_show_layout);
        this.m = linearLayout2;
        HealthTextView healthTextView2 = (HealthTextView) linearLayout2.findViewById(R.id.ring_title);
        this.t = healthTextView2;
        healthTextView2.setText(R.string.IDS_hwh_motiontrack_slope_interval_distribution);
        this.n = (HealthRingChart) this.m.findViewById(R.id.ring_view);
        this.m.setVisibility(8);
        b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        if (view == null) {
            LogUtil.e("Track_AltitudeIntervalManager", "view is null");
        } else {
            d();
        }
    }

    private void b(boolean z) {
        if (this.s != 259) {
            LogUtil.j("Track_AltitudeIntervalManager", "initSlopeView mSportType is not bike");
            return;
        }
        c();
        if (z) {
            LogUtil.a("Track_AltitudeIntervalManager", "isShare SlopeTableAdapter is Gone");
        } else if (njy.e(this.k)) {
            LogUtil.a("Track_AltitudeIntervalManager", "mSlopeInfoList is Empty");
        } else {
            h();
        }
    }

    private void c() {
        if (a()) {
            LogUtil.a("Track_AltitudeIntervalManager", "Slope RingData is Invalid");
            return;
        }
        List<qjp> listB = b();
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.e, new qjm().b(false).c(true), listB);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jpo
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return qjpVar.j();
            }
        });
        this.m.setVisibility(0);
        this.t.setVisibility(0);
        HealthDivider healthDivider = this.l;
        if (healthDivider != null) {
            healthDivider.setVisibility(0);
        }
        this.n.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.e)) {
            this.n.setDesc(this.e.getResources().getString(R.string.IDS_hwh_motiontrack_slope_interval));
        }
    }

    public static String b(double d) {
        if (UnitUtil.f()) {
            return qre.e(R.plurals.IDS_association_record_distance_mi, (int) d, UnitUtil.e(d, 1, 2));
        }
        return qre.e(R.plurals.IDS_kilo_meter_unit, (int) d, UnitUtil.e(d, 1, 2));
    }

    private List<qjp> b() {
        ArrayList arrayList = new ArrayList(10);
        double dA = fgj.a(this.f38807a, 1);
        double dA2 = fgj.a(this.v, 1);
        arrayList.add(qre.a(R.string.IDS_hwh_motiontrack_down_slope_percent, UnitUtil.e(this.f38807a, 2, 1)));
        arrayList.add(qre.a(R.string.IDS_hwh_motiontrack_flat_slope_percent, UnitUtil.e((100.0d - dA) - dA2, 2, 1)));
        arrayList.add(qre.a(R.string.IDS_hwh_motiontrack_up_slope_percent, UnitUtil.e(this.v, 2, 1)));
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(Float.valueOf(this.f38807a));
        arrayList2.add(Float.valueOf(this.h));
        arrayList2.add(Float.valueOf(this.v));
        ArrayList arrayList3 = new ArrayList(10);
        arrayList3.add(this.f38809c);
        arrayList3.add(this.g);
        arrayList3.add(this.w);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_uphill_color_end)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_flat_slope_color_end)));
        arrayList4.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_downhill_color_end)));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_uphill_color_begin)));
        arrayList5.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_flat_slope_color_begin)));
        arrayList5.add(Integer.valueOf(ContextCompat.getColor(this.e, R.color.pie_sector_downhill_color_begin)));
        int size = arrayList.size();
        ArrayList arrayList6 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList6.add(new qjp(i < arrayList.size() ? (String) arrayList.get(i) : "", (String) arrayList3.get(i), ((Float) arrayList2.get(i)).floatValue(), i < arrayList4.size() ? ((Integer) arrayList4.get(i)).intValue() : 0, i < arrayList5.size() ? ((Integer) arrayList5.get(i)).intValue() : 0));
            i++;
        }
        return arrayList6;
    }

    public void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        izk.c(qpvVar, this.k);
        int size = this.f ? this.k.size() : Math.min(this.k.size(), 5);
        for (int i = 1; i <= size; i++) {
            izk.d(qpvVar, i, this.k.get(i - 1));
        }
    }

    private void h() {
        c(this.p);
        LogUtil.a("Track_AltitudeIntervalManager", "setPaceTableAdapter");
        this.r = new jmb(this.e, this.p, false, LanguageUtil.bo(this.e) ? 38.5f : 35.5f, true) { // from class: jps.1
            @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidthValueType() {
                return 1;
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnWidth(int i) {
                if (jps.this.q == null || i < 0 || i >= jps.this.q.length) {
                    return super.getColumnWidth(i);
                }
                return qrs.d(jps.this.e, jps.this.q[i]);
            }

            @Override // defpackage.jmb, com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
            public int getColumnCount() {
                return super.getColumnCount();
            }

            @Override // defpackage.jmb
            public int a() {
                return jps.this.e.getResources().getDimensionPixelSize(R.dimen.elementsMarginHorizontalM);
            }
        };
        LogUtil.a("Track_AltitudeIntervalManager", "setAdapter");
        int iD = qrs.d(this.e, ((this.f ? this.k.size() : Math.min(this.k.size(), 5)) * 25 * Math.round(this.i)) + 35);
        if (this.o.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iD);
            layoutParams2.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            this.o.setLayoutParams(layoutParams2);
        }
        this.o.setAdapter(this.r);
        this.o.setVisibility(0);
        if (this.f38808b == null || this.k.size() <= 5) {
            return;
        }
        this.f38808b.setVisibility(0);
    }

    public float[] d(HealthColumnSystem healthColumnSystem, boolean z) {
        if (healthColumnSystem.j() > 4) {
            LogUtil.a("Track_AltitudeIntervalManager", "getTotalColumnCount > 4) ");
            return new float[]{66.925f, 66.925f, 107.08f, 107.08f, 80.31f, 107.08f, 113.85f};
        }
        LogUtil.a("Track_AltitudeIntervalManager", "getTotalColumnCount < 4) ");
        if (z) {
            return new float[]{0.9f, 1.0f, 1.0f, 0.9f, 0.9f, 0.9f, 0.9f};
        }
        return new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    }

    public boolean a() {
        return this.h <= 0.0f && this.v <= 0.0f && this.f38807a <= 0.0f;
    }

    private void d() {
        if (this.f) {
            this.f = false;
            h();
            this.j.setText(this.e.getResources().getString(R.string.IDS_device_health_expand));
            this.d.setBackgroundResource(R.drawable.ic_table_expand_arrow_down);
            return;
        }
        this.f = true;
        h();
        this.j.setText(this.e.getResources().getString(R.string.IDS_device_health_retract));
        this.d.setBackgroundResource(R.drawable.ic_table_expand_arrow_up);
    }

    public void e() {
        jmb jmbVar = this.r;
        if (jmbVar != null) {
            jmbVar.notifyLayoutChanged();
        }
    }
}

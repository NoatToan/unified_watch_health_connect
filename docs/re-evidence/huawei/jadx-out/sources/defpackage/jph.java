package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.CombineChartTableLayout;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackChartViewHolder;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;

/* JADX INFO: loaded from: classes10.dex */
public class jph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwHealthBaseCombinedChart f38788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f38789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f38790c;
    private boolean d = true;
    private TrackChartViewHolder e;
    private float f;
    private HealthTableWidget g;
    private LinearLayout h;
    private jqg i;
    private float j;
    private HealthDivider n;

    public boolean j() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public LinearLayout d() {
        return this.h;
    }

    public void d(View view, int i) {
        if (view != null) {
            this.h = (LinearLayout) view.findViewById(i);
        }
    }

    public void e(View view, int i) {
        if (view != null) {
            CombineChartTableLayout combineChartTableLayout = (CombineChartTableLayout) view.findViewById(i);
            this.h = combineChartTableLayout.getChartView();
            this.n = combineChartTableLayout.getDiv();
            this.g = combineChartTableLayout.getTable();
        }
    }

    public HealthTableWidget f() {
        return this.g;
    }

    public HwHealthBaseCombinedChart c() {
        return this.f38788a;
    }

    public void c(HwHealthBaseCombinedChart hwHealthBaseCombinedChart) {
        this.f38788a = hwHealthBaseCombinedChart;
    }

    public HealthTextView b() {
        return this.f38789b;
    }

    public void c(HealthTextView healthTextView) {
        this.f38789b = healthTextView;
    }

    public void c(jqg jqgVar) {
        this.i = jqgVar;
    }

    public ImageView e() {
        return this.f38790c;
    }

    public void d(ImageView imageView) {
        this.f38790c = imageView;
    }

    public TrackChartViewHolder a() {
        return this.e;
    }

    public void e(TrackChartViewHolder trackChartViewHolder) {
        this.e = trackChartViewHolder;
    }

    public HealthDivider i() {
        return this.n;
    }

    public void b(View view, int i) {
        if (view != null) {
            this.n = (HealthDivider) view.findViewById(i);
        }
    }

    public float g() {
        return this.j;
    }

    public void d(float f) {
        this.j = f;
    }

    public float h() {
        return this.f;
    }

    public void e(float f) {
        this.f = f;
    }
}

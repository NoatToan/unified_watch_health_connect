package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.SpeedMapRecyclerViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.view.SpeedChartView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class juf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f39057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f39058c;
    private HealthTextView d;
    private HealthTextView e;
    private SpeedChartView f;
    private HealthTextView g;
    private HealthRecycleView h;
    private View i;
    private int j;

    public juf(Context context, int i) {
        if (context == null) {
            throw new RuntimeException("context is null");
        }
        this.f39056a = context;
        this.j = i;
    }

    public View a() {
        View viewInflate = View.inflate(this.f39056a, R.layout.track_share_viewholder_speed, null);
        this.f = (SpeedChartView) viewInflate.findViewById(R.id.track_share_pace_chart);
        this.h = (HealthRecycleView) viewInflate.findViewById(R.id.track_pace_recycler_view);
        this.f39058c = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_unit);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace);
        this.f39057b = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_unit);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.track_share_pace_unit);
        this.f39058c.setVisibility(8);
        this.f39057b.setVisibility(8);
        this.h.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f39056a);
        linearLayoutManager.setOrientation(1);
        this.h.setLayoutManager(linearLayoutManager);
        this.h.setNestedScrollingEnabled(false);
        if (UnitUtil.f()) {
            this.g.setText(String.format(this.f39056a.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.f39056a.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp)));
        } else {
            this.g.setText(String.format(this.f39056a.getString(R.string.IDS_motiontrack_show_chart_unit_string), this.f39056a.getString(R.string.IDS_motiontrack_show_detail_average_speed)));
        }
        if (this.j == 101) {
            ((HealthTextView) viewInflate.findViewById(R.id.track_share_pace_title)).setTextColor(izw.f38267a);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_averagepace_title)).setTextColor(izw.f38267a);
            ((HealthTextView) viewInflate.findViewById(R.id.hw_show_pace_fastpace_title)).setTextColor(izw.f38267a);
            ((HealthTextView) viewInflate.findViewById(R.id.track_share_pace_unit)).setTextColor(izw.f38267a);
            this.f.b();
            b(this.d, this.f39056a.getResources().getColor(R.color.color_normal_titlebar_title));
            b(this.e, this.f39056a.getResources().getColor(R.color.color_normal_titlebar_title));
        }
        this.i = viewInflate;
        return viewInflate;
    }

    public void d(jqp jqpVar, List<njj> list) {
        float fRequestAvgPace;
        if (this.i == null || jqpVar == null || list == null) {
            return;
        }
        if (UnitUtil.f()) {
            fRequestAvgPace = jqpVar.d().requestAvgPace() * 1.609344f;
        } else {
            fRequestAvgPace = jqpVar.d().requestAvgPace();
        }
        String strH = jpq.h(fRequestAvgPace);
        Float[] fArrB = njv.b(list);
        float fFloatValue = fArrB[0].floatValue();
        float fFloatValue2 = fArrB[1].floatValue();
        String strH2 = jpq.h(fFloatValue);
        float fB = jpq.b(list, jqpVar);
        Context context = this.f39056a;
        SpeedMapRecyclerViewAdapter speedMapRecyclerViewAdapter = new SpeedMapRecyclerViewAdapter(this.f39056a, list, strH2, strH, fFloatValue, fFloatValue2, izn.e(context, context.getResources().getDisplayMetrics().widthPixels * 1.0f) - 108, izn.a(jqpVar) ? 120.0f : 80.0f, fB, this.j == 101, jqpVar);
        speedMapRecyclerViewAdapter.d(true);
        this.h.setAdapter(speedMapRecyclerViewAdapter);
    }

    private void b(HealthTextView healthTextView, int i) {
        healthTextView.setTextColor(i);
    }
}

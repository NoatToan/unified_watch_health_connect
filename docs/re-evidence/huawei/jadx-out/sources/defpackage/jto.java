package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragmentutils.PaceMapRecyclerViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.view.PaceChartView;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import health.compact.a.UnitUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f39031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PaceChartView f39032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f39033c;
    private HealthTextView d;
    private Context e;
    private View f;
    private int g;
    private int h = 0;

    public jto(Context context, int i) {
        if (context == null) {
            throw new RuntimeException("context is null");
        }
        this.e = context;
        this.g = i;
    }

    public void a(int i) {
        this.h = i;
    }

    public View d() {
        View viewInflate = View.inflate(this.e, R.layout.track_share_viewholder_pace, null);
        this.f39031a = (HealthRecycleView) viewInflate.findViewById(R.id.track_pace_recycler_view);
        this.f39032b = (PaceChartView) viewInflate.findViewById(R.id.track_share_pace_chart);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.track_share_pace_chaer_uint);
        this.d = healthTextView;
        healthTextView.setVisibility(8);
        this.f39033c = (HealthTextView) viewInflate.findViewById(R.id.track_share_pace_unit);
        this.f39031a.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.e);
        linearLayoutManager.setOrientation(1);
        this.f39031a.setLayoutManager(linearLayoutManager);
        this.f39031a.setNestedScrollingEnabled(false);
        this.f39033c.setText(String.format(this.e.getString(R.string.IDS_motiontrack_show_chart_unit_string), jpq.d(this.h, this.e)));
        if (this.g == 101) {
            ((HealthTextView) viewInflate.findViewById(R.id.track_share_pace_title)).setTextColor(izw.f38267a);
            ((HealthTextView) viewInflate.findViewById(R.id.track_share_pace_unit)).setTextColor(izw.f38267a);
            this.f39032b.e();
        }
        this.f = viewInflate;
        return viewInflate;
    }

    public void c(jqp jqpVar, List<njj> list) {
        if (this.f == null || jqpVar == null || list == null) {
            return;
        }
        MotionPathSimplify motionPathSimplifyD = jqpVar.d();
        float fRequestAvgPace = motionPathSimplifyD.requestAvgPace();
        if (jpq.e(motionPathSimplifyD)) {
            if (UnitUtil.f()) {
                fRequestAvgPace = ((float) UnitUtil.c(fRequestAvgPace, 2)) / 5.0f;
            }
        } else if (UnitUtil.f()) {
            fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace, 3);
        }
        String strB = jpq.b(fRequestAvgPace);
        Float[] fArrB = njv.b(list);
        float fFloatValue = fArrB[0].floatValue();
        float fFloatValue2 = fArrB[1].floatValue();
        String strD = jpq.d(fFloatValue);
        float fB = jpq.b(list, jqpVar);
        Context context = this.e;
        float fE = izn.e(context, context.getResources().getDisplayMetrics().widthPixels * 1.0f) - 108;
        float f = izn.a(jqpVar) ? 110.0f : 80.0f;
        Map<Double, Double> mapRequestPartTimeMap = motionPathSimplifyD.requestPartTimeMap();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (mapRequestPartTimeMap == null || !mapRequestPartTimeMap.containsKey(Double.valueOf(21.0975d))) ? 0.0d : mapRequestPartTimeMap.get(Double.valueOf(21.0975d)).doubleValue();
        if (mapRequestPartTimeMap != null && mapRequestPartTimeMap.containsKey(Double.valueOf(42.195d))) {
            dDoubleValue = mapRequestPartTimeMap.get(Double.valueOf(42.195d)).doubleValue();
        }
        PaceMapRecyclerViewAdapter paceMapRecyclerViewAdapter = new PaceMapRecyclerViewAdapter(this.e, list, strD, strB, fFloatValue, fFloatValue2, fE, f, fB, this.g == 101, dDoubleValue2, dDoubleValue, motionPathSimplifyD.requestSportType(), false);
        paceMapRecyclerViewAdapter.c(true);
        this.f39031a.setAdapter(paceMapRecyclerViewAdapter);
    }
}

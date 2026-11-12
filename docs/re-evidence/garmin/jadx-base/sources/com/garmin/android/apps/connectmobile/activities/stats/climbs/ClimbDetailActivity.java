package com.garmin.android.apps.connectmobile.activities.stats.climbs;

import am.a2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import cq.b0;
import cq.x;
import m00.b;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps.x1;
import v22.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/climbs/ClimbDetailActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ClimbDetailActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29814a = new a(null);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x1 x1Var = (x1) a2.c(getIntent().getExtras(), "CLIMB_EXTRA");
        Bundle extras = getIntent().getExtras();
        Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("CLIMB_POSITION_EXTRA")) : null;
        dq.a aVar = (dq.a) a2.c(getIntent().getExtras(), "activity_chart_data");
        if (x1Var == null) {
            finish();
            return;
        }
        setContentView(R.layout.activity_climb_detail);
        m00.a aVar2 = new m00.a(this, null, 2, null);
        initActionBar(true, aVar2.g(numValueOf));
        eq.a aVar3 = new eq.a(aVar2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        layoutInflaterFrom.getClass();
        CustomLineChart customLineChart = (CustomLineChart) findViewById(R.id.chart_view);
        TextView textView = (TextView) findViewById(R.id.no_chart_data);
        com.garmin.android.apps.connectmobile.activities.newmodel.a activityChartDetails = aVar != null ? aVar.getActivityChartDetails() : null;
        if (activityChartDetails != null) {
            boolean zA0 = activityChartDetails.a0();
            textView.getClass();
            e.v(textView, !zA0);
            customLineChart.getClass();
            e.v(customLineChart, zA0);
            if (zA0) {
                qz.a.b(new tz.a(customLineChart, new cq.a(this, aVar2), new x(customLineChart), new b0(customLineChart), new b(customLineChart), null, 32, null), aVar, getString(R.string.charts_no_charts_available), 4);
            }
        }
        String strH = aVar3.f65015a.h(R.string.common_difficulty);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_climb_information_container);
        for (p pVar : aVar3.a(x1Var)) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.gcm_label_value_row, (ViewGroup) linearLayout, false);
            viewInflate.getClass();
            new eq.b(viewInflate).a((String) pVar.f128594a, (String) pVar.f128595b);
            if (s.g(pVar.f128594a, strH)) {
                View viewFindViewById = viewInflate.findViewById(R.id.help);
                viewFindViewById.getClass();
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(new com.garmin.android.apps.connectmobile.connectiq.x(this, 5));
            }
            linearLayout.addView(viewInflate);
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.activity_climb_performance_container);
        for (p pVar2 : aVar3.c(x1Var)) {
            if (!s.g(pVar2.f128594a, "HEADER")) {
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.gcm_label_value_row, (ViewGroup) linearLayout2, false);
                viewInflate2.getClass();
                new eq.b(viewInflate2).a((String) pVar2.f128594a, (String) pVar2.f128595b);
                linearLayout2.addView(viewInflate2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/climbs/ClimbDetailActivity$a;", "", "<init>", "()V", "", "CLIMB_EXTRA", "Ljava/lang/String;", "CLIMB_POSITION_EXTRA", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

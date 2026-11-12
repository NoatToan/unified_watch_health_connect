package com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b63.o;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import g22.l;
import i3.e5;
import iy0.d;
import iy0.e;
import iy0.f;
import iy0.g;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/charts/ActivityTimeChartFullscreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityTimeChartFullscreenActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39226a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.multi_day_activity_fullscreen_chart);
        f fVar = (f) getIntent().getParcelableExtra("extra_chart_data");
        if (fVar != null) {
            o oVar = fVar.f95794e;
            o oVar2 = fVar.f95793d;
            if (oVar2 != null && oVar != null) {
                x0.f23314a.getClass();
                String str = x0.f23361cb;
                str.getClass();
                initActionBar(true, g2.f(str));
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fullscreen_chart_container);
                CustomBarChart customBarChart = new CustomBarChart(this);
                customBarChart.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                rz.a aVar = new rz.a(customBarChart, new iy0.a(this, fVar.f95791b, l.h(oVar2), l.h(oVar), fVar.f95792c), new e(customBarChart, l.h(oVar2), l.h(oVar)), new g(customBarChart), new d(customBarChart), null, 32, null);
                linearLayout.addView(customBarChart);
                qz.a.b(aVar, fVar.f95790a, getString(R.string.no_data_label), 4);
                e5 e5Var = new e5(21);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                s0.d.c(customBarChart, e5Var);
                return;
            }
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/charts/ActivityTimeChartFullscreenActivity$a;", "", "<init>", "()V", "", "EXTRA_CHART_DATA", "Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

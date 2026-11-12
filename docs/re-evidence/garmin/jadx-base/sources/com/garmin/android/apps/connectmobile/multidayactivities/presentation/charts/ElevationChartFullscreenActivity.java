package com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import cy0.n;
import i3.e5;
import i53.f;
import iy0.m;
import iy0.o;
import iy0.q;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import sy0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/charts/ElevationChartFullscreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ElevationChartFullscreenActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39227a = new a(null);

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        ArrayList parcelableArrayListExtra;
        super.onCreate(bundle);
        setContentView(R.layout.multi_day_activity_fullscreen_chart);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra_elevation_data", l.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_elevation_data") : null;
            if (!(parcelableExtra instanceof l)) {
                parcelableExtra = null;
            }
            parcelable = (l) parcelableExtra;
        }
        l lVar = (l) parcelable;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            if (intent2 != null) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra_activities", n.class);
            } else {
                parcelableArrayListExtra = null;
            }
        } else if (intent2 != null) {
            parcelableArrayListExtra = intent2.getParcelableArrayListExtra("extra_activities");
        } else {
            parcelableArrayListExtra = null;
        }
        f fVarJ = parcelableArrayListExtra != null ? i53.a.j(parcelableArrayListExtra) : null;
        if (lVar == null) {
            finish();
            return;
        }
        initActionBar(true, getString(R.string.activity_details_elevation));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fullscreen_chart_container);
        CustomLineChart customLineChart = new CustomLineChart(this);
        customLineChart.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tz.a aVar = new tz.a(customLineChart, new m(this, fVarJ), new o(customLineChart), new q(customLineChart), new iy0.n(customLineChart), null, 32, null);
        linearLayout.addView(customLineChart);
        qz.a.b(aVar, lVar, getString(R.string.no_data_label), 4);
        e5 e5Var = new e5(22);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(customLineChart, e5Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/multidayactivities/presentation/charts/ElevationChartFullscreenActivity$a;", "", "<init>", "()V", "", "EXTRA_ELEVATION_DATA", "Ljava/lang/String;", "EXTRA_ACTIVITIES", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

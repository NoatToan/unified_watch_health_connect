package com.garmin.android.apps.connectmobile.ecg.presentation.stats.chart;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.github.mikephil.charting.charts.LineChart;
import gf0.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/chart/EcgChartActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EcgChartActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34905a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("CHART_EXTRA", d.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("CHART_EXTRA");
                if (!(parcelable2 instanceof d)) {
                    parcelable2 = null;
                }
                parcelable = (d) parcelable2;
            }
            dVar = (d) parcelable;
        } else {
            dVar = null;
        }
        Bundle extras2 = getIntent().getExtras();
        String string = extras2 != null ? extras2.getString("TITLE_EXTRA", getString(R.string.lbl_ecg)) : null;
        if (dVar == null) {
            finish();
            return;
        }
        setContentView(R.layout.ecg_chart_activity);
        initActionBar(true, string);
        LineChart lineChart = (LineChart) findViewById(R.id.ecg_chart);
        lineChart.getClass();
        new qf0.a(lineChart, false).a(dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/chart/EcgChartActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ECG_READING_CHART_DATA_EXTRA", "ECG_TITLE_EXTRA", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

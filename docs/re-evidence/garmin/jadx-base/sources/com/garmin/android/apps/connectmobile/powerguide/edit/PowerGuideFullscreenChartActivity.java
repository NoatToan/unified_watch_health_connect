package com.garmin.android.apps.connectmobile.powerguide.edit;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import f12.l;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import wr.g;
import za1.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/PowerGuideFullscreenChartActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerGuideFullscreenChartActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40409a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.power_guide_fullscreen_chart_activity);
        initActionBar(true, R.string.power_guide_title);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("POWER_GUIDE_CHART_DATA") : null;
            parcelable = (za1.c) (parcelableExtra instanceof za1.c ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("POWER_GUIDE_CHART_DATA", za1.c.class);
        }
        za1.c cVar = (za1.c) parcelable;
        if (cVar == null) {
            finish();
            return;
        }
        CustomLineChart customLineChart = (CustomLineChart) findViewById(R.id.chart_view);
        customLineChart.getClass();
        new b(customLineChart).a(cVar);
        TextView textView = (TextView) findViewById(R.id.distance_legend_item);
        boolean z14 = j.z(l.f68084a);
        l3.f23124b.getClass();
        textView.setText(getString(R.string.chart_distance_title, l3.a.E1(this, z14, true)));
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById != null) {
            g gVar = new g(7);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(viewFindViewById, gVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/PowerGuideFullscreenChartActivity$a;", "", "<init>", "()V", "", "EXTRA_POWER_GUIDE_CHART_DATA", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

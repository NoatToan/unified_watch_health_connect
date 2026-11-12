package com.garmin.android.apps.connectmobile.activities.health.presentation;

import am.a2;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import i3.e5;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/HealthFullScreenChartActivity;", "Lcom/garmin/android/apps/connectmobile/activities/charts/FullscreenChartActivity;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HealthFullScreenChartActivity extends FullscreenChartActivity {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f29014p = new a(null);

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final void ca() {
        setContentView(ja());
        initActionBar(true);
        this.f28942f = (LinearLayout) findViewById(R.id.fullscreen_chart_container);
        this.f28943g = (LinearLayout) findViewById(R.id.fullscreen_chart_legend_container);
        this.f28944h = (LinearLayout) findViewById(R.id.fullscreen_chart_top_legend_container);
        this.f28945i = (FrameLayout) findViewById(R.id.fullscreen_content_overlay);
        this.f28938b = new com.garmin.android.apps.connectmobile.activities.charts.a((LinearLayout) findViewById(R.id.gcm_sleep_chart_options_container), this);
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById != null) {
            e5 e5Var = new e5(16);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(viewFindViewById, e5Var);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.gcm_sleep_chart_options_container);
        if (linearLayout != null) {
            e5 e5Var2 = new e5(17);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            s0.d.c(linearLayout, e5Var2);
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        ArrayList arrayListD = a2.d(extras, "CHART_LIST_EXTRAS");
        im.e eVar = (im.e) a2.c(extras, "extra_activity_chart_type");
        if (arrayListD == null || arrayListD.isEmpty()) {
            finish();
        } else {
            if (eVar == null) {
                finish();
                return;
            }
            this.f28941e = arrayListD;
            this.f28937a = eVar;
            ea();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/health/presentation/HealthFullScreenChartActivity$a;", "", "<init>", "()V", "", "CHART_LIST_EXTRAS", "Ljava/lang/String;", "TAG", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

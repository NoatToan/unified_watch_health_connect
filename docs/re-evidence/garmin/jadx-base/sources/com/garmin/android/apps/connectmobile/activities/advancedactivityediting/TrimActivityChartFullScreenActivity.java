package com.garmin.android.apps.connectmobile.activities.advancedactivityediting;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b71.i;
import bm.q;
import com.garmin.android.apps.connectmobile.R;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/TrimActivityChartFullScreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrimActivityChartFullScreenActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28831c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f28832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f28833b;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_fullscreen_chart);
        ((HorizontalScrollView) findViewById(R.id.sleep_chart_options_scroll_view)).setVisibility(8);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("activity_chart_data", p.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("activity_chart_data") : null;
            if (!(parcelableExtra instanceof p)) {
                parcelableExtra = null;
            }
            parcelable = (p) parcelableExtra;
        }
        p pVar = (p) parcelable;
        this.f28832a = pVar;
        if (pVar != null) {
            initActionBar(pVar.getF113511u1(), 3);
            q qVar = new q(this, pVar, getIntent().getIntExtra("EXTRA_START_INDEX", 0), getIntent().getIntExtra("EXTRA_END_INDEX", pVar.P(0).size() - 1), true, getIntent().getIntExtra("EXTRA_AXIS_TYPE", 0) == 0 ? fz.c.TIME : fz.c.DISTANCE);
            this.f28833b = qVar;
            qVar.f145356k = (LinearLayout) findViewById(R.id.fullscreen_chart_legend_container);
            qVar.o();
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fullscreen_chart_container);
            q qVar2 = this.f28833b;
            if (qVar2 == null) {
                s.m("mChartConfigurator");
                throw null;
            }
            linearLayout.addView(qVar2.d(linearLayout));
        }
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById != null) {
            i iVar = new i(3);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(viewFindViewById, iVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/advancedactivityediting/TrimActivityChartFullScreenActivity$a;", "", "<init>", "()V", "", "EXTRA_START_INDEX", "Ljava/lang/String;", "EXTRA_END_INDEX", "EXTRA_AXIS_TYPE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, p pVar, Integer num, Integer num2, int i14) {
            Intent intent = new Intent(context, (Class<?>) TrimActivityChartFullScreenActivity.class);
            intent.putExtra("activity_chart_data", pVar);
            intent.putExtra("EXTRA_START_INDEX", num);
            intent.putExtra("EXTRA_END_INDEX", num2);
            intent.putExtra("EXTRA_AXIS_TYPE", i14);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.courses.presentation.chart;

import am.r1;
import android.content.Context;
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
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import java.util.List;
import java.util.WeakHashMap;
import k30.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q30.b;
import q30.g;
import q30.h;
import q30.i;
import s20.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/chart/CourseFullscreenChartActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CourseFullscreenChartActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f33012a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e eVar;
        String string;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_course_fullscreen_chart);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_course", e.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_course");
                if (!(parcelable2 instanceof e)) {
                    parcelable2 = null;
                }
                parcelable = (e) parcelable2;
            }
            eVar = (e) parcelable;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.COURSES;
            aVar2.getClass();
            i2.a.f(a2Var, "CourseFullscreenChartActivity", "Missing required parameter - course detail");
            finish();
            return;
        }
        String str = eVar.courseName;
        double dQ = eVar.q();
        double dR = eVar.r();
        double dS = eVar.s();
        List<GeoPointDTO> list = eVar.geoPoints;
        double dAbs = Double.NaN;
        if (list != null && !list.isEmpty()) {
            List<GeoPointDTO> list2 = eVar.geoPoints;
            GeoPointDTO geoPointDTO = list2 != null ? list2.get(0) : null;
            List<GeoPointDTO> list3 = eVar.geoPoints;
            GeoPointDTO geoPointDTO2 = list3 != null ? (GeoPointDTO) com.airbnb.lottie.animation.keyframe.a.c(1, list3) : null;
            Double d14 = geoPointDTO != null ? geoPointDTO.elevation : null;
            Double d15 = geoPointDTO2 != null ? geoPointDTO2.elevation : null;
            double dQ2 = eVar.q();
            if (d14 != null && d15 != null && !Double.isNaN(dQ2) && dQ2 != 0.0d) {
                dAbs = (Math.abs(d14.doubleValue() - d15.doubleValue()) / dQ2) * ((double) 100);
            }
        }
        List<GeoPointDTO> list4 = eVar.geoPoints;
        initActionBar(true, d.a(this, str));
        View viewFindViewById = findViewById(R.id.course_fullscreen_chart_header);
        CustomLineChart customLineChart = (CustomLineChart) findViewById(R.id.course_elevation_chart_view);
        TextView textView = (TextView) findViewById(R.id.course_elevation_abbreviation_label);
        viewFindViewById.getClass();
        p30.a aVar3 = new p30.a(viewFindViewById);
        aVar3.a();
        aVar3.b(dQ, dR, dS);
        boolean z14 = aVar3.f167874k;
        TextView textView2 = aVar3.f135395o;
        if (z14 && textView2 != null) {
            s20.e eVar2 = s20.e.f156007a;
            Context context = textView2.getContext();
            eVar2.getClass();
            if (context == null) {
                string = null;
            } else if (Double.isNaN(dAbs)) {
                string = context.getString(R.string.no_value);
            } else {
                l3.f23124b.getClass();
                string = l3.f23130h.format(dAbs);
            }
            textView2.setText(string);
        }
        TextView textView3 = aVar3.f135396p;
        textView3.getClass();
        v22.d.a(textView3, 1.0f);
        if (textView2 != null) {
            v22.d.a(textView2, 1.3f);
        }
        TextView textView4 = aVar3.f135397q;
        textView4.getClass();
        v22.d.a(textView4, 1.3f);
        customLineChart.getClass();
        tz.a aVar4 = new tz.a(customLineChart, new b(this), new h(customLineChart, false), new i(customLineChart), new g(customLineChart), null);
        textView.getClass();
        boolean zR = r1.r();
        String string2 = getString(R.string.lbl_elevation_profile_top);
        string2.getClass();
        String string3 = getString(zR ? R.string.f28710m : R.string.ft);
        string3.getClass();
        textView.setText(getString(R.string.string_space_string_bracket_pattern, string2, string3));
        aVar4.f167285b.s(null);
        aVar4.a(new q(list4, null, null, dQ, null, 16, null), null);
        o2.c cVar = new o2.c(1);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(customLineChart, cVar);
        s0.d.c(textView, new o2.c(2));
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/courses/presentation/chart/CourseFullscreenChartActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(c cVar, e eVar) {
            Intent intent = new Intent(cVar, (Class<?>) CourseFullscreenChartActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_course", eVar);
            l2.f37135b.getClass();
            l2.a.b().a(intent, bundle);
            cVar.startActivity(intent);
        }

        private a() {
        }
    }
}

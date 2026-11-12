package a81;

import android.content.Intent;
import c22.l3;
import c22.m3;
import c63.r0;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import java.text.DecimalFormat;
import lc.p0;
import lc.y0;
import ne2.e0;
import o4.d0;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1966b;

    public /* synthetic */ j(boolean z14, int i14) {
        this.f1965a = i14;
        this.f1966b = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f1965a;
        boolean z14 = this.f1966b;
        switch (i14) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                v vVar = v.f1974a;
                l3.a aVar = l3.f23124b;
                double d14 = fFloatValue;
                m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat = l3.f23125c;
                aVar.getClass();
                return l3.a.N(d14, m3Var, decimalFormat);
            case 1:
                float fFloatValue2 = ((Float) obj).floatValue();
                v vVar2 = v.f1974a;
                l3.a aVar2 = l3.f23124b;
                double d15 = fFloatValue2;
                m3 m3Var2 = z14 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat2 = l3.f23125c;
                aVar2.getClass();
                return l3.a.N(d15, m3Var2, decimalFormat2);
            case 2:
                float fFloatValue3 = ((Float) obj).floatValue();
                v vVar3 = v.f1974a;
                l3.a aVar3 = l3.f23124b;
                double d16 = fFloatValue3;
                m3 m3Var3 = z14 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat3 = l3.f23125c;
                aVar3.getClass();
                return l3.a.N(d16, m3Var3, decimalFormat3);
            case 3:
                float fFloatValue4 = ((Float) obj).floatValue();
                v vVar4 = v.f1974a;
                l3.f23124b.getClass();
                return l3.a.w0(l3.a.p(fFloatValue4, z14));
            case 4:
                float fFloatValue5 = ((Float) obj).floatValue();
                v vVar5 = v.f1974a;
                l3.a aVar4 = l3.f23124b;
                double d17 = fFloatValue5;
                m3 m3Var4 = z14 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat4 = l3.f23125c;
                aVar4.getClass();
                return l3.a.N(d17, m3Var4, decimalFormat4);
            case 5:
                float fFloatValue6 = ((Float) obj).floatValue();
                v vVar6 = v.f1974a;
                l3.f23124b.getClass();
                return l3.a.w0(l3.a.p(fFloatValue6, z14));
            case 6:
                return bt1.i.b(((Float) obj).floatValue(), z14);
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                if (!z14) {
                    iIntValue = -iIntValue;
                }
                return Integer.valueOf(iIntValue);
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                if (z14) {
                    iIntValue2 = -iIntValue2;
                }
                return Integer.valueOf(iIntValue2);
            case 9:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                if (z14) {
                    c42.n.b bVar = c42.n.b.INSTANCE;
                    bVar.getClass();
                    p0Var.f111836i = bVar;
                    p0Var.f111833f = false;
                    y0 y0VarI = kg.f.i(p0Var, -1);
                    y0VarI.f111914a = true;
                    Unit unit = Unit.INSTANCE;
                    p0Var.f111833f = true;
                    p0Var.f111834g = y0VarI.f111915b;
                }
                return Unit.INSTANCE;
            case 10:
                c63.s.e eVar = (c63.s.e) obj;
                eVar.getClass();
                if (z14) {
                    c63.t.b(eVar, CoreConstants.COLON_CHAR);
                }
                eVar.u(r0.ZERO);
                return Unit.INSTANCE;
            case 11:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.x(k0Var, z14);
                return Unit.INSTANCE;
            case 12:
                h0.x((k0) obj, z14);
                return Unit.INSTANCE;
            case 13:
                Intent intent = (Intent) obj;
                int i15 = ig2.e.f93438b;
                intent.getClass();
                intent.putExtra("extra_has_workout_support", z14);
                return Unit.INSTANCE;
            case 14:
                Intent intent2 = (Intent) obj;
                int i16 = ig2.e.f93438b;
                intent2.getClass();
                intent2.putExtra("extra_show_enable_location_permission", z14);
                return Unit.INSTANCE;
            case 15:
                Intent intent3 = (Intent) obj;
                int i17 = ig2.e.f93438b;
                intent3.getClass();
                intent3.putExtra("extra_activity_with_gps", z14);
                return Unit.INSTANCE;
            case 16:
                GesturesSettings.Builder builder = (GesturesSettings.Builder) obj;
                int i18 = e0.f125586d;
                builder.getClass();
                builder.m275setScrollEnabled(z14);
                builder.m270setPitchEnabled(z14);
                builder.m273setRotateEnabled(z14);
                builder.m269setPinchToZoomEnabled(z14);
                builder.m271setQuickZoomEnabled(z14);
                builder.m262setDoubleTapToZoomInEnabled(z14);
                builder.m263setDoubleTouchToZoomOutEnabled(z14);
                builder.m277setSimultaneousRotateAndPinchToZoomEnabled(z14);
                return Unit.INSTANCE;
            case 17:
                ScaleBarSettings.Builder builder2 = (ScaleBarSettings.Builder) obj;
                int i19 = e0.f125586d;
                builder2.getClass();
                builder2.m299setEnabled(z14);
                return Unit.INSTANCE;
            case 18:
                GesturesSettings.Builder builder3 = (GesturesSettings.Builder) obj;
                int i24 = e0.f125586d;
                builder3.getClass();
                builder3.m275setScrollEnabled(z14);
                return Unit.INSTANCE;
            case 19:
                GesturesSettings.Builder builder4 = (GesturesSettings.Builder) obj;
                int i25 = e0.f125586d;
                builder4.getClass();
                builder4.m262setDoubleTapToZoomInEnabled(z14);
                builder4.m263setDoubleTouchToZoomOutEnabled(z14);
                builder4.m269setPinchToZoomEnabled(z14);
                builder4.m271setQuickZoomEnabled(z14);
                builder4.m277setSimultaneousRotateAndPinchToZoomEnabled(z14);
                return Unit.INSTANCE;
            case 20:
                GesturesSettings.Builder builder5 = (GesturesSettings.Builder) obj;
                int i26 = e0.f125586d;
                builder5.getClass();
                builder5.m270setPitchEnabled(z14);
                return Unit.INSTANCE;
            case 21:
                GesturesSettings.Builder builder6 = (GesturesSettings.Builder) obj;
                int i27 = e0.f125586d;
                builder6.getClass();
                builder6.m273setRotateEnabled(z14);
                return Unit.INSTANCE;
            case 22:
                LocationComponentSettings.Builder builder7 = (LocationComponentSettings.Builder) obj;
                builder7.m281setEnabled(z14);
                builder7.m288setPulsingEnabled(z14);
                return Unit.INSTANCE;
            case 23:
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.z(z14);
                return Unit.INSTANCE;
            case 24:
                com.garmin.android.library.mapsdkadapter.i iVar2 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar2.getClass();
                iVar2.y(z14);
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.library.mapsdkadapter.i iVar3 = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar3.getClass();
                iVar3.setMyLocationEnabled(z14);
                return Unit.INSTANCE;
            case 26:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                h0.C(k0Var2, z14 ? r5.a.On : r5.a.Off);
                return Unit.INSTANCE;
            default:
                q4.c cVar = (q4.c) obj;
                cVar.getClass();
                cVar.m1();
                if (z14) {
                    d0.f128823b.getClass();
                    q4.f.A0(cVar, d0.c(0.4f, d0.f128824c, 14), 0L, 0L, 0.0f, null, null, 126);
                }
                return Unit.INSTANCE;
        }
    }
}

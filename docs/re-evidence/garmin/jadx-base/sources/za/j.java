package za;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaSensorsIndicatorsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import fa.z;
import j23.t;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;
import pj1.s;
import z0.g0;
import zm.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f203226c;

    public /* synthetic */ j(int i14, Object obj, Object obj2) {
        this.f203224a = i14;
        this.f203225b = obj;
        this.f203226c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    @Override // java.lang.Runnable
    public final void run() {
        int i14;
        int i15 = this.f203224a;
        int i16 = 0;
        Object obj = this.f203226c;
        Object obj2 = this.f203225b;
        switch (i15) {
            case 0:
                androidx.media3.exoplayer.video.f fVar = ((androidx.media3.exoplayer.video.f.a) obj2).f9870b;
                int i17 = z.f70071a;
                fVar.onVideoDecoderReleased((String) obj);
                return;
            case 1:
                CustomLineChart customLineChart = (CustomLineChart) obj2;
                za1.e eVar = (za1.e) obj;
                int i18 = za1.b.f203281e;
                Paint paintRender = customLineChart.getRenderer().getPaintRender();
                float f14 = customLineChart.getViewPortHandler().getContentRect().bottom;
                float f15 = customLineChart.getViewPortHandler().getContentRect().top;
                Context context = eVar.f203299a;
                int[] iArr = {a7.b.getColor(context, R.color.power_guide_gradient_color_1), a7.b.getColor(context, R.color.power_guide_gradient_color_2), a7.b.getColor(context, R.color.power_guide_gradient_color_3), a7.b.getColor(context, R.color.power_guide_gradient_color_4), a7.b.getColor(context, R.color.power_guide_gradient_color_5), a7.b.getColor(context, R.color.power_guide_gradient_color_6), a7.b.getColor(context, R.color.power_guide_gradient_color_7)};
                PowerZonesDTO powerZonesDTO = eVar.f203300b.f203297j;
                float f16 = powerZonesDTO.f43989d;
                float f17 = eVar.f203302d;
                float[] fArr = {0.0f, f16 / f17, powerZonesDTO.f43990e / f17, powerZonesDTO.f43991f / f17, powerZonesDTO.f43992g / f17, powerZonesDTO.f43993h / f17, powerZonesDTO.f43994i / f17, 1.0f};
                float[] fArr2 = new float[7];
                float fD = 0.0f;
                while (i16 < 7) {
                    int i19 = i16 + 1;
                    fD = t.d((fArr[i16] + fArr[i19]) / 2.0f, fD, 1.0f);
                    Unit unit = Unit.INSTANCE;
                    fArr2[i16] = fD;
                    i16 = i19;
                }
                paintRender.setShader(new LinearGradient(0.0f, f14, 0.0f, f15, iArr, fArr2, Shader.TileMode.CLAMP));
                customLineChart.invalidate();
                return;
            case 2:
                zb0.b bVar = (zb0.b) obj2;
                Context context2 = (Context) obj;
                zb0.b.a aVar = bVar.f203428b;
                if (aVar == null || !aVar.f75549a.isActive()) {
                    zb0.b.a aVar2 = new zb0.b.a(context2.getApplicationContext());
                    bVar.f203428b = aVar2;
                    aVar2.c(new Void[0]);
                    return;
                }
                return;
            case 3:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g gVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g) obj2;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.g.f43936b;
                s sVarV6 = gVar.v6();
                sVarV6.f137985w = Long.valueOf(((sd2.f) obj).getUnitID());
                sVarV6.f5();
                if (!gVar.v6().N4()) {
                    gVar.v6().b5(false);
                    return;
                }
                s sVarV7 = gVar.v6();
                if (!sVarV7.f137983t) {
                    sVarV7.f137983t = true;
                }
                sVarV7.J0.m("AssistanceTypeFragment");
                return;
            case 4:
                xz.d dVar = (xz.d) obj2;
                zm.c cVar = (zm.c) obj;
                p pVar = cVar.f205204c;
                List<o20.a> listP = pVar.P(0);
                ArrayList arrayList = new ArrayList(y.r(listP, 10));
                int i24 = 0;
                for (Object obj3 : listP) {
                    int i25 = i24 + 1;
                    if (i24 < 0) {
                        x.q();
                        throw null;
                    }
                    double D = ((o20.a) obj3).D();
                    o20.a aVar4 = (o20.a) h0.e0(i25, pVar.P(0));
                    Double dValueOf = aVar4 != null ? Double.valueOf(aVar4.D()) : null;
                    Context context3 = cVar.f205202a;
                    int i26 = R.color.gcm3_stress_gradient_blue_end;
                    if (D >= 0.0d && D < 25.0d) {
                        i14 = i26;
                    } else if (D >= 25.0d && D < 50.0d) {
                        i14 = R.color.gcm3_stress_gradient_orange_start;
                    } else if (D < 50.0d || D >= 75.0d) {
                        if (75.0d > D || D > 100.0d) {
                            if (dValueOf == null || dValueOf.doubleValue() < 0.0d || dValueOf.doubleValue() >= 25.0d) {
                                if (dValueOf != null && dValueOf.doubleValue() >= 25.0d && dValueOf.doubleValue() < 50.0d) {
                                    i14 = R.color.gcm3_stress_gradient_orange_start;
                                } else if (dValueOf == null || dValueOf.doubleValue() < 50.0d || dValueOf.doubleValue() >= 75.0d) {
                                    if (dValueOf != null) {
                                        double dDoubleValue = dValueOf.doubleValue();
                                        if (75.0d > dDoubleValue || dDoubleValue > 100.0d) {
                                        }
                                    }
                                    i26 = R.color.transparent;
                                } else {
                                    i14 = R.color.gcm3_stress_gradient_orange_middle;
                                }
                            }
                            i14 = i26;
                        }
                        i14 = R.color.gcm3_stress_gradient_orange_end;
                    } else {
                        i14 = R.color.gcm3_stress_gradient_orange_middle;
                    }
                    q6.f.t(context3, i14, arrayList);
                    i24 = i25;
                }
                dVar.setColors(arrayList);
                cVar.n().invalidate();
                return;
            default:
                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity = (OrcaSensorsIndicatorsActivity) obj2;
                g0 g0Var = (g0) obj;
                ImageView imageView = orcaSensorsIndicatorsActivity.f30891c;
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("wakeUpImageView");
                    throw null;
                }
                imageView.setVisibility(4);
                ImageView imageView2 = orcaSensorsIndicatorsActivity.f30891c;
                if (imageView2 != null) {
                    imageView2.postDelayed(g0Var, 500L);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("wakeUpImageView");
                    throw null;
                }
        }
    }
}

package fy1;

import am.x0;
import androidx.lifecycle.y0;
import fz1.k;
import g01.c0;
import g01.e0;
import g01.j;
import g01.l;
import g01.m;
import g01.o;
import g01.p;
import g01.r;
import g01.u;
import g01.w;
import java.lang.annotation.Annotation;
import m63.k1;
import m63.y1;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73923a;

    public /* synthetic */ h(int i14) {
        this.f73923a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f73923a) {
            case 0:
                i.a aVar = i.f73924a;
                return x.k("movingDuration", "totalSets");
            case 1:
                i.a aVar2 = i.f73924a;
                return x.k("vigorousIntensityMinutes", "moderateIntensityMinutes", "duration", "calories");
            case 2:
                i.a aVar3 = i.f73924a;
                return x.k("steps", "vigorousIntensityMinutes", "moderateIntensityMinutes", "distance", "duration", "calories");
            case 3:
                i.a aVar4 = i.f73924a;
                return x.k("distance", "duration");
            case 4:
                i.a aVar5 = i.f73924a;
                return x.k("avgSpeed", "distance", "duration");
            case 5:
                i.a aVar6 = i.f73924a;
                return x.k("avgPower", "distance");
            case 6:
                i.a aVar7 = i.f73924a;
                return x.k("vigorousIntensityMinutes", "calories");
            case 7:
                i.a aVar8 = i.f73924a;
                return x.k(x0.f4322q2.f4358a, x0.f4326r2.f4358a, x0.f4309n1.f4358a);
            case 8:
                int i14 = k.I;
                return new y0();
            case 9:
                int i15 = k.I;
                return new y0();
            case 10:
                int i16 = k.I;
                return new y0();
            case 11:
                int i17 = k.I;
                return new y0();
            case 12:
                g01.a.Companion companion = g01.a.INSTANCE;
                t0 t0Var = s0.f105811a;
                return new i63.g("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.ConsumableResultDTO", t0Var.b(g01.a.class), new k23.d[]{t0Var.b(g01.e.class), t0Var.b(r.class), t0Var.b(e0.class)}, new i63.c[]{g01.e.a.f74164a, r.a.f74250a, e0.a.f74174a}, new Annotation[0]);
            case 13:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.CustomFoodServingType", g01.c.values(), new String[]{"OZ", "G", "ML", "FL_OZ", "CUP", "KG", "LB", "L", "TBSP", "SCOOP", "SLICE", "PIECE", "SERVING", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 14:
                g01.d.b bVar = g01.d.Companion;
                return new m63.e(r.a.f74250a);
            case 15:
                g01.e.b bVar2 = g01.e.Companion;
                return new m63.e(g01.a.INSTANCE.serializer());
            case 16:
                g01.e.b bVar3 = g01.e.Companion;
                return new m63.e(j.a.f74202a);
            case 17:
                g01.f.b bVar4 = g01.f.Companion;
                return new m63.e(g01.e.a.f74164a);
            case 18:
                g01.g.Companion companion2 = g01.g.INSTANCE;
                return new m63.e(g01.x.a.f74286a);
            case 19:
                g01.g.Companion companion3 = g01.g.INSTANCE;
                return l01.e.INSTANCE.serializer();
            case 20:
                g01.g.Companion companion4 = g01.g.INSTANCE;
                return new u01.a();
            case 21:
                g01.g.Companion companion5 = g01.g.INSTANCE;
                return new u01.a();
            case 22:
                g01.h.b bVar5 = g01.h.Companion;
                return new m63.e(y1.f117048a);
            case 23:
                g01.i.Companion companion6 = g01.i.INSTANCE;
                return new m63.e(c0.a.f74146a);
            case 24:
                g01.i.Companion companion7 = g01.i.INSTANCE;
                return new m63.e(j.a.f74202a);
            case 25:
                g01.k.b bVar6 = g01.k.Companion;
                return l.Companion.serializer();
            case 26:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodIssueType", l.values(), new String[]{"INCORRECT_FOOD_NAME_OR_BRAND", "INCORRECT_NUTRITION_INFO", "MISSING_SERVING_SIZE", "OTHER"}, new Annotation[][]{null, null, null, null});
            case 27:
                m.Companion companion8 = m.INSTANCE;
                return u.INSTANCE.serializer();
            case 28:
                o.Companion companion9 = o.INSTANCE;
                return w.INSTANCE.serializer();
            default:
                p.b bVar7 = p.Companion;
                return new m63.e(g01.i.a.f74199a);
        }
    }
}

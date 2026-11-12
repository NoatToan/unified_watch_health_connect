package g01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import java.lang.annotation.Annotation;
import m63.k1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74240a;

    public /* synthetic */ q(int i14) {
        this.f74240a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f74240a) {
            case 0:
                r.Companion companion = r.INSTANCE;
                return new m63.e(c0.a.f74146a);
            case 1:
                r.Companion companion2 = r.INSTANCE;
                return new m63.e(j.a.f74202a);
            case 2:
                s.b bVar = s.Companion;
                return new m63.e(r.a.f74250a);
            case 3:
                t.b bVar2 = t.Companion;
                return new m63.e(new i63.e(s0.f105811a.b(a.class), new Annotation[0]));
            case 4:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodSource", u.values(), new String[]{"GARMIN", "FATSECRET", "UNKNOWN"}, new Annotation[][]{null, null, null});
            case 5:
                v.b bVar3 = v.Companion;
                return new m63.e(new i63.e(s0.f105811a.b(a.class), new Annotation[0]));
            case 6:
                v.b bVar4 = v.Companion;
                return new m63.e(new i63.e(s0.f105811a.b(a.class), new Annotation[0]));
            case 7:
                return k1.d("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodType", w.values(), new String[]{"GENERIC", "BRAND"}, new Annotation[][]{null, null});
            case 8:
                x.b bVar5 = x.Companion;
                return new u01.a();
            case 9:
                x.b bVar6 = x.Companion;
                return new u01.a();
            case 10:
                y.b bVar7 = y.Companion;
                return new m63.e(i01.k.a.f86793a);
            case 11:
                z.b bVar8 = z.Companion;
                return new m63.e(x.a.f74286a);
            case 12:
                z.b bVar9 = z.Companion;
                return new u01.a();
            case 13:
                z.b bVar10 = z.Companion;
                return new u01.a();
            case 14:
                z.b bVar11 = z.Companion;
                return l01.e.INSTANCE.serializer();
            case 15:
                a0.b bVar12 = a0.Companion;
                return new m63.e(g.a.f74187a);
            case 16:
                b0.b bVar13 = b0.Companion;
                return new m63.e(r.a.f74250a);
            case 17:
                d0.b bVar14 = d0.Companion;
                return new m63.e(m.a.f74223a);
            case 18:
                return PhotoCategory._init_$_anonymous_();
            case 19:
                e0.b bVar15 = e0.Companion;
                return new m63.e(c0.a.f74146a);
            case 20:
                e0.b bVar16 = e0.Companion;
                return new m63.e(j.a.f74202a);
            case 21:
                g0.b bVar17 = g0.Companion;
                return new m63.e(f0.a.f74180a);
            case 22:
                throw new IllegalStateException("No Back Dispatcher provided");
            case 23:
                return Unit.INSTANCE;
            case 24:
                return p0.n(Boolean.FALSE);
            case 25:
                g02.b0 b0Var = g02.b0.f74326a;
                return Unit.INSTANCE;
            case 26:
                g02.b0 b0Var2 = g02.b0.f74326a;
                return Unit.INSTANCE;
            case 27:
                return Float.valueOf(1.0f);
            case 28:
                int i14 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                return (ru1.d) KoinJavaComponent.get$default(ru1.d.class, null, null, 6, null);
            default:
                int i15 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                return (av.g) KoinJavaComponent.get$default(av.g.class, null, null, 6, null);
        }
    }
}

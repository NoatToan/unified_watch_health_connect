package go1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import java.lang.annotation.Annotation;
import m63.y1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.b2;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78250a;

    public /* synthetic */ j(int i14) {
        this.f78250a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f78250a) {
            case 0:
                int i14 = k.C;
                return (vg0.a) KoinJavaComponent.get$default(vg0.a.class, null, null, 6, null);
            case 1:
                int i15 = k.C;
                return (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
            case 2:
                gs.d dVar = gs.d.f78592a;
                return Unit.INSTANCE;
            case 3:
                gs.d dVar2 = gs.d.f78592a;
                return Unit.INSTANCE;
            case 4:
                return com.garmin.android.apps.connectmobile.audioprompts.b.a();
            case 5:
                return p0.n(Boolean.FALSE);
            case 6:
                int i16 = gx1.b.f80046n;
                return new y0();
            case 7:
                int i17 = gx1.b.f80046n;
                return new y0();
            case 8:
                int i18 = gx1.b.f80046n;
                return new y0();
            case 9:
                int i19 = gx1.b.f80046n;
                return new y0();
            case 10:
                int i24 = gx1.b.f80046n;
                return new y0();
            case 11:
                int i25 = gx1.b.f80046n;
                return new y0();
            case 12:
                int i26 = gy0.o.f80203b;
                return (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            case 13:
                return new bq0.c(10, 15000);
            case 14:
                h01.b.C1609b c1609b = h01.b.Companion;
                return g01.u.INSTANCE.serializer();
            case 15:
                h01.c.Companion bVar = h01.c.INSTANCE;
                return new m63.e(new i63.e(s0.f105811a.b(g01.a.class), new Annotation[0]));
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                int i27 = PostCommentView.f47845f;
                return (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            case 19:
                return Integer.valueOf(h50.m.f82074a.size());
            case 20:
                return p0.n(Boolean.FALSE);
            case 21:
                return new b2(-1L);
            case 22:
                return p0.n(null);
            case 23:
                h63.a aVar = h63.a.f82282a;
                t0 t0Var = s0.f105811a;
                return new i63.g("kotlinx.datetime.DateTimeUnit.DateBased", t0Var.b(b63.i.b.class), new k23.d[]{t0Var.b(b63.i.c.class), t0Var.b(b63.i.d.class)}, new i63.c[]{h63.g.f82296a, h63.n.f82310a});
            case 24:
                h63.f fVar = h63.f.f82294a;
                t0 t0Var2 = s0.f105811a;
                return new i63.g("kotlinx.datetime.DateTimeUnit", t0Var2.b(b63.i.class), new k23.d[]{t0Var2.b(b63.i.c.class), t0Var2.b(b63.i.d.class), t0Var2.b(b63.i.e.class)}, new i63.c[]{h63.g.f82296a, h63.n.f82310a, h63.o.f82312a});
            case 25:
                h63.g gVar = h63.g.f82296a;
                return k63.k.c("kotlinx.datetime.DayBased", new k63.e[0], new h02.a(15));
            case 26:
                h63.n nVar = h63.n.f82310a;
                return k63.k.c("kotlinx.datetime.MonthBased", new k63.e[0], new h02.a(16));
            case 27:
                h63.o oVar = h63.o.f82312a;
                return k63.k.c("kotlinx.datetime.TimeBased", new k63.e[0], new h02.a(17));
            case 28:
                h90.a.b bVar2 = h90.a.Companion;
                j90.a[] aVarArrValues = j90.a.values();
                aVarArrValues.getClass();
                return new m63.e(new m63.b0("com.garmin.android.apps.connectmobile.device.setup.domain.customization.model.ActivityOption", aVarArrValues));
            default:
                h90.a.b bVar3 = h90.a.Companion;
                return new m63.e(y1.f117048a);
        }
    }
}

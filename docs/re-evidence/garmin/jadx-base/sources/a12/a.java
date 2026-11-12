package a12;

import bz0.o;
import c32.d;
import c62.k2;
import c63.s;
import c82.j;
import com.garmin.android.apps.connectmobile.g3;
import com.mapbox.maps.MapboxMap;
import e23.l;
import f5.c0;
import fg0.k;
import g6.m;
import kotlin.m2;
import l72.i3;
import lc.u0;
import m4.g0;
import p005kotlin.Unit;
import q4.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f405b;

    public /* synthetic */ a(l lVar, int i14) {
        this.f404a = i14;
        this.f405b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f404a;
        l lVar = this.f405b;
        switch (i14) {
            case 0:
                j jVar = (j) obj;
                jVar.getClass();
                lVar.invoke(jVar.f25740a);
                return Unit.INSTANCE;
            case 1:
                lVar.invoke(new n50.c.b((r30.a) obj));
                return Unit.INSTANCE;
            case 2:
                f fVar = (f) obj;
                fVar.getClass();
                lVar.invoke(fVar);
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                lVar.invoke(str2);
                return Unit.INSTANCE;
            case 5:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (lVar != null) {
                    lVar.invoke(i3Var.f111063a);
                }
                return Unit.INSTANCE;
            case 6:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (lVar != null) {
                    lVar.invoke(i3Var2.f111063a);
                }
                return Unit.INSTANCE;
            case 7:
                i3 i3Var3 = (i3) obj;
                i3Var3.getClass();
                if (lVar != null) {
                    lVar.invoke(i3Var3.f111063a);
                }
                return Unit.INSTANCE;
            case 8:
                Integer num = (Integer) obj;
                num.intValue();
                lVar.invoke(num);
                return Unit.INSTANCE;
            case 9:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                lVar.invoke(Boolean.valueOf(g0Var.a()));
                return Unit.INSTANCE;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                lVar.invoke(bool);
                return Unit.INSTANCE;
            case 11:
                bb0.c cVar = (bb0.c) obj;
                cVar.getClass();
                lVar.invoke(Integer.valueOf(cVar.f17293a));
                return Unit.INSTANCE;
            case 12:
                bb0.f fVar2 = (bb0.f) obj;
                fVar2.getClass();
                lVar.invoke(Integer.valueOf(fVar2.f17300a));
                return Unit.INSTANCE;
            case 13:
                String str3 = (String) obj;
                o oVar = o.f22274a;
                str3.getClass();
                o.f22275b.debug(str3);
                if (lVar != null) {
                    lVar.invoke(str3);
                }
                return Unit.INSTANCE;
            case 14:
                String str4 = (String) obj;
                str4.getClass();
                v21.f.f175333a.getClass();
                lVar.invoke(v21.f.v(str4));
                return Unit.INSTANCE;
            case 15:
                m2 m2Var = (m2) obj;
                m2Var.f91341a = MapboxMap.QFE_OFFSET;
                m2Var.f91343c.c(lVar, MapboxMap.QFE_OFFSET);
                return Unit.INSTANCE;
            case 16:
                d dVar = (d) obj;
                dVar.getClass();
                lVar.invoke(dVar);
                return Unit.INSTANCE;
            case 17:
                lVar.invoke(new e50.a.w((r30.a) obj));
                return Unit.INSTANCE;
            case 18:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                lVar.invoke(m.a(c0Var.a()));
                return Unit.INSTANCE;
            case 19:
                lVar.invoke(new e50.a.g0(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 20:
                k kVar = (k) obj;
                kVar.getClass();
                lVar.invoke(new e50.a.o(kVar));
                return Unit.INSTANCE;
            case 21:
                lVar.invoke(new e50.a.u(((Long) obj).longValue()));
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.b) obj;
                bVar.getClass();
                lVar.invoke(new e50.a.r(bVar));
                return Unit.INSTANCE;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                lVar.invoke(new e50.a.c(str5));
                return Unit.INSTANCE;
            case 24:
                lVar.invoke(new e50.a.v(((Long) obj).longValue()));
                return Unit.INSTANCE;
            case 25:
                lVar.invoke(new e50.a.f(((Long) obj).longValue()));
                return Unit.INSTANCE;
            case 26:
                w01.c cVar2 = (w01.c) obj;
                cVar2.getClass();
                lVar.invoke(new e50.a.q(cVar2));
                return Unit.INSTANCE;
            case 27:
                g3 g3Var = (g3) obj;
                g3Var.getClass();
                T t7 = g3Var.f35301b;
                int i15 = k2.a.f24774a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    g3.a aVar = g3.f35298f;
                    Object objInvoke = lVar.invoke(t7);
                    aVar.getClass();
                    return g3.a.b(objInvoke);
                }
                if (i15 != 2) {
                    if (i15 == 3) {
                        return g3.a.a(g3.f35298f, g3Var.f35302c, g3Var.f35303d, null, null, 12);
                    }
                    u0.r();
                    return null;
                }
                g3.a aVar2 = g3.f35298f;
                Object objInvoke2 = lVar.invoke(t7);
                aVar2.getClass();
                return g3.a.d(objInvoke2);
            case 28:
                g3 g3Var2 = (g3) obj;
                g3Var2.getClass();
                int i16 = k2.a.f24774a[g3Var2.f35300a.ordinal()];
                if (i16 == 1) {
                    return g3.a.c(g3.f35298f);
                }
                if (i16 != 2) {
                    if (i16 == 3) {
                        return g3.a.a(g3.f35298f, g3Var2.f35302c, g3Var2.f35303d, null, null, 12);
                    }
                    u0.r();
                    return null;
                }
                g3.a aVar3 = g3.f35298f;
                Object objInvoke3 = lVar.invoke(g3Var2.f35301b);
                aVar3.getClass();
                return g3.a.d(objInvoke3);
            default:
                s sVar = (s) obj;
                sVar.getClass();
                lVar.invoke(sVar);
                return Unit.INSTANCE;
        }
    }
}

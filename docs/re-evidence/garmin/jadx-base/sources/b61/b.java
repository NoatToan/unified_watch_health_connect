package b61;

import c22.l3;
import gg1.o0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import x61.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb61/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16165a = new b();

    private b() {
    }

    public static boolean a(Integer num) {
        return num != null && num.intValue() > 4000;
    }

    public static List b(List list, c61.a aVar) {
        aVar.getClass();
        if (list == null) {
            return j0.f134944a;
        }
        if (aVar == c61.a.HEAT) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((e) obj).getHeatAcclimationPercentage() != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            e eVar = (e) obj2;
            if (eVar.getAltitudeAcclimationMeters() != null) {
                Integer altitudeAcclimationMeters = eVar.getAltitudeAcclimationMeters();
                altitudeAcclimationMeters.getClass();
                if (altitudeAcclimationMeters.intValue() >= 800) {
                    Integer altitudeAcclimationMeters2 = eVar.getAltitudeAcclimationMeters();
                    altitudeAcclimationMeters2.getClass();
                    if (altitudeAcclimationMeters2.intValue() <= 4000) {
                        arrayList2.add(obj2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public static double c(o0 o0Var, Integer num) {
        o0Var.getClass();
        if (o0Var != o0.STATUTE_US) {
            return num.doubleValue();
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = num.doubleValue();
        aVar.getClass();
        return dDoubleValue * 3.2808399d;
    }

    public static boolean d(List list) {
        return !(list == null || list.isEmpty());
    }
}

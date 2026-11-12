package v01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r53.o2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B+\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv01/v0;", "Ln70/a0;", "Lr53/i;", "Lq01/f;", "Lj70/d;", "Lpb2/e$c;", "data", "Lr53/o2;", "Lx01/e;", "nutritionFeatureState", "<init>", "(Lr53/i;Lr53/o2;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 implements n70.a0<r53.i<? extends q01.f>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.d<pb2.e.c>> f174556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2<x01.e> f174557b;

    public v0(r53.i<j70.d<pb2.e.c>> iVar, o2<x01.e> o2Var) {
        iVar.getClass();
        o2Var.getClass();
        this.f174556a = iVar;
        this.f174557b = o2Var;
    }

    public static boolean c(pb2.e.t tVar) {
        Integer num = tVar.f137093a;
        return (num == null || num.intValue() == 0) && e(tVar.f137097e) && e(tVar.f137096d) && e(tVar.f137095c) && e(tVar.f137094b);
    }

    public static i53.c d(List list) {
        pb2.e.t tVar;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateMinusDays = LocalDate.now().minusDays(27);
        localDateMinusDays.getClass();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        c22.h0 h0Var = new c22.h0(localDateMinusDays, localDateNow, 0, 4, null);
        int iA = p13.t0.a(p13.y.r(h0Var, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<LocalDate> it = h0Var.iterator();
        while (true) {
            c22.h0.a aVar = (c22.h0.a) it;
            boolean z14 = true;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            LocalDate localDate = (LocalDate) next;
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z14 = false;
                        break;
                        break;
                    }
                    pb2.e.h hVar = (pb2.e.h) it3.next();
                    if (g22.k.g(hVar.f136996a.toLocalDate(), localDate) && (tVar = hVar.f136997b) != null && !c(tVar)) {
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            linkedHashMap.put(next, Boolean.valueOf(z14));
        }
        Iterator<LocalDate> it4 = h0Var.iterator();
        int i14 = 0;
        while (true) {
            c22.h0.a aVar2 = (c22.h0.a) it4;
            if (!aVar2.hasNext()) {
                return i53.a.e(arrayList);
            }
            LocalDate localDate2 = (LocalDate) aVar2.next();
            Boolean bool = (Boolean) linkedHashMap.get(localDate2);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            i14 = zBooleanValue ? i14 + 1 : 0;
            arrayList.add(new q01.c(localDate2, zBooleanValue, i14));
        }
    }

    public static boolean e(Double d14) {
        return d14 == null || p005kotlin.jvm.internal.s.c(d14, 0.0d);
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetNutritionDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends q01.f> invoke() {
        return new r53.u1(this.f174556a, this.f174557b, new u0(this, null));
    }
}

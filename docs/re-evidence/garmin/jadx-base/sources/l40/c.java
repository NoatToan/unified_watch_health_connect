package l40;

import com.garmin.android.apps.connectmobile.courses.model.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import s20.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll40/c;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f109891a = new c();

    private c() {
    }

    public static d a(d dVar, a aVar) {
        dVar.getClass();
        if (aVar instanceof a.C2100a) {
            l lVar = l.f156021a;
            a.C2100a c2100a = (a.C2100a) aVar;
            int i14 = c2100a.f109878a;
            lVar.getClass();
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f1(i14);
            return d.a(dVar, c2100a.f109878a, false, false, false, false, false, null, false, null, false, false, 0, 0, 8190);
        }
        if (aVar instanceof a.d) {
            l lVar2 = l.f156021a;
            a.d dVar2 = (a.d) aVar;
            boolean z14 = dVar2.f109882a;
            lVar2.getClass();
            l.a().f156020a.O2("KeyMapMileMarkerOption", z14);
            return d.a(dVar, 0, dVar2.f109882a, false, false, false, false, null, false, null, false, false, 0, 0, 8189);
        }
        if (aVar instanceof a.k) {
            l lVar3 = l.f156021a;
            a.k kVar = (a.k) aVar;
            boolean z15 = kVar.f109889a;
            lVar3.getClass();
            l.a().f156020a.O2("KeyHeatMapOption", z15);
            return d.a(dVar, 0, false, kVar.f109889a, false, false, false, null, false, null, false, false, 0, 0, 8187);
        }
        if (aVar instanceof a.h) {
            l lVar4 = l.f156021a;
            a.h hVar = (a.h) aVar;
            boolean z16 = hVar.f109886a;
            lVar4.getClass();
            l.a().f156020a.O2("KeyHighTrafficRoadsOption", z16);
            return d.a(dVar, 0, false, false, hVar.f109886a, false, false, null, false, null, false, false, 0, 0, 8183);
        }
        if (aVar instanceof a.l) {
            l lVar5 = l.f156021a;
            a.l lVar6 = (a.l) aVar;
            boolean z17 = lVar6.f109890a;
            lVar5.getClass();
            l.a().f156020a.O2("KeyUnpavedRoadsOption", z17);
            return d.a(dVar, 0, false, false, false, lVar6.f109890a, false, null, false, null, false, false, 0, 0, 8175);
        }
        if (aVar instanceof a.j) {
            l lVar7 = l.f156021a;
            a.j jVar = (a.j) aVar;
            boolean z18 = jVar.f109888a;
            lVar7.getClass();
            l.a().f156020a.O2("KeyPointsOfInterestOption", z18);
            return d.a(dVar, 0, false, false, false, false, jVar.f109888a, null, false, null, false, false, 0, 0, 8159);
        }
        if (aVar instanceof a.i) {
            l lVar8 = l.f156021a;
            List<h> list = ((a.i) aVar).f109887a;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).f32965a);
            }
            Set<String> setG1 = h0.g1(arrayList);
            lVar8.getClass();
            setG1.getClass();
            l.a().f156020a.X1("KeyPointOfInterestTypes", setG1);
            return d.a(dVar, 0, false, false, false, false, false, list, false, null, false, false, 0, 0, 8127);
        }
        if (aVar instanceof a.g) {
            l lVar9 = l.f156021a;
            a.g gVar = (a.g) aVar;
            boolean z19 = gVar.f109885a;
            lVar9.getClass();
            l.a().f156020a.O2("KeyHazardsOption", z19);
            return d.a(dVar, 0, false, false, false, false, false, null, gVar.f109885a, null, false, false, 0, 0, 8063);
        }
        if (aVar instanceof a.e) {
            l lVar10 = l.f156021a;
            List<fn0.c> list2 = ((a.e) aVar).f109883a;
            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((fn0.c) it3.next()).f72173a);
            }
            Set<String> setG2 = h0.g1(arrayList2);
            lVar10.getClass();
            setG2.getClass();
            l.a().f156020a.X1("KeyHazardTypes", setG2);
            l.f156021a.getClass();
            return d.a(dVar, 0, false, false, false, false, false, null, false, l.b(), false, false, 0, 0, 7935);
        }
        if (aVar instanceof a.f) {
            l lVar11 = l.f156021a;
            a.f fVar = (a.f) aVar;
            boolean z24 = fVar.f109884a;
            lVar11.getClass();
            l.a().f156020a.O2("KeyHazardsOnCourseOption", z24);
            return d.a(dVar, 0, false, false, false, false, false, null, false, null, fVar.f109884a, false, 0, 0, 7679);
        }
        if (aVar instanceof a.c) {
            l lVar12 = l.f156021a;
            a.c cVar = (a.c) aVar;
            boolean z25 = cVar.f109881a;
            lVar12.getClass();
            l.a().f156020a.O2("KeyClimbsOption", z25);
            return d.a(dVar, 0, false, false, false, false, false, null, false, null, false, cVar.f109881a, 0, 0, 7167);
        }
        if (!(aVar instanceof a.b)) {
            u0.r();
            return null;
        }
        l lVar13 = l.f156021a;
        a.b bVar = (a.b) aVar;
        int i15 = bVar.f109879a;
        lVar13.getClass();
        l.a().f156020a.u2(i15, "keyClimbsMinDifficulty");
        l.a().f156020a.u2(bVar.f109880b, "keyClimbsMaxDifficulty");
        return d.a(dVar, 0, false, false, false, false, false, null, false, null, false, false, bVar.f109879a, bVar.f109880b, 2047);
    }
}

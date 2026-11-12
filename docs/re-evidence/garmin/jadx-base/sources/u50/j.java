package u50;

import am.x0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o13.r;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.m1;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lk30/l;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$onBoundsChanged$2", f = "CourseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<v2<? extends k30.l>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f168688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f168688b = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f168688b, dVar);
        jVar.f168687a = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends k30.l> v2Var, t13.d<? super Unit> dVar) {
        return ((j) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object value2;
        boolean z14;
        com.garmin.android.library.mapsdkadapter.e eVar;
        Object value3;
        v2 v2Var = (v2) this.f168687a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        boolean z15 = v2Var instanceof v2.b;
        h hVar = this.f168688b;
        if (z15) {
            k30.l lVar = (k30.l) ((v2.b) v2Var).f47386a;
            p2 p2Var = hVar.f168672h;
            List<com.garmin.android.apps.connectmobile.courses.model.i> list = hVar.f168665a;
            if (lVar.f102567c) {
                hVar.D4();
            } else {
                List<com.garmin.android.apps.connectmobile.courses.model.d> list2 = lVar.courseList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    com.garmin.android.apps.connectmobile.courses.model.i.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
                    x0 x0VarC = ((com.garmin.android.apps.connectmobile.courses.model.d) obj2).C();
                    aVar2.getClass();
                    if (list.contains(com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarC))) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    do {
                        value3 = p2Var.getValue();
                    } while (!p2Var.b(value3, x50.f.a((x50.f) value3, null, null, x50.d.EMPTY, false, false, R.string.lbl_filter_search_no_courses, false, 475)));
                    if (hVar.f168678n) {
                        hVar.x4(x50.c.g.f188993a);
                    }
                } else {
                    if (hVar.f168666b) {
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList3) {
                            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) obj3;
                            if (dVar.C() == x0.f4308n || dVar.C() == x0.J0) {
                                arrayList2.add(obj3);
                            }
                        }
                    } else {
                        if (hVar.f168667c) {
                            arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) obj4;
                                if (dVar2.C() == x0.X0 || dVar2.C() == x0.V0 || dVar2.C() == x0.Z0) {
                                    if (!sa1.h.e(dVar2.distanceInMeters)) {
                                        arrayList2.add(obj4);
                                    }
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        do {
                            value2 = p2Var.getValue();
                        } while (!p2Var.b(value2, h.E4(x50.f.a((x50.f) value2, arrayList, null, null, false, false, R.string.lbl_search, false, 478))));
                        if (!list.contains(com.garmin.android.apps.connectmobile.courses.model.i.HIKING) || list.contains(com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).b() && z14 && (eVar = hVar.f168677m) != null) {
                            h30.b bVar = hVar.f168669e;
                            LatLng latLng = eVar.d().f50283a;
                            bVar.getClass();
                            latLng.getClass();
                            c2 c2Var = new c2(new h30.a(bVar, latLng, null));
                            x53.c cVar = s0.f129406a;
                            x53.b bVar2 = x53.b.f189152a;
                            hVar.f168680p = s.C(s.A(new m1(s.A(c2Var, bVar2), new m(hVar, null)), bVar2), v1.a(hVar));
                        }
                    }
                    arrayList = arrayList2;
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, h.E4(x50.f.a((x50.f) value2, arrayList, null, null, false, false, R.string.lbl_search, false, 478))));
                    if (list.contains(com.garmin.android.apps.connectmobile.courses.model.i.HIKING)) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).b()) {
                        h30.b bVar3 = hVar.f168669e;
                        LatLng latLng2 = eVar.d().f50283a;
                        bVar3.getClass();
                        latLng2.getClass();
                        c2 c2Var2 = new c2(new h30.a(bVar3, latLng2, null));
                        x53.c cVar2 = s0.f129406a;
                        x53.b bVar4 = x53.b.f189152a;
                        hVar.f168680p = s.C(s.A(new m1(s.A(c2Var2, bVar4), new m(hVar, null)), bVar4), v1.a(hVar));
                    }
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var2 = hVar.f168672h;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, x50.f.a((x50.f) value, null, null, x50.d.ERROR, false, false, 0, false, 507)));
            hVar.x4(x50.c.h.f188994a);
        }
        return Unit.INSTANCE;
    }
}

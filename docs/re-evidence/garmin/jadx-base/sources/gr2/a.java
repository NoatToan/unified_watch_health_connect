package gr2;

import as.q;
import e2.f0;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import zb0.s0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f78573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78574c;

    public /* synthetic */ a(l lVar, ArrayList arrayList) {
        this.f78572a = 1;
        this.f78573b = lVar;
        this.f78574c = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object next;
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        boolean zG;
        switch (this.f78572a) {
            case 0:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                g.f78582a.getClass();
                f0.b(f0Var, null, g.f78583b, 3);
                c cVar = c.f78577a;
                ArrayList arrayList = this.f78574c;
                f0Var.a(arrayList.size(), null, new d(cVar, arrayList), new z3.e(802480018, true, new e(arrayList, this.f78573b)));
                return Unit.INSTANCE;
            case 1:
                s0 s0Var = (s0) obj;
                s0Var.getClass();
                Boolean bool = (Boolean) this.f78573b.invoke(Integer.valueOf(this.f78574c.indexOf(s0Var)));
                bool.getClass();
                return bool;
            case 2:
                q40.a aVar = (q40.a) obj;
                aVar.getClass();
                Long l14 = aVar.f142567a;
                Iterator it = this.f78574c.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) next;
                        if (l14 != null) {
                            Long coursePointId = gVar2.getCoursePointId();
                            zG = coursePointId != null && coursePointId.longValue() == l14.longValue();
                        } else {
                            zG = s.g(gVar2.getCoursePointType(), aVar.f142569c.f32922a);
                        }
                    } else {
                        next = null;
                    }
                    gVar = (com.garmin.android.apps.connectmobile.courses.model.g) next;
                    if (gVar != null) {
                        this.f78573b.invoke(new t50.b.k(gVar));
                    }
                    return Unit.INSTANCE;
                } while (!zG);
                gVar = (com.garmin.android.apps.connectmobile.courses.model.g) next;
                if (gVar != null) {
                    this.f78573b.invoke(new t50.b.k(gVar));
                }
                return Unit.INSTANCE;
            default:
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                int i14 = 0;
                for (Object obj2 : this.f78574c) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    f0.b(f0Var2, null, new z3.e(-474323935, true, new q((String) obj2, this.f78573b, i14, 8)), 3);
                    i14 = i15;
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(ArrayList arrayList, l lVar, int i14) {
        this.f78572a = i14;
        this.f78574c = arrayList;
        this.f78573b = lVar;
    }
}

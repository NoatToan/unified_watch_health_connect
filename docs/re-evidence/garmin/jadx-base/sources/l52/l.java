package l52;

import android.os.Parcelable;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static final void a(m mVar, e.b bVar) {
        bVar.getClass();
        f fVar = mVar.f110306a;
        fVar.getClass();
        f.d dVar = new f.d();
        dVar.a(bVar);
        Unit unit = Unit.INSTANCE;
        for (f<T> fVar2 : dVar.f110255a) {
            fVar2.getClass();
            f<T> fVar3 = fVar.f110248b;
            fVar.f110248b = fVar2;
            fVar2.f110249c = fVar;
            fVar2.f110248b = fVar3;
            fVar3.f110249c = fVar2;
            fVar2.f110250d = fVar.f110250d;
        }
    }

    public static final <T extends Parcelable> void b(e.a<T> aVar, e.b<T> bVar) {
        bVar.getClass();
        aVar.m(new k(bVar, 0));
    }

    public static final void c(j jVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var) {
        jVar.getClass();
        jVar.a(n.c(j0Var));
    }

    public static final <T extends Parcelable> void d(j<T> jVar, Iterable<? extends e.b<T>> iterable) {
        jVar.getClass();
        iterable.getClass();
        Iterator<? extends e.b<T>> it = iterable.iterator();
        while (it.hasNext()) {
            jVar.a(it.next());
        }
    }
}

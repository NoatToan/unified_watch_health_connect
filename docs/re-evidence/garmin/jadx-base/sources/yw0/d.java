package yw0;

import hx0.u;
import hx0.w;
import jx0.j;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import v13.i;
import vb.h;
import ww0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyw0/d;", "Lyw0/a;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yw0.a
    public final Object a(xw0.b bVar, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f199893c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f199893c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f199891a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f199893c;
        if (i15 == 0) {
            r.b(objJ);
            com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b bVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a;
            cVar2.f199893c = 1;
            bVar2.getClass();
            objJ = com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.j(bVar);
            if (objJ != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objJ);
                return objJ;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        cVar2.f199893c = 2;
        Object objAwait = ((i0) objJ).await(cVar2);
        return objAwait == obj ? obj : objAwait;
    }

    @Override // yw0.a
    public final Object b(LocalDate localDate, i iVar) {
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.b(localDate, iVar);
    }

    @Override // yw0.a
    public final Object c(w.a aVar) {
        com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.getClass();
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.c(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yw0.a
    public final Object d(xw0.c cVar, v13.c cVar2) {
        b bVar;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i14 = bVar.f199890c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f199890c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar2);
            }
        } else {
            bVar = new b(this, cVar2);
        }
        Object objH = bVar.f199888a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f199890c;
        if (i15 == 0) {
            r.b(objH);
            com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b bVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a;
            bVar.f199890c = 1;
            bVar2.getClass();
            objH = com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.h(cVar);
            if (objH != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objH);
                return objH;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objH);
        bVar.f199890c = 2;
        Object objAwait = ((i0) objH).await(bVar);
        return objAwait == obj ? obj : objAwait;
    }

    @Override // yw0.a
    public final Object e(LocalDate localDate, xw0.b bVar, u.a aVar) {
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.g(localDate, bVar, aVar);
    }

    @Override // yw0.a
    public final Object f(yx0.a.b bVar) {
        com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.getClass();
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.d(bVar);
    }

    @Override // yw0.a
    public final Object g(LocalDate localDate, LocalDate localDate2, com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.c.a aVar) {
        com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.getClass();
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.a(localDate, localDate2, aVar);
    }

    @Override // yw0.a
    public final Object h(int i14, LocalDate localDate, boolean z14, k.b bVar, j.a aVar) {
        com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.getClass();
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.b.e(i14, localDate, z14, bVar, aVar);
    }

    @Override // yw0.a
    public final Object i(LocalDate localDate, ww0.b bVar, i iVar) {
        return com.garmin.android.apps.connectmobile.menstrualcycle.data.api.a.f38759a.i(localDate, bVar, iVar);
    }
}

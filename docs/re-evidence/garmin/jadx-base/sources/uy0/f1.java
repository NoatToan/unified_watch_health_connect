package uy0;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luy0/f1;", "", "Lcom/garmin/android/apps/connectmobile/b1;", "itemAvailability", "Lf12/l;", "gcmUserSettings", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/b;", "pregnancyRepo", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lcom/garmin/android/apps/connectmobile/b1;Lf12/l;Lcom/garmin/android/apps/connectmobile/pregnancytracking/network/b;Lo53/z;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.b1 f173165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f173166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.pregnancytracking.network.b f173167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f173168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ty0.b f173169e;

    public f1(com.garmin.android.apps.connectmobile.b1 b1Var, f12.l lVar, com.garmin.android.apps.connectmobile.pregnancytracking.network.b bVar, o53.z zVar) {
        b1Var.getClass();
        lVar.getClass();
        bVar.getClass();
        zVar.getClass();
        this.f173165a = b1Var;
        this.f173166b = lVar;
        this.f173167c = bVar;
        this.f173168d = zVar;
        this.f173169e = ty0.b.f166870f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(f1 f1Var, v13.c cVar) {
        d1 d1Var;
        Iterable iterable;
        f1Var.getClass();
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i14 = d1Var.f173135c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d1Var.f173135c = i14 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(f1Var, cVar);
            }
        } else {
            d1Var = new d1(f1Var, cVar);
        }
        Object objJ = d1Var.f173133a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d1Var.f173135c;
        if (i15 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.pregnancytracking.network.b bVar = f1Var.f173167c;
            d1Var.f173135c = 1;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new com.garmin.android.apps.connectmobile.pregnancytracking.network.c(bVar, null), d1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            iterable = (List) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            db1.m mVar = (db1.m) obj;
            if (mVar.getDeliveryDate() == null && mVar.getEndDate() == null && mVar.getDueDate() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        LocalDate dueDate = ((db1.m) next).getDueDate();
        if (dueDate == null) {
            dueDate = LocalDate.now();
        }
        do {
            Object next2 = it.next();
            LocalDate dueDate2 = ((db1.m) next2).getDueDate();
            if (dueDate2 == null) {
                dueDate2 = LocalDate.now();
            }
            if (dueDate.compareTo(dueDate2) < 0) {
                next = next2;
                dueDate = dueDate2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final boolean b(f1 f1Var) {
        com.garmin.android.apps.connectmobile.b1 b1Var = f1Var.f173165a;
        if (z10.d1.i(q92.x.DI_CONNECT_UPLOAD)) {
            return (b1Var.d() || b1Var.c()) && !f1Var.f173166b.w().equals(UserSettingsDTO.c.MALE.f43537a);
        }
        return false;
    }

    public f1(com.garmin.android.apps.connectmobile.b1 b1Var, f12.l lVar, com.garmin.android.apps.connectmobile.pregnancytracking.network.b bVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b1Var, lVar, bVar, (i14 & 8) != 0 ? o53.s0.f129406a : zVar);
    }
}

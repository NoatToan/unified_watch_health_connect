package nx1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnx1/f;", "", "Lkv1/b;", "fbtPlansRepo", "<init>", "(Lkv1/b;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv1.b f128224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f128225b;

    public f(kv1.b bVar) {
        bVar.getClass();
        this.f128224a = bVar;
        this.f128225b = q2.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        d dVar;
        DateTime dateTimeJ;
        LocalDate localDate;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f128219d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f128219d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f128217b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f128219d;
        if (i15 == 0) {
            o13.r.b(objB);
            String string = dateTime.toString();
            string.getClass();
            String string2 = dateTime2.toString();
            string2.getClass();
            dVar.f128216a = dateTime;
            dVar.f128219d = 1;
            objB = kv1.b.b(this.f128224a, string, string2, dVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dateTime = dVar.f128216a;
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            av1.d dVar2 = (av1.d) obj;
            if (dVar2.r() && (dateTimeJ = dVar2.j()) != null && (localDate = dateTimeJ.toLocalDate()) != null && !localDate.isBefore(dateTime.toLocalDate())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        e eVar;
        p2 p2Var;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f128223d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f128223d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objA = eVar.f128221b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f128223d;
        p2 p2Var2 = this.f128225b;
        if (i15 == 0) {
            o13.r.b(objA);
            eVar.f128220a = p2Var2;
            eVar.f128223d = 1;
            objA = a(dateTime, dateTime2, eVar);
            if (objA != obj) {
                p2Var = p2Var2;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objA);
                return p2Var2;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p2Var = eVar.f128220a;
        o13.r.b(objA);
        eVar.f128220a = null;
        eVar.f128223d = 2;
        return p2Var.emit(objA, eVar) == obj ? obj : p2Var2;
    }
}

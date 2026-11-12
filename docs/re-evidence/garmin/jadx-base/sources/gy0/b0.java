package gy0;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/b0;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80104a;

    public b0(by0.a aVar) {
        aVar.getClass();
        this.f80104a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        a0 a0Var;
        DateTime dateTimeC;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f80098d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f80098d = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objH = a0Var.f80096b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f80098d;
        if (i15 == 0) {
            o13.r.b(objH);
            a0Var.f80095a = aVar;
            a0Var.f80098d = 1;
            objH = this.f80104a.h(str, oVar, oVar2, a0Var);
            if (objH == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = a0Var.f80095a;
            o13.r.b(objH);
        }
        List list = (List) objH;
        if (list == null || list.isEmpty()) {
            return null;
        }
        DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String calendarDate = ((r61.a) obj).getCalendarDate();
            Boolean boolValueOf = (calendarDate == null || (dateTimeC = ay0.b.c(calendarDate)) == null) ? null : Boolean.valueOf((dateTimeC.isBefore(dateTimeAtStartOfDay) || dateTimeC.isAfter(dateTimeAtStartOfDay2)) ? false : true);
            if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                arrayList.add(obj);
            }
        }
        return i53.a.j(arrayList);
    }
}

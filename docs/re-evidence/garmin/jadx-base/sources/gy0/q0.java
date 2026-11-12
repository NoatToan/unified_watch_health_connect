package gy0;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/q0;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80218a;

    public q0(by0.a aVar) {
        aVar.getClass();
        this.f80218a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        p0 p0Var;
        DateTime dateTimeC;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f80213d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f80213d = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objM = p0Var.f80211b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f80213d;
        if (i15 == 0) {
            o13.r.b(objM);
            p0Var.f80210a = aVar;
            p0Var.f80213d = 1;
            objM = this.f80218a.m(str, oVar, oVar2, p0Var);
            if (objM == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = p0Var.f80210a;
            o13.r.b(objM);
        }
        List list = (List) objM;
        if (list == null || list.isEmpty()) {
            return null;
        }
        aVar.getClass();
        DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String calendarDate = ((x61.e) obj).getCalendarDate();
            Boolean boolValueOf = (calendarDate == null || (dateTimeC = ay0.b.c(calendarDate)) == null) ? null : Boolean.valueOf((dateTimeC.isBefore(dateTimeAtStartOfDay) || dateTimeC.isAfter(dateTimeAtStartOfDay2)) ? false : true);
            if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                arrayList.add(obj);
            }
        }
        return i53.a.j(arrayList);
    }
}

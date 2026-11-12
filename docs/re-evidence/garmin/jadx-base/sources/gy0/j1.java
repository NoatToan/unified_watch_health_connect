package gy0;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/j1;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80182a;

    public j1(by0.a aVar) {
        aVar.getClass();
        this.f80182a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        i1 i1Var;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i14 = i1Var.f80179d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i1Var.f80179d = i14 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objS = i1Var.f80177b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = i1Var.f80179d;
        if (i15 == 0) {
            o13.r.b(objS);
            i1Var.f80176a = aVar;
            i1Var.f80179d = 1;
            objS = this.f80182a.s(str, oVar, oVar2, i1Var);
            if (objS == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = i1Var.f80176a;
            o13.r.b(objS);
        }
        List list = (List) objS;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((oz1.b) obj).getValidSleep(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        DateTime dateTimeAtStartOfDay = g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            DateTime dateTimeC = ay0.b.c(((oz1.b) obj2).getCalendarDate());
            Boolean boolValueOf = dateTimeC != null ? Boolean.valueOf((dateTimeC.isBefore(dateTimeAtStartOfDay) || dateTimeC.isAfter(dateTimeAtStartOfDay2)) ? false : true) : null;
            if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                arrayList2.add(obj2);
            }
        }
        return i53.a.j(arrayList2);
    }
}

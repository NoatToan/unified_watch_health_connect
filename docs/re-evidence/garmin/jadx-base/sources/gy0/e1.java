package gy0;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgy0/e1;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80139a;

    static {
        new a(null);
    }

    public e1(by0.a aVar) {
        aVar.getClass();
        this.f80139a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        f1 f1Var;
        List<mm1.c> listB;
        DateTime dateTimeC;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i14 = f1Var.f80159d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f1Var.f80159d = i14 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objQ = f1Var.f80157b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = f1Var.f80159d;
        if (i15 == 0) {
            o13.r.b(objQ);
            if (oVar != null && oVar2 != null) {
                f1Var.f80156a = aVar;
                f1Var.f80159d = 1;
                objQ = this.f80139a.q(str, oVar, oVar2, f1Var);
                if (objQ == aVar2) {
                    return aVar2;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = f1Var.f80156a;
        o13.r.b(objQ);
        mm1.b bVar = (mm1.b) objQ;
        if (bVar != null && (listB = bVar.b()) != null && !listB.isEmpty()) {
            aVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                String calendarDate = ((mm1.c) obj).getCalendarDate();
                Boolean boolValueOf = (calendarDate == null || (dateTimeC = ay0.b.c(calendarDate)) == null) ? null : Boolean.valueOf((dateTimeC.isBefore(g22.l.h(aVar.f130843a).toDateTimeAtStartOfDay()) || dateTimeC.isAfter(g22.l.h(aVar.f130844b).toDateTimeAtStartOfDay())) ? false : true);
                if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                    arrayList.add(obj);
                }
            }
            return mm1.b.a(bVar, arrayList);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/e1$a;", "", "<init>", "()V", "", "DAYS_DELTA_DAILY", "I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package gy0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/y;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80279a;

    public y(by0.a aVar) {
        aVar.getClass();
        this.f80279a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, o82.a aVar, b63.o oVar, b63.o oVar2, v13.c cVar) {
        x xVar;
        o82.a aVar2;
        Object objG;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f80274d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f80274d = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f80272b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f80274d;
        if (i15 == 0) {
            o13.r.b(obj);
            aVar2 = aVar;
            xVar.f80271a = aVar2;
            xVar.f80274d = 1;
            objG = this.f80279a.g(str, oVar, oVar2, xVar);
            if (objG == aVar3) {
                return aVar3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o82.a aVar4 = xVar.f80271a;
            o13.r.b(obj);
            objG = obj;
            aVar2 = aVar4;
        }
        k61.b bVar = (k61.b) objG;
        if (bVar == null) {
            return null;
        }
        DateTime dateTimeAtStartOfDay = g22.l.h(aVar2.f130843a).toDateTimeAtStartOfDay();
        DateTime dateTimeAtStartOfDay2 = g22.l.h(aVar2.f130844b).toDateTimeAtStartOfDay();
        i53.c<k61.a> cVar2 = bVar.f103168f;
        i53.c<k61.a> cVar3 = bVar.f103169g;
        i53.c<k61.a> cVar4 = bVar.f103170h;
        if (cVar2.isEmpty() && cVar3.isEmpty() && cVar4.isEmpty()) {
            return null;
        }
        dateTimeAtStartOfDay.getClass();
        dateTimeAtStartOfDay2.getClass();
        i53.f fVarA = z.a(cVar2, dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
        i53.f fVarA2 = z.a(cVar3, dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
        i53.f fVarA3 = z.a(cVar4, dateTimeAtStartOfDay, dateTimeAtStartOfDay2);
        DateTime dateTime = bVar.f103163a;
        DateTime dateTime2 = bVar.f103164b;
        i53.c<DateTime> cVar5 = bVar.f103165c;
        i53.c<ww1.a0> cVar6 = bVar.f103166d;
        j61.h hVar = bVar.f103167e;
        dateTime.getClass();
        dateTime2.getClass();
        cVar5.getClass();
        fVarA.getClass();
        fVarA2.getClass();
        fVarA3.getClass();
        return new k61.b(dateTime, dateTime2, cVar5, cVar6, hVar, fVarA, fVarA2, fVarA3);
    }
}

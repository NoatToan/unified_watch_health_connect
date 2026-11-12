package a61;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"La61/r;", "La61/i0;", "Lcom/garmin/android/apps/connectmobile/f0;", "La61/b;", "api", "Lbx1/a;", "fitnessStatsApi", "<init>", "(La61/b;Lbx1/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends i0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f1665j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f1666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bx1.a f1667i;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f1665j = gt2.b.f79005a.h("StrengthStatsRepo");
    }

    public /* synthetic */ r(b bVar, bx1.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (b) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b.class, new c83.h.a[0], null, null, null, 120) : bVar, (i14 & 2) != 0 ? (bx1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, bx1.a.class, new c83.h.a[0], null, null, null, 120) : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f1678e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f1678e = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objJ = tVar.f1676c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f1678e;
        if (i15 == 0) {
            o13.r.b(objJ);
            u uVar = new u(this, localDate, localDate2, null);
            tVar.f1674a = localDate;
            tVar.f1675b = localDate2;
            tVar.f1678e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, uVar, tVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate2 = tVar.f1675b;
            localDate = tVar.f1674a;
            o13.r.b(objJ);
        }
        v2 aVar2 = (v2) objJ;
        if (!(aVar2 instanceof v2.a)) {
            if (!(aVar2 instanceof v2.b)) {
                u0.r();
                return null;
            }
            v2.b bVar = (v2.b) aVar2;
            try {
                aVar2 = new v2.b(o53.f0.j((List) ((v2.b) aVar2).f47386a), bVar.f47387b, bVar.f47388c, null, 8, null);
            } catch (Exception e4) {
                aVar2 = new v2.a(e4, null, null, 6, null);
            }
        }
        f1665j.trace("getDailyStats(" + localDate + ", " + localDate2 + ")");
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f1687e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f1687e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objJ = vVar.f1685c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f1687e;
        if (i15 == 0) {
            o13.r.b(objJ);
            w wVar = new w(this, localDate, localDate2, null);
            vVar.f1683a = localDate;
            vVar.f1684b = localDate2;
            vVar.f1687e = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, wVar, vVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate2 = vVar.f1684b;
            localDate = vVar.f1683a;
            o13.r.b(objJ);
        }
        f1665j.trace("getMonthlyStats(" + localDate + ", " + localDate2 + ")");
        return objJ;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La61/r$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, bx1.a aVar) {
        super(null, 1, null);
        bVar.getClass();
        aVar.getClass();
        this.f1666h = bVar;
        this.f1667i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

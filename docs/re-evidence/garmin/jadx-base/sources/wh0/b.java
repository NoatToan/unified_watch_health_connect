package wh0;

import ae0.e;
import hd1.y;
import hs1.d;
import j70.j;
import java.util.List;
import n70.a0;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B;\u0012\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwh0/b;", "Ln70/a0;", "Lr53/i;", "Lyz1/a0$a;", "Lj70/j;", "", "", "Lhd1/y;", "data", "Lae0/b;", "userSummariesUseCase", "Lae0/e;", "getUserGoalsDataUseCase", "<init>", "(Lr53/i;Lae0/b;Lae0/e;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<i<? extends yz1.a0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<j<List<String>, y>> f185254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae0.b f185255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f185256c;

    public b(i<j<List<String>, y>> iVar, ae0.b bVar, e eVar) {
        iVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f185254a = iVar;
        this.f185255b = bVar;
        this.f185256c = eVar;
    }

    public static final Integer c(b bVar, d dVar, y yVar) {
        hs1.i movement;
        hs1.j floorsAscended;
        bVar.getClass();
        Integer value = (dVar == null || (movement = dVar.getMovement()) == null || (floorsAscended = movement.getFloorsAscended()) == null) ? null : floorsAscended.getValue();
        Integer numValueOf = yVar != null ? Integer.valueOf(yVar.f83432b) : null;
        if (value == null || numValueOf == null) {
            return value == null ? numValueOf : value;
        }
        return Integer.valueOf(Math.max(value.intValue(), numValueOf.intValue()));
    }

    public static final Integer d(b bVar, zk0.e eVar, y yVar) {
        DateTime dateTimeF;
        bVar.getClass();
        Integer numValueOf = eVar != null ? Integer.valueOf((int) eVar.getGoalValue()) : null;
        Integer numValueOf2 = yVar != null ? Integer.valueOf(yVar.f83434d) : null;
        long millis = (eVar == null || (dateTimeF = eVar.f()) == null) ? 0L : dateTimeF.getMillis();
        long j8 = yVar != null ? yVar.f83396a : 0L;
        if (numValueOf == null || numValueOf2 == null) {
            return numValueOf == null ? numValueOf2 : numValueOf;
        }
        return Integer.valueOf((j8 < millis || numValueOf2.intValue() <= 0) ? numValueOf.intValue() : numValueOf2.intValue());
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetFloorsDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends yz1.a0.a> invoke() {
        return s.A(new a(this.f185254a, this), s0.f129406a);
    }
}

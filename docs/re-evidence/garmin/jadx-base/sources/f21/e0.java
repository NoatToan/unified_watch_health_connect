package f21;

import java.time.LocalTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68512a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f68513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f68514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68516e;

    public /* synthetic */ e0(g21.o oVar, boolean z14, boolean z15, e23.p pVar) {
        this.f68515d = oVar;
        this.f68513b = z14;
        this.f68514c = z15;
        this.f68516e = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    @Override // e23.a
    public final Object invoke() {
        Comparable start;
        Comparable comparableB;
        switch (this.f68512a) {
            case 0:
                g21.o oVar = (g21.o) this.f68515d;
                e23.p pVar = (e23.p) this.f68516e;
                b63.v vVarF = g22.l.f(b63.v.INSTANCE);
                oVar.getClass();
                j23.g<b63.v> gVar = oVar.f75467e;
                LocalTime localTime = vVarF.f16219a;
                j23.g<b63.v> gVar2 = oVar.f75466d;
                b63.v vVar = gVar2 != null ? (b63.v) gVar2.getStart() : null;
                if (vVar != null && this.f68513b) {
                    if (gVar == null && oVar.f75464b.equals(b11.c.SNACKS.f14250a) && vVar.f16219a.getHour() != localTime.getHour()) {
                        vVarF = vVar;
                    } else if (gVar != null) {
                        boolean z14 = this.f68514c;
                        if (z14) {
                            b63.v vVar2 = (b63.v) gVar.getStart();
                            b63.v vVar3 = (b63.v) gVar.b();
                            b63.v vVar4 = new b63.v(localTime.getHour(), localTime.getMinute(), 0, 0, 12, null);
                            if (vVar4.compareTo(vVar2) < 0 || vVar4.compareTo(vVar3) > 0) {
                                if (z14) {
                                    vVarF = vVar;
                                } else {
                                    start = gVar.getStart();
                                    comparableB = gVar.b();
                                    start.getClass();
                                    comparableB.getClass();
                                    if (!new j23.h(start, comparableB).contains(new b63.v(localTime.getHour(), localTime.getMinute(), 0, 0, 12, null))) {
                                        vVarF = vVar;
                                    }
                                }
                            }
                        } else if (z14) {
                            start = gVar.getStart();
                            comparableB = gVar.b();
                            start.getClass();
                            comparableB.getClass();
                            if (!new j23.h(start, comparableB).contains(new b63.v(localTime.getHour(), localTime.getMinute(), 0, 0, 12, null))) {
                                vVarF = vVar;
                            }
                        } else {
                            vVarF = vVar;
                        }
                    }
                }
                if (pVar != null) {
                    pVar.invoke(vVarF, oVar);
                }
                break;
            default:
                e23.l lVar = (e23.l) this.f68515d;
                q40.b bVar = (q40.b) this.f68516e;
                if (!this.f68513b && !this.f68514c) {
                    lVar.invoke(bVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e0(boolean z14, boolean z15, e23.l lVar, q40.b bVar) {
        this.f68513b = z14;
        this.f68514c = z15;
        this.f68515d = lVar;
        this.f68516e = bVar;
    }
}

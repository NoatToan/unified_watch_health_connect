package c22;

import i3.e5;
import i3.mh;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23053c;

    public /* synthetic */ f0(Object obj, long j8, int i14) {
        this.f23051a = i14;
        this.f23053c = obj;
        this.f23052b = j8;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DateTime dateTimeMinusMinutes;
        int i14 = this.f23051a;
        long j8 = this.f23052b;
        Object obj4 = this.f23053c;
        switch (i14) {
            case 0:
                String str = (String) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(h4.r.S, 16);
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(rVarY, h4.d.a.f81528f);
                    d6.h.f57752b.getClass();
                    int i15 = d6.h.f57755e;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarC, this.f23052b, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar, 0, 0, 130040);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                oz1.a aVar2 = (oz1.a) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(rVarF, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11);
                    String strQ = gl1.y.Q(mVar2, sz1.m.d(aVar2));
                    d6.h.f57752b.getClass();
                    sz1.m.a(rVarC2, strQ, d6.h.f57758h, o4.d0.a(j8), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                z31.a aVar3 = (z31.a) obj4;
                Float f14 = (Float) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(f14) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    Unit unit = null;
                    i41.c cVar = f14 != null ? (i41.c) p13.h0.e0((int) f14.floatValue(), aVar3.f202138g) : null;
                    if (cVar == null) {
                        mVar3.C(-436548802);
                        mVar3.f();
                    } else {
                        mVar3.C(-436548801);
                        String string = new LocalDateTime(cVar.getReadingTimeGMT()).toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
                        string.getClass();
                        DateTime dateTimeA = t31.b.a(string);
                        String strG = e5.g((dateTimeA == null || (dateTimeMinusMinutes = dateTimeA.minusMinutes(5)) == null) ? null : t31.b.b(dateTimeMinusMinutes), " - ", dateTimeA != null ? t31.b.b(dateTimeA) : null);
                        if (cVar.getHrvValue() <= 0) {
                            mVar3.C(-821013102);
                            m92.y.a("", z3.f.c(87691253, new d70.n(j8, 5), mVar3), mVar3, 390);
                            mVar3.f();
                        } else {
                            mVar3.C(-820495867);
                            m92.y.a(strG, z3.f.c(1098989118, new d81.z(j8, cVar, 11), mVar3), mVar3, 384);
                            mVar3.f();
                        }
                        mVar3.f();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        mVar3.C(-435043286);
                        m92.y.a("", z3.f.c(-905781018, new d70.n(j8, 6), mVar3), mVar3, 390);
                        mVar3.f();
                    } else {
                        mVar3.C(-1676652108);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

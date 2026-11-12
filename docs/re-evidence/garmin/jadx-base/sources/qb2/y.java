package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/y;", "Lvh/a;", "Lpb2/e$k;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements vh.a<pb2.e.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f144283a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144284b = p13.x.k("startDate", "dayInCycle", "periodLength", "currentPhase", "lengthOfCurrentPhase", "daysUntilNextPhase", "fertileWindowStart", "lengthOfFertileWindow", "predictedCycleLength", "educationContentMod", "lutealPhaseStart", "pregnancyCycle", "numberOfWeek", "dueDate", "deliveryDate", "endDate", "overlapCycles", "isPredictedCycle");

    private y() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.k kVar) {
        pb2.e.k kVar2 = kVar;
        gVar.getClass();
        zVar.getClass();
        kVar2.getClass();
        gVar.v1("startDate");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        vh.a aVarD = zVar.d(a0Var);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, kVar2.f137039a);
        gVar.v1("dayInCycle");
        vh.k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, kVar2.f137040b);
        gVar.v1("periodLength");
        k0Var.a(gVar, zVar, kVar2.f137041c);
        gVar.v1("currentPhase");
        k0Var.a(gVar, zVar, kVar2.f137042d);
        gVar.v1("lengthOfCurrentPhase");
        k0Var.a(gVar, zVar, kVar2.f137043e);
        gVar.v1("daysUntilNextPhase");
        k0Var.a(gVar, zVar, kVar2.f137044f);
        gVar.v1("fertileWindowStart");
        k0Var.a(gVar, zVar, kVar2.f137045g);
        gVar.v1("lengthOfFertileWindow");
        k0Var.a(gVar, zVar, kVar2.f137046h);
        gVar.v1("predictedCycleLength");
        k0Var.a(gVar, zVar, kVar2.f137047i);
        gVar.v1("educationContentMod");
        k0Var.a(gVar, zVar, kVar2.f137048j);
        gVar.v1("lutealPhaseStart");
        k0Var.a(gVar, zVar, kVar2.f137049k);
        gVar.v1("pregnancyCycle");
        vh.k0<Boolean> k0Var2 = vh.c.f178277l;
        k0Var2.a(gVar, zVar, kVar2.f137050l);
        gVar.v1("numberOfWeek");
        k0Var.a(gVar, zVar, kVar2.f137051m);
        gVar.v1("dueDate");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, kVar2.f137052n);
        gVar.v1("deliveryDate");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, kVar2.f137053o);
        gVar.v1("endDate");
        new vh.k0(zVar.d(a0Var)).a(gVar, zVar, kVar2.f137054p);
        gVar.v1("overlapCycles");
        new vh.k0(new vh.j0(new vh.k0(vh.c.b(l0.f144237a, false)))).a(gVar, zVar, kVar2.f137055q);
        gVar.v1("isPredictedCycle");
        k0Var2.a(gVar, zVar, kVar2.f137056r);
    }

    @Override // vh.a
    public final pb2.e.k b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        Integer numB = null;
        Integer numB2 = null;
        Integer numB3 = null;
        Integer numB4 = null;
        Integer numB5 = null;
        Integer numB6 = null;
        Integer numB7 = null;
        Integer numB8 = null;
        Integer numB9 = null;
        Integer numB10 = null;
        Boolean boolB = null;
        Integer numB11 = null;
        DateTime dateTime2 = null;
        DateTime dateTime3 = null;
        DateTime dateTime4 = null;
        List list = null;
        Boolean boolB2 = null;
        while (true) {
            switch (fVar.S1(f144284b)) {
                case 0:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar = vh.c.f178266a;
                    dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
                    break;
                case 1:
                    numB = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 2:
                    numB2 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 3:
                    numB3 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 4:
                    numB4 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 5:
                    numB5 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 6:
                    numB6 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 7:
                    numB7 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 8:
                    numB8 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 9:
                    numB9 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 10:
                    numB10 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 11:
                    boolB = vh.c.f178277l.b(fVar, zVar);
                    break;
                case 12:
                    numB11 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 13:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD2 = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar2 = vh.c.f178266a;
                    dateTime2 = (DateTime) q6.f.m(aVarD2, fVar, zVar);
                    break;
                case 14:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD3 = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar3 = vh.c.f178266a;
                    dateTime3 = (DateTime) q6.f.m(aVarD3, fVar, zVar);
                    break;
                case 15:
                    ub2.s.f169889a.getClass();
                    vh.a aVarD4 = zVar.d(ub2.s.f169890b);
                    vh.c.g gVar4 = vh.c.f178266a;
                    dateTime4 = (DateTime) q6.f.m(aVarD4, fVar, zVar);
                    break;
                case 16:
                    list = (List) q6.f.n(new vh.j0(new vh.k0(vh.c.b(l0.f144237a, false))), fVar, zVar);
                    break;
                case 17:
                    boolB2 = vh.c.f178277l.b(fVar, zVar);
                    break;
                default:
                    return new pb2.e.k(dateTime, numB, numB2, numB3, numB4, numB5, numB6, numB7, numB8, numB9, numB10, boolB, numB11, dateTime2, dateTime3, dateTime4, list, boolB2);
            }
        }
    }
}

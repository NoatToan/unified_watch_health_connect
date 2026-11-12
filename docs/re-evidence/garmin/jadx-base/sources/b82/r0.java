package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f16754b;

    public /* synthetic */ r0(e23.p pVar, int i14) {
        this.f16753a = i14;
        this.f16754b = pVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f16753a;
        e23.p pVar = this.f16754b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                t0 t0Var = t0.f16792a;
                str.getClass();
                pVar.invoke(str, Boolean.FALSE);
                break;
            case 1:
                e2.a0 a0Var = (e2.a0) obj;
                pVar.invoke(Integer.valueOf(a0Var.getF62412a()), Integer.valueOf(a0Var.getF62413b()));
                break;
            case 2:
                b5.a0 a0Var2 = (b5.a0) obj;
                pVar.invoke(a0Var2, n4.c.a(b5.r.f(a0Var2, false)));
                a0Var2.a();
                break;
            case 3:
                b11.a aVar = (b11.a) obj;
                aVar.getClass();
                pVar.invoke(aVar, Boolean.FALSE);
                break;
            case 4:
                b11.a aVar2 = (b11.a) obj;
                aVar2.getClass();
                pVar.invoke(aVar2, Boolean.FALSE);
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                pVar.invoke(qw0.v.HAZARDS_ON_COURSE, bool);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                pVar.invoke(qw0.v.MILE_MARKERS, bool2);
                break;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                pVar.invoke(qw0.v.POPULARITY_HEATMAP, bool3);
                break;
            case 8:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                pVar.invoke(qw0.v.HIGH_TRAFFIC_ROADS, bool4);
                break;
            case 9:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                pVar.invoke(qw0.v.UNPAVED_ROADS, bool5);
                break;
            case 10:
                b5.a0 a0Var3 = (b5.a0) obj;
                pVar.invoke(a0Var3, n4.c.a(b5.r.f(a0Var3, false)));
                a0Var3.a();
                break;
            case 11:
                b5.a0 a0Var4 = (b5.a0) obj;
                pVar.invoke(a0Var4, n4.c.a(b5.r.f(a0Var4, false)));
                a0Var4.a();
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                pVar.invoke(str2, Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}

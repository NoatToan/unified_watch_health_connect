package ky0;

import java.util.List;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107447b;

    public /* synthetic */ o0(w0 w0Var, int i14) {
        this.f107446a = i14;
        this.f107447b = w0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i14 = this.f107446a;
        w0 w0Var = this.f107447b;
        switch (i14) {
            case 0:
                oy0.i iVar = (oy0.i) obj;
                iVar.getClass();
                w0Var.getClass();
                p2 p2Var = w0Var.f107590g1;
                if (p2Var.getValue() != iVar) {
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, iVar));
                }
                return Unit.INSTANCE;
            case 1:
                f.a aVar = (f.a) obj;
                aVar.getClass();
                if (aVar.f67585a == -1) {
                    w0Var.Q4();
                    w0Var.R4();
                }
                return Unit.INSTANCE;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                p2 p2Var2 = w0Var.f107594i1;
                do {
                    value2 = p2Var2.getValue();
                    ((Number) value2).intValue();
                } while (!p2Var2.b(value2, num));
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                list.getClass();
                w0Var.getClass();
                w0Var.S4();
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new q1(w0Var, list, null), 3);
                return Unit.INSTANCE;
            case 4:
                rl1.i iVar2 = (rl1.i) obj;
                p2 p2Var3 = w0Var.O0;
                while (true) {
                    Object value7 = p2Var3.getValue();
                    rl1.i iVar3 = iVar2;
                    if (p2Var3.b(value7, sy0.o.a((sy0.o) value7, false, null, iVar3, false, null, 27))) {
                        return Unit.INSTANCE;
                    }
                    iVar2 = iVar3;
                }
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p2 p2Var4 = w0Var.O0;
                do {
                    value3 = p2Var4.getValue();
                } while (!p2Var4.b(value3, sy0.o.a((sy0.o) value3, false, null, null, zBooleanValue, null, 23)));
                return Unit.INSTANCE;
            case 6:
                o82.g gVar = (o82.g) obj;
                gVar.getClass();
                w0Var.getClass();
                p2 p2Var5 = w0Var.O0;
                do {
                    value4 = p2Var5.getValue();
                } while (!p2Var5.b(value4, sy0.o.a((sy0.o) value4, false, gVar, null, false, null, 29)));
                return Unit.INSTANCE;
            case 7:
                oy0.i iVar4 = (oy0.i) obj;
                iVar4.getClass();
                w0Var.getClass();
                p2 p2Var6 = w0Var.f107590g1;
                if (p2Var6.getValue() != iVar4) {
                    do {
                        value5 = p2Var6.getValue();
                    } while (!p2Var6.b(value5, iVar4));
                }
                return Unit.INSTANCE;
            case 8:
                Integer num2 = (Integer) obj;
                num2.intValue();
                p2 p2Var7 = w0Var.f107594i1;
                do {
                    value6 = p2Var7.getValue();
                    ((Number) value6).intValue();
                } while (!p2Var7.b(value6, num2));
                return Unit.INSTANCE;
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                w0Var.getClass();
                w0Var.S4();
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new q1(w0Var, list2, null), 3);
                return Unit.INSTANCE;
            default:
                p3.i0 i0Var = (p3.i0) obj;
                i0Var.getClass();
                return new s0.l(i0Var, w0Var);
        }
    }
}

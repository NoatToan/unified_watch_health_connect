package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab0.a f26535b;

    public /* synthetic */ x2(ab0.a aVar, int i14) {
        this.f26534a = i14;
        this.f26535b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object obj2;
        z80.l lVarA;
        Object obj3;
        r53.p2 p2Var;
        z80.l lVarA2;
        Object obj4;
        z80.l lVarA3;
        Object obj5;
        z80.l lVarA4;
        switch (this.f26534a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ab0.a aVar = this.f26535b;
                aVar.getClass();
                aVar.f2513f.a(aVar.f2508a.f143493a, str);
                break;
            case 1:
                Double d14 = (Double) obj;
                d14.getClass();
                r53.p2 p2Var2 = this.f26535b.f2517j;
                do {
                    Object value = p2Var2.getValue();
                    z80.l lVar = (z80.l) value;
                    if (lVar != null) {
                        obj2 = value;
                        lVarA = z80.l.a(lVar, d14, null, null, null, null, 0L, null, null, null, null, false, null, null, 8190);
                    } else {
                        obj2 = value;
                        lVarA = null;
                    }
                } while (!p2Var2.b(obj2, lVarA));
                break;
            case 2:
                gg1.o0 o0Var = (gg1.o0) obj;
                o0Var.getClass();
                this.f26535b.A4(o0Var);
                break;
            case 3:
                String str2 = (String) obj;
                r53.p2 p2Var3 = this.f26535b.f2517j;
                while (true) {
                    Object value2 = p2Var3.getValue();
                    r53.p2 p2Var4 = p2Var3;
                    z80.l lVar2 = (z80.l) value2;
                    if (lVar2 != null) {
                        obj3 = value2;
                        p2Var = p2Var4;
                        lVarA2 = z80.l.a(lVar2, null, null, null, null, null, 0L, null, null, str2, null, false, null, null, 7935);
                    } else {
                        obj3 = value2;
                        p2Var = p2Var4;
                        lVarA2 = null;
                    }
                    if (!p2Var.b(obj3, lVarA2)) {
                        p2Var3 = p2Var;
                    }
                    break;
                }
                break;
            case 4:
                Double d15 = (Double) obj;
                d15.getClass();
                r53.p2 p2Var5 = this.f26535b.f2517j;
                do {
                    Object value3 = p2Var5.getValue();
                    z80.l lVar3 = (z80.l) value3;
                    if (lVar3 != null) {
                        obj4 = value3;
                        lVarA3 = z80.l.a(lVar3, null, d15, null, null, null, 0L, null, null, null, null, false, null, null, 8189);
                    } else {
                        obj4 = value3;
                        lVarA3 = null;
                    }
                } while (!p2Var5.b(obj4, lVarA3));
                break;
            case 5:
                gg1.o0 o0Var2 = (gg1.o0) obj;
                o0Var2.getClass();
                this.f26535b.A4(o0Var2);
                break;
            default:
                z80.k kVar = (z80.k) obj;
                kVar.getClass();
                r53.p2 p2Var6 = this.f26535b.f2517j;
                do {
                    Object value4 = p2Var6.getValue();
                    z80.l lVar4 = (z80.l) value4;
                    if (lVar4 != null) {
                        obj5 = value4;
                        lVarA4 = z80.l.a(lVar4, null, null, kVar, null, null, 0L, null, null, null, null, false, null, null, 8187);
                    } else {
                        obj5 = value4;
                        lVarA4 = null;
                    }
                } while (!p2Var6.b(obj5, lVarA4));
                break;
        }
        return Unit.INSTANCE;
    }
}

package oy0;

import b63.u;
import b82.t0;
import d53.t;
import e23.l;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.p1;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f134375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f134376c;

    public /* synthetic */ c(p1 p1Var, l lVar) {
        this.f134374a = 2;
        this.f134376c = p1Var;
        this.f134375b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f134374a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.f134375b.invoke(str);
                this.f134376c.setValue(str);
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    this.f134376c.setValue(Boolean.TRUE);
                } else {
                    this.f134375b.invoke(Boolean.FALSE);
                }
                break;
            case 2:
                Double d14 = (Double) obj;
                d14.getClass();
                p1 p1Var = this.f134376c;
                dy1.b bVar = (dy1.b) p1Var.getF182175a();
                Double dN = gl1.d.n(d14, bVar != null ? Integer.valueOf(bVar.f61532e) : null);
                dy1.b bVar2 = (dy1.b) p1Var.getF182175a();
                if (bVar2 != null) {
                    this.f134375b.invoke(dy1.b.a(bVar2, d14, 0, dN, true, 29));
                }
                break;
            case 3:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                v21.f fVar = v21.f.f175333a;
                String str2 = l0Var.f188878a.f157138b;
                fVar.getClass();
                String strM = v21.f.m(str2);
                int length = strM.length();
                this.f134376c.setValue(l0.a(l0Var, strM, og.a.l(length, length), 4));
                this.f134375b.invoke(strM);
                break;
            case 4:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "SAVE")) {
                    Integer numI = t.i(((l0) this.f134376c.getF182175a()).f188878a.f157138b);
                    this.f134375b.invoke(Integer.valueOf(numI != null ? numI.intValue() : 0));
                }
                break;
            case 5:
                Double d15 = (Double) obj;
                d15.getClass();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(d15);
                break;
            case 6:
                Double d16 = (Double) obj;
                d16.getClass();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(d16);
                break;
            case 7:
                zb0.l lVar = (zb0.l) obj;
                lVar.getClass();
                this.f134376c.setValue(Boolean.TRUE);
                this.f134375b.invoke(lVar);
                break;
            case 8:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                this.f134376c.setValue(l0Var2);
                this.f134375b.invoke(l0Var2.f188878a.f157138b);
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f134376c.setValue(Boolean.TRUE);
                this.f134375b.invoke(bool);
                break;
            case 10:
                u uVar = (u) obj;
                uVar.getClass();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(uVar);
                break;
            case 11:
                t0.a aVar = (t0.a) obj;
                aVar.getClass();
                this.f134376c.setValue(Boolean.valueOf(aVar == t0.a.ON_FOCUS));
                l lVar2 = this.f134375b;
                if (lVar2 != null) {
                    lVar2.invoke(aVar);
                }
                break;
            case 12:
                tq0.e eVar = (tq0.e) obj;
                eVar.getClass();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(eVar);
                break;
            case 13:
                t41.i iVar = (t41.i) obj;
                iVar.getClass();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(new w41.a.x(iVar));
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(new w41.a.r(iIntValue));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                this.f134376c.setValue(Boolean.FALSE);
                this.f134375b.invoke(new w41.a.q(iIntValue2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(l lVar, p1 p1Var, int i14) {
        this.f134374a = i14;
        this.f134375b = lVar;
        this.f134376c = p1Var;
    }
}

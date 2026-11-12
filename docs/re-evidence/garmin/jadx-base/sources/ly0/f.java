package ly0;

import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p3.a2;
import p3.p1;
import s5.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f115293b;

    public /* synthetic */ f(p1 p1Var, int i14) {
        this.f115292a = i14;
        this.f115293b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        switch (this.f115292a) {
            case 0:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                p1 p1Var = this.f115293b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                p1 p1Var2 = this.f115293b;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 6:
                p1 p1Var3 = this.f115293b;
                p1Var3.setValue(Boolean.valueOf(!((Boolean) p1Var3.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 7:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 12:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 14:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 17:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 19:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 20:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 22:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                q0 q0Var = (q0) this.f115293b.getF182175a();
                if (q0Var != null) {
                    z14 = q0Var.e();
                }
                return Boolean.valueOf(z14);
            case 24:
                p1 p1Var4 = this.f115293b;
                p1Var4.setValue(Boolean.valueOf(!((Boolean) p1Var4.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 25:
                this.f115293b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 26:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 27:
                this.f115293b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 28:
                return new a2((int) ((n02.f) this.f115293b.getF182175a()).f122171b);
            default:
                n02.f fVar = (n02.f) this.f115293b.getF182175a();
                double d14 = fVar.f122171b;
                return new a2(MathKt.b(fVar.a() * (d14 - ((double) ((int) d14)))));
        }
    }
}

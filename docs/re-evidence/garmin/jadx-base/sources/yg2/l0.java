package yg2;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f197078b;

    public /* synthetic */ l0(p1 p1Var, int i14) {
        this.f197077a = i14;
        this.f197078b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f197077a) {
            case 0:
                q0.c(this.f197078b, true);
                break;
            case 1:
                q0.c(this.f197078b, false);
                break;
            case 2:
                p1 p1Var = this.f197078b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                break;
            case 3:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 7:
                p1 p1Var2 = this.f197078b;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                break;
            case 8:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 9:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 10:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 11:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 12:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 15:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 16:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 18:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 22:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 23:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 24:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 25:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            case 26:
                p1 p1Var3 = this.f197078b;
                p1Var3.setValue(Boolean.valueOf(!((Boolean) p1Var3.getF182175a()).booleanValue()));
                break;
            case 27:
                this.f197078b.setValue(Boolean.TRUE);
                break;
            case 28:
                this.f197078b.setValue(Boolean.FALSE);
                break;
            default:
                this.f197078b.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}

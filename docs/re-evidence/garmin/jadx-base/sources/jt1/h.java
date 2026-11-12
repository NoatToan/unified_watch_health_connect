package jt1;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f100829b;

    public /* synthetic */ h(p1 p1Var, int i14) {
        this.f100828a = i14;
        this.f100829b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f100828a) {
            case 0:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 1:
                p1 p1Var = this.f100829b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                break;
            case 2:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 4:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 6:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 8:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 9:
                this.f100829b.setValue(null);
                break;
            case 10:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 11:
                this.f100829b.setValue(null);
                break;
            case 12:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 15:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 16:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f100829b.setValue(Boolean.TRUE);
                break;
            case 19:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 22:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 23:
                p1 p1Var2 = this.f100829b;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                break;
            case 24:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 25:
                this.f100829b.setValue(Boolean.FALSE);
                break;
            case 26:
                p1 p1Var3 = this.f100829b;
                p1Var3.setValue(Boolean.valueOf(!((Boolean) p1Var3.getF182175a()).booleanValue()));
                break;
            case 27:
                this.f100829b.setValue(mb0.g.BED_TIME);
                break;
            case 28:
                this.f100829b.setValue(mb0.g.WAKE_TIME);
                break;
            default:
                this.f100829b.setValue(mb0.g.NONE);
                break;
        }
        return Unit.INSTANCE;
    }
}

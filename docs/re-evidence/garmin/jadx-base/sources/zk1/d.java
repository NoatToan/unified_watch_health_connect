package zk1;

import p005kotlin.Unit;
import p3.p1;
import zo1.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f205095b;

    public /* synthetic */ d(p1 p1Var, int i14) {
        this.f205094a = i14;
        this.f205095b = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f205094a;
        p1 p1Var = this.f205095b;
        switch (i14) {
            case 0:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                p1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 3:
                z.a aVar = z.f206495h;
                p1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                z.a aVar2 = z.f206495h;
                p1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                p1Var.setValue(Boolean.TRUE);
                break;
            case 6:
                p1Var.setValue(Boolean.TRUE);
                break;
            case 7:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                p1Var.setValue(Boolean.TRUE);
                break;
            case 10:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 11:
                p1Var.setValue(Boolean.FALSE);
                break;
            case 12:
                p1Var.setValue(Boolean.TRUE);
                break;
            case 13:
                p1Var.setValue(Boolean.FALSE);
                break;
            default:
                p1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}

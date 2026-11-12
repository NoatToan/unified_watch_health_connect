package df;

import androidx.work.impl.WorkDatabase;
import p005kotlin.Unit;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59395a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f59397c;

    public /* synthetic */ c(String str, t0 t0Var) {
        this.f59396b = str;
        this.f59397c = t0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f59395a) {
            case 0:
                t0 t0Var = this.f59397c;
                WorkDatabase workDatabase = t0Var.f177606d;
                workDatabase.getClass();
                workDatabase.runInTransaction(new b(workDatabase, this.f59396b, t0Var, 1));
                ve.t.b(t0Var.f177605c, workDatabase, t0Var.f177608f);
                break;
            default:
                t0 t0Var2 = this.f59397c;
                WorkDatabase workDatabase2 = t0Var2.f177606d;
                workDatabase2.getClass();
                workDatabase2.runInTransaction(new b(workDatabase2, this.f59396b, t0Var2, 0));
                ve.t.b(t0Var2.f177605c, workDatabase2, t0Var2.f177608f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(t0 t0Var, String str) {
        this.f59397c = t0Var;
        this.f59396b = str;
    }
}

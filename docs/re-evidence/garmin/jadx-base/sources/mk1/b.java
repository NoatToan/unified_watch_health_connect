package mk1;

import e23.l;
import hk1.a0;
import hk1.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119143a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f119144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f119145c;

    public /* synthetic */ b(l lVar, p pVar) {
        this.f119144b = lVar;
        this.f119145c = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f119143a) {
            case 0:
                a0 a0Var = this.f119145c.f84182b;
                if (a0Var != null) {
                    this.f119144b.invoke(new lk1.f(a0Var));
                }
                break;
            default:
                this.f119144b.invoke(this.f119145c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(p pVar, l lVar) {
        this.f119145c = pVar;
        this.f119144b = lVar;
    }
}

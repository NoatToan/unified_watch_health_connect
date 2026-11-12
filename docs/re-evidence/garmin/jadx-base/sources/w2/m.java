package w2;

import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f181362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f181363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f181364d;

    public /* synthetic */ m(q0 q0Var, q0 q0Var2, n nVar, int i14) {
        this.f181361a = i14;
        this.f181362b = q0Var;
        this.f181363c = q0Var2;
        this.f181364d = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f181361a) {
            case 0:
                n nVar = this.f181364d;
                n.m(this.f181362b, this.f181363c, nVar);
                break;
            case 1:
                n.l(this.f181362b, this.f181363c, this.f181364d);
                break;
            case 2:
                n.l(this.f181362b, this.f181363c, this.f181364d);
                break;
            default:
                n nVar2 = this.f181364d;
                n.m(this.f181362b, this.f181363c, nVar2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(q0 q0Var, n nVar, q0 q0Var2, int i14) {
        this.f181361a = i14;
        this.f181362b = q0Var;
        this.f181364d = nVar;
        this.f181363c = q0Var2;
    }
}

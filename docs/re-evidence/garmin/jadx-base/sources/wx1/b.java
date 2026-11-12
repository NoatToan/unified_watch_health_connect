package wx1;

import e2.i0;
import o53.b0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f187907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f187908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f187909d;

    public /* synthetic */ b(b0 b0Var, p1 p1Var, i0 i0Var, int i14) {
        this.f187906a = i14;
        this.f187907b = b0Var;
        this.f187908c = p1Var;
        this.f187909d = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f187906a) {
            case 0:
                p1 p1Var = this.f187908c;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    ge1.b.T(this.f187907b, null, null, new g(this.f187909d, null), 3);
                }
                break;
            default:
                p1 p1Var2 = this.f187908c;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    ge1.b.T(this.f187907b, null, null, new o(this.f187909d, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

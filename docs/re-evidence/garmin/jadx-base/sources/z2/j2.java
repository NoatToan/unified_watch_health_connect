package z2;

import kotlin.q3;
import kotlin.s3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f201657b;

    public /* synthetic */ j2(h2 h2Var, int i14) {
        this.f201656a = i14;
        this.f201657b = h2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        boolean z14;
        switch (this.f201656a) {
            case 0:
                h2 h2Var = this.f201657b;
                o53.b0 b0Var = h2Var.f201612i;
                if (b0Var != null) {
                    ge1.b.T(b0Var, null, o53.d0.UNDISPATCHED, new k2.a(h2Var, null), 1);
                }
                h2Var.v();
                return Unit.INSTANCE;
            case 1:
                h2 h2Var2 = this.f201657b;
                o53.b0 b0Var2 = h2Var2.f201612i;
                if (b0Var2 != null) {
                    ge1.b.T(b0Var2, null, o53.d0.UNDISPATCHED, new k2.b(h2Var2, null), 1);
                }
                h2Var2.v();
                return Unit.INSTANCE;
            case 2:
                h2 h2Var3 = this.f201657b;
                o53.b0 b0Var3 = h2Var3.f201612i;
                if (b0Var3 != null) {
                    ge1.b.T(b0Var3, null, o53.d0.UNDISPATCHED, new k2.c(h2Var3, null), 1);
                }
                h2Var3.v();
                return Unit.INSTANCE;
            case 3:
                this.f201657b.x();
                return Unit.INSTANCE;
            case 4:
                e23.a<Unit> aVar = this.f201657b.f201610g;
                if (aVar != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                this.f201657b.l();
                return Unit.INSTANCE;
            case 6:
                this.f201657b.j(false);
                return Unit.INSTANCE;
            case 7:
                this.f201657b.w();
                return Unit.INSTANCE;
            case 8:
                this.f201657b.x();
                return Unit.INSTANCE;
            case 9:
                e23.a<Unit> aVar2 = this.f201657b.f201610g;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return Unit.INSTANCE;
            case 10:
                boolean z15 = u1.g0.f167495b;
                h2 h2Var4 = this.f201657b;
                if (z15) {
                    z14 = h2Var4.C;
                } else {
                    q3 q3Var = h2Var4.f201614k;
                    z14 = (q3Var != null ? q3Var.getF91379d() : null) == s3.Shown;
                }
                return Boolean.valueOf(!z14);
            case 11:
                this.f201657b.x();
                return Unit.INSTANCE;
            default:
                e23.a<Unit> aVar3 = this.f201657b.f201610g;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}

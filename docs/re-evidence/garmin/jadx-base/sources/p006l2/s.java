package p006l2;

import e23.a;
import z2.q1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f108755b;

    public /* synthetic */ s(q1 q1Var, int i14) {
        this.f108754a = i14;
        this.f108755b = q1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        long jE;
        switch (this.f108754a) {
            case 0:
                jE = this.f108755b.e();
                break;
            default:
                jE = this.f108755b.e();
                break;
        }
        return Long.valueOf(jE);
    }
}

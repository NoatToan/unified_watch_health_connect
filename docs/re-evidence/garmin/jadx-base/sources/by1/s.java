package by1;

import androidx.lifecycle.v1;
import nx1.c0;
import o53.s0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22209b;

    public /* synthetic */ s(ey1.a aVar, int i14) {
        this.f22208a = i14;
        this.f22209b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        int i14 = this.f22208a;
        ey1.a aVar = this.f22209b;
        switch (i14) {
            case 0:
                v vVar = v.f22216a;
                c0 c0Var = aVar.f67281m;
                p2 p2Var = c0Var.f128210d;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, (i53.c) c0Var.f128209c.getValue()));
                break;
            case 1:
                v vVar2 = v.f22216a;
                c0 c0Var2 = aVar.f67281m;
                p2 p2Var2 = c0Var2.f128209c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, (i53.c) c0Var2.f128210d.getValue()));
                break;
            default:
                x xVar = x.f22221a;
                if (!aVar.f67272d) {
                    w9.a aVarA = v1.a(aVar);
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new ey1.e(aVar, null), 2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

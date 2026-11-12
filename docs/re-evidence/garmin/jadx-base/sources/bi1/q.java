package bi1;

import androidx.lifecycle.t1;
import androidx.lifecycle.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18063b;

    public /* synthetic */ q(r rVar, int i14) {
        this.f18062a = i14;
        this.f18063b = rVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        v vVar = (v) obj;
        switch (this.f18062a) {
            case 0:
                y0<a> y0Var = this.f18063b.f18065b.get(vVar);
                if (y0Var != null) {
                    return t1.a(y0Var, new b71.o(17));
                }
                return null;
            default:
                return this.f18063b.f18065b.get(vVar);
        }
    }
}

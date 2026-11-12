package kotlin;

import e23.l;
import h5.h2;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import q3.c;
import x5.x;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx5/x;", "closedConnection", "", "invoke", "(Lx5/x;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class i2 extends w implements l<x, p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f91207a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var) {
        super(1);
        this.f91207a = j2Var;
    }

    @Override // e23.l
    public final p005kotlin.Unit invoke(x xVar) {
        x xVar2 = xVar;
        xVar2.a();
        j2 j2Var = this.f91207a;
        c<h2<x>> cVar = j2Var.f91232d;
        c<h2<x>> cVar2 = j2Var.f91232d;
        h2<x>[] h2VarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                i15 = -1;
                break;
            }
            if (s.g(h2VarArr[i15], xVar2)) {
                break;
            }
            i15++;
        }
        if (i15 >= 0) {
            cVar2.k(i15);
        }
        if (cVar2.f142358c == 0) {
            j2Var.f91230b.invoke();
        }
        return p005kotlin.Unit.INSTANCE;
    }
}

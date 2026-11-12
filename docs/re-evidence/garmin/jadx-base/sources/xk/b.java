package xk;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class b extends kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f191187a;

    public b(a aVar) {
        this.f191187a = aVar;
    }

    @Override // kk.a
    public final void a(dk.a aVar) {
        int iE = ik.a.e(2, aVar.f60156b);
        int iE2 = ik.a.e(5, aVar.f60156b);
        a aVar2 = this.f191187a;
        if (aVar2.f191183a == null) {
            aVar2.f191183a = new mk.a(255);
        }
        mk.a aVar3 = aVar2.f191183a;
        aVar3.f119095c = iE;
        aVar3.f119093a = iE & 255;
        aVar3.f119094b = true;
        if (iE2 != 0) {
            if (aVar2.f191184b == null) {
                aVar2.f191184b = new mk.a(255);
            }
            mk.a aVar4 = aVar2.f191184b;
            aVar4.f119095c = iE2;
            aVar4.f119093a = iE2 & 255;
            aVar4.f119094b = true;
        }
    }

    @Override // kk.a
    public final List<Integer> b() {
        return Arrays.asList(16);
    }
}

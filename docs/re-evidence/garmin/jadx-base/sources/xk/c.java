package xk;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class c extends kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f191188a;

    public c(a aVar) {
        this.f191188a = aVar;
    }

    @Override // kk.a
    public final void a(dk.a aVar) {
        int iD = ik.a.d(2, aVar.f60156b);
        int iD2 = ik.a.d(4, aVar.f60156b);
        a aVar2 = this.f191188a;
        if (iD != 0) {
            if (aVar2.f191185c == null) {
                aVar2.f191185c = new mk.a(255);
            }
            mk.a aVar3 = aVar2.f191185c;
            aVar3.f119095c = iD;
            aVar3.f119093a = iD & 255;
            aVar3.f119094b = true;
        }
        if (iD2 == 0) {
            aVar2.getClass();
            return;
        }
        if (aVar2.f191186d == null) {
            aVar2.f191186d = new mk.a(255);
        }
        mk.a aVar4 = aVar2.f191186d;
        aVar4.f119095c = iD2;
        aVar4.f119093a = iD2 & 255;
        aVar4.f119094b = true;
    }

    @Override // kk.a
    public final List<Integer> b() {
        return Arrays.asList(17);
    }
}

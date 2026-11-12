package defpackage;

import com.huawei.health.hwhealthtrackalgo.i;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class flb extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<fku> f34159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<fku> f34160c;
    private fla e;

    @Override // com.huawei.health.hwhealthtrackalgo.a
    public final int a(fku fkuVar) {
        flb flbVar = this;
        if (flbVar.f34160c.size() < flbVar.e.g()) {
            return 0;
        }
        LinkedList<fku> linkedList = flbVar.f34160c;
        LinkedList<fku> linkedList2 = flbVar.f34159b;
        int size = linkedList.size();
        if (size >= 3) {
            if (linkedList2.size() == 0 && 2 < linkedList.size()) {
                fku fkuVar2 = linkedList.get(0);
                fku fkuVar3 = linkedList.get(1);
                fku fkuVar4 = linkedList.get(2);
                double[] dArr = {fkuVar2.f(), fkuVar3.f(), fkuVar4.f()};
                double[] dArr2 = {fkuVar2.i(), fkuVar3.i(), fkuVar4.i()};
                fku fkuVar5 = new fku(fkuVar2);
                fkuVar5.e(d(dArr));
                fkuVar5.c(d(dArr2));
                linkedList2.add(fkuVar5);
                fkuVar2.b(true);
            }
            int i = 0;
            while (i < size - 1) {
                fku fkuVar6 = linkedList.get(i);
                if (!fkuVar6.h()) {
                    if (i == 0) {
                        linkedList2.add(fkuVar6);
                        fkuVar6.b(true);
                    } else {
                        fku fkuVar7 = linkedList.get(i - 1);
                        fku fkuVar8 = linkedList.get(i);
                        fku fkuVar9 = linkedList.get(i + 1);
                        if (fkuVar9.g() - fkuVar8.g() > flbVar.e.i() || fkuVar8.g() - fkuVar7.g() > flbVar.e.i()) {
                            fkuVar6.b(true);
                            fkuVar9.b(true);
                            linkedList2.add(fkuVar9);
                        } else {
                            double[] dArr3 = {fkuVar7.f(), fkuVar8.f(), fkuVar9.f()};
                            double[] dArr4 = {fkuVar7.i(), fkuVar8.i(), fkuVar9.i()};
                            fku fkuVar10 = new fku(fkuVar6);
                            fkuVar10.e(e(dArr3));
                            fkuVar10.c(e(dArr4));
                            linkedList2.add(fkuVar10);
                            fkuVar6.b(true);
                        }
                    }
                }
                i++;
                flbVar = this;
            }
        }
        return 0;
    }

    private static double e(double[] dArr) {
        return ((dArr[0] + dArr[1]) + dArr[2]) / 3.0d;
    }

    private static double d(double[] dArr) {
        return (((dArr[0] * 5.0d) + (dArr[1] * 2.0d)) + (dArr[2] * (-1.0d))) / 6.0d;
    }

    public flb(fkw fkwVar) {
        super(fkwVar);
        this.e = this.f7136a.i();
        this.f34160c = this.f7136a.b();
        this.f34159b = this.f7136a.a();
    }
}

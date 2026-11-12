package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class vak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cya f36670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<dya> f36671b;

    public vak(cya cyaVar) {
        this.f36670a = cyaVar;
        ArrayList arrayList = new ArrayList();
        this.f36671b = arrayList;
        arrayList.add(new dya(cyaVar, new int[]{1}));
    }

    public final dya a(int i) {
        if (i >= this.f36671b.size()) {
            List<dya> list = this.f36671b;
            dya dyaVarI = list.get(list.size() - 1);
            for (int size = this.f36671b.size(); size <= i; size++) {
                cya cyaVar = this.f36670a;
                dyaVarI = dyaVarI.i(new dya(cyaVar, new int[]{1, cyaVar.c((size - 1) + cyaVar.d())}));
                this.f36671b.add(dyaVarI);
            }
        }
        return this.f36671b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        dya dyaVarA = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new dya(this.f36670a, iArr2).j(i, 1).b(dyaVarA)[1].e();
        int length2 = i - iArrE.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }
}

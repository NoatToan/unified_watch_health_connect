package org.bouncycastle.pqc.crypto.xmss;

import defpackage.bsr;
import defpackage.fsr;
import defpackage.rcd;
import defpackage.wrr;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class BDSStateMap implements Serializable {
    private final Map<Integer, BDS> bdsState = new TreeMap();

    public BDSStateMap() {
    }

    private void updateState(wrr wrrVar, long j, byte[] bArr, byte[] bArr2) {
        bsr bsrVarG = wrrVar.g();
        int iD = bsrVarG.d();
        long j2 = fsr.j(j, iD);
        int i = fsr.i(j, iD);
        d dVar = (d) new d.b().h(j2).p(i).l();
        int i2 = (1 << iD) - 1;
        if (i < i2) {
            if (get(0) == null || i == 0) {
                put(0, new BDS(bsrVarG, bArr, bArr2, dVar));
            }
            update(0, bArr, bArr2, dVar);
        }
        for (int i3 = 1; i3 < wrrVar.d(); i3++) {
            int i4 = fsr.i(j2, iD);
            j2 = fsr.j(j2, iD);
            d dVar2 = (d) new d.b().g(i3).h(j2).p(i4).l();
            if (i4 < i2 && fsr.m(j, iD, i3)) {
                if (get(i3) == null) {
                    put(i3, new BDS(wrrVar.g(), bArr, bArr2, dVar2));
                }
                update(i3, bArr, bArr2, dVar2);
            }
        }
    }

    public BDS get(int i) {
        return this.bdsState.get(rcd.b(i));
    }

    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }

    public void put(int i, BDS bds) {
        this.bdsState.put(rcd.b(i), bds);
    }

    public void setXMSS(bsr bsrVar) {
        Iterator<Integer> it = this.bdsState.keySet().iterator();
        while (it.hasNext()) {
            BDS bds = this.bdsState.get(it.next());
            bds.setXMSS(bsrVar);
            bds.validate();
        }
    }

    public BDS update(int i, byte[] bArr, byte[] bArr2, d dVar) {
        return this.bdsState.put(rcd.b(i), this.bdsState.get(rcd.b(i)).getNextState(bArr, bArr2, dVar));
    }

    public BDSStateMap(wrr wrrVar, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            updateState(wrrVar, j2, bArr, bArr2);
        }
    }

    public BDSStateMap(BDSStateMap bDSStateMap, wrr wrrVar, long j, byte[] bArr, byte[] bArr2) {
        for (Integer num : bDSStateMap.bdsState.keySet()) {
            this.bdsState.put(num, bDSStateMap.bdsState.get(num));
        }
        updateState(wrrVar, j, bArr, bArr2);
    }
}

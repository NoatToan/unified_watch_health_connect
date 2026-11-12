package com.google.android.gms.internal.fitness;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class z1 implements Comparator<zzfx> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzfx zzfxVar, zzfx zzfxVar2) {
        zzfx zzfxVar3 = zzfxVar;
        zzfx zzfxVar4 = zzfxVar2;
        zzgc zzgcVar = (zzgc) zzfxVar3.iterator();
        zzgc zzgcVar2 = (zzgc) zzfxVar4.iterator();
        while (zzgcVar.hasNext() && zzgcVar2.hasNext()) {
            int iCompare = Integer.compare(zzfx.a(zzgcVar.nextByte()), zzfx.a(zzgcVar2.nextByte()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzfxVar3.size(), zzfxVar4.size());
    }
}

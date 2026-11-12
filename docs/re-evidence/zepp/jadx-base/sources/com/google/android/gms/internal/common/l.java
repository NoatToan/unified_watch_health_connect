package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes3.dex */
final class l extends o {
    public final /* synthetic */ m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.h = mVar;
    }

    @Override // com.google.android.gms.internal.common.o
    public final int c(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.common.o
    public final int d(int i) {
        zzo zzoVar = this.h.a;
        CharSequence charSequence = this.c;
        int length = charSequence.length();
        zzs.zzb(i, length, "index");
        while (i < length) {
            if (zzoVar.zza(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

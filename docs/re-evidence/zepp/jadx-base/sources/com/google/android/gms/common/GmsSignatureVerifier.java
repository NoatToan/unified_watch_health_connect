package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {
    private static final q a;
    private static final q b;

    static {
        p pVar = new p();
        pVar.d("com.google.android.gms");
        pVar.a(204200000L);
        j jVar = l.d;
        pVar.c(zzag.zzn(jVar.e(), l.b.e()));
        j jVar2 = l.c;
        pVar.b(zzag.zzn(jVar2.e(), l.a.e()));
        a = pVar.e();
        p pVar2 = new p();
        pVar2.d("com.android.vending");
        pVar2.a(82240000L);
        pVar2.c(zzag.zzm(jVar.e()));
        pVar2.b(zzag.zzm(jVar2.e()));
        b = pVar2.e();
    }
}

package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes3.dex */
final class e extends AccountTransferClient.a<byte[]> {
    private final /* synthetic */ d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, AccountTransferClient.b bVar) {
        super(bVar);
        this.c = dVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(byte[] bArr) {
        this.c.a(bArr);
    }
}

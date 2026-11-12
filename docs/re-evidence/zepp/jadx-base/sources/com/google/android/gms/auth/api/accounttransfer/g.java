package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes3.dex */
final class g extends AccountTransferClient.a<DeviceMetaData> {
    private final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, AccountTransferClient.b bVar) {
        super(bVar);
        this.c = fVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(DeviceMetaData deviceMetaData) {
        this.c.a(deviceMetaData);
    }
}

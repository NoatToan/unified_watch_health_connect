package com.garmin.device.nfc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/device/nfc/c;", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements g.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.a<Boolean> f50860a;

    public c(cs2.a<Boolean> aVar) {
        this.f50860a = aVar;
    }

    @Override // com.garmin.device.nfc.g.e
    public final void a(i iVar) {
        NfcCommandHandler.f50799g.debug("Received DELETE_OWNER_DATA");
        this.f50860a.accept(Boolean.valueOf(j.b(iVar, NfcCommandHandler.e.DELETE_OWNER_DATA)));
    }

    @Override // com.garmin.device.nfc.g.f
    public final void b(int i14) {
        NfcCommandHandler.f50799g.debug("No response for DELETE_OWNER_DATA");
        this.f50860a.accept(Boolean.FALSE);
    }
}

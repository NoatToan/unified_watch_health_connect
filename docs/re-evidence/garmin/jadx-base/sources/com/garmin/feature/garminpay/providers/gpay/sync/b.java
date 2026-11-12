package com.garmin.feature.garminpay.providers.gpay.sync;

import aq2.h;
import o13.q;
import o53.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/sync/b;", "Lul2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements ul2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewDeviceSyncQueue f51358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j<xo2.b> f51359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xo2.a f51360c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(NewDeviceSyncQueue newDeviceSyncQueue, j<? super xo2.b> jVar, xo2.a aVar) {
        this.f51358a = newDeviceSyncQueue;
        this.f51359b = jVar;
        this.f51360c = aVar;
    }

    @Override // ul2.b
    public final void a(ul2.a aVar, byte[] bArr) {
        aVar.getClass();
        j<xo2.b> jVar = this.f51359b;
        xo2.a aVar2 = this.f51360c;
        NewDeviceSyncQueue newDeviceSyncQueue = this.f51358a;
        if (bArr == null) {
            newDeviceSyncQueue.f51331e.error("executeApduCommand: received null response from the device");
            NewDeviceSyncQueue.ApduPackageException apduPackageException = new NewDeviceSyncQueue.ApduPackageException(fb1.c.n("received null Response from the device for command ", aVar2.getCommandId()), xo2.d.b.RECEIVED_NULL_RESPONSE_FROM_DEVICE);
            int i14 = q.f128596b;
            jVar.resumeWith(new q.b(apduPackageException));
            return;
        }
        String strA = h.a(bArr);
        String strSubstring = strA.length() >= 4 ? strA.substring(strA.length() - 4) : strA;
        xo2.b bVar = new xo2.b(aVar2.getCommandId(), strSubstring, strA, aVar2.getContinueOnFailure());
        if ("9000".equals(strSubstring) || "6310".equals(strSubstring)) {
            newDeviceSyncQueue.f51331e.debug("onCommandResponse: " + bVar);
        } else {
            newDeviceSyncQueue.f51331e.error("onCommandResponse: " + bVar);
        }
        int i15 = q.f128596b;
        jVar.resumeWith(bVar);
    }
}

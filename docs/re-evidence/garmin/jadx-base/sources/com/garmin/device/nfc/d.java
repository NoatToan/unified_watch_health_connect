package com.garmin.device.nfc;

import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/device/nfc/d;", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements g.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl2.j f50861a;

    public d(pl2.j jVar) {
        this.f50861a = jVar;
    }

    @Override // com.garmin.device.nfc.g.e
    public final void a(i iVar) {
        NfcCommandHandler.f50799g.debug("Received READ_OWNER_DATA");
        Parcelable.Creator<e> creator = e.CREATOR;
        byte[] bArrD = iVar.d();
        e eVar = null;
        if (bArrD != null && bArrD.length != 1 && bArrD.length >= 6) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrD);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferWrap.order(byteOrder);
            int i14 = byteBufferWrap.getInt(2);
            if (bArrD[1] == h.c.TAG_USER_ID.f50906a && 6 + i14 <= bArrD.length && i14 == 8) {
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrD);
                byteBufferWrap2.order(byteOrder);
                long j8 = byteBufferWrap2.getLong(6);
                int i15 = 6 + i14;
                int i16 = i14 + 11;
                if (bArrD.length >= i16) {
                    ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArrD);
                    byteBufferWrap3.order(byteOrder);
                    int i17 = byteBufferWrap3.getInt(i14 + 7);
                    if (bArrD[i15] == h.c.TAG_SERVER_ENVIRONMENT.f50906a && i14 + 11 + i17 <= bArrD.length) {
                        byte[] bArr = new byte[i17];
                        System.arraycopy(bArrD, i16, bArr, 0, i17);
                        e eVar2 = new e(j8, new String(bArr));
                        if (bArrD.length == i16 + i17) {
                            eVar = eVar2;
                        }
                    }
                }
            }
        }
        this.f50861a.a(eVar);
    }

    @Override // com.garmin.device.nfc.g.f
    public final void b(int i14) {
        z.i("No response for READ_OWNER_DATA ", i14, NfcCommandHandler.f50799g);
        this.f50861a.b();
    }
}

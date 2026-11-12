package sk;

/* JADX INFO: loaded from: classes7.dex */
public class e {
    public static dk.a a(ak.e eVar) {
        return new dk.a(64, new byte[]{(byte) 8, 1, (byte) eVar.f3527a});
    }

    public static dk.a b(bk.l lVar, int i14, byte[] bArr) {
        if (lVar != bk.l.ACKNOWLEDGED_DATA && lVar != bk.l.BROADCAST_DATA && lVar != bk.l.BURST_TRANSFER_DATA) {
            vb.h.s("Invalid message type. Data messages only.");
            return null;
        }
        byte[] bArr2 = new byte[9];
        bArr2[0] = (byte) i14;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return new dk.a(lVar.b(), bArr2);
    }
}

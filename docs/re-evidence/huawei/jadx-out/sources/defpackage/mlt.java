package defpackage;

import health.compact.a.util.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class mlt {
    public static byte[] a(byte[] bArr, mlq mlqVar) {
        byte[] bArrI = mlqVar.i();
        if (bArrI == null || bArrI.length == 0) {
            LogUtil.d("BtProxyCommandUtil", "responseData is null");
            return bArr;
        }
        byte[] bArrJ = eeq.j(9);
        byte[] bArrA = eeq.a(bArrI.length);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + bArrJ.length + bArrA.length + bArrI.length);
        byteBufferAllocate.put(bArr).put(bArrJ).put(bArrA).put(bArrI);
        return byteBufferAllocate.array();
    }
}

package ij;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import ui.h;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class d implements e<hj.c, byte[]> {
    @Override // ij.e
    public final u<byte[]> a(u<hj.c> uVar, h hVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = uVar.get().f83923a.f83933a.f83935a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = qj.a.f144956a;
        qj.a.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new qj.a.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.f144959a == 0 && bVar.f144960b == bVar.f144961c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new ej.b(bArrArray);
    }
}

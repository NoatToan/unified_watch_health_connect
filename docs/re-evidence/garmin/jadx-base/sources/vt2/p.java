package vt2;

import java.nio.ByteBuffer;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f180209a;

    public p(Object obj) {
        this();
        n<?> nVarB = n.b(obj, true);
        o oVar = this.f180209a;
        oVar.f180208b.add(nVarB);
        oVar.a(nVarB);
    }

    public static a a(byte[] bArr) {
        return new o(bArr).f180208b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> byte[] b(T t7) {
        n nVar;
        o oVar = new p(t7).f180209a;
        q qVar = oVar.f180207a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(qVar.f180210a);
        for (int i14 = 0; i14 < qVar.size(); i14++) {
            m mVar = qVar.get(i14);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(mVar.f180205c.getBytes("UTF-8").length + 3);
            byteBufferAllocate2.putShort((short) (mVar.f180205c.getBytes("UTF-8").length + 1));
            byteBufferAllocate2.put(mVar.f180205c.getBytes("UTF-8"));
            byteBufferAllocate2.put((byte) 0);
            byteBufferAllocate.put(byteBufferAllocate2.array());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        a aVar = oVar.f180208b;
        LinkedList<n<?>> linkedList = aVar.f180190b;
        linkedList.clear();
        linkedList.addAll(aVar);
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(aVar.f180189a);
        do {
            nVar = (n) linkedList.poll();
            if (nVar != 0) {
                byteBufferAllocate3.put(nVar.d());
                if (nVar instanceof f) {
                    linkedList.addAll(((f) nVar).a());
                }
            }
        } while (nVar != 0);
        byte[] bArrArray2 = byteBufferAllocate3.array();
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bArrArray.length > 0 ? bArrArray.length + 16 + bArrArray2.length : bArrArray2.length + 8);
        if (bArrArray.length > 0) {
            byteBufferAllocate4.putInt(-1412584499);
            byteBufferAllocate4.putInt(bArrArray.length);
            byteBufferAllocate4.put(bArrArray);
        }
        byteBufferAllocate4.putInt(-629482886);
        byteBufferAllocate4.putInt(bArrArray2.length);
        byteBufferAllocate4.put(bArrArray2);
        return byteBufferAllocate4.array();
    }

    public p() {
        this.f180209a = new o();
    }
}

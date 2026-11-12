package vt2;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f180207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f180208b;

    public o(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int i14 = 0;
        int i15 = byteBufferWrap.getInt() == -1412584499 ? byteBufferWrap.getInt() : 0;
        if (i15 > 0) {
            i14 = 8 + i15;
            if (i14 > bArr.length) {
                throw new BufferUnderflowException();
            }
            this.f180207a = new q(Arrays.copyOfRange(bArr, 8, i14));
        }
        int i16 = i14 + 8;
        if (i16 > bArr.length) {
            throw new BufferUnderflowException();
        }
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i14, 8);
        byteBufferWrap2.getInt();
        int i17 = byteBufferWrap2.getInt() + i16;
        if (i17 > bArr.length) {
            throw new BufferUnderflowException();
        }
        this.f180208b = new a(Arrays.copyOfRange(bArr, i16, i17), this.f180207a);
    }

    public final void a(n<?> nVar) {
        q qVar;
        if (!(nVar instanceof m)) {
            if (nVar instanceof b) {
                Iterator it = ((b) nVar).f180193b.iterator();
                while (it.hasNext()) {
                    a((n) it.next());
                }
                return;
            } else {
                if (nVar instanceof i) {
                    for (Map.Entry<n<?>, n<?>> entry : ((i) nVar).f180200b.entrySet()) {
                        a(entry.getKey());
                        a(entry.getValue());
                    }
                    return;
                }
                return;
            }
        }
        m mVar = (m) nVar;
        int i14 = 0;
        int length = 0;
        while (true) {
            qVar = this.f180207a;
            if (i14 >= qVar.size() || qVar.get(i14).equals(mVar)) {
                break;
            }
            length += qVar.get(i14).f180205c.getBytes("UTF-8").length + 3;
            i14++;
        }
        mVar.f180204b = length;
        if (!qVar.contains(mVar)) {
            qVar.add(mVar);
            qVar.f180210a = mVar.f180205c.getBytes("UTF-8").length + 3 + qVar.f180210a;
        }
        mVar.f180204b = length;
    }

    public o() {
        this.f180207a = new q();
        this.f180208b = new a();
    }
}

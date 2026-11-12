package vt2;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d extends n<List<Byte>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f180196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(byte[] bArr) {
        super(bArr[0]);
        int i14 = 0;
        this.f180196b = new ArrayList();
        int i15 = ByteBuffer.wrap(bArr, 1, 4).getInt();
        for (int i16 = 5; i16 < bArr.length && i14 < i15; i16++) {
            this.f180196b.add(Byte.valueOf(bArr[i16]));
            i14++;
        }
    }

    @Override // vt2.n
    public final int c() {
        return this.f180196b.size() + 5;
    }

    @Override // vt2.n
    public final byte[] d() {
        ArrayList arrayList = this.f180196b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayList.size() + 5);
        byteBufferAllocate.put(Ascii.DC4);
        byteBufferAllocate.putInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(((Byte) it.next()).byteValue());
        }
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final List<Byte> e() {
        return this.f180196b;
    }

    public d(List<Byte> list) {
        super(Ascii.DC4);
        this.f180196b = new ArrayList();
        Iterator<Byte> it = list.iterator();
        while (it.hasNext()) {
            this.f180196b.add(it.next());
        }
    }
}

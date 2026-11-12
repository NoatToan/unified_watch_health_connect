package vt2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b extends n<List<n<?>>> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f180193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180194c;

    public <T> b(List<T> list, boolean z14) {
        super((byte) 5);
        this.f180193b = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f180193b.add(n.b(it.next(), z14));
        }
    }

    @Override // vt2.f
    public final List<n<?>> a() {
        return this.f180193b;
    }

    @Override // vt2.n
    public final int c() {
        Iterator it = this.f180193b.iterator();
        int iC = 5;
        while (it.hasNext()) {
            iC += ((n) it.next()).c();
        }
        return iC;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.putInt(this.f180193b.size());
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final List<n<?>> e() {
        return this.f180193b;
    }

    public <T> b(List<T> list) {
        this(list, true);
    }

    public b(byte[] bArr) {
        super(bArr[0]);
        this.f180193b = new ArrayList();
        this.f180194c = ByteBuffer.wrap(bArr, 1, 4).getInt();
    }
}

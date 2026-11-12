package vt2;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class i extends n<HashMap<n<?>, n<?>>> implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<n<?>, n<?>> f180200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180201c;

    public i(Map<Object, Object> map, boolean z14) {
        super(Ascii.VT);
        this.f180200b = new HashMap<>();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f180200b.put(n.b(key, z14), n.b(value, z14));
        }
    }

    @Override // vt2.f
    public final List<n<?>> a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<n<?>, n<?>> entry : this.f180200b.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }

    @Override // vt2.n
    public final int c() {
        int iC = 5;
        for (Map.Entry<n<?>, n<?>> entry : this.f180200b.entrySet()) {
            iC += entry.getValue().c() + entry.getKey().c();
        }
        return iC;
    }

    @Override // vt2.n
    public final byte[] d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put(Ascii.VT);
        byteBufferAllocate.putInt(this.f180200b.size());
        return byteBufferAllocate.array();
    }

    @Override // vt2.n
    public final HashMap<n<?>, n<?>> e() {
        return this.f180200b;
    }

    public i(Map<Object, Object> map) {
        this(map, true);
    }

    public i(byte[] bArr) {
        super(bArr[0]);
        this.f180200b = new HashMap<>();
        this.f180201c = ByteBuffer.wrap(bArr, 1, 4).getInt();
    }
}

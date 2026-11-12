package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.memory.b;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class opf implements n3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3i f29364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f29365b;

    public opf(b bVar, q3i q3iVar) {
        this.f29365b = bVar;
        this.f29364a = q3iVar;
    }

    public npf f(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) throws IOException {
        this.f29364a.a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.a();
    }

    @Override // defpackage.n3i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public npf a(InputStream inputStream) throws Throwable {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f29365b);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // defpackage.n3i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public npf e(InputStream inputStream, int i) throws Throwable {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f29365b, i);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // defpackage.n3i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public npf c(byte[] bArr) throws Throwable {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f29365b, bArr.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
                npf npfVarA = memoryPooledByteBufferOutputStream.a();
                memoryPooledByteBufferOutputStream.close();
                return npfVarA;
            } catch (IOException e) {
                throw wdp.a(e);
            }
        } catch (Throwable th) {
            memoryPooledByteBufferOutputStream.close();
            throw th;
        }
    }

    @Override // defpackage.n3i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream b() {
        return new MemoryPooledByteBufferOutputStream(this.f29365b);
    }

    @Override // defpackage.n3i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public MemoryPooledByteBufferOutputStream d(int i) {
        return new MemoryPooledByteBufferOutputStream(this.f29365b, i);
    }
}

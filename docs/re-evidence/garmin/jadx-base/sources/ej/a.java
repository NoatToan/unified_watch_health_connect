package ej;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class a implements e<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f64395a;

    /* JADX INFO: renamed from: ej.a$a, reason: collision with other inner class name */
    public static class C1363a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f64395a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.f64395a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class e73 implements com.bumptech.glide.load.data.a<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f16340a;

    public static class a implements com.bumptech.glide.load.data.a.InterfaceC0136a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0136a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new e73(byteBuffer);
        }
    }

    public e73(ByteBuffer byteBuffer) {
        this.f16340a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f16340a.position(0);
        return this.f16340a;
    }
}

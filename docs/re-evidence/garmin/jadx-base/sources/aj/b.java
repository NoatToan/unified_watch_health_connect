package aj;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class b<Data> implements o<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0059b<Data> f3325a;

    public static class a implements p<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: aj.b$a$a, reason: collision with other inner class name */
        public class C0058a implements InterfaceC0059b<ByteBuffer> {
            public C0058a(a aVar) {
            }

            @Override // aj.b.InterfaceC0059b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // aj.b.InterfaceC0059b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // aj.p
        public final o<byte[], ByteBuffer> d(s sVar) {
            return new b(new C0058a(this));
        }
    }

    /* JADX INFO: renamed from: aj.b$b, reason: collision with other inner class name */
    public interface InterfaceC0059b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f3326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0059b<Data> f3327b;

        public c(byte[] bArr, InterfaceC0059b<Data> interfaceC0059b) {
            this.f3326a = bArr;
            this.f3327b = interfaceC0059b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f3327b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final ui.a b() {
            return ui.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            aVar.c(this.f3327b.b(this.f3326a));
        }
    }

    public static class d implements p<byte[], InputStream> {

        public class a implements InterfaceC0059b<InputStream> {
            public a(d dVar) {
            }

            @Override // aj.b.InterfaceC0059b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // aj.b.InterfaceC0059b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // aj.p
        public final o<byte[], InputStream> d(s sVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0059b<Data> interfaceC0059b) {
        this.f3325a = interfaceC0059b;
    }

    @Override // aj.o
    public final o.a a(byte[] bArr, int i14, int i15, ui.h hVar) {
        byte[] bArr2 = bArr;
        return new o.a(new pj.d(bArr2), new c(bArr2, this.f3325a));
    }

    @Override // aj.o
    public final /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }
}

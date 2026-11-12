package defpackage;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class u63<Data> implements d7g<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<Data> f35443a;

    public static class a implements e7g<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: u63$a$a, reason: collision with other inner class name */
        public class C1116a implements b<ByteBuffer> {
            public C1116a() {
            }

            @Override // u63.b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // u63.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<byte[], ByteBuffer> d(iag iagVar) {
            return new u63(new C1116a());
        }
    }

    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements jl5<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f35445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<Data> f35446b;

        public c(byte[] bArr, b<Data> bVar) {
            this.f35445a = bArr;
            this.f35446b = bVar;
        }

        @Override // defpackage.jl5
        public Class<Data> a() {
            return this.f35446b.a();
        }

        @Override // defpackage.jl5
        public void b() {
        }

        @Override // defpackage.jl5
        public void c(Priority priority, jl5.a<? super Data> aVar) {
            aVar.e(this.f35446b.b(this.f35445a));
        }

        @Override // defpackage.jl5
        public void cancel() {
        }

        @Override // defpackage.jl5
        public DataSource d() {
            return DataSource.LOCAL;
        }
    }

    public static class d implements e7g<byte[], InputStream> {

        public class a implements b<InputStream> {
            public a() {
            }

            @Override // u63.b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // u63.b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<byte[], InputStream> d(iag iagVar) {
            return new u63(new a());
        }
    }

    public u63(b<Data> bVar) {
        this.f35443a = bVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(byte[] bArr, int i, int i2, cch cchVar) {
        return new d7g.a<>(new b4h(bArr), new c(bArr, this.f35443a));
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }
}

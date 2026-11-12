package z33;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements n {

    /* JADX INFO: renamed from: z33.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC3766a<BuilderType extends AbstractC3766a> implements n.a {
        @Override // 
        public abstract BuilderType b();

        @Override // z33.n.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType b1(d dVar, e eVar);

        /* JADX INFO: renamed from: z33.a$a$a, reason: collision with other inner class name */
        public static final class C3767a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f202160a;

            public C3767a(InputStream inputStream, int i14) {
                super(inputStream);
                this.f202160a = i14;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f202160a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i14, int i15) throws IOException {
                int i16 = this.f202160a;
                if (i16 <= 0) {
                    return -1;
                }
                int i17 = super.read(bArr, i14, Math.min(i15, i16));
                if (i17 >= 0) {
                    this.f202160a -= i17;
                }
                return i17;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j8) throws IOException {
                long jSkip = super.skip(Math.min(j8, this.f202160a));
                if (jSkip >= 0) {
                    this.f202160a = (int) (((long) this.f202160a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f202160a <= 0) {
                    return -1;
                }
                int i14 = super.read();
                if (i14 >= 0) {
                    this.f202160a--;
                }
                return i14;
            }
        }
    }
}

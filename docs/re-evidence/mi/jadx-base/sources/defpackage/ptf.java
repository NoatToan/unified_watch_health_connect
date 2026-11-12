package defpackage;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ptf {

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f30748a;

        public a(ByteBuffer byteBuffer) {
            this.f30748a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // ptf.c
        public void a(int i) throws IOException {
            ByteBuffer byteBuffer = this.f30748a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // ptf.c
        public int b() throws IOException {
            return this.f30748a.getInt();
        }

        @Override // ptf.c
        public long c() throws IOException {
            return ptf.c(this.f30748a.getInt());
        }

        @Override // ptf.c
        public long getPosition() {
            return this.f30748a.position();
        }

        @Override // ptf.c
        public int readUnsignedShort() throws IOException {
            return ptf.d(this.f30748a.getShort());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f30749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f30750b;

        public b(long j, long j2) {
            this.f30749a = j;
            this.f30750b = j2;
        }

        public long a() {
            return this.f30749a;
        }
    }

    public interface c {
        void a(int i) throws IOException;

        int b() throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    public static b a(c cVar) throws IOException {
        long jC;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jC = -1;
                break;
            }
            int iB = cVar.b();
            cVar.a(4);
            jC = cVar.c();
            cVar.a(4);
            if (1835365473 == iB) {
                break;
            }
            i++;
        }
        if (jC != -1) {
            cVar.a((int) (jC - cVar.getPosition()));
            cVar.a(12);
            long jC2 = cVar.c();
            for (int i2 = 0; i2 < jC2; i2++) {
                int iB2 = cVar.b();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static otf b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return otf.h(byteBufferDuplicate);
    }

    public static long c(int i) {
        return ((long) i) & 4294967295L;
    }

    public static int d(short s) {
        return s & UShort.MAX_VALUE;
    }
}

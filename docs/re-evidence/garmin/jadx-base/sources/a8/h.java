package a8;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f1914a;

        public a(ByteBuffer byteBuffer) {
            this.f1914a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i14) {
            ByteBuffer byteBuffer = this.f1914a;
            byteBuffer.position(byteBuffer.position() + i14);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1915a;

        public b(long j8, long j14) {
            this.f1915a = j8;
        }
    }

    private h() {
    }

    public static b8.b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j8;
        long j14;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        a aVar = new a(byteBufferDuplicate);
        aVar.a(4);
        ByteBuffer byteBuffer = aVar.f1914a;
        int i14 = byteBuffer.getShort() & 65535;
        if (i14 > 100) {
            vb.h.C("Cannot read metadata.");
            return null;
        }
        aVar.a(6);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j8 = 4294967295L;
            if (i16 >= i14) {
                j14 = -1;
                break;
            }
            int i17 = byteBuffer.getInt();
            aVar.a(4);
            j14 = ((long) byteBuffer.getInt()) & 4294967295L;
            aVar.a(4);
            if (1835365473 == i17) {
                break;
            }
            i16++;
        }
        if (j14 != -1) {
            aVar.a((int) (j14 - ((long) byteBuffer.position())));
            aVar.a(12);
            long j15 = ((long) byteBuffer.getInt()) & 4294967295L;
            while (i15 < j15) {
                int i18 = byteBuffer.getInt();
                long j16 = ((long) byteBuffer.getInt()) & j8;
                long j17 = j8;
                long j18 = ((long) byteBuffer.getInt()) & j17;
                if (1164798569 == i18 || 1701669481 == i18) {
                    byteBufferDuplicate.position((int) new b(j16 + j14, j18).f1915a);
                    b8.b bVar = new b8.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f16373b = byteBufferDuplicate;
                    bVar.f16372a = iPosition;
                    int i19 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f16374c = i19;
                    bVar.f16375d = bVar.f16373b.getShort(i19);
                    return bVar;
                }
                i15++;
                j8 = j17;
            }
        }
        vb.h.C("Cannot read metadata.");
        return null;
    }
}

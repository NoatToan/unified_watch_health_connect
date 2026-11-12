package vb;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f176780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f176781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f176782c;

        public a(UUID uuid, int i14, byte[] bArr, UUID[] uuidArr) {
            this.f176780a = uuid;
            this.f176781b = i14;
            this.f176782c = bArr;
        }
    }

    private l() {
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(Atom.TYPE_pssh);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static a b(byte[] bArr) {
        UUID[] uuidArr;
        fa.r rVar = new fa.r(bArr);
        if (rVar.f70056c < 32) {
            return null;
        }
        rVar.G(0);
        int iA = rVar.a();
        int iG = rVar.g();
        if (iG != iA) {
            fa.k.g("Advertised atom size (" + iG + ") does not match buffer size: " + iA);
            return null;
        }
        int iG2 = rVar.g();
        if (iG2 != 1886614376) {
            fb1.c.r(iG2, "Atom type is not pssh: ");
            return null;
        }
        int iC = b.c(rVar.g());
        if (iC > 1) {
            fb1.c.r(iC, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(rVar.o(), rVar.o());
        if (iC == 1) {
            int iY = rVar.y();
            uuidArr = new UUID[iY];
            for (int i14 = 0; i14 < iY; i14++) {
                uuidArr[i14] = new UUID(rVar.o(), rVar.o());
            }
        } else {
            uuidArr = null;
        }
        int iY2 = rVar.y();
        int iA2 = rVar.a();
        if (iY2 == iA2) {
            byte[] bArr2 = new byte[iY2];
            rVar.e(bArr2, 0, iY2);
            return new a(uuid, iC, bArr2, uuidArr);
        }
        fa.k.g("Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] c(byte[] bArr, UUID uuid) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        UUID uuid2 = aVarB.f176780a;
        if (uuid.equals(uuid2)) {
            return aVarB.f176782c;
        }
        fa.k.g("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}

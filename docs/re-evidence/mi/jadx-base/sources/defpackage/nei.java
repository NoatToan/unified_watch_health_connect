package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class nei {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f27858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f27859b;
        public final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f27858a = uuid;
            this.f27859b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        okh okhVar = new okh(bArr);
        if (okhVar.f() < 32) {
            return null;
        }
        okhVar.P(0);
        if (okhVar.n() != okhVar.a() + 4 || okhVar.n() != 1886614376) {
            return null;
        }
        int iC = zl1.c(okhVar.n());
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(iC);
            toe.h("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(okhVar.w(), okhVar.w());
        if (iC == 1) {
            okhVar.Q(okhVar.H() * 16);
        }
        int iH = okhVar.H();
        if (iH != okhVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iH];
        okhVar.j(bArr2, 0, iH);
        return new a(uuid, iC, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f27858a)) {
            return aVarD.c;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(aVarD.f27858a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(strValueOf);
        sb.append(", got: ");
        sb.append(strValueOf2);
        sb.append(".");
        toe.h("PsshAtomUtil", sb.toString());
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f27858a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f27859b;
    }
}

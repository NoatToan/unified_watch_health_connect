package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class PsshAtomUtil {
    private static final String a = "PsshAtomUtil";

    public static class a {
        private final UUID a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int version, byte[] schemeData) {
            this.a = uuid;
            this.b = version;
            this.c = schemeData;
        }
    }

    private PsshAtomUtil() {
    }

    @Nullable
    private static a a(byte[] atom) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(atom);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readInt() != parsableByteArray.bytesLeft() + 4 || parsableByteArray.readInt() != 1886614376) {
            return null;
        }
        int iC = com.google.android.exoplayer2.extractor.mp4.a.c(parsableByteArray.readInt());
        if (iC > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(iC);
            Log.w(a, sb.toString());
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (iC == 1) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedIntToInt() * 16);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != parsableByteArray.bytesLeft()) {
            return null;
        }
        byte[] bArr = new byte[unsignedIntToInt];
        parsableByteArray.readBytes(bArr, 0, unsignedIntToInt);
        return new a(uuid, iC, bArr);
    }

    public static byte[] buildPsshAtom(UUID systemId, @Nullable byte[] data) {
        return buildPsshAtom(systemId, null, data);
    }

    public static boolean isPsshAtom(byte[] data) {
        return a(data) != null;
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] atom, UUID uuid) {
        a aVarA = a(atom);
        if (aVarA == null) {
            return null;
        }
        if (uuid.equals(aVarA.a)) {
            return aVarA.c;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(aVarA.a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(strValueOf);
        sb.append(", got: ");
        sb.append(strValueOf2);
        sb.append(".");
        Log.w(a, sb.toString());
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] atom) {
        a aVarA = a(atom);
        if (aVarA == null) {
            return null;
        }
        return aVarA.a;
    }

    public static int parseVersion(byte[] atom) {
        a aVarA = a(atom);
        if (aVarA == null) {
            return -1;
        }
        return aVarA.b;
    }

    public static byte[] buildPsshAtom(UUID systemId, @Nullable UUID[] keyIds, @Nullable byte[] data) {
        int length = (data != null ? data.length : 0) + 32;
        if (keyIds != null) {
            length += (keyIds.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(com.google.android.exoplayer2.extractor.mp4.a.v0);
        byteBufferAllocate.putInt(keyIds != null ? 16777216 : 0);
        byteBufferAllocate.putLong(systemId.getMostSignificantBits());
        byteBufferAllocate.putLong(systemId.getLeastSignificantBits());
        if (keyIds != null) {
            byteBufferAllocate.putInt(keyIds.length);
            for (UUID uuid : keyIds) {
                byteBufferAllocate.putLong(uuid.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
            }
        }
        if (data != null && data.length != 0) {
            byteBufferAllocate.putInt(data.length);
            byteBufferAllocate.put(data);
        }
        return byteBufferAllocate.array();
    }
}

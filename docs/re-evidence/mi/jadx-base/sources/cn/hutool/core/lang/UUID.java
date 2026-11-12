package cn.hutool.core.lang;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.lio;
import defpackage.nbj;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class UUID implements Serializable, Comparable<UUID> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = -1185015143654744140L;
    private final long leastSigBits;
    private final long mostSigBits;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SecureRandom f5550a = nbj.c();
    }

    private UUID(byte[] bArr) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        this.mostSigBits = j2;
        this.leastSigBits = j;
    }

    private void checkTimeBase() {
        if (version() != 1) {
            throw new UnsupportedOperationException("Not a time-based UUID");
        }
    }

    private static String digits(long j, int i) {
        long j2 = 1 << (i * 4);
        return Long.toHexString((j & (j2 - 1)) | j2).substring(1);
    }

    public static UUID fastUUID() {
        return randomUUID(false);
    }

    public static UUID fromString(String str) {
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length != 5) {
            throw new IllegalArgumentException("Invalid UUID string: " + str);
        }
        for (int i = 0; i < 5; i++) {
            strArrSplit[i] = "0x" + strArrSplit[i];
        }
        return new UUID((((Long.decode(strArrSplit[0]).longValue() << 16) | Long.decode(strArrSplit[1]).longValue()) << 16) | Long.decode(strArrSplit[2]).longValue(), (Long.decode(strArrSplit[3]).longValue() << 48) | Long.decode(strArrSplit[4]).longValue());
    }

    public static UUID nameUUIDFromBytes(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(Coder.KEY_MD5).digest(bArr);
            byte b2 = (byte) (bArrDigest[6] & 15);
            bArrDigest[6] = b2;
            bArrDigest[6] = (byte) (b2 | 48);
            byte b3 = (byte) (bArrDigest[8] & 63);
            bArrDigest[8] = b3;
            bArrDigest[8] = (byte) (b3 | 128);
            return new UUID(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            throw new InternalError("MD5 not supported");
        }
    }

    public static UUID randomUUID() {
        return randomUUID(true);
    }

    public int clockSequence() throws UnsupportedOperationException {
        checkTimeBase();
        return (int) ((this.leastSigBits & 4611404543450677248L) >>> 48);
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != UUID.class) {
            return false;
        }
        UUID uuid = (UUID) obj;
        return this.mostSigBits == uuid.mostSigBits && this.leastSigBits == uuid.leastSigBits;
    }

    public long getLeastSignificantBits() {
        return this.leastSigBits;
    }

    public long getMostSignificantBits() {
        return this.mostSigBits;
    }

    public int hashCode() {
        long j = this.mostSigBits ^ this.leastSigBits;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public long node() throws UnsupportedOperationException {
        checkTimeBase();
        return this.leastSigBits & 281474976710655L;
    }

    public long timestamp() throws UnsupportedOperationException {
        checkTimeBase();
        long j = this.mostSigBits;
        return (j >>> 32) | ((4095 & j) << 48) | (((j >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32);
    }

    public String toString() {
        return toString(false);
    }

    public int variant() {
        long j = this.leastSigBits;
        return (int) ((j >> 63) & (j >>> ((int) (64 - (j >>> 62)))));
    }

    public int version() {
        return (int) ((this.mostSigBits >> 12) & 15);
    }

    public static UUID randomUUID(boolean z) {
        byte[] bArr = new byte[16];
        (z ? a.f5550a : nbj.b()).nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        return new UUID(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(UUID uuid) {
        int iCompare = Long.compare(this.mostSigBits, uuid.mostSigBits);
        return iCompare == 0 ? Long.compare(this.leastSigBits, uuid.leastSigBits) : iCompare;
    }

    public String toString(boolean z) {
        StringBuilder sbB0 = lio.B0(z ? 32 : 36);
        sbB0.append(digits(this.mostSigBits >> 32, 8));
        if (!z) {
            sbB0.append('-');
        }
        sbB0.append(digits(this.mostSigBits >> 16, 4));
        if (!z) {
            sbB0.append('-');
        }
        sbB0.append(digits(this.mostSigBits, 4));
        if (!z) {
            sbB0.append('-');
        }
        sbB0.append(digits(this.leastSigBits >> 48, 4));
        if (!z) {
            sbB0.append('-');
        }
        sbB0.append(digits(this.leastSigBits, 12));
        return sbB0.toString();
    }

    public UUID(long j, long j2) {
        this.mostSigBits = j;
        this.leastSigBits = j2;
    }
}

package org.apache.commons.compress.archivers.zip;

import defpackage.d1s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PKWareExtraHeader implements d1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZipShort f29427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f29428b;
    public byte[] c;

    public enum EncryptionAlgorithm {
        DES(26113),
        RC2pre52(26114),
        TripleDES168(26115),
        TripleDES192(26121),
        AES128(26126),
        AES192(26127),
        AES256(26128),
        RC2(26370),
        RC4(26625),
        UNKNOWN(65535);

        private static final Map<Integer, EncryptionAlgorithm> codeToEnum;
        private final int code;

        static {
            HashMap map = new HashMap();
            for (EncryptionAlgorithm encryptionAlgorithm : values()) {
                map.put(Integer.valueOf(encryptionAlgorithm.getCode()), encryptionAlgorithm);
            }
            codeToEnum = Collections.unmodifiableMap(map);
        }

        EncryptionAlgorithm(int i) {
            this.code = i;
        }

        public static EncryptionAlgorithm getAlgorithmByCode(int i) {
            return codeToEnum.get(Integer.valueOf(i));
        }

        public int getCode() {
            return this.code;
        }
    }

    public enum HashAlgorithm {
        NONE(0),
        CRC32(1),
        MD5(32771),
        SHA1(32772),
        RIPEND160(32775),
        SHA256(32780),
        SHA384(32781),
        SHA512(32782);

        private static final Map<Integer, HashAlgorithm> codeToEnum;
        private final int code;

        static {
            HashMap map = new HashMap();
            for (HashAlgorithm hashAlgorithm : values()) {
                map.put(Integer.valueOf(hashAlgorithm.getCode()), hashAlgorithm);
            }
            codeToEnum = Collections.unmodifiableMap(map);
        }

        HashAlgorithm(int i) {
            this.code = i;
        }

        public static HashAlgorithm getAlgorithmByCode(int i) {
            return codeToEnum.get(Integer.valueOf(i));
        }

        public int getCode() {
            return this.code;
        }
    }

    public PKWareExtraHeader(ZipShort zipShort) {
        this.f29427a = zipShort;
    }

    public final void a(int i, int i2) throws ZipException {
        if (i2 >= i) {
            return;
        }
        throw new ZipException(getClass().getName() + " is too short, only " + i2 + " bytes, expected at least " + i);
    }

    public void b(byte[] bArr) {
        this.c = e.c(bArr);
    }

    public void c(byte[] bArr) {
        this.f29428b = e.c(bArr);
    }

    @Override // defpackage.d1s
    public ZipShort getHeaderId() {
        return this.f29427a;
    }

    @Override // defpackage.d1s
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        b(bArrCopyOfRange);
        if (this.f29428b == null) {
            c(bArrCopyOfRange);
        }
    }

    @Override // defpackage.d1s
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) throws ZipException {
        c(Arrays.copyOfRange(bArr, i, i2 + i));
    }
}

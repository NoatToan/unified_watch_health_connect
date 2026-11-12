package it2;

import com.garmin.io.cobs.CobsDecodeException;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f94977a = new byte[1024];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94978a;

        static {
            int[] iArr = new int[EnumC1818b.values().length];
            f94978a = iArr;
            try {
                iArr[EnumC1818b.EXPECTING_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94978a[EnumC1818b.EXPECTING_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: it2.b$b, reason: collision with other inner class name */
    public enum EnumC1818b {
        EXPECTING_CODE,
        EXPECTING_DATA
    }

    public final byte[] a(byte[] bArr, int i14) throws CobsDecodeException {
        EnumC1818b enumC1818b;
        if (i14 < 0) {
            org.apache.commons.lang3.e.v("offset and length must be positive");
            return null;
        }
        if (i14 > bArr.length) {
            org.apache.commons.lang3.e.v("offset + length is greater than buffer.length");
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        if (this.f94977a.length < i14) {
            this.f94977a = new byte[i14];
        }
        byte[] bArr2 = this.f94977a;
        EnumC1818b enumC1818b2 = EnumC1818b.EXPECTING_CODE;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = a.f94978a[enumC1818b2.ordinal()];
            int i19 = 1;
            if (i18 == 1) {
                int i24 = i15 + 1;
                i17 = bArr[i15] & UnsignedBytes.MAX_VALUE;
                if (i17 != 1) {
                    enumC1818b = EnumC1818b.EXPECTING_DATA;
                } else if (i24 >= i14) {
                    enumC1818b = EnumC1818b.EXPECTING_CODE;
                } else {
                    if (i16 >= bArr2.length) {
                        throw new CobsDecodeException(it2.a.DECODE_BUFFER_OVERRUN);
                    }
                    bArr2[i16] = 0;
                    i15 = i24;
                    enumC1818b2 = EnumC1818b.EXPECTING_CODE;
                    i16++;
                }
                EnumC1818b enumC1818b3 = enumC1818b;
                i15 = i24;
                enumC1818b2 = enumC1818b3;
            } else {
                if (i18 != 2) {
                    enumC1818b2.toString();
                    throw new CobsDecodeException(it2.a.UNKNOWN_STATE);
                }
                while (i19 < i17) {
                    if (i15 >= i14) {
                        throw new CobsDecodeException(it2.a.ENCODE_BUFFER_OVERRUN);
                    }
                    int i25 = i15 + 1;
                    byte b14 = bArr[i15];
                    if (i16 >= bArr2.length) {
                        throw new CobsDecodeException(it2.a.DECODE_BUFFER_OVERRUN);
                    }
                    bArr2[i16] = b14;
                    i19++;
                    i15 = i25;
                    i16++;
                }
                if (i15 >= i14) {
                    enumC1818b2 = EnumC1818b.EXPECTING_CODE;
                } else if (i17 >= 255) {
                    enumC1818b2 = EnumC1818b.EXPECTING_CODE;
                } else {
                    if (i16 > bArr2.length) {
                        throw new CobsDecodeException(it2.a.DECODE_BUFFER_OVERRUN);
                    }
                    if (i16 != bArr2.length) {
                        bArr2[i16] = 0;
                        i16++;
                    }
                    enumC1818b2 = EnumC1818b.EXPECTING_CODE;
                }
            }
        }
        if (enumC1818b2 == EnumC1818b.EXPECTING_DATA) {
            throw new CobsDecodeException(it2.a.UNEXPECTED_END_OF_FRAME);
        }
        byte[] bArr3 = new byte[i16];
        System.arraycopy(bArr2, 0, bArr3, 0, i16);
        return bArr3;
    }
}

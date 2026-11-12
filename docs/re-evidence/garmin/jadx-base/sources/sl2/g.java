package sl2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f160038a = LoggerFactory.getLogger("PAY#NFC#PassCodes");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f160039b = {-53, -82, -34, Ascii.DLE, 51, 37, 78, -35, -51, -3, -23, -117, Ascii.VT, -99, -8, -64, 34, 67, -86, -87, -13, -124, 85, 72, 81, -111, -41, Ascii.EM, -38, Ascii.FF, 73, -58, 65, -111, -103, 43, -83, -4, -92, 44, -45, -112, 60, 79, -10, 78, 75, 114, -8, 7, 4, 118, -101, -81, 43, -91, 67, -8, 107, 4, Ascii.RS, -15, Ascii.NAK, 113, -15, -84, Ascii.US, -37, -62, 75, -23, Ascii.SO, SignedBytes.MAX_POWER_OF_TWO, -96, -76, -37, 69, 70, 47, -119, 7, 54, -115, -119, -4, -45, -92, 125, 120, -19, -104, -30, -77, -99, -84, -64, 118, 42, -77, 56, 40, -23, -95, -5, Ascii.SYN, 59, 89, -24, -83, -76, -30, 123, 105, -71, -104, 32, -93, -68, 78, -97, -60, 39, 7, 36, -21, -108, -64, 117};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f160040c = c("8E20EAABD3BC8DB3D09A6F0D70CD268DDFF0C845767D5D9345F3EA4EB6871609F11A156116F7C0C6BB4080078A345DBB7591E987FC3225A675EFBC340E81BDEFF162845A06E4A88CB468476CBD1A2BD57255D8A533959F036249D7B55F7592C2B73915AA169861DD09ECD2746A0E2C436F1BE91F4B775617DBFA5D05F9D721CD");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f160041d = c("BD50283872DED997A5BEF92A4A92FCFAA63433DCC61EAA8DE0119BC065F07B4729AF9BC7D18F3ADED9237A927B89498189D029A337B01F6C0F1D1F0FE815BCAED07DF82E9FA9FE178527FB93422C8564EF32108A72CABD77AFB9E97E04C78847D01A1AA88251A1DF21A290935447364DA240BE03617FC6813AE3BC2128C41841");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f160042e = {0, -92, 4, 0, 9, -96, 0, 0, 1, 81, 67, 82, 83, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f160043f = {UnsignedBytes.MAX_POWER_OF_TWO, -42, 0, 0, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f160044g = {UnsignedBytes.MAX_POWER_OF_TWO, -43, 0, 0, 0};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160045a;

        static {
            int[] iArr = new int[f.values().length];
            f160045a = iArr;
            try {
                iArr[f.f160025e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160045a[f.f160027g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f160045a[f.f160030j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f160045a[f.f160029i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f160045a[f.f160028h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f160045a[f.f160026f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f160045a[f.f160024d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f160045a[f.f160031k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f160045a[f.f160032l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f160045a[f.f160033m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f160045a[f.f160034n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static int a(String str, int i14, f fVar, byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 128) {
            vb.h.s("commandPayload is invalid");
            return 0;
        }
        int length = bArr.length;
        if (length < 130) {
            return 1;
        }
        int i15 = length - 2;
        if ((bArr[i15] & UnsignedBytes.MAX_VALUE) != 144) {
            return 1;
        }
        try {
            PublicKey publicKeyF = f(Arrays.copyOfRange(bArr, 0, i15), fVar);
            if (publicKeyF == null) {
                return 23;
            }
            byte[] bArrB = pl2.d.b((byte) i14, pl2.d.a(str), publicKeyF);
            if (bArrB == null) {
                f160038a.error("sendInitialAuthCommand: Can't process sendInitialAuthCommand");
                return 9;
            }
            if (bArrB.length > 128) {
                return 8;
            }
            System.arraycopy(bArrB, 0, bArr2, 0, 128);
            return 0;
        } catch (InvalidKeyException unused) {
            return 5;
        } catch (NoSuchAlgorithmException unused2) {
            return 2;
        } catch (BadPaddingException unused3) {
            return 7;
        } catch (IllegalBlockSizeException unused4) {
            return 6;
        } catch (NoSuchPaddingException unused5) {
            return 4;
        }
    }

    public static int b(String str, byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 32) {
            vb.h.s("output has invalid");
            return 0;
        }
        if ((bArr[8] & UnsignedBytes.MAX_VALUE) != 144 || (bArr[9] & UnsignedBytes.MAX_VALUE) != 0) {
            return 8;
        }
        try {
            byte[] bArr3 = new byte[40];
            System.arraycopy(pl2.d.a(str), 0, bArr3, 0, 32);
            System.arraycopy(bArr, 0, bArr3, 32, 8);
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(bArr3);
            System.arraycopy(messageDigest.digest(), 0, bArr2, 0, 32);
            return 0;
        } catch (NoSuchAlgorithmException unused) {
            return 2;
        }
    }

    public static byte[] c(String str) {
        if (str.length() % 2 != 0) {
            kg.f.n("Unacceptable string: ".concat(str));
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() / 2);
        for (int i14 = 0; i14 < str.length() / 2; i14++) {
            int i15 = i14 * 2;
            int i16 = i15 + 1;
            byteBufferAllocate.put((byte) (Byte.parseByte(str.substring(i16, i15 + 2), 16) | ((byte) (Byte.parseByte(str.substring(i15, i16), 16) << 4))));
        }
        return byteBufferAllocate.array();
    }

    public static int d(int i14, byte[] bArr) {
        if (i14 == 1) {
            return bArr[0] & UnsignedBytes.MAX_VALUE;
        }
        if (i14 == 2) {
            return ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE);
        }
        f160038a.debug("Invalid tag length in getting public ket data");
        return -1;
    }

    public static int e(int i14, byte[] bArr) {
        int i15 = bArr[i14] & UnsignedBytes.MAX_VALUE;
        if (i15 > 127 || i15 < 0) {
            return (i15 != 129 && i15 == 130) ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02bf  */
    /* JADX WARN: Multi-variable type inference failed */
    public static PublicKey f(byte[] bArr, f fVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2;
        PublicKey publicKey;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i14;
        Object obj;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        PublicKey publicKeyGeneratePublic;
        int i15;
        int iD;
        int length;
        int i16;
        if (bArr == null) {
            return null;
        }
        int i17 = 0;
        int i18 = bArr[0] & UnsignedBytes.MAX_VALUE;
        int i19 = 4;
        Logger logger = f160038a;
        if (i18 == 127 && (bArr[1] & UnsignedBytes.MAX_VALUE) == 33) {
            logger.debug("parseCertificateResponse: Yes starts with 7F21");
            int iE = e(2, bArr);
            if (iE == 0) {
                i16 = 2;
            } else if (iE == 1) {
                i16 = 3;
            } else {
                i16 = iE >= 2 ? 4 : 1;
            }
            int i24 = bArr[i16] & 255;
            bArr2 = new byte[i24];
            System.arraycopy(bArr, i16 + 1, bArr2, 0, i24);
        } else {
            logger.debug("parseCertificateResponse: not structured with tag 7F21");
            bArr2 = null;
        }
        HashMap map = new HashMap(10);
        if (bArr2 == null) {
            publicKey = null;
            break;
        }
        int i25 = 0;
        do {
            if (i25 >= bArr2.length) {
                publicKey = null;
                break;
            }
            b bVar = new b(i17);
            byte b14 = bArr2[i25];
            if ((b14 & UnsignedBytes.MAX_VALUE) == 95) {
                bVar.f160046a = new byte[]{b14, bArr2[i15]};
                i15 = i25 + 1;
            } else {
                bVar.f160046a = new byte[]{b14};
                i15 = i25;
            }
            int i26 = i15 + 1;
            int iE2 = e(i26, bArr2);
            if (iE2 >= 1) {
                publicKey = null;
                iD = d(iE2, new byte[]{bArr2[i15 + 2], bArr2[i15 + 3]});
            } else {
                publicKey = null;
                iD = 0;
            }
            if (iE2 == 0) {
                iD = bArr2[i26];
                i26 = i15 + 2;
            } else if (iE2 == 1) {
                i26 = i15 + 3;
            } else if (iE2 >= 2) {
                i26 = i15 + 4;
            }
            bVar.f160047b = iD;
            byte[] bArr9 = new byte[iD];
            bVar.f160048c = bArr9;
            bVar.f160049d = iE2;
            System.arraycopy(bArr2, i26, bArr9, 0, iD);
            map.put(i(bVar.f160046a), bVar);
            int i27 = bVar.f160049d;
            if (i27 == 0) {
                length = bVar.f160047b + bVar.f160046a.length + 1;
            } else if (i27 == 1) {
                length = bVar.f160047b + bVar.f160046a.length + 2;
            } else {
                length = i27 == 2 ? bVar.f160047b + bVar.f160046a.length + 3 : -1;
            }
            i25 += length;
            if (i25 == -1) {
                break;
            }
        } while (i25 < bArr2.length);
        b bVar2 = (b) map.get("5f37");
        if (bVar2 == null) {
            bVar2 = (b) map.get("5F37");
        }
        b bVar3 = (b) map.get("5f38");
        if (bVar3 == null) {
            bVar3 = (b) map.get("5F38");
        }
        if (bVar2 == null || bVar3 == null || (bArr6 = bVar2.f160048c) == null || (bArr7 = bVar3.f160048c) == null) {
            logger.error("parseCertificateResponse: Not able to parse certificate");
            bArr3 = publicKey;
        } else {
            switch (a.f160045a[fVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bArr8 = f160039b;
                    break;
                case 5:
                case 6:
                case 7:
                    bArr8 = f160040c;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                    bArr8 = f160041d;
                    break;
                default:
                    throw new InvalidKeyException("nfc chip type" + fVar + " is invalid.");
            }
            Logger logger2 = pl2.d.f138576a;
            if (bArr8 != null) {
                if (bArr8.length != 128) {
                    pl2.d.f138576a.debug("createPublickey: Invalid modulus size");
                } else {
                    try {
                        publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArr8), new BigInteger("010001", 16)));
                    } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
                        publicKeyGeneratePublic = publicKey;
                    }
                }
                publicKeyGeneratePublic = publicKey;
            } else {
                publicKeyGeneratePublic = publicKey;
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(2, publicKeyGeneratePublic);
            byte[] bArrDoFinal = cipher.doFinal(bArr6);
            if (bArrDoFinal.length != 128) {
                logger.error("Invalid length of decrypted signature");
            }
            byte[] bArr10 = new byte[bArrDoFinal.length - 2];
            System.arraycopy(bArrDoFinal, 1, bArr10, 0, 106);
            logger.debug("ModifiedPkey TLV : " + com.garmin.device.nfc.j.a(bArr10));
            byte[] bArr11 = new byte[106];
            System.arraycopy(bArr10, 0, bArr11, 0, 106);
            logger.debug("removeHashCode : " + com.garmin.device.nfc.j.a(bArr11));
            byte[] bArr12 = new byte[TsExtractor.TS_STREAM_TYPE_DTS];
            System.arraycopy(bArr11, 0, bArr12, 0, 106);
            logger.debug("arrayIncludeReminder 1: " + com.garmin.device.nfc.j.a(bArr12));
            System.arraycopy(bArr7, 0, bArr12, 106, 32);
            logger.debug("arrayIncludeReminder 2: " + com.garmin.device.nfc.j.a(bArr12));
            bArr3 = bArr12;
        }
        if (bArr3 == 0) {
            logger.error("getProductionKey: Not able to parse certificate");
            return publicKey;
        }
        if (i(new byte[]{bArr3[0], bArr3[1]}).toUpperCase(Locale.ENGLISH).equals("7F49")) {
            int iE3 = e(2, bArr3);
            int iD2 = iE3 == 0 ? bArr3[2] & 255 : 0;
            if (iE3 >= 1) {
                iD2 = d(iE3, new byte[]{bArr3[3], bArr3[4]});
                if (iE3 >= 2) {
                    i19 = 5;
                }
            } else {
                i19 = 2;
            }
            byte[] bArr13 = new byte[iD2];
            System.arraycopy(bArr3, i19, bArr13, 0, iD2);
            logger.debug("publickeytlv array from response " + com.garmin.device.nfc.j.a(bArr13));
            if ((bArr13[0] & UnsignedBytes.MAX_VALUE) == 130) {
                if (e(1, bArr13) == 0) {
                    int i28 = bArr13[1];
                    byte[] bArr14 = new byte[i28];
                    System.arraycopy(bArr13, 2, bArr14, 0, i28);
                    i14 = i28 + 2;
                    obj = bArr14;
                } else {
                    i14 = 0;
                    obj = publicKey;
                }
                if ((bArr13[i14] & UnsignedBytes.MAX_VALUE) != 129) {
                    bArr5 = publicKey;
                    bArr4 = obj;
                } else {
                    int i29 = i14 + 1;
                    int iE4 = e(i29, bArr13);
                    if (iE4 == 0) {
                        int i30 = bArr13[i29] & 255;
                        byte[] bArr15 = new byte[i30];
                        System.arraycopy(bArr13, i14 + 2, bArr15, 0, i30);
                        bArr5 = bArr15;
                        bArr4 = obj;
                    } else if (iE4 == 1) {
                        int i34 = bArr13[i14 + 2] & 255;
                        byte[] bArr16 = new byte[i34];
                        System.arraycopy(bArr13, i14 + 3, bArr16, 0, i34);
                        bArr5 = bArr16;
                        bArr4 = obj;
                    } else if (iE4 >= 2) {
                        int i35 = i14 + 2;
                        byte[] bArr17 = new byte[iE4];
                        System.arraycopy(bArr13, i35, bArr17, 0, iE4);
                        BigInteger bigIntegerValueOf = BigInteger.valueOf(Long.parseLong(com.garmin.device.nfc.j.a(bArr17), 16));
                        byte[] bArr18 = new byte[bigIntegerValueOf.intValue()];
                        System.arraycopy(bArr13, i35 + iE4, bArr18, 0, bigIntegerValueOf.intValue());
                        bArr5 = bArr18;
                        bArr4 = obj;
                    } else {
                        bArr5 = publicKey;
                        bArr4 = obj;
                    }
                }
            } else {
                PublicKey publicKey2 = publicKey;
                bArr4 = publicKey2;
                bArr5 = publicKey2;
            }
            logger.debug("Modulus:" + com.garmin.device.nfc.j.a(bArr5) + "\nExponent : " + com.garmin.device.nfc.j.a(bArr4));
            Logger logger3 = pl2.d.f138576a;
            if (bArr5 != 0 && bArr4 != 0) {
                if (bArr5.length != 128) {
                    pl2.d.f138576a.debug("createProductionPublicKey : Invalid modulus size");
                } else {
                    try {
                        return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArr5), new BigInteger(bArr4)));
                    } catch (NoSuchAlgorithmException | InvalidKeySpecException unused2) {
                    }
                }
            }
        }
        return publicKey;
    }

    public static boolean g(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, bArr.length - 2, bArr2, 0, 2);
        return (bArr2[0] & UnsignedBytes.MAX_VALUE) == 144 && (bArr2[1] & UnsignedBytes.MAX_VALUE) == 0;
    }

    public static boolean h(byte[] bArr) {
        return bArr.length >= 4 && g(bArr);
    }

    public static String i(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b14 : bArr) {
            formatter.format("%02x", Byte.valueOf(b14));
        }
        return formatter.toString();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f160046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f160047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f160048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f160049d;

        private b() {
            this.f160049d = 0;
        }

        public /* synthetic */ b(int i14) {
            this();
        }
    }
}

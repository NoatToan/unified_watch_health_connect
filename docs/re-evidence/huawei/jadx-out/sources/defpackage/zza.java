package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.List;
import org.eclipse.californium.elements.util.JceNames;
import org.eclipse.californium.elements.util.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class zza {
    private static final Charset u;
    private static final Charset y;
    private static final int[] r = {12, 19, 30, 28, 20};
    private static final byte[] k = {42, -122, 72, -122, -9, 13, 1, 1, 1};
    private static final byte[] g = {42, -122, 72, -122, -9, 13, 1, 3, 1};
    private static final byte[] i = {42, -122, 72, -50, 62, 2, 1};
    private static final byte[] m = {42, -122, 72, -50, 56, 4, 1};
    private static final byte[] n = {42, -122, 72, -50, 61, 2, 1};
    private static final byte[] t = {43, 101, 110};
    private static final byte[] s = {43, 101, 111};
    private static final byte[] o = {43, 101, 112};
    private static final byte[] l = {43, 101, 113};
    private static final byte[] f = {85, 4, 3};
    private static final a q = new a(48, 65536, "SEQUENCE");
    private static final a p = new a(49, 65536, "SET");
    private static final d h = new d();
    private static final e e = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f54796c = new a(3, 65536, "BIT STRING");
    private static final a j = new a(4, 65536, "OCTET STRING");
    private static final a d = new a(160, 65536, "CONTEXT SPECIFIC 0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f54795b = new a(MachineControlPointResponse.OP_CODE_EXTENSION_SET_TOTAL_ENERGY, 65536, "CONTEXT SPECIFIC 1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f54794a = new a(129, 65536, "CONTEXT SPECIFIC PRIMITIVE 1");

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("ISO-10646-UCS-2");
        } catch (Throwable unused) {
            charsetForName = null;
        }
        y = charsetForName;
        try {
            charsetForName2 = Charset.forName("ISO-10646-UCS-4");
        } catch (Throwable unused2) {
        }
        u = charsetForName2;
        zzm.d();
    }

    private static String d(byte[] bArr, int i2) {
        if (Arrays.equals(bArr, n)) {
            return i2 == 0 ? JceNames.EC : JceNames.ECv2;
        }
        if (Arrays.equals(bArr, k)) {
            if (i2 == 0) {
                return JceNames.RSA;
            }
            return null;
        }
        if (Arrays.equals(bArr, m)) {
            if (i2 == 0) {
                return JceNames.DSA;
            }
            return null;
        }
        if (Arrays.equals(bArr, i)) {
            if (i2 == 0) {
                return JceNames.DH;
            }
            return null;
        }
        if (Arrays.equals(bArr, g)) {
            if (i2 == 0) {
                return JceNames.DH;
            }
            return null;
        }
        if (Arrays.equals(bArr, o)) {
            return i2 == 0 ? JceNames.ED25519 : JceNames.ED25519v2;
        }
        if (Arrays.equals(bArr, l)) {
            return i2 == 0 ? JceNames.ED448 : JceNames.ED448v2;
        }
        if (Arrays.equals(bArr, t)) {
            return i2 == 0 ? JceNames.X25519 : JceNames.X25519v2;
        }
        if (Arrays.equals(bArr, s)) {
            return i2 == 0 ? JceNames.X448 : JceNames.X448v2;
        }
        return null;
    }

    public static boolean c(String str) {
        return JceNames.EC.equalsIgnoreCase(str) || e(str, null) != null;
    }

    public static byte[] b(zzf zzfVar) {
        return q.a(zzfVar);
    }

    public static byte[] e(zzf zzfVar) {
        return h.d(zzfVar);
    }

    public static String j(byte[] bArr) {
        zzf zzfVar = new zzf(bArr, false);
        a aVar = q;
        return d(e(aVar.e(aVar.e(zzfVar, false), false)), 0);
    }

    public static PublicKey i(byte[] bArr) throws GeneralSecurityException {
        String strJ = j(bArr);
        if (strJ != null) {
            return b(strJ).generatePublic(new X509EncodedKeySpec(bArr));
        }
        return null;
    }

    public static String f(byte[] bArr) {
        zzf zzfVar = new zzf(bArr, false);
        a aVar = q;
        zzf zzfVarE = aVar.e(zzfVar, false);
        e eVar = e;
        int iC = eVar.c(eVar.d(zzfVarE));
        if (iC < 0 || iC > 1) {
            throw new IllegalArgumentException("Version 0x" + Integer.toHexString(iC) + " not supported!");
        }
        try {
            return d(e(aVar.e(zzfVarE, false)), iC);
        } catch (IllegalArgumentException e2) {
            if (iC == 1) {
                j.e(zzfVarE, false);
                byte[] bArrE = e(d.e(zzfVarE, false));
                String strE = "0x" + zzp.b(bArrE);
                String str = null;
                try {
                    strE = h.e(bArrE);
                    if (a(strE) != null) {
                        str = JceNames.ECv2;
                    }
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
                if (str != null) {
                    return str;
                }
                throw new IllegalArgumentException("OID " + strE + " not supported!");
            }
            throw e2;
        }
    }

    public static b c(byte[] bArr) throws GeneralSecurityException {
        String strF = f(bArr);
        if (strF == null) {
            return null;
        }
        if (strF == JceNames.ED25519v2 || strF == JceNames.ED448v2) {
            return e(bArr);
        }
        if (strF == JceNames.ECv2) {
            return a(bArr);
        }
        if (strF == JceNames.EC) {
            return d(bArr);
        }
        KeyFactory keyFactoryB = b(strF);
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        b bVar = new b();
        bVar.f54798a = keyFactoryB.generatePrivate(pKCS8EncodedKeySpec);
        return bVar;
    }

    public static b d(byte[] bArr) throws GeneralSecurityException {
        zzf zzfVar = new zzf(bArr, false);
        a aVar = q;
        zzf zzfVarE = aVar.e(zzfVar, false);
        e eVar = e;
        byte[] bArrD = eVar.d(zzfVarE);
        if (bArrD.length == 1 && bArrD[0] == 0) {
            try {
                zzf zzfVarE2 = aVar.e(zzfVarE, false);
                byte[] bArrE = e(zzfVarE2);
                if (!Arrays.equals(bArrE, n)) {
                    throw new InvalidKeySpecException("Provided key is no EC key! " + h.e(bArrE));
                }
                ECParameterSpec eCParameterSpecA = a(h.e(e(zzfVarE2)));
                a aVar2 = j;
                zzf zzfVarE3 = aVar.e(aVar2.e(zzfVarE, false), false);
                byte[] bArrD2 = eVar.d(zzfVarE3);
                if (bArrD2.length == 1 && bArrD2[0] == 1) {
                    byte[] bArrD3 = aVar2.d(zzfVarE3);
                    int fieldSize = (eCParameterSpecA.getCurve().getField().getFieldSize() + 7) / 8;
                    if (bArrD3.length != fieldSize) {
                        throw new GeneralSecurityException("private key size " + bArrD3.length + " doesn't match " + fieldSize);
                    }
                    ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, bArrD3), eCParameterSpecA);
                    b bVar = new b();
                    bVar.f54798a = KeyFactory.getInstance(JceNames.EC).generatePrivate(eCPrivateKeySpec);
                    d.d(zzfVarE3, false);
                    zzf zzfVarD = f54795b.d(zzfVarE3, false);
                    if (zzfVarD != null) {
                        zzf zzfVarE4 = f54796c.e(zzfVarD, false);
                        if (zzfVarE4.a(8) == 0) {
                            bVar.e = d(zzfVarE4, eCParameterSpecA);
                        }
                    }
                    return bVar;
                }
                throw new InvalidKeySpecException("Provided EC private key version " + ((int) bArrD2[0]) + " is not 1!");
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException(e2.getMessage(), e2);
            } catch (GeneralSecurityException e3) {
                throw e3;
            }
        }
        throw new InvalidKeySpecException("Provided version " + ((int) bArrD[0]) + " is not 0!");
    }

    public static b a(byte[] bArr) throws GeneralSecurityException {
        zzf zzfVar = new zzf(bArr, false);
        a aVar = q;
        zzf zzfVarE = aVar.e(zzfVar, false);
        byte[] bArrD = e.d(zzfVarE);
        if (bArrD.length == 1 && bArrD[0] == 1) {
            aVar.d(zzfVarE, false);
            byte[] bArrD2 = j.d(zzfVarE);
            try {
                ECParameterSpec eCParameterSpecA = a(h.e(e(d.e(zzfVarE, false))));
                int fieldSize = (eCParameterSpecA.getCurve().getField().getFieldSize() + 7) / 8;
                if (bArrD2.length != fieldSize) {
                    throw new GeneralSecurityException("private key size " + bArrD2.length + " doesn't match " + fieldSize);
                }
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, bArrD2), eCParameterSpecA);
                b bVar = new b();
                bVar.f54798a = KeyFactory.getInstance(JceNames.EC).generatePrivate(eCPrivateKeySpec);
                zzf zzfVarE2 = f54796c.e(f54795b.e(zzfVarE, false), false);
                if (zzfVarE2.a(8) == 0) {
                    bVar.e = d(zzfVarE2, eCParameterSpecA);
                }
                return bVar;
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException(e2.getMessage(), e2);
            } catch (GeneralSecurityException e3) {
                throw e3;
            }
        }
        throw new InvalidKeySpecException("Provided version " + ((int) bArrD[0]) + " is not 1!");
    }

    public static ECPublicKey d(zzf zzfVar, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        int i2;
        int fieldSize = (eCParameterSpec.getCurve().getField().getFieldSize() + 7) / 8;
        int iA = zzfVar.a(8);
        int iB = zzfVar.b() / 8;
        if (iA == 4 && iB % 2 == 0 && (i2 = iB / 2) == fieldSize) {
            return (ECPublicKey) KeyFactory.getInstance(JceNames.EC).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, zzfVar.b(i2)), new BigInteger(1, zzfVar.b(i2))), eCParameterSpec));
        }
        return null;
    }

    public static b e(byte[] bArr) throws GeneralSecurityException {
        zzf zzfVar = new zzf(bArr, false);
        a aVar = q;
        zzf zzfVarE = aVar.e(zzfVar, false);
        byte[] bArrD = e.d(zzfVarE);
        if (bArrD.length != 1 || bArrD[0] != 1) {
            return null;
        }
        byte[] bArrA = aVar.a(zzfVarE);
        String strE = h.e(e(aVar.e(new zzf(bArrA, false), false)));
        byte[] bArrA2 = j.a(zzfVarE);
        d.e(zzfVarE, false);
        KeyFactory keyFactoryB = b(strE);
        b bVar = new b();
        zzl zzlVar = new zzl(48);
        zzlVar.d((byte) 48);
        int iB = zzlVar.b(8);
        zzlVar.d((byte) 2);
        zzlVar.d((byte) 1);
        zzlVar.d((byte) 0);
        zzlVar.a(bArrA);
        zzlVar.a(bArrA2);
        zzlVar.e(iB, 8);
        bVar.f54798a = keyFactoryB.generatePrivate(new PKCS8EncodedKeySpec(zzlVar.d()));
        zzl zzlVar2 = new zzl(44);
        zzlVar2.d((byte) 48);
        int iB2 = zzlVar2.b(8);
        zzlVar2.a(bArrA);
        zzlVar2.d((byte) 3);
        int iB3 = zzlVar2.b(8);
        zzlVar2.a(f54794a.d(zzfVarE));
        zzlVar2.e(iB3, 8);
        zzlVar2.e(iB2, 8);
        bVar.e = keyFactoryB.generatePublic(new X509EncodedKeySpec(zzlVar2.d()));
        return bVar;
    }

    public static void a(List<X509Certificate> list, X509Certificate x509Certificate, int i2) throws CertPathValidatorException {
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                X509Certificate x509Certificate2 = list.get(i3);
                String sigAlgName = x509Certificate2.getSigAlgName();
                if (sigAlgName.endsWith("withECDSA") || sigAlgName.endsWith("WITHECDSA")) {
                    int i4 = i3 + 1;
                    a(x509Certificate2.getSignature(), (i4 < list.size() ? list.get(i4) : x509Certificate).getPublicKey());
                }
            } catch (GeneralSecurityException e2) {
                throw new CertPathValidatorException(e2.getMessage());
            }
        }
    }

    public static void a(byte[] bArr, PublicKey publicKey) throws GeneralSecurityException {
        zzf zzfVarE = q.e(new zzf(bArr, false), false);
        e eVar = e;
        byte[] bArrB = eVar.b(zzfVarE, false);
        byte[] bArrB2 = eVar.b(zzfVarE, false);
        BigInteger order = ((ECPublicKey) publicKey).getParams().getOrder();
        a("R", bArrB, order);
        a(ExifInterface.LATITUDE_SOUTH, bArrB2, order);
    }

    private static void a(String str, byte[] bArr, BigInteger bigInteger) throws GeneralSecurityException {
        if (bArr.length == 0) {
            throw new GeneralSecurityException("ECDSA signature " + str + " is 0!");
        }
        BigInteger bigInteger2 = new BigInteger(bArr);
        if (bigInteger2.compareTo(BigInteger.ONE) < 0) {
            throw new GeneralSecurityException("ECDSA signature " + str + " is less than 1!");
        }
        if (bigInteger2.compareTo(bigInteger) < 0) {
            return;
        }
        throw new GeneralSecurityException("ECDSA signature " + str + " is not less than N!");
    }

    public static ECParameterSpec a(String str) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JceNames.EC);
        keyPairGenerator.initialize(new ECGenParameterSpec(str));
        return ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams();
    }

    @Deprecated
    public static String e(String str, String str2) {
        return zzm.e(str, str2);
    }

    public static KeyFactory b(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(zzm.e(str, str));
    }

    public static String b(byte[] bArr) {
        zzf zzfVarE = q.e(new zzf(bArr, false), false);
        while (zzfVarE.d()) {
            zzf zzfVarE2 = p.e(zzfVarE, false);
            while (zzfVarE2.d()) {
                zzf zzfVarE3 = q.e(zzfVarE2, false);
                if (Arrays.equals(h.d(zzfVarE3), f)) {
                    try {
                        return new c(r).e(zzfVarE3);
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PrivateKey f54798a;
        private PublicKey e;

        public void b(b bVar) {
            PrivateKey privateKey = bVar.f54798a;
            if (privateKey != null) {
                this.f54798a = privateKey;
            }
            PublicKey publicKey = bVar.e;
            if (publicKey != null) {
                this.e = publicKey;
            }
        }

        public PrivateKey b() {
            return this.f54798a;
        }

        public PublicKey d() {
            return this.e;
        }

        public void b(PublicKey publicKey) {
            this.e = publicKey;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54797a;
        private final int d;
        private final String e;

        public a(int i, int i2, String str) {
            this.d = i;
            this.f54797a = i2;
            this.e = str;
        }

        public boolean b(int i) {
            return i == this.d;
        }

        public byte[] a(zzf zzfVar) {
            return b(zzfVar, true);
        }

        public byte[] d(zzf zzfVar) {
            return b(zzfVar, false);
        }

        public byte[] b(zzf zzfVar, boolean z) {
            return zzfVar.b(c(zzfVar, z));
        }

        public zzf e(zzf zzfVar, boolean z) {
            return zzfVar.d(c(zzfVar, z));
        }

        public zzf d(zzf zzfVar, boolean z) {
            try {
                return e(zzfVar, z);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public int c(zzf zzfVar, boolean z) {
            int iB = zzfVar.b() / 8;
            if (iB < 2) {
                throw new IllegalArgumentException(String.format("Not enough bytes for %s! Required %d, available %d.", this.e, 2, Integer.valueOf(iB)));
            }
            zzfVar.c();
            int iA = zzfVar.a(8);
            if (!b(iA)) {
                zzfVar.h();
                throw new IllegalArgumentException(String.format("No %s, found %02x instead of %02x!", this.e, Integer.valueOf(iA), Integer.valueOf(this.d)));
            }
            int iA2 = zzfVar.a(8);
            int length = iA2 + 2;
            if (iA2 > 127) {
                int i = iA2 & 127;
                if (i > 4) {
                    throw new IllegalArgumentException(String.format("%s length-size %d too long!", this.e, Integer.valueOf(i)));
                }
                int iB2 = zzfVar.b() / 8;
                if (i > iB2) {
                    throw new IllegalArgumentException(String.format("%s length %d exceeds available bytes %d!", this.e, Integer.valueOf(i), Integer.valueOf(iB2)));
                }
                byte[] bArrB = zzfVar.b(i);
                int i2 = 0;
                for (byte b2 : bArrB) {
                    i2 = (i2 << 8) + (b2 & 255);
                }
                int i3 = i2;
                length = bArrB.length + i2 + 2;
                iA2 = i3;
            }
            int i4 = this.f54797a;
            if (iA2 > i4) {
                throw new IllegalArgumentException(String.format("%s lenght %d too large! (supported maxium %d)", this.e, Integer.valueOf(iA2), Integer.valueOf(i4)));
            }
            int iB3 = zzfVar.b() / 8;
            if (iA2 > iB3) {
                throw new IllegalArgumentException(String.format("%s lengh %d exceeds available bytes %d!", this.e, Integer.valueOf(iA2), Integer.valueOf(iB3)));
            }
            if (!z) {
                return iA2;
            }
            zzfVar.h();
            return length;
        }
    }

    static class d extends a {
        public d() {
            super(6, 32, "OID");
        }

        public String e(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            int i = bArr[0] & 255;
            sb.append(i / 40);
            sb.append(".");
            sb.append(i % 40);
            int i2 = 1;
            while (i2 < bArr.length) {
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    i2++;
                    if (i2 == bArr.length) {
                        throw new IllegalArgumentException("Invalid OID 0x" + zzp.b(bArr));
                    }
                    byte b3 = bArr[i2];
                    sb.append(".");
                    sb.append(((b2 & Ascii.DEL) << 7) | (b3 & Ascii.DEL));
                } else {
                    sb.append(".");
                    sb.append((int) b2);
                }
                i2++;
            }
            return sb.toString();
        }
    }

    static class e extends a {
        public e() {
            super(2, 65536, "INTEGER");
        }

        public int c(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("INTEGER byte array must not be null!");
            }
            if (bArr.length == 0) {
                throw new IllegalArgumentException("INTEGER byte array must not be empty!");
            }
            if (bArr.length > 4) {
                throw new IllegalArgumentException("INTEGER byte array " + bArr.length + " bytes is too large for int (max. 4 bytes)!");
            }
            byte b2 = bArr[0];
            int i = b2;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i = (i << 8) | (bArr[i2] & 255);
            }
            if ((b2 >= 0) ^ (i >= 0)) {
                throw new IllegalArgumentException("INTEGER byte array value overflow!");
            }
            return i;
        }
    }

    static class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f54799a;
        private int e;

        public c(int... iArr) {
            super(iArr[0], 65536, "STRING");
            this.f54799a = iArr;
        }

        @Override // zza.a
        public boolean b(int i) {
            for (int i2 : this.f54799a) {
                if (i2 == i) {
                    this.e = i;
                    return true;
                }
            }
            return false;
        }

        public String e(zzf zzfVar) {
            byte[] bArrD = d(zzfVar);
            if (bArrD == null) {
                return null;
            }
            int i = this.e;
            if (i == 19) {
                return new String(bArrD, StandardCharsets.US_ASCII);
            }
            if (i == 12) {
                return new String(bArrD, StandardCharsets.UTF_8);
            }
            if (i == 30) {
                if (zza.y == null) {
                    throw new IllegalArgumentException("BMP_STRING not supported!");
                }
                return new String(bArrD, zza.y);
            }
            if (i == 28) {
                if (zza.y == null) {
                    throw new IllegalArgumentException("UNIVERSAL_STRING not supported!");
                }
                return new String(bArrD, zza.u);
            }
            if (i != 20) {
                return null;
            }
            throw new IllegalArgumentException("TELETEX_STRING not supported!");
        }
    }
}

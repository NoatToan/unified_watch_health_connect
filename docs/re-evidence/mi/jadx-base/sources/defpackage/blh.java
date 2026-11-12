package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class blh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4338a = "0123456789ABCDEF".toCharArray();

    public static String a(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String b(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = f4338a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            if (i != bArr.length - 1) {
                cArr[i2 + 2] = '-';
            }
        }
        return "(0x) " + new String(cArr);
    }

    public static String d(int i) {
        if (i == 0) {
            return "No preferred";
        }
        if (i == 1) {
            return "S2";
        }
        if (i == 2) {
            return "S8";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String e(int i) {
        switch (i) {
            case 1:
                return "LE 1M";
            case 2:
                return "LE 2M";
            case 3:
                return "LE 1M or LE 2M";
            case 4:
                return "LE Coded";
            case 5:
                return "LE 1M or LE Coded";
            case 6:
                return "LE 2M or LE Coded";
            case 7:
                return "LE 1M, LE 2M or LE Coded";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String f(int i) {
        if (i == 1) {
            return "LE 1M";
        }
        if (i == 2) {
            return "LE 2M";
        }
        if (i == 3) {
            return "LE Coded";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String g(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i == 3) {
            return "DISCONNECTING";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String h(int i) {
        if (i == 1) {
            return "WRITE COMMAND";
        }
        if (i == 2) {
            return "WRITE REQUEST";
        }
        if (i == 4) {
            return "WRITE SIGNED";
        }
        return "UNKNOWN (" + i + ")";
    }
}

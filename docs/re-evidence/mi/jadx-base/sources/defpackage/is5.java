package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class is5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f22038a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22039a;

        static {
            int[] iArr = new int[Mode.values().length];
            f22039a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22039a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22039a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22039a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22039a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22039a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22039a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22039a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22039a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22039a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ts5 a(byte[] bArr, bpq bpqVar, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        Mode mode;
        gp2 gp2Var = new gp2(bArr);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i = -1;
        int iD = -1;
        boolean z = false;
        CharacterSetECI characterSetECIByValue = null;
        do {
            try {
                Mode modeForBits = gp2Var.a() < 4 ? Mode.TERMINATOR : Mode.forBits(gp2Var.d(4));
                int[] iArr = a.f22039a;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        mode = modeForBits;
                        break;
                    case 6:
                    case 7:
                        mode = modeForBits;
                        z = true;
                        break;
                    case 8:
                        mode = modeForBits;
                        if (gp2Var.a() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        int iD2 = gp2Var.d(8);
                        iD = gp2Var.d(8);
                        i = iD2;
                        break;
                        break;
                    case 9:
                        mode = modeForBits;
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(g(gp2Var));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                        break;
                    case 10:
                        mode = modeForBits;
                        int iD3 = gp2Var.d(4);
                        int iD4 = gp2Var.d(mode.getCharacterCountBits(bpqVar));
                        if (iD3 == 1) {
                            d(gp2Var, sb, iD4);
                        }
                        break;
                    default:
                        int iD5 = gp2Var.d(modeForBits.getCharacterCountBits(bpqVar));
                        int i2 = iArr[modeForBits.ordinal()];
                        if (i2 == 1) {
                            mode = modeForBits;
                            f(gp2Var, sb, iD5);
                        } else if (i2 == 2) {
                            mode = modeForBits;
                            b(gp2Var, sb, iD5, z);
                        } else if (i2 == 3) {
                            mode = modeForBits;
                            c(gp2Var, sb, iD5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i2 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            e(gp2Var, sb, iD5);
                            mode = modeForBits;
                        }
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        } while (mode != Mode.TERMINATOR);
        return new ts5(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel == null ? null : errorCorrectionLevel.toString(), i, iD);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void b(gp2 gp2Var, StringBuilder sb, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (gp2Var.a() < 11) {
                throw FormatException.getFormatInstance();
            }
            int iD = gp2Var.d(11);
            sb.append(h(iD / 45));
            sb.append(h(iD % 45));
            i -= 2;
        }
        if (i == 1) {
            if (gp2Var.a() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb.append(h(gp2Var.d(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    public static void c(gp2 gp2Var, StringBuilder sb, int i, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if ((i << 3) > gp2Var.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) gp2Var.d(8);
        }
        try {
            sb.append(new String(bArr, characterSetECI == null ? nlo.a(bArr, map) : characterSetECI.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void d(gp2 gp2Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > gp2Var.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iD = gp2Var.d(13);
            int i3 = (iD % 96) | ((iD / 96) << 8);
            int i4 = i3 + (i3 < 959 ? 41377 : 42657);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void e(gp2 gp2Var, StringBuilder sb, int i) throws FormatException {
        if (i * 13 > gp2Var.a()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iD = gp2Var.d(13);
            int i3 = (iD % 192) | ((iD / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void f(gp2 gp2Var, StringBuilder sb, int i) throws FormatException {
        while (i >= 3) {
            if (gp2Var.a() < 10) {
                throw FormatException.getFormatInstance();
            }
            int iD = gp2Var.d(10);
            if (iD >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb.append(h(iD / 100));
            sb.append(h((iD / 10) % 10));
            sb.append(h(iD % 10));
            i -= 3;
        }
        if (i == 2) {
            if (gp2Var.a() < 7) {
                throw FormatException.getFormatInstance();
            }
            int iD2 = gp2Var.d(7);
            if (iD2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb.append(h(iD2 / 10));
            sb.append(h(iD2 % 10));
            return;
        }
        if (i == 1) {
            if (gp2Var.a() < 4) {
                throw FormatException.getFormatInstance();
            }
            int iD3 = gp2Var.d(4);
            if (iD3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb.append(h(iD3));
        }
    }

    public static int g(gp2 gp2Var) throws FormatException {
        int iD = gp2Var.d(8);
        if ((iD & 128) == 0) {
            return iD & 127;
        }
        if ((iD & 192) == 128) {
            return gp2Var.d(8) | ((iD & 63) << 8);
        }
        if ((iD & SportReportBaseParser.ReportType.avgFreq) == 192) {
            return gp2Var.d(16) | ((iD & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    public static char h(int i) throws FormatException {
        char[] cArr = f22038a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.getFormatInstance();
    }
}

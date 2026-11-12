package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class hs5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20394a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f20395b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20396a;

        static {
            int[] iArr = new int[b.values().length];
            f20396a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20396a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20396a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20396a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20396a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20396a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0021 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0074. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0077. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:30:0x0061 for B:35:0x0074 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:30:0x0061 for B:36:0x0077 already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs5.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static ts5 b(int[] iArr, String str) throws FormatException {
        int iG;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i = iArr[1];
        agh aghVar = new agh();
        int i2 = 2;
        while (i2 < iArr[0]) {
            if (i != 913) {
                switch (i) {
                    case 900:
                        iG = g(iArr, i2, sb);
                        break;
                    case 901:
                        iG = a(i, iArr, charsetForName, i2, sb);
                        break;
                    case 902:
                        iG = f(iArr, i2, sb);
                        break;
                    default:
                        switch (i) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                iG = a(i, iArr, charsetForName, i2, sb);
                                break;
                            case 925:
                                iG = i2 + 1;
                                break;
                            case 926:
                                iG = i2 + 2;
                                break;
                            case 927:
                                iG = i2 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i2]).name());
                                break;
                            case 928:
                                iG = d(iArr, i2, aghVar);
                                break;
                            default:
                                iG = g(iArr, i2 - 1, sb);
                                break;
                        }
                        break;
                }
            } else {
                iG = i2 + 1;
                sb.append((char) iArr[i2]);
            }
            if (iG >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i2 = iG + 1;
            i = iArr[iG];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        ts5 ts5Var = new ts5(null, sb.toString(), null, str);
        ts5Var.m(aghVar);
        return ts5Var;
    }

    public static String c(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int d(int[] iArr, int i, agh aghVar) throws FormatException {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        aghVar.j(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iG = g(iArr, i, sb);
        aghVar.d(sb.toString());
        int i3 = iArr[iG] == 923 ? iG + 1 : -1;
        while (iG < iArr[0]) {
            int i4 = iArr[iG];
            if (i4 == 922) {
                iG++;
                aghVar.g(true);
            } else {
                if (i4 != 923) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[iG + 1]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb2);
                        aghVar.e(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb3);
                        aghVar.i(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb4);
                        aghVar.l(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb5);
                        aghVar.k(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb6);
                        aghVar.b(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb7);
                        aghVar.f(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb8);
                        aghVar.c(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i3 != -1) {
            int i5 = iG - i3;
            if (aghVar.a()) {
                i5--;
            }
            aghVar.h(Arrays.copyOfRange(iArr, i3, i5 + i3));
        }
        return iG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        b bVar;
        int i2;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c2 = ' ';
            switch (a.f20396a[bVar2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c2 = (char) i2;
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    b bVar4 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c2 = (char) i2;
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    c2 = 0;
                                    b bVar5 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar5;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    b bVar6 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar6;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c2 = f20395b[i4];
                    } else {
                        if (i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 25:
                                    bVar2 = b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.ALPHA;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    c2 = 0;
                                    b bVar7 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar7;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c2 = f20394a[i4];
                    } else {
                        if (i4 == 29 || i4 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    break;
                case 5:
                    if (i4 < 26) {
                        c2 = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        bVar2 = i4 != 900 ? bVar3 : b.ALPHA;
                        c2 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c2 = f20394a[i4];
                    } else if (i4 == 29 || i4 == 900) {
                        bVar2 = b.ALPHA;
                        c2 = 0;
                    } else {
                        if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c2 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c2 = 0;
                    break;
            }
            if (c2 != 0) {
                sb.append(c2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0007 A[SYNTHETIC] */
    public static int f(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                            case 922:
                            case 923:
                            case 924:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 % 15 != 0 || i5 == 902 || z) {
                        if (i2 > 0) {
                            sb.append(c(iArr2, i2));
                            i2 = 0;
                        }
                    }
                }
                i = i4;
                if (i2 % 15 != 0) {
                }
                if (i2 > 0) {
                    sb.append(c(iArr2, i2));
                    i2 = 0;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    public static int g(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        e(iArr2, iArr3, i3, sb);
        return i;
    }
}

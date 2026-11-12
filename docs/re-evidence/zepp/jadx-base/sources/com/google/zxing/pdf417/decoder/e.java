package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import io.netty.util.internal.StringUtil;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class e {
    private static final char[] A = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] B = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final BigInteger[] C;
    private static final int D = 2;
    private static final int a = 900;
    private static final int b = 901;
    private static final int c = 902;
    private static final int d = 924;
    private static final int e = 925;
    private static final int f = 926;
    private static final int g = 927;
    private static final int h = 928;
    private static final int i = 923;
    private static final int j = 922;
    private static final int k = 913;
    private static final int l = 15;
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 5;
    private static final int s = 6;
    private static final int t = 25;
    private static final int u = 27;
    private static final int v = 27;
    private static final int w = 28;
    private static final int x = 28;
    private static final int y = 29;
    private static final int z = 29;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.PUNCT_SHIFT.ordinal()] = 6;
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
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i2 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i2 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i2] = bigIntegerArr2[i2 - 1].multiply(bigIntegerValueOf);
            i2++;
        }
    }

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0021 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x007a. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:28:0x0063 for B:33:0x0077 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:28:0x0063 for B:34:0x007a already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
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
    private static int a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static DecoderResult b(int[] iArr, String str) throws FormatException {
        int iG;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i2 = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != k) {
                switch (i2) {
                    case 900:
                        iG = g(iArr, i3, sb);
                        break;
                    case 901:
                        iG = a(i2, iArr, charsetForName, i3, sb);
                        break;
                    case 902:
                        iG = f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case j /* 922 */:
                            case i /* 923 */:
                                throw FormatException.getFormatInstance();
                            case d /* 924 */:
                                iG = a(i2, iArr, charsetForName, i3, sb);
                                break;
                            case e /* 925 */:
                                iG = i3 + 1;
                                break;
                            case f /* 926 */:
                                iG = i3 + 2;
                                break;
                            case g /* 927 */:
                                iG = i3 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i3]).name());
                                break;
                            case 928:
                                iG = d(iArr, i3, pDF417ResultMetadata);
                                break;
                            default:
                                iG = g(iArr, i3 - 1, sb);
                                break;
                        }
                        break;
                }
            } else {
                iG = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (iG >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i3 = iG + 1;
            i2 = iArr[iG];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String c(int[] iArr, int i2) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i3 = 0; i3 < i2; i3++) {
            bigIntegerAdd = bigIntegerAdd.add(C[(i2 - i3) - 1].multiply(BigInteger.valueOf(iArr[i3])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int d(int[] iArr, int i2, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i2 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i3 = 0;
        while (i3 < 2) {
            iArr2[i3] = iArr[i2];
            i3++;
            i2++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iG = g(iArr, i2, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        int i4 = iArr[iG] == i ? iG + 1 : -1;
        while (iG < iArr[0]) {
            int i5 = iArr[iG];
            if (i5 == j) {
                iG++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i5 != i) {
                    throw FormatException.getFormatInstance();
                }
                int i6 = iG + 1;
                switch (iArr[i6]) {
                    case 0:
                        StringBuilder sb2 = new StringBuilder();
                        iG = g(iArr, i6 + 1, sb2);
                        pDF417ResultMetadata.setFileName(sb2.toString());
                        break;
                    case 1:
                        StringBuilder sb3 = new StringBuilder();
                        iG = f(iArr, i6 + 1, sb3);
                        pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb3.toString()));
                        break;
                    case 2:
                        StringBuilder sb4 = new StringBuilder();
                        iG = f(iArr, i6 + 1, sb4);
                        pDF417ResultMetadata.setTimestamp(Long.parseLong(sb4.toString()));
                        break;
                    case 3:
                        StringBuilder sb5 = new StringBuilder();
                        iG = g(iArr, i6 + 1, sb5);
                        pDF417ResultMetadata.setSender(sb5.toString());
                        break;
                    case 4:
                        StringBuilder sb6 = new StringBuilder();
                        iG = g(iArr, i6 + 1, sb6);
                        pDF417ResultMetadata.setAddressee(sb6.toString());
                        break;
                    case 5:
                        StringBuilder sb7 = new StringBuilder();
                        iG = f(iArr, i6 + 1, sb7);
                        pDF417ResultMetadata.setFileSize(Long.parseLong(sb7.toString()));
                        break;
                    case 6:
                        StringBuilder sb8 = new StringBuilder();
                        iG = f(iArr, i6 + 1, sb8);
                        pDF417ResultMetadata.setChecksum(Integer.parseInt(sb8.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i4 != -1) {
            int i7 = iG - i4;
            if (pDF417ResultMetadata.isLastSegment()) {
                i7--;
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i4, i7 + i4));
        }
        return iG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i2, StringBuilder sb) {
        b bVar;
        int i3;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = iArr[i4];
            int i6 = a.a[bVar2.ordinal()];
            char c2 = StringUtil.SPACE;
            switch (i6) {
                case 1:
                    if (i5 < 26) {
                        i3 = i5 + 65;
                        c2 = (char) i3;
                    } else {
                        if (i5 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i5 != k) {
                            switch (i5) {
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
                            sb.append((char) iArr2[i4]);
                        }
                        c2 = 0;
                    }
                    break;
                case 2:
                    if (i5 < 26) {
                        i3 = i5 + 97;
                        c2 = (char) i3;
                    } else {
                        if (i5 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i5 != k) {
                            switch (i5) {
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
                            sb.append((char) iArr2[i4]);
                        }
                        c2 = 0;
                    }
                    break;
                case 3:
                    if (i5 < 25) {
                        c2 = B[i5];
                    } else {
                        if (i5 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i5 != k) {
                            switch (i5) {
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
                            sb.append((char) iArr2[i4]);
                        }
                        c2 = 0;
                    }
                    break;
                case 4:
                    if (i5 < 29) {
                        c2 = A[i5];
                    } else {
                        if (i5 == 29 || i5 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i5 == k) {
                            sb.append((char) iArr2[i4]);
                        }
                        c2 = 0;
                    }
                    break;
                case 5:
                    if (i5 < 26) {
                        c2 = (char) (i5 + 65);
                    } else if (i5 != 26) {
                        bVar2 = i5 != 900 ? bVar3 : b.ALPHA;
                        c2 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i5 < 29) {
                        c2 = A[i5];
                        bVar2 = bVar3;
                    } else {
                        if (i5 == 29 || i5 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i5 == k) {
                            sb.append((char) iArr2[i4]);
                        }
                        c2 = 0;
                    }
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

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    private static int f(int[] iArr, int i2, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z2 = false;
        int i3 = 0;
        while (i2 < iArr[0] && !z2) {
            int i4 = i2 + 1;
            int i5 = iArr[i2];
            if (i4 == iArr[0]) {
                z2 = true;
            }
            if (i5 >= 900) {
                if (i5 != 900 && i5 != 901 && i5 != 928) {
                    switch (i5) {
                        case j /* 922 */:
                        case i /* 923 */:
                        case d /* 924 */:
                            i4--;
                            z2 = true;
                            break;
                    }
                } else {
                    i4--;
                    z2 = true;
                }
            } else {
                iArr2[i3] = i5;
                i3++;
            }
            if ((i3 % 15 == 0 || i5 == 902 || z2) && i3 > 0) {
                sb.append(c(iArr2, i3));
                i3 = 0;
            }
            i2 = i4;
        }
        return i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0034. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0037. Please report as an issue. */
    private static int g(int[] iArr, int i2, StringBuilder sb) {
        int[] iArr2 = new int[(iArr[0] - i2) << 1];
        int[] iArr3 = new int[(iArr[0] - i2) << 1];
        boolean z2 = false;
        int i3 = 0;
        while (i2 < iArr[0] && !z2) {
            int i4 = i2 + 1;
            int i5 = iArr[i2];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != k) {
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
                                case j /* 922 */:
                                case i /* 923 */:
                                case d /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                i2 = i4 - 1;
                z2 = true;
            } else {
                iArr2[i3] = k;
                i2 = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i2 = i4;
        }
        e(iArr2, iArr3, i3, sb);
        return i2;
    }
}

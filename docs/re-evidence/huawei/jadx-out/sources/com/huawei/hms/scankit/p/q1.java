package com.huawei.hms.scankit.p;

import androidx.media3.extractor.ts.PsExtractor;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f16274a = "0123456789abcdefghijklmnopqrstuvwxyz !-./:=?T".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f16275b = "0123456789ABCDEF".toCharArray();

    static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16276a;

        static {
            int[] iArr = new int[v4.values().length];
            f16276a = iArr;
            try {
                iArr[v4.TERMINATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16276a[v4.FNC1_FIRST_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16276a[v4.FNC1_SECOND_POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16276a[v4.STRUCTURED_APPEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16276a[v4.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16276a[v4.HANZI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16276a[v4.NUMERIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16276a[v4.ALPHANUMERIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16276a[v4.HEXADECIMAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16276a[v4.HEXABYTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16276a[v4.BYTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16276a[v4.KANJI.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void a(w wVar, StringBuilder sb, int i, boolean z) throws com.huawei.hms.scankit.p.a {
        while (i > 1) {
            if (wVar.a() >= 11) {
                int iA = wVar.a(11);
                sb.append(a(iA / 45));
                sb.append(a(iA % 45));
                i -= 2;
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (i == 1) {
            if (wVar.a() >= 6) {
                sb.append(a(wVar.a(6)));
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
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

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void c(w wVar, StringBuilder sb, int i, boolean z) throws com.huawei.hms.scankit.p.a {
        while (i > 1) {
            if (wVar.a() >= 8) {
                int iA = wVar.a(8);
                sb.append(b(iA / 16));
                sb.append(b(iA % 16));
                i -= 2;
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (i == 1) {
            if (wVar.a() >= 4) {
                sb.append(b(wVar.a(4)));
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
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

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void b(w wVar, StringBuilder sb, int i, boolean z) throws com.huawei.hms.scankit.p.a {
        while (i > 1) {
            if (wVar.a() >= 8) {
                int iA = wVar.a(8);
                sb.append(b(iA / 16));
                sb.append(b(iA % 16));
                i -= 2;
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (i == 1) {
            if (wVar.a() >= 4) {
                sb.append(b(wVar.a(4)));
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
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

    private static void a(b0 b0Var, int i, o0 o0Var, Collection collection, Map map) throws com.huawei.hms.scankit.p.a {
        String strName;
        if (i * 8 <= b0Var.f15986a.a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) b0Var.f15986a.a(8);
            }
            if (o0Var == null) {
                strName = c7.a(bArr, map);
            } else {
                strName = o0Var.name();
            }
            try {
                b0Var.f15987b.append(new String(bArr, strName));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void b(w wVar, StringBuilder sb, int i) throws com.huawei.hms.scankit.p.a {
        if (i * 13 <= wVar.a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int iA = wVar.a(13);
                int i3 = ((iA / PsExtractor.AUDIO_STREAM) << 8) | (iA % PsExtractor.AUDIO_STREAM);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void c(w wVar, StringBuilder sb, int i) throws com.huawei.hms.scankit.p.a {
        while (i >= 3) {
            if (wVar.a() >= 10) {
                int iA = wVar.a(10);
                if (iA < 1000) {
                    sb.append(a(iA / 100));
                    sb.append(a((iA / 10) % 10));
                    sb.append(a(iA % 10));
                    i -= 3;
                } else {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            } else {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (i == 2) {
            if (wVar.a() >= 7) {
                int iA2 = wVar.a(7);
                if (iA2 < 100) {
                    sb.append(a(iA2 / 10));
                    sb.append(a(iA2 % 10));
                    return;
                }
                throw com.huawei.hms.scankit.p.a.a();
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
        if (i == 1) {
            if (wVar.a() >= 4) {
                int iA3 = wVar.a(4);
                if (iA3 < 10) {
                    sb.append(a(iA3));
                    return;
                }
                throw com.huawei.hms.scankit.p.a.a();
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static void a(w wVar, StringBuilder sb, int i) throws com.huawei.hms.scankit.p.a {
        if (i * 13 <= wVar.a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int iA = wVar.a(13);
                int i3 = ((iA / 96) << 8) | (iA % 96);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) ((i4 >> 8) & 255);
                bArr[i2 + 1] = (byte) (i4 & 255);
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void a(z0 z0Var, List list, o0 o0Var, boolean z, v4 v4Var) throws com.huawei.hms.scankit.p.a {
        a(new h7(z0Var.f16444b, z0Var.f16445c, z0Var.d, list), o0Var, z, v4Var, z0Var.f16445c.a(v4Var.a(z0Var.f16443a)));
    }

    private static o0 a(w wVar) throws com.huawei.hms.scankit.p.a {
        o0 o0VarA = o0.a(b(wVar));
        a(o0VarA);
        return o0VarA;
    }

    private static int b(w wVar) throws com.huawei.hms.scankit.p.a {
        int iA = wVar.a(8);
        if ((iA & 128) == 0) {
            return iA & 127;
        }
        if ((iA & PsExtractor.AUDIO_STREAM) == 128) {
            return wVar.a(8) | ((iA & 63) << 8);
        }
        if ((iA & 224) == 192) {
            return wVar.a(16) | ((iA & 31) << 16);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void a(a8 a8Var, w wVar, StringBuilder sb, v4 v4Var) throws com.huawei.hms.scankit.p.a {
        int iA = wVar.a(4);
        int iA2 = wVar.a(v4Var.a(a8Var));
        if (iA == 1) {
            a(wVar, sb, iA2);
        }
    }

    private static char b(int i) throws com.huawei.hms.scankit.p.a {
        char[] cArr = f16275b;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static char a(int i) throws com.huawei.hms.scankit.p.a {
        char[] cArr = f16274a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void a(o0 o0Var) throws com.huawei.hms.scankit.p.a {
        if (o0Var == null) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[LOOP:0: B:35:0x001b->B:32:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    static x1 a(byte[] bArr, a8 a8Var, c3 c3Var, Map map) throws com.huawei.hms.scankit.p.a {
        v4 v4VarA;
        int i;
        int i2;
        boolean z;
        ArrayList arrayList;
        String string;
        w wVar = new w(bArr);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList2 = new ArrayList(1);
        int i3 = -1;
        o0 o0VarA = null;
        boolean z2 = false;
        int iA = -1;
        while (true) {
            try {
                if (wVar.a() < 4) {
                    v4VarA = v4.TERMINATOR;
                } else {
                    v4VarA = v4.a(wVar.a(4));
                }
                switch (a.f16276a[v4VarA.ordinal()]) {
                    case 1:
                        int i4 = iA;
                        i2 = i3;
                        z = z2;
                        i = i4;
                        if (v4VarA == v4.TERMINATOR) {
                            String string2 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new x1(bArr, string2, arrayList, string, i2, i);
                        }
                        int i5 = i;
                        z2 = z;
                        i3 = i2;
                        iA = i5;
                        break;
                    case 2:
                    case 3:
                        i = iA;
                        i2 = i3;
                        z = true;
                        if (v4VarA == v4.TERMINATOR) {
                            String string3 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new x1(bArr, string3, arrayList, string, i2, i);
                        }
                        int i6 = i;
                        z2 = z;
                        i3 = i2;
                        iA = i6;
                        break;
                    case 4:
                        if (wVar.a() >= 16) {
                            int iA2 = wVar.a(8);
                            iA = wVar.a(8);
                            i3 = iA2;
                            int i7 = iA;
                            i2 = i3;
                            z = z2;
                            i = i7;
                            if (v4VarA == v4.TERMINATOR) {
                                String string4 = sb.toString();
                                if (arrayList2.isEmpty()) {
                                    arrayList = null;
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (c3Var == null) {
                                    string = null;
                                } else {
                                    string = c3Var.toString();
                                }
                                return new x1(bArr, string4, arrayList, string, i2, i);
                            }
                            int i8 = i;
                            z2 = z;
                            i3 = i2;
                            iA = i8;
                        } else {
                            throw com.huawei.hms.scankit.p.a.a();
                        }
                        break;
                    case 5:
                        o0VarA = a(wVar);
                        int i9 = iA;
                        i2 = i3;
                        z = z2;
                        i = i9;
                        if (v4VarA == v4.TERMINATOR) {
                            String string5 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new x1(bArr, string5, arrayList, string, i2, i);
                        }
                        int i10 = i;
                        z2 = z;
                        i3 = i2;
                        iA = i10;
                        break;
                    case 6:
                        a(a8Var, wVar, sb, v4VarA);
                        int i11 = iA;
                        i2 = i3;
                        z = z2;
                        i = i11;
                        if (v4VarA == v4.TERMINATOR) {
                            String string6 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new x1(bArr, string6, arrayList, string, i2, i);
                        }
                        int i12 = i;
                        z2 = z;
                        i3 = i2;
                        iA = i12;
                        break;
                    default:
                        a(a(a8Var, map, wVar, sb), arrayList2, o0VarA, z2, v4VarA);
                        int i13 = iA;
                        i2 = i3;
                        z = z2;
                        i = i13;
                        if (v4VarA == v4.TERMINATOR) {
                            String string7 = sb.toString();
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            if (c3Var == null) {
                                string = null;
                            } else {
                                string = c3Var.toString();
                            }
                            return new x1(bArr, string7, arrayList, string, i2, i);
                        }
                        int i14 = i;
                        z2 = z;
                        i3 = i2;
                        iA = i14;
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
    }

    private static z0 a(a8 a8Var, Map map, w wVar, StringBuilder sb) {
        return new z0(a8Var, map, wVar, sb);
    }

    private static void a(h7 h7Var, o0 o0Var, boolean z, v4 v4Var, int i) throws com.huawei.hms.scankit.p.a {
        switch (a.f16276a[v4Var.ordinal()]) {
            case 7:
                c(h7Var.f16121b, h7Var.f16122c, i);
                return;
            case 8:
                a(h7Var.f16121b, h7Var.f16122c, i, z);
                return;
            case 9:
                c(h7Var.f16121b, h7Var.f16122c, i, z);
                return;
            case 10:
                b(h7Var.f16121b, h7Var.f16122c, i, z);
                return;
            case 11:
                a(new b0(h7Var.f16121b, h7Var.f16122c), i, o0Var, h7Var.d, h7Var.f16120a);
                return;
            case 12:
                b(h7Var.f16121b, h7Var.f16122c, i);
                return;
            default:
                throw com.huawei.hms.scankit.p.a.a();
        }
    }
}

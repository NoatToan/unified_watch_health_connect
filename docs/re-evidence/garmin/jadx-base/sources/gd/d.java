package gd;

import am.j;
import i3.e5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f76942a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f76943b = {112, 114, 109, 0};

    private d() {
    }

    public static byte[] a(a[] aVarArr, byte[] bArr) throws IOException {
        int i14 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f76934g * 2) + 7) & (-8)) / 8) + (aVar.f76932e * 2) + b(aVar.f76928a, aVar.f76929b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f76933f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, e.f76946c)) {
            int length2 = aVarArr.length;
            while (i14 < length2) {
                a aVar2 = aVarArr[i14];
                k(byteArrayOutputStream, aVar2, b(aVar2.f76928a, aVar2.f76929b, bArr));
                j(byteArrayOutputStream, aVar2);
                i14++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                k(byteArrayOutputStream, aVar3, b(aVar3.f76928a, aVar3.f76929b, bArr));
            }
            int length3 = aVarArr.length;
            while (i14 < length3) {
                j(byteArrayOutputStream, aVarArr[i14]);
                i14++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        fb1.c.v(" expected=", byteArrayOutputStream.size(), length, "The bytes saved do not match expectation. actual=");
        return null;
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = e.f76948e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = e.f76947d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (!str2.endsWith(".apk")) {
            return j.o((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2, e5.k(str));
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i14) {
        int[] iArr = new int[i14];
        int iD = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iD += (int) b.d(byteArrayInputStream, 2);
            iArr[i15] = iD;
        }
        return iArr;
    }

    public static a[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = e.f76949f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, e.f76950g)) {
                h.z("Unsupported meta version");
                return null;
            }
            int iD = (int) b.d(fileInputStream, 2);
            byte[] bArrC = b.c(fileInputStream, (int) b.d(fileInputStream, 4), (int) b.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                h.z("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                a[] aVarArrF = f(byteArrayInputStream, bArr2, iD, aVarArr);
                byteArrayInputStream.close();
                return aVarArrF;
            } catch (Throwable th3) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (Arrays.equals(e.f76944a, bArr2)) {
            h.z("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            h.z("Unsupported meta version");
            return null;
        }
        int iD2 = (int) b.d(fileInputStream, 1);
        byte[] bArrC2 = b.c(fileInputStream, (int) b.d(fileInputStream, 4), (int) b.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            h.z("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            a[] aVarArrE = e(byteArrayInputStream2, iD2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrE;
        } catch (Throwable th5) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public static a[] e(ByteArrayInputStream byteArrayInputStream, int i14, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i14 != aVarArr.length) {
            h.z("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i14];
        int[] iArr = new int[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            int iD = (int) b.d(byteArrayInputStream, 2);
            iArr[i15] = (int) b.d(byteArrayInputStream, 2);
            strArr[i15] = new String(b.b(byteArrayInputStream, iD), StandardCharsets.UTF_8);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            a aVar = aVarArr[i16];
            if (!aVar.f76929b.equals(strArr[i16])) {
                h.z("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i17 = iArr[i16];
            aVar.f76932e = i17;
            aVar.f76935h = c(byteArrayInputStream, i17);
        }
        return aVarArr;
    }

    public static a[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i14, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i14 != aVarArr.length) {
            h.z("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            b.d(byteArrayInputStream, 2);
            String str = new String(b.b(byteArrayInputStream, (int) b.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jD = b.d(byteArrayInputStream, 4);
            int iD = (int) b.d(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i16 = 0; i16 < aVarArr.length; i16++) {
                    if (aVarArr[i16].f76929b.equals(strSubstring)) {
                        aVar = aVarArr[i16];
                        break;
                    }
                }
            }
            if (aVar == null) {
                h.z("Missing profile key: ".concat(str));
                return null;
            }
            aVar.f76931d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, e.f76948e)) {
                aVar.f76932e = iD;
                aVar.f76935h = iArrC;
            }
        }
        return aVarArr;
    }

    public static a[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e.f76945b)) {
            h.z("Unsupported version");
            return null;
        }
        int iD = (int) b.d(fileInputStream, 1);
        byte[] bArrC = b.c(fileInputStream, (int) b.d(fileInputStream, 4), (int) b.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            h.z("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            a[] aVarArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return aVarArrH;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] h(ByteArrayInputStream byteArrayInputStream, String str, int i14) throws IOException {
        int i15 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            int iD = (int) b.d(byteArrayInputStream, 2);
            int iD2 = (int) b.d(byteArrayInputStream, 2);
            aVarArr[i16] = new a(str, new String(b.b(byteArrayInputStream, iD), StandardCharsets.UTF_8), b.d(byteArrayInputStream, 4), 0L, iD2, (int) b.d(byteArrayInputStream, 4), (int) b.d(byteArrayInputStream, 4), new int[iD2], new TreeMap());
        }
        int i17 = 0;
        while (i17 < i14) {
            a aVar = aVarArr[i17];
            int iAvailable = byteArrayInputStream.available();
            int i18 = aVar.f76933f;
            int i19 = aVar.f76934g;
            TreeMap<Integer, Integer> treeMap = aVar.f76936i;
            int i24 = iAvailable - i18;
            int iD3 = i15;
            while (byteArrayInputStream.available() > i24) {
                iD3 += (int) b.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) b.d(byteArrayInputStream, 2);
                while (iD4 > 0) {
                    b.d(byteArrayInputStream, 2);
                    int iD5 = (int) b.d(byteArrayInputStream, 1);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            b.d(byteArrayInputStream, 1);
                            int i25 = i15;
                            int i26 = i17;
                            for (int iD6 = (int) b.d(byteArrayInputStream, 1); iD6 > 0; iD6--) {
                                b.d(byteArrayInputStream, 2);
                            }
                            iD5--;
                            i15 = i25;
                            i17 = i26;
                        }
                    }
                    iD4--;
                    i15 = i15;
                    i17 = i17;
                }
            }
            int i27 = i15;
            int i28 = i17;
            if (byteArrayInputStream.available() != i24) {
                h.z("Read too much data during profile line parse");
                return null;
            }
            aVar.f76935h = c(byteArrayInputStream, aVar.f76932e);
            BitSet bitSetValueOf = BitSet.valueOf(b.b(byteArrayInputStream, (((i19 * 2) + 7) & (-8)) / 8));
            for (int i29 = i27; i29 < i19; i29++) {
                int i30 = bitSetValueOf.get(i29) ? 2 : i27;
                if (bitSetValueOf.get(i29 + i19)) {
                    i30 |= 4;
                }
                if (i30 != 0) {
                    Integer numValueOf = treeMap.get(Integer.valueOf(i29));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i27);
                    }
                    treeMap.put(Integer.valueOf(i29), Integer.valueOf(i30 | numValueOf.intValue()));
                }
            }
            i17 = i28 + 1;
            i15 = i27;
        }
        return aVarArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = e.f76944a;
        int i14 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e.f76945b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(aVarArr, bArr3);
                b.e(byteArrayOutputStream, aVarArr.length, 1);
                b.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = b.a(bArrA);
                b.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = e.f76947d;
            if (Arrays.equals(bArr, bArr4)) {
                b.e(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f76936i.size() * 4;
                    String strB = b(aVar.f76928a, aVar.f76929b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    b.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    b.f(byteArrayOutputStream, aVar.f76935h.length);
                    b.e(byteArrayOutputStream, size, 4);
                    b.e(byteArrayOutputStream, aVar.f76930c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = aVar.f76936i.keySet().iterator();
                    while (it.hasNext()) {
                        b.f(byteArrayOutputStream, it.next().intValue());
                        b.f(byteArrayOutputStream, 0);
                    }
                    for (int i15 : aVar.f76935h) {
                        b.f(byteArrayOutputStream, i15);
                    }
                }
                return true;
            }
            byte[] bArr5 = e.f76946c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(aVarArr, bArr5);
                b.e(byteArrayOutputStream, aVarArr.length, 1);
                b.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = b.a(bArrA3);
                b.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = e.f76948e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            b.f(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f76928a;
                TreeMap<Integer, Integer> treeMap = aVar2.f76936i;
                String strB2 = b(str, aVar2.f76929b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                b.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                b.f(byteArrayOutputStream, treeMap.size());
                b.f(byteArrayOutputStream, aVar2.f76935h.length);
                b.e(byteArrayOutputStream, aVar2.f76930c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    b.f(byteArrayOutputStream, it3.next().intValue());
                }
                for (int i16 : aVar2.f76935h) {
                    b.f(byteArrayOutputStream, i16);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            b.f(byteArrayOutputStream2, aVarArr.length);
            int i17 = 2;
            int i18 = 2;
            for (a aVar3 : aVarArr) {
                b.e(byteArrayOutputStream2, aVar3.f76930c, 4);
                b.e(byteArrayOutputStream2, aVar3.f76931d, 4);
                b.e(byteArrayOutputStream2, aVar3.f76934g, 4);
                String strB3 = b(aVar3.f76928a, aVar3.f76929b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                b.f(byteArrayOutputStream2, length2);
                i18 = i18 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i18 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(c.DEX_FILES, i18, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i19 = 0;
            for (int i24 = 0; i24 < aVarArr.length; i24++) {
                try {
                    a aVar4 = aVarArr[i24];
                    b.f(byteArrayOutputStream3, i24);
                    b.f(byteArrayOutputStream3, aVar4.f76932e);
                    i19 = i19 + 4 + (aVar4.f76932e * i17);
                    int[] iArr = aVar4.f76935h;
                    int length3 = iArr.length;
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < length3) {
                        int i27 = iArr[i25];
                        b.f(byteArrayOutputStream3, i27 - i26);
                        i25++;
                        i17 = i17;
                        i26 = i27;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(c.CLASSES, i19, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i28 = 0;
            int i29 = 0;
            while (i28 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i28];
                    Iterator<Map.Entry<Integer, Integer>> it4 = aVar5.f76936i.entrySet().iterator();
                    int iIntValue = i14;
                    while (it4.hasNext()) {
                        iIntValue |= it4.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream5, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream6, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            b.f(byteArrayOutputStream4, i28);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i30 = i29 + 6;
                            ArrayList arrayList4 = arrayList3;
                            b.e(byteArrayOutputStream4, length4, 4);
                            b.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i29 = i30 + length4;
                            i28++;
                            arrayList3 = arrayList4;
                            i14 = 0;
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (Throwable th9) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th9;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                        throw th9;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i29 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i29 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(c.METHODS, i29, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(fVar3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + ((long) (arrayList2.size() * 16));
            b.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i34 = 0;
            while (i34 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i34);
                c cVar = fVar4.f76951a;
                byte[] bArr7 = fVar4.f76952b;
                b.e(byteArrayOutputStream, cVar.f76941a, 4);
                b.e(byteArrayOutputStream, size2, 4);
                if (fVar4.f76953c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = b.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    b.e(byteArrayOutputStream, bArrA5.length, 4);
                    b.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    b.e(byteArrayOutputStream, bArr7.length, 4);
                    b.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i34++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i35 = 0; i35 < arrayList6.size(); i35++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i35));
            }
            return true;
        } catch (Throwable th11) {
            try {
                byteArrayOutputStream2.close();
                throw th11;
            } catch (Throwable th12) {
                th11.addSuppressed(th12);
                throw th11;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        m(byteArrayOutputStream, aVar);
        int i14 = aVar.f76934g;
        int[] iArr = aVar.f76935h;
        int length = iArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int i17 = iArr[i15];
            b.f(byteArrayOutputStream, i17 - i16);
            i15++;
            i16 = i17;
        }
        byte[] bArr = new byte[(((i14 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.f76936i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i18 = iIntValue / 8;
                bArr[i18] = (byte) (bArr[i18] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i19 = iIntValue + i14;
                int i24 = i19 / 8;
                bArr[i24] = (byte) ((1 << (i19 % 8)) | bArr[i24]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        b.f(byteArrayOutputStream, str.getBytes(charset).length);
        b.f(byteArrayOutputStream, aVar.f76932e);
        b.e(byteArrayOutputStream, aVar.f76933f, 4);
        b.e(byteArrayOutputStream, aVar.f76930c, 4);
        b.e(byteArrayOutputStream, aVar.f76934g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i14, a aVar) throws IOException {
        int i15 = aVar.f76934g;
        byte[] bArr = new byte[(((Integer.bitCount(i14 & (-2)) * i15) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.f76936i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i16 = 0;
            for (int i17 = 1; i17 <= 4; i17 <<= 1) {
                if (i17 != 1 && (i17 & i14) != 0) {
                    if ((i17 & iIntValue2) == i17) {
                        int i18 = (i16 * i15) + iIntValue;
                        int i19 = i18 / 8;
                        bArr[i19] = (byte) ((1 << (i18 % 8)) | bArr[i19]);
                    }
                    i16++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i14 = 0;
        for (Map.Entry<Integer, Integer> entry : aVar.f76936i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                b.f(byteArrayOutputStream, iIntValue - i14);
                b.f(byteArrayOutputStream, 0);
                i14 = iIntValue;
            }
        }
    }
}

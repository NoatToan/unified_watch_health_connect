package defpackage;

import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class xbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38944a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f38945b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) throws IOException {
        aa8.h(inputStream);
        int iJ = aa8.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            aa8.j(inputStream);
            for (int iJ2 = aa8.j(inputStream); iJ2 > 0; iJ2--) {
                aa8.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, wu6[] wu6VarArr) throws IOException {
        if (Arrays.equals(bArr, ybi.f40017a)) {
            N(outputStream, wu6VarArr);
            return true;
        }
        if (Arrays.equals(bArr, ybi.f40018b)) {
            M(outputStream, wu6VarArr);
            return true;
        }
        if (Arrays.equals(bArr, ybi.d)) {
            K(outputStream, wu6VarArr);
            return true;
        }
        if (Arrays.equals(bArr, ybi.c)) {
            L(outputStream, wu6VarArr);
            return true;
        }
        if (!Arrays.equals(bArr, ybi.e)) {
            return false;
        }
        J(outputStream, wu6VarArr);
        return true;
    }

    public static void C(OutputStream outputStream, wu6 wu6Var) throws IOException {
        int[] iArr = wu6Var.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            aa8.p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    public static zor D(wu6[] wu6VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aa8.p(byteArrayOutputStream, wu6VarArr.length);
            int i = 2;
            for (wu6 wu6Var : wu6VarArr) {
                aa8.q(byteArrayOutputStream, wu6Var.c);
                aa8.q(byteArrayOutputStream, wu6Var.d);
                aa8.q(byteArrayOutputStream, wu6Var.g);
                String strJ = j(wu6Var.f38358a, wu6Var.f38359b, ybi.f40017a);
                int iK = aa8.k(strJ);
                aa8.p(byteArrayOutputStream, iK);
                i = i + 14 + iK;
                aa8.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                zor zorVar = new zor(zl9.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return zorVar;
            }
            throw aa8.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f38944a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, wu6 wu6Var) throws IOException {
        I(outputStream, wu6Var);
        C(outputStream, wu6Var);
        H(outputStream, wu6Var);
    }

    public static void G(OutputStream outputStream, wu6 wu6Var, String str) throws IOException {
        aa8.p(outputStream, aa8.k(str));
        aa8.p(outputStream, wu6Var.e);
        aa8.q(outputStream, wu6Var.f);
        aa8.q(outputStream, wu6Var.c);
        aa8.q(outputStream, wu6Var.g);
        aa8.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, wu6 wu6Var) throws IOException {
        byte[] bArr = new byte[k(wu6Var.g)];
        for (Map.Entry<Integer, Integer> entry : wu6Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, wu6Var);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, wu6Var);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, wu6 wu6Var) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : wu6Var.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                aa8.p(outputStream, iIntValue - i);
                aa8.p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        aa8.p(outputStream, wu6VarArr.length);
        for (wu6 wu6Var : wu6VarArr) {
            String strJ = j(wu6Var.f38358a, wu6Var.f38359b, ybi.e);
            aa8.p(outputStream, aa8.k(strJ));
            aa8.p(outputStream, wu6Var.i.size());
            aa8.p(outputStream, wu6Var.h.length);
            aa8.q(outputStream, wu6Var.c);
            aa8.n(outputStream, strJ);
            Iterator<Integer> it = wu6Var.i.keySet().iterator();
            while (it.hasNext()) {
                aa8.p(outputStream, it.next().intValue());
            }
            for (int i : wu6Var.h) {
                aa8.p(outputStream, i);
            }
        }
    }

    public static void K(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        aa8.r(outputStream, wu6VarArr.length);
        for (wu6 wu6Var : wu6VarArr) {
            int size = wu6Var.i.size() * 4;
            String strJ = j(wu6Var.f38358a, wu6Var.f38359b, ybi.d);
            aa8.p(outputStream, aa8.k(strJ));
            aa8.p(outputStream, wu6Var.h.length);
            aa8.q(outputStream, size);
            aa8.q(outputStream, wu6Var.c);
            aa8.n(outputStream, strJ);
            Iterator<Integer> it = wu6Var.i.keySet().iterator();
            while (it.hasNext()) {
                aa8.p(outputStream, it.next().intValue());
                aa8.p(outputStream, 0);
            }
            for (int i : wu6Var.h) {
                aa8.p(outputStream, i);
            }
        }
    }

    public static void L(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        byte[] bArrB = b(wu6VarArr, ybi.c);
        aa8.r(outputStream, wu6VarArr.length);
        aa8.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        byte[] bArrB = b(wu6VarArr, ybi.f40018b);
        aa8.r(outputStream, wu6VarArr.length);
        aa8.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        O(outputStream, wu6VarArr);
    }

    public static void O(OutputStream outputStream, wu6[] wu6VarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(wu6VarArr));
        arrayList.add(c(wu6VarArr));
        arrayList.add(d(wu6VarArr));
        long length2 = ((long) ybi.f40017a.length) + ((long) f38944a.length) + 4 + ((long) (arrayList.size() * 16));
        aa8.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            zor zorVar = (zor) arrayList.get(i);
            aa8.q(outputStream, zorVar.f41529a.b());
            aa8.q(outputStream, length2);
            if (zorVar.d) {
                byte[] bArr = zorVar.c;
                long length3 = bArr.length;
                byte[] bArrB = aa8.b(bArr);
                arrayList2.add(bArrB);
                aa8.q(outputStream, bArrB.length);
                aa8.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(zorVar.c);
                aa8.q(outputStream, zorVar.c.length);
                aa8.q(outputStream, 0L);
                length = zorVar.c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static int a(wu6 wu6Var) {
        Iterator<Map.Entry<Integer, Integer>> it = wu6Var.i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    public static byte[] b(wu6[] wu6VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int iK = 0;
        for (wu6 wu6Var : wu6VarArr) {
            iK += aa8.k(j(wu6Var.f38358a, wu6Var.f38359b, bArr)) + 16 + (wu6Var.e * 2) + wu6Var.f + k(wu6Var.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, ybi.c)) {
            int length = wu6VarArr.length;
            while (i < length) {
                wu6 wu6Var2 = wu6VarArr[i];
                G(byteArrayOutputStream, wu6Var2, j(wu6Var2.f38358a, wu6Var2.f38359b, bArr));
                F(byteArrayOutputStream, wu6Var2);
                i++;
            }
        } else {
            for (wu6 wu6Var3 : wu6VarArr) {
                G(byteArrayOutputStream, wu6Var3, j(wu6Var3.f38358a, wu6Var3.f38359b, bArr));
            }
            int length2 = wu6VarArr.length;
            while (i < length2) {
                F(byteArrayOutputStream, wu6VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw aa8.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static zor c(wu6[] wu6VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < wu6VarArr.length; i2++) {
            try {
                wu6 wu6Var = wu6VarArr[i2];
                aa8.p(byteArrayOutputStream, i2);
                aa8.p(byteArrayOutputStream, wu6Var.e);
                i = i + 4 + (wu6Var.e * 2);
                C(byteArrayOutputStream, wu6Var);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            zor zorVar = new zor(zl9.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return zorVar;
        }
        throw aa8.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static zor d(wu6[] wu6VarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < wu6VarArr.length; i2++) {
            try {
                wu6 wu6Var = wu6VarArr[i2];
                int iA = a(wu6Var);
                byte[] bArrE = e(wu6Var);
                byte[] bArrF = f(wu6Var);
                aa8.p(byteArrayOutputStream, i2);
                int length = bArrE.length + 2 + bArrF.length;
                aa8.q(byteArrayOutputStream, length);
                aa8.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            zor zorVar = new zor(zl9.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return zorVar;
        }
        throw aa8.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(wu6 wu6Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, wu6Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(wu6 wu6Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, wu6Var);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static wu6 i(wu6[] wu6VarArr, String str) {
        if (wu6VarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i = 0; i < wu6VarArr.length; i++) {
            if (wu6VarArr[i].f38359b.equals(strH)) {
                return wu6VarArr[i];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = ybi.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + ybi.a(bArr) + str2;
    }

    public static int k(int i) {
        return y(i * 2) / 8;
    }

    public static int l(int i, int i2, int i3) {
        if (i == 1) {
            throw aa8.c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw aa8.c("Unexpected flag: " + i);
    }

    public static int[] m(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iH = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iH += aa8.h(inputStream);
            iArr[i2] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(l(2, i, i2)) ? 2 : 0;
        return bitSet.get(l(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, aa8.d(inputStream, bArr.length))) {
            return aa8.d(inputStream, ybi.f40018b.length);
        }
        throw aa8.c("Invalid magic");
    }

    public static void p(InputStream inputStream, wu6 wu6Var) throws IOException {
        int iAvailable = inputStream.available() - wu6Var.f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += aa8.h(inputStream);
            wu6Var.i.put(Integer.valueOf(iH), 1);
            for (int iH2 = aa8.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw aa8.c("Read too much data during profile line parse");
        }
    }

    public static wu6[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, wu6[] wu6VarArr) throws IOException {
        if (Arrays.equals(bArr, ybi.f)) {
            if (Arrays.equals(ybi.f40017a, bArr2)) {
                throw aa8.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, wu6VarArr);
        }
        if (Arrays.equals(bArr, ybi.g)) {
            return t(inputStream, bArr2, wu6VarArr);
        }
        throw aa8.c("Unsupported meta version");
    }

    public static wu6[] r(InputStream inputStream, byte[] bArr, wu6[] wu6VarArr) throws IOException {
        if (!Arrays.equals(bArr, ybi.f)) {
            throw aa8.c("Unsupported meta version");
        }
        int iJ = aa8.j(inputStream);
        byte[] bArrE = aa8.e(inputStream, (int) aa8.i(inputStream), (int) aa8.i(inputStream));
        if (inputStream.read() > 0) {
            throw aa8.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            wu6[] wu6VarArrS = s(byteArrayInputStream, iJ, wu6VarArr);
            byteArrayInputStream.close();
            return wu6VarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static wu6[] s(InputStream inputStream, int i, wu6[] wu6VarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new wu6[0];
        }
        if (i != wu6VarArr.length) {
            throw aa8.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = aa8.h(inputStream);
            iArr[i2] = aa8.h(inputStream);
            strArr[i2] = aa8.f(inputStream, iH);
        }
        for (int i3 = 0; i3 < i; i3++) {
            wu6 wu6Var = wu6VarArr[i3];
            if (!wu6Var.f38359b.equals(strArr[i3])) {
                throw aa8.c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            wu6Var.e = i4;
            wu6Var.h = m(inputStream, i4);
        }
        return wu6VarArr;
    }

    public static wu6[] t(InputStream inputStream, byte[] bArr, wu6[] wu6VarArr) throws IOException {
        int iH = aa8.h(inputStream);
        byte[] bArrE = aa8.e(inputStream, (int) aa8.i(inputStream), (int) aa8.i(inputStream));
        if (inputStream.read() > 0) {
            throw aa8.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            wu6[] wu6VarArrU = u(byteArrayInputStream, bArr, iH, wu6VarArr);
            byteArrayInputStream.close();
            return wu6VarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static wu6[] u(InputStream inputStream, byte[] bArr, int i, wu6[] wu6VarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new wu6[0];
        }
        if (i != wu6VarArr.length) {
            throw aa8.c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            aa8.h(inputStream);
            String strF = aa8.f(inputStream, aa8.h(inputStream));
            long jI = aa8.i(inputStream);
            int iH = aa8.h(inputStream);
            wu6 wu6VarI = i(wu6VarArr, strF);
            if (wu6VarI == null) {
                throw aa8.c("Missing profile key: " + strF);
            }
            wu6VarI.d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, ybi.e)) {
                wu6VarI.e = iH;
                wu6VarI.h = iArrM;
            }
        }
        return wu6VarArr;
    }

    public static void v(InputStream inputStream, wu6 wu6Var) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(aa8.d(inputStream, aa8.a(wu6Var.g * 2)));
        int i = 0;
        while (true) {
            int i2 = wu6Var.g;
            if (i >= i2) {
                return;
            }
            int iN = n(bitSetValueOf, i, i2);
            if (iN != 0) {
                Integer num = wu6Var.i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                wu6Var.i.put(Integer.valueOf(i), Integer.valueOf(iN | num.intValue()));
            }
            i++;
        }
    }

    public static wu6[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ybi.f40018b)) {
            throw aa8.c("Unsupported version");
        }
        int iJ = aa8.j(inputStream);
        byte[] bArrE = aa8.e(inputStream, (int) aa8.i(inputStream), (int) aa8.i(inputStream));
        if (inputStream.read() > 0) {
            throw aa8.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            wu6[] wu6VarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return wu6VarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static wu6[] x(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new wu6[0];
        }
        wu6[] wu6VarArr = new wu6[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = aa8.h(inputStream);
            int iH2 = aa8.h(inputStream);
            wu6VarArr[i2] = new wu6(str, aa8.f(inputStream, iH), aa8.i(inputStream), 0L, iH2, (int) aa8.i(inputStream), (int) aa8.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            wu6 wu6Var = wu6VarArr[i3];
            p(inputStream, wu6Var);
            wu6Var.h = m(inputStream, wu6Var.e);
            v(inputStream, wu6Var);
        }
        return wu6VarArr;
    }

    public static int y(int i) {
        return (i + 7) & (-8);
    }

    public static void z(byte[] bArr, int i, int i2, wu6 wu6Var) {
        int iL = l(i, i2, wu6Var.g);
        int i3 = iL / 8;
        bArr[i3] = (byte) ((1 << (iL % 8)) | bArr[i3]);
    }
}

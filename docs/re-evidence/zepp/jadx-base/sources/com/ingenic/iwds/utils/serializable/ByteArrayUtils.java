package com.ingenic.iwds.utils.serializable;

import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StatFs;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ingenic.iwds.common.exception.FileTransferException;
import com.ingenic.iwds.common.exception.IwdsException;
import com.ingenic.iwds.os.SafeParcel;
import com.ingenic.iwds.os.SafeParcelable;
import com.ingenic.iwds.uniconnect.Connection;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import com.xiaomi.ai.api.AIApiConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public final class ByteArrayUtils {
    private static final String a = "ByteArrayUtils";
    private static final boolean b = false;
    private static String c;
    private static final HashMap<String, Parcelable.Creator> d = new HashMap<>();
    private static final HashMap<String, SafeParcelable.Creator> e = new HashMap<>();

    private static short[] A(Connection connection) throws IOException {
        int iQ = q(connection);
        short[] sArr = new short[iQ];
        for (int i = 0; i < iQ; i++) {
            sArr[i] = z(connection);
        }
        return sArr;
    }

    private static int A0(byte[] bArr, int i, char c2) {
        int i2 = i + 1;
        bArr[i] = (byte) ((65280 & c2) >> 8);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((c2 & 255) >> 0);
        return i3;
    }

    private static SparseArray B(Connection connection) throws IOException {
        int iQ = q(connection);
        SparseArray sparseArray = new SparseArray(iQ);
        for (int i = 0; i < iQ; i++) {
            sparseArray.put(q(connection), decode(connection, null, null, null));
        }
        return sparseArray;
    }

    private static byte[] B0(byte[] bArr, int i, CharSequence charSequence) {
        byte[] bytes = charSequence.toString().getBytes(Charset.forName("UTF-8"));
        int length = bytes.length;
        byte[] bArrJ0 = j0(i, length + 4, bArr);
        System.arraycopy(bytes, 0, bArrJ0, E0(bArrJ0, i, length), length);
        return bArrJ0;
    }

    private static SparseBooleanArray C(Connection connection) throws IOException {
        int iQ = q(connection);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iQ);
        for (int i = 0; i < iQ; i++) {
            sparseBooleanArray.put(q(connection), c(connection));
        }
        return sparseBooleanArray;
    }

    private static int C0(byte[] bArr, int i, double d2) {
        return F0(bArr, i, Double.doubleToLongBits(d2));
    }

    private static String D(Connection connection) throws IOException {
        int iQ = q(connection);
        byte[] bArr = new byte[iQ];
        InputStream inputStream = connection.getInputStream();
        int i = 0;
        while (iQ > 0) {
            int i2 = inputStream.read(bArr, i, iQ);
            i += i2;
            iQ -= i2;
        }
        return w0(bArr);
    }

    private static int D0(byte[] bArr, int i, float f) {
        return E0(bArr, i, Float.floatToIntBits(f));
    }

    private static String[] E(Connection connection) throws IOException {
        int iQ = q(connection);
        String[] strArr = new String[iQ];
        for (int i = 0; i < iQ; i++) {
            strArr[i] = D(connection);
        }
        return strArr;
    }

    private static int E0(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (((-16777216) & i2) >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((16711680 & i2) >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((65280 & i2) >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 & 255) >> 0);
        return i6;
    }

    private static byte[] F(Object[] objArr) {
        byte[] bArrJ0 = new byte[5];
        int iE0 = E0(bArrJ0, z0(bArrJ0, 0, (byte) 17), objArr.length);
        for (Object obj : objArr) {
            byte[] bArrEncode = encode(obj, null, null);
            bArrJ0 = j0(iE0, bArrEncode.length, bArrJ0);
            System.arraycopy(bArrEncode, 0, bArrJ0, iE0, bArrEncode.length);
            iE0 += bArrEncode.length;
        }
        return bArrJ0;
    }

    private static int F0(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) (((-72057594037927936L) & j) >> 56);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((71776119061217280L & j) >> 48);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((280375465082880L & j) >> 40);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((1095216660480L & j) >> 32);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((4278190080L & j) >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((16711680 & j) >> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((65280 & j) >> 8);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j & 255) >> 0);
        return i9;
    }

    private static byte[] G(boolean z) {
        byte[] bArr = new byte[2];
        y0(bArr, z0(bArr, 0, (byte) 9), z);
        return bArr;
    }

    private static <T extends Parcelable> byte[] G0(byte[] bArr, int i, Parcelable parcelable, Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (creator == null) {
            bArr = J0(bArr, i, parcelable.getClass().getName());
            i = bArr.length;
        }
        byte[] bArrJ0 = j0(i, 4, bArr);
        int iE0 = E0(bArrJ0, i, bArrMarshall.length);
        byte[] bArrJ1 = j0(iE0, bArrMarshall.length, bArrJ0);
        System.arraycopy(bArrMarshall, 0, bArrJ1, iE0, bArrMarshall.length);
        return bArrJ1;
    }

    private static byte[] H(boolean[] zArr) {
        int length = zArr.length;
        byte[] bArr = new byte[(length * 1) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 23), length);
        for (boolean z : zArr) {
            iE0 = y0(bArr, iE0, z);
        }
        return bArr;
    }

    private static <T extends SafeParcelable> byte[] H0(byte[] bArr, int i, SafeParcelable safeParcelable, SafeParcelable.Creator<T> creator) {
        SafeParcel safeParcelObtain = SafeParcel.obtain();
        safeParcelable.writeToParcel(safeParcelObtain, 0);
        byte[] bArrMarshall = safeParcelObtain.marshall();
        safeParcelObtain.recycle();
        if (creator == null) {
            bArr = J0(bArr, i, safeParcelable.getClass().getName());
            i = bArr.length;
        }
        byte[] bArrJ0 = j0(i, 4, bArr);
        int iE0 = E0(bArrJ0, i, bArrMarshall.length);
        byte[] bArrJ1 = j0(iE0, bArrMarshall.length, bArrJ0);
        System.arraycopy(bArrMarshall, 0, bArrJ1, iE0, bArrMarshall.length);
        return bArrJ1;
    }

    private static byte[] I(byte b2) {
        byte[] bArr = new byte[2];
        z0(bArr, z0(bArr, 0, (byte) 20), b2);
        return bArr;
    }

    private static int I0(byte[] bArr, int i, short s) {
        int i2 = i + 1;
        bArr[i] = (byte) ((65280 & s) >> 8);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((s & 255) >> 0);
        return i3;
    }

    private static byte[] J(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(length * 1) + 1 + 4];
        int iE0 = E0(bArr2, z0(bArr2, 0, (byte) 13), length);
        for (byte b2 : bArr) {
            iE0 = z0(bArr2, iE0, b2);
        }
        return bArr2;
    }

    private static byte[] J0(byte[] bArr, int i, String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        int length = bytes.length;
        byte[] bArrJ0 = j0(i, length + 4, bArr);
        System.arraycopy(bytes, 0, bArrJ0, E0(bArrJ0, i, length), length);
        return bArrJ0;
    }

    private static byte[] K(char c2) {
        byte[] bArr = new byte[3];
        A0(bArr, z0(bArr, 0, (byte) 25), c2);
        return bArr;
    }

    private static byte[] L(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[(length * 2) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 29), length);
        for (char c2 : cArr) {
            iE0 = A0(bArr, iE0, c2);
        }
        return bArr;
    }

    private static byte[] M(CharSequence charSequence) {
        byte[] bArr = new byte[1];
        byte[] bArrB0 = B0(bArr, z0(bArr, 0, (byte) 10), charSequence);
        int length = bArrB0.length;
        return bArrB0;
    }

    private static byte[] N(CharSequence[] charSequenceArr) {
        byte[] bArrB0 = new byte[5];
        int iE0 = E0(bArrB0, z0(bArrB0, 0, (byte) 24), charSequenceArr.length);
        for (CharSequence charSequence : charSequenceArr) {
            bArrB0 = B0(bArrB0, iE0, charSequence);
            iE0 = bArrB0.length;
        }
        return bArrB0;
    }

    private static byte[] O(double d2) {
        byte[] bArr = new byte[9];
        C0(bArr, z0(bArr, 0, (byte) 8), d2);
        return bArr;
    }

    private static byte[] P(double[] dArr) {
        int length = dArr.length;
        byte[] bArr = new byte[(length * 8) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 28), length);
        for (double d2 : dArr) {
            iE0 = C0(bArr, iE0, d2);
        }
        return bArr;
    }

    private static byte[] Q(float f) {
        byte[] bArr = new byte[5];
        D0(bArr, z0(bArr, 0, (byte) 7), f);
        return bArr;
    }

    private static byte[] R(float[] fArr) {
        int length = fArr.length;
        byte[] bArr = new byte[(length * 4) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 27), length);
        for (float f : fArr) {
            iE0 = D0(bArr, iE0, f);
        }
        return bArr;
    }

    private static byte[] S(int i) {
        byte[] bArr = new byte[5];
        E0(bArr, z0(bArr, 0, (byte) 1), i);
        return bArr;
    }

    private static byte[] T(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[(length * 4) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 18), length);
        for (int i : iArr) {
            iE0 = E0(bArr, iE0, i);
        }
        return bArr;
    }

    private static byte[] U(List list) {
        int size = list.size();
        byte[] bArrJ0 = new byte[5];
        int iE0 = E0(bArrJ0, z0(bArrJ0, 0, (byte) 11), size);
        for (int i = 0; i < size; i++) {
            byte[] bArrEncode = encode(list.get(i), null, null);
            bArrJ0 = j0(iE0, bArrEncode.length, bArrJ0);
            System.arraycopy(bArrEncode, 0, bArrJ0, iE0, bArrEncode.length);
            iE0 += bArrEncode.length;
        }
        return bArrJ0;
    }

    private static byte[] V(long j) {
        byte[] bArr = new byte[9];
        F0(bArr, z0(bArr, 0, (byte) 6), j);
        return bArr;
    }

    private static byte[] W(long[] jArr) {
        int length = jArr.length;
        byte[] bArr = new byte[(length * 8) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 19), length);
        for (long j : jArr) {
            iE0 = F0(bArr, iE0, j);
        }
        return bArr;
    }

    private static byte[] X(Map map) {
        byte[] bArrJ0 = new byte[5];
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iE0 = E0(bArrJ0, z0(bArrJ0, 0, (byte) 2), setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            byte[] bArrEncode = encode(entry.getKey(), null, null);
            byte[] bArrJ1 = j0(iE0, bArrEncode.length, bArrJ0);
            System.arraycopy(bArrEncode, 0, bArrJ1, iE0, bArrEncode.length);
            int length = iE0 + bArrEncode.length;
            byte[] bArrEncode2 = encode(entry.getValue(), null, null);
            bArrJ0 = j0(length, bArrEncode2.length, bArrJ1);
            System.arraycopy(bArrEncode2, 0, bArrJ0, length, bArrEncode2.length);
            iE0 = length + bArrEncode2.length;
        }
        return bArrJ0;
    }

    private static <T extends Parcelable> byte[] Y(Parcelable parcelable, Parcelable.Creator<T> creator) {
        byte[] bArr = new byte[1];
        return G0(bArr, z0(bArr, 0, (byte) 4), parcelable, creator);
    }

    private static byte[] Z(Parcelable[] parcelableArr) {
        byte[] bArrG0 = new byte[5];
        int iE0 = E0(bArrG0, z0(bArrG0, 0, (byte) 16), parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            bArrG0 = G0(bArrG0, iE0, parcelable, null);
            iE0 = bArrG0.length;
        }
        return bArrG0;
    }

    private static Object[] a(Connection connection) throws IOException {
        int iQ = q(connection);
        Object[] objArr = new Object[iQ];
        for (int i = 0; i < iQ; i++) {
            objArr[i] = decode(connection, null, null, null);
        }
        return objArr;
    }

    private static <T extends SafeParcelable> byte[] a0(SafeParcelable safeParcelable, SafeParcelable.Creator<T> creator) {
        byte[] bArr = new byte[1];
        return H0(bArr, z0(bArr, 0, (byte) 3), safeParcelable, creator);
    }

    private static ArrayList b(Connection connection) throws IOException {
        int iQ = q(connection);
        ArrayList arrayList = new ArrayList(iQ);
        for (int i = 0; i < iQ; i++) {
            arrayList.add(decode(connection, null, null, null));
        }
        return arrayList;
    }

    private static byte[] b0(SafeParcelable[] safeParcelableArr) {
        byte[] bArrH0 = new byte[5];
        int iE0 = E0(bArrH0, z0(bArrH0, 0, (byte) 15), safeParcelableArr.length);
        for (SafeParcelable safeParcelable : safeParcelableArr) {
            bArrH0 = H0(bArrH0, iE0, safeParcelable, null);
            iE0 = bArrH0.length;
        }
        return bArrH0;
    }

    private static boolean c(Connection connection) throws IOException {
        int i = 1;
        byte[] bArr = new byte[1];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return k0(bArr);
    }

    private static byte[] c0(Serializable serializable) {
        byte[] bArr = new byte[1];
        int iZ0 = z0(bArr, 0, (byte) 21);
        String name = serializable.getClass().getName();
        byte[] bArrJ0 = J0(bArr, iZ0, name);
        int length = bArrJ0.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bArrJ0 = j0(length, byteArray.length + 4, bArrJ0);
            System.arraycopy(byteArray, 0, bArrJ0, E0(bArrJ0, length, byteArray.length), byteArray.length);
            return bArrJ0;
        } catch (IOException e2) {
            IwdsAssert.dieIf(a, true, "Parcelable encountered IOException writing serializable object (name = " + name + ")");
            e2.printStackTrace();
            return bArrJ0;
        }
    }

    private static boolean[] d(Connection connection) throws IOException {
        int iQ = q(connection);
        boolean[] zArr = new boolean[iQ];
        for (int i = 0; i < iQ; i++) {
            zArr[i] = c(connection);
        }
        return zArr;
    }

    private static byte[] d0(short s) {
        byte[] bArr = new byte[3];
        I0(bArr, z0(bArr, 0, (byte) 5), s);
        return bArr;
    }

    public static <T1 extends Parcelable, T2 extends SafeParcelable> Object decode(Connection connection, Parcelable.Creator<T1> creator, SafeParcelable.Creator<T2> creator2, TransferAdapter.TransferAdapterCallback transferAdapterCallback) throws FileTransferException, IOException {
        IwdsAssert.dieIf(a, connection == null, "connection == null");
        byte bE = e(connection);
        switch (bE) {
            case 0:
                return D(connection);
            case 1:
                return Integer.valueOf(q(connection));
            case 2:
                return p(connection);
            case 3:
                return w(connection, creator2);
            case 4:
                return u(connection, creator);
            case 5:
                return Short.valueOf(z(connection));
            case 6:
                return Long.valueOf(s(connection));
            case 7:
                return Float.valueOf(n(connection));
            case 8:
                return Double.valueOf(k(connection));
            case 9:
                return Boolean.valueOf(c(connection));
            case 10:
                return i(connection);
            case 11:
                return b(connection);
            case 12:
                return B(connection);
            case 13:
                return f(connection);
            case 14:
                return E(connection);
            case 15:
                return x(connection);
            case 16:
                return v(connection);
            case 17:
                return a(connection);
            case 18:
                return r(connection);
            case 19:
                return t(connection);
            case 20:
                return Byte.valueOf(e(connection));
            case 21:
                return y(connection);
            case 22:
                return C(connection);
            case 23:
                return d(connection);
            case 24:
                return j(connection);
            case 25:
                return Character.valueOf(g(connection));
            case 26:
                return A(connection);
            case 27:
                return o(connection);
            case 28:
                return l(connection);
            case 29:
                return h(connection);
            case 30:
                IwdsAssert.dieIf(a, transferAdapterCallback == null, "TransferAdapterCallback is null");
                return m(connection, transferAdapterCallback);
            default:
                IwdsAssert.dieIf(a, true, "Unsupported object type code: " + ((int) bE));
                return null;
        }
    }

    private static byte e(Connection connection) throws IOException {
        int i = 1;
        byte[] bArr = new byte[1];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return l0(bArr);
    }

    private static byte[] e0(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[(length * 2) + 1 + 4];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 26), length);
        for (short s : sArr) {
            iE0 = I0(bArr, iE0, s);
        }
        return bArr;
    }

    public static <T1 extends Parcelable, T2 extends SafeParcelable> byte[] encode(Object obj, Parcelable.Creator<T1> creator, SafeParcelable.Creator<T2> creator2) {
        IwdsAssert.dieIf(a, obj == null, "encode object is null");
        if (obj instanceof String) {
            return h0((String) obj);
        }
        if (obj instanceof Integer) {
            return S(((Integer) obj).intValue());
        }
        if (obj instanceof Map) {
            return X((Map) obj);
        }
        if (obj instanceof SafeParcelable) {
            return a0((SafeParcelable) obj, creator2);
        }
        if (obj instanceof Parcelable) {
            return Y((Parcelable) obj, creator);
        }
        if (obj instanceof Short) {
            return d0(((Short) obj).shortValue());
        }
        if (obj instanceof Long) {
            return V(((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            return Q(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return O(((Double) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return G(((Boolean) obj).booleanValue());
        }
        if (obj instanceof CharSequence) {
            return M((CharSequence) obj);
        }
        if (obj instanceof List) {
            return U((List) obj);
        }
        if (obj instanceof SparseArray) {
            return f0((SparseArray) obj);
        }
        if (obj instanceof boolean[]) {
            return H((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return J((byte[]) obj);
        }
        if (obj instanceof String[]) {
            return i0((String[]) obj);
        }
        if (obj instanceof CharSequence[]) {
            return N((CharSequence[]) obj);
        }
        if (obj instanceof SafeParcel[]) {
            return b0((SafeParcelable[]) obj);
        }
        if (obj instanceof Parcelable[]) {
            return Z((Parcelable[]) obj);
        }
        if (obj instanceof int[]) {
            return T((int[]) obj);
        }
        if (obj instanceof long[]) {
            return W((long[]) obj);
        }
        if (obj instanceof Byte) {
            return I(((Byte) obj).byteValue());
        }
        if (obj instanceof Character) {
            return K(((Character) obj).charValue());
        }
        if (obj instanceof char[]) {
            return L((char[]) obj);
        }
        if (obj instanceof short[]) {
            return e0((short[]) obj);
        }
        if (obj instanceof float[]) {
            return R((float[]) obj);
        }
        if (obj instanceof double[]) {
            return P((double[]) obj);
        }
        if (obj instanceof SparseBooleanArray) {
            return g0((SparseBooleanArray) obj);
        }
        if (obj instanceof File) {
            IwdsAssert.dieIf(a, true, "Unsupport File object serialization");
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray() && cls.getComponentType() == Object.class) {
            return F((Object[]) obj);
        }
        if (obj instanceof Serializable) {
            return c0((Serializable) obj);
        }
        IwdsAssert.dieIf(a, true, "Unsupported object type: " + obj.getClass().getName());
        return null;
    }

    private static byte[] f(Connection connection) throws IOException {
        int iQ = q(connection);
        byte[] bArr = new byte[iQ];
        InputStream inputStream = connection.getInputStream();
        int i = 0;
        while (iQ > 0) {
            int i2 = inputStream.read(bArr, i, iQ);
            i += i2;
            iQ -= i2;
        }
        return bArr;
    }

    private static byte[] f0(SparseArray sparseArray) {
        int size = sparseArray.size();
        byte[] bArrJ0 = new byte[5];
        int iE0 = E0(bArrJ0, z0(bArrJ0, 0, (byte) 12), size);
        for (int i = 0; i < size; i++) {
            byte[] bArrJ1 = j0(iE0, 4, bArrJ0);
            int iE1 = E0(bArrJ1, iE0, sparseArray.keyAt(i));
            byte[] bArrEncode = encode(sparseArray.valueAt(i), null, null);
            bArrJ0 = j0(iE1, bArrEncode.length, bArrJ1);
            System.arraycopy(bArrEncode, 0, bArrJ0, iE1, bArrEncode.length);
            iE0 = iE1 + bArrEncode.length;
        }
        return bArrJ0;
    }

    private static char g(Connection connection) throws IOException {
        int i = 2;
        byte[] bArr = new byte[2];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return m0(bArr);
    }

    private static byte[] g0(SparseBooleanArray sparseBooleanArray) {
        int size = sparseBooleanArray.size();
        byte[] bArr = new byte[(size * 5) + 5];
        int iE0 = E0(bArr, z0(bArr, 0, (byte) 22), size);
        for (int i = 0; i < size; i++) {
            iE0 = y0(bArr, E0(bArr, iE0, sparseBooleanArray.keyAt(i)), sparseBooleanArray.valueAt(i));
        }
        return bArr;
    }

    private static char[] h(Connection connection) throws IOException {
        int iQ = q(connection);
        char[] cArr = new char[iQ];
        for (int i = 0; i < iQ; i++) {
            cArr[i] = g(connection);
        }
        return cArr;
    }

    private static byte[] h0(String str) {
        byte[] bArr = new byte[1];
        return J0(bArr, z0(bArr, 0, (byte) 0), str);
    }

    private static CharSequence i(Connection connection) throws IOException {
        int iQ = q(connection);
        byte[] bArr = new byte[iQ];
        InputStream inputStream = connection.getInputStream();
        int i = 0;
        while (iQ > 0) {
            int i2 = inputStream.read(bArr, i, iQ);
            i += i2;
            iQ -= i2;
        }
        return w0(bArr);
    }

    private static byte[] i0(String[] strArr) {
        byte[] bArrJ0 = new byte[5];
        int iE0 = E0(bArrJ0, z0(bArrJ0, 0, (byte) 14), strArr.length);
        for (String str : strArr) {
            bArrJ0 = J0(bArrJ0, iE0, str);
            iE0 = bArrJ0.length;
        }
        return bArrJ0;
    }

    private static CharSequence[] j(Connection connection) throws IOException {
        int iQ = q(connection);
        CharSequence[] charSequenceArr = new CharSequence[iQ];
        for (int i = 0; i < iQ; i++) {
            charSequenceArr[i] = i(connection);
        }
        return charSequenceArr;
    }

    private static byte[] j0(int i, int i2, byte[] bArr) {
        int i3 = i2 + i;
        if (bArr != null && i3 <= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
        return bArr2;
    }

    private static double k(Connection connection) throws IOException {
        int i = 8;
        byte[] bArr = new byte[8];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return n0(bArr);
    }

    private static boolean k0(byte[] bArr) {
        return bArr[0] == 1;
    }

    private static double[] l(Connection connection) throws IOException {
        int iQ = q(connection);
        double[] dArr = new double[iQ];
        for (int i = 0; i < iQ; i++) {
            dArr[i] = k(connection);
        }
        return dArr;
    }

    private static byte l0(byte[] bArr) {
        return bArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01a5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01e3, please report this as an issue */
    private static File m(Connection connection, TransferAdapter.TransferAdapterCallback transferAdapterCallback) throws FileTransferException, IOException {
        StatFs statFs;
        long j;
        int i;
        int i2;
        RandomAccessFile randomAccessFile;
        InputStream inputStream;
        byte[] bArr;
        int i3;
        long j2;
        long j3;
        int i4;
        int i5;
        int i6;
        if (Environment.getExternalStorageState().equals("mounted")) {
            if (c == null) {
                c = Environment.getExternalStorageDirectory().getPath() + UtilsConstants.DEFAULT_STORE_SUBDIR;
            }
            File file = new File(c);
            if (!file.isDirectory() && !file.mkdir()) {
                IwdsLog.e(a, "Unable to receive file: can't create base directory " + file.getPath());
                IwdsException.throwFileTransferException(1);
            }
            statFs = new StatFs(file.getPath());
        } else {
            IwdsLog.e(a, "Unable to receive file: no external storage");
            IwdsException.throwFileTransferException(2);
            statFs = null;
        }
        String strD = D(connection);
        if (strD == null || strD.isEmpty()) {
            IwdsLog.e(a, "Unable to receive file: name is null or empty");
            IwdsException.throwFileTransferException(1);
        }
        File file2 = new File(c, strD);
        long jS = s(connection);
        if (jS <= 0) {
            IwdsLog.e(a, "Unable to receive file: invalid file length");
            IwdsException.throwFileTransferException(1);
        }
        long j4 = 65536;
        int i7 = (int) (jS % j4 == 0 ? jS / j4 : (jS / j4) + 1);
        int iQ = q(connection);
        if (iQ > i7 || iQ < 0) {
            IwdsLog.e(a, "Unable to receive file: chunk index out of bound");
            IwdsException.throwFileTransferException(1);
        }
        long j5 = iQ * 65536;
        if (j5 > file2.length()) {
            IwdsLog.e(a, "Unable to receive file: file length less than already read length");
            IwdsException.throwFileTransferException(1);
        }
        long j6 = jS - j5;
        if (Build.VERSION.SDK_INT >= 18) {
            if (statFs.getBlockSizeLong() * (statFs.getAvailableBlocksLong() - 4) < j6) {
                IwdsLog.e(a, "Unabled to receive file: not enough free space");
                IwdsException.throwFileTransferException(3);
            }
            j = jS;
            i = iQ;
            i2 = i7;
        } else {
            j = jS;
            long blockSize = statFs.getBlockSize();
            int availableBlocks = statFs.getAvailableBlocks();
            i = iQ;
            i2 = i7;
            if (blockSize * (((long) availableBlocks) - 4) < j6) {
                IwdsLog.e(a, "Unabled to receive file: not enough free space");
                IwdsException.throwFileTransferException(3);
            }
        }
        try {
            randomAccessFile = new RandomAccessFile(file2, "rwd");
        } catch (FileNotFoundException unused) {
            IwdsLog.e(a, "Unable to receive file: error create file " + strD);
            IwdsException.throwFileTransferException(1);
            randomAccessFile = null;
        }
        try {
            try {
                try {
                    randomAccessFile.seek(j5);
                } catch (IOException unused2) {
                    IwdsLog.e(a, "Unable to receive file: error seek file to " + j5);
                    IwdsException.throwFileTransferException(1);
                }
            } catch (IOException unused3) {
                randomAccessFile.close();
                IwdsLog.e(a, "Unable to receive file: error seek file to " + j5);
                IwdsException.throwFileTransferException(1);
                inputStream = connection.getInputStream();
                bArr = new byte[65536];
                i3 = i;
                j2 = j6;
                while (j2 > 0) {
                    long j7 = j5;
                    int iMin = (int) Math.min(j4, j2);
                    i4 = iMin;
                    i5 = 0;
                    while (i4 > 0) {
                        try {
                            int i8 = inputStream.read(bArr, i5, i4);
                            i4 -= i8;
                            i5 += i8;
                        } catch (IOException e2) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                            IwdsLog.e(a, "Unable to receive file: connection io exception");
                            transferAdapterCallback.onRecvFileInterrupted(i3);
                            throw e2;
                        }
                    }
                    try {
                        try {
                            randomAccessFile.write(bArr, 0, iMin);
                        } catch (IOException unused5) {
                            IwdsLog.e(a, "Unable to receive file: file write io exception");
                            transferAdapterCallback.onRecvFileInterrupted(i3);
                            IwdsException.throwFileTransferException(1);
                        }
                    } catch (IOException unused6) {
                        randomAccessFile.close();
                        IwdsLog.e(a, "Unable to receive file: file write io exception");
                        transferAdapterCallback.onRecvFileInterrupted(i3);
                        IwdsException.throwFileTransferException(1);
                        i6 = i3 + 1;
                        if (i3 > i2) {
                            IwdsLog.e(a, "Unable to receive file: index out of bound:, current=" + i6 + ", total=" + i2);
                            IwdsException.throwFileTransferException(1);
                        }
                        long j8 = iMin;
                        long j9 = j7 + j8;
                        j2 -= j8;
                        transferAdapterCallback.onRecvFileProgress(j9, j);
                        i3 = i6;
                        j5 = j9;
                    }
                    i6 = i3 + 1;
                    if (i3 > i2) {
                        IwdsLog.e(a, "Unable to receive file: index out of bound:, current=" + i6 + ", total=" + i2);
                        IwdsException.throwFileTransferException(1);
                    }
                    long j10 = iMin;
                    long j11 = j7 + j10;
                    j2 -= j10;
                    transferAdapterCallback.onRecvFileProgress(j11, j);
                    i3 = i6;
                    j5 = j11;
                }
                j3 = j;
                randomAccessFile.close();
                if (file2.length() != j3) {
                    IwdsLog.e(a, "Unable to receive file: error received file length: recvLen=" + file2.length() + ", sendLen=" + j3);
                    IwdsException.throwFileTransferException(1);
                }
                return file2;
            }
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
        inputStream = connection.getInputStream();
        bArr = new byte[65536];
        i3 = i;
        j2 = j6;
        while (j2 > 0) {
            long j12 = j5;
            int iMin2 = (int) Math.min(j4, j2);
            i4 = iMin2;
            i5 = 0;
            while (i4 > 0) {
                int i9 = inputStream.read(bArr, i5, i4);
                i4 -= i9;
                i5 += i9;
            }
            randomAccessFile.write(bArr, 0, iMin2);
            i6 = i3 + 1;
            if (i3 > i2) {
                IwdsLog.e(a, "Unable to receive file: index out of bound:, current=" + i6 + ", total=" + i2);
                IwdsException.throwFileTransferException(1);
            }
            long j13 = iMin2;
            long j14 = j12 + j13;
            j2 -= j13;
            transferAdapterCallback.onRecvFileProgress(j14, j);
            i3 = i6;
            j5 = j14;
        }
        j3 = j;
        if (file2.length() != j3) {
            IwdsLog.e(a, "Unable to receive file: error received file length: recvLen=" + file2.length() + ", sendLen=" + j3);
            IwdsException.throwFileTransferException(1);
        }
        return file2;
    }

    private static char m0(byte[] bArr) {
        return (char) (((bArr[1] << 0) & 255) | ((bArr[0] << 8) & 65280));
    }

    private static float n(Connection connection) throws IOException {
        int i = 4;
        byte[] bArr = new byte[4];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return o0(bArr);
    }

    private static double n0(byte[] bArr) {
        return Double.longBitsToDouble(((((long) bArr[0]) << 56) & (-72057594037927936L)) | ((((long) bArr[1]) << 48) & 71776119061217280L) | ((((long) bArr[2]) << 40) & 280375465082880L) | ((((long) bArr[3]) << 32) & 1095216660480L) | ((((long) bArr[4]) << 24) & 4278190080L) | ((((long) bArr[5]) << 16) & 16711680) | ((((long) bArr[6]) << 8) & 65280) | ((((long) bArr[7]) << 0) & 255));
    }

    private static float[] o(Connection connection) throws IOException {
        int iQ = q(connection);
        float[] fArr = new float[iQ];
        for (int i = 0; i < iQ; i++) {
            fArr[i] = n(connection);
        }
        return fArr;
    }

    private static float o0(byte[] bArr) {
        return Float.intBitsToFloat(((bArr[3] << 0) & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[2] << 8) & 65280));
    }

    private static HashMap p(Connection connection) throws IOException {
        int iQ = q(connection);
        HashMap map = new HashMap(iQ);
        for (int i = 0; i < iQ; i++) {
            map.put(decode(connection, null, null, null), decode(connection, null, null, null));
        }
        return map;
    }

    private static int p0(byte[] bArr) {
        return ((bArr[3] << 0) & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[2] << 8) & 65280);
    }

    private static int q(Connection connection) throws IOException {
        int i = 4;
        byte[] bArr = new byte[4];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return p0(bArr);
    }

    private static long q0(byte[] bArr) {
        return ((((long) bArr[0]) << 56) & (-72057594037927936L)) | ((((long) bArr[1]) << 48) & 71776119061217280L) | ((((long) bArr[2]) << 40) & 280375465082880L) | ((((long) bArr[3]) << 32) & 1095216660480L) | ((((long) bArr[4]) << 24) & 4278190080L) | ((((long) bArr[5]) << 16) & 16711680) | ((((long) bArr[6]) << 8) & 65280) | ((((long) bArr[7]) << 0) & 255);
    }

    private static int[] r(Connection connection) throws IOException {
        int iQ = q(connection);
        int[] iArr = new int[iQ];
        for (int i = 0; i < iQ; i++) {
            iArr[i] = q(connection);
        }
        return iArr;
    }

    private static <T extends Parcelable> Object r0(byte[] bArr, Parcelable.Creator<T> creator) {
        IwdsAssert.dieIf(a, creator == null, "creator == null");
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    private static long s(Connection connection) throws IOException {
        int i = 8;
        byte[] bArr = new byte[8];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return q0(bArr);
    }

    private static <T extends Parcelable> Parcelable.Creator<T> s0(String str) {
        Parcelable.Creator<T> creator;
        HashMap<String, Parcelable.Creator> map = d;
        synchronized (map) {
            creator = map.get(str);
            if (creator == null) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    creator = (Parcelable.Creator) Class.forName(str).getField("CREATOR").get(null);
                                } catch (ClassNotFoundException unused) {
                                    IwdsAssert.dieIf(a, true, "Class not found when unmarshalling: " + str);
                                }
                            } catch (NullPointerException unused2) {
                                IwdsAssert.dieIf(a, true, "Parcelable protocol requires the CREATOR object to be static on class " + str);
                            }
                        } catch (IllegalAccessException unused3) {
                            IwdsAssert.dieIf(a, true, "Illegal access when unmarshalling: " + str);
                        }
                    } catch (ClassCastException unused4) {
                        IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                    }
                } catch (NoSuchFieldException unused5) {
                    IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                }
                if (creator == null) {
                    IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                }
                d.put(str, creator);
            }
        }
        return creator;
    }

    private static long[] t(Connection connection) throws IOException {
        int iQ = q(connection);
        long[] jArr = new long[iQ];
        for (int i = 0; i < iQ; i++) {
            jArr[i] = s(connection);
        }
        return jArr;
    }

    private static <T extends SafeParcelable> Object t0(byte[] bArr, SafeParcelable.Creator<T> creator) {
        IwdsAssert.dieIf(a, creator == null, "creator == null");
        SafeParcel safeParcelObtain = SafeParcel.obtain();
        safeParcelObtain.unmarshall(bArr, 0, bArr.length);
        safeParcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(safeParcelObtain);
        safeParcelObtain.recycle();
        return tCreateFromParcel;
    }

    private static <T extends Parcelable> Object u(Connection connection, Parcelable.Creator<T> creator) throws IOException {
        if (creator == null) {
            creator = s0(D(connection));
        }
        int iQ = q(connection);
        byte[] bArr = new byte[iQ];
        int i = 0;
        InputStream inputStream = connection.getInputStream();
        while (iQ > 0) {
            int i2 = inputStream.read(bArr, i, iQ);
            i += i2;
            iQ -= i2;
        }
        return r0(bArr, creator);
    }

    private static <T extends SafeParcelable> SafeParcelable.Creator<T> u0(String str) {
        SafeParcelable.Creator<T> creator;
        HashMap<String, SafeParcelable.Creator> map = e;
        synchronized (map) {
            creator = map.get(str);
            if (creator == null) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    creator = (SafeParcelable.Creator) Class.forName(str).getField("CREATOR").get(null);
                                } catch (ClassNotFoundException unused) {
                                    IwdsAssert.dieIf(a, true, "Class not found when unmarshalling: " + str);
                                }
                            } catch (NullPointerException unused2) {
                                IwdsAssert.dieIf(a, true, "Parcelable protocol requires the CREATOR object to be static on class " + str);
                            }
                        } catch (IllegalAccessException unused3) {
                            IwdsAssert.dieIf(a, true, "Illegal access when unmarshalling: " + str);
                        }
                    } catch (ClassCastException unused4) {
                        IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                    }
                } catch (NoSuchFieldException unused5) {
                    IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                }
                if (creator == null) {
                    IwdsAssert.dieIf(a, true, "Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class " + str);
                }
                e.put(str, creator);
            }
        }
        return creator;
    }

    private static Parcelable[] v(Connection connection) throws IOException {
        int iQ = q(connection);
        Parcelable[] parcelableArr = new Parcelable[iQ];
        for (int i = 0; i < iQ; i++) {
            parcelableArr[i] = (Parcelable) u(connection, null);
        }
        return parcelableArr;
    }

    private static short v0(byte[] bArr) {
        return (short) (((bArr[1] << 0) & 255) | ((bArr[0] << 8) & 65280));
    }

    private static <T extends SafeParcelable> Object w(Connection connection, SafeParcelable.Creator<T> creator) throws IOException {
        if (creator == null) {
            creator = u0(D(connection));
        }
        int iQ = q(connection);
        byte[] bArr = new byte[iQ];
        int i = 0;
        InputStream inputStream = connection.getInputStream();
        while (iQ > 0) {
            int i2 = inputStream.read(bArr, i, iQ);
            i += i2;
            iQ -= i2;
        }
        return t0(bArr, creator);
    }

    private static String w0(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    private static SafeParcelable[] x(Connection connection) throws IOException {
        int iQ = q(connection);
        SafeParcelable[] safeParcelableArr = new SafeParcelable[iQ];
        for (int i = 0; i < iQ; i++) {
            safeParcelableArr[i] = (SafeParcelable) w(connection, null);
        }
        return safeParcelableArr;
    }

    private static String x0(int i) {
        switch (i) {
            case 0:
                return "String";
            case 1:
                return "Integer";
            case 2:
                return AIApiConstants.Map.NAME;
            case 3:
                return "SafeParcelable";
            case 4:
                return "Parcelable";
            case 5:
                return "Short";
            case 6:
                return "Long";
            case 7:
                return "Float";
            case 8:
                return "Double";
            case 9:
                return "Boolean";
            case 10:
                return "CharSequence";
            case 11:
                return "List";
            case 12:
                return "SparseArray";
            case 13:
                return "Byte Array";
            case 14:
                return "String Array";
            case 15:
                return "SafeParcelable Array";
            case 16:
                return "Parcelable Array";
            case 17:
                return "Object Array";
            case 18:
                return "Integer Array";
            case 19:
                return "Long Array";
            case 20:
                return "Byte";
            case 21:
                return "Serializable";
            case 22:
                return "SparseBooleanArray";
            case 23:
                return "Boolean Array";
            case 24:
                return "CharSeqenceArray";
            case 25:
                return "Character";
            case 26:
                return "Short Array";
            case 27:
                return "Float Array";
            case 28:
                return "Double Array";
            case 29:
                return "Character Array";
            case 30:
                return "File";
            default:
                Log.e(a, "Unknown type.");
                return "Unknown type";
        }
    }

    private static Serializable y(Connection connection) throws IOException {
        String strD = D(connection);
        IwdsAssert.dieIf(a, strD == null, "Bad serializable name null");
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(f(connection))).readObject();
        } catch (IOException e2) {
            IwdsAssert.dieIf(a, true, "Parcelable encountered IOException reading a Serializable object (name = " + strD + ")");
            e2.printStackTrace();
            return null;
        } catch (ClassNotFoundException unused) {
            IwdsAssert.dieIf(a, true, "Parcelable encounteredClassNotFoundException reading a Serializable object(name = " + strD + ")");
            return null;
        }
    }

    private static int y0(byte[] bArr, int i, boolean z) {
        if (z) {
            int i2 = i + 1;
            bArr[i] = 1;
            return i2;
        }
        int i3 = i + 1;
        bArr[i] = 0;
        return i3;
    }

    private static short z(Connection connection) throws IOException {
        int i = 2;
        byte[] bArr = new byte[2];
        InputStream inputStream = connection.getInputStream();
        int i2 = 0;
        while (i > 0) {
            int i3 = inputStream.read(bArr, i2, i);
            i2 += i3;
            i -= i3;
        }
        return v0(bArr);
    }

    private static int z0(byte[] bArr, int i, byte b2) {
        int i2 = i + 1;
        bArr[i] = b2;
        return i2;
    }
}

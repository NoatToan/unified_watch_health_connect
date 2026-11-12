package com.ingenic.iwds.os;

import com.ingenic.iwds.utils.IwdsLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public final class SafeParcel {
    public static final SafeParcelable.Creator<String> STRING_CREATOR;
    private static final SafeParcel[] c = new SafeParcel[256];
    private static final SafeParcel[] d = new SafeParcel[256];
    private static final HashMap<ClassLoader, HashMap<String, SafeParcelable.Creator>> e;
    private long a;
    private boolean b;

    public static class a implements SafeParcelable.Creator<String> {
        @Override // com.ingenic.iwds.os.SafeParcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String createFromParcel(SafeParcel safeParcel) {
            return safeParcel.readString();
        }

        @Override // com.ingenic.iwds.os.SafeParcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String[] newArray(int i) {
            return new String[i];
        }
    }

    public class b extends ObjectInputStream {
        public final /* synthetic */ ClassLoader a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputStream inputStream, ClassLoader classLoader) {
            super(inputStream);
            this.a = classLoader;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls;
            return (this.a == null || (cls = Class.forName(objectStreamClass.getName(), false, this.a)) == null) ? super.resolveClass(objectStreamClass) : cls;
        }
    }

    static {
        System.loadLibrary("safeparcel");
        STRING_CREATOR = new a();
        e = new HashMap<>();
    }

    private SafeParcel(long j) {
        d(j);
    }

    private final <T extends SafeParcelable> SafeParcelable.Creator<T> a(ClassLoader classLoader) {
        SafeParcelable.Creator<T> creator;
        String string = readString();
        if (string == null) {
            return null;
        }
        HashMap<ClassLoader, HashMap<String, SafeParcelable.Creator>> map = e;
        synchronized (map) {
            HashMap<String, SafeParcelable.Creator> map2 = map.get(classLoader);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(classLoader, map2);
            }
            creator = map2.get(string);
            if (creator == null) {
                try {
                    try {
                        try {
                            creator = (SafeParcelable.Creator) (classLoader == null ? Class.forName(string) : Class.forName(string, true, classLoader)).getField("CREATOR").get(null);
                            if (creator == null) {
                                throw new com.ingenic.iwds.os.a("SafeParcelable protocol requires a SafeParcelable.Creator object called  CREATOR on class " + string);
                            }
                            map2.put(string, creator);
                        } catch (NullPointerException unused) {
                            throw new com.ingenic.iwds.os.a("SafeParcelable protocol requires the CREATOR object to be static on class " + string);
                        }
                    } catch (ClassCastException unused2) {
                        throw new com.ingenic.iwds.os.a("SafeParcelable protocol requires a SafeParcelable.Creator object called  CREATOR on class " + string);
                    } catch (IllegalAccessException e2) {
                        IwdsLog.e(this, "Illegal access when unmarshalling: " + string, e2);
                        throw new com.ingenic.iwds.os.a("IllegalAccessException when unmarshalling: " + string);
                    }
                } catch (ClassNotFoundException e3) {
                    IwdsLog.e(this, "Class not found when unmarshalling: " + string, e3);
                    throw new com.ingenic.iwds.os.a("ClassNotFoundException when unmarshalling: " + string);
                } catch (NoSuchFieldException unused3) {
                    throw new com.ingenic.iwds.os.a("SafeParcelable protocol requires a SafeParcelable.Creator object called  CREATOR on class " + string);
                }
            }
        }
        return creator;
    }

    private void b() {
        if (this.b) {
            nativeFreeBuffer(this.a);
        }
    }

    private static void c(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException("length=" + i + "; regionStart=" + i2 + "; regionLength=" + i3);
        }
    }

    private void d(long j) {
        if (j != 0) {
            this.a = j;
            this.b = false;
        } else {
            this.a = nativeCreate();
            this.b = true;
        }
    }

    private final void e(RemoteBundle remoteBundle) {
        if (remoteBundle == null) {
            writeInt(-1);
        }
    }

    private void f(List list, int i, ClassLoader classLoader) {
        while (i > 0) {
            list.add(readValue(classLoader));
            i--;
        }
    }

    private void g(Map<String, Object> map) {
        if (map == null) {
            writeInt(-1);
            return;
        }
        Set<Map.Entry<String, Object>> setEntrySet = map.entrySet();
        writeInt(setEntrySet.size());
        for (Map.Entry<String, Object> entry : setEntrySet) {
            writeValue(entry.getKey());
            writeValue(entry.getValue());
        }
    }

    private void h(Map map, int i, ClassLoader classLoader) {
        while (i > 0) {
            map.put(readValue(classLoader), readValue(classLoader));
            i--;
        }
    }

    private void i(Object[] objArr, int i, ClassLoader classLoader) {
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = readValue(classLoader);
        }
    }

    private final Serializable j(ClassLoader classLoader) {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new b(new ByteArrayInputStream(createByteArray()), classLoader).readObject();
        } catch (IOException e2) {
            throw new RuntimeException("SafeParcelable encountered IOException reading a Serializable object (name = " + string + ")", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("SafeParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + ")", e3);
        }
    }

    private void k() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                nativeDestroy(j);
            }
            this.a = 0L;
        }
    }

    private final RemoteBundle l(ClassLoader classLoader) {
        readInt();
        return null;
    }

    private static native long nativeCreate();

    private static native byte[] nativeCreateByteArray(long j);

    private static native int nativeDataAvail(long j);

    private static native int nativeDataCapacity(long j);

    private static native int nativeDataPosition(long j);

    private static native int nativeDataSize(long j);

    private static native void nativeDestroy(long j);

    private static native void nativeFreeBuffer(long j);

    private static native byte[] nativeMarshall(long j);

    private static native double nativeReadDouble(long j);

    private static native float nativeReadFloat(long j);

    private static native int nativeReadInt(long j);

    private static native long nativeReadLong(long j);

    private static native String nativeReadString(long j);

    private static native void nativeSetDataCapacity(long j, int i);

    private static native void nativeSetDataPosition(long j, int i);

    private static native void nativeSetDataSize(long j, int i);

    private static native void nativeUnmarshall(long j, byte[] bArr, int i, int i2);

    private static native void nativeWriteByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeWriteDouble(long j, double d2);

    private static native void nativeWriteFloat(long j, float f);

    private static native void nativeWriteInt(long j, int i);

    private static native void nativeWriteLong(long j, long j2);

    private static native void nativeWriteString(long j, String str);

    public static SafeParcel obtain() {
        synchronized (c) {
            for (int i = 0; i < 256; i++) {
                SafeParcel[] safeParcelArr = c;
                SafeParcel safeParcel = safeParcelArr[i];
                if (safeParcel != null) {
                    safeParcelArr[i] = null;
                    return safeParcel;
                }
            }
            return new SafeParcel(0L);
        }
    }

    public final boolean[] createBooleanArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 2)) {
            return null;
        }
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = readInt() != 0;
        }
        return zArr;
    }

    public final byte[] createByteArray() {
        return nativeCreateByteArray(this.a);
    }

    public final char[] createCharArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 2)) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) readInt();
        }
        return cArr;
    }

    public final double[] createDoubleArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 3)) {
            return null;
        }
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
        return dArr;
    }

    public final float[] createFloatArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 2)) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
        return fArr;
    }

    public final int[] createIntArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 2)) {
            return null;
        }
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public final long[] createLongArray() {
        int i = readInt();
        if (i < 0 || i > (dataAvail() >> 3)) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
        return jArr;
    }

    public final String[] createStringArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = readString();
        }
        return strArr;
    }

    public final ArrayList<String> createStringArrayList() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(i);
        while (i > 0) {
            arrayList.add(readString());
            i--;
        }
        return arrayList;
    }

    public final <T> T[] createTypedArray(SafeParcelable.Creator<T> creator) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        T[] tArrNewArray = creator.newArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (readInt() != 0) {
                tArrNewArray[i2] = creator.createFromParcel(this);
            }
        }
        return tArrNewArray;
    }

    public final <T> ArrayList<T> createTypedArrayList(SafeParcelable.Creator<T> creator) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>(i);
        while (i > 0) {
            if (readInt() != 0) {
                arrayList.add(creator.createFromParcel(this));
            } else {
                arrayList.add(null);
            }
            i--;
        }
        return arrayList;
    }

    public final int dataAvail() {
        return nativeDataAvail(this.a);
    }

    public final int dataCapacity() {
        return nativeDataCapacity(this.a);
    }

    public final int dataPosition() {
        return nativeDataPosition(this.a);
    }

    public final int dataSize() {
        return nativeDataSize(this.a);
    }

    public void finalize() throws Throwable {
        k();
    }

    public final byte[] marshall() {
        return nativeMarshall(this.a);
    }

    public final Object[] readArray(ClassLoader classLoader) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        Object[] objArr = new Object[i];
        i(objArr, i, classLoader);
        return objArr;
    }

    public final ArrayList readArrayList(ClassLoader classLoader) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        f(arrayList, i, classLoader);
        return arrayList;
    }

    public final void readBooleanArray(boolean[] zArr) {
        int i = readInt();
        if (i != zArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = readInt() != 0;
        }
    }

    public final byte readByte() {
        return (byte) (readInt() & 255);
    }

    public final void readByteArray(byte[] bArr) {
        byte[] bArrCreateByteArray = createByteArray();
        if (bArrCreateByteArray.length != bArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        System.arraycopy(bArrCreateByteArray, 0, bArr, 0, bArrCreateByteArray.length);
    }

    public final void readCharArray(char[] cArr) {
        int i = readInt();
        if (i != cArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = (char) readInt();
        }
    }

    public final CharSequence readCharSequence() {
        return readString();
    }

    public final CharSequence[] readCharSequenceArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        CharSequence[] charSequenceArr = new CharSequence[i];
        for (int i2 = 0; i2 < i; i2++) {
            charSequenceArr[i2] = readCharSequence();
        }
        return charSequenceArr;
    }

    public final double readDouble() {
        return nativeReadDouble(this.a);
    }

    public final void readDoubleArray(double[] dArr) {
        int i = readInt();
        if (i != dArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = readDouble();
        }
    }

    public final float readFloat() {
        return nativeReadFloat(this.a);
    }

    public final void readFloatArray(float[] fArr) {
        int i = readInt();
        if (i != fArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = readFloat();
        }
    }

    public final HashMap readHashMap(ClassLoader classLoader) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap(i);
        h(map, i, classLoader);
        return map;
    }

    public final int readInt() {
        return nativeReadInt(this.a);
    }

    public final void readIntArray(int[] iArr) {
        int i = readInt();
        if (i != iArr.length) {
            throw new RuntimeException("bad array lengths: ");
        }
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
    }

    public final void readList(List list, ClassLoader classLoader) {
        f(list, readInt(), classLoader);
    }

    public final long readLong() {
        return nativeReadLong(this.a);
    }

    public final void readLongArray(long[] jArr) {
        int i = readInt();
        if (i != jArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = readLong();
        }
    }

    public final void readMap(Map map, ClassLoader classLoader) {
        h(map, readInt(), classLoader);
    }

    public final <T extends SafeParcelable> T readParcelable(ClassLoader classLoader) {
        SafeParcelable.Creator<T> creatorA = a(classLoader);
        if (creatorA == null) {
            return null;
        }
        return creatorA instanceof SafeParcelable.ClassLoaderCreator ? (T) ((SafeParcelable.ClassLoaderCreator) creatorA).createFromParcel(this, classLoader) : creatorA.createFromParcel(this);
    }

    public final SafeParcelable[] readParcelableArray(ClassLoader classLoader) {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        SafeParcelable[] safeParcelableArr = new SafeParcelable[i];
        for (int i2 = 0; i2 < i; i2++) {
            safeParcelableArr[i2] = readParcelable(classLoader);
        }
        return safeParcelableArr;
    }

    public final Serializable readSerializable() {
        return j(null);
    }

    public final String readString() {
        return nativeReadString(this.a);
    }

    public final String[] readStringArray() {
        int i = readInt();
        if (i < 0) {
            return null;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = readString();
        }
        return strArr;
    }

    public final void readStringList(List<String> list) {
        int size = list.size();
        int i = readInt();
        int i2 = 0;
        while (i2 < size && i2 < i) {
            list.set(i2, readString());
            i2++;
        }
        while (i2 < i) {
            list.add(readString());
            i2++;
        }
        while (i2 < size) {
            list.remove(i);
            i2++;
        }
    }

    public final <T> void readTypedArray(T[] tArr, SafeParcelable.Creator<T> creator) {
        int i = readInt();
        if (i != tArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (readInt() != 0) {
                tArr[i2] = creator.createFromParcel(this);
            } else {
                tArr[i2] = null;
            }
        }
    }

    public final <T> void readTypedList(List<T> list, SafeParcelable.Creator<T> creator) {
        int size = list.size();
        int i = readInt();
        int i2 = 0;
        while (i2 < size && i2 < i) {
            if (readInt() != 0) {
                list.set(i2, creator.createFromParcel(this));
            } else {
                list.set(i2, null);
            }
            i2++;
        }
        while (i2 < i) {
            if (readInt() != 0) {
                list.add(creator.createFromParcel(this));
            } else {
                list.add(null);
            }
            i2++;
        }
        while (i2 < size) {
            list.remove(i);
            i2++;
        }
    }

    public final Object readValue(ClassLoader classLoader) {
        int i = readInt();
        switch (i) {
            case -1:
                return null;
            case 0:
                return readString();
            case 1:
                return Integer.valueOf(readInt());
            case 2:
                return readHashMap(classLoader);
            case 3:
                return l(classLoader);
            case 4:
                return readParcelable(classLoader);
            case 5:
                return Short.valueOf((short) readInt());
            case 6:
                return Long.valueOf(readLong());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Double.valueOf(readDouble());
            case 9:
                return Boolean.valueOf(readInt() == 1);
            case 10:
                return readCharSequence();
            case 11:
                return readArrayList(classLoader);
            case 12:
                return createByteArray();
            case 13:
                return readStringArray();
            case 14:
                return readParcelableArray(classLoader);
            case 15:
                return readArray(classLoader);
            case 16:
                return createIntArray();
            case 17:
                return createLongArray();
            case 18:
                return Byte.valueOf(readByte());
            case 19:
                return readSerializable();
            case 20:
                return createBooleanArray();
            case 21:
                return readCharSequenceArray();
            default:
                throw new RuntimeException("SafeParcel " + this + ": Unmarshalling unknown type code " + i + " at offset " + (dataPosition() - 4));
        }
    }

    public final void recycle() {
        SafeParcel[] safeParcelArr;
        b();
        if (this.b) {
            safeParcelArr = c;
        } else {
            this.a = 0L;
            safeParcelArr = d;
        }
        synchronized (safeParcelArr) {
            for (int i = 0; i < 256; i++) {
                if (safeParcelArr[i] == null) {
                    safeParcelArr[i] = this;
                    return;
                }
            }
        }
    }

    public final void setDataCapacity(int i) {
        nativeSetDataCapacity(this.a, i);
    }

    public final void setDataPosition(int i) {
        nativeSetDataPosition(this.a, i);
    }

    public final void setDataSize(int i) {
        nativeSetDataSize(this.a, i);
    }

    public final void unmarshall(byte[] bArr, int i, int i2) {
        nativeUnmarshall(this.a, bArr, i, i2);
    }

    public final void writeArray(Object[] objArr) {
        if (objArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(objArr.length);
        for (Object obj : objArr) {
            writeValue(obj);
        }
    }

    public final void writeBooleanArray(boolean[] zArr) {
        if (zArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(zArr.length);
        for (boolean z : zArr) {
            writeInt(z ? 1 : 0);
        }
    }

    public final void writeByte(byte b2) {
        writeInt(b2);
    }

    public final void writeByteArray(byte[] bArr) {
        writeByteArray(bArr, 0, bArr != null ? bArr.length : 0);
    }

    public final void writeCharArray(char[] cArr) {
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c2 : cArr) {
            writeInt(c2);
        }
    }

    public final void writeCharSequence(CharSequence charSequence) {
        if (charSequence == null) {
            writeInt(-1);
        } else {
            writeString(charSequence.toString());
        }
    }

    public final void writeCharSequenceArray(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(charSequenceArr.length);
        for (CharSequence charSequence : charSequenceArr) {
            writeCharSequence(charSequence);
        }
    }

    public final void writeDouble(double d2) {
        nativeWriteDouble(this.a, d2);
    }

    public final void writeDoubleArray(double[] dArr) {
        if (dArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(dArr.length);
        for (double d2 : dArr) {
            writeDouble(d2);
        }
    }

    public final void writeFloat(float f) {
        nativeWriteFloat(this.a, f);
    }

    public final void writeFloatArray(float[] fArr) {
        if (fArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(fArr.length);
        for (float f : fArr) {
            writeFloat(f);
        }
    }

    public final void writeInt(int i) {
        nativeWriteInt(this.a, i);
    }

    public final void writeIntArray(int[] iArr) {
        if (iArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    public final void writeList(List list) {
        if (list == null) {
            writeInt(-1);
            return;
        }
        int size = list.size();
        writeInt(size);
        for (int i = 0; i < size; i++) {
            writeValue(list.get(i));
        }
    }

    public final void writeLong(long j) {
        nativeWriteLong(this.a, j);
    }

    public final void writeLongArray(long[] jArr) {
        if (jArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(jArr.length);
        for (long j : jArr) {
            writeLong(j);
        }
    }

    public final void writeMap(Map map) {
        g(map);
    }

    public final void writeParcelable(SafeParcelable safeParcelable, int i) {
        if (safeParcelable == null) {
            writeString(null);
        } else {
            writeString(safeParcelable.getClass().getName());
            safeParcelable.writeToParcel(this, i);
        }
    }

    public final <T extends SafeParcelable> void writeParcelableArray(T[] tArr, int i) {
        if (tArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(tArr.length);
        for (T t : tArr) {
            writeParcelable(t, i);
        }
    }

    public final void writeSerializable(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException("SafeParcelable encountered IOException writing serializable object (name = " + name + ")", e2);
        }
    }

    public final void writeString(String str) {
        nativeWriteString(this.a, str);
    }

    public final void writeStringArray(String[] strArr) {
        if (strArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(strArr.length);
        for (String str : strArr) {
            writeString(str);
        }
    }

    public final void writeStringList(List<String> list) {
        if (list == null) {
            writeInt(-1);
            return;
        }
        int size = list.size();
        writeInt(size);
        for (int i = 0; i < size; i++) {
            writeString(list.get(i));
        }
    }

    public final <T extends SafeParcelable> void writeTypedArray(T[] tArr, int i) {
        if (tArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(tArr.length);
        for (T t : tArr) {
            if (t != null) {
                writeInt(1);
                t.writeToParcel(this, i);
            } else {
                writeInt(0);
            }
        }
    }

    public final <T extends SafeParcelable> void writeTypedList(List<T> list) {
        if (list == null) {
            writeInt(-1);
            return;
        }
        int size = list.size();
        writeInt(size);
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                writeInt(1);
                t.writeToParcel(this, 0);
            } else {
                writeInt(0);
            }
        }
    }

    public final void writeValue(Object obj) {
        if (obj == null) {
            writeInt(-1);
            return;
        }
        if (obj instanceof String) {
            writeInt(0);
            writeString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writeInt(1);
            writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Map) {
            writeInt(2);
            writeMap((Map) obj);
            return;
        }
        if (obj instanceof RemoteBundle) {
            writeInt(3);
            e((RemoteBundle) obj);
            return;
        }
        if (obj instanceof SafeParcelable) {
            writeInt(4);
            writeParcelable((SafeParcelable) obj, 0);
            return;
        }
        if (obj instanceof Short) {
            writeInt(5);
            writeInt(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writeInt(6);
            writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            writeInt(7);
            writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            writeInt(8);
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writeInt(9);
            writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof CharSequence) {
            writeInt(10);
            writeCharSequence((CharSequence) obj);
            return;
        }
        if (obj instanceof List) {
            writeInt(11);
            writeList((List) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            writeInt(20);
            writeBooleanArray((boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            writeInt(12);
            writeByteArray((byte[]) obj);
            return;
        }
        if (obj instanceof String[]) {
            writeInt(13);
            writeStringArray((String[]) obj);
            return;
        }
        if (obj instanceof CharSequence[]) {
            writeInt(21);
            writeCharSequenceArray((CharSequence[]) obj);
            return;
        }
        if (obj instanceof SafeParcelable[]) {
            writeInt(14);
            writeParcelableArray((SafeParcelable[]) obj, 0);
            return;
        }
        if (obj instanceof int[]) {
            writeInt(16);
            writeIntArray((int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            writeInt(17);
            writeLongArray((long[]) obj);
            return;
        }
        if (obj instanceof Byte) {
            writeInt(18);
            writeInt(((Byte) obj).byteValue());
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray() && cls.getComponentType() == Object.class) {
            writeInt(15);
            writeArray((Object[]) obj);
        } else if (obj instanceof Serializable) {
            writeInt(19);
            writeSerializable((Serializable) obj);
        } else {
            throw new RuntimeException("Parcel: unable to marshal value " + obj);
        }
    }

    public final void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            writeInt(-1);
        } else {
            c(bArr.length, i, i2);
            nativeWriteByteArray(this.a, bArr, i, i2);
        }
    }

    public final void readStringArray(String[] strArr) {
        int i = readInt();
        if (i != strArr.length) {
            throw new RuntimeException("bad array lengths");
        }
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = readString();
        }
    }

    public static final SafeParcel obtain(int i) {
        throw new UnsupportedOperationException();
    }

    public static final SafeParcel obtain(long j) {
        synchronized (d) {
            for (int i = 0; i < 256; i++) {
                SafeParcel[] safeParcelArr = d;
                SafeParcel safeParcel = safeParcelArr[i];
                if (safeParcel != null) {
                    safeParcelArr[i] = null;
                    safeParcel.d(j);
                    return safeParcel;
                }
            }
            return new SafeParcel(j);
        }
    }
}

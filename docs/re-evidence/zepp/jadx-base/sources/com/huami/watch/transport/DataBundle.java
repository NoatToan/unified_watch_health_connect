package com.huami.watch.transport;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.huami.watch.util.Config;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class DataBundle implements SafeParcelable {
    public static final Parcelable.Creator<DataBundle> CREATOR;
    public static final boolean DEBUG = Config.isDebug();
    public static final DataBundle EMPTY;
    private static final String g = "DataBundle";
    public Map<String, Object> a;
    public Parcel b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ClassLoader f;

    public class a implements Parcelable.Creator<DataBundle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBundle createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            if (i < 0) {
                return null;
            }
            return new DataBundle(parcel, i);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataBundle[] newArray(int i) {
            return new DataBundle[i];
        }
    }

    static {
        DataBundle dataBundle = new DataBundle();
        EMPTY = dataBundle;
        dataBundle.a = Collections.unmodifiableMap(new HashMap());
        CREATOR = new a();
    }

    public DataBundle() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = true;
        this.a = new HashMap();
        this.f = DataBundle.class.getClassLoader();
    }

    private void b(String str, Object obj, String str2, ClassCastException classCastException) {
        c(str, obj, str2, "<null>", classCastException);
    }

    private void c(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        if (DEBUG) {
            Log.w(g, "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
            Log.w(g, "Attempt to cast generated internal exception:", classCastException);
        }
    }

    public static DataBundle forPair(String str, String str2) {
        DataBundle dataBundle = new DataBundle(1);
        dataBundle.putString(str, str2);
        return dataBundle;
    }

    public void a(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition + i);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.setDataPosition(0);
        parcelObtain.appendFrom(parcel, iDataPosition, i);
        parcelObtain.setDataPosition(0);
        this.b = parcelObtain;
    }

    public void clear() {
        d();
        this.a.clear();
        this.c = false;
        this.d = true;
    }

    public Object clone() {
        return new DataBundle(this);
    }

    public boolean containsKey(String str) {
        d();
        return this.a.containsKey(str);
    }

    public synchronized void d() {
        Parcel parcel = this.b;
        if (parcel == null) {
            return;
        }
        int i = parcel.readInt();
        if (i < 0) {
            return;
        }
        if (this.a == null) {
            this.a = new HashMap(i);
        }
        while (i > 0) {
            this.a.put((String) this.b.readValue(this.f), this.b.readValue(this.f));
            i--;
        }
        this.b.recycle();
        this.b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hasFileDescriptors() ? 1 : 0;
    }

    public Object get(String str) {
        d();
        return this.a.get(str);
    }

    public boolean getBoolean(String str) {
        d();
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (boolean[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "byte[]", e);
            return null;
        }
    }

    public DataBundle getBundle(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataBundle) obj;
        } catch (ClassCastException e) {
            b(str, obj, "Bundle", e);
            return null;
        }
    }

    public byte getByte(String str) {
        d();
        return getByte(str, (byte) 0).byteValue();
    }

    public byte[] getByteArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "byte[]", e);
            return null;
        }
    }

    public char getChar(String str) {
        d();
        return getChar(str, (char) 0);
    }

    public char[] getCharArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (char[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "char[]", e);
            return null;
        }
    }

    public CharSequence getCharSequence(String str) {
        d();
        Object obj = this.a.get(str);
        try {
            return (CharSequence) obj;
        } catch (ClassCastException e) {
            b(str, obj, "CharSequence", e);
            return null;
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (CharSequence[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "CharSequence[]", e);
            return null;
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            b(str, obj, "ArrayList<CharSequence>", e);
            return null;
        }
    }

    public ClassLoader getClassLoader() {
        return this.f;
    }

    public double getDouble(String str) {
        d();
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (double[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "double[]", e);
            return null;
        }
    }

    public float getFloat(String str) {
        d();
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "float[]", e);
            return null;
        }
    }

    public int getInt(String str) {
        d();
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (int[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "int[]", e);
            return null;
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            b(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public long getLong(String str) {
        d();
        return getLong(str, 0L);
    }

    public long[] getLongArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "long[]", e);
            return null;
        }
    }

    public String getPairValue() {
        d();
        int size = this.a.size();
        if (size > 1 && DEBUG) {
            Log.w(g, "getPairValue() used on Bundle with multiple pairs.");
        }
        if (size == 0) {
            return null;
        }
        Object next = this.a.values().iterator().next();
        try {
            return (String) next;
        } catch (ClassCastException e) {
            b("getPairValue()", next, "String", e);
            return null;
        }
    }

    public <T extends Parcelable> T getParcelable(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj;
        } catch (ClassCastException e) {
            b(str, obj, "Parcelable", e);
            return null;
        }
    }

    public Parcelable[] getParcelableArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Parcelable[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "Parcelable[]", e);
            return null;
        }
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            b(str, obj, "ArrayList", e);
            return null;
        }
    }

    public Serializable getSerializable(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Serializable) obj;
        } catch (ClassCastException e) {
            b(str, obj, "Serializable", e);
            return null;
        }
    }

    public short getShort(String str) {
        d();
        return getShort(str, (short) 0);
    }

    public short[] getShortArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (short[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "short[]", e);
            return null;
        }
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (SparseArray) obj;
        } catch (ClassCastException e) {
            b(str, obj, "SparseArray", e);
            return null;
        }
    }

    public String getString(String str) {
        d();
        Object obj = this.a.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            b(str, obj, "String", e);
            return null;
        }
    }

    public String[] getStringArray(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            b(str, obj, "String[]", e);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            b(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public boolean hasFileDescriptors() {
        if (!this.d) {
            Parcel parcel = this.b;
            boolean z = false;
            if (parcel == null) {
                Iterator<Map.Entry<String, Object>> it2 = this.a.entrySet().iterator();
                boolean z2 = false;
                while (true) {
                    if (z2 || !it2.hasNext()) {
                        z = z2;
                    } else {
                        Object value = it2.next().getValue();
                        if (value instanceof Parcelable) {
                            if ((((Parcelable) value).describeContents() & 1) != 0) {
                                z = true;
                            }
                        } else if (value instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) value;
                            for (int length = parcelableArr.length - 1; length >= 0; length--) {
                                if ((parcelableArr[length].describeContents() & 1) != 0) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else if (value instanceof SparseArray) {
                            SparseArray sparseArray = (SparseArray) value;
                            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                                if ((((Parcelable) sparseArray.get(size)).describeContents() & 1) != 0) {
                                    z2 = true;
                                    break;
                                    break;
                                }
                            }
                        } else if (value instanceof ArrayList) {
                            ArrayList arrayList = (ArrayList) value;
                            if (arrayList.size() > 0 && (arrayList.get(0) instanceof Parcelable)) {
                                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                    Parcelable parcelable = (Parcelable) arrayList.get(size2);
                                    if (parcelable != null && (parcelable.describeContents() & 1) != 0) {
                                        z2 = true;
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (parcel.hasFileDescriptors()) {
                z = true;
            }
            this.c = z;
            this.d = true;
        }
        return this.c;
    }

    public boolean isEmpty() {
        d();
        return this.a.isEmpty();
    }

    public boolean isParcelled() {
        return this.b != null;
    }

    public Set<String> keySet() {
        d();
        return this.a.keySet();
    }

    public void putAll(DataBundle dataBundle) {
        d();
        dataBundle.d();
        this.a.putAll(dataBundle.a);
        this.c |= dataBundle.c;
        this.d = this.d && dataBundle.d;
    }

    public void putBinder(String str, IBinder iBinder) {
        d();
        this.a.put(str, iBinder);
    }

    public void putBoolean(String str, boolean z) {
        d();
        this.a.put(str, Boolean.valueOf(z));
    }

    public void putBooleanArray(String str, boolean[] zArr) {
        d();
        this.a.put(str, zArr);
    }

    public void putBundle(String str, DataBundle dataBundle) {
        d();
        this.a.put(str, dataBundle);
    }

    public void putByte(String str, byte b) {
        d();
        this.a.put(str, Byte.valueOf(b));
    }

    public void putByteArray(String str, byte[] bArr) {
        d();
        this.a.put(str, bArr);
    }

    public void putChar(String str, char c) {
        d();
        this.a.put(str, Character.valueOf(c));
    }

    public void putCharArray(String str, char[] cArr) {
        d();
        this.a.put(str, cArr);
    }

    public void putCharSequence(String str, CharSequence charSequence) {
        d();
        this.a.put(str, charSequence);
    }

    public void putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        d();
        this.a.put(str, charSequenceArr);
    }

    public void putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        d();
        this.a.put(str, arrayList);
    }

    public void putDouble(String str, double d) {
        d();
        this.a.put(str, Double.valueOf(d));
    }

    public void putDoubleArray(String str, double[] dArr) {
        d();
        this.a.put(str, dArr);
    }

    public void putFloat(String str, float f) {
        d();
        this.a.put(str, Float.valueOf(f));
    }

    public void putFloatArray(String str, float[] fArr) {
        d();
        this.a.put(str, fArr);
    }

    @Deprecated
    public void putIBinder(String str, IBinder iBinder) {
        d();
        this.a.put(str, iBinder);
    }

    public void putInt(String str, int i) {
        d();
        this.a.put(str, Integer.valueOf(i));
    }

    public void putIntArray(String str, int[] iArr) {
        d();
        this.a.put(str, iArr);
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        d();
        this.a.put(str, arrayList);
    }

    public void putLong(String str, long j) {
        d();
        this.a.put(str, Long.valueOf(j));
    }

    public void putLongArray(String str, long[] jArr) {
        d();
        this.a.put(str, jArr);
    }

    public void putParcelable(String str, SafeParcelable safeParcelable) {
        d();
        this.a.put(str, safeParcelable);
        this.d = false;
    }

    public void putParcelableArray(String str, SafeParcelable[] safeParcelableArr) {
        d();
        this.a.put(str, safeParcelableArr);
        this.d = false;
    }

    public void putParcelableArrayList(String str, ArrayList<? extends SafeParcelable> arrayList) {
        d();
        this.a.put(str, arrayList);
        this.d = false;
    }

    public void putSerializable(String str, Serializable serializable) {
        d();
        this.a.put(str, serializable);
    }

    public void putShort(String str, short s) {
        d();
        this.a.put(str, Short.valueOf(s));
    }

    public void putShortArray(String str, short[] sArr) {
        d();
        this.a.put(str, sArr);
    }

    public void putSparseParcelableArray(String str, SparseArray<? extends SafeParcelable> sparseArray) {
        d();
        this.a.put(str, sparseArray);
        this.d = false;
    }

    public void putString(String str, String str2) {
        d();
        this.a.put(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        d();
        this.a.put(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        d();
        this.a.put(str, arrayList);
    }

    public void remove(String str) {
        d();
        this.a.remove(str);
    }

    public boolean setAllowFds(boolean z) {
        boolean z2 = this.e;
        this.e = z;
        return z2;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.f = classLoader;
    }

    public int size() {
        d();
        return this.a.size();
    }

    public synchronized String toString() {
        if (this.b != null) {
            return "Bundle[mParcelledData.dataSize=" + this.b.dataSize() + "]";
        }
        return "Bundle[" + this.a.toString() + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = this.b;
        if (parcel2 != null) {
            int iDataSize = parcel2.dataSize();
            parcel.writeInt(iDataSize);
            parcel.appendFrom(this.b, 0, iDataSize);
            return;
        }
        parcel.writeInt(-1);
        int iDataPosition = parcel.dataPosition();
        Map<String, Object> map = this.a;
        if (map != null && map == null) {
            parcel.writeInt(-1);
            return;
        }
        Set<Map.Entry<String, Object>> setEntrySet = map.entrySet();
        parcel.writeInt(setEntrySet.size());
        for (Map.Entry<String, Object> entry : setEntrySet) {
            parcel.writeValue(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition - 4);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }

    public boolean getBoolean(String str, boolean z) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            c(str, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public Byte getByte(String str, byte b) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return Byte.valueOf(b);
        }
        try {
            return (Byte) obj;
        } catch (ClassCastException e) {
            c(str, obj, "Byte", Byte.valueOf(b), e);
            return Byte.valueOf(b);
        }
    }

    public char getChar(String str, char c) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return c;
        }
        try {
            return ((Character) obj).charValue();
        } catch (ClassCastException e) {
            c(str, obj, "Character", Character.valueOf(c), e);
            return c;
        }
    }

    public double getDouble(String str, double d) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            c(str, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            c(str, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public int getInt(String str, int i) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            c(str, obj, "Integer", Integer.valueOf(i), e);
            return i;
        }
    }

    public long getLong(String str, long j) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            c(str, obj, "Long", Long.valueOf(j), e);
            return j;
        }
    }

    public short getShort(String str, short s) {
        d();
        Object obj = this.a.get(str);
        if (obj == null) {
            return s;
        }
        try {
            return ((Short) obj).shortValue();
        } catch (ClassCastException e) {
            c(str, obj, "Short", Short.valueOf(s), e);
            return s;
        }
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        CharSequence charSequence2 = getCharSequence(str);
        return charSequence2 == null ? charSequence : charSequence2;
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public DataBundle(ClassLoader classLoader) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = true;
        this.a = new HashMap();
        this.f = classLoader;
    }

    public DataBundle(int i) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = true;
        this.a = new HashMap(i);
        this.f = DataBundle.class.getClassLoader();
    }

    public DataBundle(Parcel parcel, int i) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = true;
        a(parcel, i);
        this.f = DataBundle.class.getClassLoader();
    }

    public DataBundle(DataBundle dataBundle) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = true;
        if (dataBundle.b != null) {
            Parcel parcelObtain = Parcel.obtain();
            this.b = parcelObtain;
            Parcel parcel = dataBundle.b;
            parcelObtain.appendFrom(parcel, 0, parcel.dataSize());
            this.b.setDataPosition(0);
        } else {
            this.b = null;
        }
        if (dataBundle.a != null) {
            this.a = new HashMap(dataBundle.a);
        } else {
            this.a = null;
        }
        this.c = dataBundle.c;
        this.d = dataBundle.d;
        this.f = dataBundle.f;
    }
}

package com.huawei.secure.android.common.intent;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.huawei.secure.android.common.activity.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SafeBundle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22843b = "SafeBundle";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22844c = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f22845a;

    public SafeBundle() {
        this(new Bundle());
    }

    public void clear() {
        try {
            this.f22845a.clear();
        } catch (Throwable unused) {
            a.a(f22843b, "clear exception.");
        }
    }

    public boolean containsKey(String str) {
        try {
            return this.f22845a.containsKey(str);
        } catch (Throwable unused) {
            a.a(f22843b, "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f22845a.get(str);
        } catch (Throwable th) {
            a.a(f22843b, "get exception: " + th.getMessage(), true);
            return null;
        }
    }

    public IBinder getBinder(String str) {
        try {
            return this.f22845a.getBinder(str);
        } catch (Throwable th) {
            a.a(f22843b, "getBinder exception: " + th.getMessage(), true);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        try {
            return this.f22845a.getBooleanArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getBooleanArray exception: " + th.getMessage(), true);
            return new boolean[0];
        }
    }

    public boolean[] getBooleanArrayReturnNotNull(String str) {
        try {
            boolean[] booleanArray = this.f22845a.getBooleanArray(str);
            return booleanArray == null ? new boolean[0] : booleanArray;
        } catch (Throwable th) {
            a.a(f22843b, "getBooleanArray exception: " + th.getMessage(), true);
            return new boolean[0];
        }
    }

    public Bundle getBundle() {
        return this.f22845a;
    }

    public Bundle getBundleReturnNotNull(String str) {
        try {
            Bundle bundle = this.f22845a.getBundle(str);
            return bundle == null ? new Bundle() : bundle;
        } catch (Throwable th) {
            a.a(f22843b, "getBundle exception: " + th.getMessage(), true);
            return new Bundle();
        }
    }

    public byte getByte(String str) {
        try {
            return this.f22845a.getByte(str);
        } catch (Throwable unused) {
            return (byte) 0;
        }
    }

    public byte[] getByteArray(String str) {
        try {
            return this.f22845a.getByteArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getByteArray exception: " + th.getMessage(), true);
            return new byte[0];
        }
    }

    public byte[] getByteArrayReturnNotNull(String str) {
        try {
            byte[] byteArray = this.f22845a.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Throwable th) {
            a.a(f22843b, "getByteArray exception: " + th.getMessage(), true);
            return new byte[0];
        }
    }

    public char getChar(String str) {
        try {
            return this.f22845a.getChar(str);
        } catch (Throwable unused) {
            return (char) 0;
        }
    }

    public char[] getCharArray(String str) {
        try {
            return this.f22845a.getCharArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getCharArray exception: " + th.getMessage(), true);
            return new char[0];
        }
    }

    public char[] getCharArrayReturnNotNull(String str) {
        try {
            char[] charArray = this.f22845a.getCharArray(str);
            return charArray == null ? new char[0] : charArray;
        } catch (Throwable th) {
            a.a(f22843b, "getCharArray exception: " + th.getMessage(), true);
            return new char[0];
        }
    }

    public CharSequence getCharSequence(String str) {
        try {
            return this.f22845a.getCharSequence(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        try {
            return this.f22845a.getCharSequenceArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequenceArray exception: " + th.getMessage(), true);
            return new CharSequence[0];
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        try {
            return this.f22845a.getCharSequenceArrayList(str);
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequenceArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayListReturnNotNull(String str) {
        try {
            ArrayList<CharSequence> charSequenceArrayList = this.f22845a.getCharSequenceArrayList(str);
            return charSequenceArrayList == null ? new ArrayList<>() : charSequenceArrayList;
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequenceArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public CharSequence[] getCharSequenceArrayReturnNotNull(String str) {
        try {
            CharSequence[] charSequenceArray = this.f22845a.getCharSequenceArray(str);
            return charSequenceArray == null ? new CharSequence[0] : charSequenceArray;
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequenceArrayReturnNotNull exception: " + th.getMessage(), true);
            return new CharSequence[0];
        }
    }

    public CharSequence getCharSequenceReturnNotNull(String str) {
        CharSequence charSequence;
        try {
            charSequence = this.f22845a.getCharSequence(str);
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequenceReturnNotNull exception: " + th.getMessage(), true);
            charSequence = "";
        }
        return TextUtils.isEmpty(charSequence) ? "" : charSequence;
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        try {
            return this.f22845a.getDoubleArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getDoubleArray exception: " + th.getMessage(), true);
            return new double[0];
        }
    }

    public double[] getDoubleArrayReturnNotNull(String str) {
        try {
            double[] doubleArray = this.f22845a.getDoubleArray(str);
            return doubleArray == null ? new double[0] : doubleArray;
        } catch (Throwable th) {
            a.a(f22843b, "getDoubleArray exception: " + th.getMessage(), true);
            return new double[0];
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        try {
            return this.f22845a.getFloatArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getFloatArray exception: " + th.getMessage(), true);
            return new float[0];
        }
    }

    public float[] getFloatArrayReturnNotNull(String str) {
        try {
            float[] floatArray = this.f22845a.getFloatArray(str);
            return floatArray == null ? new float[0] : floatArray;
        } catch (Throwable th) {
            a.a(f22843b, "getFloatArray exception: " + th.getMessage(), true);
            return new float[0];
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        try {
            return this.f22845a.getIntArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getIntArray exception: " + th.getMessage(), true);
            return new int[0];
        }
    }

    public int[] getIntArrayReturnNotNull(String str) {
        try {
            int[] intArray = this.f22845a.getIntArray(str);
            return intArray == null ? new int[0] : intArray;
        } catch (Throwable th) {
            a.a(f22843b, "getIntArray exception: " + th.getMessage(), true);
            return new int[0];
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        try {
            return this.f22845a.getIntegerArrayList(str);
        } catch (Throwable th) {
            a.a(f22843b, "getIntegerArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<Integer> getIntegerArrayListReturnNotNull(String str) {
        try {
            ArrayList<Integer> integerArrayList = this.f22845a.getIntegerArrayList(str);
            return integerArrayList == null ? new ArrayList<>() : integerArrayList;
        } catch (Throwable th) {
            a.a(f22843b, "getIntegerArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public long[] getLongArray(String str) {
        try {
            return this.f22845a.getLongArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getLongArray exception: " + th.getMessage(), true);
            return new long[0];
        }
    }

    public long[] getLongArrayReturnNotNull(String str) {
        try {
            long[] longArray = this.f22845a.getLongArray(str);
            return longArray == null ? new long[0] : longArray;
        } catch (Throwable th) {
            a.a(f22843b, "getLongArray exception: " + th.getMessage(), true);
            return new long[0];
        }
    }

    public <T extends Parcelable> T getParcelable(String str) {
        try {
            return (T) this.f22845a.getParcelable(str);
        } catch (Throwable th) {
            a.a(f22843b, "getParcelable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public Parcelable[] getParcelableArray(String str) {
        try {
            return this.f22845a.getParcelableArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getParcelableArray exception: " + th.getMessage(), true);
            return new Parcelable[0];
        }
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        try {
            return this.f22845a.getParcelableArrayList(str);
        } catch (Throwable th) {
            a.a(f22843b, "getParcelableArrayList exception: " + th.getMessage(), true);
            return null;
        }
    }

    public Parcelable[] getParcelableArrayReturnNotNull(String str) {
        try {
            Parcelable[] parcelableArray = this.f22845a.getParcelableArray(str);
            return parcelableArray == null ? new Parcelable[0] : parcelableArray;
        } catch (Throwable th) {
            a.a(f22843b, "getParcelableArray exception: " + th.getMessage(), true);
            return new Parcelable[0];
        }
    }

    public Object getReturnNotNull(String str) {
        try {
            Object obj = this.f22845a.get(str);
            return obj == null ? new Object() : obj;
        } catch (Throwable th) {
            a.a(f22843b, "get exception: " + th.getMessage(), true);
            return new Object();
        }
    }

    public Serializable getSerializable(String str) {
        try {
            return this.f22845a.getSerializable(str);
        } catch (Throwable th) {
            a.a(f22843b, "getSerializable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public short getShort(String str) {
        try {
            return this.f22845a.getShort(str);
        } catch (Throwable unused) {
            return (short) 0;
        }
    }

    public short[] getShortArray(String str) {
        try {
            return this.f22845a.getShortArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getShortArray exception: " + th.getMessage(), true);
            return new short[0];
        }
    }

    public short[] getShortArrayReturnNotNull(String str) {
        try {
            short[] shortArray = this.f22845a.getShortArray(str);
            return shortArray == null ? new short[0] : shortArray;
        } catch (Throwable th) {
            a.a(f22843b, "getShortArray exception: " + th.getMessage(), true);
            return new short[0];
        }
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        try {
            return this.f22845a.getSparseParcelableArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getSparseParcelableArray exception: " + th.getMessage(), true);
            return null;
        }
    }

    public String getString(String str) {
        try {
            return this.f22845a.getString(str);
        } catch (Throwable th) {
            a.a(f22843b, "getString exception: " + th.getMessage(), true);
            return "";
        }
    }

    public String[] getStringArray(String str) {
        try {
            return this.f22845a.getStringArray(str);
        } catch (Throwable th) {
            a.a(f22843b, "getStringArray exception: " + th.getMessage(), true);
            return new String[0];
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        try {
            return this.f22845a.getStringArrayList(str);
        } catch (Throwable th) {
            a.a(f22843b, "getStringArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<String> getStringArrayListReturnNotNull(String str) {
        try {
            ArrayList<String> stringArrayList = this.f22845a.getStringArrayList(str);
            return stringArrayList == null ? new ArrayList<>() : stringArrayList;
        } catch (Throwable th) {
            a.a(f22843b, "getStringArrayList exception: " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public String[] getStringArrayReturnNotNull(String str) {
        try {
            String[] stringArray = this.f22845a.getStringArray(str);
            return stringArray == null ? new String[0] : stringArray;
        } catch (Throwable th) {
            a.a(f22843b, "getStringArray exception: " + th.getMessage(), true);
            return new String[0];
        }
    }

    public String getStringReturnNotNull(String str) {
        String string;
        try {
            string = this.f22845a.getString(str);
        } catch (Throwable th) {
            a.a(f22843b, "getString exception: " + th.getMessage(), true);
            string = "";
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public boolean isEmpty() {
        try {
            return this.f22845a.isEmpty();
        } catch (Throwable unused) {
            a.a(f22843b, "isEmpty exception");
            return true;
        }
    }

    public Set<String> keySet() {
        try {
            return this.f22845a.keySet();
        } catch (Throwable unused) {
            a.a(f22843b, "keySet exception.");
            return null;
        }
    }

    public SafeBundle putAll(Bundle bundle) {
        if (bundle != null) {
            try {
                this.f22845a.putAll(bundle);
                return this;
            } catch (Throwable unused) {
                a.a(f22843b, "putAll exception");
            }
        }
        return this;
    }

    public SafeBundle putBinder(String str, IBinder iBinder) {
        try {
            this.f22845a.putBinder(str, iBinder);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putBundle exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putBoolean(String str, boolean z) {
        try {
            this.f22845a.putBoolean(str, z);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putBoolean exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putBooleanArray(String str, boolean[] zArr) {
        try {
            this.f22845a.putBooleanArray(str, zArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putBooleanArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putBundle(String str, Bundle bundle) {
        try {
            this.f22845a.putBundle(str, bundle);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putBundle exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putByte(String str, byte b2) {
        try {
            this.f22845a.putByte(str, b2);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putByte exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putByteArray(String str, byte[] bArr) {
        try {
            this.f22845a.putByteArray(str, bArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putByteArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putChar(String str, char c2) {
        try {
            this.f22845a.putChar(str, c2);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putChar exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putCharArray(String str, char[] cArr) {
        try {
            this.f22845a.putCharArray(str, cArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putCharArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putCharSequence(String str, CharSequence charSequence) {
        try {
            this.f22845a.putCharSequence(str, charSequence);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putCharSequence exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        try {
            this.f22845a.putCharSequenceArray(str, charSequenceArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putCharSequenceArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putCharSequenceArrayList(String str, ArrayList<CharSequence> arrayList) {
        try {
            this.f22845a.putCharSequenceArrayList(str, arrayList);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putCharSequenceArrayList exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putDouble(String str, double d) {
        try {
            this.f22845a.putDouble(str, d);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putDouble exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putDoubleArray(String str, double[] dArr) {
        try {
            this.f22845a.putDoubleArray(str, dArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putDoubleArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putFloat(String str, float f) {
        try {
            this.f22845a.putFloat(str, f);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putFloat exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putFloatArray(String str, float[] fArr) {
        try {
            this.f22845a.putFloatArray(str, fArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putFloatArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putInt(String str, int i) {
        try {
            this.f22845a.putInt(str, i);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putInt exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putIntArray(String str, int[] iArr) {
        try {
            this.f22845a.putIntArray(str, iArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putIntArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        try {
            this.f22845a.putIntegerArrayList(str, arrayList);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putIntegerArrayList exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putLong(String str, long j) {
        try {
            this.f22845a.putLong(str, j);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putLong exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putLongArray(String str, long[] jArr) {
        try {
            this.f22845a.putLongArray(str, jArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putLongArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putParcelable(String str, Parcelable parcelable) {
        try {
            this.f22845a.putParcelable(str, parcelable);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putParcelable exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putParcelableArray(String str, Parcelable[] parcelableArr) {
        try {
            this.f22845a.putParcelableArray(str, parcelableArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putParcelableArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        try {
            this.f22845a.putParcelableArrayList(str, arrayList);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putParcelableArrayList exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putSerializable(String str, Serializable serializable) {
        try {
            this.f22845a.putSerializable(str, serializable);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putSerializable exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putShort(String str, short s) {
        try {
            this.f22845a.putShort(str, s);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putShort exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putShortArray(String str, short[] sArr) {
        try {
            this.f22845a.putShortArray(str, sArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putShortArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putSize(String str, Size size) {
        try {
            this.f22845a.putSize(str, size);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putSize exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putSizeF(String str, SizeF sizeF) {
        try {
            this.f22845a.putSizeF(str, sizeF);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putSizeF exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        try {
            this.f22845a.putSparseParcelableArray(str, sparseArray);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putSparseParcelableArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putString(String str, String str2) {
        try {
            this.f22845a.putString(str, str2);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putString exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putStringArray(String str, String[] strArr) {
        try {
            this.f22845a.putStringArray(str, strArr);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putStringArray exception: " + th.getMessage(), true);
            return this;
        }
    }

    public SafeBundle putStringArrayList(String str, ArrayList<String> arrayList) {
        try {
            this.f22845a.putStringArrayList(str, arrayList);
            return this;
        } catch (Throwable th) {
            a.a(f22843b, "putStringArrayList exception: " + th.getMessage(), true);
            return this;
        }
    }

    public void remove(String str) {
        try {
            this.f22845a.remove(str);
        } catch (Throwable unused) {
            a.a(f22843b, "remove exception. key:");
        }
    }

    public int size() {
        try {
            return this.f22845a.size();
        } catch (Throwable unused) {
            a.a(f22843b, "size exception");
            return 0;
        }
    }

    public String toString() {
        try {
            return this.f22845a.toString();
        } catch (Throwable unused) {
            a.a(f22843b, "toString exception.");
            return null;
        }
    }

    public SafeBundle(Bundle bundle) {
        this.f22845a = bundle == null ? new Bundle() : bundle;
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return this.f22845a.getBoolean(str, z);
        } catch (Throwable th) {
            a.a(f22843b, "getBoolean exception : " + th.getMessage(), true);
            return z;
        }
    }

    public Bundle getBundle(String str) {
        try {
            return this.f22845a.getBundle(str);
        } catch (Throwable th) {
            a.a(f22843b, "getBundle exception: " + th.getMessage(), true);
            return null;
        }
    }

    public byte getByte(String str, byte b2) {
        try {
            return this.f22845a.getByte(str, b2).byteValue();
        } catch (Throwable th) {
            a.a(f22843b, "getByte exception: " + th.getMessage(), true);
            return b2;
        }
    }

    public char getChar(String str, char c2) {
        try {
            return this.f22845a.getChar(str, c2);
        } catch (Throwable th) {
            a.a(f22843b, "getChar exception: " + th.getMessage(), true);
            return c2;
        }
    }

    public double getDouble(String str, double d) {
        try {
            return this.f22845a.getDouble(str, d);
        } catch (Throwable th) {
            a.a(f22843b, "getDouble exception: " + th.getMessage(), true);
            return d;
        }
    }

    public float getFloat(String str, float f) {
        try {
            return this.f22845a.getFloat(str, f);
        } catch (Throwable th) {
            a.a(f22843b, "getFloat exception: " + th.getMessage(), true);
            return f;
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.f22845a.getInt(str, i);
        } catch (Throwable th) {
            a.a(f22843b, "getInt exception: " + th.getMessage(), true);
            return i;
        }
    }

    public long getLong(String str, long j) {
        try {
            return this.f22845a.getLong(str, j);
        } catch (Throwable th) {
            a.a(f22843b, "getLong exception: " + th.getMessage(), true);
            return j;
        }
    }

    public short getShort(String str, short s) {
        try {
            return this.f22845a.getShort(str, s);
        } catch (Throwable th) {
            a.a(f22843b, "getShort exception: " + th.getMessage(), true);
            return s;
        }
    }

    public Size getSize(String str) {
        try {
            return this.f22845a.getSize(str);
        } catch (Throwable th) {
            a.a(f22843b, "getSize exception: " + th.getMessage(), true);
            return null;
        }
    }

    public SizeF getSizeF(String str) {
        try {
            return this.f22845a.getSizeF(str);
        } catch (Throwable th) {
            a.a(f22843b, "getSizeF exception: " + th.getMessage(), true);
            return null;
        }
    }

    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        try {
            return this.f22845a.getCharSequence(str, charSequence);
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequence exception: " + th.getMessage(), true);
            return charSequence;
        }
    }

    public <T extends Parcelable> T getParcelable(String str, Class<T> cls) {
        try {
            Parcelable parcelable = this.f22845a.getParcelable(str);
            if (cls.isInstance(parcelable)) {
                return cls.cast(parcelable);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22843b, "getParcelable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public <T extends Serializable> T getSerializable(String str, Class<T> cls) {
        try {
            Serializable serializable = this.f22845a.getSerializable(str);
            if (cls.isInstance(serializable)) {
                return cls.cast(serializable);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22843b, "getSerializable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f22845a.getString(str, str2);
        } catch (Throwable th) {
            a.a(f22843b, "getString exception: " + th.getMessage(), true);
            return str2;
        }
    }

    public CharSequence getCharSequenceReturnNotNull(String str, CharSequence charSequence) {
        try {
            CharSequence charSequence2 = this.f22845a.getCharSequence(str, charSequence);
            return charSequence2 == null ? "" : charSequence2;
        } catch (Throwable th) {
            a.a(f22843b, "getCharSequence exception: " + th.getMessage(), true);
            return charSequence;
        }
    }

    public String getStringReturnNotNull(String str, String str2) {
        try {
            String string = this.f22845a.getString(str, str2);
            return string == null ? str2 : string;
        } catch (Throwable th) {
            a.a(f22843b, "getString exception: " + th.getMessage(), true);
            return str2;
        }
    }
}

package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap<MMKVRecoverStrategic, Integer> f10712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumMap<MMKVLogLevel, Integer> f10713b;
    public static final MMKVLogLevel[] c;
    public static final Set<Long> d;
    public static String e;
    public static boolean f;
    public static final HashMap<String, Parcelable.Creator<?>> g;
    public static boolean h;
    private final long nativeHandle;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10714a;

        static {
            int[] iArr = new int[MMKVLogLevel.values().length];
            f10714a = iArr;
            try {
                iArr[MMKVLogLevel.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10714a[MMKVLogLevel.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10714a[MMKVLogLevel.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10714a[MMKVLogLevel.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10714a[MMKVLogLevel.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface b {
        void loadLibrary(String str);
    }

    static {
        EnumMap<MMKVRecoverStrategic, Integer> enumMap = new EnumMap<>(MMKVRecoverStrategic.class);
        f10712a = enumMap;
        enumMap.put(MMKVRecoverStrategic.OnErrorDiscard, 0);
        enumMap.put(MMKVRecoverStrategic.OnErrorRecover, 1);
        EnumMap<MMKVLogLevel, Integer> enumMap2 = new EnumMap<>(MMKVLogLevel.class);
        f10713b = enumMap2;
        MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelDebug;
        enumMap2.put(mMKVLogLevel, 0);
        MMKVLogLevel mMKVLogLevel2 = MMKVLogLevel.LevelInfo;
        enumMap2.put(mMKVLogLevel2, 1);
        MMKVLogLevel mMKVLogLevel3 = MMKVLogLevel.LevelWarning;
        enumMap2.put(mMKVLogLevel3, 2);
        MMKVLogLevel mMKVLogLevel4 = MMKVLogLevel.LevelError;
        enumMap2.put(mMKVLogLevel4, 3);
        MMKVLogLevel mMKVLogLevel5 = MMKVLogLevel.LevelNone;
        enumMap2.put(mMKVLogLevel5, 4);
        c = new MMKVLogLevel[]{mMKVLogLevel, mMKVLogLevel2, mMKVLogLevel3, mMKVLogLevel4, mMKVLogLevel5};
        d = new HashSet();
        e = null;
        f = true;
        g = new HashMap<>();
        h = false;
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    public static String A(Context context, b bVar, MMKVLogLevel mMKVLogLevel) {
        return C(context, context.getFilesDir().getAbsolutePath() + "/mmkv", bVar, mMKVLogLevel);
    }

    public static String B(Context context, MMKVLogLevel mMKVLogLevel) {
        return C(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, mMKVLogLevel);
    }

    public static String C(Context context, String str, b bVar, MMKVLogLevel mMKVLogLevel) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            n();
        } else {
            p();
        }
        return o(str, context.getCacheDir().getAbsolutePath(), bVar, mMKVLogLevel);
    }

    public static int D(MMKVLogLevel mMKVLogLevel) {
        int i = a.f10714a[mMKVLogLevel.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    return 1;
                }
            }
        }
        return i2;
    }

    public static MMKV E(String str, int i, int i2, String str2) throws RuntimeException {
        long mMKVWithAshmemFD = getMMKVWithAshmemFD(str, i, i2, str2);
        if (mMKVWithAshmemFD != 0) {
            return new MMKV(mMKVWithAshmemFD);
        }
        throw new RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    public static MMKV F(Context context, String str, int i, int i2, String str2) throws RuntimeException {
        MMKV mmkvA;
        if (e == null) {
            throw new IllegalStateException("You should Call MMKV.initialize() first.");
        }
        String strB = MMKVContentProvider.b(context, Process.myPid());
        if (strB == null || strB.length() == 0) {
            K(MMKVLogLevel.LevelError, "process name detect fail, try again later");
            throw new IllegalStateException("process name detect fail, try again later");
        }
        if (strB.contains(":")) {
            Uri uriA = MMKVContentProvider.a(context);
            if (uriA == null) {
                K(MMKVLogLevel.LevelError, "MMKVContentProvider has invalid authority");
                throw new IllegalStateException("MMKVContentProvider has invalid authority");
            }
            MMKVLogLevel mMKVLogLevel = MMKVLogLevel.LevelInfo;
            K(mMKVLogLevel, "getting parcelable mmkv in process, Uri = " + uriA);
            Bundle bundle = new Bundle();
            bundle.putInt("KEY_SIZE", i);
            bundle.putInt("KEY_MODE", i2);
            if (str2 != null) {
                bundle.putString("KEY_CRYPT", str2);
            }
            Bundle bundleCall = context.getContentResolver().call(uriA, "mmkvFromAshmemID", str, bundle);
            if (bundleCall != null) {
                bundleCall.setClassLoader(ParcelableMMKV.class.getClassLoader());
                ParcelableMMKV parcelableMMKV = (ParcelableMMKV) bundleCall.getParcelable("KEY");
                if (parcelableMMKV != null && (mmkvA = parcelableMMKV.a()) != null) {
                    K(mMKVLogLevel, mmkvA.mmapID() + " fd = " + mmkvA.ashmemFD() + ", meta fd = " + mmkvA.ashmemMetaFD());
                    return mmkvA;
                }
            }
        }
        K(MMKVLogLevel.LevelInfo, "getting mmkv in main process");
        long mMKVWithIDAndSize = getMMKVWithIDAndSize(str, i, i2 | 8, str2);
        if (mMKVWithIDAndSize != 0) {
            return new MMKV(mMKVWithIDAndSize);
        }
        throw new IllegalStateException("Fail to create an Ashmem MMKV instance [" + str + "]");
    }

    public static MMKV G(String str, int i) throws RuntimeException {
        if (e != null) {
            return a(getMMKVWithID(str, i, null, null), str, i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static MMKV H(String str, int i, String str2) throws RuntimeException {
        if (e != null) {
            return a(getMMKVWithID(str, i, str2, null), str, i);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static MMKV I(String str, String str2) throws RuntimeException {
        if (e != null) {
            return a(getMMKVWithID(str, 1, null, str2), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static void K(MMKVLogLevel mMKVLogLevel, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = f10713b.get(mMKVLogLevel);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    public static MMKV a(long j, String str, int i) throws RuntimeException {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!f) {
            return new MMKV(j);
        }
        Set<Long> set = d;
        synchronized (set) {
            try {
                if (!set.contains(Long.valueOf(j))) {
                    if (!checkProcessMode(j)) {
                        if (i == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    set.add(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(j);
    }

    private native long actualSize(long j);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d2);

    private native float decodeFloat(long j, String str, float f2);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeDouble(long j, String str, double d2);

    private native boolean encodeFloat(long j, String str, float f2);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeString(long j, String str, String str2);

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    public static native boolean isFileValid(String str, String str2);

    private static native void jniInitialize(String str, String str2, int i);

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        int i3 = a.f10714a[c[i].ordinal()];
    }

    public static void n() {
        synchronized (d) {
            f = false;
        }
    }

    public static String o(String str, String str2, b bVar, MMKVLogLevel mMKVLogLevel) {
        if (bVar != null) {
            bVar.loadLibrary("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, D(mMKVLogLevel));
        e = str;
        return str;
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        K(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = f10712a.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        MMKVRecoverStrategic mMKVRecoverStrategic = MMKVRecoverStrategic.OnErrorDiscard;
        K(MMKVLogLevel.LevelInfo, "Recover strategic for " + str + " is " + mMKVRecoverStrategic);
        Integer num = f10712a.get(mMKVRecoverStrategic);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void p() {
        synchronized (d) {
            f = true;
        }
    }

    public static native int pageSize();

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, String str3);

    private static native void setCallbackHandler(boolean z, boolean z2);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j2, int i);

    public static String x() {
        return e;
    }

    public static String z(Context context) {
        return C(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, MMKVLogLevel.LevelInfo);
    }

    public void J(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    public native String[] allKeys();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    public boolean b(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public boolean c(String str) {
        return decodeBool(this.nativeHandle, str, false);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return b(str);
    }

    public native String cryptKey();

    public boolean d(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    public float e(String str, float f2) {
        return decodeFloat(this.nativeHandle, str, f2);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public int f(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public long g(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        return decodeFloat(this.nativeHandle, str, f2);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return l(str, set);
    }

    public <T extends Parcelable> T h(String str, Class<T> cls) {
        return (T) i(str, cls, null);
    }

    public <T extends Parcelable> T i(String str, Class<T> cls, T t) {
        byte[] bArrDecodeBytes;
        Parcelable.Creator<?> creator;
        if (cls == null || (bArrDecodeBytes = decodeBytes(this.nativeHandle, str)) == null) {
            return t;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArrDecodeBytes, 0, bArrDecodeBytes.length);
        parcelObtain.setDataPosition(0);
        try {
            try {
                String string = cls.toString();
                HashMap<String, Parcelable.Creator<?>> map = g;
                synchronized (map) {
                    try {
                        creator = map.get(string);
                        if (creator == null && (creator = (Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                            map.put(string, creator);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (creator != null) {
                    T t2 = (T) creator.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    return t2;
                }
                throw new Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + string);
            } catch (Exception e2) {
                K(MMKVLogLevel.LevelError, e2.toString());
                parcelObtain.recycle();
                return t;
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    public String j(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public String k(String str, String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    public Set<String> l(String str, Set<String> set) {
        return m(str, set, HashSet.class);
    }

    public native void lock();

    public Set<String> m(String str, Set<String> set, Class<? extends Set> cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet == null) {
            return set;
        }
        try {
            Set<String> setNewInstance = cls.newInstance();
            setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
            return setNewInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f2) {
        encodeFloat(this.nativeHandle, str, f2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        v(str, set);
        return this;
    }

    public boolean q(String str, float f2) {
        return encodeFloat(this.nativeHandle, str, f2);
    }

    public boolean r(String str, int i) {
        return encodeInt(this.nativeHandle, str, i);
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        J(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public boolean s(String str, long j) {
        return encodeLong(this.nativeHandle, str, j);
    }

    public boolean t(String str, Parcelable parcelable) {
        if (parcelable == null) {
            return encodeBytes(this.nativeHandle, str, null);
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return encodeBytes(this.nativeHandle, str, bArrMarshall);
    }

    public native void trim();

    public native boolean tryLock();

    public boolean u(String str, String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public boolean v(String str, Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    public boolean w(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public int y(SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, key, (String) value);
                } else if (value instanceof Set) {
                    v(key, (Set) value);
                } else {
                    K(MMKVLogLevel.LevelError, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }
}

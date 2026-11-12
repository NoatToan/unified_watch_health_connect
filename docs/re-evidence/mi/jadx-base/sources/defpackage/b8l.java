package defpackage;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b8l {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3925a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f3925a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3925a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3925a[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3925a[ReadableType.Null.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3925a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3925a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(ReadableArray readableArray, int i, Object obj) {
        if (readableArray == null) {
            return obj;
        }
        try {
            int i2 = a.f3925a[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                return Double.valueOf(readableArray.getDouble(i));
            }
            if (i2 == 2) {
                return Boolean.valueOf(readableArray.getBoolean(i));
            }
            if (i2 == 3) {
                return readableArray.getString(i);
            }
            if (i2 == 5) {
                return readableArray.getMap(i);
            }
            if (i2 != 6) {
                return null;
            }
            return readableArray.getArray(i);
        } catch (NoSuchKeyException unused) {
            return obj;
        }
    }

    public static Object b(ReadableMap readableMap, String str, Object obj) {
        if (readableMap == null) {
            return obj;
        }
        try {
            switch (a.f3925a[readableMap.getType(str).ordinal()]) {
                case 1:
                    return Double.valueOf(readableMap.getDouble(str));
                case 2:
                    return Boolean.valueOf(readableMap.getBoolean(str));
                case 3:
                    return readableMap.getString(str);
                case 4:
                    return null;
                case 5:
                    return readableMap.getMap(str);
                case 6:
                    return readableMap.getArray(str);
                default:
                    return null;
            }
        } catch (NoSuchKeyException unused) {
            return obj;
        }
    }

    public static boolean c(ReadableMap readableMap, String str, boolean z) {
        if (readableMap == null) {
            return z;
        }
        try {
            int i = a.f3925a[readableMap.getType(str).ordinal()];
            if (i == 1) {
                return readableMap.getDouble(str) != 0.0d;
            }
            if (i == 2) {
                return readableMap.getBoolean(str);
            }
            if (i != 3) {
                if (i != 4) {
                    return z;
                }
                return false;
            }
            String string = readableMap.getString(str);
            if ("true".equalsIgnoreCase(string)) {
                return true;
            }
            "false".equalsIgnoreCase(string);
            return false;
        } catch (NoSuchKeyException unused) {
            return z;
        }
    }

    public static String d(ReadableArray readableArray, int i, String str) {
        if (readableArray == null) {
            return str;
        }
        try {
            int i2 = a.f3925a[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                double d = readableArray.getDouble(i);
                long j = (long) d;
                return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
            }
            if (i2 == 2) {
                return String.valueOf(readableArray.getBoolean(i));
            }
            if (i2 == 3) {
                return readableArray.getString(i);
            }
            if (i2 != 4) {
                return str;
            }
            return null;
        } catch (NoSuchKeyException unused) {
            return str;
        }
    }

    public static String e(ReadableMap readableMap, String str, String str2) {
        if (readableMap == null) {
            return str2;
        }
        try {
            int i = a.f3925a[readableMap.getType(str).ordinal()];
            if (i == 1) {
                double d = readableMap.getDouble(str);
                long j = (long) d;
                return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
            }
            if (i == 2) {
                return String.valueOf(readableMap.getBoolean(str));
            }
            if (i == 3) {
                return readableMap.getString(str);
            }
            if (i != 4) {
                return str2;
            }
            return null;
        } catch (NoSuchKeyException unused) {
            return str2;
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class exg {
    private static final int CAPACITY = 1;
    private static final String KEY_PARCEL_BUNDLE = "KEY_PARCEL_BUNDLE";
    private static final String TAG = "H5PRO_H5ProBaseBundle";
    private HashMap<String, Object> data;

    private <T> T get(String str, T t) {
        return isValid(str) ? (T) this.data.get(str) : t;
    }

    private boolean isValid(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty && this.data == null) {
            this.data = new HashMap<>(1);
        }
        return !zIsEmpty;
    }

    private <T> void put(String str, T t) {
        if (isValid(str)) {
            this.data.put(str, t);
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public Map<String, Object> getData() {
        HashMap<String, Object> map = this.data;
        return (map == null || map.isEmpty()) ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.data);
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void putAll(exg exgVar) {
        Map<String, Object> data;
        if (exgVar == null || (data = exgVar.getData()) == null || data.isEmpty()) {
            return;
        }
        if (this.data == null) {
            this.data = new HashMap<>(data.size());
        }
        this.data.putAll(exgVar.data);
    }

    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    public void putFloat(String str, float f) {
        put(str, Float.valueOf(f));
    }

    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    public void putString(String str, String str2) {
        put(str, str2);
    }

    public void readFromParcel(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle(classLoader);
        if (bundle == null) {
            return;
        }
        Serializable serializable = bundle.getSerializable(KEY_PARCEL_BUNDLE);
        if (serializable instanceof HashMap) {
            this.data = (HashMap) serializable;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_PARCEL_BUNDLE, this.data);
        parcel.writeBundle(bundle);
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return ((Boolean) get(str, Boolean.valueOf(z))).booleanValue();
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getBoolean: ClassCastException -> ", str));
            return z;
        }
    }

    public double getDouble(String str, double d) {
        try {
            return ((Double) get(str, Double.valueOf(d))).doubleValue();
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getDouble: ClassCastException -> ", str));
            return d;
        }
    }

    public float getFloat(String str, float f) {
        try {
            return ((Float) get(str, Float.valueOf(f))).floatValue();
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getFloat: ClassCastException -> ", str));
            return f;
        }
    }

    public int getInt(String str, int i) {
        try {
            return ((Integer) get(str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getInt: ClassCastException -> ", str));
            return i;
        }
    }

    public long getLong(String str, long j) {
        try {
            return ((Long) get(str, Long.valueOf(j))).longValue();
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getLong: ClassCastException -> ", str));
            return j;
        }
    }

    public String getString(String str, String str2) {
        try {
            return (String) get(str, str2);
        } catch (ClassCastException unused) {
            LogUtil.e(TAG, a.a("getString: ClassCastException -> ", str));
            return str2;
        }
    }
}

package com.huawei.hms.support.hwid.common.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.hwid.common.e.e;
import com.huawei.hms.support.hwid.common.e.g;
import com.huawei.hms.support.hwid.common.e.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f16618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f16619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16620c;

    public b(Context context, String str) {
        this.f16620c = "";
        this.f16619b = context.getApplicationContext();
        this.f16620c = str;
        b();
    }

    private boolean b() {
        if (g.a(this.f16619b)) {
            e.a("HwIdCeSharedPreferences", "Phone Still In Lock Mode", true);
            return false;
        }
        this.f16618a = this.f16619b.getSharedPreferences(this.f16620c, 0);
        boolean z = this.f16618a == null;
        e.a("HwIdCeSharedPreferences", "createSharedPreferences: " + z, true);
        return z;
    }

    private boolean c() {
        if (this.f16619b == null) {
            e.c("HwIdCeSharedPreferences", "mContext is null, can not use SharedPreferences.", true);
            return false;
        }
        if (this.f16618a == null) {
            e.c("HwIdCeSharedPreferences", "mSharedPreferences is null, need init.", true);
            synchronized (b.class) {
                if (this.f16618a == null) {
                    return b();
                }
            }
        }
        return true;
    }

    public String a(String str, String str2) {
        e.a("HwIdCeSharedPreferences", "getStringByRandomEncrypter, key:" + str, false);
        return !c() ? str2 : this.f16618a.getString(str, str2);
    }

    public Map<String, ?> a() {
        e.a("HwIdCeSharedPreferences", "getAll", true);
        if (c()) {
            return this.f16618a.getAll();
        }
        return null;
    }

    public boolean a(HashMap<String, Object> map) {
        SharedPreferences.Editor editorEdit;
        e.a("HwIdCeSharedPreferences", "saveMap", true);
        if (map == null || map.size() == 0) {
            e.c("HwIdCeSharedPreferences", "map is empty", true);
            return false;
        }
        if (!c() || (editorEdit = this.f16618a.edit()) == null) {
            return false;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                editorEdit.putString(key, String.valueOf(value));
            } else if ((value instanceof Integer) || (value instanceof Short) || (value instanceof Byte)) {
                editorEdit.putInt(key, h.a(String.valueOf(value)));
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                editorEdit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Double) {
                editorEdit.putFloat(key, (float) ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        return editorEdit.commit();
    }

    public String b(String str, String str2) {
        e.a("HwIdCeSharedPreferences", "getString, key:" + str, false);
        return !c() ? str2 : this.f16618a.getString(str, str2);
    }

    public boolean c(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        e.a("HwIdCeSharedPreferences", "setString, key:" + str, false);
        if (!c() || (editorEdit = this.f16618a.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }
}

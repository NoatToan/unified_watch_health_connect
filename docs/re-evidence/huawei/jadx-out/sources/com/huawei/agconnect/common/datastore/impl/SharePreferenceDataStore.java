package com.huawei.agconnect.common.datastore.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.datastore.IDataStore;

/* JADX INFO: loaded from: classes22.dex */
public class SharePreferenceDataStore<T> implements IDataStore<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4833c = "SharePreferenceDataStore";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SharedPreferences f4834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Class<T> f4835b;

    @Override // com.huawei.agconnect.common.datastore.IDataStore
    public boolean contains(String str) {
        return this.f4834a.contains(str);
    }

    void b(String str, Object obj, Class<?> cls) {
        if (Integer.class.equals(cls)) {
            this.f4834a.edit().putInt(str, ((Integer) obj).intValue()).apply();
            return;
        }
        if (Long.class.equals(cls)) {
            this.f4834a.edit().putLong(str, ((Long) obj).longValue()).apply();
            return;
        }
        if (Float.class.equals(cls)) {
            this.f4834a.edit().putFloat(str, ((Float) obj).floatValue()).apply();
            return;
        }
        if (Boolean.class.equals(cls)) {
            this.f4834a.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (String.class.equals(cls)) {
            this.f4834a.edit().putString(str, (String) obj).apply();
        } else if (!Parcelable.class.isAssignableFrom(cls)) {
            Logger.w(f4833c, "write not support object type");
        } else {
            this.f4834a.edit().putString(str, ParcelableSerializer.b((Parcelable) obj)).apply();
        }
    }

    @Override // com.huawei.agconnect.common.datastore.IDataStore
    public void b(String str) {
        this.f4834a.edit().remove(str).apply();
    }

    @Override // com.huawei.agconnect.common.datastore.IDataStore
    public T b(String str, T t) {
        return (T) a(str, t, this.f4835b);
    }

    @Override // com.huawei.agconnect.common.datastore.IDataStore
    public void a(String str, T t) {
        b(str, t, this.f4835b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    Object a(String str, T t, Class<?> cls) {
        if (Integer.class.equals(cls)) {
            return Integer.valueOf(this.f4834a.getInt(str, ((Integer) t).intValue()));
        }
        if (Long.class.equals(cls)) {
            return Long.valueOf(this.f4834a.getLong(str, ((Long) t).longValue()));
        }
        if (Float.class.equals(cls)) {
            return Float.valueOf(this.f4834a.getFloat(str, ((Float) t).floatValue()));
        }
        if (Boolean.class.equals(cls)) {
            return Boolean.valueOf(this.f4834a.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (String.class.equals(cls)) {
            return this.f4834a.getString(str, (String) t);
        }
        if (Parcelable.class.isAssignableFrom(cls)) {
            return ParcelableSerializer.a(this.f4834a.getString(str, null), cls);
        }
        Logger.w(f4833c, "read not support object type");
        return t;
    }

    @Override // com.huawei.agconnect.common.datastore.IDataStore
    public T a(String str) {
        return b(str, null);
    }

    public SharePreferenceDataStore(Context context, String str, Class<T> cls) {
        this.f4834a = context.getSharedPreferences(str, 0);
        this.f4835b = cls;
    }
}

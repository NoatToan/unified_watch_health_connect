package com.huawei.agconnect.common.datastore.impl;

import android.content.Context;
import android.os.Parcelable;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.datastore.ICrypto;

/* JADX INFO: loaded from: classes22.dex */
public class CryptoSharePreferenceDataStore<T> extends SharePreferenceDataStore<T> {
    private static final String e = "CryptoSharePreferenceDataStore";
    private final ICrypto d;

    @Override // com.huawei.agconnect.common.datastore.impl.SharePreferenceDataStore, com.huawei.agconnect.common.datastore.IDataStore
    public T b(String str, T t) {
        T t2;
        String str2 = (String) a(str, null, String.class);
        return (str2 == null || (t2 = (T) c(this.d.decrypt(str2))) == null) ? t : t2;
    }

    @Override // com.huawei.agconnect.common.datastore.impl.SharePreferenceDataStore, com.huawei.agconnect.common.datastore.IDataStore
    public void a(String str, T t) {
        if (t == null) {
            return;
        }
        super.b(str, this.d.encrypt(a(t)), String.class);
    }

    @Override // com.huawei.agconnect.common.datastore.impl.SharePreferenceDataStore, com.huawei.agconnect.common.datastore.IDataStore
    public T a(String str) {
        return b(str, null);
    }

    private Object c(String str) {
        try {
            if (Integer.class.equals(this.f4835b)) {
                return Integer.valueOf(str);
            }
            if (Long.class.equals(this.f4835b)) {
                return Long.valueOf(str);
            }
            if (Float.class.equals(this.f4835b)) {
                return Float.valueOf(str);
            }
            if (Boolean.class.equals(this.f4835b)) {
                return Boolean.valueOf(str);
            }
            if (String.class.equals(this.f4835b)) {
                return str;
            }
            if (Parcelable.class.isAssignableFrom(this.f4835b)) {
                return ParcelableSerializer.a(str, this.f4835b);
            }
            Logger.w(e, "stringToObject not support object type");
            return null;
        } catch (NumberFormatException unused) {
            Logger.e(e, "number format exception");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(T t) {
        if (!Integer.class.equals(this.f4835b) && !Long.class.equals(this.f4835b) && !Float.class.equals(this.f4835b) && !Boolean.class.equals(this.f4835b)) {
            if (String.class.equals(this.f4835b)) {
                return (String) t;
            }
            if (Parcelable.class.isAssignableFrom(this.f4835b)) {
                return ParcelableSerializer.b((Parcelable) t);
            }
            Logger.w(e, "objectToString not support object type");
            return null;
        }
        return t.toString();
    }

    public CryptoSharePreferenceDataStore(Context context, String str, Class<T> cls, ICrypto iCrypto) {
        super(context, str, cls);
        this.d = iCrypto;
    }
}

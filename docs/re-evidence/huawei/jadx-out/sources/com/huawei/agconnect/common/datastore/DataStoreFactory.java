package com.huawei.agconnect.common.datastore;

import android.content.Context;
import com.huawei.agconnect.common.datastore.impl.CryptoSharePreferenceDataStore;
import com.huawei.agconnect.common.datastore.impl.SharePreferenceDataStore;

/* JADX INFO: loaded from: classes22.dex */
public class DataStoreFactory {
    public static <T> IDataStore<T> a(Context context, String str, Class<T> cls, ICrypto iCrypto) {
        return new CryptoSharePreferenceDataStore(context, str, cls, iCrypto);
    }

    public static <T> IDataStore<T> a(Context context, String str, Class<T> cls) {
        return new SharePreferenceDataStore(context, str, cls);
    }
}

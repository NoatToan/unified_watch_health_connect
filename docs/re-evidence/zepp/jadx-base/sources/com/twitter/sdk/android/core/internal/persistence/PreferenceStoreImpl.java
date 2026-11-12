package com.twitter.sdk.android.core.internal.persistence;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes18.dex */
public class PreferenceStoreImpl implements PreferenceStore {
    private final SharedPreferences a;

    public PreferenceStoreImpl(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.a = context.getSharedPreferences(str, 0);
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PreferenceStore
    public SharedPreferences.Editor edit() {
        return this.a.edit();
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PreferenceStore
    public SharedPreferences get() {
        return this.a;
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PreferenceStore
    public boolean save(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }
}

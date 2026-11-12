package com.twitter.sdk.android.core.internal.persistence;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes18.dex */
public interface PreferenceStore {
    SharedPreferences.Editor edit();

    SharedPreferences get();

    boolean save(SharedPreferences.Editor editor);
}

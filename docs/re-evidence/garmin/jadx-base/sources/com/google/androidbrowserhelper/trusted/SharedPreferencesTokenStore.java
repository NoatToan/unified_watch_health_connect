package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.browser.trusted.b;
import androidx.browser.trusted.e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SharedPreferencesTokenStore implements e {
    private static final String KEY_TOKEN = "SharedPreferencesTokenStore.TOKEN";
    private final Context mContext;

    public SharedPreferencesTokenStore(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // androidx.browser.trusted.e
    public b load() {
        String string = PrefUtils.getAppSharedPreferences(this.mContext).getString(KEY_TOKEN, null);
        if (string == null) {
            return null;
        }
        return b.b(Base64.decode(string, 3));
    }

    public void setVerifiedProvider(String str, PackageManager packageManager) {
        store(b.a(packageManager, str));
    }

    @Override // androidx.browser.trusted.e
    public void store(b bVar) {
        SharedPreferences appSharedPreferences = PrefUtils.getAppSharedPreferences(this.mContext);
        if (bVar == null) {
            appSharedPreferences.edit().remove(KEY_TOKEN).apply();
            return;
        }
        byte[] bArr = bVar.f5316a.f5318a;
        appSharedPreferences.edit().putString(KEY_TOKEN, Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
    }
}

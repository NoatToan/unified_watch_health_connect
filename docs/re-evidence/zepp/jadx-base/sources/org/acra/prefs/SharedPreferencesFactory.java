package org.acra.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public class SharedPreferencesFactory {
    private final Context a;
    private final CoreConfiguration b;

    public SharedPreferencesFactory(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = context;
        this.b = coreConfiguration;
    }

    public static boolean shouldEnableACRA(@NonNull SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getBoolean(ACRA.PREF_ENABLE_ACRA, sharedPreferences.getBoolean(ACRA.PREF_DISABLE_ACRA, false) ? false : true);
        } catch (Exception unused) {
            return true;
        }
    }

    @NonNull
    public SharedPreferences create() {
        if (this.a != null) {
            return !"".equals(this.b.sharedPreferencesName()) ? this.a.getSharedPreferences(this.b.sharedPreferencesName(), 0) : PreferenceManager.getDefaultSharedPreferences(this.a);
        }
        throw new IllegalStateException("Cannot call ACRA.getACRASharedPreferences() before ACRA.init().");
    }
}

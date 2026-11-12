package org.acra.legacy;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes23.dex */
public class LegacyFileHandler {
    private static final String c = "acra.legacyAlreadyConvertedTo4.8.0";
    private static final String d = "acra.legacyAlreadyConvertedToJson";
    private final Context a;
    private final SharedPreferences b;

    public LegacyFileHandler(Context context, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = sharedPreferences;
    }

    public void updateToCurrentVersionIfNecessary() {
        if (!this.b.getBoolean(c, false)) {
            new c(this.a).d();
            this.b.edit().putBoolean(c, true).apply();
        }
        if (this.b.getBoolean(d, false)) {
            return;
        }
        new a(this.a).a();
        this.b.edit().putBoolean(d, true).apply();
    }
}

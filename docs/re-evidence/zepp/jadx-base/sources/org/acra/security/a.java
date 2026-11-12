package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
final class a extends BaseKeyStoreFactory {
    private final String b;

    public a(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public InputStream getInputStream(@NonNull Context context) {
        try {
            return context.getAssets().open(this.b);
        } catch (IOException e) {
            ACRA.log.e(ACRA.LOG_TAG, "Could not open certificate in asset://" + this.b, e);
            return null;
        }
    }
}

package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
final class b extends BaseKeyStoreFactory {
    private final String b;

    public b(String str, String str2) {
        super(str);
        this.b = str2;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public InputStream getInputStream(@NonNull Context context) {
        try {
            return new FileInputStream(this.b);
        } catch (FileNotFoundException e) {
            ACRA.log.e(ACRA.LOG_TAG, "Could not find File " + this.b, e);
            return null;
        }
    }
}

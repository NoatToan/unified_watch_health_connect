package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
final class c extends BaseKeyStoreFactory {

    @RawRes
    private final int b;

    public c(String str, @RawRes int i) {
        super(str);
        this.b = i;
    }

    @Override // org.acra.security.BaseKeyStoreFactory
    public InputStream getInputStream(@NonNull Context context) {
        return context.getResources().openRawResource(this.b);
    }
}

package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes23.dex */
public class NoKeyStoreFactory implements KeyStoreFactory {
    @Override // org.acra.security.KeyStoreFactory
    @Nullable
    public KeyStore create(@NonNull Context context) {
        return null;
    }
}

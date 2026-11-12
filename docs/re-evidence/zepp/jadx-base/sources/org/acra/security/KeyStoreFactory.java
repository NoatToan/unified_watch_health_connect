package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes23.dex */
public interface KeyStoreFactory {
    @Nullable
    KeyStore create(@NonNull Context context);
}

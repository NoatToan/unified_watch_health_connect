package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class a extends AppGlideModule {
    @NonNull
    public abstract Set<Class<?>> a();

    @Nullable
    public RequestManagerRetriever.RequestManagerFactory b() {
        return null;
    }
}

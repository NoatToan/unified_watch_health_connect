package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.imageload.GlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedAppGlideModuleImpl extends a {
    private final GlideModule a = new GlideModule();

    public GeneratedAppGlideModuleImpl() {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.xiaomi.hm.health.imageload.GlideModule");
        }
    }

    @Override // com.bumptech.glide.a
    @NonNull
    public Set<Class<?>> a() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.module.AppGlideModule, com.bumptech.glide.module.a
    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        this.a.applyOptions(context, glideBuilder);
    }

    @Override // com.bumptech.glide.a
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b b() {
        return new b();
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean isManifestParsingEnabled() {
        return this.a.isManifestParsingEnabled();
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.b
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        this.a.registerComponents(context, glide, registry);
    }
}

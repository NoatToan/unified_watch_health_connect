package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataBackendRegistry_Factory implements Factory<e> {
    private final Provider<Context> a;
    private final Provider<d> b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<d> provider2) {
        this.a = provider;
        this.b = provider2;
    }

    public static MetadataBackendRegistry_Factory create(Provider<Context> provider, Provider<d> provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static e newInstance(Context context, Object obj) {
        return new e(context, (d) obj);
    }

    @Override // javax.inject.Provider
    public e get() {
        return newInstance(this.a.get(), this.b.get());
    }
}

package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f53648b;

    public /* synthetic */ c(ComponentRegistrar componentRegistrar, int i14) {
        this.f53647a = i14;
        this.f53648b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f53647a) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(this.f53648b);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f53648b);
        }
    }
}

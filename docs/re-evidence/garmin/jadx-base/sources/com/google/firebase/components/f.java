package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Deferred.DeferredHandler, ComponentRegistrarProcessor {
    public static /* synthetic */ void a(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        OptionalProvider.lambda$static$0(provider);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}

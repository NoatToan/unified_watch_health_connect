package com.facebook.appevents.codeless.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
final /* synthetic */ class a extends MutablePropertyReference0Impl {
    public a(UnityReflection unityReflection) {
        super(unityReflection, UnityReflection.class, "unityPlayer", "getUnityPlayer()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
    @Nullable
    public Object get() {
        return UnityReflection.unityPlayer;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
    public void set(@Nullable Object obj) {
        UnityReflection.unityPlayer = (Class) obj;
    }
}

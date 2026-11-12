package com.google.firebase.components;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new f();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}

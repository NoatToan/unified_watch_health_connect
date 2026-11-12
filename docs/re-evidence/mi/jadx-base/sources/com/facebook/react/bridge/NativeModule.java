package com.facebook.react.bridge;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public interface NativeModule {

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}

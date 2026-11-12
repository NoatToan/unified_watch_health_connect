package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class CxxModuleWrapperBase implements NativeModule {

    @v07
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mHybridData.a();
    }

    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.a();
            this.mHybridData = hybridData;
        }
    }
}

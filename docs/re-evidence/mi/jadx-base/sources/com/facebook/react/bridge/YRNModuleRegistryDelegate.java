package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class YRNModuleRegistryDelegate {
    public static Collection<ModuleHolder> getCxxModules(NativeModuleRegistry nativeModuleRegistry) {
        return nativeModuleRegistry == null ? new ArrayList() : nativeModuleRegistry.getCxxModules();
    }

    public static Collection<JavaModuleWrapper> getJavaModules(NativeModuleRegistry nativeModuleRegistry, JSInstance jSInstance) {
        return nativeModuleRegistry == null ? new ArrayList() : nativeModuleRegistry.getJavaModules(jSInstance);
    }

    public static void notifyJSInstanceDestroy(NativeModuleRegistry nativeModuleRegistry) {
        if (nativeModuleRegistry != null) {
            nativeModuleRegistry.notifyJSInstanceDestroy();
        }
    }

    public static void notifyJSInstanceInitialized(NativeModuleRegistry nativeModuleRegistry) {
        if (nativeModuleRegistry != null) {
            nativeModuleRegistry.notifyJSInstanceInitialized();
        }
    }

    public static void registerModules(NativeModuleRegistry nativeModuleRegistry, NativeModuleRegistry nativeModuleRegistry2) {
        if (nativeModuleRegistry != null) {
            nativeModuleRegistry.registerModules(nativeModuleRegistry2);
        }
    }
}

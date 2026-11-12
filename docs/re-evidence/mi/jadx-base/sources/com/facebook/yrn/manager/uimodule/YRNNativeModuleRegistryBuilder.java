package com.facebook.yrn.manager.uimodule;

import com.facebook.react.a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.Systrace;
import defpackage.cej;
import defpackage.dej;
import defpackage.edj;
import defpackage.f4q;
import defpackage.oee;
import defpackage.xhg;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class YRNNativeModuleRegistryBuilder extends xhg {
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;
    private final a mReactInstanceManager;

    public YRNNativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, a aVar) {
        super(reactApplicationContext, aVar);
        this.mModules = new HashMap();
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactInstanceManager = aVar;
    }

    private YRNUIManagerModule createUIManagerModule(a aVar, ReactApplicationContext reactApplicationContext) {
        if (aVar == null || reactApplicationContext == null) {
            return null;
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        Systrace.c(0L, "createYRNUIManagerModule");
        YRNViewTagMappingManager yRNViewTagMappingManager = new YRNViewTagMappingManager();
        try {
            return new YRNUIManagerModule(yRNViewTagMappingManager, new YRNEventDispatcher(yRNViewTagMappingManager, reactApplicationContext), reactApplicationContext, aVar.G(reactApplicationContext), -1);
        } finally {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private void replaceUIManagerModule(Map<String, ModuleHolder> map) {
        YRNUIManagerModule yRNUIManagerModuleCreateUIManagerModule = createUIManagerModule(this.mReactInstanceManager, this.mReactApplicationContext);
        if (yRNUIManagerModuleCreateUIManagerModule != null) {
            map.put(UIManagerModule.NAME, new ModuleHolder(yRNUIManagerModuleCreateUIManagerModule));
        }
    }

    @Override // defpackage.xhg
    public NativeModuleRegistry build() {
        replaceUIManagerModule(this.mModules);
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules);
    }

    @Override // defpackage.xhg
    public void processPackage(cej cejVar) {
        Iterable<ModuleHolder> iterableA = cejVar instanceof oee ? ((oee) cejVar).a(this.mReactApplicationContext) : cejVar instanceof f4q ? ((f4q) cejVar).getNativeModuleIterator(this.mReactApplicationContext) : dej.a(cejVar, this.mReactApplicationContext, this.mReactInstanceManager);
        for (ModuleHolder moduleHolder : iterableA) {
            String name = moduleHolder.getName();
            if (this.mModules.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.mModules.get(name);
                if (!moduleHolder.getCanOverrideExistingModule()) {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true");
                }
                this.mModules.remove(moduleHolder2);
            }
            if (!edj.f16533b || !moduleHolder.isTurboModule()) {
                this.mModules.put(name, moduleHolder);
            }
        }
    }
}

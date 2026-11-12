package defpackage;

import com.facebook.react.a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class xhg {
    private final Map<String, ModuleHolder> mModules = new HashMap();
    private final ReactApplicationContext mReactApplicationContext;
    private final a mReactInstanceManager;

    public xhg(ReactApplicationContext reactApplicationContext, a aVar) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactInstanceManager = aVar;
    }

    public NativeModuleRegistry build() {
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules);
    }

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

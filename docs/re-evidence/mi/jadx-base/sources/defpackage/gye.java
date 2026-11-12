package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewManager;
import com.miot.rn.plugin.viewmanager.StringPickerManager;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTBluetoothModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTDeviceModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTHostModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPackageModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTPersistModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTRoomManageModuleCore;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTServiceModuleCore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class gye implements cej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MIOTPackageModuleCore f19463b;
    public MIOTDeviceModuleCore c;
    public MIOTPersistModuleCore d;
    public MIOTHostModuleCore e;
    public MIOTServiceModuleCore f;
    public final long[] g = {0};

    public gye(boolean z) {
        this.f19462a = z;
        b();
    }

    public ReadableMap a(x8j x8jVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        MIOTPackageModuleCore mIOTPackageModuleCore = this.f19463b;
        if (mIOTPackageModuleCore != null) {
            writableMapCreateMap.putMap("package", Arguments.makeNativeMap(mIOTPackageModuleCore.getConstantsFromInputRNRuntime(x8jVar)));
            writableMapCreateMap.putMap("device", Arguments.makeNativeMap(this.c.doGetConstants(x8jVar.getDeviceStat())));
            writableMapCreateMap.putMap("file", Arguments.makeNativeMap(this.d.getConstants()));
            writableMapCreateMap.putMap(b.E, Arguments.makeNativeMap(this.e.getConstants()));
            writableMapCreateMap.putMap("service", Arguments.makeNativeMap(this.f.getConstants()));
        }
        return writableMapCreateMap;
    }

    public void b() {
        this.g[0] = System.currentTimeMillis();
    }

    public void c(boolean z) {
        this.f19462a = z;
    }

    @Override // defpackage.cej
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        this.f19463b = new MIOTPackageModuleCore(reactApplicationContext);
        this.c = new MIOTDeviceModuleCore(reactApplicationContext);
        this.e = new MIOTHostModuleCore(reactApplicationContext);
        arrayList.add(this.f19463b);
        arrayList.add(this.c);
        arrayList.add(new MIOTBluetoothModuleCore(reactApplicationContext));
        MIOTServiceModuleCore mIOTServiceModuleCore = new MIOTServiceModuleCore(reactApplicationContext);
        this.f = mIOTServiceModuleCore;
        arrayList.add(mIOTServiceModuleCore);
        arrayList.add(this.e);
        MIOTPersistModuleCore mIOTPersistModuleCore = new MIOTPersistModuleCore(reactApplicationContext);
        this.d = mIOTPersistModuleCore;
        arrayList.add(mIOTPersistModuleCore);
        arrayList.add(new MIOTRoomManageModuleCore(reactApplicationContext));
        return arrayList;
    }

    @Override // defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StringPickerManager());
        return arrayList;
    }
}

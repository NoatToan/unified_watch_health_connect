package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c;
import com.facebook.systrace.Systrace;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class rl4 extends f4q implements eej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.facebook.react.a f32658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv5 f32659b;
    public final boolean c;
    public final int d;

    public class a implements odj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f32660a;

        public a(Map map) {
            this.f32660a = map;
        }

        @Override // defpackage.odj
        public Map<String, ReactModuleInfo> a() {
            return this.f32660a;
        }
    }

    public class b implements UIManagerModule.f {
        public b() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.f
        public List<String> a() {
            return rl4.this.f32658a.H();
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.f
        public ViewManager b(String str) {
            return rl4.this.f32658a.y(str);
        }
    }

    public rl4(com.facebook.react.a aVar, fv5 fv5Var, c cVar, boolean z, int i) {
        this.f32658a = aVar;
        this.f32659b = fv5Var;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.eej
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // defpackage.eej
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    public final UIManagerModule d(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        Systrace.c(0L, "createUIManagerModule");
        try {
            return this.c ? new UIManagerModule(reactApplicationContext, new b(), this.d) : new UIManagerModule(reactApplicationContext, this.f32658a.G(reactApplicationContext), this.d);
        } finally {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // defpackage.f4q
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "Timing":
                return new Timing(reactApplicationContext, this.f32658a.D());
            case "DevSettings":
                return new DevSettingsModule(this.f32658a.D());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f32659b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f32658a.D());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return d(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // defpackage.f4q
    public odj getReactModuleInfoProvider() {
        try {
            return (odj) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, Timing.class, UIManagerModule.class};
            HashMap map = new HashMap();
            for (int i = 0; i < 9; i++) {
                Class cls = clsArr[i];
                ndj ndjVar = (ndj) cls.getAnnotation(ndj.class);
                map.put(ndjVar.name(), new ReactModuleInfo(ndjVar.name(), cls.getName(), ndjVar.canOverrideExistingModule(), ndjVar.needsEagerInit(), ndjVar.hasConstants(), ndjVar.isCxxModule(), false));
            }
            return new a(map);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        }
    }
}

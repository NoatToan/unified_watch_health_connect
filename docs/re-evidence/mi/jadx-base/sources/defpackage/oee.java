package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oee implements cej {

    public class a implements odj {
        @Override // defpackage.odj
        public Map<String, ReactModuleInfo> a() {
            return Collections.emptyMap();
        }
    }

    public class b implements Iterable<ModuleHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f29068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f29069b;

        public class a implements Iterator<ModuleHolder> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29070a = 0;

            public a() {
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ModuleHolder next() {
                List list = b.this.f29068a;
                int i = this.f29070a;
                this.f29070a = i + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) b.this.f29069b.get(name);
                if (reactModuleInfo != null) {
                    return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                }
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                try {
                    return new ModuleHolder(moduleSpec.getProvider().get());
                } finally {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29070a < b.this.f29068a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        public b(List list, Map map) {
            this.f29068a = list;
            this.f29069b = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new a();
        }
    }

    public static odj d(oee oeeVar) {
        try {
            try {
                return (odj) Class.forName(oeeVar.getClass().getCanonicalName() + "$$ReactModuleInfoProvider").newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + oeeVar.getClass(), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + oeeVar.getClass(), e2);
            }
        } catch (ClassNotFoundException unused) {
            return new a();
        }
    }

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new b(b(reactApplicationContext), c().a());
    }

    public abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public abstract odj c();

    @Override // defpackage.cej
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b(reactApplicationContext)) {
            pyo.a(0L, "createNativeModule").b(RnReportConst.ApiReport.PARAM_MODULE, moduleSpec.getType()).c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                pyo.b(0L).c();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                pyo.b(0L).c();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> listE = e(reactApplicationContext);
        if (listE == null || listE.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    public List<ModuleSpec> e(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}

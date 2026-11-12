package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f4q implements cej {

    public class a implements Iterable<ModuleHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f17399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f17400b;

        /* JADX INFO: renamed from: f4q$a$a, reason: collision with other inner class name */
        public class C0932a implements Iterator<ModuleHolder> {
            public C0932a() {
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ModuleHolder next() {
                Map.Entry entry = (Map.Entry) a.this.f17399a.next();
                String str = (String) entry.getKey();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                a aVar = a.this;
                return new ModuleHolder(reactModuleInfo, f4q.this.new b(str, aVar.f17400b));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return a.this.f17399a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        public a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f17399a = it;
            this.f17400b = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0932a();
        }
    }

    public class b implements Provider<NativeModule> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReactApplicationContext f17403b;

        public b(String str, ReactApplicationContext reactApplicationContext) {
            this.f17402a = str;
            this.f17403b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return f4q.this.getModule(this.f17402a, this.f17403b);
        }
    }

    @Override // defpackage.cej
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    @Override // defpackage.cej
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) it.next().getProvider().get());
        }
        return arrayList;
    }

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        return new a(getReactModuleInfoProvider().a().entrySet().iterator(), reactApplicationContext);
    }

    public abstract odj getReactModuleInfoProvider();

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}

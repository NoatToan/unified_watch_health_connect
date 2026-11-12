package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dej {

    public class a implements Iterable<ModuleHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f15447a;

        /* JADX INFO: renamed from: dej$a$a, reason: collision with other inner class name */
        public class C0912a implements Iterator<ModuleHolder> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f15448a = 0;

            public C0912a() {
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ModuleHolder next() {
                List list = a.this.f15447a;
                int i = this.f15448a;
                this.f15448a = i + 1;
                return new ModuleHolder((NativeModule) list.get(i));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15448a < a.this.f15447a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        public a(List list) {
            this.f15447a = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0912a();
        }
    }

    public static Iterable<ModuleHolder> a(cej cejVar, ReactApplicationContext reactApplicationContext, com.facebook.react.a aVar) {
        cm8.b("ReactNative", cejVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(cejVar instanceof ldj ? ((ldj) cejVar).a(reactApplicationContext, aVar) : cejVar.createNativeModules(reactApplicationContext));
    }
}

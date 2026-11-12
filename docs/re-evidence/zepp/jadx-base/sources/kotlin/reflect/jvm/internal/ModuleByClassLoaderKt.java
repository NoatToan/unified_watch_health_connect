package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0000\"(\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getOrCreateModule", "", "clearModuleByClassLoaderCache", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/b;", "Ljava/lang/ref/WeakReference;", "a", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {1, 5, 1})
public final class ModuleByClassLoaderKt {
    private static final ConcurrentMap<b, WeakReference<RuntimeModuleData>> a = new ConcurrentHashMap();

    public static final void clearModuleByClassLoaderCache() {
        a.clear();
    }

    @NotNull
    public static final RuntimeModuleData getOrCreateModule(@NotNull Class<?> cls) {
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        b bVar = new b(safeClassLoader);
        ConcurrentMap<b, WeakReference<RuntimeModuleData>> concurrentMap = a;
        WeakReference<RuntimeModuleData> weakReference = concurrentMap.get(bVar);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(bVar, weakReference);
        }
        RuntimeModuleData runtimeModuleDataCreate = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            try {
                ConcurrentMap<b, WeakReference<RuntimeModuleData>> concurrentMap2 = a;
                WeakReference<RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(bVar, new WeakReference<>(runtimeModuleDataCreate));
                if (weakReferencePutIfAbsent == null) {
                    bVar.a(null);
                    return runtimeModuleDataCreate;
                }
                RuntimeModuleData runtimeModuleData2 = weakReferencePutIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    bVar.a(null);
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(bVar, weakReferencePutIfAbsent);
            } catch (Throwable th) {
                bVar.a(null);
                throw th;
            }
        }
    }
}

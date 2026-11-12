package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.eventbus.ElementTypesAreNonnullByDefault;
import com.google.common.eventbus.Subscribe;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class aoe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aoi f622c;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<aoh>> d = Maps.d();
    private static final LoadingCache<Class<?>, ImmutableList<Method>> e = CacheBuilder.a().t().b(new CacheLoader<Class<?>, ImmutableList<Method>>() { // from class: aoe.4
        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableList<Method> load(Class<?> cls) throws Exception {
            return aoe.d(cls);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> f621a = CacheBuilder.a().t().b(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() { // from class: aoe.3
        @Override // com.google.common.cache.CacheLoader
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ImmutableSet<Class<?>> load(Class<?> cls) {
            return ImmutableSet.copyOf((Collection) TypeToken.of((Class) cls).getTypes().a());
        }
    });

    aoe(aoi aoiVar) {
        this.f622c = (aoi) Preconditions.checkNotNull(aoiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<Method> d(Class<?> cls) {
        Set setA = TypeToken.of((Class) cls).getTypes().a();
        HashMap mapA = Maps.a();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), apu.a(parameterTypes[0]).getSimpleName());
                    c cVar = new c(method);
                    if (!mapA.containsKey(cVar)) {
                        mapA.put(cVar, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(mapA.values());
    }

    static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f623b;
        private final List<Class<?>> e;

        c(Method method) {
            this.f623b = method.getName();
            this.e = Arrays.asList(method.getParameterTypes());
        }

        public int hashCode() {
            return Objects.hashCode(this.f623b, this.e);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f623b.equals(cVar.f623b) && this.e.equals(cVar.e);
        }
    }
}

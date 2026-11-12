package jb2;

import java.util.HashMap;
import java.util.Map;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    private final Map<Class<?>, ib2.a<?>> instanceFactoryMap = new HashMap();
    private final Map<Class<?>, ib2.a<?>> singletonFactoryMap = new HashMap();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jb2.a$a, reason: collision with other inner class name */
    public class C1879a<T> implements ib2.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f98115a;

        public C1879a(a aVar, Class cls) {
            this.f98115a = cls;
        }

        @Override // ib2.a
        public final T b() {
            Class cls = this.f98115a;
            try {
                return (T) cls.newInstance();
            } catch (Exception e4) {
                q2.v("Fail to new instance of type: ".concat(cls.getName()), e4);
                return null;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements ib2.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f98116a;

        public b(a aVar, Object obj) {
            this.f98116a = obj;
        }

        @Override // ib2.a
        public final T b() {
            return (T) this.f98116a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements ib2.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f98117a;

        public c(a aVar, Object obj) {
            this.f98117a = obj;
        }

        @Override // ib2.a
        public final T b() {
            return (T) this.f98117a;
        }
    }

    public <T> void bindInstance(Class<T> cls, Class<? extends T> cls2) {
        this.instanceFactoryMap.put(cls, new C1879a(this, cls2));
    }

    public <T> void bindSingleton(Class<T> cls, T t7) {
        this.singletonFactoryMap.put(cls, new c(this, t7));
    }

    public abstract void configure();

    public Map<Class<?>, ib2.a<?>> getInstanceFactoryMap() {
        return this.instanceFactoryMap;
    }

    public Map<Class<?>, ib2.a<?>> getSingletonFactoryMap() {
        return this.singletonFactoryMap;
    }

    public <T> void bindInstance(Class<T> cls, T t7) {
        this.instanceFactoryMap.put(cls, new b(this, t7));
    }

    public <T> void bindSingleton(Class<T> cls, ib2.a<T> aVar) {
        this.singletonFactoryMap.put(cls, aVar);
    }
}

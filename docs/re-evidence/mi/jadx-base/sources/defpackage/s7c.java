package defpackage;

import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.io.Closeable;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class s7c implements ViewModelProvider.Factory {
    public static final CreationExtras.a<Function1<Object, dvq>> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f33370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.Factory f33371b;
    public final ViewModelProvider.Factory c;

    public class a implements CreationExtras.a<Function1<Object, dvq>> {
    }

    public class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fvq f33372a;

        public b(fvq fvqVar) {
            this.f33372a = fvqVar;
        }

        public final <T extends dvq> T a(evq evqVar, Class<T> cls, CreationExtras creationExtras) {
            Provider<dvq> provider = ((c) hc8.a(evqVar, c.class)).a().get(cls);
            Function1 function1 = (Function1) creationExtras.get(s7c.d);
            Object obj = ((c) hc8.a(evqVar, c.class)).b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (provider != null) {
                    return (T) provider.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (provider != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 != null) {
                return (T) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends dvq> T create(Class<T> cls, CreationExtras creationExtras) {
            final dtk dtkVar = new dtk();
            T t = (T) a(this.f33372a.a(SavedStateHandleSupport.createSavedStateHandle(creationExtras)).b(dtkVar).build(), cls, creationExtras);
            t.addCloseable(new Closeable() { // from class: t7c
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    dtkVar.a();
                }
            });
            return t;
        }
    }

    public interface c {
        Map<Class<?>, Provider<dvq>> a();

        Map<Class<?>, Object> b();
    }

    public s7c(Map<Class<?>, Boolean> map, ViewModelProvider.Factory factory, fvq fvqVar) {
        this.f33370a = map;
        this.f33371b = factory;
        this.c = new b(fvqVar);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends dvq> T create(Class<T> cls, CreationExtras creationExtras) {
        return this.f33370a.containsKey(cls) ? (T) this.c.create(cls, creationExtras) : (T) this.f33371b.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends dvq> T create(Class<T> cls) {
        if (this.f33370a.containsKey(cls)) {
            return (T) this.c.create(cls);
        }
        return (T) this.f33371b.create(cls);
    }
}

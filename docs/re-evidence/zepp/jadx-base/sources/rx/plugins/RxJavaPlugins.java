package rx.plugins;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public class RxJavaPlugins {
    private static final RxJavaPlugins f = new RxJavaPlugins();
    public static final RxJavaErrorHandler g = new a();
    private final AtomicReference<RxJavaErrorHandler> a = new AtomicReference<>();
    private final AtomicReference<RxJavaObservableExecutionHook> b = new AtomicReference<>();
    private final AtomicReference<RxJavaSingleExecutionHook> c = new AtomicReference<>();
    private final AtomicReference<RxJavaCompletableExecutionHook> d = new AtomicReference<>();
    private final AtomicReference<RxJavaSchedulersHook> e = new AtomicReference<>();

    public static class a extends RxJavaErrorHandler {
    }

    public class b extends RxJavaCompletableExecutionHook {
        public b() {
        }
    }

    public static Object a(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            for (Map.Entry entry : properties2.entrySet()) {
                String string = entry.getKey().toString();
                if (string.startsWith("rxjava.plugin.") && string.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + string.substring(0, string.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e4);
        }
    }

    @Deprecated
    public static RxJavaPlugins getInstance() {
        return f;
    }

    public RxJavaCompletableExecutionHook getCompletableExecutionHook() {
        if (this.d.get() == null) {
            Object objA = a(RxJavaCompletableExecutionHook.class, System.getProperties());
            if (objA == null) {
                this.d.compareAndSet(null, new b());
            } else {
                this.d.compareAndSet(null, (RxJavaCompletableExecutionHook) objA);
            }
        }
        return this.d.get();
    }

    public RxJavaErrorHandler getErrorHandler() {
        if (this.a.get() == null) {
            Object objA = a(RxJavaErrorHandler.class, System.getProperties());
            if (objA == null) {
                this.a.compareAndSet(null, g);
            } else {
                this.a.compareAndSet(null, (RxJavaErrorHandler) objA);
            }
        }
        return this.a.get();
    }

    public RxJavaObservableExecutionHook getObservableExecutionHook() {
        if (this.b.get() == null) {
            Object objA = a(RxJavaObservableExecutionHook.class, System.getProperties());
            if (objA == null) {
                this.b.compareAndSet(null, rx.plugins.a.a());
            } else {
                this.b.compareAndSet(null, (RxJavaObservableExecutionHook) objA);
            }
        }
        return this.b.get();
    }

    public RxJavaSchedulersHook getSchedulersHook() {
        if (this.e.get() == null) {
            Object objA = a(RxJavaSchedulersHook.class, System.getProperties());
            if (objA == null) {
                this.e.compareAndSet(null, RxJavaSchedulersHook.getDefaultInstance());
            } else {
                this.e.compareAndSet(null, (RxJavaSchedulersHook) objA);
            }
        }
        return this.e.get();
    }

    public RxJavaSingleExecutionHook getSingleExecutionHook() {
        if (this.c.get() == null) {
            Object objA = a(RxJavaSingleExecutionHook.class, System.getProperties());
            if (objA == null) {
                this.c.compareAndSet(null, rx.plugins.b.a());
            } else {
                this.c.compareAndSet(null, (RxJavaSingleExecutionHook) objA);
            }
        }
        return this.c.get();
    }

    public void registerCompletableExecutionHook(RxJavaCompletableExecutionHook rxJavaCompletableExecutionHook) {
        if (this.d.compareAndSet(null, rxJavaCompletableExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.c.get());
    }

    public void registerErrorHandler(RxJavaErrorHandler rxJavaErrorHandler) {
        if (this.a.compareAndSet(null, rxJavaErrorHandler)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.a.get());
    }

    public void registerObservableExecutionHook(RxJavaObservableExecutionHook rxJavaObservableExecutionHook) {
        if (this.b.compareAndSet(null, rxJavaObservableExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.b.get());
    }

    public void registerSchedulersHook(RxJavaSchedulersHook rxJavaSchedulersHook) {
        if (this.e.compareAndSet(null, rxJavaSchedulersHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.e.get());
    }

    public void registerSingleExecutionHook(RxJavaSingleExecutionHook rxJavaSingleExecutionHook) {
        if (this.c.compareAndSet(null, rxJavaSingleExecutionHook)) {
            return;
        }
        throw new IllegalStateException("Another strategy was already registered: " + this.c.get());
    }

    public void reset() {
        RxJavaPlugins rxJavaPlugins = f;
        rxJavaPlugins.a.set(null);
        rxJavaPlugins.b.set(null);
        rxJavaPlugins.c.set(null);
        rxJavaPlugins.d.set(null);
        rxJavaPlugins.e.set(null);
    }
}

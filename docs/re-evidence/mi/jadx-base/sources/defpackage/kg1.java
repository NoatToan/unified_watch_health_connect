package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 {
    public static volatile kg1 d;
    public static final Object e = new Object();
    public final Context c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<? extends iad<?>>> f23813b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f23812a = new HashMap();

    public kg1(Context context) {
        this.c = context.getApplicationContext();
    }

    public static kg1 e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new kg1(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void a() {
        try {
            try {
                akp.c("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                akp.f();
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } catch (Throwable th) {
            akp.f();
            throw th;
        }
    }

    public void b(Bundle bundle) {
        String string = this.c.getString(p0j.f29873a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (iad.class.isAssignableFrom(cls)) {
                            this.f23813b.add((Class<? extends iad<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends iad<?>>> it = this.f23813b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public <T> T c(Class<? extends iad<?>> cls) {
        T t;
        synchronized (e) {
            try {
                t = (T) this.f23812a.get(cls);
                if (t == null) {
                    t = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final <T> T d(Class<? extends iad<?>> cls, Set<Class<?>> set) {
        T t;
        if (akp.h()) {
            try {
                akp.c(cls.getSimpleName());
            } catch (Throwable th) {
                akp.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f23812a.containsKey(cls)) {
            t = (T) this.f23812a.get(cls);
        } else {
            set.add(cls);
            try {
                iad<?> iadVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends iad<?>>> listDependencies = iadVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends iad<?>> cls2 : listDependencies) {
                        if (!this.f23812a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t = (T) iadVarNewInstance.create(this.c);
                set.remove(cls);
                this.f23812a.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        akp.f();
        return t;
    }

    public <T> T f(Class<? extends iad<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends iad<?>> cls) {
        return this.f23813b.contains(cls);
    }
}

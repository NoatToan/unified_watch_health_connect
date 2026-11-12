package zd;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f203972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f203973e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f203976c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f203975b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f203974a = new HashMap();

    public a(Context context) {
        this.f203976c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f203972d == null) {
            synchronized (f203973e) {
                try {
                    if (f203972d == null) {
                        f203972d = new a(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f203972d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f203976c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f203975b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new StartupException(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f203974a;
        if (ce.a.b()) {
            try {
                Trace.beginSection(ce.a.d(cls.getSimpleName()));
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f203976c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th4) {
                throw new StartupException(th4);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    public final <T> T d(Class<? extends b<T>> cls) {
        T t7;
        synchronized (f203973e) {
            try {
                t7 = (T) this.f203974a.get(cls);
                if (t7 == null) {
                    t7 = (T) b(cls, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t7;
    }
}

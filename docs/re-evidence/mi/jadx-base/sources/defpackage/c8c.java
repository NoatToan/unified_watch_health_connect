package defpackage;

import io.sentry.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c8c {

    @NotNull
    public static final Map<String, Class<?>> g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f5045a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<dm1> f5046b = new ArrayList();

    @Nullable
    public dm1 c = null;

    @Nullable
    public dm1 d = null;

    @Nullable
    public dm1 e = null;

    @Nullable
    public l f = null;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public void a(@Nullable dm1 dm1Var) {
        if (dm1Var != null) {
            this.f5046b.add(dm1Var);
        }
    }

    public void b(@Nullable List<dm1> list) {
        if (list != null) {
            this.f5046b.addAll(list);
        }
    }

    @ApiStatus.Internal
    public synchronized void c() {
        try {
            Iterator<Map.Entry<String, Object>> it = this.f5045a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public synchronized Object d(@NotNull String str) {
        return this.f5045a.get(str);
    }

    @Nullable
    public synchronized <T> T e(@NotNull String str, @NotNull Class<T> cls) {
        T t = (T) this.f5045a.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        if (k(t, cls)) {
            return t;
        }
        return null;
    }

    @NotNull
    public List<dm1> f() {
        return new ArrayList(this.f5046b);
    }

    @Nullable
    public l g() {
        return this.f;
    }

    @Nullable
    public dm1 h() {
        return this.c;
    }

    @Nullable
    public dm1 i() {
        return this.e;
    }

    @Nullable
    public dm1 j() {
        return this.d;
    }

    public final boolean k(@Nullable Object obj, @NotNull Class<?> cls) {
        Class<?> cls2 = g.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public synchronized void l(@NotNull String str, @Nullable Object obj) {
        this.f5045a.put(str, obj);
    }

    public void m(@Nullable l lVar) {
        this.f = lVar;
    }

    public void n(@Nullable dm1 dm1Var) {
        this.c = dm1Var;
    }

    public void o(@Nullable dm1 dm1Var) {
        this.e = dm1Var;
    }

    public void p(@Nullable dm1 dm1Var) {
        this.d = dm1Var;
    }
}

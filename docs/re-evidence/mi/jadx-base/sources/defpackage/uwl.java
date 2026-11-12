package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class uwl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<t4q, eud<Object>> f36228a = new HashMap<>(64);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<bgj> f36229b = new AtomicReference<>();

    public final synchronized bgj a() {
        bgj bgjVarB;
        bgjVarB = this.f36229b.get();
        if (bgjVarB == null) {
            bgjVarB = bgj.b(this.f36228a);
            this.f36229b.set(bgjVarB);
        }
        return bgjVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(JavaType javaType, eud<Object> eudVar, wwl wwlVar) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f36228a.put(new t4q(javaType, false), eudVar) == null) {
                    this.f36229b.set(null);
                }
                if (eudVar instanceof dqk) {
                    ((dqk) eudVar).resolve(wwlVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Class<?> cls, JavaType javaType, eud<Object> eudVar, wwl wwlVar) throws JsonMappingException {
        synchronized (this) {
            try {
                eud<Object> eudVarPut = this.f36228a.put(new t4q(cls, false), eudVar);
                eud<Object> eudVarPut2 = this.f36228a.put(new t4q(javaType, false), eudVar);
                if (eudVarPut == null || eudVarPut2 == null) {
                    this.f36229b.set(null);
                }
                if (eudVar instanceof dqk) {
                    ((dqk) eudVar).resolve(wwlVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(JavaType javaType, eud<Object> eudVar) {
        synchronized (this) {
            try {
                if (this.f36228a.put(new t4q(javaType, true), eudVar) == null) {
                    this.f36229b.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(Class<?> cls, eud<Object> eudVar) {
        synchronized (this) {
            try {
                if (this.f36228a.put(new t4q(cls, true), eudVar) == null) {
                    this.f36229b.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void f() {
        this.f36228a.clear();
    }

    public bgj g() {
        bgj bgjVar = this.f36229b.get();
        return bgjVar != null ? bgjVar : a();
    }

    public synchronized int h() {
        return this.f36228a.size();
    }

    public eud<Object> i(JavaType javaType) {
        eud<Object> eudVar;
        synchronized (this) {
            eudVar = this.f36228a.get(new t4q(javaType, true));
        }
        return eudVar;
    }

    public eud<Object> j(Class<?> cls) {
        eud<Object> eudVar;
        synchronized (this) {
            eudVar = this.f36228a.get(new t4q(cls, true));
        }
        return eudVar;
    }

    public eud<Object> k(JavaType javaType) {
        eud<Object> eudVar;
        synchronized (this) {
            eudVar = this.f36228a.get(new t4q(javaType, false));
        }
        return eudVar;
    }

    public eud<Object> l(Class<?> cls) {
        eud<Object> eudVar;
        synchronized (this) {
            eudVar = this.f36228a.get(new t4q(cls, false));
        }
        return eudVar;
    }
}

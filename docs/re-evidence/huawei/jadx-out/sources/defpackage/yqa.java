package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class yqa<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<yqb> f53750c;

    private void c(Class<?> cls) throws yny {
        if (cls == null) {
            return;
        }
        c(cls.getSuperclass());
        for (Field field : cls.getDeclaredFields()) {
            yqb yqbVar = new yqb(this.f53749b, field);
            if (yqbVar.e()) {
                this.f53750c.add(yqbVar);
            }
        }
    }

    public yqa(Class<T> cls) throws yny {
        this(null, cls);
    }

    public yqa(String str, Class<?> cls) throws yny {
        String simpleName;
        this.f53750c = new ArrayList();
        if (str != null) {
            simpleName = str + "." + cls.getSimpleName();
        } else {
            simpleName = cls.getSimpleName();
        }
        this.f53749b = simpleName;
        c(cls);
    }

    public boolean c() {
        return this.f53750c.size() > 0;
    }

    public void d(T t) throws yny {
        if (t == null) {
            return;
        }
        for (yqb yqbVar : this.f53750c) {
            if (yqbVar.e()) {
                yqbVar.a(t);
            }
        }
    }
}

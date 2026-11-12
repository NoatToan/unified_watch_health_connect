package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class goo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, List<eoo>> f19191b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Class<?>> f19192a = new ConcurrentHashMap();

    public goo(List<Class<?>> list) {
        if (list != null) {
            for (Class<?> cls : list) {
                this.f19192a.put(cls, cls);
            }
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class th2<T> {
    public static ConcurrentHashMap<Class<?>, th2<?>> c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, r80> f34696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r80[] f34697b;

    public static void a(th2<?> th2Var, HashMap<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            r80 r80Var = th2Var.f34696a.get(entry.getValue());
            if (r80Var != null) {
                map2.put(entry.getValue(), r80Var);
            }
        }
        th2Var.f34696a.putAll(map2);
    }

    public static <P> th2<P> b(Class<P> cls, cl9 cl9Var) {
        String strConcat;
        Class<?> clsC;
        th2<P> th2Var = (th2) c.get(cls);
        if (th2Var != null) {
            return th2Var;
        }
        r80[] r80VarArrB = sb.b(cls, cl9Var);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            strConcat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            strConcat = name.concat("AccAccess");
        }
        b77 b77Var = new b77(cls.getClassLoader());
        try {
            clsC = b77Var.loadClass(strConcat);
        } catch (ClassNotFoundException unused) {
            clsC = null;
        }
        LinkedList<Class<?>> linkedListE = e(cls);
        if (clsC == null) {
            uh2 uh2Var = new uh2(cls, r80VarArrB, b77Var);
            Iterator<Class<?>> it = linkedListE.iterator();
            while (it.hasNext()) {
                uh2Var.b(vh2.f36891a.get(it.next()));
            }
            clsC = uh2Var.c();
        }
        try {
            th2<P> th2Var2 = (th2) clsC.newInstance();
            th2Var2.f(r80VarArrB);
            c.putIfAbsent(cls, th2Var2);
            Iterator<Class<?>> it2 = linkedListE.iterator();
            while (it2.hasNext()) {
                a(th2Var2, vh2.f36892b.get(it2.next()));
            }
            return th2Var2;
        } catch (Exception e) {
            throw new RuntimeException("Error constructing accessor class: " + strConcat, e);
        }
    }

    public static LinkedList<Class<?>> e(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }

    public abstract Object c(T t, int i);

    public r80[] d() {
        return this.f34697b;
    }

    public void f(r80[] r80VarArr) {
        this.f34697b = r80VarArr;
        this.f34696a = new HashMap<>();
        int length = r80VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            r80 r80Var = r80VarArr[i];
            r80Var.d = i2;
            this.f34696a.put(r80Var.b(), r80Var);
            i++;
            i2++;
        }
    }
}

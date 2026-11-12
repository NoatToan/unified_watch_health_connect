package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bgj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f4184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4185b;
    public final int c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eud<Object> f4186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f4187b;
        public final Class<?> c;
        public final JavaType d;
        public final boolean e;

        public a(a aVar, t4q t4qVar, eud<Object> eudVar) {
            this.f4187b = aVar;
            this.f4186a = eudVar;
            this.e = t4qVar.c();
            this.c = t4qVar.a();
            this.d = t4qVar.b();
        }

        public boolean a(JavaType javaType) {
            return this.e && javaType.equals(this.d);
        }

        public boolean b(Class<?> cls) {
            return this.c == cls && this.e;
        }

        public boolean c(JavaType javaType) {
            return !this.e && javaType.equals(this.d);
        }

        public boolean d(Class<?> cls) {
            return this.c == cls && !this.e;
        }
    }

    public bgj(Map<t4q, eud<Object>> map) {
        int iA = a(map.size());
        this.f4185b = iA;
        this.c = iA - 1;
        a[] aVarArr = new a[iA];
        for (Map.Entry<t4q, eud<Object>> entry : map.entrySet()) {
            t4q key = entry.getKey();
            int iHashCode = key.hashCode() & this.c;
            aVarArr[iHashCode] = new a(aVarArr[iHashCode], key, entry.getValue());
        }
        this.f4184a = aVarArr;
    }

    public static final int a(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public static bgj b(HashMap<t4q, eud<Object>> map) {
        return new bgj(map);
    }

    public eud<Object> c(JavaType javaType) {
        a aVar = this.f4184a[t4q.d(javaType) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(javaType)) {
            return aVar.f4186a;
        }
        do {
            aVar = aVar.f4187b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(javaType));
        return aVar.f4186a;
    }

    public eud<Object> d(Class<?> cls) {
        a aVar = this.f4184a[t4q.e(cls) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(cls)) {
            return aVar.f4186a;
        }
        do {
            aVar = aVar.f4187b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(cls));
        return aVar.f4186a;
    }

    public eud<Object> e(JavaType javaType) {
        a aVar = this.f4184a[t4q.f(javaType) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(javaType)) {
            return aVar.f4186a;
        }
        do {
            aVar = aVar.f4187b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(javaType));
        return aVar.f4186a;
    }

    public eud<Object> f(Class<?> cls) {
        a aVar = this.f4184a[t4q.g(cls) & this.c];
        if (aVar == null) {
            return null;
        }
        if (aVar.d(cls)) {
            return aVar.f4186a;
        }
        do {
            aVar = aVar.f4187b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.d(cls));
        return aVar.f4186a;
    }
}

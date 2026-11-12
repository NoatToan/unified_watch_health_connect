package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class afp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f365a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c[] f366c;
    private final int e;

    private static final int b(int i) {
        int i2 = 8;
        while (i2 < (i <= 64 ? i + i : i + (i >> 2))) {
            i2 += i2;
        }
        return i2;
    }

    public afp(Map<aig, JsonSerializer<Object>> map) {
        int iB = b(map.size());
        this.e = iB;
        this.f365a = iB - 1;
        c[] cVarArr = new c[iB];
        for (Map.Entry<aig, JsonSerializer<Object>> entry : map.entrySet()) {
            aig key = entry.getKey();
            int iHashCode = key.hashCode() & this.f365a;
            cVarArr[iHashCode] = new c(cVarArr[iHashCode], key, entry.getValue());
        }
        this.f366c = cVarArr;
    }

    public static afp c(HashMap<aig, JsonSerializer<Object>> map) {
        return new afp(map);
    }

    public JsonSerializer<Object> c(JavaType javaType) {
        c cVar = this.f366c[aig.c(javaType) & this.f365a];
        if (cVar == null) {
            return null;
        }
        if (cVar.d(javaType)) {
            return cVar.e;
        }
        do {
            cVar = cVar.f367a;
            if (cVar == null) {
                return null;
            }
        } while (!cVar.d(javaType));
        return cVar.e;
    }

    public JsonSerializer<Object> b(Class<?> cls) {
        c cVar = this.f366c[aig.a(cls) & this.f365a];
        if (cVar == null) {
            return null;
        }
        if (cVar.b(cls)) {
            return cVar.e;
        }
        do {
            cVar = cVar.f367a;
            if (cVar == null) {
                return null;
            }
        } while (!cVar.b(cls));
        return cVar.e;
    }

    public JsonSerializer<Object> b(JavaType javaType) {
        c cVar = this.f366c[aig.d(javaType) & this.f365a];
        if (cVar == null) {
            return null;
        }
        if (cVar.e(javaType)) {
            return cVar.e;
        }
        do {
            cVar = cVar.f367a;
            if (cVar == null) {
                return null;
            }
        } while (!cVar.e(javaType));
        return cVar.e;
    }

    public JsonSerializer<Object> e(Class<?> cls) {
        c cVar = this.f366c[aig.d(cls) & this.f365a];
        if (cVar == null) {
            return null;
        }
        if (cVar.d(cls)) {
            return cVar.e;
        }
        do {
            cVar = cVar.f367a;
            if (cVar == null) {
                return null;
            }
        } while (!cVar.d(cls));
        return cVar.e;
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Class<?> f368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final JavaType f369c;
        protected final boolean d;
        public final JsonSerializer<Object> e;

        public c(c cVar, aig aigVar, JsonSerializer<Object> jsonSerializer) {
            this.f367a = cVar;
            this.e = jsonSerializer;
            this.d = aigVar.e();
            this.f368b = aigVar.a();
            this.f369c = aigVar.d();
        }

        public boolean b(Class<?> cls) {
            return this.f368b == cls && this.d;
        }

        public boolean d(Class<?> cls) {
            return this.f368b == cls && !this.d;
        }

        public boolean d(JavaType javaType) {
            return this.d && javaType.equals(this.f369c);
        }

        public boolean e(JavaType javaType) {
            return !this.d && javaType.equals(this.f369c);
        }
    }
}

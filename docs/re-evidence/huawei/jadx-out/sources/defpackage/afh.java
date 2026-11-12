package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public final class afh {
    private final HashMap<aig, JsonSerializer<Object>> d = new HashMap<>(64);
    private final AtomicReference<afp> e = new AtomicReference<>();

    public afp a() {
        afp afpVar = this.e.get();
        return afpVar != null ? afpVar : d();
    }

    private final afp d() {
        afp afpVarC;
        synchronized (this) {
            afpVarC = this.e.get();
            if (afpVarC == null) {
                afpVarC = afp.c(this.d);
                this.e.set(afpVarC);
            }
        }
        return afpVarC;
    }

    public int b() {
        int size;
        synchronized (this) {
            size = this.d.size();
        }
        return size;
    }

    public JsonSerializer<Object> a(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.d.get(new aig(cls, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> b(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.d.get(new aig(javaType, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> c(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.d.get(new aig(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> e(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.d.get(new aig(cls, true));
        }
        return jsonSerializer;
    }

    public void c(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            if (this.d.put(new aig(javaType, true), jsonSerializer) == null) {
                this.e.set(null);
            }
        }
    }

    public void e(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            if (this.d.put(new aig(cls, true), jsonSerializer) == null) {
                this.e.set(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws ym {
        synchronized (this) {
            if (this.d.put(new aig(javaType, false), jsonSerializer) == null) {
                this.e.set(null);
            }
            if (jsonSerializer instanceof ResolvableSerializer) {
                ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Class<?> cls, JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws ym {
        synchronized (this) {
            JsonSerializer<Object> jsonSerializerPut = this.d.put(new aig(cls, false), jsonSerializer);
            JsonSerializer<Object> jsonSerializerPut2 = this.d.put(new aig(javaType, false), jsonSerializer);
            if (jsonSerializerPut == null || jsonSerializerPut2 == null) {
                this.e.set(null);
            }
            if (jsonSerializer instanceof ResolvableSerializer) {
                ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
            }
        }
    }

    public void c() {
        synchronized (this) {
            this.d.clear();
        }
    }
}

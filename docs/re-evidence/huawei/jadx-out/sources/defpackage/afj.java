package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;

/* JADX INFO: loaded from: classes21.dex */
public final class afj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObjectIdGenerator<?> f361c;
    public final JsonSerializer<Object> d;
    public final SerializableString e;

    protected afj(JavaType javaType, SerializableString serializableString, ObjectIdGenerator<?> objectIdGenerator, JsonSerializer<?> jsonSerializer, boolean z) {
        this.f359a = javaType;
        this.e = serializableString;
        this.f361c = objectIdGenerator;
        this.d = jsonSerializer;
        this.f360b = z;
    }

    public static afj b(JavaType javaType, ys ysVar, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String strB = ysVar == null ? null : ysVar.b();
        return new afj(javaType, strB != null ? new xb(strB) : null, objectIdGenerator, null, z);
    }

    public afj c(JsonSerializer<?> jsonSerializer) {
        return new afj(this.f359a, this.e, this.f361c, jsonSerializer, this.f360b);
    }

    public afj a(boolean z) {
        return z == this.f360b ? this : new afj(this.f359a, this.e, this.f361c, this.d, z);
    }
}

package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.u.i;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldDescriptor {
    private final String a;
    private final Map<Class<?>, Object> b;

    public static final class Builder {
        private final String a;
        private Map<Class<?>, Object> b = null;

        public Builder(String str) {
            this.a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            return new FieldDescriptor(this.a, this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    public static FieldDescriptor of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.a.equals(fieldDescriptor.a) && this.b.equals(fieldDescriptor.b);
    }

    @NonNull
    public String getName() {
        return this.a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + i.d;
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }
}

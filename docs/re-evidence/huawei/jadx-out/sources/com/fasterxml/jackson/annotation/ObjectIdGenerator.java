package com.fasterxml.jackson.annotation;

import com.huawei.hihealth.dictionary.model.HealthDataMergePolicy;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ObjectIdGenerator<T> implements Serializable {
    public abstract boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator);

    public abstract ObjectIdGenerator<T> forScope(Class<?> cls);

    public abstract T generateId(Object obj);

    public abstract Class<?> getScope();

    public boolean isValidReferencePropertyName(String str, Object obj) {
        return false;
    }

    public abstract c key(Object obj);

    public boolean maySerializeAsObject() {
        return false;
    }

    public abstract ObjectIdGenerator<T> newForSerialization(Object obj);

    public static final class c implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4068a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f4069c;
        public final Class<?> d;
        private final int e;

        public c(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.d = cls;
            this.f4069c = cls2;
            this.f4068a = obj;
            int iHashCode = obj.hashCode() + cls.getName().hashCode();
            this.e = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
        }

        public int hashCode() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f4068a.equals(this.f4068a) && cVar.d == this.d && cVar.f4069c == this.f4069c;
        }

        public String toString() {
            Object obj = this.f4068a;
            Class<?> cls = this.d;
            String name = HealthDataMergePolicy.NONE;
            String name2 = cls == null ? HealthDataMergePolicy.NONE : cls.getName();
            Class<?> cls2 = this.f4069c;
            if (cls2 != null) {
                name = cls2.getName();
            }
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", obj, name2, name);
        }
    }
}

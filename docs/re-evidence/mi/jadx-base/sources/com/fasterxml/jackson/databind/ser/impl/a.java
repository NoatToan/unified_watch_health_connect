package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.eud;
import defpackage.wwl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7696a;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.a$a, reason: collision with other inner class name */
    public static final class C0180a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f7697b;
        public final Class<?> c;
        public final eud<Object> d;
        public final eud<Object> e;

        public C0180a(a aVar, Class<?> cls, eud<Object> eudVar, Class<?> cls2, eud<Object> eudVar2) {
            super(aVar);
            this.f7697b = cls;
            this.d = eudVar;
            this.c = cls2;
            this.e = eudVar2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a h(Class<?> cls, eud<Object> eudVar) {
            return new c(this, new f[]{new f(this.f7697b, this.d), new f(this.c, this.e), new f(cls, eudVar)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public eud<Object> i(Class<?> cls) {
            if (cls == this.f7697b) {
                return this.d;
            }
            if (cls == this.c) {
                return this.e;
            }
            return null;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f7698b = new b(false);
        public static final b c = new b(true);

        public b(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a h(Class<?> cls, eud<Object> eudVar) {
            return new e(this, cls, eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public eud<Object> i(Class<?> cls) {
            return null;
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f[] f7699b;

        public c(a aVar, f[] fVarArr) {
            super(aVar);
            this.f7699b = fVarArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a h(Class<?> cls, eud<Object> eudVar) {
            f[] fVarArr = this.f7699b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.f7696a ? new e(this, cls, eudVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, eudVar);
            return new c(this, fVarArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public eud<Object> i(Class<?> cls) {
            int length = this.f7699b.length;
            for (int i = 0; i < length; i++) {
                f fVar = this.f7699b[i];
                if (fVar.f7703a == cls) {
                    return fVar.f7704b;
                }
            }
            return null;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eud<Object> f7700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f7701b;

        public d(eud<Object> eudVar, a aVar) {
            this.f7700a = eudVar;
            this.f7701b = aVar;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f7702b;
        public final eud<Object> c;

        public e(a aVar, Class<?> cls, eud<Object> eudVar) {
            super(aVar);
            this.f7702b = cls;
            this.c = eudVar;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public a h(Class<?> cls, eud<Object> eudVar) {
            return new C0180a(this, this.f7702b, this.c, cls, eudVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.a
        public eud<Object> i(Class<?> cls) {
            if (cls == this.f7702b) {
                return this.c;
            }
            return null;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f7703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final eud<Object> f7704b;

        public f(Class<?> cls, eud<Object> eudVar) {
            this.f7703a = cls;
            this.f7704b = eudVar;
        }
    }

    public a(boolean z) {
        this.f7696a = z;
    }

    public static a a() {
        return b.f7698b;
    }

    public static a b() {
        return b.c;
    }

    public final d c(Class<?> cls, wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarFindKeySerializer = wwlVar.findKeySerializer(cls, beanProperty);
        return new d(eudVarFindKeySerializer, h(cls, eudVarFindKeySerializer));
    }

    public final d d(JavaType javaType, wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarFindPrimaryPropertySerializer = wwlVar.findPrimaryPropertySerializer(javaType, beanProperty);
        return new d(eudVarFindPrimaryPropertySerializer, h(javaType.getRawClass(), eudVarFindPrimaryPropertySerializer));
    }

    public final d e(Class<?> cls, wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarFindPrimaryPropertySerializer = wwlVar.findPrimaryPropertySerializer(cls, beanProperty);
        return new d(eudVarFindPrimaryPropertySerializer, h(cls, eudVarFindPrimaryPropertySerializer));
    }

    public final d f(JavaType javaType, wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarFindValueSerializer = wwlVar.findValueSerializer(javaType, beanProperty);
        return new d(eudVarFindValueSerializer, h(javaType.getRawClass(), eudVarFindValueSerializer));
    }

    public final d g(Class<?> cls, wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        eud<Object> eudVarFindValueSerializer = wwlVar.findValueSerializer(cls, beanProperty);
        return new d(eudVarFindValueSerializer, h(cls, eudVarFindValueSerializer));
    }

    public abstract a h(Class<?> cls, eud<Object> eudVar);

    public abstract eud<Object> i(Class<?> cls);

    public a(a aVar) {
        this.f7696a = aVar.f7696a;
    }
}

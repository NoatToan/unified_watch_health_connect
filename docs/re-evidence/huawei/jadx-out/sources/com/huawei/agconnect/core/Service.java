package com.huawei.agconnect.core;

import com.huawei.agconnect.annotation.AutoCreated;
import com.huawei.agconnect.annotation.SharedInstance;
import com.huawei.agconnect.annotation.Singleton;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f4952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f4953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4954c;
    private boolean d;
    private boolean e;
    private boolean f;

    public boolean isSingleton() {
        return this.d;
    }

    public boolean isSharedInstance() {
        return this.e;
    }

    public boolean isAutoCreated() {
        return this.f;
    }

    public Class<?> getType() {
        return this.f4953b;
    }

    public Class<?> getInterface() {
        return this.f4952a;
    }

    public Object getInstance() {
        return this.f4954c;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Class<?> f4955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Class<?> f4956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f4957c;
        private boolean d;
        private boolean e;
        private boolean f;

        public Builder setObject(Object obj) {
            this.f4957c = obj;
            return this;
        }

        public Builder setInterface(Class<?> cls) {
            this.f4955a = cls;
            return this;
        }

        public Builder setClass(Class<?> cls) {
            this.f4956b = cls;
            return this;
        }

        public Builder isSingleton(boolean z) {
            this.d = z;
            return this;
        }

        public Builder isSharedInstance(boolean z) {
            this.e = z;
            return this;
        }

        public Builder isAutoCreated(boolean z) {
            this.f = z;
            return this;
        }

        public Service build() {
            Class<?> cls = this.f4955a;
            if (cls == null) {
                throw new IllegalArgumentException("the interface parameter cannot be NULL");
            }
            Class<?> cls2 = this.f4956b;
            if (cls2 == null) {
                Object obj = this.f4957c;
                if (obj == null) {
                    throw new IllegalArgumentException("the clazz or object parameter must set one");
                }
                Service service = new Service(cls, obj);
                service.d = this.d;
                return service;
            }
            if (cls2.isInterface() || !Modifier.isPublic(this.f4956b.getModifiers())) {
                throw new IllegalArgumentException("the clazz parameter cant be interface type or not public");
            }
            Service service2 = new Service((Class) this.f4955a, (Class) this.f4956b);
            service2.d = this.d;
            service2.e = this.e;
            service2.f = this.f;
            return service2;
        }
    }

    public static Builder builder(Class<?> cls, Object obj) {
        return new Builder().setInterface(cls).setObject(obj).isSingleton(true).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls, Class<?> cls2) {
        return new Builder().setInterface(cls).setClass(cls2).isSingleton(cls2.isAnnotationPresent(Singleton.class)).isSharedInstance(cls2.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls2.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls) {
        return new Builder().setInterface(cls).setClass(cls).isSingleton(cls.isAnnotationPresent(Singleton.class)).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    private Service(Class<?> cls, Object obj) {
        this.f4952a = cls;
        this.f4953b = null;
        this.f4954c = obj;
    }

    private Service(Class<?> cls, Class<?> cls2) {
        this.f4952a = cls;
        this.f4953b = cls2;
        this.f4954c = null;
    }
}

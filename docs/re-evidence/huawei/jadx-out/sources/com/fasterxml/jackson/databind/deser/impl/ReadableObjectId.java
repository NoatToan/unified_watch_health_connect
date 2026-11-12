package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.wq;
import defpackage.zm;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public class ReadableObjectId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinkedList<Referring> f4123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f4124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ObjectIdGenerator.c f4125c;
    protected ObjectIdResolver e;

    public boolean b(DeserializationContext deserializationContext) {
        return false;
    }

    public ReadableObjectId(ObjectIdGenerator.c cVar) {
        this.f4125c = cVar;
    }

    public void e(ObjectIdResolver objectIdResolver) {
        this.e = objectIdResolver;
    }

    public ObjectIdGenerator.c c() {
        return this.f4125c;
    }

    public void a(Referring referring) {
        if (this.f4123a == null) {
            this.f4123a = new LinkedList<>();
        }
        this.f4123a.add(referring);
    }

    public void a(Object obj) throws IOException {
        this.e.bindItem(this.f4125c, obj);
        this.f4124b = obj;
        Object obj2 = this.f4125c.f4068a;
        LinkedList<Referring> linkedList = this.f4123a;
        if (linkedList != null) {
            Iterator<Referring> it = linkedList.iterator();
            this.f4123a = null;
            while (it.hasNext()) {
                it.next().handleResolvedForwardReference(obj2, obj);
            }
        }
    }

    public Object a() {
        Object objResolveId = this.e.resolveId(this.f4125c);
        this.f4124b = objResolveId;
        return objResolveId;
    }

    public boolean b() {
        LinkedList<Referring> linkedList = this.f4123a;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<Referring> d() {
        LinkedList<Referring> linkedList = this.f4123a;
        if (linkedList == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        return linkedList.iterator();
    }

    public String toString() {
        return String.valueOf(this.f4125c);
    }

    public static abstract class Referring {
        private final Class<?> _beanType;
        private final zm _reference;

        public abstract void handleResolvedForwardReference(Object obj, Object obj2) throws IOException;

        public Referring(zm zmVar, Class<?> cls) {
            this._reference = zmVar;
            this._beanType = cls;
        }

        public Referring(zm zmVar, JavaType javaType) {
            this._reference = zmVar;
            this._beanType = javaType.getRawClass();
        }

        public wq getLocation() {
            return this._reference.getLocation();
        }

        public Class<?> getBeanType() {
            return this._beanType;
        }

        public boolean hasId(Object obj) {
            return obj.equals(this._reference.c());
        }
    }
}

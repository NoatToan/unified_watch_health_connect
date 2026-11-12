package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectIdGenerator.IdKey f7644b;
    public LinkedList<AbstractC0178a> c;
    public com.fasterxml.jackson.annotation.a d;

    public a(ObjectIdGenerator.IdKey idKey) {
        this.f7644b = idKey;
    }

    public void a(AbstractC0178a abstractC0178a) {
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(abstractC0178a);
    }

    public void b(Object obj) throws IOException {
        this.d.a(this.f7644b, obj);
        this.f7643a = obj;
        Object obj2 = this.f7644b.key;
        LinkedList<AbstractC0178a> linkedList = this.c;
        if (linkedList != null) {
            Iterator<AbstractC0178a> it = linkedList.iterator();
            this.c = null;
            while (it.hasNext()) {
                it.next().c(obj2, obj);
            }
        }
    }

    public ObjectIdGenerator.IdKey c() {
        return this.f7644b;
    }

    public boolean d() {
        LinkedList<AbstractC0178a> linkedList = this.c;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<AbstractC0178a> e() {
        LinkedList<AbstractC0178a> linkedList = this.c;
        return linkedList == null ? Collections.emptyList().iterator() : linkedList.iterator();
    }

    public Object f() {
        Object objB = this.d.b(this.f7644b);
        this.f7643a = objB;
        return objB;
    }

    public void g(com.fasterxml.jackson.annotation.a aVar) {
        this.d = aVar;
    }

    public boolean h(DeserializationContext deserializationContext) {
        return false;
    }

    public String toString() {
        return String.valueOf(this.f7644b);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0178a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnresolvedForwardReference f7645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f7646b;

        public AbstractC0178a(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.f7645a = unresolvedForwardReference;
            this.f7646b = cls;
        }

        public Class<?> a() {
            return this.f7646b;
        }

        public JsonLocation b() {
            return this.f7645a.getLocation();
        }

        public abstract void c(Object obj, Object obj2) throws IOException;

        public boolean d(Object obj) {
            return obj.equals(this.f7645a.getUnresolvedId());
        }

        public AbstractC0178a(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.f7645a = unresolvedForwardReference;
            this.f7646b = javaType.getRawClass();
        }
    }
}

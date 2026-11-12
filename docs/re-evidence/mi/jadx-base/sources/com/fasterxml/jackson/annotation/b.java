package com.fasterxml.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<ObjectIdGenerator.IdKey, Object> f7618a;

    @Override // com.fasterxml.jackson.annotation.a
    public void a(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f7618a;
        if (map == null) {
            this.f7618a = new HashMap();
        } else if (map.containsKey(idKey)) {
            throw new IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
        }
        this.f7618a.put(idKey, obj);
    }

    @Override // com.fasterxml.jackson.annotation.a
    public Object b(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f7618a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    @Override // com.fasterxml.jackson.annotation.a
    public a c(Object obj) {
        return new b();
    }

    @Override // com.fasterxml.jackson.annotation.a
    public boolean d(a aVar) {
        return aVar.getClass() == getClass();
    }
}

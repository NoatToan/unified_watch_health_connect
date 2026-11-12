package com.fasterxml.jackson.annotation;

/* JADX INFO: loaded from: classes21.dex */
public interface ObjectIdResolver {
    void bindItem(ObjectIdGenerator.c cVar, Object obj);

    boolean canUseFor(ObjectIdResolver objectIdResolver);

    ObjectIdResolver newForDeserialization(Object obj);

    Object resolveId(ObjectIdGenerator.c cVar);
}

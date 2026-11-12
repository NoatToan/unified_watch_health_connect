package com.fasterxml.jackson.annotation;

import defpackage.y3h;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ObjectIdGenerators$StringIdGenerator extends y3h<String> {
    private static final long serialVersionUID = 1;

    public ObjectIdGenerators$StringIdGenerator() {
        this(Object.class);
    }

    @Override // defpackage.y3h, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        return objectIdGenerator instanceof ObjectIdGenerators$StringIdGenerator;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<String> forScope(Class<?> cls) {
        return this;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(ObjectIdGenerators$StringIdGenerator.class, null, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<String> newForSerialization(Object obj) {
        return this;
    }

    private ObjectIdGenerators$StringIdGenerator(Class<?> cls) {
        super(Object.class);
    }

    @Override // defpackage.y3h, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public String generateId(Object obj) {
        return UUID.randomUUID().toString();
    }
}

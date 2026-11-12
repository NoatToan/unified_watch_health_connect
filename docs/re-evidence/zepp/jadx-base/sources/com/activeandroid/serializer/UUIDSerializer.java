package com.activeandroid.serializer;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class UUIDSerializer extends TypeSerializer {
    @Override // com.activeandroid.serializer.TypeSerializer
    public Class<?> getDeserializedType() {
        return UUID.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public Class<?> getSerializedType() {
        return String.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public UUID deserialize(Object obj) {
        if (obj == null) {
            return null;
        }
        return UUID.fromString((String) obj);
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public String serialize(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((UUID) obj).toString();
    }
}

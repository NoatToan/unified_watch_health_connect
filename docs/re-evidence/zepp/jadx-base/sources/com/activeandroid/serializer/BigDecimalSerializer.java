package com.activeandroid.serializer;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class BigDecimalSerializer extends TypeSerializer {
    @Override // com.activeandroid.serializer.TypeSerializer
    public Class<?> getDeserializedType() {
        return BigDecimal.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public Class<?> getSerializedType() {
        return String.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public BigDecimal deserialize(Object obj) {
        if (obj == null) {
            return null;
        }
        return new BigDecimal((String) obj);
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    public String serialize(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((BigDecimal) obj).toString();
    }
}

package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l14) {
            return l14 == null ? JsonNull.INSTANCE : new JsonPrimitive(l14);
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l14) {
            return l14 == null ? JsonNull.INSTANCE : new JsonPrimitive(l14.toString());
        }
    };

    public abstract JsonElement serialize(Long l14);
}

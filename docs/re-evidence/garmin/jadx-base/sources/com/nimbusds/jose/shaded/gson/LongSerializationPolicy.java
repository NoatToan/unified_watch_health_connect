package com.nimbusds.jose.shaded.gson;

/* JADX INFO: loaded from: classes3.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.nimbusds.jose.shaded.gson.LongSerializationPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.LongSerializationPolicy
        public JsonElement serialize(Long l14) {
            return l14 == null ? JsonNull.INSTANCE : new JsonPrimitive(l14);
        }
    },
    STRING { // from class: com.nimbusds.jose.shaded.gson.LongSerializationPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.LongSerializationPolicy
        public JsonElement serialize(Long l14) {
            return l14 == null ? JsonNull.INSTANCE : new JsonPrimitive(l14.toString());
        }
    };

    public abstract JsonElement serialize(Long l14);
}

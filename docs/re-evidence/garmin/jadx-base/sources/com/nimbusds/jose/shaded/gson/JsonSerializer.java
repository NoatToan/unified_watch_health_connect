package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t7, Type type, JsonSerializationContext jsonSerializationContext);
}

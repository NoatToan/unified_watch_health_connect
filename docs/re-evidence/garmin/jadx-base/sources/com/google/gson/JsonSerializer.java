package com.google.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t7, Type type, JsonSerializationContext jsonSerializationContext);
}

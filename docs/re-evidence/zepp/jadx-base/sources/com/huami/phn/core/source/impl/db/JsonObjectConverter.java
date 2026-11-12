package com.huami.phn.core.source.impl.db;

import androidx.room.TypeConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/huami/phn/core/source/impl/db/JsonObjectConverter;", "", "", "value", "Lkotlinx/serialization/json/JsonObject;", "jsonString2Object", "objectToJsonString", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class JsonObjectConverter {
    @TypeConverter
    @NotNull
    public final JsonObject jsonString2Object(@NotNull String value) {
        Json.Companion companion = Json.INSTANCE;
        return (JsonObject) companion.decodeFromString(SerializersKt.serializer(companion.getSerializersModule(), Reflection.typeOf(JsonObject.class)), value);
    }

    @TypeConverter
    @NotNull
    public final String objectToJsonString(@Nullable JsonObject value) {
        Json.Companion companion = Json.INSTANCE;
        return companion.encodeToString(SerializersKt.serializer(companion.getSerializersModule(), Reflection.nullableTypeOf(JsonObject.class)), value);
    }
}

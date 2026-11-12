package com.xiaomi.fitness.common.extensions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001aF\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\b\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\b\u001a+\u0010\u000e\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\b¢\u0006\u0002\u0010\u000f\u001a\"\u0010\u0010\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0012\u001a\"\u0010\u0010\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\u001a\u001a\u0010\u0018\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u0006H\u0086\b¢\u0006\u0002\u0010\u0019\u001a>\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\b\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\b\u001a#\u0010\u000e\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\b¢\u0006\u0002\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\u0002H\f¢\u0006\u0002\u0010\u001c\"\u0012\u0010\u0015\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"toMap", "", "K", "V", "Lcom/google/gson/Gson;", "result", "", "kclass", "Ljava/lang/Class;", "vclass", "toList", "", "T", "clazz", "toObject", "(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "fromJson", "json", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "Ljava/io/Reader;", "(Lcom/google/gson/Gson;Ljava/io/Reader;)Ljava/lang/Object;", "mGson", "getMGson", "()Lcom/google/gson/Gson;", "jsonToBean", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGsonExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,81:1\n53#1,7:82\n53#1,7:89\n53#1,7:96\n53#1,7:103\n53#1,7:110\n*S KotlinDebug\n*F\n+ 1 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n63#1:82,7\n67#1:89,7\n71#1:96,7\n75#1:103,7\n79#1:110,7\n*E\n"})
public final class GsonExtKt {
    public static final /* synthetic */ <T> T fromJson(Gson gson, String json) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.needClassReification();
        return (T) gson.fromJson(json, new TypeToken<T>() { // from class: com.xiaomi.fitness.common.extensions.GsonExtKt.fromJson.1
        }.getType());
    }

    @NotNull
    public static final Gson getMGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return gsonCreate;
    }

    public static final /* synthetic */ <T> T jsonToBean(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        Intrinsics.needClassReification();
        return (T) gsonCreate.fromJson(str, new TypeToken<T>() { // from class: com.xiaomi.fitness.common.extensions.GsonExtKt.jsonToBean.1
        }.getType());
    }

    @NotNull
    public static final <T> String toJson(T t) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        String json = gsonCreate.toJson(t);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Gson gson, @NotNull String result, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Object objFromJson = gson.fromJson(result, new ParameterizedTypeImpl(List.class, new Type[]{clazz}));
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull Gson gson, @NotNull String result, @NotNull Class<K> kclass, @NotNull Class<V> vclass) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(vclass, "vclass");
        Object objFromJson = gson.fromJson(result, new ParameterizedTypeImpl(HashMap.class, new Type[]{kclass, vclass}));
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }

    public static final <T> T toObject(@NotNull Gson gson, @NotNull String result, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) gson.fromJson(result, (Class) clazz);
    }

    public static final /* synthetic */ <T> T fromJson(Gson gson, Reader json) {
        Intrinsics.checkNotNullParameter(gson, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.needClassReification();
        return (T) gson.fromJson(json, new TypeToken<T>() { // from class: com.xiaomi.fitness.common.extensions.GsonExtKt.fromJson.2
        }.getType());
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull String str, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        Object objFromJson = gsonCreate.fromJson(str, new ParameterizedTypeImpl(List.class, new Type[]{clazz}));
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (List) objFromJson;
    }

    @NotNull
    public static final <K, V> Map<K, V> toMap(@NotNull String str, @NotNull Class<K> kclass, @NotNull Class<V> vclass) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(vclass, "vclass");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        Object objFromJson = gsonCreate.fromJson(str, new ParameterizedTypeImpl(HashMap.class, new Type[]{kclass, vclass}));
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }

    public static final <T> T toObject(@NotNull String str, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (T) gsonCreate.fromJson(str, (Class) clazz);
    }
}

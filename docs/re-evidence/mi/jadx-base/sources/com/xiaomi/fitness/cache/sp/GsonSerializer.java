package com.xiaomi.fitness.cache.sp;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/GsonSerializer;", "Lcom/xiaomi/fitness/cache/sp/Serializer;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Lcom/google/gson/Gson;)V", "getGson", "()Lcom/google/gson/Gson;", "serialize", "", "toSerialize", "", "deserialize", "serialized", "type", "Ljava/lang/reflect/Type;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsonSerializer implements Serializer {

    @NotNull
    private final Gson gson;

    public GsonSerializer(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.gson = gson;
    }

    @Override // com.xiaomi.fitness.cache.sp.Serializer
    @Nullable
    public Object deserialize(@Nullable String serialized, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return this.gson.fromJson(serialized, type);
        } catch (Throwable th) {
            throw new Error("Error in parsing to " + type + ". The string to parse: \"" + this + "\"", th);
        }
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @Override // com.xiaomi.fitness.cache.sp.Serializer
    @Nullable
    public String serialize(@Nullable Object toSerialize) {
        return this.gson.toJson(toSerialize);
    }
}

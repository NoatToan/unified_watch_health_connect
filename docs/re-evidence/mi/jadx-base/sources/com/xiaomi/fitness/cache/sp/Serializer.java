package com.xiaomi.fitness.cache.sp;

import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/Serializer;", "", "serialize", "", "toSerialize", "deserialize", "serialized", "type", "Ljava/lang/reflect/Type;", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Serializer {
    @Nullable
    Object deserialize(@Nullable String serialized, @NotNull Type type);

    @Nullable
    String serialize(@Nullable Object toSerialize);
}

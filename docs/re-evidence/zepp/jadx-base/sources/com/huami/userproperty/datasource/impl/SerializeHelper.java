package com.huami.userproperty.datasource.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.userproperty.entity.ParseResult;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/userproperty/datasource/impl/SerializeHelper;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Type;", "type", "", "json", "Lcom/huami/userproperty/entity/ParseResult;", "parse", "any", "toStringOrJson", "Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "gson", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class SerializeHelper {

    @NotNull
    public static final SerializeHelper INSTANCE = new SerializeHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Gson gson = new Gson();

    private SerializeHelper() {
    }

    @NotNull
    public final <T> ParseResult<T> parse(@NotNull Type type, @Nullable String json) {
        boolean z = false;
        if ((json == null || json.length() == 0) || Intrinsics.areEqual(json, "null")) {
            return new ParseResult.Failed.JsonEmpty();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (cls != null && cls.isAssignableFrom(String.class)) {
            z = true;
        }
        if (z) {
            return new ParseResult.Success(json);
        }
        try {
            return new ParseResult.Success(gson.fromJson(json, type));
        } catch (Exception unused) {
            return new ParseResult.Failed.ParseFailed();
        }
    }

    @Nullable
    public final String toStringOrJson(@Nullable Object any) {
        if (any == null) {
            return null;
        }
        return any instanceof String ? (String) any : gson.toJson(any);
    }

    public final /* synthetic */ <T> ParseResult<T> parse(String json) {
        Intrinsics.needClassReification();
        return parse(new TypeToken<T>() { // from class: com.huami.userproperty.datasource.impl.SerializeHelper.parse.1
        }.getType(), json);
    }
}

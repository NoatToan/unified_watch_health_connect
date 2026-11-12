package com.huami.training.api.ks;

import androidx.exifinterface.media.ExifInterface;
import com.huami.training.util.SerializationKtxKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¨\u0006\b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "", "json", "", "decodeStrList", "list", "encodeStrList", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class SerializersKt {
    @Nullable
    public static final <T> List<T> decodeStrList(@NotNull KSerializer<T> kSerializer, @Nullable String str) {
        if (str == null) {
            return null;
        }
        return (List) SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(BuiltinSerializersKt.ListSerializer(kSerializer), str);
    }

    @Nullable
    public static final <T> String encodeStrList(@NotNull KSerializer<T> kSerializer, @Nullable List<? extends T> list) {
        if (list == null) {
            return null;
        }
        return SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(BuiltinSerializersKt.ListSerializer(kSerializer), list);
    }
}

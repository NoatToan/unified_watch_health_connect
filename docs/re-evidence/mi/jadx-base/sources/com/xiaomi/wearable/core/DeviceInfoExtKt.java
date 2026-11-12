package com.xiaomi.wearable.core;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0006\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "convertToJson", "", "Lcom/xiaomi/wearable/core/DeviceInfo;", "convertToDevice", "isValid", "", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoExtKt {

    @NotNull
    private static final Gson gson = new Gson();

    @Nullable
    public static final DeviceInfo convertToDevice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (DeviceInfo) gson.fromJson(str, DeviceInfo.class);
    }

    @NotNull
    public static final String convertToJson(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        String json = gson.toJson(deviceInfo);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public static final Gson getGson() {
        return gson;
    }

    public static final boolean isValid(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<this>");
        return deviceInfo.getAddress().length() > 0;
    }
}

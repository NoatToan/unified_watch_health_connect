package com.xiaomi.fitness.eco.device.manager.export.bean;

import com.google.gson.Gson;
import com.xiaomi.fitness.device.manager.bean.Device;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0007J \u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceConverter;", "", "<init>", "()V", "mapToString", "", "extraValues", "", "stringToMap", "detailToString", "detail", "Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "stringToDetail", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceConverter {
    @NotNull
    public final String detailToString(@Nullable Device.Detail detail) {
        if (detail == null) {
            return "";
        }
        String json = new Gson().toJson(detail);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public final String mapToString(@Nullable Map<String, String> extraValues) {
        if (extraValues == null || extraValues.isEmpty()) {
            return "";
        }
        String json = new Gson().toJson(extraValues);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Nullable
    public final Device.Detail stringToDetail(@Nullable String detail) {
        if (detail == null || detail.length() == 0) {
            return null;
        }
        return (Device.Detail) new Gson().fromJson(detail, Device.Detail.class);
    }

    @Nullable
    public final Map<String, String> stringToMap(@Nullable String extraValues) {
        if (extraValues == null || extraValues.length() == 0) {
            return null;
        }
        return (Map) new Gson().fromJson(extraValues, (Class) new LinkedHashMap().getClass());
    }
}

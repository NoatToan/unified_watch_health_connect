package com.huami.phn.core.device;

import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.util.Result;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH&J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\fH&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H&J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H&J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H&¨\u0006\u0013"}, d2 = {"Lcom/huami/phn/core/device/DevicePHNFeature;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/core/device/BleException;", "queryVersion", "Lcom/huami/phn/core/model/PHNProjectRecord;", "project", "", "startPhnProject", "", "rest", "updateRest", "stopPhnProject", "Lkotlinx/serialization/json/JsonObject;", "syncPhnResult", "syncPhnUpdate", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface DevicePHNFeature {
    @NotNull
    HMDeviceSource deviceSource();

    @NotNull
    Result<String, BleException> queryVersion();

    @NotNull
    Result<Boolean, BleException> startPhnProject(@NotNull PHNProjectRecord project);

    @NotNull
    Result<Boolean, BleException> stopPhnProject();

    @NotNull
    Result<JsonObject, BleException> syncPhnResult();

    @NotNull
    Result<JsonObject, BleException> syncPhnUpdate();

    @NotNull
    Result<Boolean, BleException> updateRest(@NotNull int[] rest);
}

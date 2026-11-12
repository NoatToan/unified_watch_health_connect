package com.huami.rawdata_uploader.relation.remote;

import com.huami.rawdata_uploader.relation.local.RawDataDbVo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/rawdata_uploader/relation/local/RawDataDbVo;", "", "eventType", "subType", "Lcom/huami/rawdata_uploader/relation/remote/RawDataRequestEntity;", "Lcom/huami/rawdata_uploader/relation/remote/RawDataBloodPressureRequestEntity;", "toRequestEntity", "rawdata-uploader_release"}, k = 2, mv = {1, 5, 1})
public final class RawDataRequestEntityKt {
    @NotNull
    public static final RawDataRequestEntity<RawDataBloodPressureRequestEntity> toRequestEntity(@NotNull RawDataDbVo rawDataDbVo, @NotNull String str, @NotNull String str2) {
        return new RawDataRequestEntity<>(str, str2, rawDataDbVo.getMeasureTime(), rawDataDbVo.getUserId(), new RawDataBloodPressureRequestEntity(rawDataDbVo.getMeasureTime(), rawDataDbVo.getZipName(), rawDataDbVo.getDeviceType(), rawDataDbVo.getDeviceSource(), rawDataDbVo.getDeviceMac(), rawDataDbVo.getDeviceId(), rawDataDbVo.getSn(), rawDataDbVo.getFirmVersion()));
    }
}

package com.garmin.device.sharing.management.dtos;

import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/garmin/device/sharing/management/dtos/SimpleDeviceDtoJsonParser;", "Lcom/garmin/device/sharing/management/dtos/RegisteredDeviceDtoJsonParser;", "requirePartNumber", "", "(Z)V", "fromJSONObject", "Lcom/garmin/device/sharing/management/dtos/IRegisteredDeviceDto;", "json", "Lorg/json/JSONObject;", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SimpleDeviceDtoJsonParser implements RegisteredDeviceDtoJsonParser {
    private final boolean requirePartNumber;

    public /* synthetic */ SimpleDeviceDtoJsonParser(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14);
    }

    @Override // com.garmin.device.sharing.management.dtos.RegisteredDeviceDtoJsonParser
    public IRegisteredDeviceDto fromJSONObject(JSONObject json) {
        json.getClass();
        SimpleDeviceDto simpleDeviceDto = new SimpleDeviceDto(json);
        if (this.requirePartNumber && simpleDeviceDto.getPartNumber() == null) {
            return null;
        }
        return simpleDeviceDto;
    }

    public SimpleDeviceDtoJsonParser(boolean z14) {
        this.requirePartNumber = z14;
    }

    public SimpleDeviceDtoJsonParser() {
        this(false, 1, null);
    }
}

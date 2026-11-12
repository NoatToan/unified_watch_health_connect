package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2Entity;", "", "", "getTimeStamp", "()J", "timeStamp", "", "getDeviceSource", "()I", "deviceSource", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "getSn", "sn", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface Spo2Entity {
    @NotNull
    String getDeviceId();

    int getDeviceSource();

    @NotNull
    String getSn();

    long getTimeStamp();
}

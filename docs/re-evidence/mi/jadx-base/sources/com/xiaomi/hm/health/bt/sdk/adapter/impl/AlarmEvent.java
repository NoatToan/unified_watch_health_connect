package com.xiaomi.hm.health.bt.sdk.adapter.impl;

import androidx.annotation.Keep;
import defpackage.sd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/adapter/impl/AlarmEvent;", "", "Lcom/xiaomi/hm/health/bt/sdk/adapter/impl/AlarmEventType;", "alarmEventType", "Lcom/xiaomi/hm/health/bt/sdk/adapter/impl/AlarmEventType;", "getAlarmEventType", "()Lcom/xiaomi/hm/health/bt/sdk/adapter/impl/AlarmEventType;", "Lsd;", "deviceType", "Lsd;", "getDeviceType", "()Lsd;", "<init>", "(Lsd;Lcom/xiaomi/hm/health/bt/sdk/adapter/impl/AlarmEventType;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class AlarmEvent {

    @NotNull
    private final AlarmEventType alarmEventType;

    @NotNull
    private final sd deviceType;

    public AlarmEvent(@NotNull sd deviceType, @NotNull AlarmEventType alarmEventType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(alarmEventType, "alarmEventType");
        this.deviceType = deviceType;
        this.alarmEventType = alarmEventType;
    }

    @NotNull
    public final AlarmEventType getAlarmEventType() {
        return this.alarmEventType;
    }

    @NotNull
    public final sd getDeviceType() {
        return this.deviceType;
    }
}

package com.xiaomi.hm.health.device.bind.analytic.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "", "getEvent", "()Ljava/lang/String;", "event", "<init>", "()V", "Lcom/xiaomi/hm/health/device/bind/analytic/events/AuthSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindFail;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindStart;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/CancelBind;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/Confirm;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/ConnectSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/GetDeviceInfoSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/QuerySuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/ScanSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/SetTimeSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/SetUserInfoSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/UploadBindSuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/WaitConfirm;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class BindEvent {
    private BindEvent() {
    }

    public /* synthetic */ BindEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getEvent();
}

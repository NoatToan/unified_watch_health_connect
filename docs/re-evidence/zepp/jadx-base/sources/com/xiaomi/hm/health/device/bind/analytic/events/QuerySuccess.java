package com.xiaomi.hm.health.device.bind.analytic.events;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/QuerySuccess;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "toString", "a", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "event", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class QuerySuccess extends BindEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String event;

    public QuerySuccess() {
        super(null);
        this.event = "BASE_LBE_BIND_QUERY_RELATIONSHIP_SUCCESS";
    }

    @Override // com.xiaomi.hm.health.device.bind.analytic.events.BindEvent
    @NotNull
    public String getEvent() {
        return this.event;
    }

    @NotNull
    public String toString() {
        return "QuerySuccess[]";
    }
}

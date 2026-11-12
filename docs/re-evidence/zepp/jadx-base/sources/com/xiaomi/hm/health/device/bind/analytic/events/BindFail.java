package com.xiaomi.hm.health.device.bind.analytic.events;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/bind/analytic/events/BindFail;", "Lcom/xiaomi/hm/health/device/bind/analytic/events/BindEvent;", "", "toString", "a", "Ljava/lang/String;", "getBindStage", "()Ljava/lang/String;", "bindStage", "b", "getFailReason", "failReason", "", "c", "Ljava/lang/Integer;", "getDomain", "()Ljava/lang/Integer;", "domain", GoogleApiAvailabilityLight.a, "getCode", "code", "e", "getEvent", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindFail extends BindEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bindStage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String failReason;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Integer domain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final Integer code;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String event;

    public /* synthetic */ BindFail(String str, String str2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2);
    }

    @NotNull
    public final String getBindStage() {
        return this.bindStage;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getDomain() {
        return this.domain;
    }

    @Override // com.xiaomi.hm.health.device.bind.analytic.events.BindEvent
    @NotNull
    public String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getFailReason() {
        return this.failReason;
    }

    @NotNull
    public String toString() {
        return "BindFail[bindStage: " + this.bindStage + ", failReason: " + this.failReason + ", domain: " + this.domain + ", code: " + this.code + "]";
    }

    public BindFail(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        super(null);
        this.bindStage = str;
        this.failReason = str2;
        this.domain = num;
        this.code = num2;
        this.event = "BASE_LBE_BIND_FAIL";
    }

    public BindFail(@NotNull String str) {
        this(str, null, null, null);
    }

    public BindFail(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, null);
    }

    public BindFail(@NotNull String str, @NotNull String str2, int i) {
        this(str, str2, null, Integer.valueOf(i));
    }
}

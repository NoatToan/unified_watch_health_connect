package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/GpsInjectResponse;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "result", "code", "copy", "(ZLjava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/GpsInjectResponse;", "", "toString", "hashCode", "other", "equals", "a", "Z", "getResult", "()Z", "b", "Ljava/lang/Integer;", "getCode", "<init>", "(ZLjava/lang/Integer;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GpsInjectResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer code;

    public GpsInjectResponse(boolean z, @Nullable Integer num) {
        this.result = z;
        this.code = num;
    }

    public static /* synthetic */ GpsInjectResponse copy$default(GpsInjectResponse gpsInjectResponse, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gpsInjectResponse.result;
        }
        if ((i & 2) != 0) {
            num = gpsInjectResponse.code;
        }
        return gpsInjectResponse.copy(z, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @NotNull
    public final GpsInjectResponse copy(boolean result, @Nullable Integer code) {
        return new GpsInjectResponse(result, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsInjectResponse)) {
            return false;
        }
        GpsInjectResponse gpsInjectResponse = (GpsInjectResponse) other;
        return this.result == gpsInjectResponse.result && Intrinsics.areEqual(this.code, gpsInjectResponse.code);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    public final boolean getResult() {
        return this.result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.result;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.code;
        return i + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "GpsInjectResponse(result=" + this.result + ", code=" + this.code + ')';
    }

    public /* synthetic */ GpsInjectResponse(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num);
    }
}

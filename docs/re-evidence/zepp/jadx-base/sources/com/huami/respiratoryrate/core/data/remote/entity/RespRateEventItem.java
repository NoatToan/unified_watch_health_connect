package com.huami.respiratoryrate.core.data.remote.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.huami.respiratoryrate.core.utils.TimeUtilsKt;
import defpackage.b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B+\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "", "", "component1", "component2", "", "component3", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;", "component4", "eventType", "subType", "timestamp", "value", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "getSubType", "setSubType", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;", "getValue", "()Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;", "setValue", "(Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventValue;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RespRateEventItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EventType = "RespiratoryRate";

    @NotNull
    public static final String SubType = "real_data";

    @Expose
    @NotNull
    private String eventType;

    @Expose
    @NotNull
    private String subType;

    @Expose
    private long timestamp;

    @Expose
    @NotNull
    private RespRateEventValue value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem$Companion;", "", "", "timestamp", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "defaultItem", "", "EventType", "Ljava/lang/String;", "SubType", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RespRateEventItem defaultItem(long timestamp) {
            return new RespRateEventItem(RespRateEventItem.EventType, "real_data", TimeUtilsKt.toMillis(timestamp), new RespRateEventValue("", new ArrayList()));
        }
    }

    public RespRateEventItem(@NotNull String str, @NotNull String str2, long j, @NotNull RespRateEventValue respRateEventValue) {
        this.eventType = str;
        this.subType = str2;
        this.timestamp = j;
        this.value = respRateEventValue;
    }

    public static /* synthetic */ RespRateEventItem copy$default(RespRateEventItem respRateEventItem, String str, String str2, long j, RespRateEventValue respRateEventValue, int i, Object obj) {
        if ((i & 1) != 0) {
            str = respRateEventItem.eventType;
        }
        if ((i & 2) != 0) {
            str2 = respRateEventItem.subType;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = respRateEventItem.timestamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            respRateEventValue = respRateEventItem.value;
        }
        return respRateEventItem.copy(str, str3, j2, respRateEventValue);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RespRateEventValue getValue() {
        return this.value;
    }

    @NotNull
    public final RespRateEventItem copy(@NotNull String eventType, @NotNull String subType, long timestamp, @NotNull RespRateEventValue value) {
        return new RespRateEventItem(eventType, subType, timestamp, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespRateEventItem)) {
            return false;
        }
        RespRateEventItem respRateEventItem = (RespRateEventItem) other;
        return Intrinsics.areEqual(this.eventType, respRateEventItem.eventType) && Intrinsics.areEqual(this.subType, respRateEventItem.subType) && this.timestamp == respRateEventItem.timestamp && Intrinsics.areEqual(this.value, respRateEventItem.value);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getSubType() {
        return this.subType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final RespRateEventValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.eventType.hashCode() * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.value.hashCode();
    }

    public final void setEventType(@NotNull String str) {
        this.eventType = str;
    }

    public final void setSubType(@NotNull String str) {
        this.subType = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setValue(@NotNull RespRateEventValue respRateEventValue) {
        this.value = respRateEventValue;
    }

    @NotNull
    public String toString() {
        return "RespRateEventItem(eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", value=" + this.value + ')';
    }

    public /* synthetic */ RespRateEventItem(String str, String str2, long j, RespRateEventValue respRateEventValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j, respRateEventValue);
    }
}

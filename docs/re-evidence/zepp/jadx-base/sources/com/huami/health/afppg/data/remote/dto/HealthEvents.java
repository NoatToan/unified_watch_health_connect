package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.b;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/HealthEvents;", "", "", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents$EventItem;", "component1", "items", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "EventItem", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HealthEvents {

    @NotNull
    private final List<EventItem> items;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthEvents() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HealthEvents(@NotNull List<EventItem> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthEvents copy$default(HealthEvents healthEvents, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = healthEvents.items;
        }
        return healthEvents.copy(list);
    }

    @NotNull
    public final List<EventItem> component1() {
        return this.items;
    }

    @NotNull
    public final HealthEvents copy(@NotNull List<EventItem> items) {
        return new HealthEvents(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HealthEvents) && Intrinsics.areEqual(this.items, ((HealthEvents) other).items);
    }

    @NotNull
    public final List<EventItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "HealthEvents(items=" + this.items + ')';
    }

    public /* synthetic */ HealthEvents(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003Jw\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b)\u0010#R\u0019\u0010\u0015\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b,\u0010#R\u0019\u0010\u0018\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b0\u0010#R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b1\u0010#¨\u00064"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/HealthEvents$EventItem;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "userId", "eventType", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "sn", "deviceId", "deviceSource", "appName", "subType", "timestamp", "extra", "timeZone", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getEventType", LogUtil.I, "getActive", "()I", "getSn", "getDeviceId", "getDeviceSource", "getAppName", "getSubType", "J", "getTimestamp", "()J", "getExtra", "getTimeZone", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class EventItem {
        private final int active;

        @NotNull
        private final String appName;

        @NotNull
        private final String deviceId;
        private final int deviceSource;

        @NotNull
        private final String eventType;

        @NotNull
        private final String extra;

        @NotNull
        private final String sn;

        @NotNull
        private final String subType;

        @NotNull
        private final String timeZone;
        private final long timestamp;

        @NotNull
        private final String userId;

        public EventItem() {
            this(null, null, 0, null, null, 0, null, null, 0L, null, null, 2047, null);
        }

        public EventItem(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, @NotNull String str5, @NotNull String str6, long j, @NotNull String str7, @NotNull String str8) {
            this.userId = str;
            this.eventType = str2;
            this.active = i;
            this.sn = str3;
            this.deviceId = str4;
            this.deviceSource = i2;
            this.appName = str5;
            this.subType = str6;
            this.timestamp = j;
            this.extra = str7;
            this.timeZone = str8;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getExtra() {
            return this.extra;
        }

        @NotNull
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getActive() {
            return this.active;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSn() {
            return this.sn;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getDeviceSource() {
            return this.deviceSource;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final EventItem copy(@NotNull String userId, @NotNull String eventType, int active, @NotNull String sn, @NotNull String deviceId, int deviceSource, @NotNull String appName, @NotNull String subType, long timestamp, @NotNull String extra, @NotNull String timeZone) {
            return new EventItem(userId, eventType, active, sn, deviceId, deviceSource, appName, subType, timestamp, extra, timeZone);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventItem)) {
                return false;
            }
            EventItem eventItem = (EventItem) other;
            return Intrinsics.areEqual(this.userId, eventItem.userId) && Intrinsics.areEqual(this.eventType, eventItem.eventType) && this.active == eventItem.active && Intrinsics.areEqual(this.sn, eventItem.sn) && Intrinsics.areEqual(this.deviceId, eventItem.deviceId) && this.deviceSource == eventItem.deviceSource && Intrinsics.areEqual(this.appName, eventItem.appName) && Intrinsics.areEqual(this.subType, eventItem.subType) && this.timestamp == eventItem.timestamp && Intrinsics.areEqual(this.extra, eventItem.extra) && Intrinsics.areEqual(this.timeZone, eventItem.timeZone);
        }

        public final int getActive() {
            return this.active;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getDeviceId() {
            return this.deviceId;
        }

        public final int getDeviceSource() {
            return this.deviceSource;
        }

        @NotNull
        public final String getEventType() {
            return this.eventType;
        }

        @NotNull
        public final String getExtra() {
            return this.extra;
        }

        @NotNull
        public final String getSn() {
            return this.sn;
        }

        @NotNull
        public final String getSubType() {
            return this.subType;
        }

        @NotNull
        public final String getTimeZone() {
            return this.timeZone;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (((((((((((((((((((this.userId.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.active) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceSource) * 31) + this.appName.hashCode()) * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.extra.hashCode()) * 31) + this.timeZone.hashCode();
        }

        @NotNull
        public String toString() {
            return "EventItem(userId=" + this.userId + ", eventType=" + this.eventType + ", active=" + this.active + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ", deviceSource=" + this.deviceSource + ", appName=" + this.appName + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", extra=" + this.extra + ", timeZone=" + this.timeZone + ')';
        }

        public /* synthetic */ EventItem(String str, String str2, int i, String str3, String str4, int i2, String str5, String str6, long j, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? 0L : j, (i3 & 512) == 0 ? str7 : "", (i3 & 1024) != 0 ? TimeZone.getDefault().getID() : str8);
        }
    }
}

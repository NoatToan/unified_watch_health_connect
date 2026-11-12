package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "", "", "Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "getNext", "()Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "<init>", "(Ljava/util/List;Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;)V", "EventItem", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserEvents {

    @NotNull
    private final List<EventItem> items;

    @Nullable
    private final EventItem next;

    /* JADX WARN: Multi-variable type inference failed */
    public UserEvents() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public UserEvents(@NotNull List<EventItem> list, @Nullable EventItem eventItem) {
        this.items = list;
        this.next = eventItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEvents copy$default(UserEvents userEvents, List list, EventItem eventItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userEvents.items;
        }
        if ((i & 2) != 0) {
            eventItem = userEvents.next;
        }
        return userEvents.copy(list, eventItem);
    }

    @NotNull
    public final List<EventItem> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventItem getNext() {
        return this.next;
    }

    @NotNull
    public final UserEvents copy(@NotNull List<EventItem> items, @Nullable EventItem next) {
        return new UserEvents(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEvents)) {
            return false;
        }
        UserEvents userEvents = (UserEvents) other;
        return Intrinsics.areEqual(this.items, userEvents.items) && Intrinsics.areEqual(this.next, userEvents.next);
    }

    @NotNull
    public final List<EventItem> getItems() {
        return this.items;
    }

    @Nullable
    public final EventItem getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        EventItem eventItem = this.next;
        return iHashCode + (eventItem == null ? 0 : eventItem.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserEvents(items=" + this.items + ", next=" + this.next + ')';
    }

    public /* synthetic */ UserEvents(List list, EventItem eventItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : eventItem);
    }

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\u008b\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0002HÆ\u0001J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J\u0013\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0016\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b0\u0010'R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b1\u0010'R\u0019\u0010\u001a\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010-\u001a\u0004\b2\u0010/R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b3\u0010'R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b4\u0010'R\u001c\u0010\u001d\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b5\u0010'R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\b\u001e\u00107\"\u0004\b8\u00109R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010%\u001a\u0004\b:\u0010'\"\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/UserEvents$EventItem;", "", "", "component1", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "component13", "userId", "eventType", "subType", "timestamp", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "sn", "deviceId", "deviceSource", "appName", "extra", "timeZoneId", "isNext", "date", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getEventType", "getSubType", "J", "getTimestamp", "()J", LogUtil.I, "getActive", "()I", "getSn", "getDeviceId", "getDeviceSource", "getAppName", "getExtra", "getTimeZoneId", "Z", "()Z", "setNext", "(Z)V", "getDate", "setDate", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class EventItem {
        private final int active;

        @NotNull
        private final String appName;

        @NotNull
        private String date;

        @NotNull
        private final String deviceId;
        private final int deviceSource;

        @NotNull
        private final String eventType;

        @NotNull
        private final String extra;
        private boolean isNext;

        @NotNull
        private final String sn;

        @NotNull
        private final String subType;

        @SerializedName("timeZone")
        @NotNull
        private final String timeZoneId;
        private final long timestamp;

        @NotNull
        private final String userId;

        public EventItem() {
            this(null, null, null, 0L, 0, null, null, 0, null, null, null, false, null, 8191, null);
        }

        public EventItem(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i, @NotNull String str4, @NotNull String str5, int i2, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9) {
            this.userId = str;
            this.eventType = str2;
            this.subType = str3;
            this.timestamp = j;
            this.active = i;
            this.sn = str4;
            this.deviceId = str5;
            this.deviceSource = i2;
            this.appName = str6;
            this.extra = str7;
            this.timeZoneId = str8;
            this.isNext = z;
            this.date = str9;
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
        public final String getTimeZoneId() {
            return this.timeZoneId;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getIsNext() {
            return this.isNext;
        }

        @NotNull
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEventType() {
            return this.eventType;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getActive() {
            return this.active;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSn() {
            return this.sn;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getDeviceSource() {
            return this.deviceSource;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final EventItem copy(@NotNull String userId, @NotNull String eventType, @NotNull String subType, long timestamp, int active, @NotNull String sn, @NotNull String deviceId, int deviceSource, @NotNull String appName, @NotNull String extra, @NotNull String timeZoneId, boolean isNext, @NotNull String date) {
            return new EventItem(userId, eventType, subType, timestamp, active, sn, deviceId, deviceSource, appName, extra, timeZoneId, isNext, date);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventItem)) {
                return false;
            }
            EventItem eventItem = (EventItem) other;
            return Intrinsics.areEqual(this.userId, eventItem.userId) && Intrinsics.areEqual(this.eventType, eventItem.eventType) && Intrinsics.areEqual(this.subType, eventItem.subType) && this.timestamp == eventItem.timestamp && this.active == eventItem.active && Intrinsics.areEqual(this.sn, eventItem.sn) && Intrinsics.areEqual(this.deviceId, eventItem.deviceId) && this.deviceSource == eventItem.deviceSource && Intrinsics.areEqual(this.appName, eventItem.appName) && Intrinsics.areEqual(this.extra, eventItem.extra) && Intrinsics.areEqual(this.timeZoneId, eventItem.timeZoneId) && this.isNext == eventItem.isNext && Intrinsics.areEqual(this.date, eventItem.date);
        }

        public final int getActive() {
            return this.active;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        @NotNull
        public final String getDate() {
            return this.date;
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
        public final String getTimeZoneId() {
            return this.timeZoneId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v23, types: [int] */
        /* JADX WARN: Type inference failed for: r1v19, types: [int] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.userId.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.subType.hashCode()) * 31) + b.a(this.timestamp)) * 31) + this.active) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceSource) * 31) + this.appName.hashCode()) * 31) + this.extra.hashCode()) * 31) + this.timeZoneId.hashCode()) * 31;
            boolean z = this.isNext;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((iHashCode + r1) * 31) + this.date.hashCode();
        }

        public final boolean isNext() {
            return this.isNext;
        }

        public final void setDate(@NotNull String str) {
            this.date = str;
        }

        public final void setNext(boolean z) {
            this.isNext = z;
        }

        @NotNull
        public String toString() {
            return "EventItem(userId=" + this.userId + ", eventType=" + this.eventType + ", subType=" + this.subType + ", timestamp=" + this.timestamp + ", active=" + this.active + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ", deviceSource=" + this.deviceSource + ", appName=" + this.appName + ", extra=" + this.extra + ", timeZoneId=" + this.timeZoneId + ", isNext=" + this.isNext + ", date=" + this.date + ')';
        }

        public /* synthetic */ EventItem(String str, String str2, String str3, long j, int i, String str4, String str5, int i2, String str6, String str7, String str8, boolean z, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? TimeZone.getDefault().getID() : str8, (i3 & 2048) == 0 ? z : false, (i3 & 4096) == 0 ? str9 : "");
        }
    }
}

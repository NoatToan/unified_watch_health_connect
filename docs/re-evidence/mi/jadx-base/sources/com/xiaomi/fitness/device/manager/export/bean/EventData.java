package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/EventData;", "", "time", "", "key", "", "value", "extra", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTime", "()I", "setTime", "(I)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "setValue", "getExtra", "setExtra", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventData {

    @SerializedName("extra")
    @NotNull
    private String extra;

    @SerializedName("key")
    @NotNull
    private String key;

    @SerializedName("time")
    private int time;

    @SerializedName("value")
    @NotNull
    private String value;

    public EventData() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ EventData copy$default(EventData eventData, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventData.time;
        }
        if ((i2 & 2) != 0) {
            str = eventData.key;
        }
        if ((i2 & 4) != 0) {
            str2 = eventData.value;
        }
        if ((i2 & 8) != 0) {
            str3 = eventData.extra;
        }
        return eventData.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final EventData copy(int time, @NotNull String key, @NotNull String value, @NotNull String extra) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(extra, "extra");
        return new EventData(time, key, value, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) other;
        return this.time == eventData.time && Intrinsics.areEqual(this.key, eventData.key) && Intrinsics.areEqual(this.value, eventData.value) && Intrinsics.areEqual(this.extra, eventData.extra);
    }

    @NotNull
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.time) * 31) + this.key.hashCode()) * 31) + this.value.hashCode()) * 31) + this.extra.hashCode();
    }

    public final void setExtra(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extra = str;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "EventData(time=" + this.time + ", key=" + this.key + ", value=" + this.value + ", extra=" + this.extra + ")";
    }

    public EventData(int i, @NotNull String key, @NotNull String value, @NotNull String extra) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.time = i;
        this.key = key;
        this.value = value;
        this.extra = extra;
    }

    public /* synthetic */ EventData(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? (int) (System.currentTimeMillis() / ((long) 1000)) : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}

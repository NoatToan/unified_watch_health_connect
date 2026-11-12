package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0007HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/MiWearDeviceOtherEvent;", "", "name", "", "timestamp", "", "duration_sec", "", "miwear_5", "miwear_6", "miwear_7", "miwear_8", "miwear_9", "miwear_10", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getDuration_sec", "()I", "setDuration_sec", "(I)V", "getMiwear_5", "setMiwear_5", "getMiwear_6", "setMiwear_6", "getMiwear_7", "setMiwear_7", "getMiwear_8", "setMiwear_8", "getMiwear_9", "setMiwear_9", "getMiwear_10", "setMiwear_10", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MiWearDeviceOtherEvent {

    @SerializedName("duration_sec")
    private int duration_sec;

    @SerializedName("miwear_10")
    @NotNull
    private String miwear_10;

    @SerializedName("miwear_5")
    @NotNull
    private String miwear_5;

    @SerializedName("miwear_6")
    @NotNull
    private String miwear_6;

    @SerializedName("miwear_7")
    @NotNull
    private String miwear_7;

    @SerializedName("miwear_8")
    @NotNull
    private String miwear_8;

    @SerializedName("miwear_9")
    @NotNull
    private String miwear_9;

    @SerializedName("name")
    @NotNull
    private String name;

    @SerializedName("timestamp")
    private long timestamp;

    public MiWearDeviceOtherEvent(@NotNull String name, long j, int i, @NotNull String miwear_5, @NotNull String miwear_6, @NotNull String miwear_7, @NotNull String miwear_8, @NotNull String miwear_9, @NotNull String miwear_10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(miwear_5, "miwear_5");
        Intrinsics.checkNotNullParameter(miwear_6, "miwear_6");
        Intrinsics.checkNotNullParameter(miwear_7, "miwear_7");
        Intrinsics.checkNotNullParameter(miwear_8, "miwear_8");
        Intrinsics.checkNotNullParameter(miwear_9, "miwear_9");
        Intrinsics.checkNotNullParameter(miwear_10, "miwear_10");
        this.name = name;
        this.timestamp = j;
        this.duration_sec = i;
        this.miwear_5 = miwear_5;
        this.miwear_6 = miwear_6;
        this.miwear_7 = miwear_7;
        this.miwear_8 = miwear_8;
        this.miwear_9 = miwear_9;
        this.miwear_10 = miwear_10;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration_sec() {
        return this.duration_sec;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMiwear_5() {
        return this.miwear_5;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMiwear_6() {
        return this.miwear_6;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMiwear_7() {
        return this.miwear_7;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMiwear_8() {
        return this.miwear_8;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMiwear_9() {
        return this.miwear_9;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMiwear_10() {
        return this.miwear_10;
    }

    @NotNull
    public final MiWearDeviceOtherEvent copy(@NotNull String name, long timestamp, int duration_sec, @NotNull String miwear_5, @NotNull String miwear_6, @NotNull String miwear_7, @NotNull String miwear_8, @NotNull String miwear_9, @NotNull String miwear_10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(miwear_5, "miwear_5");
        Intrinsics.checkNotNullParameter(miwear_6, "miwear_6");
        Intrinsics.checkNotNullParameter(miwear_7, "miwear_7");
        Intrinsics.checkNotNullParameter(miwear_8, "miwear_8");
        Intrinsics.checkNotNullParameter(miwear_9, "miwear_9");
        Intrinsics.checkNotNullParameter(miwear_10, "miwear_10");
        return new MiWearDeviceOtherEvent(name, timestamp, duration_sec, miwear_5, miwear_6, miwear_7, miwear_8, miwear_9, miwear_10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiWearDeviceOtherEvent)) {
            return false;
        }
        MiWearDeviceOtherEvent miWearDeviceOtherEvent = (MiWearDeviceOtherEvent) other;
        return Intrinsics.areEqual(this.name, miWearDeviceOtherEvent.name) && this.timestamp == miWearDeviceOtherEvent.timestamp && this.duration_sec == miWearDeviceOtherEvent.duration_sec && Intrinsics.areEqual(this.miwear_5, miWearDeviceOtherEvent.miwear_5) && Intrinsics.areEqual(this.miwear_6, miWearDeviceOtherEvent.miwear_6) && Intrinsics.areEqual(this.miwear_7, miWearDeviceOtherEvent.miwear_7) && Intrinsics.areEqual(this.miwear_8, miWearDeviceOtherEvent.miwear_8) && Intrinsics.areEqual(this.miwear_9, miWearDeviceOtherEvent.miwear_9) && Intrinsics.areEqual(this.miwear_10, miWearDeviceOtherEvent.miwear_10);
    }

    public final int getDuration_sec() {
        return this.duration_sec;
    }

    @NotNull
    public final String getMiwear_10() {
        return this.miwear_10;
    }

    @NotNull
    public final String getMiwear_5() {
        return this.miwear_5;
    }

    @NotNull
    public final String getMiwear_6() {
        return this.miwear_6;
    }

    @NotNull
    public final String getMiwear_7() {
        return this.miwear_7;
    }

    @NotNull
    public final String getMiwear_8() {
        return this.miwear_8;
    }

    @NotNull
    public final String getMiwear_9() {
        return this.miwear_9;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.duration_sec)) * 31) + this.miwear_5.hashCode()) * 31) + this.miwear_6.hashCode()) * 31) + this.miwear_7.hashCode()) * 31) + this.miwear_8.hashCode()) * 31) + this.miwear_9.hashCode()) * 31) + this.miwear_10.hashCode();
    }

    public final void setDuration_sec(int i) {
        this.duration_sec = i;
    }

    public final void setMiwear_10(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_10 = str;
    }

    public final void setMiwear_5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_5 = str;
    }

    public final void setMiwear_6(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_6 = str;
    }

    public final void setMiwear_7(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_7 = str;
    }

    public final void setMiwear_8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_8 = str;
    }

    public final void setMiwear_9(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.miwear_9 = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @NotNull
    public String toString() {
        return "MiWearDeviceOtherEvent(name=" + this.name + ", timestamp=" + this.timestamp + ", duration_sec=" + this.duration_sec + ", miwear_5=" + this.miwear_5 + ", miwear_6=" + this.miwear_6 + ", miwear_7=" + this.miwear_7 + ", miwear_8=" + this.miwear_8 + ", miwear_9=" + this.miwear_9 + ", miwear_10=" + this.miwear_10 + ")";
    }

    public /* synthetic */ MiWearDeviceOtherEvent(String str, long j, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i, (i2 & 8) != 0 ? "none" : str2, (i2 & 16) != 0 ? "none" : str3, (i2 & 32) != 0 ? "none" : str4, (i2 & 64) != 0 ? "none" : str5, (i2 & 128) != 0 ? "none" : str6, (i2 & 256) != 0 ? "none" : str7);
    }
}

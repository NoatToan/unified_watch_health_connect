package com.xiaomi.hm.health.device.setting.network.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "dateDisStyle", "timeFormat", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/hm/health/device/setting/network/bean/General;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDateDisStyle", "()Ljava/lang/String;", "setDateDisStyle", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "getTimeFormat", "setTimeFormat", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class General {
    public static final int TIME_FORMAT_12_HOUR = 0;
    public static final int TIME_FORMAT_24_HOUR = 1;
    public static final int TIME_FORMAT_FOLLOW_PHONE = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("dateDisStyle")
    @Nullable
    private String dateDisStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("timeFormat")
    @Nullable
    private Integer timeFormat;

    /* JADX WARN: Multi-variable type inference failed */
    public General() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public General(@Nullable String str, @Nullable Integer num) {
        this.dateDisStyle = str;
        this.timeFormat = num;
    }

    public static /* synthetic */ General copy$default(General general, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = general.dateDisStyle;
        }
        if ((i & 2) != 0) {
            num = general.timeFormat;
        }
        return general.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDateDisStyle() {
        return this.dateDisStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeFormat() {
        return this.timeFormat;
    }

    @NotNull
    public final General copy(@Nullable String dateDisStyle, @Nullable Integer timeFormat) {
        return new General(dateDisStyle, timeFormat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof General)) {
            return false;
        }
        General general = (General) other;
        return Intrinsics.areEqual(this.dateDisStyle, general.dateDisStyle) && Intrinsics.areEqual(this.timeFormat, general.timeFormat);
    }

    @Nullable
    public final String getDateDisStyle() {
        return this.dateDisStyle;
    }

    @Nullable
    public final Integer getTimeFormat() {
        return this.timeFormat;
    }

    public int hashCode() {
        String str = this.dateDisStyle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.timeFormat;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setDateDisStyle(@Nullable String str) {
        this.dateDisStyle = str;
    }

    public final void setTimeFormat(@Nullable Integer num) {
        this.timeFormat = num;
    }

    @NotNull
    public String toString() {
        return "General(dateDisStyle=" + this.dateDisStyle + ", timeFormat=" + this.timeFormat + ")";
    }

    public /* synthetic */ General(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}

package com.huami.worldclock.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0001?BW\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0004HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0019\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010)\u001a\u0004\b\u001a\u0010+\"\u0004\b<\u0010-¨\u0006@"}, d2 = {"Lcom/huami/worldclock/bean/WorldClockBean;", "Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "cityCN", "city", "mainCity", "identifier", "cityCode", "daylightState", "offsetTransitionDateTime", "isShow", "copy", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "Ljava/lang/String;", "getCityCN", "()Ljava/lang/String;", "setCityCN", "(Ljava/lang/String;)V", "getCity", "setCity", "Z", "getMainCity", "()Z", "setMainCity", "(Z)V", "getIdentifier", "setIdentifier", "getCityCode", "setCityCode", LogUtil.I, "getDaylightState", "()I", "setDaylightState", "(I)V", "J", "getOffsetTransitionDateTime", "()J", "setOffsetTransitionDateTime", "(J)V", "setShow", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IJZ)V", "Companion", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WorldClockBean implements Parcelable {
    public static final int INVALID_INDEX = 255;

    @NotNull
    private String city;

    @NotNull
    private String cityCN;

    @NotNull
    private String cityCode;
    private int daylightState;

    @NotNull
    private String identifier;
    private boolean isShow;
    private boolean mainCity;
    private long offsetTransitionDateTime;

    @NotNull
    public static final Parcelable.Creator<WorldClockBean> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<WorldClockBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WorldClockBean createFromParcel(@NotNull Parcel parcel) {
            return new WorldClockBean(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WorldClockBean[] newArray(int i) {
            return new WorldClockBean[i];
        }
    }

    public WorldClockBean() {
        this(null, null, false, null, null, 0, 0L, false, 255, null);
    }

    public WorldClockBean(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, int i, long j, boolean z2) {
        this.cityCN = str;
        this.city = str2;
        this.mainCity = z;
        this.identifier = str3;
        this.cityCode = str4;
        this.daylightState = i;
        this.offsetTransitionDateTime = j;
        this.isShow = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCityCN() {
        return this.cityCN;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMainCity() {
        return this.mainCity;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCityCode() {
        return this.cityCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDaylightState() {
        return this.daylightState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getOffsetTransitionDateTime() {
        return this.offsetTransitionDateTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public final WorldClockBean copy(@NotNull String cityCN, @NotNull String city, boolean mainCity, @NotNull String identifier, @NotNull String cityCode, int daylightState, long offsetTransitionDateTime, boolean isShow) {
        return new WorldClockBean(cityCN, city, mainCity, identifier, cityCode, daylightState, offsetTransitionDateTime, isShow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldClockBean)) {
            return false;
        }
        WorldClockBean worldClockBean = (WorldClockBean) other;
        return Intrinsics.areEqual(this.cityCode, worldClockBean.cityCode) && Intrinsics.areEqual(this.identifier, worldClockBean.identifier);
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCityCN() {
        return this.cityCN;
    }

    @NotNull
    public final String getCityCode() {
        return this.cityCode;
    }

    public final int getDaylightState() {
        return this.daylightState;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean getMainCity() {
        return this.mainCity;
    }

    public final long getOffsetTransitionDateTime() {
        return this.offsetTransitionDateTime;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setCity(@NotNull String str) {
        this.city = str;
    }

    public final void setCityCN(@NotNull String str) {
        this.cityCN = str;
    }

    public final void setCityCode(@NotNull String str) {
        this.cityCode = str;
    }

    public final void setDaylightState(int i) {
        this.daylightState = i;
    }

    public final void setIdentifier(@NotNull String str) {
        this.identifier = str;
    }

    public final void setMainCity(boolean z) {
        this.mainCity = z;
    }

    public final void setOffsetTransitionDateTime(long j) {
        this.offsetTransitionDateTime = j;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    @NotNull
    public String toString() {
        return "cityCN:" + this.cityCN + ",city:" + this.cityCN + ",mainCity:" + this.mainCity + ",identifier:" + this.identifier + ",cityCode:" + this.cityCode + ",daylightState:" + this.daylightState + ",offsetTransitionDateTime:" + this.offsetTransitionDateTime;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.cityCN);
        parcel.writeString(this.city);
        parcel.writeInt(this.mainCity ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeString(this.cityCode);
        parcel.writeInt(this.daylightState);
        parcel.writeLong(this.offsetTransitionDateTime);
        parcel.writeInt(this.isShow ? 1 : 0);
    }

    public /* synthetic */ WorldClockBean(String str, String str2, boolean z, String str3, String str4, int i, long j, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "", (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? 0L : j, (i2 & 128) == 0 ? z2 : true);
    }
}

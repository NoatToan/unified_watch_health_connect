package com.huami.sky.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/sky/service/SkyUpdateShowInfo;", "Landroid/os/Parcelable;", "", "component1", "", "component2", ParamKey.createTime, "label", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "J", "getCreateTime", "()J", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyUpdateShowInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SkyUpdateShowInfo> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long createTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String label;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<SkyUpdateShowInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SkyUpdateShowInfo createFromParcel(@NotNull Parcel parcel) {
            return new SkyUpdateShowInfo(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SkyUpdateShowInfo[] newArray(int i) {
            return new SkyUpdateShowInfo[i];
        }
    }

    public SkyUpdateShowInfo(long j, @NotNull String str) {
        this.createTime = j;
        this.label = str;
    }

    public static /* synthetic */ SkyUpdateShowInfo copy$default(SkyUpdateShowInfo skyUpdateShowInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = skyUpdateShowInfo.createTime;
        }
        if ((i & 2) != 0) {
            str = skyUpdateShowInfo.label;
        }
        return skyUpdateShowInfo.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final SkyUpdateShowInfo copy(long createTime, @NotNull String label) {
        return new SkyUpdateShowInfo(createTime, label);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkyUpdateShowInfo)) {
            return false;
        }
        SkyUpdateShowInfo skyUpdateShowInfo = (SkyUpdateShowInfo) other;
        return this.createTime == skyUpdateShowInfo.createTime && Intrinsics.areEqual(this.label, skyUpdateShowInfo.label);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (b.a(this.createTime) * 31) + this.label.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkyUpdateShowInfo(createTime=" + this.createTime + ", label=" + this.label + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeLong(this.createTime);
        parcel.writeString(this.label);
    }

    public /* synthetic */ SkyUpdateShowInfo(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str);
    }
}

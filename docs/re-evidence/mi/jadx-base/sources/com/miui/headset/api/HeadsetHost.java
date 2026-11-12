package com.miui.headset.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, d2 = {"Lcom/miui/headset/api/HeadsetHost;", "Landroid/os/Parcelable;", "hostId", "", "headsetInfo", "Lcom/miui/headset/api/HeadsetInfo;", "name", "extra", "Landroid/os/Bundle;", "(Ljava/lang/String;Lcom/miui/headset/api/HeadsetInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "getExtra", "()Landroid/os/Bundle;", "getHeadsetInfo", "()Lcom/miui/headset/api/HeadsetInfo;", "getHostId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HeadsetHost implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeadsetHost> CREATOR = new Creator();

    @NotNull
    private final Bundle extra;

    @Nullable
    private final HeadsetInfo headsetInfo;

    @NotNull
    private final String hostId;

    @Nullable
    private final String name;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeadsetHost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeadsetHost createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeadsetHost(parcel.readString(), parcel.readInt() == 0 ? null : HeadsetInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readBundle(HeadsetHost.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeadsetHost[] newArray(int i) {
            return new HeadsetHost[i];
        }
    }

    public HeadsetHost(@NotNull String hostId, @Nullable HeadsetInfo headsetInfo, @Nullable String str, @NotNull Bundle extra) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.hostId = hostId;
        this.headsetInfo = headsetInfo;
        this.name = str;
        this.extra = extra;
    }

    public static /* synthetic */ HeadsetHost copy$default(HeadsetHost headsetHost, String str, HeadsetInfo headsetInfo, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headsetHost.hostId;
        }
        if ((i & 2) != 0) {
            headsetInfo = headsetHost.headsetInfo;
        }
        if ((i & 4) != 0) {
            str2 = headsetHost.name;
        }
        if ((i & 8) != 0) {
            bundle = headsetHost.extra;
        }
        return headsetHost.copy(str, headsetInfo, str2, bundle);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHostId() {
        return this.hostId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeadsetInfo getHeadsetInfo() {
        return this.headsetInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Bundle getExtra() {
        return this.extra;
    }

    @NotNull
    public final HeadsetHost copy(@NotNull String hostId, @Nullable HeadsetInfo headsetInfo, @Nullable String name, @NotNull Bundle extra) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        Intrinsics.checkNotNullParameter(extra, "extra");
        return new HeadsetHost(hostId, headsetInfo, name, extra);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetHost)) {
            return false;
        }
        HeadsetHost headsetHost = (HeadsetHost) other;
        return Intrinsics.areEqual(this.hostId, headsetHost.hostId) && Intrinsics.areEqual(this.headsetInfo, headsetHost.headsetInfo) && Intrinsics.areEqual(this.name, headsetHost.name) && Intrinsics.areEqual(this.extra, headsetHost.extra);
    }

    @NotNull
    public final Bundle getExtra() {
        return this.extra;
    }

    @Nullable
    public final HeadsetInfo getHeadsetInfo() {
        return this.headsetInfo;
    }

    @NotNull
    public final String getHostId() {
        return this.hostId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.hostId.hashCode() * 31;
        HeadsetInfo headsetInfo = this.headsetInfo;
        int iHashCode2 = (iHashCode + (headsetInfo == null ? 0 : headsetInfo.hashCode())) * 31;
        String str = this.name;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.extra.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeadsetHost(hostId=" + this.hostId + ", headsetInfo=" + this.headsetInfo + ", name=" + this.name + ", extra=" + this.extra + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.hostId);
        HeadsetInfo headsetInfo = this.headsetInfo;
        if (headsetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headsetInfo.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.name);
        parcel.writeBundle(this.extra);
    }

    public /* synthetic */ HeadsetHost(String str, HeadsetInfo headsetInfo, String str2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : headsetInfo, (i & 4) != 0 ? null : str2, bundle);
    }
}

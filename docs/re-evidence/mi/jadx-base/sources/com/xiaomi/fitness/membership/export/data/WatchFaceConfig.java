package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/WatchFaceConfig;", "Landroid/os/Parcelable;", "marquee", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMarquee", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchFaceConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WatchFaceConfig> CREATOR = new Creator();

    @Nullable
    private final String marquee;

    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WatchFaceConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchFaceConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchFaceConfig(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchFaceConfig[] newArray(int i) {
            return new WatchFaceConfig[i];
        }
    }

    public WatchFaceConfig(@Nullable String str, @Nullable String str2) {
        this.marquee = str;
        this.title = str2;
    }

    public static /* synthetic */ WatchFaceConfig copy$default(WatchFaceConfig watchFaceConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchFaceConfig.marquee;
        }
        if ((i & 2) != 0) {
            str2 = watchFaceConfig.title;
        }
        return watchFaceConfig.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarquee() {
        return this.marquee;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final WatchFaceConfig copy(@Nullable String marquee, @Nullable String title) {
        return new WatchFaceConfig(marquee, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceConfig)) {
            return false;
        }
        WatchFaceConfig watchFaceConfig = (WatchFaceConfig) other;
        return Intrinsics.areEqual(this.marquee, watchFaceConfig.marquee) && Intrinsics.areEqual(this.title, watchFaceConfig.title);
    }

    @Nullable
    public final String getMarquee() {
        return this.marquee;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.marquee;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WatchFaceConfig(marquee=" + this.marquee + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.marquee);
        dest.writeString(this.title);
    }
}

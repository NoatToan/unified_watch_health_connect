package com.huami.userproperty.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/userproperty/entity/FetchedRangeKey;", "Landroid/os/Parcelable;", "", "component1", "component2", "rangeKey", "api", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getRangeKey", "()Ljava/lang/String;", "b", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FetchedRangeKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FetchedRangeKey> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String rangeKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String api;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<FetchedRangeKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FetchedRangeKey createFromParcel(@NotNull Parcel parcel) {
            return new FetchedRangeKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final FetchedRangeKey[] newArray(int i) {
            return new FetchedRangeKey[i];
        }
    }

    public FetchedRangeKey(@NotNull String str, @Nullable String str2) {
        this.rangeKey = str;
        this.api = str2;
    }

    public static /* synthetic */ FetchedRangeKey copy$default(FetchedRangeKey fetchedRangeKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchedRangeKey.rangeKey;
        }
        if ((i & 2) != 0) {
            str2 = fetchedRangeKey.api;
        }
        return fetchedRangeKey.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRangeKey() {
        return this.rangeKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final FetchedRangeKey copy(@NotNull String rangeKey, @Nullable String api) {
        return new FetchedRangeKey(rangeKey, api);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchedRangeKey)) {
            return false;
        }
        FetchedRangeKey fetchedRangeKey = (FetchedRangeKey) other;
        return Intrinsics.areEqual(this.rangeKey, fetchedRangeKey.rangeKey) && Intrinsics.areEqual(this.api, fetchedRangeKey.api);
    }

    @Nullable
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getRangeKey() {
        return this.rangeKey;
    }

    public int hashCode() {
        int iHashCode = this.rangeKey.hashCode() * 31;
        String str = this.api;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FetchedRangeKey(rangeKey=" + this.rangeKey + ", api=" + ((Object) this.api) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.rangeKey);
        parcel.writeString(this.api);
    }

    public /* synthetic */ FetchedRangeKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

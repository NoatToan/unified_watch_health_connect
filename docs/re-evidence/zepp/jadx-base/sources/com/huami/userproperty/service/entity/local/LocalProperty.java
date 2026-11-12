package com.huami.userproperty.service.entity.local;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J5\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006$"}, d2 = {"Lcom/huami/userproperty/service/entity/local/LocalProperty;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "key", "value", "updateAt", "api", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "J", "getUpdateAt", "()J", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LocalProperty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocalProperty> CREATOR = new Creator();

    @Nullable
    private final String api;

    @NotNull
    private final String key;
    private final long updateAt;

    @Nullable
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LocalProperty> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocalProperty createFromParcel(@NotNull Parcel parcel) {
            return new LocalProperty(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LocalProperty[] newArray(int i) {
            return new LocalProperty[i];
        }
    }

    public LocalProperty(@NotNull String str, @Nullable String str2, long j, @Nullable String str3) {
        this.key = str;
        this.value = str2;
        this.updateAt = j;
        this.api = str3;
    }

    public static /* synthetic */ LocalProperty copy$default(LocalProperty localProperty, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localProperty.key;
        }
        if ((i & 2) != 0) {
            str2 = localProperty.value;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = localProperty.updateAt;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = localProperty.api;
        }
        return localProperty.copy(str, str4, j2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateAt() {
        return this.updateAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final LocalProperty copy(@NotNull String key, @Nullable String value, long updateAt, @Nullable String api) {
        return new LocalProperty(key, value, updateAt, api);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalProperty)) {
            return false;
        }
        LocalProperty localProperty = (LocalProperty) other;
        return Intrinsics.areEqual(this.key, localProperty.key) && Intrinsics.areEqual(this.value, localProperty.value) && this.updateAt == localProperty.updateAt && Intrinsics.areEqual(this.api, localProperty.api);
    }

    @Nullable
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getUpdateAt() {
        return this.updateAt;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + b.a(this.updateAt)) * 31;
        String str2 = this.api;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LocalProperty(key=" + this.key + ", value=" + ((Object) this.value) + ", updateAt=" + this.updateAt + ", api=" + ((Object) this.api) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeLong(this.updateAt);
        parcel.writeString(this.api);
    }

    public /* synthetic */ LocalProperty(String str, String str2, long j, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i & 8) != 0 ? null : str3);
    }
}

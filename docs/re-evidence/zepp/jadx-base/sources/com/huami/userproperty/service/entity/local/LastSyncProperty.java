package com.huami.userproperty.service.entity.local;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/userproperty/service/entity/local/LastSyncProperty;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "key", "value", "api", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "getApi", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LastSyncProperty implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LastSyncProperty> CREATOR = new Creator();

    @Nullable
    private final String api;

    @NotNull
    private final String key;

    @Nullable
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<LastSyncProperty> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LastSyncProperty createFromParcel(@NotNull Parcel parcel) {
            return new LastSyncProperty(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LastSyncProperty[] newArray(int i) {
            return new LastSyncProperty[i];
        }
    }

    public LastSyncProperty(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.key = str;
        this.value = str2;
        this.api = str3;
    }

    public static /* synthetic */ LastSyncProperty copy$default(LastSyncProperty lastSyncProperty, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastSyncProperty.key;
        }
        if ((i & 2) != 0) {
            str2 = lastSyncProperty.value;
        }
        if ((i & 4) != 0) {
            str3 = lastSyncProperty.api;
        }
        return lastSyncProperty.copy(str, str2, str3);
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final LastSyncProperty copy(@NotNull String key, @Nullable String value, @Nullable String api) {
        return new LastSyncProperty(key, value, api);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSyncProperty)) {
            return false;
        }
        LastSyncProperty lastSyncProperty = (LastSyncProperty) other;
        return Intrinsics.areEqual(this.key, lastSyncProperty.key) && Intrinsics.areEqual(this.value, lastSyncProperty.value) && Intrinsics.areEqual(this.api, lastSyncProperty.api);
    }

    @Nullable
    public final String getApi() {
        return this.api;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.api;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LastSyncProperty(key=" + this.key + ", value=" + ((Object) this.value) + ", api=" + ((Object) this.api) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
        parcel.writeString(this.api);
    }

    public /* synthetic */ LastSyncProperty(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}

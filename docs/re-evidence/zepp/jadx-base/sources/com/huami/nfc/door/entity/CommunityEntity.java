package com.huami.nfc.door.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/nfc/door/entity/CommunityEntity;", "Landroid/os/Parcelable;", "", "component1", "component2", "card_type", "name", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getCard_type", "()Ljava/lang/String;", "b", "getName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommunityEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommunityEntity> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("card_type")
    @NotNull
    private final String card_type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<CommunityEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CommunityEntity createFromParcel(@NotNull Parcel parcel) {
            return new CommunityEntity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CommunityEntity[] newArray(int i) {
            return new CommunityEntity[i];
        }
    }

    public CommunityEntity(@NotNull String str, @NotNull String str2) {
        this.card_type = str;
        this.name = str2;
    }

    public static /* synthetic */ CommunityEntity copy$default(CommunityEntity communityEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communityEntity.card_type;
        }
        if ((i & 2) != 0) {
            str2 = communityEntity.name;
        }
        return communityEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCard_type() {
        return this.card_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CommunityEntity copy(@NotNull String card_type, @NotNull String name) {
        return new CommunityEntity(card_type, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityEntity)) {
            return false;
        }
        CommunityEntity communityEntity = (CommunityEntity) other;
        return Intrinsics.areEqual(this.card_type, communityEntity.card_type) && Intrinsics.areEqual(this.name, communityEntity.name);
    }

    @NotNull
    public final String getCard_type() {
        return this.card_type;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.card_type.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "CommunityEntity(card_type=" + this.card_type + ", name=" + this.name + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.card_type);
        parcel.writeString(this.name);
    }
}

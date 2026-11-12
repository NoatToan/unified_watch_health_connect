package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0006\u0010+\u001a\u00020\u0006J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/Membership;", "Landroid/os/Parcelable;", "id", "", "name", "days", "", Constants.KEY_PRICE, "description", "spuId", "spuVersion", "subscription", "", "appleProductId", "promotion", "Lcom/xiaomi/fitness/membership/export/data/Promotion;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Lcom/xiaomi/fitness/membership/export/data/Promotion;)V", "getId", "()Ljava/lang/String;", "getName", "getDays", "()I", "getPrice", "getDescription", "getSpuId", "getSpuVersion", "getSubscription", "()Z", "getAppleProductId", "getPromotion", "()Lcom/xiaomi/fitness/membership/export/data/Promotion;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Membership implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Membership> CREATOR = new Creator();

    @SerializedName("apple_product_id")
    @Nullable
    private final String appleProductId;
    private final int days;

    @Nullable
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final String name;
    private final int price;

    @Nullable
    private final Promotion promotion;

    @SerializedName("spu_id")
    @Nullable
    private final String spuId;

    @SerializedName("spu_ver")
    private final int spuVersion;
    private final boolean subscription;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Membership> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Membership createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Membership(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Promotion.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Membership[] newArray(int i) {
            return new Membership[i];
        }
    }

    public Membership(@NotNull String id, @NotNull String name, int i, int i2, @Nullable String str, @Nullable String str2, int i3, boolean z, @Nullable String str3, @Nullable Promotion promotion) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.days = i;
        this.price = i2;
        this.description = str;
        this.spuId = str2;
        this.spuVersion = i3;
        this.subscription = z;
        this.appleProductId = str3;
        this.promotion = promotion;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Promotion getPromotion() {
        return this.promotion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpuId() {
        return this.spuId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSpuVersion() {
        return this.spuVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSubscription() {
        return this.subscription;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppleProductId() {
        return this.appleProductId;
    }

    @NotNull
    public final Membership copy(@NotNull String id, @NotNull String name, int days, int price, @Nullable String description, @Nullable String spuId, int spuVersion, boolean subscription, @Nullable String appleProductId, @Nullable Promotion promotion) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Membership(id, name, days, price, description, spuId, spuVersion, subscription, appleProductId, promotion);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Membership)) {
            return false;
        }
        Membership membership = (Membership) other;
        return Intrinsics.areEqual(this.id, membership.id) && Intrinsics.areEqual(this.name, membership.name) && this.days == membership.days && this.price == membership.price && Intrinsics.areEqual(this.description, membership.description) && Intrinsics.areEqual(this.spuId, membership.spuId) && this.spuVersion == membership.spuVersion && this.subscription == membership.subscription && Intrinsics.areEqual(this.appleProductId, membership.appleProductId) && Intrinsics.areEqual(this.promotion, membership.promotion);
    }

    @Nullable
    public final String getAppleProductId() {
        return this.appleProductId;
    }

    public final int getDays() {
        return this.days;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPrice() {
        return this.price;
    }

    @Nullable
    public final Promotion getPromotion() {
        return this.promotion;
    }

    @Nullable
    public final String getSpuId() {
        return this.spuId;
    }

    public final int getSpuVersion() {
        return this.spuVersion;
    }

    public final boolean getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.days)) * 31) + Integer.hashCode(this.price)) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spuId;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.spuVersion)) * 31) + Boolean.hashCode(this.subscription)) * 31;
        String str3 = this.appleProductId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Promotion promotion = this.promotion;
        return iHashCode4 + (promotion != null ? promotion.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Membership(id=" + this.id + ", name=" + this.name + ", days=" + this.days + ", price=" + this.price + ", description=" + this.description + ", spuId=" + this.spuId + ", spuVersion=" + this.spuVersion + ", subscription=" + this.subscription + ", appleProductId=" + this.appleProductId + ", promotion=" + this.promotion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.days);
        dest.writeInt(this.price);
        dest.writeString(this.description);
        dest.writeString(this.spuId);
        dest.writeInt(this.spuVersion);
        dest.writeInt(this.subscription ? 1 : 0);
        dest.writeString(this.appleProductId);
        Promotion promotion = this.promotion;
        if (promotion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            promotion.writeToParcel(dest, flags);
        }
    }
}

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010#\u001a\u00020\u0003J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/Promotion;", "Landroid/os/Parcelable;", "id", "", "tagline", "", "icon", "slogan", "downcount", "", Constants.KEY_PRICE, "endAt", "appleProductId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;)V", "getId", "()I", "getTagline", "()Ljava/lang/String;", "getIcon", "getSlogan", "getDowncount", "()Z", "getPrice", "getEndAt", "getAppleProductId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Promotion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Promotion> CREATOR = new Creator();

    @SerializedName("apple_product_id")
    @Nullable
    private final String appleProductId;
    private final boolean downcount;

    @SerializedName("end_at")
    private final int endAt;

    @Nullable
    private final String icon;
    private final int id;
    private final int price;

    @Nullable
    private final String slogan;

    @Nullable
    private final String tagline;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Promotion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Promotion createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Promotion(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Promotion[] newArray(int i) {
            return new Promotion[i];
        }
    }

    public Promotion(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2, int i3, @Nullable String str4) {
        this.id = i;
        this.tagline = str;
        this.icon = str2;
        this.slogan = str3;
        this.downcount = z;
        this.price = i2;
        this.endAt = i3;
        this.appleProductId = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagline() {
        return this.tagline;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSlogan() {
        return this.slogan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDowncount() {
        return this.downcount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getEndAt() {
        return this.endAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppleProductId() {
        return this.appleProductId;
    }

    @NotNull
    public final Promotion copy(int id, @Nullable String tagline, @Nullable String icon, @Nullable String slogan, boolean downcount, int price, int endAt, @Nullable String appleProductId) {
        return new Promotion(id, tagline, icon, slogan, downcount, price, endAt, appleProductId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return this.id == promotion.id && Intrinsics.areEqual(this.tagline, promotion.tagline) && Intrinsics.areEqual(this.icon, promotion.icon) && Intrinsics.areEqual(this.slogan, promotion.slogan) && this.downcount == promotion.downcount && this.price == promotion.price && this.endAt == promotion.endAt && Intrinsics.areEqual(this.appleProductId, promotion.appleProductId);
    }

    @Nullable
    public final String getAppleProductId() {
        return this.appleProductId;
    }

    public final boolean getDowncount() {
        return this.downcount;
    }

    public final int getEndAt() {
        return this.endAt;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSlogan() {
        return this.slogan;
    }

    @Nullable
    public final String getTagline() {
        return this.tagline;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.tagline;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slogan;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.downcount)) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.endAt)) * 31;
        String str4 = this.appleProductId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Promotion(id=" + this.id + ", tagline=" + this.tagline + ", icon=" + this.icon + ", slogan=" + this.slogan + ", downcount=" + this.downcount + ", price=" + this.price + ", endAt=" + this.endAt + ", appleProductId=" + this.appleProductId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.tagline);
        dest.writeString(this.icon);
        dest.writeString(this.slogan);
        dest.writeInt(this.downcount ? 1 : 0);
        dest.writeInt(this.price);
        dest.writeInt(this.endAt);
        dest.writeString(this.appleProductId);
    }
}

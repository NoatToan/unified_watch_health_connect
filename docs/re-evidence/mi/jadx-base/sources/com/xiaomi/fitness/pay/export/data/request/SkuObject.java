package com.xiaomi.fitness.pay.export.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J|\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "Landroid/os/Parcelable;", "spu_id", "", "spu_version", "", OneTrack.Param.SKU_ID, Constants.KEY_PRICE, "", "quantity", "sku_name", "pic_url", "product_category", "product_type", IssuerActivity.KEY_PRODUCT_ID, "<init>", "(Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSpu_id", "()Ljava/lang/String;", "getSpu_version", "()I", "getSku_id", "getPrice", "()J", "getQuantity", "getSku_name", "getPic_url", "getProduct_category", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProduct_type", "getProduct_id", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SkuObject implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String pic_url;
    private final long price;

    @Nullable
    private final Integer product_category;

    @Nullable
    private final String product_id;

    @Nullable
    private final String product_type;
    private final long quantity;

    @NotNull
    private final String sku_id;

    @Nullable
    private final String sku_name;

    @NotNull
    private final String spu_id;
    private final int spu_version;

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.export.data.request.SkuObject$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/SkuObject$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/pay/export/data/request/SkuObject;", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SkuObject> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SkuObject createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SkuObject(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SkuObject[] newArray(int size) {
            return new SkuObject[size];
        }
    }

    public SkuObject(@NotNull String spu_id, int i, @NotNull String sku_id, long j, long j2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(spu_id, "spu_id");
        Intrinsics.checkNotNullParameter(sku_id, "sku_id");
        this.spu_id = spu_id;
        this.spu_version = i;
        this.sku_id = sku_id;
        this.price = j;
        this.quantity = j2;
        this.sku_name = str;
        this.pic_url = str2;
        this.product_category = num;
        this.product_type = str3;
        this.product_id = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpu_id() {
        return this.spu_id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProduct_id() {
        return this.product_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSpu_version() {
        return this.spu_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSku_id() {
        return this.sku_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSku_name() {
        return this.sku_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPic_url() {
        return this.pic_url;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getProduct_category() {
        return this.product_category;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProduct_type() {
        return this.product_type;
    }

    @NotNull
    public final SkuObject copy(@NotNull String spu_id, int spu_version, @NotNull String sku_id, long price, long quantity, @Nullable String sku_name, @Nullable String pic_url, @Nullable Integer product_category, @Nullable String product_type, @Nullable String product_id) {
        Intrinsics.checkNotNullParameter(spu_id, "spu_id");
        Intrinsics.checkNotNullParameter(sku_id, "sku_id");
        return new SkuObject(spu_id, spu_version, sku_id, price, quantity, sku_name, pic_url, product_category, product_type, product_id);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuObject)) {
            return false;
        }
        SkuObject skuObject = (SkuObject) other;
        return Intrinsics.areEqual(this.spu_id, skuObject.spu_id) && this.spu_version == skuObject.spu_version && Intrinsics.areEqual(this.sku_id, skuObject.sku_id) && this.price == skuObject.price && this.quantity == skuObject.quantity && Intrinsics.areEqual(this.sku_name, skuObject.sku_name) && Intrinsics.areEqual(this.pic_url, skuObject.pic_url) && Intrinsics.areEqual(this.product_category, skuObject.product_category) && Intrinsics.areEqual(this.product_type, skuObject.product_type) && Intrinsics.areEqual(this.product_id, skuObject.product_id);
    }

    @Nullable
    public final String getPic_url() {
        return this.pic_url;
    }

    public final long getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getProduct_category() {
        return this.product_category;
    }

    @Nullable
    public final String getProduct_id() {
        return this.product_id;
    }

    @Nullable
    public final String getProduct_type() {
        return this.product_type;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getSku_id() {
        return this.sku_id;
    }

    @Nullable
    public final String getSku_name() {
        return this.sku_name;
    }

    @NotNull
    public final String getSpu_id() {
        return this.spu_id;
    }

    public final int getSpu_version() {
        return this.spu_version;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.spu_id.hashCode() * 31) + Integer.hashCode(this.spu_version)) * 31) + this.sku_id.hashCode()) * 31) + Long.hashCode(this.price)) * 31) + Long.hashCode(this.quantity)) * 31;
        String str = this.sku_name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pic_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.product_category;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.product_type;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product_id;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SkuObject(spu_id=" + this.spu_id + ", spu_version=" + this.spu_version + ", sku_id=" + this.sku_id + ", price=" + this.price + ", quantity=" + this.quantity + ", sku_name=" + this.sku_name + ", pic_url=" + this.pic_url + ", product_category=" + this.product_category + ", product_type=" + this.product_type + ", product_id=" + this.product_id + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.spu_id);
        parcel.writeInt(this.spu_version);
        parcel.writeString(this.sku_id);
        parcel.writeLong(this.price);
        parcel.writeLong(this.quantity);
        parcel.writeString(this.sku_name);
        parcel.writeString(this.pic_url);
        Integer num = this.product_category;
        parcel.writeInt(num != null ? num.intValue() : 0);
        parcel.writeString(this.product_type);
        parcel.writeString(this.product_id);
    }

    public /* synthetic */ SkuObject(String str, int i, String str2, long j, long j2, String str3, String str4, Integer num, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, j, j2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SkuObject(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        String str = string == null ? "" : string;
        int i = parcel.readInt();
        String string2 = parcel.readString();
        this(str, i, string2 == null ? "" : string2, parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
    }
}

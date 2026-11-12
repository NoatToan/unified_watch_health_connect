package com.xiaomi.hm.health.cashier.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/cashier/model/Product;", "Landroid/os/Parcelable;", "", "component1", "", "component2", FirebaseAnalytics.Param.QUANTITY, TrainingWebConst.QueryParam.SKUID, "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", LogUtil.I, "getQuantity", "()I", "b", "Ljava/lang/String;", "getSkuId", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Product implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Product> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private final int quantity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(TrainingWebConst.QueryParam.SKUID)
    @NotNull
    private final String skuId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<Product> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Product createFromParcel(@NotNull Parcel parcel) {
            return new Product(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Product[] newArray(int i) {
            return new Product[i];
        }
    }

    public Product(int i, @NotNull String str) {
        this.quantity = i;
        this.skuId = str;
    }

    public static /* synthetic */ Product copy$default(Product product, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = product.quantity;
        }
        if ((i2 & 2) != 0) {
            str = product.skuId;
        }
        return product.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final Product copy(int quantity, @NotNull String skuId) {
        return new Product(quantity, skuId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return this.quantity == product.quantity && Intrinsics.areEqual(this.skuId, product.skuId);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return (this.quantity * 31) + this.skuId.hashCode();
    }

    @NotNull
    public String toString() {
        return "Product(quantity=" + this.quantity + ", skuId=" + this.skuId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(this.quantity);
        parcel.writeString(this.skuId);
    }
}

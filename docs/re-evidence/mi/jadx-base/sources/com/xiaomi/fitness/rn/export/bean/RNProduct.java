package com.xiaomi.fitness.rn.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.bean.Product;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNProduct;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "writeToParcel", "", "dest", "flags", "", "Companion", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNProduct extends Product {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<RNProduct> CREATOR = new Parcelable.Creator<RNProduct>() { // from class: com.xiaomi.fitness.rn.export.bean.RNProduct$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RNProduct createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RNProduct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RNProduct[] newArray(int size) {
            return new RNProduct[size];
        }
    };

    public RNProduct() {
        super(0, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Product, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RNProduct(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}

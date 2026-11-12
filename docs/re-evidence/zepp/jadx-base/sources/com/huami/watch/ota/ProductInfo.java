package com.huami.watch.ota;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class ProductInfo implements Parcelable {
    public static final Parcelable.Creator<ProductInfo> CREATOR = new a();
    private static final String a = "ProductInfo";
    public String model;
    public String url;

    public class a implements Parcelable.Creator<ProductInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProductInfo createFromParcel(Parcel parcel) {
            return new ProductInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProductInfo[] newArray(int i) {
            return new ProductInfo[i];
        }
    }

    public /* synthetic */ ProductInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dump() {
        Log.i(a, "=========ProductInfo===========", new Object[0]);
        Log.i(a, "model\t\t\t:" + this.model, new Object[0]);
        Log.i(a, "url\t\t\t:" + this.url, new Object[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.model);
        parcel.writeString(this.url);
    }

    public ProductInfo() {
    }

    private ProductInfo(Parcel parcel) {
        this.model = parcel.readString();
        this.url = parcel.readString();
    }
}

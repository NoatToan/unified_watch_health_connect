package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;

/* JADX INFO: loaded from: classes6.dex */
public class ProductDescription implements Parcelable {
    public static final Parcelable.Creator<ProductDescription> CREATOR = new Parcelable.Creator<ProductDescription>() { // from class: com.miui.tsmclient.entity.ProductDescription.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductDescription createFromParcel(Parcel parcel) {
            return new ProductDescription(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductDescription[] newArray(int i) {
            return new ProductDescription[i];
        }
    };

    @SerializedName(MiuiCursorConstants.CONTENT)
    private String mContent;

    @SerializedName("title")
    private String mTitle;

    public ProductDescription(Parcel parcel) {
        this.mTitle = parcel.readString();
        this.mContent = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mContent);
    }
}

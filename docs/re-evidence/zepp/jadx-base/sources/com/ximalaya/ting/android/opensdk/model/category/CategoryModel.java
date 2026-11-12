package com.ximalaya.ting.android.opensdk.model.category;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes22.dex */
public class CategoryModel implements Parcelable {
    public static final Parcelable.Creator<CategoryModel> CREATOR = new Parcelable.Creator<CategoryModel>() { // from class: com.ximalaya.ting.android.opensdk.model.category.CategoryModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CategoryModel createFromParcel(Parcel parcel) {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setCategoryId(parcel.readInt());
            categoryModel.setCategoryName(parcel.readString());
            return categoryModel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CategoryModel[] newArray(int i) {
            return new CategoryModel[i];
        }
    };
    private int categoryId;
    private String categoryName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.categoryId);
        parcel.writeString(this.categoryName);
    }
}

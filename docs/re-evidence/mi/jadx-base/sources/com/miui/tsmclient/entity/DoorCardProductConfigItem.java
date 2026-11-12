package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.OneTrack;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProductConfigItem implements Parcelable {
    public static final Parcelable.Creator<DoorCardProductConfigItem> CREATOR = new Parcelable.Creator<DoorCardProductConfigItem>() { // from class: com.miui.tsmclient.entity.DoorCardProductConfigItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProductConfigItem createFromParcel(Parcel parcel) {
            return new DoorCardProductConfigItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProductConfigItem[] newArray(int i) {
            return new DoorCardProductConfigItem[i];
        }
    };
    public static final int JUMP_TYPE_ACTION = 1;
    public static final int JUMP_TYPE_PHONE = 4;
    public static final int JUMP_TYPE_SCHEME = 3;
    public static final int JUMP_TYPE_WEB = 2;

    @SerializedName(MiuiCursorConstants.CONTENT)
    private String mItemContent;

    @SerializedName(OneTrack.Param.LINK)
    private String mItemLink;

    @SerializedName("linkOpenType")
    private int mItemLinkOpenType;

    @SerializedName("linkPkgName")
    private String mItemLinkPkgName;

    @SerializedName("name")
    private String mItemName;

    public DoorCardProductConfigItem(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getItemContent() {
        return this.mItemContent;
    }

    public String getItemLink() {
        return this.mItemLink;
    }

    public String getItemLinkPkgName() {
        return this.mItemLinkPkgName;
    }

    public String getItemName() {
        return this.mItemName;
    }

    public boolean isTypeOfAction() {
        return 1 == this.mItemLinkOpenType;
    }

    public boolean isTypeOfPhone() {
        return 4 == this.mItemLinkOpenType;
    }

    public boolean isTypeOfScheme() {
        return 3 == this.mItemLinkOpenType;
    }

    public boolean isTypeOfWeb() {
        return 2 == this.mItemLinkOpenType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mItemName = parcel.readString();
        this.mItemContent = parcel.readString();
        this.mItemLink = parcel.readString();
        this.mItemLinkPkgName = parcel.readString();
        this.mItemLinkOpenType = parcel.readInt();
    }

    public void setItemContent(String str) {
        this.mItemContent = str;
    }

    public void setItemLink(String str) {
        this.mItemLink = str;
    }

    public void setItemLinkPkgName(String str) {
        this.mItemLinkPkgName = str;
    }

    public void setItemName(String str) {
        this.mItemName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mItemName);
        parcel.writeString(this.mItemContent);
        parcel.writeString(this.mItemLink);
        parcel.writeString(this.mItemLinkPkgName);
        parcel.writeInt(this.mItemLinkOpenType);
    }
}

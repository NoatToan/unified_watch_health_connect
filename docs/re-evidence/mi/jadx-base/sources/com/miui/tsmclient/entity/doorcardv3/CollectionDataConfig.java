package com.miui.tsmclient.entity.doorcardv3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public class CollectionDataConfig implements Parcelable {
    public static final Parcelable.Creator<CollectionDataConfig> CREATOR = new Parcelable.Creator<CollectionDataConfig>() { // from class: com.miui.tsmclient.entity.doorcardv3.CollectionDataConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CollectionDataConfig createFromParcel(Parcel parcel) {
            return new CollectionDataConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CollectionDataConfig[] newArray(int i) {
            return new CollectionDataConfig[i];
        }
    };

    @SerializedName("distancesNumber")
    private int mDistancesNumber;

    @SerializedName("leastKnownKeys")
    private int mLeastKnownKeys;

    @SerializedName("maxSectors")
    private int mMaxSectors;

    @SerializedName("seVendor")
    private String mSeVendor;

    @SerializedName("groupsOfSector")
    private int mSectorGroup;

    @SerializedName("samplesOfGroup")
    private int mSectorGroupSamples;

    public CollectionDataConfig(Parcel parcel) {
        this.mMaxSectors = parcel.readInt();
        this.mSectorGroup = parcel.readInt();
        this.mSectorGroupSamples = parcel.readInt();
        this.mDistancesNumber = parcel.readInt();
        this.mSeVendor = parcel.readString();
        this.mLeastKnownKeys = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistancesNumber() {
        return this.mDistancesNumber;
    }

    public int getMaxSectors() {
        return this.mMaxSectors;
    }

    public String getSeVendor() {
        return this.mSeVendor;
    }

    public int getSectorGroup() {
        return this.mSectorGroup;
    }

    public int getSectorGroupSamples() {
        return this.mSectorGroupSamples;
    }

    public boolean isAvailable(MifareTag mifareTag) {
        int knownKeyCount = mifareTag.getKnownKeyCount();
        LogUtils.t("tag knownKeyCount:" + knownKeyCount + ", leastKnownKeys:" + this.mLeastKnownKeys);
        return mifareTag.isLessThan1k() && mifareTag.hasEncryptionSector() && knownKeyCount >= this.mLeastKnownKeys;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMaxSectors);
        parcel.writeInt(this.mSectorGroup);
        parcel.writeInt(this.mSectorGroupSamples);
        parcel.writeInt(this.mDistancesNumber);
        parcel.writeString(this.mSeVendor);
        parcel.writeInt(this.mLeastKnownKeys);
    }
}

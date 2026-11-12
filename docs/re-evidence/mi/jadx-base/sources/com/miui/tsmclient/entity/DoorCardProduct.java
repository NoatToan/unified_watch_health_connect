package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProduct extends CommonResponseInfo implements Parcelable, Comparable<DoorCardProduct> {
    public static final Parcelable.Creator<DoorCardProduct> CREATOR = new Parcelable.Creator<DoorCardProduct>() { // from class: com.miui.tsmclient.entity.DoorCardProduct.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProduct createFromParcel(Parcel parcel) {
            return new DoorCardProduct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProduct[] newArray(int i) {
            return new DoorCardProduct[i];
        }
    };
    private static final String URL_OPEN_DOOR_CARD = "tsmclient://card?action=issue_mifare&type=%1d&product_id=%2s";
    private boolean isCloudCard;

    @SerializedName("downloadable")
    private boolean isDownloadable;
    private boolean isSelected;

    @SerializedName("actionUIText")
    private String mActionUIText;

    @SerializedName("issuerAppDesc")
    private String mAppDesc;

    @SerializedName("issuerAppIconUrl")
    private String mAppIconUrl;

    @SerializedName("issuerAppName")
    private String mAppName;

    @SerializedName("issuerAppPkgName")
    private String mAppPkgName;

    @SerializedName("businessId")
    private String mBusinessId;

    @SerializedName("cardArt")
    private String mCardArt;

    @SerializedName("cardType")
    private int mCardType;
    private String mCardTypeGroup;

    @SerializedName("cid")
    private String mCid;

    @SerializedName("descItems")
    private List<ProductDescription> mDescItems;

    @SerializedName(ProprietaryCarKeyCardInfo.CARD_FINGER_FLAG)
    private int mFingerFlag;

    @SerializedName("issueCompletedAction")
    private int mIssueCompletedAction;

    @SerializedName("issueMethod")
    private int mIssueMethod;

    @SerializedName("issuerAppLink")
    private String mIssuerAppLink;

    @SerializedName("issuerAppLinkOpenType")
    private int mIssuerAppLinkOpenType;

    @SerializedName("issuerId")
    private String mIssuerId;

    @SerializedName(CardInfo.KEY_ISSUER_NAME)
    private String mIssuerName;

    @SerializedName(CardUIInfo.KEY_LOGO)
    private String mLogo;

    @SerializedName("name")
    private String mName;

    @SerializedName("needCaptcha")
    private boolean mNeedCaptcha;

    @SerializedName("needReadCard")
    private boolean mNeedReadCard;

    @SerializedName("productConfig")
    private DoorCardProductConfig mProductConfig;

    @SerializedName("productDescription")
    private String mProductDesc;

    @SerializedName("description")
    private List<ProductDescription> mProductDescription;

    @SerializedName("productId")
    private String mProductId;

    @SerializedName("productName")
    private String mProductName;

    @SerializedName("seqNo")
    private int mSeqNo;

    public DoorCardProduct() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoorCardProduct)) {
            return false;
        }
        DoorCardProduct doorCardProduct = (DoorCardProduct) obj;
        return Objects.equals(this.mCid, doorCardProduct.mCid) && Objects.equals(this.mProductId, doorCardProduct.mProductId);
    }

    public String getActionUIText() {
        return this.mActionUIText;
    }

    public String getAppDesc() {
        return this.mAppDesc;
    }

    public String getAppIconUrl() {
        return this.mAppIconUrl;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public String getAppPkgName() {
        return this.mAppPkgName;
    }

    public String getBusinessId() {
        return this.mBusinessId;
    }

    public String getCardArt() {
        return this.mCardArt;
    }

    public int getCardType() {
        return this.mCardType;
    }

    public String getCardTypeGroup() {
        return this.mCardTypeGroup;
    }

    public String getCid() {
        return this.mCid;
    }

    public List<ProductDescription> getDescItems() {
        return this.mDescItems;
    }

    public List<ProductDescription> getDescription() {
        return this.mProductDescription;
    }

    public int getIssueCompletedAction() {
        return this.mIssueCompletedAction;
    }

    public int getIssueMethod() {
        return this.mIssueMethod;
    }

    public String getIssuerAppLink() {
        return this.mIssuerAppLink;
    }

    public String getIssuerId() {
        return this.mIssuerId;
    }

    public String getIssuerName() {
        return this.mIssuerName;
    }

    public String getLogo() {
        return this.mLogo;
    }

    public String getName() {
        return this.mName;
    }

    public String getOpenCardUrl() {
        return String.format(URL_OPEN_DOOR_CARD, Integer.valueOf(this.mCardType), this.mProductId);
    }

    public DoorCardProductConfig getProductConfig() {
        return this.mProductConfig;
    }

    public String getProductDesc() {
        return this.mProductDesc;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public int getSeqNo() {
        return this.mSeqNo;
    }

    public int hashCode() {
        return Objects.hash(this.mCid, this.mProductId);
    }

    public boolean isAppLinkTypeOfAction() {
        return 1 == this.mIssuerAppLinkOpenType;
    }

    public boolean isAppLinkTypeOfScheme() {
        return 3 == this.mIssuerAppLinkOpenType;
    }

    public boolean isAppLinkTypeOfWeb() {
        return 2 == this.mIssuerAppLinkOpenType;
    }

    public boolean isCloudCard() {
        return this.isCloudCard;
    }

    public boolean isDownloadable() {
        return this.isDownloadable;
    }

    public boolean isNeedCaptcha() {
        return this.mNeedCaptcha;
    }

    public boolean isNeedReadCard() {
        return this.mNeedReadCard;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean needFinger() {
        return this.mFingerFlag == 1;
    }

    public void setActionUIText(String str) {
        this.mActionUIText = str;
    }

    public void setAppDesc(String str) {
        this.mAppDesc = str;
    }

    public void setAppIconUrl(String str) {
        this.mAppIconUrl = str;
    }

    public void setAppName(String str) {
        this.mAppName = str;
    }

    public void setAppPkgName(String str) {
        this.mAppPkgName = str;
    }

    public void setCardType(int i) {
        this.mCardType = i;
    }

    public void setCardTypeGroup(String str) {
        this.mCardTypeGroup = str;
    }

    public void setCloudCard(boolean z) {
        this.isCloudCard = z;
    }

    public void setDescItems(List<ProductDescription> list) {
        this.mDescItems = list;
    }

    public void setLogo(String str) {
        this.mLogo = str;
    }

    public void setNeedCaptcha(boolean z) {
        this.mNeedCaptcha = z;
    }

    public void setNeedReadCard(boolean z) {
        this.mNeedReadCard = z;
    }

    public void setProductConfig(DoorCardProductConfig doorCardProductConfig) {
        this.mProductConfig = doorCardProductConfig;
    }

    public void setProductDesc(String str) {
        this.mProductDesc = str;
    }

    public void setProductName(String str) {
        this.mProductName = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mProductId);
        parcel.writeString(this.mProductName);
        parcel.writeString(this.mProductDesc);
        parcel.writeString(this.mLogo);
        parcel.writeInt(this.mFingerFlag);
        parcel.writeInt(this.mCardType);
        parcel.writeString(this.mCardArt);
        parcel.writeString(this.mIssuerId);
        parcel.writeString(this.mIssuerName);
        parcel.writeString(this.mActionUIText);
        parcel.writeString(this.mAppPkgName);
        parcel.writeParcelable(this.mProductConfig, i);
        parcel.writeByte(this.mNeedReadCard ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mNeedCaptcha ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.mProductDescription);
        parcel.writeTypedList(this.mDescItems);
        parcel.writeString(this.mAppIconUrl);
        parcel.writeString(this.mAppDesc);
        parcel.writeString(this.mAppName);
        parcel.writeInt(this.mSeqNo);
        parcel.writeString(this.mName);
        parcel.writeString(this.mCid);
        parcel.writeString(this.mCardTypeGroup);
        parcel.writeByte(this.isDownloadable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCloudCard ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mBusinessId);
        parcel.writeInt(this.mIssueMethod);
        parcel.writeInt(this.mIssueCompletedAction);
    }

    public DoorCardProduct(Parcel parcel) {
        this.mProductId = parcel.readString();
        this.mProductName = parcel.readString();
        this.mProductDesc = parcel.readString();
        this.mLogo = parcel.readString();
        this.mFingerFlag = parcel.readInt();
        this.mCardType = parcel.readInt();
        this.mCardArt = parcel.readString();
        this.mIssuerId = parcel.readString();
        this.mIssuerName = parcel.readString();
        this.mActionUIText = parcel.readString();
        this.mAppPkgName = parcel.readString();
        this.mProductConfig = (DoorCardProductConfig) parcel.readParcelable(DoorCardProductConfig.class.getClassLoader());
        this.mNeedReadCard = parcel.readByte() != 0;
        this.mNeedCaptcha = parcel.readByte() != 0;
        this.isSelected = parcel.readByte() != 0;
        Parcelable.Creator<ProductDescription> creator = ProductDescription.CREATOR;
        this.mProductDescription = parcel.createTypedArrayList(creator);
        this.mDescItems = parcel.createTypedArrayList(creator);
        this.mAppIconUrl = parcel.readString();
        this.mAppDesc = parcel.readString();
        this.mAppName = parcel.readString();
        this.mSeqNo = parcel.readInt();
        this.mName = parcel.readString();
        this.mCid = parcel.readString();
        this.mCardTypeGroup = parcel.readString();
        this.isDownloadable = parcel.readByte() != 0;
        this.isCloudCard = parcel.readByte() != 0;
        this.mBusinessId = parcel.readString();
        this.mIssueMethod = parcel.readInt();
        this.mIssueCompletedAction = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public int compareTo(DoorCardProduct doorCardProduct) {
        return this.mSeqNo - doorCardProduct.getSeqNo();
    }
}

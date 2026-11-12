package com.huawei.trade.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DevicePerfPurchaseInfo extends BaseDeviceBenefitInfo {
    public static final Parcelable.Creator<DevicePerfPurchaseInfo> CREATOR = new Parcelable.Creator<DevicePerfPurchaseInfo>() { // from class: com.huawei.trade.datatype.DevicePerfPurchaseInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DevicePerfPurchaseInfo createFromParcel(Parcel parcel) {
            return new DevicePerfPurchaseInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DevicePerfPurchaseInfo[] newArray(int i) {
            return new DevicePerfPurchaseInfo[i];
        }
    };
    private int autoRenew;
    private String backgroundUrl;
    private String cardTitle;
    private String cardUrl;
    private String devicePerfPurchaseId;
    private List<OtherServiceInfo> otherServiceList;
    private String perfPurchaseDescription;
    private String perfPurchaseName;
    private String perfPurchaseSubTitle;
    private DeviceBenefitProductInfo productInfo;
    private String subTitleForSubscription;
    private String subscribeProductId;
    private DeviceBenefitProductInfo subscribeProductInfo;
    private SubscriptionPromotion subscriptionPromotion;
    private String subscriptionPromotionId;

    @Override // com.huawei.trade.datatype.BaseDeviceBenefitInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.trade.datatype.BaseDeviceBenefitInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.devicePerfPurchaseId);
        parcel.writeString(this.subscribeProductId);
        parcel.writeParcelable(this.subscribeProductInfo, i);
        parcel.writeString(this.subscriptionPromotionId);
        parcel.writeParcelable(this.productInfo, i);
        parcel.writeInt(this.autoRenew);
        parcel.writeString(this.perfPurchaseName);
        parcel.writeString(this.perfPurchaseSubTitle);
        parcel.writeString(this.perfPurchaseDescription);
        parcel.writeString(this.cardUrl);
        parcel.writeString(this.backgroundUrl);
        parcel.writeTypedList(this.otherServiceList);
        parcel.writeParcelable(this.subscriptionPromotion, i);
        parcel.writeString(this.cardTitle);
        parcel.writeString(this.subTitleForSubscription);
    }

    public DevicePerfPurchaseInfo(Parcel parcel) {
        super(parcel);
        this.devicePerfPurchaseId = parcel.readString();
        this.subscribeProductId = parcel.readString();
        this.subscribeProductInfo = (DeviceBenefitProductInfo) parcel.readParcelable(DeviceBenefitProductInfo.class.getClassLoader());
        this.subscriptionPromotionId = parcel.readString();
        this.productInfo = (DeviceBenefitProductInfo) parcel.readParcelable(DeviceBenefitProductInfo.class.getClassLoader());
        this.autoRenew = parcel.readInt();
        this.perfPurchaseName = parcel.readString();
        this.perfPurchaseSubTitle = parcel.readString();
        this.perfPurchaseDescription = parcel.readString();
        this.cardUrl = parcel.readString();
        this.backgroundUrl = parcel.readString();
        this.otherServiceList = parcel.createTypedArrayList(OtherServiceInfo.CREATOR);
        this.subscriptionPromotion = (SubscriptionPromotion) parcel.readParcelable(SubscriptionPromotion.class.getClassLoader());
        this.cardTitle = parcel.readString();
        this.subTitleForSubscription = parcel.readString();
    }

    public String getDevicePerfPurchaseId() {
        return this.devicePerfPurchaseId;
    }

    public void setDevicePerfPurchaseId(String str) {
        this.devicePerfPurchaseId = str;
    }

    public String getSubscribeProductId() {
        return this.subscribeProductId;
    }

    public void setSubscribeProductId(String str) {
        this.subscribeProductId = str;
    }

    public String getSubscriptionPromotionId() {
        return this.subscriptionPromotionId;
    }

    public void setSubscriptionPromotionId(String str) {
        this.subscriptionPromotionId = str;
    }

    public int getAutoRenew() {
        return this.autoRenew;
    }

    public void setAutoRenew(int i) {
        this.autoRenew = i;
    }

    public String getPerfPurchaseName() {
        return this.perfPurchaseName;
    }

    public void setPerfPurchaseName(String str) {
        this.perfPurchaseName = str;
    }

    public String getPerfPurchaseSubTitle() {
        return this.perfPurchaseSubTitle;
    }

    public void setPerfPurchaseSubTitle(String str) {
        this.perfPurchaseSubTitle = str;
    }

    public String getPerfPurchaseDescription() {
        return this.perfPurchaseDescription;
    }

    public void setPerfPurchaseDescription(String str) {
        this.perfPurchaseDescription = str;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public void setBackgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    public List<OtherServiceInfo> getOtherServiceList() {
        return this.otherServiceList;
    }

    public void setOtherServiceList(List<OtherServiceInfo> list) {
        this.otherServiceList = list;
    }

    public SubscriptionPromotion getSubscriptionPromotion() {
        return this.subscriptionPromotion;
    }

    public void setSubscriptionPromotion(SubscriptionPromotion subscriptionPromotion) {
        this.subscriptionPromotion = subscriptionPromotion;
    }

    public DeviceBenefitProductInfo getSubscribeProductInfo() {
        return this.subscribeProductInfo;
    }

    public void setSubscribeProductInfo(DeviceBenefitProductInfo deviceBenefitProductInfo) {
        this.subscribeProductInfo = deviceBenefitProductInfo;
    }

    public DeviceBenefitProductInfo getProductInfo() {
        return this.productInfo;
    }

    public void setProductInfo(DeviceBenefitProductInfo deviceBenefitProductInfo) {
        this.productInfo = deviceBenefitProductInfo;
    }

    public String getCardTitle() {
        return this.cardTitle;
    }

    public void setCardTitle(String str) {
        this.cardTitle = str;
    }

    public String getSubTitleForSubscription() {
        return this.subTitleForSubscription;
    }

    public void setSubTitleForSubscription(String str) {
        this.subTitleForSubscription = str;
    }

    @Override // com.huawei.trade.datatype.BaseDeviceBenefitInfo
    public String toString() {
        return "DevicePerfPurchaseInfo{devicePerfPurchaseId='" + this.devicePerfPurchaseId + "', subscribeProductId='" + this.subscribeProductId + "', subscribeProductInfo=" + this.subscribeProductInfo + ", subscriptionPromotionId='" + this.subscriptionPromotionId + "', productInfo=" + this.productInfo + ", autoRenew=" + this.autoRenew + "', perfPurchaseName='" + this.perfPurchaseName + "', perfPurchaseSubTitle='" + this.perfPurchaseSubTitle + "', perfPurchaseDescription='" + this.perfPurchaseDescription + "', cardUrl='" + this.cardUrl + "', backgroundUrl='" + this.backgroundUrl + "', otherServiceList=" + this.otherServiceList + ", subscriptionPromotion=" + this.subscriptionPromotion + ", cardTitle='" + this.cardTitle + "', subTitleForSubscription='" + this.subTitleForSubscription + "', deviceType='" + this.deviceType + "', productId='" + this.productId + "', benefitType=" + this.benefitType + ", linkType=" + this.linkType + ", linkValue='" + this.linkValue + "', timeZone='" + this.timeZone + "', effectiveStartTime=" + this.effectiveStartTime + ", effectiveEndTime=" + this.effectiveEndTime + ", activeStatus=" + this.activeStatus + ", pageTitle='" + this.pageTitle + "', pageDesc='" + this.pageDesc + "', deviceName='" + this.deviceName + "', serviceDescPicture=" + this.serviceDescPicture + ", validateType=" + this.validateType + '}';
    }
}

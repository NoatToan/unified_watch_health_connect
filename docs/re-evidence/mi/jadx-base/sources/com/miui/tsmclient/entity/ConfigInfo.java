package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.OneTrack;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigInfo extends CommonResponseInfo {
    public static final String ALL_CITY_LIST = "ALL_CITY_LIST";
    public static final String AUTO_REPAIR_SWITCH = "AUTO_REPAIR_SWITCH";
    public static final String BANNER_IMG = "BANNER_IMG";
    public static final String BANNER_LINK = "BANNER_LINK";
    public static final String BLANK_CARD_USER_GUIDE = "BLANK_CARD_USER_GUIDE";
    public static final String BLANK_CARD_WRITE_GUIDE = "BLANK_CARD_WRITE_GUIDE";
    public static final String CARD_DETAIL_BANNER_LIST = "CARD_DETAIL_BANNER_LIST";
    public static final String CARD_DETAIL_BG = "CARD_DETAIL_BG";
    public static final String CARD_DETAIL_V2_BANNER_LIST = "CARD_DETAIL_V2_BANNER_LIST";
    public static final String CARD_LIST_BANNER_LIST = "CARD_LIST_BANNER_LIST";
    public static final String CARD_LIST_V2_BANNER_LIST = "CARD_LIST_V2_BANNER_LIST";
    public static final String CARD_RECHARGE_BANNER_LIST = "CARD_RECHARGE_BANNER_LIST";
    public static final String CARD_V3_BANNER_LIST = "CARD_V3_BANNER_LIST";
    public static final String CAR_KEYS_IN_CONFLICT_WITH_M1 = "CAR_KEYS_IN_CONFLICT_WITH_M1";
    public static final String CITY_LIST = "CITY_LIST";
    public static final String COMMA_SEPARATOR = "\\s*,\\s*";
    public static final String CUSTOMER_SERVICE_PHONE = "CUSTOMER_SERVICE_PHONE";
    public static final String DETAIL_FOOTER_INFO = "DETAIL_FOOTER_INFO";
    public static final String DIGITAL_KEY_BANNER_LIST = "DIGITAL_KEY_BANNER_LIST";
    public static final String FEATURE_INVOICE = "FEATURE_INVOICE";
    public static final String FEATURE_SERVICE_INVOICE = "FEATURE_SERVICE_INVOICE";
    public static final String GEO_FENCE_CONFIG = "GEO_FENCE_CONFIG";
    public static final String GEO_FENCE_FEATURE = "GEO_FENCE_FEATURE";
    public static final int INVALID_VALUE = -1;
    public static final String ISSUE_CARD_NOTICE = "ISSUE_CARD_NOTICE";
    public static final String MAINTAIN_INFO = "MAINTAIN_INFO";
    public static final String MIPAY_BANK_BANNER_LIST = "MIPAY_BANK_BANNER_LIST";
    public static final String MIPAY_BANK_DISCOUNT = "MIPAY_BANK_DISCOUNT";
    public static final String MIPAY_BANK_GUIDE = "MIPAY_BANK_GUIDE";
    public static final String MIPAY_BANK_GUIDE_FOR_QR = "MIPAY_BANK_GUIDE_FOR_QR";
    public static final String MIPAY_EXCLUDE_SUFFIX_BANK_LIST = "MIPAY_EXCLUDE_SUFFIX_BANK_LIST";
    public static final String MIPAY_GUIDE_BANNER_LIST = "MIPAY_GUIDE_BANNER_LIST";
    public static final String MIPAY_GUIDE_BANNER_LIST_FOR_QR = "MIPAY_GUIDE_BANNER_LIST_FOR_QR";
    public static final String MIPAY_OPTION_LIST = "MIPAY_OPTION_LIST";
    public static final String MIPAY_QRBANK_BANNER_LIST = "MIPAY_QRBANK_BANNER_LIST";
    public static final String PAGER_MIPAY_BANNER_LIST = "PAGER_MIPAY_BANNER_LIST";
    public static final String PAGER_MIPAY_BANNER_LIST_FOR_QR = "PAGER_MIPAY_BANNER_LIST_FOR_QR";
    public static final String PAGER_USER_GUIDE = "PAGER_USER_GUIDE";
    public static final String REFUND_FEE_NOTES = "REFUND_FEE_NOTES";
    public static final String RETURN_SUCCESS_MSG = "RETURN_SUCCESS_MSG";
    public static final String SELECT_CARD_CONFIG = "SELECT_CARD_CONFIG";
    public static final String SELECT_CARD_TYPE_RELATED_CONFIG = "SELECT_CARD_TYPE_RELATED_CONFIG";
    public static final String SWITCH_TRANSFER = "SWITCH_TRANSFER";
    public static final String TOKEN2_FAST_BIND_BANK_CARD = "TOKEN2_FAST_BIND_BANK_CARD";
    public static final String TRAFFIC_CARD_COMMON_PROBLEM = "TRAFFIC_CARD_COMMON_PROBLEM";
    public static final String TRANSFER_BALANCE_DESC = "TRANSFER_BALANCE_DESC";
    public static final String TRANSFER_CARD_IN_PROCESS = "TRANSFER_CARD_IN_PROCESS";
    public static final String TRANSFER_CARD_TYPE = "TRANSFER_CARD_";
    public static final String TRANSFER_FEE_DESC = "TRANSFER_FEE_DESC";
    public static final String TRANSFER_INTRODUCTION = "TRANSFER_INTRODUCTION";
    public static final String TRANSFER_INTRODUCTION_BANNER_LIST = "BUS_INTRODUCTION_BANNER_LIST";
    public static final String TRANSFER_INTRODUCTION_BANNER_LIST_PAGER = "PAGER_BUS_INTRO_BANNER_LIST";
    public static final String TRANSFER_OP_GUIDE = "TRANSFER_OP_GUIDE";
    public static final String USER_GUIDE = "USER_GUIDE";
    public static final String UWB_CONFIG = "UWB_CONFIG";

    @SerializedName("data")
    private Map<String, ConfigItem> mConfigData;

    public static class BannerInfo {

        @SerializedName("backgroundColor")
        public String mBackgroundColor;

        @SerializedName("backgroundDarkColor")
        public String mBackgroundDarkColor;

        @SerializedName("foldLargeImg")
        public String mBannerFoldLargeImg;

        @SerializedName("foldSmallImg")
        public String mBannerFoldSmallImg;

        @SerializedName("img")
        public String mBannerImg;

        @SerializedName("imgDark")
        public String mBannerImgDark;

        @SerializedName(OneTrack.Param.LINK)
        public String mBannerLink;

        @SerializedName("description")
        public String mDescription;

        @SerializedName("descriptionColor")
        public String mDescriptionColor;

        @SerializedName("descriptionDarkColor")
        public String mDescriptionDarkColor;

        @SerializedName("descriptionSize")
        public int mDescriptionSize;

        @SerializedName(TSMAuthContants.PARAM_NEXTPAY_VERSION_CODE)
        private int mNextPayVersionCode;

        @SerializedName("title")
        public String mTitle;

        @SerializedName("titleColor")
        public String mTitleColor;

        @SerializedName("titleDarkColor")
        public String mTitleDarkColor;

        @SerializedName("titleSize")
        public int mTitleSize;

        @SerializedName("tsmClientVersionCode")
        private int mTsmClientVersionCode;

        @SerializedName(TSMAuthContants.PARAM_UNION_PAY_VERSION_CODE)
        private int mUnionPayVersionCode;

        private boolean isSupportNextPayVersion(Context context) {
            return DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_NEXTPAY) >= this.mNextPayVersionCode;
        }

        private boolean isSupportTsmClientVersion(Context context) {
            return DeviceUtils.getAppVersionCode(context) >= this.mTsmClientVersionCode;
        }

        private boolean isSupportUnionPayVersion(Context context) {
            return DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_UNIONPAY) >= this.mUnionPayVersionCode;
        }

        public String getBackgroundColor(Context context) {
            return DeviceUtils.isNightMode(context) ? this.mBackgroundDarkColor : this.mBackgroundColor;
        }

        public String getBannerImgURL(Context context) {
            return (!DeviceUtils.isNightMode(context) || TextUtils.isEmpty(this.mBannerImgDark)) ? this.mBannerImg : this.mBannerImgDark;
        }

        public String getDescriptionColor(Context context) {
            return DeviceUtils.isNightMode(context) ? this.mDescriptionDarkColor : this.mDescriptionColor;
        }

        public String getTitleColor(Context context) {
            return DeviceUtils.isNightMode(context) ? this.mTitleDarkColor : this.mTitleColor;
        }

        public boolean isSupportBannerV3(Context context) {
            return isSupportTsmClientVersion(context) && isSupportNextPayVersion(context) && isSupportUnionPayVersion(context);
        }
    }

    public static class CarKeysInConflictWithM1 {

        @SerializedName("ccc")
        private ConflictCccCarKeyList mCcc;

        @SerializedName("traditional")
        private ConflictTraditionalCarKeyList mTraditional;

        public static class ConflictCccCarKeyList {

            @SerializedName("brandIdList")
            private List<String> mBrandIdList;

            public List<String> getBrandIdList() {
                return this.mBrandIdList;
            }

            public String toString() {
                return new Gson().toJson(this);
            }
        }

        public static class ConflictTraditionalCarKeyList {

            @SerializedName("productIdList")
            private List<String> mProductIdList;

            public List<String> getProductIdList() {
                return this.mProductIdList;
            }

            public String toString() {
                return new Gson().toJson(this);
            }
        }

        public ConflictCccCarKeyList getCcc() {
            return this.mCcc;
        }

        public ConflictTraditionalCarKeyList getTraditional() {
            return this.mTraditional;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class CardAppInfo implements Parcelable {
        public static final Parcelable.Creator<CardAppInfo> CREATOR = new Parcelable.Creator<CardAppInfo>() { // from class: com.miui.tsmclient.entity.ConfigInfo.CardAppInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CardAppInfo createFromParcel(Parcel parcel) {
                return new CardAppInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CardAppInfo[] newArray(int i) {
                return new CardAppInfo[i];
            }
        };

        @SerializedName("logoUrl")
        public String mCardAppLogoUrl;

        @SerializedName(CardUIInfo.KEY_SUBTITILE)
        public String mCardAppSubTitle;

        @SerializedName("title")
        public String mCardAppTitle;

        @SerializedName(MiuiCursorConstants.CONTENT)
        public String mFooterContent;

        @SerializedName(TSMAuthContants.PARAM_KEYWORD)
        public String mFooterKeyword;

        @SerializedName(OneTrack.Param.LINK)
        public String mFooterLink;

        public CardAppInfo(Parcel parcel) {
            this.mFooterContent = parcel.readString();
            this.mFooterLink = parcel.readString();
            this.mFooterKeyword = parcel.readString();
            this.mCardAppLogoUrl = parcel.readString();
            this.mCardAppTitle = parcel.readString();
            this.mCardAppSubTitle = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mFooterContent);
            parcel.writeString(this.mFooterLink);
            parcel.writeString(this.mFooterKeyword);
            parcel.writeString(this.mCardAppLogoUrl);
            parcel.writeString(this.mCardAppTitle);
            parcel.writeString(this.mCardAppSubTitle);
        }
    }

    public static class ConfigItem {

        @SerializedName("cardName")
        public String mCardName;

        @SerializedName(MiuiCursorConstants.CONTENT)
        public String mContent;

        @SerializedName("key")
        public String mKey;

        @SerializedName("name")
        public String mName;

        @SerializedName("type")
        public String mType;
    }

    public static class GeofenceFeatureConfig {

        @SerializedName("supportGetFenceStatusVersion")
        private int mSupportGetFenceStatusVersion = -1;

        public int getSupportGetFenceStatusVersion() {
            return this.mSupportGetFenceStatusVersion;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class MaintainInfo implements Parcelable {
        public static final Parcelable.Creator<MaintainInfo> CREATOR = new Parcelable.Creator<MaintainInfo>() { // from class: com.miui.tsmclient.entity.ConfigInfo.MaintainInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MaintainInfo createFromParcel(Parcel parcel) {
                return new MaintainInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MaintainInfo[] newArray(int i) {
                return new MaintainInfo[i];
            }
        };

        @SerializedName(MiuiCursorConstants.CONTENT)
        public String mContent;

        @SerializedName(com.mibi.sdk.component.Constants.KEY_RECHARGE_ICON_URL)
        public String mIconUrl;

        @SerializedName("id")
        public String mId;

        @SerializedName("tips")
        public String mTips;

        @SerializedName("title")
        public String mTitle;

        public MaintainInfo(Parcel parcel) {
            this.mId = parcel.readString();
            this.mIconUrl = parcel.readString();
            this.mTitle = parcel.readString();
            this.mContent = parcel.readString();
            this.mTips = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mId);
            parcel.writeString(this.mIconUrl);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mContent);
            parcel.writeString(this.mTips);
        }
    }

    public static class MiPayBankDiscountInfo {

        @SerializedName("name")
        public String mDiscountName;

        @SerializedName("url")
        public String mDiscountUrl;
    }

    public static class MiPayBankGuideInfo {

        @SerializedName("name")
        public String mGuideName;

        @SerializedName("url")
        public String mGuideUrl;
    }

    public static class MiPayBankOptionInfo {

        @SerializedName("name")
        public String mOptionName;

        @SerializedName("intent")
        public String mUri;

        @SerializedName("url")
        public String mUrl;
    }

    public static class SelectCardConfig {

        @SerializedName("firstSelectCardTimeout")
        private int mFirstSelectCardTimeout = -1;

        @SerializedName("selectCardIntervalTimeout")
        private int mSelectCardIntervalTimeout = -1;

        public int getFirstSelectCardTimeout() {
            return this.mFirstSelectCardTimeout;
        }

        public int getSelectCardIntervalTimeout() {
            return this.mSelectCardIntervalTimeout;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public static class TrafficCardProblemInfo {

        @SerializedName(MiuiCursorConstants.CONTENT)
        public String mContent;

        @SerializedName(OneTrack.Param.LINK)
        public String mLink;

        @SerializedName("type")
        public int mLinkType;
    }

    public List<BannerInfo> getBannerList(Context context, String str) {
        BannerInfo[] bannerInfoArr = (BannerInfo[]) getInfo(str, BannerInfo[].class);
        ArrayList arrayList = new ArrayList();
        if (bannerInfoArr != null) {
            arrayList.addAll(new ArrayList(Arrays.asList(bannerInfoArr)));
        }
        BannerInfo[] bannerInfoArr2 = (BannerInfo[]) getInfo(CARD_V3_BANNER_LIST, BannerInfo[].class);
        if (bannerInfoArr2 != null) {
            for (BannerInfo bannerInfo : Arrays.asList(bannerInfoArr2)) {
                if (bannerInfo != null && bannerInfo.isSupportBannerV3(context)) {
                    arrayList.add(bannerInfo);
                }
            }
        }
        return arrayList;
    }

    public CardAppInfo getCardAppInfo(String str) {
        return (CardAppInfo) getInfo(str, CardAppInfo.class);
    }

    public Map<String, ConfigItem> getConfigMap() {
        return this.mConfigData;
    }

    public String getContentByConfigKey(String str) {
        Map<String, ConfigItem> map = this.mConfigData;
        if (map == null || map.get(str) == null) {
            return null;
        }
        return this.mConfigData.get(str).mContent;
    }

    public <T> T getInfo(String str, Class<T> cls) {
        ConfigItem configItem = getConfigMap().get(str);
        if (configItem == null) {
            return null;
        }
        String str2 = configItem.mContent;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return (T) new Gson().fromJson(str2, (Class) cls);
    }

    public MaintainInfo getMaintainInfo() {
        return (MaintainInfo) getInfo(MAINTAIN_INFO, MaintainInfo.class);
    }

    public List<TrafficCardProblemInfo> getProblemList(String str) {
        TrafficCardProblemInfo[] trafficCardProblemInfoArr = (TrafficCardProblemInfo[]) getInfo(str, TrafficCardProblemInfo[].class);
        return trafficCardProblemInfoArr != null ? Arrays.asList(trafficCardProblemInfoArr) : Collections.emptyList();
    }

    public boolean getSupportFeature(String str, String str2) {
        Map<String, ConfigItem> map = this.mConfigData;
        if (map != null && map.get(str) != null) {
            String str3 = this.mConfigData.get(str).mContent;
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.replace(" ", "").toLowerCase().split(COMMA_SEPARATOR);
                String lowerCase = str2.toLowerCase();
                for (String str4 : strArrSplit) {
                    if (TextUtils.equals(str4, lowerCase)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public <T> T getInfo(String str, Type type) {
        ConfigItem configItem = getConfigMap().get(str);
        if (configItem == null) {
            return null;
        }
        String str2 = configItem.mContent;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return (T) new Gson().fromJson(str2, type);
    }
}

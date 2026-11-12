package com.miui.tsmclient.entity.digitalkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class PairingConfig implements Parcelable {
    public static final Parcelable.Creator<PairingConfig> CREATOR = new Parcelable.Creator<PairingConfig>() { // from class: com.miui.tsmclient.entity.digitalkey.PairingConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PairingConfig createFromParcel(Parcel parcel) {
            return new PairingConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PairingConfig[] newArray(int i) {
            return new PairingConfig[i];
        }
    };

    @SerializedName("enablePairingEndUI")
    private boolean isSupportPairingEndUI;

    @SerializedName("supportPairingInWallet")
    private boolean isSupportPairingInWallet;

    @SerializedName("enablePromptUI")
    private boolean isSupportPromptUI;

    @SerializedName("promptUIMessage")
    private String mOPGuideUIDesc;

    @SerializedName("promptUITitle")
    private String mOPGuideUITitle;

    @SerializedName("pairingEndUI")
    private PairingEndUI mPairingEndUI;

    public static class Description implements Parcelable {
        public static final Parcelable.Creator<Description> CREATOR = new Parcelable.Creator<Description>() { // from class: com.miui.tsmclient.entity.digitalkey.PairingConfig.Description.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Description createFromParcel(Parcel parcel) {
                return new Description(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Description[] newArray(int i) {
                return new Description[i];
            }
        };

        @SerializedName("chs")
        private String mChs;

        @SerializedName("cht")
        private String mCht;

        @SerializedName("en")
        private String mEn;

        public Description(Parcel parcel) {
            this.mChs = parcel.readString();
            this.mCht = parcel.readString();
            this.mEn = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mChs);
            parcel.writeString(this.mCht);
            parcel.writeString(this.mEn);
        }
    }

    public static class PairingEndUI implements Parcelable {
        public static final Parcelable.Creator<PairingEndUI> CREATOR = new Parcelable.Creator<PairingEndUI>() { // from class: com.miui.tsmclient.entity.digitalkey.PairingConfig.PairingEndUI.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PairingEndUI createFromParcel(Parcel parcel) {
                return new PairingEndUI(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PairingEndUI[] newArray(int i) {
                return new PairingEndUI[i];
            }
        };

        @SerializedName("item")
        private List<PairingEndUIItem> mItems;

        public PairingEndUI(Parcel parcel) {
            this.mItems = parcel.createTypedArrayList(PairingEndUIItem.CREATOR);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public List<PairingEndUIItem> getIntroductionItems() {
            if (this.mItems == null) {
                this.mItems = new ArrayList();
            }
            return this.mItems;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.mItems);
        }
    }

    public static class PairingEndUIItem implements Parcelable {
        public static final Parcelable.Creator<PairingEndUIItem> CREATOR = new Parcelable.Creator<PairingEndUIItem>() { // from class: com.miui.tsmclient.entity.digitalkey.PairingConfig.PairingEndUIItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PairingEndUIItem createFromParcel(Parcel parcel) {
                return new PairingEndUIItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PairingEndUIItem[] newArray(int i) {
                return new PairingEndUIItem[i];
            }
        };

        @SerializedName(CardUIInfo.KEY_SUBTITILE)
        private Description mSubtitle;

        @SerializedName("mainTitle")
        private Description mTitle;

        @SerializedName("type")
        private String mType;

        @SerializedName("pictureUrl")
        private String mUrl;

        public PairingEndUIItem(Parcel parcel) {
            this.mType = parcel.readString();
            this.mUrl = parcel.readString();
            this.mTitle = (Description) parcel.readParcelable(Description.class.getClassLoader());
            this.mSubtitle = (Description) parcel.readParcelable(Description.class.getClassLoader());
        }

        private String getSpecificResourceByLanguage(Description description) {
            String country = Locale.getDefault().getCountry();
            if ("cn".equalsIgnoreCase(country)) {
                if ("zh".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
                    return description.mChs;
                }
            } else if (ServerConstants.OLD_TW_COUNTRY_CODE.equalsIgnoreCase(country)) {
                return description.mCht;
            }
            return description.mEn;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getSubtitle() {
            return getSpecificResourceByLanguage(this.mSubtitle);
        }

        public String getTitle() {
            return getSpecificResourceByLanguage(this.mTitle);
        }

        public String getUrl() {
            return this.mUrl;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mType);
            parcel.writeString(this.mUrl);
            parcel.writeParcelable(this.mTitle, i);
            parcel.writeParcelable(this.mSubtitle, i);
        }
    }

    public PairingConfig(Parcel parcel) {
        this.isSupportPairingEndUI = parcel.readByte() != 0;
        this.mPairingEndUI = (PairingEndUI) parcel.readParcelable(PairingEndUI.class.getClassLoader());
        this.isSupportPairingInWallet = parcel.readByte() != 0;
        this.isSupportPromptUI = parcel.readByte() != 0;
        this.mOPGuideUITitle = parcel.readString();
        this.mOPGuideUIDesc = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PairingEndUIItem> getIntroductionItems() {
        PairingEndUI pairingEndUI = this.mPairingEndUI;
        return pairingEndUI == null ? new ArrayList() : pairingEndUI.getIntroductionItems();
    }

    public List<String> getIntroductionUrls() {
        List<PairingEndUIItem> introductionItems = getIntroductionItems();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < introductionItems.size(); i++) {
            arrayList.add(introductionItems.get(i).getUrl());
        }
        return arrayList;
    }

    public String getOPGuideDesc() {
        return this.mOPGuideUIDesc;
    }

    public String getOPGuideTitle() {
        return this.mOPGuideUITitle;
    }

    public boolean isSupportPairingEndUI() {
        return this.isSupportPairingEndUI;
    }

    public boolean isSupportPairingInWallet() {
        return this.isSupportPairingInWallet;
    }

    public boolean isSupportPromptUI() {
        return this.isSupportPromptUI;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isSupportPairingEndUI ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mPairingEndUI, i);
        parcel.writeByte(this.isSupportPairingInWallet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportPromptUI ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mOPGuideUITitle);
        parcel.writeString(this.mOPGuideUIDesc);
    }
}

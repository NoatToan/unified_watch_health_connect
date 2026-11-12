package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Product implements Parcelable, JSONSerializable, ObjectParser<Product> {
    public static final String KEY_CARD_ART = "cardArt";
    public static final String KEY_INTRO_LINK = "introLink";
    public static final String KEY_INTRO_NAME = "introName";
    public static final String KEY_PRIVACY_POLICY = "privacyPolicy";
    public static final String KEY_PRODUCT_NAME = "productName";
    public static final String KEY_RKE = "rkeFunctions";
    public static final String KEY_SHOW_KEY_NAME = "showKeyName";
    public static final String KEY_SUPPORT_RENAME = "supportRename";
    public static final String KEY_USER_AGREEMENT = "userAgreement";
    private static final String SUPPORT_UWB = "supportUWB";
    private static final String SUPPORT_VEHICLE_RKE = "getVehicleSupportedRke";

    @SerializedName(SUPPORT_VEHICLE_RKE)
    private boolean isScanVehicleRKESupported;

    @SerializedName(KEY_SHOW_KEY_NAME)
    private boolean isShowKeyName;

    @SerializedName(SUPPORT_UWB)
    private boolean isUWBSupported;

    @SerializedName("cardArt")
    private String mCardArt;

    @SerializedName(CardUIInfo.KEY_FONT_COLOR)
    private String mFontColor;

    @SerializedName(KEY_INTRO_LINK)
    private String mIntroLink;

    @SerializedName(KEY_INTRO_NAME)
    private String mIntroName;

    @SerializedName(KEY_PRIVACY_POLICY)
    private String mPrivacyPolicy;

    @SerializedName("productName")
    private String mProductName;

    @SerializedName(KEY_RKE)
    private List<RKE> mRKE;

    @SerializedName(KEY_SUPPORT_RENAME)
    private boolean mSupportRename;

    @SerializedName(KEY_USER_AGREEMENT)
    private String mUserAgreement;
    public static List<String> sRKEType = Arrays.asList("trigger", "toggle");
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() { // from class: com.miui.tsmclient.entity.Product.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product createFromParcel(Parcel parcel) {
            return new Product(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product[] newArray(int i) {
            return new Product[i];
        }
    };

    public Product() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCardArt() {
        return this.mCardArt;
    }

    public String getFontColor() {
        return this.mFontColor;
    }

    public String getIntroLink() {
        return this.mIntroLink;
    }

    public String getIntroName() {
        return this.mIntroName;
    }

    public String getPrivacyPolicy() {
        return this.mPrivacyPolicy;
    }

    public String getProductName() {
        return this.mProductName;
    }

    public List<RKE> getRKEs() {
        ArrayList arrayList = new ArrayList();
        List<RKE> list = this.mRKE;
        if (list != null) {
            for (RKE rke : list) {
                if (sRKEType.contains(rke.getRKEType())) {
                    arrayList.add(rke);
                }
            }
        }
        return arrayList;
    }

    public String getUserAgreement() {
        return this.mUserAgreement;
    }

    public boolean isScanVehicleRKESupported() {
        return this.isScanVehicleRKESupported;
    }

    public boolean isShowKeyName() {
        return this.isShowKeyName;
    }

    public boolean isSupportRename() {
        return this.mSupportRename;
    }

    public boolean isUWBSupported() {
        return this.isUWBSupported;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cardArt", this.mCardArt);
            jSONObject.put("productName", this.mProductName);
            jSONObject.put(KEY_SHOW_KEY_NAME, this.isShowKeyName);
            JSONArray jSONArray = new JSONArray();
            Iterator<RKE> it = this.mRKE.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().serialize());
            }
            jSONObject.put(KEY_RKE, jSONArray);
            jSONObject.put(KEY_INTRO_NAME, this.mIntroName);
            jSONObject.put(KEY_INTRO_LINK, this.mIntroLink);
            jSONObject.put(KEY_USER_AGREEMENT, this.mUserAgreement);
            jSONObject.put(KEY_PRIVACY_POLICY, this.mPrivacyPolicy);
            jSONObject.put(KEY_SUPPORT_RENAME, this.mSupportRename);
            jSONObject.put(SUPPORT_VEHICLE_RKE, this.isScanVehicleRKESupported);
            jSONObject.put(CardUIInfo.KEY_FONT_COLOR, this.mFontColor);
            jSONObject.put(SUPPORT_UWB, this.isUWBSupported);
        } catch (JSONException e) {
            LogUtils.e("serialize product", e);
        }
        return jSONObject;
    }

    public void setUWBSupported(boolean z) {
        this.isUWBSupported = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardArt);
        parcel.writeTypedList(this.mRKE);
        parcel.writeString(this.mProductName);
        parcel.writeByte(this.isShowKeyName ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mIntroName);
        parcel.writeString(this.mIntroLink);
        parcel.writeString(this.mPrivacyPolicy);
        parcel.writeString(this.mUserAgreement);
        parcel.writeByte(this.isScanVehicleRKESupported ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUWBSupported ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSupportRename ? (byte) 1 : (byte) 0);
    }

    public Product(Parcel parcel) {
        this.mCardArt = parcel.readString();
        this.mRKE = parcel.createTypedArrayList(RKE.CREATOR);
        this.mProductName = parcel.readString();
        this.isShowKeyName = parcel.readByte() != 0;
        this.mIntroName = parcel.readString();
        this.mIntroLink = parcel.readString();
        this.mPrivacyPolicy = parcel.readString();
        this.mUserAgreement = parcel.readString();
        this.isScanVehicleRKESupported = parcel.readByte() != 0;
        this.isUWBSupported = parcel.readByte() != 0;
        this.mSupportRename = parcel.readByte() != 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public Product parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mCardArt = jSONObject.optString("cardArt");
            this.mProductName = jSONObject.optString("productName");
            this.isShowKeyName = jSONObject.optBoolean(KEY_SHOW_KEY_NAME);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_RKE);
            if (jSONArrayOptJSONArray == null) {
                this.mRKE = Collections.EMPTY_LIST;
            } else {
                this.mRKE = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        RKE rke = new RKE();
                        rke.parse(jSONArrayOptJSONArray.getJSONObject(i));
                        this.mRKE.add(rke);
                    } catch (JSONException e) {
                        LogUtils.e("parse rke", e);
                    }
                }
            }
            this.mIntroName = jSONObject.optString(KEY_INTRO_NAME);
            this.mIntroLink = jSONObject.optString(KEY_INTRO_LINK);
            this.mUserAgreement = jSONObject.optString(KEY_USER_AGREEMENT);
            this.mPrivacyPolicy = jSONObject.optString(KEY_PRIVACY_POLICY);
            this.mSupportRename = jSONObject.optBoolean(KEY_SUPPORT_RENAME);
            this.isScanVehicleRKESupported = jSONObject.optBoolean(SUPPORT_VEHICLE_RKE);
            this.mFontColor = jSONObject.optString(CardUIInfo.KEY_FONT_COLOR);
            this.isUWBSupported = jSONObject.optBoolean(SUPPORT_UWB);
        }
        return this;
    }
}

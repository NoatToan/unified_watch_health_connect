package com.miui.tsmclient.entity;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.LogUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CardUIInfo implements Parcelable, ObjectParser<CardUIInfo>, JSONSerializable {
    public static final Parcelable.Creator<CardUIInfo> CREATOR = new Parcelable.Creator<CardUIInfo>() { // from class: com.miui.tsmclient.entity.CardUIInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardUIInfo createFromParcel(Parcel parcel) {
            return new CardUIInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardUIInfo[] newArray(int i) {
            return new CardUIInfo[i];
        }
    };
    public static final String KEY_CARD_DISCOUNT = "rideDiscount";
    public static final String KEY_CARD_GIF_BG_URL = "gifUrl";
    public static final String KEY_CARD_UI_INFO = "card_ui_info";
    public static final String KEY_DETAILDESC = "detailDesc";
    public static final String KEY_FAMILY_DESC1 = "familyDesc1";
    public static final String KEY_FAMILY_DESC2 = "familyDesc2";
    public static final String KEY_FONT_COLOR = "fontColor";
    public static final String KEY_ISSUEDDETAILBG = "issuedDetailBg";
    public static final String KEY_ISSUEDLISTBG = "issuedListBg";
    public static final String KEY_ISSUEDLISTBGHD = "issuedListBgHd";
    public static final String KEY_LOGO = "logo";
    public static final String KEY_NEW_CARD_DETAIL_DESC = "newCardDetailDesc";
    public static final String KEY_PERSONAL_CARD_FACE = "personalCardFace";
    public static final String KEY_PREISSUEDDETAILBG = "preIssuedDetailBg";
    public static final String KEY_PREISSUEDLISTBG = "preIssuedListBg";
    public static final String KEY_SIMPLE_RIDE_DISCOUNT = "simpleRideDiscount";
    public static final String KEY_SIMPLE_SUPPORT_AREAS = "simpleSupportAreas";
    public static final String KEY_SUBTITILE = "subTitle";
    public static final String KEY_SUPPORTEDCITY = "supportAreas";
    public static final String KEY_THEME_FG_RULES = "themeFgRules";
    public String mCardDesc;
    public String mCardDetailDesc;
    public String mCardDiscountDesc;
    private String mCardFaceFontColor;
    public String mCardGifBgHdUrl;
    public String mCardIssuedListBgHdUrl;
    public String mCardIssuedListBgUrl;
    public String mCardLogoUrl;
    public String mCardPreIssuedListBgUrl;
    public String mFamilyDesc1;
    public String mFamilyDesc2;
    public String mIssuedDetailBgUrl;
    public String mNewCardDetailDesc;
    public String mPersonalCardFace;
    public String mPreIssuedDetailBgUrl;
    public String mSimpleRideDiscountDesc;
    public String mSimpleSupportAreasDesc;
    public String mSupportedCityDesc;
    private Map<String, String> mThemeFgRules;

    private void doParse(JSONObject jSONObject) {
        this.mCardDesc = jSONObject.optString(KEY_SUBTITILE);
        this.mCardPreIssuedListBgUrl = jSONObject.optString(KEY_PREISSUEDLISTBG);
        this.mCardIssuedListBgUrl = jSONObject.optString(KEY_ISSUEDLISTBG);
        this.mCardLogoUrl = jSONObject.optString(KEY_LOGO);
        this.mPreIssuedDetailBgUrl = jSONObject.optString(KEY_PREISSUEDDETAILBG);
        this.mCardDetailDesc = jSONObject.optString(KEY_DETAILDESC);
        this.mIssuedDetailBgUrl = jSONObject.optString(KEY_ISSUEDDETAILBG);
        this.mCardIssuedListBgHdUrl = jSONObject.optString(KEY_ISSUEDLISTBGHD);
        this.mThemeFgRules = (Map) new Gson().fromJson(jSONObject.optString(KEY_THEME_FG_RULES), new TypeToken<Map<String, String>>() { // from class: com.miui.tsmclient.entity.CardUIInfo.2
        }.getType());
        this.mCardGifBgHdUrl = jSONObject.optString(KEY_CARD_GIF_BG_URL);
        if (jSONObject.has(KEY_PERSONAL_CARD_FACE)) {
            this.mPersonalCardFace = jSONObject.optString(KEY_PERSONAL_CARD_FACE);
        }
        if (jSONObject.has(KEY_SUPPORTEDCITY)) {
            this.mSupportedCityDesc = jSONObject.optString(KEY_SUPPORTEDCITY);
        }
        if (jSONObject.has(KEY_SIMPLE_SUPPORT_AREAS)) {
            this.mSimpleSupportAreasDesc = jSONObject.optString(KEY_SIMPLE_SUPPORT_AREAS);
        }
        if (jSONObject.has(KEY_CARD_DISCOUNT)) {
            this.mCardDiscountDesc = jSONObject.optString(KEY_CARD_DISCOUNT);
        }
        if (jSONObject.has(KEY_SIMPLE_RIDE_DISCOUNT)) {
            this.mSimpleRideDiscountDesc = jSONObject.optString(KEY_SIMPLE_RIDE_DISCOUNT);
        }
        if (jSONObject.has(KEY_NEW_CARD_DETAIL_DESC)) {
            this.mNewCardDetailDesc = jSONObject.optString(KEY_NEW_CARD_DETAIL_DESC);
        }
        if (jSONObject.has(KEY_FAMILY_DESC1)) {
            this.mFamilyDesc1 = jSONObject.optString(KEY_FAMILY_DESC1);
        }
        if (jSONObject.has(KEY_FAMILY_DESC2)) {
            this.mFamilyDesc2 = jSONObject.optString(KEY_FAMILY_DESC2);
        }
        if (jSONObject.has(KEY_FONT_COLOR)) {
            this.mCardFaceFontColor = jSONObject.optString(KEY_FONT_COLOR);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBackground() {
        return TextUtils.isEmpty(this.mPersonalCardFace) ? this.mCardIssuedListBgHdUrl : this.mPersonalCardFace;
    }

    public int getCardFaceFontColor() {
        return Color.parseColor(TextUtils.isEmpty(this.mCardFaceFontColor) ? "#FFFFFF" : this.mCardFaceFontColor);
    }

    public String getThemeFgArt(String str) {
        Map<String, String> map = this.mThemeFgRules;
        return map == null ? "" : map.get(str);
    }

    public void readFromParcel(Parcel parcel) {
        this.mCardDesc = parcel.readString();
        this.mCardPreIssuedListBgUrl = parcel.readString();
        this.mCardIssuedListBgUrl = parcel.readString();
        this.mCardLogoUrl = parcel.readString();
        this.mPreIssuedDetailBgUrl = parcel.readString();
        this.mCardDetailDesc = parcel.readString();
        this.mIssuedDetailBgUrl = parcel.readString();
        this.mCardIssuedListBgHdUrl = parcel.readString();
        this.mThemeFgRules = (Map) parcel.readValue(Map.class.getClassLoader());
        this.mCardGifBgHdUrl = parcel.readString();
        this.mPersonalCardFace = parcel.readString();
        this.mSupportedCityDesc = parcel.readString();
        this.mSimpleSupportAreasDesc = parcel.readString();
        this.mCardDiscountDesc = parcel.readString();
        this.mSimpleRideDiscountDesc = parcel.readString();
        this.mNewCardDetailDesc = parcel.readString();
        this.mFamilyDesc1 = parcel.readString();
        this.mFamilyDesc2 = parcel.readString();
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_SUBTITILE, this.mCardDesc);
            jSONObject.put(KEY_PREISSUEDLISTBG, this.mCardPreIssuedListBgUrl);
            jSONObject.put(KEY_ISSUEDLISTBG, this.mCardIssuedListBgUrl);
            jSONObject.put(KEY_LOGO, this.mCardLogoUrl);
            jSONObject.put(KEY_PREISSUEDDETAILBG, this.mPreIssuedDetailBgUrl);
            jSONObject.put(KEY_DETAILDESC, this.mCardDetailDesc);
            jSONObject.put(KEY_ISSUEDDETAILBG, this.mIssuedDetailBgUrl);
            jSONObject.put(KEY_ISSUEDLISTBGHD, this.mCardIssuedListBgHdUrl);
            jSONObject.put(KEY_THEME_FG_RULES, new Gson().toJson(this.mThemeFgRules));
            jSONObject.put(KEY_CARD_GIF_BG_URL, this.mCardGifBgHdUrl);
            jSONObject.put(KEY_PERSONAL_CARD_FACE, this.mPersonalCardFace);
            jSONObject.put(KEY_SUPPORTEDCITY, this.mSupportedCityDesc);
            jSONObject.put(KEY_SIMPLE_SUPPORT_AREAS, this.mSimpleSupportAreasDesc);
            jSONObject.put(KEY_CARD_DISCOUNT, this.mCardDiscountDesc);
            jSONObject.put(KEY_SIMPLE_RIDE_DISCOUNT, this.mSimpleRideDiscountDesc);
            jSONObject.put(KEY_NEW_CARD_DETAIL_DESC, this.mNewCardDetailDesc);
            jSONObject.put(KEY_FAMILY_DESC1, this.mFamilyDesc1);
            jSONObject.put(KEY_FAMILY_DESC2, this.mFamilyDesc2);
            jSONObject.put(KEY_FONT_COLOR, this.mCardFaceFontColor);
        } catch (JSONException e) {
            LogUtils.e("serialize card ui info to json object failed!", e);
        }
        return jSONObject;
    }

    public void setCardFaceFontColor(String str) {
        this.mCardFaceFontColor = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardDesc);
        parcel.writeString(this.mCardPreIssuedListBgUrl);
        parcel.writeString(this.mCardIssuedListBgUrl);
        parcel.writeString(this.mCardLogoUrl);
        parcel.writeString(this.mPreIssuedDetailBgUrl);
        parcel.writeString(this.mCardDetailDesc);
        parcel.writeString(this.mIssuedDetailBgUrl);
        parcel.writeString(this.mCardIssuedListBgHdUrl);
        parcel.writeValue(this.mThemeFgRules);
        parcel.writeString(this.mCardGifBgHdUrl);
        parcel.writeString(this.mPersonalCardFace);
        parcel.writeString(this.mSupportedCityDesc);
        parcel.writeString(this.mSimpleSupportAreasDesc);
        parcel.writeString(this.mCardDiscountDesc);
        parcel.writeString(this.mSimpleRideDiscountDesc);
        parcel.writeString(this.mNewCardDetailDesc);
        parcel.writeString(this.mFamilyDesc1);
        parcel.writeString(this.mFamilyDesc2);
    }

    private CardUIInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public CardUIInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has(KEY_CARD_UI_INFO)) {
                doParse(jSONObject.optJSONObject(KEY_CARD_UI_INFO));
            } else {
                doParse(jSONObject);
            }
        }
        return this;
    }

    public CardUIInfo() {
    }
}

package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ICCOACarKeyCardInfo extends CarKeyCardInfo implements Parcelable {
    private static final String BLE_ADDRESS = "bleAddress";
    private static final String BLE_BROADCAST_KEY = "bleBroadcastKey";
    private static final String BLE_IRK = "bleIrk";
    public static final Parcelable.Creator<ICCOACarKeyCardInfo> CREATOR = new Parcelable.Creator<ICCOACarKeyCardInfo>() { // from class: com.miui.tsmclient.entity.ICCOACarKeyCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ICCOACarKeyCardInfo createFromParcel(Parcel parcel) {
            return new ICCOACarKeyCardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ICCOACarKeyCardInfo[] newArray(int i) {
            return new ICCOACarKeyCardInfo[i];
        }
    };
    private static final String CUSTOM_NAME = "customName";
    private static final String KEY_ACCESS_PROFILE = "keyAccessProfile";
    private static final String RECEIVER_TYPE = "receiverType";
    private static final String SECURITY_MODE = "securityMode";
    public static final String SHARE_ID = "shareId";
    private static final String SHARING_CHANNEL = "sharingChannel";
    public static final int STATUS_ACTIVATED = 3;
    public static final int STATUS_CONFIRMING = 2;
    public static final int STATUS_DELIVERED = 2;
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_OUT_TIME = 4;
    public static final int STATUS_PENDING = 1;
    public static final int STATUS_REJECTED = 7;
    public static final int STATUS_SUSPENDED = 4;
    public static final int STATUS_TERMINATED = 5;
    public static final int STATUS_UNDELIVERED = 1;
    private static final String SUPPORTED_KEY_ACCESS_PROFILES = "shareKeyAccessProfiles";
    private static final String VEHICLE_WIRELESS_CAPABILITIES = "vehicleWirelessCapabilities";
    private String mBleAddress;
    private String mBleBroadcastKey;
    private String mBleIrk;
    private String mCustomName;

    @SerializedName(KEY_ACCESS_PROFILE)
    private KeyAccessProfile mEntitlement;

    @SerializedName("receiverType")
    private int mReceiver;

    @SerializedName("shareId")
    private String mShareID;
    private int mSharingChannel;

    @SerializedName(SUPPORTED_KEY_ACCESS_PROFILES)
    private SupportedKeyAccessProfiles mSupportedEntitlements;

    @SerializedName("vehicleWirelessCapabilities")
    private String[] mVehicleWirelessCapabilities;

    public static class KeyAccessProfile extends CarKeyCardInfo.AbsPrivilege implements Parcelable, JSONSerializable, ObjectParser<KeyAccessProfile> {
        public static final Parcelable.Creator<KeyAccessProfile> CREATOR = new Parcelable.Creator<KeyAccessProfile>() { // from class: com.miui.tsmclient.entity.ICCOACarKeyCardInfo.KeyAccessProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public KeyAccessProfile createFromParcel(Parcel parcel) {
                return new KeyAccessProfile(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public KeyAccessProfile[] newArray(int i) {
                return new KeyAccessProfile[i];
            }
        };
        public static final String KEY_ACCESS_CODE = "accessCode";
        public static final String KEY_DESC = "description";
        public static final String KEY_NAME = "name";

        @SerializedName(KEY_ACCESS_CODE)
        private String mAccessCode;

        @SerializedName("description")
        private String mDescription;

        @SerializedName("name")
        private String mName;

        public KeyAccessProfile() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getDescription() {
            return this.mName;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getLongDescription() {
            return this.mDescription;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getValue() {
            return this.mAccessCode;
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(KEY_ACCESS_CODE, this.mAccessCode);
                jSONObject.put("name", this.mName);
                jSONObject.put("description", this.mDescription);
            } catch (JSONException e) {
                LogUtils.e("serialize keyAccessProfile", e);
            }
            return jSONObject;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAccessCode);
            parcel.writeString(this.mName);
            parcel.writeString(this.mDescription);
        }

        public KeyAccessProfile(Parcel parcel) {
            this.mAccessCode = parcel.readString();
            this.mName = parcel.readString();
            this.mDescription = parcel.readString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public KeyAccessProfile parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.mAccessCode = jSONObject.optString(KEY_ACCESS_CODE);
                this.mName = jSONObject.optString("name");
                this.mDescription = jSONObject.optString("description");
            }
            return this;
        }
    }

    public static final class SupportedKeyAccessProfiles implements Parcelable, JSONSerializable, ObjectParser<SupportedKeyAccessProfiles> {
        public static final Parcelable.Creator<SupportedKeyAccessProfiles> CREATOR = new Parcelable.Creator<SupportedKeyAccessProfiles>() { // from class: com.miui.tsmclient.entity.ICCOACarKeyCardInfo.SupportedKeyAccessProfiles.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SupportedKeyAccessProfiles createFromParcel(Parcel parcel) {
                return new SupportedKeyAccessProfiles(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SupportedKeyAccessProfiles[] newArray(int i) {
                return new SupportedKeyAccessProfiles[i];
            }
        };
        public static final String KEY_ENTITLEMENTS = "keyAccessProfiles";

        @SerializedName(KEY_ENTITLEMENTS)
        private List<KeyAccessProfile> mEntitlementList;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public List<KeyAccessProfile> getEntitlementList() {
            return this.mEntitlementList;
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (ObjectUtils.isCollectionEmpty(this.mEntitlementList)) {
                    return jSONObject;
                }
                Iterator<KeyAccessProfile> it = this.mEntitlementList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().serialize());
                }
                jSONObject.put(KEY_ENTITLEMENTS, jSONArray);
            } catch (JSONException e) {
                LogUtils.e("serialize SupportedKeyAccessProfiles", e);
            }
            return jSONObject;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.mEntitlementList);
        }

        public SupportedKeyAccessProfiles() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public SupportedKeyAccessProfiles parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_ENTITLEMENTS);
                if (jSONArrayOptJSONArray == null) {
                    this.mEntitlementList = Collections.emptyList();
                } else {
                    this.mEntitlementList = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        KeyAccessProfile keyAccessProfile = new KeyAccessProfile();
                        keyAccessProfile.parse(jSONArrayOptJSONArray.optJSONObject(i));
                        this.mEntitlementList.add(keyAccessProfile);
                    }
                }
            }
            return this;
        }

        private SupportedKeyAccessProfiles(Parcel parcel) {
            this.mEntitlementList = parcel.createTypedArrayList(KeyAccessProfile.CREATOR);
        }
    }

    public ICCOACarKeyCardInfo() {
        super(CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY, false);
        this.mCardGroupId = CardGroupType.ICCOACARKEY.getId();
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return TextUtils.equals(getCardId(), cardInfo.getCardId()) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo
    public String getCardName() {
        return TextUtils.isEmpty(this.mCustomName) ? super.getFriendlyName() : this.mCustomName;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String[] getCardTag() {
        UIConfig uIConfig = getUIConfig();
        return uIConfig != null ? uIConfig.getTag() : super.getCardTag();
    }

    public KeyAccessProfile getKeyAccessProfile() {
        return this.mEntitlement;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public CarKeyCardInfo.AbsPrivilege getPrivilege() {
        return this.mEntitlement;
    }

    public String getShareID() {
        return this.mShareID;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public String getShareableKeys() {
        return "255";
    }

    public int getSharingChannel() {
        return this.mSharingChannel;
    }

    public SupportedKeyAccessProfiles getSupportedKeyAccessProfiles() {
        return this.mSupportedEntitlements;
    }

    public String[] getVehicleWirelessCapabilities() {
        return this.mVehicleWirelessCapabilities;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean isCardActive() {
        return getStatus() == 3;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean isDigitalCarKeyCard() {
        return false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isICCOACarKeyCard() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public boolean isPassiveEntryEnable() {
        String[] strArr = this.mVehicleWirelessCapabilities;
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.equals(str, ProductList.ProductInfo.BLE_TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public boolean isPhoneDeviceType() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean isShowCardName() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public boolean isUASupported() {
        return false;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public boolean isVirtualCard() {
        return TextUtils.isEmpty(this.mShareID);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isVisibleInSwipingCardActivity() {
        UIConfig uIConfig = getUIConfig();
        if (uIConfig == null || uIConfig.getTag() == null) {
            return super.isVisibleInSwipingCardActivity();
        }
        return Arrays.asList(uIConfig.getTag()).contains("NFC") || isSupportedRKEFeature();
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void parseEntitlement(JSONObject jSONObject) {
        if (jSONObject.optJSONObject(KEY_ACCESS_PROFILE) != null) {
            this.mEntitlement = new KeyAccessProfile().parse(jSONObject.optJSONObject(KEY_ACCESS_PROFILE));
        }
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void parseFriendName(JSONObject jSONObject) {
        setFriendlyName(jSONObject.optString("friendlyName"));
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void parseSupportedEntitlement(JSONObject jSONObject) {
        if (jSONObject.optJSONObject(SUPPORTED_KEY_ACCESS_PROFILES) != null) {
            this.mSupportedEntitlements = new SupportedKeyAccessProfiles().parse(jSONObject.optJSONObject(SUPPORTED_KEY_ACCESS_PROFILES));
        }
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            if (this.mVehicleWirelessCapabilities != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.mVehicleWirelessCapabilities) {
                    jSONArray.put(str);
                }
                jSONObjectSerialize.put("vehicleWirelessCapabilities", jSONArray);
            }
            jSONObjectSerialize.put(BLE_BROADCAST_KEY, this.mBleBroadcastKey);
            jSONObjectSerialize.put(BLE_IRK, this.mBleIrk);
            jSONObjectSerialize.put(BLE_ADDRESS, this.mBleAddress);
            jSONObjectSerialize.put("customName", this.mCustomName);
            jSONObjectSerialize.put("shareId", this.mShareID);
            jSONObjectSerialize.put(SHARING_CHANNEL, this.mSharingChannel);
        } catch (JSONException e) {
            LogUtils.e("serialize iccoa digital key info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void serializeFriendName(JSONObject jSONObject) throws JSONException {
        jSONObject.put("friendlyName", getFriendlyName());
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void serializeKeyAccessProfileEntitlement(JSONObject jSONObject) throws JSONException {
        KeyAccessProfile keyAccessProfile = this.mEntitlement;
        if (keyAccessProfile != null) {
            jSONObject.put(KEY_ACCESS_PROFILE, keyAccessProfile.serialize());
        }
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo
    public void serializeKeySupportedAccessProfilesEntitlement(JSONObject jSONObject) throws JSONException {
        SupportedKeyAccessProfiles supportedKeyAccessProfiles = this.mSupportedEntitlements;
        if (supportedKeyAccessProfiles != null) {
            jSONObject.put(SUPPORTED_KEY_ACCESS_PROFILES, supportedKeyAccessProfiles.serialize());
        }
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void setCardName(String str) {
        super.setCardName(str);
        this.mCustomName = str;
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mEntitlement, i);
        parcel.writeParcelable(this.mSupportedEntitlements, i);
        parcel.writeString(this.mCustomName);
        parcel.writeString(this.mShareID);
        parcel.writeStringArray(this.mVehicleWirelessCapabilities);
    }

    @Override // com.miui.tsmclient.entity.CarKeyCardInfo, com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vehicleWirelessCapabilities");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.mVehicleWirelessCapabilities = new String[length];
                for (int i = 0; i < length; i++) {
                    this.mVehicleWirelessCapabilities[i] = jSONArrayOptJSONArray.optString(i);
                }
            }
            this.mBleBroadcastKey = jSONObject.optString(BLE_BROADCAST_KEY);
            this.mBleIrk = jSONObject.optString(BLE_IRK);
            this.mBleAddress = jSONObject.optString(BLE_ADDRESS);
            String strOptString = jSONObject.optString("customName");
            this.mCustomName = strOptString;
            this.mCardName = strOptString;
            this.mShareID = jSONObject.optString("shareId");
            this.mSharingChannel = jSONObject.optInt(SHARING_CHANNEL);
        }
        return this;
    }

    public ICCOACarKeyCardInfo(Parcel parcel) {
        super(parcel);
        this.mEntitlement = (KeyAccessProfile) parcel.readParcelable(KeyAccessProfile.class.getClassLoader());
        this.mSupportedEntitlements = (SupportedKeyAccessProfiles) parcel.readParcelable(SupportedKeyAccessProfiles.class.getClassLoader());
        this.mCustomName = parcel.readString();
        this.mShareID = parcel.readString();
        this.mVehicleWirelessCapabilities = parcel.createStringArray();
    }
}

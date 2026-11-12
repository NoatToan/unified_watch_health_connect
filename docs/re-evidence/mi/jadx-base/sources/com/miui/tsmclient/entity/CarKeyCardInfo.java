package com.miui.tsmclient.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.Constants;
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
public class CarKeyCardInfo extends CardInfo implements Parcelable {
    private static final String ACTIVATION_DESCRIPTION = "activationDescription";
    private static final String BRAND = "brand";
    private static final String CREATED_AT = "createdAt";
    private static final String DEVICE_MODEL = "deviceModel";
    private static final String DEVICE_TYPE = "deviceType";
    public static final String DEVICE_TYPE_PHONE = "PHONE";
    public static final String DEVICE_TYPE_WEAR = "WATCH";
    private static final String ENTITLEMENT = "entitlement";
    private static final String EXPIRATION_TIME = "expiredAt";
    private static final String FRIENDLY_NAME = "name";
    private static final String KEY_CONFIGURATION_NOTIFICATION_TIMESTAMP = "configNotificationTimestamp";
    private static final String KEY_ID = "keyId";
    private static final String KEY_STATUS_IN_CLOUD = "keyStatusInCloud";
    private static final String KEY_TYPE = "keyType";
    private static final String MAILBOX_ID = "mailboxId";
    private static final String MERGE_RKE = "mergeRKE";
    private static final String MODEL = "model";
    public static final String OTHER_FRIENDLY_NAME = "friendlyName";
    private static final String PASSIVE_ENTRY = "passiveEntry";
    private static final String PENDING_ACTION = "pendingAction";
    public static final String PENDING_ACTION_NONE = "NONE";
    public static final String PENDING_ACTION_TERMINATE = "TERMINATE";
    private static final String PRODUCT = "product";
    public static final String SHAREABLE_KEYS = "shareableKeys";
    private static final String SHARED_KEYS = "sharedKeys";
    public static final int SHARE_TYPE_FAIL = 3;
    public static final int SHARE_TYPE_GOING = 2;
    public static final int SHARE_TYPE_OUT_DATE = 4;
    public static final int SHARE_TYPE_PENDING = 1;
    private static final String SHARING_CONFIG = "sharingConfig";
    private static final String SHARING_PASSWORD_REQUIRED = "sharingPasswordRequired";
    private static final String SHARING_SUPPORT = "sharingSupport";
    private static final String STATUS = "status";
    public static final int STATUS_ACTIVE = 1;
    private static final String STATUS_DESC = "statusDesc";
    public static final int STATUS_INACTIVE = 14;
    public static final int STATUS_IN_TERMINATION = 15;
    public static final int STATUS_PERSONALIZING = 2;
    public static final int STATUS_SUSPENDED = 101;
    public static final int STATUS_SUSPEND_BY_ISSUER = 6;
    public static final int STATUS_SUSPEND_LOST_MODE = 7;
    public static final int STATUS_TERMINATED = 105;
    public static final int STATUS_TERMINATED_BY_ISSUER = 10;
    private static final String SUPPORTED_ENTITLEMENTS = "supportedEntitlements";
    private static final String SUSPEND_REASON = "suspendReason";
    private static final String UI_CONFIG = "uiConfig";
    private static final String UI_IDENTIFIER = "uiIdentifier";
    private static final String USER_AUTHENTICATION_POLICY = "userAuthenticationPolicy";
    private static final String VALID_FROM = "validFrom";
    private static final String VALID_TO = "validTo";
    private static final String VEHICLE_BRAND_ID = "vehicleBrandId";
    private static final String VEHICLE_BRAND_NAME = "vehicleBrandName";
    private static final String VEHICLE_ID = "vehicleId";
    private static final String VEHICLE_OEM_ID = "vehicleOEMId";

    @SerializedName(ACTIVATION_DESCRIPTION)
    private List<Description> mActivationDescription;

    @SerializedName("brand")
    private String mBrand;

    @SerializedName(CREATED_AT)
    private String mCreatedAt;

    @SerializedName("deviceModel")
    private String mDeviceModel;

    @SerializedName("deviceType")
    private String mDeviceType;

    @SerializedName(ENTITLEMENT)
    private Entitlement mEntitlement;

    @SerializedName(EXPIRATION_TIME)
    private String mExpirationTime;

    @SerializedName(alternate = {"keyName"}, value = "friendlyName")
    private String mFriendlyName;

    @SerializedName(KEY_CONFIGURATION_NOTIFICATION_TIMESTAMP)
    private long mKeyConfigurationNotificationTime;

    @SerializedName("keyId")
    private String mKeyId;

    @SerializedName("keyType")
    private String mKeyType;

    @SerializedName("mailboxId")
    private String mMailboxId;
    private List<RKE> mMergedRKEFunctions;

    @SerializedName("model")
    private String mModel;
    private int mPassiveEntryStatus;
    private String mPendingAction;

    @SerializedName(PRODUCT)
    private Product mProduct;
    private long mRemainingTime;

    @SerializedName(SHAREABLE_KEYS)
    private String mShareableKeys;

    @SerializedName(SHARED_KEYS)
    private String mSharedKeys;

    @SerializedName(SHARING_CONFIG)
    private SharingConfig mSharingConfig;

    @SerializedName(SHARING_PASSWORD_REQUIRED)
    private boolean mSharingPasswordRequired;

    @SerializedName(SHARING_SUPPORT)
    private boolean mSharingSupport;

    @SerializedName("status")
    private int mStatus;

    @SerializedName("statusDesc")
    private String mStatusDesc;

    @SerializedName(KEY_STATUS_IN_CLOUD)
    private int mStatusInCloud;

    @SerializedName(SUPPORTED_ENTITLEMENTS)
    private SupportedEntitlements mSupportedEntitlements;

    @SerializedName(SUSPEND_REASON)
    private String mSuspendReason;

    @SerializedName(UI_CONFIG)
    private UIConfig mUIConfig;

    @SerializedName(UI_IDENTIFIER)
    private String mUiIdentifier;

    @SerializedName("userAuthenticationPolicy")
    private String mUserAuthenticationPolicy;

    @SerializedName(VALID_FROM)
    private String mValidFrom;

    @SerializedName(VALID_TO)
    private String mValidTo;

    @SerializedName("vehicleBrandId")
    private String mVehicleBrandId;

    @SerializedName(VEHICLE_BRAND_NAME)
    private String mVehicleBrandName;

    @SerializedName("vehicleId")
    private String mVehicleId;

    @SerializedName("vehicleOEMId")
    private String mVehicleOEMId;
    private static final List<String> UA_BRAND_LIST_UNSUPPORTED = Arrays.asList("0082", "0112");
    public static final Parcelable.Creator<CarKeyCardInfo> CREATOR = new Parcelable.Creator<CarKeyCardInfo>() { // from class: com.miui.tsmclient.entity.CarKeyCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarKeyCardInfo createFromParcel(Parcel parcel) {
            return new CarKeyCardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CarKeyCardInfo[] newArray(int i) {
            return new CarKeyCardInfo[i];
        }
    };

    public static abstract class AbsPrivilege implements ICommonKeyPrivilege {
    }

    public static class ActivationOptions implements Parcelable, JSONSerializable, ObjectParser<ActivationOptions> {
        public static final Parcelable.Creator<ActivationOptions> CREATOR = new Parcelable.Creator<ActivationOptions>() { // from class: com.miui.tsmclient.entity.CarKeyCardInfo.ActivationOptions.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ActivationOptions createFromParcel(Parcel parcel) {
                return new ActivationOptions(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ActivationOptions[] newArray(int i) {
                return new ActivationOptions[i];
            }
        };
        private static final String KEY_ACTIVATION_OPTIONS_LIST = "activationOptionsList";
        private static final String KEY_SHARING_PASSWORD_LENGTH = "sharingPasswordLength";
        private List<String> mActivationOptionsList;
        private String mSharingPasswordLength;

        public ActivationOptions() {
        }

        public ActivationOptions(Parcel parcel) {
            this.mActivationOptionsList = parcel.createStringArrayList();
            this.mSharingPasswordLength = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public List<String> getActivationOptionsList() {
            return this.mActivationOptionsList;
        }

        public String getSharingPasswordLength() {
            return this.mSharingPasswordLength;
        }

        public boolean isNeedSharingPasswordActivation() {
            if (ObjectUtils.isCollectionEmpty(this.mActivationOptionsList)) {
                return false;
            }
            return this.mActivationOptionsList.contains("sharingPasswordActivation");
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!ObjectUtils.isCollectionEmpty(this.mActivationOptionsList)) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = this.mActivationOptionsList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    jSONObject.put(KEY_ACTIVATION_OPTIONS_LIST, jSONArray);
                }
                jSONObject.put(KEY_SHARING_PASSWORD_LENGTH, this.mSharingPasswordLength);
            } catch (JSONException e) {
                LogUtils.e("serialize activation options", e);
            }
            return jSONObject;
        }

        public void setActivationOptionsList(List<String> list) {
            this.mActivationOptionsList = list;
        }

        public void setSharingPasswordLength(String str) {
            this.mSharingPasswordLength = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeStringList(this.mActivationOptionsList);
            parcel.writeString(this.mSharingPasswordLength);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public ActivationOptions parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_ACTIVATION_OPTIONS_LIST);
                if (jSONArrayOptJSONArray != null) {
                    this.mActivationOptionsList = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        this.mActivationOptionsList.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                this.mSharingPasswordLength = jSONObject.optString(KEY_SHARING_PASSWORD_LENGTH);
            }
            return this;
        }
    }

    public static class Entitlement extends AbsPrivilege implements Parcelable, JSONSerializable, ObjectParser<Entitlement> {
        public static final Parcelable.Creator<Entitlement> CREATOR = new Parcelable.Creator<Entitlement>() { // from class: com.miui.tsmclient.entity.CarKeyCardInfo.Entitlement.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Entitlement createFromParcel(Parcel parcel) {
                return new Entitlement(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Entitlement[] newArray(int i) {
                return new Entitlement[i];
            }
        };
        public static final String KEY_DESC = "description";
        public static final String KEY_LONG_DESC = "longDescription";
        public static final String KEY_VALUE = "value";

        @SerializedName("description")
        private String mDescription;

        @SerializedName(KEY_LONG_DESC)
        private String mLongDescription;

        @SerializedName("value")
        private String mValue;

        public Entitlement() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getDescription() {
            return this.mDescription;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getLongDescription() {
            return this.mLongDescription;
        }

        @Override // com.miui.tsmclient.entity.ICommonKeyPrivilege
        public String getValue() {
            return this.mValue;
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("value", this.mValue);
                jSONObject.put("description", this.mDescription);
                jSONObject.put(KEY_LONG_DESC, this.mLongDescription);
            } catch (JSONException e) {
                LogUtils.e("serialize entitlement", e);
            }
            return jSONObject;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mValue);
            parcel.writeString(this.mDescription);
            parcel.writeString(this.mLongDescription);
        }

        public Entitlement(Parcel parcel) {
            this.mValue = parcel.readString();
            this.mDescription = parcel.readString();
            this.mLongDescription = parcel.readString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public Entitlement parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.mValue = jSONObject.optString("value");
                this.mDescription = jSONObject.optString("description");
                this.mLongDescription = jSONObject.optString(KEY_LONG_DESC);
            }
            return this;
        }
    }

    public static class SharingConfig implements Parcelable, JSONSerializable, ObjectParser<SharingConfig> {
        public static final Parcelable.Creator<SharingConfig> CREATOR = new Parcelable.Creator<SharingConfig>() { // from class: com.miui.tsmclient.entity.CarKeyCardInfo.SharingConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SharingConfig createFromParcel(Parcel parcel) {
                return new SharingConfig(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SharingConfig[] newArray(int i) {
                return new SharingConfig[i];
            }
        };
        private static final String KEY_ACTIVATION_OPTIONS = "activationOptions";
        private static final String KEY_ACTIVATION_REQUIRED = "activationRequired";
        private static final String KEY_SHARE_TO_WEARABLE = "shareableToWearable";
        private static final String KEY_WEARABLE_APP_LINK = "wearableAppLink";
        private static final String KEY_WEARABLE_APP_LINK_OPEN_TYPE = "wearableAppLinkOpenType";
        private static final String KEY_WEARABLE_APP_PKG_NAME = "wearableAppPkgName";

        @SerializedName(KEY_ACTIVATION_REQUIRED)
        private boolean isActivationRequired;

        @SerializedName(KEY_SHARE_TO_WEARABLE)
        private boolean isShareSupportedToWearable;

        @SerializedName("activationOptions")
        private ActivationOptions mActivationOptions;

        @SerializedName(KEY_WEARABLE_APP_LINK_OPEN_TYPE)
        private int mLinkType;

        @SerializedName(KEY_WEARABLE_APP_LINK)
        private String mWearLink;

        @SerializedName(KEY_WEARABLE_APP_PKG_NAME)
        private String mWearPkg;

        public SharingConfig() {
        }

        public SharingConfig(Parcel parcel) {
            this.isShareSupportedToWearable = parcel.readByte() == 1;
            this.mWearPkg = parcel.readString();
            this.mWearLink = parcel.readString();
            this.mLinkType = parcel.readInt();
            this.isActivationRequired = parcel.readByte() != 0;
            this.mActivationOptions = (ActivationOptions) parcel.readParcelable(ActivationOptions.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActivationOptions getActivationOptions() {
            return this.mActivationOptions;
        }

        public String getWearLink() {
            return this.mWearLink;
        }

        public String getWearPkg() {
            return this.mWearPkg;
        }

        public boolean isActivationRequired() {
            return this.isActivationRequired;
        }

        public boolean isShareSupportedToWearable() {
            return this.isShareSupportedToWearable;
        }

        public boolean isSharingPasswordRequired() {
            ActivationOptions activationOptions = this.mActivationOptions;
            if (activationOptions != null) {
                return activationOptions.isNeedSharingPasswordActivation();
            }
            return false;
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(KEY_SHARE_TO_WEARABLE, this.isShareSupportedToWearable);
                jSONObject.put(KEY_WEARABLE_APP_PKG_NAME, this.mWearPkg);
                jSONObject.put(KEY_WEARABLE_APP_LINK, this.mWearLink);
                jSONObject.put(KEY_WEARABLE_APP_LINK_OPEN_TYPE, this.mLinkType);
                jSONObject.put(KEY_ACTIVATION_REQUIRED, this.isActivationRequired);
                ActivationOptions activationOptions = this.mActivationOptions;
                if (activationOptions != null) {
                    jSONObject.put("activationOptions", activationOptions.serialize());
                }
            } catch (JSONException e) {
                LogUtils.e("serialize wear config", e);
            }
            return jSONObject;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.isShareSupportedToWearable ? (byte) 1 : (byte) 0);
            parcel.writeString(this.mWearPkg);
            parcel.writeString(this.mWearLink);
            parcel.writeInt(this.mLinkType);
            parcel.writeByte(this.isActivationRequired ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.mActivationOptions, i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public SharingConfig parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.isShareSupportedToWearable = jSONObject.optBoolean(KEY_SHARE_TO_WEARABLE);
                this.mWearPkg = jSONObject.optString(KEY_WEARABLE_APP_PKG_NAME);
                this.mWearLink = jSONObject.optString(KEY_WEARABLE_APP_LINK);
                this.mLinkType = jSONObject.optInt(KEY_WEARABLE_APP_LINK_OPEN_TYPE);
                this.isActivationRequired = jSONObject.optBoolean(KEY_ACTIVATION_REQUIRED);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("activationOptions");
                if (jSONObjectOptJSONObject != null) {
                    this.mActivationOptions = new ActivationOptions().parse(jSONObjectOptJSONObject);
                }
            }
            return this;
        }
    }

    public static final class SupportedEntitlements implements Parcelable, JSONSerializable, ObjectParser<SupportedEntitlements> {
        public static final Parcelable.Creator<SupportedEntitlements> CREATOR = new Parcelable.Creator<SupportedEntitlements>() { // from class: com.miui.tsmclient.entity.CarKeyCardInfo.SupportedEntitlements.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SupportedEntitlements createFromParcel(Parcel parcel) {
                return new SupportedEntitlements(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SupportedEntitlements[] newArray(int i) {
                return new SupportedEntitlements[i];
            }
        };
        public static final String KEY_ENTITLEMENTS = "entitlements";

        @SerializedName(KEY_ENTITLEMENTS)
        private List<Entitlement> mEntitlementList;

        public SupportedEntitlements() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public List<Entitlement> getEntitlementList() {
            return this.mEntitlementList;
        }

        @Override // com.miui.tsmclient.database.JSONSerializable
        public JSONObject serialize() {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Entitlement> it = this.mEntitlementList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().serialize());
                }
                jSONObject.put(KEY_ENTITLEMENTS, jSONArray);
            } catch (JSONException e) {
                LogUtils.e("serialize SupportedEntitlements", e);
            }
            return jSONObject;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.mEntitlementList);
        }

        public SupportedEntitlements(Parcel parcel) {
            this.mEntitlementList = parcel.createTypedArrayList(Entitlement.CREATOR);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.miui.tsmclient.entity.ObjectParser
        public SupportedEntitlements parse(JSONObject jSONObject) {
            if (jSONObject != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_ENTITLEMENTS);
                if (jSONArrayOptJSONArray == null) {
                    this.mEntitlementList = Collections.EMPTY_LIST;
                } else {
                    this.mEntitlementList = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        Entitlement entitlement = new Entitlement();
                        entitlement.parse(jSONArrayOptJSONArray.optJSONObject(i));
                        this.mEntitlementList.add(entitlement);
                    }
                }
            }
            return this;
        }
    }

    public CarKeyCardInfo() {
        super(CardInfo.CARD_TYPE_DIGITAL_KEY, true);
        this.mPassiveEntryStatus = 0;
        this.mCardGroupId = CardGroupType.CCC.getId();
        this.mIsSecure = false;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return TextUtils.equals(this.mKeyId, cardInfo.getCardId()) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    public List<Description> getActivationDescription() {
        return this.mActivationDescription;
    }

    public String getActivationDescriptionFormatted() {
        int i;
        StringBuilder sb = new StringBuilder();
        if (!ObjectUtils.isCollectionEmpty(this.mActivationDescription)) {
            int size = this.mActivationDescription.size();
            int i2 = 0;
            while (true) {
                i = size - 1;
                if (i2 >= i) {
                    break;
                }
                int i3 = i2 + 1;
                sb.append(i3);
                sb.append(".");
                sb.append(this.mActivationDescription.get(i2).getSpecificResourceByLanguage());
                sb.append("\n");
                i2 = i3;
            }
            sb.append(size);
            sb.append(".");
            sb.append(this.mActivationDescription.get(i).getSpecificResourceByLanguage());
        }
        return sb.toString();
    }

    public String getBrand() {
        return this.mBrand;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getCardId() {
        return this.mKeyId;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getCardName() {
        return this.mFriendlyName;
    }

    public String getCreatedAt() {
        return this.mCreatedAt;
    }

    public String getDeviceModel() {
        return this.mDeviceModel;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public Entitlement getEntitlement() {
        return this.mEntitlement;
    }

    public String getFriendlyName() {
        return this.mFriendlyName;
    }

    public long getKeyConfigurationNotificationTime() {
        return this.mKeyConfigurationNotificationTime;
    }

    public String getKeyId() {
        return this.mKeyId;
    }

    public String getKeyType() {
        return this.mKeyType;
    }

    public String getMailboxID() {
        return this.mMailboxId;
    }

    public String getModel() {
        return this.mModel;
    }

    public String getPendingAction() {
        return this.mPendingAction;
    }

    public AbsPrivilege getPrivilege() {
        return this.mEntitlement;
    }

    public Product getProduct() {
        return this.mProduct;
    }

    public List<RKE> getRKEFunctions(Context context) {
        Product product = this.mProduct;
        if (product == null) {
            return Collections.emptyList();
        }
        if (!product.isScanVehicleRKESupported()) {
            return this.mProduct.getRKEs();
        }
        if (ObjectUtils.isCollectionEmpty(this.mMergedRKEFunctions)) {
            RKEData rKEData = RKEData.get(context, getCardId());
            if (rKEData.isComplete()) {
                mergeRKEFunctions(rKEData.getAllRKEFunctions());
            }
        }
        return this.mMergedRKEFunctions;
    }

    public long getRemainingTime() {
        return this.mRemainingTime;
    }

    public String getShareableKeys() {
        return this.mShareableKeys;
    }

    public String getSharedKeys() {
        return this.mSharedKeys;
    }

    public SharingConfig getSharingConfig() {
        return this.mSharingConfig;
    }

    public int getStatus() {
        int i = this.mStatusInCloud;
        return i == 15 ? i : this.mStatus;
    }

    public String getStatusDesc() {
        return this.mStatusDesc;
    }

    public SupportedEntitlements getSupportedEntitlements() {
        return this.mSupportedEntitlements;
    }

    public String getSuspendReason() {
        return this.mSuspendReason;
    }

    public UIConfig getUIConfig() {
        return this.mUIConfig;
    }

    public String getUiIdentifier() {
        return this.mUiIdentifier;
    }

    public String getUserAuthenticationPolicy() {
        return this.mUserAuthenticationPolicy;
    }

    public String getValidFrom() {
        return this.mValidFrom;
    }

    public String getValidTo() {
        return this.mValidTo;
    }

    public String getVehicleBrandId() {
        return this.mVehicleBrandId;
    }

    public String getVehicleBrandName() {
        return this.mVehicleBrandName;
    }

    public String getVehicleId() {
        return this.mVehicleId;
    }

    public String getVehicleOEMId() {
        return this.mVehicleOEMId;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isCardActive() {
        return this.mStatus == 1;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isDigitalCarKeyCard() {
        return true;
    }

    public boolean isOwnerType() {
        return TextUtils.equals(this.mKeyType, "OWNER");
    }

    public boolean isPassiveEntryEnable() {
        return this.mPassiveEntryStatus == 1;
    }

    public boolean isPassiveEntryValid() {
        return this.mPassiveEntryStatus > 0;
    }

    public boolean isPhoneDeviceType() {
        return TextUtils.equals(this.mDeviceType, "PHONE");
    }

    public boolean isSharingPasswordRequired() {
        return this.mSharingPasswordRequired;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isShowCardName() {
        Product product = this.mProduct;
        return product != null && product.isShowKeyName();
    }

    public boolean isSupportToModifyName() {
        return this.mProduct.isSupportRename();
    }

    public boolean isSupportToShare() {
        return this.mSharingSupport;
    }

    public boolean isSupportedRKEFeature() {
        Product product = getProduct();
        return (product == null || ObjectUtils.isCollectionEmpty(product.getRKEs())) ? false : true;
    }

    public boolean isUASupported() {
        return !UA_BRAND_LIST_UNSUPPORTED.contains(this.mVehicleBrandId);
    }

    public boolean isUpdateKeyConfiguration() {
        return this.mKeyConfigurationNotificationTime > 0;
    }

    public boolean isVirtualCard() {
        return TextUtils.isEmpty(this.mMailboxId);
    }

    public void mergeRKEFunctions(List<String> list) {
        Product product;
        if (ObjectUtils.isCollectionEmpty(list) || (product = getProduct()) == null) {
            return;
        }
        List<RKE> rKEs = product.getRKEs();
        if (ObjectUtils.isCollectionEmpty(rKEs)) {
            return;
        }
        this.mMergedRKEFunctions = new ArrayList();
        for (int i = 0; i < rKEs.size(); i++) {
            RKE rke = rKEs.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (TextUtils.equals(rke.getFunctionId(), list.get(i2))) {
                    this.mMergedRKEFunctions.add(rke);
                    break;
                }
            }
        }
    }

    public void parseEntitlement(JSONObject jSONObject) {
        if (jSONObject.optJSONObject(ENTITLEMENT) != null) {
            this.mEntitlement = new Entitlement().parse(jSONObject.optJSONObject(ENTITLEMENT));
        }
    }

    public void parseFriendName(JSONObject jSONObject) {
        this.mFriendlyName = jSONObject.optString("name");
    }

    public void parseSupportedEntitlement(JSONObject jSONObject) {
        if (jSONObject.optJSONObject(SUPPORTED_ENTITLEMENTS) != null) {
            this.mSupportedEntitlements = new SupportedEntitlements().parse(jSONObject.optJSONObject(SUPPORTED_ENTITLEMENTS));
        }
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObjectSerialize = super.serialize();
        try {
            jSONObjectSerialize.put("keyId", this.mKeyId);
            serializeFriendName(jSONObjectSerialize);
            jSONObjectSerialize.put("status", this.mStatus);
            jSONObjectSerialize.put("statusDesc", this.mStatusDesc);
            jSONObjectSerialize.put("keyType", this.mKeyType);
            jSONObjectSerialize.put(VALID_FROM, this.mValidFrom);
            jSONObjectSerialize.put(VALID_TO, this.mValidTo);
            jSONObjectSerialize.put(CREATED_AT, this.mCreatedAt);
            jSONObjectSerialize.put("vehicleId", this.mVehicleId);
            jSONObjectSerialize.put("vehicleOEMId", this.mVehicleOEMId);
            jSONObjectSerialize.put(VEHICLE_BRAND_NAME, this.mVehicleBrandName);
            jSONObjectSerialize.put("vehicleBrandId", this.mVehicleBrandId);
            jSONObjectSerialize.put(SHARED_KEYS, this.mSharedKeys);
            jSONObjectSerialize.put(SHAREABLE_KEYS, this.mShareableKeys);
            jSONObjectSerialize.put(UI_IDENTIFIER, this.mUiIdentifier);
            jSONObjectSerialize.put(SHARING_PASSWORD_REQUIRED, this.mSharingPasswordRequired);
            jSONObjectSerialize.put("brand", this.mBrand);
            jSONObjectSerialize.put("model", this.mModel);
            jSONObjectSerialize.put("userAuthenticationPolicy", this.mUserAuthenticationPolicy);
            serializeKeyAccessProfileEntitlement(jSONObjectSerialize);
            serializeKeySupportedAccessProfilesEntitlement(jSONObjectSerialize);
            jSONObjectSerialize.put(SUSPEND_REASON, this.mSuspendReason);
            Product product = this.mProduct;
            if (product != null) {
                jSONObjectSerialize.put(PRODUCT, product.serialize());
            }
            UIConfig uIConfig = this.mUIConfig;
            if (uIConfig != null) {
                jSONObjectSerialize.put(UI_CONFIG, uIConfig.serialize());
            }
            jSONObjectSerialize.put(SHARING_SUPPORT, this.mSharingSupport);
            if (!ObjectUtils.isCollectionEmpty(this.mMergedRKEFunctions)) {
                JSONArray jSONArray = new JSONArray();
                Iterator<RKE> it = this.mMergedRKEFunctions.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().serialize());
                }
                jSONObjectSerialize.put(MERGE_RKE, jSONArray);
            }
            SharingConfig sharingConfig = this.mSharingConfig;
            if (sharingConfig != null) {
                jSONObjectSerialize.put(SHARING_CONFIG, sharingConfig.serialize());
            }
            jSONObjectSerialize.put(PENDING_ACTION, this.mPendingAction);
            if (!ObjectUtils.isCollectionEmpty(this.mActivationDescription)) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<Description> it2 = this.mActivationDescription.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().serialize());
                }
                jSONObjectSerialize.put(ACTIVATION_DESCRIPTION, jSONArray2);
            }
            jSONObjectSerialize.put(PASSIVE_ENTRY, this.mPassiveEntryStatus);
            jSONObjectSerialize.put(KEY_STATUS_IN_CLOUD, this.mStatusInCloud);
            jSONObjectSerialize.put(KEY_CONFIGURATION_NOTIFICATION_TIMESTAMP, this.mKeyConfigurationNotificationTime);
        } catch (JSONException e) {
            LogUtils.e("serialize digitlakey info to json object failed!", e);
        }
        return jSONObjectSerialize;
    }

    public void serializeFriendName(JSONObject jSONObject) throws JSONException {
        jSONObject.put("name", this.mFriendlyName);
    }

    public void serializeKeyAccessProfileEntitlement(JSONObject jSONObject) throws JSONException {
        Entitlement entitlement = this.mEntitlement;
        if (entitlement != null) {
            jSONObject.put(ENTITLEMENT, entitlement.serialize());
        }
    }

    public void serializeKeySupportedAccessProfilesEntitlement(JSONObject jSONObject) throws JSONException {
        SupportedEntitlements supportedEntitlements = this.mSupportedEntitlements;
        if (supportedEntitlements != null) {
            jSONObject.put(SUPPORTED_ENTITLEMENTS, supportedEntitlements.serialize());
        }
    }

    public void setFriendlyName(String str) {
        this.mFriendlyName = str;
    }

    public void setKeyConfigurationNotificationTime(long j) {
        this.mKeyConfigurationNotificationTime = j;
    }

    public void setKeyId(String str) {
        this.mKeyId = str;
    }

    public void setPassiveEntry(boolean z) {
        this.mPassiveEntryStatus = z ? 1 : 2;
    }

    public void setRemainingTime(long j) {
        this.mRemainingTime = j;
    }

    public void setShareableKeys(String str) {
        this.mShareableKeys = str;
    }

    public void setSharedKeys(String str) {
        this.mSharedKeys = str;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setUIConfig(UIConfig uIConfig) {
        this.mUIConfig = uIConfig;
    }

    public void setVehicleBrandId(String str) {
        this.mVehicleBrandId = str;
    }

    public void setVehicleBrandName(String str) {
        this.mVehicleBrandName = str;
    }

    public void setVehicleOEMId(String str) {
        this.mVehicleOEMId = str;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mKeyId);
        parcel.writeString(this.mFriendlyName);
        parcel.writeInt(this.mStatus);
        parcel.writeString(this.mStatusDesc);
        parcel.writeString(this.mKeyType);
        parcel.writeString(this.mValidFrom);
        parcel.writeString(this.mValidTo);
        parcel.writeString(this.mCreatedAt);
        parcel.writeString(this.mVehicleId);
        parcel.writeString(this.mVehicleOEMId);
        parcel.writeString(this.mVehicleBrandName);
        parcel.writeString(this.mVehicleBrandId);
        parcel.writeString(this.mSharedKeys);
        parcel.writeString(this.mShareableKeys);
        parcel.writeString(this.mUiIdentifier);
        parcel.writeByte(this.mSharingPasswordRequired ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mBrand);
        parcel.writeString(this.mModel);
        parcel.writeString(this.mUserAuthenticationPolicy);
        parcel.writeParcelable(this.mEntitlement, i);
        parcel.writeParcelable(this.mSupportedEntitlements, i);
        parcel.writeString(this.mSuspendReason);
        parcel.writeParcelable(this.mProduct, i);
        parcel.writeParcelable(this.mUIConfig, i);
        parcel.writeByte(this.mSharingSupport ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.mMergedRKEFunctions);
        parcel.writeParcelable(this.mSharingConfig, i);
        parcel.writeTypedList(this.mActivationDescription);
        parcel.writeString(this.mMailboxId);
        parcel.writeString(this.mExpirationTime);
        parcel.writeLong(this.mKeyConfigurationNotificationTime);
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        super.parse(jSONObject);
        if (jSONObject != null) {
            this.mKeyId = jSONObject.optString("keyId");
            parseFriendName(jSONObject);
            this.mCardName = this.mFriendlyName;
            this.mStatus = jSONObject.optInt("status");
            this.mStatusDesc = jSONObject.optString("statusDesc");
            this.mKeyType = jSONObject.optString("keyType");
            this.mValidFrom = jSONObject.optString(VALID_FROM);
            this.mValidTo = jSONObject.optString(VALID_TO);
            this.mCreatedAt = jSONObject.optString(CREATED_AT);
            this.mVehicleId = jSONObject.optString("vehicleId");
            this.mVehicleOEMId = jSONObject.optString("vehicleOEMId");
            this.mVehicleBrandId = jSONObject.optString("vehicleBrandId");
            this.mVehicleBrandName = jSONObject.optString(VEHICLE_BRAND_NAME);
            this.mSharedKeys = jSONObject.optString(SHARED_KEYS);
            this.mShareableKeys = jSONObject.optString(SHAREABLE_KEYS);
            this.mUiIdentifier = jSONObject.optString(UI_IDENTIFIER);
            this.mSharingPasswordRequired = jSONObject.optBoolean(SHARING_PASSWORD_REQUIRED);
            this.mBrand = jSONObject.optString("brand");
            this.mModel = jSONObject.optString("model");
            this.mUserAuthenticationPolicy = jSONObject.optString("userAuthenticationPolicy");
            parseEntitlement(jSONObject);
            parseSupportedEntitlement(jSONObject);
            this.mSuspendReason = jSONObject.optString(SUSPEND_REASON);
            if (jSONObject.optJSONObject(PRODUCT) != null) {
                Product product = new Product().parse(jSONObject.optJSONObject(PRODUCT));
                this.mProduct = product;
                this.mCardUIInfo.mCardIssuedListBgHdUrl = product == null ? Constants.DIGITAL_CAR_KEY_DEFAULT_ART : product.getCardArt();
                Product product2 = this.mProduct;
                if (product2 != null) {
                    this.mCardUIInfo.setCardFaceFontColor(product2.getFontColor());
                }
            }
            if (jSONObject.optJSONObject(UI_CONFIG) != null) {
                this.mUIConfig = new UIConfig().parse(jSONObject.optJSONObject(UI_CONFIG));
            }
            this.mSharingSupport = jSONObject.optBoolean(SHARING_SUPPORT);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(MERGE_RKE);
            if (jSONArrayOptJSONArray == null) {
                this.mMergedRKEFunctions = Collections.emptyList();
            } else {
                this.mMergedRKEFunctions = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    RKE rke = new RKE();
                    rke.parse(jSONArrayOptJSONArray.optJSONObject(i));
                    this.mMergedRKEFunctions.add(rke);
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SHARING_CONFIG);
            if (jSONObjectOptJSONObject != null) {
                SharingConfig sharingConfig = new SharingConfig();
                this.mSharingConfig = sharingConfig;
                sharingConfig.parse(jSONObjectOptJSONObject);
            }
            this.mPendingAction = jSONObject.optString(PENDING_ACTION);
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(ACTIVATION_DESCRIPTION);
            if (jSONArrayOptJSONArray2 == null) {
                this.mActivationDescription = Collections.emptyList();
            } else {
                this.mActivationDescription = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    Description description = new Description();
                    description.parse(jSONArrayOptJSONArray2.optJSONObject(i2));
                    this.mActivationDescription.add(description);
                }
            }
            this.mPassiveEntryStatus = jSONObject.optInt(PASSIVE_ENTRY);
            this.mStatusInCloud = jSONObject.optInt(KEY_STATUS_IN_CLOUD);
            this.mKeyConfigurationNotificationTime = jSONObject.optLong(KEY_CONFIGURATION_NOTIFICATION_TIMESTAMP);
        }
        return this;
    }

    public CarKeyCardInfo(String str, boolean z) {
        super(str, z);
        this.mPassiveEntryStatus = 0;
    }

    public CarKeyCardInfo(Parcel parcel) {
        super(parcel);
        this.mPassiveEntryStatus = 0;
        this.mKeyId = parcel.readString();
        this.mFriendlyName = parcel.readString();
        this.mStatus = parcel.readInt();
        this.mStatusDesc = parcel.readString();
        this.mKeyType = parcel.readString();
        this.mValidFrom = parcel.readString();
        this.mValidTo = parcel.readString();
        this.mCreatedAt = parcel.readString();
        this.mVehicleId = parcel.readString();
        this.mVehicleOEMId = parcel.readString();
        this.mVehicleBrandName = parcel.readString();
        this.mVehicleBrandId = parcel.readString();
        this.mSharedKeys = parcel.readString();
        this.mShareableKeys = parcel.readString();
        this.mUiIdentifier = parcel.readString();
        this.mSharingPasswordRequired = parcel.readByte() != 0;
        this.mBrand = parcel.readString();
        this.mModel = parcel.readString();
        this.mUserAuthenticationPolicy = parcel.readString();
        this.mEntitlement = (Entitlement) parcel.readParcelable(Entitlement.class.getClassLoader());
        this.mSupportedEntitlements = (SupportedEntitlements) parcel.readParcelable(SupportedEntitlements.class.getClassLoader());
        this.mSuspendReason = parcel.readString();
        this.mProduct = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.mUIConfig = (UIConfig) parcel.readParcelable(UIConfig.class.getClassLoader());
        this.mSharingSupport = parcel.readByte() != 0;
        this.mMergedRKEFunctions = parcel.createTypedArrayList(RKE.CREATOR);
        this.mSharingConfig = (SharingConfig) parcel.readParcelable(SharingConfig.class.getClassLoader());
        this.mActivationDescription = parcel.createTypedArrayList(Description.CREATOR);
        this.mMailboxId = parcel.readString();
        this.mExpirationTime = parcel.readString();
        this.mKeyConfigurationNotificationTime = parcel.readLong();
    }
}

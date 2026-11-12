package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class KeyTrackingInfo {

    @SerializedName(CommonConstants.KEY_BRAND)
    private String mBrand;

    @SerializedName("model")
    private String mModel;

    @SerializedName("uiBundle")
    private UiBundle mUiBundle;

    @SerializedName("vehicleMobilizationData")
    private VehicleMobilizationData mVehicleMobilizationData;

    public static class Entitlement {

        @SerializedName("description")
        private String mDescription;

        @SerializedName(CarKeyCardInfo.Entitlement.KEY_LONG_DESC)
        private String mLongDescription;

        @SerializedName("value")
        private String mValue;
    }

    public static class SupportedEntitlements {

        @SerializedName(CarKeyCardInfo.SupportedEntitlements.KEY_ENTITLEMENTS)
        private List<Entitlement> mEntitlementList;
    }

    public static class UiBundle {

        @SerializedName("entitlement")
        private Entitlement mEntitlement;

        @SerializedName(TSMAuthContants.PARAM_KEY_VALID_FROM)
        private String mKeyValidFrom;

        @SerializedName(TSMAuthContants.PARAM_KEY_VALID_TO)
        private String mKeyValidTo;

        @SerializedName("ktsSignature")
        private String mKtsSignature;

        @SerializedName(CarKeyCardInfo.SHAREABLE_KEYS)
        private String mShareableKeys;

        @SerializedName("sharedKeys")
        private String mSharedKeys;

        @SerializedName("sharingPasswordRequired")
        private boolean mSharingPasswordRequired;

        @SerializedName("supportedEntitlements")
        private SupportedEntitlements mSupportedEntitlements;

        @SerializedName("uiIdentifier")
        private String mUiIdentifier;

        public String getKeyValidFrom() {
            return this.mKeyValidFrom;
        }

        public String getKeyValidTo() {
            return this.mKeyValidTo;
        }

        public String getKtsSignature() {
            return this.mKtsSignature;
        }

        public String getShareableKeys() {
            return this.mShareableKeys;
        }

        public String getSharedKeys() {
            return this.mSharedKeys;
        }

        public boolean getSharingPasswordRequired() {
            return this.mSharingPasswordRequired;
        }

        public String getUiIdentifier() {
            return this.mUiIdentifier;
        }

        public String toJson() {
            return new Gson().toJson(this);
        }
    }

    public static class VehicleMobilizationData {

        @SerializedName("data")
        private String mData;

        @SerializedName("ephemeralPublicKey")
        private String mEphemeralPublicKey;

        @SerializedName("publicKeyHash")
        private String mPublicKeyHash;

        @SerializedName("version")
        private String mVersion;

        public String getData() {
            return this.mData;
        }

        public String getEphemeralPublicKey() {
            return this.mEphemeralPublicKey;
        }

        public String getPublicKeyHash() {
            return this.mPublicKeyHash;
        }

        public String getVersion() {
            return this.mVersion;
        }

        public String toJson() {
            return new Gson().toJson(this);
        }
    }

    public String getBrand() {
        return this.mBrand;
    }

    public String getModel() {
        return this.mModel;
    }

    public UiBundle getUiBundle() {
        return this.mUiBundle;
    }

    public VehicleMobilizationData getVehicleMobilizationData() {
        return this.mVehicleMobilizationData;
    }
}

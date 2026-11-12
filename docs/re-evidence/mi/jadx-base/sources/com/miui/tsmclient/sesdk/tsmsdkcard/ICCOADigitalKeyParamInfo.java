package com.miui.tsmclient.sesdk.tsmsdkcard;

import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.entity.ObjectParser;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.util.LogUtils;
import com.tsmclient.smartcard.Coder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ICCOADigitalKeyParamInfo implements JSONSerializable, ObjectParser<ICCOADigitalKeyParamInfo> {
    private final String mBrandID;
    private final String mFriendSessionID;
    private final String mFriendlyName;
    private String mKeyId;
    private final String mShareID;
    private final int mSourceType;
    private final String mVehicleId;
    private final String mWirelessCapabilities;

    public static class Builder {
        private String mBrandID;
        private String mFriendSessionID;
        private String mFriendlyName;
        private String mShareID;
        private int mSourceType = 2;
        private String mVehicleId;
        private String mWirelessCapabilities;

        public ICCOADigitalKeyParamInfo build() {
            return new ICCOADigitalKeyParamInfo(this.mFriendlyName, this.mVehicleId, this.mFriendSessionID, this.mShareID, this.mBrandID, this.mWirelessCapabilities, this.mSourceType);
        }

        public Builder setBrandID(String str) {
            this.mBrandID = str;
            return this;
        }

        public Builder setFriendSessionID(String str) {
            this.mFriendSessionID = str;
            return this;
        }

        public Builder setFriendlyName(String str) {
            this.mFriendlyName = str;
            return this;
        }

        public Builder setShareID(String str) {
            this.mShareID = str;
            return this;
        }

        public Builder setSourceType(int i) {
            this.mSourceType = i;
            return this;
        }

        public Builder setVehicleId(String str) {
            this.mVehicleId = str;
            return this;
        }

        public Builder setWirelessCapabilities(String str) {
            this.mWirelessCapabilities = str;
            return this;
        }
    }

    private ICCOADigitalKeyParamInfo(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.mFriendlyName = str;
        this.mVehicleId = str2;
        this.mFriendSessionID = str3;
        this.mShareID = str4;
        this.mBrandID = str5;
        this.mWirelessCapabilities = str6;
        this.mSourceType = i;
    }

    public int getSourceType() {
        return this.mSourceType;
    }

    public byte[] getVehicleId() {
        return Coder.hexStringToBytes(this.mVehicleId);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public ICCOADigitalKeyParamInfo parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        ICCOADigitalKeyParamInfo iCCOADigitalKeyParamInfoBuild = new Builder().setFriendlyName(jSONObject.optString("friendlyName")).setVehicleId(jSONObject.optString("vehicleId")).setFriendSessionID(jSONObject.optString("sessionId")).setShareID(jSONObject.optString("shareId")).setBrandID(jSONObject.optString("vehicleBrandId")).setWirelessCapabilities(jSONObject.optString("vehicleWirelessCapabilities")).setSourceType(jSONObject.optInt(SDKConstants.SOURCE_TYPE, 2)).build();
        iCCOADigitalKeyParamInfoBuild.setKeyId(jSONObject.optString("keyId"));
        return iCCOADigitalKeyParamInfoBuild;
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("friendlyName", this.mFriendlyName);
            jSONObject.put("sessionId", this.mFriendSessionID);
            jSONObject.put("vehicleBrandId", this.mBrandID);
            jSONObject.put("vehicleId", this.mVehicleId);
            jSONObject.put("shareId", this.mShareID);
            jSONObject.put("vehicleWirelessCapabilities", this.mWirelessCapabilities);
            jSONObject.put(SDKConstants.SOURCE_TYPE, this.mSourceType);
            jSONObject.put("keyId", this.mKeyId);
        } catch (JSONException e) {
            LogUtils.e("serialize error for iccoa digital key param ", e);
        }
        return jSONObject;
    }

    public void setKeyId(String str) {
        this.mKeyId = str;
    }

    public String toString() {
        return serialize().toString();
    }
}

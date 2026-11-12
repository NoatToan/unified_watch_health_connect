package com.xiaomi.digitalkey.wearable.keyshare;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import com.xiaomi.digitalkey.wearable.utils.CryptoUtil;
import com.xiaomi.digitalkey.wearable.utils.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.m12;
import org.bouncycastle.util.encoders.DecoderException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class GenericSharingData {
    private static final boolean ERR = true;
    private static final String LogTag = "SDK-DKF-GenericSharingData:";

    @SerializedName(TSMAuthContants.PARAM_ACTIVATION_OPTIONS)
    String[] mActivationOptions;

    @SerializedName("authType")
    String[] mAuthType;

    @SerializedName("friendKeyId")
    String mFriendKeyId;

    @SerializedName("pinLength")
    int mPinLen;

    @SerializedName("sharingData")
    String mSharingData;

    @SerializedName(TSMAuthContants.PARAM_SHARE_DATA_TYPE)
    int mSharingDataType;

    @SerializedName("sharingId")
    String mSharingId;
    private static final boolean DEBUG = Logger.LOG_SHARE;
    static String SHARING_DATA = "sharingData";
    static String SHARING_DATA_TYPE = TSMAuthContants.PARAM_SHARE_DATA_TYPE;
    static String SHARING_ID = "sharingId";
    static String FRIEND_KEY_ID = "friendKeyId";
    static String AUTH_TYPE = "authType";
    static String PIN_LENGTH = "pinLength";
    static String GENERIC_SHARING_DATA = "genericSharingData";
    static String ACTIVATION_OPTION = TSMAuthContants.PARAM_ACTIVATION_OPTIONS;
    static String GENERIC_SHARING_CONTENT = MiuiCursorConstants.CONTENT;

    public static GenericSharingData createFromXPSEncryptedData(byte[] bArr, byte[] bArr2) {
        try {
            String string = new JSONObject(new String(bArr)).getString("data");
            boolean z = DEBUG;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("encrypted Json data: ");
                sb.append(string);
            }
            String str = new String(CryptoUtil.decrypt_share_data(m12.a(string), bArr2));
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("decrypted Json data: ");
                sb2.append(str);
            }
            return (GenericSharingData) new Gson().fromJson(new JSONObject(new JSONObject(str).getString(GENERIC_SHARING_CONTENT)).getString(GENERIC_SHARING_DATA), GenericSharingData.class);
        } catch (DecoderException e) {
            e = e;
            e.printStackTrace();
            return null;
        } catch (JSONException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        }
    }

    public byte[] getSharingData() {
        return ByteUtils.fromHexString(this.mSharingData);
    }

    public void setActivationOptions(String[] strArr) {
        this.mActivationOptions = strArr;
    }

    public void setAuthType(String[] strArr) {
        this.mAuthType = strArr;
    }

    public void setFriendKeyId(String str) {
        this.mFriendKeyId = str;
    }

    public void setPinLen(int i) {
        this.mPinLen = i;
    }

    public void setSharingData(String str) {
        this.mSharingData = str;
    }

    public void setSharingDataType(int i) {
        this.mSharingDataType = i;
    }

    public void setSharingId(String str) {
        this.mSharingId = str;
    }

    public String toJsonString() {
        try {
            String json = new Gson().toJson(this, GenericSharingData.class);
            if (DEBUG) {
                StringBuilder sb = new StringBuilder();
                sb.append("Content Json String: ");
                sb.append(json);
            }
            JSONObject jSONObject = new JSONObject(json);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject2.put(GENERIC_SHARING_DATA, jSONObject);
            jSONObject3.put(GENERIC_SHARING_CONTENT, jSONObject2);
            return jSONObject3.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return this.mSharingData;
    }
}

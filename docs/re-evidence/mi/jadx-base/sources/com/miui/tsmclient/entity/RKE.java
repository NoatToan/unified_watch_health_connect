package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.database.JSONSerializable;
import com.miui.tsmclient.util.CarKeyConstants;
import com.miui.tsmclient.util.LogUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class RKE implements Parcelable, JSONSerializable, ObjectParser<RKE> {
    public static final Parcelable.Creator<RKE> CREATOR = new Parcelable.Creator<RKE>() { // from class: com.miui.tsmclient.entity.RKE.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RKE createFromParcel(Parcel parcel) {
            return new RKE(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RKE[] newArray(int i) {
            return new RKE[i];
        }
    };
    public static final String KEY_ACTION_ID = "actionId";
    private static final String KEY_ACTION_PROMPT = "actionPrompt";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_FUNCTION_ID = "functionId";
    public static final String KEY_ICON = "icon";
    public static final String KEY_RKE_ID = "rkeId";
    public static final String KEY_RKE_TYPE = "type";
    public static final String KEY_STATUS_ID_ARRAY = "statusId";
    public static final int STATUS_FUNCTION_SUCCESSFULLY_EXECUTED = 0;
    public static final int STATUS_START_EXECUTION_STATUS_ERROR = 16;

    @SerializedName(KEY_ACTION_ID)
    private String[] mActionIds;

    @SerializedName(KEY_ACTION_PROMPT)
    private ActionPrompt mActionPrompt;
    private int mCurrentActionId;

    @SerializedName("description")
    private String mDescription;
    private int mExecutionStatus;

    @SerializedName(KEY_FUNCTION_ID)
    private String mFunctionId;

    @SerializedName("icon")
    private String mIcon;

    @SerializedName("type")
    private String mRKEType;

    @SerializedName(KEY_RKE_ID)
    private int mRkeId;
    private int mStatusId = -1;

    @SerializedName(KEY_STATUS_ID_ARRAY)
    private String[] mStatusIds;
    private String mType;

    public RKE() {
    }

    private int getActionIdOpen() {
        TextUtils.equals(this.mType, CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY);
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RKE) {
            return TextUtils.equals(((RKE) obj).mFunctionId, getFunctionId());
        }
        return false;
    }

    public int getActionId(int i) {
        String[] strArr = this.mActionIds;
        if (strArr == null || i < 0 || i >= strArr.length) {
            return -1;
        }
        return Integer.valueOf(strArr[i], 16).intValue();
    }

    public int getCurrentActionId() {
        return this.mCurrentActionId;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getExecutionSuccessfulTip(int i) {
        if (this.mActionPrompt == null) {
            return "";
        }
        if (isToggle()) {
            return i == getActionIdOpen() ? this.mActionPrompt.getOpenPrompt() : this.mActionPrompt.getClosePrompt();
        }
        return this.mActionPrompt.getPrompt();
    }

    public int getFinalStatusId() {
        if (TextUtils.equals(this.mType, CardInfo.CARD_TYPE_DIGITAL_KEY)) {
            return getActionId(0);
        }
        String[] strArr = this.mStatusIds;
        if (strArr == null || strArr.length < 1) {
            return -1;
        }
        return Integer.valueOf(strArr[1], 16).intValue();
    }

    public String getFunctionId() {
        return this.mFunctionId;
    }

    public int getFunctionIdForInt() {
        return Integer.valueOf(this.mFunctionId, 16).intValue();
    }

    public String getIcon() {
        return this.mIcon;
    }

    public int getInitStatusId() {
        String[] strArr = this.mStatusIds;
        if (strArr == null || strArr.length < 1) {
            return -1;
        }
        return Integer.valueOf(strArr[0], 16).intValue();
    }

    public int getMappingStatusId(int i) {
        if (TextUtils.equals(this.mType, CardInfo.CARD_TYPE_DIGITAL_KEY)) {
            List<Integer> list = CarKeyConstants.sRKEStatusOfCCC.get(Integer.valueOf(getFunctionIdForInt()));
            return list == null ? i : !list.contains(Integer.valueOf(i)) ? 1 : 0;
        }
        if (this.mStatusIds == null) {
            return i;
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.mStatusIds;
            if (i2 >= strArr.length || i == Integer.valueOf(strArr[i2], 16).intValue()) {
                break;
            }
            i2++;
        }
        return i2 == 0 ? 0 : 1;
    }

    public String getRKEType() {
        return this.mRKEType;
    }

    public int getRkeId() {
        return this.mRkeId;
    }

    public int getStatusId() {
        return this.mStatusId;
    }

    public boolean isFunctionSuccessfullyExecuted() {
        int i = this.mExecutionStatus;
        return i >= 0 && i < 16;
    }

    public boolean isStatusIdValidWithICCOA(int i) {
        String[] strArr = this.mStatusIds;
        if (strArr != null) {
            for (String str : strArr) {
                if (i == Integer.valueOf(str, 16).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isToggle() {
        return TextUtils.equals(Product.sRKEType.get(1), this.mRKEType);
    }

    @Override // com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_RKE_ID, this.mRkeId);
            jSONObject.put("description", this.mDescription);
            jSONObject.put(KEY_FUNCTION_ID, this.mFunctionId);
            jSONObject.put(KEY_ACTION_ID, new JSONArray(this.mActionIds));
            jSONObject.put("type", this.mRKEType);
            jSONObject.put("icon", this.mIcon);
            ActionPrompt actionPrompt = this.mActionPrompt;
            if (actionPrompt != null) {
                jSONObject.put(KEY_ACTION_PROMPT, actionPrompt.serialize());
            }
            if (this.mStatusIds != null) {
                jSONObject.put(KEY_STATUS_ID_ARRAY, new JSONArray(this.mStatusIds));
            }
        } catch (JSONException e) {
            LogUtils.e("serialize rke", e);
        }
        return jSONObject;
    }

    public void setCurrentActionId(int i) {
        this.mCurrentActionId = i;
    }

    public void setExecutionStatus(int i) {
        this.mExecutionStatus = i;
    }

    public void setStatusId(int i) {
        this.mStatusId = i;
    }

    public void setType(String str) {
        this.mType = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRkeId);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mFunctionId);
        parcel.writeStringArray(this.mActionIds);
        parcel.writeString(this.mRKEType);
        parcel.writeString(this.mIcon);
        parcel.writeParcelable(this.mActionPrompt, i);
        parcel.writeStringArray(this.mStatusIds);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public RKE parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mRkeId = jSONObject.optInt(KEY_RKE_ID);
            this.mFunctionId = jSONObject.optString(KEY_FUNCTION_ID);
            this.mDescription = jSONObject.optString("description");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_ACTION_ID);
            if (jSONArrayOptJSONArray != null) {
                this.mActionIds = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.mActionIds[i] = jSONArrayOptJSONArray.optString(i);
                }
            }
            this.mRKEType = jSONObject.optString("type");
            this.mIcon = jSONObject.optString("icon");
            this.mActionPrompt = new ActionPrompt().parse(jSONObject.optJSONObject(KEY_ACTION_PROMPT));
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(KEY_STATUS_ID_ARRAY);
            if (jSONArrayOptJSONArray2 != null) {
                this.mStatusIds = new String[jSONArrayOptJSONArray2.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    this.mStatusIds[i2] = jSONArrayOptJSONArray2.optString(i2);
                }
            }
        }
        return this;
    }

    public RKE(Parcel parcel) {
        this.mRkeId = parcel.readInt();
        this.mDescription = parcel.readString();
        this.mFunctionId = parcel.readString();
        this.mActionIds = parcel.createStringArray();
        this.mRKEType = parcel.readString();
        this.mIcon = parcel.readString();
        this.mActionPrompt = (ActionPrompt) parcel.readParcelable(ActionPrompt.class.getClassLoader());
        this.mStatusIds = parcel.createStringArray();
    }
}

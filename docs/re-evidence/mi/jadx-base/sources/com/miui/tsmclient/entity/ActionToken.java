package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ActionToken implements Parcelable, ObjectParser<ActionToken> {
    public static final Parcelable.Creator<ActionToken> CREATOR = new Parcelable.Creator<ActionToken>() { // from class: com.miui.tsmclient.entity.ActionToken.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionToken createFromParcel(Parcel parcel) {
            return new ActionToken(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionToken[] newArray(int i) {
            return new ActionToken[i];
        }
    };
    private static final String KEY_RECHARGEAMOUNT = "rechargeAmount";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_TYPE = "type";

    @SerializedName(KEY_RECHARGEAMOUNT)
    public int mRechargeAmount;

    @SerializedName("token")
    public String mToken;

    @SerializedName("type")
    public TokenType mType;

    public enum TokenType {
        unknown(0),
        issue(1),
        recharge(2),
        withdraw(3),
        issueAndRecharge(12);

        private int mId;

        TokenType(int i) {
            this.mId = i;
        }

        public static TokenType newInstance(int i) {
            for (TokenType tokenType : values()) {
                if (tokenType.mId == i) {
                    return tokenType;
                }
            }
            return unknown;
        }

        public int getId() {
            return this.mId;
        }
    }

    public static class TokenTypeDeserializer implements JsonDeserializer<TokenType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public TokenType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return TokenType.newInstance(jsonElement.getAsInt());
        }
    }

    public boolean canShiftIn() {
        return isWithdrawType() && !TextUtils.isEmpty(this.mToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isIssueAndRechargeType() {
        return this.mType == TokenType.issueAndRecharge;
    }

    public boolean isIssueType() {
        TokenType tokenType = this.mType;
        return tokenType == TokenType.issue || tokenType == TokenType.issueAndRecharge;
    }

    public boolean isRechargeType() {
        return this.mType == TokenType.recharge;
    }

    public boolean isWithdrawType() {
        return this.mType == TokenType.withdraw;
    }

    public void readFromParcel(Parcel parcel) {
        this.mToken = parcel.readString();
        this.mType = (TokenType) parcel.readValue(TokenType.class.getClassLoader());
        this.mRechargeAmount = parcel.readInt();
    }

    public boolean shouldAutoIssueOrWithdraw() {
        return isIssueType() || (this.mType == TokenType.withdraw && !TextUtils.isEmpty(this.mToken));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mToken);
        parcel.writeValue(this.mType);
        parcel.writeInt(this.mRechargeAmount);
    }

    private ActionToken(Parcel parcel) {
        readFromParcel(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public ActionToken parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mToken = jSONObject.optString("token");
            this.mType = TokenType.newInstance(jSONObject.optInt("type"));
            this.mRechargeAmount = jSONObject.optInt(KEY_RECHARGEAMOUNT);
        }
        return this;
    }

    public ActionToken() {
    }
}

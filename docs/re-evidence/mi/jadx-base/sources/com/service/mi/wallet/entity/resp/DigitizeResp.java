package com.service.mi.wallet.entity.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.service.mi.entity.SpError;
import com.service.mi.wallet.entity.AuthenticationMethod;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeResp extends BaseWalletResponse implements Parcelable {
    public static final Parcelable.Creator<DigitizeResp> CREATOR = new Parcelable.Creator<DigitizeResp>() { // from class: com.service.mi.wallet.entity.resp.DigitizeResp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitizeResp createFromParcel(Parcel parcel) {
            return new DigitizeResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DigitizeResp[] newArray(int i) {
            return new DigitizeResp[i];
        }
    };
    private List<AuthenticationMethod> authenticationMethods;
    private String messageId;
    private boolean needAdditionalAuth;
    private String tdsRegistrationUrl;
    private String tokenUniqueReference;

    public DigitizeResp(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AuthenticationMethod> getAuthenticationMethods() {
        return this.authenticationMethods;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getTdsRegistrationUrl() {
        return this.tdsRegistrationUrl;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public boolean isNeedAdditionalAuth() {
        return this.needAdditionalAuth;
    }

    public boolean isNeedRetry() {
        return AMap3DTileBuildType.HOUSING.equalsIgnoreCase(getResultCode());
    }

    public void setAuthenticationMethods(List<AuthenticationMethod> list) {
        this.authenticationMethods = list;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setNeedAdditionalAuth(boolean z) {
        this.needAdditionalAuth = z;
    }

    public void setTdsRegistrationUrl(String str) {
        this.tdsRegistrationUrl = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeString(this.tokenUniqueReference);
        parcel.writeByte(this.needAdditionalAuth ? (byte) 1 : (byte) 0);
        parcel.writeString(this.tdsRegistrationUrl);
    }

    public DigitizeResp(String str, String str2, List<SpError> list) {
        super(str, str2, list);
    }

    public DigitizeResp(Parcel parcel) {
        this.messageId = parcel.readString();
        this.tokenUniqueReference = parcel.readString();
        this.needAdditionalAuth = parcel.readByte() != 0;
        this.tdsRegistrationUrl = parcel.readString();
    }
}

package com.service.mi;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.tsmclient.service.DKFRequestService;
import com.service.mi.entity.BaseResponse;
import com.service.mi.visa.VisaBizManager;
import com.service.mi.visa.entity.CardMetaData;
import com.service.mi.visa.entity.resp.SubmitStepUpMethodResp;
import com.service.mi.visa.entity.transactionresp.VisaTransactionRecords;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.ProductConfig;
import com.service.mi.wallet.entity.TokenInfo;
import com.service.mi.wallet.entity.resp.AuthenticationMethodsResp;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import com.service.mi.wallet.entity.resp.CardResp;
import com.service.mi.wallet.entity.resp.DigitizeResp;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import com.service.mi.wallet.entity.tds.GetTransactionsResp;
import com.xiaomi.ai.api.intent.AIApiConstants;
import defpackage.fpe;
import defpackage.t3q;
import defpackage.v3r;
import defpackage.z5i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class BankCard implements Parcelable {
    public static final Parcelable.Creator<BankCard> CREATOR = new a();
    private String appletInstanceAid;
    private CardMetaData cardMetaData;
    private int cardType;
    private ProductConfig productConfig;
    private String sdAid;
    private String tdsRegistrationUrl;
    private String tdsUrl;
    private TokenInfo tokenInfo;
    private int tokenStatus;
    private String tokenUniqueReference;

    public class a implements Parcelable.Creator<BankCard> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BankCard createFromParcel(Parcel parcel) {
            return new BankCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BankCard[] newArray(int i) {
            return new BankCard[i];
        }
    }

    public BankCard() {
    }

    public static Parcelable.Creator<BankCard> getCREATOR() {
        return CREATOR;
    }

    private String getSdAid() {
        return this.sdAid;
    }

    private String getTdsRegistrationUrl() {
        return this.tdsRegistrationUrl;
    }

    private String getTdsUrl() {
        return this.tdsUrl;
    }

    private BaseResponse suspend(String str) {
        BaseWalletResponse baseWalletResponseZ;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.b(str, "reasonCode cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i != 1) {
            baseWalletResponseZ = null;
            if (i == 2) {
                baseWalletResponseZ = VisaBizManager.getInstance().tokenManagement(this.tokenUniqueReference, 2, null, false);
            }
        } else {
            baseWalletResponseZ = v3r.m().z(this.tokenUniqueReference, str);
        }
        return new BaseResponse(baseWalletResponseZ.getResultCode(), baseWalletResponseZ.getMsg(), baseWalletResponseZ.getRequestId(), baseWalletResponseZ.getSpErrors());
    }

    private BaseResponse unSuspend(String str) {
        BaseWalletResponse baseWalletResponseA;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.b(str, "reasonCode cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i != 1) {
            baseWalletResponseA = null;
            if (i == 2) {
                baseWalletResponseA = VisaBizManager.getInstance().tokenManagement(this.tokenUniqueReference, 3, null, false);
            }
        } else {
            baseWalletResponseA = v3r.m().A(this.tokenUniqueReference, str);
        }
        return new BaseResponse(baseWalletResponseA.getResultCode(), baseWalletResponseA.getMsg(), baseWalletResponseA.getRequestId(), baseWalletResponseA.getSpErrors());
    }

    public BaseResponse activate(String str, String str2) {
        BaseWalletResponse baseWalletResponseT;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.b(str, "activateCode cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i != 1) {
            baseWalletResponseT = i != 2 ? null : VisaBizManager.getInstance().visaActivate(this.tokenUniqueReference, str, str2);
        } else {
            baseWalletResponseT = v3r.m().t(this.tokenUniqueReference, str);
        }
        return new BaseResponse(baseWalletResponseT.getResultCode(), baseWalletResponseT.getMsg(), baseWalletResponseT.getRequestId(), baseWalletResponseT.getSpErrors());
    }

    public boolean activateApplet() {
        return t3q.i().a(this.appletInstanceAid);
    }

    public boolean deactivateApplet() {
        return t3q.i().g(this.appletInstanceAid);
    }

    public BaseResponse delete() {
        BaseWalletResponse baseWalletResponseF;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i == 1) {
            baseWalletResponseF = v3r.m().f(this.tokenUniqueReference, DKFRequestService.a.d, this.appletInstanceAid, this.tokenStatus == 4);
        } else if (i != 2) {
            baseWalletResponseF = null;
        } else {
            baseWalletResponseF = VisaBizManager.getInstance().tokenManagement(this.tokenUniqueReference, 1, this.appletInstanceAid, this.tokenStatus == 4);
        }
        return new BaseResponse(baseWalletResponseF.getResultCode(), baseWalletResponseF.getMsg(), baseWalletResponseF.getRequestId(), baseWalletResponseF.getSpErrors());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    public BaseResponse getAuthenticationMethods() {
        AuthenticationMethodsResp authenticationMethodsRespJ;
        fpe.e(AIApiConstants.BankCard.NAME, "类型：" + this.cardType);
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i != 1) {
            authenticationMethodsRespJ = i != 2 ? null : VisaBizManager.getInstance().getAuthenticationMethods(this.tokenUniqueReference);
        } else {
            authenticationMethodsRespJ = v3r.m().j(this.tokenUniqueReference);
        }
        AuthenticationMethodsResp authenticationMethodsResp = authenticationMethodsRespJ;
        return new BaseResponse(authenticationMethodsResp.getResultCode(), authenticationMethodsResp.getMsg(), authenticationMethodsResp, authenticationMethodsResp.getRequestId(), authenticationMethodsResp.getSpErrors());
    }

    public CardMetaData getCardMetaData() {
        return this.cardMetaData;
    }

    public int getCardType() {
        return this.cardType;
    }

    public ProductConfig getProductConfig() {
        return this.productConfig;
    }

    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public int getTokenStatus() {
        return this.tokenStatus;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public BaseResponse getTransactions() {
        return getTransactions(0, 0);
    }

    public BaseResponse issue(Map<String, String> map) {
        DigitizeResp digitizeRespG;
        if (map == null) {
            map = new HashMap<>();
        }
        z5i.a();
        map.put("redigitize_token", this.tokenUniqueReference);
        int i = this.cardType;
        if (i != 1) {
            digitizeRespG = i != 2 ? null : VisaBizManager.getInstance().digitizeCard(map);
        } else {
            digitizeRespG = v3r.m().g(map);
        }
        DigitizeResp digitizeResp = digitizeRespG;
        if (digitizeResp != null && digitizeResp.isStatusOk()) {
            setTokenUniqueReference(digitizeResp.getTokenUniqueReference());
        }
        return new BaseResponse(digitizeResp.getResultCode(), digitizeResp.getMsg(), digitizeResp, digitizeResp.getRequestId(), digitizeResp.getSpErrors());
    }

    public BaseResponse prepare(Map<String, String> map) {
        PreDigitizeResp preDigitizeRespQ;
        z5i.b(map, "params cannot be null");
        z5i.a();
        map.put("redigitize_token", this.tokenUniqueReference);
        int i = this.cardType;
        if (i != 1) {
            preDigitizeRespQ = i != 2 ? null : VisaBizManager.getInstance().prepareDigitize(map);
        } else {
            preDigitizeRespQ = v3r.m().q(map);
        }
        PreDigitizeResp preDigitizeResp = preDigitizeRespQ;
        return new BaseResponse(preDigitizeResp.getResultCode(), preDigitizeResp.getMsg(), preDigitizeResp, preDigitizeResp.getRequestId(), preDigitizeResp.getSpErrors());
    }

    public BaseResponse requestActivationCode(AuthenticationMethod authenticationMethod) {
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.b(authenticationMethod, "authenticationMethod cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i == 1) {
            BaseWalletResponse baseWalletResponseU = v3r.m().u(this.tokenUniqueReference, authenticationMethod);
            return new BaseResponse(baseWalletResponseU.getResultCode(), baseWalletResponseU.getMsg(), baseWalletResponseU.getRequestId(), baseWalletResponseU.getSpErrors());
        }
        if (i != 2) {
            return null;
        }
        SubmitStepUpMethodResp submitStepUpMethodRespRequestActivationCode = VisaBizManager.getInstance().requestActivationCode(this.tokenUniqueReference, authenticationMethod);
        return new BaseResponse(submitStepUpMethodRespRequestActivationCode.getResultCode(), submitStepUpMethodRespRequestActivationCode.getMsg(), submitStepUpMethodRespRequestActivationCode.getRequestId(), submitStepUpMethodRespRequestActivationCode.getSpErrors(), submitStepUpMethodRespRequestActivationCode.getMaxOTPVerificationAllowed(), submitStepUpMethodRespRequestActivationCode.getMaxOTPRequestsAllowed(), submitStepUpMethodRespRequestActivationCode.getCodeExpiration());
    }

    public void setAppletInstanceAid(String str) {
        this.appletInstanceAid = str;
    }

    public void setCardMetaData(CardMetaData cardMetaData) {
        this.cardMetaData = cardMetaData;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setProductConfig(ProductConfig productConfig) {
        this.productConfig = productConfig;
    }

    public void setSdAid(String str) {
        this.sdAid = str;
    }

    public void setTdsRegistrationUrl(String str) {
        this.tdsRegistrationUrl = str;
    }

    public void setTdsUrl(String str) {
        this.tdsUrl = str;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public void setTokenStatus(int i) {
        this.tokenStatus = i;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }

    public BaseResponse update() {
        CardResp cardRespK;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.a();
        int i = this.cardType;
        if (i != 1) {
            cardRespK = i != 2 ? null : VisaBizManager.getInstance().getCardInfo(this.tokenUniqueReference);
        } else {
            cardRespK = v3r.m().k(this.tokenUniqueReference);
        }
        if (cardRespK != null && cardRespK.isStatusOk()) {
            BankCard cardDetail = cardRespK.getCardDetail();
            setTokenUniqueReference(cardDetail.getTokenUniqueReference());
            setTokenStatus(cardDetail.getTokenStatus());
            setAppletInstanceAid(cardDetail.getAppletInstanceAid());
            setProductConfig(cardDetail.getProductConfig());
            setTokenInfo(cardDetail.getTokenInfo());
            setTdsRegistrationUrl(cardDetail.getTdsRegistrationUrl());
            setTdsUrl(cardDetail.getTdsUrl());
        }
        return new BaseResponse(cardRespK.getResultCode(), cardRespK.getMsg(), cardRespK.getRequestId(), cardRespK.getSpErrors());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tokenUniqueReference);
        parcel.writeString(this.appletInstanceAid);
        parcel.writeString(this.sdAid);
        parcel.writeInt(this.tokenStatus);
        parcel.writeSerializable(this.productConfig);
        parcel.writeSerializable(this.tokenInfo);
        parcel.writeString(this.tdsRegistrationUrl);
        parcel.writeString(this.tdsUrl);
        parcel.writeSerializable(this.cardMetaData);
        parcel.writeInt(this.cardType);
    }

    public BankCard(Parcel parcel) {
        this.tokenUniqueReference = parcel.readString();
        this.appletInstanceAid = parcel.readString();
        this.sdAid = parcel.readString();
        this.tokenStatus = parcel.readInt();
        this.productConfig = (ProductConfig) parcel.readSerializable();
        this.tokenInfo = (TokenInfo) parcel.readSerializable();
        this.tdsRegistrationUrl = parcel.readString();
        this.tdsUrl = parcel.readString();
        this.cardMetaData = (CardMetaData) parcel.readSerializable();
        this.cardType = parcel.readInt();
    }

    public BaseResponse getTransactions(int i, int i2) {
        BaseResponse baseResponse;
        z5i.c(this.tokenUniqueReference != null, "tokenUniqueReference cannot be null");
        z5i.a();
        int i3 = this.cardType;
        if (i3 == 1) {
            z5i.c(this.tdsRegistrationUrl != null, "tdsRegistrationUrl cannot be null");
            GetTransactionsResp getTransactionsRespP = v3r.m().p(this.tokenUniqueReference, this.tdsRegistrationUrl, this.tdsUrl);
            baseResponse = new BaseResponse(getTransactionsRespP.getResultCode(), getTransactionsRespP.getMsg(), getTransactionsRespP, "");
        } else {
            if (i3 != 2) {
                return null;
            }
            VisaTransactionRecords transactionHistory = VisaBizManager.getInstance().getTransactionHistory(this.tokenUniqueReference, i, i2);
            baseResponse = new BaseResponse(transactionHistory.getResultCode(), transactionHistory.getMsg(), transactionHistory, "");
        }
        return baseResponse;
    }
}

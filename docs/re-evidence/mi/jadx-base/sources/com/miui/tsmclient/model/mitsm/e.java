package com.miui.tsmclient.model.mitsm;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ErrorInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public class e extends f {
    public BaseResponse a(Context context, CardInfo cardInfo, Bundle bundle) {
        int iA;
        String message;
        k.a aVar = k.a.INSTALL;
        try {
            TsmRpcModels.VirtualCardInfoResponse virtualCardInfoResponseEnrollUPCard = this.mSeiTsmAuthManager.enrollUPCard(context, getSession(context, cardInfo, aVar), cardInfo, bundle);
            if (virtualCardInfoResponseEnrollUPCard == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(virtualCardInfoResponseEnrollUPCard.getResult());
                message = virtualCardInfoResponseEnrollUPCard.getErrorDesc();
            }
            LogUtils.i("enrollUPCard resultCode: " + iA);
            if (iA != 0) {
                return new BaseResponse(iA, message, new Object[0]);
            }
            a((BankCardInfo) cardInfo, virtualCardInfoResponseEnrollUPCard);
            return new BaseResponse(iA, virtualCardInfoResponseEnrollUPCard);
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("enrollUPCard failed with an tsmapi exception.", e);
        } finally {
            if (bundle != null && !bundle.getBoolean(f.EXTRAS_KEY_SESSION_NOT_FINISH)) {
                k.a().b(cardInfo, aVar);
            }
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public BaseResponse b(Context context, Bundle bundle) {
        int iA;
        String message;
        ErrorInfo errorInfoFromJson = null;
        try {
            TsmRpcModels.BatchApplyTokenResponse batchApplyTokenResponseQueryBatchApplyToken = this.mSeiTsmAuthManager.queryBatchApplyToken(context, bundle);
            if (batchApplyTokenResponseQueryBatchApplyToken == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(batchApplyTokenResponseQueryBatchApplyToken.getResult());
                message = batchApplyTokenResponseQueryBatchApplyToken.getErrorDesc();
                errorInfoFromJson = ErrorInfo.fromJson(batchApplyTokenResponseQueryBatchApplyToken.getErrInfo());
            }
            LogUtils.d("queryBatchApplyToken result: " + iA);
            if (iA == 0) {
                return new BaseResponse(0, batchApplyTokenResponseQueryBatchApplyToken);
            }
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryBatchApplyToken failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, errorInfoFromJson);
    }

    public BaseResponse a(Context context, Bundle bundle) {
        int iA;
        String message;
        ErrorInfo errorInfoFromJson = null;
        try {
            TsmRpcModels.ApplyTokenResponse applyTokenResponseQueryApplyToken = this.mSeiTsmAuthManager.queryApplyToken(context, bundle);
            if (applyTokenResponseQueryApplyToken == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(applyTokenResponseQueryApplyToken.getResult());
                message = applyTokenResponseQueryApplyToken.getErrorDesc();
                errorInfoFromJson = ErrorInfo.fromJson(applyTokenResponseQueryApplyToken.getErrInfo());
            }
            LogUtils.d("queryApplyToken result: " + iA);
            if (iA == 0) {
                return new BaseResponse(0, applyTokenResponseQueryApplyToken);
            }
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryApplyToken failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, errorInfoFromJson);
    }

    public BaseResponse b(Context context, CardInfo cardInfo, Bundle bundle) {
        int iA;
        String message;
        k.a aVar = k.a.INSTALL;
        ErrorInfo errorInfoFromJson = null;
        try {
            k.a().b(cardInfo, aVar);
            TsmRpcModels.QueryPanResponse queryPanResponseQueryPan = this.mSeiTsmAuthManager.queryPan(context, getSession(context, cardInfo, aVar), bundle);
            if (queryPanResponseQueryPan == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(queryPanResponseQueryPan.getResult());
                message = queryPanResponseQueryPan.getErrorDesc();
                errorInfoFromJson = ErrorInfo.fromJson(queryPanResponseQueryPan.getErrInfo());
            }
            LogUtils.i("queryPan resultCode: " + iA);
            if (iA == 0) {
                a((BankCardInfo) cardInfo, queryPanResponseQueryPan);
                return new BaseResponse(0, queryPanResponseQueryPan);
            }
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryPan failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, errorInfoFromJson);
    }

    public BaseResponse a(Context context) {
        int iA;
        String message;
        try {
            TsmRpcModels.BankCardFirstPageResponse bankCardFirstPageResponseQueryBindBankCardListV2 = this.mSeiTsmAuthManager.queryBindBankCardListV2(context);
            if (bankCardFirstPageResponseQueryBindBankCardListV2 == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(bankCardFirstPageResponseQueryBindBankCardListV2.getResult());
                message = bankCardFirstPageResponseQueryBindBankCardListV2.getErrorDesc();
            }
            LogUtils.d("queryBindBankCardListV2 result: " + iA);
            if (iA == 0) {
                return new BaseResponse(0, bankCardFirstPageResponseQueryBindBankCardListV2);
            }
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryBindBankCardListV2 failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public BaseResponse a(Context context, CardInfo cardInfo, String str, Bundle bundle) {
        int iA;
        String message;
        try {
            TsmRpcModels.CommonResponse commonResponseRequestVerificationCode = this.mSeiTsmAuthManager.requestVerificationCode(context, getSession(context, cardInfo, k.a.INSTALL), str, bundle);
            if (commonResponseRequestVerificationCode == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(commonResponseRequestVerificationCode.getResult());
                message = commonResponseRequestVerificationCode.getErrorDesc();
            }
            LogUtils.d("requestVerificationCode result: " + iA);
            if (iA == 0) {
                return new BaseResponse(iA, commonResponseRequestVerificationCode);
            }
        } catch (r.a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("requestVerificationCode failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public static void a(BankCardInfo bankCardInfo, TsmRpcModels.QueryPanResponse queryPanResponse) {
        if (queryPanResponse != null) {
            bankCardInfo.mBankCardType = queryPanResponse.getCardType().getNumber();
            TsmRpcModels.CardIssuerInfo cardIssuerInfo = queryPanResponse.getCardIssuerInfo();
            bankCardInfo.mIssuerChannel = cardIssuerInfo.getCardIssueChannel().getNumber();
            bankCardInfo.mIssuerId = cardIssuerInfo.getIssuerId();
            bankCardInfo.mBankName = cardIssuerInfo.getBankName();
            bankCardInfo.mBankLogoUrl = cardIssuerInfo.getLogoUrl();
            bankCardInfo.mBankLogoWithNameUrl = cardIssuerInfo.getLogoWithBankNameUrl();
            bankCardInfo.mBankContactNum = cardIssuerInfo.getContactNumber();
            bankCardInfo.mServiceHotline = cardIssuerInfo.getHotline();
            bankCardInfo.mUserTerms = queryPanResponse.getUserTerms();
        }
    }

    public static void a(BankCardInfo bankCardInfo, TsmRpcModels.VirtualCardInfoResponse virtualCardInfoResponse) {
        if (virtualCardInfoResponse != null) {
            bankCardInfo.mVCReferenceId = EnvironmentConfig.isSupportNfc() ? virtualCardInfoResponse.getVirtualCardReferenceId() : virtualCardInfoResponse.getCardReferenceId();
            bankCardInfo.mCardProductTypeId = virtualCardInfoResponse.getCardProductId();
            bankCardInfo.mVCardNumber = virtualCardInfoResponse.getVirtualCardNumber();
            bankCardInfo.mPanLastDigits = virtualCardInfoResponse.getLastDigits();
            bankCardInfo.mAid = virtualCardInfoResponse.getAid();
            bankCardInfo.mPhoneLastDigits = virtualCardInfoResponse.getPhoneNumLastDigits();
            bankCardInfo.mCardFrontColor = virtualCardInfoResponse.getFrontColor();
            bankCardInfo.mCardArt = virtualCardInfoResponse.getCardArt();
            bankCardInfo.setPhoneNo(virtualCardInfoResponse.getPhoneNo());
            bankCardInfo.setNeedOtp(virtualCardInfoResponse.getNeedOtp());
            bankCardInfo.setSendOtpSuccess(virtualCardInfoResponse.getAutoSendOpt());
            bankCardInfo.setOtpErrorMsg(virtualCardInfoResponse.getOptErrorMsg());
            bankCardInfo.setNeedEnhance(virtualCardInfoResponse.getNeedEnhance());
            bankCardInfo.setAccountId(virtualCardInfoResponse.getAccountId());
        }
    }
}

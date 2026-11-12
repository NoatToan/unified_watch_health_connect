package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.e;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.model.mitsm.k;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes.dex */
public class o2s extends e {
    public static List<BankCardInfo> d(List<TsmRpcModels.BankCardInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (TsmRpcModels.BankCardInfo bankCardInfo : list) {
            BankCardInfo bankCardInfo2 = new BankCardInfo();
            bankCardInfo2.mAid = bankCardInfo.getAid();
            bankCardInfo2.mBankCardPan = bankCardInfo.getCardNumber();
            bankCardInfo2.mVCReferenceId = bankCardInfo.getVirtualCardReferenceId();
            bankCardInfo2.mVCardNumber = bankCardInfo.getVirtualCardNumber();
            bankCardInfo2.mPanLastDigits = bankCardInfo.getLastDigits();
            bankCardInfo2.mVCStatus = bankCardInfo.getVcStatus();
            bankCardInfo2.mCardProductTypeId = bankCardInfo.getProductId();
            bankCardInfo2.mCardProductName = bankCardInfo.getProductName();
            bankCardInfo2.mUserTerms = bankCardInfo.getUserTerms();
            bankCardInfo2.mCardArt = bankCardInfo.getCardArt();
            bankCardInfo2.mBankCardType = bankCardInfo.getCardType();
            TsmRpcModels.CardIssuerInfo issuerInfo = bankCardInfo.getIssuerInfo();
            bankCardInfo2.mBankName = issuerInfo.getBankName();
            bankCardInfo2.mIssuerId = issuerInfo.getIssuerId();
            bankCardInfo2.mIssuerChannel = issuerInfo.getCardIssueChannel().getNumber();
            bankCardInfo2.mBankLogoUrl = issuerInfo.getLogoUrl();
            bankCardInfo2.mBankLogoWithNameUrl = issuerInfo.getLogoWithBankNameUrl();
            bankCardInfo2.mBankContactNum = issuerInfo.getContactNumber();
            bankCardInfo2.mCardFrontColor = bankCardInfo.getFrontColor();
            bankCardInfo2.mHasQRToken = bankCardInfo.getHasQrToken();
            bankCardInfo2.mServiceHotline = bankCardInfo.getServiceHotline();
            bankCardInfo2.mSuggestion = bankCardInfo.getSuggestion();
            bankCardInfo2.setCardElementsOption(bankCardInfo.getCardElementsOption());
            bankCardInfo2.setTechType(bankCardInfo.getTechType());
            arrayList.add(bankCardInfo2);
        }
        return arrayList;
    }

    public BaseResponse c(Context context, String str) {
        int iA;
        String message;
        try {
            TsmRpcModels.QueryBankCardInfoResponse queryBankCardInfoResponseQueryBankCardInfo = this.mSeiTsmAuthManager.queryBankCardInfo(context, str);
            if (queryBankCardInfoResponseQueryBankCardInfo == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(queryBankCardInfoResponseQueryBankCardInfo.getResult());
                message = queryBankCardInfoResponseQueryBankCardInfo.getErrorDesc();
            }
            LogUtils.d("queryBankCardList result: " + iA);
            if (iA == 0) {
                return new BaseResponse(0, queryBankCardInfoResponseQueryBankCardInfo);
            }
        } catch (a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryBankCardList failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public BaseResponse e(Context context) {
        int iA;
        String errorDesc;
        try {
            TsmRpcModels.CommonResponse commonResponseDeleteAllBankCards = this.mSeiTsmAuthManager.deleteAllBankCards(context);
            if (commonResponseDeleteAllBankCards != null) {
                iA = h.a(commonResponseDeleteAllBankCards.getResult());
                errorDesc = commonResponseDeleteAllBankCards.getErrorDesc();
            } else {
                errorDesc = "";
                iA = -2;
            }
            LogUtils.d("deleteCards result: " + iA);
        } catch (a e) {
            iA = e.a();
            String message = e.getMessage();
            LogUtils.e("failed to delete all bank cards", e);
            errorDesc = message;
        }
        return new BaseResponse(iA, errorDesc, new Object[0]);
    }

    public BaseResponse f(Context context) {
        int iA;
        String message;
        try {
            TsmRpcModels.CommonResponse commonResponseIsBankCardServiceAvailable = this.mSeiTsmAuthManager.isBankCardServiceAvailable(context);
            if (commonResponseIsBankCardServiceAvailable == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(commonResponseIsBankCardServiceAvailable.getResult());
                message = commonResponseIsBankCardServiceAvailable.getErrorDesc();
            }
            LogUtils.d("isBankCardServiceAvailable result: " + iA + ", msg:" + message);
            if (iA == 0) {
                return new BaseResponse(iA, commonResponseIsBankCardServiceAvailable);
            }
        } catch (a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("failed to check bank card service.", e);
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse isServiceAvailable(Context context, CardInfo cardInfo, Bundle bundle) {
        return f(context);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse lock(Context context, CardInfo cardInfo, Bundle bundle) {
        int iA;
        String errorDesc;
        k.a aVar = k.a.LOCK;
        try {
            try {
                TsmRpcModels.TsmAPDUCommand tsmAPDUCommandStartSeOperation = this.mSeiTsmAuthManager.startSeOperation(context, getSession(context, cardInfo, aVar), TsmRpcModels.SeOperationType.LOCK, cardInfo, bundle);
                if (tsmAPDUCommandStartSeOperation == null) {
                    LogUtils.d("can not get apduCommand, startSeOperation failed.");
                    BaseResponse baseResponse = new BaseResponse(8, new Object[0]);
                    k.a().b(cardInfo, aVar);
                    return baseResponse;
                }
                iA = h.a(tsmAPDUCommandStartSeOperation.getResult());
                errorDesc = tsmAPDUCommandStartSeOperation.getErrorDesc();
                k.a().b(cardInfo, aVar);
                return new BaseResponse(iA, errorDesc, new Object[0]);
            } catch (a e) {
                iA = e.a();
                String message = e.getMessage();
                LogUtils.e("lock failed with an tsmapi exception.", e);
                k.a().b(cardInfo, aVar);
                errorDesc = message;
            }
        } catch (Throwable th) {
            k.a().b(cardInfo, aVar);
            throw th;
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.QrBankCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.e;
import com.miui.tsmclient.model.mitsm.h;
import com.miui.tsmclient.seitsm.TsmRpcModels;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes.dex */
public class vis extends e {
    public static List<QrBankCardInfo> c(List<TsmRpcModels.QrCardInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (TsmRpcModels.QrCardInfo qrCardInfo : list) {
            QrBankCardInfo qrBankCardInfo = new QrBankCardInfo();
            qrBankCardInfo.mVCReferenceId = qrCardInfo.getCardReferenceId();
            qrBankCardInfo.mPanLastDigits = qrCardInfo.getLastDigits();
            qrBankCardInfo.mBankCardType = qrCardInfo.getCardType().getNumber();
            TsmRpcModels.CardIssuerInfo issuerInfo = qrCardInfo.getIssuerInfo();
            qrBankCardInfo.mBankName = issuerInfo.getBankName();
            qrBankCardInfo.mIssuerId = issuerInfo.getIssuerId();
            qrBankCardInfo.mIssuerChannel = issuerInfo.getCardIssueChannel().getNumber();
            qrBankCardInfo.mBankLogoUrl = issuerInfo.getLogoUrl();
            qrBankCardInfo.mBankLogoWithNameUrl = issuerInfo.getLogoWithBankNameUrl();
            qrBankCardInfo.mBankContactNum = issuerInfo.getContactNumber();
            qrBankCardInfo.mBgImage = issuerInfo.getBgImage();
            qrBankCardInfo.mServiceHotline = issuerInfo.getHotline();
            arrayList.add(qrBankCardInfo);
        }
        return arrayList;
    }

    public BaseResponse d(Context context) {
        int iA;
        String message;
        try {
            TsmRpcModels.BankCardListForQrResponse bankCardListForQR = this.mSeiTsmAuthManager.getBankCardListForQR(context);
            if (bankCardListForQR == null) {
                message = "";
                iA = -1;
            } else {
                iA = h.a(bankCardListForQR.getResult());
                message = bankCardListForQR.getErrorDesc();
            }
            LogUtils.d("queryQrBankCardList result: " + iA);
            if (iA == 0) {
                return new BaseResponse(0, bankCardListForQR);
            }
        } catch (a e) {
            iA = e.a();
            message = e.getMessage();
            LogUtils.e("queryQrBankCardList failed with an tsmapi exception.", e);
        }
        return new BaseResponse(iA, message, new Object[0]);
    }

    public BaseResponse e(Context context, Bundle bundle) {
        int iA;
        String errorDesc;
        try {
            TsmRpcModels.CommonResponse commonResponseDeleteQrBankCard = this.mSeiTsmAuthManager.deleteQrBankCard(context, bundle);
            if (commonResponseDeleteQrBankCard != null) {
                iA = h.a(commonResponseDeleteQrBankCard.getResult());
                errorDesc = commonResponseDeleteQrBankCard.getErrorDesc();
            } else {
                errorDesc = "";
                iA = -2;
            }
            LogUtils.d("deleteQrBankCards result: " + iA);
        } catch (a e) {
            iA = e.a();
            String message = e.getMessage();
            LogUtils.e("failed to delete qr bank card", e);
            errorDesc = message;
        }
        return new BaseResponse(iA, errorDesc, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.f
    public BaseResponse issue(Context context, CardInfo cardInfo, Bundle bundle) {
        return null;
    }
}

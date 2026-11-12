package defpackage;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.account.AccountManagerFactory;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.BizStatusConfirmResponseInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ConfirmBizStatusInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import r.a;

/* JADX INFO: loaded from: classes3.dex */
public class y3s extends SecureRequest<BizStatusConfirmResponseInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39767b;

    public y3s(Context context, ConfirmBizStatusInfo confirmBizStatusInfo) {
        super("POST", TSMAuthContants.URL_BIZ_STATUS_CONFIRM, TypeToken.get(BizStatusConfirmResponseInfo.class));
        this.f39767b = context;
        addParams("orderId", confirmBizStatusInfo.getOrderId());
        addParams("cardName", confirmBizStatusInfo.getCardName());
        addParams("businessId", confirmBizStatusInfo.getBusinessId());
        addParams("sessionId", confirmBizStatusInfo.getSessionId());
        addParams(TSMAuthContants.PARAM_CARD_CATEGORY, confirmBizStatusInfo.getCardCategory());
        addParams("actionType", confirmBizStatusInfo.getActionType());
        addParams("result", confirmBizStatusInfo.getResult());
        addParams("errorCode", String.valueOf(confirmBizStatusInfo.getErrorCode()));
        addParams("errorDesc", confirmBizStatusInfo.getErrorDesc());
        addParams(TSMAuthContants.PARAM_CORE_OPERATION, confirmBizStatusInfo.getCoreOperation());
        addParams("extra", confirmBizStatusInfo.getExtra());
        addParams(TSMAuthContants.PARAM_ORDER_SOURCE, confirmBizStatusInfo.getOrderSource());
    }

    public AccountInfo a(Context context) throws a {
        AccountInfo accountInfoLoadAccountInfo = AccountManagerFactory.createAccountManager().loadAccountInfo(context);
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            throw new a(14);
        }
        return accountInfoLoadAccountInfo;
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            AccountInfo accountInfoA = a(this.f39767b);
            CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            String strB = b(cardInfo);
            String deviceId = DeviceUtils.getDeviceId(this.f39767b, cardInfo);
            addParams("userId", accountInfoA.getUserId());
            addParams("cplc", strB);
            addParams("deviceId", deviceId);
        } catch (a e) {
            LogUtils.e("failed to get account", e);
        }
    }

    public final String b(CardInfo cardInfo) {
        try {
            return cardInfo.getTerminal().getCPLC();
        } catch (IOException e) {
            e = e;
            LogUtils.e("failed to get cplc", e);
            return null;
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
            LogUtils.e("failed to get cplc", e);
            return null;
        }
    }
}

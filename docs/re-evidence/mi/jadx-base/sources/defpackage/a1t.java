package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.internal.okhttp.InternalIOException;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.entity.NfcConfigsResponse;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.i;
import com.miui.tsmclient.model.mitsm.g;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class a1t extends g<nzs, ICCOACarKeyCardInfo> {
    private void u(Context context, CardInfo cardInfo) {
        if (cardInfo == null) {
            return;
        }
        NfcConfigsResponse.NfcConfigs nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.createConfigFromFile(context);
        if (nfcConfigsCreateConfigFromFile == null) {
            nfcConfigsCreateConfigFromFile = NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        }
        cardInfo.setKeepActivated(nfcConfigsCreateConfigFromFile.isKeepActivated(cardInfo.mAid));
        if (cardInfo.isKeepActivated()) {
            String str = PrefUtils.PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX + cardInfo.mAid;
            if (PrefUtils.getBoolean(context, str, false)) {
                return;
            }
            PrefUtils.putBoolean(context, str, ljs.e(context, cardInfo));
        }
    }

    public final BaseResponse n(Context context, Bundle bundle) {
        try {
            int i = bundle.getInt(SDKConstants.SOURCE_TYPE);
            String string = bundle.getString("extraData");
            LogUtils.t("confirm digital key with params, " + string);
            return new nzs().d(context, i == 2 ? "ICCOA_V2_CONFIRM_KEY_SHARING_IN_WALLET" : "ICCOA_V2_CONFIRM_KEY_SHARING", string);
        } catch (AuthApiException e) {
            LogUtils.e("AuthApiException when confirm digital key, ", e);
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, "");
        } catch (a e2) {
            LogUtils.e("SeiTSMApiException when confirm digital key, ", e2);
            return new BaseResponse(e2.a(), e2.getMessage(), "");
        }
    }

    public final BaseResponse o(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo) {
        if (TextUtils.isEmpty(iCCOACarKeyCardInfo.getCardId())) {
            return new BaseResponse(1, new Object[0]);
        }
        if (iCCOACarKeyCardInfo.isCardActive()) {
            return new BaseResponse(0, new Object[0]);
        }
        if (iCCOACarKeyCardInfo.getStatus() > 3) {
            return new BaseResponse(17, new Object[0]);
        }
        try {
            return ((nzs) this.f10380a).a(context, iCCOACarKeyCardInfo);
        } catch (IOException e) {
            LogUtils.e("IOException when upload digital key status, ", e);
            return new BaseResponse(12, new Object[0]);
        } catch (InterruptedException e2) {
            LogUtils.e("InterruptedException when upload digital key status, ", e2);
            Thread.currentThread().interrupt();
            return new BaseResponse(11, new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo, Bundle bundle) {
        return ((nzs) this.f10380a).delete(context, iCCOACarKeyCardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public BaseResponse l(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo, Bundle bundle) {
        i.b().d();
        NfcConfigsResponse.NfcConfigs.fetchNfcConfigFromServer(context);
        return bundle.getBoolean("share") ? n(context, bundle) : new BaseResponse(17, new Object[0]);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo, Bundle bundle) {
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("iccoaV2KeyId", iCCOACarKeyCardInfo.getCardId());
            map.put("iccoaV2VehicleOEMId", iCCOACarKeyCardInfo.getVehicleOEMId());
            b1t b1tVar = new b1t(context, ProductList.ProductInfo.ICCOA_TYPE, map);
            b1t.b bVar = (b1t.b) HttpClient.getInstance(context).execute(b1tVar).getResult();
            if (b1tVar.isSuccess()) {
                List<ICCOACarKeyCardInfo> listD = bVar.a().d();
                Iterator<ICCOACarKeyCardInfo> it = listD.iterator();
                while (it.hasNext()) {
                    u(context, it.next());
                }
                baseResponse.setDatas(listD);
            } else if (bVar == null) {
                baseResponse.mResultCode = 2;
            } else {
                baseResponse.mResultCode = bVar.getErrorCode();
                baseResponse.mMsg = bVar.getErrorDesc();
            }
        } catch (InternalIOException e) {
            LogUtils.e("InternalIOException when query card info, ", e);
            baseResponse.mResultCode = e.getErrorCode();
            baseResponse.mMsg = e.getMessage();
        } catch (IOException e2) {
            LogUtils.e("IOException when query card info, ", e2);
            baseResponse.mResultCode = 2;
        }
        return baseResponse;
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public nzs b() {
        return new nzs();
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public BaseResponse k(Context context, ICCOACarKeyCardInfo iCCOACarKeyCardInfo, Bundle bundle) {
        i.b().d();
        if (iCCOACarKeyCardInfo != null && !TextUtils.isEmpty(iCCOACarKeyCardInfo.getCardId()) && bundle != null && SDKConstants.KEY_CARD_OPERATION_UPDATE_STATUS.equals(bundle.getString("operation", ""))) {
            BaseResponse baseResponseO = o(context, iCCOACarKeyCardInfo);
            if (!baseResponseO.isSuccess()) {
                if (baseResponseO.mResultCode == 17) {
                    baseResponseO.mResultCode = 0;
                }
                return baseResponseO;
            }
        }
        return c(context, iCCOACarKeyCardInfo, bundle);
    }
}

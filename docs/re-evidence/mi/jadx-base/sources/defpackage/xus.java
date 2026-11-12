package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.NfcConfigsResponse;
import com.miui.tsmclient.entity.RKEData;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.i;
import com.miui.tsmclient.model.mitsm.g;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import r.a;

/* JADX INFO: loaded from: classes2.dex */
public class xus extends g<ess, CarKeyCardInfo> {
    public BaseResponse n(Context context, CarKeyCardInfo carKeyCardInfo, int i, int i2) {
        int iA;
        BaseResponse baseResponse = new BaseResponse();
        try {
            HashMap map = new HashMap();
            map.put("keyId", carKeyCardInfo.getKeyId());
            map.put(Constants.KEY_VEHICLE_OEM_PROPRIETARY_DATA_OFFSET, Integer.valueOf(i));
            map.put(Constants.KEY_VEHICLE_OEM_PROPRIETARY_DATA_LENGTH, Integer.valueOf(i2));
            return ((ess) this.f10380a).d(context, Constants.OPERATION_CCC_TERMINATE_KEY, carKeyCardInfo, new Gson().toJson(map));
        } catch (AuthApiException e) {
            LogUtils.e("occurs an exception for sendTermination", e);
            iA = e.mErrorCode;
            baseResponse.mResultCode = iA;
            return baseResponse;
        } catch (InterruptedException e2) {
            LogUtils.e("occurs an exception for sendTermination", e2);
            baseResponse.mResultCode = 11;
            Thread.currentThread().interrupt();
            return baseResponse;
        } catch (a e3) {
            LogUtils.e("occurs an exception for sendTermination", e3);
            iA = e3.a();
            baseResponse.mResultCode = iA;
            return baseResponse;
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, CarKeyCardInfo carKeyCardInfo, Bundle bundle) {
        return ((ess) this.f10380a).delete(context, carKeyCardInfo, bundle);
    }

    public BaseResponse p(Context context, String str) {
        return ((ess) this.f10380a).c(context, str);
    }

    public BaseResponse q(Context context, String str, CarKeyCardInfo carKeyCardInfo, String str2) throws a, InterruptedException, AuthApiException {
        return ((ess) this.f10380a).d(context, str, carKeyCardInfo, str2);
    }

    public final void r(Context context, CarKeyCardInfo carKeyCardInfo) throws IOException {
        ((ess) this.f10380a).e(context, carKeyCardInfo);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public BaseResponse c(Context context, CarKeyCardInfo carKeyCardInfo, Bundle bundle) {
        BaseResponse baseResponse = new BaseResponse(0, new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("cccKeyId", carKeyCardInfo.getCardId());
            map.put("cccVehicleOEMId", carKeyCardInfo.getVehicleOEMId());
            map.put("cccVehicleBrandId", carKeyCardInfo.getVehicleBrandId());
            b1t b1tVar = new b1t(context, ProductList.ProductInfo.CCC_TYPE, map);
            b1t.b bVar = (b1t.b) HttpClient.getInstance(context).execute(b1tVar).getResult();
            if (b1tVar.isSuccess()) {
                List<CarKeyCardInfo> listB = bVar.a().b();
                for (CarKeyCardInfo carKeyCardInfo2 : listB) {
                    y(context, carKeyCardInfo2);
                    if (bundle == null || !bundle.getBoolean(Constants.EXTRA_OUT_OPERATION, false)) {
                        u(context, carKeyCardInfo2);
                        try {
                            r(context, carKeyCardInfo2);
                        } catch (IOException unused) {
                            baseResponse.mResultCode = 11;
                            return baseResponse;
                        }
                    }
                }
                baseResponse.setDatas(listB);
            } else if (bVar == null) {
                baseResponse.mResultCode = 2;
            } else {
                baseResponse.mResultCode = bVar.getErrorCode();
                baseResponse.mMsg = bVar.getErrorDesc();
            }
        } catch (IOException e) {
            LogUtils.e("occurs an exception for queryCardInfo", e);
            baseResponse.mResultCode = 12;
        }
        return baseResponse;
    }

    public BaseResponse t(Context context, String str) {
        return ((ess) this.f10380a).f(context, str);
    }

    public final boolean u(Context context, CarKeyCardInfo carKeyCardInfo) {
        try {
            String keyId = carKeyCardInfo.getKeyId();
            c1t c1tVar = new c1t(context, keyId, "CAR_KEY");
            c1t.a aVar = (c1t.a) HttpClient.getInstance(context).execute(c1tVar).getResult();
            if (c1tVar.isSuccess()) {
                String strA = aVar.a();
                if (!TextUtils.isEmpty(strA)) {
                    PrefUtils.putString(context, PrefUtils.PREF_KEY_RKE_LIST_FROM_VEHICLE + keyId, strA);
                    RKEData rKEData = RKEData.get(context, keyId);
                    if (rKEData.isComplete()) {
                        carKeyCardInfo.mergeRKEFunctions(rKEData.getAllRKEFunctions());
                    }
                }
            }
            return c1tVar.isSuccess();
        } catch (IOException e) {
            LogUtils.e("update rke data error", e);
            return false;
        }
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public BaseResponse k(Context context, CarKeyCardInfo carKeyCardInfo, Bundle bundle) {
        if (bundle == null || !TextUtils.equals(bundle.getString(Constants.OPERATION), "update_rke")) {
            i.b().d();
            return c(context, carKeyCardInfo, bundle);
        }
        try {
            r(context, carKeyCardInfo);
            return new BaseResponse(u(context, carKeyCardInfo) ? 0 : -1, new Object[0]);
        } catch (IOException unused) {
            return new BaseResponse(11, new Object[0]);
        }
    }

    public BaseResponse w(Context context, String str) {
        return ((ess) this.f10380a).g(context, str);
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ess b() {
        return new ess();
    }

    public final void y(Context context, CardInfo cardInfo) {
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
}

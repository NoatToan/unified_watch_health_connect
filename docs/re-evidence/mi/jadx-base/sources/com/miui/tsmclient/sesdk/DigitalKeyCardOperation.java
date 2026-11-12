package com.miui.tsmclient.sesdk;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.util.CardEnvironmentConfig;
import com.xiaomi.digitalkey.wearable.utils.EnvironmentConfig;
import com.xiaomi.digitalkey.wearable.utils.IDeviceInfo;
import defpackage.ens;
import defpackage.qas;
import defpackage.xus;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class DigitalKeyCardOperation {
    private xus mDigitalKeyCardOperation;
    private SeCard mSeCard;

    public DigitalKeyCardOperation(SeCard seCard) {
        this.mSeCard = seCard;
        EnvironmentConfig.setDeviceInfo(new IDeviceInfo() { // from class: com.miui.tsmclient.sesdk.DigitalKeyCardOperation.1
            @Override // com.xiaomi.digitalkey.wearable.utils.IDeviceInfo
            public String getDeviceId(Context context) {
                return CardEnvironmentConfig.getDeviceInfo().getDeviceId(context);
            }
        });
        this.mDigitalKeyCardOperation = new xus();
    }

    public BaseResponse confirmDigitalKeySharing(Map map) {
        Context context = com.miui.tsmclient.util.EnvironmentConfig.getContext();
        if (context == null) {
            return new BaseResponse(22003, "", new Object[0]);
        }
        Object obj = map.get(SDKConstants.KEY_SHARE_URL);
        if (obj == null) {
            return new BaseResponse(22003, qas.a(context, 22003), new Object[0]);
        }
        BaseResponse baseResponseP = this.mDigitalKeyCardOperation.p(context, (String) obj);
        if (!baseResponseP.isSuccess()) {
            baseResponseP.mMsg = qas.a(context, baseResponseP.mResultCode);
        }
        return baseResponseP;
    }

    public BaseResponse importEndpointData(String str) {
        Context context = com.miui.tsmclient.util.EnvironmentConfig.getContext();
        if (context == null) {
            return new BaseResponse(22003, new Object[0]);
        }
        BaseResponse baseResponseT = this.mDigitalKeyCardOperation.t(context, str);
        if (baseResponseT.isSuccess()) {
            Object[] objArr = baseResponseT.mDatas;
            if (objArr != null && objArr.length > 0) {
                String str2 = (String) objArr[0];
                CarKeyCardInfo carKeyCardInfo = new CarKeyCardInfo();
                carKeyCardInfo.setKeyId(str2);
                this.mSeCard.updateCardInfo(carKeyCardInfo);
                this.mSeCard.updateContent();
            }
        } else {
            baseResponseT.mMsg = qas.a(context, baseResponseT.mResultCode);
        }
        return baseResponseT;
    }

    public BaseResponse queryDeviceModelsSupportedSharing(String str, List<String> list) {
        Context context = com.miui.tsmclient.util.EnvironmentConfig.getContext();
        if (context == null || TextUtils.isEmpty(str)) {
            return new BaseResponse(22003, new Object[0]);
        }
        return new ens().c(context, this.mSeCard.getCategory() == CardCategory.DIGITAL_KEY ? ProductList.ProductInfo.CCC_TYPE : ProductList.ProductInfo.ICCOA_TYPE, str, list);
    }

    public BaseResponse queryImportRequestStatus(String str) {
        Context context = com.miui.tsmclient.util.EnvironmentConfig.getContext();
        if (context == null) {
            return new BaseResponse(22003, "", new Object[0]);
        }
        BaseResponse baseResponseW = this.mDigitalKeyCardOperation.w(context, str);
        if (!baseResponseW.isSuccess()) {
            baseResponseW.mMsg = qas.a(context, baseResponseW.mResultCode);
        }
        return baseResponseW;
    }
}

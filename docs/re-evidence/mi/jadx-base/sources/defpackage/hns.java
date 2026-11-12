package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.QrBankCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.g;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.seitsm.TsmRpcModels;

/* JADX INFO: loaded from: classes.dex */
public class hns extends g<vis, QrBankCardInfo> {
    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, QrBankCardInfo qrBankCardInfo) {
        BaseResponse baseResponseD = ((vis) this.f10380a).d(context);
        if (baseResponseD.mResultCode == 0) {
            Object[] objArr = baseResponseD.mDatas;
            objArr[0] = vis.c(((TsmRpcModels.BankCardListForQrResponse) objArr[0]).getCardInfoListList());
        }
        return baseResponseD;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, QrBankCardInfo qrBankCardInfo, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(TSMAuthContants.PARAM_CARD_REFERENCE_ID, qrBankCardInfo.mVCReferenceId);
        return ((vis) this.f10380a).e(context, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public vis b() {
        return new vis();
    }
}

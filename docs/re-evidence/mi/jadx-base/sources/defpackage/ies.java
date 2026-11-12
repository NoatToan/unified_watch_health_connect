package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.BankCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.mitsm.g;
import com.miui.tsmclient.seitsm.TsmRpcModels;

/* JADX INFO: loaded from: classes.dex */
public class ies extends g<o2s, BankCardInfo> {
    public BaseResponse n(Context context) {
        return ((o2s) this.f10380a).e(context);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, BankCardInfo bankCardInfo) {
        BaseResponse baseResponseC = ((o2s) this.f10380a).c(context, bankCardInfo == null ? null : bankCardInfo.mAid);
        if (baseResponseC.mResultCode == 0) {
            Object[] objArr = baseResponseC.mDatas;
            objArr[0] = o2s.d(((TsmRpcModels.QueryBankCardInfoResponse) objArr[0]).getBankCardInfoListList());
        }
        return baseResponseC;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public BaseResponse l(Context context, BankCardInfo bankCardInfo, Bundle bundle) {
        return ((o2s) this.f10380a).issue(context, bankCardInfo, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public o2s b() {
        return new o2s();
    }
}

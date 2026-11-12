package com.miui.tsmclient.model;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.pay.OrderInfo;

/* JADX INFO: loaded from: classes6.dex */
public class n<C extends PayableCardInfo> extends com.miui.tsmclient.model.mitsm.g<l, C> implements k<C> {
    public n(String str) {
        if (CardConfigManager.getInstance().getOperationType(str) == CardConfigManager.CardConfig.OperationType.ASYNC) {
            this.f10380a = new a(new com.miui.tsmclient.model.mitsm.c(this.f10380a));
        } else {
            this.f10380a = new l(this.f10380a);
        }
    }

    @Override // com.miui.tsmclient.model.k
    public BaseResponse a(Context context, C c, OrderInfo orderInfo, Tag tag, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (orderInfo != null && !TextUtils.isEmpty(orderInfo.mCityId)) {
            bundle2.putString("extra_city_id", orderInfo.mCityId);
        }
        BaseResponse baseResponseA = ((l) this.f10380a).a(context, c, orderInfo, tag, bundle2);
        if (baseResponseA.mResultCode == 0) {
            c.mUnfinishOrderInfos.remove(orderInfo);
        }
        return baseResponseA;
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BaseResponse i(Context context, C c, Bundle bundle) {
        return ((l) this.f10380a).a(context, c, bundle);
    }

    @Override // com.miui.tsmclient.model.mitsm.g, com.miui.tsmclient.model.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BaseResponse b(Context context, C c) {
        return super.b(context, c);
    }
}

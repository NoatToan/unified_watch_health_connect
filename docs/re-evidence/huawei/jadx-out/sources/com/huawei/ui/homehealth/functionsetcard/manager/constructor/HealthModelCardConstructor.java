package com.huawei.ui.homehealth.functionsetcard.manager.constructor;

import android.content.Context;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ffv;
import defpackage.njy;
import defpackage.sjs;
import defpackage.tdy;
import health.compact.a.Utils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes43.dex */
public class HealthModelCardConstructor extends BaseCardConstructor {
    private static final String TAG = "HealthModelCardConstructor";

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public int getShowFlag(Object obj) {
        return 0;
    }

    public HealthModelCardConstructor(CardConfig cardConfig) {
        super(cardConfig);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor, com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public boolean isSupport(boolean z, int i) {
        if (tdy.b()) {
            LogUtil.j(TAG, "ShowHealthLife hide HealthModelCard");
            return false;
        }
        return Utils.l();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public FunctionSetSubCardData createCardReader(Context context) {
        Object objE = ffv.e(context, this.mCardConfig);
        if (objE instanceof FunctionSetBeanReader) {
            return (FunctionSetBeanReader) objE;
        }
        LogUtil.j(TAG, "getCardReader object ", objE);
        return new sjs(context, this.mCardConfig);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public void subscribeDataChange() {
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(Arrays.asList(1, 2, 200), new BaseCardConstructor.InnerHiSubscribeListener(TAG, this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public void unSubscribeDataChange() {
        if (njy.e(this.mSuccessList)) {
            LogUtil.j(TAG, "unSubscribeDataChange no type list");
        } else {
            LogUtil.a(TAG, "unSubscribeDataChange");
            HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.mSuccessList, new BaseCardConstructor.InnerHiUnSubscribeListener(TAG, "unSubscribeDataChange, isSuccess:"));
        }
    }
}

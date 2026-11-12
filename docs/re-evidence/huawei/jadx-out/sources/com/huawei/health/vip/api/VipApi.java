package com.huawei.health.vip.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface VipApi {
    void destoryVipPayView(View view);

    Class<? extends JsBaseModule> getCommonJsModule(String str);

    void getVipInfo(VipCallback vipCallback);

    void getVipMessage(String str, IBaseResponseCallback iBaseResponseCallback);

    void getVipMessageList(long j, long j2, IBaseResponseCallback iBaseResponseCallback, boolean z);

    View getVipPayView(Activity activity, String str, String str2);

    View getVipPayView(Activity activity, String str, String str2, Map<String, Object> map);

    void getVipTransferBenefits(VipCallback vipCallback);

    void getVipType(IBaseResponseCallback iBaseResponseCallback);

    void getVipTypePrivilege(VipCallback vipCallback);

    void getVirtualResourceSummary(IBaseResponseCallback iBaseResponseCallback);

    void notifyActivityResult(View view, int i, int i2, Intent intent);

    void setVipMessageRead(List<String> list);

    void showBenefitDialog(Context context, List<DeviceBenefitInfo> list, BaseDeviceBenefitInfo baseDeviceBenefitInfo, int i);

    void startEquityDialogActivity();

    void startVipPayViewActivity(Activity activity, String str);
}

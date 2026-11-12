package com.huawei.health.sleep;

import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwbasemgr.SleepMonthlyProcessResultCallback;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import defpackage.gwv;
import defpackage.gxc;
import defpackage.gxd;
import defpackage.gxh;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface SleepApi {
    void getPlanState(IBaseResponseCallback iBaseResponseCallback);

    void getSleepData(long j, IBaseResponseCallback iBaseResponseCallback);

    Class<? extends JsBaseModule> getSleepManagementH5Bridge();

    Class<?> getSleepManagementJsApi();

    void requestAndUpdateDailyResult(long j, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback);

    void requestDailyProcessResult(long j, SleepDailyProcessResultCallback<gxd> sleepDailyProcessResultCallback);

    void requestMonthlyProcessResult(gxc gxcVar, gwv gwvVar, long j, long j2, SleepMonthlyProcessResultCallback<gxh> sleepMonthlyProcessResultCallback);

    void requestQuestionnaireProcessResult(long j, long j2, IBaseResponseCallback iBaseResponseCallback);

    void requestSleepDevice(Date date, CommonUiBaseResponse commonUiBaseResponse);
}

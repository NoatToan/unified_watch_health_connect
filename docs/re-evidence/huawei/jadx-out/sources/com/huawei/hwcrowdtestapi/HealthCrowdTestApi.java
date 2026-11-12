package com.huawei.hwcrowdtestapi;

import android.content.Context;
import defpackage.ltp;

/* JADX INFO: loaded from: classes10.dex */
public interface HealthCrowdTestApi {
    void checkLogUploadStatus(Context context);

    void gotoFeedback(Context context, ltp ltpVar, HealthFeedbackParams healthFeedbackParams, HealthFeedbackCallback healthFeedbackCallback);

    void init(Context context);

    void logout();

    void sendLog(Context context, HealthFeedbackParams healthFeedbackParams, String str, boolean z, boolean z2, HealthSendLogCallback healthSendLogCallback);

    void setProductType(int i);

    void uninit(Context context);
}

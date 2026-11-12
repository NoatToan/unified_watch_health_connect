package com.huawei.phoneservice.websurvey;

import com.huawei.phoneservice.websurvey.NpsSurveyResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface NpsListener<T extends NpsSurveyResponse> {
    void onResult(T t, Throwable th);
}

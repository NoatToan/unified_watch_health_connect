package com.huawei.ui.homehealth.h5pro;

import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.summary.SummaryApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = SummaryApi.class)
@Singleton
public class SummaryApiImpl implements SummaryApi {
    private static final String TAG = "SummaryApiImpl";

    @Override // com.huawei.health.summary.SummaryApi
    public Class<? extends JsBaseModule> getSummaryJsApi() {
        return SummaryJsApi.class;
    }
}

package com.huawei.health.dailyactivity.impl;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.api.ThreeCircleApi;
import defpackage.qhd;
import defpackage.qhf;
import defpackage.qhl;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
@ApiDefine(uri = ThreeCircleApi.class)
@Singleton
public class ThreeCircleImpl implements ThreeCircleApi {
    private static final String TAG = "ThreeCircleImpl";

    @Override // com.huawei.threecircle.api.ThreeCircleApi
    public void querySummary(final String str, final int i, final UiCallback<qhf> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a(TAG, "querySummary(), callback == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dlw
                @Override // java.lang.Runnable
                public final void run() {
                    dmc.a(str, i, uiCallback);
                }
            });
        }
    }

    @Override // com.huawei.threecircle.api.ThreeCircleApi
    public void queryEncourage(final String str, final int i, final UiCallback<qhd> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e(TAG, "queryEncourage(), callback == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dlx
                @Override // java.lang.Runnable
                public final void run() {
                    dmc.d(str, i, uiCallback);
                }
            });
        }
    }

    @Override // com.huawei.threecircle.api.ThreeCircleApi
    public qhl queryRules(String str, String str2) {
        return ThreeCircleCloudResourceHelper.getInstance().queryRules(str, str2);
    }

    @Override // com.huawei.threecircle.api.ThreeCircleApi
    public String getPromptMessage(qhl qhlVar, Map<String, String> map) {
        return ThreeCircleCloudResourceHelper.getInstance().getPromptMessage(qhlVar, map);
    }

    @Override // com.huawei.threecircle.api.ThreeCircleApi
    public void checkUpdateForThreeCircle() {
        ThreeCircleCloudResourceHelper.getInstance().checkUpdateForThreeCircle();
    }
}

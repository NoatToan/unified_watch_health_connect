package com.huawei.hwarkuix.oHProEngine;

import android.app.Application;
import android.content.res.Configuration;
import com.huawei.health.arkuix.engine.StageDelegateApi;
import health.compact.a.LogUtil;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.ILogger;
import ohos.stage.ability.adapter.StageApplicationDelegate;

/* JADX INFO: loaded from: classes37.dex */
public class OHProBridgeStageDelegateApiImpl implements StageDelegateApi {
    private StageApplicationDelegate mDelegate;

    @Override // com.huawei.health.arkuix.engine.StageDelegateApi
    public void initStageApplication(Application application) {
        if (this.mDelegate == null) {
            this.mDelegate = new StageApplicationDelegate();
        }
        this.mDelegate.initApplication(application);
        ALog.setLogger(new ILogger() { // from class: com.huawei.hwarkuix.oHProEngine.OHProBridgeStageDelegateApiImpl.1
            @Override // ohos.ace.adapter.ILogger
            public boolean isDebuggable() {
                return true;
            }

            @Override // ohos.ace.adapter.ILogger
            public void jankLog(int i, String str) {
            }

            @Override // ohos.ace.adapter.ILogger
            public void d(String str, String str2) {
                LogUtil.c(str, str2);
            }

            @Override // ohos.ace.adapter.ILogger
            public void i(String str, String str2) {
                LogUtil.b(str, str2);
            }

            @Override // ohos.ace.adapter.ILogger
            public void w(String str, String str2) {
                LogUtil.e(str, str2);
            }

            @Override // ohos.ace.adapter.ILogger
            public void e(String str, String str2) {
                LogUtil.d(str, str2);
            }

            @Override // ohos.ace.adapter.ILogger
            public void f(String str, String str2) {
                LogUtil.e(str, str2);
            }
        });
    }

    @Override // com.huawei.health.arkuix.engine.StageDelegateApi
    public void changeConfiguration(Configuration configuration) {
        StageApplicationDelegate stageApplicationDelegate = this.mDelegate;
        if (stageApplicationDelegate != null) {
            stageApplicationDelegate.onConfigurationChanged(configuration);
        }
    }
}

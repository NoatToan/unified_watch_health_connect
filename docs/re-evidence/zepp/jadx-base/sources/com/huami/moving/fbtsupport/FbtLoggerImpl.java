package com.huami.moving.fbtsupport;

import com.huami.firstbeat.logproxy.IFbtLogger;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes11.dex */
public class FbtLoggerImpl implements IFbtLogger {
    @Override // com.huami.firstbeat.logproxy.IFbtLogger
    public void d(String str, String str2) {
        HMLog.d(str, str2, new Object[0]);
    }

    @Override // com.huami.firstbeat.logproxy.IFbtLogger
    public void e(String str, String str2) {
        HMLog.e(str, str2, new Object[0]);
    }

    @Override // com.huami.firstbeat.logproxy.IFbtLogger
    public void i(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }

    @Override // com.huami.firstbeat.logproxy.IFbtLogger
    public void w(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }

    @Override // com.huami.firstbeat.logproxy.IFbtLogger
    public void w2f(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }
}

package com.huami.moving.log;

import com.huami.mifit.sportlib.logkit.ISportLogCallback;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes11.dex */
public class SportLogClient implements ISportLogCallback {
    private static volatile SportLogClient a;

    private SportLogClient() {
    }

    public static SportLogClient getInstance() {
        if (a == null) {
            synchronized (SportLogClient.class) {
                if (a == null) {
                    a = new SportLogClient();
                }
            }
        }
        return a;
    }

    @Override // com.huami.mifit.sportlib.logkit.ISportLogCallback
    public void d(String str, String str2) {
        HMLog.d(str, str2, new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.logkit.ISportLogCallback
    public void e(String str, String str2) {
        HMLog.e(str, str2, new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.logkit.ISportLogCallback
    public void i(String str, String str2) {
        HMLog.d(str, str2, new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.logkit.ISportLogCallback
    public void w(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.logkit.ISportLogCallback
    public void w2f(String str, String str2) {
        HMLog.i(str, str2, new Object[0]);
    }
}

package com.huawei.hms.findnetwork.comm.log;

import android.text.TextUtils;
import com.huawei.hms.app.CoreApplication;
import com.huawei.hms.support.log.KitLog;

/* JADX INFO: loaded from: classes33.dex */
public class ApkLogImpl {
    private static final String DEFAULT_COMMON_TAG = "HmsFindNetworkCommonLog_61600300_";
    private static final KitLog HMS_KIT_LOG;
    private static final int LOG_PRIORITY_DEBUG = 3;
    private static final int LOG_PRIORITY_INFO = 4;
    private volatile String mCommonTag = DEFAULT_COMMON_TAG;

    public void e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HMS_KIT_LOG.e(this.mCommonTag + str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HMS_KIT_LOG.e(this.mCommonTag + str, str2, th);
    }

    public void w(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HMS_KIT_LOG.w(this.mCommonTag + str, str2);
    }

    public void init(String str) {
        this.mCommonTag = str;
    }

    public void i(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HMS_KIT_LOG.i(this.mCommonTag + str, str2);
    }

    public void d(String str, String str2) {
        TextUtils.isEmpty(str2);
    }

    static {
        KitLog kitLog = new KitLog();
        HMS_KIT_LOG = kitLog;
        kitLog.init(CoreApplication.getCoreBaseContext(), 4, "FindNetwork");
    }
}

package com.huawei.hihealthservice.hihealthkit.util;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class AccountLog implements HMSExtLogger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12518b;

    public AccountLog(Context context) {
        this.f12518b = context;
    }

    @Override // com.huawei.hms.support.log.HMSExtLogger
    public void d(String str, String str2) {
        LogUtil.d(str, str2);
    }

    @Override // com.huawei.hms.support.log.HMSExtLogger
    public void i(String str, String str2) {
        LogUtil.a(str, str2);
    }

    @Override // com.huawei.hms.support.log.HMSExtLogger
    public void w(String str, String str2) {
        LogUtil.j(str, str2);
    }

    @Override // com.huawei.hms.support.log.HMSExtLogger
    public void e(String str, String str2) {
        LogUtil.e(str, str2);
    }
}

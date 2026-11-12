package com.huawei.health.musicservice.utils;

import androidx.media3.exoplayer.util.EventLogger;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class HealthEventLogger extends EventLogger {
    @Override // androidx.media3.exoplayer.util.EventLogger
    public void logd(String str) {
        LogUtil.d("R_HealthEventLogger", str);
    }

    @Override // androidx.media3.exoplayer.util.EventLogger
    public void loge(String str) {
        ReleaseLogUtil.a("R_HealthEventLogger", str);
    }
}

package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\"\u0016\u0010\u0001\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"", "TAG", "Ljava/lang/String;", "", "ALL_DAY_TEMP_DATA_DURATION", LogUtil.I, "PROGRESS_0", "PROGRESS_100", "LOOPER_TIME_OUT_SECS", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class HMBodyTemperatureJobKt {
    public static final int ALL_DAY_TEMP_DATA_DURATION = 60000;
    private static final int LOOPER_TIME_OUT_SECS = 60;
    private static final int PROGRESS_0 = 0;
    private static final int PROGRESS_100 = 100;

    @NotNull
    private static final String TAG = "HMBodyTemperatureJob";
}

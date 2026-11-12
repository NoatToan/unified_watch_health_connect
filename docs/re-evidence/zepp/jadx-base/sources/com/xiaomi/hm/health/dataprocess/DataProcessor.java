package com.xiaomi.hm.health.dataprocess;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J\t\u0010\b\u001a\u00020\u0007H\u0087 R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DataProcessor;", "", "Lcom/xiaomi/hm/health/dataprocess/ProcessData;", "data", "", "process", "processData", "", "getVersion", "TAG", "Ljava/lang/String;", "<init>", "()V", "dataprocess_release"}, k = 1, mv = {1, 5, 1})
public final class DataProcessor {

    @NotNull
    public static final DataProcessor INSTANCE = new DataProcessor();

    @NotNull
    private static final String TAG = "DataProcessor";

    static {
        try {
            System.loadLibrary("dataProcess");
            HMLog.wtf(TAG, "DataProcessor version:" + getVersion(), new Object[0]);
        } catch (Throwable th) {
            HMLog.wtf(TAG, "Throwable:" + th, new Object[0]);
        }
    }

    private DataProcessor() {
    }

    @JvmStatic
    @NotNull
    public static final native String getVersion();

    @JvmStatic
    public static final synchronized void process(@NotNull ProcessData data) {
        INSTANCE.processData(data);
        HMLog.i(TAG, "Process sleepInfo : " + data.getSleepInfo() + "\n, stepInfo : " + data.getStepInfo(), new Object[0]);
    }

    private final native void processData(ProcessData processData);
}

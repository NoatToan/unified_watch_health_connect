package com.xiaomi.hm.health.dataprocess;

import com.miui.tsmclient.util.ServiceUtils;
import defpackage.le;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0087 J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/DataProcessor;", "", "()V", "TAG", "", "getVersion", ServiceUtils.EXTRA_PROCESS, "", "data", "Lcom/xiaomi/hm/health/dataprocess/ProcessData;", "processData", "dataprocess_release"}, k = 1, mv = {1, 1, 13})
public final class DataProcessor {
    public static final DataProcessor INSTANCE = new DataProcessor();
    private static final String TAG = "DataProcessor";

    static {
        try {
            System.loadLibrary("dataProcess");
            le.d(TAG, "DataProcessor version:" + getVersion(), new Object[0]);
        } catch (Throwable th) {
            le.d(TAG, "Throwable:" + th, new Object[0]);
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
        le.c(TAG, "Process sleepInfo : " + data.getSleepInfo() + "\n, stepInfo : " + data.getStepInfo(), new Object[0]);
    }

    private final native void processData(ProcessData processData);
}

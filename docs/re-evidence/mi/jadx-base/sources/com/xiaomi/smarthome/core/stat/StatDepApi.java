package com.xiaomi.smarthome.core.stat;

import android.content.Context;
import com.xiaomi.smarthome.device.Device;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public abstract class StatDepApi {
    public static volatile StatDepApi sInstance = new StatDepApiDefaultImpl();

    public static StatDepApi get() {
        return sInstance;
    }

    public abstract boolean isAppForeground();

    public abstract boolean isCoreReady();

    public abstract boolean isUsrExpPlanEnabled(Context context);

    public abstract void operateCardStat(Device device);

    public abstract boolean reportStatRecord(String str, boolean z);

    public abstract void report_spec_result(long j, String str, boolean z, int i, Collection<String> collection, String str2, String str3);

    public abstract String takeStatSession(long j, long j2);

    public abstract void upload_pushid_empty(String str);
}

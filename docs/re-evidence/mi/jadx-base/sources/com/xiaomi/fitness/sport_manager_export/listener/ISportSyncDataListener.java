package com.xiaomi.fitness.sport_manager_export.listener;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "", "onSync", "", "result", "", "isAppLaunch", "deviceStartTime", "", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportSyncDataListener {
    void onSync(boolean result, boolean isAppLaunch, int deviceStartTime);
}

package com.airoha.android.lib.AntennaUT;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AntennaUTListenerMgr {
    private ConcurrentHashMap<String, AntennaUtLogUiListener> a = new ConcurrentHashMap<>();

    public synchronized void OnAddLog(boolean z, String str) {
        Iterator<AntennaUtLogUiListener> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            it2.next().OnAddLog(z, str);
        }
    }

    public synchronized void OnReportStop() {
        Iterator<AntennaUtLogUiListener> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            it2.next().OnReportStop();
        }
    }

    public synchronized void OnStatisticsReport(String str) {
        Iterator<AntennaUtLogUiListener> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            it2.next().OnStatisticsReport(str);
        }
    }

    public synchronized void addListener(String str, AntennaUtLogUiListener antennaUtLogUiListener) {
        if (str == null || antennaUtLogUiListener == null) {
            return;
        }
        this.a.put(str, antennaUtLogUiListener);
    }

    public synchronized void removeListener(String str) {
        if (str == null) {
            return;
        }
        this.a.remove(str);
    }
}

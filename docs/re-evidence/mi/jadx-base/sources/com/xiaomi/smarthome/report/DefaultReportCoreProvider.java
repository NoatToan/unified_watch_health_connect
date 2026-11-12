package com.xiaomi.smarthome.report;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultReportCoreProvider implements IReportCoreProvider {
    private void log(String str, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        String.format(str, objArr);
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void addContextByActionCode(int i, String str, String str2) {
        log("addContextToActionById, actionCode=%d, key=%s, value=%s", Integer.valueOf(i), str, str2);
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void addProcessContext(String str, String str2) {
        log("addProcessContext key=%s,value=%s", str, str2);
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void beginProcess(String str, int i) {
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void finishAction(int i, int i2) {
        log("finishAction, actionCode=%d, resultCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void finishCurrentActionWithContext(int i, Map<String, String> map) {
        log("finishCurrentActionWithContext, resultCode=%d, map=%s", Integer.valueOf(i), getMapToString(map));
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void finishCurrentActionWithResult(int i) {
        log("finishCurrentActionWithResult,resultCode=%d", Integer.valueOf(i));
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public String finishProcess(int i) {
        return "";
    }

    public String getMapToString(Map<String, String> map) {
        Set<String> setKeySet = map.keySet();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (String str : setKeySet) {
            sb.append(str);
            sb.append(":");
            sb.append(map.get(str));
            sb.append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public int startAction(int i) {
        log("start actionCode =%d", Integer.valueOf(i));
        return 0;
    }

    @Override // com.xiaomi.smarthome.report.IReportCoreProvider
    public void finishAction(int i) {
        log("finishAction actionCode=%d", Integer.valueOf(i));
    }
}

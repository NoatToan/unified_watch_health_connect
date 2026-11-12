package com.xiaomi.smarthome.report;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IReportCoreProvider {
    void addContextByActionCode(int i, String str, String str2);

    void addProcessContext(String str, String str2);

    void beginProcess(String str, int i);

    void finishAction(int i);

    void finishAction(int i, int i2);

    void finishCurrentActionWithContext(int i, Map<String, String> map);

    void finishCurrentActionWithResult(int i);

    String finishProcess(int i);

    int startAction(int i);
}

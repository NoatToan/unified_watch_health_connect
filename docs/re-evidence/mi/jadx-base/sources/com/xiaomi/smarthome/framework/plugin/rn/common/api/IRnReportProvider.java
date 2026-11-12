package com.xiaomi.smarthome.framework.plugin.rn.common.api;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnReportProvider {
    int getRnNativeApiLevel();

    boolean needTrace(int i, String str);

    void statReport(String str, String str2, Map<String, Object> map);
}

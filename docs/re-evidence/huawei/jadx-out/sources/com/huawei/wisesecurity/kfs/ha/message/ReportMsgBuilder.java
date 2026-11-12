package com.huawei.wisesecurity.kfs.ha.message;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public interface ReportMsgBuilder {
    LinkedHashMap<String, String> build();

    String getEventId();
}

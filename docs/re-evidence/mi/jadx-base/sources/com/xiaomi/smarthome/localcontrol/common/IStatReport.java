package com.xiaomi.smarthome.localcontrol.common;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IStatReport {
    public static final int TYPE_EXCUTE = 1;
    public static final int TYPE_FAILED = 2;
    public static final int TYPE_SUCCESS = 3;

    void reportStat(int i, JSONObject jSONObject);
}

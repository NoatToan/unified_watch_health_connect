package com.xiaomi.hm.health.bt.sdk;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public interface IDailyDataSyncCallback extends Serializable {
    public static final long serialVersionUID = 1;

    void onActivityDataSyncFinish();

    void onOsaDataSyncFinish();
}

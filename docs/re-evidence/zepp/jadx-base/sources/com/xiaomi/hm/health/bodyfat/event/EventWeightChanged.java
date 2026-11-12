package com.xiaomi.hm.health.bodyfat.event;

import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes19.dex */
public class EventWeightChanged {
    public static final int TYPE_ADD_USER = 1;
    public static final int TYPE_ADD_WEIGHT_INFO = 6;
    public static final int TYPE_DELETE_USER = 2;
    public static final int TYPE_DELETE_WEIGHT_INFO = 5;
    public static final int TYPE_FROM_BOUND = 9;
    public static final int TYPE_FROM_SYNC_WEIGHT = 8;
    public static final int TYPE_MATCHED_USER_CHOOSE = 4;
    public static final int TYPE_MATCHED_USER_SINGLE = 3;
    public static final int TYPE_SYNC_MATCHED_USER = 7;
    private static final String a = "EventWeightChanged";
    public int type;
    public long uid;

    public EventWeightChanged(int i) {
        this.type = i;
    }

    public EventWeightChanged(long j, int i) {
        HMLog.d(a, "uid = " + j + " , type = " + i, new Object[0]);
        this.uid = j;
        this.type = i;
    }
}

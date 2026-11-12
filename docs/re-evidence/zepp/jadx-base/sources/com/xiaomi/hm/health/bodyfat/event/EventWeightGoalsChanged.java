package com.xiaomi.hm.health.bodyfat.event;

/* JADX INFO: loaded from: classes19.dex */
public class EventWeightGoalsChanged {
    public static final int TYPE_ADD_WEIGHT_GOAL = 1;
    public static final int TYPE_DELETE_WEIGHT_GOAL = -1;
    public int type;

    public EventWeightGoalsChanged(int i) {
        this.type = i;
    }
}

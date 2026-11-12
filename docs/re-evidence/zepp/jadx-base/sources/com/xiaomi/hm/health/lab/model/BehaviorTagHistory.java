package com.xiaomi.hm.health.lab.model;

import com.xiaomi.hm.health.databases.model.LabAction;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTagHistory {
    public static final int REST_CANCEL = 4;
    public static final int REST_FAIL = 2;
    public static final int REST_SUCCESS = 1;
    private List<LabAction> a;
    private int b;
    private boolean c;

    public BehaviorTagHistory(boolean z) {
        this.c = z;
    }

    public List<LabAction> getLabActionList() {
        return this.a;
    }

    public int getRestCode() {
        return this.b;
    }

    public boolean isRefresh() {
        return this.c;
    }

    public void setLabActionList(List<LabAction> list) {
        this.a = list;
    }

    public void setRefresh(boolean z) {
        this.c = z;
    }

    public void setRestCode(int i) {
        this.b = i;
    }
}

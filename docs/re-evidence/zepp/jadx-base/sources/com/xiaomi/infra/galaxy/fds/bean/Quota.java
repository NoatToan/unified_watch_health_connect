package com.xiaomi.infra.galaxy.fds.bean;

import com.xiaomi.infra.galaxy.fds.Action;

/* JADX INFO: loaded from: classes22.dex */
public class Quota {
    private QuotaType a;
    private Action b;
    private long c;

    public enum QuotaType {
        QPS,
        Throughput
    }

    public Quota() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quota quota = (Quota) obj;
        return this.c == quota.c && this.b == quota.b && this.a == quota.a;
    }

    public Action getAction() {
        return this.b;
    }

    public QuotaType getType() {
        return this.a;
    }

    public long getValue() {
        return this.c;
    }

    public int hashCode() {
        QuotaType quotaType = this.a;
        int iHashCode = (quotaType != null ? quotaType.hashCode() : 0) * 31;
        Action action = this.b;
        int iHashCode2 = (iHashCode + (action != null ? action.hashCode() : 0)) * 31;
        long j = this.c;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public void setAction(Action action) {
        this.b = action;
    }

    public void setType(QuotaType quotaType) {
        this.a = quotaType;
    }

    public void setValue(long j) {
        this.c = j;
    }

    public Quota(QuotaType quotaType, Action action, long j) {
        this.a = quotaType;
        this.b = action;
        this.c = j;
    }
}

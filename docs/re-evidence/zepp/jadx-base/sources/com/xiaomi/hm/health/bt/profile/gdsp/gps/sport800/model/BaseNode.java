package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "", "timeAnchor", "currentTime", "a", "J", "getTimeDiff", "()J", "timeDiff", "<init>", "(J)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseNode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timeDiff;

    public BaseNode(long j) {
        this.timeDiff = j;
    }

    public final long currentTime(long timeAnchor) {
        return timeAnchor + this.timeDiff;
    }

    public final long getTimeDiff() {
        return this.timeDiff;
    }
}

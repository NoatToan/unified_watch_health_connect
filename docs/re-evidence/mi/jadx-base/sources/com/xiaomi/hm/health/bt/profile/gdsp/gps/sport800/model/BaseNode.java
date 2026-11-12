package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.model;

import com.miui.tsmclient.entity.UIConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/model/BaseNode;", "", "timeDiff", "", "(J)V", "getTimeDiff", "()J", UIConfig.KEY_CURRENT_TIME, "timeAnchor", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseNode {
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

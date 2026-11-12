package com.xiaomi.hm.health.running.event;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/running/event/EventSportTypeSwitched;", "", "", "a", LogUtil.I, "getLastSportType", "()I", "setLastSportType", "(I)V", "lastSportType", "b", "getCurrentSportType", "setCurrentSportType", "currentSportType", "<init>", "(II)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventSportTypeSwitched {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int lastSportType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int currentSportType;

    public EventSportTypeSwitched(int i, int i2) {
        this.lastSportType = i;
        this.currentSportType = i2;
    }

    public final int getCurrentSportType() {
        return this.currentSportType;
    }

    public final int getLastSportType() {
        return this.lastSportType;
    }

    public final void setCurrentSportType(int i) {
        this.currentSportType = i;
    }

    public final void setLastSportType(int i) {
        this.lastSportType = i;
    }
}

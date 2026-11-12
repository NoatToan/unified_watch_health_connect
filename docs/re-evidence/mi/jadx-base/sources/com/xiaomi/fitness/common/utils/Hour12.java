package com.xiaomi.fitness.common.utils;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/Hour12;", "", "<init>", "()V", "hour", "", "getHour", "()I", "setHour", "(I)V", "isAnte", "", "()Z", "setAnte", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Hour12 {
    private int hour;
    private boolean isAnte = true;

    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: isAnte, reason: from getter */
    public final boolean getIsAnte() {
        return this.isAnte;
    }

    public final void setAnte(boolean z) {
        this.isAnte = z;
    }

    public final void setHour(int i) {
        this.hour = i;
    }
}

package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isInValidTime", "", "time", "", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordTimeUtilKt {
    public static final boolean isInValidTime(long j) {
        return j < 1704038400;
    }
}

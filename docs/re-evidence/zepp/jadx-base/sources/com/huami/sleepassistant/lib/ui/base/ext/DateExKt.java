package com.huami.sleepassistant.lib.ui.base.ext;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\"\u0016\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", StatEvent.TP_FIRST, "second", "", "getDifferDay", "DURATION_ONE_MIN", LogUtil.I, "lib_release"}, k = 2, mv = {1, 5, 1})
public final class DateExKt {
    public static final int DURATION_ONE_MIN = 60000;

    public static final int getDifferDay(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        int i = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j2));
        return Math.abs(i - calendar2.get(5));
    }
}

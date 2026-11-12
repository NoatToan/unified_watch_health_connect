package com.xiaomi.hm.health.bt.profile.gdsp.base;

import java.util.Calendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPDataHandler;", "", "", "onReady", "", "total", "currentSize", "onProgress", "", "data", "Ljava/util/Calendar;", "onData", "", "errorCode", "onSubmit", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface GDSPDataHandler {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Calendar onData(@NotNull GDSPDataHandler gDSPDataHandler, @NotNull byte[] bArr) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            return calendar;
        }
    }

    @NotNull
    Calendar onData(@NotNull byte[] data);

    void onProgress(long total, long currentSize);

    void onReady();

    int onSubmit(int errorCode);
}

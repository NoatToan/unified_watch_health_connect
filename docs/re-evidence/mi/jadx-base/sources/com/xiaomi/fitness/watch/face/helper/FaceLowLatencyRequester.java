package com.xiaomi.fitness.watch.face.helper;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.sync.model.ICalendar;
import defpackage.bxo;
import defpackage.s7r;
import defpackage.txo;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/FaceLowLatencyRequester;", "", "<init>", "()V", "timerTask", "Ljava/util/TimerTask;", "timer", "Ljava/util/Timer;", "requestCount", "", "startTimer", "", "stopTimer", "reset", "requestLowLatency", "open", "", ICalendar.Property.DURATION, "TAG", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceLowLatencyRequester {
    private static final int DURATION = 5;

    @NotNull
    public static final FaceLowLatencyRequester INSTANCE = new FaceLowLatencyRequester();

    @NotNull
    private static final String TAG = "FaceLowLatencyRequester";
    private static int requestCount;

    @Nullable
    private static Timer timer;

    @Nullable
    private static TimerTask timerTask;

    private FaceLowLatencyRequester() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLowLatency(boolean open) {
        Logger.i(TAG, "requestLowLatency requestCount: " + requestCount);
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 67;
        txo txoVar = new txo();
        bxo bxoVar = new bxo();
        bxoVar.c = open ? 5 : 0;
        txoVar.c0(bxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    private final void stopTimer() {
        requestCount = 0;
        TimerTask timerTask2 = timerTask;
        if (timerTask2 != null) {
            timerTask2.cancel();
        }
        timerTask = null;
        Timer timer2 = timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        Timer timer3 = timer;
        if (timer3 != null) {
            timer3.purge();
        }
        timer = null;
    }

    public final void reset() {
        Logger.i(TAG, "reset");
        stopTimer();
        requestLowLatency(false);
    }

    public final void startTimer() {
        stopTimer();
        if (timerTask == null) {
            timerTask = new TimerTask() { // from class: com.xiaomi.fitness.watch.face.helper.FaceLowLatencyRequester.startTimer.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    FaceLowLatencyRequester.requestCount++;
                    FaceLowLatencyRequester.INSTANCE.requestLowLatency(true);
                }
            };
        }
        if (timer == null) {
            Timer timer2 = new Timer();
            timer = timer2;
            timer2.schedule(timerTask, 0L, 5000L);
        }
    }
}

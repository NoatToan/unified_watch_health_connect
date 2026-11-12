package com.huami.sleep.daysleep.quotient.processor;

import com.huami.sleep.daysleep.quotient.SleepQuotientDto;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.util.TimeShowUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/processor/RemProcessor;", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientDto;", "sleepQuotient", "Lkotlin/Pair;", "", "checkRemShowAndDetection", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class RemProcessor {

    @NotNull
    public static final RemProcessor INSTANCE = new RemProcessor();

    private RemProcessor() {
    }

    @NotNull
    public final Pair<Boolean, Boolean> checkRemShowAndDetection(@NotNull SleepQuotientDto sleepQuotient) {
        long startTime = sleepQuotient.getStartTime();
        boolean zIsRemSupport = sleepQuotient.isRemSupport();
        boolean zSupportHrSleep = KoinExtKt.getDeviceManager().supportHrSleep();
        if (!TimeShowUtilsKt.isToday(startTime) || !zSupportHrSleep) {
            return new Pair<>(Boolean.valueOf(zIsRemSupport), Boolean.FALSE);
        }
        boolean zSleepRemEnabled = KoinExtKt.getDeviceManager().sleepRemEnabled();
        return new Pair<>(Boolean.valueOf(!zSleepRemEnabled || zIsRemSupport), Boolean.valueOf(!zSleepRemEnabled));
    }
}

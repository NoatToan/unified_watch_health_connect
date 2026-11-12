package com.huami.sleepassistant.lib.service;

import com.huami.sleepassistant.servicelib.service.SleepAidService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0013\u0010\u0003\u001a\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "getSleepService", "()Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "sleepService", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class SleepServiceKt {
    @NotNull
    public static final SleepAidService getSleepService() {
        return SleepService.INSTANCE.getSLEEP_AID_SERVICE();
    }
}

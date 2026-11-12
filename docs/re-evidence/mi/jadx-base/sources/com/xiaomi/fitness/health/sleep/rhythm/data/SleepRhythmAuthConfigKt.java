package com.xiaomi.fitness.health.sleep.rhythm.data;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getRhythmAuthConfig", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmAuthConfig;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmAuthConfigKt {
    @NotNull
    public static final SleepRhythmAuthConfig getRhythmAuthConfig() {
        AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging();
        return new SleepRhythmAuthConfig(1000L, 1);
    }
}

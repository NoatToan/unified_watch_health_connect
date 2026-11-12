package com.xiaomi.fitness.health.sleep.utils;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/utils/SleepSettingPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "KEY_LAST_SLEEP_ASSIST_CACHE", "setLastSleepAssistSwitchStatus", "", "did", "isOpen", "", "getLastSleepAssistSwitchStatus", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSettingPreference extends PreferenceSupport {

    @NotNull
    public static final SleepSettingPreference INSTANCE = new SleepSettingPreference();

    @NotNull
    private static final String KEY_LAST_SLEEP_ASSIST_CACHE = "sleep_assist";

    @NotNull
    public static final String TAG = "SleepSettingPreference";

    private SleepSettingPreference() {
    }

    public final boolean getLastSleepAssistSwitchStatus(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = "sleep_assist_" + did;
        boolean zBooleanValue = ((Boolean) getValue(str, Boolean.FALSE)).booleanValue();
        Logger.i(TAG, "getLastSleepAssistSwitchStatus " + str + " " + zBooleanValue);
        return zBooleanValue;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "health_sleep_pref";
    }

    public final void setLastSleepAssistSwitchStatus(@NotNull String did, boolean isOpen) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "setLastSleepAssistSwitchStatus " + did + " " + isOpen);
        StringBuilder sb = new StringBuilder();
        sb.append("sleep_assist_");
        sb.append(did);
        putValue(sb.toString(), Boolean.valueOf(isOpen));
    }
}

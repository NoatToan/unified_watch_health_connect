package com.xiaomi.fitness.keep_alive;

import android.provider.Settings;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.CoreExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/KeepAliveConfig;", "", "<init>", "()V", "keepAliveEnable", "", "isKeepAliveEnable", "", "TAG", "", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeepAliveConfig {

    @NotNull
    public static final KeepAliveConfig INSTANCE = new KeepAliveConfig();

    @NotNull
    private static final String TAG = "KeepAliveConfig";

    private KeepAliveConfig() {
    }

    public final boolean isKeepAliveEnable() {
        try {
            return Settings.Global.getInt(CoreExtKt.getContext().getContentResolver(), "MiWearEnabled", 0) == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void keepAliveEnable() {
        try {
            Logger.i(TAG, "keepAliveEnable() called " + Settings.Global.putInt(CoreExtKt.getContext().getContentResolver(), "MiWearEnabled", 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

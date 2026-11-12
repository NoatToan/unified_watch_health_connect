package com.xiaomi.fitness.devicesettings.huami.alarmnotify;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/alarmnotify/HuaMiAlarmNotifyViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "hasScreenLockPwd", "", "context", "Landroid/content/Context;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiAlarmNotifyViewModel extends AbsViewModel {
    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final boolean hasScreenLockPwd(@Nullable Context context) {
        Object systemService = context != null ? context.getSystemService("keyguard") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).isKeyguardSecure();
    }
}

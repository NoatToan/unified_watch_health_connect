package com.xiaomi.fitness.push.utils;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.push.configs.PushConfigs;
import com.xiaomi.fitness.push.core.MiPush;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/push/utils/PushUtils;", "", "<init>", "()V", LoginPreferenceConfig.TYPE_REGISTER, "", "setRegion", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushUtils {

    @NotNull
    public static final PushUtils INSTANCE = new PushUtils();

    private PushUtils() {
    }

    public final void register() {
        MiPush.INSTANCE.register(AppUtil.getApp(), PushConfigs.sAppId, PushConfigs.sAppkey);
    }

    public final void setRegion() {
    }
}

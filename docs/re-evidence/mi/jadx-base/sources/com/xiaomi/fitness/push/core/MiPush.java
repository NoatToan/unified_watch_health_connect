package com.xiaomi.fitness.push.core;

import android.content.Context;
import com.xiaomi.fitness.push.configs.PushConfigs;
import com.xiaomi.fitness.push.utils.PushUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/push/core/MiPush;", "", "<init>", "()V", LoginPreferenceConfig.TYPE_REGISTER, "", "context", "Landroid/content/Context;", q.f13858b, "", "appKey", "unRegister", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiPush {

    @NotNull
    public static final MiPush INSTANCE = new MiPush();

    private MiPush() {
    }

    public static /* synthetic */ void register$default(MiPush miPush, Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = PushConfigs.sAppId;
        }
        if ((i & 4) != 0) {
            str2 = PushConfigs.sAppkey;
        }
        miPush.register(context, str, str2);
    }

    public final void register(@NotNull Context context, @NotNull String appId, @NotNull String appKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        PushUtils.INSTANCE.setRegion();
        b.J(context, appId, appKey);
    }

    public final void unRegister(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b.i0(context);
    }
}

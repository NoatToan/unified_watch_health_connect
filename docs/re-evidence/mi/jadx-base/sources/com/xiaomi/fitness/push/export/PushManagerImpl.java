package com.xiaomi.fitness.push.export;

import android.content.Context;
import com.xiaomi.fitness.push.core.MessageCenter;
import com.xiaomi.fitness.push.core.MiPush;
import com.xiaomi.fitness.push.request.PushHelper;
import com.xiaomi.fitness.push.sp.PushPreference;
import com.xiaomi.fitness.push.utils.PushUtils;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/push/export/PushManagerImpl;", "Lcom/xiaomi/fitness/push/export/PushManager;", "<init>", "()V", LoginPreferenceConfig.TYPE_REGISTER, "", "context", "Landroid/content/Context;", "unRegister", "isOpenPush", "", "processPendingMessage", "push_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushManagerImpl implements PushManager {
    @Override // com.xiaomi.fitness.push.export.PushManager
    public boolean isOpenPush() {
        return PushPreference.INSTANCE.isOpenPush();
    }

    @Override // com.xiaomi.fitness.push.export.PushManager
    public void processPendingMessage() {
        MessageCenter.INSTANCE.processPendingMessage();
    }

    @Override // com.xiaomi.fitness.push.export.PushManager
    public void register(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PushUtils.INSTANCE.register();
    }

    @Override // com.xiaomi.fitness.push.export.PushManager
    public void unRegister(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PushHelper.INSTANCE.unRegisterPushId();
        MiPush.INSTANCE.unRegister(context);
    }
}

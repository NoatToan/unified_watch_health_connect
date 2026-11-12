package com.xiaomi.fitness.notify.callnotify;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0011\u001a\u00020\fH\u0002J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/WechatCallNotifyManager;", "", "<init>", "()V", "TAG", "", "MIN_INTERVAL", "", "callNotificationKey", "postTime", "Ljava/lang/Long;", "setKeyAndTime", "", "key", "getKey", "isCallNotifyKey", "", "reset", "sendRemoveMessageDelayIfNeed", "handler", "Landroid/os/Handler;", "removeTime", "message", "Landroid/os/Message;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WechatCallNotifyManager {

    @NotNull
    public static final WechatCallNotifyManager INSTANCE = new WechatCallNotifyManager();
    private static final long MIN_INTERVAL = 5000;

    @NotNull
    private static final String TAG = "WechatCallManager";

    @Nullable
    private static String callNotificationKey;

    @Nullable
    private static Long postTime;

    private WechatCallNotifyManager() {
    }

    private final void reset() {
        Logger.i(TAG, "reset wechat call key: " + callNotificationKey + " time：" + postTime);
        callNotificationKey = null;
        postTime = null;
    }

    @Nullable
    public final String getKey() {
        return callNotificationKey;
    }

    public final boolean isCallNotifyKey(@Nullable String key) {
        if (key == null) {
            return false;
        }
        return Intrinsics.areEqual(key, callNotificationKey);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    public final void sendRemoveMessageDelayIfNeed(@NotNull Handler handler, long removeTime, @NotNull Message message) {
        long jLongValue;
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(message, "message");
        Long l = postTime;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            if (removeTime - l.longValue() < 5000) {
                Long l2 = postTime;
                Intrinsics.checkNotNull(l2);
                jLongValue = 5000 - (removeTime - l2.longValue());
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        Logger.i(TAG, "sendRemoveMessageDelay postTime：" + postTime + " removeTime: " + removeTime + " delayTime: " + jLongValue + " " + message.obj);
        handler.sendMessageDelayed(message, jLongValue);
    }

    public final void setKeyAndTime(@NotNull String key, long postTime2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.i(TAG, "set wechat call key: " + key);
        reset();
        callNotificationKey = key;
        postTime = Long.valueOf(postTime2);
    }
}

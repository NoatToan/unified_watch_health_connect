package com.xiaomi.hm.health.push;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.annotations.SerializedName;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.push.event.EventNewMessageReceived;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class MessageManager implements LoggerInterface {

    @SerializedName("enable")
    public static final Boolean ENABLE = Boolean.TRUE;
    public static final String TAG = "messageBuilder";
    private static final String f = "last_update_time";
    private static final int g = 9;
    private static final int h = 0;
    private static final int i = 23;
    private static final int j = 0;
    private static int k;
    private static final int l = 0;
    private static volatile MessageManager m;
    private final WeakReference<Context> c;

    @SerializedName("appKey")
    private final String e;
    private EventBus a = null;
    private SharedPreferences b = null;

    @SerializedName("appId")
    private final String d = "";

    private MessageManager(Context context) {
        if (GlobalConfig.get().isBuildMidong()) {
            this.e = "5731738397915";
        } else {
            this.e = "5171716313841";
        }
        this.c = new WeakReference<>(context);
        c(context);
    }

    private void b() {
        Context context = this.c.get();
        if (context != null) {
            Analytics.recordEvent(new CountEventBuilder(MiPushMessageReceiver.MIPUSH_UNREGISTER));
            EventBus.getDefault().unregister(this);
            MiPushClient.unregisterPush(context);
        }
        m = null;
    }

    private void c(Context context) {
        HMLog.i(TAG, PointCategory.INIT, new Object[0]);
        Logger.setLogger(context, this);
        EventBus eventBus = EventBus.getDefault();
        this.a = eventBus;
        eventBus.register(this, Integer.MIN_VALUE);
        this.b = context.getSharedPreferences("Message", 0);
    }

    public static MessageManager getDefault(Context context) {
        if (m == null) {
            synchronized (MessageManager.class) {
                if (m == null) {
                    m = new MessageManager(context);
                }
            }
        }
        return m;
    }

    public BaseMessage a(Context context, String str) {
        try {
            return PushConfig.getBuildMessage().invoke(context, str);
        } catch (Exception e) {
            HMLog.e(TAG, e.getMessage(), new Object[0]);
            return null;
        }
    }

    public boolean hasNewMessage() {
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences != null && sharedPreferences.getBoolean(f, false);
    }

    public void initMiPush(Context context) {
        Analytics.recordEvent(new CountEventBuilder(MiPushMessageReceiver.PUSH_NOTIFICATION_ENABLE).setValue(String.valueOf(NotificationManagerCompat.from(context).areNotificationsEnabled())));
        if (PushConfig.getPush() == null) {
            HMLog.i(TAG, "PushConfig.getPush is null!!!", new Object[0]);
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(MiPushMessageReceiver.MIPUSH_REGISTER));
        MiPushClient.registerPush(context, PushConfig.getPush().getXiaomiId(), PushConfig.getPush().getXiaomiKey());
        if (DifferenceManager.isBuildMidong()) {
            return;
        }
        MiPushClient.setAcceptTime(context, 9, 0, 23, 0, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        HMLog.i(TAG, str, new Object[0]);
    }

    public void logout() {
        HMLog.i(TAG, "logout", new Object[0]);
        markHasNewMessage(false);
        Context context = this.c.get();
        if (context != null) {
            Analytics.recordEvent(new CountEventBuilder(MiPushMessageReceiver.MIPUSH_ALIAS_UNSET));
            MiPushClient.unsetAlias(context, String.valueOf(0L), null);
            b();
        }
    }

    public void markHasNewMessage(boolean z) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(f, z);
            editorEdit.apply();
        }
    }

    public void onEvent(BaseMessage baseMessage) {
        boolean z = baseMessage.getMessageType().equals(Type.FOLLOW_MESSAGE) && baseMessage.getSubtype() == 0;
        boolean zEquals = baseMessage.getMessageType().equals(Type.UNFOLLOW_MESSAGE);
        if (this.a == null || zEquals) {
            return;
        }
        baseMessage.show();
        if (z) {
            return;
        }
        markHasNewMessage(true);
        this.a.post(new EventNewMessageReceived());
    }

    @Deprecated
    public void reInitPush() {
        Context context = this.c.get();
        HMLog.i(TAG, "reInitPush", new Object[0]);
        if (context == null) {
            HMLog.i(TAG, "reInitPush error", new Object[0]);
        } else {
            MiPushClient.registerPush(context, PushConfig.getPush().getXiaomiId(), PushConfig.getPush().getXiaomiKey());
        }
    }

    public void register(Object obj) {
        EventBus eventBus = this.a;
        if (eventBus != null) {
            eventBus.unregister(obj);
            EventBus eventBus2 = this.a;
            int i2 = k;
            k = i2 + 1;
            eventBus2.register(obj, i2);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
    }

    public void unregister(Object obj) {
        EventBus eventBus = this.a;
        if (eventBus != null) {
            eventBus.unregister(obj);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th) {
        HMLog.i(TAG, str, new Object[0]);
    }

    public static MessageManager getDefault() {
        return m;
    }
}

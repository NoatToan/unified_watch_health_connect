package com.huami.sync;

import android.content.Context;
import com.huami.sync.job.LoggingKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/sync/TransmissionNotification;", "", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "trySend", "", "Ljava/lang/String;", "CHANNEL_ID", "b", "CHANNEL_NAME", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class TransmissionNotification {

    @NotNull
    public static final TransmissionNotification INSTANCE = new TransmissionNotification();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String CHANNEL_ID = "real_time_transmission_id";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String CHANNEL_NAME = "real_time_transmission";

    private TransmissionNotification() {
    }

    private final boolean a() {
        LoggingKt.log("检测是否显示通知栏");
        RealTimeCache realTimeCache = RealTimeCache.INSTANCE;
        long lastSendTime = realTimeCache.getLastSendTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - lastSendTime;
        boolean z = j >= ((long) Config.INSTANCE.getNotificationPeriod());
        LoggingKt.log("上次通知发送时间：" + lastSendTime + " 当前时间：" + jCurrentTimeMillis + " 间隔：" + (j / ((long) 1000)) + "秒 needShow = " + z);
        if (z) {
            realTimeCache.saveLastSendTime(jCurrentTimeMillis);
        }
        return z;
    }

    public final void trySend(@NotNull Context context) {
        if (a()) {
            LoggingKt.log("显示通知栏");
            NotificationHelper.INSTANCE.showNotification(context, CHANNEL_ID, CHANNEL_NAME, context.getResources().getString(R.string.realtime_sync), context.getResources().getString(R.string.realtime_notice));
        }
    }
}

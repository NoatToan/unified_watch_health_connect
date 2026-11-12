package com.huami.assistant.dataexchange.actions;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.assistant.dataexchange.Actions;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.notification.data.StatusBarNotificationData;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.AppUtil;

/* JADX INFO: loaded from: classes5.dex */
public class NotificationAction extends Action {
    private StatusBarNotificationData f;

    public NotificationAction(Context context, int id, String title, String text) {
        this.f = buildStatusBarData(context, id, title, text);
    }

    public static StatusBarNotificationData buildStatusBarData(Context context, int id, String title, String text) {
        String packageName = context.getPackageName();
        String str = "0|" + packageName + AESEncryptionHelper.SEPARATOR + id + AESEncryptionHelper.SEPARATOR + ((Object) null) + AESEncryptionHelper.SEPARATOR + AppUtil.getUID(context, packageName);
        StatusBarNotificationData statusBarNotificationData = new StatusBarNotificationData();
        statusBarNotificationData.pkg = packageName;
        statusBarNotificationData.id = id;
        statusBarNotificationData.key = str;
        statusBarNotificationData.groupKey = str;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(title);
        builder.setContentText(text);
        statusBarNotificationData.notification = NotificationData.from(context, NotificationKeyData.from(packageName, id, null, str, null), builder.build(), false);
        return statusBarNotificationData;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public String target() {
        return Actions.NOTIFICATION;
    }

    @Override // com.huami.watch.dataflow.exchange.Action
    public DataBundle toWatchData() {
        DataBundle watchData = super.toWatchData();
        StatusBarNotificationData statusBarNotificationData = this.f;
        if (statusBarNotificationData != null) {
            watchData.putParcelable("data", statusBarNotificationData);
        }
        return watchData;
    }

    public NotificationAction(StatusBarNotificationData data) {
        this.f = data;
    }
}

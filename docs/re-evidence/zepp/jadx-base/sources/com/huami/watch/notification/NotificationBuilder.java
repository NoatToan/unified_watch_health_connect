package com.huami.watch.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.notification.data.RemoteInputData;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationBuilder {
    public static final boolean DEBUG = Config.isDebug();
    public static final String TAG = "Noti.Builder";

    private static Class<? extends NotificationCompat.Style> a(String str) {
        Class<? extends NotificationCompat.Style>[] clsArr = {NotificationCompat.BigTextStyle.class, NotificationCompat.BigPictureStyle.class, NotificationCompat.InboxStyle.class};
        for (int i = 0; i < 3; i++) {
            Class<? extends NotificationCompat.Style> cls = clsArr[i];
            if (cls.getName().contains(str)) {
                return cls;
            }
        }
        return null;
    }

    private static NotificationCompat.Style b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Class<? extends NotificationCompat.Style> clsA = a(str);
        if (clsA != null) {
            try {
                return clsA.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                Log.e(TAG, "Could not create Style", th, new Object[0]);
                return null;
            }
        }
        if (DEBUG) {
            Log.d(TAG, "Unknown style class: " + str, new Object[0]);
        }
        return null;
    }

    public static Notification to(Context context, NotificationData notificationData) {
        Bundle bundle = new Bundle();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(notificationData.title);
        boolean z = DEBUG;
        builder.setContentText(notificationData.text);
        builder.setLargeIcon(notificationData.largeIcon);
        builder.setWhen(notificationData.when);
        builder.setShowWhen(true);
        builder.setExtras(bundle);
        NotificationData.StyleData styleData = notificationData.style;
        int i = 0;
        if (styleData != null) {
            NotificationCompat.Style styleB = b(styleData.styleName);
            if (z) {
                Log.d(TAG, "StyleName : " + notificationData.style.styleName, new Object[0]);
                Log.d(TAG, "Style : " + styleB, new Object[0]);
            }
            if (styleB != null) {
                if (styleB instanceof NotificationCompat.InboxStyle) {
                    String[] strArr = notificationData.style.textLines;
                    if (strArr != null && strArr.length > 0) {
                        for (String str : strArr) {
                            ((NotificationCompat.InboxStyle) styleB).addLine(str);
                        }
                    }
                    ((NotificationCompat.InboxStyle) styleB).setSummaryText(notificationData.style.summaryText);
                } else if (styleB instanceof NotificationCompat.BigTextStyle) {
                    NotificationCompat.BigTextStyle bigTextStyle = (NotificationCompat.BigTextStyle) styleB;
                    bigTextStyle.setBigContentTitle(notificationData.style.bigContentTitle);
                    bigTextStyle.setSummaryText(notificationData.style.summaryText);
                    bigTextStyle.bigText(notificationData.style.bigText);
                } else if (styleB instanceof NotificationCompat.BigPictureStyle) {
                    NotificationCompat.BigPictureStyle bigPictureStyle = (NotificationCompat.BigPictureStyle) styleB;
                    bigPictureStyle.bigPicture(notificationData.style.bigPicture);
                    bigPictureStyle.setBigContentTitle(notificationData.style.bigContentTitle);
                    bigPictureStyle.setSummaryText(notificationData.style.summaryText);
                }
                builder.setStyle(styleB);
            }
        }
        NotificationData.ActionData[] actionDataArr = notificationData.actions;
        if (actionDataArr != null && actionDataArr.length > 0) {
            while (true) {
                NotificationData.ActionData[] actionDataArr2 = notificationData.actions;
                if (i >= actionDataArr2.length) {
                    break;
                }
                builder.addAction(toAction(actionDataArr2[i]));
                i++;
            }
        }
        return builder.build();
    }

    public static NotificationCompat.Action toAction(NotificationData.ActionData actionData) {
        int i = 0;
        NotificationCompat.Action.Builder builder = new NotificationCompat.Action.Builder(0, actionData.title, (PendingIntent) null);
        RemoteInputData[] remoteInputDataArr = actionData.remoteInputs;
        if (remoteInputDataArr != null && remoteInputDataArr.length > 0) {
            while (true) {
                RemoteInputData[] remoteInputDataArr2 = actionData.remoteInputs;
                if (i >= remoteInputDataArr2.length) {
                    break;
                }
                builder.addRemoteInput(toRemoteInput(remoteInputDataArr2[i]));
                i++;
            }
        }
        return builder.build();
    }

    public static RemoteInput toRemoteInput(RemoteInputData remoteInputData) {
        RemoteInput.Builder builder = new RemoteInput.Builder(remoteInputData.resultKey);
        builder.setLabel(remoteInputData.label);
        builder.setChoices(remoteInputData.choices);
        return builder.build();
    }
}

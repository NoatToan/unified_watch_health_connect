package com.huami.watch.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.huami.watch.notification.data.NotificationData;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.notification.data.RemoteInputData;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Config;
import com.huami.watch.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationHandler {
    public static final int BLOCK_APP = 2;
    public static final boolean DEBUG = Config.isDebug();
    public static final int PENDING_INTENT_CONTENT = 0;
    public static final int PENDING_INTENT_DELETE = 1;
    public static final String TAG = "Noti-Handler";

    public interface Handler {
        void handle(Context context, Transporter transporter);

        void handle(Context context, Transporter transporter, Object obj);

        void handleLocal(Context context);

        void handleLocal(Context context, Object obj);
    }

    public static class d extends c {
        private String a;
        private byte[] b;

        public d(String str, byte[] bArr) {
            super();
            this.a = str;
            this.b = bArr;
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            super.handle(context, transporter);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            String str;
            super.handle(context, transporter, obj);
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue != 1) {
                str = iIntValue != 2 ? null : "action_huami_ios_ancs_block";
            } else {
                str = "action_huami_ios_ancs_del";
            }
            Intent intent = new Intent(str);
            intent.putExtra("pkgname", this.a);
            intent.putExtra("uid", this.b);
            context.sendBroadcast(intent);
            boolean z = NotificationHandler.DEBUG;
        }
    }

    public static class e extends c {
        public Notification.Action a;
        public String b;

        public e(Notification.Action action, String str) {
            super();
            this.a = action;
            this.b = str;
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            handleLocal(context);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        @TargetApi(19)
        public void handleLocal(Context context) {
            super.handleLocal(context);
            Notification.Action action = this.a;
            if (action == null) {
                return;
            }
            try {
                action.actionIntent.send(context, 0, (Intent) null);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            handleLocal(context, obj);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        @TargetApi(20)
        public void handleLocal(Context context, Object obj) {
            RemoteInput[] remoteInputs;
            super.handleLocal(context, obj);
            Notification.Action action = this.a;
            if (action == null || this.b == null || (remoteInputs = action.getRemoteInputs()) == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(this.b, (String) obj);
            Intent intent = new Intent();
            RemoteInput.addResultsToIntent(remoteInputs, intent, bundle);
            try {
                this.a.actionIntent.send(context, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }
    }

    public static class f extends c {
        public Notification a;

        public f(Notification notification) {
            super();
            this.a = notification;
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            handleLocal(context);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handleLocal(Context context) {
            super.handleLocal(context);
            handleLocal(context, 0);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            handleLocal(context, obj);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handleLocal(Context context, Object obj) {
            PendingIntent pendingIntent;
            super.handleLocal(context, obj);
            if (this.a == null) {
                return;
            }
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue != 0) {
                pendingIntent = iIntValue != 1 ? null : this.a.deleteIntent;
            } else {
                pendingIntent = this.a.contentIntent;
            }
            if (pendingIntent == null) {
                return;
            }
            try {
                pendingIntent.send(context, 0, (Intent) null);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }
    }

    private NotificationHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        String string = Settings.System.getString(context.getContentResolver(), "com.huami.watch.notification.PendingBlockList");
        if (string == null) {
            string = "";
        }
        if (string.contains(str)) {
            if (DEBUG) {
                Log.w(TAG, "PendingBlockList Already Contains : " + str, new Object[0]);
                return;
            }
            return;
        }
        String str2 = string + str + ",";
        if (DEBUG) {
            Log.d(TAG, "Save PendingBlockList : " + str, new Object[0]);
        }
        Settings.System.putString(context.getContentResolver(), "com.huami.watch.notification.PendingBlockList", str2);
    }

    private static Handler c(NotificationKeyData notificationKeyData, int i, String str, boolean z) {
        return new b(notificationKeyData, i, str, z);
    }

    private static Handler d(Notification.Action action, String str) {
        return new e(action, str);
    }

    private static Handler e(Notification notification) {
        return new f(notification);
    }

    private static Handler f(NotificationKeyData notificationKeyData) {
        return new g(notificationKeyData);
    }

    public static Handler prepareActionHandler(NotificationKeyData notificationKeyData, NotificationData.ActionData actionData, int i, boolean z, boolean z2) {
        if (z2) {
            return d(actionData == null ? null : actionData.originalAction, null);
        }
        return c(notificationKeyData, i, null, z);
    }

    public static Handler prepareHandler(NotificationKeyData notificationKeyData, NotificationData notificationData, boolean z) {
        if (z) {
            return e(notificationData == null ? null : notificationData.originalNotification);
        }
        return f(notificationKeyData);
    }

    public static Handler prepareIOSHandler(String str, byte[] bArr) {
        return new d(str, bArr);
    }

    public static Handler prepareRemoteInputHandler(NotificationKeyData notificationKeyData, NotificationData.ActionData actionData, int i, RemoteInputData remoteInputData, boolean z, boolean z2) {
        if (z2) {
            return d(actionData == null ? null : actionData.originalAction, remoteInputData != null ? remoteInputData.resultKey : null);
        }
        return c(notificationKeyData, i, remoteInputData != null ? remoteInputData.resultKey : null, z);
    }

    public static final class Phone {
        public static final String TAG = "Noti-Handler-Phone";

        /* JADX WARN: Code duplicated, block: B:25:0x004e  */
        private static StatusBarNotification a(NotificationListenerService notificationListenerService, NotificationKeyData notificationKeyData) {
            StatusBarNotification[] activeNotifications;
            StatusBarNotification statusBarNotification;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && !TextUtils.isEmpty(notificationKeyData.key)) {
                StatusBarNotification[] activeNotifications2 = notificationListenerService.getActiveNotifications(new String[]{notificationKeyData.key});
                if (activeNotifications2 == null || activeNotifications2.length <= 0) {
                    statusBarNotification = null;
                } else {
                    statusBarNotification = activeNotifications2[0];
                }
            } else if (i < 19 || (activeNotifications = notificationListenerService.getActiveNotifications()) == null || activeNotifications.length <= 0) {
                statusBarNotification = null;
            } else {
                for (StatusBarNotification statusBarNotification2 : activeNotifications) {
                    if (statusBarNotification2.getPackageName().equals(notificationKeyData.pkg) && statusBarNotification2.getId() == notificationKeyData.id) {
                        statusBarNotification = statusBarNotification2;
                    }
                }
                statusBarNotification = null;
            }
            Log.d(TAG, "Find StatusNoti : " + statusBarNotification, new Object[0]);
            return statusBarNotification;
        }

        @TargetApi(20)
        private static void b(Context context, PendingIntent pendingIntent, RemoteInput[] remoteInputArr, String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putString(str, str2);
            Intent intent = new Intent();
            RemoteInput.addResultsToIntent(remoteInputArr, intent, bundle);
            try {
                pendingIntent.send(context, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }

        private static void c(Context context, PendingIntent pendingIntent, String[] strArr, String str, String str2) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString(str, str2);
            Bundle bundle2 = new Bundle();
            for (String str3 : strArr) {
                Object obj = bundle.get(str3);
                if (obj instanceof CharSequence) {
                    bundle2.putCharSequence(str3, (CharSequence) obj);
                }
            }
            Intent intent2 = new Intent();
            intent2.putExtra(androidx.core.app.RemoteInput.EXTRA_RESULTS_DATA, bundle2);
            intent.setClipData(ClipData.newIntent(androidx.core.app.RemoteInput.RESULTS_CLIP_LABEL, intent2));
            try {
                pendingIntent.send(context, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Code duplicated, block: B:47:0x0150  */
        @TargetApi(19)
        public static void onNotificationActionReceived(NotificationListenerService notificationListenerService, DataBundle dataBundle) {
            PendingIntent pendingIntent;
            Parcelable[] parcelableArray;
            PendingIntent pendingIntent2;
            int i = Build.VERSION.SDK_INT;
            if (i < 19) {
                return;
            }
            NotificationKeyData notificationKeyData = (NotificationKeyData) dataBundle.getParcelable(TransportUri.KEY_NOTI);
            Log.d(TAG, "Receive Key : " + notificationKeyData, new Object[0]);
            if (notificationKeyData == null) {
                return;
            }
            boolean z = dataBundle.getBoolean(TransportUri.KEY_NOTU_ACTION_REPLY);
            boolean z2 = dataBundle.getBoolean(TransportUri.KEY_NOTI_ACTION_WEARABLE);
            int i2 = dataBundle.getInt(TransportUri.KEY_NOTI_ACTION_INDEX);
            String string = dataBundle.getString(TransportUri.KEY_NOTI_ACTION_REMOTE_INPUT_KEY);
            String string2 = dataBundle.getString(TransportUri.KEY_NOTI_ACTION_REMOTE_INPUT_RESULT);
            Log.d(TAG, "Receive Action Has Reply : " + z, new Object[0]);
            Log.d(TAG, "Receive Wearable : " + z2, new Object[0]);
            Log.d(TAG, "Receive Action Index : " + i2, new Object[0]);
            Log.d(TAG, "Receive Action RemoteInput ResultKey : " + string, new Object[0]);
            Log.d(TAG, "Receive Action RemoteInput Result : " + string2, new Object[0]);
            StatusBarNotification statusBarNotificationA = a(notificationListenerService, notificationKeyData);
            if (statusBarNotificationA == null) {
                return;
            }
            if (z2) {
                Bundle bundle = (Bundle) statusBarNotificationA.getNotification().extras.getParcelable(NotificationData.EXTRA_WEARABLE_EXTENSIONS);
                ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(NotificationData.WearableExtrasData.KEY_ACTIONS) : null;
                if (parcelableArrayList == null || parcelableArrayList.size() <= 0 || i2 >= parcelableArrayList.size()) {
                    pendingIntent2 = null;
                } else {
                    if (i >= 20) {
                        Notification.Action action = (Notification.Action) parcelableArrayList.get(i2);
                        pendingIntent = action.actionIntent;
                        if (z) {
                            b(notificationListenerService, pendingIntent, action.getRemoteInputs(), string, string2);
                        }
                    } else {
                        Log.d(TAG, "Wearable extras for 4.4!!", new Object[0]);
                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                        pendingIntent = (PendingIntent) bundle2.getParcelable("actionIntent");
                        if (z && (parcelableArray = bundle2.getParcelableArray("remoteInputs")) != null && parcelableArray.length > 0) {
                            String[] strArr = new String[parcelableArray.length];
                            for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                                strArr[i3] = ((Bundle) parcelableArray[i3]).getString("resultKey");
                            }
                            if (z) {
                                c(notificationListenerService, pendingIntent, strArr, string, string2);
                            }
                        }
                    }
                    pendingIntent2 = pendingIntent;
                }
            } else {
                Notification.Action[] actionArr = statusBarNotificationA.getNotification().actions;
                if (actionArr == null || actionArr.length <= 0 || i2 >= actionArr.length) {
                    pendingIntent2 = null;
                } else {
                    pendingIntent2 = actionArr[i2].actionIntent;
                }
            }
            if (pendingIntent2 == null || z) {
                return;
            }
            try {
                pendingIntent2.send(notificationListenerService, 0, (Intent) null);
            } catch (PendingIntent.CanceledException e) {
                e.printStackTrace();
            }
        }

        @TargetApi(21)
        public static void onNotificationDeleteReceived(NotificationListenerService notificationListenerService, DataBundle dataBundle) {
            onNotificationDeleteReceived(notificationListenerService, (NotificationKeyData) dataBundle.getParcelable(TransportUri.KEY_NOTI));
        }

        public static void onNotificationOpenReceived(NotificationListenerService notificationListenerService, DataBundle dataBundle) {
            StatusBarNotification statusBarNotificationA;
            NotificationKeyData notificationKeyData = (NotificationKeyData) dataBundle.getParcelable(TransportUri.KEY_NOTI);
            Log.d(TAG, "Receive Key : " + notificationKeyData, new Object[0]);
            if (notificationKeyData == null || (statusBarNotificationA = a(notificationListenerService, notificationKeyData)) == null) {
                return;
            }
            PendingIntent pendingIntent = statusBarNotificationA.getNotification().contentIntent;
            if (pendingIntent != null) {
                try {
                    pendingIntent.send(notificationListenerService, 0, (Intent) null);
                    return;
                } catch (PendingIntent.CanceledException e) {
                    e.printStackTrace();
                    return;
                }
            }
            try {
                notificationListenerService.startActivity(notificationListenerService.getPackageManager().getLaunchIntentForPackage(notificationKeyData.pkg));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public static void onNotificationDeleteReceived(NotificationListenerService notificationListenerService, NotificationKeyData notificationKeyData) {
            Log.d(TAG, "Receive Key : " + notificationKeyData, new Object[0]);
            if (notificationKeyData == null) {
                return;
            }
            try {
                if (Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(notificationKeyData.key)) {
                    notificationListenerService.cancelNotification(notificationKeyData.key);
                } else {
                    notificationListenerService.cancelNotification(notificationKeyData.pkg, notificationKeyData.tag, notificationKeyData.id);
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    public static class c implements Handler {
        private c() {
        }

        @Override // com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            if (NotificationHandler.DEBUG) {
                Log.d(NotificationHandler.TAG, "Handle!!", new Object[0]);
            }
        }

        @Override // com.huami.watch.notification.NotificationHandler.Handler
        public void handleLocal(Context context) {
            if (NotificationHandler.DEBUG) {
                Log.d(NotificationHandler.TAG, "Handle Local!!", new Object[0]);
            }
        }

        @Override // com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            if (NotificationHandler.DEBUG) {
                Log.d(NotificationHandler.TAG, "Handle : " + obj, new Object[0]);
            }
        }

        @Override // com.huami.watch.notification.NotificationHandler.Handler
        public void handleLocal(Context context, Object obj) {
            if (NotificationHandler.DEBUG) {
                Log.d(NotificationHandler.TAG, "Handle Local : " + obj, new Object[0]);
            }
        }
    }

    public static class g extends c {
        public NotificationKeyData a;

        public class a implements Transporter.DataSendResultCallback {
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;

            public a(String str, Context context) {
                this.a = str;
                this.b = context;
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                if (dataTransportResult.getResultCode() == 0 || !TransportUri.ACTION_BLOCK.equals(this.a)) {
                    return;
                }
                NotificationHandler.b(this.b, g.this.a.pkg);
            }
        }

        public g(NotificationKeyData notificationKeyData) {
            super();
            this.a = notificationKeyData;
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            super.handle(context, transporter);
            handle(context, transporter, 0);
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            super.handle(context, transporter, obj);
            if (this.a == null) {
                return;
            }
            int iIntValue = ((Integer) obj).intValue();
            String str = null;
            if (iIntValue == 0) {
                str = "open";
            } else if (iIntValue == 1) {
                str = TransportUri.ACTION_DEL;
            } else if (iIntValue == 2) {
                str = TransportUri.ACTION_BLOCK;
            }
            if (str == null) {
                return;
            }
            DataBundle dataBundle = new DataBundle();
            dataBundle.putParcelable(TransportUri.KEY_NOTI, this.a);
            transporter.send(str, dataBundle, new a(str, context));
        }
    }

    public static class b extends c {
        public NotificationKeyData a;
        public int b;
        public String c;
        public boolean d;

        public class a implements Transporter.DataSendResultCallback {
            public a() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                boolean z = NotificationHandler.DEBUG;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.notification.NotificationHandler$b$b, reason: collision with other inner class name */
        public class C0673b implements Transporter.DataSendResultCallback {
            public C0673b() {
            }

            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public void onResultBack(DataTransportResult dataTransportResult) {
                boolean z = NotificationHandler.DEBUG;
            }
        }

        public b(NotificationKeyData notificationKeyData, int i, String str, boolean z) {
            super();
            this.a = notificationKeyData;
            this.b = i;
            this.c = str;
            this.d = z;
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter) {
            super.handle(context, transporter);
            if (this.a == null) {
                return;
            }
            DataBundle dataBundle = new DataBundle();
            dataBundle.putParcelable(TransportUri.KEY_NOTI, this.a);
            dataBundle.putInt(TransportUri.KEY_NOTI_ACTION_INDEX, this.b);
            dataBundle.putBoolean(TransportUri.KEY_NOTI_ACTION_WEARABLE, this.d);
            dataBundle.putBoolean(TransportUri.KEY_NOTU_ACTION_REPLY, false);
            transporter.send("act", dataBundle, new a());
        }

        @Override // com.huami.watch.notification.NotificationHandler.c, com.huami.watch.notification.NotificationHandler.Handler
        public void handle(Context context, Transporter transporter, Object obj) {
            super.handle(context, transporter, obj);
            if (this.a == null) {
                return;
            }
            DataBundle dataBundle = new DataBundle();
            dataBundle.putParcelable(TransportUri.KEY_NOTI, this.a);
            dataBundle.putInt(TransportUri.KEY_NOTI_ACTION_INDEX, this.b);
            dataBundle.putBoolean(TransportUri.KEY_NOTU_ACTION_REPLY, true);
            dataBundle.putString(TransportUri.KEY_NOTI_ACTION_REMOTE_INPUT_KEY, this.c);
            dataBundle.putBoolean(TransportUri.KEY_NOTI_ACTION_WEARABLE, this.d);
            dataBundle.putString(TransportUri.KEY_NOTI_ACTION_REMOTE_INPUT_RESULT, (String) obj);
            transporter.send("act", dataBundle, new C0673b());
        }
    }
}

package com.huami.watch.companion.notification;

import android.media.RemoteController;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.huami.assistant.updates.NotificationObservable;
import com.huami.device.feature.notification.module.INotificationListener;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.NotificationBlacklistChangedEvent;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleNotificationHelper;
import com.huami.watch.notification.NotificationHandler;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.notification.data.NotificationKeyData;
import com.huami.watch.notification.data.StatusBarNotificationData;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.transport.TransporterModules;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@RequiresApi(api = 19)
public class CompanionNotificationListener implements INotificationListener {
    private static final String i = "Noti-Companion";
    private static final int j = 350;
    private static final int k = 1;
    private static final int l = 2;
    private static List<String> m = new ArrayList();
    private NotificationListenerService a;
    private Handler b;
    private NotificationManager e;
    private Transporter f;
    private SyncBleNotificationHelper h;
    public CompanionMusicControl mMusicControl;
    private final Map<String, StatusBarNotification> c = new HashMap();
    private final Map<String, StatusBarNotification> d = new HashMap();
    private Transporter.DataListener g = new a();

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            try {
                CompanionNotificationListener.this.l(transportDataItem.getAction(), transportDataItem.getData());
            } catch (Exception e) {
                e.printStackTrace();
                Log.w(CompanionNotificationListener.i, "NotiErr", e, new Object[0]);
            }
        }
    }

    public class b implements SyncBleNotificationHelper.NotificationListener {
        public b() {
        }

        @Override // com.huami.watch.companion.sync.ble.SyncBleNotificationHelper.NotificationListener
        public void onMusicControlReceived(byte b) {
            Log.d(CompanionNotificationListener.i, "On MusicControl Received, Command: " + ((int) b), new Object[0]);
            CompanionNotificationListener.this.mMusicControl.onMusicControlReceived(b);
        }

        @Override // com.huami.watch.companion.sync.ble.SyncBleNotificationHelper.NotificationListener
        public void onNotificationBlocked(String str) {
            Log.d(CompanionNotificationListener.i, "On Notification Blocked by BLE: " + str, new Object[0]);
            NotificationApp notificationApp = new NotificationApp();
            notificationApp.packageName = str;
            notificationApp.on = false;
            NotificationManager.getManager(CompanionNotificationListener.this.a).addApp(notificationApp);
            RxBus.get().post(new NotificationBlacklistChangedEvent(str));
        }

        @Override // com.huami.watch.companion.sync.ble.SyncBleNotificationHelper.NotificationListener
        public void onNotificationRemoved(NotificationKeyData notificationKeyData) {
            Log.d(CompanionNotificationListener.i, "On Notification Removed by BLE: " + notificationKeyData, new Object[0]);
            NotificationHandler.Phone.onNotificationDeleteReceived(CompanionNotificationListener.this.a, notificationKeyData);
        }
    }

    public static class c extends Handler {
        private WeakReference<CompanionNotificationListener> a;

        public c(Looper looper, CompanionNotificationListener companionNotificationListener) {
            super(looper);
            this.a = new WeakReference<>(companionNotificationListener);
        }

        private void a(String str) {
            CompanionNotificationListener companionNotificationListener = this.a.get();
            if (companionNotificationListener == null) {
                return;
            }
            synchronized (companionNotificationListener.c) {
                StatusBarNotification statusBarNotificationO = companionNotificationListener.o(str);
                if (statusBarNotificationO != null) {
                    try {
                        companionNotificationListener.p(statusBarNotificationO);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.w(CompanionNotificationListener.i, "NotiErr", e, new Object[0]);
                    }
                }
            }
        }

        private void b(String str) {
            CompanionNotificationListener companionNotificationListener = this.a.get();
            if (companionNotificationListener == null) {
                return;
            }
            synchronized (companionNotificationListener.d) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) companionNotificationListener.d.remove(str);
                if (statusBarNotification != null) {
                    try {
                        companionNotificationListener.q(statusBarNotification);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.w(CompanionNotificationListener.i, "NotiErr", e, new Object[0]);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            String str = (String) message.obj;
            if (i == 1) {
                a(str);
            } else {
                if (i != 2) {
                    return;
                }
                b(str);
            }
        }
    }

    public CompanionNotificationListener(NotificationListenerService notificationListenerService) {
        this.a = notificationListenerService;
        this.mMusicControl = new CompanionMusicControl(notificationListenerService);
    }

    private void h() {
        this.c.clear();
    }

    private void i(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        Handler handler;
        if (statusBarNotification == null) {
            return;
        }
        k();
        this.mMusicControl.onNotificationPosted(statusBarNotification, rankingMap);
        String key = NotificationUtil.getKey(statusBarNotification);
        boolean z = false;
        if (Config.isDebug()) {
            Log.d(i, "OnPosted: " + statusBarNotification + ", " + statusBarNotification.getPostTime(), new Object[0]);
        } else {
            Log.f().d(i, "OnPosted: " + key, new Object[0]);
        }
        if (NotificationUtil.c(this.a, this.e, statusBarNotification)) {
            Log.d(i, "IsFiltered: " + key, new Object[0]);
            return;
        }
        synchronized (this.d) {
            if (this.d.remove(key) != null && (handler = this.b) != null) {
                handler.removeMessages(2, key);
            }
        }
        if (DeviceUtil.isSupportAssistantUpdates(this.a)) {
            NotificationObservable.onNext(StatusBarNotificationData.from(this.a, statusBarNotification, false).notification);
        }
        NotificationManager notificationManager = this.e;
        if (notificationManager != null && notificationManager.isScreenONIgnore()) {
            z = true;
        }
        if (z && NotificationUtil.NLS.a(this.a)) {
            return;
        }
        synchronized (this.c) {
            m(key, statusBarNotification);
            Handler handler2 = this.b;
            if (handler2 != null) {
                handler2.removeMessages(1, key);
                this.b.sendMessageDelayed(this.b.obtainMessage(1, key), 350L);
            }
            if (z) {
                m.add(key);
            }
        }
    }

    private void j(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        k();
        this.mMusicControl.onNotificationRemoved(statusBarNotification, null);
        String key = NotificationUtil.getKey(statusBarNotification);
        if (Config.isDebug()) {
            Log.d(i, "OnRemoved: " + statusBarNotification + ", " + statusBarNotification.getPostTime(), new Object[0]);
        } else {
            Log.f().d(i, "OnRemoved: " + key, new Object[0]);
        }
        if (NotificationUtil.c(this.a, this.e, statusBarNotification)) {
            return;
        }
        synchronized (this.c) {
            boolean z = true;
            if (o(key) != null) {
                Handler handler = this.b;
                if (handler != null) {
                    handler.removeMessages(1, key);
                }
            } else {
                NotificationManager notificationManager = this.e;
                if (notificationManager == null || !notificationManager.isScreenONIgnore()) {
                    z = false;
                }
                if (z && !m.remove(key)) {
                    Log.d(i, "No ScreenOff Sent Notification : " + key, new Object[0]);
                    return;
                }
                synchronized (this.d) {
                    this.d.put(key, statusBarNotification);
                    Handler handler2 = this.b;
                    if (handler2 != null) {
                        handler2.removeMessages(2, key);
                        this.b.sendMessageDelayed(this.b.obtainMessage(2, key), 350L);
                    }
                }
            }
        }
    }

    private void k() {
        if (this.b == null) {
            this.b = new c(Looper.getMainLooper(), this);
        }
        if (this.e == null) {
            this.e = NotificationManager.getManager(this.a);
        }
        if (this.f == null) {
            Log.i(i, "Init!!", new Object[0]);
            Transporter transporter = Transporter.get(this.a, TransporterModules.MODULE_NOTIFICAION);
            this.f = transporter;
            transporter.addDataListener(this.g);
        }
        if (this.h == null) {
            SyncBleNotificationHelper helper = SyncBleNotificationHelper.getHelper();
            this.h = helper;
            helper.listener(new b());
        }
        this.mMusicControl.onInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str, DataBundle dataBundle) {
        if ("open".equals(str)) {
            NotificationHandler.Phone.onNotificationOpenReceived(this.a, dataBundle);
        } else if ("act".equals(str)) {
            NotificationHandler.Phone.onNotificationActionReceived(this.a, dataBundle);
        } else if (TransportUri.ACTION_DEL.equals(str)) {
            NotificationHandler.Phone.onNotificationDeleteReceived(this.a, dataBundle);
        }
    }

    private void m(String str, StatusBarNotification statusBarNotification) {
        this.c.put(str, statusBarNotification);
    }

    private void n() {
        synchronized (this.c) {
            h();
        }
        synchronized (this.d) {
            this.d.clear();
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(1);
            this.b.removeMessages(2);
            this.b = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        Transporter transporter = this.f;
        if (transporter != null) {
            transporter.removeDataListener(this.g);
            this.f = null;
        }
        SyncBleNotificationHelper syncBleNotificationHelper = this.h;
        if (syncBleNotificationHelper != null) {
            syncBleNotificationHelper.release();
            this.h = null;
        }
        this.mMusicControl.onDeInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StatusBarNotification o(String str) {
        return this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        StatusBarNotificationData statusBarNotificationDataFrom = StatusBarNotificationData.from(this.a, statusBarNotification, false);
        if (NotificationUtil.a.b(NotificationUtil.k(statusBarNotification), statusBarNotification)) {
            NotificationUtil.a.g(statusBarNotificationDataFrom);
        }
        Log.d(i, "Send Add: " + statusBarNotificationDataFrom.key, new Object[0]);
        if (!DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
            SyncUtil.syncNotificationToWatch(statusBarNotificationDataFrom, this.f);
            return;
        }
        SyncBleNotificationHelper syncBleNotificationHelper = this.h;
        if (syncBleNotificationHelper != null) {
            syncBleNotificationHelper.syncNotificationToWatch(this.a, statusBarNotificationDataFrom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        StatusBarNotificationData statusBarNotificationDataFrom = StatusBarNotificationData.from(statusBarNotification);
        if (NotificationUtil.a.b(NotificationUtil.k(statusBarNotification), statusBarNotification)) {
            NotificationUtil.a.g(statusBarNotificationDataFrom);
        }
        Log.d(i, "Send Remove: " + statusBarNotificationDataFrom.key, new Object[0]);
        if (!DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
            SyncUtil.syncNotificationRemoveToWatch(statusBarNotificationDataFrom, this.f);
            return;
        }
        SyncBleNotificationHelper syncBleNotificationHelper = this.h;
        if (syncBleNotificationHelper != null) {
            syncBleNotificationHelper.syncNotificationRemoveToWatch(statusBarNotificationDataFrom);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onDeInit() {
        Log.i(i, "OnDeInit!!", new Object[0]);
        try {
            n();
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(i, "NotiErr", e, new Object[0]);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onInit() {
        Log.i(i, "OnInit!!", new Object[0]);
        try {
            k();
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(i, "NotiErr", e, new Object[0]);
            n();
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        try {
            i(statusBarNotification, rankingMap);
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(i, "NotiErr", e, new Object[0]);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        try {
            j(statusBarNotification);
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(i, "NotiErr", e, new Object[0]);
        }
    }

    public void setMusicRemoteControllerListener(RemoteController.OnClientUpdateListener onClientUpdateListener) {
        this.mMusicControl.c(onClientUpdateListener);
    }
}

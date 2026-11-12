package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.provider.data.MessageChangeEvent;
import com.huawei.pluginmessagecenter.service.MessageObserver;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class tbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile tbe f48922a;
    private ExecutorService d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f48924c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f48923b = new Object();
    private MessageObserver i = new MessageObserver() { // from class: tbe.4
        @Override // com.huawei.pluginmessagecenter.service.MessageObserver
        public void onChange(int i, MessageChangeEvent messageChangeEvent) {
            LogUtil.a("UIHLH_NotificationInteractors", "MessageObserver onChange start");
            tbe.this.b();
        }
    };
    private MessageCenterApi e = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);

    private tbe() {
    }

    public static tbe e(Context context) {
        if (f48922a == null) {
            synchronized (f48923b) {
                if (f48922a == null) {
                    f48922a = new tbe();
                }
            }
        }
        return f48922a;
    }

    public void e(ExecutorService executorService) {
        synchronized (f48924c) {
            this.d = executorService;
            a();
        }
    }

    public static boolean d(ExecutorService executorService) {
        synchronized (f48924c) {
            try {
                if (executorService == null) {
                    return false;
                }
                executorService.shutdown();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        LogUtil.a("UIHLH_NotificationInteractors", "startMessageNotificationObserver enter");
        ExecutorService executorService = this.d;
        if (executorService == null || executorService.isShutdown()) {
            this.d = Executors.newSingleThreadExecutor();
        }
        this.d.execute(new Runnable() { // from class: tbe.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("UIHLH_NotificationInteractors", "startMessageNotificationObserver doRefresh()");
                if (tbe.this.i != null) {
                    LogUtil.a("UIHLH_NotificationInteractors", "openMessageObserver registerMessageObserver");
                    tbe.this.e.registerMessageObserver(tbe.this.i);
                }
                tbe.this.e.refreshMessages();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("UIHLH_NotificationInteractors", "refreshNotificationMessage enter");
        synchronized (f48924c) {
            ExecutorService executorService = this.d;
            if (executorService == null || executorService.isShutdown()) {
                this.d = Executors.newSingleThreadExecutor();
            }
            this.d.execute(new Runnable() { // from class: tbe.5
                @Override // java.lang.Runnable
                public void run() {
                    List listC = tbe.this.c();
                    if (listC == null || listC.isEmpty()) {
                        LogUtil.a("UIHLH_NotificationInteractors", "refreshNotificationMessage notificationMessageList empty");
                        return;
                    }
                    LogUtil.a("UIHLH_NotificationInteractors", "refreshNotificationMessage notificationMessageList show count = ", Integer.valueOf(listC.size()));
                    Iterator it = listC.iterator();
                    while (it.hasNext()) {
                        tbe.this.e((MessageObject) it.next());
                    }
                }
            });
        }
    }

    public void d() {
        MessageObserver messageObserver = this.i;
        if (messageObserver != null) {
            this.e.unregisterMessageObserver(messageObserver);
        }
        synchronized (f48924c) {
            ExecutorService executorService = this.d;
            if (executorService != null && !executorService.isShutdown()) {
                this.d.shutdown();
                this.d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MessageObject messageObject) {
        LogUtil.a("UIHLH_NotificationInteractors", "showNotificationMsg");
        this.e.showNotification(BaseApplication.b(), messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<MessageObject> c() {
        LogUtil.a("UIHLH_NotificationInteractors", "getNotificationMessage result");
        return this.e.getMessages(2);
    }
}

package com.garmin.android.gncs;

import android.service.notification.StatusBarNotification;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/gncs/StatusBarNotificationListenerManager;", "", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/garmin/android/gncs/StatusBarNotificationListener;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onNotificationPosted", "sbn", "Landroid/service/notification/StatusBarNotification;", "onNotificationRemoved", "removeListener", "InjectorConfiguration", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StatusBarNotificationListenerManager {
    private final CopyOnWriteArraySet<StatusBarNotificationListener> listeners;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/gncs/StatusBarNotificationListenerManager$InjectorConfiguration;", "Ljb2/a;", "<init>", "()V", "", "configure", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InjectorConfiguration extends jb2.a {
        /* JADX INFO: Access modifiers changed from: private */
        public static final StatusBarNotificationListenerManager configure$lambda$0() {
            return new StatusBarNotificationListenerManager(null);
        }

        @Override // jb2.a
        public void configure() {
            bindSingleton(StatusBarNotificationListenerManager.class, (ib2.a) new a(1));
        }
    }

    private StatusBarNotificationListenerManager() {
        this.listeners = new CopyOnWriteArraySet<>();
    }

    public final void addListener(StatusBarNotificationListener listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    public final void onNotificationPosted(StatusBarNotification sbn) {
        sbn.getClass();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StatusBarNotificationListener) it.next()).onNotificationPosted(sbn);
        }
    }

    public final void onNotificationRemoved(StatusBarNotification sbn) {
        sbn.getClass();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((StatusBarNotificationListener) it.next()).onNotificationRemoved(sbn);
        }
    }

    public final void removeListener(StatusBarNotificationListener listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }

    public /* synthetic */ StatusBarNotificationListenerManager(j jVar) {
        this();
    }
}

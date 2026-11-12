package com.garmin.android.gncs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.d0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/gncs/DefaultAppsObserver;", "", "()V", "defaultAppChangeBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "getDefaultAppChangeBroadcastReceiver", "()Landroid/content/BroadcastReceiver;", "isObserving", "", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/garmin/android/gncs/DefaultAppsObserver$ListenerEntry;", "addListener", "", "deviceId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "removeListener", "startObserving", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "startObservingDefaultApps", "stopObserving", "stopObservingDefaultApps", "Companion", "DefaultAppsChangeListener", "ListenerEntry", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultAppsObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEFAULT_DIALER_APP_CHANGE_ACTION = "android.telecom.action.DEFAULT_DIALER_CHANGED";
    private static final String TAG = "DefaultAppsObserver";
    private static volatile DefaultAppsObserver instance;
    private final BroadcastReceiver defaultAppChangeBroadcastReceiver;
    private volatile boolean isObserving;
    private final CopyOnWriteArrayList<ListenerEntry> listeners;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "", "onDefaultAppsChanged", "", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DefaultAppsChangeListener {
        void onDefaultAppsChanged();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/gncs/DefaultAppsObserver$ListenerEntry;", "", "deviceId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "(Ljava/lang/String;Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;)V", "getDeviceId", "()Ljava/lang/String;", "getListener", "()Lcom/garmin/android/gncs/DefaultAppsObserver$DefaultAppsChangeListener;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ListenerEntry {
        private final String deviceId;
        private final DefaultAppsChangeListener listener;

        public ListenerEntry(String str, DefaultAppsChangeListener defaultAppsChangeListener) {
            str.getClass();
            defaultAppsChangeListener.getClass();
            this.deviceId = str;
            this.listener = defaultAppsChangeListener;
        }

        public static /* synthetic */ ListenerEntry copy$default(ListenerEntry listenerEntry, String str, DefaultAppsChangeListener defaultAppsChangeListener, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = listenerEntry.deviceId;
            }
            if ((i14 & 2) != 0) {
                defaultAppsChangeListener = listenerEntry.listener;
            }
            return listenerEntry.copy(str, defaultAppsChangeListener);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DefaultAppsChangeListener getListener() {
            return this.listener;
        }

        public final ListenerEntry copy(String deviceId, DefaultAppsChangeListener listener) {
            deviceId.getClass();
            listener.getClass();
            return new ListenerEntry(deviceId, listener);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListenerEntry)) {
                return false;
            }
            ListenerEntry listenerEntry = (ListenerEntry) other;
            return s.g(this.deviceId, listenerEntry.deviceId) && s.g(this.listener, listenerEntry.listener);
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final DefaultAppsChangeListener getListener() {
            return this.listener;
        }

        public int hashCode() {
            return this.listener.hashCode() + (this.deviceId.hashCode() * 31);
        }

        public String toString() {
            return "ListenerEntry(deviceId=" + this.deviceId + ", listener=" + this.listener + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.DefaultAppsObserver$removeListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/garmin/android/gncs/DefaultAppsObserver$ListenerEntry;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/garmin/android/gncs/DefaultAppsObserver$ListenerEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<ListenerEntry, Boolean> {
        final /* synthetic */ String $deviceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$deviceId = str;
        }

        @Override // e23.l
        public final Boolean invoke(ListenerEntry listenerEntry) {
            return Boolean.valueOf(s.g(listenerEntry.getDeviceId(), this.$deviceId));
        }
    }

    private DefaultAppsObserver() {
        this.defaultAppChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.garmin.android.gncs.DefaultAppsObserver$defaultAppChangeBroadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (s.g(intent != null ? intent.getAction() : null, "android.telecom.action.DEFAULT_DIALER_CHANGED")) {
                    ih2.b.b("DefaultAppsObserver: Detected default dialer app change via broadcast, notifying listeners");
                    Iterator it = this.this$0.listeners.iterator();
                    while (it.hasNext()) {
                        ((DefaultAppsObserver.ListenerEntry) it.next()).getListener().onDefaultAppsChanged();
                    }
                }
            }
        };
        this.listeners = new CopyOnWriteArrayList<>();
    }

    public final void addListener(String deviceId, DefaultAppsChangeListener listener) {
        deviceId.getClass();
        listener.getClass();
        CopyOnWriteArrayList<ListenerEntry> copyOnWriteArrayList = this.listeners;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (s.g(((ListenerEntry) it.next()).getDeviceId(), deviceId)) {
                    com.airbnb.lottie.animation.keyframe.a.s("DefaultAppsObserver: Listener for device ", deviceId, " is already set.");
                    return;
                }
            }
        }
        this.listeners.add(new ListenerEntry(deviceId, listener));
    }

    public final BroadcastReceiver getDefaultAppChangeBroadcastReceiver() {
        return this.defaultAppChangeBroadcastReceiver;
    }

    public final void removeListener(String deviceId) {
        deviceId.getClass();
        d0.B(new AnonymousClass1(deviceId), this.listeners);
    }

    public final void startObservingDefaultApps(Context context) {
        context.getClass();
        if (this.isObserving) {
            return;
        }
        context.registerReceiver(this.defaultAppChangeBroadcastReceiver, new IntentFilter(DEFAULT_DIALER_APP_CHANGE_ACTION));
        this.isObserving = true;
        ih2.b.b("DefaultAppsObserver: Started observing default app changes");
    }

    public final void stopObservingDefaultApps(Context context) {
        context.getClass();
        if (this.isObserving) {
            context.unregisterReceiver(this.defaultAppChangeBroadcastReceiver);
            this.isObserving = false;
            ih2.b.b("DefaultAppsObserver: Stopped observing default app changes");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/garmin/android/gncs/DefaultAppsObserver$Companion;", "", "()V", "DEFAULT_DIALER_APP_CHANGE_ACTION", "", "TAG", "instance", "Lcom/garmin/android/gncs/DefaultAppsObserver;", "getInstance", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final DefaultAppsObserver getInstance() {
            DefaultAppsObserver defaultAppsObserver;
            DefaultAppsObserver defaultAppsObserver2 = DefaultAppsObserver.instance;
            if (defaultAppsObserver2 != null) {
                return defaultAppsObserver2;
            }
            synchronized (this) {
                defaultAppsObserver = DefaultAppsObserver.instance;
                if (defaultAppsObserver == null) {
                    defaultAppsObserver = new DefaultAppsObserver(null);
                    DefaultAppsObserver.instance = defaultAppsObserver;
                }
            }
            return defaultAppsObserver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DefaultAppsObserver(j jVar) {
        this();
    }
}

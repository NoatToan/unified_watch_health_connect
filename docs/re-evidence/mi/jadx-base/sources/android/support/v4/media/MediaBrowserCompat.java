package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import defpackage.h63;
import defpackage.sif;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String EXTRA_MEDIA_ID = "android.media.browse.extra.MEDIA_ID";
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1239b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaBrowserImpl f1240a;

    public static class CallbackHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<MediaBrowserServiceCallbackImpl> f1241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<Messenger> f1242b;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.f1241a = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        public void a(Messenger messenger) {
            this.f1242b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f1242b;
            if (weakReference == null || weakReference.get() == null || this.f1241a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.f1241a.get();
            Messenger messenger = this.f1242b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    mediaBrowserServiceCallbackImpl.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i == 2) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                } else if (i != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Client version: ");
                    sb.append(1);
                    sb.append("\n  Service version: ");
                    sb.append(message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.onConnectionFailed(messenger);
                }
            }
        }
    }

    public static class ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaBrowser.ConnectionCallback f1243a = new ConnectionCallbackApi21();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConnectionCallbackInternal f1244b;

        @RequiresApi(21)
        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public ConnectionCallbackApi21() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f1244b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f1244b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f1244b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }
        }

        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void a(ConnectionCallbackInternal connectionCallbackInternal) {
            this.f1244b = connectionCallbackInternal;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static class CustomActionResultReceiver extends ResultReceiver {
        public final String d;
        public final Bundle e;
        public final CustomActionCallback f;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.d = str;
            this.e = bundle;
            this.f = customActionCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i, Bundle bundle) {
            if (this.f == null) {
                return;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            if (i == -1) {
                this.f.onError(this.d, this.e, bundle);
                return;
            }
            if (i == 0) {
                this.f.onResult(this.d, this.e, bundle);
                return;
            }
            if (i == 1) {
                this.f.onProgressUpdate(this.d, this.e, bundle);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown result code: ");
            sb.append(i);
            sb.append(" (extras=");
            sb.append(this.e);
            sb.append(", resultData=");
            sb.append(bundle);
            sb.append(")");
        }
    }

    public static abstract class ItemCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaBrowser.ItemCallback f1246a = new ItemCallbackApi23();

        @RequiresApi(23)
        public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            public ItemCallbackApi23() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                ItemCallback.this.onItemLoaded(MediaItem.fromMediaItem(mediaItem));
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        public final String d;
        public final ItemCallback e;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.d = str;
            this.e = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.e.onError(this.d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.e.onItemLoaded((MediaItem) parcelable);
            } else {
                this.e.onError(this.d);
            }
        }
    }

    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        ComponentName getServiceComponent();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    @RequiresApi(21)
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaBrowser f1249b;
        public final Bundle c;
        public final CallbackHandler d = new CallbackHandler(this);
        public final ArrayMap<String, Subscription> e = new ArrayMap<>();
        public int f;
        public ServiceBinderWrapper g;
        public Messenger h;
        public MediaSessionCompat.Token i;
        public Bundle j;

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.f1248a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.a(this);
            this.f1249b = new MediaBrowser(context, componentName, connectionCallback.f1243a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            this.f1249b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.g;
            if (serviceBinderWrapper != null && (messenger = this.h) != null) {
                try {
                    serviceBinderWrapper.j(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f1249b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            return this.f1249b.getExtras();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!this.f1249b.isConnected()) {
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            if (this.g == null) {
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.2
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            try {
                this.g.d(str, new ItemReceiver(str, itemCallback, this.d), this.h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error getting media item: ");
                sb.append(str);
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.j;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            return this.f1249b.getRoot();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            return this.f1249b.getServiceComponent();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.fromToken(this.f1249b.getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.f1249b.isConnected();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            try {
                Bundle extras = this.f1249b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f = extras.getInt("extra_service_version", 0);
                IBinder iBinderA = h63.a(extras, "extra_messenger");
                if (iBinderA != null) {
                    this.g = new ServiceBinderWrapper(iBinderA, this.c);
                    Messenger messenger = new Messenger(this.d);
                    this.h = messenger;
                    this.d.a(messenger);
                    try {
                        this.g.e(this.f1248a, this.h);
                    } catch (RemoteException unused) {
                    }
                }
                IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(h63.a(extras, "extra_session_binder"));
                if (iMediaSessionAsInterface != null) {
                    this.i = MediaSessionCompat.Token.fromToken(this.f1249b.getSessionToken(), iMediaSessionAsInterface);
                }
            } catch (IllegalStateException unused2) {
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            Subscription subscription = this.e.get(str);
            if (subscription == null) {
                if (MediaBrowserCompat.f1239b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                    return;
                }
                return;
            }
            SubscriptionCallback callback = subscription.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.j = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.j = null;
                    return;
                }
                if (list == null) {
                    callback.onError(str, bundle);
                    return;
                }
                this.j = bundle2;
                callback.onChildrenLoaded(str, list, bundle);
                this.j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.g == null) {
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.4
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
                return;
            }
            try {
                this.g.g(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.d), this.h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error searching items with query: ");
                sb.append(str);
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.5
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            if (this.g == null && customActionCallback != null) {
                this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.6
                    @Override // java.lang.Runnable
                    public void run() {
                        customActionCallback.onError(str, bundle, null);
                    }
                });
            }
            try {
                this.g.h(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.d), this.h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error sending a custom action: action=");
                sb.append(str);
                sb.append(", extras=");
                sb.append(bundle);
                if (customActionCallback != null) {
                    this.d.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21.7
                        @Override // java.lang.Runnable
                        public void run() {
                            customActionCallback.onError(str, bundle, null);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.e.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.e.put(str, subscription);
            }
            subscriptionCallback.a(subscription);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.g;
            if (serviceBinderWrapper == null) {
                this.f1249b.subscribe(str, subscriptionCallback.f1288a);
                return;
            }
            try {
                serviceBinderWrapper.a(str, subscriptionCallback.f1289b, bundle2, this.h);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error subscribing media item: ");
                sb.append(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.e.get(str);
            if (subscription == null) {
                return;
            }
            ServiceBinderWrapper serviceBinderWrapper = this.g;
            if (serviceBinderWrapper != null) {
                try {
                    if (subscriptionCallback == null) {
                        serviceBinderWrapper.f(str, null, this.h);
                    } else {
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                this.g.f(str, subscriptionCallback.f1289b, this.h);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            } else if (subscriptionCallback == null) {
                this.f1249b.unsubscribe(str);
            } else {
                List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                List<Bundle> optionsList2 = subscription.getOptionsList();
                for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                    if (callbacks2.get(size2) == subscriptionCallback) {
                        callbacks2.remove(size2);
                        optionsList2.remove(size2);
                    }
                }
                if (callbacks2.size() == 0) {
                    this.f1249b.unsubscribe(str);
                }
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.e.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
        }
    }

    @RequiresApi(23)
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(String str, ItemCallback itemCallback) {
            if (this.g == null) {
                this.f1249b.getItem(str, itemCallback.f1246a);
            } else {
                super.getItem(str, itemCallback);
            }
        }
    }

    @RequiresApi(26)
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.g != null && this.f >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.f1249b.subscribe(str, subscriptionCallback.f1288a);
            } else {
                this.f1249b.subscribe(str, bundle, subscriptionCallback.f1288a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImplApi21, android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.g != null && this.f >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.f1249b.unsubscribe(str);
            } else {
                this.f1249b.unsubscribe(str, subscriptionCallback.f1288a);
            }
        }
    }

    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComponentName f1265b;
        public final ConnectionCallback c;
        public final Bundle d;
        public final CallbackHandler e = new CallbackHandler(this);
        public final ArrayMap<String, Subscription> f = new ArrayMap<>();
        public int g = 1;
        public MediaServiceConnection h;
        public ServiceBinderWrapper i;
        public Messenger j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f1266k;
        public MediaSessionCompat.Token l;
        public Bundle m;
        public Bundle n;

        public class MediaServiceConnection implements ServiceConnection {
            public MediaServiceConnection() {
            }

            public boolean a(String str) {
                int i;
                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                if (mediaBrowserImplBase.h == this && (i = mediaBrowserImplBase.g) != 0 && i != 1) {
                    return true;
                }
                int i2 = mediaBrowserImplBase.g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(MediaBrowserImplBase.this.f1265b);
                sb.append(" with mServiceConnection=");
                sb.append(MediaBrowserImplBase.this.h);
                sb.append(" this=");
                sb.append(this);
                return false;
            }

            public final void b(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.e.post(runnable);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                b(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z = MediaBrowserCompat.f1239b;
                        if (z) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceConnected name=");
                            sb.append(componentName);
                            sb.append(" binder=");
                            sb.append(iBinder);
                            MediaBrowserImplBase.this.a();
                        }
                        if (MediaServiceConnection.this.a("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.i = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.d);
                            MediaBrowserImplBase.this.j = new Messenger(MediaBrowserImplBase.this.e);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.e.a(mediaBrowserImplBase2.j);
                            MediaBrowserImplBase.this.g = 2;
                            if (z) {
                                try {
                                    MediaBrowserImplBase.this.a();
                                } catch (RemoteException unused) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("RemoteException during connect for ");
                                    sb2.append(MediaBrowserImplBase.this.f1265b);
                                    if (MediaBrowserCompat.f1239b) {
                                        MediaBrowserImplBase.this.a();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase3.i.b(mediaBrowserImplBase3.f1264a, mediaBrowserImplBase3.j);
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName componentName) {
                b(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.f1239b) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceDisconnected name=");
                            sb.append(componentName);
                            sb.append(" this=");
                            sb.append(this);
                            sb.append(" mServiceConnection=");
                            sb.append(MediaBrowserImplBase.this.h);
                            MediaBrowserImplBase.this.a();
                        }
                        if (MediaServiceConnection.this.a("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.i = null;
                            mediaBrowserImplBase.j = null;
                            mediaBrowserImplBase.e.a(null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.g = 4;
                            mediaBrowserImplBase2.c.onConnectionSuspended();
                        }
                    }
                });
            }
        }

        public MediaBrowserImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (connectionCallback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f1264a = context;
            this.f1265b = componentName;
            this.c = connectionCallback;
            this.d = bundle == null ? null : new Bundle(bundle);
        }

        public static String c(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        public void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f1265b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.c);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.d);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(c(this.g));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.h);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.i);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.j);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f1266k);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.l);
        }

        public void b() {
            MediaServiceConnection mediaServiceConnection = this.h;
            if (mediaServiceConnection != null) {
                this.f1264a.unbindService(mediaServiceConnection);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e.a(null);
            this.f1266k = null;
            this.l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            int i = this.g;
            if (i == 0 || i == 1) {
                this.g = 2;
                this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                        if (mediaBrowserImplBase.g == 0) {
                            return;
                        }
                        mediaBrowserImplBase.g = 2;
                        if (MediaBrowserCompat.f1239b && mediaBrowserImplBase.h != null) {
                            throw new RuntimeException("mServiceConnection should be null. Instead it is " + MediaBrowserImplBase.this.h);
                        }
                        if (mediaBrowserImplBase.i != null) {
                            throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + MediaBrowserImplBase.this.i);
                        }
                        if (mediaBrowserImplBase.j != null) {
                            throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + MediaBrowserImplBase.this.j);
                        }
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(MediaBrowserImplBase.this.f1265b);
                        MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                        mediaBrowserImplBase2.h = mediaBrowserImplBase2.new MediaServiceConnection();
                        try {
                            MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                            if (!mediaBrowserImplBase3.f1264a.bindService(intent, mediaBrowserImplBase3.h, 1)) {
                                MediaBrowserImplBase.this.b();
                                MediaBrowserImplBase.this.c.onConnectionFailed();
                            }
                        } catch (Exception unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed binding to service ");
                            sb.append(MediaBrowserImplBase.this.f1265b);
                        }
                        if (MediaBrowserCompat.f1239b) {
                            MediaBrowserImplBase.this.a();
                        }
                    }
                });
            } else {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + c(this.g) + ")");
            }
        }

        public final boolean d(Messenger messenger, String str) {
            int i;
            if (this.j == messenger && (i = this.g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" for ");
            sb.append(this.f1265b);
            sb.append(" with mCallbacksMessenger=");
            sb.append(this.j);
            sb.append(" this=");
            sb.append(this);
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            this.g = 0;
            this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    Messenger messenger = mediaBrowserImplBase.j;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.i.c(messenger);
                        } catch (RemoteException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("RemoteException during connect for ");
                            sb.append(MediaBrowserImplBase.this.f1265b);
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    int i = mediaBrowserImplBase2.g;
                    mediaBrowserImplBase2.b();
                    if (i != 0) {
                        MediaBrowserImplBase.this.g = i;
                    }
                    if (MediaBrowserCompat.f1239b) {
                        MediaBrowserImplBase.this.a();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            if (isConnected()) {
                return this.m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + c(this.g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!isConnected()) {
                this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            try {
                this.i.d(str, new ItemReceiver(str, itemCallback, this.e), this.j);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error getting media item: ");
                sb.append(str);
                this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.4
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.n;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            if (isConnected()) {
                return this.f1266k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + c(this.g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.f1265b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (isConnected()) {
                return this.l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.g == 3;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onConnectionFailed(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f1265b);
            if (d(messenger, "onConnectFailed")) {
                if (this.g == 2) {
                    b();
                    this.c.onConnectionFailed();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(c(this.g));
                    sb2.append("... ignoring");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (d(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f1239b;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f1265b);
                    sb.append(" id=");
                    sb.append(str);
                }
                Subscription subscription = this.f.get(str);
                if (subscription == null) {
                    if (z) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onLoadChildren for id that isn't subscribed id=");
                        sb2.append(str);
                        return;
                    }
                    return;
                }
                SubscriptionCallback callback = subscription.getCallback(bundle);
                if (callback != null) {
                    if (bundle == null) {
                        if (list == null) {
                            callback.onError(str);
                            return;
                        }
                        this.n = bundle2;
                        callback.onChildrenLoaded(str, list);
                        this.n = null;
                        return;
                    }
                    if (list == null) {
                        callback.onError(str, bundle);
                        return;
                    }
                    this.n = bundle2;
                    callback.onChildrenLoaded(str, list, bundle);
                    this.n = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (d(messenger, "onConnect")) {
                if (this.g != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(c(this.g));
                    sb.append("... ignoring");
                    return;
                }
                this.f1266k = str;
                this.l = token;
                this.m = bundle;
                this.g = 3;
                if (MediaBrowserCompat.f1239b) {
                    a();
                }
                this.c.onConnected();
                try {
                    for (Map.Entry<String, Subscription> entry : this.f.entrySet()) {
                        String key = entry.getKey();
                        Subscription value = entry.getValue();
                        List<SubscriptionCallback> callbacks = value.getCallbacks();
                        List<Bundle> optionsList = value.getOptionsList();
                        for (int i = 0; i < callbacks.size(); i++) {
                            this.i.a(key, callbacks.get(i).f1289b, optionsList.get(i), this.j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected (state=" + c(this.g) + ")");
            }
            try {
                this.i.g(str, bundle, new SearchResultReceiver(str, bundle, searchCallback, this.e), this.j);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error searching items with query: ");
                sb.append(str);
                this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.5
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            try {
                this.i.h(str, bundle, new CustomActionResultReceiver(str, bundle, customActionCallback, this.e), this.j);
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Remote error sending a custom action: action=");
                sb.append(str);
                sb.append(", extras=");
                sb.append(bundle);
                if (customActionCallback != null) {
                    this.e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.6
                        @Override // java.lang.Runnable
                        public void run() {
                            customActionCallback.onError(str, bundle, null);
                        }
                    });
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.f.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.f.put(str, subscription);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            if (isConnected()) {
                try {
                    this.i.a(str, subscriptionCallback.f1289b, bundle2, this.j);
                } catch (RemoteException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription failed with RemoteException parentId=");
                    sb.append(str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = this.f.get(str);
            if (subscription == null) {
                return;
            }
            try {
                if (subscriptionCallback != null) {
                    List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                    List<Bundle> optionsList = subscription.getOptionsList();
                    for (int size = callbacks.size() - 1; size >= 0; size--) {
                        if (callbacks.get(size) == subscriptionCallback) {
                            if (isConnected()) {
                                this.i.f(str, subscriptionCallback.f1289b, this.j);
                            }
                            callbacks.remove(size);
                            optionsList.remove(size);
                        }
                    }
                } else if (isConnected()) {
                    this.i.f(str, null, this.j);
                }
            } catch (RemoteException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("removeSubscription failed with RemoteException parentId=");
                sb.append(str);
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.f.remove(str);
            }
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void onServiceConnected(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        public final String d;
        public final Bundle e;
        public final SearchCallback f;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.d = str;
            this.e = bundle;
            this.f = searchCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.unparcelWithClassLoader(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f.onError(this.d, this.e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray == null) {
                this.f.onError(this.d, this.e);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            this.f.onSearchResult(this.d, this.e, arrayList);
        }
    }

    public static class ServiceBinderWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Messenger f1284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f1285b;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.f1284a = new Messenger(iBinder);
            this.f1285b = bundle;
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            h63.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            i(3, bundle2, messenger);
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f1285b);
            i(1, bundle, messenger);
        }

        public void c(Messenger messenger) throws RemoteException {
            i(2, null, messenger);
        }

        public void d(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", resultReceiver);
            i(5, bundle, messenger);
        }

        public void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f1285b);
            i(6, bundle, messenger);
        }

        public void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            h63.b(bundle, "data_callback_token", iBinder);
            i(4, bundle, messenger);
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            i(8, bundle2, messenger);
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", resultReceiver);
            i(9, bundle2, messenger);
        }

        public final void i(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f1284a.send(messageObtain);
        }

        public void j(Messenger messenger) throws RemoteException {
            i(7, null, messenger);
        }
    }

    public static class Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<SubscriptionCallback> f1286a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Bundle> f1287b = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.f1287b.size(); i++) {
                if (sif.a(this.f1287b.get(i), bundle)) {
                    return this.f1286a.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.f1286a;
        }

        public List<Bundle> getOptionsList() {
            return this.f1287b;
        }

        public boolean isEmpty() {
            return this.f1286a.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.f1287b.size(); i++) {
                if (sif.a(this.f1287b.get(i), bundle)) {
                    this.f1286a.set(i, subscriptionCallback);
                    return;
                }
            }
            this.f1286a.add(subscriptionCallback);
            this.f1287b.add(bundle);
        }
    }

    public static abstract class SubscriptionCallback {
        public WeakReference<Subscription> c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f1289b = new Binder();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaBrowser.SubscriptionCallback f1288a = new SubscriptionCallbackApi26();

        @RequiresApi(21)
        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi21() {
            }

            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<Subscription> weakReference = SubscriptionCallback.this.c;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> listFromMediaItemList = MediaItem.fromMediaItemList(list);
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, listFromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, a(listFromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        @RequiresApi(26)
        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public SubscriptionCallbackApi26() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                SubscriptionCallback.this.onError(str, bundle);
            }
        }

        public void a(Subscription subscription) {
            this.c = new WeakReference<>(subscription);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onError(String str) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        this.f1240a = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
    }

    public void connect() {
        this.f1240a.connect();
    }

    public void disconnect() {
        this.f1240a.disconnect();
    }

    public Bundle getExtras() {
        return this.f1240a.getExtras();
    }

    public void getItem(String str, ItemCallback itemCallback) {
        this.f1240a.getItem(str, itemCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle getNotifyChildrenChangedOptions() {
        return this.f1240a.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.f1240a.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.f1240a.getServiceComponent();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f1240a.getSessionToken();
    }

    public boolean isConnected() {
        return this.f1240a.isConnected();
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (searchCallback == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f1240a.search(str, bundle, searchCallback);
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.f1240a.sendCustomAction(str, bundle, customActionCallback);
    }

    public void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.f1240a.subscribe(str, null, subscriptionCallback);
    }

    public void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f1240a.unsubscribe(str, null);
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback != null) {
            this.f1240a.unsubscribe(str, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (subscriptionCallback == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.f1240a.subscribe(str, bundle, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaDescriptionCompat f1283b;

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f1282a = i;
            this.f1283b = mediaDescriptionCompat;
        }

        public static MediaItem fromMediaItem(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<MediaItem> fromMediaItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromMediaItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f1283b;
        }

        public int getFlags() {
            return this.f1282a;
        }

        public String getMediaId() {
            return this.f1283b.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.f1282a & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.f1282a & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f1282a + ", mDescription=" + this.f1283b + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1282a);
            this.f1283b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.f1282a = parcel.readInt();
            this.f1283b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

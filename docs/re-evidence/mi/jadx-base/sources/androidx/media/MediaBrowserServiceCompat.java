package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import defpackage.h63;
import defpackage.hlf;
import defpackage.njh;
import defpackage.sif;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public static final boolean h = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f2614a;
    public f e;
    public MediaSessionCompat.Token g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2615b = new f("android.media.session.MediaController", -1, -1, null, null);
    public final ArrayList<f> c = new ArrayList<>();
    public final ArrayMap<IBinder, f> d = new ArrayMap<>();
    public final q f = new q();

    public class a extends l<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ f f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Bundle h;
        public final /* synthetic */ Bundle i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = fVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.d.get(this.f.f.asBinder()) != this.f) {
                if (MediaBrowserServiceCompat.h) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    sb.append(this.f.f2618a);
                    sb.append(" id=");
                    sb.append(this.g);
                    return;
                }
                return;
            }
            if ((a() & 1) != 0) {
                list = MediaBrowserServiceCompat.this.b(list, this.h);
            }
            try {
                this.f.f.a(this.g, list, this.h, this.i);
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Calling onLoadChildren() failed for id=");
                sb2.append(this.g);
                sb2.append(" package=");
                sb2.append(this.f.f2618a);
            }
        }
    }

    public class b extends l<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((a() & 2) != 0) {
                this.f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f.send(0, bundle);
        }
    }

    public class c extends l<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if ((a() & 4) != 0 || list == null) {
                this.f.send(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f.send(0, bundle);
        }
    }

    public class d extends l<Bundle> {
        public final /* synthetic */ ResultReceiver f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f = resultReceiver;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        public void c(Bundle bundle) {
            this.f.send(-1, bundle);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(Bundle bundle) {
            this.f.send(0, bundle);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f2617b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f2616a = str;
            this.f2617b = bundle;
        }

        public Bundle c() {
            return this.f2617b;
        }

        public String d() {
            return this.f2616a;
        }
    }

    public class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2619b;
        public final int c;
        public final hlf d;
        public final Bundle e;
        public final o f;
        public final HashMap<String, List<njh<IBinder, Bundle>>> g = new HashMap<>();
        public e h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                MediaBrowserServiceCompat.this.d.remove(fVar.f.asBinder());
            }
        }

        public f(String str, int i, int i2, Bundle bundle, o oVar) {
            this.f2618a = str;
            this.f2619b = i;
            this.c = i2;
            this.d = new hlf(str, i, i2);
            this.e = bundle;
            this.f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f.post(new a());
        }
    }

    public interface g {
        IBinder a(Intent intent);

        void onCreate();
    }

    @RequiresApi(21)
    public class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Bundle> f2621a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaBrowserService f2622b;
        public Messenger c;

        public class a extends l<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f.b(arrayList);
            }
        }

        public class b extends MediaBrowserService {
            public b(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                e eVarB = h.this.b(str, i, bundle == null ? null : new Bundle(bundle));
                if (eVarB == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(eVarB.f2616a, eVarB.f2617b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.c(str, new m<>(result));
            }
        }

        public h() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public IBinder a(Intent intent) {
            return this.f2622b.onBind(intent);
        }

        public e b(String str, int i, Bundle bundle) {
            Bundle bundleC;
            int i2 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundleC = null;
            } else {
                bundle.remove("extra_client_version");
                this.c = new Messenger(MediaBrowserServiceCompat.this.f);
                bundleC = new Bundle();
                bundleC.putInt("extra_service_version", 2);
                h63.b(bundleC, "extra_messenger", this.c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.g;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    h63.b(bundleC, "extra_session_binder", extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.f2621a.add(bundleC);
                }
                i2 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            f fVar = MediaBrowserServiceCompat.this.new f(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.e = fVar;
            e eVarE = mediaBrowserServiceCompat.e(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.e = null;
            if (eVarE == null) {
                return null;
            }
            if (this.c != null) {
                mediaBrowserServiceCompat2.c.add(fVar);
            }
            if (bundleC == null) {
                bundleC = eVarE.c();
            } else if (eVarE.c() != null) {
                bundleC.putAll(eVarE.c());
            }
            return new e(eVarE.d(), bundleC);
        }

        public void c(String str, m<List<Parcel>> mVar) {
            a aVar = new a(str, mVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.e = mediaBrowserServiceCompat.f2615b;
            mediaBrowserServiceCompat.f(str, aVar);
            MediaBrowserServiceCompat.this.e = null;
        }
    }

    @RequiresApi(23)
    public class i extends h {

        public class a extends l<MediaBrowserCompat.MediaItem> {
            public final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f.b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                this.f.b(parcelObtain);
            }
        }

        public class b extends h.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.d(str, new m<>(result));
            }
        }

        public i() {
            super();
        }

        public void d(String str, m<Parcel> mVar) {
            a aVar = new a(str, mVar);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.e = mediaBrowserServiceCompat.f2615b;
            mediaBrowserServiceCompat.h(str, aVar);
            MediaBrowserServiceCompat.this.e = null;
        }
    }

    @RequiresApi(26)
    public class j extends i {

        public class a extends l<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ m f;
            public final /* synthetic */ Bundle g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f = mVar;
                this.g = bundle;
            }

            @Override // androidx.media.MediaBrowserServiceCompat.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f.b(null);
                    return;
                }
                if ((a() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.b(list, this.g);
                }
                ArrayList arrayList = new ArrayList();
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    arrayList.add(parcelObtain);
                }
                this.f.b(arrayList);
            }
        }

        public class b extends i.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.ensureClassLoader(bundle);
                j jVar = j.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.e = mediaBrowserServiceCompat.f2615b;
                jVar.e(str, new m<>(result), bundle);
                MediaBrowserServiceCompat.this.e = null;
            }
        }

        public j() {
            super();
        }

        public void e(String str, m<List<Parcel>> mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.e = mediaBrowserServiceCompat.f2615b;
            mediaBrowserServiceCompat.g(str, aVar, bundle);
            MediaBrowserServiceCompat.this.e = null;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.g
        public void onCreate() {
            b bVar = new b(MediaBrowserServiceCompat.this);
            this.f2622b = bVar;
            bVar.onCreate();
        }
    }

    @RequiresApi(28)
    public class k extends j {
        public k() {
            super();
        }
    }

    public static class l<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2626b;
        public boolean c;
        public boolean d;
        public int e;

        public l(Object obj) {
            this.f2625a = obj;
        }

        public int a() {
            return this.e;
        }

        public boolean b() {
            return this.f2626b || this.c || this.d;
        }

        public void c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f2625a);
        }

        public void d(T t) {
            throw null;
        }

        public void e(Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f2625a);
            }
        }

        public void f(T t) {
            if (!this.c && !this.d) {
                this.c = true;
                d(t);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f2625a);
            }
        }

        public void g(int i) {
            this.e = i;
        }
    }

    @RequiresApi(21)
    public static class m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaBrowserService.Result f2627a;

        public m(MediaBrowserService.Result result) {
            this.f2627a = result;
        }

        public List<MediaBrowser.MediaItem> a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(T t) {
            if (t instanceof List) {
                this.f2627a.sendResult(a((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.f2627a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.f2627a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public class n {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2629a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2630b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;
            public final /* synthetic */ Bundle e;

            public a(o oVar, String str, int i, int i2, Bundle bundle) {
                this.f2629a = oVar;
                this.f2630b = str;
                this.c = i;
                this.d = i2;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2629a.asBinder();
                MediaBrowserServiceCompat.this.d.remove(iBinderAsBinder);
                f fVar = MediaBrowserServiceCompat.this.new f(this.f2630b, this.c, this.d, this.e, this.f2629a);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.e = fVar;
                e eVarE = mediaBrowserServiceCompat.e(this.f2630b, this.d, this.e);
                fVar.h = eVarE;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.e = null;
                if (eVarE == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No root for client ");
                    sb.append(this.f2630b);
                    sb.append(" from service ");
                    sb.append(getClass().getName());
                    try {
                        this.f2629a.b();
                        return;
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb2.append(this.f2630b);
                        return;
                    }
                }
                try {
                    mediaBrowserServiceCompat2.d.put(iBinderAsBinder, fVar);
                    iBinderAsBinder.linkToDeath(fVar, 0);
                    if (MediaBrowserServiceCompat.this.g != null) {
                        this.f2629a.c(fVar.h.d(), MediaBrowserServiceCompat.this.g, fVar.h.c());
                    }
                } catch (RemoteException unused2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                    sb3.append(this.f2630b);
                    MediaBrowserServiceCompat.this.d.remove(iBinderAsBinder);
                }
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2631a;

            public b(o oVar) {
                this.f2631a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVarRemove = MediaBrowserServiceCompat.this.d.remove(this.f2631a.asBinder());
                if (fVarRemove != null) {
                    fVarRemove.f.asBinder().unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2634b;
            public final /* synthetic */ IBinder c;
            public final /* synthetic */ Bundle d;

            public c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f2633a = oVar;
                this.f2634b = str;
                this.c = iBinder;
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.d.get(this.f2633a.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.a(this.f2634b, fVar, this.c, this.d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("addSubscription for callback that isn't registered id=");
                sb.append(this.f2634b);
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2636b;
            public final /* synthetic */ IBinder c;

            public d(o oVar, String str, IBinder iBinder) {
                this.f2635a = oVar;
                this.f2636b = str;
                this.c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.d.get(this.f2635a.asBinder());
                if (fVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeSubscription for callback that isn't registered id=");
                    sb.append(this.f2636b);
                } else {
                    if (MediaBrowserServiceCompat.this.p(this.f2636b, fVar, this.c)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription called for ");
                    sb2.append(this.f2636b);
                    sb2.append(" which is not subscribed");
                }
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2638b;
            public final /* synthetic */ ResultReceiver c;

            public e(o oVar, String str, ResultReceiver resultReceiver) {
                this.f2637a = oVar;
                this.f2638b = str;
                this.c = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.d.get(this.f2637a.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.n(this.f2638b, fVar, this.c);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getMediaItem for callback that isn't registered id=");
                sb.append(this.f2638b);
            }
        }

        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f2640b;
            public final /* synthetic */ String c;
            public final /* synthetic */ int d;
            public final /* synthetic */ Bundle e;

            public f(o oVar, int i, String str, int i2, Bundle bundle) {
                this.f2639a = oVar;
                this.f2640b = i;
                this.c = str;
                this.d = i2;
                this.e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2639a.asBinder();
                MediaBrowserServiceCompat.this.d.remove(iBinderAsBinder);
                Iterator<f> it = MediaBrowserServiceCompat.this.c.iterator();
                f fVar = null;
                while (it.hasNext()) {
                    f next = it.next();
                    if (next.c == this.f2640b) {
                        if (TextUtils.isEmpty(this.c) || this.d <= 0) {
                            fVar = MediaBrowserServiceCompat.this.new f(next.f2618a, next.f2619b, next.c, this.e, this.f2639a);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = MediaBrowserServiceCompat.this.new f(this.c, this.d, this.f2640b, this.e, this.f2639a);
                }
                MediaBrowserServiceCompat.this.d.put(iBinderAsBinder, fVar);
                try {
                    iBinderAsBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2641a;

            public g(o oVar) {
                this.f2641a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f2641a.asBinder();
                f fVarRemove = MediaBrowserServiceCompat.this.d.remove(iBinderAsBinder);
                if (fVarRemove != null) {
                    iBinderAsBinder.unlinkToDeath(fVarRemove, 0);
                }
            }
        }

        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2643a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2644b;
            public final /* synthetic */ Bundle c;
            public final /* synthetic */ ResultReceiver d;

            public h(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2643a = oVar;
                this.f2644b = str;
                this.c = bundle;
                this.d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.d.get(this.f2643a.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.o(this.f2644b, this.c, fVar, this.d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("search for callback that isn't registered query=");
                sb.append(this.f2644b);
            }
        }

        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f2645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2646b;
            public final /* synthetic */ Bundle c;
            public final /* synthetic */ ResultReceiver d;

            public i(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2645a = oVar;
                this.f2646b = str;
                this.c = bundle;
                this.d = resultReceiver;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = MediaBrowserServiceCompat.this.d.get(this.f2645a.asBinder());
                if (fVar != null) {
                    MediaBrowserServiceCompat.this.l(this.f2646b, this.c, fVar, this.d);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("sendCustomAction for callback that isn't registered action=");
                sb.append(this.f2646b);
                sb.append(", extras=");
                sb.append(this.c);
            }
        }

        public n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            MediaBrowserServiceCompat.this.f.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, o oVar) {
            if (MediaBrowserServiceCompat.this.c(str, i3)) {
                MediaBrowserServiceCompat.this.f.a(new a(oVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(o oVar) {
            MediaBrowserServiceCompat.this.f.a(new b(oVar));
        }

        public void d(String str, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f.a(new e(oVar, str, resultReceiver));
        }

        public void e(o oVar, String str, int i2, int i3, Bundle bundle) {
            MediaBrowserServiceCompat.this.f.a(new f(oVar, i3, str, i2, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            MediaBrowserServiceCompat.this.f.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f.a(new h(oVar, str, bundle, resultReceiver));
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.f.a(new i(oVar, str, bundle, resultReceiver));
        }

        public void i(o oVar) {
            MediaBrowserServiceCompat.this.f.a(new g(oVar));
        }
    }

    public interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    public static class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Messenger f2647a;

        public p(Messenger messenger) {
            this.f2647a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public IBinder asBinder() {
            return this.f2647a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }

        public final void d(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            messageObtain.setData(bundle);
            this.f2647a.send(messageObtain);
        }
    }

    public final class q extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f2648a;

        public q() {
            this.f2648a = MediaBrowserServiceCompat.this.new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle);
                    this.f2648a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                    break;
                case 2:
                    this.f2648a.c(new p(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(bundle2);
                    this.f2648a.a(data.getString("data_media_item_id"), h63.a(data, "data_callback_token"), bundle2, new p(message.replyTo));
                    break;
                case 4:
                    this.f2648a.f(data.getString("data_media_item_id"), h63.a(data, "data_callback_token"), new p(message.replyTo));
                    break;
                case 5:
                    this.f2648a.d(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(bundle3);
                    this.f2648a.e(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case 7:
                    this.f2648a.i(new p(message.replyTo));
                    break;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(bundle4);
                    this.f2648a.g(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(bundle5);
                    this.f2648a.h(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<njh<IBinder, Bundle>> arrayList = fVar.g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (njh<IBinder, Bundle> njhVar : arrayList) {
            if (iBinder == njhVar.f27979a && sif.a(bundle, njhVar.f27980b)) {
                return;
            }
        }
        arrayList.add(new njh<>(iBinder, bundle));
        fVar.g.put(str, arrayList);
        m(str, fVar, bundle, null);
        this.e = fVar;
        j(str, bundle);
        this.e = null;
    }

    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i3 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int size = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (size > list.size()) {
            size = list.size();
        }
        return list.subList(i4, size);
    }

    public boolean c(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(String str, Bundle bundle, l<Bundle> lVar) {
        lVar.e(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract e e(String str, int i2, Bundle bundle);

    public abstract void f(String str, l<List<MediaBrowserCompat.MediaItem>> lVar);

    public void g(String str, l<List<MediaBrowserCompat.MediaItem>> lVar, Bundle bundle) {
        lVar.g(1);
        f(str, lVar);
    }

    public void h(String str, l<MediaBrowserCompat.MediaItem> lVar) {
        lVar.g(2);
        lVar.f(null);
    }

    public void i(String str, Bundle bundle, l<List<MediaBrowserCompat.MediaItem>> lVar) {
        lVar.g(4);
        lVar.f(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void j(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void k(String str) {
    }

    public void l(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.e = fVar;
        d(str, bundle, dVar);
        this.e = null;
        if (dVar.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void m(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.e = fVar;
        if (bundle == null) {
            f(str, aVar);
        } else {
            g(str, aVar, bundle);
        }
        this.e = null;
        if (aVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f2618a + " id=" + str);
    }

    public void n(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.e = fVar;
        h(str, bVar);
        this.e = null;
        if (bVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    public void o(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.e = fVar;
        i(str, bundle, cVar);
        this.e = null;
        if (cVar.b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2614a.a(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2614a = new k();
        } else {
            this.f2614a = new j();
        }
        this.f2614a.onCreate();
    }

    public boolean p(String str, f fVar, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<njh<IBinder, Bundle>> list = fVar.g.get(str);
                if (list != null) {
                    Iterator<njh<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f27979a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.g.remove(str);
                    }
                }
            } else if (fVar.g.remove(str) != null) {
                z = true;
            }
            this.e = fVar;
            k(str);
            this.e = null;
            return z;
        } catch (Throwable th) {
            this.e = fVar;
            k(str);
            this.e = null;
            throw th;
        }
    }
}

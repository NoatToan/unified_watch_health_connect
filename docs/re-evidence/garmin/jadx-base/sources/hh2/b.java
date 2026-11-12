package hh2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.garmin.android.services.ForegroundServiceBroker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhh2/b;", "", "<init>", "()V", "a", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f83747a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Messenger f83748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f83749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList<WeakReference<a>> f83750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ServiceConnectionC1654b f83751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Messenger f83752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, a> f83753g;

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* JADX INFO: renamed from: hh2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hh2/b$b", "Landroid/content/ServiceConnection;", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ServiceConnectionC1654b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b bVar = b.f83747a;
            b.f83748b = new Messenger(iBinder);
            b.f83749c.set(true);
            Iterator<WeakReference<a>> it = b.f83750d.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.f();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            b.f83748b = null;
            b.f83749c.set(false);
            Iterator<WeakReference<a>> it = b.f83750d.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.e();
                }
            }
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i("ForegroundServiceHelper");
        f83749c = new AtomicBoolean(false);
        f83750d = new ArrayList<>();
        f83751e = new ServiceConnectionC1654b();
        f83752f = new Messenger(new Handler(Looper.getMainLooper(), new hh2.a()));
        f83753g = new HashMap<>();
    }

    private b() {
    }

    public static void a(b bVar, Context context, e eVar, d dVar, a aVar) {
        f fVar = new f(0, 1, null);
        bVar.getClass();
        ArrayList<WeakReference<a>> arrayList = f83750d;
        if (aVar != null) {
            Iterator<WeakReference<a>> it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(new WeakReference<>(aVar));
                    break;
                }
            } while (!s.g(it.next().get(), aVar));
        }
        if (f83749c.get()) {
            Iterator<WeakReference<a>> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar2 = it3.next().get();
                if (aVar2 != null) {
                    aVar2.c();
                }
            }
            return;
        }
        ForegroundServiceBroker.f50588e.getClass();
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) ForegroundServiceBroker.class);
        intent.putExtra("NotificationChannel", dVar);
        intent.putExtra("NotificationData", eVar);
        intent.putExtra("ServiceConfiguration", fVar);
        context.startForegroundService(intent);
        context.bindService(intent, f83751e, 0);
    }

    public static void b(Context context, Intent intent) {
        if (!f83749c.get()) {
            h.z("Must first call startBroker before starting additional services");
            return;
        }
        Message messageObtain = Message.obtain(null, 1, 0, 0);
        messageObtain.obj = intent;
        messageObtain.replyTo = f83752f;
        Messenger messenger = f83748b;
        if (messenger == null) {
            return;
        }
        messenger.send(messageObtain);
    }
}

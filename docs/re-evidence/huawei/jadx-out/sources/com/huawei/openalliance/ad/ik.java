package com.huawei.openalliance.ad;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii f18961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jc f18962b;
    private int d;
    private ServerSocket e;
    private b f;
    private boolean g;
    private iy h;
    private Context j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f18963c = new ConcurrentHashMap();
    private boolean i = false;

    public boolean b() {
        return this.g;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a(Socket socket) {
        try {
            iw iwVar = new iw(this.j, io.a(socket.getInputStream()), this.f18962b, this.f18961a, this.f18963c);
            iwVar.a(this.h);
            iwVar.a(new a(this));
            iwVar.a(socket);
        } catch (Throwable th) {
            if (hw.a()) {
                hw.a(3, th);
            }
            hw.d("CreativeHttpServer", "process socket failed, %s", th.getClass().getSimpleName());
        }
    }

    public void a(Context context) {
        if (this.g) {
            return;
        }
        String string = context.getString(R.string.player_local_host);
        this.e = new ServerSocket(0, 8, InetAddress.getByName(string));
        this.f = new b();
        int localPort = this.e.getLocalPort();
        this.d = localPort;
        iq.a(string, localPort);
        Thread thread = new Thread("mediaCache") { // from class: com.huawei.openalliance.ad.ik.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                ik.this.c();
            }
        };
        thread.setUncaughtExceptionHandler(this.f);
        thread.start();
        this.g = true;
    }

    public int a() {
        return this.d;
    }

    static class a implements ip {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<ik> f18967a;

        @Override // com.huawei.openalliance.ad.ip
        public void a() {
            ik ikVar = this.f18967a.get();
            if (ikVar != null) {
                ikVar.a(true);
            }
        }

        public a(ik ikVar) {
            this.f18967a = new WeakReference<>(ikVar);
        }
    }

    public static class b implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            hw.c("CreativeHttpServer", "register socket listener error: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.e == null) {
            return;
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                hw.b("CreativeHttpServer", "register listener running...");
                final Socket socketAccept = this.e.accept();
                hw.a("CreativeHttpServer", "accept a new socket: %s, data consume exceed max limit or stream error: %s ", socketAccept, Boolean.valueOf(this.i));
                if (this.i) {
                    return;
                } else {
                    com.huawei.openalliance.ad.utils.o.k(new Runnable() { // from class: com.huawei.openalliance.ad.ik.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ik.this.a(socketAccept);
                        }
                    });
                }
            } catch (Throwable th) {
                hw.d("CreativeHttpServer", "register socket listener error! exception: " + th.getClass().getSimpleName());
                return;
            }
        }
    }

    public ik(Context context, ii iiVar, jc jcVar, iy iyVar) {
        this.f18961a = iiVar;
        this.f18962b = jcVar;
        this.h = iyVar;
        this.j = context.getApplicationContext();
    }
}

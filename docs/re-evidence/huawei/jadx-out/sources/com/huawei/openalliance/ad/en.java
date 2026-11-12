package com.huawei.openalliance.ad;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.beans.metadata.App;
import com.huawei.openalliance.ad.beans.metadata.CellInfo;
import com.huawei.openalliance.ad.beans.metadata.Device;
import com.huawei.openalliance.ad.beans.metadata.Network;

/* JADX INFO: loaded from: classes12.dex */
public class en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static en f18701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18702b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f18703c = new byte[0];
    private Network d;
    private gk e;
    private App f;
    private Device g;
    private Pair<Integer, Pair<String, String>> h;
    private Context i;

    public void f() {
        a((Pair<Integer, Pair<String, String>>) null);
    }

    public void e() {
        final boolean zBf = this.e.bf();
        com.huawei.openalliance.ad.utils.o.i(new Runnable() { // from class: com.huawei.openalliance.ad.en.1
            @Override // java.lang.Runnable
            public void run() {
                en.this.a(new App(en.this.i));
                Pair<Integer, Pair<String, String>> pairF = com.huawei.openalliance.ad.utils.cb.f(en.this.i);
                en.this.a(pairF);
                Network network = new Network(en.this.i, false);
                if (zBf && pairF != null) {
                    CellInfo cellInfo = new CellInfo();
                    cellInfo.a(pairF);
                    network.b().add(cellInfo);
                }
                en.this.a(network);
                en.this.a(new Device(en.this.i, zBf));
            }
        });
    }

    public Pair<Integer, Pair<String, String>> d() {
        Pair<Integer, Pair<String, String>> pair;
        synchronized (this.f18703c) {
            pair = this.h;
        }
        return pair;
    }

    public Device c() {
        Device device;
        synchronized (this.f18703c) {
            device = this.g;
        }
        return device;
    }

    public App b() {
        App app;
        synchronized (this.f18703c) {
            app = this.f;
        }
        return app;
    }

    public void a(Network network) {
        synchronized (this.f18703c) {
            this.d = network;
        }
    }

    public void a(Device device) {
        synchronized (this.f18703c) {
            this.g = device;
        }
    }

    public void a(App app) {
        synchronized (this.f18703c) {
            this.f = app;
        }
    }

    public void a(Pair<Integer, Pair<String, String>> pair) {
        synchronized (this.f18703c) {
            this.h = pair;
        }
    }

    public Network a() {
        Network network;
        synchronized (this.f18703c) {
            network = this.d;
        }
        return network;
    }

    private static en b(Context context) {
        en enVar;
        synchronized (f18702b) {
            if (f18701a == null) {
                f18701a = new en(context);
            }
            enVar = f18701a;
        }
        return enVar;
    }

    public static en a(Context context) {
        return b(context);
    }

    private en(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext;
        this.e = fp.b(applicationContext);
    }
}

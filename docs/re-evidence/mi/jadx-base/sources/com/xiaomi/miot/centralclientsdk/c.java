package com.xiaomi.miot.centralclientsdk;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.google.android.gms.common.Scopes;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NsdManager f13603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NsdManager.DiscoveryListener f13604b;
    public final NsdManager.ResolveListener c;
    public final ArrayList<NsdServiceInfo> d = new ArrayList<>();
    public String e = null;
    public String f = null;
    public Semaphore g;
    public Semaphore h;
    public Semaphore i;

    public class a implements NsdManager.DiscoveryListener {
        public a() {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStarted(String str) {
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onDiscoveryStopped(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Discovery stopped: ");
            sb.append(str);
            c.this.g.release();
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("Service discovery success");
            sb.append(nsdServiceInfo);
            c.this.k(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("service lost: ");
            sb.append(nsdServiceInfo);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStartDiscoveryFailed(String str, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Discovery failed: Error code:");
            sb.append(i);
            c.this.f13603a.stopServiceDiscovery(this);
        }

        @Override // android.net.nsd.NsdManager.DiscoveryListener
        public void onStopDiscoveryFailed(String str, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Discovery failed: Error code:");
            sb.append(i);
            c.this.f13603a.stopServiceDiscovery(this);
        }
    }

    public class b implements NsdManager.ResolveListener {
        public b() {
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolve failed: ");
            sb.append(nsdServiceInfo);
            sb.append(", Error code: ");
            sb.append(i);
            c.this.h.release();
            c.this.j();
        }

        @Override // android.net.nsd.NsdManager.ResolveListener
        public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resolve: ");
            sb.append(nsdServiceInfo);
            if (c.this.h(nsdServiceInfo.getAttributes()) != null) {
                c.g(c.this);
            }
            c.this.h.release();
            c.this.j();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.miot.centralclientsdk.c$c, reason: collision with other inner class name */
    public interface InterfaceC0827c {
    }

    public c(Context context) {
        Semaphore semaphore = new Semaphore(1);
        this.g = semaphore;
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.i = new Semaphore(1);
        this.h = new Semaphore(1);
        this.f13603a = (NsdManager) context.getSystemService("servicediscovery");
        this.f13604b = new a();
        this.c = new b();
    }

    public static /* synthetic */ InterfaceC0827c g(c cVar) {
        cVar.getClass();
        return null;
    }

    public final String h(Map<String, byte[]> map) {
        try {
            byte[] bArr = map.get(Scopes.PROFILE);
            if (bArr == null) {
                return null;
            }
            com.xiaomi.miot.centralclientsdk.b bVar = new com.xiaomi.miot.centralclientsdk.b(bArr);
            bVar.toString();
            if (bVar.h == com.xiaomi.miot.centralclientsdk.b.a.f13602a && bVar.f13601k && this.e != null && this.f != null) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest((this.e + "central_service" + this.f).getBytes());
                int length = bArrDigest.length;
                byte[] bArr2 = bVar.e;
                if (length >= bArr2.length && Arrays.equals(bArr2, Arrays.copyOfRange(bArrDigest, 0, bArr2.length))) {
                    return bVar.d;
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void i() throws InterruptedException {
        if (this.i.availablePermits() == 0) {
            this.f13603a.stopServiceDiscovery(this.f13604b);
            this.g.acquire();
            this.h.acquire();
            this.d.clear();
            this.h.release();
            this.e = null;
            this.f = null;
            this.i.release();
        }
    }

    public final void j() {
        if (this.h.tryAcquire()) {
            if (this.d.isEmpty()) {
                this.h.release();
                return;
            }
            NsdServiceInfo nsdServiceInfo = this.d.get(0);
            this.d.remove(0);
            this.f13603a.resolveService(nsdServiceInfo, this.c);
        }
    }

    public final void k(NsdServiceInfo nsdServiceInfo) {
        this.d.add(nsdServiceInfo);
        j();
    }
}

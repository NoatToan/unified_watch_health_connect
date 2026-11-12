package com.unicom.online.account.kernel;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes20.dex */
public class af {
    private static af f;
    private Network d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConnectivityManager.NetworkCallback f31148a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConnectivityManager f31149b = null;
    private List<a> e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Timer f31150c = null;

    public interface a {
        void a(boolean z, Object obj);
    }

    public final void b() {
        ConnectivityManager.NetworkCallback networkCallback;
        synchronized (this) {
            try {
                Timer timer = this.f31150c;
                if (timer != null) {
                    timer.cancel();
                    this.f31150c = null;
                }
                ConnectivityManager connectivityManager = this.f31149b;
                if (connectivityManager != null && (networkCallback = this.f31148a) != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                }
                this.f31149b = null;
                this.f31148a = null;
                this.d = null;
                this.e.clear();
            } catch (Exception e) {
                aj.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z, Network network) {
        synchronized (this) {
            try {
                Timer timer = this.f31150c;
                if (timer != null) {
                    timer.cancel();
                    this.f31150c = null;
                }
                Iterator<a> it = this.e.iterator();
                while (it.hasNext()) {
                    it.next().a(z, network);
                }
                this.e.clear();
            } catch (Exception e) {
                aj.a(e);
            }
        }
    }

    public final void a(Context context, a aVar) {
        b(context, aVar);
    }

    private void b(final Context context, final a aVar) {
        synchronized (this) {
            Network network = this.d;
            if (network != null) {
                aVar.a(true, network);
                return;
            }
            a(aVar);
            if (this.f31148a == null || this.e.size() < 2) {
                new Thread(new FutureTask(new Runnable() { // from class: com.unicom.online.account.kernel.af.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        final af afVar = af.this;
                        try {
                            try {
                                afVar.f31149b = (ConnectivityManager) context.getSystemService("connectivity");
                                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                                builder.addTransportType(0);
                                builder.addCapability(12);
                                NetworkRequest networkRequestBuild = builder.build();
                                afVar.f31148a = new ConnectivityManager.NetworkCallback() { // from class: com.unicom.online.account.kernel.af.1
                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onUnavailable() {
                                        super.onUnavailable();
                                        aj.a("Network onUnavailable");
                                        af.this.a(false, (Network) null);
                                        af.this.b();
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onLost(Network network2) {
                                        super.onLost(network2);
                                        aj.a("Network onLost");
                                        af.this.b();
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onAvailable(Network network2) {
                                        super.onAvailable(network2);
                                        aj.a("Network onAvailable");
                                        af.this.d = network2;
                                        af.this.a(true, network2);
                                        try {
                                            String extraInfo = af.this.f31149b.getNetworkInfo(af.this.d).getExtraInfo();
                                            if (TextUtils.isEmpty(extraInfo)) {
                                                return;
                                            }
                                            ak.d(extraInfo);
                                        } catch (Exception e) {
                                            aj.a(e);
                                        }
                                    }
                                };
                                int iG = ak.g();
                                if (iG > 1) {
                                    iG--;
                                }
                                Log.e("forceMobileConnection", Thread.currentThread().getName());
                                afVar.f31149b.requestNetwork(networkRequestBuild, afVar.f31148a, iG * 1000);
                            } catch (Exception e) {
                                aj.a(e);
                                afVar.a(false, (Network) null);
                            }
                        } catch (Exception e2) {
                            aj.a(e2);
                            afVar.a(false, (Network) null);
                        }
                    }
                }, new ao())).start();
            }
        }
    }

    private void a(a aVar) {
        synchronized (this) {
            try {
                this.e.add(aVar);
            } catch (Exception e) {
                aj.a(e);
            }
        }
    }

    public static af a() {
        if (f == null) {
            synchronized (af.class) {
                if (f == null) {
                    f = new af();
                }
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: com.unicom.online.account.kernel.af$2, reason: invalid class name */
    final class AnonymousClass2 extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            af.this.a(false, (Network) null);
        }

        AnonymousClass2() {
        }
    }

    private af() {
    }
}

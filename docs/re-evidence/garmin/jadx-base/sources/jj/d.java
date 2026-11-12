package jj;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f98911b;

    public d(Context context, b.a aVar) {
        this.f98910a = context.getApplicationContext();
        this.f98911b = aVar;
    }

    @Override // jj.m
    public final void onDestroy() {
    }

    @Override // jj.m
    public final void onStart() {
        s sVarA = s.a(this.f98910a);
        b.a aVar = this.f98911b;
        synchronized (sVarA) {
            sVarA.f98935b.add(aVar);
            if (!sVarA.f98936c && !sVarA.f98935b.isEmpty()) {
                s.c cVar = sVarA.f98934a;
                qj.g<ConnectivityManager> gVar = cVar.f98941c;
                boolean z14 = false;
                cVar.f98939a = gVar.get().getActiveNetwork() != null;
                try {
                    gVar.get().registerDefaultNetworkCallback(cVar.f98942d);
                    z14 = true;
                } catch (RuntimeException unused) {
                }
                sVarA.f98936c = z14;
            }
        }
    }

    @Override // jj.m
    public final void onStop() {
        s sVarA = s.a(this.f98910a);
        b.a aVar = this.f98911b;
        synchronized (sVarA) {
            sVarA.f98935b.remove(aVar);
            if (sVarA.f98936c && sVarA.f98935b.isEmpty()) {
                s.c cVar = sVarA.f98934a;
                cVar.f98941c.get().unregisterNetworkCallback(cVar.f98942d);
                sVarA.f98936c = false;
            }
        }
    }
}

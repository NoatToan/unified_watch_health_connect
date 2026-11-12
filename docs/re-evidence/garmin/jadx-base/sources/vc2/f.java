package vc2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import e23.p;
import o13.r;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import q53.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lvc2/b;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.connectivity.PlatformNetworkConnectivityMonitor$connectivityState$1", f = "PlatformNetworkConnectivityMonitor.kt", l = {59}, m = "invokeSuspend")
public final class f extends v13.i implements p<t<? super b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f177105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f177106c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vc2/f$a", "Landroid/content/BroadcastReceiver;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f177107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<b> f177108b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, t<? super b> tVar) {
            this.f177107a = gVar;
            this.f177108b = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            try {
                ConnectivityManager connectivityManagerB = h.b(context);
                if (connectivityManagerB != null) {
                    q53.m.a(this.f177108b.i(h.a(connectivityManagerB)));
                }
            } catch (Exception e4) {
                this.f177107a.f177110b.error("Failed to get current network connection state", (Throwable) e4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f177106c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f177106c, dVar);
        fVar.f177105b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super b> tVar, t13.d<? super Unit> dVar) {
        return ((f) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f177104a;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.f177105b;
            g gVar = this.f177106c;
            Context context = gVar.f177109a;
            Logger logger = gVar.f177110b;
            Context context2 = gVar.f177109a;
            vc2.a aVar3 = new vc2.a(context, tVar);
            m0 m0Var = new m0();
            try {
                ConnectivityManager connectivityManagerB = h.b(context2);
                if (connectivityManagerB != null) {
                    tVar.i(h.a(connectivityManagerB));
                    connectivityManagerB.registerNetworkCallback(new NetworkRequest.Builder().build(), aVar3);
                    m0Var.f105804a = true;
                } else {
                    q53.m.a(tVar.i(b.c.f177084b));
                }
            } catch (Exception e4) {
                logger.error("Failed to register network callback", (Throwable) e4);
            }
            if (m0Var.f105804a) {
                aVar = null;
            } else {
                a aVar4 = new a(gVar, tVar);
                try {
                    context2.registerReceiver(aVar4, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } catch (Exception e14) {
                    logger.error("Failed to register connectivity receiver", (Throwable) e14);
                }
                aVar = aVar4;
            }
            ug2.k kVar = new ug2.k(m0Var, gVar, aVar3, aVar, 4);
            this.f177104a = 1;
            if (q53.r.a(tVar, kVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

package az0;

import android.net.ConnectivityManager;
import android.net.Network;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Laz0/c$a;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.network.connectivity.NetworkStateObserverImpl$observe$1", f = "NetworkStateObserverImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<t<? super c.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13692c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"az0/d$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<c.a> f13693a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super c.a> tVar) {
            this.f13693a = tVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            super.onAvailable(network);
            this.f13693a.i(c.a.Available);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLosing(Network network, int i14) {
            network.getClass();
            super.onLosing(network, i14);
            this.f13693a.i(c.a.Losing);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            super.onLost(network);
            this.f13693a.i(c.a.Lost);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            super.onUnavailable();
            this.f13693a.i(c.a.Unavailable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f13692c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f13692c, dVar);
        dVar2.f13691b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(t<? super c.a> tVar, t13.d<? super Unit> dVar) {
        return ((d) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f13691b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13690a;
        if (i14 == 0) {
            r.b(obj);
            tVar.i(b.a() ? c.a.Available : c.a.Unavailable);
            a aVar2 = new a(tVar);
            e eVar = this.f13692c;
            eVar.f13694a.registerDefaultNetworkCallback(aVar2);
            ao1.i iVar = new ao1.i(5, eVar, aVar2);
            this.f13691b = null;
            this.f13690a = 1;
            if (q53.r.a(tVar, iVar, this) == aVar) {
                return aVar;
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

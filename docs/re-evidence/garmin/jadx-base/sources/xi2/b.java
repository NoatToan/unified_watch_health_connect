package xi2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.auth.cmc.util.NetworkObserver$observeConnectivityAsFlow$1", f = "NetworkObserver.kt", l = {63}, m = "invokeSuspend")
public final class b extends i implements p<t<? super Boolean>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f191147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f191148c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xi2/b$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<Boolean> f191149a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t<? super Boolean> tVar) {
            this.f191149a = tVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            network.getClass();
            this.f191149a.i(Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            network.getClass();
            networkCapabilities.getClass();
            this.f191149a.i(Boolean.valueOf(networkCapabilities.hasCapability(12)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            this.f191149a.i(Boolean.FALSE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            this.f191149a.i(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f191148c = cVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f191148c, dVar);
        bVar.f191147b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super Boolean> tVar, d<? super Unit> dVar) {
        return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191146a;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.f191147b;
            a aVar2 = new a(tVar);
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(3).addTransportType(0).build();
            c cVar = this.f191148c;
            ConnectivityManager connectivityManager = cVar.f191150a;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(networkRequestBuild, aVar2);
            }
            wz1.c cVar2 = new wz1.c(25, cVar, aVar2);
            this.f191146a = 1;
            if (q53.r.a(tVar, cVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

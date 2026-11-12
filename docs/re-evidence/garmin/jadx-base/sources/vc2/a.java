package vc2;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import p005kotlin.Metadata;
import q53.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvc2/a;", "Lvc2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lq53/t;", "Lvc2/b;", "producer", "<init>", "(Landroid/content/Context;Lq53/t;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f177080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, t<? super b> tVar) {
        super(context, tVar);
        context.getClass();
        tVar.getClass();
        this.f177080b = new HashMap();
    }

    public final void a() {
        b bVar = b.e.f177087b;
        for (b bVar2 : this.f177080b.values()) {
            if (bVar2.f177081a > bVar.f177081a) {
                bVar = bVar2;
            }
        }
        this.f177103a.i(bVar);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        d dVar;
        network.getClass();
        networkCapabilities.getClass();
        boolean zHasCapability = networkCapabilities.hasCapability(17);
        HashMap map = this.f177080b;
        if (zHasCapability) {
            map.put(Long.valueOf(network.getNetworkHandle()), b.a.f177082b);
        } else {
            if (!networkCapabilities.hasCapability(12)) {
                return;
            }
            Long lValueOf = Long.valueOf(network.getNetworkHandle());
            if (networkCapabilities.hasCapability(11)) {
                dVar = d.NOT_METERED;
            } else {
                dVar = networkCapabilities.hasCapability(25) ? d.TEMPORARILY_NOT_METERED : d.METERED;
            }
            map.put(lValueOf, new b.C3312b(dVar));
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.f177080b.put(Long.valueOf(network.getNetworkHandle()), b.c.f177084b);
        a();
    }
}

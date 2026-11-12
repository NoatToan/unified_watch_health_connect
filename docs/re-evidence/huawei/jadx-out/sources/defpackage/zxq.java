package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.observe.ObserveHealth;
import org.eclipse.californium.core.observe.ObserveRelation;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zxq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<InetSocketAddress, zxm> f54745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ObserveHealth f54747c;
    private final ConcurrentHashMap<zvt, ObserveRelation> d;
    private final Configuration e;

    @Deprecated
    public zxq() {
        this(null);
    }

    public zxq(Configuration configuration) {
        this.f54745a = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = configuration;
        this.f54746b = configuration != null ? ((Integer) configuration.c(CoapConfig.z)).intValue() : 0;
    }

    public void a(ObserveRelation observeRelation) {
        ObserveHealth observeHealth = this.f54747c;
        if (observeHealth != null) {
            observeHealth.receivingReject();
        }
        observeRelation.e();
    }

    public void e(ObserveRelation observeRelation) {
        boolean zRemove = this.d.remove(observeRelation.f(), observeRelation);
        zxm zxmVarA = observeRelation.a();
        if (zxmVarA != null) {
            zxmVarA.b(observeRelation);
            synchronized (this) {
                if (zxmVarA.e()) {
                    zRemove = this.f54745a.remove(observeRelation.h(), zxmVarA) || zRemove;
                }
            }
        }
        ObserveHealth observeHealth = this.f54747c;
        if (!zRemove || observeHealth == null) {
            return;
        }
        observeHealth.setObserveRelations(this.d.size());
        observeHealth.setObserveEndpoints(this.f54745a.size());
    }
}

package org.eclipse.californium.core.observe;

import defpackage.aaex;
import defpackage.zvf;
import defpackage.zvt;
import defpackage.zxm;
import defpackage.zxq;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.server.resources.ObservableResource;
import org.eclipse.californium.elements.util.ClockUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class ObserveRelation {
    private static final Logger e = aaex.a((Class<?>) ObserveRelation.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f44455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44457c;
    private volatile boolean d;
    private final zxq f;
    private final zvt g;
    private final Exchange h;
    private long i;
    private int j;
    private final ObservableResource k;
    private zvf l;
    private volatile zxm m;
    private final CoAP.Type n;
    private zvf o;
    private final InetSocketAddress q;

    public enum State {
        NONE,
        INIT,
        ESTABILSHED,
        CANCELED
    }

    public boolean k() {
        return this.d;
    }

    public void n() {
        boolean z;
        synchronized (this) {
            z = this.f44455a;
            if (!z) {
                this.d = true;
            }
        }
        if (z) {
            throw new IllegalStateException(String.format("Could not establish observe relation %s with %s, already canceled (%s)!", j(), this.k.getURI(), this.h));
        }
    }

    public boolean i() {
        return this.f44455a;
    }

    public void l() {
        zxq zxqVar = this.f;
        if (zxqVar != null) {
            zxqVar.a(this);
        } else {
            e();
        }
    }

    public void e() {
        b(true);
    }

    public void c() {
        this.m.a();
    }

    public Exchange d() {
        return this.h;
    }

    public InetSocketAddress h() {
        return this.q;
    }

    public zxm a() {
        return this.m;
    }

    public CoAP.Type g() {
        CoAP.Type observeType = this.k.getObserveType();
        if (observeType == null) {
            observeType = this.n;
        }
        if (observeType != CoAP.Type.CON && !b()) {
            return CoAP.Type.NON;
        }
        return CoAP.Type.CON;
    }

    public State d(zvf zvfVar) {
        if (i()) {
            return State.CANCELED;
        }
        if (k()) {
            this.h.aa();
            if (zvfVar.i() && !zvfVar.g()) {
                zvfVar.getOptions().d(this.k.getNotificationSequenceNumber());
            }
            return State.ESTABILSHED;
        }
        boolean zI = zvfVar.i();
        if (zI) {
            n();
            this.k.addObserveRelation(this);
            if (!i()) {
                if (!zvfVar.g()) {
                    zvfVar.getOptions().d(this.k.getNotificationSequenceNumber());
                }
                return State.INIT;
            }
        }
        if (zI) {
            this.k.removeObserveRelation(this);
        }
        return State.CANCELED;
    }

    public boolean b() {
        boolean z;
        int i;
        boolean z2;
        long jC = ClockUtil.c();
        synchronized (this) {
            z = true;
            int i2 = this.j + 1;
            this.j = i2;
            i = this.f44457c;
            z2 = i2 >= i;
            if (z2) {
                this.i = jC;
                this.j = 0;
            }
        }
        if (z2) {
            e.trace("Observe-relation check, {} notifications reached.", Integer.valueOf(i));
            return z2;
        }
        synchronized (this) {
            if ((jC - this.i) - this.f44456b <= 0) {
                z = false;
            }
            if (z) {
                this.i = jC;
                this.j = 0;
            }
        }
        if (z) {
            e.trace("Observe-relation check, {}s interval reached.", Long.valueOf(TimeUnit.NANOSECONDS.toSeconds(this.f44456b)));
        }
        return z;
    }

    public boolean c(zvf zvfVar) {
        if (a(this.o)) {
            e.trace("in transit {}", this.o);
            zvf zvfVar2 = this.l;
            if (zvfVar2 != null) {
                if (!zvfVar2.g()) {
                    return true;
                }
                this.l.onTransferComplete();
            }
            this.l = zvfVar;
            return true;
        }
        this.o = zvfVar;
        this.l = null;
        b(zvfVar);
        return false;
    }

    public zvf c(zvf zvfVar, boolean z) {
        if (this.o != zvfVar) {
            return null;
        }
        zvf zvfVar2 = this.l;
        if (zvfVar2 != null) {
            this.o = zvfVar2;
            this.l = null;
            b(zvfVar2);
            return zvfVar2;
        }
        if (z) {
            this.o = null;
            this.l = null;
        }
        return zvfVar2;
    }

    public void b(zvf zvfVar) {
        if (zvfVar.g()) {
            return;
        }
        b(false);
    }

    public zvt f() {
        return this.g;
    }

    @Deprecated
    public String j() {
        return this.g.toString();
    }

    private void b(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this) {
            z2 = false;
            if (this.f44455a) {
                z3 = false;
            } else {
                this.f44455a = true;
                z3 = this.d;
                this.d = false;
                z2 = true;
            }
        }
        if (z2) {
            e.debug("Canceling observe relation {} with {} ({})", j(), this.k.getURI(), this.h);
            if (z3) {
                this.k.removeObserveRelation(this);
            }
            zxq zxqVar = this.f;
            if (zxqVar != null) {
                zxqVar.e(this);
            } else {
                this.m.b(this);
            }
            if (z) {
                this.h.a();
            }
        }
    }

    public static State d(ObserveRelation observeRelation, zvf zvfVar) {
        State stateD = State.NONE;
        if (observeRelation != null) {
            stateD = observeRelation.d(zvfVar);
        }
        boolean z = stateD == State.NONE || stateD == State.CANCELED;
        if (zvfVar.g() && (!zvfVar.i() || z)) {
            e.warn("Application notification, not longer observing, remove observe-option {}", zvfVar);
            zvfVar.getOptions().aw();
        }
        return stateD;
    }

    private static boolean a(zvf zvfVar) {
        return (zvfVar == null || !zvfVar.isConfirmable() || zvfVar.isAcknowledged() || zvfVar.isTimedOut() || zvfVar.isRejected() || zvfVar.isCanceled()) ? false : true;
    }
}

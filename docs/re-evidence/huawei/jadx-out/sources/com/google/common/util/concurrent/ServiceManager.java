package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SetMultimap;
import defpackage.alf;
import defpackage.amf;
import defpackage.aqy;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ServiceManager implements ServiceManagerBridge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f4713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableList<Service> f4714c;
    private static final aqy e = new aqy(ServiceManager.class);
    private static final ListenerCallQueue.Event<Listener> d = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.3
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void call(Listener listener) {
            listener.healthy();
        }

        public String toString() {
            return "healthy()";
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ListenerCallQueue.Event<Listener> f4712a = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(Listener listener) {
            listener.stopped();
        }

        public String toString() {
            return "stopped()";
        }
    };

    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public amf<Service.State, Service> servicesByState() {
        return this.f4713b.e();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Class<?>) ServiceManager.class).add("services", alf.a((Collection) this.f4714c, Predicates.not(Predicates.instanceOf(d.class)))).toString();
    }

    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Monitor f4715c;
        final SetMultimap<Service.State, Service> e;

        amf<Service.State, Service> e() {
            amf.d dVarD = amf.d();
            this.f4715c.c();
            try {
                for (Map.Entry<Service.State, Service> entry : this.e.entries()) {
                    if (!(entry.getValue() instanceof d)) {
                        dVarD.c(entry);
                    }
                }
                this.f4715c.b();
                return dVarD.b();
            } catch (Throwable th) {
                this.f4715c.b();
                throw th;
            }
        }
    }

    static final class d extends AbstractService {
        private d() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
            notifyStopped();
        }
    }
}

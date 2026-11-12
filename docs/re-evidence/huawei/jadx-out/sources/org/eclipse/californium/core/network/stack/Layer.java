package org.eclipse.californium.core.network.stack;

import defpackage.zvd;
import defpackage.zvf;
import defpackage.zvg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.californium.core.network.Exchange;

/* JADX INFO: loaded from: classes20.dex */
public interface Layer {
    void destroy();

    void receiveEmptyMessage(Exchange exchange, zvd zvdVar);

    void receiveRequest(Exchange exchange, zvg zvgVar);

    void receiveResponse(Exchange exchange, zvf zvfVar);

    void sendEmptyMessage(Exchange exchange, zvd zvdVar);

    void sendRequest(Exchange exchange, zvg zvgVar);

    void sendResponse(Exchange exchange, zvf zvfVar);

    void setExecutors(ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2);

    void setLowerLayer(Layer layer);

    void setUpperLayer(Layer layer);

    void start();

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Layer> f44450a = new ArrayList();
        private Layer e;

        public c d(Layer layer) {
            Layer layer2 = this.e;
            if (layer2 != null) {
                layer2.setLowerLayer(layer);
            }
            this.f44450a.add(layer);
            this.e = layer;
            return this;
        }

        public List<Layer> b() {
            return Collections.unmodifiableList(new ArrayList(this.f44450a));
        }
    }
}

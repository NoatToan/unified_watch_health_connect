package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.Endpoint;
import org.eclipse.californium.elements.EndpointContext;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zus {
    private static final Logger e = aaex.a((Class<?>) zus.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<EndpointContext> f54585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54586c;
    private Endpoint d;
    private boolean f;
    private CoAP.Type g;
    private Long i;
    private String j;

    public zus() {
        this("");
    }

    public zus(String str) {
        this.f54585b = new AtomicReference<>();
        this.g = CoAP.Type.CON;
        this.f54586c = 0;
        this.j = str;
    }

    public Long e() {
        return this.i;
    }

    public zus c(Long l) {
        this.i = l;
        return this;
    }

    public String d() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public zus b(String str) {
        if (!this.f && this.f54584a == null && !Objects.equals(this.j, str)) {
            if (this.j != null && str != null) {
                try {
                    URI uri = new URI(this.j);
                    URI uri2 = new URI(str);
                    if (uri.getPort() != uri2.getPort() || !Objects.equals(uri.getHost(), uri2.getHost())) {
                        this.f54585b.set(null);
                    }
                } catch (URISyntaxException unused) {
                }
            } else {
                this.f54585b.set(null);
            }
        }
        this.j = str;
        return this;
    }

    public Endpoint b() {
        Endpoint endpoint;
        synchronized (this) {
            endpoint = this.d;
        }
        return endpoint;
    }

    public zus c(Endpoint endpoint) {
        synchronized (this) {
            this.d = endpoint;
        }
        if (!endpoint.isStarted()) {
            try {
                endpoint.start();
                e.info("started set client endpoint {}", endpoint.getAddress());
                return this;
            } catch (IOException e2) {
                e.error("could not set and start client endpoint", (Throwable) e2);
            }
        }
        return this;
    }

    public zuy a() throws zyz, IOException {
        zvg zvgVarC = c();
        a(zvgVarC);
        return e(zvgVarC);
    }

    public zuy d(String str, int i) throws zyz, IOException {
        zvg zvgVarI = i();
        zvgVarI.setPayload(str);
        zvgVarI.getOptions().b(i);
        a(zvgVarI);
        return e(zvgVarI);
    }

    private zuy e(zvg zvgVar) throws zyz, IOException {
        return a(zvgVar, b(zvgVar));
    }

    private zuy a(zvg zvgVar, Endpoint endpoint) throws zyz, IOException {
        try {
            Long lE = e();
            if (lE == null) {
                lE = endpoint.getConfig().e(CoapConfig.s, TimeUnit.MILLISECONDS);
            }
            zvf zvfVarB = d(zvgVar, endpoint).b(lE.longValue());
            if (zvfVarB == null) {
                zvgVar.cancel();
                Throwable sendError = zvgVar.getSendError();
                if (sendError == null) {
                    sendError = zvgVar.c();
                }
                if (sendError == null) {
                    return null;
                }
                if (sendError instanceof zyz) {
                    throw ((zyz) sendError);
                }
                throw new IOException(sendError);
            }
            if (!zvgVar.j()) {
                a(zvfVarB);
            }
            return new zuy(zvfVarB);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected zvg d(zvg zvgVar, Endpoint endpoint) {
        if (this.f54586c != 0) {
            zvgVar.getOptions().d(new zuv(zuv.a(this.f54586c), false, 0));
        }
        endpoint.sendRequest(zvgVar);
        return zvgVar;
    }

    protected Endpoint b(zvg zvgVar) {
        Endpoint endpointB = b();
        return endpointB != null ? endpointB : zvr.c().b(zvgVar.b());
    }

    private zvg c() {
        return d(zvg.e());
    }

    private zvg i() {
        return d(zvg.d());
    }

    private zvg d(zvg zvgVar) {
        zvgVar.setType(this.g);
        return zvgVar;
    }

    private zvg a(zvg zvgVar) {
        String strA;
        EndpointContext endpointContext = this.f54585b.get();
        if (endpointContext != null && zvgVar.getDestinationContext() == null) {
            zvgVar.setDestinationContext(endpointContext);
            if (this.f && this.f54584a == null && (strA = CoAP.a(this.j)) != null && !CoAP.d(strA)) {
                zvgVar.e(this.j);
            } else {
                zvgVar.b(this.j);
            }
        } else if (!zvgVar.h() && !zvgVar.f()) {
            zvgVar.b(this.j);
        }
        if (this.f54584a != null && !zvgVar.f()) {
            zvgVar.c(this.f54584a);
        }
        return zvgVar;
    }

    private void a(zvf zvfVar) {
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.f54585b, null, zvfVar.getSourceContext());
    }
}

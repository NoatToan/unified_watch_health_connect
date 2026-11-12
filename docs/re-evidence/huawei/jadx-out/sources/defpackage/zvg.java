package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.MessageObserver;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvg extends Message {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f54604b = aaex.a((Class<?>) zvg.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f54605a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoAP.Code f54606c;
    private boolean d;
    private boolean e;
    private zvf f;
    private boolean g;
    private String h;
    private volatile Throwable i;
    private boolean j;
    private Map<String, String> m;

    public zvg(CoAP.Code code) {
        this(code, CoAP.Type.CON);
    }

    public zvg(CoAP.Code code, CoAP.Type type) {
        super(type);
        this.f54606c = code;
    }

    public CoAP.Code a() {
        return this.f54606c;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public int getRawCode() {
        CoAP.Code code = this.f54606c;
        if (code == null) {
            return 0;
        }
        return code.value;
    }

    public String b() {
        String str = this.h;
        return str == null ? "coap" : str;
    }

    public void a(String str) {
        this.h = str;
    }

    public boolean j() {
        return this.f54605a;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public boolean isIntendedPayload() {
        return (this.f54606c == CoAP.Code.GET || this.f54606c == CoAP.Code.DELETE || this.f54606c == null) ? false : true;
    }

    @Override // org.eclipse.californium.core.coap.Message
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public zvg setPayload(String str) {
        super.setPayload(str);
        return this;
    }

    @Override // org.eclipse.californium.core.coap.Message
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public zvg setPayload(byte[] bArr) {
        super.setPayload(bArr);
        return this;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void assertPayloadMatchsBlocksize() {
        zuv zuvVarF = getOptions().f();
        if (zuvVarF != null) {
            zuvVarF.c(getPayloadSize());
        }
    }

    public zvg e(String str) {
        if (this.g) {
            throw new IllegalStateException("CoAP URI is set!");
        }
        if (this.d) {
            throw new IllegalStateException("Proxy Scheme is set!");
        }
        getOptions().i(str);
        this.e = true;
        return this;
    }

    public boolean f() {
        return this.e;
    }

    public zvg c(String str) {
        if (this.e) {
            throw new IllegalStateException("Proxy URI is set!");
        }
        getOptions().a(str);
        this.d = true;
        return this;
    }

    public zvg b(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("URI must not be null");
        }
        try {
            if (str.contains("://")) {
                str2 = str;
            } else {
                str2 = "coap://" + str;
                f54604b.warn("update your code to supply an RFC 7252 compliant URI including a scheme");
            }
            return d(new URI(str2));
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("invalid uri: " + str, e);
        }
    }

    public zvg d(URI uri) {
        InetSocketAddress peerAddress;
        c(uri);
        String host = uri.getHost() == null ? "localhost" : uri.getHost();
        String scheme = uri.getScheme();
        boolean zC = zzp.c(host);
        try {
            EndpointContext destinationContext = getDestinationContext();
            if (destinationContext == null) {
                int port = uri.getPort();
                InetAddress byName = InetAddress.getByName(host);
                String str = zC ? null : host;
                if (port <= 0) {
                    port = CoAP.c(scheme);
                }
                peerAddress = new InetSocketAddress(byName, port);
                destinationContext = new zxr(peerAddress, str, null);
            } else {
                peerAddress = destinationContext.getPeerAddress();
            }
            d(uri, peerAddress, zC);
            setDestinationContext(destinationContext);
            this.h = scheme.toLowerCase();
            this.g = true;
            return this;
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("cannot resolve host name: " + host);
        }
    }

    private void c(URI uri) {
        if (this.e) {
            throw new IllegalStateException("Proxy URI is set!");
        }
        if (uri == null) {
            throw new NullPointerException("URI must not be null");
        }
        if (!CoAP.d(uri.getScheme())) {
            throw new IllegalArgumentException("URI scheme '" + uri.getScheme() + "' is not supported!");
        }
        if (uri.getFragment() != null) {
            throw new IllegalArgumentException("URI must not contain a fragment '" + uri.getFragment() + "'!");
        }
        if (uri.getSchemeSpecificPart() == null || uri.getHost() != null) {
            return;
        }
        throw new IllegalArgumentException("URI expected host '" + uri.getSchemeSpecificPart() + "' is invalid!");
    }

    private void d(URI uri, InetSocketAddress inetSocketAddress, boolean z) {
        if (inetSocketAddress == null) {
            throw new NullPointerException("destination address must not be null!");
        }
        zvi options = getOptions();
        String host = uri.getHost();
        if (host != null) {
            if (z) {
                try {
                    if (InetAddress.getByName(host).equals(inetSocketAddress.getAddress())) {
                        host = null;
                    }
                } catch (UnknownHostException unused) {
                    f54604b.warn("could not parse IP address of URI despite successful IP address pattern matching");
                }
            } else if (!zzp.a(host)) {
                throw new IllegalArgumentException("URI's hostname '" + host + "' is invalid!'");
            }
            if (host != null) {
                options.h(host.toLowerCase());
            }
        }
        if (host == null) {
            options.au();
        }
        int port = uri.getPort();
        if (port <= 0) {
            port = CoAP.c(uri.getScheme());
        }
        if (port == inetSocketAddress.getPort()) {
            port = -1;
        }
        if (port > 0) {
            options.f(port);
        } else {
            options.av();
        }
        String path = uri.getPath();
        if (path != null && path.length() > 1) {
            options.f(path);
        } else {
            options.c();
        }
        String query = uri.getQuery();
        if (query != null) {
            options.j(query);
        } else {
            options.b();
        }
    }

    public boolean h() {
        return this.g;
    }

    public String i() {
        zvi options = getOptions();
        String strU = options.u();
        Integer numAc = options.ac();
        if (strU == null) {
            if (getDestinationContext() != null) {
                strU = getDestinationContext().getPeerAddress().getAddress().getHostAddress();
            } else {
                strU = "localhost";
            }
        }
        String str = strU;
        if (numAc == null) {
            if (getDestinationContext() != null) {
                numAc = Integer.valueOf(getDestinationContext().getPeerAddress().getPort());
            } else {
                numAc = -1;
            }
        }
        if (numAc.intValue() > 0) {
            if (CoAP.d(b()) && CoAP.c(b()) == numAc.intValue()) {
                numAc = -1;
            }
        } else {
            numAc = -1;
        }
        try {
            return new URI(b(), null, str, numAc.intValue(), "/" + options.y(), options.v() > 0 ? options.aa() : null, null).toASCIIString();
        } catch (URISyntaxException e) {
            throw new IllegalStateException("cannot create URI from request", e);
        }
    }

    @Override // org.eclipse.californium.core.coap.Message
    public boolean hasBlock(zuv zuvVar) {
        return hasBlock(zuvVar, getOptions().f());
    }

    @Override // org.eclipse.californium.core.coap.Message
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public zvg setDestinationContext(EndpointContext endpointContext) {
        super.setRequestDestinationContext(endpointContext);
        this.f54605a = (endpointContext == null || endpointContext.getPeerAddress().isUnresolved() || !NetworkInterfacesUtil.a(endpointContext.getPeerAddress().getAddress())) ? false : true;
        return this;
    }

    public void e(InetSocketAddress inetSocketAddress, boolean z) {
        super.setLocalAddress(inetSocketAddress);
        this.f54605a = z;
    }

    public final boolean m() {
        return c(0);
    }

    public final boolean n() {
        return c(1);
    }

    private final boolean c(int i) {
        Integer numQ = getOptions().q();
        return numQ != null && numQ.intValue() == i;
    }

    public void e(zvf zvfVar) {
        if (zvfVar == null) {
            throw new NullPointerException("no CoAP response!");
        }
        synchronized (this) {
            this.f = zvfVar;
            notifyAll();
        }
        Iterator<MessageObserver> it = getMessageObservers().iterator();
        while (it.hasNext()) {
            it.next().onResponse(zvfVar);
        }
    }

    public zvf b(long j) throws InterruptedException {
        zvf zvfVar;
        long jC = ClockUtil.c();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        synchronized (this) {
            long millis = j;
            while (!this.j && this.f == null) {
                wait(millis);
                if (j > 0) {
                    long jC2 = (jC + nanos) - ClockUtil.c();
                    if (jC2 <= 0) {
                        break;
                    }
                    millis = TimeUnit.NANOSECONDS.toMillis(jC2) + 1;
                }
            }
            zvfVar = this.f;
            this.j = false;
            this.f = null;
        }
        return zvfVar;
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void setTimedOut(boolean z) {
        super.setTimedOut(z);
        if (z) {
            synchronized (this) {
                this.j = true;
                notifyAll();
            }
        }
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void setCanceled(boolean z) {
        super.setCanceled(z);
        if (z) {
            synchronized (this) {
                this.j = true;
                notifyAll();
            }
        }
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void setRejected(boolean z) {
        super.setRejected(z);
        if (z) {
            synchronized (this) {
                this.j = true;
                notifyAll();
            }
        }
    }

    @Override // org.eclipse.californium.core.coap.Message
    public void setSendError(Throwable th) {
        super.setSendError(th);
        if (th != null) {
            synchronized (this) {
                this.j = true;
                notifyAll();
            }
        }
    }

    public Throwable c() {
        return this.i;
    }

    public void a(Throwable th) {
        this.i = th;
        if (this.i != null) {
            Iterator<MessageObserver> it = getMessageObservers().iterator();
            while (it.hasNext()) {
                it.next().onResponseHandlingError(this.i);
            }
            synchronized (this) {
                this.j = true;
                notifyAll();
            }
        }
    }

    public Map<String, String> g() {
        return this.m;
    }

    public zvg e(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            this.m = Collections.EMPTY_MAP;
            return this;
        }
        this.m = Collections.unmodifiableMap(new HashMap(map));
        return this;
    }

    public String toString() {
        CoAP.Code codeA = a();
        return toTracingString(codeA == null ? "PING" : codeA.toString());
    }

    public static zvg e() {
        return new zvg(CoAP.Code.GET);
    }

    public static zvg d() {
        return new zvg(CoAP.Code.POST);
    }
}

package defpackage;

import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public class zxr implements EndpointContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f54749c;
    private final Principal e;

    @Override // org.eclipse.californium.elements.EndpointContext
    public <T> T get(zxs<T> zxsVar) {
        return null;
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public boolean hasCriticalEntries() {
        return false;
    }

    public zxr(InetSocketAddress inetSocketAddress, String str, Principal principal) {
        if (inetSocketAddress == null) {
            throw new NullPointerException("missing peer socket address, must not be null!");
        }
        this.f54749c = inetSocketAddress;
        this.f54748b = str == null ? null : str.toLowerCase();
        this.e = principal;
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public <T> String getString(zxs<T> zxsVar) {
        Object obj = get(zxsVar);
        if (obj == null) {
            return null;
        }
        if (obj instanceof zzg) {
            return ((zzg) obj).a();
        }
        return obj.toString();
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public Map<zxs<?>, Object> entries() {
        return Collections.EMPTY_MAP;
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public final Principal getPeerIdentity() {
        return this.e;
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public final InetSocketAddress getPeerAddress() {
        return this.f54749c;
    }

    @Override // org.eclipse.californium.elements.EndpointContext
    public final String getVirtualHost() {
        return this.f54748b;
    }

    public String toString() {
        return String.format("IP(%s)", c());
    }

    protected final String c() {
        return zzp.b(this.f54749c);
    }
}

package defpackage;

import java.net.InetSocketAddress;
import org.eclipse.californium.elements.DefinitionsEndpointContextMatcher;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zyh extends DefinitionsEndpointContextMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54770a = aaex.a((Class<?>) zyh.class);
    private static final zxv<zxs<?>> d = new zxv("udp context").a(zye.f54767b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54771c;

    public zyh() {
        this(true);
    }

    public zyh(boolean z) {
        super(d);
        this.f54771c = z;
    }

    @Override // org.eclipse.californium.elements.DefinitionsEndpointContextMatcher, org.eclipse.californium.elements.EndpointIdentityResolver
    public Object getEndpointIdentity(EndpointContext endpointContext) {
        Object endpointIdentity = super.getEndpointIdentity(endpointContext);
        return ((endpointIdentity instanceof InetSocketAddress) && NetworkInterfacesUtil.a(((InetSocketAddress) endpointIdentity).getAddress())) ? "MULTICAST" : endpointIdentity;
    }

    @Override // org.eclipse.californium.elements.DefinitionsEndpointContextMatcher, org.eclipse.californium.elements.EndpointContextMatcher
    public boolean isResponseRelatedToRequest(EndpointContext endpointContext, EndpointContext endpointContext2) {
        if (this.f54771c) {
            InetSocketAddress peerAddress = endpointContext.getPeerAddress();
            InetSocketAddress peerAddress2 = endpointContext2.getPeerAddress();
            if (!peerAddress.equals(peerAddress2) && !NetworkInterfacesUtil.a(peerAddress.getAddress())) {
                Logger logger = f54770a;
                String hostAddress = peerAddress.getAddress().getHostAddress();
                int port = peerAddress.getPort();
                logger.info("request {}:{} doesn't match {}:{}!", hostAddress, Integer.valueOf(port), peerAddress2.getAddress().getHostAddress(), Integer.valueOf(peerAddress2.getPort()));
                return false;
            }
        }
        return super.isResponseRelatedToRequest(endpointContext, endpointContext2);
    }
}

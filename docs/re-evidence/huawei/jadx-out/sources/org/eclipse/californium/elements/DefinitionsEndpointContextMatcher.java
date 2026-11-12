package org.eclipse.californium.elements;

import defpackage.zxs;
import defpackage.zxt;
import defpackage.zxv;
import defpackage.zzp;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes20.dex */
public abstract class DefinitionsEndpointContextMatcher implements EndpointContextMatcher {
    private final boolean compareHostname;
    private final zxv<zxs<?>> definitions;
    private final String recvTag;
    private final String sendTag;

    public DefinitionsEndpointContextMatcher(zxv<zxs<?>> zxvVar) {
        this(zxvVar, false);
    }

    public DefinitionsEndpointContextMatcher(zxv<zxs<?>> zxvVar, boolean z) {
        if (zxvVar == null) {
            throw new NullPointerException("Definitions must not be null!");
        }
        this.sendTag = zxvVar.c() + " sending";
        this.recvTag = zxvVar.c() + " receiving";
        this.definitions = zxvVar;
        this.compareHostname = z;
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher, org.eclipse.californium.elements.EndpointIdentityResolver
    public String getName() {
        return this.definitions.c();
    }

    @Override // org.eclipse.californium.elements.EndpointIdentityResolver
    public Object getEndpointIdentity(EndpointContext endpointContext) {
        InetSocketAddress peerAddress = endpointContext.getPeerAddress();
        if (!peerAddress.isUnresolved()) {
            return peerAddress;
        }
        throw new IllegalArgumentException(zzp.b(peerAddress) + " must be resolved!");
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public boolean isResponseRelatedToRequest(EndpointContext endpointContext, EndpointContext endpointContext2) {
        return (!this.compareHostname || isSameVirtualHost(endpointContext, endpointContext2)) && internalMatch(this.recvTag, endpointContext, endpointContext2);
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public boolean isToBeSent(EndpointContext endpointContext, EndpointContext endpointContext2) {
        if (endpointContext2 == null) {
            return !endpointContext.hasCriticalEntries();
        }
        return (!this.compareHostname || isSameVirtualHost(endpointContext, endpointContext2)) && internalMatch(this.sendTag, endpointContext, endpointContext2);
    }

    private final boolean internalMatch(String str, EndpointContext endpointContext, EndpointContext endpointContext2) {
        if (endpointContext.hasCriticalEntries()) {
            return zxt.b(str, this.definitions, endpointContext, endpointContext2);
        }
        return true;
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public String toRelevantState(EndpointContext endpointContext) {
        if (endpointContext == null) {
            return "n.a.";
        }
        return endpointContext.toString();
    }

    public static final boolean isSameVirtualHost(EndpointContext endpointContext, EndpointContext endpointContext2) {
        String virtualHost;
        String virtualHost2;
        if (endpointContext != null) {
            return endpointContext2 == null || (virtualHost = endpointContext.getVirtualHost()) == (virtualHost2 = endpointContext2.getVirtualHost()) || (virtualHost != null && virtualHost.equals(virtualHost2));
        }
        throw new NullPointerException("first context must not be null");
    }
}

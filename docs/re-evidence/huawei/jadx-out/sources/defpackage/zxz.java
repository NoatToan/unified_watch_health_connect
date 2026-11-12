package defpackage;

import java.security.Principal;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;

/* JADX INFO: loaded from: classes20.dex */
public class zxz implements EndpointContextMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54761b;

    public zxz() {
        this(false);
    }

    public zxz(boolean z) {
        this.f54761b = z;
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher, org.eclipse.californium.elements.EndpointIdentityResolver
    public String getName() {
        return "principal correlation";
    }

    @Override // org.eclipse.californium.elements.EndpointIdentityResolver
    public Object getEndpointIdentity(EndpointContext endpointContext) {
        if (this.f54761b) {
            Principal peerIdentity = endpointContext.getPeerIdentity();
            if (peerIdentity != null) {
                return peerIdentity;
            }
            throw new IllegalArgumentException("Principal identity missing in provided endpoint context!");
        }
        return endpointContext.getPeerAddress();
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public boolean isResponseRelatedToRequest(EndpointContext endpointContext, EndpointContext endpointContext2) {
        return c(endpointContext, endpointContext2);
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public boolean isToBeSent(EndpointContext endpointContext, EndpointContext endpointContext2) {
        if (endpointContext2 == null) {
            return true;
        }
        return c(endpointContext, endpointContext2);
    }

    private final boolean c(EndpointContext endpointContext, EndpointContext endpointContext2) {
        if (endpointContext.getPeerIdentity() != null && (endpointContext2.getPeerIdentity() == null || !d(endpointContext.getPeerIdentity(), endpointContext2.getPeerIdentity()))) {
            return false;
        }
        String string = endpointContext.getString(zxu.g);
        return string == null || string.equals(endpointContext2.getString(zxu.g));
    }

    @Override // org.eclipse.californium.elements.EndpointContextMatcher
    public String toRelevantState(EndpointContext endpointContext) {
        if (endpointContext == null) {
            return "n.a.";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(endpointContext.getPeerIdentity());
        String string = endpointContext.getString(zxu.g);
        if (string != null) {
            sb.append(",");
            sb.append(string);
        }
        sb.append("]");
        return sb.toString();
    }

    protected boolean d(Principal principal, Principal principal2) {
        return principal.equals(principal2);
    }
}

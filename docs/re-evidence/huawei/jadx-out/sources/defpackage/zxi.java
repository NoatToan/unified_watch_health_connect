package defpackage;

import org.eclipse.californium.elements.EndpointContext;

/* JADX INFO: loaded from: classes20.dex */
public final class zxi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zvg f54732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EndpointContext f54733c;

    public zxi(zvg zvgVar, EndpointContext endpointContext) {
        if (zvgVar == null) {
            throw new NullPointerException("request must not be null");
        }
        if (!zvgVar.m()) {
            throw new IllegalArgumentException("request has no observe=0 option");
        }
        this.f54732b = zvgVar;
        this.f54733c = endpointContext;
    }

    public zvg c() {
        return this.f54732b;
    }

    public EndpointContext e() {
        return this.f54733c;
    }

    public String toString() {
        return this.f54732b.toString();
    }
}

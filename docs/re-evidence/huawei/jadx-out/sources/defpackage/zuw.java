package defpackage;

import org.eclipse.californium.core.coap.CoAP;

/* JADX INFO: loaded from: classes20.dex */
public class zuw extends zvb {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zve f54592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54594c;
    private final CoAP.ResponseCode d;
    private final int e;

    public zuw(String str, zve zveVar, int i, int i2, boolean z) {
        this(str, zveVar, i, i2, z, CoAP.ResponseCode.BAD_OPTION);
    }

    public zuw(String str, zve zveVar, int i, int i2, boolean z, CoAP.ResponseCode responseCode) {
        super(str);
        this.f54592a = zveVar;
        this.e = i;
        this.f54594c = i2;
        this.f54593b = z;
        this.d = responseCode;
    }

    public zve b() {
        return this.f54592a;
    }

    public final boolean d() {
        return this.e > -1;
    }

    public final int e() {
        return this.e;
    }

    public final int a() {
        return this.f54594c;
    }

    public final CoAP.ResponseCode c() {
        return this.d;
    }

    public final boolean f() {
        return this.f54593b;
    }
}

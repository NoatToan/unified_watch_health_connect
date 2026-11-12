package defpackage;

import org.eclipse.californium.core.coap.CoAP;

/* JADX INFO: loaded from: classes20.dex */
public class zwj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoAP.Type f54683c;
    private final int d;
    private final zve e;
    private final int h;

    public zwj(int i, CoAP.Type type, zve zveVar, int i2, int i3, int i4) {
        this.h = i;
        this.f54683c = type;
        this.e = zveVar;
        this.f54682b = i2;
        this.d = i3;
        this.f54681a = i4;
    }

    public int d() {
        int i = this.f54681a;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("body length not available!");
    }

    public CoAP.Type a() {
        return this.f54683c;
    }

    public zve e() {
        return this.e;
    }

    public int c() {
        return this.f54682b;
    }

    public int b() {
        return this.d;
    }
}

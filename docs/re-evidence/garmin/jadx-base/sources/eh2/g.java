package eh2;

import la2.j;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class g implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f64075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f64076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f64077e;

    public g(f fVar, String str, int i14, e eVar, j jVar) {
        this.f64077e = fVar;
        this.f64073a = str;
        this.f64074b = i14;
        this.f64075c = eVar;
        this.f64076d = jVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        if (this.f64073a.equals(bVar.f111632a.getMacAddress())) {
            Logger logger = this.f64077e.f64064a;
            StringBuilder sb3 = new StringBuilder("Initializing delayed handler for service ");
            int i14 = this.f64074b;
            sb3.append(i14);
            logger.trace(sb3.toString());
            this.f64075c.b(i14);
        }
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
        if (this.f64073a.equals(cVar.f111633a)) {
            ((la2.e) this.f64076d).i(this);
        }
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (this.f64073a.equals(hVar.f111673a.getMacAddress())) {
            ((la2.e) this.f64076d).i(this);
        }
    }
}

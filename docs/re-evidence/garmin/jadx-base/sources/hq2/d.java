package hq2;

import org.slf4j.Logger;
import tn2.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wl2.b f85243b;

    public /* synthetic */ d(wl2.b bVar, int i14) {
        this.f85242a = i14;
        this.f85243b = bVar;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f85242a;
        wl2.b bVar = this.f85243b;
        switch (i14) {
            case 0:
                int i15 = g.f85248g;
                bVar.e();
                break;
            case 1:
                Logger logger = w.f165679d;
                bVar.e();
                break;
            default:
                Logger logger2 = w.f165679d;
                bVar.e();
                break;
        }
    }
}

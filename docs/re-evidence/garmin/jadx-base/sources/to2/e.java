package to2;

import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import q03.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements u03.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f165900b;

    public /* synthetic */ e(f fVar, int i14) {
        this.f165899a = i14;
        this.f165900b = fVar;
    }

    @Override // q03.n
    public void i(d13.c.a aVar) {
        Logger logger = f.f165901f;
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new g(this.f165900b, aVar, null), 3);
    }

    @Override // u03.a
    public void run() {
        int i14 = this.f165899a;
        f fVar = this.f165900b;
        switch (i14) {
            case 0:
                Logger logger = f.f165901f;
                fVar.a();
                break;
            default:
                f.f165901f.debug("getUserStreamEvents: unsubscribe from event stream");
                fVar.a();
                break;
        }
    }
}

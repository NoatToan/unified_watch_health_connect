package xi1;

import androidx.lifecycle.v1;
import p005kotlin.Unit;
import wv0.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f191131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f191132c;

    public /* synthetic */ b(d dVar, e23.a aVar, int i14) {
        this.f191130a = i14;
        this.f191131b = dVar;
        this.f191132c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f191130a) {
            case 0:
                v vVar = new v(this.f191132c, 15);
                d dVar = this.f191131b;
                dVar.getClass();
                ge1.b.T(v1.a(dVar), null, null, new f(dVar, vVar, null), 3);
                break;
            default:
                v vVar2 = new v(this.f191132c, 16);
                d dVar2 = this.f191131b;
                dVar2.getClass();
                ge1.b.T(v1.a(dVar2), null, null, new f(dVar2, vVar2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}

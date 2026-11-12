package dl0;

import d81.t;
import e2.f0;
import e23.l;
import p005kotlin.Unit;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f60283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f60284c;

    public /* synthetic */ e(zc.d dVar, l lVar, int i14) {
        this.f60282a = i14;
        this.f60283b = dVar;
        this.f60284c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f60282a) {
            case 0:
                f0Var.getClass();
                k.f60296a.getClass();
                f0.b(f0Var, null, k.f60297b, 3);
                zc.d dVar = this.f60283b;
                f0.f(f0Var, dVar.b(), new zc.a(new t(21), dVar), new z3.e(1196415143, true, new f(dVar, this.f60284c, 0)), 4);
                break;
            default:
                f0Var.getClass();
                zc.d dVar2 = this.f60283b;
                f0.f(f0Var, dVar2.b(), null, new z3.e(801991953, true, new f(dVar2, this.f60284c, 1)), 6);
                if (dVar2.d().f196387c instanceof z0.b) {
                    io1.a.f94593a.getClass();
                    f0.b(f0Var, null, io1.a.f94594b, 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

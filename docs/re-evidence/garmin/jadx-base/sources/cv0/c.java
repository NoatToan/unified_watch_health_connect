package cv0;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55842a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0.f f55843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f55844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f55845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f55846e;

    public /* synthetic */ c(gv0.d dVar, yu0.f fVar, l lVar, e23.a aVar, int i14) {
        this.f55844c = dVar;
        this.f55843b = fVar;
        this.f55845d = lVar;
        this.f55846e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55842a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(p0.t(1), this.f55846e, this.f55845d, this.f55844c, (m) obj, this.f55843b);
                break;
            default:
                ((Integer) obj2).getClass();
                f.a(p0.t(385), this.f55846e, this.f55845d, this.f55844c, (m) obj, this.f55843b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(yu0.f fVar, gv0.d dVar, l lVar, e23.a aVar, int i14) {
        this.f55843b = fVar;
        this.f55844c = dVar;
        this.f55845d = lVar;
        this.f55846e = aVar;
    }
}

package q72;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f143275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r72.i f143276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.a f143277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f143278e;

    public /* synthetic */ e(r rVar, r72.i iVar, w82.a aVar, int i14, int i15) {
        this.f143274a = i15;
        this.f143275b = rVar;
        this.f143276c = iVar;
        this.f143277d = aVar;
        this.f143278e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f143274a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                h.c(this.f143275b, this.f143276c, this.f143277d, mVar, p0.t(this.f143278e | 1));
                break;
            case 1:
                h.a(this.f143275b, this.f143276c, this.f143277d, mVar, p0.t(this.f143278e | 1));
                break;
            default:
                h.e(this.f143275b, this.f143276c, this.f143277d, mVar, p0.t(this.f143278e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

package a12;

import e23.l;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import qx1.j;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.c f409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412g;

    public /* synthetic */ b(r rVar, String str, i53.c cVar, p pVar, l lVar, int i14, int i15) {
        this.f407b = rVar;
        this.f408c = str;
        this.f409d = cVar;
        this.f410e = pVar;
        this.f411f = lVar;
        this.f412g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f406a) {
            case 0:
                ((Integer) obj2).getClass();
                c.a(this.f409d, this.f408c, this.f407b, this.f410e, this.f411f, (m) obj, p0.t(this.f412g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.a(this.f407b, this.f408c, this.f409d, this.f410e, this.f411f, (m) obj, iT, this.f412g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(i53.c cVar, String str, r rVar, p pVar, l lVar, int i14) {
        this.f409d = cVar;
        this.f408c = str;
        this.f407b = rVar;
        this.f410e = pVar;
        this.f411f = lVar;
        this.f412g = i14;
    }
}

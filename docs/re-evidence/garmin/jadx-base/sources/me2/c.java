package me2;

import oe2.f0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f118137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ je2.b f118138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ie2.l f118139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ le2.b f118140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f118141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f118142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f118143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l f118144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.r f118145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.l f118146k;

    public /* synthetic */ c(h4.r rVar, e eVar, ie2.l lVar, le2.b bVar, boolean z14, boolean z15, boolean z16, e23.l lVar2, e23.r rVar2, e23.l lVar3, int i14) {
        this.f118136a = 1;
        this.f118137b = rVar;
        this.f118138c = eVar;
        this.f118139d = lVar;
        this.f118140e = bVar;
        this.f118141f = z14;
        this.f118142g = z15;
        this.f118143h = z16;
        this.f118144i = lVar2;
        this.f118145j = rVar2;
        this.f118146k = lVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f118136a;
        je2.b bVar = this.f118138c;
        switch (i14) {
            case 0:
                e eVar = (e) bVar;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e.a aVar = e.f118163c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    y.d(this.f118137b, eVar, this.f118139d, this.f118140e, this.f118141f, this.f118142g, this.f118143h, this.f118144i, this.f118145j, this.f118146k, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                y.d(this.f118137b, (e) bVar, this.f118139d, this.f118140e, this.f118141f, this.f118142g, this.f118143h, this.f118144i, this.f118145j, this.f118146k, (p3.m) obj, p0.t(1));
                break;
            default:
                oe2.e eVar2 = (oe2.e) bVar;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                oe2.e.a aVar2 = oe2.e.f131472d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f0.a(this.f118137b, eVar2, this.f118139d, this.f118140e, this.f118141f, this.f118142g, this.f118143h, this.f118144i, this.f118145j, this.f118146k, mVar2, ie2.l.f93135m << 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(h4.r rVar, je2.b bVar, ie2.l lVar, le2.b bVar2, boolean z14, boolean z15, boolean z16, e23.l lVar2, e23.r rVar2, e23.l lVar3, int i14) {
        this.f118136a = i14;
        this.f118137b = rVar;
        this.f118138c = bVar;
        this.f118139d = lVar;
        this.f118140e = bVar2;
        this.f118141f = z14;
        this.f118142g = z15;
        this.f118143h = z16;
        this.f118144i = lVar2;
        this.f118145j = rVar2;
        this.f118146k = lVar3;
    }
}

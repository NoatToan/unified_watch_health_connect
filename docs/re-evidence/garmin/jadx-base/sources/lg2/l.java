package lg2;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f112339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f112340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f112341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f112342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f112343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f112344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f112345h;

    public /* synthetic */ l(m mVar, h4.r rVar, z3.e eVar, String str, boolean z14, e23.a aVar, int i14, int i15) {
        this.f112338a = i15;
        this.f112339b = mVar;
        this.f112340c = rVar;
        this.f112341d = eVar;
        this.f112342e = str;
        this.f112343f = z14;
        this.f112344g = aVar;
        this.f112345h = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112338a;
        int i15 = this.f112345h;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                m mVar2 = m.f112346a;
                this.f112339b.a(this.f112340c, this.f112341d, this.f112342e, this.f112343f, this.f112344g, mVar, p0.t(i15 | 1));
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                m mVar4 = m.f112346a;
                this.f112339b.c(this.f112340c, this.f112341d, this.f112342e, this.f112343f, this.f112344g, mVar3, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

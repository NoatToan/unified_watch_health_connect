package sg0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159123a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f159124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f159125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f159126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f159127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p f159128f;

    public /* synthetic */ n(String str, int i14, int i15, e23.a aVar, e23.p pVar, int i16) {
        this.f159124b = str;
        this.f159125c = i14;
        this.f159126d = i15;
        this.f159127e = aVar;
        this.f159128f = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f159123a) {
            case 0:
                ((Integer) obj2).getClass();
                r.d(this.f159124b, this.f159128f, this.f159127e, (p3.m) obj, p3.p0.t(this.f159125c | 1), this.f159126d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(3073);
                w51.o0.l(this.f159124b, this.f159125c, this.f159126d, this.f159127e, this.f159128f, (p3.m) obj, iT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(String str, e23.p pVar, e23.a aVar, int i14, int i15) {
        this.f159124b = str;
        this.f159128f = pVar;
        this.f159127e = aVar;
        this.f159125c = i14;
        this.f159126d = i15;
    }
}

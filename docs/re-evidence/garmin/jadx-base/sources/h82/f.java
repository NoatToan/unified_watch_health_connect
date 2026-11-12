package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82448f;

    public /* synthetic */ f(r rVar, String str, String str2, int i14, int i15, int i16) {
        this.f82443a = i16;
        this.f82444b = rVar;
        this.f82445c = str;
        this.f82446d = str2;
        this.f82447e = i14;
        this.f82448f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82443a;
        int i15 = this.f82447e;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar = r.f82497a;
                this.f82444b.m(p0.t(i15 | 1), this.f82448f, this.f82445c, this.f82446d, mVar);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar2 = r.f82497a;
                this.f82444b.s(p0.t(i15 | 1), this.f82448f, this.f82445c, this.f82446d, mVar2);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar3 = r.f82497a;
                this.f82444b.e(p0.t(i15 | 1), this.f82448f, this.f82445c, this.f82446d, mVar3);
                break;
        }
        return Unit.INSTANCE;
    }
}

package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f82460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82462f;

    public /* synthetic */ i(r rVar, int i14, String str, int i15, int i16, int i17) {
        this.f82457a = i17;
        this.f82458b = rVar;
        this.f82459c = i14;
        this.f82460d = str;
        this.f82461e = i15;
        this.f82462f = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82457a;
        int i15 = this.f82461e;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar = r.f82497a;
                this.f82458b.l(this.f82459c, p0.t(i15 | 1), this.f82462f, this.f82460d, mVar);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar2 = r.f82497a;
                this.f82458b.d(this.f82459c, p0.t(i15 | 1), this.f82462f, this.f82460d, mVar2);
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                ((Integer) obj2).getClass();
                r rVar3 = r.f82497a;
                this.f82458b.o(this.f82459c, p0.t(i15 | 1), this.f82462f, this.f82460d, mVar3);
                break;
        }
        return Unit.INSTANCE;
    }
}

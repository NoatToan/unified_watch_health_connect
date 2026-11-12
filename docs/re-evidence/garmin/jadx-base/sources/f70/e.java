package f70;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.g f69422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k61.b f69423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f69424d;

    public /* synthetic */ e(o82.g gVar, k61.b bVar, int i14, int i15) {
        this.f69421a = i15;
        this.f69422b = gVar;
        this.f69423c = bVar;
        this.f69424d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f69421a;
        m mVar = (m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                f.a(this.f69422b, this.f69423c, mVar, p0.t(this.f69424d | 1));
                break;
            case 1:
                g.a(this.f69422b, this.f69423c, mVar, p0.t(this.f69424d | 1));
                break;
            default:
                h.a(this.f69422b, this.f69423c, mVar, p0.t(this.f69424d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

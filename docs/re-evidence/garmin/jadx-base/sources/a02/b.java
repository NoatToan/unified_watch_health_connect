package a02;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f59b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f60c;

    public /* synthetic */ b(r rVar, float f14, int i14, int i15) {
        this.f58a = i15;
        this.f59b = rVar;
        this.f60c = f14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.a(this.f59b, this.f60c, mVar, p0.t(7));
                break;
            case 1:
                g.a(this.f59b, this.f60c, mVar, p0.t(7));
                break;
            case 2:
                h.a(this.f59b, this.f60c, mVar, p0.t(7));
                break;
            case 3:
                i.a(this.f59b, this.f60c, mVar, p0.t(7));
                break;
            default:
                wt0.f.a(this.f59b, this.f60c, mVar, p0.t(7));
                break;
        }
        return Unit.INSTANCE;
    }
}

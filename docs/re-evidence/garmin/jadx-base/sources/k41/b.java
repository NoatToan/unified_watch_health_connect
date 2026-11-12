package k41;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f102865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h41.g f102866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102867d;

    public /* synthetic */ b(r rVar, h41.g gVar, int i14, int i15) {
        this.f102864a = i15;
        this.f102865b = rVar;
        this.f102866c = gVar;
        this.f102867d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f102864a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.a(this.f102865b, this.f102866c, mVar, p0.t(this.f102867d | 1));
                break;
            default:
                g.c(this.f102865b, this.f102866c, mVar, p0.t(this.f102867d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

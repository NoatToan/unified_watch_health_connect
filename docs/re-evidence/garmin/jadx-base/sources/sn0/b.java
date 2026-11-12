package sn0;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f160409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nn0.c f160410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160411d;

    public /* synthetic */ b(r rVar, nn0.c cVar, int i14, int i15) {
        this.f160408a = i15;
        this.f160409b = rVar;
        this.f160410c = cVar;
        this.f160411d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f160408a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c.a(this.f160409b, this.f160410c, mVar, p0.t(this.f160411d | 1));
                break;
            default:
                e.b(this.f160409b, this.f160410c, mVar, p0.t(this.f160411d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

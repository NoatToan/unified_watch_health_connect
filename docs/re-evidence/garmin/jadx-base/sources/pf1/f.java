package pf1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f137571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f137572c;

    public /* synthetic */ f(g gVar, int i14, int i15) {
        this.f137570a = i15;
        this.f137571b = gVar;
        this.f137572c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f137570a;
        int i15 = this.f137572c;
        g gVar = this.f137571b;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        int i16 = g.f137573f;
        switch (i14) {
            case 0:
                gVar.g(mVar, p0.t(i15 | 1));
                break;
            case 1:
                gVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                gVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

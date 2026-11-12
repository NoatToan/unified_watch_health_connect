package kh0;

import lc.y;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dh0.a f104723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ih0.s f104724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f104725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104726e;

    public /* synthetic */ f(dh0.a aVar, ih0.s sVar, y yVar, int i14, int i15) {
        this.f104722a = i15;
        this.f104723b = aVar;
        this.f104724c = sVar;
        this.f104725d = yVar;
        this.f104726e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f104722a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.i(this.f104723b, this.f104724c, this.f104725d, mVar, p0.t(this.f104726e | 1));
                break;
            default:
                g.a(this.f104723b, this.f104724c, this.f104725d, mVar, p0.t(this.f104726e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

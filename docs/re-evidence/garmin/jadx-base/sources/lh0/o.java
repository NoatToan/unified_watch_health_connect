package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f112434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f112435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112436d;

    public /* synthetic */ o(r rVar, int i14, int i15, int i16) {
        this.f112433a = i16;
        this.f112434b = rVar;
        this.f112435c = i14;
        this.f112436d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112433a;
        int i15 = this.f112436d;
        int i16 = this.f112435c;
        r rVar = this.f112434b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f112444a;
        switch (i14) {
            case 0:
                rVar.k(i16, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.i(i16, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

package ew0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rd1.a f66286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f66287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f66288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f66289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f66290f;

    public /* synthetic */ w(rd1.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, int i14, int i15) {
        this.f66285a = i15;
        this.f66286b = aVar;
        this.f66287c = lVar;
        this.f66288d = lVar2;
        this.f66289e = lVar3;
        this.f66290f = lVar4;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66285a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(9);
                c0.d(this.f66286b, this.f66287c, this.f66288d, this.f66289e, this.f66290f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(9);
                w2.a0.b(this.f66286b, this.f66287c, this.f66288d, this.f66289e, this.f66290f, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}

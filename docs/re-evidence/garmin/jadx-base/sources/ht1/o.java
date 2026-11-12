package ht1;

import p005kotlin.Unit;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85566a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f85567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f85568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f85569d;

    public /* synthetic */ o(h4.r rVar, p1 p1Var, String str, int i14) {
        this.f85569d = rVar;
        this.f85567b = p1Var;
        this.f85568c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85566a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                w.b(p0.t(1), this.f85569d, this.f85568c, mVar, this.f85567b);
                break;
            default:
                e0.b(p0.t(1), this.f85569d, this.f85568c, mVar, this.f85567b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(p1 p1Var, String str, h4.r rVar, int i14) {
        this.f85567b = p1Var;
        this.f85568c = str;
        this.f85569d = rVar;
    }
}

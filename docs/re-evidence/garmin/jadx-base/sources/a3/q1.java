package a3;

import i3.mh;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f812d;

    public /* synthetic */ q1(s5.x0 x0Var, e23.p pVar, int i14, int i15) {
        this.f809a = i15;
        this.f810b = x0Var;
        this.f811c = pVar;
        this.f812d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f809a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                s1.a(this.f810b, this.f811c, mVar, p3.p0.t(this.f812d | 1));
                break;
            default:
                mh.a(this.f810b, this.f811c, mVar, p3.p0.t(this.f812d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

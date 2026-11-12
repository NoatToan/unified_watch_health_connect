package ky0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f107454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f107455c;

    public /* synthetic */ p0(o53.b0 b0Var, w0 w0Var, int i14) {
        this.f107453a = i14;
        this.f107454b = b0Var;
        this.f107455c = w0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f107453a) {
            case 0:
                str.getClass();
                str2.getClass();
                ge1.b.T(this.f107454b, null, null, new s0.i(this.f107455c, str, str2, null), 3);
                break;
            default:
                str.getClass();
                str2.getClass();
                ge1.b.T(this.f107454b, null, null, new s0.f(this.f107455c, str, str2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}

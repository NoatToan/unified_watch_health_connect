package b82;

import l72.y2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f16558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16561e;

    public /* synthetic */ e1(y2 y2Var, boolean z14, int i14, int i15, int i16) {
        this.f16557a = i16;
        this.f16558b = y2Var;
        this.f16559c = z14;
        this.f16560d = i14;
        this.f16561e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16557a;
        int i15 = this.f16561e;
        int i16 = this.f16560d;
        boolean z14 = this.f16559c;
        y2 y2Var = this.f16558b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                dh.b.g(y2Var, z14, mVar, p3.p0.t(i16 | 1), i15);
                break;
            case 1:
                dh.b.i(y2Var, z14, mVar, p3.p0.t(i16 | 1), i15);
                break;
            default:
                y2 y2Var2 = y2.f111386a;
                y2Var.f(i16, p3.p0.t(i15 | 1), mVar, z14);
                break;
        }
        return Unit.INSTANCE;
    }
}

package a03;

import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f98b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f99c;

    public /* synthetic */ g0(long j8, x3 x3Var, int i14) {
        this.f97a = i14;
        this.f98b = j8;
        this.f99c = x3Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f97a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                x3 x3Var = this.f99c;
                x3Var.getClass();
                fVar.getClass();
                q4.f.A0(fVar, this.f98b, 0L, 0L, ((Number) x3Var.getF182175a()).floatValue(), null, null, 118);
                break;
            default:
                q4.f.A0((q4.f) obj, this.f98b, 0L, 0L, j23.t.d(((Number) this.f99c.getF182175a()).floatValue(), 0.0f, 1.0f), null, null, 118);
                break;
        }
        return Unit.INSTANCE;
    }
}

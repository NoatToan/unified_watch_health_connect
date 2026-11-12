package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class x0 extends p005kotlin.jvm.internal.w implements e23.l<o4.t0, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f149309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f149310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<o4.z1> f149311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(x3<Float> x3Var, x3<Float> x3Var2, x3<o4.z1> x3Var3) {
        super(1);
        this.f149309a = x3Var;
        this.f149310b = x3Var2;
        this.f149311c = x3Var3;
    }

    @Override // e23.l
    public final Unit invoke(o4.t0 t0Var) {
        long j8;
        o4.t0 t0Var2 = t0Var;
        x3<Float> x3Var = this.f149309a;
        t0Var2.c(x3Var != null ? x3Var.getValue().floatValue() : 1.0f);
        x3<Float> x3Var2 = this.f149310b;
        t0Var2.v(x3Var2 != null ? x3Var2.getValue().floatValue() : 1.0f);
        t0Var2.w(x3Var2 != null ? x3Var2.getValue().floatValue() : 1.0f);
        x3<o4.z1> x3Var3 = this.f149311c;
        if (x3Var3 != null) {
            j8 = x3Var3.getValue().f129048a;
        } else {
            o4.z1.f129046b.getClass();
            j8 = o4.z1.f129047c;
        }
        t0Var2.T0(j8);
        return Unit.INSTANCE;
    }
}

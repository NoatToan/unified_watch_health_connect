package ne2;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.q0;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f125574d;

    public /* synthetic */ c0(i53.f fVar, double d14, fb0.a aVar) {
        this.f125571a = 2;
        this.f125572b = fVar;
        this.f125574d = d14;
        this.f125573c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        int i14 = this.f125571a;
        double d14 = this.f125574d;
        Object obj2 = this.f125573c;
        Object obj3 = this.f125572b;
        switch (i14) {
            case 0:
                q0 q0Var = (q0) obj3;
                n0 n0Var = (n0) obj2;
                Expression.InterpolatorBuilder interpolatorBuilder = (Expression.InterpolatorBuilder) obj;
                int i15 = d0.f125576h;
                interpolatorBuilder.getClass();
                interpolatorBuilder.exponential(new t(5));
                interpolatorBuilder.zoom();
                while (q0Var.f105808a <= 17) {
                    interpolatorBuilder.stop(new c0(q0Var, n0Var, this.f125574d, 1));
                    q0Var.f105808a++;
                    n0Var.f105805a += 0.6d;
                }
                break;
            case 1:
                Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
                int i16 = d0.f125576h;
                expressionBuilder.getClass();
                expressionBuilder.literal(((q0) obj3).f105808a);
                expressionBuilder.literal(((n0) obj2).f105805a * d14);
                break;
            default:
                fb0.a aVar = (fb0.a) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i17 = fb0.a.f70169g;
                Integer num = (Integer) h0.e0(iIntValue, (i53.f) obj3);
                int iIntValue2 = num != null ? num.intValue() : (int) d14;
                if (aVar.f70174e.f150540a.getValue() instanceof gb0.a.b) {
                    p2 p2Var = aVar.f70173d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, new gb0.a.b(iIntValue2)));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c0(q0 q0Var, n0 n0Var, double d14, int i14) {
        this.f125571a = i14;
        this.f125572b = q0Var;
        this.f125573c = n0Var;
        this.f125574d = d14;
    }
}

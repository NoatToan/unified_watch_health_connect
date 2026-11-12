package ne2;

import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f125736b;

    public /* synthetic */ z(d0 d0Var, int i14) {
        this.f125735a = i14;
        this.f125736b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f125735a;
        d0 d0Var = this.f125736b;
        Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
        switch (i14) {
            case 0:
                int i15 = d0.f125576h;
                expressionBuilder.getClass();
                expressionBuilder.literal(0L);
                expressionBuilder.rgb(new z(d0Var, 1));
                break;
            default:
                int i16 = d0.f125576h;
                expressionBuilder.getClass();
                o13.u uVar = (o13.u) h0.b0(d0Var.f125582f);
                expressionBuilder.literal(((Number) uVar.f128605a).floatValue());
                expressionBuilder.literal(((Number) uVar.f128606b).floatValue());
                expressionBuilder.literal(((Number) uVar.f128607c).floatValue());
                break;
        }
        return Unit.INSTANCE;
    }
}

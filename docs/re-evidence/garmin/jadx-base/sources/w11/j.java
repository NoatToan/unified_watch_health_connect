package w11;

import b21.o4;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x11.k f181229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181230b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181231a;

        static {
            int[] iArr = new int[o4.values().length];
            try {
                iArr[o4.LOG_FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o4.CREATE_MEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o4.CREATE_RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181231a = iArr;
        }
    }

    public j(x11.k kVar, e23.a<Unit> aVar) {
        this.f181229a = kVar;
        this.f181230b = aVar;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.b(null, null, z3.f.c(2050885542, new vq0.a(16, this.f181229a, this.f181230b), mVar2), null, 0L, mVar2, 384, 27);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

package b21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSearchFoodNavKt$nutritionSearchFoodGraph$1$1$1$3$1", f = "NutritionSearchFoodNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<x11.b> f14713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x11.e f14714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l4.o f14716d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14717a;

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
            f14717a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(p3.x3<x11.b> x3Var, x11.e eVar, lc.m0 m0Var, l4.o oVar, t13.d<? super h5> dVar) {
        super(2, dVar);
        this.f14713a = x3Var;
        this.f14714b = eVar;
        this.f14715c = m0Var;
        this.f14716d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h5(this.f14713a, this.f14714b, this.f14715c, this.f14716d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j11.c cVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        b11.e eVar = this.f14713a.getF182175a().f188389i;
        if (eVar != null) {
            b11.d dVar = eVar.f14261a;
            this.f14714b.x4();
            l4.o oVar = this.f14716d;
            oVar.getClass();
            b63.u uVarA = b63.u.Companion.a(b63.u.INSTANCE, oVar.f14937c);
            b11.m mVar = oVar.f14940f;
            String str = dVar.f14253a;
            b11.s sVar = (b11.s) p13.h0.d0(eVar.f14262b);
            String str2 = sVar != null ? sVar.f14372a : null;
            String str3 = dVar.f14258f;
            String str4 = dVar.f14259g;
            String str5 = eVar.f14265e;
            g01.u uVar = dVar.f14257e;
            i01.i iVar = i01.i.REGULAR_LOG;
            o4.a aVar2 = o4.f15095a;
            String str6 = oVar.f14936b;
            aVar2.getClass();
            o4 o4VarA = o4.a.a(str6);
            if (o4VarA == null) {
                o4VarA = o4.LOG_FOOD;
            }
            int i14 = a.f14717a[o4VarA.ordinal()];
            if (i14 == 1) {
                cVar = j11.c.DAILY_LOG;
            } else if (i14 == 2) {
                cVar = j11.c.CUSTOM_MEAL;
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                cVar = j11.c.RECIPE;
            }
            lc.y.l(this.f14715c, new l4.a(uVarA, str, 1.0d, str2, str3, str4, false, str5, uVar, iVar, cVar, mVar));
        }
        return Unit.INSTANCE;
    }
}

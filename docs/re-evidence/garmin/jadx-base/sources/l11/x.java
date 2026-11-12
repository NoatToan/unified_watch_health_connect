package l11;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v01.k1;
import v01.n1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.RecipeDetailsViewModel$logRecipe$1", f = "RecipeDetailsViewModel.kt", l = {352}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b63.o f108312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b11.i.b f108313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f108315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f108316e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108317a;

        static {
            int[] iArr = new int[j11.c.values().length];
            try {
                iArr[j11.c.DAILY_LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j11.c.CUSTOM_MEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j11.c.PHOTO_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j11.c.RECIPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f108317a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f108316e = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        x xVar = new x(this.f108316e, dVar);
        xVar.f108315d = obj;
        return xVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b11.i.b bVarI;
        i01.e eVar;
        Object objE0;
        b63.o oVar;
        Object value;
        r rVar;
        b0 b0Var = (b0) this.f108315d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108314c;
        t tVar = this.f108316e;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = tVar.f108267o;
            p2 p2Var2 = tVar.f108268p;
            r rVar2 = (r) p2Var.getValue();
            if (rVar2 == null) {
                return Unit.INSTANCE;
            }
            b63.o oVarB = tVar.f108257e.b();
            int i15 = a.f108317a[tVar.f108256d.ordinal()];
            if (i15 == 1) {
                b11.l lVar = (b11.l) tVar.f108270r.getValue();
                Long l14 = lVar != null ? new Long(lVar.f14331a) : null;
                if (l14 == null) {
                    p2 p2Var3 = tVar.f108267o;
                    do {
                        value = p2Var3.getValue();
                        rVar = (r) value;
                    } while (!p2Var3.b(value, rVar != null ? r.a(rVar, null, true, 63) : null));
                } else {
                    p2Var2.setValue(t.c.i.f108288a);
                    bVarI = b11.i.b.i(rVar2.f108230a, null, 0.0d, false, l14.longValue(), 991);
                    n1 n1Var = tVar.f108260h;
                    t.b bVar = tVar.f108254b;
                    bVar.getClass();
                    if ((bVar instanceof t.b.a) || (bVar instanceof t.b.C2080b)) {
                        eVar = i01.e.ADD;
                    } else {
                        if (!(bVar instanceof t.b.c)) {
                            u0.r();
                            return null;
                        }
                        eVar = i01.e.UPDATE;
                    }
                    i01.e eVar2 = eVar;
                    List listC = p13.w.c(bVarI);
                    this.f108315d = b0Var;
                    this.f108312a = oVarB;
                    this.f108313b = bVarI;
                    this.f108314c = 1;
                    objE0 = ge1.b.e0(n1Var.f174480c, new k1(listC, n1Var, oVarB, eVar2, null), this);
                    if (objE0 == aVar) {
                        return aVar;
                    }
                    oVar = oVarB;
                }
            } else {
                if (i15 != 2 && i15 != 3 && i15 != 4) {
                    u0.r();
                    return null;
                }
                p2Var2.k(null, new t.c.j(oVarB, rVar2.f108230a));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b11.i.b bVar2 = this.f108313b;
        oVar = this.f108312a;
        o13.r.b(obj);
        bVarI = bVar2;
        objE0 = obj;
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log recipe. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "RecipeDetailsViewModel", strD);
            tVar.f108268p.setValue(t.c.C2081c.f108282a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            tVar.f108268p.k(null, new t.c.j(oVar, bVarI));
        }
        return Unit.INSTANCE;
    }
}

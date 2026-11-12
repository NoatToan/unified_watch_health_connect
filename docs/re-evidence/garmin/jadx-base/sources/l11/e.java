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
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.details.viewmodel.FoodDetailsViewModel$logFood$1", f = "FoodDetailsViewModel.kt", l = {393}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b63.o f108144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b11.i.a f108145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f108147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l11.a f108148e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108149a;

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
            f108149a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l11.a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f108148e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f108148e, dVar);
        eVar.f108147d = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b11.i.a aVarI;
        i01.e eVar;
        Object objE0;
        b63.o oVar;
        Object value;
        l11.a.b bVar;
        b0 b0Var = (b0) this.f108147d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f108146c;
        l11.a aVar2 = this.f108148e;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = aVar2.f108064m;
            p2 p2Var2 = aVar2.f108073x;
            l11.a.b bVar2 = (l11.a.b) p2Var.getValue();
            if (bVar2 == null) {
                return Unit.INSTANCE;
            }
            b63.o oVarB = aVar2.f108052a.b();
            int i15 = a.f108149a[aVar2.f108054c.ordinal()];
            if (i15 == 1) {
                b11.l lVar = (b11.l) aVar2.f108067p.f150540a.getValue();
                Long l14 = lVar != null ? new Long(lVar.f14331a) : null;
                if (l14 == null) {
                    p2 p2Var3 = aVar2.f108064m;
                    do {
                        value = p2Var3.getValue();
                        bVar = (l11.a.b) value;
                    } while (!p2Var3.b(value, bVar != null ? l11.a.b.a(bVar, null, null, true, 31) : null));
                } else {
                    p2Var2.setValue(l11.a.d.i.f108105a);
                    aVarI = b11.i.a.i(bVar2.f108075a, null, 0.0d, false, l14.longValue(), null, null, null, 991);
                    n1 n1Var = aVar2.f108058g;
                    l11.a.c cVar = aVar2.f108055d;
                    cVar.getClass();
                    if (cVar instanceof l11.a.c.C2073a) {
                        eVar = i01.e.ADD;
                    } else {
                        if (!(cVar instanceof l11.a.c.b) && !(cVar instanceof l11.a.c.C2074c)) {
                            u0.r();
                            return null;
                        }
                        eVar = i01.e.UPDATE;
                    }
                    i01.e eVar2 = eVar;
                    List listC = p13.w.c(aVarI);
                    this.f108147d = b0Var;
                    this.f108144a = oVarB;
                    this.f108145b = aVarI;
                    this.f108146c = 1;
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
                p2Var2.k(null, new l11.a.d.j(oVarB, bVar2.f108075a));
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b11.i.a aVar3 = this.f108145b;
        oVar = this.f108144a;
        o13.r.b(obj);
        aVarI = aVar3;
        objE0 = obj;
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to log food. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FoodDetailsViewModel", strD);
            aVar2.f108073x.setValue(l11.a.d.c.f108099a);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            aVar2.f108073x.k(null, new l11.a.d.j(oVar, aVarI));
        }
        return Unit.INSTANCE;
    }
}

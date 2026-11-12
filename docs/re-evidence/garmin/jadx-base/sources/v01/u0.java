package v01;

import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj70/d;", "Lpb2/e$c;", "data", "Lx01/e;", "featureState", "Lq01/f;", "<anonymous>", "(Lj70/d;Lx01/e;)Lq01/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetNutritionDataUseCase$invoke$1", f = "GetNutritionDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.q<j70.d<pb2.e.c>, x01.e, t13.d<? super q01.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.d f174547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ x01.e f174548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f174549c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174550a;

        static {
            int[] iArr = new int[yz1.u.values().length];
            try {
                iArr[yz1.u.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yz1.u.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yz1.u.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f174550a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, t13.d<? super u0> dVar) {
        super(3, dVar);
        this.f174549c = v0Var;
    }

    @Override // e23.q
    public final Object invoke(j70.d<pb2.e.c> dVar, x01.e eVar, t13.d<? super q01.f> dVar2) {
        u0 u0Var = new u0(this.f174549c, dVar2);
        u0Var.f174547a = dVar;
        u0Var.f174548b = eVar;
        return u0Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        g21.u uVar;
        g21.u uVar2;
        j70.d dVar = this.f174547a;
        x01.e eVar = this.f174548b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        yz1.u uVar3 = dVar.f97520a.f200298a;
        int i14 = uVar3 == null ? -1 : a.f174550a[uVar3.ordinal()];
        if (i14 != -1) {
            if (i14 != 1) {
                if (i14 == 2) {
                    return q01.f.b.f142007b;
                }
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                pb2.e.c cVar = (pb2.e.c) dVar.f97521b;
                List<pb2.e.h> list = cVar != null ? cVar.f136983e : null;
                v0 v0Var = this.f174549c;
                if (list != null && !list.isEmpty() && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        pb2.e.t tVar = ((pb2.e.h) it.next()).f136997b;
                        if (tVar != null) {
                            v0Var.getClass();
                            if (!v0.c(tVar)) {
                                v0Var.getClass();
                                Iterator<T> it3 = list.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                } while (!g22.k.g(((pb2.e.h) next).f136996a.toLocalDate(), LocalDate.now()));
                                pb2.e.h hVar = (pb2.e.h) next;
                                pb2.e.t tVar2 = hVar != null ? hVar.f136997b : null;
                                pb2.e.v vVar = hVar != null ? hVar.f136998c : null;
                                Integer num = vVar != null ? vVar.f137103a : null;
                                Integer num2 = vVar != null ? vVar.f137104b : null;
                                Double d14 = vVar != null ? vVar.f137109g : null;
                                Double d15 = vVar != null ? vVar.f137107e : null;
                                Double d16 = vVar != null ? vVar.f137105c : null;
                                Double d17 = vVar != null ? vVar.f137110h : null;
                                Double d18 = vVar != null ? vVar.f137108f : null;
                                Double d19 = vVar != null ? vVar.f137106d : null;
                                x01.f fVar = eVar.f188254c;
                                x01.f fVar2 = x01.f.ACTIVE;
                                if (fVar == fVar2) {
                                    if (num != null) {
                                        uVar2 = new g21.u(num.intValue(), num2 != null ? num2.intValue() : num.intValue(), d16, d15, d14, d19 == null ? d16 : d19, d18 == null ? d15 : d18, d17 == null ? d14 : d17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388352, null);
                                    } else {
                                        uVar2 = null;
                                    }
                                    return new q01.f.d(uVar2, new g21.f0(tVar2 != null ? tVar2.f137093a : null, tVar2 != null ? tVar2.f137094b : null, tVar2 != null ? tVar2.f137095c : null, tVar2 != null ? tVar2.f137096d : null), v0.d(list));
                                }
                                if (num == null || d14 == null || d15 == null || d16 == null) {
                                    uVar = null;
                                } else {
                                    uVar = new g21.u(num.intValue(), num2 != null ? num2.intValue() : num.intValue(), d16, d15, d14, Double.valueOf(d19 != null ? d19.doubleValue() : d16.doubleValue()), Double.valueOf(d18 != null ? d18.doubleValue() : d15.doubleValue()), Double.valueOf(d17 != null ? d17.doubleValue() : d14.doubleValue()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388352, null);
                                }
                                return new q01.f.C2664f(uVar, new g21.f0(tVar2 != null ? tVar2.f137093a : null, tVar2 != null ? tVar2.f137094b : null, tVar2 != null ? tVar2.f137095c : null, tVar2 != null ? tVar2.f137096d : null), v0.d(list), eVar.f188256e && eVar.f188255d == fVar2);
                            }
                        }
                    }
                }
                v0Var.getClass();
                if (eVar.f188254c == x01.f.ACTIVE) {
                    return q01.f.e.f142013b;
                }
                if (eVar.f188256e) {
                    return eVar.f188255d != x01.f.NEVER ? q01.f.e.f142013b : q01.f.g.f142018b;
                }
                return eVar.f188258g ? q01.f.a.f142006b : new q01.f.h(eVar.f188257f);
            }
        }
        return q01.f.c.f142008b;
    }
}

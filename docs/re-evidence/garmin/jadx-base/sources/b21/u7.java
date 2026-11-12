package b21;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.navigation.NutritionSettingsNavKt$nutritionSettingsGraph$1$6$1$2$1", f = "NutritionSettingsNav.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u7 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<o21.e> f15283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q21.k f15284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f15285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(p3.x3<o21.e> x3Var, q21.k kVar, lc.v vVar, t13.d<? super u7> dVar) {
        super(2, dVar);
        this.f15283a = x3Var;
        this.f15284b = kVar;
        this.f15285c = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u7(this.f15283a, this.f15284b, this.f15285c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        Object objPrevious;
        o21.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o21.e f182175a = this.f15283a.getF182175a();
        if (f182175a != null) {
            String str = f182175a.f128668d;
            String str2 = f182175a.f128667c;
            q21.k kVar = this.f15284b;
            kVar.getClass();
            long j8 = f182175a.f128665a;
            r53.p2 p2Var = kVar.f142251g;
            Iterator<T> it = ((q21.p) p2Var.getValue()).f142275g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((o21.f) next).f128669a != j8);
            o21.f fVar = (o21.f) next;
            b63.v vVar = fVar != null ? fVar.f128671c : null;
            b63.v.Companion companion = b63.v.INSTANCE;
            if (!p005kotlin.jvm.internal.s.g(vVar, b63.v.Companion.c(companion, str2)) || !p005kotlin.jvm.internal.s.g(fVar.f128672d, b63.v.Companion.c(companion, str))) {
                List<o21.f> list = ((q21.p) p2Var.getValue()).f142275g;
                ArrayList<o21.f> arrayList = new ArrayList(p13.y.r(list, 10));
                for (o21.f fVarA : list) {
                    if (fVarA.f128669a == j8) {
                        b63.v.Companion companion2 = b63.v.INSTANCE;
                        fVarA = o21.f.a(fVarA, b63.v.Companion.c(companion2, str2), b63.v.Companion.c(companion2, str), null, 19);
                    }
                    arrayList.add(fVarA);
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (o21.f fVar2 : arrayList) {
                    b63.v vVar2 = fVar2.f128671c;
                    b63.v vVar3 = fVar2.f128672d;
                    if (vVar2.compareTo(vVar3) < 0) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                aVar = null;
                                break;
                            }
                            o21.f fVar3 = (o21.f) it3.next();
                            long j14 = fVar3.f128669a;
                            b63.v vVar4 = fVar3.f128671c;
                            b63.v vVar5 = fVar3.f128672d;
                            if (j14 != fVar2.f128669a) {
                                boolean z14 = kVar.f142250f;
                                b63.v vVar6 = fVar2.f128671c;
                                if (z14) {
                                    if (vVar6.compareTo(vVar5) <= 0 && vVar3.compareTo(vVar4) >= 0) {
                                        aVar = new o21.a(true, Integer.valueOf(R.string.msg_meal_windows_overlapping_error));
                                        break;
                                    }
                                } else {
                                    if (vVar6.compareTo(vVar5) < 0 && vVar3.compareTo(vVar4) > 0) {
                                        aVar = new o21.a(true, Integer.valueOf(R.string.msg_meal_windows_overlapping_error));
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        aVar = new o21.a(true, Integer.valueOf(R.string.start_and_stop_times_warning_msg));
                    }
                    arrayList2.add(o21.f.a(fVar2, null, null, aVar, 15));
                }
                Iterator it4 = arrayList2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!p005kotlin.jvm.internal.s.g(((o21.f) next2).f128670b, b11.g.BREAKFAST.f14292a));
                o21.f fVar4 = (o21.f) next2;
                b63.v vVar7 = fVar4 != null ? fVar4.f128671c : null;
                b63.v vVar8 = ((q21.p) p2Var.getValue()).f142276h.f156100a;
                if (vVar7 != null) {
                    if (vVar8.compareTo(vVar7) <= 0) {
                        vVar7 = null;
                    }
                    if (vVar7 != null) {
                        vVar8 = vVar7;
                    }
                }
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!p005kotlin.jvm.internal.s.g(((o21.f) objPrevious).f128670b, b11.g.DINNER.f14292a));
                o21.f fVar5 = (o21.f) objPrevious;
                b63.v vVar9 = fVar5 != null ? fVar5.f128672d : null;
                b63.v vVar10 = ((q21.p) p2Var.getValue()).f142277i.f156100a;
                if (vVar9 != null) {
                    if (vVar10.compareTo(vVar9) >= 0) {
                        vVar9 = null;
                    }
                    if (vVar9 != null) {
                        vVar10 = vVar9;
                    }
                }
                while (true) {
                    Object value = p2Var.getValue();
                    q21.p pVar = (q21.p) value;
                    boolean zY4 = q21.k.y4(arrayList2, null, null);
                    s21.e0 e0Var = pVar.f142276h;
                    v21.f.f175333a.getClass();
                    ArrayList arrayList3 = arrayList2;
                    if (p2Var.b(value, q21.p.a(pVar, false, null, false, zY4, false, arrayList3, s21.e0.a(e0Var, v21.f.y(vVar8), null, 6), s21.e0.a(pVar.f142277i, v21.f.d(vVar10), v21.f.u(vVar8), 4), 47))) {
                        break;
                    }
                    arrayList2 = arrayList3;
                }
            }
            this.f15285c.a().f(null, "mealWindowResult");
        }
        return Unit.INSTANCE;
    }
}
